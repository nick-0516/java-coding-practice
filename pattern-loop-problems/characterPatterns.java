/*
Pattern1:
A
A B
A B C
A B C D

Pattern2:
A
B B
C C C
D D D D

Pattern3:
A
B C
D E F
G H I J

Pattern4:
A B C D
A B C
A B
A

*/
public class characterPatterns {
    public static void main(String args[]){
        int n = 4;
        //pattern1
        System.out.println();
        for(int i=0; i<n; i++){
            char ch = 'A';
            for(int j=0; j<=i; j++){
                System.out.print(ch++ +" ");
                // ch1++;
            }
            System.out.println();
        }
        
        //pattern2
        System.out.println();
        char ch1 = 'A';
        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                System.out.print(ch1 +" ");
            }
            ch1++;
            System.out.println();
        }

        //pattern3
        System.out.println();
        char ch2 = 'A';
        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                System.out.print(ch2++ +" ");
            }
            System.out.println();
        }

        //pattern4
        System.out.println();
        for(int i=0; i<n; i++){
            char ch = 'A';
            for(int j=1; j<=n-i; j++){
                System.out.print(ch++ +" ");
            }
            System.out.println();
        }
    }
}
