package com.oplus.aiunit.vision;

import com.heytap.health.base.text.GsonUtil;
import com.heytap.health.watchface.adaptation.base.BaseWatchFaceBean;
import com.oplus.utrace.db.UTraceSQLiteHelperKt;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0016\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002J\u001e\u0010\f\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tJ\u001e\u0010\u000f\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\tJ\u0016\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0003¨\u0006\u0015"}, d2 = {"Lcom/oplus/aiunit/vision/qul;", "", "", "Lcom/heytap/health/watchface/adaptation/base/BaseWatchFaceBean;", "wfList", "", "d", "", "eventType", "", "wfUnique", "wfVersion", "b", "msg", UTraceSQLiteHelperKt.COL_INFO, "a", "scenesTag", "bean", "c", "<init>", "()V", "watchface_impl_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nWfReporter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WfReporter.kt\ncom/heytap/health/watchface/utils/WfReporter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,55:1\n1864#2,3:56\n*S KotlinDebug\n*F\n+ 1 WfReporter.kt\ncom/heytap/health/watchface/utils/WfReporter\n*L\n13#1:56,3\n*E\n"})
public final class qul {

    @NotNull
    public static final qul INSTANCE = new qul();

    public final void a(@NotNull String wfUnique, @NotNull String msg, @NotNull String info) {
        Intrinsics.checkNotNullParameter(wfUnique, "wfUnique");
        Intrinsics.checkNotNullParameter(msg, "msg");
        Intrinsics.checkNotNullParameter(info, "info");
        try {
            ltl.e("WfR", "pay error wfUnique:" + wfUnique + " msg:" + msg + " info:" + info);
        } catch (Exception e2) {
            ltl.i("WfR", "uploadUpdateWf exception:" + e2);
        }
    }

    public final void b(int eventType, @NotNull String wfUnique, @NotNull String wfVersion) {
        Intrinsics.checkNotNullParameter(wfUnique, "wfUnique");
        Intrinsics.checkNotNullParameter(wfVersion, "wfVersion");
        try {
            ltl.f("WfR", "wf update info eventType " + eventType + " wfUnique:" + wfUnique + " wfVersion:" + wfVersion);
        } catch (Exception e2) {
            ltl.i("WfR", "uploadUpdateWf exception:" + e2);
        }
    }

    public final void c(@NotNull String scenesTag, @NotNull BaseWatchFaceBean bean) {
        Intrinsics.checkNotNullParameter(scenesTag, "scenesTag");
        Intrinsics.checkNotNullParameter(bean, "bean");
        try {
            ltl.f("WfR", scenesTag + " -> wfUnique:" + bean.getWfUnique() + " wfVersion:" + bean.getWfVersion() + " payStatus " + bean.getPay());
        } catch (Exception e2) {
            ltl.i("WfR", "uploadUpdateWf exception:" + e2);
        }
    }

    public final void d(@Nullable List<? extends BaseWatchFaceBean> wfList) {
        if (wfList != null) {
            try {
                ArrayList arrayList = new ArrayList();
                int i = 0;
                for (Object obj : wfList) {
                    int i2 = i + 1;
                    if (i < 0) {
                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                    }
                    BaseWatchFaceBean baseWatchFaceBean = (BaseWatchFaceBean) obj;
                    arrayList.add(i + ":" + baseWatchFaceBean.getWfName() + ":" + baseWatchFaceBean.getWfVersion() + ":" + baseWatchFaceBean.getPay() + ":" + baseWatchFaceBean.isHidden() + ":" + baseWatchFaceBean.isCurrent());
                    i = i2;
                }
                ltl.f("WfR", "wf list " + GsonUtil.e(arrayList));
            } catch (Exception e2) {
                ltl.i("WfR", "uploadWfList exception:" + e2);
            }
        }
    }
}
