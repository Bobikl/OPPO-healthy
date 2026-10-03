package androidx.work.impl.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.work.Configuration;
import androidx.work.Logger;
import com.heytap.webview.extension.cache.CacheConstants;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmName;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0003\u001a\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"TAG", "", "getProcessName", "context", "Landroid/content/Context;", "isDefaultProcess", "", CacheConstants.Word.CONFIGURATION, "Landroidx/work/Configuration;", "work-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@JvmName(name = "ProcessUtils")
@SourceDebugExtension({"SMAP\nProcessUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProcessUtils.kt\nandroidx/work/impl/utils/ProcessUtils\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,73:1\n1#2:74\n*E\n"})
public final class ProcessUtils {

    @NotNull
    private static final String TAG;

    static {
        String strTagWithPrefix = Logger.tagWithPrefix("ProcessUtils");
        Intrinsics.checkNotNullExpressionValue(strTagWithPrefix, "tagWithPrefix(\"ProcessUtils\")");
        TAG = strTagWithPrefix;
    }

    @SuppressLint({"PrivateApi", "DiscouragedPrivateApi"})
    private static final String getProcessName(Context context) {
        return Api28Impl.INSTANCE.getProcessName();
    }

    public static final boolean isDefaultProcess(@NotNull Context context, @NotNull Configuration configuration) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        String processName = getProcessName(context);
        String defaultProcessName = configuration.getDefaultProcessName();
        return !(defaultProcessName == null || defaultProcessName.length() == 0) ? Intrinsics.areEqual(processName, configuration.getDefaultProcessName()) : Intrinsics.areEqual(processName, context.getApplicationInfo().processName);
    }
}
