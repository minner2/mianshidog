package com.raymind.mianshidog.model.dto.questionbankquestion;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 更新题库题目关联请求
 *
 * @author raymind
 */
@Data
public class QuestionBankQuestionUpdateRequest implements Serializable {

    /**
     * id
     */
    private Long id;

    /**
     * 题库 id
     */
    private Long questionBankId;

    /**
     * 题目 id
     */
    private Long questionId;

    /**
     * 题目顺序（题号）
     */
    private Integer questionOrder;

    private static final long serialVersionUID = 1L;
}
