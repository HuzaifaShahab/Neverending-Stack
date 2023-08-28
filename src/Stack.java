public class Stack {
    int [] array ; // Instance Variable
    int index = -1 ;

    Stack (int length){ // Giving Array Length through parametrized Constructor-
        array = new int[length] ;
        System.out.println("Array Length : "+array.length);
    }

    int push (int element){
        if(isArrayFull()){
            return -1;
        }
        else{
            index += 1 ;
            array[index] = element ;
            return element ; // Will return the present index
        }
    }

    int pop (int ind){
        if (isArrayEmpty()) return -1 ;
        else{
            int value = array[ind] ;
            index -= 1 ;
            return value ;
        }
    }

    boolean isArrayFull (){ return index == array.length - 1; }// Will return true or false boolean value

    boolean isArrayOnStartIndex (){ return index <= 0; }

    boolean isArrayEmpty ()  { return index < 0 ; }

    void displayArray (){
        System.out.println("Final Array Values ! ");
            for (int i=0;i<=index;i++){
                System.out.print(array[i]+" ");
            }
    }
}
