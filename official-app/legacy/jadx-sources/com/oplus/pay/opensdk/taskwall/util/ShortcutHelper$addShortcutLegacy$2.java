package com.oplus.pay.opensdk.taskwall.util;

import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
final class ShortcutHelper$addShortcutLegacy$2 extends Lambda implements Function0<Unit> {
    final /* synthetic */ ShortcutHelper.a $callback;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShortcutHelper$addShortcutLegacy$2(ShortcutHelper.a aVar) {
        super(0);
        this.$callback = aVar;
    }

    @Override // p010kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ShortcutHelper.a aVar = this.$callback;
        if (aVar != null) {
            aVar.onFailure("创建快捷方式失败: onLoadFailed");
        }
    }
}
