/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diabetes.project;


import java.util.ArrayList;
import java.util.List;
import diabetes.project.Disease;

/**
 *
 * @author loredana
 */
public class Patient {
    private String name;
    private int typeOfDiabetes;
    private List<Treatment> treatments = new ArrayList<>();
    private double bmi;
    private int age;
    private String insulinProd;
    private boolean insulinRes;
    private boolean hypotension;
    private boolean dyslipidemia;
    private boolean pad;
    private boolean nafld;
    private boolean osteoporosis;
    
    

    public String getInsulinProd() {
        return insulinProd;
    }

    public void setInsulinProd(String insulinProd) {
        this.insulinProd = insulinProd;
    }

    @Override
    public String toString() {
        return "Patient{" + "typeOfDiabetes=" + typeOfDiabetes + ", treatments=" + treatments + ", bmi=" + bmi + ", age=" + age + ", name=" + name + '}';
    }

  

    public void setName(String name) {
        this.name = name;
    }


    public void setTreatments(List<Treatment> treatments) {
        this.treatments = treatments;
    }


    Patient() {
        
    }
   

    public void addTreatment(Treatment treatment) {
        this.treatments.add(treatment);
    }

    public void applyTreatment(String treatmentName, boolean apply, double priority) {
        for (Treatment treatment : treatments) {
            if (treatment.getName().equals(treatmentName)) {
                treatment.setShouldBeApplied(apply);
                treatment.setPriority(priority);
                return;
            }
        }
        // If treatment not found, add it with the specified application status
        addTreatment(new Treatment(treatmentName, apply, priority));
    }
    // Getters and Setters
    public int getTypeOfDiabetes() {
        return typeOfDiabetes;
    }

    public void setTypeOfDiabetes(int typeOfDiabetes) {
        this.typeOfDiabetes = typeOfDiabetes;
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

    

