package com.heytap.health.watch.notification;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.service.notification.StatusBarNotification;
import com.heytap.health.watch.notification.b;
import com.heytap.log.nx.obus.Constants;
import com.oplus.aiunit.vision.b24;
import com.oplus.aiunit.vision.ddd;
import com.oplus.aiunit.vision.m8b;
import com.oplus.aiunit.vision.wv8;
import com.oplus.health.apiprovider.ClientManager;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes19.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\rB\t\b\u0002¢\u0006\u0004\b3\u00104J&\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007J,\u0010\r\u001a\u00020\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007J\u0016\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u000eJ\u000e\u0010\u0010\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u000eJ\u0016\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0004J\u000e\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0014J \u0010\u001b\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\b\u001a\u0004\u0018\u00010\u001aJ\u0018\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010\b\u001a\u0004\u0018\u00010\u0007J\u0018\u0010 \u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010\b\u001a\u0004\u0018\u00010\u001fJ\u000e\u0010!\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u001fJ\u0010\u0010#\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\"H\u0003R\u0014\u0010$\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010&\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b&\u0010%R\u0014\u0010'\u001a\u00020\u00188\u0006X\u0086T¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010)\u001a\u00020\u00188\u0006X\u0086T¢\u0006\u0006\n\u0004\b)\u0010(R\u0014\u0010*\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b*\u0010%R\u0014\u0010+\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b+\u0010%R\u0014\u0010,\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b,\u0010%R\u0014\u0010-\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b-\u0010%R\u0014\u0010.\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b.\u0010%R\u0014\u0010/\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b/\u0010%R\u0014\u00100\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b0\u0010%R\u0014\u00101\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b1\u0010%R\u0014\u00102\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b2\u0010%¨\u00065"}, d2 = {"Lcom/heytap/health/watch/notification/b;", "", "", "packageName", "", Constants.EVENT_STATUS_FIELD, "needSync", "Lcom/heytap/health/watch/notification/INotificationBooleanCallback;", "callback", "", "k", "", "packageNames", "a", "Lcom/heytap/health/watch/notification/INotificationDataCallback;", "h", "e", "pushData", "skipUnzip", "i", "Landroid/service/notification/StatusBarNotification;", "notification", "j", "target", "", "mode", "Lcom/heytap/health/watch/notification/INotificationIntCallback;", "b", "Landroid/os/Bundle;", "bundle", "d", "Lcom/heytap/health/watch/notification/INotificationBundleCallback;", "c", "f", "Lcom/heytap/health/watch/notification/b$a;", "g", "NOTIFICATION_TRANSPORT_AIDL", "Ljava/lang/String;", "TAG", "CLOUD_FROM_OOBE", "I", "CLOUD_FROM_UI", "EVENT_KEY", "EVENT_KEY_DND", "KEY_IS_OPEN_DND", "KEY_DND_START_TIME", "KEY_DND_DURATION", "METHOD_KEY", "METHOD_GET_DISCONNECT_SNAP", "METHOD_GET_FLUID_SUPPORT_APPS", "KEY_FLUID_APP_LIST_JSON", "<init>", "()V", "device_notification2_release"}, k = 1, mv = {1, 8, 0})
public final class b {
    public static final int CLOUD_FROM_OOBE = 0;
    public static final int CLOUD_FROM_UI = 1;

    @NotNull
    public static final String EVENT_KEY = "notification_event_key";

    @NotNull
    public static final String EVENT_KEY_DND = "event_dnd";

    @NotNull
    public static final b INSTANCE = new b();

    @NotNull
    public static final String KEY_DND_DURATION = "key_dnd_duration";

    @NotNull
    public static final String KEY_DND_START_TIME = "key_dnd_start_time";

    @NotNull
    public static final String KEY_FLUID_APP_LIST_JSON = "key_fluid_app_list_json";

    @NotNull
    public static final String KEY_IS_OPEN_DND = "key_is_open_dnd";

    @NotNull
    public static final String METHOD_GET_DISCONNECT_SNAP = "key_get_disconnect_snap";

    @NotNull
    public static final String METHOD_GET_FLUID_SUPPORT_APPS = "key_get_fluid_support_apps";

    @NotNull
    public static final String METHOD_KEY = "key_method";

    @NotNull
    public static final String NOTIFICATION_TRANSPORT_AIDL = "notification_transport_aidl";

    @NotNull
    public static final String TAG = "NTF_TransportApis";

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¨\u0006\u0006"}, d2 = {"Lcom/heytap/health/watch/notification/b$a;", "", "Lcom/heytap/health/watch/notification/INotificationAidl;", "service", "", "a", "device_notification2_release"}, k = 1, mv = {1, 8, 0})
    public interface a {
        void a(@Nullable INotificationAidl service);
    }

    /* JADX INFO: renamed from: com.heytap.health.watch.notification.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u0006"}, d2 = {"com/heytap/health/watch/notification/b$b", "Lcom/heytap/health/watch/notification/b$a;", "Lcom/heytap/health/watch/notification/INotificationAidl;", "service", "", "a", "device_notification2_release"}, k = 1, mv = {1, 8, 0})
    public static final class C0006b implements a {
        public final /* synthetic */ List<String> a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ boolean c;
        public final /* synthetic */ INotificationBooleanCallback d;

        public C0006b(List<String> list, boolean z, boolean z2, INotificationBooleanCallback iNotificationBooleanCallback) {
            this.a = list;
            this.b = z;
            this.c = z2;
            this.d = iNotificationBooleanCallback;
        }

        @Override // com.heytap.health.watch.notification.b.a
        public void a(@Nullable INotificationAidl service) throws RemoteException {
            if (service != null) {
                try {
                    service.batchSetSwitchStatus(this.a, this.b, this.c, this.d);
                } catch (RemoteException e) {
                    m8b.b(b.TAG, "[batchSetSwitchStatus] --> " + e.getMessage());
                    this.d.onResult(false);
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u0006"}, d2 = {"com/heytap/health/watch/notification/b$c", "Lcom/heytap/health/watch/notification/b$a;", "Lcom/heytap/health/watch/notification/INotificationAidl;", "service", "", "a", "device_notification2_release"}, k = 1, mv = {1, 8, 0})
    public static final class c implements a {
        public final /* synthetic */ boolean a;
        public final /* synthetic */ int b;
        public final /* synthetic */ INotificationIntCallback c;

        public c(boolean z, int i, INotificationIntCallback iNotificationIntCallback) {
            this.a = z;
            this.b = i;
            this.c = iNotificationIntCallback;
        }

        @Override // com.heytap.health.watch.notification.b.a
        public void a(@Nullable INotificationAidl service) {
            if (service != null) {
                try {
                    service.changeCloudSwitch(this.a, this.b, this.c);
                } catch (RemoteException e) {
                    m8b.b(b.TAG, "[changeCloudSwitch] --> " + e.getMessage());
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u0006"}, d2 = {"com/heytap/health/watch/notification/b$d", "Lcom/heytap/health/watch/notification/b$a;", "Lcom/heytap/health/watch/notification/INotificationAidl;", "service", "", "a", "device_notification2_release"}, k = 1, mv = {1, 8, 0})
    public static final class d implements a {
        public final /* synthetic */ Bundle a;
        public final /* synthetic */ INotificationBundleCallback b;

        public d(Bundle bundle, INotificationBundleCallback iNotificationBundleCallback) {
            this.a = bundle;
            this.b = iNotificationBundleCallback;
        }

        @Override // com.heytap.health.watch.notification.b.a
        public void a(@Nullable INotificationAidl service) {
            if (service != null) {
                try {
                    service.commonGet(this.a, this.b);
                } catch (RemoteException e) {
                    m8b.b(b.TAG, "[commonGet] --> " + e.getMessage());
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u0006"}, d2 = {"com/heytap/health/watch/notification/b$e", "Lcom/heytap/health/watch/notification/b$a;", "Lcom/heytap/health/watch/notification/INotificationAidl;", "service", "", "a", "device_notification2_release"}, k = 1, mv = {1, 8, 0})
    public static final class e implements a {
        public final /* synthetic */ Bundle a;
        public final /* synthetic */ INotificationBooleanCallback b;

        public e(Bundle bundle, INotificationBooleanCallback iNotificationBooleanCallback) {
            this.a = bundle;
            this.b = iNotificationBooleanCallback;
        }

        @Override // com.heytap.health.watch.notification.b.a
        public void a(@Nullable INotificationAidl service) {
            if (service != null) {
                try {
                    service.commonSet(this.a, this.b);
                } catch (RemoteException e) {
                    m8b.b(b.TAG, "[commonSet] --> " + e.getMessage());
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u0006"}, d2 = {"com/heytap/health/watch/notification/b$f", "Lcom/heytap/health/watch/notification/b$a;", "Lcom/heytap/health/watch/notification/INotificationAidl;", "service", "", "a", "device_notification2_release"}, k = 1, mv = {1, 8, 0})
    public static final class f implements a {
        public final /* synthetic */ INotificationDataCallback a;

        public f(INotificationDataCallback iNotificationDataCallback) {
            this.a = iNotificationDataCallback;
        }

        @Override // com.heytap.health.watch.notification.b.a
        public void a(@Nullable INotificationAidl service) {
            if (service != null) {
                try {
                    service.getAllSwitches(this.a);
                } catch (RemoteException e) {
                    m8b.b(b.TAG, "[getAllSwitches] --> " + e.getMessage());
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", "b", "(Z)V"}, k = 3, mv = {1, 8, 0})
    public static final class g<T> implements b24 {
        public final /* synthetic */ a i;

        public g(a aVar) {
            this.i = aVar;
        }

        public static final INotificationAidl c(IBinder iBinder) {
            return INotificationAidl.Stub.asInterface(iBinder);
        }

        public /* bridge */ /* synthetic */ void accept(Object obj) {
            b(((Boolean) obj).booleanValue());
        }

        public final void b(boolean z) {
            this.i.a((INotificationAidl) ClientManager.getInstance().getBuildService(b.NOTIFICATION_TRANSPORT_AIDL, new ClientManager.a() { // from class: com.oplus.aiunit.vision.qzc
                public final Object a(IBinder iBinder) {
                    return b.g.c(iBinder);
                }
            }));
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 8, 0})
    public static final class h<T> implements b24 {
        public static final h<T> INSTANCE = new h<>();

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "it");
            m8b.m(b.TAG, "getService: " + th.getMessage());
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u0006"}, d2 = {"com/heytap/health/watch/notification/b$i", "Lcom/heytap/health/watch/notification/b$a;", "Lcom/heytap/health/watch/notification/INotificationAidl;", "service", "", "a", "device_notification2_release"}, k = 1, mv = {1, 8, 0})
    public static final class i implements a {
        public final /* synthetic */ String a;
        public final /* synthetic */ INotificationDataCallback b;

        public i(String str, INotificationDataCallback iNotificationDataCallback) {
            this.a = str;
            this.b = iNotificationDataCallback;
        }

        @Override // com.heytap.health.watch.notification.b.a
        public void a(@Nullable INotificationAidl service) {
            if (service != null) {
                try {
                    service.getSwitch(this.a, this.b);
                } catch (RemoteException e) {
                    m8b.b(b.TAG, "[getSwitch] --> " + e.getMessage());
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u0006"}, d2 = {"com/heytap/health/watch/notification/b$j", "Lcom/heytap/health/watch/notification/b$a;", "Lcom/heytap/health/watch/notification/INotificationAidl;", "service", "", "a", "device_notification2_release"}, k = 1, mv = {1, 8, 0})
    public static final class j implements a {
        public final /* synthetic */ String a;
        public final /* synthetic */ boolean b;

        public j(String str, boolean z) {
            this.a = str;
            this.b = z;
        }

        @Override // com.heytap.health.watch.notification.b.a
        public void a(@Nullable INotificationAidl service) {
            if (service != null) {
                try {
                    service.pushFakeNotification(this.a, this.b);
                } catch (RemoteException e) {
                    m8b.b(b.TAG, "[pushFakeNotification] --> " + e.getMessage());
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u0006"}, d2 = {"com/heytap/health/watch/notification/b$k", "Lcom/heytap/health/watch/notification/b$a;", "Lcom/heytap/health/watch/notification/INotificationAidl;", "service", "", "a", "device_notification2_release"}, k = 1, mv = {1, 8, 0})
    public static final class k implements a {
        public final /* synthetic */ StatusBarNotification a;

        public k(StatusBarNotification statusBarNotification) {
            this.a = statusBarNotification;
        }

        @Override // com.heytap.health.watch.notification.b.a
        public void a(@Nullable INotificationAidl service) {
            if (service != null) {
                try {
                    service.pushFakeNotification2(this.a);
                } catch (RemoteException e) {
                    m8b.b(b.TAG, "[pushNotification] --> " + e.getMessage());
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u0006"}, d2 = {"com/heytap/health/watch/notification/b$l", "Lcom/heytap/health/watch/notification/b$a;", "Lcom/heytap/health/watch/notification/INotificationAidl;", "service", "", "a", "device_notification2_release"}, k = 1, mv = {1, 8, 0})
    public static final class l implements a {
        public final /* synthetic */ String a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ boolean c;
        public final /* synthetic */ INotificationBooleanCallback d;

        public l(String str, boolean z, boolean z2, INotificationBooleanCallback iNotificationBooleanCallback) {
            this.a = str;
            this.b = z;
            this.c = z2;
            this.d = iNotificationBooleanCallback;
        }

        @Override // com.heytap.health.watch.notification.b.a
        public void a(@Nullable INotificationAidl service) {
            if (service != null) {
                try {
                    service.setSwitchStatus(this.a, this.b, this.c, this.d);
                } catch (RemoteException e) {
                    m8b.b(b.TAG, "[setSwitchStatus] --> " + e.getMessage());
                }
            }
        }
    }

    public final void a(@NotNull List<String> packageNames, boolean status, boolean needSync, @NotNull INotificationBooleanCallback callback) {
        Intrinsics.checkNotNullParameter(packageNames, "packageNames");
        Intrinsics.checkNotNullParameter(callback, "callback");
        g(new C0006b(packageNames, status, needSync, callback));
    }

    public final void b(boolean target, int mode, @Nullable INotificationIntCallback callback) {
        g(new c(target, mode, callback));
    }

    public final void c(@NotNull Bundle bundle, @Nullable INotificationBundleCallback callback) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        g(new d(bundle, callback));
    }

    public final void d(@NotNull Bundle bundle, @Nullable INotificationBooleanCallback callback) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        g(new e(bundle, callback));
    }

    public final void e(@NotNull INotificationDataCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        g(new f(callback));
    }

    public final void f(@NotNull INotificationBundleCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        Bundle bundle = new Bundle();
        bundle.putString(METHOD_KEY, METHOD_GET_FLUID_SUPPORT_APPS);
        c(bundle, callback);
    }

    @SuppressLint({"CheckResult"})
    public final void g(a callback) {
        ddd.h0(Boolean.TRUE).K0(wv8.c()).n0(wv8.c()).b(new g(callback), h.INSTANCE);
    }

    public final void h(@NotNull String packageName, @NotNull INotificationDataCallback callback) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(callback, "callback");
        g(new i(packageName, callback));
    }

    public final void i(@NotNull String pushData, boolean skipUnzip) {
        Intrinsics.checkNotNullParameter(pushData, "pushData");
        g(new j(pushData, skipUnzip));
    }

    public final void j(@NotNull StatusBarNotification notification) {
        Intrinsics.checkNotNullParameter(notification, "notification");
        g(new k(notification));
    }

    public final void k(@NotNull String packageName, boolean status, boolean needSync, @NotNull INotificationBooleanCallback callback) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(callback, "callback");
        g(new l(packageName, status, needSync, callback));
    }
}
