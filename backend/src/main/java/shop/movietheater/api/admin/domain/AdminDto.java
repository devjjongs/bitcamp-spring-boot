package shop.movietheater.api.admin.domain;

import lombok.Data;

@Data
public class AdminDto {
    private Long adminID;
    private String adminPW;
    private String adminNAME;

}
