package Sistema_compra_online;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

                Locale.setDefault(Locale.US);
                Scanner sc = new Scanner(System.in);

                Sistema sistema = new Sistema();
                Usuario usuario = new Usuario();

                System.out.println("=== SISTEMA DE COMPRA ONLINE ===");

                System.out.print("Digite o valor da compra: R$ ");
                sistema.valorCompra = sc.nextDouble();
                sc.nextLine();

                System.out.print("Nome: ");
                usuario.nome = sc.nextLine();

                System.out.print("CPF: ");
                usuario.cpf = sc.nextLine();

                System.out.print("Endereco: ");
                usuario.endereco = sc.nextLine();

                System.out.print("Forma de pagamento: ");
                usuario.formaPagamento = sc.nextLine();

                usuario.exibirDados();

                sistema.calcularFrete();

                sistema.calcularValorFinal();

                System.out.print("Pagamento aprovado? (sim/nao): ");
                String aprovacao = sc.nextLine();

                sistema.finalizarCompra(aprovacao);

                sc.close();
            }
        }

