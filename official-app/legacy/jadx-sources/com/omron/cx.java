package com.omron;

import android.support.annotation.NonNull;
import com.omron.lib.ohc.OHQDeviceManager;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class cx {

    @NonNull
    private static final cx b = new cx();

    @NonNull
    private final bw a;

    private cx() {
        bw bwVarA = bw.a();
        this.a = bwVarA;
        bwVarA.a(OHQDeviceManager.DEFAULT_CONSENT_CODE, new da());
    }

    public static cx a() {
        return b;
    }

    public List<by> a(byte[] bArr) {
        return this.a.a(bArr);
    }
}
