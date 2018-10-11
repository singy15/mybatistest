package sample.mybatis.mapper;

import java.util.List;

import sample.mybatis.entity.TSale;

public interface TSaleMapper {
    List<TSale> selectAll();
    void insert(TSale prm);
    List<TSale> selectAllByMap();
}
