package streams;

import java.util.ArrayList;
import java.util.List;

public class OccurenceInString {
    public static void main(String[] args) {
        String str = "Cognizant Solutions";
        List<Character> StringList = new ArrayList<>();

        for (int i = 0; i < str.length()-1; i++) {
            StringList.add(str.charAt(i));
        }
        System.out.println(StringList);

        for(char ch : StringList){
            long count = StringList.stream()
                    .filter(a-> a.equals(ch))
                    .count();
            System.out.println(ch+" = "+count);
        }

        System.out.println("**************");

        //Brute Force
        for (int i = 0; i < str.length()-1; i++) {
            int count = 0;
            char ch = str.charAt(i);
            for (int j = 0; j < str.length()-1; j++) {
                if(str.charAt(j) == ch) {
                    count++;

                }
            }
            System.out.println(ch +" = "+count);
        }

    }
}
