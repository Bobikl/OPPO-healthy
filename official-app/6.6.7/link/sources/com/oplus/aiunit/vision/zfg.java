package com.oplus.aiunit.vision;

import android.content.Context;
import com.platform.usercenter.trace.rumtime.IUploadFactory;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u001c\u0010\u0006\u001a\u00020\u00052\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J$\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H\u0014R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/oplus/aiunit/vision/zfg;", "Lcom/platform/usercenter/trace/rumtime/IUploadFactory;", "", "", "updateMap", "", "upload", "Landroid/content/Context;", "context", "a", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "paysdk_statistic_release"}, k = 1, mv = {1, 8, 0})
public class zfg implements IUploadFactory {

    @Nullable
    public final Context a;

    public zfg(@Nullable Context context) {
        this.a = context;
    }

    public void a(@NotNull Context context, @NotNull Map<String, String> updateMap) {
        throw null;
    }

    public void upload(@NotNull Map<String, String> updateMap) {
        Intrinsics.checkNotNullParameter(updateMap, "updateMap");
        Context context = this.a;
        if (context == null) {
            pce.i("SafeUploadFactory: Context has been garbage collected, skip upload");
        } else {
            a(context, updateMap);
        }
    }
}
