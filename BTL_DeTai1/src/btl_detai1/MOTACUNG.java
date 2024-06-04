/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/AWTForms/Frame.java to edit this template
 */
package btl_detai1;

import javax.swing.JLabel;

/**
 *
 * @author Admin
 */
public class MOTACUNG extends java.awt.Frame {

    /**
     * Creates new form MOTACUNG
     */
    public MOTACUNG(String zodiacSign) {
        setUndecorated(true);
        initComponents();
        setLocationRelativeTo(null);
        displayZodiacDescription(zodiacSign);
    }

    private void displayZodiacDescription(String zodiacSign) {
        // Mô tả chi tiết của từng cung hoàng đạo
        String description = "";
        switch (zodiacSign) {
            case "Cung Bảo Bình":
                image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imageZodiac/baobinh.png")));
                description = "Kiên định, hết mình trong tình yêu nhưng cũng lý trí - Bảo Bình (20/1 – 18/2)\n"
                        + "Có Bảo Bình ở cạnh đồng nghĩa với việc “làm bạn” cùng những cảm giác mới mẻ, vui tươi. Bảo Bình "
                        + "có tính cách khá tùy hứng, bốc đồng nhưng đứng trước tình bạn, tình yêu, họ có thể trở thành một người "
                        + "kiên nhẫn, cố chấp đến khó hiểu. Một khi đã trao tình cảm cho ai, đừng hòng Bảo Bình bỏ cuộc, chạy trốn, "
                        + "chia li dù đối phương chẳng còn yêu mình. Họ cũng chẳng ngại ngần việc để lộ tâm trạng yếu đuối si tình trước mặt người khác.\n"
                        + "Si tình là vậy nhưng Bảo Bình luôn biết đâu là giới hạn của mình. Khi cảm thấy đã dốc toàn lực nhưng tình "
                        + "hình vẫn không thể cứu vãn, họ sẽ để đối phương được như ý muốn. Sau đó Bảo Bình nguyện một mình hứng "
                        + "chịu mọi buồn bã cô đơn. Ngay khi bắt đầu yêu, người thuộc cung Bảo Bình đã xác định ái tình chính là "
                        + "một “canh bạc”. Một là có được tất cả, hai là “trắng tay” nhưng họ vẫn dũng cảm trao trái tim đi chẳng giữ lại điều gì.";
                break;
            case "Cung Song Ngư":
                image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imageZodiac/songngu.png")));
                description = "Nhạy cảm, thánh thiện, sợ hãi sự cô đơn - Song Ngư (19/2 – 20/3)\n"
                        + "Song Ngư là cung Hoàng đạo cực kỳ nhạy cảm. Họ có khả năng nhận thức mọi thay đổi dù nhỏ bé tinh tế nhất nhờ "
                        + "giác quan thứ Sáu cực nhạy. Song Ngư ghét sự giả dối nhưng lòng tốt vô hạn không cho phép họ từ chối bất cứ ai dù "
                        + "lí trí có nghi ngờ. Chinh phục thành công trái tim Song Ngư, bạn sẽ có được một người yêu tận tụy, "
                        + "sẵn sàng thay đổi bản thân vì tình yêu của mình.\n"
                        + "Tuy nhiên hãy chủ động từ bỏ nếu ngay từ đầu bạn đã không có ý định gắn bó với họ lâu dài, Song Ngư với "
                        + "tâm hồn trong sáng, ngây thơ không đáng bị đối xử như vậy. Người sinh ra dưới chòm sao Song Ngư cực kỳ sợ "
                        + "cô đơn. Họ luôn mong được có được một chỗ dựa vững chắc. Đôi lúc họ cũng khá cố chấp trong việc theo đuổi"
                        + " mơ ước của riêng mình. Sự… ấu trĩ đó thật ra cũng rất đáng yêu, người có ước mơ mới là người có cuộc sống tốt đẹp.";
                break;
            case "Cung Bạch Dương":
                image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imageZodiac/bachduong.png")));
                description = "Ấm áp, chính trực như Bạch Dương (21/3 – 19/4)\n"
                        + "Bạch Dương vốn là người thẳng thắn, chân thật, chẳng bao giờ biết “ủ mưu”. Họ thường rất nghiêm túc trong "
                        + "chuyện tình cảm và coi trọng thể diện. Sợ hãi sự cô đơn, Bạch Dương luôn gắn bó với gia đình, thích thú "
                        + "dùng sự hài hước của mình khiến mọi người vui vẻ.\n"
                        + "Sự ấm áp bề ngoài của Bạch Dương nhiều khi khiến người khác tưởng rằng họ rất dễ bị lừa gạt. Trên thực tế, "
                        + "cung Hoàng đạo này “nguy hiểm” hơn rất nhiều. Tuy nhiên, họ vẫn đặt trái tim "
                        + "lên trước những tính toán, nghi ngờ của mình. Sự mâu thuẫn đó nhiều lúc khiến Bạch Dương "
                        + "bị tổn thương. Họ hay nghĩ ngợi linh tinh, cũng hay chạy trốn để che giấu vết thương khi "
                        + "tôn nghiêm bị xúc phạm, thậm chí là đẩy bản thân đến bên bờ tuyệt vọng.";
                break;
            case "Cung Kim Ngưu":
                image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imageZodiac/kimnguu.png")));
                description = "Thật thà, lương thiện, dễ mềm lòng chính là Kim Ngưu (20/4 – 20/5)\n"
                        + "Kim Ngưu thuộc tuýp người luôn bày tỏ mọi cảm xúc của mình ra ngoài không giấu diếm. "
                        + "Tuy nhiên cách thể hiện cảm xúc của họ thường không khéo léo, không mềm mại, "
                        + "khiến mọi người khó chịu hoặc hiểu lầm. Mỗi khi cãi nhau, lời nói của Kim Ngưu "
                        + "có thể làm tổn thương đối phương đến cực điểm. Khi vui vẻ, người ta sẽ thấy Kim "
                        + "Ngưu nói nói cười cười nhưng một khi đã tức giận rồi thì một câu họ cũng chẳng thèm mở miệng.\n"
                        + "Điểm yếu lớn nhất của Kim Ngưu là dễ mềm lòng. Chỉ cần đối phương chịu cúi đầu "
                        + "nói xin lỗi và xin tha thứ thì cho dù lỗi lầm gì họ cũng có thể bỏ qua. Sợ nhất là "
                        + "phải thấy người khác rơi nước mắt, Kim Ngưu khi đó không những xót thương cảm thông mà "
                        + "thậm chí còn đồng ý ngay tắp lự mọi yêu cầu của người kia, kèm theo lời dỗ dành an ủi.";
                break;
            case "Cung Song Tử":
                image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imageZodiac/songtu.png")));
                description = "“Tự kỷ”, hài hước, yêu thương cuồng nhiệt là Song Tử (21/5 – 21/6)\n"
                        + "Song Tử là người có nhiều mong muốn trong tình yêu nhưng lại biết cách che giấu những mong mỏi đó của mình. "
                        + "Chính vì lẽ đó mà họ thường bị hiểu lầm là giả dối, chỉ người trong cuộc mới biết họ luôn là người "
                        + "trao đi chân tình nhưng lại bị chà đạp phũ phàng. Người ta chỉ trích Song Tử là kẻ đa tình, lăng nhăng "
                        + "nhưng kỳ thực đối với tình yêu họ cố chấp vô cùng. Dù cuộc sống biến đổi thế nào, Song Tử vẫn giữ thái độ cuồng nhiệt, "
                        + "say đắm với ái tình. Họ yêu rất sâu nhưng ít khi nói ra. Tình yêu của họ thường được thể hiện ra ngoài sau "
                        + "khi đã “phủ” thêm “lớp” vỏ hài hước, nhí nhố, vui tươi. Trong tình cảm họ linh hoạt, nhanh nhẹn, "
                        + "biết phát huy sức mạnh để giành thế chủ động về phía mình.\n"
                        + "Sự hiểu biết và năng khiếu hài hước của Song Tử khiến không ít người phải ngưỡng mộ, ghen tị. Nếu được "
                        + "là một nửa của Song Tử, bạn sẽ như chú chim dưới khung trời ngát xanh hạnh phúc, cả cuộc đời này không biết đến nỗi buồn hay chán nản.";
                break;
            case "Cung Cự Giải":
                image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imageZodiac/cugiai.png")));
                description = "Nhạy cảm, giàu đức hi sinh, còn ai ngoài Cự Giải (22/6 – 22/7)\n"
                        + "Cự Giải không hay nói lời từ chối, cũng chẳng hề biết dụng mưu. Cảm giác khi từ chối ai đó khiến họ "
                        + "áy náy và thấy tội lỗi vô cùng nên Cua thường chỉ dám nói “không” với những người thân thiết nhất.\n"
                        + "Vì tự ti nên trong chuyện tình cảm Cự Giải rất dễ bị tổn thương. Nhưng họ cũng chính là mẫu người "
                        + "có thể vì một chuyện siêu bé nhỏ giản đơn mà cảm thấy hạnh phúc, thỏa mãn. Cự Giải rất khó mở lòng, đặt "
                        + "trọn niềm tin và tình yêu ở một người. Họ dễ xúc động, mau nước mắt và một khi đã rơi vào trạng thái bi "
                        + "thương sầu thảm thì rất khó thoát ra. Họ sẵn sàng hy sinh bản thân vì người khác, dốc sức dốc lòng vì một mối quan hệ.";
                break;
            case "Cung Sư Tử":
                image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imageZodiac/sutu.png")));
                description = "Kiêu hãnh, dứt khoát, hết mình với bạn bè đó là Sư Tử (23/7 – 22/8) \n"
                        + "Nụ cười của người thuộc cung Sư Tử giản đơn, chân thành, thuần khiết nhất trên đời. Họ luôn "
                        + "cư xử với mọi người bằng thái độ tích cực trong khi những đau thương Sư Tử giữ lại cho mình. "
                        + "Rất ít người có may mắn được trông thấy nước mắt của người thuộc cung Sư Tử bởi niềm kiêu hãnh "
                        + "không cho phép họ rơi lệ trước mặt ai khác. Họ kiêu hãnh và trọng thể diện vô cùng.\n"
                        + "Sư Tử thường có nhiều bạn bè nhờ tính cách vui vẻ phóng khoáng cùng tài ăn nói đầy tính thuyết "
                        + "phục của mình. Bạn sẽ rất hạnh phúc nếu được Sư Tử coi là bạn. Họ luôn đối xử với bạn hữu như "
                        + "với anh chị em, sẵn sàng cho đi mà không cần đáp lại. Thà để người phụ mình, Sư Tử nhất quyết không phụ người.";
                break;
            case "Cung Xử Nữ":
                image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imageZodiac/xunu.png")));
                description = "Rất sợ cô đơn là Xử Nữ (23/8 – 23/9)\n"
                        + "Người sinh ra dưới cung Xử Nữ hấp dẫn người khác bằng sự uyên bác của mình. "
                        + "Bản thân họ luôn chơi vơi giữa mạng lưới cảm xúc cực kỳ phức tạp do chính bản thân tạo nên.\n"
                        + "Vẻ ngoài lạnh lùng, trầm mặc, ghê gớm nhưng kỳ thực Xử Nữ là người có nội tâm đặc "
                        + "biệt sâu sắc, chung thủy, căm ghét sự phản bội. Với kẻ thù, cung Hoàng đạo này không "
                        + "bao giờ nương tay nhưng khi ở cạnh những người yêu thương, họ lại hay hoài nghi, bất an, "
                        + "thiếu tự tin. Xử Nữ cũng hay có thói quen soi mói, xét nét chỉ trích khá cay nghiệt. "
                        + "Tuy vậy, họ là người “khẩu xà tâm phật”, không đối tốt với bạn sẽ chẳng có chuyện họ "
                        + "phê phán gay gắt đến thế. Xử Nữ không thích gần gũi người lạ, nhưng đối với người thân "
                        + "lại thích “dính như sam”, quan tâm chăm sóc tận tình.";
                break;
            case "Cung Thiên Bình":
                image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imageZodiac/thienbinh.png")));
                description = "Thanh lịch, công tâm chính là Thiên Bình (24/9 – 23/10)\n"
                        + "Thiên Bình trời sinh đã sở hữu vẻ ngoài nho nhã cùng tài năng ưu việt, "
                        + "bản thân họ cũng thích được mọi người ngưỡng mộ, tán dương. Thiên Bình hầu"
                        + " như chẳng bao giờ tranh giành, cướp giật của ai thứ gì, cũng chẳng bày tỏ "
                        + "sự tức giận, cay cú khi món đồ thuộc quyền sở hữu bị người khác tước đoạt. Với họ, "
                        + "những hành động cũng như cảm xúc đó thật yếu đuối, đáng xấu hổ và một khi thể hiện ra "
                        + "ngoài sẽ ngay lập tức phá hủy hình tượng ổn định, thanh tao mà họ xây dựng cho mình.\n"
                        + "Thiên Bình làm gì cũng muốn có bạn đồng hành. Họ ghét sự cô độc và cả cuộc "
                        + "đời luôn mong mỏi tìm cho mình một bến đỗ bình yên. Tìm được rồi, Thiên Bình "
                        + "không ngần ngại việc gắn bó bên người ấy, đạp bằng mọi thử thách dù là khoảng cách địa lý hay tuổi tác, thời gian.";
                break;
            case "Cung Thiên Yết":
                image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imageZodiac/thienyet.png")));
                description = "“Khẩu xà tâm Phật”, cảm xúc cực đoan là đặc trưng của Thiên Yết (24/10 – 22/11)\n"
                        + "Thiên Yết là kiểu người “khẩu xà tâm Phật”, thường buông lời lẽ cay độc "
                        + "dù trong lòng yêu mến, trân trọng vô cùng. Họ là người hiểu chuyện, kiểm soát "
                        + "cảm xúc cũng tốt nhưng ai bảo đã trót khoác lên mình lớp mặt nạ hằn học với cuộc đời? "
                        + "Trong tình yêu, Thiên Yết là những người khó rung động, khó tin tưởng, khó mở lòng "
                        + "nhưng một khi đã yêu ai thì chẳng dễ gì bỏ cuộc buông tay. Vẻ ngoài tỉnh táo, lạnh "
                        + "lùng khi ấy sẽ từ từ được bóc tách, phơi bày một trái tim cuồng nhiệt, ấm áp, chân thành, chung thủy vô cùng.\n"
                        + "Nếu bị phản bội, Thiên Yết ngay lập tức sẽ biến thành một quả bom đích thực, bởi họ "
                        + "là người yêu ghét đều cực điểm, cực đoan. Sau này khi mọi chuyện đã qua đi, bất kể "
                        + "bạn dốc sức cứu vãn thế nào cũng đừng mong có được niềm tin từ Thiên Yết một lần nữa…";
                break;
            case "Cung Nhân Mã":
                image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imageZodiac/nhanma.png")));
                description = "Cảm thấy cô đơn giữa vòng tròn bè bạn - Nhân Mã (23/11 – 21/12)\n"
                        + "Bẩm sinh đã có nhân duyên tốt, Mã Mã lại càng được mọi người yêu quý nhờ "
                        + "sự “mồm mép”, láu cá của mình. Nhân Mã hào phóng, yêu tự do, thích "
                        + "giao tiếp nên cảm giác mà họ ghét bỏ nhất là khi phải một mình trơ "
                        + "trọi cô đơn ở một nơi trống trải. Nhiều bạn bè là thế nhưng mỗi khi "
                        + "gặp chuyện, Nhân Mã thường chỉ biết một mình gặm nhấm nỗi buồn. Đau đến nhỏ máu, họ vẫn sẽ gắng gượng mỉm cười.\n"
                        + "Khi bắt đầu một đoạn tình cảm, Nhân Mã đào hoa thường chỉ trao đi một "
                        + "phần nhỏ con tim mình. Trải qua một khoảng thời gian dài với muôn vàn "
                        + "thử thách, họ mới chịu tin tưởng, gắn bó, cam kết với một người nào đó. "
                        + "Đừng lo lắng nếu Nhân Mã của bạn cứ mải mê khắp chốn rong chơi. Đúng là họ cực "
                        + "kỳ ham mê mạo hiểm, trải nghiệm và tôn thờ tự do nhưng Nhân Mã cũng rất yêu quý "
                        + "mái ấm gia đình của mình. Họ luôn cần một nơi bình yên để trở về sau mỗi chuyến thám hiểm..";
                break;
            case "Cung Ma Kết":
                image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imageZodiac/maket.png")));
                description = "Ẩn sau vẻ ngoài lạnh lùng là một nội tâm dữ dội như Ma Kết (22/12 – 19/1)\n"
                        + "Ma Kết thích được “một mình một thế giới” để mặc sức ngẫm nghĩ về cuộc sống. "
                        + "Những biến động trong thế giới nội tâm của một Ma Kết thường đến bất chợt và mỗi "
                        + "khi xuất hiện đều khá dữ dội. Họ có thể đang vui tươi đột nhiên trở nên trầm mặc vì "
                        + "một ý nghĩ thoáng qua, để rồi lại có thể bất chợt cười vui rạng rỡ.\n"
                        + "Ma Kết có tấm lòng lương thiện, biết cảm thông. Họ luôn đem lại cảm giác an toàn, "
                        + "đáng tin cậy cho người đối diện. Ma Kết cũng thích những thứ khiến trái tim băng giá "
                        + "cô đơn của họ trở nên ấm áp, được chở che. Do trưởng thành sớm nên các Ma Kết luôn biết"
                        + " rõ mình muốn gì. Họ cũng sẽ không ngừng cố gắng để đạt được "
                        + "điều đó, đặc biệt là khi đã lập gia đình.";
                break;
            default:
                break;
        }
        descriptionLabel.setText("<html>" + description.replace("\n", "<br>") + "</html>");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        descriptionLabel = new javax.swing.JLabel();
        image = new javax.swing.JLabel();
        close = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(498, 597));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                exitForm(evt);
            }
        });
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        descriptionLabel.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        add(descriptionLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 478, 420));
        add(image, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 150, 150));

        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/buttons/close.png"))); // NOI18N
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                closeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                closeMouseExited(evt);
            }
        });
        add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(458, 8, -1, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/buttons/khungMOTA.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -2, -1, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Exit the Application
     */
    private void exitForm(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_exitForm
        System.exit(0);
    }//GEN-LAST:event_exitForm

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        NGUOIDUNG test = new NGUOIDUNG();
        test.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_closeMouseClicked

    private void closeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseEntered
        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/buttons/close-hover.png")));
    }//GEN-LAST:event_closeMouseEntered

    private void closeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseExited
        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/buttons/close.png")));
    }//GEN-LAST:event_closeMouseExited

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                NGUOIDUNG test = new NGUOIDUNG();
                new MOTACUNG(test.getLBLRes()).setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel close;
    private javax.swing.JLabel descriptionLabel;
    private javax.swing.JLabel image;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
