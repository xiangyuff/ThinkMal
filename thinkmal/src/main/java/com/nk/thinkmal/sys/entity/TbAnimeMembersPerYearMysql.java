package com.nk.thinkmal.sys.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * <p>
 * 1960年至今每年追番人数
 * </p>
 *
 * @author baomidou
 * @since 2023-08-07
 */
@TableName("tb_anime_members_per_year_mysql")
public class TbAnimeMembersPerYearMysql implements Serializable {

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
        return "TbAnimeMembersPerYearMysql{" +
            "year=" + year +
            ", membersPerYear=" + membersPerYear +
        "}";
    }
}
