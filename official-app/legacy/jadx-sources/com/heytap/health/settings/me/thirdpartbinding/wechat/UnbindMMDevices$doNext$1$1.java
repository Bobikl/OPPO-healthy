package com.heytap.health.settings.me.thirdpartbinding.wechat;

import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
public /* synthetic */ class UnbindMMDevices$doNext$1$1 extends FunctionReferenceImpl implements Function1<Boolean, Unit> {
    public UnbindMMDevices$doNext$1$1(Object obj) {
        super(1, obj, UnbindMMDevices.class, "bindResult", "bindResult(Z)V", 0);
    }

    @Override // p010kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return Unit.INSTANCE;
    }

    public final void invoke(boolean z) {
        ((UnbindMMDevices) this.receiver).e8(z);
    }
}
