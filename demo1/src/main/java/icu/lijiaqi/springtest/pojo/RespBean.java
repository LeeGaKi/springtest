package icu.lijiaqi.springtest.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author : LeeGaki
 * @date : 2022/7/20 10:06
 * 面向面试编程 --> 李佳琪
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RespBean {
    private long code;
    private String message;
    private Object object;
    /**
     * 成功返回结果
     *
     * @param message
     */
    public static RespBean success(String message) {
        return new RespBean(200, message, null);

    }

    /**
     * 成功返回结果
     *
     * @param object
     * @param message
     */
    public static RespBean success(String message, Object object) {
        return new RespBean(200, message, object);
    }
    /**
     * 失败返回结果
     *
     * @param message
     */
    public static RespBean error(String message){
        return new RespBean(500,message,null);
    }

    /**
     * @param message
     * @param object
     * @return
     */
    public static RespBean error(String message,Object object){
        return new RespBean(500,message,object);
    }

}
