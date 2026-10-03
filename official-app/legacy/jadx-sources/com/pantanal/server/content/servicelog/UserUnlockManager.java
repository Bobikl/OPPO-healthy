package com.pantanal.server.content.servicelog;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.oplus.aiunit.vision.f7b;
import com.sensorsdata.analytics.android.sdk.aop.push.PushAutoTrackHelper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0006\u0010\u0003\u001a\u00020\u0002R!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/pantanal/server/content/servicelog/UserUnlockManager;", "", "", "c", "", "Lcom/pantanal/server/content/servicelog/UserUnlockManager$a;", "a", "Lkotlin/Lazy;", "b", "()Ljava/util/List;", "mObservers", "Landroid/content/BroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "userUnlockReceiver", "<init>", "()V", "staticmanagersdk_release"}, k = 1, mv = {1, 5, 1})
public final class UserUnlockManager {

    @NotNull
    public static final UserUnlockManager INSTANCE = new UserUnlockManager();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final Lazy mObservers = LazyKt__LazyJVMKt.lazy(new Function0<List<a>>() { // from class: com.pantanal.server.content.servicelog.UserUnlockManager$mObservers$2
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final List<UserUnlockManager.a> invoke() {
            return new ArrayList();
        }
    });

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final BroadcastReceiver userUnlockReceiver = new BroadcastReceiver() { // from class: com.pantanal.server.content.servicelog.UserUnlockManager$userUnlockReceiver$1
        @Override // android.content.BroadcastReceiver
        public void onReceive(@NotNull Context context, @NotNull Intent intent) {
            PushAutoTrackHelper.onBroadcastReceiver(this, context, intent);
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(intent, "intent");
            UserUnlockManager userUnlockManager = UserUnlockManager.INSTANCE;
            f7b.h("UserUnlockManager", Intrinsics.stringPlus("user unlock! observers count:", Integer.valueOf(userUnlockManager.b().size())));
            f7b.d("UserUnlockManager", "Broadcast received " + ((Object) intent.getAction()) + '.');
            userUnlockManager.c();
        }
    };

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0004"}, d2 = {"Lcom/pantanal/server/content/servicelog/UserUnlockManager$a;", "", "", "onUserUnlock", "staticmanagersdk_release"}, k = 1, mv = {1, 5, 1})
    public interface a {
        void onUserUnlock();
    }

    public final List<a> b() {
        return (List) mObservers.getValue();
    }

    public final void c() {
        Iterator<T> it = b().iterator();
        while (it.hasNext()) {
            ((a) it.next()).onUserUnlock();
        }
    }
}
