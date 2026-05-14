package Controle_estoque;

import java.util.Locale;
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {


               Locale.setDefault(Locale.US);
               Scanner sc = new Scanner(System.in);

               Produto p = new Produto();

               System.out.println("Digite os dados do produto: ");
               System.out.print("Nome: ");
               p.nome = sc.nextLine();

               System.out.print("Preço: ");
               p.preco = sc.nextDouble();

               System.out.print("Quantidade em estoque: ");
               p.quantidade = sc.nextInt();

               System.out.println("\nDados do produto : " + p);


               System.out.print("Digite o número de produtos para adicionar ao estoque: ");
               int quantidadeAdicionar = sc.nextInt();
               p.adicionarProdutos(quantidadeAdicionar);

               System.out.println("Dados atualizados: " + p);

               System.out.print("Digite o número de produtos para remover do estoque: ");
               int quantidadeRemoveer = sc.nextInt();
               p.removeerProdutos(quantidadeRemoveer);


               System.out.println("Dados atualizados: " + p);


               sc.close();
           }
       }


