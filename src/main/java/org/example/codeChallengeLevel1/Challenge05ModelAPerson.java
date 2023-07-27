package org.example.codeChallengeLevel1;

public class Challenge05ModelAPerson {
    // person class with first name and last name
    // age attributes with getters and setters
    // add functionality for introducing themselves.
    private String firstName;
    private String lastName;
    private int personAge;
    public Challenge05ModelAPerson (String first,
                                    String last,
                                    int age){
        this.firstName = first;
        this.lastName = last;
        this.personAge = age;
    }

    // getter
    public int getAge(){
        return this.personAge;
    }

    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    // setter
    public void setAge(int age){
        if (age < this.personAge){
            System.out.println("Cannot make person younger");
        } else{
        this.personAge = age;
    }
    }


    public String greeting(){
        String greeting = "hi! My name is " + firstName + " " + lastName + ".";
        return greeting;
    }

}
