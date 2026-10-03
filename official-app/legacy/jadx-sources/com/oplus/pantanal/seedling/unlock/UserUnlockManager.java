package com.oplus.pantanal.seedling.unlock;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.oplus.pantanal.seedling.util.Logger;
import com.sensorsdata.analytics.android.sdk.aop.push.PushAutoTrackHelper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00142\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tJ\u0010\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\nH\u0002J\u000e\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R-\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t0\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/oplus/pantanal/seedling/unlock/UserUnlockManager;", "", "()V", "TAG", "", "hasInit", "Ljava/util/concurrent/atomic/AtomicBoolean;", "observers", "", "Lkotlin/Function1;", "", "", "getObservers", "()Ljava/util/List;", "observers$delegate", "Lkotlin/Lazy;", "userUnlockReceiver", "Landroid/content/BroadcastReceiver;", "init", "context", "Landroid/content/Context;", "onConditionChange", "notifyAllObserver", "isSupport", "release", "seedling-support_manualRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nUserUnlockManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserUnlockManager.kt\ncom/oplus/pantanal/seedling/unlock/UserUnlockManager\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,94:1\n1855#2,2:95\n*S KotlinDebug\n*F\n+ 1 UserUnlockManager.kt\ncom/oplus/pantanal/seedling/unlock/UserUnlockManager\n*L\n90#1:95,2\n*E\n"})
public final class UserUnlockManager {

    @NotNull
    private static final String TAG = "UserUnlockManager";

    @NotNull
    public static final UserUnlockManager INSTANCE = new UserUnlockManager();

    @NotNull
    private static AtomicBoolean hasInit = new AtomicBoolean(false);

    /* JADX INFO: renamed from: observers$delegate, reason: from kotlin metadata */
    @NotNull
    private static final Lazy observers = LazyKt__LazyJVMKt.lazy(new Function0<List<Function1<? super Boolean, ? extends Unit>>>() { // from class: com.oplus.pantanal.seedling.unlock.UserUnlockManager$observers$2
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final List<Function1<? super Boolean, ? extends Unit>> invoke() {
            return new ArrayList();
        }
    });

    @NotNull
    private static final BroadcastReceiver userUnlockReceiver = new BroadcastReceiver() { // from class: com.oplus.pantanal.seedling.unlock.UserUnlockManager$userUnlockReceiver$1
        @Override // android.content.BroadcastReceiver
        public void onReceive(@NotNull Context context, @NotNull Intent intent) {
            PushAutoTrackHelper.onBroadcastReceiver(this, context, intent);
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(intent, "intent");
            Logger.INSTANCE.i("UserUnlockManager", "onReceive observers count:" + UserUnlockManager.INSTANCE.getObservers().size() + ",action:" + intent.getAction());
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new UserUnlockManager$userUnlockReceiver$1$onReceive$1(context, null), 3, null);
        }
    };

    private UserUnlockManager() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<Function1<Boolean, Unit>> getObservers() {
        return (List) observers.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void notifyAllObserver(boolean isSupport) {
        Logger.INSTANCE.i(TAG, "notifyAllObserver,isSupport:" + isSupport);
        Iterator<T> it = getObservers().iterator();
        while (it.hasNext()) {
            ((Function1) it.next()).invoke(Boolean.valueOf(isSupport));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void init(@NotNull Context context, @NotNull Function1<? super Boolean, Unit> onConditionChange) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(onConditionChange, "onConditionChange");
        if (hasInit.compareAndSet(false, true)) {
            Logger.INSTANCE.i(TAG, "init");
            getObservers().add(onConditionChange);
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.USER_UNLOCKED");
            context.registerReceiver(userUnlockReceiver, intentFilter);
        }
    }

    public final void release(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Logger.INSTANCE.i(TAG, "release");
        if (hasInit.compareAndSet(true, false)) {
            context.unregisterReceiver(userUnlockReceiver);
            getObservers().clear();
        }
    }
}
