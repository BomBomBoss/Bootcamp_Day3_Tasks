package com.company;

public class Main {

    public static void main(String[] args) {
        int [][] table = multiplicationTable();
        int[] table2 = new int []{23,34,2,56};
        int [] copiedArray = copyArray(table2);

    }

    public static int[][] multiplicationTable() {
        int [][] table = new int[10][10];
        for (int i = 0; i<table[0].length; i++) {
            for (int j = 0; j<table.length; ++j) {
                table[i][j] = (i +1) * (j+1);
                System.out.println(i+1 + " * " + (j + 1) + " = " + table[i][j]);
            }
        } return table;
    }

    public static int[] copyArray (int [] array) {
        int[] result = new int[array.length];
        int index = 0;
        for (int i : array) result[index++] = i;
        return result;
    }



}
