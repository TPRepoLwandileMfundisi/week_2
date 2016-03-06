package com.mfundisi;

import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;

/**
 * Created by linux on 2016/03/06.
 */
public class TestMyMethods {

    /*
    * Positive test, the function executes with valid data given
    * */
    @Test
    public void TestFloats_Positive(){
        MyMethods methods = new MyMethods();

        boolean result = methods.Floating_Equality(10.1f, 10.1f);

        Assert.assertEquals(false, result);
    }

    /*
    * Negitive test, the function crashes with invalid data given
    * */
    @Test(expected = NullPointerException.class)
    public void TestFloats_Negetive(){
        MyMethods methods = new MyMethods();

        boolean result = methods.Floating_Equality(null, 10.1f);

        Assert.assertEquals(false, result);
    }

    /*
    * Positive test, the function executes with valid data given
    * */
    @Test
    public void TestObject_Positive(){
        MyMethods methods = new MyMethods();

        ObjectTypeForEqualiry operandA = new ObjectTypeForEqualiry();
        ObjectTypeForEqualiry operandB = null;

        boolean result = methods.Object_Equality(operandA, operandB);

        Assert.assertEquals(false, result);
    }

    /*
    * Negitive test, the function crashes with invalid data given
    * */
    @Test(expected = NullPointerException.class)
    public void TestObject_Negetive(){
        MyMethods methods = new MyMethods();

        ObjectTypeForEqualiry operandA = null;
        ObjectTypeForEqualiry operandB = null;

        boolean result = methods.Object_Equality(operandA, operandB);

        Assert.assertEquals(false, result);
    }

    /*
    * Positive test, the function executes with valid data given
    * */
    @Test
    public void TestNull_Positive(){
        MyMethods methods = new MyMethods();

        java.lang.Object result = methods.GetObject(true);

        Assert.assertNotNull(result);
    }

    /*
    * Negitive test, the function crashes with invalid data given
    * */
    @Test
    public void TestNull_Negetive(){
        MyMethods methods = new MyMethods();

        java.lang.Object result = methods.GetObject(false);

        Assert.assertNull(result);
    }

    /*
    * Positive test, the function executes with valid data given
    * */
    @Test
    public void TestList_Positive(){
        MyMethods methods = new MyMethods();

        java.util.LinkedList<java.lang.Object> items = new java.util.LinkedList<java.lang.Object>();

        boolean result = methods.HasItems(items);

        Assert.assertEquals(false, result);
    }

    /*
    * Negitive test, the function crashes with invalid data given
    * */
    @Test(expected = NullPointerException.class)
    public void TestList_Negetive(){
        MyMethods methods = new MyMethods();

        java.util.LinkedList<java.lang.Object> items = null;

        boolean result = methods.HasItems(items);

        Assert.assertEquals(false, result);
    }

}
