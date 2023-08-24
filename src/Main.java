import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;

        System.out.println("Set Array Length");
        int length = sc.nextInt() ;
        Stack st = new Stack(length) ;
        System.out.println("How many elements you want to push");
        int countPush = sc.nextInt() ;

        for (int i=0 ; i<countPush; i++){
            System.out.print("Input Element at index : "+(i+1)+" : ");
            int element = sc.nextInt() ;
            System.out.println("Element Successfully Pushed at Index : "+st.push(element)) ;
        }
    }
}
