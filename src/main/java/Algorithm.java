package main.java;

public class Algorithm {
    public static void main (String[] args){
        Algorithm algo = new Algorithm();
        System.out.println("Expected result 2. Actual result:" + algo.timesTwo(1));
        System.out.println("Expected result 4. Actual result:" + algo.timesTwo(2));
        System.out.println("Expected result -4. Actual result:" + algo.timesTwo(-2));
    }

    private int timesTwo(int arg){
        return arg*2;
    }

}
