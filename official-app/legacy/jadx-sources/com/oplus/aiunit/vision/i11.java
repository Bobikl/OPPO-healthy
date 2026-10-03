package com.oplus.aiunit.vision;

import com.heytap.health.watch.watchface.proto.Proto$DeviceInfo;
import com.heytap.health.watch.watchface.proto.Proto$WatchFaceMessage;
import com.heytap.health.watchface.adaptation.base.BaseWatchFaceBean;
import com.heytap.health.watchface.adaptation.common.ConfigHolder;
import com.heytap.health.watchface.business.legacy.main.bean.WatchIdInfo;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes19.dex */
public abstract class i11 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Proto$DeviceInfo f12339c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final kvi f12340e;
    public volatile List<BaseWatchFaceBean> a = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f12341j = false;
    public final ConfigHolder b = new ConfigHolder(this);
    public final jfl d = new jfl();
    public final isf f = new isf(this);
    public final p21 g = b();
    public final s3 h = a();
    public final uo9 i = c();

    public i11(Proto$DeviceInfo proto$DeviceInfo) {
        this.f12339c = proto$DeviceInfo;
        this.f12340e = new kvi(this.f12339c);
    }

    public abstract void A(Proto$WatchFaceMessage proto$WatchFaceMessage);

    public void B(Proto$WatchFaceMessage proto$WatchFaceMessage) {
    }

    public void C(boolean z) {
        this.f12341j = z;
    }

    public void D(Proto$DeviceInfo proto$DeviceInfo) {
        this.f12339c = proto$DeviceInfo;
    }

    public abstract s3 a();

    public abstract p21 b();

    public abstract uo9 c();

    public void d(Proto$WatchFaceMessage proto$WatchFaceMessage) {
        int commandId = proto$WatchFaceMessage.getHeader().getCommandId();
        if (commandId == 3) {
            z(proto$WatchFaceMessage);
        }
        if (commandId == 4) {
            u(proto$WatchFaceMessage);
            return;
        }
        if (commandId == 5) {
            r(proto$WatchFaceMessage);
            return;
        }
        if (commandId == 8) {
            s(proto$WatchFaceMessage);
            return;
        }
        if (commandId == 24) {
            v(proto$WatchFaceMessage);
            return;
        }
        if (commandId == 28) {
            B(proto$WatchFaceMessage);
            return;
        }
        switch (commandId) {
            case 18:
                x(proto$WatchFaceMessage);
                break;
            case 19:
                y(proto$WatchFaceMessage);
                break;
            case 20:
                ltl.i("BaseDataManager", "[execute] --> CREATION_SYNC_STYLE_BACK_VALUE NOT IN USE");
                break;
            case 21:
                w(proto$WatchFaceMessage);
                break;
            case 22:
                t(proto$WatchFaceMessage);
                break;
            default:
                A(proto$WatchFaceMessage);
                break;
        }
    }

    public ConfigHolder e() {
        return this.b;
    }

    public s3 f() {
        return this.h;
    }

    public uo9 g() {
        return this.i;
    }

    public Proto$DeviceInfo h() {
        return this.f12339c;
    }

    public String i() {
        String deviceMac;
        Proto$DeviceInfo proto$DeviceInfo = this.f12339c;
        if (proto$DeviceInfo != null && (deviceMac = proto$DeviceInfo.getDeviceMac()) != null) {
            return deviceMac.toUpperCase();
        }
        ltl.b("BaseDataManager", "[getDeviceMac] --> deviceMac is null");
        return "";
    }

    public p21 j() {
        return this.g;
    }

    public synchronized List<BaseWatchFaceBean> k() {
        return this.a;
    }

    public isf l() {
        return this.f;
    }

    public kvi m() {
        return this.f12340e;
    }

    public jfl n() {
        return this.d;
    }

    public WatchIdInfo o() {
        return this.d.f();
    }

    public abstract boolean p();

    public boolean q() {
        return this.f12341j;
    }

    public abstract void r(Proto$WatchFaceMessage proto$WatchFaceMessage);

    public abstract void s(Proto$WatchFaceMessage proto$WatchFaceMessage);

    public abstract void t(Proto$WatchFaceMessage proto$WatchFaceMessage);

    public abstract void u(Proto$WatchFaceMessage proto$WatchFaceMessage);

    public abstract void v(Proto$WatchFaceMessage proto$WatchFaceMessage);

    public abstract void w(Proto$WatchFaceMessage proto$WatchFaceMessage);

    public abstract void x(Proto$WatchFaceMessage proto$WatchFaceMessage);

    public abstract void y(Proto$WatchFaceMessage proto$WatchFaceMessage);

    public abstract void z(Proto$WatchFaceMessage proto$WatchFaceMessage);
}
