import java.util.Scanner;

public class exercicio04 {
    public static void main (String [] args) {
        float nota1, nota2, nota3, nota4, media;
        Scanner ler = new Scanner (System.in);
        System.out.println("Entre com as 4 notas bimestrais");
        nota1 = ler.nextFloat();
        nota2 = ler.nextFloat();
        nota3 = ler.nextFloat();
        nota4 = ler.nextFloat();
        media = (nota1+nota2+nota3+nota4)/4;
        System.out.println("Valor da media e " + media);

    }
    
}
