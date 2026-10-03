package com.oplus.utrace.utils;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Log;
import com.oplus.aiunit.vision.h9e;
import com.oplus.pantanal.seedling.constants.TraceConstants;
import dalvik.system.BaseDexClassLoader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0015\u001a\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u001a\u001a6\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u001a0\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u001a\b\u0002\u0010\u001f\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"0 \u001a\n\u0010#\u001a\u0004\u0018\u00010\u0001H\u0002\u001a\u0016\u0010$\u001a\u00020\u00072\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u0001\u001a\u0016\u0010(\u001a\u00020\u00012\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u0001\u001a\n\u0010)\u001a\u0004\u0018\u00010\u0001H\u0003\u001a\n\u0010*\u001a\u0004\u0018\u00010\u0001H\u0002\u001a\u0012\u0010+\u001a\u0004\u0018\u00010\u00012\b\u0010,\u001a\u0004\u0018\u00010-\u001a\u0010\u0010.\u001a\u00020\u00012\b\u0010%\u001a\u0004\u0018\u00010&\u001a\u000e\u0010\b\u001a\u00020\t2\u0006\u0010%\u001a\u00020&\u001a\u000e\u0010\u000b\u001a\u00020\t2\u0006\u0010%\u001a\u00020&\u001a\u000e\u0010/\u001a\u00020\t2\u0006\u0010%\u001a\u00020&\u001a\u000e\u00100\u001a\u00020\t2\u0006\u0010%\u001a\u00020&\u001a\u0006\u00101\u001a\u00020\t\u001a\u0018\u00102\u001a\u0002032\u0006\u00104\u001a\u00020\u00012\b\b\u0002\u00105\u001a\u000203\u001a\u0018\u00106\u001a\u00020\u00012\u0006\u00107\u001a\u00020\u00012\b\b\u0002\u00108\u001a\u00020\t\u001a$\u00109\u001a\b\u0012\u0004\u0012\u0002H;0:\"\u0004\b\u0000\u0010;*\u00020<2\f\u0010=\u001a\b\u0012\u0004\u0012\u0002H;0>\u001a\u0012\u0010?\u001a\u00020\"*\u00020@2\u0006\u0010A\u001a\u00020B\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000\"\u0012\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\n\"\u0012\u0010\u000b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\n\"\u0010\u0010\f\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000\"\u000e\u0010\u000e\u001a\u00020\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u000f\u001a\u00020\u0001*\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006C"}, d2 = {"CORE_PROCESS_SUFFIX", "", "DEX_FILE_NAME", "getDEX_FILE_NAME", "()Ljava/lang/String;", "TAG", "TRANSFORM_LOG_WINDOW", "", "isCoreProcess", "", "Ljava/lang/Boolean;", "isMainProcess", "logSuffix", "previousTransformLogWindow", "processName", "baseName", "Ljava/io/File;", "getBaseName", "(Ljava/io/File;)Ljava/lang/String;", "checkIntent", TraceConstants.KEY_ACTION, "Landroid/content/Intent;", "copyFileWithFD", "", "outFile", "parcelFd", "Landroid/os/ParcelFileDescriptor;", "extractFdsFromBundle", "", "bundle", "Landroid/os/Bundle;", "failure", "Lkotlin/Function2;", "", "", "generateLogSuffix", "getAppVersionCode", "context", "Landroid/content/Context;", TraceConstants.KEY_PKG_NAME, "getAppVersionName", "getCurrentDexFileName", "getDexFileName", "getFirstDexFileNameFromPathList", "dexPathList", "", "getProcessName", "isSubButCoreProcess", "isSubProcess", "isUserUnlocked", "startNewLooper", "Landroid/os/Looper;", "name", "defVal", "transformLogMessage", "message", "always", "submit", "Ljava/util/concurrent/Future;", "T", "Landroid/os/Handler;", "callable", "Ljava/util/concurrent/Callable;", "submitSafe", "Ljava/util/concurrent/ExecutorService;", "runnable", "Ljava/lang/Runnable;", "utrace-lib_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Utils.kt\ncom/oplus/utrace/utils/UtilsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,361:1\n1#2:362\n3792#3:363\n4307#3,2:364\n1855#4,2:366\n*S KotlinDebug\n*F\n+ 1 Utils.kt\ncom/oplus/utrace/utils/UtilsKt\n*L\n172#1:363\n172#1:364,2\n244#1:366,2\n*E\n"})
public final class UtilsKt {

    @NotNull
    public static final String CORE_PROCESS_SUFFIX = ":utrace_core";

    @NotNull
    private static final String TAG = "UTrace.Lib.Utils";
    private static final long TRANSFORM_LOG_WINDOW = 100;

    @Nullable
    private static volatile Boolean isCoreProcess = null;

    @Nullable
    private static volatile Boolean isMainProcess = null;
    private static long previousTransformLogWindow = 0;

    @NotNull
    private static volatile String processName = "";

    @Nullable
    private static final String DEX_FILE_NAME = getDexFileName();

    @Nullable
    private static volatile String logSuffix = generateLogSuffix();

    public static final boolean checkIntent(@NotNull Intent intent) {
        Object obj;
        Intrinsics.checkNotNullParameter(intent, TraceConstants.KEY_ACTION);
        try {
            Result.Companion companion = Result.Companion;
            intent.getBooleanExtra("check_intent", false);
            obj = Result.constructor-impl(Boolean.TRUE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Throwable th2 = Result.exceptionOrNull-impl(obj);
        if (th2 != null) {
            intent.replaceExtras((Bundle) null);
            Logs.INSTANCE.w(TAG, "checkIntent() exception=" + th2 + " intent=" + intent);
        }
        Boolean bool = Boolean.FALSE;
        if (Result.isFailure-impl(obj)) {
            obj = bool;
        }
        return ((Boolean) obj).booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0070 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x0072  */
    /* JADX WARN: Code duplicated, block: B:41:0x0076 A[RETURN] */
    public static final int copyFileWithFD(@NotNull File file, @NotNull ParcelFileDescriptor parcelFileDescriptor) throws Throwable {
        Throwable th;
        Intrinsics.checkNotNullParameter(file, "outFile");
        Intrinsics.checkNotNullParameter(parcelFileDescriptor, "parcelFd");
        if (file.exists()) {
            file.delete();
        }
        File parentFile = file.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        file.createNewFile();
        boolean z = false;
        try {
            Result.Companion companion = Result.Companion;
            FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptor.getFileDescriptor());
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                try {
                    try {
                        byte[] bArr = new byte[1024];
                        int i = 0;
                        while (true) {
                            int i2 = fileInputStream.read(bArr);
                            if (i2 <= 0) {
                                Unit unit = Unit.INSTANCE;
                                CloseableKt.closeFinally(fileOutputStream, (Throwable) null);
                                try {
                                    CloseableKt.closeFinally(fileInputStream, (Throwable) null);
                                    return i;
                                } catch (Throwable th2) {
                                    th = th2;
                                    z = true;
                                    Result.Companion companion2 = Result.Companion;
                                    th = Result.exceptionOrNull-impl(Result.constructor-impl(ResultKt.createFailure(th)));
                                    if (th != null) {
                                        return -1;
                                    }
                                    if (z) {
                                        file.delete();
                                    }
                                    throw th;
                                }
                            }
                            fileOutputStream.write(bArr, 0, i2);
                            i += i2;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        z = true;
                        try {
                            throw th;
                        } catch (Throwable th4) {
                            CloseableKt.closeFinally(fileInputStream, th);
                            throw th4;
                        }
                    }
                } catch (Throwable th5) {
                    try {
                        throw th5;
                    } catch (Throwable th6) {
                        CloseableKt.closeFinally(fileOutputStream, th5);
                        throw th6;
                    }
                }
            } catch (Throwable th7) {
                th = th7;
            }
        } catch (Throwable th8) {
            th = th8;
            Result.Companion companion3 = Result.Companion;
            th = Result.exceptionOrNull-impl(Result.constructor-impl(ResultKt.createFailure(th)));
            if (th != null) {
                return -1;
            }
            if (z) {
                file.delete();
            }
            throw th;
        }
    }

    @NotNull
    public static final Map<String, ParcelFileDescriptor> extractFdsFromBundle(@NotNull Bundle bundle, @NotNull Function2<? super String, ? super Throwable, Unit> function2) {
        Object obj;
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(function2, "failure");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Set<String> setKeySet = bundle.keySet();
        Intrinsics.checkNotNullExpressionValue(setKeySet, "bundle.keySet()");
        for (String str : setKeySet) {
            try {
                Result.Companion companion = Result.Companion;
                obj = Result.constructor-impl(Build.VERSION.SDK_INT > 33 ? (ParcelFileDescriptor) h9e.a(bundle, str, ParcelFileDescriptor.class) : (ParcelFileDescriptor) bundle.getParcelable(str));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                obj = Result.constructor-impl(ResultKt.createFailure(th));
            }
            Throwable th2 = Result.exceptionOrNull-impl(obj);
            if (th2 != null) {
                Logs.INSTANCE.w(TAG, "extractFdsFromBundle() exception=" + th2, th2);
                Intrinsics.checkNotNullExpressionValue(str, "fileName");
                function2.invoke(str, th2);
            }
            if (Result.isFailure-impl(obj)) {
                obj = null;
            }
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) obj;
            if (parcelFileDescriptor != null) {
                Intrinsics.checkNotNullExpressionValue(str, "fileName");
                Intrinsics.checkNotNullExpressionValue(parcelFileDescriptor, "it");
                linkedHashMap.put(str, parcelFileDescriptor);
            }
        }
        Logs logs = Logs.INSTANCE;
        if (logs.getDebuggable()) {
            logs.d(TAG, "extractFdsFromBundle() result=" + linkedHashMap.keySet());
        }
        return linkedHashMap;
    }

    public static /* synthetic */ Map extractFdsFromBundle$default(Bundle bundle, Function2 function2, int i, Object obj) {
        if ((i & 2) != 0) {
            function2 = new Function2<String, Throwable, Unit>() { // from class: com.oplus.utrace.utils.UtilsKt.extractFdsFromBundle.1
                public final void invoke(@NotNull String str, @NotNull Throwable th) {
                    Intrinsics.checkNotNullParameter(str, "<anonymous parameter 0>");
                    Intrinsics.checkNotNullParameter(th, "<anonymous parameter 1>");
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                    invoke((String) obj2, (Throwable) obj3);
                    return Unit.INSTANCE;
                }
            };
        }
        return extractFdsFromBundle(bundle, function2);
    }

    private static final String generateLogSuffix() {
        String[] strArr = {DEX_FILE_NAME, processName, "2.0.44-25e9612"};
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 3; i++) {
            String str = strArr[i];
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(str);
            }
        }
        String strJoinToString$default = CollectionsKt.joinToString$default(arrayList, "|", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null);
        if (!(!StringsKt.isBlank(strJoinToString$default))) {
            strJoinToString$default = null;
        }
        if (strJoinToString$default == null) {
            return null;
        }
        return '[' + strJoinToString$default + ']';
    }

    public static final long getAppVersionCode(@NotNull Context context, @NotNull String str) {
        Object obj;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(str, TraceConstants.KEY_PKG_NAME);
        try {
            Result.Companion companion = Result.Companion;
            obj = Result.constructor-impl(Long.valueOf(Long.valueOf(context.getPackageManager().getPackageInfo(str, 0).getLongVersionCode()).longValue()));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Throwable th2 = Result.exceptionOrNull-impl(obj);
        if (th2 != null) {
            Logs.INSTANCE.e(TAG, "getAppVersionCode: error:" + th2);
        }
        if (Result.isFailure-impl(obj)) {
            obj = 0L;
        }
        long jLongValue = ((Number) obj).longValue();
        Logs.INSTANCE.d(TAG, "getAppVersionCode pkgName:" + str + " versionCode:" + jLongValue);
        return jLongValue;
    }

    @NotNull
    public static final String getAppVersionName(@NotNull Context context, @NotNull String str) {
        Object obj;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(str, TraceConstants.KEY_PKG_NAME);
        try {
            Result.Companion companion = Result.Companion;
            obj = Result.constructor-impl(context.getPackageManager().getPackageInfo(str, 0).versionName);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Throwable th2 = Result.exceptionOrNull-impl(obj);
        if (th2 != null) {
            Logs.INSTANCE.e(TAG, "getAppVersionName: error:" + th2);
        }
        if (Result.isFailure-impl(obj)) {
            obj = null;
        }
        String str2 = (String) obj;
        if (str2 == null) {
            str2 = "unknown";
        }
        Logs.INSTANCE.d(TAG, "getAppVersionName pkgName:" + str + " versionName:" + str2);
        return str2;
    }

    @NotNull
    public static final String getBaseName(@NotNull File file) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        String name = file.getName();
        Intrinsics.checkNotNullExpressionValue(name, "name");
        Integer numValueOf = Integer.valueOf(StringsKt.lastIndexOf$default(name, '.', 0, false, 6, (Object) null));
        if (!(numValueOf.intValue() > 0)) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            int iIntValue = numValueOf.intValue();
            String name2 = file.getName();
            Intrinsics.checkNotNullExpressionValue(name2, "name");
            String strSubstring = name2.substring(0, iIntValue);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            if (strSubstring != null) {
                return strSubstring;
            }
        }
        String name3 = file.getName();
        Intrinsics.checkNotNullExpressionValue(name3, "name");
        return name3;
    }

    @SuppressLint({"DiscouragedPrivateApi"})
    private static final String getCurrentDexFileName() {
        try {
            Result.Companion companion = Result.Companion;
            Logs logs = Logs.INSTANCE;
            ClassLoader classLoader = logs.getClass().getClassLoader();
            if (logs.getDebuggable()) {
                logs.d(TAG, "getCurrentDexFileName() classLoader=" + classLoader);
            }
            Field declaredField = BaseDexClassLoader.class.getDeclaredField("pathList");
            declaredField.setAccessible(true);
            String firstDexFileNameFromPathList = getFirstDexFileNameFromPathList(declaredField.get(classLoader));
            if (logs.getDebuggable()) {
                logs.d(TAG, "getCurrentDexFileName() result=" + firstDexFileNameFromPathList);
            }
            return firstDexFileNameFromPathList;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Throwable th2 = Result.exceptionOrNull-impl(Result.constructor-impl(ResultKt.createFailure(th)));
            if (th2 == null) {
                return null;
            }
            Logs logs2 = Logs.INSTANCE;
            if (!logs2.getDebuggable()) {
                return null;
            }
            logs2.d(TAG, "getCurrentDexFileName() exception=" + th2.getMessage(), th2);
            return null;
        }
    }

    @Nullable
    public static final String getDEX_FILE_NAME() {
        return DEX_FILE_NAME;
    }

    private static final String getDexFileName() {
        String name;
        String currentDexFileName = getCurrentDexFileName();
        if (currentDexFileName == null || (name = new File(currentDexFileName).getName()) == null) {
            return null;
        }
        if (StringsKt.endsWith$default(name, ".apk", false, 2, (Object) null)) {
            name = name.substring(0, name.length() - 4);
            Intrinsics.checkNotNullExpressionValue(name, "this as java.lang.String…ing(startIndex, endIndex)");
        }
        return name;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0092  */
    @Nullable
    public static final String getFirstDexFileNameFromPathList(@Nullable Object obj) throws IllegalAccessException, NoSuchFieldException {
        List listFilterNotNull;
        String str;
        if (obj == null) {
            return null;
        }
        Field declaredField = obj.getClass().getDeclaredField("dexElements");
        declaredField.setAccessible(true);
        Object obj2 = declaredField.get(obj);
        Object[] objArr = obj2 instanceof Object[] ? (Object[]) obj2 : null;
        Logs logs = Logs.INSTANCE;
        if (logs.getDebuggable()) {
            logs.d(TAG, "getFirstDexFileNameFromPathList() dexElements=" + ArraysKt.contentDeepToString(objArr));
        }
        if (objArr == null || (listFilterNotNull = ArraysKt.filterNotNull(objArr)) == null) {
            return null;
        }
        for (Object obj3 : listFilterNotNull) {
            Field declaredField2 = obj3.getClass().getDeclaredField("dexFile");
            declaredField2.setAccessible(true);
            Object obj4 = declaredField2.get(obj3);
            if (obj4 != null) {
                Field declaredField3 = obj4.getClass().getDeclaredField("mFileName");
                declaredField3.setAccessible(true);
                Object obj5 = declaredField3.get(obj4);
                str = obj5 instanceof String ? (String) obj5 : null;
                if (str == null || !new File(str).isFile()) {
                    str = null;
                }
            } else {
                str = null;
            }
            if (str != null) {
                return str;
            }
        }
        return null;
    }

    @NotNull
    public static final String getProcessName(@Nullable Context context) {
        if (processName.length() == 0) {
            String processName2 = Application.getProcessName();
            Intrinsics.checkNotNullExpressionValue(processName2, "{\n            Applicatio…etProcessName()\n        }");
            processName = processName2;
            logSuffix = generateLogSuffix();
        }
        return processName;
    }

    public static final boolean isCoreProcess(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Boolean bool = isCoreProcess;
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean zEndsWith$default = StringsKt.endsWith$default(getProcessName(context), CORE_PROCESS_SUFFIX, false, 2, (Object) null);
        isCoreProcess = Boolean.valueOf(zEndsWith$default);
        return zEndsWith$default;
    }

    public static final boolean isMainProcess(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Boolean bool = isMainProcess;
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean zAreEqual = Intrinsics.areEqual(getProcessName(context), context.getPackageName());
        isMainProcess = Boolean.valueOf(zAreEqual);
        return zAreEqual;
    }

    public static final boolean isSubButCoreProcess(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return (isMainProcess(context) || isCoreProcess(context)) ? false : true;
    }

    public static final boolean isSubProcess(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return !isMainProcess(context);
    }

    public static final boolean isUserUnlocked() {
        return UserUnlockManager.INSTANCE.isUnlocked();
    }

    @NotNull
    public static final Looper startNewLooper(@NotNull String str, @NotNull Looper looper) {
        Object obj;
        Intrinsics.checkNotNullParameter(str, "name");
        Intrinsics.checkNotNullParameter(looper, "defVal");
        try {
            Result.Companion companion = Result.Companion;
            HandlerThread handlerThread = new HandlerThread(str);
            handlerThread.start();
            obj = Result.constructor-impl(handlerThread.getLooper());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Throwable th2 = Result.exceptionOrNull-impl(obj);
        if (th2 != null) {
            Logs.INSTANCE.e(TAG, "startNewLooper(" + str + "): " + th2);
        }
        Object obj2 = looper;
        if (!Result.isFailure-impl(obj)) {
            obj2 = obj;
        }
        Looper looper2 = (Looper) obj2;
        Intrinsics.checkNotNullExpressionValue(obj2, "runCatching {\n        va…read=${it.thread}\")\n    }");
        return looper2;
    }

    public static /* synthetic */ Looper startNewLooper$default(String str, Looper looper, int i, Object obj) {
        if ((i & 2) != 0) {
            looper = Looper.getMainLooper();
            Intrinsics.checkNotNullExpressionValue(looper, "getMainLooper()");
        }
        return startNewLooper(str, looper);
    }

    @NotNull
    public static final <T> Future<T> submit(@NotNull final Handler handler, @NotNull final Callable<T> callable) {
        Intrinsics.checkNotNullParameter(handler, "<this>");
        Intrinsics.checkNotNullParameter(callable, "callable");
        final CompletableFuture completableFuture = new CompletableFuture();
        if (!handler.post(new Runnable() { // from class: com.oplus.utrace.utils.c
            @Override // java.lang.Runnable
            public final void run() {
                UtilsKt.submit$lambda$27(handler, completableFuture, callable);
            }
        })) {
            completableFuture.completeExceptionally(new IllegalStateException("post() returns false"));
        }
        return completableFuture;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void submit$lambda$27(Handler handler, CompletableFuture completableFuture, Callable callable) {
        Object obj;
        Intrinsics.checkNotNullParameter(handler, "$this_submit");
        Intrinsics.checkNotNullParameter(completableFuture, "$future");
        Intrinsics.checkNotNullParameter(callable, "$callable");
        try {
            Result.Companion companion = Result.Companion;
            obj = Result.constructor-impl(Boolean.valueOf(completableFuture.complete(callable.call())));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Throwable th2 = Result.exceptionOrNull-impl(obj);
        if (th2 != null) {
            Log.d(TAG, "submit() exception=" + th2);
            completableFuture.completeExceptionally(th2);
        }
    }

    public static final void submitSafe(@NotNull ExecutorService executorService, @NotNull Runnable runnable) {
        Object obj;
        Intrinsics.checkNotNullParameter(executorService, "<this>");
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        try {
            Result.Companion companion = Result.Companion;
            if (!executorService.isShutdown()) {
                executorService.submit(runnable);
            }
            obj = Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Throwable th2 = Result.exceptionOrNull-impl(obj);
        if (th2 != null) {
            Log.d(TAG, "submitSafe() exception=" + th2);
        }
    }

    @NotNull
    public static final String transformLogMessage(@NotNull String str, boolean z) {
        boolean z2;
        Intrinsics.checkNotNullParameter(str, "message");
        String str2 = logSuffix;
        if (str2 == null) {
            return str;
        }
        boolean z3 = true;
        if (!z) {
            long jCurrentTimeMillis = System.currentTimeMillis() / TRANSFORM_LOG_WINDOW;
            if (previousTransformLogWindow == jCurrentTimeMillis) {
                z2 = false;
            } else {
                previousTransformLogWindow = jCurrentTimeMillis;
                z2 = true;
            }
            if (!z2) {
                z3 = false;
            }
        }
        if (!z3) {
            str2 = null;
        }
        if (str2 == null) {
            return str;
        }
        String str3 = str + ' ' + str2;
        return str3 != null ? str3 : str;
    }

    public static /* synthetic */ String transformLogMessage$default(String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return transformLogMessage(str, z);
    }
}
