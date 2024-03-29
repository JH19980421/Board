package com.example.demo.api.response;

import com.example.demo.api.entity.Board;
import com.example.demo.api.entity.UploadFile;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

import static com.example.demo.web.entity.BaseEntity.*;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class GetBoardResponse {

    private Long id;
    private String title;
    private String writer;
    private String content;
    private List<UploadFile> uploadFiles;
    private State state;

    public GetBoardResponse(Board board) {
        this.id = board.getId();
        this.title = board.getTitle();
        this.content = board.getContent();
        this.writer = board.getWriter();
        this.state = board.getState();
        this.uploadFiles = board.getUploadFiles();
    }
}
