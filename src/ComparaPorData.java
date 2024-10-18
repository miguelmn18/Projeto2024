import java.util.Comparator;

public class ComparaPorData implements Comparator<Tarefas> {
    @Override
    public int compare(Tarefas o1, Tarefas o2) {
        return o1.getData().compareTo(o2.getData());
    }
}
