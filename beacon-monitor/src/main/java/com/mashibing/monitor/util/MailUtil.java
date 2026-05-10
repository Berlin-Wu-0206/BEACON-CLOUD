package com.mashibing.monitor.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

/**
 * @author 郑大仙丶
 * @version V1.0.0
 */
@Component
@RefreshScope
public class MailUtil {

    @Value("${spring.mail.username}")
    private String from;

    @Value("${spring.mail.tos}")
    private String tos;

    @Autowired
    private JavaMailSender javaMailSender;


    public void sendEmail(String subject,String text) throws MessagingException {
        // 构建MimeMessage对象
        MimeMessage mimeMessage = javaMailSender.createMimeMessage();

        // 给邮件指定信息
        MimeMessageHelper helper = new MimeMessageHelper(mimeMessage);
        helper.setFrom(from);
        helper.setTo(tos.split(","));
        helper.setSubject(subject);
        helper.setText(text);

        // 发送邮件
        javaMailSender.send(mimeMessage);
    }


}
