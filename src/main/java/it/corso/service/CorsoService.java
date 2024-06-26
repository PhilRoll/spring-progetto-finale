package it.corso.service;

import java.util.List;

import it.corso.dto.CorsoDto;

public interface CorsoService {

		CorsoDto getCorso(int id);
		List<CorsoDto> getAllCorsi();
		boolean createCorso(CorsoDto corsoDto);
		void deleteCorso(int id);
}
