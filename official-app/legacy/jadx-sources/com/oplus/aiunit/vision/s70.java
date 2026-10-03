package com.oplus.aiunit.vision;

import com.platform.account.third.api.ThirdOauthType;
import java.util.EnumMap;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class s70 {
    /* JADX WARN: Multi-variable type inference failed */
    public static void a(Map<ThirdOauthType, Class<bz9>> map) {
        EnumMap enumMap = new EnumMap(ThirdOauthType.class);
        enumMap.put(ThirdOauthType.WEI_XIN, "com.platform.account.third.weixin.WxThirdOauth");
        enumMap.put(ThirdOauthType.KOU_KOU, "com.platform.account.third.koukou.KouKouThirdOauth");
        enumMap.put(ThirdOauthType.FB, "com.platform.account.third.lianshu.FBThirdOauth");
        enumMap.put(ThirdOauthType.GG, "com.platform.account.third.gg.GGThirdOauth");
        enumMap.put(ThirdOauthType.LN, "com.platform.account.third.ln.LineThirdOauth");
        enumMap.put(ThirdOauthType.MOBILE_CT, "com.platform.account.third.ct.CtTrafficThirdOauth");
        enumMap.put(ThirdOauthType.MOBILE_CM, "com.platform.account.third.ct.CtTrafficThirdOauth");
        enumMap.put(ThirdOauthType.MOBILE_CU, "com.platform.account.third.cu.CuTrafficThirdOauth");
        enumMap.put(ThirdOauthType.WB_CLOUD_FACE, "com.platform.account.third.face.WbCloudFaceOauth");
        enumMap.put(ThirdOauthType.W_AUTH, "com.platform.account.third.wauth.WauthThirdOauth");
        for (Map.Entry entry : enumMap.entrySet()) {
            try {
                map.put((ThirdOauthType) entry.getKey(), Class.forName((String) entry.getValue()));
            } catch (Exception e2) {
                g7b.a("init api error msg: " + e2.getMessage());
            }
        }
    }
}
