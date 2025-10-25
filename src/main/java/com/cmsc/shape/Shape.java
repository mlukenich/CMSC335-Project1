/**
 * Name: Matthew Lukenich
 * Class: CMSC335
 */
package com.cmsc.shape;

/**
 * Abstract class as base for all Shapes.
 *
 * This is the "is-a" relationship foundation
 */
public abstract class Shape {

    public int numberOfDimenions;

    /**
     * Constructor
     * @param numberOfDimenions
     */
    public Shape(int numberOfDimenions) {
        this.numberOfDimenions = numberOfDimenions;
    }

    /**
     * Getter for number of dimensions
     * @return numberOfDimenions
     */
    public int getNumberOfDimenions() {
        return numberOfDimenions;
    }

    /**
     * Setter for number of dimensions
     * @param numberOfDimenions
     */
    public void setNumberOfDimenions(int numberOfDimenions) {
        this.numberOfDimenions = numberOfDimenions;
    }
}
