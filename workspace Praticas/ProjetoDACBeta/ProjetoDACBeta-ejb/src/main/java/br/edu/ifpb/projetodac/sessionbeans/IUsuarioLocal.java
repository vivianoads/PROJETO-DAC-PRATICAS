/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.projetodac.sessionbeans;

import br.edu.ifpb.projetodac.entidades.Usuario;
import java.io.Serializable;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Luciano
 */
@Local
public interface IUsuarioLocal extends Serializable {
    
    public void gravaUsario(Usuario usuario);
    
    public Usuario getUsuario(int numeroMatricula);
    
    public void atualizaUsuario(Usuario usuario);
    
    public List<Usuario> listaDeUsuarios();
    
    public void removeUsuario(Usuario usuario);
    
    
}
