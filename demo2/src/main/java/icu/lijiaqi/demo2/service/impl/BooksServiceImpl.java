package icu.lijiaqi.demo2.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import icu.lijiaqi.demo2.pojo.Books;
import icu.lijiaqi.demo2.service.BooksService;
import icu.lijiaqi.demo2.mapper.BooksMapper;
import org.springframework.stereotype.Service;

/**
* @author LeeGaki
* @description 针对表【books】的数据库操作Service实现
* @createDate 2022-07-20 17:16:30
*/
@Service
public class BooksServiceImpl extends ServiceImpl<BooksMapper, Books>
    implements BooksService{

}




