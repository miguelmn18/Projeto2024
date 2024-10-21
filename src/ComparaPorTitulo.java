import java.util.Comparator;

public class ComparaPorTitulo implements Comparator<Tarefa> {

    @Override
    public int compare(Tarefa o1, Tarefa o2) {
        return o1.getTitulo().compareTo(o2.getTitulo());
    }
}
