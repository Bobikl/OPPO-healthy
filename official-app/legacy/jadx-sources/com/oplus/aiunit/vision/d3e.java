package com.oplus.aiunit.vision;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0002R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/oplus/aiunit/vision/d3e;", "", "", "versionName", "", "b", TypedValues.Custom.S_STRING, "a", "TAG", "Ljava/lang/String;", "<init>", "()V", "watchface_impl_release"}, k = 1, mv = {1, 8, 0})
public final class d3e {

    @NotNull
    public static final d3e INSTANCE = new d3e();

    @NotNull
    public static final String TAG = "PackageUtil";

    @Nullable
    public final String a(@NotNull String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        return ybb.b(string);
    }

    public final int b(@NotNull String versionName) {
        Intrinsics.checkNotNullParameter(versionName, "versionName");
        List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) versionName, new String[]{"."}, false, 0, 6, (Object) null);
        if (listSplit$default.size() == 3) {
            return (Integer.parseInt((String) listSplit$default.get(0)) * 10000) + (Integer.parseInt((String) listSplit$default.get(1)) * 100) + Integer.parseInt((String) listSplit$default.get(2));
        }
        throw new RuntimeException("watch face version name format error.eg:x.x.x");
    }
}
