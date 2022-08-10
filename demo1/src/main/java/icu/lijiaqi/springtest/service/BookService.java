package icu.lijiaqi.springtest.service;

import icu.lijiaqi.springtest.pojo.Book;

import java.util.List;

/**
 * @author : LeeGaki
 * @date : 2022/7/20 9:45
 * 面向面试编程 --> 李佳琪
 */
public interface BookService {

    List<Book> getBook();

    boolean addBook(Book book);

    boolean upBook(Book book);

    boolean delBook(Integer id);
}
