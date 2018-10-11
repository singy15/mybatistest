package sample.simple;

import org.springframework.beans.factory.annotation.Autowired;

import sample.mybatis.mapper.MUserMapper;

public class Sample2 {

    @Autowired
    private MUserMapper mapper;

    public MUserMapper getMapper() {
        return mapper;
    }

    public void setMapper(MUserMapper mapper) {
        this.mapper = mapper;
    }


}
