package sample.simple;

import org.springframework.beans.factory.annotation.Autowired;

import sample.mybatis.mapper.MUserMapper;

//@MapperScan("sample.mybatis.mapper")
public class Sample1 {

    @Autowired
    private MUserMapper mapper;
//    private TItemMapper mapper;

    public void print() {
        System.out.println("foo!");
        mapper.selectAll();
    }

//    public TItemMapper getMapper() {
//        return mapper;
//    }
//
//    public void setMapper(TItemMapper mapper) {
//        this.mapper = mapper;
//    }

    public MUserMapper getMapper() {
        return mapper;
    }

    public void setMapper(MUserMapper mapper) {
        this.mapper = mapper;
    }




}
