package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(question(6,24));
        System.out.println(question(3,10));
        System.out.println(question(9,81));

    }

//TODO:Find the sum of all numbers in range from 1 to m(both inclusive) that are not divisible by n. Return difference between sum of integers not divisible by n with sum of numbers divisible by n.
//     n>0 and m>0

    public static int question(int n, int m){

        int isDivisibile = 0;
        int notDivisible = 0;
        if (n>0&&m>0){
            for(int i=1;i<=m;i++){
                if(i%n==0){
                    isDivisibile+=i;
                }else{
                    notDivisible+=i;
                }
            }
        }
        return notDivisible - isDivisibile;

    }



}
