package com.heytap.store.platform.htrouter.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import com.heytap.store.base.core.util.DeviceInfoUtil;
import com.heytap.store.platform.htrouter.base.InternalGlobalStatus;
import com.heytap.store.platform.htrouter.thread.DefaultPoolExecutor;
import dalvik.system.DexFile;
import io.netty.util.internal.StringUtil;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.collections.CollectionsKt__MutableCollectionsKt;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.StringsKt__StringsJVMKt;
import p010kotlin.text.Typography;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0004J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u00142\u0006\u0010\u000e\u001a\u00020\u000fJ\b\u0010\u0015\u001a\u00020\u0016H\u0002J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u00142\u0006\u0010\u0018\u001a\u00020\u0019H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/heytap/store/platform/htrouter/utils/ClassUtils;", "", "()V", "EXTRACTED_NAME_EXT", "", "EXTRACTED_SUFFIX", "KEY_DEX_NUMBER", "PREFS_FILE", "SECONDARY_FOLDER_NAME", "VM_WITH_MULTI_DEX_VERSION_MAJOR", "", "VM_WITH_MULTI_DEX_VERSION_MINOR", "getFileNameByPackageName", "", "context", "Landroid/content/Context;", "packageName", "getMultiDexPreferences", "Landroid/content/SharedPreferences;", "getSourcePaths", "", "isVMMultiDexCapable", "", "tryLoadInstantRunDexFile", "applicationInfo", "Landroid/content/pm/ApplicationInfo;", "htrouter-api_release"}, k = 1, mv = {1, 4, 0})
public final class ClassUtils {
    private static final String EXTRACTED_NAME_EXT = ".classes";
    private static final String EXTRACTED_SUFFIX = ".zip";
    private static final String KEY_DEX_NUMBER = "dex.number";
    private static final String PREFS_FILE = "multidex.version";
    private static final int VM_WITH_MULTI_DEX_VERSION_MAJOR = 2;
    private static final int VM_WITH_MULTI_DEX_VERSION_MINOR = 1;
    public static final ClassUtils INSTANCE = new ClassUtils();
    private static final String SECONDARY_FOLDER_NAME = "code_cache" + File.separator + "secondary-dexes";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 4, 0})
    public static final class a implements Runnable {
        public final /* synthetic */ String i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ String f8279j;
        public final /* synthetic */ HashSet k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ CountDownLatch f8280l;

        public a(String str, String str2, HashSet hashSet, CountDownLatch countDownLatch) {
            this.i = str;
            this.f8279j = str2;
            this.k = hashSet;
            this.f8280l = countDownLatch;
        }

        @Override // java.lang.Runnable
        public final void run() throws Throwable {
            DexFile dexFile;
            Enumeration<String> enumerationEntries;
            DexFile dexFile2 = null;
            try {
                try {
                    try {
                        if (StringsKt__StringsJVMKt.endsWith$default(this.i, ".zip", false, 2, null)) {
                            dexFile = DexFile.loadDex(this.i, this.i + ".tmp", 0);
                        } else {
                            dexFile = new DexFile(this.i);
                        }
                        if (dexFile != null) {
                            try {
                                enumerationEntries = dexFile.entries();
                            } catch (Exception e2) {
                                DexFile dexFile3 = dexFile;
                                e = e2;
                                dexFile2 = dexFile3;
                                Log.e("HTRouter::", "scan map file in dex files made error", e);
                                if (dexFile2 != null) {
                                    dexFile2.close();
                                }
                                this.f8280l.countDown();
                            } catch (Throwable th) {
                                DexFile dexFile4 = dexFile;
                                th = th;
                                dexFile2 = dexFile4;
                                if (dexFile2 != null) {
                                    try {
                                        dexFile2.close();
                                    } catch (Exception unused) {
                                    }
                                }
                                this.f8280l.countDown();
                                throw th;
                            }
                        } else {
                            enumerationEntries = null;
                        }
                        while (enumerationEntries != null && enumerationEntries.hasMoreElements()) {
                            String className = enumerationEntries.nextElement();
                            Intrinsics.checkNotNullExpressionValue(className, "className");
                            if (StringsKt__StringsJVMKt.startsWith$default(className, this.f8279j, false, 2, null)) {
                                this.k.add(className);
                            }
                        }
                        if (dexFile != null) {
                            dexFile.close();
                        }
                    } catch (Exception e3) {
                        e = e3;
                    }
                } catch (Exception unused2) {
                }
                this.f8280l.countDown();
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    private ClassUtils() {
    }

    private final SharedPreferences getMultiDexPreferences(Context context) {
        return context.getSharedPreferences(PREFS_FILE, 0);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    private final boolean isVMMultiDexCapable() {
        boolean z = false;
        try {
            String property = System.getProperty("java.vm.version");
            if (!(property == null || property.length() == 0)) {
                Matcher matcher = Pattern.compile("(\\d+)\\.(\\d+)(\\.\\d+)?").matcher(property);
                if (matcher.matches()) {
                    String strGroup = matcher.group(1);
                    if (strGroup == null) {
                        throw new NullPointerException();
                    }
                    int i = Integer.parseInt(strGroup);
                    String strGroup2 = matcher.group(2);
                    if (strGroup2 == null) {
                        throw new NullPointerException();
                    }
                    int i2 = Integer.parseInt(strGroup2);
                    if (i > 2 || (i == 2 && i2 >= 1)) {
                        z = true;
                    }
                }
            }
        } catch (Exception unused) {
        }
        StringBuilder sb = new StringBuilder();
        sb.append("VM with name ");
        sb.append(DeviceInfoUtil.SYSTEM_NAME);
        sb.append(StringUtil.SPACE);
        sb.append(z ? "has" : "does not have");
        sb.append(" multidex support");
        Log.i("HTRouter::", sb.toString());
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0016  */
    private final List<String> tryLoadInstantRunDexFile(ApplicationInfo applicationInfo) {
        boolean z;
        String string;
        ArrayList arrayList = new ArrayList();
        String[] strArr = applicationInfo.splitSourceDirs;
        if (strArr == null) {
            z = true;
        } else if (strArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            try {
                Object objInvoke = Class.forName("com.android.tools.fd.runtime.Paths").getMethod("getDexFileDirectory", String.class).invoke(null, applicationInfo.packageName);
                if (objInvoke == null || (string = objInvoke.toString()) == null) {
                    throw new Exception();
                }
                File file = new File(string);
                if (file.exists() && file.isDirectory()) {
                    File[] fileArrListFiles = file.listFiles();
                    if (fileArrListFiles != null) {
                        for (File file2 : fileArrListFiles) {
                            if (file2 != null && file2.exists()) {
                                String name = file2.getName();
                                Intrinsics.checkNotNullExpressionValue(name, "file.name");
                                if (StringsKt__StringsJVMKt.endsWith$default(name, ".dex", false, 2, null)) {
                                    arrayList.add(file2.getAbsolutePath());
                                }
                            }
                        }
                    }
                    Log.d("HTRouter::", "Found InstantRun support");
                }
            } catch (Exception e2) {
                Log.i("HTRouter::", "InstantRun support error, " + e2.getMessage());
            }
        } else {
            Intrinsics.checkNotNullExpressionValue(strArr, "applicationInfo.splitSourceDirs");
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, strArr);
            Log.i("HTRouter::", "Found InstantRun support");
        }
        return arrayList;
    }

    @NotNull
    public final Set<String> getFileNameByPackageName(@NotNull Context context, @NotNull String packageName) throws InterruptedException, PackageManager.NameNotFoundException, IOException {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        HashSet hashSet = new HashSet();
        List<String> sourcePaths = getSourcePaths(context);
        CountDownLatch countDownLatch = new CountDownLatch(sourcePaths.size());
        Iterator<String> it = sourcePaths.iterator();
        while (it.hasNext()) {
            DefaultPoolExecutor.INSTANCE.getINSTANCE().execute(new a(it.next(), packageName, hashSet, countDownLatch));
        }
        countDownLatch.await();
        Log.d("HTRouter::", "Filter " + hashSet.size() + " classes by package <" + packageName + Typography.greater);
        return hashSet;
    }

    @NotNull
    public final List<String> getSourcePaths(@NotNull Context context) throws PackageManager.NameNotFoundException, IOException {
        Intrinsics.checkNotNullParameter(context, "context");
        ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 0);
        Intrinsics.checkNotNullExpressionValue(applicationInfo, "context.packageManager.g…o(context.packageName, 0)");
        File file = new File(applicationInfo.sourceDir);
        ArrayList arrayList = new ArrayList();
        arrayList.add(applicationInfo.sourceDir);
        String str = file.getName() + EXTRACTED_NAME_EXT;
        if (isVMMultiDexCapable()) {
            SharedPreferences multiDexPreferences = getMultiDexPreferences(context);
            int i = multiDexPreferences != null ? multiDexPreferences.getInt(KEY_DEX_NUMBER, 1) : 1;
            File file2 = new File(applicationInfo.dataDir, SECONDARY_FOLDER_NAME);
            int i2 = 2;
            if (2 <= i) {
                while (true) {
                    File file3 = new File(file2, str + i2 + ".zip");
                    if (!file3.isFile()) {
                        throw new IOException("Miss extracted secondary dex file '" + file3.getPath() + '\'');
                    }
                    arrayList.add(file3.getAbsolutePath());
                    if (i2 == i) {
                        break;
                    }
                    i2++;
                }
            }
        }
        if (InternalGlobalStatus.INSTANCE.isDebuggable()) {
            arrayList.addAll(tryLoadInstantRunDexFile(applicationInfo));
        }
        return arrayList;
    }
}
