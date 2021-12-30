package lihong.x.entry;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author:LsCat
 * @Date:2021/12/29
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ResultBean implements Serializable {
    /**
     * flag     服务器是否正常响应
     * errorMsg 错误信息
     * data     携带的响应数据
     */
    private Boolean flag = true;
    private String errorMsg;
    private Object data;
}
