package com.alipay.sdk.app;

import android.os.Bundle;
import com.oplus.aiunit.vision.qrm;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes12.dex */
public final class OpenAuthTask {
    public static final int Duplex = 5000;
    public static final int NOT_INSTALLED = 4001;
    public static final int OK = 9000;
    public static final int SYS_ERR = 4000;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Map<String, a> f585e = new ConcurrentHashMap();
    public static long f = -1;
    public static final int g = 122;

    public enum BizType {
        Invoice("20000920"),
        AccountAuth("20000067"),
        Deduct("60000157");

        public String appId;

        BizType(String str) {
            this.appId = str;
        }
    }

    public interface a {
        void a(int i, String str, Bundle bundle);
    }

    public static void a(String str, int i, String str2, Bundle bundle) {
        a aVarRemove = f585e.remove(str);
        if (aVarRemove != null) {
            try {
                aVarRemove.a(i, str2, bundle);
            } catch (Throwable th) {
                qrm.d(th);
            }
        }
    }
}
