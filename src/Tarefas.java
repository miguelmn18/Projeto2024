import java.util.Date;
import java.util.Objects;

public class Tarefas {
    String titulo;
    String descricao;
    Date data;
    int prioridadeTarefa;

    public Tarefas(String titulo, String descricao, Date data, int prioridadeTarefa) {
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
    public String toString() {
        return "Tarefas{" +
                "titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", data=" + data +
                ", prioridadeTarefa=" + prioridadeTarefa +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tarefas tarefas = (Tarefas) o;
        return prioridadeTarefa == tarefas.prioridadeTarefa && Objects.equals(titulo, tarefas.titulo) && Objects.equals(descricao, tarefas.descricao) && Objects.equals(data, tarefas.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, descricao, data, prioridadeTarefa);
    }
}
