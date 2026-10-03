package com.oplus.seedling.sdk.unlock;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.oplus.aiunit.vision.ht9;
import com.oplus.aiunit.vision.s8e;
import com.oplus.channel.server.IUserContext;
import com.oplus.pantanal.seedling.constants.TraceConstants;
import com.oplus.seedling.sdk.SeedlingSdk;
import com.pantanal.fundation.internal.thread.DispatchersUtil;
import com.sensorsdata.analytics.android.sdk.aop.push.PushAutoTrackHelper;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\u000e\u001a\u00020\t2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0002J\b\u0010\u0010\u001a\u00020\tH\u0002J$\u0010\u0011\u001a\u00020\t2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\b\b\u0002\u0010\u0013\u001a\u00020\bJ\u0010\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\bH\u0002J\u0006\u0010\u0016\u001a\u00020\tJ\u001a\u0010\u0017\u001a\u00020\t2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R \u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/oplus/seedling/sdk/unlock/UserUnlockManager;", "", "()V", "TAG", "", "callbackList", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lkotlin/Function1;", "", "", "hasInit", "Ljava/util/concurrent/atomic/AtomicBoolean;", "userUnlockReceiver", "Landroid/content/BroadcastReceiver;", "addCallback", "callback", "clearCallbacks", "init", "onConditionChange", "isUserLock", "notifyAllObserver", "isSupport", "release", "removeCallBack", "pantanal-client_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nUserUnlockManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserUnlockManager.kt\ncom/oplus/seedling/sdk/unlock/UserUnlockManager\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,167:1\n1855#2,2:168\n*S KotlinDebug\n*F\n+ 1 UserUnlockManager.kt\ncom/oplus/seedling/sdk/unlock/UserUnlockManager\n*L\n159#1:168,2\n*E\n"})
public final class UserUnlockManager {

    @NotNull
    private static final String TAG = "UserUnlockManager";

    @NotNull
    public static final UserUnlockManager INSTANCE = new UserUnlockManager();

    @NotNull
    private static AtomicBoolean hasInit = new AtomicBoolean(false);

    @NotNull
    private static final CopyOnWriteArrayList<Function1<Boolean, Unit>> callbackList = new CopyOnWriteArrayList<>();

    @NotNull
    private static final BroadcastReceiver userUnlockReceiver = new BroadcastReceiver() { // from class: com.oplus.seedling.sdk.unlock.UserUnlockManager$userUnlockReceiver$1
        @Override // android.content.BroadcastReceiver
        public void onReceive(@NotNull Context context, @NotNull Intent intent) {
            PushAutoTrackHelper.onBroadcastReceiver(this, context, intent);
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(intent, TraceConstants.KEY_ACTION);
            ht9.a.c(s8e.INSTANCE, "UserUnlockManager", "onReceive observers count:" + UserUnlockManager.callbackList.size() + ",action:" + intent.getAction(), false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
            BuildersKt.launch$default(CoroutineScopeKt.CoroutineScope(DispatchersUtil.q()), (CoroutineContext) null, (CoroutineStart) null, new UserUnlockManager$userUnlockReceiver$1$onReceive$1(context, null), 3, (Object) null);
        }
    };

    private UserUnlockManager() {
    }

    private final void addCallback(Function1<? super Boolean, Unit> callback) {
        CopyOnWriteArrayList<Function1<Boolean, Unit>> copyOnWriteArrayList = callbackList;
        if (!copyOnWriteArrayList.contains(callback)) {
            copyOnWriteArrayList.add(callback);
        }
        ht9.a.c(s8e.INSTANCE, TAG, "addCallback current size:" + copyOnWriteArrayList.size(), false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
    }

    private final void clearCallbacks() {
        CopyOnWriteArrayList<Function1<Boolean, Unit>> copyOnWriteArrayList = callbackList;
        if (!copyOnWriteArrayList.isEmpty()) {
            copyOnWriteArrayList.clear();
        }
        ht9.a.c(s8e.INSTANCE, TAG, "clearCallbacks cache callbackList size :" + copyOnWriteArrayList.size(), false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
    }

    public static /* synthetic */ void init$default(UserUnlockManager userUnlockManager, Function1 function1, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        userUnlockManager.init(function1, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void notifyAllObserver(boolean isSupport) {
        Object obj;
        ht9.a.c(s8e.INSTANCE, TAG, "notifyAllObserver finally to entrancePkgName isSupport:" + isSupport, false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
        Iterator<T> it = callbackList.iterator();
        while (it.hasNext()) {
            Function1 function1 = (Function1) it.next();
            try {
                Result.Companion companion = Result.Companion;
                function1.invoke(Boolean.valueOf(isSupport));
                obj = Result.constructor-impl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                obj = Result.constructor-impl(ResultKt.createFailure(th));
            }
            if (Result.exceptionOrNull-impl(obj) != null) {
                ht9.a.c(s8e.INSTANCE, TAG, "notifyAllObserver finally to entrancePkgName isSupport:" + isSupport, false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
            }
        }
    }

    public final void init(@NotNull Function1<? super Boolean, Unit> onConditionChange, boolean isUserLock) {
        Object obj;
        Unit unitRegisterReceiver;
        Intrinsics.checkNotNullParameter(onConditionChange, "onConditionChange");
        if (isUserLock) {
            addCallback(onConditionChange);
        }
        if (!hasInit.compareAndSet(false, true)) {
            ht9.a.c(s8e.INSTANCE, TAG, "interface init has already init, just ignore", false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
            return;
        }
        try {
            Result.Companion companion = Result.Companion;
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.USER_UNLOCKED");
            SeedlingSdk seedlingSdk = SeedlingSdk.INSTANCE;
            if (seedlingSdk.getCurUserContext$pantanal_client_release() != null) {
                ht9.a.c(s8e.INSTANCE, TAG, "interface init, registerReceiver with userContext", false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
                IUserContext curUserContext$pantanal_client_release = seedlingSdk.getCurUserContext$pantanal_client_release();
                if (curUserContext$pantanal_client_release != null) {
                    curUserContext$pantanal_client_release.registerReceiver(userUnlockReceiver, intentFilter);
                    unitRegisterReceiver = Unit.INSTANCE;
                } else {
                    unitRegisterReceiver = null;
                }
            } else {
                ht9.a.c(s8e.INSTANCE, TAG, "interface init, registerReceiver with normal context", false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
                unitRegisterReceiver = seedlingSdk.getSAppContext$pantanal_client_release().registerReceiver(userUnlockReceiver, intentFilter);
            }
            obj = Result.constructor-impl(unitRegisterReceiver);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        if (Result.exceptionOrNull-impl(obj) != null) {
            hasInit.set(false);
            ht9.a.c(s8e.INSTANCE, TAG, "interface init error", false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
        }
    }

    public final void release() {
        Object obj;
        Unit unit;
        clearCallbacks();
        if (!hasInit.compareAndSet(true, false)) {
            ht9.a.c(s8e.INSTANCE, TAG, "interface release has not init, just ignore", false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
            return;
        }
        try {
            Result.Companion companion = Result.Companion;
            SeedlingSdk seedlingSdk = SeedlingSdk.INSTANCE;
            if (seedlingSdk.getCurUserContext$pantanal_client_release() != null) {
                ht9.a.c(s8e.INSTANCE, TAG, "interface release, unregisterReceiver with userContext", false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
                IUserContext curUserContext$pantanal_client_release = seedlingSdk.getCurUserContext$pantanal_client_release();
                if (curUserContext$pantanal_client_release != null) {
                    curUserContext$pantanal_client_release.unregisterReceiver(userUnlockReceiver);
                    unit = Unit.INSTANCE;
                } else {
                    unit = null;
                }
            } else {
                ht9.a.c(s8e.INSTANCE, TAG, "interface release, unregisterReceiver with normal context", false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
                seedlingSdk.getSAppContext$pantanal_client_release().unregisterReceiver(userUnlockReceiver);
                unit = Unit.INSTANCE;
            }
            obj = Result.constructor-impl(unit);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Throwable th2 = Result.exceptionOrNull-impl(obj);
        if (th2 != null) {
            hasInit.set(true);
            ht9.a.b(s8e.INSTANCE, TAG, "interface release error,msg = " + th2.getMessage(), false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
        }
    }

    public final void removeCallBack(@NotNull Function1<? super Boolean, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        CopyOnWriteArrayList<Function1<Boolean, Unit>> copyOnWriteArrayList = callbackList;
        if (!copyOnWriteArrayList.contains(callback)) {
            ht9.a.c(s8e.INSTANCE, TAG, "removeCallBack result:no cache", false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
            return;
        }
        boolean zRemove = copyOnWriteArrayList.remove(callback);
        ht9.a.c(s8e.INSTANCE, TAG, "removeCallBack result:" + zRemove, false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
    }
}
