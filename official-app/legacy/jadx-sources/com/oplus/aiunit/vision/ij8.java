package com.oplus.aiunit.vision;

import java.io.IOException;
import okio.BufferedSource;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00102\u00020\u0001:\u0001\u0005B\u000f\u0012\u0006\u0010\r\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0004R\u0016\u0010\b\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0007R\u0017\u0010\r\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/oplus/aiunit/vision/ij8;", "", "", "b", "Lcom/oplus/aiunit/vision/gj8;", "a", "", "J", "headerLimit", "Lokio/BufferedSource;", "Lokio/BufferedSource;", "getSource", "()Lokio/BufferedSource;", "source", "<init>", "(Lokio/BufferedSource;)V", "Companion", "okhttp4_extension_release"}, k = 1, mv = {1, 4, 0})
public final class ij8 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public long headerLimit;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final BufferedSource source;

    public ij8(@NotNull BufferedSource source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.source = source;
        this.headerLimit = 262144;
    }

    @NotNull
    public final gj8 a() throws IOException {
        gj8.a aVar = new gj8.a();
        while (true) {
            String strB = b();
            if (strB.length() == 0) {
                return aVar.g();
            }
            aVar.d(strB);
        }
    }

    @NotNull
    public final String b() throws IOException {
        String utf8LineStrict = this.source.readUtf8LineStrict(this.headerLimit);
        this.headerLimit -= (long) utf8LineStrict.length();
        return utf8LineStrict;
    }
}
