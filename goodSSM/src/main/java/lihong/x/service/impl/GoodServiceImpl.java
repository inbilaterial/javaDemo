package lihong.x.service.impl;

import lihong.x.dao.GoodDao;
import lihong.x.entry.PageBean;
import lihong.x.pojo.Good;
import lihong.x.pojo.Rpm;
import lihong.x.service.GoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

/**
 * @author:LsCat
 * @Date:2021/12/29
 */
@Service
public class GoodServiceImpl implements GoodService {
    @Autowired
    private GoodDao goodDao;

    public Long getTotalSize() {
        return goodDao.getTotalSize();
    }

    public PageBean<Good> getAll(Long currentPage, Integer pageSize) throws SQLException {
        PageBean<Good> pageBean = new PageBean<Good>();
        Long totalSize = goodDao.getTotalSize();
        pageBean.setCurrentPage(currentPage);
        pageBean.setPageSize(pageSize);
        pageBean.setTotalSize(totalSize);
        Long totalPage = totalSize / pageSize == 0 ? totalSize / pageSize : totalSize / pageSize + 1;
        pageBean.setTotalPage(totalPage);
        // 封装Rpm(start, number)
        Rpm rpm = new Rpm((currentPage - 1) * pageSize, pageSize);
        List<Good> goodList = goodDao.getAll(rpm);
        pageBean.setList(goodList);
        return pageBean;
    }

    public Good getDetail(Integer gid) {
        return goodDao.getDetail(gid);
    }
}
