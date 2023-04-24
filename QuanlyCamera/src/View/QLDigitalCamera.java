package View;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelCamera.DigitalCamera;
import modelCamera.DigitalCameraJFR;
import modelCamera.InstantCamera;

public class QLDigitalCamera extends javax.swing.JFrame {

    SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");
    DigitalCameraJFR fr2 = new DigitalCameraJFR();

    public QLDigitalCamera() {
        initComponents();
        setLocationRelativeTo(null);
        open();
    }

    public void open() {
        fr2.readfile();
        Table();
    }

    public void Table() {
        DefaultTableModel model = (DefaultTableModel) tbcamera.getModel();
        //reset table
        model.setRowCount(0);
        for (DigitalCamera cr : fr2.getAllCamera()) {
            Object[] rowData = new Object[10];
            rowData[0] = cr.getMasp();
            rowData[1] = cr.getTensp();
            rowData[2] = date.format(cr.getNgaynhap());
            rowData[3] = cr.getGia();
            rowData[4] = cr.getSoluong();
            rowData[5] = cr.getLoaipin();
            rowData[6] = cr.getDophangiai();
            rowData[7] = cr.getDungluongbonhotrong();
            rowData[8] = cr.getLoaicambien();
            rowData[9] = cr.toString();
            //up table
            model.addRow(rowData);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnsxaz = new javax.swing.JButton();
        txtsoluong = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbcamera = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtloaipin = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btndelete = new javax.swing.JButton();
        txtdophangiai = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnreset = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btnsave = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btnfix = new javax.swing.JButton();
        txtgia = new javax.swing.JTextField();
        btntimkiem = new javax.swing.JButton();
        txtngaynhap = new javax.swing.JTextField();
        jlbsts = new javax.swing.JLabel();
        txtmasp = new javax.swing.JTextField();
        btnsxza = new javax.swing.JButton();
        txttensp = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtbonho = new javax.swing.JTextField();
        txtcambien = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnsxaz.setText("Sắp Xếp A-Z");
        btnsxaz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsxazActionPerformed(evt);
            }
        });

        txtsoluong.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtsoluongFocusLost(evt);
            }
        });

        jLabel7.setText("Loại pin   :");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("QUẢN LÝ DigitalCamera");

        tbcamera.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã Camera", "Tên Camera", "Ngày Nhập", "Giá", "Số Lượng", "Loại pin", "Độ Phân giải", "Dung Lượng bộ nhớ", "Loại cảm biến", "Tổng Tiền"
            }
        ));
        tbcamera.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbcameraMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbcamera);

        jLabel8.setText("     Độ Phân Giải  :");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Mã Camera :");

        txtloaipin.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtloaipinFocusLost(evt);
            }
        });

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Tên Camera :");

        btndelete.setText("Xóa");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });

        txtdophangiai.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtdophangiaiFocusLost(evt);
            }
        });

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText(" Ngày Nhập :");

        btnreset.setText("Reset");
        btnreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnresetActionPerformed(evt);
            }
        });

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Giá :");

        btnsave.setText("Lưu");
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Số Lượng :");

        btnfix.setText("Sửa");
        btnfix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfixActionPerformed(evt);
            }
        });

        txtgia.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtgiaFocusLost(evt);
            }
        });
        txtgia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtgiaActionPerformed(evt);
            }
        });

        btntimkiem.setText("Tìm Kiếm");
        btntimkiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntimkiemActionPerformed(evt);
            }
        });

        txtngaynhap.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtngaynhapFocusLost(evt);
            }
        });
        txtngaynhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtngaynhapActionPerformed(evt);
            }
        });

        jlbsts.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbsts.setText("Tình Trạng");

        txtmasp.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtmaspFocusLost(evt);
            }
        });
        txtmasp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmaspActionPerformed(evt);
            }
        });

        btnsxza.setText("Sắp Xếp Z-A");
        btnsxza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsxzaActionPerformed(evt);
            }
        });

        txttensp.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txttenspFocusLost(evt);
            }
        });

        jLabel9.setText("Dung lượng bộ nhớ :");

        jLabel10.setText("         Loại cảm biến  :");

        txtbonho.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtbonhoFocusLost(evt);
            }
        });

        txtcambien.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtcambienFocusLost(evt);
            }
        });

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 658, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 761, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(107, 107, 107)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtmasp, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txttensp, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtngaynhap, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtgia, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtsoluong, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(44, 44, 44)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(btnreset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnfix, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(27, 27, 27)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnsave)
                                            .addComponent(btndelete, javax.swing.GroupLayout.Alignment.TRAILING)))
                                    .addComponent(btntimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnsxza, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                                        .addComponent(btnsxaz, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtbonho, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtcambien, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE)
                                .addComponent(txtdophangiai, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtloaipin, javax.swing.GroupLayout.Alignment.LEADING))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jlbsts, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtmasp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btntimkiem))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txttensp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnreset)
                    .addComponent(btndelete))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtngaynhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnfix)
                    .addComponent(btnsave))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtgia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtsoluong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(txtloaipin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtdophangiai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtbonho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtcambien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnsxaz)
                        .addGap(18, 18, 18)
                        .addComponent(btnsxza)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlbsts)
                .addGap(12, 12, 12))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnsxazActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsxazActionPerformed
        // TODO add your handling code here:
        fr2.sortaz();
        Table();
        jlbsts.setText("Sắp xếp thành công");
    }//GEN-LAST:event_btnsxazActionPerformed

    private void tbcameraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbcameraMouseClicked
        // TODO add your handling code here
        int id = tbcamera.rowAtPoint(evt.getPoint());
        String masp = tbcamera.getValueAt(id, 0).toString();
        DigitalCamera cr = fr2.getCameraId(masp);
        find(cr);

    }//GEN-LAST:event_tbcameraMouseClicked

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        // TODO add your handling code here:
        if (checkform()) {
            if (fr2.delCamera(txtmasp.getText()) > 0) {
                fr2.writefile();
                Table();
                jlbsts.setText("xóa thành công");

            }
        }
    }//GEN-LAST:event_btndeleteActionPerformed

    public void reset() {
        txtmasp.setText("");
        txttensp.setText("");
        txtngaynhap.setText("");
        txtgia.setText("");
        txtsoluong.setText("");
        txtloaipin.setText("");
        txtdophangiai.setText("");
        txtbonho.setText("");
        txtcambien.setText("");

    }
    private void btnresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnresetActionPerformed
        // TODO add your handling code here:
        reset();
        jlbsts.setText("thành công");
    }//GEN-LAST:event_btnresetActionPerformed

    public boolean checkform() {
        if (txtmasp.getText().isEmpty() || txttensp.getText().isEmpty()
                || txtngaynhap.getText().isEmpty() || txtgia.getText().isEmpty()
                || txtsoluong.getText().isEmpty() || txtloaipin.getText().isEmpty()
                || txtdophangiai.getText().isEmpty() || txtbonho.getText().isEmpty()
                || txtcambien.getText().isEmpty()) {
            return false;
        }
        return true;
    }

    public DigitalCamera getModel() throws ParseException {
        DigitalCamera cr = new DigitalCamera();
        cr.setMasp(txtmasp.getText());
        cr.setTensp(txttensp.getText());
        cr.setNgaynhap(date.parse(txtngaynhap.getText()));
        cr.setGia(Double.parseDouble(txtgia.getText()));
        cr.setSoluong(Double.parseDouble(txtsoluong.getText()));
        cr.setLoaipin(txtloaipin.getText());
        cr.setDophangiai(txtdophangiai.getText());
        cr.setDungluongbonhotrong(txtbonho.getText());
        cr.setLoaicambien(txtcambien.getText());
        return cr;
    }
    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
        // TODO add your handling code here:
        if (checkform()) {
            try {
                DigitalCamera cr = getModel();
                if (fr2.add(cr) > 0) {
                    jlbsts.setText("lưu thành công");
                    fr2.writefile();
                    Table();

                }

            } catch (ParseException ex) {
                Logger.getLogger(QuanLyCR.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {
            JOptionPane.showMessageDialog(this, "Bạn Chưa Nhập Đủ ");
        }
    }//GEN-LAST:event_btnsaveActionPerformed

    private void btnfixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfixActionPerformed
        // TODO add your handling code here:
        if (txtmasp.getText().isEmpty()) {

        } else {
            try {
                DigitalCamera crr = getModel();
                if (fr2.edit(crr) > 0) {
                    fr2.writefile();
                    Table();
                    jlbsts.setText("Cập nhập thành công");

                }
            } catch (ParseException ex) {
                Logger.getLogger(QuanLyCR.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnfixActionPerformed

    private void txtgiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtgiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtgiaActionPerformed
    public void find(DigitalCamera crr) {
        txtmasp.setText(crr.getMasp());
        txttensp.setText(crr.getTensp());
        txtngaynhap.setText(date.format(crr.getNgaynhap()));
        txtgia.setText(Double.toString(crr.getGia()));
        txtsoluong.setText(Double.toString(crr.getSoluong()));
        txtloaipin.setText(crr.getLoaipin());
        txtdophangiai.setText(crr.getDophangiai());
        txtbonho.setText(crr.getDungluongbonhotrong());
        txtcambien.setText(crr.getLoaicambien());

    }
    private void btntimkiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntimkiemActionPerformed
        // TODO add your handling code here:
        if (txtmasp.getText().isEmpty() && txttensp.getText().isEmpty()) {
            jlbsts.setText("Chưa Nhập");
        } else {
            DigitalCamera cr = fr2.find(txtmasp.getText(), txttensp.getText());
            if (cr != null) {
                find(cr);
            } else {
                JOptionPane.showMessageDialog(this, "Không Tìm Thấy");
            }
        }
    }//GEN-LAST:event_btntimkiemActionPerformed

    private void txtngaynhapFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtngaynhapFocusLost
        // TODO add your handling code here:
        //2so,2so,4so,
        String test = txtngaynhap.getText();
        String mau = "\\d{2}\\/\\d{2}\\/\\d{4}";
        if (test.isEmpty()) {
            jlbsts.setText("không được bỏ trống ngày nhập");

        } else {
            if (!test.matches(mau)) {
                jlbsts.setText("sai định dạng ngày nhập vd:20/10/2020");

            }

        }

    }//GEN-LAST:event_txtngaynhapFocusLost

    private void txtngaynhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtngaynhapActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtngaynhapActionPerformed

    private void txtmaspActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmaspActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmaspActionPerformed

    private void btnsxzaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsxzaActionPerformed
        fr2.sortza();
        Table();
        jlbsts.setText("Sắp xếp thành công");
    }//GEN-LAST:event_btnsxzaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        dispose();
        CTQL ql = new CTQL();
        ql.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtmaspFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtmaspFocusLost
        // TODO add your handling code here:
        if (txtmasp.getText().isEmpty()) {
            jlbsts.setText("không được bỏ trống mã sản phẩm");

        }
    }//GEN-LAST:event_txtmaspFocusLost

    private void txttenspFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txttenspFocusLost
        // TODO add your handling code here:
        if (txttensp.getText().isEmpty()) {
            jlbsts.setText("không được bỏ trống tên sản phẩm");

        }
    }//GEN-LAST:event_txttenspFocusLost

    private void txtgiaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtgiaFocusLost
        // TODO add your handling code here:
        String test = txtgia.getText();
        String mau = "(^-)*\\d+(.\\d+)*";
        if (txtgia.getText().isEmpty()) {
            jlbsts.setText("không được bỏ trống giá");

        } else {
            if (!test.matches(mau)) {
                jlbsts.setText("sai định dạng giá phải là số");

            }
        }
    }//GEN-LAST:event_txtgiaFocusLost

    private void txtsoluongFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtsoluongFocusLost
        // TODO add your handling code here:
        String test = txtsoluong.getText();
        String mau = "(^-)*\\d+(.\\d+)*";
        if (test.isEmpty()) {
            jlbsts.setText("không được bỏ trống số lượng");

        } else {
            if (!test.matches(mau)) {
                jlbsts.setText("sai định dạng ,giá phải là số");

            }
        }
    }//GEN-LAST:event_txtsoluongFocusLost

    private void txtloaipinFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtloaipinFocusLost
        // TODO add your handling code here:
        if (txtloaipin.getText().isEmpty()) {
            jlbsts.setText("không được bỏ trống loại pin");

        }
    }//GEN-LAST:event_txtloaipinFocusLost

    private void txtdophangiaiFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtdophangiaiFocusLost
        // TODO add your handling code here:
        if (txtdophangiai.getText().isEmpty()) {
            jlbsts.setText("không được bỏ độ phân giải");

        }
    }//GEN-LAST:event_txtdophangiaiFocusLost

    private void txtbonhoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtbonhoFocusLost
        // TODO add your handling code here:
        if (txtbonho.getText().isEmpty()) {
            jlbsts.setText("không được bỏ trống bộ nhớ");

        }
    }//GEN-LAST:event_txtbonhoFocusLost

    private void txtcambienFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtcambienFocusLost
        // TODO add your handling code here:
        if (txtcambien.getText().isEmpty()) {
            jlbsts.setText("không được bỏ trống loại cảm biến");

        }
    }//GEN-LAST:event_txtcambienFocusLost

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
            java.util.logging.Logger.getLogger(QLDigitalCamera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QLDigitalCamera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QLDigitalCamera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QLDigitalCamera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QLDigitalCamera().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnfix;
    private javax.swing.JButton btnreset;
    private javax.swing.JButton btnsave;
    private javax.swing.JButton btnsxaz;
    private javax.swing.JButton btnsxza;
    private javax.swing.JButton btntimkiem;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlbsts;
    private javax.swing.JTable tbcamera;
    private javax.swing.JTextField txtbonho;
    private javax.swing.JTextField txtcambien;
    private javax.swing.JTextField txtdophangiai;
    private javax.swing.JTextField txtgia;
    private javax.swing.JTextField txtloaipin;
    private javax.swing.JTextField txtmasp;
    private javax.swing.JTextField txtngaynhap;
    private javax.swing.JTextField txtsoluong;
    private javax.swing.JTextField txttensp;
    // End of variables declaration//GEN-END:variables
}
