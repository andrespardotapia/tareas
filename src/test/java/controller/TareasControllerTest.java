package controller;

import com.tareas.controller.TareasController;
import com.tareas.dto.TareaDTO;
import com.tareas.model.Tarea;
import com.tareas.repository.TareasRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class TareasControllerTest {


	@Autowired
	TareasRepository repo = Mockito.mock(TareasRepository.class);

	@Autowired
	TareasController tareasController = new TareasController(repo);


	void setUp() {
	}

	@Test
	void crearTarea() {
		Tarea tarea = new Tarea();

		TareaDTO tareaDTO = new TareaDTO();
		tareaDTO.setIdTarea(1);
		tareaDTO.setDescripcion("descripcion");
		tareaDTO.setFechaCreacion(new Date());
		tareaDTO.setVigencia(true);

		Mockito.when(repo.save(tarea)).thenReturn(tarea);
		tareasController.crear(tareaDTO);
		Assertions.assertEquals("Tarea creada", "Tarea creada");

	}

	@Test
	void listarTarea() {
		Tarea tarea = new Tarea();
		tarea.setIdTarea(1);
		tarea.setDescripcion("descripcion");
		tarea.setFechaCreacion(new Date());
		tarea.setVigencia(true);
		List<Tarea> tareaList = new ArrayList<>();
		tareaList.add(tarea);
		Mockito.when(repo.findAll()).thenReturn(tareaList);
		tareasController.listarTareas();
		Assertions.assertNotNull(tareaList);
	}

	@Test
	void eliminarTarea() {
		Tarea tarea = new Tarea();

		TareaDTO tareaDTO = new TareaDTO();
		tareaDTO.setIdTarea(1);
		tareaDTO.setDescripcion("descripcion");
		tareaDTO.setFechaCreacion(new Date());
		tareaDTO.setVigencia(true);

		tareasController.eliminarTarea(tareaDTO);
		Assertions.assertNotNull("Tarea " + tareaDTO.getIdTarea() + " eliminada");
		Assertions.assertEquals("Tarea 1 eliminada", "Tarea " + tareaDTO.getIdTarea() + " eliminada");
	}

	@Test
	void editarTarea() {
		Tarea tarea = new Tarea();
		TareaDTO tareaDTO = new TareaDTO();
		tareaDTO.setIdTarea(1);
		tareaDTO.setDescripcion("descripcion");
		tareaDTO.setFechaCreacion(new Date());
		tareaDTO.setVigencia(true);
		Mockito.when(repo.save(tarea)).thenReturn(tarea);
		tareasController.eliminarTarea(tareaDTO);
		Assertions.assertEquals("Tarea editada", "Tarea editada");
	}

}
