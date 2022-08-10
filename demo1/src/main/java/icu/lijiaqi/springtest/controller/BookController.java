package icu.lijiaqi.springtest.controller;

import icu.lijiaqi.springtest.pojo.Book;
import icu.lijiaqi.springtest.pojo.RespBean;
import icu.lijiaqi.springtest.service.BookService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author : LeeGaki
 * @date : 2022/7/20 9:44
 * 面向面试编程 --> 李佳琪
 */
@RestController
@RequestMapping("/book")
public class BookController {


    @Autowired
    private BookService bookService;

    @GetMapping("/")
    @ApiOperation("获取所有书籍")
    public List<Book> getBooks(){

        return bookService.getBook();
    }

    @PostMapping("/")
    public RespBean addBook(Book book){
         if (bookService.addBook(book)){
             return RespBean.success("添加成功");
         }
         return RespBean.error("添加失败");
    }
    @PutMapping("/")
    public RespBean upBook(Book book){
        if (bookService.upBook(book)){
            return RespBean.success("修改成功");
        }
        return RespBean.error("修改失败");
    }
    @DeleteMapping("/{id}")
    public RespBean delBook(@PathVariable Integer id){
        if (bookService.delBook(id)){
            return RespBean.success("删除成功");
        }
        return RespBean.error("删除失败");
    }
}
