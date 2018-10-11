package sample.mybatis.mapper;

import java.util.List;

import sample.mybatis.entity.TCustomer;

public interface TCustomerMapper {
    List<TCustomer> selectAll();
}
