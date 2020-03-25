package demo;

import demo.dao.UserRepository;
import demo.domain.UserDO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;
import java.util.Optional;
@Slf4j
@SpringBootTest
class DemoApplicationTests {

    @Autowired
    UserRepository repository;

    @Test
    void contextLoads() {
        UserDO userDO = new UserDO();
        userDO.setId(1);
        userDO.setUserName("fishpro");
        userDO.setSex(1);
        userDO.setLastLoginTime(new Date());
        userDO.setPassword("passWord");
        repository.save(userDO);
        Optional<UserDO> byId = repository.findById(1);
        System.out.println(byId);
        System.out.println(byId);
    }

}
