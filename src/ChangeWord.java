public class ChangeWord {
    static boolean solution(String inputString) {
        for(int i = 0; i < inputString.length(); i++) {
            if(inputString.charAt(i) != inputString.charAt(inputString.length()-i-1))
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.print(solution("acbaa"));
    }
}
