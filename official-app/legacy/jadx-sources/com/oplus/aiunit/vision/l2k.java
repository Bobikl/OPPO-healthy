package com.oplus.aiunit.vision;

import java.io.File;

/* JADX INFO: loaded from: classes13.dex */
public class l2k extends qbb {
    public final int b;

    public l2k(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("Max count must be positive number!");
        }
        this.b = i;
    }

    @Override // com.oplus.aiunit.vision.qbb
    public boolean b(File file, long j2, int i) {
        return i <= this.b;
    }
}
