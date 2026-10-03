package com.heytap.health.device.tab.itemview.thirdparty;

import com.oplus.aiunit.vision.p11;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/oplus/aiunit/vision/p11;", "it", "", "invoke", "(Lcom/oplus/aiunit/vision/p11;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class BpgItem$interceptEvent$1 extends Lambda implements Function1<p11<?>, Boolean> {
    public static final BpgItem$interceptEvent$1 INSTANCE = new BpgItem$interceptEvent$1();

    public BpgItem$interceptEvent$1() {
        super(1);
    }

    @Override // p010kotlin.jvm.functions.Function1
    @NotNull
    public final Boolean invoke(@NotNull p11<?> it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Boolean.valueOf(it.e());
    }
}
