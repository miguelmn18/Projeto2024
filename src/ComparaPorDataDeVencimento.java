import java.time.LocalDate;
import java.util.Comparator;
import java.util.Date;

public class ComparaPorDataDeVencimento implements Comparator<Tarefas> {
    public int compare(Tarefas o1, Tarefas o2) {

        LocalDate dataDeHoje = LocalDate.now();

        boolean o1Vencido = o1.getData().isBefore(dataDeHoje);

    }
}
