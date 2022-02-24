package net.ahreumweb.api.member.controller;

import lombok.RequiredArgsConstructor;
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
public class MemberController {

    private final MemberService service;

    @GetMapping("/member/bmi/{name}/{height}/{weight}")
    public String getBmi(@PathVariable String name,
                         @PathVariable double height,
                         @PathVariable double weight){

        System.out.println("리액트에서 넘어온 이름: " + name);
        System.out.println("리액트에서 넘어온 키: " + height);
        System.out.println("리액트에서 넘어온 몸무게: " + weight);
        return "BMI는 정상";
    }
}
