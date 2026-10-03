package com.oplus.pantanal.seedling.file.provider;

import android.content.Context;
import android.content.pm.ProviderInfo;
import androidx.core.content.FileProvider;
import com.oplus.pantanal.seedling.constants.Constants;
import com.oplus.pantanal.seedling.util.Logger;
import com.oplus.utrace.db.UTraceSQLiteHelperKt;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.Result;
import p010kotlin.ResultKt;
import p010kotlin.Unit;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"Lcom/oplus/pantanal/seedling/file/provider/FileShareProvider;", "Landroidx/core/content/FileProvider;", "()V", "attachInfo", "", "context", "Landroid/content/Context;", UTraceSQLiteHelperKt.COL_INFO, "Landroid/content/pm/ProviderInfo;", "seedling-support_manualRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class FileShareProvider extends FileProvider {
    @Override // androidx.core.content.FileProvider, android.content.ContentProvider
    public void attachInfo(@NotNull Context context, @NotNull ProviderInfo info) {
        Object objM5287constructorimpl;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(info, "info");
        try {
            Result.Companion companion = Result.INSTANCE;
            super.attachInfo(context, info);
            objM5287constructorimpl = Result.m5287constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5287constructorimpl = Result.m5287constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM5290exceptionOrNullimpl = Result.m5290exceptionOrNullimpl(objM5287constructorimpl);
        if (thM5290exceptionOrNullimpl != null) {
            Logger.INSTANCE.e(Constants.TAG, "FileShareProvider attachInfo has error:" + thM5290exceptionOrNullimpl.getMessage());
        }
    }
}
