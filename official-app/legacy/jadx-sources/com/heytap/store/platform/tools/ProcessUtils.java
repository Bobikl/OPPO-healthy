package com.heytap.store.platform.tools;

import android.os.Process;
import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0004H\u0002J\b\u0010\b\u001a\u0004\u0018\u00010\u0004J\u0006\u0010\t\u001a\u00020\n¨\u0006\u000b"}, d2 = {"Lcom/heytap/store/platform/tools/ProcessUtils;", "", "()V", "getCurrentProcessName", "", "getCurrentProcessNameByAms", "getCurrentProcessNameByFile", "getCurrentProcessNameByReflect", "getForegroundProcessName", "isMainProcess", "", "utils_release"}, k = 1, mv = {1, 4, 0})
public final class ProcessUtils {
    public static final ProcessUtils INSTANCE = new ProcessUtils();

    private ProcessUtils() {
    }

    private final String getCurrentProcessNameByAms() {
        return "";
    }

    private final String getCurrentProcessNameByFile() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(new File("/proc/" + Process.myPid() + "/cmdline")));
            String line = bufferedReader.readLine();
            Intrinsics.checkNotNullExpressionValue(line, "mBufferedReader.readLine()");
            if (line == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
            }
            String string = StringsKt__StringsKt.trim((CharSequence) line).toString();
            bufferedReader.close();
            return string;
        } catch (Exception e2) {
            e2.printStackTrace();
            return "";
        }
    }

    private final String getCurrentProcessNameByReflect() {
        return "";
    }

    @NotNull
    public final String getCurrentProcessName() {
        String currentProcessNameByFile = getCurrentProcessNameByFile();
        if (!TextUtils.isEmpty(currentProcessNameByFile)) {
            return currentProcessNameByFile;
        }
        String currentProcessNameByAms = getCurrentProcessNameByAms();
        return !TextUtils.isEmpty(currentProcessNameByAms) ? currentProcessNameByAms : getCurrentProcessNameByReflect();
    }

    @Nullable
    public final String getForegroundProcessName() {
        return "";
    }

    public final boolean isMainProcess() {
        return Intrinsics.areEqual(ContextGetterUtils.INSTANCE.getApp().getPackageName(), getCurrentProcessName());
    }
}
