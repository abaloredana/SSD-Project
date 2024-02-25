/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diabetes.project;


import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author loredana
 */
public class Patient {
    private int typeOfDiabetes;
    private boolean hypotension;
    private List<String> diseases= new ArrayList<String>();

    private double bmi;
    private int age;

    // Constructor
    public Patient(int typeOfDiabetes, boolean hypotension, double bmi, int age) {
        this.typeOfDiabetes = typeOfDiabetes;
        this.hypotension = hypotension;
        this.bmi = bmi;
        this.age = age;
    }

    Patient() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    // Getters and Setters
    public int getTypeOfDiabetes() {
        return typeOfDiabetes;
    }

    public void setTypeOfDiabetes(int typeOfDiabetes) {
        this.typeOfDiabetes = typeOfDiabetes;
    }

    public boolean isHypotension() {
        return hypotension;
    }

    public void setHypotension(boolean hypotension) {
        this.hypotension = hypotension;
    }

    public double getBmi() {
        return bmi;
    }

    public void setBmi(double bmi) {
        this.bmi = bmi;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



    
    public static Patient doSomething(Patient message) {
        return message;
    }

   

}

    

