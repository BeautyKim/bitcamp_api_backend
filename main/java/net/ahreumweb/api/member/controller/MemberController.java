package net.ahreumweb.api.member.controller;

import lombok.RequiredArgsConstructor;
import net.ahreumweb.api.member.domain.CalcDTO;
import net.ahreumweb.api.member.domain.MemberDTO;
import net.ahreumweb.api.member.service.MemberService;
import org.springframework.web.bind.annotation.*;

/**
 * packageName:  net.ahreumweb.api.naver_db.controller
 * fileName     : NaverDbController
 * author       : ahreum
 * date         : 2022-02-11
 * desc         :
 * ================================
 * DATE         AUTHOR        NOTE
 * ================================
 * 2022-02-11      ahreum        최초 생성
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/member")
public class MemberController {
    private final MemberService service;

    @PostMapping("/calc")
    public String calc(@RequestBody CalcDTO calc){
        return service.calc(calc);
    }
    @PostMapping("/bmi")
    public String bmi(@RequestBody MemberDTO bmi){
        return service.bmi(bmi);
    }
    @PostMapping("/login")
    public String login(@RequestBody MemberDTO login){
        return service.login(login);
    }
}
