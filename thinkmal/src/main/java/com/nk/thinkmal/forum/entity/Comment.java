package com.nk.thinkmal.forum.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author baomidou
 * @since 2023-08-08
 */
public class Comment implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "cid", type = IdType.AUTO)
    private Integer cid;

    private String username;

    private String cmtext;

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    public String getCmtext() {
        return cmtext;
    }

    public void setCmtext(String cmtext) {
        this.cmtext = cmtext;
    }

    @Override
    public String toString() {
        return "Comment{" +
            "cid=" + cid +
            ", username=" + username +
            ", cmtext=" + cmtext +
        "}";
    }
}
