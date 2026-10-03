package com.oplus.aiunit.vision;

import android.content.Context;
import android.util.ArraySet;
import androidx.annotation.NonNull;
import com.google.protobuf.InvalidProtocolBufferException;
import com.heytap.health.devicemanager.deviceability.DeviceInfo;
import com.heytap.wearable.clock.ClockMsg;
import com.heytap.wearable.watch.clock.manager.AlarmDataController;
import com.oplus.wearable.linkservice.sdk.Node;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;
import p010kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public class xg3 {
    public AlarmDataController a;
    public c78 b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Context f18614c;

    public class a implements wl4.b {
        public a() {
        }

        public static /* synthetic */ Boolean b(DeviceInfo deviceInfo) {
            return Boolean.valueOf(deviceInfo.k0());
        }

        @Override // com.oplus.aiunit.vision.wl4.b
        @NonNull
        public ra5 getInterestingStatus(@NonNull ArraySet<auc> arraySet) {
            arraySet.add(auc.a.INSTANCE);
            arraySet.add(auc.f.INSTANCE);
            return ra5.a.INSTANCE;
        }

        @Override // com.oplus.aiunit.vision.wl4.b
        public void onNodeStatusChanged(ra5.c cVar, @NonNull Node node, @NonNull auc aucVar) {
            if (((Boolean) lc5.c(node.getNodeId()).a(new Function1() { // from class: com.oplus.aiunit.vision.wg3
                @Override // p010kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return xg3.a.b((DeviceInfo) obj);
                }
            })).booleanValue()) {
                a7b.m("InterConnHealth.ClockLinkManager", "init is iwatch and return. ");
                return;
            }
            if (aucVar == auc.a.INSTANCE) {
                a7b.f("InterConnHealth.ClockLinkManager", "[onRealConnect] --> notifyPhoneSendClockVersion");
                xg3.this.b.l(20);
                xg3.this.a.d(xg3.this.f18614c);
            } else if (aucVar == auc.f.INSTANCE) {
                xg3.this.a.h(xg3.this.f18614c);
            }
        }
    }

    public static class b {
        public static final xg3 instance = new xg3();
    }

    public static xg3 d() {
        return b.instance;
    }

    public void e(Context context) {
        boolean zX = ilj.x();
        boolean zC = f78.c(context);
        a7b.f("InterConnHealth.ClockLinkManager", "[init] --> isLinkageRom = " + zX + " isClockVersion7_2 = " + zC);
        if (zX && zC) {
            this.f18614c = context;
            this.a = new AlarmDataController();
            this.b = new c78(context);
            gl4.deviceMultiple.nodeApi.e(new a());
        }
    }

    public void f(String str, MessageEvent messageEvent) throws Throwable {
        if (this.f18614c == null) {
            a7b.b("InterConnHealth.ClockLinkManager", "[onMessageReceived] --> context == null unsupport device or clock version");
            return;
        }
        if (i37.b()) {
            return;
        }
        if (messageEvent == null) {
            a7b.b("InterConnHealth.ClockLinkManager", "[onMessageReceived] --> messageEvent==null");
            return;
        }
        if (messageEvent.getServiceId() != 10) {
            a7b.b("InterConnHealth.ClockLinkManager", "[onMessageReceived] --> some other service data no need to execute");
            return;
        }
        int commandId = messageEvent.getCommandId();
        if (9 == commandId || 24 == commandId) {
            a7b.f("InterConnHealth.ClockLinkManager", "[onMessageReceived] --> WATCH_CLOSE_ALARM_COMMAND=" + commandId);
            this.a.b();
            return;
        }
        if (10 == commandId || 25 == commandId) {
            a7b.f("InterConnHealth.ClockLinkManager", "[onMessageReceived] --> WATCH_DELAY_ALARM_COMMAND" + commandId);
            this.a.c();
            return;
        }
        if (17 == commandId) {
            try {
                this.b.s(ClockMsg.ClockCityListResponse.parseFrom(messageEvent.getData()));
                return;
            } catch (InvalidProtocolBufferException e2) {
                a7b.b("InterConnHealth.ClockLinkManager", "[onMessageReceived] --> " + e2.getMessage());
                return;
            }
        }
        if (12 == commandId) {
            a7b.f("InterConnHealth.ClockLinkManager", "[onMessageReceived] --> PHONE_SYNC_GLOABL_DATA_ACK " + commandId);
            return;
        }
        if (18 == commandId) {
            a7b.f("InterConnHealth.ClockLinkManager", "[onMessageReceived] --> WATCH_SYNC_DATA_TO_PHONE_ACK " + commandId);
            return;
        }
        if (13 == commandId) {
            try {
                this.b.h(ClockMsg.ClockCityListResponse.ClockCityInfo.parseFrom(messageEvent.getData()));
                return;
            } catch (InvalidProtocolBufferException e3) {
                a7b.b("InterConnHealth.ClockLinkManager", "[onMessageReceived] --> " + e3.getMessage());
                return;
            }
        }
        if (14 == commandId) {
            try {
                this.b.f(ClockMsg.ClockCityListResponse.ClockCityInfo.parseFrom(messageEvent.getData()));
                return;
            } catch (InvalidProtocolBufferException e4) {
                a7b.b("InterConnHealth.ClockLinkManager", "[onMessageReceived] --> " + e4.getMessage());
                return;
            }
        }
        if (15 != commandId) {
            if (19 == commandId) {
                this.b.l(20);
                return;
            } else {
                if (21 == commandId) {
                    this.b.r();
                    return;
                }
                return;
            }
        }
        try {
            long time = ClockMsg.ClockCommand.parseFrom(messageEvent.getData()).getTime();
            long jA = jh3.a(this.f18614c);
            a7b.f("InterConnHealth.ClockLinkManager", "[onMessageReceived] --> watch time=" + time + " ,phone time=" + jA);
            if (time <= jA) {
                this.b.r();
            } else {
                this.b.m();
            }
        } catch (InvalidProtocolBufferException e5) {
            a7b.b("InterConnHealth.ClockLinkManager", "[onMessageReceived] --> " + e5.getMessage());
        }
    }

    public xg3() {
    }
}
