/*
Counting vowels, consonants, digits, and spaces in a string.
*/
public class charCategoryCounter {
    public static void main(String args[]){
        String sentence="aeI bcD 123 @#$";
        
        int vowels=0, consonants=0, digits=0, spaces=0, others=0;
        for(int i =0; i<sentence.length();i++){
            char ch=sentence.charAt(i);
            if(Character.isLetter(ch)){
                char chLower=Character.toLowerCase(sentence.charAt(i));
                if("aeiou".indexOf(chLower)!=-1){ //indexOf returns -1 if string "aeiou" doesn't contain given character/word/substring
                    vowels++;
                }else{
                    consonants++;                
                }
            }else if(Character.isDigit(ch)){
                digits++;
            }else if(ch== ' '){
                spaces++;
            }else{
                others++;
            }
        }
        System.out.println("String \""+sentence+"\" has :\n"
            +vowels+" Vowels\n"
            +consonants+" Consonants\n"
            +digits+" Digits\n"
            +spaces+" Spaces\n"
            +others+" Others"
        );
    }
}
