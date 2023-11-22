/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.DuAn1.View;

import com.DuAn1.Utils.XImage;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author Hoàng Nhân
 */
public class Main extends javax.swing.JFrame {

    int with = 260;
    int hight = 676;
    Color color = new Color(251, 224, 213, 255);

    public Main() {
        initComponents();
        init();
    }

    public void init() {
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        this.setIconImage(XImage.getAppIcon());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        pnMain = new javax.swing.JPanel();
        pnMenu = new javax.swing.JPanel();
        lblBanHang = new javax.swing.JLabel();
        lblSanPham = new javax.swing.JLabel();
        lblNhanVien = new javax.swing.JLabel();
        lblDoanhThu = new javax.swing.JLabel();
        lblGioiTheu = new javax.swing.JLabel();
        lblTroGiup = new javax.swing.JLabel();
        lblDangXuat = new javax.swing.JLabel();
        lblHoaDon = new javax.swing.JLabel();
        lblTongQuan = new javax.swing.JLabel();
        pnHeader = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblTenUser = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblThu = new javax.swing.JLabel();
        pnMain_from = new javax.swing.JPanel();
        Tong = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        TongDThu = new javax.swing.JPanel();
        Tong_DT_Ngay = new javax.swing.JPanel();
        Tong_HD = new javax.swing.JPanel();
        BanHang = new javax.swing.JPanel();
        pnThucDon = new javax.swing.JPanel();
        pnHoaDon = new javax.swing.JPanel();
        pnChiTiet_ThuTien = new javax.swing.JPanel();
        txtKhachDua = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtTraLai = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        rdoInBill = new javax.swing.JRadioButton();
        rdoKhongInBill = new javax.swing.JRadioButton();
        txtTong = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        pnThuTien_BanHang = new javax.swing.JPanel();
        btnXoa_Form_BanHang = new javax.swing.JButton();
        btnThuTien_BanHang = new javax.swing.JButton();
        SanPham = new javax.swing.JPanel();
        pnThemSanPham = new javax.swing.JPanel();
        pnHinhAnh = new javax.swing.JPanel();
        pnDanhSach = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        NhanVien = new javax.swing.JPanel();
        pnThemNhanVien = new javax.swing.JPanel();
        pnDanhSachNhanVien = new javax.swing.JPanel();
        HoaDon = new javax.swing.JPanel();
        DoanhThu = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnMain.setBackground(new java.awt.Color(221, 190, 169));
        pnMain.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnMenu.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N

        lblBanHang.setFont(new java.awt.Font("Verdana", 0, 15)); // NOI18N
        lblBanHang.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBanHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imges/shop.png"))); // NOI18N
        lblBanHang.setText("Bán Hàng");
        lblBanHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBanHangMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblBanHangMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblBanHangMouseExited(evt);
            }
        });

        lblSanPham.setFont(new java.awt.Font("Verdana", 0, 15)); // NOI18N
        lblSanPham.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSanPham.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imges/product.png"))); // NOI18N
        lblSanPham.setText("Sản Phẩm");
        lblSanPham.setPreferredSize(new java.awt.Dimension(71, 20));
        lblSanPham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSanPhamMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblSanPhamMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblSanPhamMouseExited(evt);
            }
        });

        lblNhanVien.setFont(new java.awt.Font("Verdana", 0, 15)); // NOI18N
        lblNhanVien.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNhanVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imges/staff.png"))); // NOI18N
        lblNhanVien.setText("Nhân Viên");
        lblNhanVien.setPreferredSize(new java.awt.Dimension(71, 20));
        lblNhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblNhanVienMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblNhanVienMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblNhanVienMouseExited(evt);
            }
        });

        lblDoanhThu.setFont(new java.awt.Font("Verdana", 0, 15)); // NOI18N
        lblDoanhThu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDoanhThu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imges/bill.png"))); // NOI18N
        lblDoanhThu.setText("Doanh Thu");
        lblDoanhThu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDoanhThuMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblDoanhThuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblDoanhThuMouseExited(evt);
            }
        });

        lblGioiTheu.setFont(new java.awt.Font("Verdana", 0, 15)); // NOI18N
        lblGioiTheu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblGioiTheu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imges/info.png"))); // NOI18N
        lblGioiTheu.setText("Giới Thiệu");
        lblGioiTheu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblGioiTheuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblGioiTheuMouseExited(evt);
            }
        });

        lblTroGiup.setFont(new java.awt.Font("Verdana", 0, 15)); // NOI18N
        lblTroGiup.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTroGiup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imges/help.png"))); // NOI18N
        lblTroGiup.setText("Trợ giúp");
        lblTroGiup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblTroGiupMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblTroGiupMouseExited(evt);
            }
        });

        lblDangXuat.setFont(new java.awt.Font("Verdana", 0, 15)); // NOI18N
        lblDangXuat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDangXuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imges/logout.png"))); // NOI18N
        lblDangXuat.setText("Đăng xuẩt");
        lblDangXuat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblDangXuatMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblDangXuatMouseExited(evt);
            }
        });

        lblHoaDon.setFont(new java.awt.Font("Verdana", 0, 15)); // NOI18N
        lblHoaDon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHoaDon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imges/bill_.png"))); // NOI18N
        lblHoaDon.setText("Hoá Đơn");
        lblHoaDon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblHoaDonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblHoaDonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblHoaDonMouseExited(evt);
            }
        });

        lblTongQuan.setFont(new java.awt.Font("Verdana", 0, 15)); // NOI18N
        lblTongQuan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTongQuan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imges/view.png"))); // NOI18N
        lblTongQuan.setText("Tổng Quan");
        lblTongQuan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblTongQuanMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblTongQuanMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblTongQuanMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnMenuLayout = new javax.swing.GroupLayout(pnMenu);
        pnMenu.setLayout(pnMenuLayout);
        pnMenuLayout.setHorizontalGroup(
            pnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBanHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnMenuLayout.createSequentialGroup()
                .addGroup(pnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblGioiTheu, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTroGiup, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDangXuat, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDoanhThu, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTongQuan, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnMenuLayout.setVerticalGroup(
            pnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnMenuLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(lblTongQuan, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lblBanHang, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lblSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lblNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lblHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lblDoanhThu, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addComponent(lblGioiTheu, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lblTroGiup, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lblDangXuat, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pnMain.add(pnMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 42, 0, 676));

        pnHeader.setBackground(new java.awt.Color(255, 102, 102));
        pnHeader.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Hello,");
        pnHeader.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 10, -1, -1));

        lblTenUser.setText("Admin");
        pnHeader.add(lblTenUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(1179, 10, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imges/User.png"))); // NOI18N
        pnHeader.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1227, 8, -1, -1));

        lblThu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imges/So.png"))); // NOI18N
        lblThu.setText("  ");
        lblThu.setToolTipText("");
        lblThu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblThuMouseClicked(evt);
            }
        });
        pnHeader.add(lblThu, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 8, -1, -1));

        pnMain.add(pnHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 42));

        pnMain_from.setBackground(new java.awt.Color(204, 204, 0));
        pnMain_from.setLayout(new java.awt.CardLayout());

        Tong.setBackground(new java.awt.Color(255, 204, 204));
        Tong.setPreferredSize(new java.awt.Dimension(1280, 680));

        TongDThu.setBackground(new java.awt.Color(204, 255, 51));

        javax.swing.GroupLayout TongDThuLayout = new javax.swing.GroupLayout(TongDThu);
        TongDThu.setLayout(TongDThuLayout);
        TongDThuLayout.setHorizontalGroup(
            TongDThuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 342, Short.MAX_VALUE)
        );
        TongDThuLayout.setVerticalGroup(
            TongDThuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 164, Short.MAX_VALUE)
        );

        Tong_DT_Ngay.setBackground(new java.awt.Color(204, 255, 51));

        javax.swing.GroupLayout Tong_DT_NgayLayout = new javax.swing.GroupLayout(Tong_DT_Ngay);
        Tong_DT_Ngay.setLayout(Tong_DT_NgayLayout);
        Tong_DT_NgayLayout.setHorizontalGroup(
            Tong_DT_NgayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 342, Short.MAX_VALUE)
        );
        Tong_DT_NgayLayout.setVerticalGroup(
            Tong_DT_NgayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 164, Short.MAX_VALUE)
        );

        Tong_HD.setBackground(new java.awt.Color(204, 255, 51));

        javax.swing.GroupLayout Tong_HDLayout = new javax.swing.GroupLayout(Tong_HD);
        Tong_HD.setLayout(Tong_HDLayout);
        Tong_HDLayout.setHorizontalGroup(
            Tong_HDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 342, Short.MAX_VALUE)
        );
        Tong_HDLayout.setVerticalGroup(
            Tong_HDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 164, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(Tong_DT_Ngay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                .addComponent(Tong_HD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102)
                .addComponent(TongDThu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Tong_DT_Ngay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tong_HD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TongDThu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout TongLayout = new javax.swing.GroupLayout(Tong);
        Tong.setLayout(TongLayout);
        TongLayout.setHorizontalGroup(
            TongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        TongLayout.setVerticalGroup(
            TongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TongLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(431, Short.MAX_VALUE))
        );

        pnMain_from.add(Tong, "card7");

        BanHang.setBackground(new java.awt.Color(255, 0, 51));

        pnThucDon.setBackground(new java.awt.Color(204, 255, 204));

        javax.swing.GroupLayout pnThucDonLayout = new javax.swing.GroupLayout(pnThucDon);
        pnThucDon.setLayout(pnThucDonLayout);
        pnThucDonLayout.setHorizontalGroup(
            pnThucDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 781, Short.MAX_VALUE)
        );
        pnThucDonLayout.setVerticalGroup(
            pnThucDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        pnChiTiet_ThuTien.setBackground(new java.awt.Color(255, 102, 51));
        pnChiTiet_ThuTien.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        pnChiTiet_ThuTien.add(txtKhachDua, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 75, 207, 39));

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel3.setText("Khánh đưa");
        pnChiTiet_ThuTien.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 82, -1, -1));
        pnChiTiet_ThuTien.add(txtTraLai, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 144, 207, 35));

        jLabel14.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel14.setText("Trả lại");
        pnChiTiet_ThuTien.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 149, -1, -1));

        buttonGroup1.add(rdoInBill);
        rdoInBill.setText("In Hoá đơn");
        pnChiTiet_ThuTien.add(rdoInBill, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 210, -1, -1));

        buttonGroup1.add(rdoKhongInBill);
        rdoKhongInBill.setText("Không in hoá đơn");
        pnChiTiet_ThuTien.add(rdoKhongInBill, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 210, -1, -1));

        txtTong.setText("1.000.000");
        pnChiTiet_ThuTien.add(txtTong, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 21, 207, 36));

        jLabel15.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel15.setText("Tổng Tiền");
        pnChiTiet_ThuTien.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, 27, -1, -1));

        pnThuTien_BanHang.setBackground(new java.awt.Color(255, 204, 204));

        btnXoa_Form_BanHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imges/delle.png"))); // NOI18N
        btnXoa_Form_BanHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoa_Form_BanHangActionPerformed(evt);
            }
        });

        btnThuTien_BanHang.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        btnThuTien_BanHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imges/pay.png"))); // NOI18N
        btnThuTien_BanHang.setText("Thu Tiền");
        btnThuTien_BanHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThuTien_BanHangActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnThuTien_BanHangLayout = new javax.swing.GroupLayout(pnThuTien_BanHang);
        pnThuTien_BanHang.setLayout(pnThuTien_BanHangLayout);
        pnThuTien_BanHangLayout.setHorizontalGroup(
            pnThuTien_BanHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnThuTien_BanHangLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btnXoa_Form_BanHang)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnThuTien_BanHang, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnThuTien_BanHangLayout.setVerticalGroup(
            pnThuTien_BanHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnThuTien_BanHangLayout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(pnThuTien_BanHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnXoa_Form_BanHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnThuTien_BanHang, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout pnHoaDonLayout = new javax.swing.GroupLayout(pnHoaDon);
        pnHoaDon.setLayout(pnHoaDonLayout);
        pnHoaDonLayout.setHorizontalGroup(
            pnHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnChiTiet_ThuTien, javax.swing.GroupLayout.DEFAULT_SIZE, 499, Short.MAX_VALUE)
            .addComponent(pnThuTien_BanHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnHoaDonLayout.setVerticalGroup(
            pnHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnHoaDonLayout.createSequentialGroup()
                .addGap(0, 603, Short.MAX_VALUE)
                .addComponent(pnChiTiet_ThuTien, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnThuTien_BanHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout BanHangLayout = new javax.swing.GroupLayout(BanHang);
        BanHang.setLayout(BanHangLayout);
        BanHangLayout.setHorizontalGroup(
            BanHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BanHangLayout.createSequentialGroup()
                .addComponent(pnThucDon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnHoaDon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        BanHangLayout.setVerticalGroup(
            BanHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnThucDon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnHoaDon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pnMain_from.add(BanHang, "card2");

        SanPham.setBackground(new java.awt.Color(153, 204, 0));

        pnThemSanPham.setBackground(new java.awt.Color(255, 102, 102));

        javax.swing.GroupLayout pnHinhAnhLayout = new javax.swing.GroupLayout(pnHinhAnh);
        pnHinhAnh.setLayout(pnHinhAnhLayout);
        pnHinhAnhLayout.setHorizontalGroup(
            pnHinhAnhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 134, Short.MAX_VALUE)
        );
        pnHinhAnhLayout.setVerticalGroup(
            pnHinhAnhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 209, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnThemSanPhamLayout = new javax.swing.GroupLayout(pnThemSanPham);
        pnThemSanPham.setLayout(pnThemSanPhamLayout);
        pnThemSanPhamLayout.setHorizontalGroup(
            pnThemSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnThemSanPhamLayout.createSequentialGroup()
                .addContainerGap(536, Short.MAX_VALUE)
                .addComponent(pnHinhAnh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );
        pnThemSanPhamLayout.setVerticalGroup(
            pnThemSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnThemSanPhamLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(pnHinhAnh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout pnDanhSachLayout = new javax.swing.GroupLayout(pnDanhSach);
        pnDanhSach.setLayout(pnDanhSachLayout);
        pnDanhSachLayout.setHorizontalGroup(
            pnDanhSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnDanhSachLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 533, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnDanhSachLayout.setVerticalGroup(
            pnDanhSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnDanhSachLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 654, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout SanPhamLayout = new javax.swing.GroupLayout(SanPham);
        SanPham.setLayout(SanPhamLayout);
        SanPhamLayout.setHorizontalGroup(
            SanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SanPhamLayout.createSequentialGroup()
                .addComponent(pnThemSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnDanhSach, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        SanPhamLayout.setVerticalGroup(
            SanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnThemSanPham, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnDanhSach, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pnMain_from.add(SanPham, "card3");

        NhanVien.setBackground(new java.awt.Color(51, 255, 204));

        pnThemNhanVien.setBackground(new java.awt.Color(255, 204, 204));

        javax.swing.GroupLayout pnThemNhanVienLayout = new javax.swing.GroupLayout(pnThemNhanVien);
        pnThemNhanVien.setLayout(pnThemNhanVienLayout);
        pnThemNhanVienLayout.setHorizontalGroup(
            pnThemNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 715, Short.MAX_VALUE)
        );
        pnThemNhanVienLayout.setVerticalGroup(
            pnThemNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 680, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnDanhSachNhanVienLayout = new javax.swing.GroupLayout(pnDanhSachNhanVien);
        pnDanhSachNhanVien.setLayout(pnDanhSachNhanVienLayout);
        pnDanhSachNhanVienLayout.setHorizontalGroup(
            pnDanhSachNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 565, Short.MAX_VALUE)
        );
        pnDanhSachNhanVienLayout.setVerticalGroup(
            pnDanhSachNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout NhanVienLayout = new javax.swing.GroupLayout(NhanVien);
        NhanVien.setLayout(NhanVienLayout);
        NhanVienLayout.setHorizontalGroup(
            NhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NhanVienLayout.createSequentialGroup()
                .addComponent(pnThemNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnDanhSachNhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        NhanVienLayout.setVerticalGroup(
            NhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnThemNhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnDanhSachNhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pnMain_from.add(NhanVien, "card4");

        HoaDon.setBackground(new java.awt.Color(153, 102, 255));

        javax.swing.GroupLayout HoaDonLayout = new javax.swing.GroupLayout(HoaDon);
        HoaDon.setLayout(HoaDonLayout);
        HoaDonLayout.setHorizontalGroup(
            HoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1280, Short.MAX_VALUE)
        );
        HoaDonLayout.setVerticalGroup(
            HoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 680, Short.MAX_VALUE)
        );

        pnMain_from.add(HoaDon, "card5");

        DoanhThu.setBackground(new java.awt.Color(255, 51, 255));

        javax.swing.GroupLayout DoanhThuLayout = new javax.swing.GroupLayout(DoanhThu);
        DoanhThu.setLayout(DoanhThuLayout);
        DoanhThuLayout.setHorizontalGroup(
            DoanhThuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1280, Short.MAX_VALUE)
        );
        DoanhThuLayout.setVerticalGroup(
            DoanhThuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 680, Short.MAX_VALUE)
        );

        pnMain_from.add(DoanhThu, "card6");

        pnMain.add(pnMain_from, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 1280, 680));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblThuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblThuMouseClicked
        pnMenu.setSize(with, hight);
        pnMain_from.setSize(1020, 676);
        pnMain_from.setLocation(260, 41);
    }//GEN-LAST:event_lblThuMouseClicked

    private void lblBanHangMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBanHangMouseEntered
        lblBanHang.setOpaque(true);
        lblBanHang.setBackground(color);
    }//GEN-LAST:event_lblBanHangMouseEntered

    private void lblBanHangMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBanHangMouseExited
        lblBanHang.setOpaque(true);
        lblBanHang.setBackground(this.getBackground());
    }//GEN-LAST:event_lblBanHangMouseExited

    private void lblSanPhamMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSanPhamMouseEntered
        lblSanPham.setOpaque(true);
        lblSanPham.setBackground(color);
    }//GEN-LAST:event_lblSanPhamMouseEntered

    private void lblSanPhamMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSanPhamMouseExited
        lblSanPham.setOpaque(true);
        lblSanPham.setBackground(this.getBackground());
    }//GEN-LAST:event_lblSanPhamMouseExited

    private void lblNhanVienMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNhanVienMouseEntered
        lblNhanVien.setOpaque(true);
        lblNhanVien.setBackground(color);
    }//GEN-LAST:event_lblNhanVienMouseEntered

    private void lblNhanVienMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNhanVienMouseExited
        lblNhanVien.setOpaque(true);
        lblNhanVien.setBackground(this.getBackground());
    }//GEN-LAST:event_lblNhanVienMouseExited

    private void lblDoanhThuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDoanhThuMouseEntered
        lblDoanhThu.setOpaque(true);
        lblDoanhThu.setBackground(color);
    }//GEN-LAST:event_lblDoanhThuMouseEntered

    private void lblDoanhThuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDoanhThuMouseExited
        lblDoanhThu.setOpaque(true);
        lblDoanhThu.setBackground(this.getBackground());
    }//GEN-LAST:event_lblDoanhThuMouseExited

    private void lblGioiTheuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGioiTheuMouseEntered
        lblGioiTheu.setOpaque(true);
        lblGioiTheu.setBackground(color);
    }//GEN-LAST:event_lblGioiTheuMouseEntered

    private void lblGioiTheuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGioiTheuMouseExited
        lblGioiTheu.setOpaque(true);
        lblGioiTheu.setBackground(this.getBackground());
    }//GEN-LAST:event_lblGioiTheuMouseExited

    private void lblTroGiupMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTroGiupMouseEntered
        lblTroGiup.setOpaque(true);
        lblTroGiup.setBackground(color);
    }//GEN-LAST:event_lblTroGiupMouseEntered

    private void lblTroGiupMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTroGiupMouseExited
        lblTroGiup.setOpaque(true);
        lblTroGiup.setBackground(this.getBackground());
    }//GEN-LAST:event_lblTroGiupMouseExited

    private void lblDangXuatMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDangXuatMouseEntered
        lblDangXuat.setOpaque(true);
        lblDangXuat.setBackground(color);
    }//GEN-LAST:event_lblDangXuatMouseEntered

    private void lblDangXuatMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDangXuatMouseExited
        lblDangXuat.setOpaque(true);
        lblDangXuat.setBackground(this.getBackground());
    }//GEN-LAST:event_lblDangXuatMouseExited

    private void lblHoaDonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHoaDonMouseEntered
        lblHoaDon.setOpaque(true);
        lblHoaDon.setBackground(color);
    }//GEN-LAST:event_lblHoaDonMouseEntered

    private void lblHoaDonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHoaDonMouseExited
        lblHoaDon.setOpaque(true);
        lblHoaDon.setBackground(this.getBackground());
    }//GEN-LAST:event_lblHoaDonMouseExited

    private void lblBanHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBanHangMouseClicked
        Tong.setVisible(false);
        BanHang.setVisible(true);
        SanPham.setVisible(false);
        NhanVien.setVisible(false);
        HoaDon.setVisible(false);
        DoanhThu.setVisible(false);
        pnMenu.setSize(0, 0);
        pnMain_from.setSize(1280, 676);
        pnMain_from.setLocation(0, 40);
    }//GEN-LAST:event_lblBanHangMouseClicked

    private void lblNhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNhanVienMouseClicked
        Tong.setVisible(false);
        BanHang.setVisible(false);
        SanPham.setVisible(false);
        NhanVien.setVisible(true);
        HoaDon.setVisible(false);
        DoanhThu.setVisible(false);
        pnMenu.setSize(0, 0);
        pnMain_from.setSize(1280, 676);
        pnMain_from.setLocation(0, 40);
    }//GEN-LAST:event_lblNhanVienMouseClicked

    private void lblSanPhamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSanPhamMouseClicked
        Tong.setVisible(false);
        BanHang.setVisible(false);
        SanPham.setVisible(true);
        NhanVien.setVisible(false);
        HoaDon.setVisible(false);
        DoanhThu.setVisible(false);
        pnMenu.setSize(0, 0);
        pnMain_from.setSize(1280, 676);
        pnMain_from.setLocation(0, 40);

    }//GEN-LAST:event_lblSanPhamMouseClicked

    private void lblHoaDonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHoaDonMouseClicked
        Tong.setVisible(false);
        BanHang.setVisible(false);
        SanPham.setVisible(false);
        NhanVien.setVisible(false);
        HoaDon.setVisible(true);
        DoanhThu.setVisible(false);
        pnMenu.setSize(0, 0);
        pnMain_from.setSize(1280, 676);
        pnMain_from.setLocation(0, 40);
    }//GEN-LAST:event_lblHoaDonMouseClicked

    private void lblDoanhThuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDoanhThuMouseClicked
        Tong.setVisible(false);
        BanHang.setVisible(false);
        SanPham.setVisible(false);
        NhanVien.setVisible(false);
        HoaDon.setVisible(false);
        DoanhThu.setVisible(true);
        pnMenu.setSize(0, 0);
        pnMain_from.setSize(1280, 676);
        pnMain_from.setLocation(0, 40);
    }//GEN-LAST:event_lblDoanhThuMouseClicked

    private void lblTongQuanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTongQuanMouseClicked
        Tong.setVisible(true);
        BanHang.setVisible(false);
        SanPham.setVisible(false);
        NhanVien.setVisible(false);
        HoaDon.setVisible(false);
        DoanhThu.setVisible(false);
        pnMenu.setSize(0, 0);
        pnMain_from.setSize(1280, 676);
        pnMain_from.setLocation(0, 40);
    }//GEN-LAST:event_lblTongQuanMouseClicked

    private void lblTongQuanMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTongQuanMouseEntered
        lblTongQuan.setOpaque(true);
        lblTongQuan.setBackground(color);
    }//GEN-LAST:event_lblTongQuanMouseEntered

    private void lblTongQuanMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTongQuanMouseExited
        lblTongQuan.setOpaque(true);
        lblTongQuan.setBackground(this.getBackground());
    }//GEN-LAST:event_lblTongQuanMouseExited

    private void btnXoa_Form_BanHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoa_Form_BanHangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnXoa_Form_BanHangActionPerformed
    int diemClik = 0;
    private void btnThuTien_BanHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThuTien_BanHangActionPerformed
        int check = diemClik +=1;
        if (check == 1) {
            pnChiTiet_ThuTien.setSize(499, 260);
            pnChiTiet_ThuTien.setLocation(0, 350);
        }else if(check == 2){
            JOptionPane.showMessageDialog(this, "ThanhToan Thanh COng");
            pnChiTiet_ThuTien.setSize(499, 0);
        }
        
    }//GEN-LAST:event_btnThuTien_BanHangActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BanHang;
    private javax.swing.JPanel DoanhThu;
    private javax.swing.JPanel HoaDon;
    private javax.swing.JPanel NhanVien;
    private javax.swing.JPanel SanPham;
    private javax.swing.JPanel Tong;
    private javax.swing.JPanel TongDThu;
    private javax.swing.JPanel Tong_DT_Ngay;
    private javax.swing.JPanel Tong_HD;
    private javax.swing.JButton btnThuTien;
    private javax.swing.JButton btnThuTien1;
    private javax.swing.JButton btnThuTien2;
    private javax.swing.JButton btnThuTien3;
    private javax.swing.JButton btnThuTien4;
    private javax.swing.JButton btnThuTien_BanHang;
    private javax.swing.JButton btnXoa;
    private javax.swing.JButton btnXoa1;
    private javax.swing.JButton btnXoa2;
    private javax.swing.JButton btnXoa3;
    private javax.swing.JButton btnXoa4;
    private javax.swing.JButton btnXoa_Form_BanHang;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblBanHang;
    private javax.swing.JLabel lblDangXuat;
    private javax.swing.JLabel lblDoanhThu;
    private javax.swing.JLabel lblGioiTheu;
    private javax.swing.JLabel lblHoaDon;
    private javax.swing.JLabel lblNhanVien;
    private javax.swing.JLabel lblSanPham;
    private javax.swing.JLabel lblTenUser;
    private javax.swing.JLabel lblThu;
    private javax.swing.JLabel lblTongQuan;
    private javax.swing.JLabel lblTroGiup;
    private javax.swing.JPanel pnChiTiet_ThuTien;
    private javax.swing.JPanel pnDanhSach;
    private javax.swing.JPanel pnDanhSachNhanVien;
    private javax.swing.JPanel pnHeader;
    private javax.swing.JPanel pnHinhAnh;
    private javax.swing.JPanel pnHoaDon;
    private javax.swing.JPanel pnMain;
    private javax.swing.JPanel pnMain_from;
    private javax.swing.JPanel pnMenu;
    private javax.swing.JPanel pnThanhToan;
    private javax.swing.JPanel pnThanhToan1;
    private javax.swing.JPanel pnThanhToan2;
    private javax.swing.JPanel pnThanhToan3;
    private javax.swing.JPanel pnThanhToan4;
    private javax.swing.JPanel pnThemNhanVien;
    private javax.swing.JPanel pnThemSanPham;
    private javax.swing.JPanel pnThuTien_BanHang;
    private javax.swing.JPanel pnThucDon;
    private javax.swing.JRadioButton rdoInBill;
    private javax.swing.JRadioButton rdoKhongInBill;
    private javax.swing.JTextField txtKhachDua;
    private javax.swing.JTextField txtTong;
    private javax.swing.JTextField txtTraLai;
    // End of variables declaration//GEN-END:variables
}
