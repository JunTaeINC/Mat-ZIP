package site.matzip.review.dto;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class ReviewListDTO {
    private Long matzipId;
    private String authorNickname;
    private double rating;
    private String content;
    private LocalDateTime createDate;
}
