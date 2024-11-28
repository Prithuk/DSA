package com.java8.constructorreference;

import com.java8.MethodReference.IWork;

public class Implementation {

    public static void main(String[] args) {
        Test test = Person::new; 

       Person person = test.testData();
       person.display();


    }


}
