package com.heytap.health.oobe;

import com.oplus.aiunit.vision.gdb;
import com.oplus.aiunit.vision.qe0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u001a\u000e\u0010\u0001\u001a\u0004\u0018\u00010\u0000*\u0004\u0018\u00010\u0000\"\u001b\u0010\u0006\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005¨\u0006\u0007"}, d2 = {"", "b", "", "a", "Lkotlin/Lazy;", "()Z", "logSecret", "device_pair_impl_release"}, k = 2, mv = {1, 8, 0})
public final class OOBELogKt {

    @NotNull
    public static final Lazy a = LazyKt__LazyJVMKt.lazy(new Function0<Boolean>() { // from class: com.heytap.health.oobe.OOBELogKt$logSecret$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final Boolean invoke() {
            return Boolean.valueOf(qe0.z());
        }
    });

    public static final boolean a() {
        return ((Boolean) a.getValue()).booleanValue();
    }

    @Nullable
    public static final String b(@Nullable String str) {
        return a() ? gdb.a(str) : str;
    }
}
