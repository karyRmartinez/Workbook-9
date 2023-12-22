package com.pluralsight.DAO;

import com.pluralsight.resttest.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Component
public class JdbcProductDao implements ProductDao{

    private DataSource dataSource;
    @Autowired

    public JdbcProductDao(DataSource dataSource) {
        this.dataSource = dataSource;
    }


    @Override
    public List<Product> getAll() {
        String sql = "SELECT * FROM products;";

        List<Product> results = new ArrayList<>();

        try (Connection c = dataSource.getConnection()){
            PreparedStatement s = c.prepareStatement(sql);
            ResultSet rs = s.executeQuery();

            while(rs.next()){
                results.add( new Product(rs.getInt("ProductId"), rs.getString("ProductName"), rs.getInt("CategoryId"), rs.getDouble("UnitPrice")));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return results;
    }

    @Override
    public Product getById(int id) {

        String sql = "SELECT * FROM products WHERE ProductId = ?;";

        Product result = null;

        try (Connection c = dataSource.getConnection()){
            PreparedStatement s = c.prepareStatement(sql);
            s.setInt(1, id);
            ResultSet rs = s.executeQuery();

            while(rs.next()){
                result = new Product(rs.getInt("ProductId"), rs.getString("ProductName"), rs.getInt("CategoryId"), rs.getDouble("UnitPrice"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return result;
    }

    }
}
