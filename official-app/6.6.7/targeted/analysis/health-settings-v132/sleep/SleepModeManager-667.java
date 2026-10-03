package com.heytap.device.sleep;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.lifecycle.Observer;
import com.heytap.databaseengine.model.SleepModelSettings;
import com.heytap.device.sleep.SleepModeManager;
import com.heytap.health.base.task.ThreadUtils;
import com.heytap.health.device_settings.health.SportHealthSetting;
import com.heytap.health.devicemanager.processor.bean.OobeStatusBean;
import com.heytap.health.protocol.fitness.FitnessProto;
import com.oplus.aiunit.vision.ash;
import com.oplus.aiunit.vision.cs8;
import com.oplus.aiunit.vision.e88;
import com.oplus.aiunit.vision.fdg;
import com.oplus.aiunit.vision.fq6;
import com.oplus.aiunit.vision.kq5;
import com.oplus.aiunit.vision.m8b;
import com.oplus.aiunit.vision.v2e;
import com.oplus.aiunit.vision.vd5;
import com.oplus.aiunit.vision.vgf;
import com.oplus.aiunit.vision.wl4;
import com.oplus.aiunit.vision.zp;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;
import java.util.concurrent.ExecutorService;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes15.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b,\u0010-J\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0016\u0010\u000b\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tJ\b\u0010\f\u001a\u00020\u0002H\u0002J\b\u0010\r\u001a\u00020\u0002H\u0002J\u0016\u0010\u0010\u001a\u00020\u00022\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000eH\u0002J\b\u0010\u0012\u001a\u00020\u0011H\u0002J\u0010\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0002J\u0010\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0002J\u0010\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0002J\b\u0010\u001b\u001a\u00020\u0002H\u0002J\u0018\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u0016H\u0002J\b\u0010\u001f\u001a\u00020\u0002H\u0002J\u0010\u0010 \u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0016\u0010!\u001a\u00020\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u000eH\u0002R\u0014\u0010\"\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010&\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u001c\u0010+\u001a\n (*\u0004\u0018\u00010'0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006."}, d2 = {"Lcom/heytap/device/sleep/SleepModeManager;", kq5.NOT_SET, kq5.NOT_SET, "o", "Lcom/oplus/wearable/linkservice/sdk/common/MessageEvent;", "msg", "u", "Lcom/heytap/health/device_settings/health/SportHealthSetting;", "type", kq5.NOT_SET, "action", "w", "p", "j", "Lkotlin/Function0;", "block", "x", "Lcom/heytap/device/sleep/a;", "n", "Lcom/heytap/databaseengine/model/SleepModelSettings;", "deviceSetting", "t", kq5.NOT_SET, "sleepModeChangeTime", kq5.NOT_SET, "q", "s", "A", "isOpen", "updateTime", "r", "z", "v", "l", "TAG", "Ljava/lang/String;", "a", "Lcom/heytap/device/sleep/a;", "allAppSetting", "Ljava/util/concurrent/ExecutorService;", "kotlin.jvm.PlatformType", "b", "Ljava/util/concurrent/ExecutorService;", "taskExecutor", "<init>", "()V", "device_data_sync_impl_release"}, k = 1, mv = {1, 8, 0})
public final class SleepModeManager {

    @NotNull
    public static final SleepModeManager INSTANCE;

    @NotNull
    public static final String TAG = "SleepModeManager";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final com.heytap.device.sleep.a allAppSetting;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final ExecutorService taskExecutor;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SportHealthSetting.values().length];
            try {
                iArr[SportHealthSetting.SLEEP_MODEL_SETTINGS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SportHealthSetting.USER_REST_NEW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SportHealthSetting.SLEEP_GOAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SportHealthSetting.BED_TIME_SWITCH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[SportHealthSetting.BED_TIME.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[SportHealthSetting.CLOSE_MUSIC.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class b implements Observer, FunctionAdapter {
        public final /* synthetic */ Function1 i;

        public b(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "function");
            this.i = function1;
        }

        public final boolean equals(@Nullable Object obj) {
            if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.i;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.i.invoke(obj);
        }
    }

    static {
        SleepModeManager sleepModeManager = new SleepModeManager();
        INSTANCE = sleepModeManager;
        allAppSetting = new com.heytap.device.sleep.a();
        taskExecutor = cs8.e("SleepMode");
        m8b.f(TAG, "SleepModeManager init");
        sleepModeManager.j();
        zp.a(e88.a());
        fq6.i(e88.a());
        sleepModeManager.p();
    }

    public static final void k() {
        wl4.devicePrimary.a.a().observeForever(new b(new Function1<OobeStatusBean, Unit>() { // from class: com.heytap.device.sleep.SleepModeManager$addDeviceListener$1$1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((OobeStatusBean) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(OobeStatusBean oobeStatusBean) {
                m8b.f(SleepModeManager.TAG, "Oobe status = " + oobeStatusBean);
                if (oobeStatusBean.isOobeFinish() && ash.e()) {
                    SleepModeManager sleepModeManager = SleepModeManager.INSTANCE;
                    sleepModeManager.A();
                    sleepModeManager.z();
                }
            }
        }));
    }

    public static final void m(Function0 function0) {
        Intrinsics.checkNotNullParameter(function0, "$action");
        function0.invoke();
    }

    public static final void y(Function0 function0) {
        Object obj;
        Intrinsics.checkNotNullParameter(function0, "$block");
        try {
            Result.Companion companion = Result.Companion;
            function0.invoke();
            obj = Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Throwable th2 = Result.exceptionOrNull-impl(obj);
        if (th2 == null) {
            return;
        }
        m8b.f(TAG, "Sleep mode run task error:" + th2);
    }

    public final void A() {
        x(new Function0<Unit>() { // from class: com.heytap.device.sleep.SleepModeManager$syncSettingToDevice$1
            public /* bridge */ /* synthetic */ Object invoke() {
                m45invoke();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m45invoke() {
                m8b.f(SleepModeManager.TAG, "Start sync all sleep setting to device");
                a aVarN = SleepModeManager.INSTANCE.n();
                if (!ash.e()) {
                    m8b.f(SleepModeManager.TAG, "Sync sleep setting cancel, device not support");
                    return;
                }
                SleepModeBTRepository.Companion companion = SleepModeBTRepository.INSTANCE;
                companion.m(aVarN.getBedTimeRemind());
                companion.r(aVarN.getStayUpRemind());
                companion.l(aVarN.getIsCloseMusic());
                companion.q(aVarN.getUserRestSetting());
                if (ash.h()) {
                    companion.p(aVarN.getSleepGoal());
                }
            }
        });
    }

    public final void j() {
        ThreadUtils.doInUiThread(new Runnable() { // from class: com.oplus.aiunit.vision.joh
            @Override // java.lang.Runnable
            public final void run() {
                SleepModeManager.k();
            }
        });
    }

    public final void l(final Function0<Unit> action) {
        ThreadUtils.doInBackground("SleepSetSync", new Runnable() { // from class: com.oplus.aiunit.vision.ioh
            @Override // java.lang.Runnable
            public final void run() {
                SleepModeManager.m(action);
            }
        });
    }

    public final synchronized com.heytap.device.sleep.a n() {
        com.heytap.device.sleep.a aVar;
        aVar = allAppSetting;
        aVar.g();
        return aVar;
    }

    public final void o() {
        m8b.f(TAG, "Call init sleep mode manager");
    }

    public final void p() {
        Context contextA = e88.a();
        BroadcastReceiver broadcastReceiver = new BroadcastReceiver() { // from class: com.heytap.device.sleep.SleepModeManager$initSleepSettingChangeReceiver$receiver$1
            @Override // android.content.BroadcastReceiver
            public void onReceive(@Nullable Context context, @Nullable Intent intent) {
                final String stringExtra;
                if (intent == null || (stringExtra = intent.getStringExtra("type")) == null) {
                    return;
                }
                SleepModeManager.INSTANCE.l(new Function0<Unit>() { // from class: com.heytap.device.sleep.SleepModeManager$initSleepSettingChangeReceiver$receiver$1$onReceive$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    public /* bridge */ /* synthetic */ Object invoke() {
                        m41invoke();
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                    public final void m41invoke() {
                        SleepModeManager.INSTANCE.v(SportHealthSetting.valueOf(stringExtra));
                    }
                });
            }
        };
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(SleepModeRepository.ACTION_SLEEP_SETTING_CHANGED);
        vgf.a(contextA, broadcastReceiver, intentFilter, 4);
    }

    public final boolean q(int sleepModeChangeTime) {
        return fdg.w().y(vd5.SP_KEY_SLEEP_MODE_LINKED_PHONE_ZEN_MODE_TIME) == sleepModeChangeTime;
    }

    public final void r(boolean isOpen, int updateTime) {
        m8b.f(TAG, "Sleep mode linkage phone zen mode，isOpen=" + isOpen + " updateTime=" + updateTime);
        DoNotDisturbManager.INSTANCE.s(isOpen, updateTime, true);
    }

    public final void s(SleepModelSettings deviceSetting) throws InterruptedException {
        boolean z;
        SleepModelSettings sleepModeSetting = n().getSleepModeSetting();
        m8b.f(TAG, "mergeSleepSetting appSetting:" + sleepModeSetting + "\ndeviceSetting:" + deviceSetting);
        boolean z2 = true;
        if (sleepModeSetting.getStartNow() != deviceSetting.getStartNow()) {
            sleepModeSetting.setStartNow(deviceSetting.getStartNow());
            z = true;
        } else {
            z = false;
        }
        if (sleepModeSetting.getStateSyncUpdateTime() > deviceSetting.getStateSyncUpdateTime() || sleepModeSetting.getStateSync() == deviceSetting.getStateSync()) {
            z2 = z;
        } else {
            sleepModeSetting.setStateSync(deviceSetting.getStateSync());
            sleepModeSetting.setStateSyncUpdateTime(deviceSetting.getStateSyncUpdateTime());
            SleepModeRepository.INSTANCE.p(deviceSetting.getStateSyncUpdateTime());
        }
        if (!z2) {
            m8b.f(TAG, "Device and App sleep mode is same");
        } else {
            SleepModeRepository.INSTANCE.q(sleepModeSetting);
            w(SportHealthSetting.SLEEP_MODEL_SETTINGS, SleepModeRepository.ACTION_SLEEP_SETTING_CHANGED_FROM_TP);
        }
    }

    public final void t(SleepModelSettings deviceSetting) throws InterruptedException {
        s(deviceSetting);
        if (!n().getSleepModeSetting().isSyncSleepMode()) {
            m8b.f(TAG, "On device sleep mode data, but sync zenMode is close");
            return;
        }
        m8b.f(TAG, "Linkage phone zen mode, enable=" + deviceSetting.isStartNow() + ", time=" + ((int) deviceSetting.getTimestamp()));
        int timestamp = (int) deviceSetting.getTimestamp();
        if (DoNotDisturbRepository.INSTANCE.e()) {
            r(deviceSetting.isStartNow(), timestamp);
            return;
        }
        if (!q(timestamp)) {
            r(deviceSetting.isStartNow(), timestamp);
            fdg.w().S(vd5.SP_KEY_SLEEP_MODE_LINKED_PHONE_ZEN_MODE_TIME, timestamp);
        } else {
            m8b.f(TAG, "Device sleep mode already changed phone zen mode, changeTime=" + timestamp);
        }
    }

    public final void u(@NotNull MessageEvent msg) {
        Object obj;
        Intrinsics.checkNotNullParameter(msg, "msg");
        FitnessProto.SleepModelSetting from = null;
        try {
            Result.Companion companion = Result.Companion;
            from = FitnessProto.SleepModelSetting.parseFrom(msg.getData());
            m8b.f(TAG, "On receive sleep mode msg, cid=" + msg.getCommandId() + ", data=" + v2e.b(from));
            obj = Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Throwable th2 = Result.exceptionOrNull-impl(obj);
        if (th2 != null) {
            m8b.f(TAG, "On receive sleep mode msg, parse fail:" + th2);
            return;
        }
        if (from == null) {
            return;
        }
        final SleepModelSettings sleepModelSettingsA = SleepModeRepository.INSTANCE.a(from);
        final int commandId = msg.getCommandId();
        if (commandId != 73) {
            if (commandId != 74) {
                if (commandId == 79 || commandId == 209) {
                    x(new Function0<Unit>() { // from class: com.heytap.device.sleep.SleepModeManager$onReceiveDeviceSleepModeMsg$5
                        {
                            super(0);
                        }

                        public /* bridge */ /* synthetic */ Object invoke() throws InterruptedException {
                            m44invoke();
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                        public final void m44invoke() throws InterruptedException {
                            SleepModeManager.INSTANCE.t(sleepModelSettingsA);
                        }
                    });
                    return;
                } else if (commandId != 204) {
                    if (commandId != 205) {
                        return;
                    }
                }
            }
            x(new Function0<Unit>() { // from class: com.heytap.device.sleep.SleepModeManager$onReceiveDeviceSleepModeMsg$4
                {
                    super(0);
                }

                public /* bridge */ /* synthetic */ Object invoke() throws InterruptedException {
                    m43invoke();
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                public final void m43invoke() throws InterruptedException {
                    if (SleepModeBTRepository.INSTANCE.k()) {
                        return;
                    }
                    SleepModeManager.INSTANCE.t(sleepModelSettingsA);
                }
            });
            return;
        }
        x(new Function0<Unit>() { // from class: com.heytap.device.sleep.SleepModeManager$onReceiveDeviceSleepModeMsg$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            public /* bridge */ /* synthetic */ Object invoke() throws InterruptedException {
                m42invoke();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m42invoke() throws InterruptedException {
                SleepModeBTRepository.Companion companion3 = SleepModeBTRepository.INSTANCE;
                if (companion3.k() && commandId == 73) {
                    m8b.f(SleepModeManager.TAG, "Send resp msg to watch free for cid=73");
                    companion3.n();
                }
                SleepModeManager.INSTANCE.t(sleepModelSettingsA);
            }
        });
    }

    public final void v(SportHealthSetting type) {
        boolean zE = ash.e();
        m8b.f(TAG, "On sleep setting changed, type=" + type + ", needSync=" + zE);
        switch (a.$EnumSwitchMapping$0[type.ordinal()]) {
            case 1:
                com.heytap.device.sleep.a.p(n(), false, 1, null);
                if (zE) {
                    z();
                }
                break;
            case 2:
                com.heytap.device.sleep.a.s(n(), false, 1, null);
                if (zE) {
                    SleepModeBTRepository.INSTANCE.q(n().getUserRestSetting());
                }
                break;
            case 3:
                com.heytap.device.sleep.a.n(n(), false, 1, null);
                if (zE && ash.h()) {
                    SleepModeBTRepository.INSTANCE.p(n().getSleepGoal());
                    break;
                }
                break;
            case 4:
            case 5:
                com.heytap.device.sleep.a.j(n(), false, 1, null);
                if (zE) {
                    SleepModeBTRepository.INSTANCE.m(n().getBedTimeRemind());
                }
                break;
            case 6:
                com.heytap.device.sleep.a.l(n(), false, 1, null);
                if (zE) {
                    SleepModeBTRepository.INSTANCE.l(n().getIsCloseMusic());
                }
                break;
        }
    }

    public final void w(@NotNull SportHealthSetting type, @NotNull String action) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(action, "action");
        Context contextA = e88.a();
        Intent intent = new Intent(action);
        intent.putExtra("type", type.name());
        intent.setPackage(contextA.getPackageName());
        contextA.sendBroadcast(intent);
    }

    public final void x(final Function0<Unit> block) {
        taskExecutor.execute(new Runnable() { // from class: com.oplus.aiunit.vision.koh
            @Override // java.lang.Runnable
            public final void run() {
                SleepModeManager.y(block);
            }
        });
    }

    public final void z() {
        BuildersKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), (CoroutineContext) null, (CoroutineStart) null, new SleepModeManager$syncAccordRestOrLinkageZenModeSetting$1(null), 3, (Object) null);
    }
}