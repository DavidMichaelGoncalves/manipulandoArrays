package Arrays;

import javax.sound.midi.Soundbank;
import java.util.Arrays;
import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int continuar = 6;

        Produto produto1 = new Produto("Sabonte", 2.00, 1);
        Produto produto2 = new Produto("Desodorante", 15.30, 2);
        Produto produto3 = new Produto("Arroz", 21.89, 3);
        Produto produto4 = new Produto("Fio Dental", 2.99, 4);
        Produto produto5 = new Produto("Pasta de dente", 2.99, 5);

        Produto[] produtos = {produto1, produto2, produto3, produto4, produto5};

        for (int i = 0; i <= 4; i++) {
            System.out.println("Codigo do produto: " + produtos[i].getCod() + " Descrição do produto: "
                    + produtos[i].getNome() + " R$ " + produtos[i].getPreco());
        }
        do {

            System.out.print("Digite o codigo do produto: ");

            int codigo = scanner.nextInt();

            for (int i = 0; i <= 4; i++) {
                if (produtos[i].getCod() == codigo) {
                    // print do COD do produto
                    System.out.println("Descrição: " + produtos[i].getNome() +
                            "\nPreço: " + produtos[i].getPreco());


                    System.out.println("Quantidade de produto; ");
                    int lerQuantidade = scanner.nextInt();


                //nota fiscal

                System.out.printf("\n" + "---lista de produtos--- " + "\n");

                System.out.printf((lerQuantidade) +
                        "x " + produtos[i].getNome()
                        + " " + "SubTotal: " + "%.2f", produtos[i].getPreco() * lerQuantidade);

                    System.out.println( "\n" + "quer continuar; ");
                    continuar = scanner.nextInt();

                break;
                }
         }
        }while (continuar == 6) ;

        /*
                System.out.printf("\n" + "---lista de produtos--- " + "\n");

                System.out.printf((lerQuantidade) +
                        "x " + produtos[i].getNome()
                        + " " + "SubTotal: " + "%.2f", produtos[i].getPreco() * lerQuantidade);

                break; */

        /*
        System.out.println("Quantidade de produto; ");
        int lerQuantidade = scanner.nextInt();

        for (int i = 0; i < lerQuantidade ; i++ ){
            System.out.println("Digite o codigo do produto: ");
            int lerCod = scanner.nextInt();
            System.out.println(" codigo: " + lerCod);

            if (lerCod == 1) {

                System.out.println("Descrição: " + produto1.getNome());
                System.out.println("Preço: " + produto1.getPreco());
            }
            if (scanner.nextInt() == 2) {

                System.out.println("Descrição: " + produto2.getNome());
                System.out.println("Preço: " + produto2.getPreco());
            }
            if (lerCod == 3) {

                System.out.println("Descrição: " + produto3.getNome());
                System.out.println("Preço: " + produto3.getPreco());
            }
            if (lerCod == 4) {

                System.out.println("Descrição: " + produto4.getNome());
                System.out.println("Preço: " + produto4.getPreco());
            } if (lerCod == 5) {

                System.out.println("Descrição: " + produto5.getNome());
                System.out.println("Preço: " + produto5.getPreco());
               // for (int y = 0; y < lerQuantidade ; y++ ) {
                 //   System.out.println("Total " + (lerQuantidade * produto5.getPreco()));
            }
        }*/
    }
}
