package icu.lijiaqi.springtest.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import icu.lijiaqi.springtest.mapper.BooksMapper;
import icu.lijiaqi.springtest.pojo.Books;
import icu.lijiaqi.springtest.service.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author LeeGaki
* @description 针对表【books】的数据库操作Service实现
* @createDate 2022-07-16 07:32:21
*/
@Service
public class BooksServiceImpl extends ServiceImpl<BooksMapper, Books>
    implements BooksService{

    @Autowired
    private BooksMapper booksMapper;

    @Override
    public List<Books> getBookByPage(Integer currentPage, Integer size) {
        //开启分页
        Page<Books> page = new Page<>(currentPage,size);
        IPage<Books> bookBypage = booksMapper.getBookBypage(page);
        return bookBypage.getRecords();
    }
}




