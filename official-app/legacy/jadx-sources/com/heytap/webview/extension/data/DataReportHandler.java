package com.heytap.webview.extension.data;

import android.app.Application;
import com.heytap.webview.extension.BuildConfig;
import com.heytap.webview.extension.WebExtManager;
import com.heytap.webview.extension.utils.Utils;
import com.oplus.aiunit.vision.IExceptionProcess;
import com.oplus.aiunit.vision.i6k;
import com.oplus.aiunit.vision.m7k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0006"}, d2 = {"Lcom/heytap/webview/extension/data/DataReportHandler;", "", "()V", "initDataReportHandler", "", "CrashListener", "lib_webext_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DataReportHandler {

    @NotNull
    public static final DataReportHandler INSTANCE = new DataReportHandler();

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\n\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¨\u0006\u000e"}, d2 = {"Lcom/heytap/webview/extension/data/DataReportHandler$CrashListener;", "Lcom/oplus/aiunit/vision/IExceptionProcess;", "Ljava/lang/Thread;", "thread", "", "throwable", "", "filter", "", "getModuleVersion", "Lcom/oplus/aiunit/vision/m7k;", "getKvProperties", "<init>", "()V", "lib_webext_release"}, k = 1, mv = {1, 8, 0})
    public static final class CrashListener implements IExceptionProcess {
        @Override // com.oplus.aiunit.vision.IExceptionProcess
        public boolean filter(@NotNull Thread thread, @NotNull Throwable throwable) {
            Intrinsics.checkNotNullParameter(thread, "thread");
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            String messageFromThrowable = Utils.INSTANCE.getMessageFromThrowable(throwable);
            if (messageFromThrowable != null) {
                return StringsKt__StringsKt.contains$default((CharSequence) messageFromThrowable, (CharSequence) BuildConfig.LIBRARY_PACKAGE_NAME, false, 2, (Object) null);
            }
            return false;
        }

        @Override // com.oplus.aiunit.vision.IExceptionProcess
        @Nullable
        public m7k getKvProperties() {
            return null;
        }

        @Override // com.oplus.aiunit.vision.IExceptionProcess
        @NotNull
        public String getModuleVersion() {
            return BuildConfig.VERSION_NAME;
        }
    }

    private DataReportHandler() {
    }

    public final void initDataReportHandler() {
        Application application = WebExtManager.INSTANCE.getApplication();
        if (application != null) {
            i6k.a(application, 30390L).c(new CrashListener());
        }
    }
}
