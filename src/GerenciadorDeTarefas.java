import java.util.*;

public class GerenciadorDeTarefas {



    public static Tarefas listagemDeTarefas(int recebeOpcaoEscolhida) {
        List<Tarefas> listaTarefas = new ArrayList<>();
      switch (recebeOpcaoEscolhida){
          case 1:
              Collections.sort(listaTarefas, new ComparaPorData());
          case 2:

          case 3:
      }
    }

    public List <Tarefas> listagemDeTarefasComFiltro(){

    }
    public Tarefas atualizarTarefa(String titulo, String descricao, String status){
        Tarefas tarefa;
        for(int i = 0 ; i < listaTarefas.size(); i++){
            if(listaTarefas.equals(tarefa)){


            }


        }
    }

    public Tarefas exibicaoDeTarefa(){

    }
    public Tarefas exclusaoDeTarefa(){

    }

}
