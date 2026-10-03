package com.heytap.msp.okipc;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.heytap.msp.okipc.exception.IPCException;
import com.heytap.msp.okipc.exception.IPCServerException;
import com.heytap.msp.okipc.exception.IPCServerExecuteException;
import com.heytap.msp.okipc.exception.IPCUnknownException;
import java.nio.charset.StandardCharsets;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes19.dex */
public class e {
    public final byte[] a;
    public final a b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f7339c;

    public e(byte[] bArr, a aVar, int i) {
        this.a = bArr == null ? new byte[0] : bArr;
        this.b = aVar == null ? new a() : aVar;
        this.f7339c = i;
    }

    public static e a(@Nullable Bundle bundle) {
        a aVar;
        int i;
        byte[] byteArray = new byte[0];
        if (bundle != null) {
            byteArray = bundle.getByteArray("res_body");
            aVar = new a(bundle.getBundle("ipc_headers"));
            i = bundle.getInt("ipc_status_code");
        } else {
            aVar = null;
            i = 600;
        }
        return new e(byteArray, aVar, i);
    }

    public static e e(Throwable th) {
        return h(new IPCServerExecuteException("", th));
    }

    public static IPCException g(int i, String str) {
        try {
            return com.heytap.msp.okipc.exception.a.a().b(i, str);
        } catch (Exception unused) {
            return new IPCUnknownException("code:" + i + ", msg:" + str);
        }
    }

    public static e h(IPCServerException iPCServerException) {
        try {
            JSONObject jSONObject = new JSONObject();
            iPCServerException.writeTo(jSONObject);
            return new e(jSONObject.toString().getBytes(StandardCharsets.UTF_8), new a(), iPCServerException.getExceptionType().getStatusCode());
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }

    public int b() {
        return this.f7339c;
    }

    public Exception c() {
        return d(null);
    }

    public Exception d(byte[] bArr) {
        if (bArr == null) {
            bArr = this.a;
        }
        String str = new String(bArr, StandardCharsets.UTF_8);
        IPCException iPCExceptionG = g(this.f7339c, str);
        return iPCExceptionG != null ? iPCExceptionG : new IPCUnknownException(str);
    }

    public boolean f() {
        return this.f7339c == 200;
    }

    public Bundle i() {
        Bundle bundle = new Bundle();
        bundle.putInt("ipc_protocol_version", 1);
        bundle.putInt("ipc_transaction_type", 0);
        bundle.putByteArray("res_body", this.a);
        a aVar = this.b;
        if (aVar != null) {
            bundle.putBundle("ipc_headers", aVar.b());
        }
        bundle.putInt("ipc_status_code", this.f7339c);
        return bundle;
    }

    public String toString() {
        return "IPCRawResponse(statusCode=" + this.f7339c + ", headers=" + this.b + ", body=" + new String(this.a) + ")";
    }

    public e(byte[] bArr) {
        this(bArr, null, 200);
    }
}
