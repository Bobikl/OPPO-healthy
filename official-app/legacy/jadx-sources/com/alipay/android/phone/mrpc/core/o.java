package com.alipay.android.phone.mrpc.core;

import com.cloud.sdk.cloudstorage.http.FileSyncModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.apache.http.Header;

/* JADX INFO: loaded from: classes12.dex */
public final class o extends t {
    public String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f555c;
    public boolean g;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList<Header> f556e = new ArrayList<>();
    public Map<String, String> f = new HashMap();
    public String d = FileSyncModel.FormMime;

    public o(String str) {
        this.b = str;
    }

    public final String a() {
        return this.b;
    }

    public final String b(String str) {
        Map<String, String> map = this.f;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    public final String c() {
        return this.d;
    }

    public final ArrayList<Header> d() {
        return this.f556e;
    }

    public final boolean e() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o.class != obj.getClass()) {
            return false;
        }
        o oVar = (o) obj;
        byte[] bArr = this.f555c;
        if (bArr == null) {
            if (oVar.f555c != null) {
                return false;
            }
        } else if (!bArr.equals(oVar.f555c)) {
            return false;
        }
        String str = this.b;
        if (str == null) {
            if (oVar.b != null) {
                return false;
            }
        } else if (!str.equals(oVar.b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Map<String, String> map = this.f;
        int iHashCode = ((map == null || !map.containsKey("id")) ? 1 : this.f.get("id").hashCode() + 31) * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return String.format("Url : %s,HttpHeader: %s", this.b, this.f556e);
    }

    public final void a(String str) {
        this.d = str;
    }

    public final byte[] b() {
        return this.f555c;
    }

    public final void a(String str, String str2) {
        if (this.f == null) {
            this.f = new HashMap();
        }
        this.f.put(str, str2);
    }

    public final void a(Header header) {
        this.f556e.add(header);
    }

    public final void a(boolean z) {
        this.g = z;
    }

    public final void a(byte[] bArr) {
        this.f555c = bArr;
    }
}
