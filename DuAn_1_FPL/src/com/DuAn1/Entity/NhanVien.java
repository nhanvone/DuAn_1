/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.DuAn1.Entity;

import java.util.Date;

/**
 *
 * @author sonmi
 */
public class NhanVien {
    private int maNV;
    private String tenNV;
    private Date ngaySinhDate;
    private String goiTinh;
    private String soDienThoai;
    private Date ngayVaoLamDate;
    private String chucVu;
    private String taiKhoan;
    private String matKhau;
    private String hinh;
    private boolean Roles;

    public NhanVien() {
    }

    public NhanVien(int maNV, String tenNV, Date ngaySinhDate, String goiTinh, String soDienThoai, Date ngayVaoLamDate, String chucVu, String taiKhoan, String matKhau, String hinh, boolean Roles) {
        this.maNV = maNV;
        this.tenNV = tenNV;
        this.ngaySinhDate = ngaySinhDate;
        this.goiTinh = goiTinh;
        this.soDienThoai = soDienThoai;
        this.ngayVaoLamDate = ngayVaoLamDate;
        this.chucVu = chucVu;
        this.taiKhoan = taiKhoan;
        this.matKhau = matKhau;
        this.hinh = hinh;
        this.Roles = Roles;
    }

    
    
    public int getMaNV() {
        return maNV;
    }

    public String getTenNV() {
        return tenNV;
    }

    public Date getNgaySinhDate() {
        return ngaySinhDate;
    }

    public String isGoiTinh() {
        return goiTinh;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public Date getNgayVaoLamDate() {
        return ngayVaoLamDate;
    }

    public String getChucVu() {
        return chucVu;
    }

    public String getTaiKhoan() {
        return taiKhoan;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public String getHinh() {
        return hinh;
    }

    public NhanVien(boolean Roles) {
        this.Roles = Roles;
    }

    public String getGoiTinh() {
        return goiTinh;
    }
    
    public void setMaNV(int maNV) {
        this.maNV = maNV;
    }

    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
    }

    public void setNgaySinhDate(Date ngaySinhDate) {
        this.ngaySinhDate = ngaySinhDate;
    }

    public void setGoiTinh(String goiTinh) {
        this.goiTinh = goiTinh;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public void setNgayVaoLamDate(Date ngayVaoLamDate) {
        this.ngayVaoLamDate = ngayVaoLamDate;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }

    public void setTaiKhoan(String taiKhoan) {
        this.taiKhoan = taiKhoan;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public void setHinh(String hinh) {
        this.hinh = hinh;
    }

    public boolean isRoles() {
        return Roles;
    }

    public void setRoles(boolean Roles) {
        this.Roles = Roles;
    }

    
}
