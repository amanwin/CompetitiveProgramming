package com.coding.uva.problems;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/*
UVA online judge problem:
    11172 - Relational Operator
 */
class UVA11172 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        final Solver solver = new Solver();
        StringBuilder sb = new StringBuilder();
        for (int t = Integer.parseInt(sc.nextLine()); t > 0; t--) {
            int[] items = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            sb.append(solver.solve(items)).append("\n");
        }
        sb.setLength(sb.length() - 1);
        System.out.println(sb);
    }
}

class Solver {
    public String solve(int[] item) {
        if(item[0] > item[1])
            return ">";
        else if(item[0] < item[1])
            return "<";
        else
            return "=";
    }
}