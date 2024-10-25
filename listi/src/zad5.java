//Дадена е линеарно поврзана листа. Да се напише функција која од листата ќе ги
//избрише сите елементи кои во info полето имаат парен број. Како резултат функцијата
//да враќа колку јазли биле избришани.
//Пр. →4→3→7→6→4→7→3→2;
//        →3→7→3→7; избришани 4 јазли
//


import java.util.Scanner;

public class zad5 {

    public static int zadaca(SLL<Integer> sll){
        SLLNode<Integer> tmp=sll.getFirst();
        SLLNode<Integer> pom=null;
        int brojac=0;
        while(tmp!=null){
            if(tmp.element%2==0){
                pom=tmp;
                brojac++;
                sll.delete(pom);
            }
            tmp=tmp.succ;

        }
        return brojac;
    }

    public static void main(String[] args) {
        SLL<Integer> sll =new SLL<Integer>();
        Scanner in = new Scanner(System.in);
        String line=in.nextLine();
        String [] pom=line.split(" ");

        for(int i=0;i<pom.length;i++){
            sll.insertLast(Integer.parseInt(pom[i]));
        }
        int pozicija=zadaca(sll);
        System.out.println(sll);
        System.out.println(pozicija);

    }
}
