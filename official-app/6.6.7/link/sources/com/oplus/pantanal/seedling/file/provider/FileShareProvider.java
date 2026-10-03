package com.oplus.pantanal.seedling.file.provider;

import android.content.Context;
import android.content.pm.ProviderInfo;
import androidx.core.content.FileProvider;
import com.oplus.pantanal.seedling.constants.Constants;
import com.oplus.pantanal.seedling.util.Logger;
import com.oplus.utrace.db.UTraceSQLiteHelperKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"Lcom/oplus/pantanal/seedling/file/provider/FileShareProvider;", "Landroidx/core/content/FileProvider;", "()V", "attachInfo", "", "context", "Landroid/content/Context;", UTraceSQLiteHelperKt.COL_INFO, "Landroid/content/pm/ProviderInfo;", "seedling-support_manualRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class FileShareProvider extends FileProvider {
    public void attachInfo(@NotNull Context context, @NotNull ProviderInfo info) {
        Object obj;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(info, UTraceSQLiteHelperKt.COL_INFO);
        try {
            Result.Companion companion = Result.Companion;
            super.attachInfo(context, info);
            obj = Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Throwable th2 = Result.exceptionOrNull-impl(obj);
        if (th2 != null) {
            Logger.INSTANCE.e(Constants.TAG, "FileShareProvider attachInfo has error:" + th2.getMessage());
        }
    }
}
