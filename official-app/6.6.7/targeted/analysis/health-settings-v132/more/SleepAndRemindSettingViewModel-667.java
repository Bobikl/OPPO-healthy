package com.heytap.health.settings.watch.sporthealthsettings2.sleepsetting.ui;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.SavedStateHandle;
import com.heytap.databaseengine.model.SleepModelSettings;
import com.heytap.device.sleep.ISleepDataService;
import com.heytap.health.base.text.GsonUtil;
import com.heytap.health.device_settings.entity.DeviceParam;
import com.heytap.health.device_settings.health.SportHealthSetting;
import com.heytap.health.device_settings.impl.R;
import com.heytap.health.settings.watch.sporthealthsettings2.sleepsetting.ui.SleepAndRemindSettingViewModel;
import com.heytap.health.settings.watch.sporthealthsettings2.ui.SiestaSettingActivity;
import com.heytap.sporthealth.blib.basic.BasicStateViewModel;
import com.heytap.wsport.data.SleepSettingBean;
import com.lifesense.weidong.lzsimplenetlibs.net.invoker.JsonResponse;
import com.oplus.aiunit.model.SleepSettingDataForUI;
import com.oplus.aiunit.model.byk;
import com.oplus.aiunit.model.fz9;
import com.oplus.aiunit.model.gz9;
import com.oplus.aiunit.model.qrh;
import com.oplus.aiunit.model.wbg;
import com.oplus.aiunit.model.xmd;
import com.oplus.aiunit.vision.e1;
import com.oplus.aiunit.vision.e88;
import com.oplus.aiunit.vision.m8b;
import com.oplus.aiunit.vision.th7;
import com.oplus.aiunit.vision.vgf;
import java.util.LinkedHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes18.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000g\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\b\u0007*\u0001?\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\bC\u0010DJ\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004J\u001b\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0096@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eJ\u001b\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0012J\u001b\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0012J\u001b\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0012J\u000e\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0016J\u001b\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u0012J\u000e\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0016J\u000e\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0016J\u000e\u0010\u001c\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nJ\u001a\u0010 \u001a\u00020\f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001f\u001a\u00020\u0016H\u0016J\b\u0010!\u001a\u00020\fH\u0014J\u0010\u0010\"\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010%\u001a\u00020\u00022\u0006\u0010$\u001a\u00020#H\u0002J,\u0010+\u001a\u00020\f2\u0006\u0010&\u001a\u00020\u001d2\u0006\u0010(\u001a\u00020'2\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\f0)H\u0002J,\u0010.\u001a\u00020\f2\u0006\u0010,\u001a\u00020\u001d2\u0006\u0010\u000f\u001a\u00020\u000e2\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\f0)H\u0002J,\u00100\u001a\u00020\f2\u0006\u0010,\u001a\u00020\u001d2\u0006\u0010/\u001a\u00020'2\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\f0)H\u0002J\b\u00101\u001a\u00020\fH\u0002R\u0014\u00104\u001a\u00020'8\u0002X\u0082D¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u00108\u001a\u0002058\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b6\u00107R\u0018\u0010;\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010>\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010B\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010A\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006E"}, d2 = {"Lcom/heytap/health/settings/watch/sporthealthsettings2/sleepsetting/ui/SleepAndRemindSettingViewModel;", "Lcom/heytap/sporthealth/blib/basic/BasicStateViewModel;", "Lcom/oplus/aiunit/vision/jrh;", "Lcom/oplus/aiunit/vision/gz9;", "Landroidx/lifecycle/SavedStateHandle;", "stateHandle", "Lcom/heytap/health/device_settings/entity/DeviceParam;", "x0", "J", "(Landroidx/lifecycle/SavedStateHandle;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/content/Context;", "context", "", "A0", "", "enable", "i0", "h0", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "r0", "j0", "u0", "", "time", "v0", "s0", "t0", "k0", "y0", "Lcom/heytap/health/device_settings/health/SportHealthSetting;", "item", JsonResponse.PROTOCOL_JSON_KEY_RET, "g", "onCleared", "z0", "Lcom/heytap/wsport/data/SleepSettingBean;", "bean", "w0", "type", "", JsonResponse.PROTOCOL_JSON_KEY_DATA, "Lkotlin/Function1;", "action", "n0", "settingItem", xmd.SUCCESS, "m0", "value", "p0", "B0", "o", "Ljava/lang/String;", "TAG", "Lcom/oplus/aiunit/vision/qrh;", "p", "Lcom/oplus/aiunit/vision/qrh;", "sleepSettingMgr", "q", "Lcom/heytap/health/device_settings/entity/DeviceParam;", "deviceParam", "r", "Z", "isReceiverRegistered", "com/heytap/health/settings/watch/sporthealthsettings2/sleepsetting/ui/SleepAndRemindSettingViewModel$sleepSettingChangedReceiver$1", "s", "Lcom/heytap/health/settings/watch/sporthealthsettings2/sleepsetting/ui/SleepAndRemindSettingViewModel$sleepSettingChangedReceiver$1;", "sleepSettingChangedReceiver", "<init>", "(Landroidx/lifecycle/SavedStateHandle;)V", "device_settings_impl_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSleepAndRemindViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SleepAndRemindViewModel.kt\ncom/heytap/health/settings/watch/sporthealthsettings2/sleepsetting/ui/SleepAndRemindSettingViewModel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,411:1\n1#2:412\n314#3,11:413\n314#3,11:424\n314#3,11:435\n314#3,11:446\n314#3,11:457\n*S KotlinDebug\n*F\n+ 1 SleepAndRemindViewModel.kt\ncom/heytap/health/settings/watch/sporthealthsettings2/sleepsetting/ui/SleepAndRemindSettingViewModel\n*L\n164#1:413,11\n193#1:424,11\n219#1:435,11\n238#1:446,11\n272#1:457,11\n*E\n"})
public final class SleepAndRemindSettingViewModel extends BasicStateViewModel<SleepSettingDataForUI> implements gz9 {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    public final String TAG;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public qrh sleepSettingMgr;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @Nullable
    public DeviceParam deviceParam;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    public volatile boolean isReceiverRegistered;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @NotNull
    public final SleepAndRemindSettingViewModel$sleepSettingChangedReceiver$1 sleepSettingChangedReceiver;

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\b"}, d2 = {"com/heytap/health/settings/watch/sporthealthsettings2/sleepsetting/ui/SleepAndRemindSettingViewModel$a", "Lcom/oplus/aiunit/vision/gz9;", "Lcom/heytap/health/device_settings/health/SportHealthSetting;", "item", "", JsonResponse.PROTOCOL_JSON_KEY_RET, "", "g", "device_settings_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class a implements gz9 {
        public final /* synthetic */ Function1<Integer, Unit> i;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Function1<? super Integer, Unit> function1) {
            this.i = function1;
        }

        @Override // com.oplus.aiunit.model.gz9
        public void g(@NotNull SportHealthSetting item, int code) {
            Intrinsics.checkNotNullParameter(item, "item");
            this.i.invoke(Integer.valueOf(code));
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, d2 = {"com/heytap/health/settings/watch/sporthealthsettings2/sleepsetting/ui/SleepAndRemindSettingViewModel$b", "Lcom/oplus/aiunit/vision/fz9;", "", "onLoadComplete", "device_settings_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class b implements fz9 {
        public final /* synthetic */ CountDownLatch a;
        public final /* synthetic */ SleepAndRemindSettingViewModel b;

        public b(CountDownLatch countDownLatch, SleepAndRemindSettingViewModel sleepAndRemindSettingViewModel) {
            this.a = countDownLatch;
            this.b = sleepAndRemindSettingViewModel;
        }

        @Override // com.oplus.aiunit.model.fz9
        public void onLoadComplete() {
            this.a.countDown();
            qrh qrhVar = this.b.sleepSettingMgr;
            if (qrhVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("sleepSettingMgr");
                qrhVar = null;
            }
            qrhVar.E(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r4v2, types: [android.content.BroadcastReceiver, com.heytap.health.settings.watch.sporthealthsettings2.sleepsetting.ui.SleepAndRemindSettingViewModel$sleepSettingChangedReceiver$1] */
    public SleepAndRemindSettingViewModel(@NotNull SavedStateHandle savedStateHandle) {
        super(savedStateHandle);
        Intrinsics.checkNotNullParameter(savedStateHandle, "stateHandle");
        this.TAG = "Sleep-Setting";
        ?? r4 = new BroadcastReceiver() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.sleepsetting.ui.SleepAndRemindSettingViewModel$sleepSettingChangedReceiver$1
            @Override // android.content.BroadcastReceiver
            public void onReceive(@Nullable Context context, @Nullable Intent intent) {
                if (intent != null) {
                    if (this.a.sleepSettingMgr == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("sleepSettingMgr");
                    }
                    String stringExtra = intent.getStringExtra("type");
                    if (stringExtra != null) {
                        qrh qrhVar = this.a.sleepSettingMgr;
                        if (qrhVar == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("sleepSettingMgr");
                            qrhVar = null;
                        }
                        qrhVar.y(SportHealthSetting.valueOf(stringExtra), true);
                    }
                }
            }
        };
        this.sleepSettingChangedReceiver = r4;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.heytap.health.ACTION_SLEEP_SETTING_CHANGED_FROM_TP");
        vgf.a(e88.a(), (BroadcastReceiver) r4, intentFilter, 4);
        this.isReceiverRegistered = true;
    }

    public static final void q0(SleepAndRemindSettingViewModel sleepAndRemindSettingViewModel, Function1 function1, SportHealthSetting sportHealthSetting, int i) {
        Intrinsics.checkNotNullParameter(sleepAndRemindSettingViewModel, "this$0");
        Intrinsics.checkNotNullParameter(function1, "$action");
        Intrinsics.checkNotNullParameter(sportHealthSetting, "type");
        m8b.f(sleepAndRemindSettingViewModel.TAG, "Change setting result, code=" + i + ", type=" + sportHealthSetting);
        function1.invoke(Integer.valueOf(i));
    }

    public final void A0(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intent intent = new Intent(context, (Class<?>) SiestaSettingActivity.class);
        intent.putExtra("setting_device_params", (Parcelable) this.deviceParam);
        context.startActivity(intent);
    }

    public final void B0() {
        Y(new Function1<SleepSettingDataForUI, SleepSettingDataForUI>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.sleepsetting.ui.SleepAndRemindSettingViewModel$updateRestCount$1
            {
                super(1);
            }

            @NotNull
            public final SleepSettingDataForUI invoke(@NotNull SleepSettingDataForUI sleepSettingDataForUI) {
                Intrinsics.checkNotNullParameter(sleepSettingDataForUI, "$this$update");
                qrh qrhVar = this.this$0.sleepSettingMgr;
                if (qrhVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("sleepSettingMgr");
                    qrhVar = null;
                }
                sleepSettingDataForUI.u(qrhVar.o().f().getSleepRests().size());
                return sleepSettingDataForUI;
            }
        });
    }

    @Nullable
    public Object J(@NotNull SavedStateHandle savedStateHandle, @NotNull Continuation<? super SleepSettingDataForUI> continuation) {
        z0(savedStateHandle);
        CountDownLatch countDownLatch = new CountDownLatch(1);
        qrh qrhVar = this.sleepSettingMgr;
        qrh qrhVar2 = null;
        if (qrhVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sleepSettingMgr");
            qrhVar = null;
        }
        qrhVar.g(new b(countDownLatch, this));
        try {
            Result.Companion companion = Result.Companion;
            Result.constructor-impl(Boxing.boxBoolean(countDownLatch.await(5L, TimeUnit.SECONDS)));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Result.constructor-impl(ResultKt.createFailure(th));
        }
        qrh qrhVar3 = this.sleepSettingMgr;
        if (qrhVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sleepSettingMgr");
        } else {
            qrhVar2 = qrhVar3;
        }
        SleepSettingBean sleepSettingBeanO = qrhVar2.o();
        Intrinsics.checkNotNullExpressionValue(sleepSettingBeanO, "sleepSettingMgr.sleepSettingBean");
        return w0(sleepSettingBeanO);
    }

    @Override // com.oplus.aiunit.model.gz9
    public void g(@Nullable SportHealthSetting item, int code) {
        if (item == SportHealthSetting.USER_REST_NEW) {
            m8b.f(this.TAG, "Sleep setting page receive use rest changed");
            B0();
            return;
        }
        if (item == SportHealthSetting.SLEEP_MODEL_SETTINGS) {
            String str = this.TAG;
            qrh qrhVar = this.sleepSettingMgr;
            if (qrhVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("sleepSettingMgr");
                qrhVar = null;
            }
            m8b.f(str, "Update sleep mode sync state=" + qrhVar.o().e().isSyncSleepMode());
            Y(new Function1<SleepSettingDataForUI, SleepSettingDataForUI>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.sleepsetting.ui.SleepAndRemindSettingViewModel$onSleepSettingChanged$1
                {
                    super(1);
                }

                @NotNull
                public final SleepSettingDataForUI invoke(@NotNull SleepSettingDataForUI sleepSettingDataForUI) {
                    Intrinsics.checkNotNullParameter(sleepSettingDataForUI, "$this$update");
                    qrh qrhVar2 = this.this$0.sleepSettingMgr;
                    if (qrhVar2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("sleepSettingMgr");
                        qrhVar2 = null;
                    }
                    sleepSettingDataForUI.t(qrhVar2.o().e().isSyncSleepMode());
                    return sleepSettingDataForUI;
                }
            });
        }
    }

    @Nullable
    public final Object h0(final boolean z, @NotNull Continuation<? super Boolean> continuation) {
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        qrh qrhVar = this.sleepSettingMgr;
        qrh qrhVar2 = null;
        if (qrhVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sleepSettingMgr");
            qrhVar = null;
        }
        if (qrhVar.o().f().getSleepRests().isEmpty() && z) {
            th7.l(R.string.device_settings_rest_non);
            Result.Companion companion = Result.Companion;
            cancellableContinuationImpl.resumeWith(Result.constructor-impl(Boxing.boxBoolean(false)));
        } else {
            qrh qrhVar3 = this.sleepSettingMgr;
            if (qrhVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("sleepSettingMgr");
            } else {
                qrhVar2 = qrhVar3;
            }
            final SleepModelSettings sleepModelSettingsClone = qrhVar2.o().e().clone();
            Intrinsics.checkNotNullExpressionValue(sleepModelSettingsClone, "sleepSettingMgr.sleepSet…sleepModeSettings.clone()");
            sleepModelSettingsClone.setAccordRestSwitch(byk.d(z));
            sleepModelSettingsClone.setTimestamp(System.currentTimeMillis() / 1000);
            String dbJSON = sleepModelSettingsClone.toDbJSON();
            SportHealthSetting sportHealthSetting = SportHealthSetting.SLEEP_MODEL_SETTINGS;
            Intrinsics.checkNotNullExpressionValue(dbJSON, "jsonData");
            p0(sportHealthSetting, dbJSON, new Function1<Integer, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.sleepsetting.ui.SleepAndRemindSettingViewModel$changeAccordRestSwitch$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke(((Number) obj).intValue());
                    return Unit.INSTANCE;
                }

                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                public final void invoke(int i) {
                    if (i != 0) {
                        CancellableContinuation<Boolean> cancellableContinuation = cancellableContinuationImpl;
                        Result.Companion companion2 = Result.Companion;
                        cancellableContinuation.resumeWith(Result.constructor-impl(Boolean.FALSE));
                        return;
                    }
                    qrh qrhVar4 = this.this$0.sleepSettingMgr;
                    if (qrhVar4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("sleepSettingMgr");
                        qrhVar4 = null;
                    }
                    qrhVar4.o().e().setAccordRestSwitch(sleepModelSettingsClone.getAccordRestSwitch());
                    qrh qrhVar5 = this.this$0.sleepSettingMgr;
                    if (qrhVar5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("sleepSettingMgr");
                        qrhVar5 = null;
                    }
                    qrhVar5.o().e().setTimestamp(sleepModelSettingsClone.getTimestamp());
                    Object objNavigation = e1.d().b("/device_data_sync/SleepDataServiceImpl").navigation();
                    ISleepDataService iSleepDataService = objNavigation instanceof ISleepDataService ? (ISleepDataService) objNavigation : null;
                    if (iSleepDataService != null) {
                        iSleepDataService.Z4(sleepModelSettingsClone.getTimestamp());
                    }
                    SleepAndRemindSettingViewModel sleepAndRemindSettingViewModel = this.this$0;
                    final boolean z2 = z;
                    sleepAndRemindSettingViewModel.Y(new Function1<SleepSettingDataForUI, SleepSettingDataForUI>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.sleepsetting.ui.SleepAndRemindSettingViewModel$changeAccordRestSwitch$2$1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @NotNull
                        public final SleepSettingDataForUI invoke(@NotNull SleepSettingDataForUI sleepSettingDataForUI) {
                            Intrinsics.checkNotNullParameter(sleepSettingDataForUI, "$this$update");
                            sleepSettingDataForUI.q(z2);
                            return sleepSettingDataForUI;
                        }
                    });
                    wbg.Companion.c(z ? 1 : 0);
                    CancellableContinuation<Boolean> cancellableContinuation2 = cancellableContinuationImpl;
                    Result.Companion companion3 = Result.Companion;
                    cancellableContinuation2.resumeWith(Result.constructor-impl(Boolean.TRUE));
                }
            });
        }
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    public final boolean i0(boolean enable) {
        return false;
    }

    @Nullable
    public final Object j0(final boolean z, @NotNull Continuation<? super Boolean> continuation) {
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        qrh qrhVar = this.sleepSettingMgr;
        if (qrhVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sleepSettingMgr");
            qrhVar = null;
        }
        if (qrhVar.o().f().getSleepRests().isEmpty()) {
            th7.l(R.string.device_settings_rest_non);
            Result.Companion companion = Result.Companion;
            cancellableContinuationImpl.resumeWith(Result.constructor-impl(Boxing.boxBoolean(false)));
        } else {
            m0(SportHealthSetting.BED_TIME_SWITCH, z, new Function1<Integer, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.sleepsetting.ui.SleepAndRemindSettingViewModel$changeBedRemind$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke(((Number) obj).intValue());
                    return Unit.INSTANCE;
                }

                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                public final void invoke(int i) {
                    m8b.f(this.this$0.TAG, "changeBedRemind ->" + i);
                    if (i != 0) {
                        CancellableContinuation<Boolean> cancellableContinuation = cancellableContinuationImpl;
                        Result.Companion companion2 = Result.Companion;
                        cancellableContinuation.resumeWith(Result.constructor-impl(Boolean.FALSE));
                        return;
                    }
                    SleepAndRemindSettingViewModel sleepAndRemindSettingViewModel = this.this$0;
                    final boolean z2 = z;
                    sleepAndRemindSettingViewModel.Y(new Function1<SleepSettingDataForUI, SleepSettingDataForUI>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.sleepsetting.ui.SleepAndRemindSettingViewModel$changeBedRemind$2$1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @NotNull
                        public final SleepSettingDataForUI invoke(@NotNull SleepSettingDataForUI sleepSettingDataForUI) {
                            Intrinsics.checkNotNullParameter(sleepSettingDataForUI, "$this$update");
                            sleepSettingDataForUI.r(z2);
                            return sleepSettingDataForUI;
                        }
                    });
                    wbg.Companion.n(z ? 1 : 0);
                    CancellableContinuation<Boolean> cancellableContinuation2 = cancellableContinuationImpl;
                    Result.Companion companion3 = Result.Companion;
                    cancellableContinuation2.resumeWith(Result.constructor-impl(Boolean.TRUE));
                }
            });
        }
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    public final void k0(final int time) {
        qrh qrhVar = this.sleepSettingMgr;
        if (qrhVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sleepSettingMgr");
            qrhVar = null;
        }
        if (qrhVar.o().a().getRemindTime() == time) {
            return;
        }
        String strO = byk.o(time);
        SportHealthSetting sportHealthSetting = SportHealthSetting.BED_TIME;
        Intrinsics.checkNotNullExpressionValue(strO, "value");
        p0(sportHealthSetting, strO, new Function1<Integer, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.sleepsetting.ui.SleepAndRemindSettingViewModel$changeBedRemindTime$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke(((Number) obj).intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(int i) {
                if (i != 0) {
                    m8b.b(this.this$0.TAG, "Change bed remind time fail, code=" + i);
                    return;
                }
                qrh qrhVar2 = this.this$0.sleepSettingMgr;
                if (qrhVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("sleepSettingMgr");
                    qrhVar2 = null;
                }
                qrhVar2.o().a().setRemindTime(time);
                SleepAndRemindSettingViewModel sleepAndRemindSettingViewModel = this.this$0;
                final int i2 = time;
                sleepAndRemindSettingViewModel.Y(new Function1<SleepSettingDataForUI, SleepSettingDataForUI>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.sleepsetting.ui.SleepAndRemindSettingViewModel$changeBedRemindTime$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @NotNull
                    public final SleepSettingDataForUI invoke(@NotNull SleepSettingDataForUI sleepSettingDataForUI) {
                        Intrinsics.checkNotNullParameter(sleepSettingDataForUI, "$this$update");
                        sleepSettingDataForUI.s(i2);
                        return sleepSettingDataForUI;
                    }
                });
            }
        });
    }

    public final void m0(SportHealthSetting settingItem, boolean enable, Function1<? super Integer, Unit> success) {
        String strE = byk.e(enable);
        Intrinsics.checkNotNullExpressionValue(strE, "value");
        p0(settingItem, strE, success);
    }

    public final void n0(SportHealthSetting type, String data, Function1<? super Integer, Unit> action) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(type, data);
        qrh qrhVar = this.sleepSettingMgr;
        if (qrhVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sleepSettingMgr");
            qrhVar = null;
        }
        qrhVar.i(type, linkedHashMap, new a(action));
    }

    public void onCleared() {
        super.onCleared();
        qrh qrhVar = this.sleepSettingMgr;
        if (qrhVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sleepSettingMgr");
            qrhVar = null;
        }
        qrhVar.F(this);
        if (this.isReceiverRegistered) {
            vgf.c(e88.a(), this.sleepSettingChangedReceiver);
            this.isReceiverRegistered = false;
        }
    }

    public final void p0(SportHealthSetting settingItem, String value, final Function1<? super Integer, Unit> action) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(settingItem, value);
        m8b.f(this.TAG, "Change sleep setting, type=" + settingItem + " value=" + value);
        qrh qrhVar = this.sleepSettingMgr;
        if (qrhVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sleepSettingMgr");
            qrhVar = null;
        }
        qrhVar.C(settingItem, linkedHashMap, new gz9() { // from class: com.oplus.aiunit.vision.hch
            @Override // com.oplus.aiunit.model.gz9
            public final void g(SportHealthSetting sportHealthSetting, int i) {
                SleepAndRemindSettingViewModel.q0(this.i, action, sportHealthSetting, i);
            }
        });
    }

    @Nullable
    public final Object r0(final boolean z, @NotNull Continuation<? super Boolean> continuation) {
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        qrh qrhVar = this.sleepSettingMgr;
        if (qrhVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sleepSettingMgr");
            qrhVar = null;
        }
        final SleepModelSettings sleepModelSettingsClone = qrhVar.o().e().clone();
        Intrinsics.checkNotNullExpressionValue(sleepModelSettingsClone, "sleepSettingMgr.sleepSet…sleepModeSettings.clone()");
        sleepModelSettingsClone.setStateSync(z ? 1 : 0);
        sleepModelSettingsClone.setStateSyncUpdateTime(System.currentTimeMillis() / 1000);
        SportHealthSetting sportHealthSetting = SportHealthSetting.SLEEP_MODEL_SETTINGS;
        String strE = GsonUtil.e(sleepModelSettingsClone);
        Intrinsics.checkNotNullExpressionValue(strE, "sleepModeJsonData");
        p0(sportHealthSetting, strE, new Function1<Integer, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.sleepsetting.ui.SleepAndRemindSettingViewModel$changePhoneZenModeLinkage$2$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke(((Number) obj).intValue());
                return Unit.INSTANCE;
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            public final void invoke(int i) {
                if (i != 0) {
                    CancellableContinuation<Boolean> cancellableContinuation = cancellableContinuationImpl;
                    Result.Companion companion = Result.Companion;
                    cancellableContinuation.resumeWith(Result.constructor-impl(Boolean.FALSE));
                    return;
                }
                qrh qrhVar2 = this.this$0.sleepSettingMgr;
                if (qrhVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("sleepSettingMgr");
                    qrhVar2 = null;
                }
                qrhVar2.o().e().setStateSync(sleepModelSettingsClone.getStateSync());
                qrh qrhVar3 = this.this$0.sleepSettingMgr;
                if (qrhVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("sleepSettingMgr");
                    qrhVar3 = null;
                }
                qrhVar3.o().e().setStateSyncUpdateTime(sleepModelSettingsClone.getStateSyncUpdateTime());
                Object objNavigation = e1.d().b("/device_data_sync/SleepDataServiceImpl").navigation();
                ISleepDataService iSleepDataService = objNavigation instanceof ISleepDataService ? (ISleepDataService) objNavigation : null;
                if (iSleepDataService != null) {
                    iSleepDataService.X5(sleepModelSettingsClone.getStateSyncUpdateTime());
                }
                SleepAndRemindSettingViewModel sleepAndRemindSettingViewModel = this.this$0;
                final boolean z2 = z;
                sleepAndRemindSettingViewModel.Y(new Function1<SleepSettingDataForUI, SleepSettingDataForUI>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.sleepsetting.ui.SleepAndRemindSettingViewModel$changePhoneZenModeLinkage$2$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @NotNull
                    public final SleepSettingDataForUI invoke(@NotNull SleepSettingDataForUI sleepSettingDataForUI) {
                        Intrinsics.checkNotNullParameter(sleepSettingDataForUI, "$this$update");
                        sleepSettingDataForUI.t(z2);
                        return sleepSettingDataForUI;
                    }
                });
                wbg.Companion.M(z ? 1 : 0);
                CancellableContinuation<Boolean> cancellableContinuation2 = cancellableContinuationImpl;
                Result.Companion companion2 = Result.Companion;
                cancellableContinuation2.resumeWith(Result.constructor-impl(Boolean.TRUE));
            }
        });
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    @Nullable
    public final Object s0(final boolean z, @NotNull Continuation<? super Boolean> continuation) {
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        m0(SportHealthSetting.CLOSE_MUSIC, z, new Function1<Integer, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.sleepsetting.ui.SleepAndRemindSettingViewModel$changeSleepCloseMusic$2$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke(((Number) obj).intValue());
                return Unit.INSTANCE;
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            public final void invoke(int i) {
                if (i != 0) {
                    CancellableContinuation<Boolean> cancellableContinuation = cancellableContinuationImpl;
                    Result.Companion companion = Result.Companion;
                    cancellableContinuation.resumeWith(Result.constructor-impl(Boolean.FALSE));
                    return;
                }
                SleepAndRemindSettingViewModel sleepAndRemindSettingViewModel = this.this$0;
                final boolean z2 = z;
                sleepAndRemindSettingViewModel.Y(new Function1<SleepSettingDataForUI, SleepSettingDataForUI>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.sleepsetting.ui.SleepAndRemindSettingViewModel$changeSleepCloseMusic$2$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @NotNull
                    public final SleepSettingDataForUI invoke(@NotNull SleepSettingDataForUI sleepSettingDataForUI) {
                        Intrinsics.checkNotNullParameter(sleepSettingDataForUI, "$this$update");
                        sleepSettingDataForUI.A(z2);
                        return sleepSettingDataForUI;
                    }
                });
                wbg.Companion.u0(z ? 1 : 0);
                CancellableContinuation<Boolean> cancellableContinuation2 = cancellableContinuationImpl;
                Result.Companion companion2 = Result.Companion;
                cancellableContinuation2.resumeWith(Result.constructor-impl(Boolean.TRUE));
            }
        });
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    public final void t0(final int time) {
        String strO = byk.o(time);
        SportHealthSetting sportHealthSetting = SportHealthSetting.SLEEP_GOAL;
        Intrinsics.checkNotNullExpressionValue(strO, "value");
        p0(sportHealthSetting, strO, new Function1<Integer, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.sleepsetting.ui.SleepAndRemindSettingViewModel$changeSleepGoal$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke(((Number) obj).intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(int i) {
                if (i != 0) {
                    m8b.b(this.this$0.TAG, "Change sleep goal time fail, code=" + i);
                    return;
                }
                qrh qrhVar = this.this$0.sleepSettingMgr;
                if (qrhVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("sleepSettingMgr");
                    qrhVar = null;
                }
                qrhVar.o().d().setSleepGoalTime(time);
                SleepAndRemindSettingViewModel sleepAndRemindSettingViewModel = this.this$0;
                final int i2 = time;
                sleepAndRemindSettingViewModel.Y(new Function1<SleepSettingDataForUI, SleepSettingDataForUI>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.sleepsetting.ui.SleepAndRemindSettingViewModel$changeSleepGoal$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @NotNull
                    public final SleepSettingDataForUI invoke(@NotNull SleepSettingDataForUI sleepSettingDataForUI) {
                        Intrinsics.checkNotNullParameter(sleepSettingDataForUI, "$this$update");
                        sleepSettingDataForUI.B(i2);
                        return sleepSettingDataForUI;
                    }
                });
            }
        });
    }

    @Nullable
    public final Object u0(final boolean z, @NotNull Continuation<? super Boolean> continuation) {
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        SportHealthSetting sportHealthSetting = SportHealthSetting.STAY_UP_BED_TIME_SWITCH;
        String strE = byk.e(z);
        Intrinsics.checkNotNullExpressionValue(strE, "boolToString(enable)");
        n0(sportHealthSetting, strE, new Function1<Integer, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.sleepsetting.ui.SleepAndRemindSettingViewModel$changeStayUpRemind$2$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke(((Number) obj).intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(int i) {
                if (i != 0) {
                    CancellableContinuation<Boolean> cancellableContinuation = cancellableContinuationImpl;
                    Result.Companion companion = Result.Companion;
                    cancellableContinuation.resumeWith(Result.constructor-impl(Boolean.FALSE));
                    return;
                }
                qrh qrhVar = this.this$0.sleepSettingMgr;
                if (qrhVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("sleepSettingMgr");
                    qrhVar = null;
                }
                qrhVar.o().g().setRemindSwitch(byk.d(z));
                SleepAndRemindSettingViewModel sleepAndRemindSettingViewModel = this.this$0;
                final boolean z2 = z;
                sleepAndRemindSettingViewModel.Y(new Function1<SleepSettingDataForUI, SleepSettingDataForUI>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.sleepsetting.ui.SleepAndRemindSettingViewModel$changeStayUpRemind$2$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @NotNull
                    public final SleepSettingDataForUI invoke(@NotNull SleepSettingDataForUI sleepSettingDataForUI) {
                        Intrinsics.checkNotNullParameter(sleepSettingDataForUI, "$this$update");
                        sleepSettingDataForUI.C(z2);
                        return sleepSettingDataForUI;
                    }
                });
                CancellableContinuation<Boolean> cancellableContinuation2 = cancellableContinuationImpl;
                Result.Companion companion2 = Result.Companion;
                cancellableContinuation2.resumeWith(Result.constructor-impl(Boolean.TRUE));
            }
        });
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    public final void v0(final int time) {
        SportHealthSetting sportHealthSetting = SportHealthSetting.STAY_UP_BED_TIME;
        String strO = byk.o(time);
        Intrinsics.checkNotNullExpressionValue(strO, "intToString(time)");
        n0(sportHealthSetting, strO, new Function1<Integer, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.sleepsetting.ui.SleepAndRemindSettingViewModel$changeStayUpRemindTime$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke(((Number) obj).intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(int i) {
                if (i != 0) {
                    m8b.b(this.this$0.TAG, "Change stay up time fail, code=" + i);
                    return;
                }
                qrh qrhVar = this.this$0.sleepSettingMgr;
                if (qrhVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("sleepSettingMgr");
                    qrhVar = null;
                }
                qrhVar.o().g().setRemindTime(time);
                SleepAndRemindSettingViewModel sleepAndRemindSettingViewModel = this.this$0;
                final int i2 = time;
                sleepAndRemindSettingViewModel.Y(new Function1<SleepSettingDataForUI, SleepSettingDataForUI>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.sleepsetting.ui.SleepAndRemindSettingViewModel$changeStayUpRemindTime$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @NotNull
                    public final SleepSettingDataForUI invoke(@NotNull SleepSettingDataForUI sleepSettingDataForUI) {
                        Intrinsics.checkNotNullParameter(sleepSettingDataForUI, "$this$update");
                        sleepSettingDataForUI.D(i2);
                        return sleepSettingDataForUI;
                    }
                });
            }
        });
    }

    public final SleepSettingDataForUI w0(SleepSettingBean bean) {
        SleepSettingDataForUI sleepSettingDataForUI = new SleepSettingDataForUI();
        sleepSettingDataForUI.B(bean.d().getSleepGoalTime());
        sleepSettingDataForUI.s(bean.a().getRemindTime());
        sleepSettingDataForUI.r(bean.a().isEnable());
        sleepSettingDataForUI.q(bean.e().isRestLinkageSleepMode());
        sleepSettingDataForUI.A(bean.i());
        sleepSettingDataForUI.u(bean.f().getSleepRests().size());
        Object objNavigation = e1.d().b("/device_data_sync/SleepDataServiceImpl").navigation();
        ISleepDataService iSleepDataService = objNavigation instanceof ISleepDataService ? (ISleepDataService) objNavigation : null;
        sleepSettingDataForUI.v(iSleepDataService != null && iSleepDataService.y1());
        sleepSettingDataForUI.t(bean.e().isSyncSleepMode());
        sleepSettingDataForUI.w(iSleepDataService != null && iSleepDataService.b9());
        sleepSettingDataForUI.y(iSleepDataService != null && iSleepDataService.i2());
        sleepSettingDataForUI.z(sleepSettingDataForUI.getIsShowStayUp());
        sleepSettingDataForUI.C(bean.g().isEnable());
        sleepSettingDataForUI.D(bean.g().getRemindTime());
        sleepSettingDataForUI.x(iSleepDataService != null ? iSleepDataService.F5() : false);
        m8b.f(this.TAG, "UIData=" + sleepSettingDataForUI);
        return sleepSettingDataForUI;
    }

    @NotNull
    public final DeviceParam x0(@NotNull SavedStateHandle stateHandle) {
        Intrinsics.checkNotNullParameter(stateHandle, "stateHandle");
        Bundle bundle = (Bundle) stateHandle.get("sleep_setting_bundle_key");
        if (bundle != null) {
            Object obj = bundle.get("setting_device_params");
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.heytap.health.device_settings.entity.DeviceParam");
            return (DeviceParam) obj;
        }
        m8b.b(this.TAG, "BaseSleepSetting getDevices  bundle is null ");
        String str = (String) stateHandle.get("currentMac");
        String str2 = (String) stateHandle.get("model");
        String str3 = (String) stateHandle.get("softVersion");
        if (!((TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) ? false : true)) {
            throw new IllegalArgumentException("Sleep Setting need bundle and param key is RouterDataKeys.SLEEP_SETTING_BUNDLE_KEY".toString());
        }
        DeviceParam deviceParam = new DeviceParam();
        deviceParam.deviceMac = str;
        deviceParam.deviceModel = str2;
        deviceParam.deviceVersion = str3;
        return deviceParam;
    }

    public final void y0(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (this.deviceParam != null) {
            Intent intent = new Intent(context, (Class<?>) SleepAllRestActivity.class);
            Bundle bundle = new Bundle();
            bundle.putParcelable("setting_device_params", this.deviceParam);
            intent.putExtra("sleep_setting_bundle_key", bundle);
            context.startActivity(intent);
        }
    }

    public final void z0(SavedStateHandle stateHandle) {
        DeviceParam deviceParamX0 = x0(stateHandle);
        this.deviceParam = deviceParamX0;
        qrh qrhVarM = qrh.m(deviceParamX0.deviceMac);
        Intrinsics.checkNotNullExpressionValue(qrhVarM, "getDefault(params.deviceMac)");
        this.sleepSettingMgr = qrhVarM;
        qrh qrhVar = null;
        if (qrhVarM == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sleepSettingMgr");
            qrhVarM = null;
        }
        qrhVarM.w();
        qrh qrhVar2 = this.sleepSettingMgr;
        if (qrhVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sleepSettingMgr");
        } else {
            qrhVar = qrhVar2;
        }
        qrhVar.h(this);
    }
}