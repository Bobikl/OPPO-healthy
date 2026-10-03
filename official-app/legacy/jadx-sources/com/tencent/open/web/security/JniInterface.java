package com.tencent.open.web.security;

import android.content.Context;
import com.oplus.aiunit.vision.cm0;
import com.oplus.aiunit.vision.q8g;
import com.oplus.aiunit.vision.uum;
import java.io.File;

/* JADX INFO: loaded from: classes10.dex */
public class JniInterface {
    public static boolean isJniOk = false;

    public static void a() {
        if (isJniOk) {
            return;
        }
        try {
            Context contextA = uum.a();
            if (contextA != null) {
                if (new File(contextA.getFilesDir().toString() + "/" + cm0.SECURE_LIB_NAME).exists()) {
                    System.load(contextA.getFilesDir().toString() + "/" + cm0.SECURE_LIB_NAME);
                    isJniOk = true;
                    q8g.i("openSDK_LOG.JniInterface", "-->load lib success:" + cm0.SECURE_LIB_NAME);
                } else {
                    q8g.i("openSDK_LOG.JniInterface", "-->fail, because so is not exists:" + cm0.SECURE_LIB_NAME);
                }
            } else {
                q8g.i("openSDK_LOG.JniInterface", "-->load lib fail, because context is null:" + cm0.SECURE_LIB_NAME);
            }
        } catch (Throwable th) {
            q8g.g("openSDK_LOG.JniInterface", "-->load lib error:" + cm0.SECURE_LIB_NAME, th);
        }
    }

    public static native String d1(String str);

    public static native String d2(String str);
}
