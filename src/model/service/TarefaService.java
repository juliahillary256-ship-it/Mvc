
package model.service;

import model.entity.Tarefa;
import model.entity.StatusTarefa;
import java.util.ArrayList;
import java.util.List;

public class TarefaService {

    private List<Tarefa> tarefas = new ArrayList<>();
    private int proximoId = 1;

    public Tarefa criarTarefa(String titulo, String descricao) {
        Tarefa tarefa = new Tarefa(
                proximoId++,
                titulo,
                descricao,
                StatusTarefa.PENDENTE
        );

        tarefas.add(tarefa);
        return tarefa;
    }

    public List<Tarefa> listarTarefas() {
        return tarefas;
    }

    public boolean atualizarStatus(int id, StatusTarefa novoStatus) {
        for (Tarefa tarefa : tarefas) {
            if (tarefa.getId() == id) {
                tarefa.setStatus(novoStatus);
                return true;
            }
        }

        return false;
    }
}


