/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.projetodac.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Luciano
 */
public class App {
    public static void main(String[] args) {
        
        EntityManagerFactory entityManagerFactory;
        entityManagerFactory = Persistence.createEntityManagerFactory("ProjetoDACBeta-PU");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.clear();
    }
    
}
