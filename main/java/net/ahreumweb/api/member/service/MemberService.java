package net.ahreumweb.api.member.service;

import java.util.Scanner;

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
    String membershipList();
    String memberCheckingInformation();
    String shipmentList();
    String sendEmailList();
    String accumulatedMoneyList();
    String accumulatedMoneyDelete();



}
