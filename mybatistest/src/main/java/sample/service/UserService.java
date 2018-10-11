package sample.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import sample.mybatis.entity.MUser;
import sample.mybatis.mapper.MUserMapper;

@Component
public class UserService implements IUserService {
    @Autowired
    public MUserMapper mapper;

    public List<MUser> selectAll() {
        return mapper.selectAll();
    }
}
