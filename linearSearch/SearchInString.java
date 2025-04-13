package linearSearch;

public class SearchInString {
    public static void main(String[] args) {
        String name = "Githiyon";
        char target = 'o';

        System.out.println(search1(name,target));
        System.out.println(searchForEnhanced(name,target));
    }

    static boolean search1(String name,char target){
        for (int i = 0; i < name.length(); i++) {
            if(name.charAt(i) == target){
                return true;
            }
        }
        return false;
    }
    static boolean searchForEnhanced(String name, char target){
        for(char str : name.toCharArray()){
            if(str == target) return true;
        }
        return false;
    }
}
