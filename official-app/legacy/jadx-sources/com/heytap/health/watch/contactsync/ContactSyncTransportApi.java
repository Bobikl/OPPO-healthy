package com.heytap.health.watch.contactsync;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.heytap.health.watch.contactsync.ContactSyncTransportApi;
import com.heytap.health.watch.contactsync.aidl.IContactSync;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.cm9;
import com.oplus.aiunit.vision.u64;
import com.oplus.health.apiprovider.ClientManager;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u001b\u0010\u000e\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0013"}, d2 = {"Lcom/heytap/health/watch/contactsync/ContactSyncTransportApi;", "Lcom/oplus/aiunit/vision/cm9;", "Lcom/heytap/health/watch/contactsync/aidl/IContactSync;", "f", "Landroid/content/Context;", "context", "", "c", "b", "Lcom/heytap/health/watch/contactsync/aidl/IContactSync$Stub;", "i", "Lkotlin/Lazy;", MapSchema.FIELD_NAME_ENTRY, "()Lcom/heytap/health/watch/contactsync/aidl/IContactSync$Stub;", "binder", "<init>", "()V", "Companion", "a", "contactsync_impl_release"}, k = 1, mv = {1, 8, 0})
public final class ContactSyncTransportApi implements cm9<IContactSync> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final Lazy binder = LazyKt__LazyJVMKt.lazy(new Function0<ContactSyncTransportApi$binder$2.AnonymousClass1>() { // from class: com.heytap.health.watch.contactsync.ContactSyncTransportApi$binder$2
        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Type inference failed for: r0v1, types: [com.heytap.health.watch.contactsync.ContactSyncTransportApi$binder$2$1] */
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final AnonymousClass1 invoke() {
            return new IContactSync.Stub() { // from class: com.heytap.health.watch.contactsync.ContactSyncTransportApi$binder$2.1
                @Override // com.heytap.health.watch.contactsync.aidl.IContactSync
                @Nullable
                public String getConnectedMacAddress() {
                    return a.INSTANCE.e();
                }

                @Override // com.heytap.health.watch.contactsync.aidl.IContactSync
                @Nullable
                public String getPreSyncDoneMacAddress() {
                    return a.INSTANCE.f();
                }

                @Override // com.heytap.health.watch.contactsync.aidl.IContactSync
                public void postSwitchTimeoutCallback(int model) {
                    a.INSTANCE.h(model);
                }

                @Override // com.heytap.health.watch.contactsync.aidl.IContactSync
                public void registerContentObserver() {
                    a.INSTANCE.i();
                }

                @Override // com.heytap.health.watch.contactsync.aidl.IContactSync
                public void removeSwitchTimeoutCallback() {
                    a.INSTANCE.j();
                }

                @Override // com.heytap.health.watch.contactsync.aidl.IContactSync
                public void setConnectedMacAddress(@Nullable String mac) {
                    a.INSTANCE.k(mac);
                }

                @Override // com.heytap.health.watch.contactsync.aidl.IContactSync
                public void setPreSyncDoneMacAddress(@Nullable String mac) {
                    a.INSTANCE.l(mac);
                }

                @Override // com.heytap.health.watch.contactsync.aidl.IContactSync
                public void unRegisterContentObserver(int handle) {
                    a.INSTANCE.m(handle);
                }
            };
        }
    });

    /* JADX INFO: renamed from: com.heytap.health.watch.contactsync.ContactSyncTransportApi$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\b\u001a\u00020\u0007J\u0010\u0010\n\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u0007J\u000f\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u0004\u0018\u00010\u00022\u0006\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u0006\u0010\u0010\u001a\u00020\u0007J\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\n\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002R\u0014\u0010\u0015\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/heytap/health/watch/contactsync/ContactSyncTransportApi$a;", "", "", b2n.f, "", "handle", MapSchema.FIELD_NAME_KEY, "", "d", "mac", "i", b2n.g, "()Lkotlin/Unit;", "model", "f", "(I)Lkotlin/Unit;", MapSchema.FIELD_NAME_ENTRY, "j", "(Ljava/lang/String;)Lkotlin/Unit;", "Lcom/heytap/health/watch/contactsync/aidl/IContactSync;", "b", "TAG", "Ljava/lang/String;", "<init>", "()V", "contactsync_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final IContactSync c(IBinder iBinder) {
            return IContactSync.Stub.asInterface(iBinder);
        }

        public final IContactSync b() {
            return (IContactSync) ClientManager.getInstance().getBuildService("api_provider_contact_sync_transport", new ClientManager.a() { // from class: com.oplus.aiunit.vision.z54
                @Override // com.oplus.health.apiprovider.ClientManager.a
                public final Object a(IBinder iBinder) {
                    return ContactSyncTransportApi.Companion.c(iBinder);
                }
            });
        }

        @NotNull
        public final String d() {
            try {
                IContactSync iContactSyncB = b();
                String connectedMacAddress = iContactSyncB != null ? iContactSyncB.getConnectedMacAddress() : null;
                return connectedMacAddress == null ? "" : connectedMacAddress;
            } catch (RemoteException e2) {
                u64.c("ContactSyncTransportApi", "getConnectedMacAddress exception: " + e2.getMessage(), new Object[0]);
                return "";
            }
        }

        @NotNull
        public final String e() {
            try {
                IContactSync iContactSyncB = b();
                String preSyncDoneMacAddress = iContactSyncB != null ? iContactSyncB.getPreSyncDoneMacAddress() : null;
                return preSyncDoneMacAddress == null ? "" : preSyncDoneMacAddress;
            } catch (RemoteException e2) {
                u64.c("ContactSyncTransportApi", "getPreSyncDoneMacAddress exception: " + e2.getMessage(), new Object[0]);
                return "";
            }
        }

        @Nullable
        public final Unit f(int model) {
            try {
                IContactSync iContactSyncB = b();
                if (iContactSyncB == null) {
                    return null;
                }
                iContactSyncB.postSwitchTimeoutCallback(model);
                return Unit.INSTANCE;
            } catch (RemoteException e2) {
                u64.c("ContactSyncTransportApi", "postSwitchTimeoutCallback exception: " + e2.getMessage(), new Object[0]);
                return Unit.INSTANCE;
            }
        }

        public final void g() {
            try {
                IContactSync iContactSyncB = b();
                if (iContactSyncB != null) {
                    iContactSyncB.registerContentObserver();
                }
            } catch (RemoteException e2) {
                u64.c("ContactSyncTransportApi", "registerContentObserver exception: " + e2.getMessage(), new Object[0]);
            }
        }

        @Nullable
        public final Unit h() {
            try {
                IContactSync iContactSyncB = b();
                if (iContactSyncB == null) {
                    return null;
                }
                iContactSyncB.removeSwitchTimeoutCallback();
                return Unit.INSTANCE;
            } catch (RemoteException e2) {
                u64.c("ContactSyncTransportApi", "removeSwitchTimeoutCallback exception: " + e2.getMessage(), new Object[0]);
                return Unit.INSTANCE;
            }
        }

        public final void i(@Nullable String mac) {
            try {
                IContactSync iContactSyncB = b();
                if (iContactSyncB == null) {
                    return;
                }
                iContactSyncB.setConnectedMacAddress(mac);
            } catch (RemoteException e2) {
                u64.c("ContactSyncTransportApi", "setConnectedMacAddress exception: " + e2.getMessage(), new Object[0]);
            }
        }

        @Nullable
        public final Unit j(@Nullable String mac) {
            try {
                IContactSync iContactSyncB = b();
                if (iContactSyncB == null) {
                    return null;
                }
                iContactSyncB.setPreSyncDoneMacAddress(mac);
                return Unit.INSTANCE;
            } catch (RemoteException e2) {
                u64.c("ContactSyncTransportApi", "setPreSyncDoneMacAddress exception: " + e2.getMessage(), new Object[0]);
                return Unit.INSTANCE;
            }
        }

        public final void k(int handle) {
            try {
                IContactSync iContactSyncB = b();
                if (iContactSyncB != null) {
                    iContactSyncB.unRegisterContentObserver(handle);
                }
            } catch (RemoteException e2) {
                u64.c("ContactSyncTransportApi", "unRegisterContentObserver exception: " + e2.getMessage(), new Object[0]);
            }
        }
    }

    @Override // com.oplus.aiunit.vision.cm9
    public void b(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.oplus.aiunit.vision.cm9
    public void c(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final IContactSync.Stub e() {
        return (IContactSync.Stub) this.binder.getValue();
    }

    @Override // com.oplus.aiunit.vision.cm9
    @NotNull
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public IContactSync d() {
        return e();
    }
}
