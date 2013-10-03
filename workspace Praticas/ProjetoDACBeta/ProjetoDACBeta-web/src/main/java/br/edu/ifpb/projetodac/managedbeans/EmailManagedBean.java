/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.projetodac.managedbeans;

import br.edu.ifpb.projetodac.util.JavaMailSender;
import java.io.File;
import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import org.apache.commons.mail.EmailException;
import org.primefaces.event.FileUploadEvent;
import org.primefaces.model.UploadedFile;

/**
 *
 * @author Luciano
 */
@ManagedBean(name="emailMB")
@RequestScoped
public class EmailManagedBean {

    private JavaMailSender javaMailSender = new JavaMailSender();
    
    private String destinatario;
    private String assunto;
    private String mensagem;
    private FileUploadEvent event;
    
    public EmailManagedBean() {
    }

    public FileUploadEvent getEvent() {
        return event;
    }

    public void setEvent(FileUploadEvent event) {
        this.event = event;
    }
    

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
    
    public JavaMailSender getJavaMailSender() {
        return javaMailSender;
    }

    public void setJavaMailSender(JavaMailSender java) {
        this.javaMailSender = java;
    }
    
    public void enviaEmail(){
        try {
            javaMailSender.enviaEmailAnexo(destinatario, assunto, mensagem);
        } catch (EmailException ex) {
            Logger.getLogger(EmailManagedBean.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void AdicionarArquivo() throws FileNotFoundException, SQLException {  
        UploadedFile file =  event.getFile();  
        String nome_anexo = event.getFile().getFileName();  
        if ((file)!=null) {  
            FacesMessage msg = new FacesMessage("Arquivo", nome_anexo + " Anexado com sucesso.");  
            FacesContext.getCurrentInstance().addMessage(null, msg);  
        }  
}  
    
}
