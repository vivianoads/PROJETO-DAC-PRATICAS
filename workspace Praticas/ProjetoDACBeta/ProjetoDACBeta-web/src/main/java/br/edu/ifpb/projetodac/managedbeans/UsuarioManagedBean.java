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
@ManagedBean(name="userMB")
@RequestScoped
public class UsuarioManagedBean implements Serializable{
    
    private int numeroMatricula;
    private String nome;
    private String telefone;
    private String vinculo;
    private String email;
    
//    @EJB(beanName="usuariosessionBean")
//    private IUsuarioLocal usuarioSB;
    
    private Usuario usuario = new Usuario();
    
    public UsuarioManagedBean() {
        super();
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
        
    public void addUsuario(){
//       usuarioSB.gravaUsario(usuario);
    }
    public Usuario getUsuario(int numeroMatricula){
//       return usuarioSB.getUsuario(numeroMatricula);
        return null;
    }
    public List<Usuario> listaDeUsuarios(){
//        return usuarioSB.listaDeUsuarios();
        return null;
    }
    public void updateUsuario(Usuario u){
//        usuarioSB.atualizaUsuario(u);
    }
    public void removeUsuario(Usuario u){
//        usuarioSB.removeUsuario(u);
    }

    public int getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(int numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getVinculo() {
        return vinculo;
    }

    public void setVinculo(String vinculo) {
        this.vinculo = vinculo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
}
