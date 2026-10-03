package com.oplus.aiunit.vision;

import com.heytap.health.watchface.R$string;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0002¨\u0006\u000b"}, d2 = {"Lcom/oplus/aiunit/vision/c1b;", "", "", "errorCode", "", "message", "b", "resId", "a", "<init>", "()V", "watchface_impl_release"}, k = 1, mv = {1, 8, 0})
public final class c1b {

    @NotNull
    public static final c1b INSTANCE = new c1b();

    @NotNull
    public final String a(int resId) {
        String string = b78.a().getString(resId);
        Intrinsics.checkNotNullExpressionValue(string, "getAppContext().getString(resId)");
        return string;
    }

    @NotNull
    public final String b(int errorCode, @NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (errorCode == 2004) {
            return a(R$string.watch_face_livephoto_ai_error_code_style_not_match);
        }
        if (errorCode != 2100) {
            return errorCode != 2101 ? a(R$string.watch_face_livephoto_ai_error_code_style) : message;
        }
        return a(R$string.watch_face_livephoto_ai_error_code_frequency_limit);
    }
}
