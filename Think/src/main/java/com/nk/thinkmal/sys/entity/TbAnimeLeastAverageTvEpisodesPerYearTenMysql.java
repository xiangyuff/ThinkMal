package com.nk.thinkmal.sys.entity;

import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;

/**
 * <p>
 * 1960年至今每年TV动画的平均剧集数量最少的前十名
 * </p>
 *
 * @author baomidou
 * @since 2023-08-07
 */
@TableName("tb_anime_least_average_tv_episodes_per_year_ten_mysql")
public class TbAnimeLeastAverageTvEpisodesPerYearTenMysql implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 年份
     */
    private Integer year;

    /**
     * 每年TV动画的平均剧集数量
     */
    private Double averageTvEpisodesPerYear;

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }
    public Double getAverageTvEpisodesPerYear() {
        return averageTvEpisodesPerYear;
    }

    public void setAverageTvEpisodesPerYear(Double averageTvEpisodesPerYear) {
        this.averageTvEpisodesPerYear = averageTvEpisodesPerYear;
    }

    @Override
    public String toString() {
        return "TbAnimeLeastAverageTvEpisodesPerYearTenMysql{" +
            "year=" + year +
            ", averageTvEpisodesPerYear=" + averageTvEpisodesPerYear +
        "}";
    }
}
