/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.projetodac.managedbeans;

import br.edu.ifpb.projetodac.entidades.Usuario;
import br.edu.ifpb.projetodac.sessionbeans.IUsuarioLocal;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author viviano
 */
@ManagedBean
@RequestScoped
public class NewJSFManagedBean {

    private int numeroMatricula;
    private String nome;
    private String telefone;
    private String vinculo;
    private String email;
    
    @EJB(beanName="usuariosessionBean")
    private IUsuarioLocal usuarioSB;
 
    private Usuario usuario = new Usuario();
    /**
     * Creates a new instance of NewJSFManagedBean
     */
    public NewJSFManagedBean() {
    }
     public void addUsuario(){
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

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
     
     
}
