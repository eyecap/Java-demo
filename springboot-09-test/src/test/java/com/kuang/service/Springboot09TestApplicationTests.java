package com.kuang.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.File;

@SpringBootTest
class Springboot09TestApplicationTests {

    @Autowired
    JavaMailSenderImpl mailSender;

    @Test
    void contextLoads() {

        //一个简单的邮件
        SimpleMailMessage mailMessage = new SimpleMailMessage();

        mailMessage.setSubject("小狂神你好呀~");
        mailMessage.setText("谢谢你的课程");

        mailMessage.setTo("3159258588@qq.com");
        mailMessage.setFrom("3159258588@qq.com");

        mailSender.send(mailMessage);
    }

    @Test
    void contextLoad2() throws MessagingException {
        //一个复杂的邮件
        MimeMessage mimeMessage = mailSender.createMimeMessage();
        //组装
        MimeMessageHelper helper = new MimeMessageHelper(mimeMessage,true);

        //正文
        helper.setSubject("小狂神你好呀~plus");
        helper.setText("<p style='color:red'>谢谢你的狂神说Java系列课程~</p>",true);

        //附件
        helper.addAttachment("1.jpg",new File("C:\\Users\\ly153\\Desktop\\1.png"));
        helper.addAttachment("2.jpg",new File("C:\\Users\\ly153\\Desktop\\1.png"));

        helper.setTo("3159258588@qq.com");
        helper.setFrom("3159258588@qq.com");

        mailSender.send(mimeMessage);
    }

    /**
     *
     * @param html
     * @param subject
     * @param text
     * @throws MessagingException
     * @Author kuangshen
     */
    public void sendMail(Boolean html,String subject,String text) throws MessagingException {
        //一个复杂的邮件
        MimeMessage mimeMessage = mailSender.createMimeMessage();
        //组装
        MimeMessageHelper helper = new MimeMessageHelper(mimeMessage,html);

        //正文
        helper.setSubject(subject);
        helper.setText(text,true);

        //附件
        helper.addAttachment("1.jpg",new File("C:\\Users\\ly153\\Desktop\\1.png"));
        helper.addAttachment("2.jpg",new File("C:\\Users\\ly153\\Desktop\\1.png"));

        helper.setTo("3159258588@qq.com");
        helper.setFrom("3159258588@qq.com");

        mailSender.send(mimeMessage);
    }

}
