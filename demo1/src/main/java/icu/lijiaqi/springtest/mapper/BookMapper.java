package icu.lijiaqi.springtest.mapper;

import icu.lijiaqi.springtest.pojo.Book;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author : LeeGaki
 * @date : 2022/7/20 9:46
 * 面向面试编程 --> 李佳琪
 */
@Repository
public interface BookMapper {

    List<Book> getBook();

    boolean addBook(Book book);

    boolean upBook(Book book);

    boolean delBook(Integer id);
}
