import java.util.*;

public class GerenciadorDeTarefas {

    private List<Tarefa> listaTarefas = new ArrayList<>();


    public Tarefa criaTarefa (int id, String titulo, String descricao, Date data, int prioridadeDaTarefa){
        Tarefa tarefa = new Tarefa(listaTarefas.size() ,titulo,descricao,data,prioridadeDaTarefa);
        listaTarefas.add(tarefa);
        return tarefa;

    }

    private List<Tarefa> tarefasNaoDeletadas(){
        List<Tarefa> tarefasNaoRemovidas = new ArrayList<>();
        for(Tarefa tarefa : listaTarefas){
            if(!tarefa.isRemovido()){
                tarefasNaoRemovidas.add(tarefa);
            }
        }
        return tarefasNaoRemovidas;
    }

    public List<Tarefa> listagemDeTarefaPorData(){
        List<Tarefa> tarefasNaoRemovidas = tarefasNaoDeletadas();
        Collections.sort(tarefasNaoRemovidas, new ComparaPorData());
        return tarefasNaoRemovidas;
    }


    public List<Tarefa> listagemDeTarefaPorTitulo(){
        List<Tarefa> tarefasNaoRemovidas = tarefasNaoDeletadas();
        Collections.sort(tarefasNaoRemovidas, new ComparaPorTitulo());
        return tarefasNaoRemovidas;
    }

    public List<Tarefa> listagemDeTarefaPorDataDeVencimento(){
        List<Tarefa> tarefasNaoRemovidas = tarefasNaoDeletadas();
        Collections.sort(tarefasNaoRemovidas, new ComparaPorDataDeVencimento());
        return tarefasNaoRemovidas;
    }

    //Cria uma lista de Sting, varre uma lista de tarefas com toString e adicionar na lista de String

    public List<String> exibiListaDeTarefas (List<Tarefa> lista){
       List<String> listaDeTarefasString = new ArrayList<>();
        for(Tarefa tarefa : lista){
            listaDeTarefasString.add(tarefa.toString());

        }
        return listaDeTarefasString;
    }

    public List <String> listagemDeTarefasComFiltroPorTitulo(){
        List<Tarefa> tarefasNaoRemovidas = tarefasNaoDeletadas();
        Collections.sort(tarefasNaoRemovidas, new ComparaPorTitulo());
        return exibiListaDeTarefas(tarefasNaoRemovidas);
    }

    public List <String> listagemDeTarefasComFiltroPorDataDeVencimento(){
        List <Tarefa> tarefasNaoRemovidas = tarefasNaoDeletadas();
        Collections.sort(tarefasNaoRemovidas, new ComparaPorDataDeVencimento());
        return exibiListaDeTarefas(tarefasNaoRemovidas);
    }


    public List <Tarefa> atualizaTarefaPorTitulo(String titulo){
        // metodo esta errado

        for(int i = 0; i < 10; i++){
            if(listaTarefas.size() == i){
                listaTarefas.get(i).setTitulo(titulo);
                return listaTarefas;


            }
        }
        return null;
    }

    public List<Tarefa> atualizaTarefaPorDescricao(String descricao){
        for(int i = 0; i < 10; i++){
            if(listaTarefas.size() == i){
                 listaTarefas.get(i).setDescricao(descricao);
                 return listaTarefas;
            }
        } return null;
    }

    // precisa criar um metodo pra informa se a tarefa esta pendente ou nao;

    public String informaSeATarefaEstaPendente(int escolha){
        // Criar uma lista de String
        List<String> listaDeTarefasPendentes = new ArrayList<>();
        //O usuario precisa informar se a atividade esta ou não pendente, preciso criar algo que faça sentido
        if(escolha >= 0 && escolha < listaTarefas.size()){
                Tarefa tarefaEscolhida = listaTarefas.get(escolha);
                String informa = "Pendente" + tarefaEscolhida.toString();
                return informa;


        }
        return null;
    }

    public Tarefa exibicaoDeTarefa(int identificaAtividade){
        List<Tarefa> listaDeTarefas = new ArrayList<>();
        return listaDeTarefas.get(identificaAtividade);



    }
    public List <Tarefa> exclusaoDeTarefa(int identificaTarefa){
        List<Tarefa> listaDeTarefas = new ArrayList<>();
        listaDeTarefas.remove(identificaTarefa);
        return listaDeTarefas;
    }

    @Override
    public String toString() {
        return "GerenciadorDeTarefas{" +
                "listaTarefas=" + listaTarefas +
                '}';
    }
}
