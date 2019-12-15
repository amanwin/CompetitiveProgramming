package com.coding.uva.problems;

import java.util.Arrays;
import java.util.Scanner;

public class UVA11498 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solver1 solver = new Solver1();
        StringBuilder sb = new StringBuilder();
        int t = -1;

        while(t != 0) {
            t = Integer.parseInt(sc.nextLine());
            if (t != 0) {
                int[] divison = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
                for (int i = t; i > 0; i--) {
                    int[] coordinates = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
                    sb.append(solver.solve(divison, coordinates)).append("\n");
                }
            } else {
                System.out.print(sb);
                System.exit(0);
            }
        }
    }
}

class Solver1 {
    String solve(int[] division, int[] coordinates) {
        if(coordinates[0] == division[0] || coordinates[1] == division[1])
            return "divisa";
        else if(coordinates[0] > division[0]) {
            if(coordinates[1] > division[1]) {
                return "NE";
            } else {
                return "SE";
            }
        } else {
            if(coordinates[1] > division[1]) {
                return "NO";
            } else {
                return "SO";
            }
        }
    }
}
