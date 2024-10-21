import java.util.Comparator;

public class ComparaPorData implements Comparator<Tarefa> {
    @Override
    public int compare(Tarefa o1, Tarefa o2) {
        return o1.getData().compareTo(o2.getData());
    }
}
