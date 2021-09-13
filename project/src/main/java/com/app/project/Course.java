package com.app.project;

// This represents a comment - not considered a command

public class Course { // this is the Course
    // name private property:
    private String name;

    //department class variable
    // a class variable is a static variable.
    static String department;

    // we are done creating the variables

    // private default constructor:
    private Course(){
        // this is the private default constructor
    }

    //public constructor with name parameter variable:
    public Course(String courseName){
//        this is the public constructor with name variable
        this.name = courseName;
    }

    //public getter for name:
    public String getName(){
        return this.name;
    }

//    public setter for name:
    public void setName(String courseName){
        //this is the public setter for name:
        this.name = courseName;
    }
}

//TO test if working create this:
class Tester{
    public static void main(String[] args){
//        lets initialize the course!
        // lets set the static department variable
        Course.department = "Computing and Information Technology";

        Course c = new Course("Computer Technology");

        // The getter we created helps us get the name of the course
        System.out.println("The course name is: "+c.getName());
        c.setName("Information Technology");
        System.out.println("The course name is: "+c.getName());

        System.out.println("Im from the department of: " + c.department +" Studying "+ c.getName());


    }
}