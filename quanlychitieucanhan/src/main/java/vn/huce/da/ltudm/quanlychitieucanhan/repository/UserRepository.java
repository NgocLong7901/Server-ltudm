/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.huce.da.ltudm.quanlychitieucanhan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import vn.huce.da.ltudm.quanlychitieucanhan.entity.User;

/**
 *
 * @author Ngoc Long
 */
public interface UserRepository extends JpaRepository<User, Long> {
    @Query("select u from User u where u.username=:username")
    public User findOne(@Param("username")String id_user);
}
