package com.oplus.aiunit.vision;

import java.io.File;

/* JADX INFO: loaded from: classes13.dex */
public class bu5 implements st5.a {
    public final long a;
    public final a b;

    public interface a {
        File a();
    }

    public bu5(a aVar, long j2) {
        this.a = j2;
        this.b = aVar;
    }

    @Override // com.oplus.aiunit.vision.st5.a
    public st5 build() {
        File fileA = this.b.a();
        if (fileA == null) {
            return null;
        }
        if (fileA.isDirectory() || fileA.mkdirs()) {
            return cu5.c(fileA, this.a);
        }
        return null;
    }
}
