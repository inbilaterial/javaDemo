package lihong.x.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author:LsCat
 * @Date:2021/12/30
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Rpm2 implements Serializable {
    private String username;
    private String password;
}
