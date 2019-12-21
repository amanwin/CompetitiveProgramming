package com.coding.dp;

import java.util.Scanner;
/*
UVA674 problem
 */
public class CoinChange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solver3 solver3 = new Solver3();
        StringBuilder sb = new StringBuilder();
        while (sc.hasNextLine()) {
            sb.append(solver3.solve(Integer.parseInt(sc.nextLine()))).append("\n");
        }
        System.out.print(sb);
    }
}

class Solver3 {
    int solve(int n) {
        //System.out.println(n);
        int[] den = {1, 5, 10, 25, 50};
        int[] amount = new int[n + 1];
        amount[0] = 1;
        for (int i = 0; i < den.length; i++) {
            for (int j = 0; j < amount.length; j++) {
                if (den[i] <= j) {
                    amount[j] += amount[j - den[i]];
                }
            }
        }
        return amount[n];
    }
}
