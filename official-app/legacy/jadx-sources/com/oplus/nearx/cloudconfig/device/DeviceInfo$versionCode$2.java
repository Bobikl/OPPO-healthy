package com.oplus.nearx.cloudconfig.device;

import com.oplus.aiunit.vision.d7b;
import com.oplus.aiunit.vision.eh5;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 16})
final class DeviceInfo$versionCode$2 extends Lambda implements Function0<Integer> {
    final /* synthetic */ eh5 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceInfo$versionCode$2(eh5 eh5Var) {
        super(0);
        this.this$0 = eh5Var;
    }

    @Override // p010kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Integer invoke() {
        return Integer.valueOf(invoke2());
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final int invoke2() {
        try {
            return this.this$0.context.getPackageManager().getPackageInfo(this.this$0.context.getPackageName(), 0).versionCode;
        } catch (Throwable unused) {
            d7b.e(d7b.INSTANCE, eh5.k, "getVersionCode--Exception", null, new Object[0], 4, null);
            return 0;
        }
    }
}
