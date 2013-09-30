/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.projetodac.managedbeans;

import br.edu.ifpb.projetodac.entidades.Usuario;
import br.edu.ifpb.projetodac.sessionbeans.IUsuarioLocal;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Luciano
 */
@ManagedBean(name="usuarioMB")
@RequestScoped
public class UsuarioManagedBean implements Serializable{
    
    @EJB
    private IUsuarioLocal usuarioSB;
    
    private Usuario usuario = new Usuario();
       
    public UsuarioManagedBean() {
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
        
    public void addUsuario(){
       usuarioSB.gravaUsario(usuario);
    }
    public Usuario getUsuario(int numeroMatricula){
       return usuarioSB.getUsuario(numeroMatricula);
    }
    public List<Usuario> listaDeUsuarios(){
        return usuarioSB.listaDeUsuarios();
    }
    public void updateUsuario(Usuario u){
        usuarioSB.atualizaUsuario(u);
    }
    public void removeUsuario(Usuario u){
        usuarioSB.removeUsuario(u);
    }
}
