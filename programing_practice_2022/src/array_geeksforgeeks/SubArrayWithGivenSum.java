package array_geeksforgeeks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubArrayWithGivenSum {

    static ArrayList<Integer> subarraySum(int[] arr, int n, int s)
    {
        ArrayList<Integer> list = new ArrayList<>();
        int currSum = arr[0];
        int leftPonter = 0;
        int rightPointer = 1;

        while(leftPonter <= rightPointer){
            while(currSum > s){
                currSum  = currSum - arr[leftPonter];
                leftPonter++;
            }
            if(currSum == s){
              list.add(leftPonter+1);
              list.add(rightPointer);

            return  list;
            }
            if(leftPonter< rightPointer){
                currSum  = currSum + arr[rightPointer];
                rightPointer++;
            }
        }


        return list;
    }

    public static void main(String[] args) {
int [] array = {1,2,3,4,5,6,7,8,9,10};
int n = 10;
int s = 15;
subarraySum(array , n , s);

    }

}
