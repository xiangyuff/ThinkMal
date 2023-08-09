package com.nk.thinkmal.ypage.entity;

import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;

/**
 * <p>
 * 工作室出品动画数量top8
 * </p>
 *
 * @author baomidou
 * @since 2023-08-08
 */
@TableName("tb_anime_num_top8_studio_dwd")
public class NumTop8StudioDwd implements Serializable {

    private static final long serialVersionUID = 1L;

    private String studio;

    private Integer cnt;

    public String getStudio() {
        return studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }
    public Integer getCnt() {
        return cnt;
    }

    public void setCnt(Integer cnt) {
        this.cnt = cnt;
    }

    @Override
    public String toString() {
        return "NumTop8StudioDwd{" +
            "studio=" + studio +
            ", cnt=" + cnt +
        "}";
    }
}
