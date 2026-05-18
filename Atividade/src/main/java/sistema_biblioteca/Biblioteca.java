package sistema_biblioteca;

import java.util.Scanner;

public class Biblioteca {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

         Aluno aluno = new Aluno();

         aluno.nome = "Gabriel";
         aluno.matricula = 1234;
         aluno.possuiMulta = false;
         aluno.livrosEmprestados = 2;

         Livro livro = new Livro();

         livro.titulo = "Pequeno principe";
         livro.codigo = 100;
         livro.disponivel = true;
         livro.estoque = 1;

         System.out.print("Digite sua matrícula: ");
         int matriculaDigitada = sc.nextInt();

         if (matriculaDigitada != aluno.matricula) {

             System.out.println("Aluno não encontrado.");

         } else {


             if (aluno.possuiMulta) {

                 System.out.println("Empréstimo bloqueado por multa.");

             }


             else if (aluno.livrosEmprestados >= 3) {

                 System.out.println("Limite de empréstimos atingido.");

             }

             else {

                 System.out.print("Digite o código do livro: ");
                 int codigoDigitado = sc.nextInt();


                 if (codigoDigitado != livro.codigo || !livro.disponivel) {

                     System.out.println("Livro indisponível.");

                 } else {


                     aluno.livrosEmprestados++;


                     livro.estoque--;


                     if (livro.estoque == 0) {

                         livro.disponivel = false;
                     }

                     System.out.println("Empréstimo realizado com sucesso.");
                 }
             }
         }

         sc.close();

    }

}
