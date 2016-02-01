package binarysearchnonrecursive;

/**
 *
 * @author Rich
 */
public class BinarySearchNonRecursive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int pos;
        MyArrayList<Integer> mylist1 = new MyArrayList<Integer>();

        mylist1.add(new Integer(10));
        mylist1.add(new Integer(20));
        mylist1.add(new Integer(30));
        mylist1.add(new Integer(40));
        mylist1.add(new Integer(50));
        mylist1.add(new Integer(60));
        
        System.out.println("the elements are: "+ mylist1.toString());
        Integer key1 = new Integer(50);
        pos = mylist1.BinarySearch(key1, 0, mylist1.size() - 1);
        
        if(pos== -1){
            System.out.println("The number: "+ key1.toString()+ " not found:");
        }
        else{
            System.out.println("The number: "+ key1.toString()+ " found:");
        }
        
        //next method call to recursive version
        MyArrayList<Integer> mylist2 = new MyArrayList<Integer>();
        
        mylist2.add(new Integer(2));
        mylist2.add(new Integer(4));
        mylist2.add(new Integer(6));
        mylist2.add(new Integer(8));
        mylist2.add(new Integer(10));
        mylist2.add(new Integer(12));
        
        Integer key2 = new Integer(8);
        pos = mylist2.BinarySearchRecursive(key1, 0, mylist1.size() - 1);
        
        if(pos== -1){
            System.out.println("found! " + key2.toString());
        }
        else{
            System.out.println("Not found " + key2.toString());
        }
    }   
}
