package com.oplus.aiunit.vision;

import com.heytap.store.base.core.util.statistics.bean.SensorsBean;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmField;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b&\u0018\u0000 \u000b2\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\t\u0010\nJ \u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\r"}, d2 = {"Lcom/oplus/aiunit/vision/i4l;", "", "", SensorsBean.API_NAME, "packageName", "", "statusCode", "", "a", "<init>", "()V", "Companion", "b", "thirdparty_impl_release"}, k = 1, mv = {1, 8, 0})
public abstract class i4l {

    @JvmField
    @NotNull
    public static final i4l NONE = new a();

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/oplus/aiunit/vision/i4l$a", "Lcom/oplus/aiunit/vision/i4l;", "thirdparty_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class a extends i4l {
    }

    public void a(@NotNull String apiName, @NotNull String packageName, int statusCode) {
        Intrinsics.checkNotNullParameter(apiName, "apiName");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
    }
}
