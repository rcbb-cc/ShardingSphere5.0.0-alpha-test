package cc.rcbb.sharding.test.entity;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Date;

/**
 * <p>
 * Position
 * </p>
 *
 * @author lvhao
 * @date 2021/9/16
 */
@Accessors(chain = true)
@Data
public class Position {

    private Long id;

    private String address;

    private Date date;

}
