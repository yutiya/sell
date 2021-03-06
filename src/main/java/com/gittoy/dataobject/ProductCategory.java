package com.gittoy.dataobject;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * 类目
 * Create By GaoYu 2017/11/9 16:43
 */
@Entity
@DynamicUpdate
@Data
public class ProductCategory {

    /** 类目id */
    @Id
    @GeneratedValue
    private Integer categoryId;

    /** 类目名字 */
    private String categoryName;

    /** 类目编号 */
    private Integer categoryType;

    /** 创建时间 */
    private Date createTime;

    /** 修改时间 */
    private Date updateTime;

    public ProductCategory() {
    }

    public ProductCategory(String categoryName, Integer categoryType) {
        this.categoryName = categoryName;
        this.categoryType = categoryType;
    }
}

/** ------------------------------------------------------------------

 -- 类目
 create table `product_category` (
 `category_id` int not null auto_increment,
 `category_name` varchar(64) not null comment '类目名字',
 `category_type` int not null comment '类目编号',
 `create_time` timestamp not null default current_timestamp comment '创建时间',
 `update_time` timestamp not null default current_timestamp on update current_timestamp comment '修改时间',
 primary key(`category_id`),
 unique key `uqe_category_type` (`category_type`)
 ) comment '类目表';

 ------------------------------------------------------------------*/
