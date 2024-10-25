import java.util.*;

public class zad1{
    public static void main(String[] args) {
        //BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        //int n=Integer.parseInt(br.readLine()); //5
        //String line=br.readLine(); // "1  2  3  4  5 "
        SLL<Integer> lista=new SLL<Integer>();
        Scanner scanner=new Scanner(System.in);
        String line=scanner.nextLine(); //3 4 7 6 4 7 3 2
        String []pom=line.split(" ");
        for(int i=0;i<pom.length;i++) {
            lista.insertLast(Integer.parseInt(pom[i]));
        }
        //int x=Integer.parseInt(scanner.nextLine());//"7"
        int x=scanner.nextInt();
        //System.out.println(lista);
        //System.out.println(x);

        int pozicija=zadaca(lista,x);
        System.out.println(lista);
        System.out.println(pozicija);
    }

    private static int zadaca(SLL<Integer> lista, int x) {
        SLLNode<Integer> find=lista.find(x);

        if(find!=null) {
            SLLNode<Integer> tmp=lista.getFirst();
            int pozicija=1;
            while(tmp!=null && tmp.element != x) { // ako go najde elementot primer 7!= 7 che dade false i che izleze od while ciklusot
                tmp=tmp.succ;
                pozicija++;
            }
            lista.delete(tmp);
            lista.insertFirst(tmp.element);
            return pozicija;
        }
        return -1;
    }
}