public class Stack {
    int [] array ; // Instance Variable
    int index = 3 ;

    Stack (int length){ // Giving Array Length through parametrized Constructor-
        array = new int[length] ;
        System.out.println("Array Length : "+array.length);
    }

    int push (int element){
        if(isArrayFull()){
            System.out.println("Array Is Already Full");
            System.exit(0);
            return 0;
        }
        else{
            index += 1 ;
            array[index] = element ;
            return index ; // Will return the current index
        }
    }

    boolean isArrayFull (){
        return index == array.length - 1; // Will return true or false value
    }
    boolean isArrayOnStartIndex (){
        return index <= 0;
    }
}
