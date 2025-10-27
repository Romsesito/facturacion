package com.tuempresa.facturacion.modelo;

import java.util.*;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;


@Entity @Getter @Setter
public class Autor extends identificable {

	
	@Column (length=50)
	String nombre;

	
	@OneToMany(mappedBy="autor", cascade=CascadeType.REMOVE)
	@ListProperties("numero, descripción, precio")
	Collection<Producto> productos;
	
}
