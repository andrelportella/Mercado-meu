
package caixasupermercado;

import java.util.Scanner;


public class CaixaSupermercado {

    public static void main(String[] args) {
       
        Scanner in = new Scanner(System.in);
        int opcao;
        Registradora r1 = new Registradora();
          
        System.out.println("Seja bem vindo!");
                
        while(true){
          System.out.println("\nDigite a opção desejada para executar uma ação:");  
          System.out.println("(1)Iniciar nova venda.");
          System.out.println("(2)Encerrar");
          switch(in.nextInt()){
              case 1:
                  r1.iniciarVenda();
                  do{
                    System.out.println("\n(2)Incluir um novo item");
                    System.out.println("(3)Concluir venda");
                    opcao = in.nextInt();
                    if(opcao == 2){

                        System.out.println("\n1- Banana");
                        System.out.println("2- Pera");
                        System.out.println("3- Uva\n");

                        System.out.println("Digite o Id do item: ");
                        int id = in.nextInt();
                        System.out.println("Digite a quantidade: ");
                        int qtd = in.nextInt();
                        r1.incluirItem(id, qtd);
                        System.out.println(" ");
                    }else if(opcao == 3){
                        float pagamento;
                        System.out.println("O total é:" + r1.concluirVenda());
                        System.out.println("\nDigite o valor pago: ");
                        pagamento = in.nextFloat();
                        r1.pagamento(pagamento);
                        System.out.println("O troco é: " + r1.getTroco());
                        System.out.println("Venda concluida!");
                        System.out.println("\n------------------------------------------");
                        break;
                    }else{
                        System.out.println("Opção inválida,tente novamente.");
                    }
            }while(true);
             break;
        case 2:
            System.out.println("Sistema encerrado.");
            System.exit(0);
        default:
            System.out.println("Opção inválida,tente novamente.");
            break;
          }
        }        
    }
}

