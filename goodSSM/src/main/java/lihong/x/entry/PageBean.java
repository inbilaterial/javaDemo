package lihong.x.entry;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * @author:LsCat
 * @Date:2021/12/29
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class PageBean<T> implements Serializable{
    /**
     * currentPage  当前页数
     * totalPage    总页数 = 总条数 / 每页条数 + 余数
     * totalSize    总条数
     * pageSize     每页条数
     * list         封装的数据集
     */
    private Long currentPage;
    private Long totalPage;
    private Long totalSize;
    private Integer pageSize;
    private List<T> list;
}
