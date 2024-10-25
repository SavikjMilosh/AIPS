//Задача 1. Просек на низа
//        За дадена низа од N (1<=N<=50) природни броеви, да се наjде броjот коj е наjблиску до нивниот просек. Ако постоjат два броjа со исто растоjание до просекот,
//        да се врати помалиот од нив. Во низата може да има дупликати.
//        22
//        Податочни структури
//        На пример за низата 1, 2, 3, 4, 5 просекот е (1 + 2 + 3 + 4 + 5) / 5 = 15 / 5
//        = 3, што значи дека броjот коj треба да се врати и е наjблиску до просекот е 3.
//        За низата 1, 2, 3, 4, 5, 6 просекот е 3.5 и двата броjа 3 и 4 се на исто растоjание
//        од просекот. Точната вредност коjа треба да се врати е помалиот од нив, а тоа е
//        3.
//        Првиот броj од влезот е броjот на елементи во низата N, а потоа во секоj ред
//        се дадени броевите.
//







import java.util.Scanner;
public class zad1 {

    public static int brojDoProsek(Array<Integer> arr){
        int sum=0,index=0;
        for(int i=0;i<arr.getSize();i++){
            sum+=arr.get(i);
        }
        int avg=sum/arr.getSize();
        int minDifirence=Math.abs(arr.get(0)-avg); // pocetnata najmala ralzlika na prviot element
        for(int i=1;i<arr.getSize();i++){
            if(Math.abs(arr.get(i)-avg)<minDifirence){ // proverka na site elemnti pocnuvajchi od 2 element
                minDifirence=Math.abs(arr.get(i)-avg);
                index=i;
            }
            if(Math.abs(arr.get(i)-avg)==minDifirence){
                if(arr.get(i)<arr.get(index)){
                    index=i;
                }
            }
        }
        return arr.get(index);
    }


    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int n=in.nextInt();
        Array<Integer> arr= new Array<Integer>(n);
        for(int i=0;i<n;i++){
            arr.insertLast(in.nextInt());
        }
        System.out.println(brojDoProsek(arr));
    }
}
