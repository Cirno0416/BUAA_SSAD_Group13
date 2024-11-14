package com.innoshare.model.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

@TableName(value = "download")
@Data
public class Download {
    @TableId(type = IdType.AUTO)
    private Integer downloadId;

    private Integer userId;

    private Integer paperId;

    private Date downloadTime;

    private Date createdAt;

    private Date updatedAt;

}