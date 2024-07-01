package com.meebo.meebo_werewolf.service;

import java.util.List;

public interface ConstService<T, ID, IN> {
    T create(IN dto);

    List<T> findAll();

    T findById(ID id);
}