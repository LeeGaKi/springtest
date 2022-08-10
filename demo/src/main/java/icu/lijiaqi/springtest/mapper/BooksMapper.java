package icu.lijiaqi.springtest.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import icu.lijiaqi.springtest.pojo.Books;
import org.springframework.stereotype.Repository;


/**
* @author LeeGaki
* @description 针对表【books】的数据库操作Mapper
* @createDate 2022-07-16 07:32:21
* @Entity icu.lijiaqi.springtest.pojo.Books
*/
@Repository
public interface BooksMapper extends BaseMapper<Books> {

    /**
     * 分页查询
     * @param page
     * @return
     */
    IPage<Books> getBookBypage(Page<Books> page);
}




