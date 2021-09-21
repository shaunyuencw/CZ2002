public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(reverseString("Test"));
    }
    
    public static String reverseString(String inputString){
        String ans = "";
        for (int i = inputString.length() - 1; i >= 0; i--){
            ans = ans + inputString.charAt(i);
        }

        return ans;
    }
}
