package com.oplus.aiunit.vision;

import java.io.EOFException;
import okio.Buffer;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.ranges.RangesKt___RangesKt;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¨\u0006\u0003"}, d2 = {"Lokio/Buffer;", "", "a", "okhttp-logging-interceptor"}, k = 2, mv = {1, 4, 0})
public final class kqk {
    public static final boolean a(@NotNull Buffer isProbablyUtf8) {
        Intrinsics.checkNotNullParameter(isProbablyUtf8, "$this$isProbablyUtf8");
        try {
            Buffer buffer = new Buffer();
            isProbablyUtf8.copyTo(buffer, 0L, RangesKt___RangesKt.coerceAtMost(isProbablyUtf8.size(), 64L));
            for (int i = 0; i < 16 && !buffer.exhausted(); i++) {
                int utf8CodePoint = buffer.readUtf8CodePoint();
                if (Character.isISOControl(utf8CodePoint) && !Character.isWhitespace(utf8CodePoint)) {
                    return false;
                }
            }
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }
}
