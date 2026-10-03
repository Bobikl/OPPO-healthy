package com.oplus.aiunit.vision;

import java.io.InputStream;

/* JADX INFO: loaded from: classes11.dex */
public abstract class qwa extends InputStream {
    public final InputStream i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f15971j;

    public qwa(InputStream inputStream, int i) {
        this.i = inputStream;
        this.f15971j = i;
    }

    public int a() {
        return this.f15971j;
    }

    public void g(boolean z) {
        InputStream inputStream = this.i;
        if (inputStream instanceof e6a) {
            ((e6a) inputStream).i(z);
        }
    }
}
