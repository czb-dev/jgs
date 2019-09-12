package cn.kgc.mapper;

import cn.kgc.bean.User;

import java.util.List;

public interface UserMapper {
   List<User> getList(String userName);
}
