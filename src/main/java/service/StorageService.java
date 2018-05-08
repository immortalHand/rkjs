package service;

import pojo.Page;
import pojo.Storage;

import java.util.List;

public interface StorageService {
    /**
     * 查询总数
     * @return
     */
    int selectCount();

    /**
     * 分页显示
     * @return
     */
    List<Storage> selectList(Page page);

    /**
     * 查询最后的id
     * @return
     */
    int selectid();

    /**
     * 添加数据
     * @param storage
     */
    int insertStorage(Storage storage);

    /**
     * 判断名称是否重复
     * @param storage
     * @return
     */
    Integer selectName(Storage storage);

    /**
     * 通过姓名查询信息
     * @return
     */
    Storage selectByName(Storage storage);
}
