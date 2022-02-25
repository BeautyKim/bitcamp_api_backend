package net.ahreumweb.api.member.service;

import lombok.RequiredArgsConstructor;
import net.ahreumweb.api.member.domain.CalcDTO;
import net.ahreumweb.api.member.domain.MemberDTO;
import net.ahreumweb.api.member.repository.MemberRepository;
import org.springframework.stereotype.Service;


/**
 * packageName:  net.ahreumweb.api.common.service
 * fileName     : MemberServiceImpl
 * author       : ahreum
 * date         : 2022-02-11
 * desc         :
 * ================================
 * DATE         AUTHOR        NOTE
 * ================================
 * 2022-02-11      ahreum        최초 생성
 */
@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService{
    private final MemberRepository repository;

    @Override
    public String calc(CalcDTO calc) {
        int a = calc.getNum1();
        int b = calc.getNum2();
        int res = 0;
        switch (calc.getOpcode()){
            case "+": res = a + b; break;
            case "-": res = a - b; break;
            case "*": res = a * b; break;
            case "/": res = a / b; break;
            case "%": res = a % b; break;
        }
        return String.format("%d %s %d = %d ", a, b, res);
    }

    @Override
    public String bmi(MemberDTO bmi) {
        String a = bmi.getName();
        double b = bmi.getHeight();
        double c = bmi.getWeight();
        String res = "";
        double resBmi = b/(c*c)*10000;
        if(resBmi >= 35){
            res = "고도 비만";
        }else if(resBmi >= 30){
            res = "중도 비만 (2단계 비만)";
        }else if(resBmi >= 25){
            res = "경도 비만 (1단계 비만)";
        }else if(resBmi >= 23){
            res = "과체중";
        } else if(resBmi >= 18.5){
            res = "정상";
        } else {
            res = "저체중";
        }return String.format("%s 님은 %s 입니다", a, res);
    }

    @Override
    public String login(MemberDTO login) {
        return repository.login(login);
    }
}
