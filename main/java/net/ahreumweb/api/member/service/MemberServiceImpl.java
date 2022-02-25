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
        int result = 0;
        switch (calc.getOpcode()){
            case "+": result = a + b; break;
            case "-": result = a - b; break;
            case "*": result = a * b; break;
            case "/": result = a / b; break;
            case "%": result = a % b; break;
        }
        return String.format("%d %s %d = %d ", a, calc.getOpcode(),b, result);
    }

    @Override
    public String bmi(MemberDTO bmi) {
        String a = bmi.getName();
        double b = bmi.getHeight();
        double c = bmi.getWeight();
        String result = "";
        double resBmi = c/(b*b)*10000;
        if(resBmi >= 35){
            result = "고도 비만";
        }else if(resBmi >= 30){
            result = "중도 비만 (2단계 비만)";
        }else if(resBmi >= 25){
            result = "경도 비만 (1단계 비만)";
        }else if(resBmi >= 23){
            result = "과체중";
        } else if(resBmi >= 18.5){
            result = "정상";
        } else {
            result = "저체중";
        }return String.format("%s 님은 %s 입니다", a, result);
    }

    @Override
    public String login(MemberDTO login) {
        return repository.login(login);
    }

    @Override
    public String grade(MemberDTO grade) {
        int total = grade.getKo() + grade.getEn() + grade.getMath();
        int avg = total / 3;
        String pass = (avg >= 60) ? "합격" : "불합격";

        return String.format(" * ##################\n" +
                        " * > 이름: %s\n" +
                        " * > 국어: %d점\n" +
                        " * > 영어: %d점\n" +
                        " * > 수학: %d점\n" +
                        " * 총점: %d점\n" +
                        " * 평균(정수): %d점\n" +
                        " * 합격여부: %s\n" +
                        " * #######################",
                grade.getName(),
                grade.getKo(),
                grade.getEn(),
                grade.getMath(),
                total,
                avg, pass);
    }
}
