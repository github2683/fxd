package com.fxd.user.conctroller;


import com.google.code.kaptcha.Constants;
import com.google.code.kaptcha.Producer;
import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.rowset.serial.SerialException;
import java.awt.image.BufferedImage;
import java.io.IOException;

/**
 * @Author zhc
 * @Date 2021/3/8 10:18
 */
@RestController
@RequestMapping("/user")
public class LoginController {
    @Autowired
    private Producer producer;

    @GetMapping("captcha.jpg")
    public void kaptcha(HttpServletResponse response, HttpServletRequest request)throws SerialException, IOException {

        response.setHeader("Cache-Control","no-store,no-cache");
        response.setContentType("image/jpeg");

        String text = producer.createText();

        BufferedImage image = producer.createImage(text);

        request.getSession().setAttribute(Constants.KAPTCHA_SESSION_CONFIG_KEY,text);
        ServletOutputStream outputStream = response.getOutputStream();
        ImageIO.write(image,"jpg",outputStream);
        IOUtils.closeQuietly(outputStream);
    }

}
