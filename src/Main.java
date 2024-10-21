import java.util.Collections;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Fachada fachada = new Fachada();
        Scanner sc = new Scanner(System.in);
        int opcaoEscolhida = escolheOTipoDeServico(sc);
        switch (opcaoEscolhida){

            case 1:

            case 2:

                System.out.println("A partir de qual forma você deseja que a listagem de tarefas ocorra? ");
                System.out.println("1-Pela data de criação ");
                System.out.println("2-Pelo título ");
                System.out.println("3-Pela data de vencimento");
                int opcaoEscolhido = sc .nextInt();


            case 3:

                System.out.println("A partir de qual requistitos abaixo você deseja que ordenemos a sua lista de tarefas? ");
                System.out.println("1-Por titulo");
                System.out.println("2-Por data de criação");
                int opcaoEscolhida2 = sc.nextInt();
                switch (opcaoEscolhida2){
                    case 1:

                    case 2:
                }

            case 4:

            case 5:

            case 6:

            case 0:


        }


    }

    public List<Tarefa> listagemDeTarefas( Fachada fachada,int recebeOpcaoEscolhida) {
        switch (recebeOpcaoEscolhida){
            //Criar um metodo pra cada case
            case 1:

                return fachada.listaDeTarefasPorData();

            case 2:
                Collections.sort(listaTarefas, new ComparaPorTitulo()  );
                return listaTarefas;

            case 3:
                Collections.sort(listaTarefas, new ComparaPorDataDeVencimento());
                return listaTarefas;
        } return null;
    }

    private static int escolheOTipoDeServico(Scanner sc) {
        System.out.println("Qual tipo de serviço você deseja realizar no sistema de tarefas? ");
        System.out.println("1- Criação de tarefas");
        System.out.println("2- Listagem de tarefas");
        System.out.println("3- Listagem de tarefas com filtros");
        System.out.println("4- Atualização de tarefas");
        System.out.println("5- Exibição de tarefas");
        System.out.println("6- Exclusão de tarefas");
        System.out.println("0- Para sair do sistema");
        int opcaoEscolhida = sc.nextInt();
        return opcaoEscolhida;
    }
}