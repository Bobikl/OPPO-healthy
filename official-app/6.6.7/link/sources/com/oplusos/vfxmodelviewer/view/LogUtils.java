package com.oplusos.vfxmodelviewer.view;

import android.util.Log;
import com.oplusos.vfxmodelviewer.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/oplusos/vfxmodelviewer/view/LogUtils;", "", "()V", "Companion", "com.oplusos.vfxsdk.modelviewer.1.3.6_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class LogUtils {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006J\u0016\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006J\u0016\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006J\u0012\u0010\n\u001a\u00020\u00042\n\u0010\u000b\u001a\u00060\fj\u0002`\rJ\u0016\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006J\u0016\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006¨\u0006\u0010"}, d2 = {"Lcom/oplusos/vfxmodelviewer/view/LogUtils$Companion;", "", "()V", "d", "", "tag", "", "msg", "e", "i", "printStackTrace", "exception", "Ljava/lang/Exception;", "Lkotlin/Exception;", "v", "w", "com.oplusos.vfxsdk.modelviewer.1.3.6_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void d(@NotNull String tag, @NotNull String msg) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(msg, "msg");
            Boolean bool = BuildConfig.ENABLE_LOG;
            Intrinsics.checkNotNullExpressionValue(bool, "ENABLE_LOG");
            if (bool.booleanValue()) {
                Log.d(tag, msg);
            }
        }

        public final void e(@NotNull String tag, @NotNull String msg) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(msg, "msg");
            Boolean bool = BuildConfig.ENABLE_LOG;
            Intrinsics.checkNotNullExpressionValue(bool, "ENABLE_LOG");
            if (bool.booleanValue()) {
                Log.e(tag, msg);
            }
        }

        public final void i(@NotNull String tag, @NotNull String msg) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(msg, "msg");
            Boolean bool = BuildConfig.ENABLE_LOG;
            Intrinsics.checkNotNullExpressionValue(bool, "ENABLE_LOG");
            if (bool.booleanValue()) {
                Log.i(tag, msg);
            }
        }

        public final void printStackTrace(@NotNull Exception exception) {
            Intrinsics.checkNotNullParameter(exception, "exception");
            Boolean bool = BuildConfig.ENABLE_LOG;
            Intrinsics.checkNotNullExpressionValue(bool, "ENABLE_LOG");
            if (bool.booleanValue()) {
                exception.printStackTrace(System.out);
            }
        }

        public final void v(@NotNull String tag, @NotNull String msg) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(msg, "msg");
            Boolean bool = BuildConfig.ENABLE_LOG;
            Intrinsics.checkNotNullExpressionValue(bool, "ENABLE_LOG");
            if (bool.booleanValue()) {
                Log.v(tag, msg);
            }
        }

        public final void w(@NotNull String tag, @NotNull String msg) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(msg, "msg");
            Boolean bool = BuildConfig.ENABLE_LOG;
            Intrinsics.checkNotNullExpressionValue(bool, "ENABLE_LOG");
            if (bool.booleanValue()) {
                Log.w(tag, msg);
            }
        }
    }
}
