public class AdjacentElementsProduct {
    static int solution(int[] inputArray) {
        int result = inputArray[0]* inputArray[1];
        for (int i = 0; i < inputArray.length - 1; i++) {
            if (result < inputArray[i]* inputArray[i+1])
                result = inputArray[i]* inputArray[i+1];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] c = {1, 2, 3, 4, 5};
        System.out.print(solution(c));
    }
}
