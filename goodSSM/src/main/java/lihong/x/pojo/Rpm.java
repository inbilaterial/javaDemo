package lihong.x.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author:LsCat
 * @Date:2021/12/30
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Rpm implements Serializable {
    /**
     * start    分页查询的起始位置
     * number   查询的数量
     */
    private Long start;
    private Integer number;
}
