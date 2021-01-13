package com.Vectors;

public class Vector {

    private String vectorName;
    private double vectorX;
    private double vectorY;
    private double vectorZ;

    // Constructor vector X, Y, Z

    Vector (String vectorName, double vectorX, double vectorY, double vectorZ) {
        this.vectorName = vectorName;
        this.vectorX = vectorX;
        this.vectorY = vectorY;
        this.vectorZ = vectorZ;

    }

    // Default constructor vector no name 0, 0, 0

    Vector () {
        this.vectorName = "";
        this.vectorX = 0.0;
        this.vectorY = 0.0;
        this.vectorZ = 0.0;

    }

    // Getters and setters

    public String getVectorName () {
        return vectorName;
    }

    public void setVectorName (String name) {
        vectorName = name;
    }

    public double getCoordinateX () {
        return vectorX;
    }

    public void setCoordinateX (double x) {
        vectorX = x;
    }

    public double getCoordinateY () {
        return vectorY;
    }

    public void setCoordinateY (double y) {
        vectorY = y;
    }

    public double getCoordinateZ () {
        return vectorZ;
    }

    public void setCoordinateZ (double z) {
        vectorZ = z;
    }

    @Override
    public int hashCode() {
        int result = 31 * (int) vectorX + 31 * (int) vectorY + 31 * (int) vectorZ + (vectorName != null ? vectorName.hashCode() : 0);
        return result;
    }

    @Override
    public boolean equals (Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Vector vector = (Vector) o;

    if (vectorX != vector.vectorX) return false;
    if (vectorX != vector.vectorX) return false;
    if (vectorX != vector.vectorX) return false;

    return vectorName != null ? vectorName.equals(vector.vectorName) : vectorName == null;
    }

    @Override
    public String toString() {
        return "VectorName: " + vectorName + "\n X: " + vectorX + "\n Y: " + vectorY + "\n Z: " + vectorZ;
    }
}
