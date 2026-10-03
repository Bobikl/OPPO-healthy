package com.oplus.aiunit.vision;

import java.io.File;

/* JADX INFO: loaded from: classes13.dex */
public class m2k extends qbb {
    public final long b;

    public m2k(long j2) {
        if (j2 <= 0) {
            throw new IllegalArgumentException("Max size must be positive number!");
        }
        this.b = j2;
    }

    @Override // com.oplus.aiunit.vision.qbb
    public boolean b(File file, long j2, int i) {
        return j2 <= this.b;
    }
}
