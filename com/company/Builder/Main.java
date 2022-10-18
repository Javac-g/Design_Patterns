package com.company.Builder;

public class Main {
     public static void main(String...args){
         Person person = new Person.Builder()
                 .addAge(26)
                 .addFirstName("Max")
                 .addLastName("Denisov")
                 .addMiddleName("Igorovich")
                 .addAge(27)
                 .addWeight(90000)
                 .addJob("Developer")
                 .addHobbie("Playing guitar")
                 .addSex("Male")
                 .build();

         System.out.println(person);
     }
}
