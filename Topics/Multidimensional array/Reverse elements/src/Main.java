class ArrayOperations {
    public static void reverseElements(int[][] twoDimArray) {
        // write your code here
        for (int i = 0; i < twoDimArray.length; i++) {
            int[] oppositeArray = new int[twoDimArray[i].length];
            for (int j = 0; j < twoDimArray[i].length; j++) {
                int oppositeIndex = (twoDimArray[i].length - 1) - j;;
                oppositeArray[j] = twoDimArray[i][oppositeIndex];
            }
            twoDimArray[i] = oppositeArray;
        }
    }
}