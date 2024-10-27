//Дадена е линеарно поврзана листа. Да се напише функција која ќе ги избрише сите
//повеќекратни елементи од листата (при секоја појава на два соседни елементи со иста
//        информација едниот треба да се избрише). Како резултат функцијата да врати колку
//јазли биле избришани.
//        Пр. →3→4→4→7→6→4→4→4→7→3→2;
//        →3→4→7→6→4→7→3→2; избришани 3 јазли
//


import java.util.Scanner;

public class zad10 {

    public static int zadaca(SLL<Integer> sll ){
        SLLNode<Integer> tmp=sll.getFirst();
        int brojac=0;
        while(tmp!=null && tmp.succ!=null){

            if(tmp.element==tmp.succ.element){
                sll.delete(tmp);
                brojac++;
            }
            tmp=tmp.succ;
        }
        return brojac;
    }

    public static void main(String[] args) {
        SLL<Integer> sll=new SLL<Integer>();
        Scanner in = new Scanner(System.in);
        String line=in.nextLine();
        String [] pom = line.split(" ");

        for(int i=0;i<pom.length;i++){
            sll.insertLast(Integer.parseInt(pom[i]));
        }
        int pozicija=zadaca(sll);
        System.out.println(sll);
        System.out.println(pozicija);


    }
}
