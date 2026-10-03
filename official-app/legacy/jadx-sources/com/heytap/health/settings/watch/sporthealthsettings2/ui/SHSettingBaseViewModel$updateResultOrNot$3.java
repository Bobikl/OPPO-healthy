package com.heytap.health.settings.watch.sporthealthsettings2.ui;

import p010kotlin.Metadata;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.jvm.internal.ContinuationImpl;
import p010kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingBaseViewModel", f = "SHSettingBaseViewModel.kt", i = {}, l = {149}, m = "updateResultOrNot", n = {}, s = {})
public final class SHSettingBaseViewModel$updateResultOrNot$3 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SHSettingBaseViewModel<D> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SHSettingBaseViewModel$updateResultOrNot$3(SHSettingBaseViewModel<D> sHSettingBaseViewModel, Continuation<? super SHSettingBaseViewModel$updateResultOrNot$3> continuation) {
        super(continuation);
        this.this$0 = sHSettingBaseViewModel;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type kotlin.coroutines.Continuation to com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingBaseViewModel$updateResultOrNot$3 for r1v2 'this'  kotlin.coroutines.Continuation
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r2) {
        /*
            r1 = this;
            r1.result = r2
            int r2 = r1.label
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r2 | r0
            r1.label = r2
            com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingBaseViewModel<D> r2 = r1.this$0
            r0 = 0
            java.lang.Object r1 = r2.s0(r0, r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingBaseViewModel$updateResultOrNot$3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
