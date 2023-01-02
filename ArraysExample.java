package Arrays;

import java.util.Scanner;

class ArraysExampl {
    void demoArrays() {
        int[] ages = new int[3];
        float[] weights = new float[3];
        String[] names = {"Sonu", "Aman", "Moni"};
        ages[0] = 23;
        ages[1] = 25;
        ages[2] = 22;
        weights[0] = 45.5f;
        weights[1] = 51.3f;
        weights[2] = 48.7f;
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);


        System.out.println(ages[0]);
        System.out.println(ages[1]);
        System.out.println(ages[2]);


    }
}

class ArraysExample {
    public static void main(String[] args) {
        ArraysExampl obj = new ArraysExampl();
        obj.demoArrays();
    }
}