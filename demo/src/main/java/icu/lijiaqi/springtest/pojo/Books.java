package icu.lijiaqi.springtest.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

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
    @TableId(type = IdType.AUTO)
    private Integer bookid;

    /**
     * 
     */
    private String bookname;

    /**
     * 
     */
    private String bookauthor;

    /**
     * 
     */
    private String bookpress;

    /**
     * 
     */
    private Integer bookstock;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}