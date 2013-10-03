/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.projetodac.util;

import java.io.File;
import java.util.List;
import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.MultiPartEmail;

/**
 *
 * @author Luciano
 */
public class JavaMailSender {
    
   
    private String destinatario;
    private String remetente;
    private String assunto;
    private String mensagem;
    private List<File> anexos;
    private EmailAttachment attach;
    private String pathFile;

    public String getPathFile() {
        return pathFile;
    }

    public void setPathFile(String pathFile) {
        this.pathFile = pathFile;
    }
  
    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public String getRemetente() {
        return remetente;
    }

    public void setRemetente(String remetente) {
        this.remetente = remetente;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public List<File> getAnexos() {
        return anexos;
    }

    public void setAnexos(List<File> anexos) {
        this.anexos = anexos;
    }

    public EmailAttachment getAttach() {
        return attach;
    }

    public void setAttach(EmailAttachment attach) {
        this.attach = attach;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
    
 
    public void enviaEmailAnexo(String destinatario, String assunto, String mensagem) throws EmailException{
        MultiPartEmail email = new MultiPartEmail();
       // EmailAttachment anexo = new EmailAttachment();
       // File file = new File(pathFile);
        
       
        email.setHostName("smtp.gmail.com");
        email.setFrom("testejavaprojetodac@gmail.com");
        email.addTo(destinatario);
        email.setSubject(assunto);
        email.setMsg(mensagem);
        email.setAuthentication("testejavaprojetodac@gmail.com", "lucianoifpb");
        email.setSmtpPort(587);
        email.setTLS(true);
        email.setDebug(true);
        //anexo.setPath(file.getPath());
       // anexo.setDisposition(EmailAttachment.ATTACHMENT);
        //anexo.setName(file.getName());
        
      // email.attach(anexo);
        email.send();
        
    }
    
   
}
