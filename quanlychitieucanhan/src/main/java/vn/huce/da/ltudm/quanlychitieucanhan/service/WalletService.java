/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.huce.da.ltudm.quanlychitieucanhan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.huce.da.ltudm.quanlychitieucanhan.entity.Wallet;
import vn.huce.da.ltudm.quanlychitieucanhan.repository.WalletRepository;

/**
 *
 * @author Ngoc Long
 */
@Service
public class WalletService {

    @Autowired
    WalletRepository repo;
    WalletService walletService;

    public void save(Wallet wallet) {
        repo.save(wallet);
    }

    public Wallet get(Long id) {
        return repo.findById(id).get();
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }

    public void update(Long id_wallet, Wallet newWallet) {
        newWallet.setId_wallet(id_wallet);
        repo.save(newWallet);
    }
}
