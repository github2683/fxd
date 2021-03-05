package com.fxd.core.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author zhc
 * @Date 2021/3/3 23:16
 */
public class BaseEntity implements Serializable {
    private String id;
    private Date createTime;
    private Date updateTime;
    private String remark;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
