package main.java.Map.Ordenacao;

import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.*;

public class AgendaEvento {
    //atributos

    private Map<LocalDate, Evento> eventosMap;

    public AgendaEvento() {
        this.eventosMap = new HashMap<>();
    }


public void adicionarEvento(LocalDate data, String nome, String atracao) {
    Evento evento = new Evento(nome, atracao);
    eventosMap.put(data, evento);
    }

    public void exibirAgenda() {
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        System.out.println(eventosTreeMap);
    }

    public void obterProximoEvento(){
        LocalDate dataAtual = LocalDate.now();
        LocalDate proximaData = null;
        Evento proximoEvento = null;

        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        for(Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()){
            if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)){
                proximaData = entry.getKey();
                proximoEvento = entry.getValue();
                System.out.println("O proximo evento: " + proximoEvento + "acontecerá na data " + proximaData);
                break;
            }
        }
    }

    public static void main(String[] args) {
       AgendaEvento agendaEvento = new AgendaEvento();
       agendaEvento.adicionarEvento(LocalDate.of(2022, Month.JULY, 15), "Evento 1", "Atracao 1");
       agendaEvento.adicionarEvento(LocalDate.of(2022, 7, 9), "Evento 2", "Atracao 2");
       agendaEvento.adicionarEvento(LocalDate.of(2000, Month.JANUARY, 10), "Evento 3", "Atracao 3");
       agendaEvento.adicionarEvento(LocalDate.of(2023, Month.NOVEMBER, 10), "Evento 4", "Atracao 4");
       agendaEvento.adicionarEvento(LocalDate.of(2023, Month.SEPTEMBER, 5), "Evento 5", "Atracao 5");

       agendaEvento.exibirAgenda();

       agendaEvento.obterProximoEvento();

    }
}
