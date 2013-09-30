/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.projetodac.sessionbeans;

import br.edu.ifpb.projetodac.DAO.UsuarioDAO;
import br.edu.ifpb.projetodac.entidades.Usuario;
import java.util.List;
import javax.ejb.Stateless;

/**
 *
 * @author Luciano
 */
@Stateless
public class UsuarioSessionBean implements IUsuarioLocal{

    private UsuarioDAO usuarioDAO = new UsuarioDAO();

    @Override
    public void gravaUsario(Usuario usuario) {
        usuarioDAO.gravaUsuario(usuario);
    }

    @Override
    public Usuario getUsuario(int numeroMatricula) {
        return usuarioDAO.getUsuario(numeroMatricula);
    }

    @Override
    public List<Usuario> listaDeUsuarios() {
        return usuarioDAO.listaDeUsuarios();
    }

    @Override
    public void removeUsuario(Usuario u) {
        usuarioDAO.removeUsuario(u);
    }

    @Override
    public void atualizaUsuario(Usuario u) {
        usuarioDAO.updateUsuario(u);
    }
}
