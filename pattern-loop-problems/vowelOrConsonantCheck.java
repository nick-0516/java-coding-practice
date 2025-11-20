public class vowelOrConsonantCheck {
    public static void main(String args[]){
        char character = 'A';
        if(Character.isLetter(character)){ //returns true only for [A-Z],[a-z]
            char ch = Character.toLowerCase(character); //converting to lowercase for easier comparison
            //ch == 'a'||ch =='e'||ch =='i'||ch =='o'||ch =='u'
            if("aeiou".indexOf(ch)!=-1){ //indexOf returns -1 if string "aeiou" doesn't contain given character/word/substring
                System.out.println(character+" is a Vowel");
            }else{
                System.out.println(character+" is a Consonant");                
            }
        }else{
            System.out.println(character+" is a not a valid Character ([A-Z],[a-z])");                
        }
    }
}
