package com.platform.usercenter.tools.algorithm;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes9.dex */
public class Test {
    public static void main(String[] strArr) {
        XORUtils xORUtils = new XORUtils();
        String str = new String(xORUtils.decrypt("zd6RGVm28xPrhnfDKcQ9VrMBmMiaWFa2oSM= ".getBytes()), Charset.forName("GBK"));
        System.out.println("xor:" + str);
        String str2 = new String(xORUtils.encrypt("汉子".getBytes()));
        System.out.println("en0:" + str2);
        System.out.println("en:" + new String(xORUtils.decrypt(str2.getBytes())));
        new String(xORUtils.encrypt("汉子".getBytes()));
        System.out.println("result:" + new String(xORUtils.decrypt("zd6RGVm28xPrhnfDKcQ9VrMBmMiaWFa2oSM= ".getBytes())));
    }
}
