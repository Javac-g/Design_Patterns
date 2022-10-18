package com.company.Builder;

public class Person {

    private String firstName,middleName,lastName,sex,job,hobby;
    private int age,weight;


    public static class Builder{
        private Person person;

        public Builder(){
            this.person = new Person();
        }
        public Builder addFirstName(String firstName){
            person.firstName = firstName;
            return this;
        }
        public Builder addLastName(String lastName){
            person.lastName = lastName;
            return this;
        }
        public Builder addMiddleName(String middleName){
            person.middleName = middleName;
            return this;
        }
        public Builder addSex(String sex){
            person.sex = sex;
            return this;
        }
        public Builder addJob(String job){
            person.job = job;
            return this;
        }
        public Builder addHobbie(String hobby){
            person.hobby = hobby;
            return this;
        }

        public Builder addWeight(Integer weight){
            person.weight = weight;
            return this;
        }
        public Builder addAge(Integer age){
            person.age = age;
            return this;
        }


        public Person build(){
            return person;
        }


    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", sex='" + sex + '\'' +
                ", job='" + job + '\'' +
                ", hobby='" + hobby + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }
}
