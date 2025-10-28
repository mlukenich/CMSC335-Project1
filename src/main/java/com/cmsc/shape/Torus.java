/**
 * Name: Matthew Lukenich
 * Class: CMSC335
 */
package com.cmsc.shape;

public class Torus extends ThreeDimensionalShape {
    private double majorRadius; // distance from center of torus to center of the tube
    private double minorRadius; // radius of the tube

    /**
     * Constructor
     * @param majorRadius
     * @param minorRadius
     */
    public Torus(double majorRadius, double minorRadius) {
        this.majorRadius = majorRadius;
        this.minorRadius = minorRadius;
    }

    /**
     * Calculates the volume of the torus.
     * 
     * @return volume
     */
    @Override
    public double getVolume() {
        return (Math.PI * Math.pow(minorRadius, 2)) * (2 * Math.PI * majorRadius);
    }
}