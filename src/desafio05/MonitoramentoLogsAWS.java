package desafio05;

import java.util.*;
import java.util.stream.Collectors;

public class MonitoramentoLogsAWS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantidadeLogs = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do scanner

        Map<String, Long> eventosPorServico = new HashMap<>();
        for (int i = 0; i < quantidadeLogs; i++) {
            String[] parts = scanner.nextLine().split(",");
            String servico = parts[1];
            //TODO: Utilize o mapa para registrar/incrementar o serviço em questão.
            if(eventosPorServico.containsKey(servico)){
                eventosPorServico.put(servico, eventosPorServico.get(servico) +1);
            } else {
                eventosPorServico.put(servico, 1l);
            }
        }
        System.out.println("Eventos por serviço: ");
        for (String i : eventosPorServico.keySet()) {
            System.out.println(i + ":" + eventosPorServico.get(i));
        }

        //TODO: Identifique no mapa os serviços com maior e menor quantidade de logs.
        //      Dica: Utilize Java Streams para tornar essa tarefa mais simples.
        Map.Entry<String, Long> sevicoComMaiorValor = null;
        Map.Entry<String, Long> sevicoComMenorValor = null;
        for (Map.Entry<String, Long> servico : eventosPorServico.entrySet()) {
            if (sevicoComMaiorValor == null || servico.getValue().compareTo(sevicoComMaiorValor.getValue()) > 0) {
                sevicoComMaiorValor = servico;
            }
            if(sevicoComMenorValor == null || servico.getValue().compareTo(sevicoComMenorValor.getValue()) < 0){
                sevicoComMenorValor = servico;
            }
        }
        
        System.out.println("Maior:" + sevicoComMaiorValor.getKey());
        System.out.println("Menor:" + sevicoComMenorValor.getKey());

        //TODO: Imprima a saída no padrão definido no enunciado deste desafio.

        scanner.close();
    }
}