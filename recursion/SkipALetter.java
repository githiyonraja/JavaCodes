package recursion;

public class SkipALetter {
    public static void main(String[] args) {
        String word = "abccbacd";
        char letter = 'c';
        String up = "";
        skip(up,word,letter);
    }

    static void skip(String p, String up, char letter){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        if(ch == letter){
            skip(p,up.substring(1),letter);
        }else{
            skip(p+ch, up.substring(1),letter);
        }
    }
}
