package Sistema_compra_online;

public class Sistema {

        public double valorCompra;
        public double frete;
        public double valorFinal;

        public void calcularFrete() {

            if (valorCompra > 500.0) {
                frete = 0.0;
                System.out.println("Frete gratis.");
            } else {
                frete = 25.0;
                System.out.println("Frete de R$ 25.00 adicionado.");
            }
        }

        public void calcularValorFinal() {

            valorFinal = valorCompra + frete;

            System.out.printf("Valor final: R$ %.2f%n", valorFinal);
        }

        public void finalizarCompra(String aprovacao) {

            if (aprovacao.equalsIgnoreCase("nao")) {

                System.out.println("Pagamento nao autorizado.");

            } else {

                int numeroPedido = 1001;

                System.out.println("Numero do pedido: " + numeroPedido);
                System.out.println("Compra registrada.");
                System.out.println("Confirmacao enviada.");
                System.out.println("Compra realizada com sucesso.");
            }
        }
    }
