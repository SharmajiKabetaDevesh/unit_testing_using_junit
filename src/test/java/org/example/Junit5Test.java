package org.example;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class Junit5Test {
    static Junit j;

    @BeforeAll
    static void execute(){
        j=new Junit();
        System.out.println("start");
    }


    @ParameterizedTest
    @ValueSource(ints={2,3,4,5,8,10,12})
    void testMe(int number){
        j=new Junit();
        assertTrue(j.isEven(number),()->"Nah|| it's odd");
    }


    @Test
    void onList(){
        ArrayList<Integer>arr=new ArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.add(50);

        j.sortMe(arr);

        ArrayList<Integer>arr2=new ArrayList<>();
        arr2.add(50);
        arr2.add(40);
        arr2.add(30);
        arr2.add(20);
        arr2.add(10);


        assertIterableEquals(arr2,arr);
    }
    @AfterAll
    static void exec(){
        j=null;
        System.out.println("end");
    }


}