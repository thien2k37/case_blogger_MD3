package service.impl;

import model.Category;
import model.User;
import service.CategoryService;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CategoryServiceImpl implements CategoryService {
    private String jdbcURL = "jdbc:mysql://localhost:3306/blogDB?useSSL=false";
    private String jdbcUsername = "root";
    private String jdbcPassword = "Dinhhoc8";

    protected Connection getConnection(){
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
        }catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return connection;
    }

    public CategoryServiceImpl() {
    }

    @Override
    public User add(Category category) throws SQLException {

        return null;
    }

    @Override
    public Category findById(int id) {
        return null;
    }

    @Override
    public boolean delete(int id) throws SQLException {
        return false;
    }

    @Override
    public boolean update(Category category) throws SQLException {
        return false;
    }
}
