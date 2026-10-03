package com.heytap.common.util;

import com.oplus.aiunit.vision.iyj;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0006\u0010\u0001\u001a\u00020\u0000\u001a\u0006\u0010\u0003\u001a\u00020\u0002\"\u001b\u0010\b\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0001\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"", "a", "", "b", "Ljava/text/SimpleDateFormat;", "Lkotlin/Lazy;", "getTimeFormat", "()Ljava/text/SimpleDateFormat;", "timeFormat", "com.heytap.nearx.common"}, k = 2, mv = {1, 4, 0})
public final class TimeUtilKt {

    @NotNull
    public static final Lazy a = LazyKt__LazyJVMKt.lazy(new Function0<SimpleDateFormat>() { // from class: com.heytap.common.util.TimeUtilKt$timeFormat$2
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final SimpleDateFormat invoke() {
            return new SimpleDateFormat("dd HH:mm:ss", Locale.US);
        }
    });

    @NotNull
    public static final String a() {
        String str = new SimpleDateFormat("yy-MM-dd HH:mm:ss-SSS").format(new Date());
        Intrinsics.checkNotNullExpressionValue(str, "format.format(date)");
        return str;
    }

    public static final long b() {
        return iyj.INSTANCE.a();
    }
}
