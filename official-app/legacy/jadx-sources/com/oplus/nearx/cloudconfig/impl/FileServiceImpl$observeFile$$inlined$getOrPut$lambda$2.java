package com.oplus.nearx.cloudconfig.impl;

import com.oplus.aiunit.vision.ic7;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "invoke", "com/oplus/nearx/cloudconfig/impl/FileServiceImpl$observeFile$1$2"}, k = 3, mv = {1, 1, 16})
final class FileServiceImpl$observeFile$$inlined$getOrPut$lambda$2 extends Lambda implements Function0<Unit> {
    final /* synthetic */ String $configId$inlined;
    final /* synthetic */ ic7 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileServiceImpl$observeFile$$inlined$getOrPut$lambda$2(ic7 ic7Var, String str) {
        super(0);
        this.this$0 = ic7Var;
        this.$configId$inlined = str;
    }

    @Override // p010kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.this$0.configObservableMap.remove(this.$configId$inlined);
    }
}
