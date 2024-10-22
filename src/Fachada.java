
import java.awt.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Fachada  {

    List<Tarefa> listaDeTarefas = new ArrayList<>();


    public String criaServicoDeListagemPorDataDeVencimento(){
        // atualiza o codigo para rodar certinho gi
        listaDeTarefas = new GerenciadorDeTarefas().listagemDeTarefasComFitroPorDataDeVencimento();
        String criaServico = listaDeTarefas.toString();
        return criaServico;

    }
    public String criaServicoDeListagemDeTarefasPorTitulo(){
        // atualiza o codigo pra rodar certinho
        listaDeTarefas = new GerenciadorDeTarefas().listagemDeTarefasComFiltroPorTitulo();
        String criaServico = listaDeTarefas.toString();
        return criaServico;

    }

    public String criaServicoDeAtualizarTarefaPorDescricao(String descricao){
        listaDeTarefas = new GerenciadorDeTarefas().atualizaTarefaPorDescricao(descricao);
        String criaServico = listaDeTarefas.toString();
        return criaServico;
    }

    public String criaServicoDeAtualizarTarefaPorTitulo (String titulo){
        listaDeTarefas = new GerenciadorDeTarefas().atualizaTarefaPorTitulo(titulo);
        String criaServico = listaDeTarefas.toString();
        return criaServico;
    }


    public String criaServicoDeExibirLista (int id){
        listaDeTarefas = new GerenciadorDeTarefas().exibicaoDeTarefa(id).;
        String criaServico = listaDeTarefas.toString();
        return criaServico;

    }

    public String criaServicoDeInformarSeATarefaEstaPendente (int id){
        // precisa concertar
        listaDeTarefas = new GerenciadorDeTarefas().informaSeATarefaEstaPendente(id);
        String criaServico = listaDeTarefas.toString();
        return criaServico;
    }


    public String criaServicoDeExclusaoDeTarefa (int id){
        listaDeTarefas = new GerenciadorDeTarefas().exclusaoDeTarefa(id);
        String criaServico = listaDeTarefas.toString();
        return criaServico;

    }
    public Tarefa criaServicoDeListagemPorData(){
        listaDeTarefas = new GerenciadorDeTarefas().listagemDeTarefaPorData();
        return (Tarefa) listaDeTarefas;

    }

    public String criaServicoDeListagemPorTitulo (){
        listaDeTarefas = new GerenciadorDeTarefas().listagemDeTarefaPorTitulo();
        String criaServico = listaDeTarefas.toString();
        return criaServico;

    }

    public String criaServicoDeListagemPorDataDeVencimento(){
        listaDeTarefas = new GerenciadorDeTarefas().listagemDeTarefaPorDataDeVencimento();
        String criaServico = listaDeTarefas.toString();
        return criaServico;

    }

}
