package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.health.operations.bean.MedalListBean;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u000b2\u00020\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0016\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\f"}, d2 = {"Lcom/oplus/aiunit/vision/drb;", "", "Lcom/heytap/health/operations/bean/MedalListBean;", "medalBean", "", "isPop", "", "a", "b", "<init>", "()V", "Companion", "operation_impl_release"}, k = 1, mv = {1, 8, 0})
public final class drb {
    public static final int $stable = 0;

    @NotNull
    public static final String KEY_CODE = "code";

    @NotNull
    public static final String KEY_ELEMENT = "element";

    @NotNull
    public static final String KEY_TYPE = "type";

    public final void a(@NotNull MedalListBean medalBean, boolean isPop) {
        Intrinsics.checkNotNullParameter(medalBean, "medalBean");
        com.heytap.health.base.track.a.k().a("pageid", "operation.medalv2.MedalListDetailFragment").a(vik.TAG_MODULE_ID, 1).a("code", medalBean.getCode()).a("element", medalBean.getName()).a("type", Integer.valueOf(isPop ? 1 : 2)).b();
    }

    public final void b(@NotNull MedalListBean medalBean, boolean isPop) {
        Intrinsics.checkNotNullParameter(medalBean, "medalBean");
        com.heytap.health.base.track.a.k().a("pageid", "operation.medalv2.MedalListDetailFragment").a(vik.TAG_MODULE_ID, 2).a("code", medalBean.getCode()).a("element", medalBean.getName()).a("type", Integer.valueOf(isPop ? 1 : 2)).b();
    }
}
