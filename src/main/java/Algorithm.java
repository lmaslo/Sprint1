package main.java;

public class Algorithm {
    public static void main(String[] args) {
        Algorithm algo = new Algorithm();
        System.out.println("Expected result 2. Actual result:" + algo.timesTwo(1));
        assert 2 == algo.timesTwo(1);

        int min = algo.findMin(new int[] {15, 4, 1});
        assert 1 == min : "Actual result " + min;

        Integer min2 = algo.findMin(new int[] {});
        assert null == min2 : "Actual result " + min2;

        Integer min3 = algo.findMin(null);
        assert null == min3 : "Actual result " + min3;
    }

    private long timesTwo(int arg) {
        return arg * 2;
    }


    private Integer findMin(int[] array) {

        if (array !=null && array.length>0) {
            int min = array[0];
            for (int i = 0; i < array.length; i++) {
                if (min > array[i]) {
                    min = array[i];
                }
            }
            return min;
        }
        else
        {
            return null;
        }

    }


}
