package com.oplus.utrace.utils;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.SystemClock;
import android.os.UserHandle;
import android.os.UserManager;
import com.oplus.wrapper.content.pm.UserInfo;
import com.sensorsdata.analytics.android.sdk.aop.push.PushAutoTrackHelper;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Result;
import p010kotlin.ResultKt;
import p010kotlin.Unit;
import p010kotlin.collections.CollectionsKt___CollectionsKt;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u001dB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0007\u001a\u00020\bJ\u0006\u0010\u0016\u001a\u00020\u0017J\b\u0010\u0018\u001a\u00020\u0015H\u0002J\u000e\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u000bJ\u0006\u0010\u001b\u001a\u00020\u0015J\u000e\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/oplus/utrace/utils/UserUnlockManager;", "", "()V", "TAG", "", "UNLOCK_CACHE_MAX_TIME", "", "context", "Landroid/content/Context;", "mObservers", "", "Lcom/oplus/utrace/utils/UserUnlockManager$UserUnlockListener;", "unlockCacheTime", "Ljava/lang/Long;", "userUnlockReceiver", "Landroid/content/BroadcastReceiver;", "compatGetUserHandle", "Landroid/os/UserHandle;", "userManager", "Landroid/os/UserManager;", "init", "", "isUnlocked", "", "notifyAllObserver", "registerListener", "ob", "release", "unregisterListener", "UserUnlockListener", "utrace-lib_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SuppressLint({"StaticFieldLeak"})
@SourceDebugExtension({"SMAP\nUserUnlockManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserUnlockManager.kt\ncom/oplus/utrace/utils/UserUnlockManager\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,119:1\n1855#2,2:120\n1#3:122\n*S KotlinDebug\n*F\n+ 1 UserUnlockManager.kt\ncom/oplus/utrace/utils/UserUnlockManager\n*L\n54#1:120,2\n*E\n"})
public final class UserUnlockManager {

    @NotNull
    private static final String TAG = "UTrace.Lib.UserUnlock";
    private static final long UNLOCK_CACHE_MAX_TIME = 5000;

    @Nullable
    private static Context context;

    @Nullable
    private static Long unlockCacheTime;

    @NotNull
    public static final UserUnlockManager INSTANCE = new UserUnlockManager();

    @NotNull
    private static final Set<UserUnlockListener> mObservers = new LinkedHashSet();

    @NotNull
    private static final BroadcastReceiver userUnlockReceiver = new BroadcastReceiver() { // from class: com.oplus.utrace.utils.UserUnlockManager$userUnlockReceiver$1
        @Override // android.content.BroadcastReceiver
        public void onReceive(@NotNull Context context2, @NotNull Intent intent) {
            PushAutoTrackHelper.onBroadcastReceiver(this, context2, intent);
            Intrinsics.checkNotNullParameter(context2, "context");
            Intrinsics.checkNotNullParameter(intent, "intent");
            Logs.INSTANCE.i("UTrace.Lib.UserUnlock", "Broadcast received " + intent.getAction() + ", user unlock! observers count:" + UserUnlockManager.mObservers.size());
            UserUnlockManager.INSTANCE.notifyAllObserver();
        }
    };

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/oplus/utrace/utils/UserUnlockManager$UserUnlockListener;", "", "onUserUnlock", "", "utrace-lib_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface UserUnlockListener {
        void onUserUnlock();
    }

    private UserUnlockManager() {
    }

    private final UserHandle compatGetUserHandle(UserManager userManager) {
        Object objM5287constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            UserInfo userInfo = new com.oplus.wrapper.os.UserManager(userManager).getUserInfo(com.oplus.wrapper.os.UserHandle.myUserId());
            objM5287constructorimpl = Result.m5287constructorimpl(userInfo != null ? userInfo.getUserHandle() : null);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5287constructorimpl = Result.m5287constructorimpl(ResultKt.createFailure(th));
        }
        Result.m5290exceptionOrNullimpl(objM5287constructorimpl);
        return (UserHandle) (Result.m5293isFailureimpl(objM5287constructorimpl) ? null : objM5287constructorimpl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void notifyAllObserver() {
        Iterator it = CollectionsKt___CollectionsKt.toList(mObservers).iterator();
        while (it.hasNext()) {
            ((UserUnlockListener) it.next()).onUserUnlock();
        }
    }

    public final void init(@NotNull Context context2) {
        Object objM5287constructorimpl;
        Intrinsics.checkNotNullParameter(context2, "context");
        context = context2;
        if (isUnlocked()) {
            return;
        }
        Logs.INSTANCE.i(TAG, "Start init, register receiver, context=" + context2 + " pkg=" + context2.getPackageName());
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.USER_UNLOCKED");
        try {
            Result.Companion companion = Result.INSTANCE;
            objM5287constructorimpl = Result.m5287constructorimpl(context2.registerReceiver(userUnlockReceiver, intentFilter));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5287constructorimpl = Result.m5287constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM5290exceptionOrNullimpl = Result.m5290exceptionOrNullimpl(objM5287constructorimpl);
        if (thM5290exceptionOrNullimpl != null) {
            Logs.INSTANCE.e(TAG, "init error, exception: " + thM5290exceptionOrNullimpl);
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001d  */
    public final boolean isUnlocked() {
        boolean z;
        Object objM5287constructorimpl;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Long l2 = unlockCacheTime;
        if (l2 == null) {
            z = false;
        } else {
            if (jElapsedRealtime - l2.longValue() < 5000) {
                z = true;
            } else {
                z = false;
            }
        }
        if (z) {
            return true;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            Context context2 = context;
            Object systemService = context2 != null ? context2.getSystemService("user") : null;
            UserManager userManager = systemService instanceof UserManager ? (UserManager) systemService : null;
            objM5287constructorimpl = Result.m5287constructorimpl(userManager != null ? Boolean.valueOf(userManager.isUserUnlocked()) : null);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5287constructorimpl = Result.m5287constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m5293isFailureimpl(objM5287constructorimpl)) {
            objM5287constructorimpl = null;
        }
        Boolean bool = (Boolean) objM5287constructorimpl;
        Logs logs = Logs.INSTANCE;
        StringBuilder sb = new StringBuilder();
        sb.append("isUnlocked() result=");
        sb.append(bool);
        sb.append(" pkg=");
        Context context3 = context;
        sb.append(context3 != null ? context3.getPackageName() : null);
        sb.append(" currentTime=");
        sb.append(jElapsedRealtime);
        logs.i(TAG, sb.toString());
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        unlockCacheTime = zBooleanValue ? Long.valueOf(jElapsedRealtime) : null;
        return zBooleanValue;
    }

    public final void registerListener(@NotNull UserUnlockListener ob) {
        Intrinsics.checkNotNullParameter(ob, "ob");
        mObservers.add(ob);
    }

    public final void release() {
        Object objM5287constructorimpl;
        Unit unit;
        Logs.INSTANCE.i(TAG, "Start release, unregister receiver");
        try {
            Result.Companion companion = Result.INSTANCE;
            mObservers.clear();
            Context context2 = context;
            if (context2 != null) {
                context2.unregisterReceiver(userUnlockReceiver);
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            objM5287constructorimpl = Result.m5287constructorimpl(unit);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5287constructorimpl = Result.m5287constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM5290exceptionOrNullimpl = Result.m5290exceptionOrNullimpl(objM5287constructorimpl);
        if (thM5290exceptionOrNullimpl != null) {
            Logs.INSTANCE.i(TAG, "release error, exception: " + thM5290exceptionOrNullimpl);
        }
    }

    public final void unregisterListener(@NotNull UserUnlockListener ob) {
        Intrinsics.checkNotNullParameter(ob, "ob");
        mObservers.remove(ob);
    }
}
