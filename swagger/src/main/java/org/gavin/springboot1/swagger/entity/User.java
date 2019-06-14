package org.gavin.springboot1.swagger.entity;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @Author: huangjr
 * @DateTime: 2019/6/13 17:01
 * @Des:
 */
@Data
@Entity
@Table(name = "user")
public class User {
    @Id
    /**
     * ApiModelProperty()用于方法，字段 表示对model属性的说明或者数据操作更改
     * value–字段说明
     * name–重写属性名字
     * dataType–重写属性类型
     * required–是否必填
     * example–举例说明
     * hidden–隐藏
     */
    @ApiModelProperty(value="用户名",name="username",example="zhangsan")
    private String username;
    @ApiModelProperty(hidden = false)


    private String password;
    @ApiModelProperty(hidden = false)


    private String phone;
    @ApiModelProperty(hidden = false)

    private String nickname;
}
