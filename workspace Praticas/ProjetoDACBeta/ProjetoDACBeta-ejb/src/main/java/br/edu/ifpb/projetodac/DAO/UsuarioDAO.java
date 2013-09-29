/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.projetodac.DAO;

import br.edu.ifpb.projetodac.entidades.Usuario;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Luciano
 */
@Stateless
@LocalBean
public class UsuarioDAO {
    
    @PersistenceContext(unitName="ProjetoDACBeta-PU")
    private EntityManager entityManager;
    
    public void gravaUsuario(Usuario usuario){
        entityManager.persist(usuario);
    }
    
    public Usuario getUsuario(int numeroMatricula){
        Query query = entityManager.createNamedQuery("Usuario.findByMatricula");
        query.setParameter("numeromatricula", numeroMatricula);
        return (Usuario) query.getSingleResult();
        
    }

//        @PersistenceContext(unitName = "LOJAJSF-PU")
//    private EntityManager entityManager;
//
//    public void criarPedido(Pedido pedido) {
//        entityManager.persist(pedido);
//    }

}
