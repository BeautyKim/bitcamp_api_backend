package net.ahreumweb.api.member.service;

import net.ahreumweb.api.member.domain.CalcDTO;
import net.ahreumweb.api.member.domain.MemberDTO;

/**
 * packageName:  net.ahreumweb.api.common.service
 * fileName     : MemberService
 * author       : ahreum
 * date         : 2022-02-11
 * desc         :
 * ================================
 * DATE         AUTHOR        NOTE
 * ================================
 * 2022-02-11      ahreum        최초 생성
 */
public interface MemberService {


    String calc(CalcDTO calc);

    String bmi(MemberDTO bmi);

    String login(MemberDTO login);

    String grade(MemberDTO grade);
}
