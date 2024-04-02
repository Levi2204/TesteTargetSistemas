import java.util.ArrayList;
import java.util.Scanner;

public class QuestaoDois {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();
        System.out.print("Digite um número para saber se ele está na sequência de fibonacci: ");
        int num = sc.nextInt();
        int contador = 0;
        int termoUm = 1;
        int termoDois = 1;
        int termoUmAnt;

        while (contador <= num){

            lista.add(termoUm);
            termoUmAnt = termoUm;
            termoUm = termoUm + termoDois;
            termoDois = termoUmAnt;

            contador ++;
        }

        if(lista.contains(num)){
            System.out.printf("O número %d está na sequência de fibonacci%n", num);
        }else{
            System.out.printf("O número %d não está na sequência de fibonacci%n", num);
        }

        System.out.println("FIM");
    }
}
