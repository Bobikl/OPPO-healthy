package com.heytap.health.main.card;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.RecyclerView;
import com.heytap.health.base.R$color;
import com.heytap.health.base.task.ThreadUtils;
import com.heytap.health.base.ui.ActivityTransitionUtil;
import com.heytap.health.base.view.adapter.MultiLayoutAdapter;
import com.heytap.health.bloodoxygen.R$string;
import com.heytap.health.bloodoxygen.ui.BloodOxygenHistoryActivity;
import com.heytap.health.bloodoxygen.viewmodel.BloodOxygenViewModel;
import com.heytap.health.core.widget.charts.data.TimeStampedData;
import com.heytap.health.health.impl.R$drawable;
import com.heytap.health.health.impl.R$id;
import com.heytap.health.health.impl.R$layout;
import com.heytap.health.healthbase.ability.DevicesAbilityEnum;
import com.heytap.health.healthbase.ability.utils.DevicesAbilityUtils;
import com.heytap.health.healthbase.view.HealthProgressBarView3;
import com.heytap.health.homecard.constant.HomeCardDataEnum$CardUiMode;
import com.heytap.health.homecard.constant.HomeCardDataEnum$DataType;
import com.heytap.health.main.card.BloodOxygenCard;
import com.heytap.health.main.card.common.HealthBaseCard;
import com.heytap.health.main.card.common.HealthCommonCardView;
import com.heytap.health.wallet.ui.adapter.BaseRecyclerViewHolder;
import com.oplus.aiunit.vision.acl;
import com.oplus.aiunit.vision.c1f;
import com.oplus.aiunit.vision.god;
import com.oplus.aiunit.vision.m8b;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes17.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 42\u00020\u0001:\u00015B\u0019\u0012\u0006\u0010/\u001a\u00020.\u0012\b\u00101\u001a\u0004\u0018\u000100¢\u0006\u0004\b2\u00103J\b\u0010\u0003\u001a\u00020\u0002H\u0014J\b\u0010\u0004\u001a\u00020\u0002H\u0016J \u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016J\u0012\u0010\f\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\b\u0010\r\u001a\u00020\u0002H\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0014J\b\u0010\u0011\u001a\u00020\u0010H\u0016J\b\u0010\u0012\u001a\u00020\u0002H\u0002J\u0012\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002R\u001b\u0010\u001c\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010#\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010&\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u001c\u0010*\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0011\u0010-\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u00066"}, d2 = {"Lcom/heytap/health/main/card/BloodOxygenCard;", "Lcom/heytap/health/main/card/common/HealthBaseCard;", "", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "R", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", BaseRecyclerViewHolder.HOLDER_TAG_HEADER, "", "position", "Landroid/content/Context;", "context", "L", "X", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/heytap/health/homecard/constant/HomeCardDataEnum$CardUiMode;", "y", "Lcom/heytap/health/homecard/constant/HomeCardDataEnum$DataType;", "t", "k0", "Lcom/heytap/health/core/widget/charts/data/TimeStampedData;", "nowTimeStampedData", "", "j0", "Lcom/heytap/health/healthbase/ability/utils/DevicesAbilityUtils;", "z", "Lkotlin/Lazy;", "m0", "()Lcom/heytap/health/healthbase/ability/utils/DevicesAbilityUtils;", "devicesAbilityUtils", "A", "Lcom/heytap/health/core/widget/charts/data/TimeStampedData;", "mTimeStampedData", "Lcom/heytap/health/bloodoxygen/viewmodel/BloodOxygenViewModel;", acl.KEY_B, "Lcom/heytap/health/bloodoxygen/viewmodel/BloodOxygenViewModel;", "mViewModel", "C", "Z", "needAnimate", "Landroidx/lifecycle/Observer;", "D", "Landroidx/lifecycle/Observer;", "dataObserver", "n0", "()Z", "isEmpty", "Landroidx/fragment/app/FragmentActivity;", "activity", "Lcom/heytap/health/base/view/adapter/MultiLayoutAdapter;", "adapter", "<init>", "(Landroidx/fragment/app/FragmentActivity;Lcom/heytap/health/base/view/adapter/MultiLayoutAdapter;)V", "Companion", "a", "health_impl_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBloodOxygenCard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BloodOxygenCard.kt\ncom/heytap/health/main/card/BloodOxygenCard\n+ 2 Uri.kt\nandroidx/core/net/UriKt\n*L\n1#1,195:1\n29#2:196\n*S KotlinDebug\n*F\n+ 1 BloodOxygenCard.kt\ncom/heytap/health/main/card/BloodOxygenCard\n*L\n131#1:196\n*E\n"})
public final class BloodOxygenCard extends HealthBaseCard {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @Nullable
    public TimeStampedData mTimeStampedData;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @Nullable
    public BloodOxygenViewModel mViewModel;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public boolean needAnimate;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @NotNull
    public final Observer<TimeStampedData> dataObserver;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @NotNull
    public final Lazy devicesAbilityUtils;
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"Lcom/heytap/health/core/widget/charts/data/TimeStampedData;", "timeStampedData1", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class b implements Observer<TimeStampedData> {
        public b() {
        }

        @Override // androidx.lifecycle.Observer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void onChanged(@Nullable TimeStampedData timeStampedData) {
            boolean zJ0 = BloodOxygenCard.this.j0(timeStampedData);
            Intrinsics.checkNotNull(timeStampedData);
            m8b.f("BloodOxygenCard", "dataObserver:" + zJ0 + "/" + timeStampedData.getTimestamp() + "/" + timeStampedData.getY());
            if (zJ0) {
                BloodOxygenCard.this.mTimeStampedData = timeStampedData;
                BloodOxygenCard.this.needAnimate = true;
                BloodOxygenCard.this.S();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BloodOxygenCard(@NotNull FragmentActivity activity, @Nullable MultiLayoutAdapter multiLayoutAdapter) {
        super(activity, multiLayoutAdapter);
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.devicesAbilityUtils = LazyKt__LazyJVMKt.lazy(new Function0<DevicesAbilityUtils>() { // from class: com.heytap.health.main.card.BloodOxygenCard$devicesAbilityUtils$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p010kotlin.jvm.functions.Function0
            @NotNull
            public final DevicesAbilityUtils invoke() {
                return new DevicesAbilityUtils();
            }
        });
        this.dataObserver = new b();
    }

    public static final void l0(BloodOxygenCard this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        BloodOxygenViewModel bloodOxygenViewModel = this$0.mViewModel;
        Intrinsics.checkNotNull(bloodOxygenViewModel);
        bloodOxygenViewModel.L();
    }

    public static final void o0(BloodOxygenCard this$0, Context context, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(context, "$context");
        this$0.X(context);
    }

    public static final void p0(BloodOxygenCard this$0, Context context, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(context, "$context");
        this$0.X(context);
    }

    @Override // com.heytap.health.main.card.common.HealthBaseCard
    public void L(@NotNull RecyclerView.ViewHolder holder, int position, @NotNull final Context context) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(context, "context");
        super.L(holder, position, context);
        boolean zN0 = n0();
        StringBuilder sb = new StringBuilder();
        sb.append("onCommonBindViewHolder | isEmpty is ");
        sb.append(zN0);
        if (zN0) {
            this.t.setIcon(R$drawable.health_icon_spo2);
            this.t.f(this.f5984j.getString(R$string.health_blood_oxygen), this.f5984j.getString(com.heytap.health.health.impl.R$string.health_home_card_spo2_no_data_tip), this.f5984j.getString(com.heytap.health.health.impl.R$string.health_home_card_to_understand));
            this.t.v.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.cl1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BloodOxygenCard.o0(this.i, context, view);
                }
            });
            this.t.f5988l.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.dl1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BloodOxygenCard.p0(this.i, context, view);
                }
            });
            return;
        }
        this.t.setDataModel(context.getString(R$string.health_blood_oxygen));
        View viewX = x(R$layout.health_common_blood_oxygen_card);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("onCommonBindViewHolder | mCommonView = ");
        sb2.append(viewX);
        this.t.f5989n.setTextSize(22.0f);
        this.t.p.setTextSize(14.0f);
        HealthCommonCardView healthCommonCardView = this.t;
        TimeStampedData timeStampedData = this.mTimeStampedData;
        Intrinsics.checkNotNull(timeStampedData);
        healthCommonCardView.setDataContent(String.valueOf((int) timeStampedData.getY()));
        this.t.setDataContent2("%");
        HealthCommonCardView healthCommonCardView2 = this.t;
        TimeStampedData timeStampedData2 = this.mTimeStampedData;
        Intrinsics.checkNotNull(timeStampedData2);
        healthCommonCardView2.setDataNoticeToTime(timeStampedData2.getTimestamp());
        HealthProgressBarView3 healthProgressBarView3 = (HealthProgressBarView3) viewX.findViewById(R$id.progress_bar_view);
        healthProgressBarView3.setDrawCursor(true);
        healthProgressBarView3.setIntervalPx(0);
        healthProgressBarView3.setCursorColor(ContextCompat.getColor(context, R$color.lib_base_colorBlack));
        healthProgressBarView3.setCurSorType(HealthProgressBarView3.CurSorType.TRULY);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new c1f(70.0f, 89.0f, ContextCompat.getColor(this.f5984j, com.heytap.health.health.impl.R$color.health_color_F50E60), "70%", ""));
        arrayList.add(new c1f(90.0f, 100.0f, ContextCompat.getColor(this.f5984j, com.heytap.health.health.impl.R$color.health_color_2979FF), "", "100%"));
        TimeStampedData timeStampedData3 = this.mTimeStampedData;
        Intrinsics.checkNotNull(timeStampedData3);
        healthProgressBarView3.setData(arrayList, timeStampedData3.getY());
        if (this.needAnimate) {
            healthProgressBarView3.animateY();
            this.needAnimate = false;
        }
    }

    @Override // com.heytap.health.main.card.common.HealthBaseCard
    public void R() {
        m8b.f("BloodOxygenCard", "refresh start!");
        k0();
    }

    @Override // com.heytap.health.main.card.common.HealthBaseCard
    public void T() {
        super.T();
        BloodOxygenViewModel bloodOxygenViewModel = this.mViewModel;
        if (bloodOxygenViewModel != null) {
            Intrinsics.checkNotNull(bloodOxygenViewModel);
            bloodOxygenViewModel.C().removeObserver(this.dataObserver);
        }
    }

    @Override // com.heytap.health.main.card.common.HealthBaseCard
    public void V() {
        k0();
    }

    @Override // com.heytap.health.main.card.common.HealthBaseCard
    public void X(@Nullable Context context) {
        if (n0() && !m0().b(DevicesAbilityEnum.SPO2)) {
            god.c().e(this.k, Uri.parse("healthap://app/path=113?extra_launch_type=7&jumpUrl=health-guide/index.html?steerCode=bloodoxygen"), null, this.s);
            return;
        }
        ActivityTransitionUtil.Companion companion = ActivityTransitionUtil.INSTANCE;
        FragmentActivity mActivity = this.k;
        Intrinsics.checkNotNullExpressionValue(mActivity, "mActivity");
        Intent intent = new Intent(this.k, (Class<?>) BloodOxygenHistoryActivity.class);
        View rootView = this.s;
        Intrinsics.checkNotNullExpressionValue(rootView, "rootView");
        companion.n(mActivity, intent, rootView);
    }

    public final boolean j0(TimeStampedData nowTimeStampedData) {
        if (nowTimeStampedData == null || this.mTimeStampedData == null) {
            return true;
        }
        long timestamp = nowTimeStampedData.getTimestamp();
        TimeStampedData timeStampedData = this.mTimeStampedData;
        Intrinsics.checkNotNull(timeStampedData);
        if (timestamp != timeStampedData.getTimestamp()) {
            return true;
        }
        float y = nowTimeStampedData.getY();
        TimeStampedData timeStampedData2 = this.mTimeStampedData;
        Intrinsics.checkNotNull(timeStampedData2);
        return !((y > timeStampedData2.getY() ? 1 : (y == timeStampedData2.getY() ? 0 : -1)) == 0);
    }

    public final void k0() {
        if (this.mViewModel == null) {
            FragmentActivity mActivity = this.k;
            Intrinsics.checkNotNullExpressionValue(mActivity, "mActivity");
            BloodOxygenViewModel bloodOxygenViewModel = (BloodOxygenViewModel) new ViewModelProvider(mActivity).get(BloodOxygenViewModel.class);
            this.mViewModel = bloodOxygenViewModel;
            Intrinsics.checkNotNull(bloodOxygenViewModel);
            bloodOxygenViewModel.C().removeObservers(this.k);
        }
        BloodOxygenViewModel bloodOxygenViewModel2 = this.mViewModel;
        Intrinsics.checkNotNull(bloodOxygenViewModel2);
        bloodOxygenViewModel2.C().observe(this.k, this.dataObserver);
        ThreadUtils.doInBackground("BloodOCard", new Runnable() { // from class: com.oplus.aiunit.vision.bl1
            @Override // java.lang.Runnable
            public final void run() {
                BloodOxygenCard.l0(this.i);
            }
        });
    }

    public final DevicesAbilityUtils m0() {
        return (DevicesAbilityUtils) this.devicesAbilityUtils.getValue();
    }

    public final boolean n0() {
        TimeStampedData timeStampedData = this.mTimeStampedData;
        if (timeStampedData != null) {
            Intrinsics.checkNotNull(timeStampedData);
            if (timeStampedData.getY() > 0.0f) {
                return false;
            }
        }
        return true;
    }

    @Override // com.heytap.health.main.card.common.HealthBaseCard
    @NotNull
    public HomeCardDataEnum$DataType t() {
        return HomeCardDataEnum$DataType.BLOOD_OX;
    }

    @Override // com.heytap.health.main.card.common.HealthBaseCard
    @NotNull
    public HomeCardDataEnum$CardUiMode y() {
        return HomeCardDataEnum$CardUiMode.CARD_HALF_LINE_NOT_FOLLOWED;
    }
}