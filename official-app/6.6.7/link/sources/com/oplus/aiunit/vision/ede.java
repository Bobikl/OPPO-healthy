package com.oplus.aiunit.vision;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR\"\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0003\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/oplus/aiunit/vision/ede;", "", "", "a", "Ljava/lang/String;", "getMPayId", "()Ljava/lang/String;", "(Ljava/lang/String;)V", "mPayId", "<init>", "()V", "paysdk_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPaySdkCore.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaySdkCore.kt\ncom/oplus/pay/opensdk/PaySdkCore\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,345:1\n1#2:346\n*E\n"})
public final class ede {

    @NotNull
    public static final ede INSTANCE = new ede();

    @NotNull
    public static String a = "";

    public final void a(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        a = str;
    }
}
