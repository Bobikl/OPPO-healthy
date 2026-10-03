package com.heytap.health.community.saturation;

import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.view.View;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.heytap.health.base.text.GsonUtil;
import com.heytap.health.community.saturation.bean.SaturationBean;
import com.oplus.aiunit.vision.sq3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006J\u0018\u0010\f\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007R#\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/heytap/health/community/saturation/SaturationManager;", "", "", "configStr", "", "d", "Landroidx/lifecycle/LiveData;", "Lcom/heytap/health/community/saturation/bean/SaturationBean;", "b", "Landroid/view/View;", "rootView", "saturationBean", "a", "Landroidx/lifecycle/MutableLiveData;", "Lkotlin/Lazy;", "c", "()Landroidx/lifecycle/MutableLiveData;", "mConfigLd", "<init>", "()V", "community_impl_release"}, k = 1, mv = {1, 8, 0})
public final class SaturationManager {

    @NotNull
    public static final SaturationManager INSTANCE = new SaturationManager();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final Lazy mConfigLd = LazyKt__LazyJVMKt.lazy(new Function0<MutableLiveData<SaturationBean>>() { // from class: com.heytap.health.community.saturation.SaturationManager$mConfigLd$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final MutableLiveData<SaturationBean> invoke() {
            String configStr = sq3.d("");
            Intrinsics.checkNotNullExpressionValue(configStr, "configStr");
            return new MutableLiveData<>(configStr.length() == 0 ? null : (SaturationBean) GsonUtil.a(configStr, SaturationBean.class));
        }
    });

    /* JADX WARN: Code duplicated, block: B:7:0x0010  */
    public final void a(@NotNull View rootView, @Nullable SaturationBean saturationBean) {
        boolean z;
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        if (saturationBean != null) {
            z = saturationBean.isEnable();
        }
        if (!z) {
            rootView.setLayerType(0, null);
            return;
        }
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(0.0f);
        ColorMatrixColorFilter colorMatrixColorFilter = new ColorMatrixColorFilter(colorMatrix);
        Paint paint = new Paint();
        paint.setColorFilter(colorMatrixColorFilter);
        rootView.setLayerType(2, paint);
    }

    @NotNull
    public final LiveData<SaturationBean> b() {
        return c();
    }

    public final MutableLiveData<SaturationBean> c() {
        return (MutableLiveData) mConfigLd.getValue();
    }

    public final void d(@NotNull String configStr) {
        Intrinsics.checkNotNullParameter(configStr, "configStr");
        SaturationBean saturationBean = configStr.length() == 0 ? null : (SaturationBean) GsonUtil.a(configStr, SaturationBean.class);
        if (Intrinsics.areEqual(c().getValue(), saturationBean)) {
            return;
        }
        c().postValue(saturationBean);
    }
}
