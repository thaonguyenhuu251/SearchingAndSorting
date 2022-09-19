public class TotalNumber {
    public static int totalResult(int x) {
        int total = 0;
        for(int i = 1; i <= x; i++){
            if( i<=9 ) {
                total += i;
            } else {
                total += i/10 + i%10;
            }
        }
        return total;
    }

    public static void main(String args[]) {
        int result = totalResult(12);
        System.out.print("Result: " + result);
    }
}
