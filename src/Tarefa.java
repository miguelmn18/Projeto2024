import java.util.Date;
import java.util.Objects;

public class Tarefa {
    String titulo;
    String descricao;
    Date data;
    int prioridadeTarefa;

    private int id;
    boolean removido = false;



    public Tarefa(int id,String titulo, String descricao, Date data, int prioridadeTarefa) {
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.data = data;
        this.prioridadeTarefa = prioridadeTarefa;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getData() {
        return data;
    }

    public boolean isRemovido() {
        return removido;
    }

    public void setRemovido(boolean removido) {
        this.removido = removido;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public int getPrioridadeTarefa() {
        return prioridadeTarefa;
    }

    public void setPrioridadeTarefa(int prioridadeTarefa) {
        this.prioridadeTarefa = prioridadeTarefa;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tarefa tarefa = (Tarefa) o;
        return prioridadeTarefa == tarefa.prioridadeTarefa && id == tarefa.id && removido == tarefa.removido && Objects.equals(titulo, tarefa.titulo) && Objects.equals(descricao, tarefa.descricao) && Objects.equals(data, tarefa.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, descricao, data, prioridadeTarefa, id, removido);
    }

    @Override
    public String toString() {
        return "Tarefa{" +
                "titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", data=" + data +
                ", prioridadeTarefa=" + prioridadeTarefa +
                ", id=" + id +
                ", removido=" + removido +
                '}';
    }
}
