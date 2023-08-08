package com.nk.thinkmal.ypage.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * <p>
 * 工作室出品动画排名前百数
 * </p>
 *
 * @author baomidou
 * @since 2023-08-08
 */
@TableName("tb_anime_top100_num_studio")
public class Top100NumStudio implements Serializable {

    private static final long serialVersionUID = 1L;

    private String studio;

    private String cnt;

    public String getStudio() {
        return studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }
    public String getCnt() {
        return cnt;
    }

    public void setCnt(String cnt) {
        this.cnt = cnt;
    }

    @Override
    public String toString() {
        return "Top100NumStudio{" +
            "studio=" + studio +
            ", cnt=" + cnt +
        "}";
    }
}
