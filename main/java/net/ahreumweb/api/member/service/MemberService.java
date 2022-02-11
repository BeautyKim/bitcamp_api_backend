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
    void membershipList(Scanner scanner);
    void memberCheckingInformation(Scanner scanner);
    void shipmentList(Scanner scanner);
    void sendEmailList(Scanner scanner);
    void accumulatedMoneyList(Scanner scanner);
    void accumulatedMoneyDelete(Scanner scanner);



}
