package org.example;

import org.apache.maven.surefire.shared.lang3.function.Suppliers;
import org.junit.*;
import org.junit.Test;
import org.junit.jupiter.api.*;

import java.time.Duration;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertTimeout;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class JunitTest {

    public JunitTest(){
        System.out.println("Object Created");
    }

   static Junit  j;
    @BeforeClass
     public static void setup(){
        j=new Junit();

    }
    @Test
    public void divide(){
       assertEquals(2,j.divide(10,5));
    }
    @Test
    public void reverseString(){
        assertEquals("hseved",j.reverseString("devesh"));
    }

    @Test
    public void computeArea(){
        assertEquals(314.0, j.circlearea(10.0), 0.01);
    }

    @Test
    public void reverseArray(){
        int[]arr={10,20,30,40,50};
        int[]expected={50,40,30,20,10};
        assertTimeout(Duration.ofMillis(100),()->j.reverseArray(arr));
    }


}