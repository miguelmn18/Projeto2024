import java.time.LocalDate;
import java.util.Comparator;
import java.util.Date;

public class ComparaPorDataDeVencimento implements Comparator<Tarefas> {
    public int compare(Tarefas o1, Tarefas o2) {

        Date dataDeHoje = new Date();

        if(o1.getData().before(dataDeHoje)){
                return Integer.parseInt(o1.getData() + "Tarefa Pendente");

        } if(o2.getData().before(dataDeHoje)){
            return Integer.parseInt(o2.getData() + "Tarefa Pendente");

        } return 0;
    }
}
