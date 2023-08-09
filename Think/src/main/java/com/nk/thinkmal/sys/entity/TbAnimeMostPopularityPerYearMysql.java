package com.nk.thinkmal.sys.entity;

import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;

/**
 * <p>
 * 1960年至今每年基于人数的排名最高的动画
 * </p>
 *
 * @author baomidou
 * @since 2023-08-07
 */
@TableName("tb_anime_most_popularity_per_year_mysql")
public class TbAnimeMostPopularityPerYearMysql implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 年份
     */
    private Integer year;

    /**
     * 基于人数的排名最高的动画
     */
    private String mostPopularityAnime;

    /**
     * 基于人数的排名
     */
    private Integer mostPopularity;

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }
    public String getMostPopularityAnime() {
        return mostPopularityAnime;
    }

    public void setMostPopularityAnime(String mostPopularityAnime) {
        this.mostPopularityAnime = mostPopularityAnime;
    }
    public Integer getMostPopularity() {
        return mostPopularity;
    }

    public void setMostPopularity(Integer mostPopularity) {
        this.mostPopularity = mostPopularity;
    }

    @Override
    public String toString() {
        return "TbAnimeMostPopularityPerYearMysql{" +
            "year=" + year +
            ", mostPopularityAnime=" + mostPopularityAnime +
            ", mostPopularity=" + mostPopularity +
        "}";
    }
}
