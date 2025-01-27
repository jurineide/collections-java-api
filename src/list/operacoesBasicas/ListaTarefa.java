package list.operacoesBasicas;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class ListaTarefa {
    private List<Tarefa> tarefaList = new ArrayList<>();

    public void adicionarTarefa(String descricao) {
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        List<Tarefa>tarefasParaRemover = new ArrayList<>();
        for(Tarefa t: tarefaList) {
            if(t.getDescricao().equals(descricao)) {
                tarefasParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }


    public int obterNumeroTotalDeTarefa(){
        return tarefaList.size();
    }

    public  void obterDescricaoTarefa(){
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();

        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 2");
        listaTarefa.adicionarTarefa("Tarefa 3");

        System.out.println(listaTarefa.obterNumeroTotalDeTarefa());

        listaTarefa.removerTarefa("Tarefa 2");

        System.out.println(listaTarefa.obterNumeroTotalDeTarefa());


 }

}
