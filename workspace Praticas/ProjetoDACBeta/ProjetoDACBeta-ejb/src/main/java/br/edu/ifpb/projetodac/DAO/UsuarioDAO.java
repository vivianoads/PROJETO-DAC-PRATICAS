/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.projetodac.DAO;

import br.edu.ifpb.projetodac.entidades.Usuario;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Luciano
 */
public class UsuarioDAO {
    
    @PersistenceContext(unitName="ProjetoDACBeta-PU")
    private EntityManager entityManager;
    
    public void gravaUsuario(Usuario usuario){
        entityManager.persist(usuario);
    }
    
    public Usuario getUsuario(int numeroMatricula){
        Query query = entityManager.createNamedQuery("Usuario.findByMatricula");
        query.setParameter("matricula", numeroMatricula);
        return (Usuario) query.getSingleResult();
        
    }
    public List<Usuario> listaDeUsuarios(){
        Query query = entityManager.createNamedQuery("Usuario.findAll");
        return query.getResultList();
    }
    public void updateUsuario(Usuario u){
        if(entityManager.find(Usuario.class, u.getId())!=null){
        entityManager.merge(u);
        }
    }
    public void removeUsuario(Usuario u){
        if(entityManager.find(Usuario.class, u.getId())!=null){
        entityManager.remove(u);
        }
    }
}
