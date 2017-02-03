package com.Problem3;

/**
 * 给出一个二维数组和一个数，判断这个数组是否包含这个数。
 * Created by peng on 2017/1/27.
 */
public class FindNumber {

    public static Boolean find(int[][] arr,int num2find){
        Boolean flag = false;
        if(arr != null){
                int rows = arr[0].length ;
                int columns = arr.length ;
                int row = 0;
                int column = columns - 1;

                while(row < rows && column > 0){
                    if(arr[row][column] == num2find){
                        flag = true;
                        return flag;
                    }else if(arr[row][column] > num2find){
                        -- column;
                    }else{
                        ++ row;
                    }
                }

        }else{
            System.out.println("Input Array shouldn't be null");
        }

        return flag;
    }
}
