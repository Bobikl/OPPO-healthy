package com.oplus.phonenoareainquire.utils;

import android.annotation.SuppressLint;
import android.content.ContentProvider;
import android.content.ContentProviderClient;
import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.os.PowerManager;
import com.oplus.aiunit.vision.g3e;
import com.oplus.aiunit.vision.mb4;
import com.oplus.aiunit.vision.xje;
import com.oplus.aiunit.vision.zr8;
import com.oplus.phonenoareainquire.PhoneNoInquireProvider;
import com.oplus.phonenoareainquire.c;
import com.oplus.phonenoareainquire.service.OplusLocaleChangeJobIntentService;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jdk7.AutoCloseableKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\b\u0010\u0006\u001a\u00020\u0004H\u0007J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0002H\u0003J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0003R\u0014\u0010\f\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0016\u001a\b\u0018\u00010\u0013R\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0015R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/oplus/phonenoareainquire/utils/SelfHealUtil;", "", "Landroid/content/Context;", "c", "", "e", "d", "context", "Ljava/io/File;", "file", "b", "", "MIN_EXTENT_NUMBER_COUNT", "I", "MIN_LANGUAGE_COUNT", "Ljava/util/concurrent/atomic/AtomicInteger;", "a", "Ljava/util/concurrent/atomic/AtomicInteger;", "finishedCount", "Landroid/os/PowerManager$WakeLock;", "Landroid/os/PowerManager;", "Landroid/os/PowerManager$WakeLock;", "wakeLock", "Landroid/content/Context;", "<init>", "()V", "contactnetnumber_impl_thirdRelease"}, k = 1, mv = {1, 8, 0})
@SuppressLint({"StaticFieldLeak"})
public final class SelfHealUtil {
    public static final int MIN_EXTENT_NUMBER_COUNT = 32;
    public static final int MIN_LANGUAGE_COUNT = 10;

    @Nullable
    public static PowerManager.WakeLock b;

    @Nullable
    public static Context c;

    @NotNull
    public static final SelfHealUtil INSTANCE = new SelfHealUtil();

    @NotNull
    public static final AtomicInteger a = new AtomicInteger(0);

    @JvmStatic
    public static final void b(File file) {
        if (file.exists()) {
            if (file.isFile()) {
                String name = file.getName();
                Intrinsics.checkNotNullExpressionValue(name, "file.name");
                if (!StringsKt.endsWith$default(name, ".txt", false, 2, (Object) null)) {
                    String name2 = file.getName();
                    Intrinsics.checkNotNullExpressionValue(name2, "file.name");
                    if (!StringsKt.endsWith$default(name2, ".dat", false, 2, (Object) null)) {
                        return;
                    }
                }
                file.delete();
                return;
            }
            if (file.isDirectory()) {
                File[] fileArrListFiles = file.listFiles();
                if (fileArrListFiles != null) {
                    if (!(fileArrListFiles.length == 0)) {
                        for (File file2 : fileArrListFiles) {
                            Intrinsics.checkNotNullExpressionValue(file2, "f");
                            b(file2);
                        }
                        file.delete();
                        return;
                    }
                }
                file.delete();
            }
        }
    }

    @JvmStatic
    public static final void c(Context context) {
        PowerManager.WakeLock wakeLock;
        try {
            try {
                try {
                    try {
                        Object systemService = context.getSystemService("power");
                        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.os.PowerManager");
                        PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) systemService).newWakeLock(1, "PhoneNumberAttribution:updateDbFile");
                        b = wakeLockNewWakeLock;
                        if (wakeLockNewWakeLock != null) {
                            wakeLockNewWakeLock.acquire();
                        }
                        b(new File(PhoneNoInquireProvider.sDataFilePath));
                        ContentProviderClient contentProviderClientAcquireContentProviderClient = context.getContentResolver().acquireContentProviderClient(PhoneNoInquireProvider.AUTHORITY);
                        if (contentProviderClientAcquireContentProviderClient != null) {
                            try {
                                ContentProvider localContentProvider = contentProviderClientAcquireContentProviderClient.getLocalContentProvider();
                                xje.l(context).h(xje.l(context).getReadableDatabase());
                                if (localContentProvider instanceof PhoneNoInquireProvider) {
                                    ((PhoneNoInquireProvider) localContentProvider).loadNumberDataToCache();
                                    ((PhoneNoInquireProvider) localContentProvider).initExtendNumberInfo();
                                    ((PhoneNoInquireProvider) localContentProvider).checkNumberData();
                                    CountDownLatch countDownLatch = new CountDownLatch(1);
                                    ((PhoneNoInquireProvider) localContentProvider).setInitializationLatch(countDownLatch);
                                    mb4.i(context, ((PhoneNoInquireProvider) localContentProvider).VERSION_CN, countDownLatch);
                                    OplusLocaleChangeJobIntentService.INSTANCE.c(c.b("Multi_Language_Table.txt", PhoneNoInquireProvider.sMultiLanguageTableFile), context, xje.l(context).getReadableDatabase());
                                    g3e.a("SelfHealUtil", "self heal complete");
                                }
                                Unit unit = Unit.INSTANCE;
                                AutoCloseableKt.closeFinally(contentProviderClientAcquireContentProviderClient, (Throwable) null);
                            } catch (Throwable th) {
                                try {
                                    throw th;
                                } catch (Throwable th2) {
                                    AutoCloseableKt.closeFinally(contentProviderClientAcquireContentProviderClient, th);
                                    throw th2;
                                }
                            }
                        }
                        wakeLock = b;
                        if (wakeLock == null) {
                            return;
                        }
                    } catch (Throwable th3) {
                        PowerManager.WakeLock wakeLock2 = b;
                        if (wakeLock2 != null) {
                            wakeLock2.release();
                        }
                        throw th3;
                    }
                } catch (SQLiteException e) {
                    g3e.b("SelfHealUtil", "exception when clear app data " + e.getMessage());
                    wakeLock = b;
                    if (wakeLock == null) {
                        return;
                    }
                }
            } catch (IOException e2) {
                g3e.b("SelfHealUtil", "exception when clear app data " + e2.getMessage());
                wakeLock = b;
                if (wakeLock == null) {
                    return;
                }
            }
        } catch (FileNotFoundException e3) {
            g3e.b("SelfHealUtil", "exception when clear app data " + e3.getMessage());
            wakeLock = b;
            if (wakeLock == null) {
                return;
            }
        }
        wakeLock.release();
    }

    @JvmStatic
    public static final void d() {
        Context context;
        AtomicInteger atomicInteger = a;
        atomicInteger.addAndGet(1);
        g3e.a("SelfHealUtil", "current finished count is : " + atomicInteger.get());
        if (atomicInteger.get() != 4 || (context = c) == null) {
            return;
        }
        BuildersKt.launch$default(CoroutineScopeKt.MainScope(), zr8.INSTANCE.f(), (CoroutineStart) null, new SelfHealUtil$markInitFileComplete$1$1(context, null), 2, (Object) null);
    }

    @JvmStatic
    public static final void e(@NotNull Context c2) {
        Intrinsics.checkNotNullParameter(c2, "c");
        c = c2;
    }
}
