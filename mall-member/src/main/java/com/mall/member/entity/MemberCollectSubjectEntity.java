package com.mall.member.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * 会员收藏的专题活动
 *
 * @author NoFat nf916803397@gmail.com
 * @since 1.0.0 2022-08-02
 */
@Data
@TableName("ums_member_collect_subject")
public class MemberCollectSubjectEntity {

    /**
     * id
     */
	private Long id;
    /**
     * subject_id
     */
	private Long subjectId;
    /**
     * subject_name
     */
	private String subjectName;
    /**
     * subject_img
     */
	private String subjectImg;
    /**
     * 活动url
     */
	private String subjectUrll;
}