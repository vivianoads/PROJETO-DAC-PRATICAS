/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.projetodac.entidades;

import java.io.Serializable;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Luciano
 */
@Entity
@DiscriminatorValue("Administrador")
public class Administrador extends Usuario implements Serializable {
    private static final long serialVersionUID = 1L;
   

  
}
