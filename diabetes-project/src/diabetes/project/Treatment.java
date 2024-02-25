/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diabetes.project;

/**
 *
 * @author loredana
 */
public class Treatment {
     private String name;
    private boolean shouldBeApplied;

    public Treatment(String name, boolean shouldBeApplied) {
        this.name = name;
        this.shouldBeApplied = shouldBeApplied;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isShouldBeApplied() {
        return shouldBeApplied;
    }

    public void setShouldBeApplied(boolean shouldBeApplied) {
        this.shouldBeApplied = shouldBeApplied;
    }

    @Override
    public String toString() {
        return "(" + name + ", " + shouldBeApplied + ")";
    }
    
}
