package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.oplus.smartenginehelper.ParserTag;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/oplus/aiunit/vision/i1i;", "Lcom/oplus/aiunit/vision/enj;", "", "text", "Lkotlin/Function0;", "", ParserTag.TAG_ONCLICK, "<init>", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "operation_impl_release"}, k = 1, mv = {1, 8, 0})
public final class i1i extends enj {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1i(@NotNull String text, @NotNull Function0<Unit> onClick) {
        super(text, 3, onClick);
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
    }
}
