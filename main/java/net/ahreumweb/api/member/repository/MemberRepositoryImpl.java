package net.ahreumweb.api.member.repository;

import net.ahreumweb.api.member.domain.CalcDTO;
import net.ahreumweb.api.member.domain.MemberDTO;
import org.springframework.stereotype.Repository;

@Repository
public class MemberRepositoryImpl implements MemberRepository {


    @Override
    public String calc(CalcDTO calc) {
        return null;
    }

    @Override
    public String bmi(MemberDTO bmi) {
        return null;
    }

    @Override
    public String login(MemberDTO login) {
        return null;
    }
}
