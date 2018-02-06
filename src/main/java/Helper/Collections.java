package Helper;


import Methods.MethodList;

public class Collections implements MethodList {

    int[] example_1 = {1, 4, 1, 4, 2, 1, 3, 5, 6, 2, 3, 7};

    int[] example_2 = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5};

    int[] example_3 = {2, 7, 1, 8, 2, 8, 1};



    public int countArrayElement(int[] testArray) {
        int count = 0;
        int increment = 0;
        for(int i=1; i<= (testArray.length); i++){
            if(i <= testArray.length-1) {
                if (testArray[increment] < testArray[i])  {
                    count = ++count;
                    increment = i;
                }
            }
        }
        return count;
    }


}
