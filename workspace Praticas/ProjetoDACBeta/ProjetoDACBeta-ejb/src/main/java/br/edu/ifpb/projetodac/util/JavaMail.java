/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.projetodac.util;

import java.util.Map;

/**
 *
 * @author Luciano
 */
public class JavaMail {
    
    //indica o formato do texto
    public static final String TYPE_TEXT_PLAIN = "text/plain";
    
    private String smtpMail;
    private String smtpPort;
    private String smtpAuto;
    private String smtpTTLS;
    private String from;
    private String nameUser;
    private String userMail;
    private String password;
    private String subject;
    private String bodyEmail;
    private Map<String, String> listDestinatarios;
    private String typeTextMail;

    public String getSmtpMail() {
        return smtpMail;
    }

    public void setSmtpMail(String smtpMail) {
        this.smtpMail = smtpMail;
    }

    public String getSmtpPort() {
        return smtpPort;
    }

    public void setSmtpPort(String smtpPort) {
        this.smtpPort = smtpPort;
    }

    public String getSmtpAuto() {
        return smtpAuto;
    }

    public void setSmtpAuto(String smtpAuto) {
        this.smtpAuto = smtpAuto;
    }

    public String getSmtpTTLS() {
        return smtpTTLS;
    }

    public void setSmtpTTLS(String smtpTTLS) {
        this.smtpTTLS = smtpTTLS;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getNameUser() {
        return nameUser;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }

    public String getUserMail() {
        return userMail;
    }

    public void setUserMail(String userMail) {
        this.userMail = userMail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getBodyEmail() {
        return bodyEmail;
    }

    public void setBodyEmail(String bodyEmail) {
        this.bodyEmail = bodyEmail;
    }

    public Map<String, String> getListDestinatarios() {
        return listDestinatarios;
    }

    public void setListDestinatarios(Map<String, String> listDestinatarios) {
        this.listDestinatarios = listDestinatarios;
    }

    public String getTypeTextMail() {
        return typeTextMail;
    }

    public void setTypeTextMail(String typeTextMail) {
        this.typeTextMail = typeTextMail;
    }
    
    
    
   
    
}
