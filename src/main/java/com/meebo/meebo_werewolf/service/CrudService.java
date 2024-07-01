package com.meebo.meebo_werewolf.service;

public interface CrudService<T, ID, IN> extends ConstService<T, ID, IN> {
    T update(ID id);

    void delete(ID id);
}