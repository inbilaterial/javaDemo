package lihong.x.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author:LsCat
 * @Date:2021/12/27
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Good implements Serializable {
    private Integer gid;
    private String gname;
    private Double price;
    private Integer sid;
    private Integer kid;
    private String status;
    private String kind;
}
