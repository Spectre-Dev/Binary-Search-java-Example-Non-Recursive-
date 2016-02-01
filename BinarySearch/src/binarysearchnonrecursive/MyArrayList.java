package binarysearchnonrecursive;

import java.util.ArrayList;

/**
 * X13114514
 * @author Rich
 */
public class MyArrayList<ElemType> extends ArrayList {
    boolean found=false;
    int middle=0;

    public int BinarySearch(ElemType key, int start, int end) {
        found = false;
        while ((start <= end) && (found == false)) {
            middle = (start + end) / 2;
            if (((Comparable) get(middle)).compareTo((Comparable) key) == 0) {
                found = true;
            } else if (((Comparable) get(middle)).compareTo((Comparable) key) < 0) {
                start = middle + 1;
            } else {
                end = middle - 1;
            }
        }
        if (found == true) {
            return middle;
        } else {
            return -1;
        }
    }
    
    public int BinarySearchRecursive(ElemType key, int start, int end) {
        int result;
        middle = (start + end) / 2;
        if (((Comparable) get(middle)).compareTo((Comparable) key) == 0) {
            result = middle;
        } else if (start == end) {
            result = -1;
        } else {
            if (((Comparable) get(middle)).compareTo((Comparable) key) < 0) {
                result = BinarySearchRecursive(key, start, middle - 1);
            } else {
                result = BinarySearchRecursive(key, middle + 1, end);
            }
        }
        return result;
    }
}
