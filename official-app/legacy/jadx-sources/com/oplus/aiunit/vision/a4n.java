package com.oplus.aiunit.vision;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes12.dex */
public final class a4n extends g4n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ByteArrayOutputStream f9198e;

    public a4n(g4n g4nVar) {
        super(g4nVar);
        this.f9198e = new ByteArrayOutputStream();
    }

    @Override // com.oplus.aiunit.vision.g4n
    public final byte[] b(byte[] bArr) {
        byte[] byteArray = this.f9198e.toByteArray();
        try {
            this.f9198e.close();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
        this.f9198e = new ByteArrayOutputStream();
        return byteArray;
    }

    @Override // com.oplus.aiunit.vision.g4n
    public final void c(byte[] bArr) {
        try {
            this.f9198e.write(bArr);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
