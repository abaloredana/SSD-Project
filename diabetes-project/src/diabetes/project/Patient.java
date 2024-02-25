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

    public List<String> getDiseases() {
        return diseases;
    }
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void setDiseases(List<String> diseases) {
        this.diseases = diseases;
    }

    public void setTreatments(List<Treatment> treatments) {
        this.treatments = treatments;
    }
    private int typeOfDiabetes;
    private boolean hypotension;
    private List<String> diseases= new ArrayList<String>();
    private List<Treatment> treatments = new ArrayList<>();
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
        
    }
   

    public void addTreatment(Treatment treatment) {
        this.treatments.add(treatment);
    }

    public void applyTreatment(String treatmentName, boolean apply) {
        for (Treatment treatment : treatments) {
            if (treatment.getName().equals(treatmentName)) {
                treatment.setShouldBeApplied(apply);
                return;
            }
        }
        // If treatment not found, add it with the specified application status
        addTreatment(new Treatment(treatmentName, apply));
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

    public List<Treatment> getTreatments() {
        return treatments;
    }

    
    public static Patient doSomething(Patient message) {
        return message;
    }

   

}

    

