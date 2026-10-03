package com.heytap.health.main.card;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.RecyclerView;
import com.heytap.databaseengine.model.relax.Relax;
import com.heytap.health.base.ui.ActivityTransitionUtil;
import com.heytap.health.base.view.adapter.MultiLayoutAdapter;
import com.heytap.health.health.impl.R$drawable;
import com.heytap.health.health.impl.R$id;
import com.heytap.health.health.impl.R$layout;
import com.heytap.health.health.storemodel.DataModel;
import com.heytap.health.healthbase.ability.DevicesAbilityEnum;
import com.heytap.health.healthbase.ability.utils.DevicesAbilityUtils;
import com.heytap.health.homecard.constant.HomeCardDataEnum$CardUiMode;
import com.heytap.health.homecard.constant.HomeCardDataEnum$DataType;
import com.heytap.health.main.card.RelaxCard;
import com.heytap.health.main.card.common.HealthBaseCard;
import com.heytap.health.main.card.common.HealthCommonCardView;
import com.heytap.health.relax.R$string;
import com.heytap.health.relax.ui.RelaxActivity;
import com.heytap.health.relax.viewModel.RelaxCardViewModel;
import com.heytap.health.wallet.ui.adapter.BaseRecyclerViewHolder;
import com.oplus.aiunit.vision.acl;
import com.oplus.aiunit.vision.c9i;
import com.oplus.aiunit.vision.god;
import com.oplus.aiunit.vision.gqf;
import com.oplus.aiunit.vision.hpf;
import com.oplus.aiunit.vision.jzi;
import com.oplus.aiunit.vision.kzi;
import com.oplus.aiunit.vision.m8b;
import com.oplus.aiunit.vision.spf;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;
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
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 82\u00020\u0001:\u00019B\u0019\u0012\u0006\u00103\u001a\u000202\u0012\b\u00105\u001a\u0004\u0018\u000104¢\u0006\u0004\b6\u00107J\b\u0010\u0003\u001a\u00020\u0002H\u0014J\b\u0010\u0004\u001a\u00020\u0002H\u0016J \u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016J\u0012\u0010\f\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\b\u0010\r\u001a\u00020\u0002H\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0014J\b\u0010\u0011\u001a\u00020\u0010H\u0016J\b\u0010\u0012\u001a\u00020\u0002H\u0002J\u0018\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0013H\u0002R\u001b\u0010\u001c\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0018\u0010 \u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0018\u0010$\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u001c\u0010)\u001a\b\u0012\u0004\u0012\u00020&0%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R \u0010-\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0%0*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0011\u00101\u001a\u00020.8F¢\u0006\u0006\u001a\u0004\b/\u00100¨\u0006:"}, d2 = {"Lcom/heytap/health/main/card/RelaxCard;", "Lcom/heytap/health/main/card/common/HealthBaseCard;", "", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "R", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", BaseRecyclerViewHolder.HOLDER_TAG_HEADER, "", "position", "Landroid/content/Context;", "context", "L", "X", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/heytap/health/homecard/constant/HomeCardDataEnum$CardUiMode;", "y", "Lcom/heytap/health/homecard/constant/HomeCardDataEnum$DataType;", "t", "j0", "", "startTime", "endTime", "h0", "Lcom/heytap/health/healthbase/ability/utils/DevicesAbilityUtils;", "z", "Lkotlin/Lazy;", "i0", "()Lcom/heytap/health/healthbase/ability/utils/DevicesAbilityUtils;", "devicesAbilityUtils", "Lcom/oplus/aiunit/vision/jzi;", "A", "Lcom/oplus/aiunit/vision/jzi;", "mStoreRealize", "Lcom/heytap/health/relax/viewModel/RelaxCardViewModel;", acl.KEY_B, "Lcom/heytap/health/relax/viewModel/RelaxCardViewModel;", "mViewModel", "", "Lcom/heytap/databaseengine/model/relax/Relax;", "C", "Ljava/util/List;", "mDataList", "Landroidx/lifecycle/Observer;", "D", "Landroidx/lifecycle/Observer;", "mCardDataObserver", "", "k0", "()Z", "isEmpty", "Landroidx/fragment/app/FragmentActivity;", "activity", "Lcom/heytap/health/base/view/adapter/MultiLayoutAdapter;", "adapter", "<init>", "(Landroidx/fragment/app/FragmentActivity;Lcom/heytap/health/base/view/adapter/MultiLayoutAdapter;)V", "Companion", "a", "health_impl_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRelaxCard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RelaxCard.kt\ncom/heytap/health/main/card/RelaxCard\n+ 2 Uri.kt\nandroidx/core/net/UriKt\n*L\n1#1,198:1\n29#2:199\n*S KotlinDebug\n*F\n+ 1 RelaxCard.kt\ncom/heytap/health/main/card/RelaxCard\n*L\n113#1:199\n*E\n"})
public final class RelaxCard extends HealthBaseCard {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @Nullable
    public jzi mStoreRealize;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @Nullable
    public RelaxCardViewModel mViewModel;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @NotNull
    public List<Relax> mDataList;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @NotNull
    public final Observer<List<Relax>> mCardDataObserver;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @NotNull
    public final Lazy devicesAbilityUtils;
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0014¨\u0006\u0006"}, d2 = {"com/heytap/health/main/card/RelaxCard$b", "Lcom/oplus/aiunit/vision/jzi;", "Lcom/oplus/aiunit/vision/kzi;", "resultBean", "", "b", "health_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class b extends jzi {
        public b(FragmentActivity fragmentActivity) {
            super(fragmentActivity);
        }

        @Override // com.oplus.aiunit.vision.u91
        public void b(@NotNull kzi resultBean) {
            Intrinsics.checkNotNullParameter(resultBean, "resultBean");
            spf.c("RelaxCard", "prepareFetchData:" + this.f18736c);
            if (f(this.f18736c)) {
                RelaxCard.this.mDataList.clear();
                RelaxCard.this.S();
            } else {
                LocalDateTime localDateTimeOfInstant = LocalDateTime.ofInstant(Instant.ofEpochMilli(this.f18736c), ZoneId.systemDefault());
                RelaxCard.this.h0(LocalDateTime.of(localDateTimeOfInstant.toLocalDate(), LocalTime.MIN).atZone(ZoneId.systemDefault()).toInstant().toEpochMilli(), LocalDateTime.of(localDateTimeOfInstant.toLocalDate(), LocalTime.MAX).atZone(ZoneId.systemDefault()).toInstant().toEpochMilli());
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"", "Lcom/heytap/databaseengine/model/relax/Relax;", "dataList", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class c implements Observer<List<Relax>> {
        public c() {
        }

        @Override // androidx.lifecycle.Observer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void onChanged(@NotNull List<Relax> dataList) {
            Intrinsics.checkNotNullParameter(dataList, "dataList");
            RelaxCard.this.mDataList.clear();
            RelaxCard.this.mDataList.addAll(dataList);
            RelaxCard.this.S();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RelaxCard(@NotNull FragmentActivity activity, @Nullable MultiLayoutAdapter multiLayoutAdapter) {
        super(activity, multiLayoutAdapter);
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.devicesAbilityUtils = LazyKt__LazyJVMKt.lazy(new Function0<DevicesAbilityUtils>() { // from class: com.heytap.health.main.card.RelaxCard$devicesAbilityUtils$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p010kotlin.jvm.functions.Function0
            @NotNull
            public final DevicesAbilityUtils invoke() {
                return new DevicesAbilityUtils();
            }
        });
        this.mDataList = new ArrayList();
        this.mCardDataObserver = new c();
    }

    public static final void l0(RelaxCard this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.X(this$0.f5984j);
    }

    public static final void m0(RelaxCard this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.X(this$0.f5984j);
    }

    @Override // com.heytap.health.main.card.common.HealthBaseCard
    public void L(@NotNull RecyclerView.ViewHolder holder, int position, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(context, "context");
        super.L(holder, position, context);
        boolean zK0 = k0();
        StringBuilder sb = new StringBuilder();
        sb.append("onCommonBindViewHolder isEmpty is ");
        sb.append(zK0);
        if (zK0) {
            this.t.setIcon(R$drawable.health_icon_relax);
            this.t.f(this.f5984j.getString(R$string.health_relax), this.f5984j.getString(com.heytap.health.health.impl.R$string.health_home_card_relax_no_data_tip), this.f5984j.getString(com.heytap.health.health.impl.R$string.health_home_card_to_understand));
            this.t.v.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.oof
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    RelaxCard.l0(this.i, view);
                }
            });
            this.t.f5988l.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.pof
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    RelaxCard.m0(this.i, view);
                }
            });
            return;
        }
        this.t.setDataModel(this.f5984j.getString(R$string.health_relax));
        Relax relax = this.mDataList.get(0);
        this.t.f5989n.setTextSize(14.0f);
        this.t.p.setVisibility(8);
        int relaxDuration = relax.getRelaxDuration() / 60;
        int relaxDuration2 = relax.getRelaxDuration();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("relaxDuration:");
        sb2.append(relaxDuration2);
        sb2.append(", :");
        sb2.append(relaxDuration);
        this.t.f5989n.setText(c9i.INSTANCE.e(relaxDuration, 22.0f, 14.0f));
        this.t.e(relax.getStartTimestamp(), false);
        View viewX = x(R$layout.health_common_relax_card);
        ImageView imageView = (ImageView) viewX.findViewById(R$id.iv_icon);
        ((TextView) viewX.findViewById(R$id.tv_health_relax_card_name)).setText(hpf.f(relax.getType(), relax.getSubType()));
        imageView.setImageResource(hpf.e(relax.getType(), relax.getSubType()));
    }

    @Override // com.heytap.health.main.card.common.HealthBaseCard
    public void R() {
        m8b.f("RelaxCard", "refresh start! canRefresh is ");
        j0();
    }

    @Override // com.heytap.health.main.card.common.HealthBaseCard
    public void T() {
        super.T();
        jzi jziVar = this.mStoreRealize;
        if (jziVar != null) {
            Intrinsics.checkNotNull(jziVar);
            jziVar.o();
        }
        RelaxCardViewModel relaxCardViewModel = this.mViewModel;
        if (relaxCardViewModel != null) {
            Intrinsics.checkNotNull(relaxCardViewModel);
            relaxCardViewModel.y().removeObserver(this.mCardDataObserver);
        }
    }

    @Override // com.heytap.health.main.card.common.HealthBaseCard
    public void V() {
        super.V();
        j0();
    }

    @Override // com.heytap.health.main.card.common.HealthBaseCard
    public void X(@Nullable Context context) {
        if (k0() && !i0().b(DevicesAbilityEnum.RELAX)) {
            god.c().e(this.k, Uri.parse("healthap://app/path=113?extra_launch_type=7&jumpUrl=health-guide/index.html?steerCode=relax"), null, this.t);
            return;
        }
        ActivityTransitionUtil.Companion companion = ActivityTransitionUtil.INSTANCE;
        FragmentActivity mActivity = this.k;
        Intrinsics.checkNotNullExpressionValue(mActivity, "mActivity");
        Intent intent = new Intent(this.k, (Class<?>) RelaxActivity.class);
        HealthCommonCardView healthCommonCardView = this.t;
        Intrinsics.checkNotNullExpressionValue(healthCommonCardView, "healthCommonCardView");
        companion.n(mActivity, intent, healthCommonCardView);
    }

    public final void h0(long startTime, long endTime) {
        RelaxCardViewModel relaxCardViewModel = this.mViewModel;
        Intrinsics.checkNotNull(relaxCardViewModel);
        relaxCardViewModel.x(startTime, endTime);
    }

    public final DevicesAbilityUtils i0() {
        return (DevicesAbilityUtils) this.devicesAbilityUtils.getValue();
    }

    public final void j0() {
        if (this.mStoreRealize == null) {
            this.mStoreRealize = new b(this.k).p(DataModel.LAST);
            if (this.mViewModel == null) {
                FragmentActivity mActivity = this.k;
                Intrinsics.checkNotNullExpressionValue(mActivity, "mActivity");
                RelaxCardViewModel relaxCardViewModel = (RelaxCardViewModel) new ViewModelProvider(mActivity).get(RelaxCardViewModel.class);
                this.mViewModel = relaxCardViewModel;
                Intrinsics.checkNotNull(relaxCardViewModel);
                relaxCardViewModel.y().removeObservers(this.k);
            }
            RelaxCardViewModel relaxCardViewModel2 = this.mViewModel;
            Intrinsics.checkNotNull(relaxCardViewModel2);
            relaxCardViewModel2.y().observe(this.k, this.mCardDataObserver);
        }
        jzi jziVar = this.mStoreRealize;
        Intrinsics.checkNotNull(jziVar);
        jziVar.h(gqf.class);
    }

    public final boolean k0() {
        return this.mDataList.isEmpty();
    }

    @Override // com.heytap.health.main.card.common.HealthBaseCard
    @NotNull
    public HomeCardDataEnum$DataType t() {
        return HomeCardDataEnum$DataType.RELAX;
    }

    @Override // com.heytap.health.main.card.common.HealthBaseCard
    @NotNull
    public HomeCardDataEnum$CardUiMode y() {
        return HomeCardDataEnum$CardUiMode.CARD_HALF_LINE_FOLLOWED;
    }
}