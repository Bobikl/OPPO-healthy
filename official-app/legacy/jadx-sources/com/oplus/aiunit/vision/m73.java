package com.oplus.aiunit.vision;

import com.leon.channel.common.V1SchemeUtil;
import java.io.File;

/* JADX INFO: loaded from: classes4.dex */
public class m73 {
    public static String a(File file) {
        try {
            return V1SchemeUtil.b(file);
        } catch (Exception unused) {
            System.out.println("APK : " + file.getAbsolutePath() + " not have channel info from Zip Comment");
            return null;
        }
    }

    public static String b(File file) {
        System.out.println("try to read channel info from apk : " + file.getAbsolutePath());
        return c2a.d(file, d73.CHANNEL_BLOCK_ID);
    }
}
