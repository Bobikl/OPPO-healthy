package com.oplus.aiunit.vision;

import java.io.InputStream;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001c\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\t\u001a\u00020\bH\u0016¨\u0006\f"}, d2 = {"Lcom/oplus/aiunit/vision/ewi;", "Lcom/oplus/aiunit/vision/o2c;", "", "Ljava/io/InputStream;", "Lcom/oplus/aiunit/vision/p7c;", "multiFactory", "Lcom/oplus/aiunit/vision/n2c;", "d", "", "c", "<init>", "()V", "health_archives_release"}, k = 1, mv = {1, 8, 0})
public final class ewi implements o2c<String, InputStream> {
    @Override // com.oplus.aiunit.vision.o2c
    public void c() {
    }

    @Override // com.oplus.aiunit.vision.o2c
    @NotNull
    public n2c<String, InputStream> d(@NotNull p7c multiFactory) {
        Intrinsics.checkNotNullParameter(multiFactory, "multiFactory");
        return new dwi();
    }
}
