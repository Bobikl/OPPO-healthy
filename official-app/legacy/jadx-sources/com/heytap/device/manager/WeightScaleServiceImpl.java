package com.heytap.device.manager;

import android.content.Context;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.heytap.health.device.third.weightscale.IWeightScaleService;
import com.oplus.aiunit.vision.brl;
import com.oplus.aiunit.vision.tql;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Route(path = "/device/WeightScaleServiceImpl")
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0011\u0010\u0012J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J \u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\nH\u0016J\u0018\u0010\f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0013"}, d2 = {"Lcom/heytap/device/manager/WeightScaleServiceImpl;", "Lcom/heytap/health/device/third/weightscale/IWeightScaleService;", "Landroid/content/Context;", "context", "Lcom/oplus/aiunit/vision/tql;", "deviceInfo", "Lcom/heytap/health/device/third/weightscale/IWeightScaleService$b;", "callback", "", "S1", "Lcom/heytap/health/device/third/weightscale/IWeightScaleService$a;", "d9", "Ba", "", "I8", "G3", "init", "<init>", "()V", "device_third_impl_release"}, k = 1, mv = {1, 8, 0})
public final class WeightScaleServiceImpl implements IWeightScaleService {

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016¨\u0006\u0007"}, d2 = {"com/heytap/device/manager/WeightScaleServiceImpl$a", "Lcom/oplus/aiunit/vision/brl$a;", "", "unit", "", "onSuccess", "onFail", "device_third_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class a implements brl.a {
        public final /* synthetic */ IWeightScaleService.a a;

        public a(IWeightScaleService.a aVar) {
            this.a = aVar;
        }

        @Override // com.oplus.aiunit.vision.brl.a
        public void onFail() {
            this.a.onFail();
        }

        @Override // com.oplus.aiunit.vision.brl.a
        public void onSuccess(@NotNull String unit) {
            Intrinsics.checkNotNullParameter(unit, "unit");
            this.a.onSuccess(unit);
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016¨\u0006\u0005"}, d2 = {"com/heytap/device/manager/WeightScaleServiceImpl$b", "Lcom/oplus/aiunit/vision/brl$b;", "", "onSuccess", "onFail", "device_third_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class b implements brl.b {
        public final /* synthetic */ IWeightScaleService.b a;

        public b(IWeightScaleService.b bVar) {
            this.a = bVar;
        }

        @Override // com.oplus.aiunit.vision.brl.b
        public void onFail() {
            this.a.onFail();
        }

        @Override // com.oplus.aiunit.vision.brl.b
        public void onSuccess() {
            this.a.onSuccess();
        }
    }

    @Override // com.heytap.health.device.third.weightscale.IWeightScaleService
    public void Ba(@NotNull Context context, @NotNull tql deviceInfo) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
        brl.INSTANCE.l(context, deviceInfo);
    }

    @Override // com.heytap.health.device.third.weightscale.IWeightScaleService
    @Nullable
    public String G3(@NotNull tql deviceInfo) {
        Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
        return brl.INSTANCE.j(deviceInfo);
    }

    @Override // com.heytap.health.device.third.weightscale.IWeightScaleService
    @NotNull
    public String I8(@NotNull Context context, @NotNull tql deviceInfo) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
        return brl.INSTANCE.h(context, deviceInfo);
    }

    @Override // com.heytap.health.device.third.weightscale.IWeightScaleService
    public void S1(@NotNull Context context, @NotNull tql deviceInfo, @NotNull IWeightScaleService.b callback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
        Intrinsics.checkNotNullParameter(callback, "callback");
        brl.INSTANCE.q(context, deviceInfo, new b(callback));
    }

    @Override // com.heytap.health.device.third.weightscale.IWeightScaleService
    public void d9(@NotNull Context context, @NotNull tql deviceInfo, @NotNull IWeightScaleService.a callback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
        Intrinsics.checkNotNullParameter(callback, "callback");
        brl.INSTANCE.n(context, deviceInfo, new a(callback));
    }

    @Override // com.alibaba.android.arouter.facade.template.IProvider
    public void init(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
