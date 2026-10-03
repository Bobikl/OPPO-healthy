package com.oplus.aiunit.vision;

import android.app.Activity;
import android.text.TextUtils;
import android.util.ArraySet;
import androidx.annotation.NonNull;
import com.heytap.health.device_app_store.impl.connect.msgs.request.AppListInfoMsg;
import com.heytap.health.device_app_store.install.AppStatusInfo;
import com.heytap.health.watch.watchapp.proto.WatchAppProto$AppInfo;
import com.heytap.health.watch.watchapp.proto.WatchAppProto$AppListInfo;
import com.oplus.wearable.linkservice.sdk.Node;
import java.util.Iterator;

/* JADX INFO: loaded from: classes16.dex */
public class kb0 {
    public boolean a = false;

    public class a implements ul4.b {
        public a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c(boolean z, boolean z2) {
            kb0.this.r(com.heytap.weather.module.a.WATCH_WEATHER_PKG, z);
            kb0.this.r("com.heytap.wearable.musiccontroller", z2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void e(Node node, x5h x5hVar) throws Throwable {
            kb0.this.g(node.getNodeId(), new vgd() { // from class: com.oplus.aiunit.vision.jb0
                @Override // com.oplus.aiunit.vision.vgd
                public final void a(boolean z, boolean z2) {
                    this.a.c(z, z2);
                }
            });
        }

        @Override // com.oplus.aiunit.vision.ul4.b
        public void d(@NonNull final Node node, @NonNull auc aucVar) {
            if (aucVar == auc.a.INSTANCE) {
                f5h.e(new o6h() { // from class: com.oplus.aiunit.vision.ib0
                    @Override // com.oplus.aiunit.vision.o6h
                    public final void a(x5h x5hVar) throws Throwable {
                        this.a.e(node, x5hVar);
                    }
                }).y(su8.c()).v();
            } else if (aucVar == auc.f.INSTANCE) {
                a7b.f("AppInstallStatusManager", "[onPeerDisconnected] --> force save watch3 weather installed");
                kb0.this.r(com.heytap.weather.module.a.WATCH_WEATHER_PKG, true);
            }
        }

        @Override // com.oplus.aiunit.vision.ul4.b
        public void getInterestingStatus(@NonNull ArraySet<auc> arraySet) {
            arraySet.add(auc.a.INSTANCE);
            arraySet.add(auc.f.INSTANCE);
        }
    }

    public class b implements ys9<WatchAppProto$AppListInfo> {
        public final /* synthetic */ vgd a;

        public b(vgd vgdVar) {
            this.a = vgdVar;
        }

        @Override // com.oplus.aiunit.vision.ys9
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(WatchAppProto$AppListInfo watchAppProto$AppListInfo) {
            s5l.a("AppInstallStatusManager", "checkWatchAppList() list count: " + watchAppProto$AppListInfo.getTotalCount());
            Iterator<WatchAppProto$AppInfo> it = watchAppProto$AppListInfo.getAppInfoList().iterator();
            boolean z = false;
            boolean z2 = false;
            while (it.hasNext()) {
                String pkgName = it.next().getPkgName();
                if (kb0.this.n(pkgName)) {
                    z = true;
                } else if (kb0.this.l(pkgName)) {
                    z2 = true;
                }
            }
            this.a.a(z, z2);
        }

        @Override // com.oplus.aiunit.vision.ys9
        public void onFail(int i) {
            s5l.a("AppInstallStatusManager", "checkWatchAppList() errorCode: " + i);
        }
    }

    public static class c {
        public static final kb0 a = new kb0();
    }

    public static kb0 h() {
        return c.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o(rt9 rt9Var, AppStatusInfo appStatusInfo) {
        String pkgName = appStatusInfo.getPkgName();
        int status = appStatusInfo.getStatus();
        s5l.d("AppInstallStatusManager", "device pkg changed, pkg: " + pkgName + "; status: " + status);
        if (l(pkgName) && k(status)) {
            rt9Var.a(appStatusInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void p(AppStatusInfo appStatusInfo) {
        String currentConnectId = gl4.managerApi.getCurrentConnectId();
        if (TextUtils.isEmpty(currentConnectId)) {
            s5l.a("AppInstallStatusManager", "saveAppInstallStatus() is disable because mac is empty");
            return;
        }
        if (qc0.a(currentConnectId).D2()) {
            s5l.d("AppInstallStatusManager", "pkgChange info: " + appStatusInfo.toString());
            int status = appStatusInfo.getStatus();
            if (k(status)) {
                r(appStatusInfo.getPkgName(), status == 1);
            } else {
                s5l.a("AppInstallStatusManager", "install status is not changed");
            }
        }
    }

    public void f(@NonNull Activity activity, @NonNull final rt9 rt9Var) {
        mc0.n().f(activity, new rt9() { // from class: com.oplus.aiunit.vision.hb0
            @Override // com.oplus.aiunit.vision.rt9
            public final void a(AppStatusInfo appStatusInfo) {
                this.a.o(rt9Var, appStatusInfo);
            }
        });
    }

    public void g(String str, vgd vgdVar) {
        s5l.d("AppInstallStatusManager", "checkWatchAppList()");
        if (qc0.a(str).D2()) {
            zd0.d().h(new AppListInfoMsg(new b(vgdVar)));
        } else {
            s5l.a("AppInstallStatusManager", "checkWatchAppList() watch does not support uninstall app");
        }
    }

    public void i() {
        if (this.a) {
            return;
        }
        mc0.n().A();
        this.a = true;
    }

    public void j() {
        mc0.n().g(1, new rt9() { // from class: com.oplus.aiunit.vision.gb0
            @Override // com.oplus.aiunit.vision.rt9
            public final void a(AppStatusInfo appStatusInfo) {
                this.a.p(appStatusInfo);
            }
        });
        mc0.n().A();
        gl4.devicePrimary.nodeApi.l(new a());
    }

    public boolean k(int i) {
        return i == 1 || i == 2;
    }

    public final boolean l(String str) {
        return "com.heytap.wearable.musiccontroller".equals(str);
    }

    public boolean m(String str) {
        return qc0.a(str).D2() && !c9l.b(str, true);
    }

    public final boolean n(String str) {
        return com.heytap.weather.module.a.WATCH_WEATHER_PKG.equals(str);
    }

    public void q(@NonNull Activity activity) {
        mc0.n().E(activity);
    }

    public final void r(String str, boolean z) {
        s5l.d("AppInstallStatusManager", "saveAppInstallStatus() pkgName: " + str + "; installed: " + z);
        if (!n(str) && !l(str)) {
            s5l.a("AppInstallStatusManager", "saveAppInstallStatus() do nothing because app pkg is not legal");
            return;
        }
        String currentConnectId = gl4.managerApi.getCurrentConnectId();
        if (TextUtils.isEmpty(currentConnectId)) {
            s5l.a("AppInstallStatusManager", "saveAppInstallStatus() is disable because mac is empty");
            return;
        }
        if (!n(str)) {
            if (l(str)) {
                c9l.c(currentConnectId, z);
            }
        } else {
            a7b.f("AppInstallStatusManager", "[saveAppInstallStatus] --> " + z);
            c9l.e(currentConnectId, z);
        }
    }
}
