package com.oplus.nearx.cloudconfig.device;

import com.oplus.aiunit.vision.eh5;
import com.oplus.aiunit.vision.zkj;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 16})
final class DeviceInfo$romVersion$2 extends Lambda implements Function0<String> {
    final /* synthetic */ eh5 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceInfo$romVersion$2(eh5 eh5Var) {
        super(0);
        this.this$0 = eh5Var;
    }

    @Override // p010kotlin.jvm.functions.Function0
    @NotNull
    public final String invoke() {
        return zkj.INSTANCE.b(this.this$0.OBRAND_ROM_VERSION, "");
    }
}
