package icu.lijiaqi.springtest.service;

import icu.lijiaqi.springtest.pojo.Books;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
* @author LeeGaki
* @description 针对表【books】的数据库操作Service
* @createDate 2022-07-16 07:32:21
*/
public interface BooksService extends IService<Books> {
    List<Books> getBookByPage(Integer currentPage, Integer size);
}
