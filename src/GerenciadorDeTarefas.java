import java.util.*;

public class GerenciadorDeTarefas {



    public Tarefas criaTarefas (String titulo, String descricao, Date data, int prioridadeDaTarefa){
        Tarefas tarefa = new Tarefas(titulo,descricao,data,prioridadeDaTarefa);
        return tarefa;

    }

    public List <Tarefas> listagemDeTarefas(int recebeOpcaoEscolhida) {
        List<Tarefas> listaTarefas = new ArrayList<>();
      switch (recebeOpcaoEscolhida){
          case 1:
              Collections.sort(listaTarefas, new ComparaPorData());
              return listaTarefas;

          case 2:
              Collections.sort(listaTarefas, new ComparaPorTitulo()  );
              return listaTarefas;

          case 3:
              Collections.sort(listaTarefas, new ComparaPorDataDeVencimento());
              return listaTarefas;
      } return null;
    }

    public List <Tarefas> listagemDeTarefasComFiltro(int escolheOpcao){
        List<Tarefas> listaDeTarefas = new ArrayList<>();
        switch (escolheOpcao){
            case 1:
                Collections.sort(listaDeTarefas, new ComparaPorTitulo());
                return listaDeTarefas;

            case 2:
                Collections.sort(listaDeTarefas, new ComparaPorDataDeVencimento());
                return listaDeTarefas;
        }

    }
    public Tarefas atualizarTarefa(int opcaoEscolhida){
        Tarefas tarefa;
        switch (opcaoEscolhida){
            case 1:
                String titulo;
                return tarefa.setTitulo(titulo);

            case 2:
                String descricao;
                return tarefa.setDescricao(descricao);

            case 3:
                Date dataDeHoje = new Date();
                if (tarefa.getData().before(dataDeHoje)) {
                    String mensagem = "Pendente";


                }
        }
    }

    public String exibicaoDeTarefa(int identificaAtividade){
        List<Tarefas> listaDeTarefas = new ArrayList<>();
        String tarefaEncontrada = String.valueOf(listaDeTarefas.get(identificaAtividade));
        return tarefaEncontrada;


    }
    public List <Tarefas> exclusaoDeTarefa(int identificaTarefa){
        List<Tarefas> listaDeTarefas = new ArrayList<>();
        listaDeTarefas.remove(identificaTarefa);
        return listaDeTarefas;
    }


}
