package com.tareacoder.tareacoderhouse;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.tareacoder.tareacoderhouse.domain.entity.Alumno;
import com.tareacoder.tareacoderhouse.domain.entity.Cliente;
import com.tareacoder.tareacoderhouse.domain.repository.DAOFactory;

@SpringBootApplication
public class TareaCoderhouseApplication implements CommandLineRunner{
	@Autowired
	private DAOFactory daoFactory;
	
	public static void main(String[] args) {
		SpringApplication.run(TareaCoderhouseApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		try {
			// System.out.println("Lista alumno inicial");
			// List<Alumno> alumnos = daoFactory.getAlumnos();
			// alumnos.forEach(System.out::println);
			// System.out.println("-------------------------");
			// Alumno alumno = new Alumno();
			// alumno.setNombre("Prueba");
			// alumno.setApellido("Apellido");
			// alumno.setDni(580305);
			// alumno.setLegajo(12939);
			// daoFactory.create(alumno);

			// Alumno alumnoGuardado = daoFactory.getAlumnoById(580305);
			// System.out.println("Alumno recien guardado: ");
			// System.out.println(alumnoGuardado);
			// System.out.println("-------------------------");


			// alumnos = daoFactory.getAlumnos();
			// alumnos.forEach(System.out::println);
			// System.out.println("-------------------------");

			// alumno.setNombre("Modificado");
			// alumno.setApellido("Apellido modificado");
			// alumno.setDni(873453485);
			// alumno.setLegajo(1738324);
			// daoFactory.update(alumno);

			// alumnos = daoFactory.getAlumnos();
			// alumnos.forEach(System.out::println);
			// System.out.println("-------------------------");
			System.out.println("Lista clientes inicial");
			List<Cliente> clientes = daoFactory.getClientes();
			clientes.forEach(System.out::println);
			System.out.println("-------------------------");

			System.out.println("Obtener cliente por nombre: ");
			Cliente clienteGuardado = daoFactory.getClienteByNombre("Jhon");
			System.out.println(clienteGuardado);
			System.out.println("-------------------------");

			System.out.println("Lista de clientes con cliente borrado por nombre: ");
			daoFactory.borrarClienteByNombre("Jhon");
			clientes = daoFactory.getClientes();	
			clientes.forEach(System.out::println);
			System.out.println("-------------------------");



		} catch (Exception e) {
			e.printStackTrace(System.out);
		}
	}

}
