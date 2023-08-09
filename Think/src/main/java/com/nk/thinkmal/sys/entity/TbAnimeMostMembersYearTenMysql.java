package com.nk.thinkmal.sys.entity;

import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;

/**
 * <p>
 * 1960年至今追番人数最多的十年
 * </p>
 *
 * @author baomidou
 * @since 2023-08-07
 */
@TableName("tb_anime_most_members_year_ten_mysql")
public class TbAnimeMostMembersYearTenMysql implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 年份
     */
    private Integer year;

    /**
     * 每年追番人数
     */
    private Integer membersPerYear;

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }
    public Integer getMembersPerYear() {
        return membersPerYear;
    }

    public void setMembersPerYear(Integer membersPerYear) {
        this.membersPerYear = membersPerYear;
    }

    @Override
    public String toString() {
        return "TbAnimeMostMembersYearTenMysql{" +
            "year=" + year +
            ", membersPerYear=" + membersPerYear +
        "}";
    }
}
