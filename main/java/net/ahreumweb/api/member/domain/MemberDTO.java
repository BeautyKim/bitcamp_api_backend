package net.ahreumweb.api.member.domain;

/**
 * packageName:  net.ahreumweb.api.common.domain
 * fileName     : MemverDTO
 * author       : ahreum
 * date         : 2022-02-11
 * desc         :
 * ================================
 * DATE         AUTHOR        NOTE
 * ================================
 * 2022-02-11      ahreum        최초 생성
 */
public class MemberDTO {
    public static String MEMBER = "회원 테이블";
    private final static MemberDTO memberDTO = new MemberDTO();
    private MemberDTO(){}
    public static MemberDTO getInstance(){return memberDTO;}

    private String memId;
    private String memName;
    private int menNumberr;
    private String addr;
    private String phone1;
    private String phone2;
    private String height;
    private String debutDate;

    public static String getMEMBER() {
        return MEMBER;
    }

    public static void setMEMBER(String MEMBER) {
        MemberDTO.MEMBER = MEMBER;
    }

    public String getMemId() {
        return memId;
    }

    public void setMemId(String memId) {
        this.memId = memId;
    }

    public String getMemName() {
        return memName;
    }

    public void setMemName(String memName) {
        this.memName = memName;
    }

    public int getMenNumberr() {
        return menNumberr;
    }

    public void setMenNumberr(int menNumberr) {
        this.menNumberr = menNumberr;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getPhone1() {
        return phone1;
    }

    public void setPhone1(String phone1) {
        this.phone1 = phone1;
    }

    public String getPhone2() {
        return phone2;
    }

    public void setPhone2(String phone2) {
        this.phone2 = phone2;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getDebutDate() {
        return debutDate;
    }

    public void setDebutDate(String debutDate) {
        this.debutDate = debutDate;
    }
}
