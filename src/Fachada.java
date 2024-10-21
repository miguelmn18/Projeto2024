
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Fachada  {
    private GerenciadorDeTarefas gerenciaTarefas = new GerenciadorDeTarefas();
    List<Tarefa> listaDeTarefas = new ArrayList<>();

    public GerenciadorDeTarefas criaTarefa (String titulo, String descricao, Date data, int prioridade ){
        Tarefa tarefa = new Tarefa(titulo,descricao,new Date(),prioridade);
        listaDeTarefas.add(tarefa);
        return (GerenciadorDeTarefas) listaDeTarefas;
    }

    public GerenciadorDeTarefas criaListagemDeTarefas(int opcaoEscolhida){
        for(Tarefa tarefa : listaDeTarefas){
            listaDeTarefas = new GerenciadorDeTarefas().listagemDeTarefas(opcaoEscolhida);
            return (GerenciadorDeTarefas) listaDeTarefas;
        } return null;

    }

    public GerenciadorDeTarefas criaListagemDeTarefasComFiltro (int opcaoEscolhida){
        for(Tarefa tarefa2 : listaDeTarefas){
            listaDeTarefas = new GerenciadorDeTarefas().listagemDeTarefasComFiltro(opcaoEscolhida);
            return (GerenciadorDeTarefas) listaDeTarefas;
        }

    }

    public GerenciadorDeTarefas criaAtualizacaoDeTarefa(int opcaoEscolhida){
        listaDeTarefas = new GerenciadorDeTarefas().atualizarTarefa(opcaoEscolhida);
        return (GerenciadorDeTarefas) listaDeTarefas;
    }

    public GerenciadorDeTarefas criaExibicaoDeTarefa(int identificaTarefa){
        // precisa rever os metodos na classe Gerenciador
        new GerenciadorDeTarefas().exibicaoDeTarefa(identificaTarefa);
        return (GerenciadorDeTarefas) listaDeTarefas;

    }

    public GerenciadorDeTarefas criaExclusaoDeTarefa(int opcaoEscolhida){
        listaDeTarefas = new GerenciadorDeTarefas().exclusaoDeTarefa(opcaoEscolhida);
        return (GerenciadorDeTarefas) listaDeTarefas;

    }

    public List<String> listaDeTarefasPorData (){
        return gerenciaTarefas.listagemDeTarefaPorData();
    }

}
