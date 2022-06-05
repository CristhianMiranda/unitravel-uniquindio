package co.edu.uniquindio.unitravel.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import javax.mail.Message;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

@Service
public class EmailService {
    @Autowired
    private JavaMailSender sender;
    public Boolean enviarEmail(String asunto,String contenido, String destinatario,String datos){
        MimeMessage mensaje = sender.createMimeMessage();
        String mensajeHtml="<div class=\"\"><div class=\"aHl\"></div><div id=\":1a0\" tabindex=\"-1\"></div><div id=\":18t" +
                "\" class=\"ii gt\" jslog=\"20277; u014N:xr6bB; 4:W251bGwsbnVsbCxbXV0.\"><div id=\":18u\" class=\"a3s aiL msg2882604173997724892" +
                "\"><u></u><div style=\"margin:0;padding:0\" dir=\"ltr\" bgcolor=\"#ffffff\"><table border=\"0\" cellspacing=\"0\" cellpadding=\"0\" " +
                "align=\"center\" id=\"m_2882604173997724892email_table\" style=\"border-collapse:collapse\"><tbody><tr><td id=\"m_2882604173997724892email_content" +
                "\" style=\"font-family:Helvetica Neue,Helvetica,Lucida Grande,tahoma,verdana,arial,sans-serif;background:#ffffff\"><table border=\"0\" " +
                "width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" style=\"border-collapse:collapse\"><tbody><tr><td height=\"20\" style=\"line-height:20px\" " +
                "colspan=\"3\">&nbsp;</td></tr><tr><td height=\"1\" colspan=\"3\" style=\"line-height:1px\"><span style=\"color:#ffffff;font-size:1px\">&nbsp; " +
                "Hola,"+ destinatario+": Recibimos una solicitud para recuperar tu contraseña de unitravel. Tu contraseña es:"+ datos+" " +
                "También puedes cambiar la contraseña directamente. &nbsp; Cambiar&nbsp;contraseña &nbsp; ¿No solicitaste este cambio? Si no solicitaste una nueva contraseña, " +
                "avísanos . &nbsp;</span></td></tr><tr><td width=\"15\" style=\"display:block;width:15px\">&nbsp;&nbsp;&nbsp;</td><td><table border=\"0\" width=\"100%\" " +
                "cellspacing=\"0\" cellpadding=\"0\" style=\"border-collapse:collapse\"><tbody><tr><td height=\"15\" style=\"line-height:15px\" colspan=\"3\">&nbsp;</td></tr>" +
                "<tr><td width=\"32\" align=\"left\" valign=\"middle\" style=\"height:32;line-height:0px\"><img src=\"https://i.postimg.cc/m2rRHS35/logo-Unitravel.png\" " +
                "width=\"32\" height=\"32\" style=\"border:0\" class=\"CToWUd\"></td><td width=\"15\" style=\"display:block;width:15px\">&nbsp;&nbsp;&nbsp;</td><td width=\"100%\"" +
                "><span style=\"font-family:Helvetica Neue,Helvetica,Lucida Grande,tahoma,verdana,arial,sans-serif;font-size:19px;line-height:32px;color:#000000\">Unitravel</span></td></tr><tr " +
                "style=\"border-bottom:solid 1px #e5e5e5\"><td height=\"15\" style=\"line-height:15px\" colspan=\"3\">&nbsp;</td></tr></tbody></table></td><td width=\"15\" " +
                "style=\"display:block;width:15px\">&nbsp;&nbsp;&nbsp;</td></tr><tr><td width=\"15\" style=\"display:block;width:15px\">&nbsp;&nbsp;&nbsp;</td><td><table border=\"0\" " +
                "width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" style=\"border-collapse:collapse\"><tbody><tr><td height=\"28\" style=\"line-height:28px\">&nbsp;</td></tr><tr><td><span " +
                "class=\"m_2882604173997724892mb_text\" style=\"font-family:Helvetica Neue,Helvetica,Lucida Grande,tahoma,verdana,arial,sans-serif;font-size:16px;line-height:21px;color:#141823\"" +
                "><p>Hola,"+ destinatario+":</p><p></p><div>Recibimos una solicitud para recuperar tu contraseña de unitravel.</div> Tu contraseña es:<table border=\"0\" cellspacing=\"0\" " +
                "cellpadding=\"0\" style=\"border-collapse:collapse;margin-top:9px;margin-bottom:15px\"><tbody><tr><td style=\"font-size:11px;font-family:LucidaGrande,tahoma,verdana,arial,sans-serif;padding:10px;" +
                "background-color:#f2f2f2;border-left:1px solid #ccc;border-right:1px solid #ccc;border-top:1px solid #ccc;border-bottom:1px solid #ccc\"><span class=\"m_2882604173997724892mb_text\"" +
                " style=\"font-family:Helvetica Neue,Helvetica,Lucida Grande,tahoma,verdana,arial,sans-serif;font-size:16px;line-height:21px;color:#141823\">"+datos+"</span></td></tr></tbody></table><p></p>" +
                "También puedes cambiar la contraseña directamente.<table border=\"0\" width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" style=\"border-collapse:collapse\"><tbody><tr><td height=\"9\" style=\"line-height:9px\" " +
                "colspan=\"3\">&nbsp;</td></tr><tr><td><a href=\""+datos+"\" style=\"color:#3b5998;text-decoration:none\" target=\"_blank\" "+datos+"\"><" +
                "table border=\"0\" width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" style=\"border-collapse:collapse\"><tbody><tr><td style=\"border-collapse:collapse;border-radius:2px;text-align:center;display:block;border:solid 1px #344c80;background:#4c649b;padding:7px 16px 11px 16px\"><a href=\" "+datos+"\" style=\"color:#3b5998;text-decoration:none;display:block\" target=\"_blank\" " +
                "data-saferedirecturl=\""+datos+"\"><center><font size=\"3\"><span style=\"font-family:Helvetica Neue,Helvetica,Lucida Grande,tahoma,verdana,arial,sans-serif;white-space:nowrap;font-weight:bold;vertical-align:middle;color:#ffffff;font-size:14px;line-height:14px\">Cambiar&nbsp;" +
                "contraseña</span></font></center></a></td></tr></tbody></table></a></td><td width=\"100%\"></td></tr><tr><td height=\"32\" style=\"line-height:32px\" colspan=\"3\">&nbsp;</td></tr></tbody></table><br><div><span style=\"color:#333333;font-weight:bold\">¿No solicitaste este cambio?</span></div>Si no solicitaste una nueva contraseña, <a href=\" "+datos+"\" target=\"_blank\" " +
                "data-saferedirecturl=\""+datos+"\">avísanos</a>.</span></td></tr><tr><td height=\"28\" style=\"line-height:28px\">&nbsp;</td></tr></tbody></table></td><td width=\"15\" style=\"display:block;width:15px\">&nbsp;&nbsp;&nbsp;</td></tr><tr><td width=\"15\" style=\"display:block;width:15px\">&nbsp;&nbsp;&nbsp;</td><td><table border=\"0\" " +
                "width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" align=\"left\" style=\"border-collapse:collapse\"><tbody><tr style=\"border-top:solid 1px #e5e5e5\"><td height=\"19\" style=\"line-height:19px\">&nbsp;</td></tr><tr><td style=\"font-family:Helvetica Neue,Helvetica,Lucida Grande,tahoma,verdana,arial,sans-serif;font-size:11px;color:#aaaaaa;line-height:16px\">Se envió este mensaje a <a href=\"mailto:"+destinatario+"\" style=\"color:#3b5998;text-decoration:none\" target=\"_blank\">"+destinatario+"</a>" +
                " por pedido tuyo.<br>Unitravel, Inc., Attention: Community Support, 1 Unitravel Oficina, La tebaida, CP 633020</td></tr></tbody></table></td><td width=\"15\" style=\"display:block;width:15px\">&nbsp;&nbsp;&nbsp;</td></tr><tr><td height=\"20\" style=\"line-height:20px\" colspan=\"3\">&nbsp;</td></tr></tbody></table><span><img src=\"https://i.postimg.cc/m2rRHS35/logo-Unitravel.png\" " +
                "style=\"border: 0px; width: 1px; height: 1px; display: none !important;\" class=\"CToWUd\" jslog=\"138226; u014N:xr6bB; 53:W2ZhbHNlXQ..\"></span></td></tr></tbody></table></div><div class=\"yj6qo\"></div><div class=\"adL\">\n" +
                "\n" +
                "\n" +
                "</div></div></div><div id=\":19w\" class=\"ii gt\" style=\"display:none\"><div id=\":19v\" class=\"a3s aiL \"></div></div><div class=\"hi\"></div></div>";
        /* MimeMessage m = new MimeMessage();
         */ MimeMessageHelper helper = new MimeMessageHelper(mensaje);

        try {

            //from email
            mensaje.setFrom("cristhianandres2001@gmail.com");

            //adding recipient to message
            mensaje.addRecipient(Message.RecipientType.TO, new InternetAddress(destinatario));

            //adding subject to message
            mensaje.setSubject(asunto);


            //adding text to message
            mensaje.setContent(mensajeHtml, "text/html");

            //send

            //Step 3 : send the message using Transport class
            sender.send(mensaje);

        }catch (Exception e) {
            e.printStackTrace();
        }
       /*
        try{
            helper.setText(contenido,true);
            helper.setTo(destinatario);
           // helper.setCon
            helper.setSubject(asunto);
            sender.send(mensaje);
            return true;
        }
        catch(Exception e){
            e.printStackTrace();
        }*/
        return false;
    }
/**
 *<div class=""><div class="aHl"></div><div id=":1a0" tabindex="-1"></div><div id=":18t" class="ii gt" jslog="20277; u014N:xr6bB; 4:W251bGwsbnVsbCxbXV0."><div id=":18u" class="a3s aiL msg2882604173997724892"><u></u><div style="margin:0;padding:0" dir="ltr" bgcolor="#ffffff"><table border="0" cellspacing="0" cellpadding="0" align="center" id="m_2882604173997724892email_table" style="border-collapse:collapse"><tbody><tr><td id="m_2882604173997724892email_content" style="font-family:Helvetica Neue,Helvetica,Lucida Grande,tahoma,verdana,arial,sans-serif;background:#ffffff"><table border="0" width="100%" cellspacing="0" cellpadding="0" style="border-collapse:collapse"><tbody><tr><td height="20" style="line-height:20px" colspan="3">&nbsp;</td></tr><tr><td height="1" colspan="3" style="line-height:1px"><span style="color:#ffffff;font-size:1px">&nbsp; Hola, Cristhian: Recibimos una solicitud para restablecer tu contraseña de Facebook. Ingresa el siguiente código para restablecer la contraseña: 113777 También puedes cambiar la contraseña directamente. &nbsp; Cambiar&nbsp;contraseña &nbsp; ¿No solicitaste este cambio? Si no solicitaste una nueva contraseña, avísanos . &nbsp;</span></td></tr><tr><td width="15" style="display:block;width:15px">&nbsp;&nbsp;&nbsp;</td><td><table border="0" width="100%" cellspacing="0" cellpadding="0" style="border-collapse:collapse"><tbody><tr><td height="15" style="line-height:15px" colspan="3">&nbsp;</td></tr><tr><td width="32" align="left" valign="middle" style="height:32;line-height:0px"><img src="https://ci6.googleusercontent.com/proxy/1G13jcPWcE154MVw505G3LL1fnSGRoi9yOHl1Zl09AFqePjKLMFDj8s6P9ivz-lfVfRTaSLtwjRtXdHSkWl7dRolA_WOuvT6CXoiN5v_Pg=s0-d-e1-ft#https://static.xx.fbcdn.net/rsrc.php/v3/yP/r/nblMrq1jYuK.png" width="32" height="32" style="border:0" class="CToWUd"></td><td width="15" style="display:block;width:15px">&nbsp;&nbsp;&nbsp;</td><td width="100%"><span style="font-family:Helvetica Neue,Helvetica,Lucida Grande,tahoma,verdana,arial,sans-serif;font-size:19px;line-height:32px;color:#3b5998">Facebook</span></td></tr><tr style="border-bottom:solid 1px #e5e5e5"><td height="15" style="line-height:15px" colspan="3">&nbsp;</td></tr></tbody></table></td><td width="15" style="display:block;width:15px">&nbsp;&nbsp;&nbsp;</td></tr><tr><td width="15" style="display:block;width:15px">&nbsp;&nbsp;&nbsp;</td><td><table border="0" width="100%" cellspacing="0" cellpadding="0" style="border-collapse:collapse"><tbody><tr><td height="28" style="line-height:28px">&nbsp;</td></tr><tr><td><span class="m_2882604173997724892mb_text" style="font-family:Helvetica Neue,Helvetica,Lucida Grande,tahoma,verdana,arial,sans-serif;font-size:16px;line-height:21px;color:#141823"><p>Hola, Cristhian:</p><p></p><div>Recibimos una solicitud para restablecer tu contraseña de Facebook.</div>Ingresa el siguiente código para restablecer la contraseña:<table border="0" cellspacing="0" cellpadding="0" style="border-collapse:collapse;margin-top:9px;margin-bottom:15px"><tbody><tr><td style="font-size:11px;font-family:LucidaGrande,tahoma,verdana,arial,sans-serif;padding:10px;background-color:#f2f2f2;border-left:1px solid #ccc;border-right:1px solid #ccc;border-top:1px solid #ccc;border-bottom:1px solid #ccc"><span class="m_2882604173997724892mb_text" style="font-family:Helvetica Neue,Helvetica,Lucida Grande,tahoma,verdana,arial,sans-serif;font-size:16px;line-height:21px;color:#141823">113777</span></td></tr></tbody></table><p></p>También puedes cambiar la contraseña directamente.<table border="0" width="100%" cellspacing="0" cellpadding="0" style="border-collapse:collapse"><tbody><tr><td height="9" style="line-height:9px" colspan="3">&nbsp;</td></tr><tr><td><a href="https://www.facebook.com/recover/code/?u=100001600398432&amp;n=113777&amp;s=23&amp;exp_locale=en_US&amp;redirect_from=button" style="color:#3b5998;text-decoration:none" target="_blank" data-saferedirecturl="https://www.google.com/url?q=https://www.facebook.com/recover/code/?u%3D100001600398432%26n%3D113777%26s%3D23%26exp_locale%3Den_US%26redirect_from%3Dbutton&amp;source=gmail&amp;ust=1654460818479000&amp;usg=AOvVaw28v0milLUpQF7mFlkTRTVH"><table border="0" width="100%" cellspacing="0" cellpadding="0" style="border-collapse:collapse"><tbody><tr><td style="border-collapse:collapse;border-radius:2px;text-align:center;display:block;border:solid 1px #344c80;background:#4c649b;padding:7px 16px 11px 16px"><a href="https://www.facebook.com/recover/code/?u=100001600398432&amp;n=113777&amp;s=23&amp;exp_locale=en_US&amp;redirect_from=button" style="color:#3b5998;text-decoration:none;display:block" target="_blank" data-saferedirecturl="https://www.google.com/url?q=https://www.facebook.com/recover/code/?u%3D100001600398432%26n%3D113777%26s%3D23%26exp_locale%3Den_US%26redirect_from%3Dbutton&amp;source=gmail&amp;ust=1654460818479000&amp;usg=AOvVaw28v0milLUpQF7mFlkTRTVH"><center><font size="3"><span style="font-family:Helvetica Neue,Helvetica,Lucida Grande,tahoma,verdana,arial,sans-serif;white-space:nowrap;font-weight:bold;vertical-align:middle;color:#ffffff;font-size:14px;line-height:14px">Cambiar&nbsp;contraseña</span></font></center></a></td></tr></tbody></table></a></td><td width="100%"></td></tr><tr><td height="32" style="line-height:32px" colspan="3">&nbsp;</td></tr></tbody></table><br><div><span style="color:#333333;font-weight:bold">¿No solicitaste este cambio?</span></div>Si no solicitaste una nueva contraseña, <a href="https://www.facebook.com/login/recover/cancel/?n=113777&amp;id=100001600398432&amp;i=www" style="color:#3b5998;text-decoration:none" target="_blank" data-saferedirecturl="https://www.google.com/url?q=https://www.facebook.com/login/recover/cancel/?n%3D113777%26id%3D100001600398432%26i%3Dwww&amp;source=gmail&amp;ust=1654460818479000&amp;usg=AOvVaw3kYT5mcz2t2tqUR7HXao_j">avísanos</a>.</span></td></tr><tr><td height="28" style="line-height:28px">&nbsp;</td></tr></tbody></table></td><td width="15" style="display:block;width:15px">&nbsp;&nbsp;&nbsp;</td></tr><tr><td width="15" style="display:block;width:15px">&nbsp;&nbsp;&nbsp;</td><td><table border="0" width="100%" cellspacing="0" cellpadding="0" align="left" style="border-collapse:collapse"><tbody><tr style="border-top:solid 1px #e5e5e5"><td height="19" style="line-height:19px">&nbsp;</td></tr><tr><td style="font-family:Helvetica Neue,Helvetica,Lucida Grande,tahoma,verdana,arial,sans-serif;font-size:11px;color:#aaaaaa;line-height:16px">Se envió este mensaje a <a href="mailto:cristhianmirandapro@gmail.com" style="color:#3b5998;text-decoration:none" target="_blank">cristhianmirandapro@gmail.com</a> por pedido tuyo.<br>Facebook, Inc., Attention: Community Support, 1 Facebook Way, Menlo Park, CA 94025</td></tr></tbody></table></td><td width="15" style="display:block;width:15px">&nbsp;&nbsp;&nbsp;</td></tr><tr><td height="20" style="line-height:20px" colspan="3">&nbsp;</td></tr></tbody></table><span><img src="https://ci6.googleusercontent.com/proxy/YRxgWsN_MDtEuVQZA1Gty9U7jaOJvC-GTtaYS5gz05Ov3-o6317R-elcncxrsqdVwjGFYr9lz0CZZZ2yUd7HKAWNSWKY39jDAC3c4gwi8NVOgvWGQ7kF4zIOpAPJ2S720MmgdIkpis8tdxR3zozz147nvA=s0-d-e1-ft#https://www.facebook.com/email_open_log_pic.php?mid=5a4784ab80c10G5af36fde6460G5a478944e0ee2G178" style="border: 0px; width: 1px; height: 1px; display: none !important;" class="CToWUd" jslog="138226; u014N:xr6bB; 53:W2ZhbHNlXQ.."></span></td></tr></tbody></table></div><div class="yj6qo"></div><div class="adL">
 *
 *
 * </div></div></div><div id=":19w" class="ii gt" style="display:none"><div id=":19v" class="a3s aiL "></div></div><div class="hi"></div></div>
 */
}