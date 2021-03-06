package br.com.easymedicows;

import java.util.Calendar;
import java.util.LinkedList;
import java.util.Vector;

public class GerenciaHorarios {

	public static LinkedList<Horario> calculaHorariosDisponiveisPorDia(
			Vector<String> agendamentos, Medico medico) {
		String horarios;
		if (medico.getAgendaManha().equals("S")
				&& medico.getAgendaTarde().equals("S"))
			horarios = "07:00,08:00,09:00,10:00,11:00,13:00,14:00,15:00,16:00,17:00,18:00";
		else if (medico.getAgendaManha().equals("S"))
			horarios = "07:00,08:00,09:00,10:00,11:00";
		else if (medico.getAgendaTarde().equals("S"))
			horarios = "13:00,14:00,15:00,16:00,17:00,18:00";
		else
			return null;
		// Transformo em um vetor
		String[] vetHorarios = horarios.split(",");
		LinkedList<Horario> horariosDisponiveis = new LinkedList<Horario>();
		// Percorro os hor�rios pr�-definidos
		for (int i = 0; i < vetHorarios.length; i++) {
			int count = 0;
			
			// Agora irei percorrer os agendamentos, para saber quantos
			// agendados eu tenho no hor�rio atual
			for (int j = 0; j < agendamentos.size(); j++) {
				// Se s�o iguais, significa que existe um paciente agendado para
				// esse hor�rio, ent�o incremento o contador
				if (vetHorarios[i].equals(agendamentos.get(j))) {
					count++;
				}
				// Se j� atingiu o limite, saio do for pois j� sei que esse
				// hor�rio est� indispon�vel
				if (count == medico.getQtdPacientesPorHora())
					break;
			}
			// Se for menor, adiciono o hor�rio na lista de dispon�veis
			if (count < medico.getQtdPacientesPorHora()) {
				horariosDisponiveis.add(new Horario(vetHorarios[i]));
			}

		}

		return horariosDisponiveis;
	}

}
