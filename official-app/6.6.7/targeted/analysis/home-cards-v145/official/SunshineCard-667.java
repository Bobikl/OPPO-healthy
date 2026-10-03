package com.heytap.health.main.card;

import android.content.Context;
import android.net.Uri;
import android.support.v4.app.ActivityOptionsCompat;
import android.text.format.DateUtils;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ComposeView;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.arouter.facade.Postcard;
import com.heytap.health.base.task.ThreadUtils;
import com.heytap.health.base.ui.ActivityTransitionUtil;
import com.heytap.health.base.view.adapter.MultiLayoutAdapter;
import com.heytap.health.health.impl.R$drawable;
import com.heytap.health.health.impl.R$id;
import com.heytap.health.health.impl.R$layout;
import com.heytap.health.health.impl.R$plurals;
import com.heytap.health.healthbase.ability.DevicesAbilityEnum;
import com.heytap.health.healthbase.ability.utils.DevicesAbilityUtils;
import com.heytap.health.homecard.constant.HomeCardDataEnum$CardUiMode;
import com.heytap.health.homecard.constant.HomeCardDataEnum$DataType;
import com.heytap.health.main.card.SunshineCard;
import com.heytap.health.main.card.common.HealthBaseCard;
import com.heytap.health.main.card.common.HealthCommonCardView;
import com.heytap.health.sunshine.R$color;
import com.heytap.health.sunshine.R$string;
import com.heytap.health.sunshine.viewmodel.SunshineCardViewModel;
import com.heytap.health.wallet.ui.adapter.BaseRecyclerViewHolder;
import com.oplus.aiunit.vision.acl;
import com.oplus.aiunit.vision.e1;
import com.oplus.aiunit.vision.god;
import com.oplus.aiunit.vision.m8b;
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
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 /2\u00020\u0001:\u00010B\u0019\u0012\u0006\u0010*\u001a\u00020)\u0012\b\u0010,\u001a\u0004\u0018\u00010+¢\u0006\u0004\b-\u0010.J\b\u0010\u0003\u001a\u00020\u0002H\u0014J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\u0006\u0010\u0006\u001a\u00020\u0005J\u0012\u0010\t\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\"\u0010\u000e\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\u000f\u001a\u00020\u0002H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0014J\b\u0010\u0014\u001a\u00020\u0002H\u0002J\u0012\u0010\u0017\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0002R\u001b\u0010\u001d\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0018\u0010 \u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0018\u0010$\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u001c\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'¨\u00061"}, d2 = {"Lcom/heytap/health/main/card/SunshineCard;", "Lcom/heytap/health/main/card/common/HealthBaseCard;", "", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "R", "", "l0", "Landroid/content/Context;", "context", "X", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", BaseRecyclerViewHolder.HOLDER_TAG_HEADER, "", "position", "L", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/heytap/health/homecard/constant/HomeCardDataEnum$DataType;", "t", "Lcom/heytap/health/homecard/constant/HomeCardDataEnum$CardUiMode;", "y", "i0", "Lcom/heytap/health/sunshine/viewmodel/SunshineCardViewModel$a;", "nowSunshineStat", "h0", "Lcom/heytap/health/healthbase/ability/utils/DevicesAbilityUtils;", "z", "Lkotlin/Lazy;", "k0", "()Lcom/heytap/health/healthbase/ability/utils/DevicesAbilityUtils;", "devicesAbilityUtils", "A", "Lcom/heytap/health/sunshine/viewmodel/SunshineCardViewModel$a;", "mSunshineStat", "Lcom/heytap/health/sunshine/viewmodel/SunshineCardViewModel;", acl.KEY_B, "Lcom/heytap/health/sunshine/viewmodel/SunshineCardViewModel;", "mViewModel", "Landroidx/lifecycle/Observer;", "C", "Landroidx/lifecycle/Observer;", "cardDataObserver", "Landroidx/fragment/app/FragmentActivity;", "activity", "Lcom/heytap/health/base/view/adapter/MultiLayoutAdapter;", "adapter", "<init>", "(Landroidx/fragment/app/FragmentActivity;Lcom/heytap/health/base/view/adapter/MultiLayoutAdapter;)V", "Companion", "a", "health_impl_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSunshineCard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SunshineCard.kt\ncom/heytap/health/main/card/SunshineCard\n+ 2 Uri.kt\nandroidx/core/net/UriKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,191:1\n29#2:192\n1#3:193\n*S KotlinDebug\n*F\n+ 1 SunshineCard.kt\ncom/heytap/health/main/card/SunshineCard\n*L\n64#1:192\n*E\n"})
public final class SunshineCard extends HealthBaseCard {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @Nullable
    public SunshineCardViewModel.SunshineCardData mSunshineStat;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @Nullable
    public SunshineCardViewModel mViewModel;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @NotNull
    public final Observer<SunshineCardViewModel.SunshineCardData> cardDataObserver;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @NotNull
    public final Lazy devicesAbilityUtils;
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"Lcom/heytap/health/sunshine/viewmodel/SunshineCardViewModel$a;", "cardData", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class b implements Observer<SunshineCardViewModel.SunshineCardData> {
        public b() {
        }

        @Override // androidx.lifecycle.Observer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void onChanged(@Nullable SunshineCardViewModel.SunshineCardData sunshineCardData) {
            boolean zH0 = SunshineCard.this.h0(sunshineCardData);
            m8b.f("SunshineCard", "dataObserver: " + zH0 + "/" + (sunshineCardData != null ? Integer.valueOf(sunshineCardData.getDuration()) : null));
            if (zH0) {
                SunshineCard.this.mSunshineStat = sunshineCardData;
                SunshineCard.this.S();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SunshineCard(@NotNull FragmentActivity activity, @Nullable MultiLayoutAdapter multiLayoutAdapter) {
        super(activity, multiLayoutAdapter);
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.devicesAbilityUtils = LazyKt__LazyJVMKt.lazy(new Function0<DevicesAbilityUtils>() { // from class: com.heytap.health.main.card.SunshineCard$devicesAbilityUtils$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p010kotlin.jvm.functions.Function0
            @NotNull
            public final DevicesAbilityUtils invoke() {
                return new DevicesAbilityUtils();
            }
        });
        this.cardDataObserver = new b();
    }

    public static final void j0(SunshineCard this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        SunshineCardViewModel sunshineCardViewModel = this$0.mViewModel;
        if (sunshineCardViewModel != null) {
            sunshineCardViewModel.B();
        }
    }

    public static final void m0(SunshineCard this$0, Context context, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(context, "$context");
        this$0.X(context);
    }

    @Override // com.heytap.health.main.card.common.HealthBaseCard
    public void L(@Nullable RecyclerView.ViewHolder holder, int position, @NotNull final Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.L(holder, position, context);
        boolean zL0 = l0();
        StringBuilder sb = new StringBuilder();
        sb.append("onCommonBindViewHolder | isEmpty is ");
        sb.append(zL0);
        SunshineCardViewModel.SunshineCardData sunshineCardData = this.mSunshineStat;
        if (sunshineCardData == null) {
            this.t.f(context.getString(R$string.health_sunshine_title), context.getString(R$string.health_sunshine_card_empty_desc), context.getString(com.heytap.health.health_base.R$string.health_base_common_card_empty));
            this.t.setIcon(R$drawable.health_icon_sunshine);
            this.t.f5988l.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.h7j
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SunshineCard.m0(this.i, context, view);
                }
            });
            return;
        }
        this.t.setDataModel(context.getString(R$string.health_sunshine_title));
        this.t.setIcon(R$drawable.health_icon_sunshine);
        this.t.f5989n.setTextSize(22.0f);
        this.t.setDataContent(String.valueOf(sunshineCardData.getDuration()));
        this.t.setDataContent2(context.getResources().getQuantityString(R$plurals.health_unit_minute, sunshineCardData.getDuration()));
        long timeStamp = sunshineCardData.getTimeStamp();
        if (timeStamp == 0) {
            this.t.setDataNotice("");
        } else if (sunshineCardData.getDuration() == 0 && DateUtils.isToday(timeStamp)) {
            this.t.setDataNotice(context.getString(com.heytap.health.base.R$string.lib_base_chart_today));
        } else {
            this.t.setDataNoticeToTime(timeStamp);
        }
        View viewX = x(R$layout.health_common_sunshine_card);
        ComposeView composeView = (ComposeView) viewX.findViewById(R$id.progress_compose_view);
        TextView textView = (TextView) viewX.findViewById(R$id.tv_target_value);
        String string = this.f5984j.getString(R$string.health_sunshine_goal_minute, Integer.valueOf(sunshineCardData.getTarget()));
        Intrinsics.checkNotNullExpressionValue(string, "mContext.getString(Sunsh…goal_minute, stat.target)");
        textView.setText(string);
        textView.setVisibility(0);
        Intrinsics.checkNotNullExpressionValue(composeView, "composeView");
        long duration = sunshineCardData.getDuration();
        long target = sunshineCardData.getTarget();
        int i = R$color.health_sunshine_card_progress_color;
        StepCardComposeBridge.a(composeView, duration, target, i, i);
    }

    @Override // com.heytap.health.main.card.common.HealthBaseCard
    public void R() {
        m8b.f("SunshineCard", "refresh start!");
        i0();
    }

    @Override // com.heytap.health.main.card.common.HealthBaseCard
    public void T() {
        super.T();
        SunshineCardViewModel sunshineCardViewModel = this.mViewModel;
        if (sunshineCardViewModel != null) {
            Intrinsics.checkNotNull(sunshineCardViewModel);
            sunshineCardViewModel.C().removeObserver(this.cardDataObserver);
        }
    }

    @Override // com.heytap.health.main.card.common.HealthBaseCard
    public void V() {
        i0();
    }

    @Override // com.heytap.health.main.card.common.HealthBaseCard
    public void X(@Nullable Context context) {
        if (l0() && !k0().b(DevicesAbilityEnum.SUNSHINE)) {
            god.c().e(this.k, Uri.parse("healthap://app/path=113?extra_launch_type=7&jumpUrl=health-guide/index.html?steerCode=sunshinetime"), null, this.s);
            return;
        }
        ActivityTransitionUtil.Companion companion = ActivityTransitionUtil.INSTANCE;
        FragmentActivity mActivity = this.k;
        Intrinsics.checkNotNullExpressionValue(mActivity, "mActivity");
        HealthCommonCardView healthCommonCardView = this.t;
        Intrinsics.checkNotNullExpressionValue(healthCommonCardView, "healthCommonCardView");
        ActivityOptionsCompat activityOptionsCompatA = companion.a(mActivity, healthCommonCardView);
        Postcard postcardWithString = e1.d().b("/sunshine/SunshineDetailActivity").withString(ActivityTransitionUtil.KEY_ACTIVITY_TRANSITION_TARGET_NAME, this.t.getTransitionName());
        postcardWithString.withOptionsCompat(ActivityOptionsCompat.fromBundle(activityOptionsCompatA != null ? activityOptionsCompatA.toBundle() : null));
        postcardWithString.navigation(context);
    }

    public final boolean h0(SunshineCardViewModel.SunshineCardData nowSunshineStat) {
        SunshineCardViewModel.SunshineCardData sunshineCardData;
        return nowSunshineStat == null || (sunshineCardData = this.mSunshineStat) == null || nowSunshineStat.getDuration() != sunshineCardData.getDuration() || nowSunshineStat.getTarget() != sunshineCardData.getTarget();
    }

    public final void i0() {
        LiveData<SunshineCardViewModel.SunshineCardData> liveDataC;
        LiveData<SunshineCardViewModel.SunshineCardData> liveDataC2;
        if (this.mViewModel == null) {
            FragmentActivity mActivity = this.k;
            Intrinsics.checkNotNullExpressionValue(mActivity, "mActivity");
            SunshineCardViewModel sunshineCardViewModel = (SunshineCardViewModel) new ViewModelProvider(mActivity).get(SunshineCardViewModel.class);
            this.mViewModel = sunshineCardViewModel;
            if (sunshineCardViewModel != null && (liveDataC2 = sunshineCardViewModel.C()) != null) {
                liveDataC2.removeObservers(this.k);
            }
        }
        SunshineCardViewModel sunshineCardViewModel2 = this.mViewModel;
        if (sunshineCardViewModel2 != null && (liveDataC = sunshineCardViewModel2.C()) != null) {
            liveDataC.observe(this.k, this.cardDataObserver);
        }
        ThreadUtils.doInBackground("SunshineCard", new Runnable() { // from class: com.oplus.aiunit.vision.g7j
            @Override // java.lang.Runnable
            public final void run() {
                SunshineCard.j0(this.i);
            }
        });
    }

    public final DevicesAbilityUtils k0() {
        return (DevicesAbilityUtils) this.devicesAbilityUtils.getValue();
    }

    public final boolean l0() {
        return this.mSunshineStat == null;
    }

    @Override // com.heytap.health.main.card.common.HealthBaseCard
    @NotNull
    public HomeCardDataEnum$DataType t() {
        return HomeCardDataEnum$DataType.SUNSHINE;
    }

    @Override // com.heytap.health.main.card.common.HealthBaseCard
    @NotNull
    public HomeCardDataEnum$CardUiMode y() {
        return HomeCardDataEnum$CardUiMode.CARD_HALF_LINE_FOLLOWED;
    }
}