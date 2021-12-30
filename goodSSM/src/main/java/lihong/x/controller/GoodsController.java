package lihong.x.controller;

import lihong.x.entry.PageBean;
import lihong.x.entry.ResultBean;
import lihong.x.pojo.Good;
import lihong.x.service.GoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;

/**
 * @author:LsCat
 * @Date:2021/12/29
 */
@RequestMapping("/goods")
@RestController
public class GoodsController {
    @Autowired
    private GoodService goodService;

    /**
     * @ResponseBody    将controller的方法返回的对象,通过适当的转换器 转换为指定的格式之后,写入到response对象的body区
     */
    @RequestMapping("/getAll")
    @ResponseBody
    public ResultBean getAll(@RequestParam("currentPage") Long currentPage, @RequestParam("pageSize") Integer pageSize) {
        ResultBean resultBean = new ResultBean();
        try {
            PageBean<Good> pageBean = goodService.getAll(currentPage, pageSize);
            resultBean.setData(pageBean);
        } catch (SQLException e) {
            resultBean.setFlag(false);
            resultBean.setErrorMsg(e.toString());
            e.printStackTrace();
        }
        return resultBean;
    }

    /**
     * 获取单物品的详细信息
     * @param gid
     * @return
     */
    @ResponseBody
    @RequestMapping("/getDetail")
    public ResultBean getDetail(@RequestParam("gid") Integer gid){
        ResultBean resultBean = new ResultBean();
        try {
            Good good = goodService.getDetail(gid);
            resultBean.setData(good);
        } catch (Exception e) {
            resultBean.setFlag(false);
            resultBean.setErrorMsg(e.toString());
            e.printStackTrace();
        }
        System.out.println(resultBean);
        return resultBean;
    }
}
