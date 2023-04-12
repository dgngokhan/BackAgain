public class FindMax_Array {

        public int maxValue(int[] n){


        int max = Integer.MIN_VALUE;

        for (int each : n) {
            if (each > max) {
                max = each;
            }
        }

        return max;
    }
}
