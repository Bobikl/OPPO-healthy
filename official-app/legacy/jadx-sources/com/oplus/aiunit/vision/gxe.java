package com.oplus.aiunit.vision;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.app.Application;
import android.app.OplusActivityManager;
import android.content.Context;
import android.os.Process;
import android.text.TextUtils;
import com.heytap.health.base.track.quality.QualityTrack;
import com.heytap.health.base.track.quality.Scenes;
import com.heytap.log.formatter.LogFieldKey;
import com.heytap.nearx.tangramconfig.strategy.Fields;
import com.heytap.speech.engine.constant.EngineConstant;
import com.oplus.compat.app.ActivityManagerNative;
import io.protostuff.MapSchema;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;
import p010kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b$\u0010%J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0018\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0007J!\u0010\u000f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0011\u001a\u00020\u000bH\u0007J\u0010\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u000bH\u0007J\u0010\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u000bH\u0007J\u0018\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u000bH\u0007J\u0018\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u000bH\u0007J\u0018\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u000bH\u0007J\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u001e\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u0004H\u0002J\u0018\u0010!\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u000bH\u0002R\u0014\u0010\"\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006&"}, d2 = {"Lcom/oplus/aiunit/vision/gxe;", "", "Landroid/content/Context;", "context", "", "f", LogFieldKey.LEVEL_KEY, b2n.g, MapSchema.FIELD_NAME_KEY, "j", b2n.f, "", Fields.PROCESS_NAME_FIELD, "i", "packageName", MapSchema.FIELD_NAME_ENTRY, "(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/Boolean;", "c", EngineConstant.REASON, "", "o", LogFieldKey.PROCESS_NAME_KEY, LogFieldKey.MESSAGE_KEY, "q", "n", "", "", "a", "b", "exceptTransPort", "", "d", "pName", "r", "ONCE_PROCESS_NAME", "Ljava/lang/String;", "<init>", "()V", "lib_base_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nProcessUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProcessUtils.kt\ncom/heytap/health/base/app/ProcessUtils\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,255:1\n1855#2,2:256\n1855#2,2:258\n1855#2,2:260\n1855#2,2:262\n1855#2,2:264\n*S KotlinDebug\n*F\n+ 1 ProcessUtils.kt\ncom/heytap/health/base/app/ProcessUtils\n*L\n72#1:256,2\n114#1:258,2\n155#1:260,2\n171#1:262,2\n186#1:264,2\n*E\n"})
public final class gxe {

    @NotNull
    public static final gxe INSTANCE = new gxe();

    @NotNull
    public static final String ONCE_PROCESS_NAME = ":once";

    @JvmStatic
    @SuppressLint({"DiscouragedPrivateApi"})
    @NotNull
    public static final String c() {
        String processName = Application.getProcessName();
        Intrinsics.checkNotNullExpressionValue(processName, "getProcessName()");
        return processName;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00ad  */
    @JvmStatic
    @SuppressLint({"ObsoleteSdkInt"})
    @Nullable
    public static final Boolean e(@NotNull Context context, @NotNull String packageName) {
        List<ActivityManager.RunningAppProcessInfo> listA;
        boolean z;
        String processName;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        if (!ilj.B()) {
            a7b.f("ProcessUtils", "isProcessExistInOPlus, no oppo brand");
            return Boolean.FALSE;
        }
        try {
            if (v3d.e()) {
                a7b.f("ProcessUtils", "isProcessExistInOPlus, is from os 15");
                listA = new OplusActivityManager().getRunningAppProcesses();
            } else {
                a7b.f("ProcessUtils", "isProcessExistInOPlus, is os above P");
                rp.a(context);
                listA = ActivityManagerNative.a(context);
            }
        } catch (Throwable th) {
            List<ActivityManager.RunningAppProcessInfo> listEmptyList = CollectionsKt__CollectionsKt.emptyList();
            a7b.b("ProcessUtils", "isProcessExistInOPlus, exception: " + th.getMessage());
            listA = listEmptyList;
        }
        List<ActivityManager.RunningAppProcessInfo> list = listA;
        if (list == null || list.isEmpty()) {
            a7b.f("ProcessUtils", "isProcessExistInOPlus, null");
            return null;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : listA) {
            String str = runningAppProcessInfo != null ? runningAppProcessInfo.processName : null;
            StringBuilder sb = new StringBuilder();
            sb.append("isProcessExistInOPlus, processName:");
            sb.append(str);
            if (runningAppProcessInfo == null || (processName = runningAppProcessInfo.processName) == null) {
                z = false;
            } else {
                Intrinsics.checkNotNullExpressionValue(processName, "processName");
                if (StringsKt__StringsKt.contains$default((CharSequence) processName, (CharSequence) packageName, false, 2, (Object) null)) {
                    z = true;
                } else {
                    z = false;
                }
            }
            if (z) {
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }

    @JvmStatic
    public static final boolean f(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return TextUtils.equals(c(), context.getPackageName());
    }

    @JvmStatic
    public static final boolean g(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String packageName = context.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "context.packageName");
        return i(context, packageName);
    }

    @JvmStatic
    public static final boolean h(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return INSTANCE.r(context, ONCE_PROCESS_NAME);
    }

    @JvmStatic
    public static final boolean i(@NotNull Context context, @NotNull String processName) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(processName, "processName");
        Object systemService = context.getSystemService("activity");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) systemService).getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return false;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (Intrinsics.areEqual(runningAppProcessInfo != null ? runningAppProcessInfo.processName : null, processName)) {
                return true;
            }
        }
        return false;
    }

    @JvmStatic
    public static final boolean j(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return INSTANCE.r(context, ":pushservice");
    }

    @JvmStatic
    public static final boolean k(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return INSTANCE.r(context, ":SportDaemonService");
    }

    @JvmStatic
    public static final boolean l(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return INSTANCE.r(context, ":transport");
    }

    @JvmStatic
    public static final void m(@NotNull Context context, @NotNull String reason) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(reason, "reason");
        a7b.f("ProcessUtils", "killAllProcess, reason=" + reason);
        QualityTrack.INSTANCE.g(Scenes.PROCESS_KILL, reason);
        op.n().j();
        List<Integer> listA = INSTANCE.a(context);
        int iMyPid = Process.myPid();
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            if (iIntValue != iMyPid) {
                a7b.f("ProcessUtils", "killAllProcess, kill pid=" + iIntValue);
                Process.killProcess(iIntValue);
            }
        }
        Process.killProcess(iMyPid);
    }

    @JvmStatic
    public static final void n(@NotNull Context context, @NotNull String reason) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(reason, "reason");
        a7b.f("ProcessUtils", "killAllProcessExceptTransport, reason=" + reason);
        QualityTrack.INSTANCE.g(Scenes.PROCESS_KILL, reason);
        op.n().j();
        List<Integer> listB = INSTANCE.b(context);
        int iMyPid = Process.myPid();
        Iterator<T> it = listB.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            if (iIntValue != iMyPid) {
                a7b.f("ProcessUtils", "killAllProcessExceptTransport, kill pid=" + iIntValue);
                Process.killProcess(iIntValue);
            }
        }
        Process.killProcess(iMyPid);
    }

    @JvmStatic
    public static final void o(@NotNull String reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        a7b.f("ProcessUtils", "killSelfProcess, reason=" + reason);
        QualityTrack.INSTANCE.g(Scenes.PROCESS_KILL, reason);
        Process.killProcess(Process.myPid());
        Runtime.getRuntime().exit(10);
    }

    @JvmStatic
    public static final void p(@NotNull String reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        a7b.f("ProcessUtils", "killSelfProcessNoReport, reason=" + reason);
        Process.killProcess(Process.myPid());
        Runtime.getRuntime().exit(10);
    }

    @JvmStatic
    public static final void q(@NotNull Context context, @NotNull String reason) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(reason, "reason");
        a7b.f("ProcessUtils", "killTransportProcess, reason=" + reason);
        QualityTrack.INSTANCE.g(Scenes.PROCESS_KILL, reason);
        Object systemService = context.getSystemService("activity");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) systemService).getRunningAppProcesses();
        if (runningAppProcesses != null) {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (Intrinsics.areEqual(context.getPackageName() + ":transport", runningAppProcessInfo.processName)) {
                    Process.killProcess(runningAppProcessInfo.pid);
                }
            }
        }
    }

    public final List<Integer> a(Context context) {
        ArrayList arrayList = new ArrayList();
        Object systemService = context.getSystemService("activity");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) systemService).getRunningAppProcesses();
        if (runningAppProcesses != null) {
            Set<String> setD = INSTANCE.d(context, false);
            for (ActivityManager.RunningAppProcessInfo info : runningAppProcesses) {
                if (info != null) {
                    Intrinsics.checkNotNullExpressionValue(info, "info");
                    if (setD.contains(info.processName)) {
                        arrayList.add(Integer.valueOf(info.pid));
                    }
                }
            }
        }
        return arrayList;
    }

    public final List<Integer> b(Context context) {
        ArrayList arrayList = new ArrayList();
        Object systemService = context.getSystemService("activity");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) systemService).getRunningAppProcesses();
        if (runningAppProcesses != null) {
            Set<String> setD = INSTANCE.d(context, true);
            for (ActivityManager.RunningAppProcessInfo info : runningAppProcesses) {
                if (info != null) {
                    Intrinsics.checkNotNullExpressionValue(info, "info");
                    if (setD.contains(info.processName)) {
                        arrayList.add(Integer.valueOf(info.pid));
                    }
                }
            }
        }
        return arrayList;
    }

    public final Set<String> d(Context context, boolean exceptTransPort) {
        HashSet hashSet = new HashSet();
        String packageName = context.getPackageName();
        hashSet.add(packageName + ":SportDaemonService");
        hashSet.add(packageName + ONCE_PROCESS_NAME);
        hashSet.add(packageName + ":pushservice");
        if (!exceptTransPort) {
            hashSet.add(packageName + ":transport");
        }
        return hashSet;
    }

    public final boolean r(Context context, String pName) {
        String strC = c();
        String str = context.getPackageName() + pName;
        StringBuilder sb = new StringBuilder();
        sb.append("verifyProcess() called with: context = [");
        sb.append(context);
        sb.append("], pName = [");
        sb.append(pName);
        sb.append("], processName = [");
        sb.append(strC);
        sb.append("]");
        return TextUtils.equals(strC, str);
    }
}
