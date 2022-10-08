package com.kttk.lab5.hangkhong.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.kttk.lab5.hangkhong.entities.NhanVien;

@Repository
public interface NhanVienRepository extends JpaRepository<NhanVien, String> {

  @Query(value = "select * from nhanvien n where n.luong <= ?1", nativeQuery = true)
  List<NhanVien> findByLuongNhoHon(Long luong);

  @Query(value = "select n from nhanvien n join chungnhan c join maybay m on n.maNV = c.maNV and c.maMB = m.maMB where m.loai like '%?1%'", nativeQuery = true)
  List<NhanVien> findByLoaiMayBay(String loai);

  @Query(value = "select n from nhanvien n join chungnhan c on n.maNV = c.maNV where c.maMB = ?1", nativeQuery = true)
  List<NhanVien> findByMaMayBay(int maMayBay);

  @Query(value = "select sum(n.luong) from nhanvien n", nativeQuery = true)
  Long calculateTongLuong();

  @Query(value = "select n from nhanvien n join chungnhan c join maybay m on n.maNV = c.maNV and c.maMB = m.maMB where m.loai like '%?1%' or m.loai like '%?2%'", nativeQuery = true)
  List<NhanVien> findByLoaiMayBays(String loai1, String loai2);
}
