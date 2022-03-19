package app;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.Test;

import coordination.Discipline;

class ValidationTest {
	

	@Test
	void validResistrationReprovedTest() {
		Discipline disciplina = new Discipline("Java");
		disciplina.setNotes(5.0, 6.0, 2.0);
		List<Discipline> disciplinas = new ArrayList<>();
		disciplinas.add(disciplina);
		
		Validation validation = new Validation();
	
		// True -> Não esta com a disciplina ou esta reprovado
		boolean result = validation.validResistration(disciplinas, disciplina);
		
		assertTrue(result);
	}
	
	@Test
	void validResistrationAprovedTest() {
		Discipline disciplina = new Discipline("Java");
		disciplina.setNotes(5.0, 6.0, 5.0);
		List<Discipline> disciplinas = new ArrayList<>();
		disciplinas.add(disciplina);
		
		Validation validation = new Validation();
	
		// True -> Não esta com a disciplina ou esta reprovado
		boolean result = validation.validResistration(disciplinas, disciplina);
		
		assertFalse(result);
	}
	
	@Test
	void validResistrationUnregistedTest() {
		Discipline disciplina = new Discipline("Java");
		List<Discipline> disciplinas = new ArrayList<>();
		
		Validation validation = new Validation();
		
		boolean result = validation.validResistration(disciplinas, disciplina);
		
		assertTrue(result);
	}

}
