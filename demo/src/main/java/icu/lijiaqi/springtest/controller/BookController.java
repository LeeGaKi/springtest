package icu.lijiaqi.springtest.controller;

import icu.lijiaqi.springtest.pojo.Books;
import icu.lijiaqi.springtest.service.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author : LeeGaki
 * @date : 2022/7/16 7:35
 * 面向面试编程 --> 李佳琪
 */
@RestController
@RequestMapping("/book")
public class BookController {
    @Autowired
    private BooksService booksService;

    @GetMapping("/")
    public List<Books> findAll(@RequestParam(defaultValue = "1") Integer currentPage,@RequestParam(defaultValue = "2") Integer size){
        List<Books> list = booksService.getBookByPage(currentPage,size);
        return list;
    }
    @PostMapping("/")
    public boolean addBook(Books books){
        boolean save = booksService.save(books);
        return save;
    }
    @DeleteMapping("/{id}")
    public boolean delBook(@PathVariable int id){
        boolean b = booksService.removeById(id);
        return b;
    }

}
