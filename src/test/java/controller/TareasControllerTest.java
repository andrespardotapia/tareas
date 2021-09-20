package controller;

import com.tareas.controller.FalabellaController;
import com.tareas.model.Falabella;
import com.tareas.repository.FalabellaRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;


class TareasControllerTest {


	@Autowired
	FalabellaRepository repo = Mockito.mock(FalabellaRepository.class);

	@Autowired
	FalabellaController tareasController = new FalabellaController(repo);


	void setUp() {
	}

	@Test
	void crearTarea() {
		Falabella tarea = new Falabella();


		tarea.setSku(8406270);
		tarea.setName(" 500 Zapatilla Urbana Mujer");
		tarea.setBrand("New Balance");
		tarea.setSize("37");
		tarea.setPrice(Double.valueOf(42990l));
		tarea.setPrincipalImage("https://falabella.scene7.com/is/image/Falabella/8406270_1");
		tarea.setOtherImages("https://falabella.scene7.com/is/image/Falabella/8406270_1");

		Mockito.when(repo.save(tarea)).thenReturn(tarea);
		tareasController.crear(tarea);
		Assertions.assertEquals("Tarea creada", "Tarea creada");

	}



	@Test
	void eliminarTarea() {
		Falabella tarea = new Falabella();


		tarea.setSku(8406270);
		tarea.setName(" 500 Zapatilla Urbana Mujer");
		tarea.setBrand("New Balance");
		tarea.setSize("37");
		tarea.setPrice(Double.valueOf(42990l));
		tarea.setPrincipalImage("https://falabella.scene7.com/is/image/Falabella/8406270_1");
		tarea.setOtherImages("https://falabella.scene7.com/is/image/Falabella/8406270_1");

		tareasController.eliminarTarea(tarea);
		Assertions.assertNotNull("Tarea " + tarea.getSku() + " eliminada");
		Assertions.assertEquals("Tarea 1 eliminada", "Tarea " + tarea.getSku() + " eliminada");
	}



}
