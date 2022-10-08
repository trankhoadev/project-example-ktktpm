package com.kttk.lab5.hangkhong.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "nhanvien")
public class NhanVien {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "MaNV", nullable = false, unique = true)
  private String maNV;

  @Column(name = "Ten", length = 50)
  private String tenNV;

  @Column(name = "Luong")
  private Long luong;

  public NhanVien() {
  }

  public NhanVien(String maNV, String tenNV, Long luong) {
    this.maNV = maNV;
    this.tenNV = tenNV;
    this.luong = luong;
  }

  public String getMaNV() {
    return maNV;
  }

  public void setMaNV(String maNV) {
    this.maNV = maNV;
  }

  public String getTenNV() {
    return tenNV;
  }

  public void setTenNV(String tenNV) {
    this.tenNV = tenNV;
  }

  public Long getLuong() {
    return luong;
  }

  public void setLuong(Long luong) {
    this.luong = luong;
  }

  @Override
  public String toString() {
    return "NhanVien [luong=" + luong + ", maNV=" + maNV + ", tenNV=" + tenNV + "]";
  }

}
