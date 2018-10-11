package sample;

import org.springframework.beans.factory.annotation.Autowired;

import sample.service.IUserService;
import sample.simple.Sample3;

public class TestApp {
    @Autowired
    public IUserService service;

    @Autowired
    public Sample3 sample3;

    public void main() {
//        service = new UserService();
        service.selectAll();

        sample3.bar();
    }
}
