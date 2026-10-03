package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import dalvik.system.DexFile;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes15.dex */
public class pc3 {
    public static final String a = "code_cache" + File.separator + "secondary-dexes";

    public class a implements Runnable {
        public final /* synthetic */ String i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ String f15311j;
        public final /* synthetic */ Set k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ CountDownLatch f15312l;

        public a(String str, String str2, Set set, CountDownLatch countDownLatch) {
            this.i = str;
            this.f15311j = str2;
            this.k = set;
            this.f15312l = countDownLatch;
        }

        @Override // java.lang.Runnable
        public void run() {
            DexFile dexFile = null;
            try {
                try {
                    if (this.i.endsWith(".zip")) {
                        dexFile = DexFile.loadDex(this.i, this.i + ".tmp", 0);
                    } else {
                        dexFile = new DexFile(this.i);
                    }
                    Enumeration<String> enumerationEntries = dexFile.entries();
                    while (enumerationEntries.hasMoreElements()) {
                        String strNextElement = enumerationEntries.nextElement();
                        if (strNextElement.startsWith(this.f15311j)) {
                            this.k.add(strNextElement);
                        }
                    }
                } catch (Throwable th) {
                    try {
                        a7b.c("ARouter", "Scan map file in dex files made error.", th);
                    } finally {
                        if (dexFile != null) {
                            try {
                                dexFile.close();
                            } catch (Throwable unused) {
                            }
                        }
                        this.f15312l.countDown();
                    }
                }
            } catch (Throwable unused2) {
            }
        }
    }

    public static Set<String> a(Context context, String str) throws InterruptedException, PackageManager.NameNotFoundException, IOException {
        HashSet hashSet = new HashSet();
        List<String> listC = c(context);
        CountDownLatch countDownLatch = new CountDownLatch(listC.size());
        ExecutorService executorServiceA = zq8.a("ClassUtils");
        Iterator<String> it = listC.iterator();
        while (it.hasNext()) {
            executorServiceA.execute(new a(it.next(), str, hashSet, countDownLatch));
        }
        countDownLatch.await();
        StringBuilder sb = new StringBuilder();
        sb.append("Filter ");
        sb.append(hashSet.size());
        sb.append(" classes by packageName <");
        sb.append(str);
        sb.append(">");
        return hashSet;
    }

    public static SharedPreferences b(Context context) {
        return context.getSharedPreferences("multidex.version", 4);
    }

    public static List<String> c(Context context) throws PackageManager.NameNotFoundException, IOException {
        ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 0);
        File file = new File(applicationInfo.sourceDir);
        ArrayList arrayList = new ArrayList();
        arrayList.add(applicationInfo.sourceDir);
        String str = file.getName() + ".classes";
        if (!d()) {
            int i = b(context).getInt("dex.number", 1);
            File file2 = new File(applicationInfo.dataDir, a);
            for (int i2 = 2; i2 <= i; i2++) {
                File file3 = new File(file2, str + i2 + ".zip");
                if (!file3.isFile()) {
                    throw new IOException("Missing extracted secondary dex file '" + file3.getPath() + "'");
                }
                arrayList.add(file3.getAbsolutePath());
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001d A[PHI: r1
  0x001d: PHI (r1v9 java.lang.String) = (r1v7 java.lang.String), (r1v7 java.lang.String), (r1v10 java.lang.String) binds: [B:13:0x004a, B:15:0x004e, B:6:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
    public static boolean d() {
        boolean z = false;
        String str = null;
        try {
            if (e()) {
                str = "'YunOS'";
                if (Integer.valueOf(System.getProperty("ro.build.version.sdk")).intValue() >= 21) {
                    z = true;
                }
            } else {
                str = "'Android'";
                String property = System.getProperty("java.vm.version");
                if (property != null) {
                    Matcher matcher = Pattern.compile("(\\d+)\\.(\\d+)(\\.\\d+)?").matcher(property);
                    if (matcher.matches()) {
                        int i = Integer.parseInt(matcher.group(1));
                        int i2 = Integer.parseInt(matcher.group(2));
                        if (i > 2 || (i == 2 && i2 >= 1)) {
                            z = true;
                        }
                    }
                }
            }
        } catch (NumberFormatException | Exception unused) {
        }
        StringBuilder sb = new StringBuilder();
        sb.append("VM with name ");
        sb.append(str);
        sb.append(z ? " has multidex support" : " does not have multidex support");
        a7b.f("com.heytap.health.base.scheme.ClassUtils", sb.toString());
        return z;
    }

    public static boolean e() {
        try {
            String property = System.getProperty("ro.yunos.version");
            String property2 = System.getProperty("java.vm.name");
            return (property2 != null && property2.toLowerCase().contains("lemur")) || (property != null && property.trim().length() > 0);
        } catch (Exception unused) {
            return false;
        }
    }
}
