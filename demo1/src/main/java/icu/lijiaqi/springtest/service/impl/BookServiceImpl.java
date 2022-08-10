package icu.lijiaqi.springtest.service.impl;

import icu.lijiaqi.springtest.mapper.BookMapper;
import icu.lijiaqi.springtest.pojo.Book;
import icu.lijiaqi.springtest.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author : LeeGaki
 * @date : 2022/7/20 9:46
 * 面向面试编程 --> 李佳琪
 */
@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookMapper bookMapper;

    @Override
    public List<Book> getBook() {
        return bookMapper.getBook();
    }

    @Override
    public boolean addBook(Book book) {
        return bookMapper.addBook(book);
    }

    @Override
    public boolean upBook(Book book) {

        return bookMapper.upBook(book);
    }

    @Override
    public boolean delBook(Integer id) {
        return bookMapper.delBook(id);
    }
}
