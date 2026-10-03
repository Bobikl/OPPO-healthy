package com.heytap.health.main.card;

import android.content.Context;
import android.content.Intent;
import android.util.Pair;
import android.view.View;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.res.ColorResources_androidKt;
import androidx.compose.ui.unit.Dp;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.RecyclerView;
import com.github.mikephil.charting.data.Entry;
import com.heytap.databaseengine.model.UserInfo;
import com.heytap.databaseengine.model.weight.WeightBodyFat;
import com.heytap.health.base.task.ThreadUtils;
import com.heytap.health.base.ui.ActivityTransitionUtil;
import com.heytap.health.base.view.adapter.MultiLayoutAdapter;
import com.heytap.health.bodyfat.ui.BodyFatDetailsActivity;
import com.heytap.health.bodyfat.viewmodel.BodyFatCardViewModel;
import com.heytap.health.bodyfat.viewmodel.BodyFatViewModel;
import com.heytap.health.core.widget.charts.data.SmartScaleCircleFlagEntry;
import com.heytap.health.health.impl.R$drawable;
import com.heytap.health.health.impl.R$id;
import com.heytap.health.health.impl.R$layout;
import com.heytap.health.health.impl.R$string;
import com.heytap.health.homecard.constant.HomeCardDataEnum$CardUiMode;
import com.heytap.health.homecard.constant.HomeCardDataEnum$DataType;
import com.heytap.health.main.card.BodyFatCard;
import com.heytap.health.main.card.common.HealthBaseCard;
import com.heytap.health.main.card.common.HealthCommonCardView;
import com.heytap.health.main.view.BodyFatLineChartViewKt;
import com.heytap.health.ui.R$color;
import com.heytap.health.wallet.ui.adapter.BaseRecyclerViewHolder;
import com.oplus.aiunit.vision.acl;
import com.oplus.aiunit.vision.gw1;
import com.oplus.aiunit.vision.m8b;
import com.oplus.aiunit.vision.q12;
import com.oplus.aiunit.vision.rul;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.collections.IntIterator;
import p010kotlin.jvm.functions.Function2;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes17.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 R2\u00020\u0001:\u0001SB\u0019\u0012\u0006\u0010M\u001a\u00020L\u0012\b\u0010O\u001a\u0004\u0018\u00010N¢\u0006\u0004\bP\u0010QJ\b\u0010\u0003\u001a\u00020\u0002H\u0014J\b\u0010\u0004\u001a\u00020\u0002H\u0016J \u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016J\u0012\u0010\u000f\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\b\u0010\u0010\u001a\u00020\u0002H\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0014J\b\u0010\u0014\u001a\u00020\u0013H\u0016J\u001a\u0010\u0018\u001a\u00020\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002J\u001e\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00192\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bH\u0002J\u001c\u0010\"\u001a\u00020\u00162\b\u0010 \u001a\u0004\u0018\u00010\u001f2\b\u0010!\u001a\u0004\u0018\u00010\u001fH\u0002J \u0010%\u001a\u00020\u0016*\b\u0012\u0004\u0012\u00020\u001c0#2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001c0#H\u0002J\u0018\u0010&\u001a\u00020\u00162\u0006\u0010 \u001a\u00020\u001c2\u0006\u0010!\u001a\u00020\u001cH\u0002J\b\u0010'\u001a\u00020\u0002H\u0002J\b\u0010(\u001a\u00020\u0002H\u0002R\u0018\u0010+\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0018\u0010/\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u001c\u00103\u001a\b\u0012\u0004\u0012\u00020\u0016008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00106\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u00108\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00105R\u001a\u0010<\u001a\b\u0012\u0004\u0012\u00020\u001f098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0018\u0010@\u001a\u0004\u0018\u00010=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0018\u0010D\u001a\u0004\u0018\u00010A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u001c\u0010F\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010,098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010;R&\u0010H\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070G098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010;R\u0011\u0010K\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\bI\u0010J¨\u0006T"}, d2 = {"Lcom/heytap/health/main/card/BodyFatCard;", "Lcom/heytap/health/main/card/common/HealthBaseCard;", "", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "R", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", BaseRecyclerViewHolder.HOLDER_TAG_HEADER, "", "position", "Landroid/content/Context;", "context", "L", "Landroid/view/View;", "chartView", "n", "X", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/heytap/health/homecard/constant/HomeCardDataEnum$CardUiMode;", "y", "Lcom/heytap/health/homecard/constant/HomeCardDataEnum$DataType;", "t", "commonView", "", "needAnimate", "y0", "Landroidx/compose/ui/platform/ComposeView;", "chart", "", "Lcom/github/mikephil/charting/data/Entry;", "entries", "s0", "Lcom/oplus/aiunit/vision/gw1;", "last", "newly", "o0", "", "other", "r0", "u0", "p0", "v0", "z", "Lcom/oplus/aiunit/vision/gw1;", "mBodyFatCardBean", "Lcom/oplus/aiunit/vision/rul;", "A", "Lcom/oplus/aiunit/vision/rul;", "mCurDeviceInfo", "Landroidx/compose/runtime/MutableState;", acl.KEY_B, "Landroidx/compose/runtime/MutableState;", "startAnimation", "C", "I", "unit", "D", "precision", "Landroidx/lifecycle/Observer;", ExifInterface.LONGITUDE_EAST, "Landroidx/lifecycle/Observer;", "mObservableCard", "Lcom/heytap/health/bodyfat/viewmodel/BodyFatViewModel;", UserInfo.SEX_FEMALE, "Lcom/heytap/health/bodyfat/viewmodel/BodyFatViewModel;", "mViewModel", "Lcom/heytap/health/bodyfat/viewmodel/BodyFatCardViewModel;", "G", "Lcom/heytap/health/bodyfat/viewmodel/BodyFatCardViewModel;", "mCardViewModel", "H", "mObserverWeightScaleDeviceInfo", "Landroid/util/Pair;", "mObserverUnitPrecision", "t0", "()Z", "isEmpty", "Landroidx/fragment/app/FragmentActivity;", "activity", "Lcom/heytap/health/base/view/adapter/MultiLayoutAdapter;", "adapter", "<init>", "(Landroidx/fragment/app/FragmentActivity;Lcom/heytap/health/base/view/adapter/MultiLayoutAdapter;)V", "Companion", "a", "health_impl_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBodyFatCard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BodyFatCard.kt\ncom/heytap/health/main/card/BodyFatCard\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,312:1\n1726#2,3:313\n*S KotlinDebug\n*F\n+ 1 BodyFatCard.kt\ncom/heytap/health/main/card/BodyFatCard\n*L\n222#1:313,3\n*E\n"})
public final class BodyFatCard extends HealthBaseCard {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @Nullable
    public rul mCurDeviceInfo;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @NotNull
    public MutableState<Boolean> startAnimation;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public int unit;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public int precision;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    @NotNull
    public final Observer<gw1> mObservableCard;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    @Nullable
    public BodyFatViewModel mViewModel;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    @Nullable
    public BodyFatCardViewModel mCardViewModel;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    @NotNull
    public final Observer<rul> mObserverWeightScaleDeviceInfo;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    @NotNull
    public final Observer<Pair<Integer, Integer>> mObserverUnitPrecision;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @Nullable
    public gw1 mBodyFatCardBean;
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/oplus/aiunit/vision/gw1;", "bodyFatCardBean", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class b implements Observer<gw1> {
        public b() {
        }

        @Override // androidx.lifecycle.Observer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void onChanged(@NotNull gw1 bodyFatCardBean) {
            Intrinsics.checkNotNullParameter(bodyFatCardBean, "bodyFatCardBean");
            BodyFatCard bodyFatCard = BodyFatCard.this;
            boolean zO0 = bodyFatCard.o0(bodyFatCard.mBodyFatCardBean, bodyFatCardBean);
            StringBuilder sb = new StringBuilder();
            sb.append("mObservableCard dataConsistent is ");
            sb.append(zO0);
            if (bodyFatCardBean.b() == null) {
                BodyFatCard.this.mBodyFatCardBean = null;
                BodyFatCard.this.S();
            } else {
                if (zO0) {
                    return;
                }
                if (BodyFatCard.this.t0()) {
                    BodyFatCard.this.mBodyFatCardBean = bodyFatCardBean;
                    BodyFatCard.this.S();
                } else {
                    BodyFatCard.this.mBodyFatCardBean = bodyFatCardBean;
                    BodyFatCard.this.W();
                    BodyFatCard.this.S();
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Landroid/util/Pair;", "", "unitPrecision", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class c implements Observer<Pair<Integer, Integer>> {
        public c() {
        }

        @Override // androidx.lifecycle.Observer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void onChanged(@NotNull Pair<Integer, Integer> unitPrecision) {
            Intrinsics.checkNotNullParameter(unitPrecision, "unitPrecision");
            BodyFatCard bodyFatCard = BodyFatCard.this;
            Object obj = unitPrecision.first;
            Intrinsics.checkNotNullExpressionValue(obj, "unitPrecision.first");
            bodyFatCard.unit = ((Number) obj).intValue();
            BodyFatCard bodyFatCard2 = BodyFatCard.this;
            Object obj2 = unitPrecision.second;
            Intrinsics.checkNotNullExpressionValue(obj2, "unitPrecision.second");
            bodyFatCard2.precision = ((Number) obj2).intValue();
            BodyFatCard.this.S();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"Lcom/oplus/aiunit/vision/rul;", "weightScaleDeviceInfo", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class d implements Observer<rul> {
        public d() {
        }

        @Override // androidx.lifecycle.Observer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void onChanged(@Nullable rul rulVar) {
            BodyFatCard.this.mCurDeviceInfo = rulVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BodyFatCard(@NotNull FragmentActivity activity, @Nullable MultiLayoutAdapter multiLayoutAdapter) {
        super(activity, multiLayoutAdapter);
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.startAnimation = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        this.precision = 1;
        this.mObservableCard = new b();
        this.mObserverWeightScaleDeviceInfo = new d();
        this.mObserverUnitPrecision = new c();
    }

    public static final void q0(BodyFatCard this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        BodyFatViewModel bodyFatViewModel = this$0.mViewModel;
        Intrinsics.checkNotNull(bodyFatViewModel);
        bodyFatViewModel.r0();
        BodyFatCardViewModel bodyFatCardViewModel = this$0.mCardViewModel;
        Intrinsics.checkNotNull(bodyFatCardViewModel);
        bodyFatCardViewModel.x();
        this$0.v0();
    }

    public static final void w0(BodyFatCard this$0, Context context, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(context, "$context");
        this$0.X(context);
    }

    public static final void x0(BodyFatCard this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = new Intent(this$0.f5984j, (Class<?>) BodyFatDetailsActivity.class);
        intent.putExtra("showBodyFatSetDialog", "0");
        ActivityTransitionUtil.Companion companion = ActivityTransitionUtil.INSTANCE;
        FragmentActivity mActivity = this$0.k;
        Intrinsics.checkNotNullExpressionValue(mActivity, "mActivity");
        HealthCommonCardView healthCommonCardView = this$0.t;
        Intrinsics.checkNotNullExpressionValue(healthCommonCardView, "healthCommonCardView");
        companion.l(mActivity, intent, 101, healthCommonCardView);
    }

    @Override // com.heytap.health.main.card.common.HealthBaseCard
    public void L(@NotNull RecyclerView.ViewHolder holder, int position, @NotNull final Context context) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(context, "context");
        super.L(holder, position, context);
        m8b.f("BodyFatCard", "onCommonBindViewHolder isEmpty:" + t0());
        if (!t0()) {
            this.t.setDataModel(this.f5984j.getString(R$string.health_home_card_bf_weight));
            y0(x(R$layout.health_common_weight_card_new), o());
        } else {
            this.t.setIcon(R$drawable.health_icon_weight);
            this.t.f(this.f5984j.getString(R$string.health_home_card_bf_weight), this.f5984j.getString(R$string.health_home_card_bf_no_data_tip2), this.f5984j.getString(R$string.health_home_card_bf_record_measure));
            this.t.v.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.dw1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BodyFatCard.w0(this.i, context, view);
                }
            });
            this.t.f5988l.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.ew1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BodyFatCard.x0(this.i, view);
                }
            });
        }
    }

    @Override // com.heytap.health.main.card.common.HealthBaseCard
    public void R() {
        m8b.f("BodyFatCard", "refresh start!");
        p0();
    }

    @Override // com.heytap.health.main.card.common.HealthBaseCard
    public void T() {
        super.T();
        BodyFatViewModel bodyFatViewModel = this.mViewModel;
        if (bodyFatViewModel != null) {
            Intrinsics.checkNotNull(bodyFatViewModel);
            bodyFatViewModel.Y().removeObserver(this.mObserverWeightScaleDeviceInfo);
            BodyFatViewModel bodyFatViewModel2 = this.mViewModel;
            Intrinsics.checkNotNull(bodyFatViewModel2);
            bodyFatViewModel2.R().removeObserver(this.mObserverUnitPrecision);
        }
        BodyFatCardViewModel bodyFatCardViewModel = this.mCardViewModel;
        if (bodyFatCardViewModel != null) {
            Intrinsics.checkNotNull(bodyFatCardViewModel);
            bodyFatCardViewModel.z().removeObserver(this.mObservableCard);
        }
    }

    @Override // com.heytap.health.main.card.common.HealthBaseCard
    public void V() {
        super.V();
        p0();
    }

    @Override // com.heytap.health.main.card.common.HealthBaseCard
    public void X(@Nullable Context context) {
        ActivityTransitionUtil.Companion companion = ActivityTransitionUtil.INSTANCE;
        FragmentActivity mActivity = this.k;
        Intrinsics.checkNotNullExpressionValue(mActivity, "mActivity");
        Intent intent = new Intent(this.f5984j, (Class<?>) BodyFatDetailsActivity.class);
        HealthCommonCardView healthCommonCardView = this.t;
        Intrinsics.checkNotNullExpressionValue(healthCommonCardView, "healthCommonCardView");
        companion.l(mActivity, intent, 101, healthCommonCardView);
    }

    @Override // com.heytap.health.main.card.common.HealthBaseCard
    public void n(@NotNull View chartView) {
        Intrinsics.checkNotNullParameter(chartView, "chartView");
        this.startAnimation.setValue(Boolean.FALSE);
        this.startAnimation.setValue(Boolean.TRUE);
    }

    public final boolean o0(gw1 last, gw1 newly) {
        if (last == null || newly == null || last.b() == null || newly.b() == null || J() || last.b().getMeasurementTime() != newly.b().getMeasurementTime() || last.a().size() != newly.a().size()) {
            return false;
        }
        List<Entry> listA = last.a();
        Intrinsics.checkNotNullExpressionValue(listA, "last.highEntryList");
        List<Entry> listA2 = newly.a();
        Intrinsics.checkNotNullExpressionValue(listA2, "newly.highEntryList");
        return r0(listA, listA2);
    }

    public final void p0() {
        if (this.mViewModel == null) {
            FragmentActivity mActivity = this.k;
            Intrinsics.checkNotNullExpressionValue(mActivity, "mActivity");
            BodyFatViewModel bodyFatViewModel = (BodyFatViewModel) new ViewModelProvider(mActivity).get(BodyFatViewModel.class);
            this.mViewModel = bodyFatViewModel;
            Intrinsics.checkNotNull(bodyFatViewModel);
            bodyFatViewModel.Y().removeObservers(this.k);
        }
        BodyFatViewModel bodyFatViewModel2 = this.mViewModel;
        Intrinsics.checkNotNull(bodyFatViewModel2);
        bodyFatViewModel2.Y().observe(this.k, this.mObserverWeightScaleDeviceInfo);
        if (this.mCardViewModel == null) {
            FragmentActivity mActivity2 = this.k;
            Intrinsics.checkNotNullExpressionValue(mActivity2, "mActivity");
            BodyFatCardViewModel bodyFatCardViewModel = (BodyFatCardViewModel) new ViewModelProvider(mActivity2).get(BodyFatCardViewModel.class);
            this.mCardViewModel = bodyFatCardViewModel;
            Intrinsics.checkNotNull(bodyFatCardViewModel);
            bodyFatCardViewModel.z().removeObservers(this.k);
        }
        BodyFatCardViewModel bodyFatCardViewModel2 = this.mCardViewModel;
        Intrinsics.checkNotNull(bodyFatCardViewModel2);
        bodyFatCardViewModel2.z().observe(this.k, this.mObservableCard);
        BodyFatViewModel bodyFatViewModel3 = this.mViewModel;
        Intrinsics.checkNotNull(bodyFatViewModel3);
        bodyFatViewModel3.R().observe(this.k, this.mObserverUnitPrecision);
        ThreadUtils.doInBackground("BodyFatCard", new Runnable() { // from class: com.oplus.aiunit.vision.fw1
            @Override // java.lang.Runnable
            public final void run() {
                BodyFatCard.q0(this.i);
            }
        });
    }

    public final boolean r0(List<? extends Entry> list, List<? extends Entry> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        Iterable indices = CollectionsKt__CollectionsKt.getIndices(list);
        if (!(indices instanceof Collection) || !((Collection) indices).isEmpty()) {
            Iterator it = indices.iterator();
            while (it.hasNext()) {
                int iNextInt = ((IntIterator) it).nextInt();
                if (!u0(list.get(iNextInt), list2.get(iNextInt))) {
                    return false;
                }
            }
        }
        return true;
    }

    public final void s0(ComposeView chart, List<Entry> entries) {
        final ArrayList arrayList = new ArrayList();
        if (!entries.isEmpty()) {
            Iterator<Entry> it = entries.iterator();
            while (it.hasNext()) {
                arrayList.add(Float.valueOf(it.next().getY()));
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.add(Float.valueOf(0.0f));
        }
        chart.setContent(ComposableLambdaKt.composableLambdaInstance(462592960, true, new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.main.card.BodyFatCard$initWeightLineChart$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // p010kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                invoke(composer, num.intValue());
                return Unit.INSTANCE;
            }

            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
            @Composable
            public final void invoke(@Nullable Composer composer, int i) {
                if ((i & 11) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(462592960, i, -1, "com.heytap.health.main.card.BodyFatCard.initWeightLineChart.<anonymous> (BodyFatCard.kt:150)");
                }
                long jColorResource = ColorResources_androidKt.colorResource(R$color.lib_ui_black_4, composer, 0);
                float f = 2;
                BodyFatLineChartViewKt.a(arrayList, Dp.m4104constructorimpl(36), jColorResource, jColorResource, 0L, 0L, Dp.m4104constructorimpl(3), 0.0f, 0L, Dp.m4104constructorimpl(f), Dp.m4104constructorimpl(f), 0, this.startAnimation, composer, 806879288, 6, 2480);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
    }

    @Override // com.heytap.health.main.card.common.HealthBaseCard
    @NotNull
    public HomeCardDataEnum$DataType t() {
        return HomeCardDataEnum$DataType.WEIGHT;
    }

    public final boolean t0() {
        gw1 gw1Var = this.mBodyFatCardBean;
        if (gw1Var == null) {
            return true;
        }
        Intrinsics.checkNotNull(gw1Var);
        List<Entry> listA = gw1Var.a();
        Intrinsics.checkNotNullExpressionValue(listA, "mBodyFatCardBean!!.highEntryList");
        if (!(!listA.isEmpty())) {
            return true;
        }
        gw1 gw1Var2 = this.mBodyFatCardBean;
        Intrinsics.checkNotNull(gw1Var2);
        return gw1Var2.b() == null;
    }

    public final boolean u0(Entry last, Entry newly) {
        if (Math.abs(last.getX() - newly.getX()) > 1.0E-4f || Math.abs(last.getY() - newly.getY()) > 1.0E-4f) {
            return false;
        }
        SmartScaleCircleFlagEntry smartScaleCircleFlagEntry = last instanceof SmartScaleCircleFlagEntry ? (SmartScaleCircleFlagEntry) last : null;
        long timestamp = smartScaleCircleFlagEntry != null ? smartScaleCircleFlagEntry.getTimestamp() : 0L;
        SmartScaleCircleFlagEntry smartScaleCircleFlagEntry2 = newly instanceof SmartScaleCircleFlagEntry ? (SmartScaleCircleFlagEntry) newly : null;
        if (timestamp != (smartScaleCircleFlagEntry2 != null ? smartScaleCircleFlagEntry2.getTimestamp() : 0L)) {
            return false;
        }
        Object data = last.getData();
        WeightBodyFat weightBodyFat = data instanceof WeightBodyFat ? (WeightBodyFat) data : null;
        String weightId = weightBodyFat != null ? weightBodyFat.getWeightId() : null;
        Object data2 = newly.getData();
        WeightBodyFat weightBodyFat2 = data2 instanceof WeightBodyFat ? (WeightBodyFat) data2 : null;
        return Intrinsics.areEqual(weightId, weightBodyFat2 != null ? weightBodyFat2.getWeightId() : null);
    }

    public final void v0() {
        BodyFatViewModel bodyFatViewModel = this.mViewModel;
        Intrinsics.checkNotNull(bodyFatViewModel);
        bodyFatViewModel.n0();
    }

    @Override // com.heytap.health.main.card.common.HealthBaseCard
    @NotNull
    public HomeCardDataEnum$CardUiMode y() {
        return HomeCardDataEnum$CardUiMode.CARD_HALF_LINE_FOLLOWED;
    }

    public final void y0(View commonView, boolean needAnimate) {
        boolean z = commonView == null;
        StringBuilder sb = new StringBuilder();
        sb.append("refreshViewIfNeed mCommonView is ");
        sb.append(z);
        sb.append("; needAnimate = ");
        sb.append(needAnimate);
        if (t0()) {
            m8b.f("BodyFatCard", "refreshViewIfNeed data is isEmpty");
            return;
        }
        if (commonView == null) {
            S();
            return;
        }
        this.r = System.currentTimeMillis();
        gw1 gw1Var = this.mBodyFatCardBean;
        Intrinsics.checkNotNull(gw1Var);
        String weight = gw1Var.b().getWeight();
        Intrinsics.checkNotNullExpressionValue(weight, "mBodyFatCardBean!!.lastData.weight");
        float f = Float.parseFloat(weight) / 1000.0f;
        String strE = q12.e(q12.h(f, this.unit), this.precision);
        String strG = q12.g(this.k, (int) f, this.unit, "");
        this.t.f5989n.setTextSize(22.0f);
        this.t.p.setTextSize(14.0f);
        this.t.setDataContent(strE);
        this.t.setDataContent2(strG);
        HealthCommonCardView healthCommonCardView = this.t;
        gw1 gw1Var2 = this.mBodyFatCardBean;
        Intrinsics.checkNotNull(gw1Var2);
        healthCommonCardView.setDataNoticeToTime(gw1Var2.b().getMeasurementTime());
        gw1 gw1Var3 = this.mBodyFatCardBean;
        Intrinsics.checkNotNull(gw1Var3);
        float fC = gw1Var3.c();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("offset:");
        sb2.append(fC);
        ComposeView chart = (ComposeView) commonView.findViewById(R$id.weight_health_line_chart);
        Intrinsics.checkNotNullExpressionValue(chart, "chart");
        gw1 gw1Var4 = this.mBodyFatCardBean;
        Intrinsics.checkNotNull(gw1Var4);
        List<Entry> listA = gw1Var4.a();
        Intrinsics.checkNotNullExpressionValue(listA, "mBodyFatCardBean!!.highEntryList");
        s0(chart, listA);
        if (needAnimate) {
            n(chart);
        }
    }
}