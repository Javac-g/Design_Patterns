package com.company.Composite.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Grading implements Student{
    private List<Student> list = new ArrayList<>();
    public void addStudent(Student...student){
        list.addAll(Arrays.asList(student));
    }
    public void clearComposer(){
        list.clear();
    }


    @Override
    public void getGrade(Integer grade) {
        for (Student x :list){
            x.getGrade(grade);

        }
    }
}
