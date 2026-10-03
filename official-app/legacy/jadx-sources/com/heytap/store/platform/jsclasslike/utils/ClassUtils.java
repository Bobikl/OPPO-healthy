package com.heytap.store.platform.jsclasslike.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import com.heytap.store.base.core.util.DeviceInfoUtil;
import com.heytap.store.platform.jsclasslike.core.DefaultPoolExecutor;
import com.heytap.store.platform.jsclasslike.utils.ClassUtils;
import dalvik.system.DexFile;
import io.netty.util.internal.StringUtil;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.StringsKt__StringsJVMKt;
import p010kotlin.text.Typography;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0004J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u00142\u0006\u0010\u000e\u001a\u00020\u000fJ\b\u0010\u0015\u001a\u00020\u0016H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/heytap/store/platform/jsclasslike/utils/ClassUtils;", "", "()V", "EXTRACTED_NAME_EXT", "", "EXTRACTED_SUFFIX", "KEY_DEX_NUMBER", "PREFS_FILE", "SECONDARY_FOLDER_NAME", "VM_WITH_MULTI_DEX_VERSION_MAJOR", "", "VM_WITH_MULTI_DEX_VERSION_MINOR", "getFileNameByPackageName", "", "context", "Landroid/content/Context;", "packageName", "getMultiDexPreferences", "Landroid/content/SharedPreferences;", "getSourcePaths", "", "isVMMultiDexCapable", "", "jsclasslike-api_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class ClassUtils {

    @NotNull
    private static final String EXTRACTED_NAME_EXT = ".classes";

    @NotNull
    private static final String EXTRACTED_SUFFIX = ".zip";

    @NotNull
    private static final String KEY_DEX_NUMBER = "dex.number";

    @NotNull
    private static final String PREFS_FILE = "multidex.version";
    private static final int VM_WITH_MULTI_DEX_VERSION_MAJOR = 2;
    private static final int VM_WITH_MULTI_DEX_VERSION_MINOR = 1;

    @NotNull
    public static final ClassUtils INSTANCE = new ClassUtils();

    @NotNull
    private static final String SECONDARY_FOLDER_NAME = "code_cache" + ((Object) File.separator) + "secondary-dexes";

    private ClassUtils() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:12:0x003a  */
    /* JADX INFO: renamed from: getFileNameByPackageName$lambda-0, reason: not valid java name */
    public static final void m5053getFileNameByPackageName$lambda0(String path, String packageName, HashSet classNames, CountDownLatch parserCtl) throws Throwable {
        Enumeration<String> enumerationEntries;
        boolean z;
        Intrinsics.checkParameterIsNotNull(path, "$path");
        Intrinsics.checkParameterIsNotNull(packageName, "$packageName");
        Intrinsics.checkParameterIsNotNull(classNames, "$classNames");
        Intrinsics.checkParameterIsNotNull(parserCtl, "$parserCtl");
        DexFile dexFile = null;
        try {
            try {
                try {
                    DexFile dexFileLoadDex = StringsKt__StringsJVMKt.endsWith$default(path, ".zip", false, 2, null) ? DexFile.loadDex(path, Intrinsics.stringPlus(path, ".tmp"), 0) : new DexFile(path);
                    if (dexFileLoadDex == null) {
                        enumerationEntries = null;
                    } else {
                        try {
                            enumerationEntries = dexFileLoadDex.entries();
                        } catch (Exception e2) {
                            dexFile = dexFileLoadDex;
                            e = e2;
                            Log.e(Consts.TAG, "scan map file in dex files made error", e);
                            if (dexFile != null) {
                                dexFile.close();
                            }
                            parserCtl.countDown();
                        } catch (Throwable th) {
                            dexFile = dexFileLoadDex;
                            th = th;
                            if (dexFile != null) {
                                try {
                                    dexFile.close();
                                } catch (Exception unused) {
                                }
                            }
                            parserCtl.countDown();
                            throw th;
                        }
                    }
                    while (true) {
                        if (enumerationEntries != null) {
                            z = enumerationEntries.hasMoreElements();
                        }
                        if (!z) {
                            break;
                        }
                        String className = enumerationEntries.nextElement();
                        Intrinsics.checkExpressionValueIsNotNull(className, "className");
                        if (StringsKt__StringsJVMKt.startsWith$default(className, packageName, false, 2, null)) {
                            classNames.add(className);
                        }
                    }
                    if (dexFileLoadDex != null) {
                        dexFileLoadDex.close();
                    }
                } catch (Exception e3) {
                    e = e3;
                }
                parserCtl.countDown();
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception unused2) {
        }
    }

    private final SharedPreferences getMultiDexPreferences(Context context) {
        return context.getSharedPreferences(PREFS_FILE, 0);
    }

    private final boolean isVMMultiDexCapable() {
        boolean z = false;
        Integer numValueOf = null;
        String str = DeviceInfoUtil.SYSTEM_NAME;
        try {
            String property = System.getProperty("java.vm.version");
            if (!(property == null || property.length() == 0)) {
                Matcher matcher = Pattern.compile("(\\d+)\\.(\\d+)(\\.\\d+)?").matcher(property);
                if (matcher.matches()) {
                    try {
                        String strGroup = matcher.group(1);
                        Integer numValueOf2 = strGroup == null ? null : Integer.valueOf(Integer.parseInt(strGroup));
                        if (numValueOf2 == null) {
                            throw new NullPointerException();
                        }
                        int iIntValue = numValueOf2.intValue();
                        String strGroup2 = matcher.group(2);
                        if (strGroup2 != null) {
                            numValueOf = Integer.valueOf(Integer.parseInt(strGroup2));
                        }
                        if (numValueOf == null) {
                            throw new NullPointerException();
                        }
                        int iIntValue2 = numValueOf.intValue();
                        if (iIntValue > 2 || (iIntValue == 2 && iIntValue2 >= 1)) {
                            z = true;
                        }
                    } catch (Exception unused) {
                    }
                }
            }
        } catch (Exception unused2) {
            str = DeviceInfoUtil.SYSTEM_NAME;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("VM with name ");
        sb.append((Object) str);
        sb.append(StringUtil.SPACE);
        sb.append(z ? "has" : "does not have");
        sb.append(" multidex support");
        Log.i(Consts.TAG, sb.toString());
        return z;
    }

    @NotNull
    public final Set<String> getFileNameByPackageName(@NotNull Context context, @NotNull final String packageName) throws InterruptedException, PackageManager.NameNotFoundException, IOException {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(packageName, "packageName");
        final HashSet hashSet = new HashSet();
        List<String> sourcePaths = getSourcePaths(context);
        final CountDownLatch countDownLatch = new CountDownLatch(sourcePaths.size());
        for (final String str : sourcePaths) {
            DefaultPoolExecutor.INSTANCE.getINSTANCE().execute(new Runnable() { // from class: com.oplus.aiunit.vision.oc3
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    ClassUtils.m5053getFileNameByPackageName$lambda0(str, packageName, hashSet, countDownLatch);
                }
            });
        }
        countDownLatch.await();
        Log.d(Consts.TAG, "Filter " + hashSet.size() + " classes by package <" + packageName + Typography.greater);
        return hashSet;
    }

    @NotNull
    public final List<String> getSourcePaths(@NotNull Context context) throws PackageManager.NameNotFoundException, IOException {
        Intrinsics.checkParameterIsNotNull(context, "context");
        ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 0);
        Intrinsics.checkExpressionValueIsNotNull(applicationInfo, "context.packageManager.g…o(context.packageName, 0)");
        File file = new File(applicationInfo.sourceDir);
        ArrayList arrayList = new ArrayList();
        arrayList.add(applicationInfo.sourceDir);
        String strStringPlus = Intrinsics.stringPlus(file.getName(), EXTRACTED_NAME_EXT);
        if (isVMMultiDexCapable()) {
            SharedPreferences multiDexPreferences = getMultiDexPreferences(context);
            int i = multiDexPreferences != null ? multiDexPreferences.getInt(KEY_DEX_NUMBER, 1) : 1;
            File file2 = new File(applicationInfo.dataDir, SECONDARY_FOLDER_NAME);
            int i2 = 2;
            if (2 <= i) {
                while (true) {
                    int i3 = i2 + 1;
                    File file3 = new File(file2, strStringPlus + i2 + ".zip");
                    if (!file3.isFile()) {
                        throw new IOException("Miss extracted secondary dex file '" + ((Object) file3.getPath()) + '\'');
                    }
                    arrayList.add(file3.getAbsolutePath());
                    if (i2 != i) {
                        i2 = i3;
                    }
                }
            }
        }
        return arrayList;
    }
}
