package com.Vectors;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Vector result = new Vector();

        System.out.println("Haw many vectors do you want add?");

        Vector[] array = OperationsVector.setArrayVectors(OperationsVector.setIntegerValue());

        result = OperationsVector.addArrayVectors(array);

        System.out.println(result.toString());
    }
}
