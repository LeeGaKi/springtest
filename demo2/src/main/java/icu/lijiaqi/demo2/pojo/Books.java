package icu.lijiaqi.demo2.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

/**
 * 
 * @TableName books
 */
@TableName(value ="books")
@Data
public class Books implements Serializable {
    /**
     * 
     */
    @TableId(value = "bookId", type = IdType.AUTO)
    private Integer bookId;

    /**
     * 
     */
    @TableField(value = "bookName")
    private String bookName;

    /**
     * 
     */
    @TableField(value = "bookAuthor")
    private String bookAuthor;

    /**
     * 
     */
    @TableField(value = "bookPress")
    private String bookPress;

    /**
     * 
     */
    @TableField(value = "bookStock")
    private Integer bookStock;

    @Serial
    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}