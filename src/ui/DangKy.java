/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package ui;

import Entity.User;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import dao.UserDAO;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Date;
import java.util.Hashtable;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.imageio.ImageIO;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import utils.Validate;
import javax.swing.JOptionPane;
import utils.Encrypt;

/**
 *
 * @author ACER
 */
public class DangKy extends javax.swing.JDialog {

    private Frame DangKy;

    /**
     * Creates new form DangKy
     */
    public DangKy(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        txtSodienThoai = new javax.swing.JTextField();
        txtEmailDangKy = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtNameDangKy1 = new javax.swing.JTextField();
        txtPassConfirm = new javax.swing.JPasswordField();
        txtpassDangKy = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(240, 240, 240), 3, true));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setText("ĐĂNG KÝ");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 236, -1));

        jLabel2.setText("Đăng ký bằng địa chỉ email của bạn");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 224, -1));

        jButton2.setBackground(new java.awt.Color(25, 135, 84));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("ĐĂNG NHẬP");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 590, 176, 50));

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel5.setText("SỐ ĐIỆN THOẠI");
        jLabel5.setAutoscrolls(true);
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 140, 30));

        jLabel10.setBackground(new java.awt.Color(0, 0, 0));
        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel10.setText("EMAIL");
        jLabel10.setAutoscrolls(true);
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, 90, 30));

        jLabel11.setBackground(new java.awt.Color(0, 0, 0));
        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel11.setText("XÁC NHẬN MẬT KHẨU");
        jLabel11.setAutoscrolls(true);
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 460, 210, 30));

        jLabel12.setBackground(new java.awt.Color(0, 0, 0));
        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel12.setText("MẬT KHẨU");
        jLabel12.setAutoscrolls(true);
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 370, 90, 30));

        jButton3.setBackground(new java.awt.Color(25, 135, 84));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("ĐĂNG KÝ");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 590, 176, 50));
        jPanel2.add(txtSodienThoai, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, 410, 40));
        jPanel2.add(txtEmailDangKy, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, 410, 40));

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel8.setText("HỌ VÀ TÊN");
        jLabel8.setAutoscrolls(true);
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 90, 30));
        jPanel2.add(txtNameDangKy1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 410, 40));
        jPanel2.add(txtPassConfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 500, 410, 40));
        jPanel2.add(txtpassDangKy, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 400, 410, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 66, 640, 674));

        jLabel6.setText("Trang Chủ/");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 21, -1, -1));

        jLabel7.setForeground(new java.awt.Color(25, 135, 82));
        jLabel7.setText("Đăng Ký");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 21, 54, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 965, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 757, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 public void DangKy() throws SQLException, AddressException, MessagingException {
        UserDAO userDAO = new UserDAO();
        String Email = txtEmailDangKy.getText();
        String Pass = txtpassDangKy.getText();
        String Phone = txtSodienThoai.getText();
        String name = txtNameDangKy1.getText();
        String conFirmPass = txtPassConfirm.getText();
       
        if (name.equals("")) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập tên");
            return;
        }
          if (Email.equals("")) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập email");
            return;
        }
         if (Phone.equals("")) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập số điện thoại");
            return;
        }
         
        User u1 = userDAO.selectByEmail(Email);
        
        if(u1 != null){
            JOptionPane.showMessageDialog(this, "Email đã tồn tại!");
            return;
        }
          if (Pass.equals("")) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập mật khẩu");
            return;
        }
           if (conFirmPass.equals("")) {
            JOptionPane.showMessageDialog(this, "Vui lòng xác nhận mật khẩu");
            return;
        }
        
        if (!Validate.isValidPhoneNumber(Phone)) {
            JOptionPane.showMessageDialog(this, "Số điện thoại không hợp lệ");
            return;
        }

        if (!Validate.isValidEmail(Email)) {
            JOptionPane.showMessageDialog(this, "email không hợp lệ");
            return;
        }
        if (!Validate.isValidPassword(Pass)) {
            JOptionPane.showMessageDialog(this, "Mật khẩu ít nhất 6 kí tự và có ít nhất 1 kí tự hoa, 1 chữ số");
            return;
        }
        if (!Validate.isMatchPass(Pass, conFirmPass)) {
            JOptionPane.showMessageDialog(this, "Xác nhận mật khẩu không khớp");
            return;
        } 
        
            
            User u = new User(Encrypt.hashPassword(Pass), name, Phone, Email);
            String qrCodeFileName = createUserQRImage(u,Pass);
	    u.setQR_IMG(qrCodeFileName);
           
            userDAO.insert(u);
            JOptionPane.showMessageDialog(this, "Đăng ký thành công");
            
            Properties properties = new Properties();
            properties.put("mail.smtp.auth", "true");
            properties.put("mail.smtp.starttls.enable", "true");
            properties.put("mail.smtp.host", "smtp.gmail.com");
            properties.put("mail.smtp.port", "587");

            Session session = Session.getInstance(properties, new javax.mail.Authenticator() {
                @Override
                protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
                    return new javax.mail.PasswordAuthentication("datttps37451@fpt.edu.vn", "ampz endc bdsm zqdx");
                }
            });

            InternetAddress diaChiNguoiNhan = new InternetAddress(u.getEmail());

            String from = "datttps37451@fpt.edu.vn";
            String subject = "Thành Viên Mới";
            String content = "Cảm ơn "+ u.getEmail() + " đã đăng ký tài khoản. Đính kèm là QR code của bạn.";

            Multipart multipart = new MimeMultipart();

            BodyPart bodyPart = new MimeBodyPart();
            bodyPart.setText(content);
            multipart.addBodyPart(bodyPart);

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(from));
            message.setRecipient(Message.RecipientType.TO, diaChiNguoiNhan);
            message.setSubject(subject);
            message.setSentDate(new Date());

            BodyPart attachmentPart = new MimeBodyPart();
            File file = new File("D:\\FPT Polytechnic\\Ki4\\DuAn1\\admin\\java-ui-dashboard-001\\part 3\\ui-dashboard-001\\src\\com\\raven\\QRCode\\Users\\", qrCodeFileName);
            FileDataSource source = new FileDataSource(file);
            attachmentPart.setDataHandler(new DataHandler(source));
            attachmentPart.setFileName(file.getName());

            multipart.addBodyPart(attachmentPart);

            message.setContent(multipart);

            Transport.send(message);
            JOptionPane.showMessageDialog(this, "Mã QR đã gửi vào Email " + u.getEmail() + " của bạn");

            this.dispose();
    }
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            DangKy();
        } catch (SQLException ex) {
            Logger.getLogger(DangKy.class.getName()).log(Level.SEVERE, null, ex);
        } catch (AddressException ex) {
            Logger.getLogger(DangKy.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MessagingException ex) {
            Logger.getLogger(DangKy.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    
        this.dispose();
        DangNhap DN = new DangNhap(DangKy, true);
        DN.setVisible(true);
        
       
       
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DangKy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DangKy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DangKy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DangKy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DangKy dialog = new DangKy(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
     private BufferedImage generateQRCodeImage(String text, int width, int height) throws WriterException {
	    QRCodeWriter qrCodeWriter = new QRCodeWriter();
	    BitMatrix bitMatrix = qrCodeWriter.encode(text, BarcodeFormat.QR_CODE, width, height, generateQRCodeHints());
	    BufferedImage qrCodeImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
	    Graphics2D graphics = qrCodeImage.createGraphics();
	    graphics.setColor(Color.WHITE);
	    graphics.fillRect(0, 0, width, height);
	    graphics.setColor(Color.BLACK);
	    for (int x = 0; x < width; x++) {
	        for (int y = 0; y < height; y++) {
	            if (bitMatrix.get(x, y)) {
	                graphics.fillRect(x, y, 1, 1);
	            }
	        }
	    }
	    graphics.dispose();
	    return qrCodeImage;
	}
	
	private String createUserQRImage(User user ,String password) {
	    try {

	        BufferedImage qrCodeImage = generateQRCodeImage(user.getEmail()+ " " + password , 200, 200);

	        String qrCodeFileName = "User" + user.getEmail() + ".png";
	        String qrCodeFilePath = "D:\\FPT Polytechnic\\Ki4\\DuAn1\\admin\\java-ui-dashboard-001\\part 3\\ui-dashboard-001\\src\\com\\raven\\QRCode\\Users\\"  + qrCodeFileName;
	        File qrCodeFile = new File(qrCodeFilePath);
	      
	        ImageIO.write(qrCodeImage, "png", qrCodeFile);

	        return qrCodeFileName;
	    } catch (WriterException | IOException e) {
	        e.printStackTrace();
	        return null;
	    }
	}

    	private Hashtable<EncodeHintType, Object> generateQRCodeHints() {
	    Hashtable<EncodeHintType, Object> hints = new Hashtable<>();
	    hints.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.L);
	    hints.put(EncodeHintType.CHARACTER_SET, "UTF-8");
	    return hints;
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtEmailDangKy;
    private javax.swing.JTextField txtNameDangKy1;
    private javax.swing.JPasswordField txtPassConfirm;
    private javax.swing.JTextField txtSodienThoai;
    private javax.swing.JPasswordField txtpassDangKy;
    // End of variables declaration//GEN-END:variables
}
