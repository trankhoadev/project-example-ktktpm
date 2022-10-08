package com.kttk.lab5.hangkhong.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "chuyenbay")
public class ChuyenBay {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "MaCB", nullable = false, unique = true, length = 5)
  private String maCB;
  @Column(name = "GaDi", length = 50)
  private String gaDi;
  @Column(name = "GaDen", length = 50)
  private String gaDen;
  @Column(name = "DoDai")
  private int doDai;
  @Column(name = "GioDi")
  private Date gioDi;
  @Column(name = "GioDen")
  private Date gioDen;
  @Column(name = "ChiPhi")
  private int chiPhi;

  public ChuyenBay() {
  }

  public ChuyenBay(String maCB, String gaDi, String gaDen, int doDai, Date gioDi, Date gioDen, int chiPhi) {
    this.maCB = maCB;
    this.gaDi = gaDi;
    this.gaDen = gaDen;
    this.doDai = doDai;
    this.gioDi = gioDi;
    this.gioDen = gioDen;
    this.chiPhi = chiPhi;
  }

  public String getMaCB() {
    return maCB;
  }

  public void setMaCB(String maCB) {
    this.maCB = maCB;
  }

  public String getGaDi() {
    return gaDi;
  }

  public void setGaDi(String gaDi) {
    this.gaDi = gaDi;
  }

  public String getGaDen() {
    return gaDen;
  }

  public void setGaDen(String gaDen) {
    this.gaDen = gaDen;
  }

  public int getDoDai() {
    return doDai;
  }

  public void setDoDai(int doDai) {
    this.doDai = doDai;
  }

  public Date getGioDi() {
    return gioDi;
  }

  public void setGioDi(Date gioDi) {
    this.gioDi = gioDi;
  }

  public Date getGioDen() {
    return gioDen;
  }

  public void setGioDen(Date gioDen) {
    this.gioDen = gioDen;
  }

  public int getChiPhi() {
    return chiPhi;
  }

  public void setChiPhi(int chiPhi) {
    this.chiPhi = chiPhi;
  }

  @Override
  public String toString() {
    return "ChuyenBay [ChiPhi=" + chiPhi + ", DoDai=" + doDai + ", GaDen=" + gaDen + ", GaDi=" + gaDi + ", GioDen="
        + gioDen + ", GioDi=" + gioDi + ", MaCB=" + maCB + "]";
  }
}
