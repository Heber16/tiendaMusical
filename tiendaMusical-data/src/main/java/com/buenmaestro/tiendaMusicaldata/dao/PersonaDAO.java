/**
 * 
 */
package com.buenmaestro.tiendaMusicaldata.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.buenmaestro.tiendaMusicalentities.entities.Persona;

/**
 * @author heber
 * Clase DAO que realiza el CRUD con SpringJPA para la tabla persona
 */

public interface PersonaDAO extends PagingAndSortingRepository<Persona, Long>{
	
	
	/**
	 * @author heber
	 * Metodo que permite consultar el usuario que trata de ingresar a sesion
	 * @param usuario {@link String} usuario capturado para la persona
	 * @param password {@link String} contraseña capturada por la persona
	 * return {@link Persona} objeto con la persona encontrada
	 */
	@Query("SELECT p FROM Persona p WHERE P.usuario = ?1")
	Persona findByUsuarioAndPassword(String usuario, String password);

}
