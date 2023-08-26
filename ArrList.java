import java.util.*;

class ArrayList<T>{
    Object arr[];   // creating obj ref
    int s;
    int capacity;

    // constructor
    ArrayList(){
        capacity = 10;
        s = 0;
        arr = new Object[capacity];  // allocating mem to obj
    }

    // constructor 2
    ArrayList(int c){
        capacity = c;
        s = 0;
        arr = new Object[capacity];
    }

    // add method
    void add(T item){
        if(s==capacity){
            Object brr[] = new Object[s];
            for(int i=0; i<s; i++) brr[i] = arr[i];
            // 10 -> (10*3/2)+1 = 16
            capacity = capacity*3/2 + 1;
            arr = new Object[capacity];
            for(int i=0; i<s; i++) arr[i] = brr[i];
        }
        arr[s++] = item;
    }

// get method for all data types
//    Object get(int index){
//        return arr[index];
//    }
    
    // get method to make the list cater to only a specific type
    T get(int index){
        return (T)arr[index];
    }

    // size method
    int size(){
        return s;
    }

    // isEmpty method
    boolean isEmpty(){
        if(s==0) return true;
        else return false;
    }

    // currCapacity method
    int currCapacity(){
        return capacity;
    }
}

public class ArrList {
    public static void main(String[] args) {
        /*
            ArrayList is stored in heap
            Operations :-
            Addition
            Get
            Modify
            Delete/Remove
            Iterations
         */
        ArrayList<Integer> l = new ArrayList();
        System.out.println("curr capacity : " + l.currCapacity());
        for(int i=1; i<=10; i++) l.add(i);
        System.out.println("curr capacity : " + l.currCapacity());
        for(int i=0; i<l.size(); i++){
            System.out.println(l.get(i));
        }
        // adding to see if dynamic
        l.add(11);
        System.out.println("curr capacity : " + l.currCapacity());



    }
}
