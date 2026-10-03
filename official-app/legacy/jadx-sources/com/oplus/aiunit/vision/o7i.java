package com.oplus.aiunit.vision;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.oplus.oms.split.full.common.ProcessInfoData;
import com.oplus.oms.split.full.common.SplitProcessUtils;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class o7i {
    public static String a(h7i h7iVar, Context context) {
        if (h7iVar == null || context == null) {
            w7i.i("SplitInstallUtils", "getSplitNativeLibAbi fail", new Object[0]);
            return null;
        }
        h7iVar.q();
        try {
            h7i.b bVarM = h7iVar.m(context);
            if (bVarM != null) {
                return bVarM.b();
            }
            w7i.c("SplitInstallUtils", "getSplitNativeLibAbi libData is null", new Object[0]);
            return null;
        } catch (IOException e2) {
            w7i.c("SplitInstallUtils", "getSplitNativeLibAbi error " + e2.getMessage(), new Object[0]);
            return null;
        }
    }

    public static void b(String str, int i) {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(new File(a8i.o().f(str), com.oplus.oms.split.full.splitinstall.a.h)), StandardCharsets.UTF_8));
            try {
                bufferedWriter.write(i);
                bufferedWriter.flush();
                bufferedWriter.close();
            } catch (Throwable th) {
                try {
                    bufferedWriter.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (FileNotFoundException e2) {
            w7i.b("SplitInstallUtils", "SplitCopier.lock no found", e2);
        } catch (IOException e3) {
            w7i.b("SplitInstallUtils", "clean up split version code error", e3);
        }
    }

    public static void c(String str, String str2, int i) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || i == -1) {
            w7i.c("SplitInstallUtils", "setNativeLibDirAccessStatus failed", new Object[0]);
            return;
        }
        File fileI = a8i.o().i(str, str2, i);
        if (fileI.exists()) {
            fileI.setWritable(true);
            fileI.setExecutable(true);
        }
    }

    public static boolean d(Context context) {
        if (context != null) {
            return ((Boolean) p1h.b(context).a("isCopyOmsJsonSuccess", Boolean.FALSE)).booleanValue();
        }
        w7i.e("SplitInstallUtils", "getCopyOmsJsonStatus context = null", new Object[0]);
        return false;
    }

    public static int e(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            w7i.i("SplitInstallUtils", "getSplitInstallStatus fail, SplitName = " + str, new Object[0]);
            return -1;
        }
        return ((Integer) p1h.b(context).a(str + "_INSTALL_VERSION", -1)).intValue();
    }

    public static String f(Context context, String str, int i) {
        if (context == null || TextUtils.isEmpty(str)) {
            w7i.i("SplitInstallUtils", "markSplitLoadedFailMD5 fail, SplitName:%s , version:%d", str, Integer.valueOf(i));
            return null;
        }
        return (String) p1h.b(context).a(str + "_LOADED_FAIL_MD5_" + i, "");
    }

    public static int g(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            w7i.i("SplitInstallUtils", "getSplitLoadSuccessVersion fail, SplitName = " + str, new Object[0]);
            return -1;
        }
        return ((Integer) p1h.b(context).a(str + "_LOADED_SUCCESS", -1)).intValue();
    }

    public static void h(Context context, String str, int i) {
        if (context == null || TextUtils.isEmpty(str)) {
            w7i.i("SplitInstallUtils", "setSplitInstallStatus fail, SplitName:%s , version:%d", str, Integer.valueOf(i));
            return;
        }
        p1h.b(context).c(str + "_INSTALL_VERSION", Integer.valueOf(i));
        b(str, i);
    }

    public static void i(Context context, String str, int i) {
        if (context == null || TextUtils.isEmpty(str)) {
            w7i.i("SplitInstallUtils", "putSplitLoadSuccessVersion fail, SplitName = " + str, new Object[0]);
        } else {
            p1h.b(context).c(str + "_LOADED_SUCCESS", Integer.valueOf(i));
        }
    }

    public static void j(Context context, String str, int i, String str2) {
        if (context == null || TextUtils.isEmpty(str)) {
            w7i.i("SplitInstallUtils", "markSplitLoadedFailMD5 fail, SplitName:%s , version:%d", str, Integer.valueOf(i));
            return;
        }
        p1h.b(context).c(str + "_LOADED_FAIL_MD5_" + i, str2);
    }

    public static void k(h7i h7iVar, int i, Context context) {
        if (h7iVar == null || context == null || i == -1) {
            w7i.i("SplitInstallUtils", "removeInstallOtherFile failed", new Object[0]);
            return;
        }
        String strQ = h7iVar.q();
        pd7.f(a8i.o().c(strQ, i, false), Build.VERSION.SDK_INT >= 34 ? a(h7iVar, context) : null);
        List<ProcessInfoData> subProcessInfoData = SplitProcessUtils.getSubProcessInfoData(strQ);
        HashSet hashSet = new HashSet();
        Iterator<ProcessInfoData> it = subProcessInfoData.iterator();
        while (it.hasNext()) {
            String processName = it.next().getProcessName();
            if (!TextUtils.isEmpty(processName) && !hashSet.contains(processName)) {
                hashSet.add(processName);
            }
        }
        if (hashSet.isEmpty()) {
            return;
        }
        exe.g(context, hashSet);
    }

    public static void l(h7i h7iVar, int i, Context context) {
        if (h7iVar == null || context == null || i == -1) {
            w7i.i("SplitInstallUtils", "removeSplitInstalledFile failed", new Object[0]);
            return;
        }
        String strQ = h7iVar.q();
        File fileC = a8i.o().c(strQ, i, false);
        if (fileC == null || !fileC.exists()) {
            w7i.i("SplitInstallUtils", "removeSplitInstalledFile installed file is not existed", new Object[0]);
            return;
        }
        if (Build.VERSION.SDK_INT >= 34) {
            c(strQ, a(h7iVar, context), i);
        }
        pd7.c(fileC);
        if (fileC.exists()) {
            w7i.i("SplitInstallUtils", "Failed to delete corrupted split files", new Object[0]);
        } else {
            w7i.a("SplitInstallUtils", "delete success", new Object[0]);
        }
    }
}
