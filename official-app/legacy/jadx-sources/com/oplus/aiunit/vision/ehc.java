package com.oplus.aiunit.vision;

import android.content.Context;
import com.oplus.smartenginehelper.ParserTag;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\n"}, d2 = {"Lcom/oplus/aiunit/vision/ehc;", "Lcom/oplus/aiunit/vision/chc;", "Landroid/content/Context;", "context", "", ParserTag.TAG_INDETERMINATE, "Lcom/oplus/aiunit/vision/mb3;", "a", "<init>", "()V", "nearx_release"}, k = 1, mv = {1, 6, 0})
public final class ehc implements chc {
    @Override // com.oplus.aiunit.vision.chc
    @NotNull
    public mb3 a(@NotNull Context context, boolean indeterminate) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new qb3(context, indeterminate);
    }
}
