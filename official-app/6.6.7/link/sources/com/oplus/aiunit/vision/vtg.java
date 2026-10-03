package com.oplus.aiunit.vision;

import android.text.TextUtils;
import com.oplus.pay.opensdk.statistic.helper.DigestHelper;
import com.oplus.pay.opensdk.statistic.network.AesHelper;
import java.security.SecureRandom;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class vtg {
    public String a;
    public byte[] b;
    public String c;
    public String d;
    public String e;

    public vtg(String str) {
        byte[] bArrD = d();
        this.b = bArrD;
        this.c = DigestHelper.c(bArrD, 10);
        String strC = DigestHelper.c(d(), 10);
        this.a = strC;
        this.d = v3g.c(strC, str);
        this.e = null;
    }

    public boolean a() {
        return (TextUtils.isEmpty(this.a) || this.b == null || TextUtils.isEmpty(this.d) || TextUtils.isEmpty(this.e)) ? false : true;
    }

    public String b(String str) {
        if (TextUtils.isEmpty(this.a)) {
            pce.c("decrypt fail aes is null");
            return null;
        }
        try {
            return AesHelper.b(str, this.a, this.b);
        } catch (Throwable th) {
            pce.c(th.getMessage());
            return null;
        }
    }

    public String c(String str) {
        if (TextUtils.isEmpty(this.a)) {
            pce.c("encrypt fail aes is null");
            return null;
        }
        try {
            return AesHelper.d(str, this.a, this.b);
        } catch (Throwable th) {
            pce.c(th.getMessage());
            return null;
        }
    }

    public final byte[] d() {
        byte[] bArr = new byte[16];
        new SecureRandom().nextBytes(bArr);
        return bArr;
    }
}
