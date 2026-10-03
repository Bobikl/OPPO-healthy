package androidx.work.impl.utils;

import androidx.core.util.Consumer;
import androidx.work.Logger;
import androidx.work.WorkerExceptionInfo;
import com.oplus.utrace.db.UTraceSQLiteHelperKt;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u001a \u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"safeAccept", "", "Landroidx/core/util/Consumer;", "Landroidx/work/WorkerExceptionInfo;", UTraceSQLiteHelperKt.COL_INFO, "tag", "", "work-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nWorkerExceptionUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WorkerExceptionUtils.kt\nandroidx/work/impl/utils/WorkerExceptionUtilsKt\n+ 2 LoggerExt.kt\nandroidx/work/LoggerExtKt\n*L\n1#1,37:1\n32#2:38\n*S KotlinDebug\n*F\n+ 1 WorkerExceptionUtils.kt\nandroidx/work/impl/utils/WorkerExceptionUtilsKt\n*L\n34#1:38\n*E\n"})
public final class WorkerExceptionUtilsKt {
    public static final void safeAccept(@NotNull Consumer<WorkerExceptionInfo> consumer, @NotNull WorkerExceptionInfo info, @NotNull String tag) {
        Intrinsics.checkNotNullParameter(consumer, "<this>");
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(tag, "tag");
        try {
            consumer.accept(info);
        } catch (Throwable th) {
            Logger.get().error(tag, "Exception handler threw an exception", th);
        }
    }
}
