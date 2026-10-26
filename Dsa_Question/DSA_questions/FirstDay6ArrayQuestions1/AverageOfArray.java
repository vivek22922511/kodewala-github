package com.practice.DSA_questions.FirstDay6ArrayQuestions1;

public class AverageOfArray {


     public static void main(String args[]){
        int []arr={2,3,1,6,5};
        System.out.println(getAverage(arr));
    }

    static double getAverage(int []arr)
    {
        double sum=0;
      for(int i:arr){
          sum=sum+i; //...sum+=i;
      }
      int size=arr.length;
      double avg=sum/size;
      return avg;
    }




}
