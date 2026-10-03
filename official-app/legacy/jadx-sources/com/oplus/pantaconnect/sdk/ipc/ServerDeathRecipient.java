package com.oplus.pantaconnect.sdk.ipc;

import android.os.IBinder;
import com.oplus.pantaconnect.sdk.logger.SdkLogger;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\f\u001a\u00020\u0006H\u0016J\u0006\u0010\r\u001a\u00020\u0006J\u000e\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\tJ\u0018\u0010\u0010\u001a\u00020\u00062\u0010\u0010\u000f\u001a\f\u0012\u0004\u0012\u00020\u00060\u0005j\u0002`\u0007J\u000e\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\tJ\u0018\u0010\u0012\u001a\u00020\u00062\u0010\u0010\u000f\u001a\f\u0012\u0004\u0012\u00020\u00060\u0005j\u0002`\u0007R\u001e\u0010\u0003\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00060\u0005j\u0002`\u00070\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/oplus/pantaconnect/sdk/ipc/ServerDeathRecipient;", "Landroid/os/IBinder$DeathRecipient;", "()V", "deathCallbackList", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lkotlin/Function0;", "", "Lcom/oplus/pantaconnect/sdk/ipc/DeathRecipientCallback;", "deathCallbacks", "Lcom/oplus/pantaconnect/sdk/ipc/DeathCallback;", "logger", "Lcom/oplus/pantaconnect/sdk/logger/SdkLogger;", "binderDied", "handleServiceDisconnected", "registerDeathCallback", "callback", "registerDeathRecipientCallback", "unRegisterDeathCallback", "unRegisterDeathRecipientCallback", "core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nServerDeathRecipient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ServerDeathRecipient.kt\ncom/oplus/pantaconnect/sdk/ipc/ServerDeathRecipient\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,95:1\n1855#2,2:96\n1855#2,2:98\n*S KotlinDebug\n*F\n+ 1 ServerDeathRecipient.kt\ncom/oplus/pantaconnect/sdk/ipc/ServerDeathRecipient\n*L\n42#1:96,2\n47#1:98,2\n*E\n"})
public final class ServerDeathRecipient implements IBinder.DeathRecipient {

    @NotNull
    public static final ServerDeathRecipient INSTANCE = new ServerDeathRecipient();

    @NotNull
    private static final SdkLogger logger = SdkLogger.Companion.getDefault$default(SdkLogger.INSTANCE, "ServerDeathRecipient", null, 2, null);

    @NotNull
    private static volatile CopyOnWriteArrayList<Function0<Unit>> deathCallbackList = new CopyOnWriteArrayList<>();

    @NotNull
    private static volatile CopyOnWriteArrayList<DeathCallback> deathCallbacks = new CopyOnWriteArrayList<>();

    private ServerDeathRecipient() {
    }

    @Override // android.os.IBinder.DeathRecipient
    public void binderDied() {
        logger.debug("on server binder died");
    }

    public final void handleServiceDisconnected() {
        logger.debug("handleServiceDisconnected, deathCallbackListL: " + deathCallbackList.size());
        Iterator<T> it = deathCallbackList.iterator();
        while (it.hasNext()) {
            ((Function0) it.next()).invoke();
        }
        logger.debug("handleServiceDisconnected, deathCallbacks size: " + deathCallbacks.size());
        Iterator<T> it2 = deathCallbacks.iterator();
        while (it2.hasNext()) {
            ((DeathCallback) it2.next()).onServiceDeath();
        }
    }

    public final void registerDeathCallback(@NotNull DeathCallback callback) {
        if (deathCallbacks.contains(callback)) {
            logger.error("already registerDeathRecipientCallback");
        } else {
            deathCallbacks.add(callback);
        }
    }

    public final void registerDeathRecipientCallback(@NotNull Function0<Unit> callback) {
        if (deathCallbackList.contains(callback)) {
            logger.error("already registerConnectionCloseCallback");
        } else {
            deathCallbackList.add(callback);
        }
    }

    public final void unRegisterDeathCallback(@NotNull DeathCallback callback) {
        if (deathCallbacks.contains(callback)) {
            deathCallbacks.remove(callback);
        } else {
            logger.error("unregister Death Callback, but not contains");
        }
    }

    public final void unRegisterDeathRecipientCallback(@NotNull Function0<Unit> callback) {
        if (deathCallbackList.contains(callback)) {
            deathCallbackList.remove(callback);
        } else {
            logger.error("unregister Death Callback, but not contains");
        }
    }
}
