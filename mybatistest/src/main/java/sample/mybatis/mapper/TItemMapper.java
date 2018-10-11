package sample.mybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import sample.mybatis.entity.TItem;

public interface TItemMapper {
    List<TItem> selectAll();

    List<TItem> select(TItem prm);

    void insertByParam(@Param("name") String name, @Param("price") Integer price);

    void insert(TItem prm);
}
