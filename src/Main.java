import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Tarefa> listaDeTarefas = new ArrayList<>();
        Fachada fachada = new Fachada();
        Scanner sc = new Scanner(System.in);
        int opcaoEscolhida = escolheOTipoDeServico(sc);
        switch (opcaoEscolhida){

            case 1:
                System.out.println("Informe o id em que você irá deixar a sua tarefa:  ");
                int idDATarefa = sc.nextInt();
                System.out.println("Informe o titulo da sua tarefa: ");
                String tituloDaTarefa = sc.nextLine();
                System.out.println("Informe a descricao da sua tarefa: ");
                String descricaoDaTarefa = sc.nextLine();
                System.out.println("");
                System.out.println("Informe o nível de prioridade da sua tarefa: ");
                System.out.println("1-Importante e urgente");
                System.out.println("2-Urgente, mas não importante");
                System.out.println("3-Não importante e não urgente");
                System.out.println("4-Importante não urgente");
                int prioridadeDaAtividade = sc.nextInt();
                Tarefa criaTarefa = new Tarefa(idDATarefa,tituloDaTarefa,descricaoDaTarefa,new Date(),prioridadeDaAtividade);
                listaDeTarefas.add(criaTarefa);
                break;
            case 2:

                System.out.println("A partir de qual forma você deseja que a listagem de tarefas ocorra? ");
                System.out.println("1-Pela data de criação ");
                System.out.println("2-Pelo título ");
                System.out.println("3-Pela data de vencimento");
                int opcaoEscolhido = sc .nextInt();
                switch (opcaoEscolhido){
                    case 1:
                        listaDeTarefas = new Fachada().criaServicoDeListagemPorData();
                        break;
                    case 2:

                        break;
                    case 3:

                        break;

                }
                break;

            case 3:

                System.out.println("A partir de qual requistitos abaixo você deseja que ordenemos a sua lista de tarefas? ");
                System.out.println("1-Por titulo");
                System.out.println("2-Por data de criação");
                int opcaoEscolhida2 = sc.nextInt();
                switch (opcaoEscolhida2){
                    case 1:
                            break;
                    case 2:
                        break;
                }

            case 4:
                break;

            case 5:
                break;

            case 6:
                break;

            case 0:
                break;


        }


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