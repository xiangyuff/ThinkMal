package com.nk.thinkmal.sys.entity;

import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;

/**
 * <p>
 * 1960年至今每年即是基于分数的排名最高的动画，又是基于人数的排名最高的动画
 * </p>
 *
 * @author baomidou
 * @since 2023-08-07
 */
@TableName("tb_anime_most_per_year_mysql")
public class TbAnimeMostPerYearMysql implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 年份
     */
    private Integer year;

    /**
     * 每年即是基于分数的排名最高的动画，又是基于人数的排名最高的动画
     */
    private String mostAnime;

    /**
     * 基于人数的排名
     */
    private Integer mostPopularity;

    /**
     * 基于分数的排名
     */
    private Integer mostRank;

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }
    public String getMostAnime() {
        return mostAnime;
    }

    public void setMostAnime(String mostAnime) {
        this.mostAnime = mostAnime;
    }
    public Integer getMostPopularity() {
        return mostPopularity;
    }

    public void setMostPopularity(Integer mostPopularity) {
        this.mostPopularity = mostPopularity;
    }
    public Integer getMostRank() {
        return mostRank;
    }

    public void setMostRank(Integer mostRank) {
        this.mostRank = mostRank;
    }

    @Override
    public String toString() {
        return "TbAnimeMostPerYearMysql{" +
            "year=" + year +
            ", mostAnime=" + mostAnime +
            ", mostPopularity=" + mostPopularity +
            ", mostRank=" + mostRank +
        "}";
    }
}
