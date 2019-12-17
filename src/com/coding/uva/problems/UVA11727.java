package com.coding.uva.problems;

import java.util.Arrays;
import java.util.Scanner;

class UVA11727 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solver2 solver = new Solver2();
        StringBuilder sb = new StringBuilder();
        int id = 1;
        for (int i = Integer.parseInt(sc.nextLine()); i > 0; i--) {
            int[] input = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            sb.append(solver.solve(input, id)).append("\n");
            ++id;
        }
        System.out.print(sb);
    }
}

class Solver2 {
    String solve(int[] input, int id) {
        Arrays.sort(input);
        return "Case " + id + ": " + input[1];
    }
}
