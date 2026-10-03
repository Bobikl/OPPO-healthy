package com.heytap.nearx.cloudconfig.util;

import android.content.Context;
import android.os.Process;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0002¨\u0006\t"}, d2 = {"Lcom/heytap/nearx/cloudconfig/util/ProcessProperties;", "", "()V", "getProcessName", "", "context", "Landroid/content/Context;", "pid", "", "com.heytap.nearx.cloudconfig"}, k = 1, mv = {1, 1, 16})
public final class ProcessProperties {
    public static final ProcessProperties INSTANCE = new ProcessProperties();

    private ProcessProperties() {
    }

    @Nullable
    public final String getProcessName(@NotNull Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        try {
            String processName = getProcessName(Process.myPid());
            if (processName == null || processName.length() == 0) {
                return null;
            }
            if (processName == null) {
                Intrinsics.throwNpe();
            }
            String packageName = context.getPackageName();
            Intrinsics.checkExpressionValueIsNotNull(packageName, "context.packageName");
            if (StringsKt__StringsKt.contains$default((CharSequence) processName, (CharSequence) packageName, false, 2, (Object) null)) {
                return processName;
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    private final String getProcessName(int pid) throws Throwable {
        BufferedReader bufferedReader;
        Throwable th;
        try {
            bufferedReader = new BufferedReader(new FileReader("/proc/" + pid + "/cmdline"));
            try {
                String line = bufferedReader.readLine();
                if (!(line == null || line.length() == 0)) {
                    int length = line.length() - 1;
                    int i = 0;
                    boolean z = false;
                    while (i <= length) {
                        boolean z2 = line.charAt(!z ? i : length) <= ' ';
                        if (z) {
                            if (!z2) {
                                break;
                            }
                            length--;
                        } else if (z2) {
                            i++;
                        } else {
                            z = true;
                        }
                    }
                    line = line.subSequence(i, length + 1).toString();
                }
                try {
                    bufferedReader.close();
                } catch (IOException unused) {
                }
                return line;
            } catch (Exception unused2) {
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (IOException unused3) {
                    }
                }
                return null;
            } catch (Throwable th2) {
                th = th2;
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (IOException unused4) {
                    }
                }
                throw th;
            }
        } catch (Exception unused5) {
            bufferedReader = null;
        } catch (Throwable th3) {
            bufferedReader = null;
            th = th3;
        }
    }
}
