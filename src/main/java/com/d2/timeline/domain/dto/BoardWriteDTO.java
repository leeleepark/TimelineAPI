package com.d2.timeline.domain.dto;

import com.d2.timeline.domain.vo.Board;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Getter
@Setter
@NoArgsConstructor
public class BoardWriteDTO {

    @NotNull
    @ApiModelProperty(value = "본문 내용")
    private String contentText;

    @NotNull
    @ApiModelProperty(value = "본문 사진")
    private String contentImg;

    public Board transBoard(Board board) {
        board.setContentText(this.contentText);
        board.setContentImg(this.contentImg);
        return board;
    }

    @Builder
    public BoardWriteDTO(String contentText, String contentImg){
        this.contentText = contentText;
        this.contentImg = contentImg;
    }
}