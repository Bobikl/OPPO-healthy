package com.heytap.health.main.card;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.support.v4.app.ActivityOptionsCompat;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.arouter.facade.Postcard;
import com.heytap.health.base.permission.wxbpermission.PermissionRequestDialog;
import com.heytap.health.base.ui.ActivityTransitionUtil;
import com.heytap.health.base.view.adapter.MultiLayoutAdapter;
import com.heytap.health.health.impl.R$drawable;
import com.heytap.health.health.impl.R$id;
import com.heytap.health.health.impl.R$layout;
import com.heytap.health.health.impl.R$string;
import com.heytap.health.home.RankService$RankPage;
import com.heytap.health.homecard.constant.HomeCardDataEnum$CardUiMode;
import com.heytap.health.homecard.constant.HomeCardDataEnum$DataType;
import com.heytap.health.main.card.StepRankCard;
import com.heytap.health.main.card.common.HealthBaseCard;
import com.heytap.health.main.card.common.HealthCommonCardView;
import com.heytap.health.wallet.ui.adapter.BaseRecyclerViewHolder;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.g3k;
import com.oplus.aiunit.vision.kwa;
import com.oplus.aiunit.vision.ld9;
import com.oplus.aiunit.vision.m3k;
import com.oplus.aiunit.vision.qv9;
import com.oplus.aiunit.vision.rdf;
import com.oplus.aiunit.vision.su8;
import com.oplus.aiunit.vision.x0;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 -2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001.B\u0019\u0012\u0006\u0010(\u001a\u00020'\u0012\b\u0010*\u001a\u0004\u0018\u00010)¢\u0006\u0004\b+\u0010,J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J \u0010\r\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0014J\u0012\u0010\u0012\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016J\u0018\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0016J\b\u0010\u0018\u001a\u00020\u0004H\u0016J\b\u0010\u0019\u001a\u00020\u0004H\u0002J\b\u0010\u001b\u001a\u00020\u001aH\u0002R\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010&\u001a\u00020\u001a8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u0006/"}, d2 = {"Lcom/heytap/health/main/card/StepRankCard;", "Lcom/heytap/health/main/card/common/HealthBaseCard;", "Landroidx/lifecycle/LifecycleEventObserver;", "Lcom/oplus/aiunit/vision/qv9;", "", "R", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", BaseRecyclerViewHolder.HOLDER_TAG_HEADER, "", "position", "Landroid/content/Context;", "context", "L", "Lcom/heytap/health/homecard/constant/HomeCardDataEnum$DataType;", "t", "Lcom/heytap/health/homecard/constant/HomeCardDataEnum$CardUiMode;", "y", "X", "Landroidx/lifecycle/LifecycleOwner;", "source", "Landroidx/lifecycle/Lifecycle$Event;", "event", "onStateChanged", "doNext", "j0", "", "i0", "Lcom/heytap/health/home/RankService$RankPage;", "z", "Lcom/heytap/health/home/RankService$RankPage;", "rankPage", "Landroid/content/BroadcastReceiver;", "A", "Landroid/content/BroadcastReceiver;", "mLocaleChangedReceiver", "l0", "()Z", "isEmpty", "Landroidx/fragment/app/FragmentActivity;", "activity", "Lcom/heytap/health/base/view/adapter/MultiLayoutAdapter;", "adapter", "<init>", "(Landroidx/fragment/app/FragmentActivity;Lcom/heytap/health/base/view/adapter/MultiLayoutAdapter;)V", "Companion", "a", "health_impl_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nStepRankCard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StepRankCard.kt\ncom/heytap/health/main/card/StepRankCard\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,210:1\n1#2:211\n*E\n"})
public final class StepRankCard extends HealthBaseCard implements LifecycleEventObserver, qv9 {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @NotNull
    public final BroadcastReceiver mLocaleChangedReceiver;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @NotNull
    public final RankService$RankPage rankPage;
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StepRankCard(@NotNull FragmentActivity activity, @Nullable MultiLayoutAdapter multiLayoutAdapter) {
        super(activity, multiLayoutAdapter);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Object objNavigation = x0.d().b("/home/RankService").navigation();
        Intrinsics.checkNotNull(objNavigation, "null cannot be cast to non-null type com.heytap.health.home.RankService.RankPage");
        this.rankPage = (RankService$RankPage) objNavigation;
        this.mLocaleChangedReceiver = new StepRankCard$mLocaleChangedReceiver$1(this);
        kwa.c(this.k.getLifecycle(), this);
    }

    public static final void k0(StepRankCard this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.S();
    }

    public static final void m0(StepRankCard this$0, Context context, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(context, "$context");
        this$0.X(context);
    }

    public static final void n0(StepRankCard this$0, Context context, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(context, "$context");
        this$0.X(context);
    }

    @Override // com.heytap.health.main.card.common.HealthBaseCard
    public void L(@NotNull RecyclerView.ViewHolder holder, int position, @NotNull final Context context) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(context, "context");
        super.L(holder, position, context);
        boolean zL0 = l0();
        StringBuilder sb = new StringBuilder();
        sb.append("onCommonBindViewHolder isEmpty is ");
        sb.append(zL0);
        if (zL0) {
            this.t.f(context.getString(R$string.health_step_rank_title), context.getString(R$string.health_home_card_step_rank_no_data_tip), context.getString(R$string.health_step_rank_guide_tip_1));
            this.t.v.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.psi
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    StepRankCard.m0(this.i, context, view);
                }
            });
            this.t.f4947l.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.qsi
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    StepRankCard.n0(this.i, context, view);
                }
            });
        } else {
            this.t.setDataModel(context.getString(R$string.health_step_rank_title));
            this.t.f4948n.setTextSize(22.0f);
            this.t.p.setTextSize(14.0f);
            this.t.setDataContent(ld9.l());
            this.t.setDataContent2(this.f4943j.getString(R$string.health_step_rank_unit));
            this.t.setDataNoticeToTime(ld9.o());
            TextView textView = (TextView) x(R$layout.health_common_step_ranking_card).findViewById(R$id.tv_location_region);
            String strA = ld9.a();
            String strD = ld9.d();
            if (TextUtils.isEmpty(strA)) {
                strA = strD;
            }
            textView.setText(strA);
        }
        this.t.setIcon(R$drawable.health_icon_rank);
    }

    @Override // com.heytap.health.main.card.common.HealthBaseCard
    public void R() {
        S();
        j0();
    }

    @Override // com.heytap.health.main.card.common.HealthBaseCard
    public void T() {
        super.T();
        kwa.g(this.k.getLifecycle(), this);
    }

    @Override // com.heytap.health.main.card.common.HealthBaseCard
    public void X(@Nullable Context context) {
        doNext();
    }

    @Override // com.oplus.aiunit.vision.qv9
    public void doNext() {
        if (!m3k.h() && !m3k.f() && !g3k.x()) {
            a7b.b("StepRankCard", "all false");
            return;
        }
        ActivityTransitionUtil.Companion companion = ActivityTransitionUtil.INSTANCE;
        FragmentActivity mActivity = this.k;
        Intrinsics.checkNotNullExpressionValue(mActivity, "mActivity");
        HealthCommonCardView healthCommonCardView = this.t;
        Intrinsics.checkNotNullExpressionValue(healthCommonCardView, "healthCommonCardView");
        ActivityOptionsCompat activityOptionsCompatA = companion.a(mActivity, healthCommonCardView);
        Postcard postcardWithString = x0.d().b("/home/RankPageV2").withString(ActivityTransitionUtil.KEY_ACTIVITY_TRANSITION_TARGET_NAME, this.t.getTransitionName());
        postcardWithString.withOptionsCompat(ActivityOptionsCompat.fromBundle(activityOptionsCompatA != null ? activityOptionsCompatA.toBundle() : null));
        postcardWithString.navigation(this.k);
    }

    public final boolean i0() {
        return PermissionRequestDialog.D(2, "android.permission.ACCESS_COARSE_LOCATION");
    }

    public final void j0() {
        long jO = ld9.o();
        boolean zI = ld9.i();
        a7b.f("StepRankCard", "timeStamp: " + jO + "  homeRankPermission: " + zI);
        if (!zI || System.currentTimeMillis() - jO < 3600000) {
            return;
        }
        this.rankPage.G8(this.f4943j);
        su8.c().h(new Runnable() { // from class: com.oplus.aiunit.vision.rsi
            @Override // java.lang.Runnable
            public final void run() {
                StepRankCard.k0(this.i);
            }
        }, 2L, TimeUnit.SECONDS);
    }

    public final boolean l0() {
        if (i0()) {
            return ld9.o() < LocalDateTime.now().toLocalDate().atStartOfDay().atZone(ZoneId.systemDefault()).toInstant().toEpochMilli() || TextUtils.isEmpty(ld9.l());
        }
        return true;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(@NotNull LifecycleOwner source, @NotNull Lifecycle.Event event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        S();
        if (event == Lifecycle.Event.ON_CREATE) {
            rdf.a(this.f4943j, this.mLocaleChangedReceiver, new IntentFilter("android.intent.action.LOCALE_CHANGED"), 2);
        } else if (event == Lifecycle.Event.ON_DESTROY) {
            this.f4943j.unregisterReceiver(this.mLocaleChangedReceiver);
        }
    }

    @Override // com.heytap.health.main.card.common.HealthBaseCard
    @NotNull
    public HomeCardDataEnum$DataType t() {
        return HomeCardDataEnum$DataType.RANK;
    }

    @Override // com.heytap.health.main.card.common.HealthBaseCard
    @NotNull
    public HomeCardDataEnum$CardUiMode y() {
        return HomeCardDataEnum$CardUiMode.CARD_HALF_LINE_FOLLOWED;
    }
}
