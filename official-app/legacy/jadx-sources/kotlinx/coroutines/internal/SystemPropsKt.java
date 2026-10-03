package kotlinx.coroutines.internal;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"kotlinx/coroutines/internal/SystemPropsKt__SystemPropsKt", "kotlinx/coroutines/internal/SystemPropsKt__SystemProps_commonKt"}, k = 4, mv = {1, 8, 0}, xi = 48)
public final class SystemPropsKt {
    public static final int getAVAILABLE_PROCESSORS() {
        return SystemPropsKt__SystemPropsKt.getAVAILABLE_PROCESSORS();
    }

    public static final int systemProp(@NotNull String str, int i, int i2, int i3) {
        return SystemPropsKt__SystemProps_commonKt.systemProp(str, i, i2, i3);
    }

    public static final long systemProp(@NotNull String str, long j2, long j3, long j4) {
        return SystemPropsKt__SystemProps_commonKt.systemProp(str, j2, j3, j4);
    }

    @Nullable
    public static final String systemProp(@NotNull String str) {
        return SystemPropsKt__SystemPropsKt.systemProp(str);
    }

    @NotNull
    public static final String systemProp(@NotNull String str, @NotNull String str2) {
        return SystemPropsKt__SystemProps_commonKt.systemProp(str, str2);
    }

    public static final boolean systemProp(@NotNull String str, boolean z) {
        return SystemPropsKt__SystemProps_commonKt.systemProp(str, z);
    }
}
