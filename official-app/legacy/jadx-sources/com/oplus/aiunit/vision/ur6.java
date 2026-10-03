package com.oplus.aiunit.vision;

import android.os.RemoteCallbackList;
import com.heytap.health.watch.contactsync.aidl.IContactSyncListener;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00142\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0007\u001a\u00020\u0004J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bJ\u0006\u0010\u000b\u001a\u00020\u0004J\u0006\u0010\f\u001a\u00020\u0004J\u000e\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\bR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010¨\u0006\u0015"}, d2 = {"Lcom/oplus/aiunit/vision/ur6;", "", "Lcom/heytap/health/watch/contactsync/aidl/IContactSyncListener;", "listener", "", "a", b2n.f, "d", "", "isSuccess", "c", "b", "f", "switchResult", MapSchema.FIELD_NAME_ENTRY, "Landroid/os/RemoteCallbackList;", "Landroid/os/RemoteCallbackList;", "callbackList", "<init>", "()V", "Companion", "contactsync_impl_release"}, k = 1, mv = {1, 8, 0})
public final class ur6 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final RemoteCallbackList<IContactSyncListener> callbackList = new RemoteCallbackList<>();

    public final void a(@NotNull IContactSyncListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.callbackList.register(listener);
    }

    public final void b() {
        try {
            int iBeginBroadcast = this.callbackList.beginBroadcast();
            for (int i = 0; i < iBeginBroadcast; i++) {
                ((IContactSyncListener) this.callbackList.getBroadcastItem(i)).onContactChange();
            }
            this.callbackList.finishBroadcast();
        } catch (Exception e2) {
            u64.c("EventDispatcher", "notifyContactChange:" + e2.getMessage(), new Object[0]);
        }
    }

    public final void c(boolean isSuccess) {
        try {
            int iBeginBroadcast = this.callbackList.beginBroadcast();
            for (int i = 0; i < iBeginBroadcast; i++) {
                ((IContactSyncListener) this.callbackList.getBroadcastItem(i)).onContactSyncDone(isSuccess);
            }
            this.callbackList.finishBroadcast();
        } catch (Exception e2) {
            u64.c("EventDispatcher", "notifyContactSyncDone:" + e2.getMessage(), new Object[0]);
        }
    }

    public final void d() {
        try {
            int iBeginBroadcast = this.callbackList.beginBroadcast();
            for (int i = 0; i < iBeginBroadcast; i++) {
                ((IContactSyncListener) this.callbackList.getBroadcastItem(i)).onSyncing();
            }
            this.callbackList.finishBroadcast();
        } catch (Exception e2) {
            u64.c("EventDispatcher", "notifyContactSyncing:" + e2.getMessage(), new Object[0]);
        }
    }

    public final void e(boolean switchResult) {
        try {
            int iBeginBroadcast = this.callbackList.beginBroadcast();
            for (int i = 0; i < iBeginBroadcast; i++) {
                ((IContactSyncListener) this.callbackList.getBroadcastItem(i)).onSwitchSyncModelChange(switchResult);
            }
            this.callbackList.finishBroadcast();
        } catch (Exception e2) {
            u64.c("EventDispatcher", "onSwitchSyncModelChange:" + e2.getMessage(), new Object[0]);
        }
    }

    public final void f() {
        try {
            int iBeginBroadcast = this.callbackList.beginBroadcast();
            for (int i = 0; i < iBeginBroadcast; i++) {
                ((IContactSyncListener) this.callbackList.getBroadcastItem(i)).onWatchSyncModel();
            }
            this.callbackList.finishBroadcast();
        } catch (Exception e2) {
            u64.c("EventDispatcher", "onWatchSyncModel:" + e2.getMessage(), new Object[0]);
        }
    }

    public final void g(@NotNull IContactSyncListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.callbackList.unregister(listener);
    }
}
