package com.quest.Practice;

/*public class S{
    public static void main(String[] args) {
        for(int i=0;i<10;i++){
            if(i%2==0){
                System.out.println(i);
                break;
                //continue;
            }
        }
    }
}*/
/*class S{
    public static void main(String[] args) {
        for(int i=1;i<=4;i++){
            for(int j=1;j<=4;j++){
                int k=i+j-1;
                if(k>4) {
                    System.out.print(k - 4 + " ");
                }else {
                    System.out.print(k + " ");
                }
            }
            System.out.println();
        }
    }
}*/

/*class S{
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0) {
                    System.out.print("1 ");
                }else{
                    System.out.print("0 ");
                }
            }
            System.out.println(" ");
        }
    }
}*/

/*class S{
    public static void main(String[] args) {
        int i=65;
        System.out.println((char) i);
    }
}*/
/*class S{
    public static void main(String[] args) {
     for (int i=1;i<10;i++){
         System.out.printf("%d : %c",i,i); //here we use printf instead of println
     }
    }
}*/
//palindrome string
/*class S{
    public static void main(String[] args) {
        String s1 = "malayalam";
        String rev = "";
        for (int i = s1.length()-1; i >= 0; i--){
            rev +=s1.charAt(i);
        }
        System.out.println(rev);
        if(s1.equals(rev)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}*/
//prime
class s{
    public static void main(String[] args) {
        int n= 29;
        boolean isprime = true;
        for(int i=2;i<n/2;i++){
            if(n%i==0){
                isprime = false;
                break;
            }
        }
        if(isprime){
            System.out.println("Prime Number");
        }else {
            System.out.println("Not Prime Number");
        }
    }
}
