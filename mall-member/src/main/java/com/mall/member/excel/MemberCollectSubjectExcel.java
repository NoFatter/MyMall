package com.mall.member.excel;

import cn.afterturn.easypoi.excel.annotation.Excel;
import lombok.Data;

import java.util.Date;

/**
 * 会员收藏的专题活动
 *
 * @author NoFat nf916803397@gmail.com
 * @since 1.0.0 2022-08-02
 */
@Data
public class MemberCollectSubjectExcel {
    @Excel(name = "id")
    private Long id;
    @Excel(name = "subject_id")
    private Long subjectId;
    @Excel(name = "subject_name")
    private String subjectName;
    @Excel(name = "subject_img")
    private String subjectImg;
    @Excel(name = "活动url")
    private String subjectUrll;

}