package com.heytap.wearable.watch.clock;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.google.protobuf.InvalidProtocolBufferException;
import com.heytap.speechassist.engine.agent.IPlatformAgentService;
import com.heytap.wearable.clock.ClockMsg;
import com.heytap.wearable.watch.ClockMessageProto$AlarmCommand;
import com.heytap.wearable.watch.ClockMessageProto$AlarmMessage;
import com.heytap.wearable.watch.ClockMessageProto$Operation;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.b78;
import com.oplus.aiunit.vision.e78;
import com.oplus.aiunit.vision.f78;
import com.oplus.aiunit.vision.gl4;
import com.oplus.aiunit.vision.i37;
import com.oplus.aiunit.vision.ilj;
import com.oplus.aiunit.vision.j25;
import com.oplus.aiunit.vision.wke;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;
import java.util.ArrayList;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes3.dex */
public class ClockMessageManager {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Uri f8459e = Uri.parse("content://com.coloros.alarmclock.ai");
    public IClockService a;
    public final Context b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final IShowAlarmListener f8460c;
    public ServiceConnection d;

    public class a implements ServiceConnection {
        public a() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            a7b.f("InterConnHealth.ClockMessageManager", "[onServiceConnected] --> enter");
            ClockMessageManager.this.a = IClockService.Stub.asInterface(iBinder);
            try {
                ClockMessageManager.this.a.addActionListener(ClockMessageManager.this.f8460c);
            } catch (RemoteException e2) {
                a7b.b("InterConnHealth.ClockMessageManager", "[onServiceConnected] --> " + e2.getMessage());
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            a7b.f("InterConnHealth.ClockMessageManager", "[onServiceDisconnected] --> enter");
            ClockMessageManager.this.a = null;
        }
    }

    public static class b {
        public static final ClockMessageManager instance = new ClockMessageManager();
    }

    public static ClockMessageManager e() {
        return b.instance;
    }

    public final void d(Context context) {
        a7b.f("InterConnHealth.ClockMessageManager", "[bindService] --> enter");
        Intent intent = new Intent("com.leo.aidl");
        intent.setClassName("com.test.watch.weather", "com.oppo.watch.weather.service.ClockService");
        context.bindService(intent, this.d, 1);
    }

    public final synchronized Bundle f(String str, Bundle bundle) {
        Bundle bundleCall;
        wke.h(this.b).g();
        IPlatformAgentService iPlatformAgentServiceI = wke.i(this.b);
        if (iPlatformAgentServiceI != null) {
            a7b.f("InterConnHealth.ClockMessageManager", "[getWorldClock] --> platformAgentService！=null");
            if (bundle == null) {
                try {
                    bundle = new Bundle();
                    bundle.putParcelable("call_uri", f8459e);
                    bundle.putString("name", "clockManagerCall");
                    bundle.putString("call_method", "get_world_clock_list");
                    bundle.putString("call_args", str);
                    bundleCall = iPlatformAgentServiceI.call(bundle);
                } catch (RemoteException e2) {
                    a7b.b("InterConnHealth.ClockMessageManager", "[getWorldClock] --> " + e2.getMessage());
                    bundleCall = null;
                }
                wke.h(this.b).k();
            } else {
                bundle.putParcelable("call_uri", f8459e);
                bundle.putString("name", "clockManagerCall");
                bundle.putString("call_method", "get_world_clock_list");
                bundle.putString("call_args", str);
                bundleCall = iPlatformAgentServiceI.call(bundle);
                wke.h(this.b).k();
            }
            throw th;
        }
        a7b.m("InterConnHealth.ClockMessageManager", "[getWorldClock] --> platformAgentService is null");
        bundleCall = null;
        wke.h(this.b).k();
        return bundleCall;
    }

    public final ArrayList<ClockMsg.ClockCityListResponse.ClockCityInfo> g(Bundle bundle) {
        ArrayList<ClockMsg.ClockCityListResponse.ClockCityInfo> arrayList = new ArrayList<>();
        Bundle bundleF = f(null, bundle);
        if (bundleF == null) {
            a7b.m("InterConnHealth.ClockMessageManager", "[getWorldData] --> result is null");
        } else {
            int i = bundleF.getInt("result");
            int[] intArray = bundleF.getIntArray("city_id_list");
            String[] stringArray = bundleF.getStringArray("city_name_list");
            String[] stringArray2 = bundleF.getStringArray("city_timezone_list");
            int[] intArray2 = bundleF.getIntArray("city_sort_list");
            if (1 == i && intArray != null && stringArray != null && stringArray2 != null && intArray2 != null) {
                for (int i2 = 0; i2 < intArray.length; i2++) {
                    arrayList.add(ClockMsg.ClockCityListResponse.ClockCityInfo.newBuilder().setClockCityId(intArray[i2]).setClockName(TextUtils.isEmpty(stringArray[i2]) ? "" : stringArray[i2]).setClockSortPos(intArray2[i2]).setClockTimezone(TextUtils.isEmpty(stringArray2[i2]) ? "" : stringArray2[i2]).setClockOffset(TextUtils.isEmpty(stringArray2[i2]) ? 0 : TimeZone.getTimeZone(stringArray2[i2]).getOffset(System.currentTimeMillis()) / 1000).build());
                }
                a7b.f("InterConnHealth.ClockMessageManager", "[getWorldData] --> phone world data size=" + arrayList.size());
            }
        }
        return arrayList;
    }

    public void h(boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("notifyWorldTimeSyncFinish: succ=");
        sb.append(z);
        Intent intent = new Intent("com.op.smartwear.public.wearable.RECEIVER");
        intent.putExtra("native_sync_action", "com.op.smartwear.native.world.time.RECEIVER");
        intent.putExtra("native_sync_result", z);
        LocalBroadcastManager.getInstance(this.b).sendBroadcast(intent);
    }

    public void i(String str, MessageEvent messageEvent) {
        if (messageEvent == null) {
            a7b.b("InterConnHealth.ClockMessageManager", "[receivedMessage] --> event is null");
            return;
        }
        int commandId = messageEvent.getCommandId();
        a7b.f("InterConnHealth.ClockMessageManager", "[receivedMessage] --> commandId=" + commandId + ", event data=" + messageEvent.toString());
        if (i37.b()) {
            return;
        }
        if (commandId == 1) {
            if (ilj.x()) {
                l(messageEvent, 2);
                return;
            } else {
                a7b.f("InterConnHealth.ClockMessageManager", "[receivedMessage] --> CLOCK_OOBE_SYNC_LANGUAGE not link state.");
                return;
            }
        }
        if (commandId == 2) {
            k(messageEvent.getData());
            return;
        }
        if (commandId == 3) {
            if (ilj.x()) {
                l(messageEvent, 3);
                return;
            } else {
                a7b.f("InterConnHealth.ClockMessageManager", "[receivedMessage] --> CLOCK_SYNC_CITY_LIST not link state");
                return;
            }
        }
        if (commandId != 5) {
            return;
        }
        try {
            ClockMessageProto$AlarmCommand from = ClockMessageProto$AlarmCommand.parseFrom(messageEvent.getData());
            a7b.f("InterConnHealth.ClockMessageManager", "[receivedMessage] --> command.alarmId=" + from.getAlarmId() + ",command.alarmOperation=" + from.getAlarmOperation().toString());
            int i = from.getAlarmOperation() == ClockMessageProto$Operation.STOP_ALARM ? 0 : 1;
            j25.a("InterConnHealth.ClockMessageManager", "handleMessage() alarmOperation = " + i);
            this.a.alarmDismiss(from.getAlarmId(), i);
        } catch (Exception e2) {
            a7b.b("InterConnHealth.ClockMessageManager", "[receivedMessage] --> " + e2.getMessage());
        }
    }

    public final ArrayList<ClockMsg.ClockCityListResponse.ClockCityInfo> j(String str) {
        a7b.f("InterConnHealth.ClockMessageManager", "[request] --> enter");
        Bundle bundle = new Bundle();
        bundle.putString("extra_locale", str);
        return g(bundle);
    }

    public final void k(byte[] bArr) {
        try {
            h(100000 == ((long) ClockMsg.ClockOOBESyncResult.parseFrom(bArr).getClockCityListSyncResult()));
        } catch (InvalidProtocolBufferException e2) {
            a7b.b("InterConnHealth.ClockMessageManager", "[sendBroadcast] --> " + e2.getMessage());
        }
    }

    public final void l(MessageEvent messageEvent, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("[sendCityTimezoneData] --> ");
        sb.append(messageEvent.toString());
        n(i, Locale.forLanguageTag(new String(messageEvent.getData())).toLanguageTag());
    }

    public void m(int i, String str) {
        ClockMsg.OOBELanguageSync.Builder builderNewBuilder = ClockMsg.OOBELanguageSync.newBuilder();
        if (str == null) {
            str = "";
        }
        gl4.deviceMultiple.messageApi.k(gl4.managerApi.n(), new MessageEvent(10, i, builderNewBuilder.setOobeSyncLanguage(str).setClockVersion(f78.c(this.b) ? 1 : 0).build().toByteArray()));
    }

    public final void n(int i, String str) {
        ArrayList<ClockMsg.ClockCityListResponse.ClockCityInfo> arrayListJ;
        if (f78.c(this.b)) {
            arrayListJ = new e78(this.b).d();
        } else {
            if (TextUtils.isEmpty(str)) {
                a7b.m("InterConnHealth.ClockMessageManager", "[sendData] --> language is null");
                return;
            }
            arrayListJ = j(str);
        }
        gl4.deviceMultiple.messageApi.k(gl4.managerApi.n(), new MessageEvent(10, i, ClockMsg.ClockCityListResponse.newBuilder().addAllClockCityList(arrayListJ).build().toByteArray()));
    }

    public ClockMessageManager() {
        this.f8460c = new IShowAlarmListener.Stub() { // from class: com.heytap.wearable.watch.clock.ClockMessageManager.1
            @Override // com.heytap.wearable.watch.clock.IShowAlarmListener
            public void alarmDismiss(int i, int i2) {
                a7b.f("InterConnHealth.ClockMessageManager", "[alarmDismiss] --> enter");
                ClockMessageProto$AlarmCommand.Builder builderNewBuilder = ClockMessageProto$AlarmCommand.newBuilder();
                builderNewBuilder.setAlarmId(i);
                if (i2 == 0) {
                    builderNewBuilder.setAlarmOperation(ClockMessageProto$Operation.DEFAULT);
                } else if (i2 == 1) {
                    builderNewBuilder.setAlarmOperation(ClockMessageProto$Operation.DELAY_ALARM);
                } else if (i2 == 2) {
                    builderNewBuilder.setAlarmOperation(ClockMessageProto$Operation.STOP_ALARM);
                } else {
                    builderNewBuilder.setAlarmOperation(ClockMessageProto$Operation.UNRECOGNIZED);
                }
                gl4.deviceMultiple.messageApi.k(gl4.managerApi.n(), new MessageEvent(10, 5, builderNewBuilder.build().toByteArray()));
            }

            @Override // com.heytap.wearable.watch.clock.IShowAlarmListener
            public void startAlarm(AlarmSchedule alarmSchedule) {
                a7b.f("InterConnHealth.ClockMessageManager", "[startAlarm] --> enter");
                gl4.deviceMultiple.messageApi.k(gl4.managerApi.n(), new MessageEvent(10, 4, ClockMessageProto$AlarmMessage.newBuilder().setAlarmId(alarmSchedule.getId()).setAlarmName(alarmSchedule.getLabel() == null ? "" : alarmSchedule.getLabel()).setAlarmTime(alarmSchedule.getTime()).build().toByteArray()));
            }
        };
        this.d = new a();
        Context contextA = b78.a();
        this.b = contextA;
        if (ilj.r(contextA)) {
            return;
        }
        d(contextA);
    }
}
