public class reverse {
    public static void main(String[] args) {
        String s = "Selenium";
        int len = s.length();
        String rev1 = "";
        for (int i = len-1 ; i>=0 ; i--){
            rev1 = rev1+ s.charAt(i);
        }
        System.out.println(rev1);
    }
}
