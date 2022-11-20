/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.huce.da.ltudm.quanlychitieucanhan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.huce.da.ltudm.quanlychitieucanhan.entity.Wallet;

/**
 *
 * @author Ngoc Long
 */
public interface WalletRepository extends JpaRepository<Wallet, Long> {
    
}
