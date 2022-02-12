package net.ahreumweb.api.buy.service;

import javax.lang.model.element.Name;
import java.util.Date;

/**
 * packageName:  net.ahreumweb.api.common.service
 * fileName     : BuyService
 * author       : ahreum
 * date         : 2022-02-11
 * desc         :
 * ================================
 * DATE         AUTHOR        NOTE
 * ================================
 * 2022-02-11      ahreum        최초 생성
 */
public interface BuyService {
    String depositList();
    String withdrawalList();
    String returnList();
    String exchangeList();
    String resendList();
    String shippingList();
}
