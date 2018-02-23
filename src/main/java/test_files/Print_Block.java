/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test_files;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Menja
 */
public class Print_Block {

    public static void main(String[] args) {

        //Row
        row();
        System.out.println("\n");

        //Block
        block();
        System.out.println("\n");

        //Column 
        column();
        System.out.println("\n");
    }

    public static void row() {
        List<Integer> row = new ArrayList<>();
        for (int i = 1; i < 10; i++) {
            row.add(i);
        }
        //Default row
        System.out.println("Row: " + row);
        Collections.shuffle(row);
        //Shuffled row
        System.out.println("Shuffled row: " + row);
    }

    public static void block() {
        List<Integer> row = new ArrayList<>();

        for (int i = 1; i < 10; i++) {
            row.add(i);
        }
        //Default block
        System.out.println("Block: ");
        System.out.print(row.get(0));
        System.out.print(row.get(1));
        System.out.println(row.get(2));
        System.out.print(row.get(3));
        System.out.print(row.get(4));
        System.out.println(row.get(5));
        System.out.print(row.get(6));
        System.out.print(row.get(7));
        System.out.println(row.get(8));

        //Shuffled block
        Collections.shuffle(row);
        System.out.println("Shuffled block: " + row);
        System.out.print(row.get(0));
        System.out.print(row.get(1));
        System.out.println(row.get(2));
        System.out.print(row.get(3));
        System.out.print(row.get(4));
        System.out.println(row.get(5));
        System.out.print(row.get(6));
        System.out.print(row.get(7));
        System.out.println(row.get(8));
    }

    public static void column() {
        List<Integer> column = new ArrayList<>();

        for (int i = 1; i < 10; i++) {
            column.add(i);
        }

        //Default column
        System.out.println("Column: ");
        System.out.println(column.get(0));
        System.out.println(column.get(1));
        System.out.println(column.get(2));
        System.out.println(column.get(3));
        System.out.println(column.get(4));
        System.out.println(column.get(5));
        System.out.println(column.get(6));
        System.out.println(column.get(7));
        System.out.println(column.get(8));

        //Shuffled column
        Collections.shuffle(column);
        System.out.println("Shuffled Column: ");
        System.out.println(column.get(0));
        System.out.println(column.get(1));
        System.out.println(column.get(2));
        System.out.println(column.get(3));
        System.out.println(column.get(4));
        System.out.println(column.get(5));
        System.out.println(column.get(6));
        System.out.println(column.get(7));
        System.out.println(column.get(8));
    }
}
