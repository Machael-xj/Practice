package com.problem4;

/**
 * Created by peng on 2017/1/28.
 */
public class ReplaceSpace {
    public static String replaceSpace(String input){
        StringBuffer buffer = new StringBuffer();
        for(int i = 0;i<input.length();i++){

            if(input.charAt(i) == ' '){
                buffer.append("%23");
            }else{
                buffer.append(input.charAt(i));
            }
        }

        return new String(buffer.toString());
    }
}
