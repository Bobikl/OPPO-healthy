package com.oplus.aiunit.vision;

import android.text.TextUtils;
import com.oplus.pay.opensdk.statistic.helper.DigestHelper;
import com.oplus.pay.opensdk.statistic.network.AesHelper;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes8.dex */
public class fqg {
    public String a;
    public byte[] b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f11468c;
    public String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f11469e;

    public fqg(String str) {
        byte[] bArrD = d();
        this.b = bArrD;
        this.f11468c = DigestHelper.c(bArrD, 10);
        String strC = DigestHelper.c(d(), 10);
        this.a = strC;
        this.d = s0g.c(strC, str);
        this.f11469e = null;
    }

    public boolean a() {
        return (TextUtils.isEmpty(this.a) || this.b == null || TextUtils.isEmpty(this.d) || TextUtils.isEmpty(this.f11469e)) ? false : true;
    }

    public String b(String str) {
        if (TextUtils.isEmpty(this.a)) {
            qae.c("decrypt fail aes is null");
            return null;
        }
        try {
            return AesHelper.b(str, this.a, this.b);
        } catch (Throwable th) {
            qae.c(th.getMessage());
            return null;
        }
    }

    public String c(String str) {
        if (TextUtils.isEmpty(this.a)) {
            qae.c("encrypt fail aes is null");
            return null;
        }
        try {
            return AesHelper.d(str, this.a, this.b);
        } catch (Throwable th) {
            qae.c(th.getMessage());
            return null;
        }
    }

    public final byte[] d() {
        byte[] bArr = new byte[16];
        new SecureRandom().nextBytes(bArr);
        return bArr;
    }
}
