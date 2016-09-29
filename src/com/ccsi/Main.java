package com.ccsi;

public class Main {

    public static void main(String[] args) {
	    int x=0;
        System.out.println(reverse(x));
    }
    //Reverse digits of an integer
    public static int reverse(int x){
        int sign=1;
        long res=0;
        if(x<0)sign=-1;

        x=Math.abs(x);
        while (x!=0){
            res=res*10+x%10;
            x/=10;
        }

        if(res>Integer.MAX_VALUE)return 0;//反转之后有可能超出阈值
        
        return (int)res*sign;
    }
}
