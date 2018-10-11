package sample.service;

import java.util.List;

import sample.mybatis.entity.MUser;

public interface IUserService {
    public List<MUser> selectAll();
}
