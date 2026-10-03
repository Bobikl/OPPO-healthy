package com.oplus.drs.track.internal2.common;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;
import com.heytap.databaseengineservice.db.table.phycialmental.DBPhysicalMentalAchievement;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.c90;
import com.oplus.aiunit.vision.lg3;
import com.oplus.aiunit.vision.mq9;
import com.oplus.aiunit.vision.svi;
import com.oplus.aiunit.vision.ur9;
import com.oplus.aiunit.vision.xvg;
import com.oplus.drs.rom.sdk.comm.log.TrackLogger;
import com.oplus.drs.track.internal2.common.AppLifeManager;
import com.oplus.drs.track.utils.ExceptionHandler;
import io.protostuff.MapSchema;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\b\n\b\u0000\u0018\u0000 Y2\u00020\u00012\u00020\u0002:\u0001ZB\u0007¢\u0006\u0004\bW\u0010XJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0012\u0010\n\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002J\u0012\u0010\f\u001a\u00020\u000b2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002J\u0012\u0010\r\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0018\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\b\u0010\u0013\u001a\u00020\u0003H\u0002J\u0016\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016J\u0006\u0010\u0019\u001a\u00020\u0003J\u001a\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016J\u0010\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\u001f\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010 \u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010\"\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010!\u001a\u00020\u001aH\u0016J\u0010\u0010#\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010(\u001a\u00020\u00032\u0006\u0010%\u001a\u00020$2\u0006\u0010'\u001a\u00020&H\u0016J\u000e\u0010*\u001a\u00020\u00032\u0006\u0010)\u001a\u00020\u0016J\u000e\u0010+\u001a\u00020\u00032\u0006\u0010)\u001a\u00020\u0016R\u001a\u00100\u001a\u00020\u00078\u0006X\u0086D¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0016\u00103\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00105\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00102R\u0016\u00108\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u0010:\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u00107R\u0016\u0010<\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u00107R\u0016\u0010@\u001a\u00020=8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b>\u0010?R#\u0010G\u001a\n B*\u0004\u0018\u00010A0A8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\u001c\u0010K\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u001b\u0010P\u001a\u00020L8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bM\u0010D\u001a\u0004\bN\u0010OR\u001a\u0010T\u001a\b\u0012\u0004\u0012\u00020\u00100Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u0014\u0010U\u001a\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bU\u0010V¨\u0006["}, d2 = {"Lcom/oplus/drs/track/internal2/common/AppLifeManager;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "Lcom/oplus/drs/track/utils/ExceptionHandler$a;", "", "verifySession", "Landroid/app/Activity;", "activity", "", "source", "compensateMissedColdStartIfNeeded", "addActivity", "", "hasActivity", "removeActivity", "handleStoppedMessage", "handleStartedMessage", "", "type", "sendActivityHandleMessage", "gotoBackGround", "Landroid/content/Context;", "context", "Lcom/oplus/aiunit/vision/mq9;", "backGroundListener", "init", "ensureColdStartCompensation", "Landroid/os/Bundle;", "savedInstanceState", "onActivityCreated", "onActivityStarted", "onActivityResumed", "onActivityPaused", "onActivityStopped", "outState", "onActivitySaveInstanceState", "onActivityDestroyed", "Ljava/lang/Thread;", "t", "", MapSchema.FIELD_NAME_ENTRY, "uncaughtException", "listener", "addListener", "removeListener", "i", "Ljava/lang/String;", "getKeyActivityCount", "()Ljava/lang/String;", "keyActivityCount", "j", "I", "mStoreStartActivityCount", MapSchema.FIELD_NAME_KEY, "mMemoryStartActivityCount", LogFieldKey.LEVEL_KEY, "Z", "isLifecycleRegistered", LogFieldKey.MESSAGE_KEY, "hasReceivedOnActivityStarted", "n", "coldStartCompensationPending", "Landroid/app/Application;", "o", "Landroid/app/Application;", "application", "Lcom/oplus/aiunit/vision/ur9;", "kotlin.jvm.PlatformType", LogFieldKey.PROCESS_NAME_KEY, "Lkotlin/Lazy;", "getMDbAdapter", "()Lcom/oplus/aiunit/vision/ur9;", "mDbAdapter", "", "q", "Ljava/util/List;", "listeners", "Landroid/os/Handler;", "r", "getMHandler", "()Landroid/os/Handler;", "mHandler", "", "s", "Ljava/util/Set;", "hashSet", "isAppInBackground", "()Z", "<init>", "()V", "Companion", "a", "obus-sdk_release"}, k = 1, mv = {1, 7, 1})
public final class AppLifeManager implements Application.ActivityLifecycleCallbacks, ExceptionHandler.a {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Lazy<AppLifeManager> t = LazyKt__LazyJVMKt.lazy(new Function0<AppLifeManager>() { // from class: com.oplus.drs.track.internal2.common.AppLifeManager$Companion$instance$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final AppLifeManager invoke() {
            return new AppLifeManager();
        }
    });

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public int mStoreStartActivityCount;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public int mMemoryStartActivityCount;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public volatile boolean isLifecycleRegistered;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public volatile boolean hasReceivedOnActivityStarted;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public volatile boolean coldStartCompensationPending;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public Application application;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final String keyActivityCount = DBPhysicalMentalAchievement.ACTIVITY_COUNT;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    public final Lazy mDbAdapter = LazyKt__LazyJVMKt.lazy(new Function0<ur9>() { // from class: com.oplus.drs.track.internal2.common.AppLifeManager$mDbAdapter$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p010kotlin.jvm.functions.Function0
        public final ur9 invoke() {
            return svi.a();
        }
    });

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @NotNull
    public final List<mq9> listeners = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @NotNull
    public final Lazy mHandler = LazyKt__LazyJVMKt.lazy(new Function0<AppLifeManager$mHandler$2.a>() { // from class: com.oplus.drs.track.internal2.common.AppLifeManager$mHandler$2

        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"com/oplus/drs/track/internal2/common/AppLifeManager$mHandler$2$a", "Landroid/os/Handler;", "Landroid/os/Message;", "msg", "", "handleMessage", "obus-sdk_release"}, k = 1, mv = {1, 7, 1})
        public static final class a extends Handler {
            public final /* synthetic */ AppLifeManager a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(AppLifeManager appLifeManager, Looper looper) {
                super(looper);
                this.a = appLifeManager;
            }

            @Override // android.os.Handler
            public void handleMessage(@NotNull Message msg) throws JSONException {
                Intrinsics.checkNotNullParameter(msg, "msg");
                Object obj = msg.obj;
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type java.lang.ref.WeakReference<android.app.Activity>");
                Activity activity = (Activity) ((WeakReference) obj).get();
                if (activity == null) {
                    TrackLogger.o("Handler", "Activity is null, message not handled: " + msg.what, new Object[0]);
                    return;
                }
                int i = msg.what;
                if (i == 1100) {
                    this.a.handleStartedMessage(activity);
                } else {
                    if (i != 1200) {
                        return;
                    }
                    this.a.handleStoppedMessage(activity);
                }
            }
        }

        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final a invoke() {
            HandlerThread handlerThread = new HandlerThread("START_END_EVENT_DATA_THREAD");
            handlerThread.start();
            return new a(this.this$0, handlerThread.getLooper());
        }
    });

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @NotNull
    public final Set<Integer> hashSet = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: com.oplus.drs.track.internal2.common.AppLifeManager$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0007\u001a\u00020\u00028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/oplus/drs/track/internal2/common/AppLifeManager$a;", "", "Lcom/oplus/drs/track/internal2/common/AppLifeManager;", "instance$delegate", "Lkotlin/Lazy;", "a", "()Lcom/oplus/drs/track/internal2/common/AppLifeManager;", "instance", "", "MESSAGE_CODE_START", "I", "MESSAGE_CODE_STOP", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "obus-sdk_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final AppLifeManager a() {
            return (AppLifeManager) AppLifeManager.t.getValue();
        }
    }

    private final void addActivity(Activity activity) {
        if (activity != null) {
            this.hashSet.add(Integer.valueOf(activity.hashCode()));
        }
    }

    private final void compensateMissedColdStartIfNeeded(Activity activity, String source) {
        if (this.hasReceivedOnActivityStarted || !this.isLifecycleRegistered) {
            return;
        }
        this.hasReceivedOnActivityStarted = true;
        this.coldStartCompensationPending = false;
        TrackLogger.h("AppLifeManager", "Compensating missed cold start in " + source + ": " + activity.getClass().getSimpleName(), new Object[0]);
        if (hasActivity(activity)) {
            return;
        }
        sendActivityHandleMessage(1100, activity);
        addActivity(activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ensureColdStartCompensation$lambda-1, reason: not valid java name */
    public static final boolean m5181ensureColdStartCompensation$lambda1(AppLifeManager this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!this$0.hasReceivedOnActivityStarted && this$0.isLifecycleRegistered) {
            this$0.coldStartCompensationPending = true;
            TrackLogger.o("AppLifeManager", "Cold start: missed first onActivityStarted, compensation pending", new Object[0]);
        }
        return false;
    }

    private final ur9 getMDbAdapter() {
        return (ur9) this.mDbAdapter.getValue();
    }

    private final Handler getMHandler() {
        return (Handler) this.mHandler.getValue();
    }

    private final void gotoBackGround() {
        lg3.INSTANCE.d();
        TrackLogger.c("AppLifeManager", "In background, upload all data", new Object[0]);
        for (mq9 mq9Var : this.listeners) {
            if (mq9Var != null) {
                mq9Var.a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleStartedMessage(Activity activity) throws JSONException {
        this.mStoreStartActivityCount = getMDbAdapter().getInt(this.keyActivityCount, 0);
        ur9 mDbAdapter = getMDbAdapter();
        String str = this.keyActivityCount;
        int i = this.mStoreStartActivityCount + 1;
        this.mStoreStartActivityCount = i;
        mDbAdapter.putInt(str, i);
        this.mMemoryStartActivityCount++;
        lg3.INSTANCE.e(this.mStoreStartActivityCount, activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleStoppedMessage(Activity activity) {
        lg3.INSTANCE.f(activity);
        int i = 0;
        int i2 = getMDbAdapter().getInt(this.keyActivityCount, 0);
        this.mStoreStartActivityCount = i2;
        if (i2 > 0) {
            i = i2 - 1;
            this.mStoreStartActivityCount = i;
        }
        this.mStoreStartActivityCount = i;
        this.mMemoryStartActivityCount--;
        getMDbAdapter().putInt(this.keyActivityCount, this.mStoreStartActivityCount);
        if (isAppInBackground()) {
            gotoBackGround();
        }
    }

    private final boolean hasActivity(Activity activity) {
        if (activity != null) {
            return this.hashSet.contains(Integer.valueOf(activity.hashCode()));
        }
        return false;
    }

    private final boolean isAppInBackground() {
        return this.mStoreStartActivityCount == 0;
    }

    private final void removeActivity(Activity activity) {
        if (activity != null) {
            this.hashSet.remove(Integer.valueOf(activity.hashCode()));
        }
    }

    private final void sendActivityHandleMessage(int type, Activity activity) {
        Message messageObtainMessage = getMHandler().obtainMessage();
        Intrinsics.checkNotNullExpressionValue(messageObtainMessage, "mHandler.obtainMessage()");
        WeakReference weakReference = new WeakReference(activity);
        messageObtainMessage.what = type;
        messageObtainMessage.obj = weakReference;
        getMHandler().sendMessage(messageObtainMessage);
    }

    private final void verifySession() {
        if (c90.h()) {
            getMDbAdapter().putInt(this.keyActivityCount, 0);
        }
        TrackLogger.m("AppLifeManager", "session=" + xvg.a(), new Object[0]);
    }

    public final void addListener(@NotNull mq9 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        if (this.listeners.contains(listener)) {
            return;
        }
        this.listeners.add(listener);
    }

    public final void ensureColdStartCompensation() {
        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
            Looper.myQueue().addIdleHandler(new MessageQueue.IdleHandler() { // from class: com.oplus.aiunit.vision.pb0
                @Override // android.os.MessageQueue.IdleHandler
                public final boolean queueIdle() {
                    return AppLifeManager.m5181ensureColdStartCompensation$lambda1(this.i);
                }
            });
        }
    }

    @NotNull
    public final String getKeyActivityCount() {
        return this.keyActivityCount;
    }

    public final void init(@NotNull Context context, @NotNull mq9 backGroundListener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(backGroundListener, "backGroundListener");
        synchronized (this) {
            if (this.isLifecycleRegistered) {
                return;
            }
            Context applicationContext = context.getApplicationContext();
            Application application = null;
            Application application2 = applicationContext instanceof Application ? (Application) applicationContext : null;
            if (application2 == null) {
                TrackLogger.e("AppLifeManager", "lifecycleManager init fail, application is null", new Object[0]);
                return;
            }
            TrackLogger.m("AppLifeManager", "init application lifecycleManager", new Object[0]);
            this.application = application2;
            verifySession();
            Application application3 = this.application;
            if (application3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("application");
            } else {
                application = application3;
            }
            application.registerActivityLifecycleCallbacks(this);
            this.isLifecycleRegistered = true;
            Unit unit = Unit.INSTANCE;
            addListener(backGroundListener);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(@NotNull Activity activity, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        compensateMissedColdStartIfNeeded(activity, "onPaused");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        compensateMissedColdStartIfNeeded(activity, "onResumed");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(@NotNull Activity activity, @NotNull Bundle outState) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.hasReceivedOnActivityStarted = true;
        if (hasActivity(activity)) {
            return;
        }
        sendActivityHandleMessage(1100, activity);
        addActivity(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (hasActivity(activity)) {
            sendActivityHandleMessage(1200, activity);
            removeActivity(activity);
        }
    }

    public final void removeListener(@NotNull mq9 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.listeners.remove(listener);
    }

    @Override // com.oplus.drs.track.utils.ExceptionHandler.a
    public void uncaughtException(@NotNull Thread t2, @NotNull Throwable e2) {
        Intrinsics.checkNotNullParameter(t2, "t");
        Intrinsics.checkNotNullParameter(e2, "e");
        getMDbAdapter().putInt(this.keyActivityCount, 0);
    }
}
