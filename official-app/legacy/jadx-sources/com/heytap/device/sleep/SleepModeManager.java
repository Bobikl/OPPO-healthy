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
import com.heytap.health.protocol.fitness.FitnessProto$SleepModelSetting;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.a1e;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.ad5;
import com.oplus.aiunit.vision.b78;
import com.oplus.aiunit.vision.fp6;
import com.oplus.aiunit.vision.gl4;
import com.oplus.aiunit.vision.joh;
import com.oplus.aiunit.vision.rdf;
import com.oplus.aiunit.vision.rp;
import com.oplus.aiunit.vision.v9g;
import com.oplus.aiunit.vision.zq8;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;
import java.util.concurrent.ExecutorService;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Function;
import p010kotlin.Metadata;
import p010kotlin.Result;
import p010kotlin.ResultKt;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.FunctionAdapter;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b,\u0010-J\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0016\u0010\u000b\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tJ\b\u0010\f\u001a\u00020\u0002H\u0002J\b\u0010\r\u001a\u00020\u0002H\u0002J\u0016\u0010\u0010\u001a\u00020\u00022\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000eH\u0002J\b\u0010\u0012\u001a\u00020\u0011H\u0002J\u0010\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0002J\u0010\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0002J\u0010\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0002J\b\u0010\u001b\u001a\u00020\u0002H\u0002J\u0018\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u0016H\u0002J\b\u0010\u001f\u001a\u00020\u0002H\u0002J\u0010\u0010 \u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0016\u0010!\u001a\u00020\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u000eH\u0002R\u0014\u0010\"\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010&\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u001c\u0010+\u001a\n (*\u0004\u0018\u00010'0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006."}, d2 = {"Lcom/heytap/device/sleep/SleepModeManager;", "", "", "o", "Lcom/oplus/wearable/linkservice/sdk/common/MessageEvent;", "msg", "u", "Lcom/heytap/health/device_settings/health/SportHealthSetting;", "type", "", "action", "w", LogFieldKey.PROCESS_NAME_KEY, "j", "Lkotlin/Function0;", "block", "x", "Lcom/heytap/device/sleep/a;", "n", "Lcom/heytap/databaseengine/model/SleepModelSettings;", "deviceSetting", "t", "", "sleepModeChangeTime", "", "q", "s", "A", "isOpen", "updateTime", "r", "z", "v", LogFieldKey.LEVEL_KEY, "TAG", "Ljava/lang/String;", "a", "Lcom/heytap/device/sleep/a;", "allAppSetting", "Ljava/util/concurrent/ExecutorService;", "kotlin.jvm.PlatformType", "b", "Ljava/util/concurrent/ExecutorService;", "taskExecutor", "<init>", "()V", "device_data_sync_impl_release"}, k = 1, mv = {1, 8, 0})
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

        public b(Function1 function) {
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

    static {
        SleepModeManager sleepModeManager = new SleepModeManager();
        INSTANCE = sleepModeManager;
        allAppSetting = new com.heytap.device.sleep.a();
        taskExecutor = zq8.e("SleepMode");
        a7b.f(TAG, "SleepModeManager init");
        sleepModeManager.j();
        rp.a(b78.a());
        fp6.i(b78.a());
        sleepModeManager.p();
    }

    public static final void k() {
        gl4.devicePrimary.nodeApi.a().observeForever(new b(new Function1<OobeStatusBean, Unit>() { // from class: com.heytap.device.sleep.SleepModeManager$addDeviceListener$1$1
            @Override // p010kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(OobeStatusBean oobeStatusBean) {
                invoke2(oobeStatusBean);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(OobeStatusBean oobeStatusBean) {
                a7b.f(SleepModeManager.TAG, "Oobe status = " + oobeStatusBean);
                if (oobeStatusBean.isOobeFinish() && joh.e()) {
                    SleepModeManager sleepModeManager = SleepModeManager.INSTANCE;
                    sleepModeManager.A();
                    sleepModeManager.z();
                }
            }
        }));
    }

    public static final void m(Function0 action) {
        Intrinsics.checkNotNullParameter(action, "$action");
        action.invoke();
    }

    public static final void y(Function0 block) {
        Object objM5287constructorimpl;
        Intrinsics.checkNotNullParameter(block, "$block");
        try {
            Result.Companion companion = Result.INSTANCE;
            block.invoke();
            objM5287constructorimpl = Result.m5287constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5287constructorimpl = Result.m5287constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM5290exceptionOrNullimpl = Result.m5290exceptionOrNullimpl(objM5287constructorimpl);
        if (thM5290exceptionOrNullimpl == null) {
            return;
        }
        a7b.f(TAG, "Sleep mode run task error:" + thM5290exceptionOrNullimpl);
    }

    public final void A() {
        x(new Function0<Unit>() { // from class: com.heytap.device.sleep.SleepModeManager$syncSettingToDevice$1
            @Override // p010kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                a7b.f(SleepModeManager.TAG, "Start sync all sleep setting to device");
                a aVarN = SleepModeManager.INSTANCE.n();
                if (!joh.e()) {
                    a7b.f(SleepModeManager.TAG, "Sync sleep setting cancel, device not support");
                    return;
                }
                SleepModeBTRepository.Companion companion = SleepModeBTRepository.INSTANCE;
                companion.m(aVarN.getBedTimeRemind());
                companion.r(aVarN.getStayUpRemind());
                companion.l(aVarN.getIsCloseMusic());
                companion.q(aVarN.getUserRestSetting());
                if (joh.h()) {
                    companion.p(aVarN.getSleepGoal());
                }
            }
        });
    }

    public final void j() {
        ThreadUtils.doInUiThread(new Runnable() { // from class: com.oplus.aiunit.vision.skh
            @Override // java.lang.Runnable
            public final void run() {
                SleepModeManager.k();
            }
        });
    }

    public final void l(final Function0<Unit> action) {
        ThreadUtils.doInBackground("SleepSetSync", new Runnable() { // from class: com.oplus.aiunit.vision.rkh
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
        a7b.f(TAG, "Call init sleep mode manager");
    }

    public final void p() {
        Context contextA = b78.a();
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

                    @Override // p010kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        SleepModeManager.INSTANCE.v(SportHealthSetting.valueOf(stringExtra));
                    }
                });
            }
        };
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(SleepModeRepository.ACTION_SLEEP_SETTING_CHANGED);
        rdf.a(contextA, broadcastReceiver, intentFilter, 4);
    }

    public final boolean q(int sleepModeChangeTime) {
        return v9g.w().y(ad5.SP_KEY_SLEEP_MODE_LINKED_PHONE_ZEN_MODE_TIME) == sleepModeChangeTime;
    }

    public final void r(boolean isOpen, int updateTime) {
        a7b.f(TAG, "Sleep mode linkage phone zen mode，isOpen=" + isOpen + " updateTime=" + updateTime);
        DoNotDisturbManager.INSTANCE.s(isOpen, updateTime, true);
    }

    public final void s(SleepModelSettings deviceSetting) throws InterruptedException {
        boolean z;
        SleepModelSettings sleepModeSetting = n().getSleepModeSetting();
        a7b.f(TAG, "mergeSleepSetting appSetting:" + sleepModeSetting + "\ndeviceSetting:" + deviceSetting);
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
            a7b.f(TAG, "Device and App sleep mode is same");
        } else {
            SleepModeRepository.INSTANCE.q(sleepModeSetting);
            w(SportHealthSetting.SLEEP_MODEL_SETTINGS, SleepModeRepository.ACTION_SLEEP_SETTING_CHANGED_FROM_TP);
        }
    }

    public final void t(SleepModelSettings deviceSetting) throws InterruptedException {
        s(deviceSetting);
        if (!n().getSleepModeSetting().isSyncSleepMode()) {
            a7b.f(TAG, "On device sleep mode data, but sync zenMode is close");
            return;
        }
        a7b.f(TAG, "Linkage phone zen mode, enable=" + deviceSetting.isStartNow() + ", time=" + ((int) deviceSetting.getTimestamp()));
        int timestamp = (int) deviceSetting.getTimestamp();
        if (DoNotDisturbRepository.INSTANCE.e()) {
            r(deviceSetting.isStartNow(), timestamp);
            return;
        }
        if (!q(timestamp)) {
            r(deviceSetting.isStartNow(), timestamp);
            v9g.w().S(ad5.SP_KEY_SLEEP_MODE_LINKED_PHONE_ZEN_MODE_TIME, timestamp);
        } else {
            a7b.f(TAG, "Device sleep mode already changed phone zen mode, changeTime=" + timestamp);
        }
    }

    public final void u(@NotNull MessageEvent msg) {
        Object objM5287constructorimpl;
        Intrinsics.checkNotNullParameter(msg, "msg");
        FitnessProto$SleepModelSetting from = null;
        try {
            Result.Companion companion = Result.INSTANCE;
            from = FitnessProto$SleepModelSetting.parseFrom(msg.getData());
            a7b.f(TAG, "On receive sleep mode msg, cid=" + msg.getCommandId() + ", data=" + a1e.b(from));
            objM5287constructorimpl = Result.m5287constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5287constructorimpl = Result.m5287constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM5290exceptionOrNullimpl = Result.m5290exceptionOrNullimpl(objM5287constructorimpl);
        if (thM5290exceptionOrNullimpl != null) {
            a7b.f(TAG, "On receive sleep mode msg, parse fail:" + thM5290exceptionOrNullimpl);
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

                        @Override // p010kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() throws InterruptedException {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() throws InterruptedException {
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

                @Override // p010kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() throws InterruptedException {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() throws InterruptedException {
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

            @Override // p010kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() throws InterruptedException {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() throws InterruptedException {
                SleepModeBTRepository.Companion companion3 = SleepModeBTRepository.INSTANCE;
                if (companion3.k() && commandId == 73) {
                    a7b.f(SleepModeManager.TAG, "Send resp msg to watch free for cid=73");
                    companion3.n();
                }
                SleepModeManager.INSTANCE.t(sleepModelSettingsA);
            }
        });
    }

    public final void v(SportHealthSetting type) {
        boolean zE = joh.e();
        a7b.f(TAG, "On sleep setting changed, type=" + type + ", needSync=" + zE);
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
                if (zE && joh.h()) {
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
        Context contextA = b78.a();
        Intent intent = new Intent(action);
        intent.putExtra("type", type.name());
        intent.setPackage(contextA.getPackageName());
        contextA.sendBroadcast(intent);
    }

    public final void x(final Function0<Unit> block) {
        taskExecutor.execute(new Runnable() { // from class: com.oplus.aiunit.vision.tkh
            @Override // java.lang.Runnable
            public final void run() {
                SleepModeManager.y(block);
            }
        });
    }

    public final void z() {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new SleepModeManager$syncAccordRestOrLinkageZenModeSetting$1(null), 3, null);
    }
}
