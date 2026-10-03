package com.oplus.aiunit.vision;

import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0006H&J\u001a\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&J\b\u0010\u000b\u001a\u00020\u0006H&J\b\u0010\f\u001a\u00020\u0006H&J\u001a\u0010\u0010\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH&¨\u0006\u0011"}, d2 = {"Lcom/oplus/aiunit/vision/yl9;", "", "Lcom/oplus/aiunit/vision/v30;", "config", "", "a", "", "c", "", "frameIndex", MapSchema.FIELD_NAME_ENTRY, "d", "b", "errorType", "", "errorMsg", "onFailed", "animplayer_release"}, k = 1, mv = {1, 4, 0})
public interface yl9 {

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 15})
    public static final class a {
        public static boolean a(yl9 yl9Var, @NotNull AnimConfig config) {
            Intrinsics.checkParameterIsNotNull(config, "config");
            return true;
        }
    }

    boolean a(@NotNull AnimConfig config);

    void b();

    void c();

    void d();

    void e(int frameIndex, @Nullable AnimConfig config);

    void onFailed(int errorType, @Nullable String errorMsg);
}
