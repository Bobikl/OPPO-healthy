package com.heytap.health.operations.router.providers;

import android.content.Context;
import com.alibaba.android.arouter.facade.template.IProvider;
import com.oplus.aiunit.vision.NotifyGuidePageData;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¨\u0006\b"}, d2 = {"Lcom/heytap/health/operations/router/providers/INotifyGuide;", "Lcom/alibaba/android/arouter/facade/template/IProvider;", "Landroid/content/Context;", "context", "Lcom/oplus/aiunit/vision/pyc;", "pageData", "", "Ta", "operations_release"}, k = 1, mv = {1, 8, 0})
public interface INotifyGuide extends IProvider {
    void Ta(@NotNull Context context, @NotNull NotifyGuidePageData pageData);
}
