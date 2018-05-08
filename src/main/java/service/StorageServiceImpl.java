package service;

import mapper.StorageMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pojo.Page;
import pojo.Storage;

import java.util.List;

@Service
public class StorageServiceImpl implements StorageService {

    @Autowired
    private StorageMapper storageMapper;

    @Override
    public int selectCount() {
        return storageMapper.selectCount();
    }

    @Override
    public List<Storage> selectList(Page page) {
        return storageMapper.selectList(page);
    }

    @Override
    public int selectid() {
        return storageMapper.selectid();
    }

    @Override
    public int insertStorage(Storage storage) {
        return storageMapper.insertStorage(storage);
    }

    @Override
    public Integer selectName(Storage storage) {
        return storageMapper.selectName(storage);
    }

    @Override
    public Storage selectByName(Storage storage) {
        return storageMapper.selectByName(storage);
    }
}
