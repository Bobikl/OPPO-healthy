package com.oplus.aiunit.vision;

import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0005\u001a\u0004\b\n\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/oplus/aiunit/vision/x30;", "Lcom/oplus/aiunit/vision/v11;", "", "", b2n.g, "Ljava/util/List;", "j", "()Ljava/util/List;", "animResources", "", "i", "animAssets", "", "title", "summary", "<init>", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V", "coui-support-card_release"}, k = 1, mv = {1, 8, 0})
public final class x30 extends v11 {

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final List<Integer> animResources;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final List<String> animAssets;

    /* JADX WARN: Multi-variable type inference failed */
    public x30() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @NotNull
    public final List<String> i() {
        return this.animAssets;
    }

    @NotNull
    public final List<Integer> j() {
        return this.animResources;
    }

    public /* synthetic */ x30(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x30(@NotNull CharSequence title, @NotNull CharSequence summary) {
        super(title, summary);
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(summary, "summary");
        this.animResources = new ArrayList();
        this.animAssets = new ArrayList();
    }
}
