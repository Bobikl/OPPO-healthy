package com.oplus.nearx.track.internal.common.content;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.heytap.log.formatter.LogFieldKey;
import com.heytap.store.base.core.http.HttpConst;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.k6k;
import com.oplus.aiunit.vision.w70;
import com.oplus.aiunit.vision.xkj;
import com.oplus.nearx.track.internal.common.TrackEnv;
import com.oplus.nearx.track.internal.utils.Logger;
import com.oplus.nearx.track.internal.utils.ProcessUtil;
import io.protostuff.MapSchema;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\bÁ\u0002\u0018\u00002\u00020\u0001:\u0001\bB\t\b\u0002¢\u0006\u0004\bR\u0010SJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002R\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\"\u0010\u000e\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\"\u0010\u0010\u001a\u00020\u000f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u0017\u001a\u00020\u00168\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\b\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010\u001d\u001a\u00020\u001c8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010#\u001a\u00020\u001c8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b#\u0010\u001e\u001a\u0004\b$\u0010 \"\u0004\b%\u0010\"R*\u0010*\u001a\u00020\u00022\u0006\u0010&\u001a\u00020\u00028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010\t\u001a\u0004\b(\u0010\u000b\"\u0004\b)\u0010\rR\"\u0010-\u001a\u00020\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u001e\u001a\u0004\b+\u0010 \"\u0004\b,\u0010\"R\"\u00101\u001a\u00020\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010\u001e\u001a\u0004\b/\u0010 \"\u0004\b0\u0010\"R\"\u00103\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u0010\t\u001a\u0004\b3\u0010\u000b\"\u0004\b4\u0010\rR\"\u0010;\u001a\u0002058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u0017\u0010<\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b7\u0010\t\u001a\u0004\b.\u0010\u000bR\u0017\u0010>\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b=\u0010\t\u001a\u0004\b2\u0010\u000bR$\u0010E\u001a\u0004\u0018\u00010?8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\u001b\u0010J\u001a\u00020F8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010G\u001a\u0004\bH\u0010IR\"\u0010N\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bH\u0010\u0007\u001a\u0004\b'\u0010K\"\u0004\bL\u0010MR\u0014\u0010O\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010@R\u0014\u0010P\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\bP\u0010\u0007R\u0011\u0010Q\u001a\u00020?8F¢\u0006\u0006\u001a\u0004\b=\u0010B¨\u0006T"}, d2 = {"Lcom/oplus/nearx/track/internal/common/content/GlobalConfigHelper;", "", "", LogFieldKey.PROCESS_NAME_KEY, "o", "", "TIME_OUT", "I", "a", "Z", "j", "()Z", "v", "(Z)V", "hasStaticInit", "Landroid/content/Context;", "context", "Landroid/content/Context;", "c", "()Landroid/content/Context;", "r", "(Landroid/content/Context;)V", "Lcom/oplus/aiunit/vision/w70;", "apkBuildInfo", "Lcom/oplus/aiunit/vision/w70;", "()Lcom/oplus/aiunit/vision/w70;", "q", "(Lcom/oplus/aiunit/vision/w70;)V", "", "region", "Ljava/lang/String;", LogFieldKey.LEVEL_KEY, "()Ljava/lang/String;", "x", "(Ljava/lang/String;)V", "feedbackRegion", "i", "u", "value", "b", "f", "s", "enableTrackInCurrentProcess", LogFieldKey.MESSAGE_KEY, "setSdkLogo", "sdkLogo", "d", "n", "y", "storageFilePrefix", MapSchema.FIELD_NAME_ENTRY, "isNetRequestEnable", "w", "Lcom/oplus/nearx/track/internal/common/TrackEnv;", "Lcom/oplus/nearx/track/internal/common/TrackEnv;", b2n.f, "()Lcom/oplus/nearx/track/internal/common/TrackEnv;", "t", "(Lcom/oplus/nearx/track/internal/common/TrackEnv;)V", HttpConst.SERVER_ENV, "enableLocalTestDeviceMode", b2n.g, "enableLog", "Ljava/util/concurrent/Executor;", "Ljava/util/concurrent/Executor;", "getThreadExecutor", "()Ljava/util/concurrent/Executor;", "setThreadExecutor", "(Ljava/util/concurrent/Executor;)V", "threadExecutor", "Landroid/os/Handler;", "Lkotlin/Lazy;", MapSchema.FIELD_NAME_KEY, "()Landroid/os/Handler;", "poster", "()I", "setBackgroundTime", "(I)V", "backgroundTime", "DEFAULT_THREAD_EXECUTOR", "POSTER_FLUSH_UPLOAD_AFTER_NET_CONNECT", "executor", "<init>", "()V", "core-statistics_release"}, k = 1, mv = {1, 7, 1})
@SuppressLint({"StaticFieldLeak"})
public final class GlobalConfigHelper {
    public static final int POSTER_FLUSH_UPLOAD_AFTER_NET_CONNECT = 1;
    public static final int TIME_OUT = 30000;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static volatile boolean hasStaticInit;
    public static w70 apkBuildInfo;
    public static Context context;
    public static String feedbackRegion;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public static final boolean enableLocalTestDeviceMode;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public static final boolean enableLog;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    public static Executor threadExecutor;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Lazy poster;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public static int backgroundTime;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Executor DEFAULT_THREAD_EXECUTOR;
    public static String region;

    @NotNull
    public static final GlobalConfigHelper INSTANCE = new GlobalConfigHelper();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static boolean enableTrackInCurrentProcess = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static String sdkLogo = "track";

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public static String storageFilePrefix = "";

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static boolean isNetRequestEnable = true;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public static TrackEnv env = TrackEnv.RELEASE;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/oplus/nearx/track/internal/common/content/GlobalConfigHelper$a;", "Ljava/util/concurrent/ThreadFactory;", "Ljava/lang/Runnable;", "r", "Ljava/lang/Thread;", "newThread", "Ljava/lang/ThreadGroup;", "i", "Ljava/lang/ThreadGroup;", "group", "Ljava/util/concurrent/atomic/AtomicInteger;", "j", "Ljava/util/concurrent/atomic/AtomicInteger;", "threadNumber", "<init>", "()V", "core-statistics_release"}, k = 1, mv = {1, 7, 1})
    public static final class a implements ThreadFactory {

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        @NotNull
        public final ThreadGroup group;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final AtomicInteger threadNumber;

        public a() {
            SecurityManager securityManager = System.getSecurityManager();
            ThreadGroup threadGroup = securityManager != null ? securityManager.getThreadGroup() : null;
            if (threadGroup == null) {
                threadGroup = Thread.currentThread().getThreadGroup();
                Intrinsics.checkNotNullExpressionValue(threadGroup, "currentThread().threadGroup");
            }
            this.group = threadGroup;
            this.threadNumber = new AtomicInteger(1);
        }

        @Override // java.util.concurrent.ThreadFactory
        @NotNull
        public Thread newThread(@Nullable Runnable r) {
            Thread thread = new Thread(this.group, r, "track_thread_" + this.threadNumber.getAndIncrement(), 0L);
            if (thread.isDaemon()) {
                thread.setDaemon(false);
            }
            if (thread.getPriority() != 5) {
                thread.setPriority(5);
            }
            return thread;
        }
    }

    static {
        xkj xkjVar = xkj.INSTANCE;
        enableLocalTestDeviceMode = xkjVar.d("debug.oplus.track.debugenv", false);
        enableLog = xkjVar.d("debug.oplus.track.log", false);
        poster = LazyKt__LazyJVMKt.lazy(new Function0<Handler>() { // from class: com.oplus.nearx.track.internal.common.content.GlobalConfigHelper$poster$2

            @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"com/oplus/nearx/track/internal/common/content/GlobalConfigHelper$poster$2$a", "Landroid/os/Handler$Callback;", "Landroid/os/Message;", "msg", "", "handleMessage", "core-statistics_release"}, k = 1, mv = {1, 7, 1})
            public static final class a implements Handler.Callback {
                @Override // android.os.Handler.Callback
                public boolean handleMessage(@NotNull Message msg) {
                    Intrinsics.checkNotNullParameter(msg, "msg");
                    Logger.b(k6k.e(), "GlobalConfigHelper", "poster handleMessage, what=" + msg.what, null, null, 12, null);
                    if (msg.what == 1) {
                        Object obj = msg.obj;
                        Runnable runnable = obj instanceof Runnable ? (Runnable) obj : null;
                        if (runnable != null) {
                            runnable.run();
                        }
                    }
                    return true;
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p010kotlin.jvm.functions.Function0
            @NotNull
            public final Handler invoke() {
                HandlerThread handlerThread = new HandlerThread("track_thread_poster");
                handlerThread.start();
                return new Handler(handlerThread.getLooper(), new a());
            }
        });
        backgroundTime = 30000;
        ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors() / 2, new a());
        Intrinsics.checkNotNullExpressionValue(executorServiceNewFixedThreadPool, "newFixedThreadPool(\n    …ThreadFactory()\n        )");
        DEFAULT_THREAD_EXECUTOR = executorServiceNewFixedThreadPool;
    }

    @NotNull
    public final w70 a() {
        w70 w70Var = apkBuildInfo;
        if (w70Var != null) {
            return w70Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("apkBuildInfo");
        return null;
    }

    public final int b() {
        return backgroundTime;
    }

    @NotNull
    public final Context c() {
        Context context2 = context;
        if (context2 != null) {
            return context2;
        }
        Intrinsics.throwUninitializedPropertyAccessException("context");
        return null;
    }

    public final boolean d() {
        return enableLocalTestDeviceMode;
    }

    public final boolean e() {
        return enableLog;
    }

    public final boolean f() {
        return enableTrackInCurrentProcess;
    }

    @NotNull
    public final TrackEnv g() {
        return env;
    }

    @NotNull
    public final Executor h() {
        Executor executor = threadExecutor;
        return executor == null ? DEFAULT_THREAD_EXECUTOR : executor;
    }

    @NotNull
    public final String i() {
        String str = feedbackRegion;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("feedbackRegion");
        return null;
    }

    public final boolean j() {
        return hasStaticInit;
    }

    @NotNull
    public final Handler k() {
        return (Handler) poster.getValue();
    }

    @NotNull
    public final String l() {
        String str = region;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("region");
        return null;
    }

    @NotNull
    public final String m() {
        return sdkLogo;
    }

    @NotNull
    public final String n() {
        return storageFilePrefix;
    }

    public final boolean o() {
        return isNetRequestEnable;
    }

    public final boolean p() {
        return env == TrackEnv.TEST;
    }

    public final void q(@NotNull w70 w70Var) {
        Intrinsics.checkNotNullParameter(w70Var, "<set-?>");
        apkBuildInfo = w70Var;
    }

    public final void r(@NotNull Context context2) {
        Intrinsics.checkNotNullParameter(context2, "<set-?>");
        context = context2;
    }

    public final void s(boolean z) {
        if (ProcessUtil.INSTANCE.g()) {
            z = true;
        }
        enableTrackInCurrentProcess = z;
    }

    public final void t(@NotNull TrackEnv trackEnv) {
        Intrinsics.checkNotNullParameter(trackEnv, "<set-?>");
        env = trackEnv;
    }

    public final void u(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        feedbackRegion = str;
    }

    public final void v(boolean z) {
        hasStaticInit = z;
    }

    public final void w(boolean z) {
        isNetRequestEnable = z;
    }

    public final void x(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        region = str;
    }

    public final void y(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        storageFilePrefix = str;
    }
}
