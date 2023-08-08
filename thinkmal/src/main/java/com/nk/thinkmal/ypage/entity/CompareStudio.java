package com.nk.thinkmal.ypage.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * <p>
 * 工作室五维比较
 * </p>
 *
 * @author baomidou
 * @since 2023-08-08
 */
@TableName("tb_anime_compare_studio")
public class CompareStudio implements Serializable {

    private static final long serialVersionUID = 1L;

    private String studio;

    private Integer total;

    private Integer numWatch;

    private Integer numLike;

    private Float avgScore;

    private Integer avgPopularity;

    public String getStudio() {
        return studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }
    public Integer getNumWatch() {
        return numWatch;
    }

    public void setNumWatch(Integer numWatch) {
        this.numWatch = numWatch;
    }
    public Integer getNumLike() {
        return numLike;
    }

    public void setNumLike(Integer numLike) {
        this.numLike = numLike;
    }
    public Float getAvgScore() {
        return avgScore;
    }

    public void setAvgScore(Float avgScore) {
        this.avgScore = avgScore;
    }
    public Integer getAvgPopularity() {
        return avgPopularity;
    }

    public void setAvgPopularity(Integer avgPopularity) {
        this.avgPopularity = avgPopularity;
    }

    @Override
    public String toString() {
        return "CompareStudio{" +
            "studio=" + studio +
            ", total=" + total +
            ", numWatch=" + numWatch +
            ", numLike=" + numLike +
            ", avgScore=" + avgScore +
            ", avgPopularity=" + avgPopularity +
        "}";
    }
}
