package com.oplus.aiunit.vision;

import android.text.TextUtils;
import android.util.ArraySet;
import com.heytap.health.devicemanager.client.call.DMCallException;
import com.heytap.health.settings.watch.schoolmode.SchoolModeSpHelper;
import com.heytap.health.settings.watch.schoolmode.bean.AppItemBean;
import com.heytap.health.settings.watch.schoolmode.bean.SchoolModeConfig;
import com.heytap.health.settings.watch.schoolmode.proto.SchoolModeProto$SchoolModeAllowedAppList;
import com.heytap.health.settings.watch.schoolmode.proto.SchoolModeProto$SchoolModeAppInfo;
import com.heytap.health.settings.watch.schoolmode.proto.SchoolModeProto$SchoolModeAutoAirplaneMode;
import com.heytap.health.settings.watch.schoolmode.proto.SchoolModeProto$SchoolModeLowBatteryAppClose;
import com.heytap.health.settings.watch.schoolmode.proto.SchoolModeProto$SchoolModeSet;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public class nhg {
    public String a;
    public boolean b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile int f14517c;
    public SchoolModeConfig d;
    public volatile int g;
    public List<AppItemBean> h;
    public volatile int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ct7 f14520l;
    public volatile int o;
    public lc1 p;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Set<lhg> f14518e = new ArraySet();
    public Queue<fqf<SchoolModeConfig>> f = new LinkedList();
    public Set<lhg> i = new ArraySet();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Queue<fqf<List>> f14519j = new LinkedList();
    public Set<lhg> m = new ArraySet();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Queue<fqf<Boolean>> f14521n = new LinkedList();
    public Set<lhg> q = new ArraySet();
    public Queue<fqf<Boolean>> r = new LinkedList();
    public sl4 s = new a();
    public sl4 t = new b();
    public sl4 u = new c();
    public sl4 v = new d();

    public class a implements sl4 {
        public a() {
        }

        @Override // com.oplus.aiunit.vision.sl4
        public void a(@NotNull String str, @NotNull MessageEvent messageEvent) {
            int i;
            if (messageEvent.getServiceId() == 37 && messageEvent.getCommandId() == 1 && TextUtils.equals(str, nhg.this.a)) {
                if (nhg.this.b || nhg.this.f14517c != 0) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("SchoolModeConfig receive, sid:");
                    sb.append(messageEvent.getServiceId());
                    sb.append(",cid:");
                    sb.append(messageEvent.getCommandId());
                    sb.append(",mac:");
                    sb.append(str);
                    try {
                        SchoolModeProto$SchoolModeSet from = SchoolModeProto$SchoolModeSet.parseFrom(messageEvent.getData());
                        nhg nhgVar = nhg.this;
                        nhgVar.d = nhgVar.d != null ? nhg.this.d : new SchoolModeConfig(from);
                        i = 0;
                    } catch (Exception e2) {
                        a7b.m("school.MessageHandle", "parse SchoolModeConfig:" + e2.getMessage());
                        i = 3;
                    }
                    huf hufVar = new huf();
                    hufVar.e(i);
                    hufVar.g(str);
                    hufVar.h(nhg.this.f14517c);
                    hufVar.f(nhg.this.d);
                    synchronized (nhg.this.f14518e) {
                        Iterator it = nhg.this.f14518e.iterator();
                        while (it.hasNext()) {
                            ((lhg) it.next()).a(hufVar);
                        }
                    }
                    nhg.this.d = null;
                    nhg.this.f14517c = 0;
                    nhg.this.J();
                }
            }
        }

        @Override // com.oplus.aiunit.vision.sl4
        public void b(@NotNull DMCallException dMCallException) {
            if (nhg.this.b || nhg.this.f14517c != 0) {
                a7b.m("school.MessageHandle", "SchoolModeConfig receive error");
                huf hufVar = new huf();
                hufVar.e(2);
                hufVar.g(nhg.this.a);
                hufVar.h(nhg.this.f14517c);
                hufVar.f(nhg.this.d);
                synchronized (nhg.this.f14518e) {
                    Iterator it = nhg.this.f14518e.iterator();
                    while (it.hasNext()) {
                        ((lhg) it.next()).a(hufVar);
                    }
                }
                nhg.this.d = null;
                nhg.this.f14517c = 0;
                nhg.this.J();
            }
        }
    }

    public class b implements sl4 {
        public b() {
        }

        @Override // com.oplus.aiunit.vision.sl4
        public void a(@NotNull String str, @NotNull MessageEvent messageEvent) {
            int i;
            if (messageEvent.getServiceId() == 37 && messageEvent.getCommandId() == 2 && TextUtils.equals(str, nhg.this.a)) {
                if (nhg.this.b || nhg.this.g != 0) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("AppManagerList receive, sid:");
                    sb.append(messageEvent.getServiceId());
                    sb.append(",cid:");
                    sb.append(messageEvent.getCommandId());
                    sb.append(",mac:");
                    sb.append(str);
                    long time = 0;
                    try {
                        SchoolModeProto$SchoolModeAllowedAppList from = SchoolModeProto$SchoolModeAllowedAppList.parseFrom(messageEvent.getData());
                        time = from.getTime();
                        nhg nhgVar = nhg.this;
                        nhgVar.h = nhgVar.h != null ? nhg.this.h : nhg.this.b0(from);
                        i = 0;
                    } catch (Exception e2) {
                        a7b.m("school.MessageHandle", "parse AppManagerList:" + e2.getMessage());
                        i = 3;
                    }
                    huf hufVar = new huf();
                    hufVar.e(i);
                    hufVar.g(str);
                    hufVar.h(nhg.this.g);
                    hufVar.i(time);
                    hufVar.f(nhg.this.h);
                    synchronized (nhg.this.i) {
                        Iterator it = nhg.this.i.iterator();
                        while (it.hasNext()) {
                            ((lhg) it.next()).a(hufVar);
                        }
                    }
                    nhg.this.h = null;
                    nhg.this.g = 0;
                    nhg.this.G();
                }
            }
        }

        @Override // com.oplus.aiunit.vision.sl4
        public void b(@NotNull DMCallException dMCallException) {
            if (nhg.this.b || nhg.this.g != 0) {
                a7b.m("school.MessageHandle", "AppManagerList receive error");
                huf hufVar = new huf();
                hufVar.e(2);
                hufVar.g(nhg.this.a);
                hufVar.h(nhg.this.g);
                synchronized (nhg.this.i) {
                    Iterator it = nhg.this.i.iterator();
                    while (it.hasNext()) {
                        ((lhg) it.next()).a(hufVar);
                    }
                }
                nhg.this.h = null;
                nhg.this.g = 0;
                nhg.this.G();
            }
        }
    }

    public class c implements sl4 {
        public c() {
        }

        @Override // com.oplus.aiunit.vision.sl4
        public void a(@NotNull String str, @NotNull MessageEvent messageEvent) {
            if (messageEvent.getServiceId() == 37) {
                int i = 3;
                if (messageEvent.getCommandId() == 3 && TextUtils.equals(str, nhg.this.a)) {
                    if (nhg.this.b || nhg.this.k != 0) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("FlightMode receive, sid:");
                        sb.append(messageEvent.getServiceId());
                        sb.append(",cid:");
                        sb.append(messageEvent.getCommandId());
                        sb.append(",mac:");
                        sb.append(str);
                        try {
                            nhg nhgVar = nhg.this;
                            nhgVar.f14520l = nhgVar.f14520l != null ? nhg.this.f14520l : new ct7(SchoolModeProto$SchoolModeAutoAirplaneMode.parseFrom(messageEvent.getData()));
                            i = 0;
                        } catch (Exception e2) {
                            a7b.m("school.MessageHandle", "parse FlightMode:" + e2.getMessage());
                        }
                        huf hufVar = new huf();
                        hufVar.e(i);
                        hufVar.g(str);
                        hufVar.h(nhg.this.k);
                        hufVar.f(nhg.this.f14520l);
                        synchronized (nhg.this.m) {
                            Iterator it = nhg.this.m.iterator();
                            while (it.hasNext()) {
                                ((lhg) it.next()).a(hufVar);
                            }
                        }
                        nhg.this.f14520l = null;
                        nhg.this.k = 0;
                        nhg.this.I();
                    }
                }
            }
        }

        @Override // com.oplus.aiunit.vision.sl4
        public void b(@NotNull DMCallException dMCallException) {
            if (nhg.this.b || nhg.this.k != 0) {
                a7b.m("school.MessageHandle", "FlightMode receive error");
                huf hufVar = new huf();
                hufVar.e(2);
                hufVar.g(nhg.this.a);
                hufVar.h(nhg.this.k);
                hufVar.f(nhg.this.f14520l);
                synchronized (nhg.this.m) {
                    Iterator it = nhg.this.m.iterator();
                    while (it.hasNext()) {
                        ((lhg) it.next()).a(hufVar);
                    }
                }
                nhg.this.f14520l = null;
                nhg.this.k = 0;
                nhg.this.I();
            }
        }
    }

    public class d implements sl4 {
        public d() {
        }

        @Override // com.oplus.aiunit.vision.sl4
        public void a(@NotNull String str, @NotNull MessageEvent messageEvent) {
            int i;
            if (messageEvent.getServiceId() == 37 && messageEvent.getCommandId() == 4 && TextUtils.equals(str, nhg.this.a)) {
                if (nhg.this.b || nhg.this.o != 0) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("BatteryProtect receive, sid:");
                    sb.append(messageEvent.getServiceId());
                    sb.append(",cid:");
                    sb.append(messageEvent.getCommandId());
                    sb.append(",mac:");
                    sb.append(str);
                    try {
                        nhg nhgVar = nhg.this;
                        nhgVar.p = nhgVar.p != null ? nhg.this.p : new lc1(SchoolModeProto$SchoolModeLowBatteryAppClose.parseFrom(messageEvent.getData()));
                        i = 0;
                    } catch (Exception e2) {
                        a7b.m("school.MessageHandle", "parse BatteryProtect:" + e2.getMessage());
                        i = 3;
                    }
                    huf hufVar = new huf();
                    hufVar.e(i);
                    hufVar.g(str);
                    hufVar.h(nhg.this.o);
                    hufVar.f(nhg.this.p);
                    synchronized (nhg.this.q) {
                        Iterator it = nhg.this.q.iterator();
                        while (it.hasNext()) {
                            ((lhg) it.next()).a(hufVar);
                        }
                    }
                    nhg.this.p = null;
                    nhg.this.o = 0;
                    nhg.this.H();
                }
            }
        }

        @Override // com.oplus.aiunit.vision.sl4
        public void b(@NotNull DMCallException dMCallException) {
            if (nhg.this.b || nhg.this.o != 0) {
                a7b.m("school.MessageHandle", "BatteryProtect receive error");
                huf hufVar = new huf();
                hufVar.e(2);
                hufVar.g(nhg.this.a);
                hufVar.h(nhg.this.o);
                hufVar.f(nhg.this.p);
                synchronized (nhg.this.q) {
                    Iterator it = nhg.this.q.iterator();
                    while (it.hasNext()) {
                        ((lhg) it.next()).a(hufVar);
                    }
                }
                nhg.this.p = null;
                nhg.this.o = 0;
                nhg.this.H();
            }
        }
    }

    public static class e {
        public static final nhg a = new nhg();
    }

    public static nhg F() {
        return e.a;
    }

    public void B(lhg lhgVar) {
        synchronized (this.i) {
            if (lhgVar != null) {
                this.i.add(lhgVar);
            }
        }
    }

    public void C(lhg lhgVar) {
        synchronized (this.q) {
            if (lhgVar != null) {
                this.q.add(lhgVar);
            }
        }
    }

    public void D(lhg lhgVar) {
        synchronized (this.m) {
            if (lhgVar != null) {
                this.m.add(lhgVar);
            }
        }
    }

    public void E(lhg lhgVar) {
        synchronized (this.f14518e) {
            if (lhgVar != null) {
                this.f14518e.add(lhgVar);
            }
        }
    }

    public final void G() {
        if (this.f14519j.isEmpty()) {
            return;
        }
        fqf<List> fqfVarPoll = this.f14519j.poll();
        StringBuilder sb = new StringBuilder();
        sb.append("popAppInfosFrame:");
        sb.append(fqfVarPoll);
        if (fqfVarPoll == null) {
            return;
        }
        if (fqfVarPoll.b() == 1) {
            O(SchoolModeSpHelper.g(this.a), fqfVarPoll.e(), fqfVarPoll.c());
        } else if (fqfVarPoll.b() == 2) {
            W(fqfVarPoll.a(), fqfVarPoll.d(), fqfVarPoll.e(), fqfVarPoll.c());
        }
    }

    public final void H() {
        if (this.r.isEmpty()) {
            return;
        }
        fqf<Boolean> fqfVarPoll = this.r.poll();
        StringBuilder sb = new StringBuilder();
        sb.append("popBatteryProtectFrame:");
        sb.append(fqfVarPoll);
        if (fqfVarPoll == null) {
            return;
        }
        if (fqfVarPoll.b() == 1) {
            P(fqfVarPoll.e(), fqfVarPoll.c());
        } else if (fqfVarPoll.b() == 2) {
            X(fqfVarPoll.a().booleanValue(), fqfVarPoll.e(), fqfVarPoll.c());
        }
    }

    public final void I() {
        if (this.f14521n.isEmpty()) {
            return;
        }
        fqf<Boolean> fqfVarPoll = this.f14521n.poll();
        StringBuilder sb = new StringBuilder();
        sb.append("popFlightModeFrame:");
        sb.append(fqfVarPoll);
        if (fqfVarPoll == null) {
            return;
        }
        if (fqfVarPoll.b() == 1) {
            Q(fqfVarPoll.e(), fqfVarPoll.c());
        } else if (fqfVarPoll.b() == 2) {
            Z(fqfVarPoll.a().booleanValue(), fqfVarPoll.e(), fqfVarPoll.c());
        }
    }

    public final void J() {
        if (this.f.isEmpty()) {
            return;
        }
        fqf<SchoolModeConfig> fqfVarPoll = this.f.poll();
        StringBuilder sb = new StringBuilder();
        sb.append("popSchoolConfigFrame:");
        sb.append(fqfVarPoll);
        if (fqfVarPoll == null) {
            return;
        }
        if (fqfVarPoll.b() == 1) {
            R(fqfVarPoll.e(), fqfVarPoll.c());
        } else if (fqfVarPoll.b() == 2) {
            a0(fqfVarPoll.a(), fqfVarPoll.e(), fqfVarPoll.c());
        }
    }

    public final void K(int i, List<AppItemBean> list, long j2, int i2, int i3) {
        this.f14519j.offer(new fqf<>(i, list, j2, i2, i3));
    }

    public final void L(int i, boolean z, int i2, int i3) {
        this.r.offer(new fqf<>(i, Boolean.valueOf(z), i2, i3));
    }

    public final void M(int i, boolean z, int i2, int i3) {
        this.f14521n.offer(new fqf<>(i, Boolean.valueOf(z), i2, i3));
    }

    public final void N(int i, SchoolModeConfig schoolModeConfig, int i2, int i3) {
        this.f.offer(new fqf<>(i, schoolModeConfig, i2, i3));
    }

    public void O(long j2, int i, int i2) {
        if (this.g != 0) {
            a7b.m("school.MessageHandle", "readAppManagerList busy:" + this.g);
            K(1, null, j2, i, i2);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("readAppManagerList:");
        sb.append(this.a);
        sb.append(",timeStamp:");
        sb.append(j2);
        this.g = 1;
        gl4.devicePrimary.callApi.e(this.a, new MessageEvent(37, 2, SchoolModeProto$SchoolModeAllowedAppList.newBuilder().setType(0).setTime(j2).build().toByteArray()), this.t, ko4.c.INSTANCE, i, i2);
    }

    public void P(int i, int i2) {
        if (this.o != 0) {
            a7b.m("school.MessageHandle", "readBatteryProtectState busy:" + this.o);
            L(1, false, i, i2);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("readBatteryProtectState:");
        sb.append(this.a);
        this.o = 1;
        gl4.devicePrimary.callApi.e(this.a, new MessageEvent(37, 4, SchoolModeProto$SchoolModeLowBatteryAppClose.newBuilder().setType(0).build().toByteArray()), this.v, ko4.c.INSTANCE, i, i2);
    }

    public void Q(int i, int i2) {
        if (this.k != 0) {
            a7b.m("school.MessageHandle", "readFlightModeState busy:" + this.k);
            M(1, false, i, i2);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("readFlightModeState:");
        sb.append(this.a);
        this.k = 1;
        gl4.devicePrimary.callApi.e(this.a, new MessageEvent(37, 3, SchoolModeProto$SchoolModeAutoAirplaneMode.newBuilder().setType(0).build().toByteArray()), this.u, ko4.c.INSTANCE, i, i2);
    }

    public void R(int i, int i2) {
        if (this.f14517c != 0) {
            a7b.m("school.MessageHandle", "readSchoolModeConfig busy:" + this.f14517c);
            N(1, null, i, i2);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("readSchoolModeConfig:");
        sb.append(this.a);
        this.f14517c = 1;
        gl4.devicePrimary.callApi.e(this.a, new MessageEvent(37, 1, SchoolModeProto$SchoolModeSet.newBuilder().setType(0).build().toByteArray()), this.s, ko4.c.INSTANCE, i, i2);
    }

    public void S(lhg lhgVar) {
        synchronized (this.i) {
            if (lhgVar != null) {
                this.i.remove(lhgVar);
            }
        }
    }

    public void T(lhg lhgVar) {
        synchronized (this.q) {
            if (lhgVar != null) {
                this.q.remove(lhgVar);
            }
        }
    }

    public void U(lhg lhgVar) {
        synchronized (this.m) {
            if (lhgVar != null) {
                this.m.remove(lhgVar);
            }
        }
    }

    public void V(lhg lhgVar) {
        synchronized (this.f14518e) {
            if (lhgVar != null) {
                this.f14518e.remove(lhgVar);
            }
        }
    }

    public void W(List<AppItemBean> list, long j2, int i, int i2) {
        if (this.g != 0) {
            a7b.m("school.MessageHandle", "setAppManagerList busy:" + this.g);
            K(2, list, j2, i, i2);
            return;
        }
        this.g = 2;
        this.h = list;
        SchoolModeProto$SchoolModeAllowedAppList.Builder builderNewBuilder = SchoolModeProto$SchoolModeAllowedAppList.newBuilder();
        builderNewBuilder.setType(1).setTime(j2);
        for (AppItemBean appItemBean : list) {
            SchoolModeProto$SchoolModeAppInfo schoolModeProto$SchoolModeAppInfoBuild = SchoolModeProto$SchoolModeAppInfo.newBuilder().setAppName(appItemBean.getAppName()).setItemEnable(appItemBean.isEnable()).setPackageName(appItemBean.getPackageName()).build();
            StringBuilder sb = new StringBuilder();
            sb.append("setAppManagerItem:");
            sb.append(appItemBean);
            builderNewBuilder.addAppList(schoolModeProto$SchoolModeAppInfoBuild);
        }
        gl4.devicePrimary.callApi.e(this.a, new MessageEvent(37, 2, builderNewBuilder.build().toByteArray()), this.t, ko4.c.INSTANCE, i, i2);
    }

    public void X(boolean z, int i, int i2) {
        if (this.o != 0) {
            a7b.m("school.MessageHandle", "setBatteryProtectState busy:" + this.o);
            L(2, z, i, i2);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("setBatteryProtectionState:");
        sb.append(this.a);
        sb.append(", state:");
        sb.append(z);
        this.o = 2;
        this.p = new lc1(z);
        gl4.devicePrimary.callApi.e(this.a, new MessageEvent(37, 4, SchoolModeProto$SchoolModeLowBatteryAppClose.newBuilder().setType(1).setEnable(z ? 1 : 0).build().toByteArray()), this.v, ko4.c.INSTANCE, i, i2);
    }

    public void Y(String str) {
        this.a = str;
    }

    public void Z(boolean z, int i, int i2) {
        if (this.k != 0) {
            a7b.m("school.MessageHandle", "setFlightModeState busy:" + this.k);
            M(2, z, i, i2);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("setFlightModeState:");
        sb.append(this.a);
        sb.append(", state:");
        sb.append(z);
        this.k = 2;
        this.f14520l = new ct7(z);
        gl4.devicePrimary.callApi.e(this.a, new MessageEvent(37, 3, SchoolModeProto$SchoolModeAutoAirplaneMode.newBuilder().setType(1).setEnable(z ? 1 : 0).build().toByteArray()), this.u, ko4.c.INSTANCE, i, i2);
    }

    public void a0(SchoolModeConfig schoolModeConfig, int i, int i2) {
        if (this.f14517c != 0) {
            a7b.m("school.MessageHandle", "setSchoolModeConfig busy:" + this.f14517c);
            N(2, schoolModeConfig, i, i2);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("setSchoolModeConfig:");
        sb.append(this.a);
        sb.append(", config:");
        sb.append(schoolModeConfig);
        this.f14517c = 2;
        this.d = schoolModeConfig.m4648clone();
        gl4.devicePrimary.callApi.e(this.a, new MessageEvent(37, 1, SchoolModeProto$SchoolModeSet.newBuilder().setType(1).setAmStartTime(schoolModeConfig.getAmStartTime()).setAmEndTime(schoolModeConfig.getAmEndTime()).setPmStartTime(schoolModeConfig.getPmStartTime()).setPmEndTime(schoolModeConfig.getPmEndTime()).setRepeatTime(schoolModeConfig.getRepeatTime()).setEnable(schoolModeConfig.isEnable() ? 1 : 0).build().toByteArray()), this.s, ko4.c.INSTANCE, i, i2);
    }

    public final List<AppItemBean> b0(SchoolModeProto$SchoolModeAllowedAppList schoolModeProto$SchoolModeAllowedAppList) {
        ArrayList arrayList = new ArrayList();
        if (schoolModeProto$SchoolModeAllowedAppList == null) {
            return arrayList;
        }
        for (int i = 0; i < schoolModeProto$SchoolModeAllowedAppList.getAppListCount(); i++) {
            SchoolModeProto$SchoolModeAppInfo appList = schoolModeProto$SchoolModeAllowedAppList.getAppList(i);
            AppItemBean appItemBean = new AppItemBean();
            appItemBean.setType(0);
            appItemBean.setEnable(appList.getItemEnable());
            appItemBean.setPackageName(appList.getPackageName());
            appItemBean.setAppName(appList.getAppName());
            arrayList.add(appItemBean);
        }
        return arrayList;
    }
}
