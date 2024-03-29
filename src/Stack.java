public class Stack {
    int [] array ; // Instance Variable
    int index = -1 ;

    Stack (int length){   //Giving Array Length through parametrized Constructor-
        array = new int[length] ;
        System.out.println("Array Length : "+array.length);
    }

    int pop (int ind){
        if (isArrayEmpty()) {
            System.out.println("Array Is Empty!");
            return -1 ; }
        else{
            int value = array[ind] ;
            index-- ;
            return value ;
        }
    }

    int push (int element){
        if(isArrayFull()){
            System.out.println("Array Is Full");
            return -1;
        }
        else{
            return array[++index] = element  ; // Will return the push value
        }
    }

    int peak () {
        if(isArrayEmpty()){
            System.out.println("Array Is Empty");
            return -1 ;
        }
        else {
            return array[index] ;
        }
    }

    boolean isArrayFull (){ return index == array.length - 1; } // Will return true or false boolean value

    boolean isArrayEmpty ()  { return index < 0 ; }

    void displayArray (){
        System.out.println("Final Array Values ! ");
            for (int i=0;i<=index;i++){
                System.out.print(array[i]+" ");
            }
    }
}
