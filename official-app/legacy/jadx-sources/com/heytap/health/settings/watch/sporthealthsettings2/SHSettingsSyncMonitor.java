package com.heytap.health.settings.watch.sporthealthsettings2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.Observer;
import com.heytap.health.base.task.ThreadUtils;
import com.heytap.health.device_settings.health.SportHealthSetting;
import com.heytap.health.devicemanager.processor.bean.UserDeviceInfo;
import com.heytap.health.health.bloodpressure.BpDataSendDeviceService;
import com.heytap.health.menstrual.data.CycleSetting;
import com.heytap.health.menstrual.inter.MenstrualService;
import com.heytap.health.protocol.menstrualcycle.MenstrualCycle$CycleSetting;
import com.heytap.health.settings.watch.sporthealthsettings2.SHSettingsSyncMonitor;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.a1e;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.b78;
import com.oplus.aiunit.vision.gdb;
import com.oplus.aiunit.vision.gl4;
import com.oplus.aiunit.vision.gxe;
import com.oplus.aiunit.vision.m6c;
import com.oplus.aiunit.vision.rdf;
import com.oplus.aiunit.vision.x0;
import com.oplus.aiunit.vision.zq0;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Function;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.FunctionAdapter;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0002J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u001c\u0010\u000b\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u0007H\u0002J\u0012\u0010\f\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\b\u001a\u00020\u0007H\u0002R\u0014\u0010\u000f\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/heytap/health/settings/watch/sporthealthsettings2/SHSettingsSyncMonitor;", "", "", LogFieldKey.LEVEL_KEY, MapSchema.FIELD_NAME_KEY, LogFieldKey.PROCESS_NAME_KEY, b2n.g, "", "deviceMac", "q", "switchType", "o", "n", "Lcom/heytap/health/settings/watch/sporthealthsettings2/SHSettingManager;", "j", "ACTION_DEVICE_SHS_CHANGED", "Ljava/lang/String;", "<init>", "()V", "device_settings_impl_release"}, k = 1, mv = {1, 8, 0})
public final class SHSettingsSyncMonitor {
    public static final int $stable = 0;

    @NotNull
    public static final String ACTION_DEVICE_SHS_CHANGED = "action_device_shs_changed";

    @NotNull
    public static final SHSettingsSyncMonitor INSTANCE = new SHSettingsSyncMonitor();

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a implements Observer, FunctionAdapter {
        public final /* synthetic */ Function1 i;

        public a(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.i = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p010kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.i;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.i.invoke(obj);
        }
    }

    public static final void i(CycleSetting localSetting, MenstrualService menstrualService, m6c.a result) {
        Intrinsics.checkNotNullParameter(localSetting, "$localSetting");
        Intrinsics.checkNotNullParameter(menstrualService, "$menstrualService");
        Intrinsics.checkNotNullParameter(result, "result");
        if (!result.f()) {
            a7b.f(SHSettingManager.TAG, "getMenstrualCycleSettingsData result :" + result.b());
            return;
        }
        try {
            MenstrualCycle$CycleSetting from = MenstrualCycle$CycleSetting.parseFrom(result.e().getData());
            a7b.f(SHSettingManager.TAG, "on message received menstrual cycle setting data = " + a1e.b(from));
            if (from == null || ((long) from.getModifiedTime()) * 1000 <= localSetting.getModifiedTime()) {
                return;
            }
            a7b.f(SHSettingManager.TAG, "device cycle setting modifiedTime is large than local");
            menstrualService.o7(new CycleSetting(from.getUserPeriodDur(), from.getUserCycleDur(), ((long) from.getUserLastPeriod()) * 1000, localSetting.getCreateTime(), ((long) from.getModifiedTime()) * 1000));
            Intent intent = new Intent("action_menstrual_symptom_changed");
            Context contextA = b78.a();
            intent.setPackage(contextA.getPackageName());
            contextA.sendBroadcast(intent);
        } catch (Exception e2) {
            a7b.f(SHSettingManager.TAG, "parseFrom MenstrualCycleSettingsData error :" + e2.getMessage());
        }
    }

    public static final void m() {
        gl4.devicePrimary.nodeApi.a().observeForever(new a(SHSettingsSyncMonitor$initSyncSettingTaskInTransportProcess$1$1.INSTANCE));
    }

    public final void h() {
        Object objNavigation = x0.d().b("/menstrual/MenstrualService").navigation();
        Intrinsics.checkNotNull(objNavigation, "null cannot be cast to non-null type com.heytap.health.menstrual.inter.MenstrualService");
        final MenstrualService menstrualService = (MenstrualService) objNavigation;
        final CycleSetting cycleSettingI6 = menstrualService.i6();
        long j2 = 1000;
        MenstrualCycle$CycleSetting menstrualCycle$CycleSettingBuild = MenstrualCycle$CycleSetting.newBuilder().setUserCycleDur(cycleSettingI6.getCycleDays()).setUserPeriodDur(cycleSettingI6.getPeriodDays()).setUserLastPeriod((int) (cycleSettingI6.getLatestDay() / j2)).setModifiedTime((int) (cycleSettingI6.getModifiedTime() / j2)).build();
        Intrinsics.checkNotNullExpressionValue(menstrualCycle$CycleSettingBuild, "newBuilder()\n           …t())\n            .build()");
        zq0.w().S(new MessageEvent(5, 248, menstrualCycle$CycleSettingBuild.toByteArray()), 5000, new m6c() { // from class: com.oplus.aiunit.vision.p8g
            @Override // com.oplus.aiunit.vision.m6c
            public final void f(m6c.a aVar) {
                SHSettingsSyncMonitor.i(cycleSettingI6, menstrualService, aVar);
            }
        });
    }

    public final SHSettingManager j(String deviceMac) {
        a7b.f(SHSettingManager.TAG, " getShsManager =" + gdb.a(deviceMac));
        UserDeviceInfo boundDeviceInfoByMac = gl4.managerApi.getBoundDeviceInfoByMac(deviceMac);
        SHSettingManager.Companion companion = SHSettingManager.INSTANCE;
        SHSettingManager sHSettingManagerA = companion.a(deviceMac);
        if (sHSettingManagerA != null || boundDeviceInfoByMac == null) {
            return sHSettingManagerA;
        }
        String model = boundDeviceInfoByMac.getModel();
        Intrinsics.checkNotNullExpressionValue(model, "model");
        return companion.b(deviceMac, model);
    }

    public final void k() {
        Context context = b78.a();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        if (gxe.f(context)) {
            a7b.f(SHSettingManager.TAG, "Register shs change receiver");
            rdf.a(context, new BroadcastReceiver() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.SHSettingsSyncMonitor$initSyncSettingTaskInMainProcess$shsChangeReceiver$1
                @Override // android.content.BroadcastReceiver
                public void onReceive(@NotNull Context context2, @Nullable Intent intent) {
                    Intrinsics.checkNotNullParameter(context2, "context");
                    if (intent == null) {
                        return;
                    }
                    String stringExtra = intent.getStringExtra("device_mac");
                    String stringExtra2 = intent.getStringExtra("type");
                    a7b.f(SHSettingManager.TAG, "On receive device shs changed broadcast, mac=" + gdb.a(stringExtra) + " type=" + stringExtra2);
                    if (TextUtils.isEmpty(stringExtra)) {
                        return;
                    }
                    if (Intrinsics.areEqual(stringExtra2, "1000")) {
                        SHSettingsSyncMonitor.INSTANCE.n(stringExtra);
                    } else {
                        SHSettingsSyncMonitor.INSTANCE.o(stringExtra, stringExtra2);
                    }
                }
            }, new IntentFilter(ACTION_DEVICE_SHS_CHANGED), 4);
        }
    }

    public final void l() {
        Context context = b78.a();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        if (gxe.l(context)) {
            ThreadUtils.doInUiThread(new Runnable() { // from class: com.oplus.aiunit.vision.o8g
                @Override // java.lang.Runnable
                public final void run() {
                    SHSettingsSyncMonitor.m();
                }
            });
        }
    }

    public final void n(String deviceMac) {
        String currentConnectId = gl4.managerApi.getCurrentConnectId();
        if (currentConnectId == null || !Intrinsics.areEqual(currentConnectId, deviceMac)) {
            a7b.f(SHSettingManager.TAG, "Device is not connect, sync shs fail");
            return;
        }
        SHSettingManager sHSettingManagerJ = j(deviceMac);
        a7b.f(SHSettingManager.TAG, "loading blood sugar device settings");
        if (sHSettingManagerJ != null) {
            SportHealthSetting sportHealthSetting = SportHealthSetting.BLOOD_SUGAR_DEVICE_ENABLE;
            sHSettingManagerJ.G(sportHealthSetting);
            sHSettingManagerJ.C(sportHealthSetting);
        }
    }

    public final void o(String deviceMac, String switchType) {
        String currentConnectId = gl4.managerApi.getCurrentConnectId();
        if (currentConnectId == null || !Intrinsics.areEqual(currentConnectId, deviceMac)) {
            a7b.f(SHSettingManager.TAG, "Device is not connect, sync shs fail");
            return;
        }
        SHSettingManager sHSettingManagerJ = j(deviceMac);
        if (sHSettingManagerJ == null) {
            a7b.b(SHSettingManager.TAG, "Device info is null, create shs manager fail");
            return;
        }
        int localSettingLoadState = sHSettingManagerJ.getLocalSettingLoadState();
        if (localSettingLoadState == 1) {
            a7b.f(SHSettingManager.TAG, "SHS is loading");
            return;
        }
        if (localSettingLoadState != 2) {
            sHSettingManagerJ.B();
        } else if (switchType != null) {
            sHSettingManagerJ.D(switchType);
        } else {
            sHSettingManagerJ.D(SHSettingManager.SYNC_SWITCH_ALL);
        }
    }

    public final void p() {
        Object objNavigation = x0.d().b("/bloodpressure/SendBPDataToDevice").navigation();
        Intrinsics.checkNotNull(objNavigation, "null cannot be cast to non-null type com.heytap.health.health.bloodpressure.BpDataSendDeviceService");
        ((BpDataSendDeviceService) objNavigation).e0();
    }

    public final void q(String deviceMac) {
        a7b.f(SHSettingManager.TAG, " syncSettingToDevice =" + gdb.a(deviceMac));
        SHSettingManager sHSettingManagerJ = j(deviceMac);
        if (sHSettingManagerJ == null) {
            a7b.b(SHSettingManager.TAG, "Device info is null, create shs manager fail");
            return;
        }
        Context contextA = b78.a();
        Intrinsics.checkNotNullExpressionValue(contextA, "getAppContext()");
        if (gxe.l(contextA)) {
            sHSettingManagerJ.L(0);
        }
        sHSettingManagerJ.M();
    }
}
