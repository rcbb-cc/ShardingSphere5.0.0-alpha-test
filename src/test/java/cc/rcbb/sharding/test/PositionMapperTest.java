package cc.rcbb.sharding.test;

import cc.rcbb.sharding.test.entity.Position;
import cc.rcbb.sharding.test.mapper.PositionMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Date;

/**
 * <p>
 * PositionMapperTest
 * </p>
 *
 * @author lvhao
 * @date 2021/9/16
 */
@SpringBootTest
public class PositionMapperTest {

    @Autowired
    private PositionMapper positionMapper;

    @Test
    public void insert() {
        positionMapper.insert(new Position().setAddress("1").setDate(new Date()));
        positionMapper.insert(new Position().setAddress("2").setDate(new Date()));
    }

}
