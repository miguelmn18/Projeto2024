import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

class TarefaTest {
private Tarefa tarefa;

    public void setUp(){
        tarefa = new Tarefa(1,"Estudar","Para prova de matemática",1);
    }

    @org.junit.jupiter.api.Test
    void getTitulo() {
        assertEquals("Estudar",tarefa.getTitulo());
    }

    @org.junit.jupiter.api.Test
    void setTitulo() {
        tarefa.setTitulo("Trabalhar");
        assertEquals("Trabalhar",tarefa.getTitulo());

    }


    @org.junit.jupiter.api.Test
    void getDescricao() {
        assertEquals("Estudar para matemática",tarefa.getDescricao());

    }

    @org.junit.jupiter.api.Test
    void setDescricao() {
        tarefa.setDescricao("Não vou estudar para matemática");
        assertEquals("Não vou estudar para matemática",tarefa.getDescricao());
    }

    @org.junit.jupiter.api.Test
    void getPrioridadeTarefa() {
        assertEquals(1,tarefa.getPrioridadeTarefa());
    }

    @org.junit.jupiter.api.Test
    void setPrioridadeTarefa() {
        tarefa.setPrioridadeTarefa(2);
        assertEquals(2,tarefa.getPrioridadeTarefa());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TarefaTest that = (TarefaTest) o;
        return Objects.equals(tarefa, that.tarefa);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(tarefa);
    }

    @Override
    public String toString() {
        return "TarefaTest{" +
                "tarefa=" + tarefa +
                '}';
    }
}