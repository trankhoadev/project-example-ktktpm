package com.kttk.lab5.hangkhong.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kttk.lab5.hangkhong.entities.NhanVien;
import com.kttk.lab5.hangkhong.services.NhanVienService;

@RestController
@RequestMapping("/api/v1/nhan-vien")
public class NhanVienController {
  @Autowired
  NhanVienService nhanVienService;

  @GetMapping("/tong-luong")
  public Map<String, Long> getTongLuong() {
    final Map<String, Long> res = new HashMap<String, Long>();
    res.put("tong_luong", nhanVienService.calculateTongLuong());
    return res;
  }

  @GetMapping("/luong/nho-hon/{luong}")
  public List<NhanVien> getNhanVienByLuongNhoHon(@PathVariable(name = "luong") Long luong) {
    return nhanVienService.findByLuongNhoHon(luong);
  }

  @GetMapping("/loai-may-bay/{loai}")
  public List<NhanVien> getNhanVienByLoaiMayBay(@PathVariable(name = "loai") String loai) {
    return nhanVienService.findByLoaiMayBay(loai);
  }

  @GetMapping("/ma-may-bay/{ma}")
  public List<NhanVien> getNhanVienByMaMayBay(@PathVariable(name = "ma") int ma) {
    return nhanVienService.findByMaMayBay(ma);
  }

  @GetMapping("/cac-loai-may-bay/{loai1}/{loai2}")
  public List<NhanVien> getNhanVienByLoaiMayBays(@PathVariable(name = "loai1") String loai1,
      @PathVariable(name = "loai2") String loai2) {
    return nhanVienService.findByLoaiMayBays(loai1, loai2);
  }
}
