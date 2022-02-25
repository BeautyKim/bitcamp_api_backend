package net.ahreumweb.api.member.domain;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * packageName:  net.ahreumweb.api.common.domain
 * fileName     : MemverDTO
 * author       : ahreum
 * date         : 2022-02-11
 * desc         :
 * ================================
 * DATE         AUTHOR        NOTE
 * ================================
 * 2022-02-11      ahreum        최초 생성
 */
@Data
@Component
public class MemberDTO {

    private String userid;
    private String name;
    private String address;
    private String phone;
    private double height;
    private double weight;
    private String regdate;
    private String id;
    private String pw;
    private int ko;
    private int math;
    private int en;


}
