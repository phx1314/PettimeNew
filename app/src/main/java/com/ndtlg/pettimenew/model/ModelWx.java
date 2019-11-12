package com.ndtlg.pettimenew.model;

import java.io.Serializable;
import java.util.List;

/**
 * Created by DELL on 2019/3/25.
 */

public class ModelWx implements Serializable{


    /**
     * openid : o-Mrx0yUTjB9ksQ-2cqvzeMEs8w8
     * nickname : 娴风坏瀹濆疂
     * sex : 1
     * language : zh_CN
     * city : Changzhou
     * province : Jiangsu
     * country : CN
     * headimgurl : http://thirdwx.qlogo.cn/mmopen/vi_32/Q0j4TwGTfTI6TTicWOZMPwAibRHnA3p2E2nqgLAFF8qd5Xiaa4C3tfQKqEhcYvjlicibOeXmPDNRRCOISt3kEHbB34g/132
     * privilege : []
     * unionid : oUmPbvqukLzpjwsv1yrrTpzOFu9U
     */

    public String openid;
    public String nickname;
    public int sex;
    public String language;
    public String city;
    public String province;
    public String country;
    public String headimgurl;
    public String unionid;
    public List<?> privilege;
}
