package com.kiyotakeshi.protobuf;

import com.kiyotakeshi.models.Person;

public class DefaultValueDemo {

    public static void main(String[] args) {

        Person person = Person.newBuilder().build();

        System.out.println("City : " + person.getAddress().getCity()); // City :
        System.out.println(person.hasAddress()); // false
    }
}
