package com.wei.springbootmall.rowmapper;

import com.wei.springbootmall.model.User;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserRowMapper implements RowMapper<User> {

    @Override
    public User mapRow(ResultSet rs, int rowNum) throws SQLException {
        User user = new User();

        user.setUserId(rs.getInt("user_id"));
        user.setPassword(rs.getString("password"));
        user.setEmail(rs.getString("email"));
        user.setCreatedDate(rs.getTimestamp("created_date"));
        user.setLastModifieddate(rs.getTimestamp("last_modified_date"));

        return user;
    }
}
