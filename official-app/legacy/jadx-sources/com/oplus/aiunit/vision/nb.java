package com.oplus.aiunit.vision;

import android.content.Context;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class nb {
    public static final String DEBUG_HEADER_DISABLE_ENVELOPE = "DisableEnvelope";
    public static final String EXCEPTION_CERT_EXPIRED = "CertificateExpiredException";
    public static final String EXCEPTION_CERT_NOT_YET_VALID = "CertificateNotYetValidException";
    public cj a;

    public nb(Context context, lb lbVar, List<jea> list, pl9 pl9Var) {
        mb.c(pl9Var);
        this.a = new cj(context, list, lbVar);
    }

    public <T> T a(Class<T> cls) {
        return (T) this.a.c(cls);
    }
}
