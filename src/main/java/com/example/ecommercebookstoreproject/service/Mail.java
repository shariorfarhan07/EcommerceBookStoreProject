package com.example.ecommercebookstoreproject.service;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;


import java.util.Date;
import java.util.List;

public class Mail  {

    private String mailFrom;

    private String mailTo;

    private String mailCc;

    private String mailBcc;

    private String mailSubject;

    private String mailContent;

    private String contentType;

    private List < Object > attachments;

    public Mail() {
        contentType = "text/plain";
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public String getMailBcc() {
        return mailBcc;
    }

    public void setMailBcc(String mailBcc) {
        this.mailBcc = mailBcc;
    }

    public String getMailCc() {
        return mailCc;
    }

    public void setMailCc(String mailCc) {
        this.mailCc = mailCc;
    }

    public String getMailFrom() {
        return mailFrom;
    }

    public void setMailFrom(String mailFrom) {
        this.mailFrom = mailFrom;
    }

    public String getMailSubject() {
        return mailSubject;
    }

    public void setMailSubject(String mailSubject) {
        this.mailSubject = mailSubject;
    }

    public String getMailTo() {
        return mailTo;
    }

    public void setMailTo(String mailTo) {
        this.mailTo = mailTo;
    }

    public Date getMailSendDate() {
        return new Date();
    }

    public String getMailContent() {
        return mailContent;
    }

    public void setMailContent(String mailContent) {
        this.mailContent = mailContent;
    }

    public List < Object > getAttachments() {
        return attachments;
    }

    public void setAttachments(List < Object > attachments) {
        this.attachments = attachments;
    }

    public void sendMail(Mail mail) {
        mail.setMailFrom("nupurbookcentre@gmail.com");
        mail.setMailTo(mail.getMailTo());
        mail.setMailSubject(mailSubject);
        mail.setMailContent(mailContent);

//        ApplicationContext ctx = SpringApplication.run(Application.class, args);
//        MailService mailService = (MailService) ctx.getBean("mailService");
//        mailService.sendEmail(mail);

    }


    public void sendMail() {
    }

}