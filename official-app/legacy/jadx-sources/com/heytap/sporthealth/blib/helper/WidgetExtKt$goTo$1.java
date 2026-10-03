package com.heytap.sporthealth.blib.helper;

import android.content.Intent;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.Lambda;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "Activity", "Landroid/content/Intent;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 176)
@SourceDebugExtension({"SMAP\nWidgetExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WidgetExt.kt\ncom/heytap/sporthealth/blib/helper/WidgetExtKt$goTo$1\n*L\n1#1,804:1\n*E\n"})
public final class WidgetExtKt$goTo$1 extends Lambda implements Function1<Intent, Unit> {
    public static final WidgetExtKt$goTo$1 INSTANCE = new WidgetExtKt$goTo$1();

    public WidgetExtKt$goTo$1() {
        super(1);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "$this$null");
    }

    @Override // p010kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Intent intent) {
        invoke2(intent);
        return Unit.INSTANCE;
    }
}
