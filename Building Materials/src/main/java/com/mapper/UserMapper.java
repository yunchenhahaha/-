package com.mapper;
import com.dao.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserMapper {
    public User selectUser(String username);
    public int insertUser(User user);
}
