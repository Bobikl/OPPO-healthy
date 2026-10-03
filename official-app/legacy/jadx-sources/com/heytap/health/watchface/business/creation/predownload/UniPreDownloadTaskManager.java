package com.heytap.health.watchface.business.creation.predownload;

import com.alibaba.android.arouter.facade.annotation.Interceptor;
import com.heytap.health.watchface.business.creation.predownload.base.AbsResPreDownloadInterceptor;
import com.oplus.aiunit.vision.b5;
import com.oplus.aiunit.vision.md3;
import com.oplus.aiunit.vision.svd;
import com.oplus.aiunit.vision.ts7;
import com.oplus.aiunit.vision.wyk;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Interceptor(name = "UniversalDownloadTask", priority = 3)
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00030\u0002H\u0014¨\u0006\t"}, d2 = {"Lcom/heytap/health/watchface/business/creation/predownload/UniPreDownloadTaskManager;", "Lcom/heytap/health/watchface/business/creation/predownload/base/AbsResPreDownloadInterceptor;", "", "Lcom/oplus/aiunit/vision/b5;", "downloadTasks", "", "c", "<init>", "()V", "watchface_impl_release"}, k = 1, mv = {1, 8, 0})
public final class UniPreDownloadTaskManager extends AbsResPreDownloadInterceptor {
    @Override // com.heytap.health.watchface.business.creation.predownload.base.AbsResPreDownloadInterceptor
    public void c(@NotNull List<? super b5> downloadTasks) {
        Intrinsics.checkNotNullParameter(downloadTasks, "downloadTasks");
        downloadTasks.add(new md3());
        downloadTasks.add(new svd());
        downloadTasks.add(new wyk());
        downloadTasks.add(new ts7());
    }
}
