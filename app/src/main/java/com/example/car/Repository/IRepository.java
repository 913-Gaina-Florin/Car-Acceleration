package com.example.car.Repository;

import java.util.ArrayList;

public interface IRepository<E> {
    void addEntity(E newEntity);

    ArrayList<E> getAllEntities();
}
