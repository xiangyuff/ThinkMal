package com.nk.thinkmal.ypage.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * <p>
 * 工作室动画收藏率
 * </p>
 *
 * @author baomidou
 * @since 2023-08-08
 */
@TableName("tb_anime_like_rate_studio")
public class LikeRateStudio implements Serializable {

    private static final long serialVersionUID = 1L;

    private String studio;

    private Float rate;

    public String getStudio() {
        return studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }
    public Float getRate() {
        return rate;
    }

    public void setRate(Float rate) {
        this.rate = rate;
    }

    @Override
    public String toString() {
        return "LikeRateStudio{" +
            "studio=" + studio +
            ", rate=" + rate +
        "}";
    }
}
