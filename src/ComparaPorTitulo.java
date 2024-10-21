import java.util.Comparator;

public class ComparaPorTitulo implements Comparator<Tarefas> {

    @Override
    public int compare(Tarefas o1, Tarefas o2) {
        return o1.getTitulo().compareTo(o2.getTitulo());
    }
}
