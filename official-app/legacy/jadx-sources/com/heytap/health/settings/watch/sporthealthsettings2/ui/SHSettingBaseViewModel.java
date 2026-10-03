package com.heytap.health.settings.watch.sporthealthsettings2.ui;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.os.BundleCompat;
import androidx.lifecycle.Observer;
import androidx.lifecycle.SavedStateHandle;
import com.heytap.health.base.task.ThreadUtils;
import com.heytap.health.device_settings.entity.DeviceParam;
import com.heytap.health.device_settings.health.SportHealthSetting;
import com.heytap.health.device_settings.impl.R$string;
import com.heytap.health.devicemanager.deviceability.DeviceInfo;
import com.heytap.health.devicemanager.deviceability.DeviceModel;
import com.heytap.health.devicemanager.processor.bean.UserDeviceInfo;
import com.heytap.health.settings.watch.sporthealthsettings2.sleepsetting.ui.SleepSettingViewModel;
import com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingBaseViewModel;
import com.heytap.log.formatter.LogFieldKey;
import com.heytap.sporthealth.blib.basic.BasicStateViewModel;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.gdb;
import com.oplus.aiunit.vision.gl4;
import com.oplus.aiunit.vision.lc5;
import com.oplus.aiunit.vision.qgi;
import com.oplus.aiunit.vision.rg7;
import com.oplus.aiunit.vision.rpc;
import com.oplus.aiunit.vision.sgi;
import java.util.Iterator;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.ResultKt;
import p010kotlin.collections.SetsKt__SetsKt;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.coroutines.jvm.internal.Boxing;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes18.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000w\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001?\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003B\u000f\u0012\u0006\u0010I\u001a\u00020H¢\u0006\u0004\bJ\u0010KJ\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\u0007\u001a\u00020\u0005H\u0016J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0014J\u0006\u0010\f\u001a\u00020\u000bJ\u0006\u0010\u000e\u001a\u00020\rJ\b\u0010\u000f\u001a\u00020\rH\u0016J;\u0010\u0015\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u001c\u0010\u0014\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0012H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0017\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J1\u0010\u001a\u001a\u00020\u00052\u001c\u0010\u0019\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0012H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u0006\u0010\u001c\u001a\u00020\u0005J\u0010\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u0004H\u0016J\b\u0010\u001f\u001a\u00020\rH\u0014J\b\u0010 \u001a\u00020\rH\u0002R\u001a\u0010&\u001a\u00020!8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001b\u0010,\u001a\u00020'8DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u001a\u0010.\u001a\u00020!8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u0010#\u001a\u0004\b\u0001\u0010%R\u0016\u00101\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u001b\u00106\u001a\u0002028DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b3\u0010)\u001a\u0004\b4\u00105R\u001a\u0010:\u001a\b\u0012\u0004\u0012\u000208078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010)R\u001b\u0010>\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b;\u0010)\u001a\u0004\b<\u0010=R\u001a\u0010B\u001a\b\u0012\u0004\u0012\u00028\u00000?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u001b\u0010G\u001a\u0002088DX\u0084\u0084\u0002¢\u0006\f\u001a\u0004\bC\u0010D*\u0004\bE\u0010F\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006L"}, d2 = {"Lcom/heytap/health/settings/watch/sporthealthsettings2/ui/SHSettingBaseViewModel;", "D", "Lcom/heytap/sporthealth/blib/basic/BasicStateViewModel;", "Landroidx/lifecycle/Observer;", "", "", "f0", "p0", "", "Lcom/heytap/health/device_settings/health/SportHealthSetting;", "q0", "Lcom/oplus/aiunit/vision/qgi;", "b0", "", "d0", "K", "", "resultCode", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "data", "t0", "(Ljava/lang/Integer;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "s0", "(Ljava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "run", "e0", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "k0", "value", "onChanged", "onCleared", "n0", "", "o", "Ljava/lang/String;", "j0", "()Ljava/lang/String;", "TAG", "Lcom/heytap/health/device_settings/entity/DeviceParam;", LogFieldKey.PROCESS_NAME_KEY, "Lkotlin/Lazy;", "g0", "()Lcom/heytap/health/device_settings/entity/DeviceParam;", "deviceParam", "q", "mac", "r", "Z", "hasLoadedOnDemandSettings", "Lcom/heytap/health/settings/watch/sporthealthsettings2/ui/SHSettingViewModel;", "s", "h0", "()Lcom/heytap/health/settings/watch/sporthealthsettings2/ui/SHSettingViewModel;", "settingViewModel", "Lkotlin/Lazy;", "Lcom/heytap/health/settings/watch/sporthealthsettings2/sleepsetting/ui/SleepSettingViewModel;", "t", "sleepSettingViewModelDelegate", "u", "m0", "()Z", "isRtosWatch", "com/heytap/health/settings/watch/sporthealthsettings2/ui/SHSettingBaseViewModel$a", "v", "Lcom/heytap/health/settings/watch/sporthealthsettings2/ui/SHSettingBaseViewModel$a;", "handle", "i0", "()Lcom/heytap/health/settings/watch/sporthealthsettings2/sleepsetting/ui/SleepSettingViewModel;", "getSleepSettingViewModel$delegate", "(Lcom/heytap/health/settings/watch/sporthealthsettings2/ui/SHSettingBaseViewModel;)Ljava/lang/Object;", "sleepSettingViewModel", "Landroidx/lifecycle/SavedStateHandle;", "stateHandle", "<init>", "(Landroidx/lifecycle/SavedStateHandle;)V", "device_settings_impl_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSHSettingBaseViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SHSettingBaseViewModel.kt\ncom/heytap/health/settings/watch/sporthealthsettings2/ui/SHSettingBaseViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,202:1\n1855#2,2:203\n*S KotlinDebug\n*F\n+ 1 SHSettingBaseViewModel.kt\ncom/heytap/health/settings/watch/sporthealthsettings2/ui/SHSettingBaseViewModel\n*L\n112#1:203,2\n*E\n"})
public abstract class SHSettingBaseViewModel<D> extends BasicStateViewModel<D> implements Observer<Object> {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    public final String TAG;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    public final Lazy deviceParam;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @NotNull
    public final String mac;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    public boolean hasLoadedOnDemandSettings;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @NotNull
    public final Lazy settingViewModel;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    @NotNull
    public final Lazy<SleepSettingViewModel> sleepSettingViewModelDelegate;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @NotNull
    public final Lazy isRtosWatch;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @NotNull
    public final a handle;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"com/heytap/health/settings/watch/sporthealthsettings2/ui/SHSettingBaseViewModel$a", "Landroid/os/Handler;", "Landroid/os/Message;", "msg", "", "handleMessage", "device_settings_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class a extends Handler {
        public final /* synthetic */ SHSettingBaseViewModel<D> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(SHSettingBaseViewModel<D> sHSettingBaseViewModel, Looper looper) {
            super(looper);
            this.a = sHSettingBaseViewModel;
        }

        @Override // android.os.Handler
        public void handleMessage(@NotNull Message msg) {
            Intrinsics.checkNotNullParameter(msg, "msg");
            a7b.f(this.a.getTAG(), "doRequestSHData --> ");
            this.a.d0();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SHSettingBaseViewModel(@NotNull final SavedStateHandle stateHandle) {
        super(stateHandle);
        Intrinsics.checkNotNullParameter(stateHandle, "stateHandle");
        this.TAG = "SHS=" + this;
        this.deviceParam = LazyKt__LazyJVMKt.lazy(new Function0<DeviceParam>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingBaseViewModel$deviceParam$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p010kotlin.jvm.functions.Function0
            @NotNull
            public final DeviceParam invoke() {
                if (stateHandle.contains("setting_device_params")) {
                    Object obj = stateHandle.get("setting_device_params");
                    Intrinsics.checkNotNull(obj);
                    return (DeviceParam) obj;
                }
                if (stateHandle.contains("sleep_setting_bundle_key")) {
                    Object obj2 = stateHandle.get("sleep_setting_bundle_key");
                    Intrinsics.checkNotNull(obj2);
                    Object parcelable = BundleCompat.getParcelable((Bundle) obj2, "setting_device_params", DeviceParam.class);
                    Intrinsics.checkNotNull(parcelable);
                    Intrinsics.checkNotNullExpressionValue(parcelable, "{\n            //睡眠取值方式不一…            )!!\n        }");
                    return (DeviceParam) parcelable;
                }
                UserDeviceInfo userDeviceInfoJ = gl4.managerApi.j();
                String mac = (String) stateHandle.get("currentMac");
                String firmwareVersion = null;
                if (mac == null) {
                    mac = userDeviceInfoJ != null ? userDeviceInfoJ.getMac() : null;
                }
                String model = (String) stateHandle.get("model");
                if (model == null) {
                    model = userDeviceInfoJ != null ? userDeviceInfoJ.getModel() : null;
                }
                String str = (String) stateHandle.get("softVersion");
                if (str != null) {
                    firmwareVersion = str;
                } else if (userDeviceInfoJ != null) {
                    firmwareVersion = userDeviceInfoJ.getFirmwareVersion();
                }
                if (!TextUtils.isEmpty(mac) && !TextUtils.isEmpty(model) && !TextUtils.isEmpty(firmwareVersion)) {
                    DeviceParam deviceParam = new DeviceParam();
                    deviceParam.deviceMac = mac;
                    deviceParam.deviceModel = model;
                    deviceParam.deviceVersion = firmwareVersion;
                    return deviceParam;
                }
                throw new IllegalArgumentException("Setting page need device params, mac=" + gdb.a(mac) + " model=" + model + "  version=" + firmwareVersion);
            }
        });
        String str = g0().deviceMac;
        Intrinsics.checkNotNullExpressionValue(str, "deviceParam.deviceMac");
        this.mac = str;
        this.settingViewModel = LazyKt__LazyJVMKt.lazy(new Function0<SHSettingViewModel>(this) { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingBaseViewModel$settingViewModel$2
            final /* synthetic */ SHSettingBaseViewModel<D> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p010kotlin.jvm.functions.Function0
            @NotNull
            public final SHSettingViewModel invoke() {
                SHSettingViewModel sHSettingViewModel = new SHSettingViewModel();
                SHSettingBaseViewModel<D> sHSettingBaseViewModel = this.this$0;
                sHSettingViewModel.F(sHSettingBaseViewModel.g0());
                if (sHSettingBaseViewModel.f0() && !sHSettingViewModel.G()) {
                    sHSettingViewModel.K();
                }
                return sHSettingViewModel;
            }
        });
        this.sleepSettingViewModelDelegate = LazyKt__LazyJVMKt.lazy(new Function0<SleepSettingViewModel>(this) { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingBaseViewModel$sleepSettingViewModelDelegate$1
            final /* synthetic */ SHSettingBaseViewModel<D> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p010kotlin.jvm.functions.Function0
            @NotNull
            public final SleepSettingViewModel invoke() {
                SleepSettingViewModel sleepSettingViewModel = new SleepSettingViewModel();
                sleepSettingViewModel.d0(this.this$0.g0());
                sleepSettingViewModel.K();
                return sleepSettingViewModel;
            }
        });
        this.isRtosWatch = LazyKt__LazyJVMKt.lazy(new Function0<Boolean>(this) { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingBaseViewModel$isRtosWatch$2
            final /* synthetic */ SHSettingBaseViewModel<D> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p010kotlin.jvm.functions.Function0
            @NotNull
            public final Boolean invoke() {
                Object objB0 = this.this$0.b0();
                if (objB0 instanceof DeviceInfo) {
                    return Boolean.valueOf(((DeviceInfo) objB0).I9());
                }
                throw new RuntimeException(objB0 + " not is " + DeviceInfo.class.getCanonicalName());
            }
        });
        this.handle = new a(this, Looper.getMainLooper());
    }

    public static final void r0(SHSettingBaseViewModel this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.h0().E().observeForever(this$0);
        this$0.h0().C().observeForever(this$0);
        boolean zP0 = this$0.p0();
        if (zP0) {
            this$0.i0().E().observeForever(this$0);
        }
        if (!this$0.f0()) {
            this$0.n0();
            this$0.d0();
            return;
        }
        boolean zG = this$0.h0().G();
        boolean zG2 = zP0 ? this$0.i0().G() : true;
        a7b.f(this$0.TAG, "doRequestSHData --> observeForever allSettingLoaded:" + zG + " - " + zG2);
        if (zG && zG2) {
            this$0.d0();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static /* synthetic */ Object u0(SHSettingBaseViewModel<D> sHSettingBaseViewModel, Integer num, Function1<? super Continuation<? super D>, ? extends Object> function1, Continuation<? super Boolean> continuation) {
        SHSettingBaseViewModel$updateResultOrNot$1 sHSettingBaseViewModel$updateResultOrNot$1;
        if (continuation instanceof SHSettingBaseViewModel$updateResultOrNot$1) {
            sHSettingBaseViewModel$updateResultOrNot$1 = (SHSettingBaseViewModel$updateResultOrNot$1) continuation;
            int i = sHSettingBaseViewModel$updateResultOrNot$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                sHSettingBaseViewModel$updateResultOrNot$1.label = i - Integer.MIN_VALUE;
            } else {
                sHSettingBaseViewModel$updateResultOrNot$1 = new SHSettingBaseViewModel$updateResultOrNot$1(sHSettingBaseViewModel, continuation);
            }
        } else {
            sHSettingBaseViewModel$updateResultOrNot$1 = new SHSettingBaseViewModel$updateResultOrNot$1(sHSettingBaseViewModel, continuation);
        }
        SHSettingBaseViewModel$updateResultOrNot$1 sHSettingBaseViewModel$updateResultOrNot$2 = sHSettingBaseViewModel$updateResultOrNot$1;
        Object objB = sHSettingBaseViewModel$updateResultOrNot$2.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = sHSettingBaseViewModel$updateResultOrNot$2.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objB);
            SHSettingBaseViewModel$updateResultOrNot$2 sHSettingBaseViewModel$updateResultOrNot$3 = new SHSettingBaseViewModel$updateResultOrNot$2(sHSettingBaseViewModel, num, function1, null);
            sHSettingBaseViewModel$updateResultOrNot$2.label = 1;
            objB = BasicStateViewModel.B(sHSettingBaseViewModel, null, sHSettingBaseViewModel$updateResultOrNot$3, sHSettingBaseViewModel$updateResultOrNot$2, 1, null);
            if (objB == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objB);
        }
        Boolean bool = (Boolean) objB;
        return Boxing.boxBoolean(bool != null ? bool.booleanValue() : false);
    }

    @Override // com.heytap.sporthealth.blib.basic.BasicStateViewModel
    @NotNull
    /* JADX INFO: renamed from: D, reason: from getter */
    public String getMac() {
        return this.mac;
    }

    @Override // com.heytap.sporthealth.blib.basic.BasicStateViewModel
    public void K() {
        ThreadUtils.doInUiThread(new Runnable() { // from class: com.oplus.aiunit.vision.j6g
            @Override // java.lang.Runnable
            public final void run() {
                SHSettingBaseViewModel.r0(this.i);
            }
        });
    }

    @NotNull
    public final qgi b0() {
        return sgi.a(g0().deviceMac);
    }

    public final void d0() {
        super.L(false);
    }

    @Nullable
    public final Object e0(@NotNull Function1<? super Continuation<? super Boolean>, ? extends Object> function1, @NotNull Continuation<? super Boolean> continuation) {
        if (rpc.c()) {
            return function1.invoke(continuation);
        }
        rg7.l(R$string.settings_device_network_disconnect);
        return Boxing.boxBoolean(false);
    }

    public boolean f0() {
        return true;
    }

    @NotNull
    public final DeviceParam g0() {
        return (DeviceParam) this.deviceParam.getValue();
    }

    @NotNull
    public final SHSettingViewModel h0() {
        return (SHSettingViewModel) this.settingViewModel.getValue();
    }

    @NotNull
    public final SleepSettingViewModel i0() {
        return this.sleepSettingViewModelDelegate.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: j0, reason: from getter */
    public final String getTAG() {
        return this.TAG;
    }

    public final boolean k0() {
        return ((Boolean) lc5.d(g0().deviceModel).a(new Function1<DeviceModel, Boolean>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingBaseViewModel$isBand$1
            @Override // p010kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull DeviceModel applyMode) {
                Intrinsics.checkNotNullParameter(applyMode, "$this$applyMode");
                return Boolean.valueOf(applyMode.A9());
            }
        })).booleanValue();
    }

    public final boolean m0() {
        return ((Boolean) this.isRtosWatch.getValue()).booleanValue();
    }

    public final void n0() {
        if (this.hasLoadedOnDemandSettings) {
            return;
        }
        this.hasLoadedOnDemandSettings = true;
        Set<SportHealthSetting> setQ0 = q0();
        SHSettingViewModel sHSettingViewModelH0 = h0();
        Iterator<T> it = setQ0.iterator();
        while (it.hasNext()) {
            sHSettingViewModelH0.L((SportHealthSetting) it.next());
        }
    }

    @Override // androidx.lifecycle.Observer
    public void onChanged(@NotNull Object value) {
        Intrinsics.checkNotNullParameter(value, "value");
        a7b.f(this.TAG, "onChanged --> " + value);
        this.handle.removeMessages(1);
        this.handle.sendEmptyMessageDelayed(1, 300L);
    }

    @Override // com.heytap.sporthealth.blib.basic.BasicStateViewModel, androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        if (this.sleepSettingViewModelDelegate.isInitialized()) {
            i0().E().removeObserver(this);
        }
        h0().E().removeObserver(this);
        h0().C().removeObserver(this);
    }

    public boolean p0() {
        return false;
    }

    @NotNull
    public Set<SportHealthSetting> q0() {
        return SetsKt__SetsKt.emptySet();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object s0(@Nullable Integer num, @NotNull Continuation<? super Boolean> continuation) {
        SHSettingBaseViewModel$updateResultOrNot$3 sHSettingBaseViewModel$updateResultOrNot$3;
        if (continuation instanceof SHSettingBaseViewModel$updateResultOrNot$3) {
            sHSettingBaseViewModel$updateResultOrNot$3 = (SHSettingBaseViewModel$updateResultOrNot$3) continuation;
            int i = sHSettingBaseViewModel$updateResultOrNot$3.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                sHSettingBaseViewModel$updateResultOrNot$3.label = i - Integer.MIN_VALUE;
            } else {
                sHSettingBaseViewModel$updateResultOrNot$3 = new SHSettingBaseViewModel$updateResultOrNot$3(this, continuation);
            }
        } else {
            sHSettingBaseViewModel$updateResultOrNot$3 = new SHSettingBaseViewModel$updateResultOrNot$3(this, continuation);
        }
        SHSettingBaseViewModel$updateResultOrNot$3 sHSettingBaseViewModel$updateResultOrNot$4 = sHSettingBaseViewModel$updateResultOrNot$3;
        Object objB = sHSettingBaseViewModel$updateResultOrNot$4.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = sHSettingBaseViewModel$updateResultOrNot$4.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objB);
            SHSettingBaseViewModel$updateResultOrNot$4 sHSettingBaseViewModel$updateResultOrNot$5 = new SHSettingBaseViewModel$updateResultOrNot$4(this, num, null);
            sHSettingBaseViewModel$updateResultOrNot$4.label = 1;
            objB = BasicStateViewModel.B(this, null, sHSettingBaseViewModel$updateResultOrNot$5, sHSettingBaseViewModel$updateResultOrNot$4, 1, null);
            if (objB == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objB);
        }
        Boolean bool = (Boolean) objB;
        return Boxing.boxBoolean(bool != null ? bool.booleanValue() : false);
    }

    @Nullable
    public Object t0(@Nullable Integer num, @NotNull Function1<? super Continuation<? super D>, ? extends Object> function1, @NotNull Continuation<? super Boolean> continuation) {
        return u0(this, num, function1, continuation);
    }
}
