package com.heytap.health.sunshine.ui.detail;

import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleCompat;
import com.heytap.health.base.base.BaseFragment;
import com.heytap.health.health.family.FamilyMoreDataDetailConfigBean;
import com.heytap.health.sunshine.R$id;
import com.heytap.health.sunshine.R$layout;
import com.heytap.health.sunshine.util.ChartType;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.ir9;
import com.oplus.aiunit.vision.zs9;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes18.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0007\b\u0017\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\b\u0010\u0005\u001a\u00020\u0004H\u0014J\u0012\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\n\u001a\u00020\bH\u0016R\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001d\u0010\u0014\u001a\u0004\u0018\u00010\u000f8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0019\u001a\u00020\u00158VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, d2 = {"Lcom/heytap/health/sunshine/ui/detail/SunshineStatFragment;", "Lcom/heytap/health/base/base/BaseFragment;", "Lcom/oplus/aiunit/vision/ir9;", "Lcom/oplus/aiunit/vision/zs9;", "", "getLayoutId", "Landroid/view/View;", "view", "", "initView", "initData", "Lcom/heytap/health/sunshine/util/ChartType;", "o", "Lcom/heytap/health/sunshine/util/ChartType;", "chartType", "Lcom/heytap/health/health/family/FamilyMoreDataDetailConfigBean;", LogFieldKey.PROCESS_NAME_KEY, "Lkotlin/Lazy;", "R6", "()Lcom/heytap/health/health/family/FamilyMoreDataDetailConfigBean;", "lazyGetFamilyConfig", "", "q", "d0", "()J", "locationTime", "<init>", "()V", "sunshine_release"}, k = 1, mv = {1, 8, 0})
public class SunshineStatFragment extends BaseFragment implements ir9, zs9 {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    public ChartType chartType = ChartType.WEEK;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    public final Lazy lazyGetFamilyConfig = LazyKt__LazyJVMKt.lazy(new Function0<FamilyMoreDataDetailConfigBean>() { // from class: com.heytap.health.sunshine.ui.detail.SunshineStatFragment$lazyGetFamilyConfig$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p010kotlin.jvm.functions.Function0
        @Nullable
        public final FamilyMoreDataDetailConfigBean invoke() {
            Bundle arguments = this.this$0.getArguments();
            if (arguments != null) {
                return (FamilyMoreDataDetailConfigBean) BundleCompat.getSerializable(arguments, "ARGUMENT_MORE_DATA_DETAIL", FamilyMoreDataDetailConfigBean.class);
            }
            return null;
        }
    });

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @NotNull
    public final Lazy locationTime = LazyKt__LazyJVMKt.lazy(new Function0<Long>() { // from class: com.heytap.health.sunshine.ui.detail.SunshineStatFragment$locationTime$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final Long invoke() {
            SunshineStatFragment sunshineStatFragment = this.this$0;
            return Long.valueOf(sunshineStatFragment.e0(sunshineStatFragment.getArguments()));
        }
    });

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ChartType.values().length];
            try {
                iArr[ChartType.WEEK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ChartType.MONTH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ChartType.YEAR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.oplus.aiunit.vision.ir9
    @Nullable
    public FamilyMoreDataDetailConfigBean R6() {
        return (FamilyMoreDataDetailConfigBean) this.lazyGetFamilyConfig.getValue();
    }

    @Nullable
    public FamilyMoreDataDetailConfigBean c0() {
        return ir9.a.b(this);
    }

    public long d0() {
        return ((Number) this.locationTime.getValue()).longValue();
    }

    public long e0(@Nullable Bundle bundle) {
        return zs9.a.a(this, bundle);
    }

    @Override // com.heytap.health.base.base.BaseFragment
    public int getLayoutId() {
        return R$layout.health_sunshine_base_fragment;
    }

    @Override // com.heytap.health.base.base.BaseFragment
    public void initData() {
    }

    @Override // com.heytap.health.base.base.BaseFragment
    public void initView(@Nullable View view) {
        View viewH;
        Bundle arguments = getArguments();
        if (arguments != null) {
            int i = arguments.getInt("FRAG_POSITION", 1);
            if (i == 1) {
                this.chartType = ChartType.WEEK;
            } else if (i == 2) {
                this.chartType = ChartType.MONTH;
            } else if (i == 3) {
                this.chartType = ChartType.YEAR;
            }
            ConstraintLayout constraintLayout = (ConstraintLayout) W(R$id.sunshine_base_fragment_view);
            if (constraintLayout != null) {
                int i2 = a.$EnumSwitchMapping$0[this.chartType.ordinal()];
                if (i2 == 1) {
                    viewH = new SunshineWeekView(this, c0(), d0()).H();
                } else if (i2 != 2) {
                    viewH = i2 != 3 ? new SunshineWeekView(this, c0(), d0()).H() : new SunshineYearView(this, c0(), d0()).J();
                } else {
                    viewH = new SunshineMonthView(this, c0(), d0()).G();
                }
                constraintLayout.addView(viewH);
            }
        }
    }

    @Override // com.oplus.aiunit.vision.ir9
    public boolean u5() {
        return ir9.a.c(this);
    }
}