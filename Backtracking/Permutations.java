public class Permutations {
    public static void perm(String str, String perm) {
        if (str.length()==0) {
            System.out.println(perm);
            return;
        }
        //sending every char in perm
        for (int i = 0; i < str.length(); i++) {
            //getting current character of current string(str)
            char currChar = str.charAt(i);
            //removing currchar from str, coz on next step we 
            //dont want to choose currChara again
            String NewStr = str.substring(0, i)+str.substring(i+1);
            perm(NewStr, perm+currChar);
        }
    }



    public static void main(String[] args) {
        perm("123456", "");
    }
}
