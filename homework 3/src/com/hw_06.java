package com;

import java.util.*;

public class hw_06 {

    public static void main(String[] args) {
        Integer[] testArray1 = {4,5,6,7,1,2,9,12};

        System.out.println(getIndex(testArray1,4));
        System.out.println(getIndex(testArray1,9));
        System.out.println(getIndex(testArray1,11));

        Integer[] testArray2=new Integer[]{34, 0, 0, 14, 15, 0, 18, 0, 0, 1, 20};
        doOrderedArray(testArray2);
        System.out.println(Arrays.toString(testArray2));
    }

    public static int getIndex(Integer[] array, int number){
        return Arrays.asList(array).indexOf(number);
    }

    public static void doOrderedArray(Integer[] array){
       List<Integer> list = new ArrayList<>(Arrays.asList(array));
       list.removeIf(x->x.equals(0));
       for (int i=list.size();i<array.length;i++){
           list.add(0);
       }
//        System.out.println(list);

       for(int i=0;i< array.length;i++){
           array[i]=list.get(i);
       }
    }
}
