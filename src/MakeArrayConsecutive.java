public class MakeArrayConsecutive {
    static int solution(int[] statues) {
        int min = statues[0];
        int max = statues[0];
        for(int i = 0; i < statues.length; i++) {
            if(statues[i] < min) {
                min = statues[i];
            }
            if(statues[i] > max) {
                max = statues[i];
            }
        }
        int count = 0;
        for (int i = min; i <= max; i++) {
            if(searchElement(statues, i) == -1) {
                count += 1;
            }
        }
        return count;
    }

    static int searchElement(int[] arr, int x) {
        for(int i = 0; i < arr.length; i++) {
            if (arr[i] == x)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] numbers = { 6,2,3,8};
        /*int min = Collections.min(Arrays.asList(numbers));
        int max = Collections.max(Arrays.asList(numbers));
        System.out.println("Min number: " + min);
        System.out.println("Max number: " + max);*/
        System.out.println("Result: " + solution(numbers));
    }
}
