
import model.entity.Tarefa;
import model.entity.StatusTarefa;
import model.service.TarefaService;

public class Main {

    public static void main(String[] args) {

        TarefaService service = new TarefaService();

        // Criar tarefas
        Tarefa tarefa1 = service.criarTarefa(
                "Estudar Java",
                "Fazer atividade do projeto MVC"
        );

        Tarefa tarefa2 = service.criarTarefa(
                "Fazer trabalho",
                "Terminar o trabalho da escola"
        );

        // Listar tarefas
        System.out.println("===== LISTA DE TAREFAS =====");

        for (Tarefa tarefa : service.listarTarefas()) {
            System.out.println("ID: " + tarefa.getId());
            System.out.println("Título: " + tarefa.getTitulo());
            System.out.println("Descrição: " + tarefa.getDescricao());
            System.out.println("Status: " + tarefa.getStatus());
            System.out.println("--------------------------");
        }

        // Atualizar o status da primeira tarefa
        boolean atualizado = service.atualizarStatus(
                tarefa1.getId(),
                StatusTarefa.CONCLUIDA
        );

        System.out.println("Tarefa atualizada: " + atualizado);
        System.out.println("Novo status: " + tarefa1.getStatus());
    }
}
