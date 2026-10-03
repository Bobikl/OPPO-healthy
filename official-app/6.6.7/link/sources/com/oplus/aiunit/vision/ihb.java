package com.oplus.aiunit.vision;

import java.lang.ref.SoftReference;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b$\u0010%J\u001a\u0010\u0006\u001a\u00020\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u001a\u0010\t\u001a\u00020\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0002J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\u000b\u001a\u00020\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\f\u001a\u00020\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0018\u0010\u0011\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0018\u00010\u000f2\u0006\u0010\u000e\u001a\u00020\rJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u000e\u001a\u00020\rR\u0014\u0010\u0014\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0015R \u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001bR*\u0010\u001d\u001a\u0018\u0012\u0004\u0012\u00020\r\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0018\u00010\u000f0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001bR\u0014\u0010 \u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001fR&\u0010\"\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120!0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001bR\u0014\u0010#\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001f¨\u0006&"}, d2 = {"Lcom/oplus/aiunit/vision/ihb;", "", "", "preToken", "pkg", "", "g", "d", "traceID", "h", "e", "a", "b", "", "requestCode", "", "Lcom/oplus/aiunit/vision/ws9;", "c", "Lcom/oplus/aiunit/vision/n2a;", "f", "EXTRA_INTERCEPTOR_CODE", "Ljava/lang/String;", "EXTRA_CALL_BACK_CODE", "EXTRA_IGNORE_CHECK_HOST", "EXTRA_OFFLINE_EXT_PARAM", "EXTRA_GENERAL_EXT_PARAM", "Ljava/util/concurrent/ConcurrentHashMap;", "Ljava/util/concurrent/ConcurrentHashMap;", "PRE_TOKEN_MAP_PKG", "JS_API_INTERCEPTOR_LISTENERS", "Ljava/util/concurrent/atomic/AtomicInteger;", "Ljava/util/concurrent/atomic/AtomicInteger;", "REQUEST_CODE_INTERCEPTOR_GENERATOR", "Ljava/lang/ref/SoftReference;", "LISTENERS", "REQUEST_CODE_CALL_BACK_GENERATOR", "<init>", "()V", "paysdk_web_release"}, k = 1, mv = {1, 8, 0})
public final class ihb {

    @NotNull
    public static final String EXTRA_CALL_BACK_CODE = "_extra_callback_code";

    @NotNull
    public static final String EXTRA_GENERAL_EXT_PARAM = "_extra_general_ext_param";

    @NotNull
    public static final String EXTRA_IGNORE_CHECK_HOST = "_extra_ignore_check_host";

    @NotNull
    public static final String EXTRA_INTERCEPTOR_CODE = "_extra_interceptor_code";

    @NotNull
    public static final String EXTRA_OFFLINE_EXT_PARAM = "_extra_offline_ext_param";

    @NotNull
    public static final ihb INSTANCE = new ihb();

    @NotNull
    public static final ConcurrentHashMap<String, String> a = new ConcurrentHashMap<>();

    @NotNull
    public static final ConcurrentHashMap<Integer, List<ws9>> b = new ConcurrentHashMap<>();

    @NotNull
    public static final AtomicInteger c = new AtomicInteger(1);

    @NotNull
    public static final ConcurrentHashMap<Integer, SoftReference<n2a>> d = new ConcurrentHashMap<>();

    @NotNull
    public static final AtomicInteger e = new AtomicInteger(1);

    public final void a(@Nullable String preToken) {
        if (preToken == null || preToken.length() == 0) {
            return;
        }
        ConcurrentHashMap<String, String> concurrentHashMap = a;
        if (concurrentHashMap.containsKey(preToken)) {
            concurrentHashMap.remove(preToken);
        }
    }

    public final void b(@Nullable String preToken) {
        String str = "PT_" + preToken;
        if (str == null || str.length() == 0) {
            return;
        }
        ConcurrentHashMap<String, String> concurrentHashMap = a;
        if (concurrentHashMap.containsKey(str)) {
            concurrentHashMap.remove(str);
        }
    }

    @Nullable
    public final List<ws9> c(int requestCode) {
        return b.get(Integer.valueOf(requestCode));
    }

    @Nullable
    public final String d(@Nullable String preToken) {
        if (preToken == null || preToken.length() == 0) {
            return null;
        }
        return a.get(preToken);
    }

    @Nullable
    public final String e(@Nullable String preToken) {
        String str = "PT_" + preToken;
        if (str == null || str.length() == 0) {
            return null;
        }
        return a.get(str);
    }

    @Nullable
    public final n2a f(int requestCode) {
        SoftReference<n2a> softReference = d.get(Integer.valueOf(requestCode));
        if (softReference != null) {
            return softReference.get();
        }
        return null;
    }

    public final void g(@Nullable String preToken, @Nullable String pkg) {
        if (preToken == null || preToken.length() == 0) {
            return;
        }
        if (pkg == null || pkg.length() == 0) {
            return;
        }
        ConcurrentHashMap<String, String> concurrentHashMap = a;
        if (!concurrentHashMap.containsKey(preToken)) {
            concurrentHashMap.put(preToken, pkg);
        } else {
            concurrentHashMap.remove(preToken);
            concurrentHashMap.put(preToken, pkg);
        }
    }

    public final void h(@Nullable String preToken, @Nullable String traceID) {
        if (preToken == null || preToken.length() == 0) {
            return;
        }
        if (traceID == null || traceID.length() == 0) {
            return;
        }
        String str = "PT_" + preToken;
        ConcurrentHashMap<String, String> concurrentHashMap = a;
        if (!concurrentHashMap.containsKey(str)) {
            concurrentHashMap.put(str, traceID);
        } else {
            concurrentHashMap.remove(str);
            concurrentHashMap.put(str, traceID);
        }
    }
}
