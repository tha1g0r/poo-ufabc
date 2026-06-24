package herancapolimorfismo.listatarefas;

public class ListaTarefasInvertida extends ListaTarefas {
    @Override
    public boolean adicionarTarefa(Tarefa novaTarefa) {
        if (super.qtdTarefas >= super.tarefas.length)
			return false;
			
		for (int i = super.tarefas.length - 1; i > 0; i--) {
		    super.tarefas[i] = super.tarefas[i - 1];
		}
		super.tarefas[0] = novaTarefa;
		super.qtdTarefas++;
		return true;
    }

    public void listarTarefasPorTipo(int tipo) {
        for (int i = 0; i < super.qtdTarefas; i++) {
            if (super.tarefas[i].getTipo() == tipo) {
                super.imprimirItem(super.tarefas[i]);
            }
        }
    }
}
