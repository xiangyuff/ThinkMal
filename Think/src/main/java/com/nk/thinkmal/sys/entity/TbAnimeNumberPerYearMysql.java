package com.nk.thinkmal.sys.entity;

import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;

/**
 * <p>
 * 1960年至今每年动画数量
 * </p>
 *
 * @author baomidou
 * @since 2023-08-07
 */
@TableName("tb_anime_number_per_year_mysql")
public class TbAnimeNumberPerYearMysql implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 年份
     */
    private Integer year;

    /**
     * 每年动画数量
     */
    private Integer numberPerYear;

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }
    public Integer getNumberPerYear() {
        return numberPerYear;
    }

    public void setNumberPerYear(Integer numberPerYear) {
        this.numberPerYear = numberPerYear;
    }

    @Override
    public String toString() {
        return "TbAnimeNumberPerYearMysql{" +
            "year=" + year +
            ", numberPerYear=" + numberPerYear +
        "}";
    }
}
