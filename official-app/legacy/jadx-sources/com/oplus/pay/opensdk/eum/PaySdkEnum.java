package com.oplus.pay.opensdk.eum;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes8.dex */
@Keep
public enum PaySdkEnum {
    CheckSuccess(10050, "启动安全支付APK成功"),
    CheckStart(10051, "输入区域与SDK分包区域不匹配"),
    CheckInstall(10052, "不存在安全支付APK"),
    CheckParams(10053, "参数校验不通过"),
    CheckMBA(10054, "intent无法启动（android11，应用可以被禁用）"),
    CheckPreOrder(10056, "预下单查询接口异常"),
    CheckEU(10057, "欧盟暂不支持"),
    CheckOutBrand(10058, "外发暂不支持，请联系MSP团队"),
    CheckRouterFailForDownLoad(10052, "The checkout counter host application routing verification failed! "),
    CheckDefaultRouterForDownload(10052, "The demoted backstop strategy host is not installed after starting the pay host failed!"),
    CheckRouterInfoForDownload(10052, "The route information generation failed. Please check if the route configuration is correct!"),
    CODE_PERMISSION_DENIED(1009, "permission denied");

    private int code;
    private String msg;

    PaySdkEnum(int i, String str) {
        this.code = i;
        this.msg = str;
    }

    public int getCode() {
        return this.code;
    }

    public String getMsg() {
        return this.msg;
    }
}
