package LinearSearch;

public class SearchInStringInRange {
    public static void main(String[] args) {
        String name = "Githiyon";
        char target = 'r';

        System.out.println(searchRange(name,target,2,5));
    }

    static Boolean searchRange(String name, char target, int start, int end) {

        for (int i = start; i < end; i++) {
            if(name.charAt(i) == target){
                return true;
            }
        }
        return false;
    }
}
