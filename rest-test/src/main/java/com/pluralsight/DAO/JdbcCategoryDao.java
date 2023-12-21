package com.pluralsight.DAO;

import com.pluralsight.resttest.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class JdbcCategoryDao implements CategoryDao{

    @Autowired
    private final JdbcTemplate jdbcTemplate;

    public JdbcCategoryDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Category> getAll() {
        return null;
    }

    @Override
    public Category getById(int id) {
        return null;
    }
}
