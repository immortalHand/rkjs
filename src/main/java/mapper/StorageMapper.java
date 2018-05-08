package mapper;

import pojo.Page;
import pojo.Storage;

import java.util.List;

public interface StorageMapper {
    int selectCount();

    List<Storage> selectList(Page page);

    int selectid();

    int insertStorage(Storage storage);

    int selectName(Storage storage);

    Storage selectByName(Storage storage);
}
