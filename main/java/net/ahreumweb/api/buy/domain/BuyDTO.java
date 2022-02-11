package net.ahreumweb.api.buy.domain;

import net.ahreumweb.api.buy.service.BuyService;
import net.ahreumweb.api.buy.service.BuyServiceImpl;

import java.util.Scanner;

/**
 * packageName:  net.ahreumweb.api.common.domain
 * fileName     : BuyDTO
 * author       : ahreum
 * date         : 2022-02-11
 * desc         :
 * ================================
 * DATE         AUTHOR        NOTE
 * ================================
 * 2022-02-11      ahreum        최초 생성
 */
public class BuyDTO {
    public static String BUY = "구매 테이블";
    private final static BuyDTO buyDTO = new BuyDTO();
    private BuyDTO(){}
    public static BuyDTO getInstance(){return buyDTO;}

    private int num;
    private String memId;
    private String prodName;
    private String groupName;
    private int price;
    private String amount;

    public static String getBUY() {
        return BUY;
    }

    public static void setBUY(String BUY) {
        BuyDTO.BUY = BUY;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getMemId() {
        return memId;
    }

    public void setMemId(String memId) {
        this.memId = memId;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }
}
