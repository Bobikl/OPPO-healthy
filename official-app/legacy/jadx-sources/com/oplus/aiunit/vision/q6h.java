package com.oplus.aiunit.vision;

import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\bR\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lcom/oplus/aiunit/vision/q6h;", "Lcom/oplus/aiunit/vision/j91;", "", "d", "Ljava/lang/String;", "getSrc", "()Ljava/lang/String;", "setSrc", "(Ljava/lang/String;)V", "src", "category", "<init>", "watchface_impl_release"}, k = 1, mv = {1, 8, 0})
public class q6h extends j91 {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @SerializedName("src")
    @NotNull
    private String src;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q6h(@NotNull String category) {
        super(category, 0, 0, 6, null);
        Intrinsics.checkNotNullParameter(category, "category");
        this.src = "";
    }
}
