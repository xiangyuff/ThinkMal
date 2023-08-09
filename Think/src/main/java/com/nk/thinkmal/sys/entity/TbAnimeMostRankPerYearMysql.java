package com.nk.thinkmal.sys.entity;

import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;

/**
 * <p>
 * 1960年至今每年基于分数的排名最高的动画
 * </p>
 *
 * @author baomidou
 * @since 2023-08-07
 */
@TableName("tb_anime_most_rank_per_year_mysql")
public class TbAnimeMostRankPerYearMysql implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 年份
     */
    private Integer year;

    /**
     * 基于分数的排名最高的动画
     */
    private String mostRankAnime;

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
    public String getMostRankAnime() {
        return mostRankAnime;
    }

    public void setMostRankAnime(String mostRankAnime) {
        this.mostRankAnime = mostRankAnime;
    }
    public Integer getMostRank() {
        return mostRank;
    }

    public void setMostRank(Integer mostRank) {
        this.mostRank = mostRank;
    }

    @Override
    public String toString() {
        return "TbAnimeMostRankPerYearMysql{" +
            "year=" + year +
            ", mostRankAnime=" + mostRankAnime +
            ", mostRank=" + mostRank +
        "}";
    }
}
