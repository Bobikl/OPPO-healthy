package com.heytap.health.device.tab.itemview.base;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.exifinterface.media.ExifInterface;
import com.heytap.health.device.flexadapter.a;
import com.heytap.health.device.tab.view.DeviceTabConstraintLayout;
import com.heytap.health.device_settings.impl.R$drawable;
import com.heytap.health.devicemanager.deviceability.DeviceModel;
import com.heytap.health.devicemanager.processor.bean.UserDeviceInfo;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.bj5;
import com.oplus.aiunit.vision.c8l;
import com.oplus.aiunit.vision.ejg;
import com.oplus.aiunit.vision.g4j;
import com.oplus.aiunit.vision.lc5;
import com.oplus.aiunit.vision.lh2;
import com.oplus.aiunit.vision.lo9;
import com.oplus.aiunit.vision.p11;
import com.oplus.aiunit.vision.rc5;
import com.oplus.aiunit.vision.ua5;
import com.support.appcompat.R$attr;
import com.support.appcompat.R$dimen;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u0002B\u0017\u0012\u0006\u00105\u001a\u00020\u000b\u0012\u0006\u00106\u001a\u00020\u0003¢\u0006\u0004\b7\u00108J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0016J\b\u0010\t\u001a\u00020\u0004H\u0016J\b\u0010\n\u001a\u00020\u0004H\u0016J\u0018\u0010\u000e\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0016J\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u000e\u0010\u0014\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0013H\u0004J\n\u0010\u0015\u001a\u0004\u0018\u00010\u000fH\u0004J\n\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0004J\b\u0010\u0019\u001a\u00020\u0018H\u0004J\u000e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001aH\u0004J\b\u0010\u001d\u001a\u00020\u001cH\u0004J\u0010\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\r\u001a\u00020\u000bH\u0004J\u0012\u0010 \u001a\u0004\u0018\u00010\u001f2\u0006\u0010\r\u001a\u00020\u000bH\u0004J\u0012\u0010\"\u001a\u00020\u001c2\b\u0010!\u001a\u0004\u0018\u00010\u000fH\u0004J\u0019\u0010$\u001a\u00020\u00182\u000e\u0010#\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0002H\u0096\u0002J\u001e\u0010)\u001a\u00020\u00042\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020%2\u0006\u0010(\u001a\u00020%R\u0014\u0010,\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010.\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010+R\u001b\u00104\u001a\u00020/8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103¨\u00069"}, d2 = {"Lcom/heytap/health/device/tab/itemview/base/BaseDeviceTabItem;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/heytap/health/device/flexadapter/a;", "Lcom/oplus/aiunit/vision/rc5;", "", "z0", "y0", c8l.KEY_A0, "u0", "v0", "t0", "", "mac", "model", "w0", "Lcom/heytap/health/devicemanager/processor/bean/UserDeviceInfo;", "deviceInfo", "Landroid/os/Bundle;", "l0", "Lcom/oplus/aiunit/vision/p11;", "m0", "n0", "Lcom/oplus/aiunit/vision/ua5;", "o0", "", "q0", "", "k0", "", "s0", "i0", "Lcom/oplus/aiunit/vision/g4j;", "r0", "data", "h0", "other", "j0", "Landroid/view/View;", "itemView", "dividerStartView", "dividerEndView", "x0", "o", "I", "dp14", LogFieldKey.PROCESS_NAME_KEY, "dp16", "Landroid/graphics/Paint;", "q", "Lkotlin/Lazy;", "p0", "()Landroid/graphics/Paint;", lo9.TAG_DEFAULT_CREATION_PAINT, "tag", "controller", "<init>", "(Ljava/lang/String;Lcom/oplus/aiunit/vision/rc5;)V", "device_settings_impl_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBaseDeviceTabItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseDeviceTabItem.kt\ncom/heytap/health/device/tab/itemview/base/BaseDeviceTabItem\n+ 2 SparseIntArray.kt\nandroidx/core/util/SparseIntArrayKt\n*L\n1#1,208:1\n27#2:209\n27#2:210\n*S KotlinDebug\n*F\n+ 1 BaseDeviceTabItem.kt\ncom/heytap/health/device/tab/itemview/base/BaseDeviceTabItem\n*L\n142#1:209\n145#1:210\n*E\n"})
public abstract class BaseDeviceTabItem<T> extends com.heytap.health.device.flexadapter.a<T, rc5> {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public final int dp14;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public final int dp16;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @NotNull
    public final Lazy paint;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"com/heytap/health/device/tab/itemview/base/BaseDeviceTabItem$a", "Lcom/heytap/health/device/tab/view/DeviceTabConstraintLayout$a;", "Landroid/graphics/Canvas;", "canvas", "", "a", "device_settings_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class a implements DeviceTabConstraintLayout.a {
        public final /* synthetic */ View a;
        public final /* synthetic */ View b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ View f3974c;
        public final /* synthetic */ BaseDeviceTabItem<T> d;

        public a(View view, View view2, View view3, BaseDeviceTabItem<T> baseDeviceTabItem) {
            this.a = view;
            this.b = view2;
            this.f3974c = view3;
            this.d = baseDeviceTabItem;
        }

        @Override // com.heytap.health.device.tab.view.DeviceTabConstraintLayout.a
        public void a(@NotNull Canvas canvas) {
            Intrinsics.checkNotNullParameter(canvas, "canvas");
            canvas.drawLine(this.a.getLeft(), ((DeviceTabConstraintLayout) this.b).getHeight(), this.f3974c.getRight(), ((DeviceTabConstraintLayout) this.b).getHeight(), this.d.p0());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseDeviceTabItem(@NotNull String tag, @NotNull final rc5 controller) {
        super(tag, controller);
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(controller, "controller");
        this.dp14 = ejg.a(r(), 14.0f);
        this.dp16 = ejg.a(r(), 16.0f);
        this.paint = LazyKt__LazyJVMKt.lazy(new Function0<Paint>() { // from class: com.heytap.health.device.tab.itemview.base.BaseDeviceTabItem$paint$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p010kotlin.jvm.functions.Function0
            @NotNull
            public final Paint invoke() {
                Paint paint = new Paint();
                rc5 rc5Var = controller;
                paint.setColor(lh2.a(rc5Var.getContext(), R$attr.couiColorDivider));
                paint.setStrokeWidth(rc5Var.getContext().getResources().getDimensionPixelOffset(R$dimen.coui_list_divider_height));
                return paint;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Paint p0() {
        return (Paint) this.paint.getValue();
    }

    public void A0() {
    }

    public final boolean h0(@Nullable UserDeviceInfo data) {
        return E().g(data);
    }

    public final boolean i0(@NotNull String model) {
        Intrinsics.checkNotNullParameter(model, "model");
        return E().o(model);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: j0, reason: merged with bridge method [inline-methods] */
    public int compareTo(@NotNull com.heytap.health.device.flexadapter.a<?, ?> other) {
        Intrinsics.checkNotNullParameter(other, "other");
        bj5 bj5Var = bj5.INSTANCE;
        if (!(bj5Var.b().indexOfKey(G()) >= 0)) {
            return 1;
        }
        if (bj5Var.b().indexOfKey(other.G()) >= 0) {
            return bj5Var.b().get(G()) - bj5Var.b().get(other.G());
        }
        return -1;
    }

    @NotNull
    public final List<UserDeviceInfo> k0() {
        return E().q();
    }

    @NotNull
    public Bundle l0(@NotNull UserDeviceInfo deviceInfo) {
        Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
        if (((Boolean) lc5.d(deviceInfo.getModel()).a(new Function1<DeviceModel, Boolean>() { // from class: com.heytap.health.device.tab.itemview.base.BaseDeviceTabItem$getBundle$1
            @Override // p010kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull DeviceModel applyMode) {
                Intrinsics.checkNotNullParameter(applyMode, "$this$applyMode");
                return Boolean.valueOf(applyMode.A9());
            }
        })).booleanValue()) {
            Bundle bundle = new Bundle();
            bundle.putString("settingsDeviceMac", deviceInfo.getMac());
            bundle.putString("settingsDeviceMacType", deviceInfo.getModel());
            bundle.putString("settingsDeviceMacVersion", deviceInfo.getFirmwareVersion());
            bundle.putInt("settingsDeviceBtStatus", deviceInfo.getConnectionState());
            return bundle;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putString("settingsDeviceMac", deviceInfo.getDeviceUniqueId());
        bundle2.putString("settingsDeviceBleMac", deviceInfo.getBleMac());
        bundle2.putString("settingsDeviceName", deviceInfo.getDeviceName());
        bundle2.putString("settingsDeviceMacType", deviceInfo.getModel());
        bundle2.putString("settingsDeviceMacVersion", deviceInfo.getFirmwareVersion());
        bundle2.putInt("settingsDeviceBtStatus", deviceInfo.getConnectionState());
        bundle2.putString("settingsDeviceOtaVersion", deviceInfo.getOtaVersion());
        bundle2.putString("settingsDeviceImei", deviceInfo.getImei());
        bundle2.putString("settingsDeviceSn", deviceInfo.getDeviceSn());
        return bundle2;
    }

    @Nullable
    public final p11<?> m0() {
        return E().h();
    }

    @Nullable
    public final UserDeviceInfo n0() {
        return E().f();
    }

    @Nullable
    public final ua5 o0() {
        return E().w();
    }

    public final int q0() {
        return E().e();
    }

    @Nullable
    public final g4j r0(@NotNull String model) {
        Intrinsics.checkNotNullParameter(model, "model");
        return E().n(model);
    }

    public final boolean s0() {
        return E().u();
    }

    public void t0() {
    }

    public void u0() {
    }

    public void v0() {
    }

    public void w0(@NotNull String mac, @NotNull String model) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        Intrinsics.checkNotNullParameter(model, "model");
    }

    public final void x0(@NotNull View itemView, @NotNull View dividerStartView, @NotNull View dividerEndView) {
        int i;
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        Intrinsics.checkNotNullParameter(dividerStartView, "dividerStartView");
        Intrinsics.checkNotNullParameter(dividerEndView, "dividerEndView");
        boolean zP = P(G(), new Function1<com.heytap.health.device.flexadapter.a<?, ?>, Boolean>(this) { // from class: com.heytap.health.device.tab.itemview.base.BaseDeviceTabItem$setBackground$isFirst$1
            final /* synthetic */ BaseDeviceTabItem<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.this$0 = this;
            }

            @Override // p010kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull a<?, ?> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                a.FlexItemMetadata metadata = it.getMetadata();
                String group = metadata != null ? metadata.getGroup() : null;
                a.FlexItemMetadata metadata2 = this.this$0.getMetadata();
                return Boolean.valueOf(Intrinsics.areEqual(group, metadata2 != null ? metadata2.getGroup() : null));
            }
        });
        boolean zQ = Q(G(), new Function1<com.heytap.health.device.flexadapter.a<?, ?>, Boolean>(this) { // from class: com.heytap.health.device.tab.itemview.base.BaseDeviceTabItem$setBackground$isLast$1
            final /* synthetic */ BaseDeviceTabItem<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.this$0 = this;
            }

            @Override // p010kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull a<?, ?> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                a.FlexItemMetadata metadata = it.getMetadata();
                String group = metadata != null ? metadata.getGroup() : null;
                a.FlexItemMetadata metadata2 = this.this$0.getMetadata();
                return Boolean.valueOf(Intrinsics.areEqual(group, metadata2 != null ? metadata2.getGroup() : null));
            }
        });
        boolean z = false;
        if (zP && zQ) {
            i = R$drawable.device_settings_prominent_bg_allradius;
        } else {
            if (zP) {
                i = R$drawable.device_settings_prominent_bg_topradius;
            } else if (zQ) {
                i = R$drawable.device_settings_prominent_bg_bottomradius;
            } else {
                i = R$drawable.device_settings_prominent_bg;
            }
            z = true;
        }
        Drawable drawable = AppCompatResources.getDrawable(r(), i);
        itemView.setBackground(drawable != null ? drawable.mutate() : null);
        if (itemView instanceof DeviceTabConstraintLayout) {
            if (z) {
                ((DeviceTabConstraintLayout) itemView).setOnDrawForegroundCallback(new a(dividerStartView, itemView, dividerEndView, this));
            } else {
                ((DeviceTabConstraintLayout) itemView).setOnDrawForegroundCallback(null);
            }
        }
    }

    public void y0() {
    }

    public void z0() {
    }
}
