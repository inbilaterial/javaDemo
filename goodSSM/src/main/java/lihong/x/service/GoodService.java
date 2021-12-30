package lihong.x.service;

import lihong.x.entry.PageBean;
import lihong.x.pojo.Good;

import java.sql.SQLException;

/**
 * @author:LsCat
 * @Date:2021/12/29
 */
public interface GoodService {
    /**
     * 获取总条数    totalSize
     *
     * @return
     */
    Long getTotalSize();


    /**
     * 分页查询所有物品
     *
     * @return
     * @throws SQLException
     */
    PageBean<Good> getAll(Long currentPage, Integer pageSize) throws SQLException;

    Good getDetail(Integer gid);
}
