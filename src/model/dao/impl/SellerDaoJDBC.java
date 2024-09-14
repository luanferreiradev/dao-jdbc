package model.dao.impl;

import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.List;

public class SellerDaoJDBC implements SellerDao {
    @Override
    public void insert(Seller obj) {

    }

    @Override
    public void update(Seller obj) {

    }

    @Override
    public void deleteById(Seller id) {

    }

    @Override
    public Department findById(Integer id) {
        return null;
    }

    @Override
    public List<Seller> findAll() {
        return List.of();
    }
}
