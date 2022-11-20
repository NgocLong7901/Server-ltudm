/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.huce.da.ltudm.quanlychitieucanhan.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.huce.da.ltudm.quanlychitieucanhan.entity.Detail;
import vn.huce.da.ltudm.quanlychitieucanhan.repository.DetailRepository;

/**
 *
 * @author Ngoc Long
 */
@Service
public class DetailService {

    @Autowired
    DetailRepository repo;

    public void save(Detail detail) {
        repo.save(detail);
    }

    public List<Detail> listAll() {
        return (List<Detail>) repo.findAll();
    }

    public List<Detail> getbyUsername(String username) {
        return (List<Detail>) repo.getDetailbyUsername(username);
    }

    public Detail get(Long id) {
        return repo.findById(id).get();
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }

    public void deleteAll() {
        repo.deleteAll();
    }

    public void updateDetail(Long id, Detail detail) {
        detail.setId_detail(id);
        repo.save(detail);
    }

}
