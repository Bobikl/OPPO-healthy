package com.oplus.aiunit.vision;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public class y68 implements ona {
    public final fj8 a;

    @Nullable
    public final URL b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final String f18887c;

    @Nullable
    public String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public URL f18888e;

    @Nullable
    public volatile byte[] f;
    public int g;

    public y68(URL url) {
        this(url, fj8.DEFAULT);
    }

    public String a() {
        String str = this.f18887c;
        return str != null ? str : ((URL) cpe.d(this.b)).toString();
    }

    public final byte[] b() {
        if (this.f == null) {
            this.f = a().getBytes(ona.CHARSET);
        }
        return this.f;
    }

    public Map<String, String> c() {
        return this.a.a();
    }

    public final String d() {
        if (TextUtils.isEmpty(this.d)) {
            String string = this.f18887c;
            if (TextUtils.isEmpty(string)) {
                string = ((URL) cpe.d(this.b)).toString();
            }
            this.d = Uri.encode(string, "@#&=*+-_.,:!?()/~'%;$");
        }
        return this.d;
    }

    public final URL e() throws MalformedURLException {
        if (this.f18888e == null) {
            this.f18888e = new URL(d());
        }
        return this.f18888e;
    }

    @Override // com.oplus.aiunit.vision.ona
    public boolean equals(Object obj) {
        if (!(obj instanceof y68)) {
            return false;
        }
        y68 y68Var = (y68) obj;
        return a().equals(y68Var.a()) && this.a.equals(y68Var.a);
    }

    public String f() {
        return d();
    }

    public URL g() throws MalformedURLException {
        return e();
    }

    @Override // com.oplus.aiunit.vision.ona
    public int hashCode() {
        if (this.g == 0) {
            int iHashCode = a().hashCode();
            this.g = iHashCode;
            this.g = (iHashCode * 31) + this.a.hashCode();
        }
        return this.g;
    }

    public String toString() {
        return a();
    }

    @Override // com.oplus.aiunit.vision.ona
    public void updateDiskCacheKey(@NonNull MessageDigest messageDigest) {
        messageDigest.update(b());
    }

    public y68(String str) {
        this(str, fj8.DEFAULT);
    }

    public y68(URL url, fj8 fj8Var) {
        this.b = (URL) cpe.d(url);
        this.f18887c = null;
        this.a = (fj8) cpe.d(fj8Var);
    }

    public y68(String str, fj8 fj8Var) {
        this.b = null;
        this.f18887c = cpe.b(str);
        this.a = (fj8) cpe.d(fj8Var);
    }
}
