package lihong.x.dao;

import lihong.x.pojo.Good;
import lihong.x.pojo.Rpm;

import java.sql.SQLException;
import java.util.List;

/**
 * @author:LsCat
 * @Date:2021/12/27
 */
public interface GoodDao {
    /**
     * 查询总条数
     *
     * @return
     * @throws SQLException
     */

    /**
     * 分页查询所有物品
     * @param rpm
     * @return
     * @throws SQLException
     */
    List<Good> getAll(Rpm rpm) throws SQLException;

    /**
     * 获取总条数    totalSize
     * @return
     */
    Long getTotalSize();

    Good getDetail(Integer gid);
}
