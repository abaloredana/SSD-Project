/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diabetes.project;

/**
 *
 * @author loredana
 */
public class Disease {
    private String name;
    private boolean suffers;

    public Disease(String name, boolean shouldBeApplied) {
        this.name = name;
        this.suffers = shouldBeApplied;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSuffered() {
        return suffers;
    }

    public void setSuffers(boolean shouldBeApplied) {
        this.suffers = shouldBeApplied;
    }

    @Override
    public String toString() {
        return "(" + name + ", " + suffers + ")";
    }
}
