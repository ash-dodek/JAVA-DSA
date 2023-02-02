public class SubSets{
    public static void FindSubSets(String str, String currSet, int index) {
        if (index == str.length()) {
            System.out.println(currSet);
            return;
        }
        //if yes choice, the add the current  charof str to currSet
        FindSubSets(str, currSet+str.charAt(index), index+1);
        //if no choice, make next call
        FindSubSets(str, currSet, index+1);
    }
    public static void main(String[] args) {
        String str = "harsh tripathi";
        FindSubSets(str, "", 0);
    }
}