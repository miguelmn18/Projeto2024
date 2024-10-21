public enum PrioridadeDasTarefas {
    IMPORTANTE_E_URGENTE(1), URGENTE_NAO_IMPORTANTE(2), NAO_IMPORTANTE_NEM_URGENTE(3),IMPORTANTE_NAO_URGENTE(4);

    private final int prioridadeDaTarefa;

    PrioridadeDasTarefas(int prioridadeDaTarefa) {
        this.prioridadeDaTarefa = prioridadeDaTarefa;
    }

    public int getPrioridadeDaTarefa() {
        return prioridadeDaTarefa;
    }


}
