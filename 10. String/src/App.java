public class App {
    public static void main(String[] args) throws Exception {
        String s1 = "Hello", nstr = "";
        char ch;

        for (int i = 0; i < s1.length(); i++) {
            ch = s1.charAt(i);
            nstr = ch + nstr;
        }
        System.out.print(nstr);
    }
}
