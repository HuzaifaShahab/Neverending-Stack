import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Set Array Length");
        int length = sc.nextInt();
        Stack st = new Stack(length);
        System.out.println("How many elements you want to push ?");
        int countPush = sc.nextInt();

        for (int i = 0; i < countPush; i++) {
            System.out.print("Input Element at index : " + (i + 1) + " : ");
            int element = sc.nextInt();
            int retValue = st.push(element);
            if (retValue == -1) {
                break;
            } else {
                System.out.println(retValue + " successfully pushed");
                st.displayArray();
            }
        }

        System.out.println();
        System.out.println("How many elements you want to pop out ?");
        int countPop = sc.nextInt();

        for (int i = 0; i < countPop; i++) {
            System.out.print("Input " + (i + 1) + " element to pop out : ");
            int element = sc.nextInt();
            int retValue = st.pop(element);
            if (retValue == -1) {
                break;
            } else {
                System.out.println(retValue + " successfully pop");
                st.displayArray();
                System.out.println();
            }
        }
        System.out.println("Do you want to see element at peak");
            int peak = sc.nextInt() ;
            System.out.println(st.peak(peak)+" is at peak now");

    }
}
