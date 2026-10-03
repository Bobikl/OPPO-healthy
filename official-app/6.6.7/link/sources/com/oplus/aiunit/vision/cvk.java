package com.oplus.aiunit.vision;

import com.oplus.smartenginehelper.ParserTag;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\b\u0010\u0006\u001a\u00020\u0002H\u0007¨\u0006\t"}, d2 = {"Lcom/oplus/aiunit/vision/cvk;", "", "", ParserTag.TAG_ACTION, "", "b", "a", "<init>", "()V", "contactnetnumber_impl_thirdRelease"}, k = 1, mv = {1, 8, 0})
public final class cvk {

    @NotNull
    public static final cvk INSTANCE = new cvk();

    @JvmStatic
    @NotNull
    public static final String a() {
        return "/data/oplus/common/sau_res/res/comm_number_attribution/";
    }

    @JvmStatic
    public static final boolean b(@NotNull String action) {
        Intrinsics.checkNotNullParameter(action, ParserTag.TAG_ACTION);
        return Intrinsics.areEqual("com.oplusos.sau.DATARES_UPDATE", action);
    }
}
