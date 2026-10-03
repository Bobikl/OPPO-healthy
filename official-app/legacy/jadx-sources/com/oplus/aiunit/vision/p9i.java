package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/oplus/aiunit/vision/p9i;", "", "", "a", "Z", "()Z", "enable", "", "Lcom/oplus/aiunit/vision/dji;", "b", "Ljava/util/List;", "()Ljava/util/List;", "types", "<init>", "(ZLjava/util/List;)V", "device_settings_impl_release"}, k = 1, mv = {1, 8, 0})
public final class p9i {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final boolean enable;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final List<dji> types;

    public p9i(boolean z, @NotNull List<dji> types) {
        Intrinsics.checkNotNullParameter(types, "types");
        this.enable = z;
        this.types = types;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getEnable() {
        return this.enable;
    }

    @NotNull
    public final List<dji> b() {
        return this.types;
    }
}
