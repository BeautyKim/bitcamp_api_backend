package net.ahreumweb.api.member.repository;

import net.ahreumweb.api.member.domain.CalcDTO;
import net.ahreumweb.api.member.domain.MemberDTO;

public interface MemberRepository {
  
    String calc(CalcDTO calc);

    String bmi(MemberDTO bmi);

    String login(MemberDTO login);
}
