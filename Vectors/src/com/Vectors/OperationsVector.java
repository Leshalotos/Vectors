package com.Vectors;

import java.util.Scanner;

public class OperationsVector {

    // Set integer value

    public static int setIntegerValue()  {

        Scanner scanner = new Scanner (System.in);
        int value = scanner.nextInt();
        return value;
    }

    public static double setDoubleCoordinates()  {

        Scanner scanner = new Scanner (System.in);
        double value = scanner.nextDouble();
        return value;
    }

    public static String setName() {
        Scanner scanner = new Scanner (System.in);
        String value = scanner.nextLine();
        return value;
    }

    public static Vector setVector() {
        System.out.println ("Enter vector name, please:");
        String vectorName = OperationsVector.setName();
        System.out.println ("Enter coordinates X, Y, Z for vector " + vectorName + ":");
        double X = OperationsVector.setDoubleCoordinates();
        double Y = OperationsVector.setDoubleCoordinates();
        double Z = OperationsVector.setDoubleCoordinates();
        Vector vector = new Vector(vectorName, X, Y, Z);
        return vector;
    }

    public static Vector[] setArrayVectors(int value) {
        Vector[] vectors = new Vector[value];
        for (int i = 0; i < value; i++) {
            System.out.println ("Enter name and coordinates " + (i+1) + " vector:");
            vectors[i] = OperationsVector.setVector();
        }
        return vectors;
    }

    public static Vector addTwoVectors(Vector a, Vector b) {
        Vector addResult = new Vector();
        addResult.setVectorName(a.getVectorName().concat(b.getVectorName()));
        addResult.setCoordinateX((a.getCoordinateX() + b.getCoordinateX()));
        addResult.setCoordinateY((a.getCoordinateY() + b.getCoordinateY()));
        addResult.setCoordinateZ((a.getCoordinateZ() + b.getCoordinateZ()));
        return addResult;
    }

    public static Vector addArrayVectors (Vector[] arr) {
        Vector addArrayResult = new Vector();
        for (int i = 0; i<arr.length; i++) {
            addArrayResult.setVectorName(addArrayResult.getVectorName().concat(arr[i].getVectorName()));
            addArrayResult.setCoordinateX(addArrayResult.getCoordinateX() + arr[i].getCoordinateX());
            addArrayResult.setCoordinateY(addArrayResult.getCoordinateY() + arr[i].getCoordinateY());
            addArrayResult.setCoordinateZ(addArrayResult.getCoordinateZ() + arr[i].getCoordinateZ());
        }
            return addArrayResult;
    }

}
