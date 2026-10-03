package com.oplus.aiunit.vision;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.spongycastle.util.io.pem.PemGenerationException;

/* JADX INFO: loaded from: classes11.dex */
public class tde implements ude {
    public static final List d = Collections.unmodifiableList(new ArrayList());
    public String a;
    public List b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f16973c;

    public tde(String str, byte[] bArr) {
        this(str, d, bArr);
    }

    @Override // com.oplus.aiunit.vision.ude
    public tde a() throws PemGenerationException {
        return this;
    }

    public byte[] b() {
        return this.f16973c;
    }

    public List c() {
        return this.b;
    }

    public String d() {
        return this.a;
    }

    public tde(String str, List list, byte[] bArr) {
        this.a = str;
        this.b = Collections.unmodifiableList(list);
        this.f16973c = bArr;
    }
}
