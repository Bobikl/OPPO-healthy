package com.oplus.aiunit.vision;

import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B)\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rB%\b\u0016\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0002¢\u0006\u0004\b\f\u0010\u0010R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/oplus/aiunit/vision/t3a;", "Lcom/oplus/aiunit/vision/v11;", "", "", b2n.g, "[Ljava/lang/Integer;", "i", "()[Ljava/lang/Integer;", "imageResources", "", "title", "summary", "<init>", "([Ljava/lang/Integer;Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V", "", "choices", "([Ljava/lang/Integer;[Ljava/lang/String;)V", "coui-support-card_release"}, k = 1, mv = {1, 8, 0})
public final class t3a extends v11 {

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final Integer[] imageResources;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t3a(@NotNull Integer[] imageResources, @NotNull CharSequence title, @NotNull CharSequence summary) {
        super(title, summary);
        Intrinsics.checkNotNullParameter(imageResources, "imageResources");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(summary, "summary");
        this.imageResources = imageResources;
    }

    @NotNull
    /* JADX INFO: renamed from: i, reason: from getter */
    public final Integer[] getImageResources() {
        return this.imageResources;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public t3a(@NotNull Integer[] imageResources, @NotNull String[] choices) {
        this(imageResources, "", "");
        Intrinsics.checkNotNullParameter(imageResources, "imageResources");
        Intrinsics.checkNotNullParameter(choices, "choices");
        h(choices);
    }
}
