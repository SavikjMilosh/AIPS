//Дадена е линеарно поврзана листа. Да се напише функција која во листата ќе го
//        пронајде последниот јазол со информација x и ќе го префрли на крајот на листата. Како
//        резултат функцијата да ја враќа позицијата (броено од почетокот на листата) на која
//        бил пронајден бараниот јазол или -1 ако таков јазол не бил пронајден во листата.
//        Пр. →3→4→7→6→4→7→3→2; x=7
//        →3→4→7→6→4→3→2→7; позиција 6





import java.util.Scanner;

public class zad4 {
    public static int zadaca(SLL<Integer> sll,int x){
        SLLNode<Integer> find=sll.find(x);
        if(find!=null){
            SLLNode<Integer> tmp=sll.getFirst();
            SLLNode<Integer> pom=null;
            int brojac=1,pombrojac=1;
            while(tmp!=null){
                if(tmp.element==x){
                    pom=tmp;
                    pombrojac=brojac;
                }
                tmp=tmp.succ;
                brojac++;
            }
            sll.delete(pom);
            sll.insertLast(pom.element);
            return pombrojac;
        }
        return -1;
    }




    public static void main(String[] args) {
        SLL<Integer> sll=new SLL<Integer>();
        Scanner in= new Scanner(System.in);
        String line=in.nextLine();
        String [] pom = line.split(" ");
        for(int i=0;i<pom.length;i++){
            sll.insertLast(Integer.parseInt(pom[i]));
        }


        int x=in.nextInt();
        int pozicija=zadaca(sll,x);
        System.out.println(sll);
        System.out.println(pozicija);
    }
}
