
import java.util.ArrayList;
import java.util.List;

public class Fachada  {

    List<Tarefa> GerenciadorDeTarefas = new ArrayList<>();

    public String criaServicoDeListagemPorDataDeVencimento(){
        // atualiza o codigo para rodar certinho gi(quase certo)
        GerenciadorDeTarefas gerenciador = new GerenciadorDeTarefas();
        String criaServico = gerenciador .listagemDeTarefasComFiltroPorDataDeVencimento().toString();
        return criaServico;

    }

    public String criaServicoDeListagemDeTarefasPorTitulo(){
        // modificado
        GerenciadorDeTarefas gerenciador = new GerenciadorDeTarefas();
        String criaServico = gerenciador.listagemDeTarefasComFiltroPorTitulo().toString();
        return criaServico;

    }

    public String criaServicoDeAtualizarTarefaPorDescricao(String descricao){
        GerenciadorDeTarefas = new GerenciadorDeTarefas().atualizaTarefaPorDescricao(descricao);
        String criaServico = GerenciadorDeTarefas.toString();
        return criaServico;
    }

    public String criaServicoDeAtualizarTarefaPorTitulo (String titulo){
        GerenciadorDeTarefas = new GerenciadorDeTarefas().atualizaTarefaPorTitulo(titulo);
        String criaServico = GerenciadorDeTarefas.toString();
        return criaServico;
    }


    public String criaServicoDeExibirLista(int id) {
        GerenciadorDeTarefas gerenciador = new GerenciadorDeTarefas();
        Tarefa tarefa = gerenciador.exibicaoDeTarefa(id);
        if (tarefa == null) {
            return "Tarefa não encontrada.";
        }
        return tarefa.toString();
        //modificado para poder funcionar//

    }

    public String criaServicoDeInformarSeATarefaEstaPendente (int id){
        // precisa concertar(Modificado)
        GerenciadorDeTarefas gerenciador = new GerenciadorDeTarefas();
        String tarefaEstaPendente = gerenciador .informaSeATarefaEstaPendente(id);
        String criaServico = GerenciadorDeTarefas.toString();
        return criaServico;
    }

    public String criaServicoDeExclusaoDeTarefa (int id){
        GerenciadorDeTarefas = new GerenciadorDeTarefas().exclusaoDeTarefa(id);
        String criaServico = GerenciadorDeTarefas.toString();
        return criaServico;

    }

    public Tarefa criaServicoDeListagemPorData(){
        GerenciadorDeTarefas = new GerenciadorDeTarefas().listagemDeTarefaPorData();
        return (Tarefa) GerenciadorDeTarefas;

    }

    public String criaServicoDeListagemPorTitulo (){
        GerenciadorDeTarefas = new GerenciadorDeTarefas().listagemDeTarefaPorTitulo();
        String criaServico = GerenciadorDeTarefas.toString();
        return criaServico;

    }

    public Object criaS1ervicoDeListagemPorData() {
        Object o = null;
        return o;
        //adicionado//
    }

    public Object criaListagemPorTitulo() {
        return null;
    }

    public Object criaListagemPorDataDeDeCriacao() {
        return null;
    }

    public Object criaListagemPorDataDeVencimento() {
        return null;
    }

    public Object criaListagemPorAtualizacaoDeTarefas() {
        return null;
    }

    public Object criaListagemPorExibicaoDeTarefas() {
        return null;
    }

    public Object criaListagemPorExclusaoDeTarefas() {
        return null;
    }
}
