package com.mfundisi;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by linux on 2016/03/06.
 */
public class MyMethods {

    public boolean Floating_Equality(Float operandA, Float operandB){

        int result = operandA.compareTo(operandB);

        if(result == 1){
            return true;
        }

        return  false;
    }

    public boolean Object_Equality(ObjectTypeForEqualiry operandA, ObjectTypeForEqualiry operandB){
        return operandA.equals(operandB);
    }

    public ObjectTypeForEqualiry GetObject(boolean create){
        if(create) {
            return new ObjectTypeForEqualiry();
        }

        return null;
    }

    public boolean HasItems(LinkedList<Object> items){

        if(items.size() > 0){
            return true;
        }

        return false;

    }
}

class ObjectTypeForEqualiry{
    private String name;
    private String surname;

    public void SetName(String name){
        this.name = name;
    }

    public void SetSurname(String surname){
        this.surname = surname;
    }

    public String GetName(){
        return this.name;
    }

    public String GetSurname(){
        return this.surname;
    }

    @Override
    public boolean equals(Object obj){
        if (obj == null) {
            return false;
        }
        if (!ObjectTypeForEqualiry.class.isAssignableFrom(obj.getClass())) {
            return false;
        }
        final ObjectTypeForEqualiry other = (ObjectTypeForEqualiry) obj;
        if ((this.name == null) ? (other.name != null) : !this.name.equals(other.name)) {
            return false;
        }
        if ((this.surname == null) ? (other.surname != null) : !this.surname.equals(other.surname)) {
            return false;
        }
        return true;
    }
}
