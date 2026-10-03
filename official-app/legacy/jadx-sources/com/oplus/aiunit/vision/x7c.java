package com.oplus.aiunit.vision;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\n\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fR*\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\u0004\u0010\b¨\u0006\r"}, d2 = {"Lcom/oplus/aiunit/vision/x7c;", "Lcom/oplus/aiunit/vision/j91;", "", "", "d", "Ljava/util/List;", "getSrc", "()Ljava/util/List;", "(Ljava/util/List;)V", "src", "category", "<init>", "(Ljava/lang/String;)V", "watchface_impl_release"}, k = 1, mv = {1, 8, 0})
public class x7c extends j91 {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @SerializedName("src")
    @Nullable
    private List<String> src;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x7c(@NotNull String category) {
        super(category, 0, 0, 6, null);
        Intrinsics.checkNotNullParameter(category, "category");
    }

    public final void d(@Nullable List<String> list) {
        this.src = list;
    }
}
