package icu.lijiaqi.demo2.controller;

import icu.lijiaqi.demo2.pojo.Books;
import icu.lijiaqi.demo2.service.BooksService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author : LeeGaki
 * @date : 2022/7/20 17:16
 * 面向面试编程 --> 李佳琪
 */
@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BooksService booksService;

    @GetMapping("/")
    @ApiOperation("获取书籍")
    public List<Books> getBook(){
        return booksService.list();
    }
    @PostMapping("/")
    @ApiOperation("2书籍")
    public boolean addBook(Books books){
        return booksService.save(books);
    }
    @PutMapping("/")
    @ApiOperation("修改书籍")
    public boolean upBook(Books books){
        return booksService.updateById(books);
    }
    @DeleteMapping("/{id}")
    @ApiOperation("添加书籍")
    public boolean delBook(@PathVariable Integer id){
        return booksService.removeById(id);
    }

}
