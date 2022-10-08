package com.kttk.lab5.hangkhong.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kttk.lab5.hangkhong.entities.NhanVien;
import com.kttk.lab5.hangkhong.repository.NhanVienRepository;

@Service
public class NhanVienServiceImpl implements NhanVienService {
  @Autowired
  NhanVienRepository nhanVienRepository;

  @Override
  public Long calculateTongLuong() {
    return nhanVienRepository.calculateTongLuong();
  }

  @Override
  public List<NhanVien> findByLuongNhoHon(Long luong) {
    List<NhanVien> nhanViens = nhanVienRepository.findByLuongNhoHon(luong);
    return nhanViens;
  }

  @Override
  public List<NhanVien> findByLoaiMayBay(String loai) {
    List<NhanVien> nhanViens = nhanVienRepository.findByLoaiMayBay(loai);
    return nhanViens;
  }

  @Override
  public List<NhanVien> findByMaMayBay(int maMayBay) {
    List<NhanVien> nhanViens = nhanVienRepository.findByMaMayBay(maMayBay);
    return nhanViens;
  }

  @Override
  public List<NhanVien> findByLoaiMayBays(String loai1, String loai2) {
    return nhanVienRepository.findByLoaiMayBays(loai1, loai2);
  }

}
