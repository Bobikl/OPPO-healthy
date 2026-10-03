package com.heytap.msp.okipc;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.heytap.health.watch.notification.impl.pull.NotificationApiService;
import com.heytap.msp.okipc.exception.IPCServerBundleException;
import com.heytap.msp.okipc.exception.IPCServerUnknownProtocolException;
import com.oplus.smartenginehelper.ParserTag;

/* JADX INFO: loaded from: classes19.dex */
public class d {
    public final String a;
    public final a b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f7337c;
    public int d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final IPCMethod f7338e;
    public String f;
    public String g;
    public final String h;

    public d(String str, String str2, IPCMethod iPCMethod, String str3, a aVar, byte[] bArr) {
        this.h = str;
        this.a = str2;
        this.f7338e = iPCMethod == null ? IPCMethod.Service : iPCMethod;
        this.f = str3 == null ? "" : str3;
        this.b = aVar == null ? new a() : aVar;
        this.f7337c = bArr == null ? new byte[0] : bArr;
    }

    public static d b(String str, String str2, IPCMethod iPCMethod, String str3, a aVar, byte[] bArr) {
        return new d(str, str2, iPCMethod, str3, aVar, bArr);
    }

    public static d c(Bundle bundle) {
        if (bundle == null) {
            throw new IPCServerBundleException("bundle is null");
        }
        int i = bundle.getInt("ipc_protocol_version", -1);
        if (i != 1) {
            throw new IPCServerUnknownProtocolException(i);
        }
        a aVar = new a(bundle.getBundle("ipc_headers"));
        String string = bundle.getString(ParserTag.TAG_URI);
        if (string == null) {
            string = "";
        }
        String string2 = bundle.getString("ipc_auth_or_action");
        if (string2 == null) {
            string2 = "";
        }
        String string3 = bundle.getString("ipc_type");
        if (string3 == null) {
            string3 = "Service";
        }
        IPCMethod iPCMethodValueOf = IPCMethod.valueOf(string3);
        byte[] byteArray = bundle.getByteArray("body");
        if (byteArray == null) {
            byteArray = new byte[0];
        }
        String string4 = bundle.getString("calling_pkg");
        String str = string4 != null ? string4 : "";
        d dVarI = i(string, iPCMethodValueOf, string2, aVar, byteArray);
        dVarI.g = str;
        dVarI.d = i;
        return dVarI;
    }

    public static d i(String str, IPCMethod iPCMethod, String str2, a aVar, byte[] bArr) {
        return b(null, str, iPCMethod, str2, aVar, bArr);
    }

    public Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putInt("ipc_protocol_version", this.d);
        bundle.putString(ParserTag.TAG_URI, this.a);
        bundle.putString("ipc_auth_or_action", this.f);
        bundle.putString("ipc_type", this.f7338e.toString());
        bundle.putBundle("ipc_headers", this.b.b());
        bundle.putByteArray("body", this.f7337c);
        bundle.putString("calling_pkg", this.g);
        return bundle;
    }

    public String d() {
        return this.f;
    }

    public String e() {
        return this.g;
    }

    public IPCMethod f() {
        return this.f7338e;
    }

    public void g(String str, String str2) {
        if (TextUtils.isEmpty(this.f)) {
            IPCMethod iPCMethod = this.f7338e;
            if (iPCMethod == IPCMethod.Provider) {
                if (str == null || str.isEmpty()) {
                    str = "";
                }
                this.f = str;
            } else if (iPCMethod == IPCMethod.Service) {
                if (str2 == null || str2.isEmpty()) {
                    str2 = "";
                }
                this.f = str2;
            }
        }
        if (TextUtils.isEmpty(this.f)) {
            throw new IllegalArgumentException("authOrAction is empty");
        }
    }

    public Uri h() {
        try {
            return Uri.parse(NotificationApiService.CONTENT + this.f);
        } catch (Exception unused) {
            return Uri.EMPTY;
        }
    }

    public void j(String str) {
        this.g = str;
    }

    @NonNull
    public String toString() {
        return this.a + ", " + this.h + "(" + this.f7338e + ":" + this.f + "), from:" + this.g + ", " + this.d + "," + this.b + "," + new String(this.f7337c);
    }
}
