package com.kttk.lab5.hangkhong.entities;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Embeddable
public class ChungNhanKey implements Serializable {
  @OneToOne
  @JoinColumn(name = "MaNV")
  private NhanVien nhanVien;
  @OneToOne
  @JoinColumn(name = "MaMB")
  private MayBay mauBay;

  public ChungNhanKey() {
  }

  public ChungNhanKey(NhanVien nhanVien, MayBay mauBay) {
    this.nhanVien = nhanVien;
    this.mauBay = mauBay;
  }

  public NhanVien getNhanVien() {
    return nhanVien;
  }

  public void setNhanVien(NhanVien nhanVien) {
    this.nhanVien = nhanVien;
  }

  public MayBay getMauBay() {
    return mauBay;
  }

  public void setMauBay(MayBay mauBay) {
    this.mauBay = mauBay;
  }

  @Override
  public String toString() {
    return "ChungNhan [mauBay=" + mauBay + ", nhanVien=" + nhanVien + "]";
  }

}
