package com.nk.thinkmal.ypage.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * <p>
 * 最受关注题材里各工作室占比
 * </p>
 *
 * @author baomidou
 * @since 2023-08-08
 */
@TableName("tb_anime_genres_rate_studio")
public class GenresRateStudio implements Serializable {

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
        return "GenresRateStudio{" +
            "studio=" + studio +
            ", cnt=" + cnt +
        "}";
    }
}
