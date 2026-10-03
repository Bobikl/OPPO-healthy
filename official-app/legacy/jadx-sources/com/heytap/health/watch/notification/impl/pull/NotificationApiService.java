package com.heytap.health.watch.notification.impl.pull;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.RemoteException;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.heytap.health.watch.notification.INotificationApiService;
import com.heytap.health.watch.notification.INotificationBooleanCallback;
import com.heytap.health.watch.notification.b;
import com.heytap.health.watch.notification.impl.keepalive.KeepAliveWorker;
import com.heytap.health.watch.notification.impl.pull.NotificationApiService;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.b78;
import com.oplus.aiunit.vision.gl4;
import com.oplus.aiunit.vision.lbd;
import com.oplus.aiunit.vision.o14;
import com.oplus.aiunit.vision.rpc;
import com.oplus.aiunit.vision.su8;
import com.oplus.aiunit.vision.twc;
import com.oplus.aiunit.vision.um;
import com.oplus.aiunit.vision.v9g;
import com.oplus.aiunit.vision.x0;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes19.dex */
@Route(path = "/ntf/notification_api")
public class NotificationApiService implements INotificationApiService {
    public static final String CONTENT = "content://";
    public static final String TAG = "NTF_NotificationApiService";

    public static /* synthetic */ void Q6(Throwable th) throws Throwable {
        a7b.b(TAG, "[initKeepAliveWorker] --> " + th.getMessage());
    }

    public static /* synthetic */ void db(Boolean bool) throws Throwable {
        if (!rpc.a()) {
            a7b.m(TAG, "[initPullInMainProcess] --> no network authority, loadDefaultData");
            return;
        }
        if (!um.c().x()) {
            a7b.m(TAG, "[initPullInMainProcess] --> not login,loadDefaultData");
        } else if (gl4.managerApi.getBoundDeviceInfos().isEmpty()) {
            a7b.m(TAG, "[initPullInMainProcess] --> no devices");
        } else {
            PullIntervalWorker.INSTANCE.a(720L);
        }
    }

    public static /* synthetic */ void eb(Throwable th) throws Throwable {
        a7b.b(TAG, "[initPullInMainProcess] --> " + th.getMessage());
    }

    public static /* synthetic */ void q6(Boolean bool) throws Throwable {
        if (!twc.a(b78.a())) {
            a7b.m(TAG, "[initKeepAliveWorker] --> not permission");
        } else if (gl4.managerApi.getBoundDeviceInfos().isEmpty()) {
            a7b.m(TAG, "[initKeepAliveWorker] --> no devices");
        } else {
            KeepAliveWorker.b();
        }
    }

    @Override // com.heytap.health.watch.notification.INotificationApiService
    public void J8() {
        x0.d().b("/ntf/CloudNotificationActivity").withFlags(335544320).navigation();
    }

    @Override // com.heytap.health.watch.notification.INotificationApiService
    @SuppressLint({"CheckResult"})
    public void M4() {
        lbd.h0(Boolean.TRUE).A((long) (Math.random() * 600.0d), TimeUnit.SECONDS).L0(su8.c()).n0(su8.c()).b(new o14() { // from class: com.oplus.aiunit.vision.fvc
            @Override // com.oplus.aiunit.vision.o14
            public final void accept(Object obj) throws Throwable {
                NotificationApiService.db((Boolean) obj);
            }
        }, new o14() { // from class: com.oplus.aiunit.vision.gvc
            @Override // com.oplus.aiunit.vision.o14
            public final void accept(Object obj) throws Throwable {
                NotificationApiService.eb((Throwable) obj);
            }
        });
    }

    @Override // com.heytap.health.watch.notification.INotificationApiService
    @SuppressLint({"CheckResult"})
    public void Z7() {
        lbd.h0(Boolean.TRUE).A((long) (Math.random() * 600.0d), TimeUnit.SECONDS).L0(su8.c()).n0(su8.c()).b(new o14() { // from class: com.oplus.aiunit.vision.hvc
            @Override // com.oplus.aiunit.vision.o14
            public final void accept(Object obj) throws Throwable {
                NotificationApiService.q6((Boolean) obj);
            }
        }, new o14() { // from class: com.oplus.aiunit.vision.ivc
            @Override // com.oplus.aiunit.vision.o14
            public final void accept(Object obj) throws Throwable {
                NotificationApiService.Q6((Throwable) obj);
            }
        });
    }

    @Override // com.heytap.health.watch.notification.INotificationApiService
    public void g2() {
        x0.d().b("/ntf/NotificationSyncActivity").withString("jump_action", "screen_on_push").navigation();
    }

    @Override // com.alibaba.android.arouter.facade.template.IProvider
    public void init(Context context) {
    }

    @Override // com.heytap.health.watch.notification.INotificationApiService
    public void la(boolean z) {
        v9g.x(INotificationApiService.SP_NAME).W(INotificationApiService.STOP_SELF, z);
    }

    @Override // com.heytap.health.watch.notification.INotificationApiService
    public void r6(final boolean z) {
        a7b.f(TAG, "setFromMainOOBE, " + z);
        b.INSTANCE.k("cloud_msg", z, true, new INotificationBooleanCallback.Stub() { // from class: com.heytap.health.watch.notification.impl.pull.NotificationApiService.1
            @Override // com.heytap.health.watch.notification.INotificationBooleanCallback
            public void onResult(boolean z2) throws RemoteException {
                a7b.f(NotificationApiService.TAG, "onResult: setCloudFromMainOOBE setSwitchStatus=" + z2);
                if (z2 && z) {
                    b.INSTANCE.b(true, 0, null);
                }
            }
        });
    }
}
