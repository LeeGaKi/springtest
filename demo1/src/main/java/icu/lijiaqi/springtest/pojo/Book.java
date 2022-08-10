package icu.lijiaqi.springtest.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author : LeeGaki
 * @date : 2022/7/20 9:43
 * 面向面试编程 --> 李佳琪
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    private Integer bookId;
    private String bookName;
    private String bookAuthor;
    private String bookPress;
    private Integer bookStock;
}
