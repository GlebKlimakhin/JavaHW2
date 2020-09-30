package HomeTask1;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        oppositeValue();
        fillTheArray();
        Multiplication();
        diagonal();
        findMinAndMax();
        int [] Arr = new int[]{1,2,3};
        System.out.println(isSumEqual(Arr));
        System.out.println("Введите индекс смещения массива(отрицательный или полжительный)");
        Scanner in=new Scanner(System.in);
        int plusPos=in.nextInt();
        in.close();
        changePos(Arr,plusPos);

    }
    //Задание 1.
        static void oppositeValue()
         {
             System.out.println(taskNumber(1));
             int[] Arr = new int[]{0,0,1,0,1,1,1,0,0,1};
             for(int i=0;i<Arr.length;i++)
             {
                if(Arr[i]==0)
                {
                    Arr[i]=1;
                }
                else
                {
                    Arr[i]=0;
                }
            }
            printArray(Arr);
         }
         //Задание 2.
         static void fillTheArray()
                {
                    System.out.println(taskNumber(2));
                    int[] Arr = new int[8];
                    for(int i=0;i<Arr.length;i++)
                        {
                            Arr[i]=i*3;
                        }
                    printArray(Arr);
                }
                    //Задание 3.

                    static void Multiplication()
                        {
                            System.out.println(taskNumber(3));
                            int[] Arr = new int[]{1,5,3,2,11,4,5,2,4,8,9,1};
                            for(int i=0;i< Arr.length;i++)
                                {
                                    if(Arr[i]<6)
                                        {
                                            Arr[i]*=2;

                                        }
                                }
                            printArray(Arr);
                        }
                            //Задание 4.
                        static void diagonal()
                            {
                                System.out.println(taskNumber(4));
                            int[][] SqareArray = new int[5][5];
                            for(int i=0;i< SqareArray.length;i++)
                                {
                                    for(int j=0;j< SqareArray.length;j++)
                                        {
                                            if(i==j)
                                            {
                                                SqareArray[i][j] = 1;
                                            }
                                            System.out.print(SqareArray[i][j]);
                                        }
                                    System.out.println();

                                }


        }
                            //Задание 5
                            static void findMinAndMax()
                                {
                                    System.out.println(taskNumber(5));
                                    int [] Arr = new int[]{1,15,25,7,-130,2,-1,-99,12};
                                    int Max = Arr[0];
                                    int Min = Arr[0];
                                    for(int i=1;i< Arr.length;i++)
                                        {
                                            if(Arr[i] > Max)
                                                {
                                                    Max = Arr[i];
                                                }
                                            if(Arr[i] < Min)
                                                {
                                                    Min=Arr[i];
                                                }

                                        }
                                    System.out.println("Максимум = " + Max);
                                    System.out.println("Минимум = " + Min);
                                }
                                    //Задание 6
                                    static boolean isSumEqual( int[] Array)
                                    {
                                        System.out.println(taskNumber(6));
                                        int Length=Array.length;
                                        int Sum1=0;
                                        int Sum2=0;
                                        for(int i=0; i<Length-1;i++)
                                            {
                                                Sum1+=Array[i];
                                                for(int j=i+1;j<Length;j++)
                                                {
                                                    Sum2+=Array[j];

                                                }
                                                if(Sum1==Sum2)
                                                {
                                                    return true;

                                                }
                                                Sum2=0;

                                            }
                                        return false;
                                    }
                                    //Задание 7
                                        static void changePos(int[] Arr, int n)
                                        {
                                            System.out.println(taskNumber(7));
                                            if(n>0)
                                                plusPos(Arr,n);
                                            else
                                                minusPos(Arr,n);
                                            printArray(Arr);
                                        }
                                        //123
                                                static void plusPos(int [] Arr,int n)
                                                {
                                                    int lastElement;
                                                    for(int plusPos=0;plusPos<n;plusPos++){
                                                        lastElement=Arr[Arr.length-1];
                                                        for(int i=Arr.length-1;i>0;i--) {
                                                            Arr[i]=Arr[i-1];
                                                        }
                                                        Arr[0]=lastElement;
                                                }
                                                }
                                                    static void minusPos(int [] Arr, int n)
                                                    {
                                                        int firstElement;
                                                        for(int mPos=0; mPos>n;mPos--) {
                                                            firstElement=Arr[0];
                                                            for(int i=0;i<Arr.length-1;i++) {
                                                                Arr[i]=Arr[i+1];
                                                            }
                                                            Arr[Arr.length-1]=firstElement;
                                                        }
                                                    }
                                                    static void printArray(int[] Array)
                                                    {
                                                        for(int i=0; i< Array.length;i++)
                                                        {
                                                            System.out.print(Array[i]+" ");
                                                        }
                                                        System.out.println();
                                                    }
                                                        static String taskNumber(int num)
                                                        {
                                                           return "Задание "+num;
                                                        }
                                                    }





