package com.heytap.health.main.card;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.RecyclerView;
import com.heytap.databaseengine.model.wristtemperature.WristTemperatureStat;
import com.heytap.health.base.R$color;
import com.heytap.health.base.livedata.OLiveData;
import com.heytap.health.base.ui.ActivityTransitionUtil;
import com.heytap.health.base.view.adapter.MultiLayoutAdapter;
import com.heytap.health.device_data_sync.data_sync.IDataSyncService;
import com.heytap.health.health.impl.R$drawable;
import com.heytap.health.health.impl.R$id;
import com.heytap.health.health.impl.R$layout;
import com.heytap.health.health.impl.R$plurals;
import com.heytap.health.healthbase.ability.DevicesAbilityEnum;
import com.heytap.health.healthbase.ability.utils.DevicesAbilityUtils;
import com.heytap.health.healthbase.view.HealthProgressBarView3;
import com.heytap.health.homecard.constant.HomeCardDataEnum$CardUiMode;
import com.heytap.health.homecard.constant.HomeCardDataEnum$DataType;
import com.heytap.health.main.card.WristTemperatureCard;
import com.heytap.health.main.card.common.HealthBaseCard;
import com.heytap.health.main.card.common.HealthCommonCardView;
import com.heytap.health.wallet.ui.adapter.BaseRecyclerViewHolder;
import com.heytap.health.wrist_temperature.R$string;
import com.heytap.health.wrist_temperature.ui.WristTemperatureHistoryActivity;
import com.heytap.health.wrist_temperature.viewmodel.WristHistoryViewModel;
import com.oplus.aiunit.vision.acl;
import com.oplus.aiunit.vision.c1f;
import com.oplus.aiunit.vision.cn;
import com.oplus.aiunit.vision.e1;
import com.oplus.aiunit.vision.god;
import com.oplus.aiunit.vision.m6m;
import com.oplus.aiunit.vision.m8b;
import com.oplus.aiunit.vision.ot8;
import com.oplus.aiunit.vision.pr8;
import com.oplus.aiunit.vision.swf;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 :2\u00020\u0001:\u0001;B\u0019\u0012\u0006\u00105\u001a\u000204\u0012\b\u00107\u001a\u0004\u0018\u000106¢\u0006\u0004\b8\u00109J\b\u0010\u0003\u001a\u00020\u0002H\u0016J$\u0010\n\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0014J\u0012\u0010\u000f\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\b\u0010\u0010\u001a\u00020\u0002H\u0016J\b\u0010\u0011\u001a\u00020\u0002H\u0014J\b\u0010\u0012\u001a\u00020\u0002H\u0002J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0015\u001a\u00020\u0013H\u0002J\u0012\u0010\u001a\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0002J\b\u0010\u001b\u001a\u00020\u0016H\u0002J\b\u0010\u001c\u001a\u00020\u0016H\u0002R\u001b\u0010\"\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0018\u0010&\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010)\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010,\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010/\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u001a\u00103\u001a\b\u0012\u0004\u0012\u00020\u0013008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102¨\u0006<"}, d2 = {"Lcom/heytap/health/main/card/WristTemperatureCard;", "Lcom/heytap/health/main/card/common/HealthBaseCard;", "", "R", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", BaseRecyclerViewHolder.HOLDER_TAG_HEADER, "", "position", "Landroid/content/Context;", "context", "L", "Lcom/heytap/health/homecard/constant/HomeCardDataEnum$DataType;", "t", "Lcom/heytap/health/homecard/constant/HomeCardDataEnum$CardUiMode;", "y", "X", ExifInterface.GPS_DIRECTION_TRUE, ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "o0", "Lcom/heytap/databaseengine/model/wristtemperature/WristTemperatureStat;", "last", "newly", "", "l0", "Landroid/view/View;", "mCommonView", "s0", "p0", "n0", "Lcom/heytap/health/healthbase/ability/utils/DevicesAbilityUtils;", "z", "Lkotlin/Lazy;", "m0", "()Lcom/heytap/health/healthbase/ability/utils/DevicesAbilityUtils;", "devicesAbilityUtils", "Lcom/heytap/health/wrist_temperature/viewmodel/WristHistoryViewModel;", "A", "Lcom/heytap/health/wrist_temperature/viewmodel/WristHistoryViewModel;", "mViewModel", acl.KEY_B, "Lcom/heytap/databaseengine/model/wristtemperature/WristTemperatureStat;", "wristStatData", "C", "I", "countDown", "D", "Z", "ifShowCountDown", "Landroidx/lifecycle/Observer;", ExifInterface.LONGITUDE_EAST, "Landroidx/lifecycle/Observer;", "lastWristDataObserver", "Landroidx/fragment/app/FragmentActivity;", "activity", "Lcom/heytap/health/base/view/adapter/MultiLayoutAdapter;", "adapter", "<init>", "(Landroidx/fragment/app/FragmentActivity;Lcom/heytap/health/base/view/adapter/MultiLayoutAdapter;)V", "Companion", "a", "health_impl_release"}, k = 1, mv = {1, 8, 0})
public final class WristTemperatureCard extends HealthBaseCard {

    @NotNull
    public static final String TAG = "WristTemperatureCard";

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @Nullable
    public WristHistoryViewModel mViewModel;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @Nullable
    public WristTemperatureStat wristStatData;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public int countDown;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public boolean ifShowCountDown;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    @NotNull
    public final Observer<WristTemperatureStat> lastWristDataObserver;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @NotNull
    public final Lazy devicesAbilityUtils;
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/heytap/databaseengine/model/wristtemperature/WristTemperatureStat;", "it", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class b implements Observer<WristTemperatureStat> {
        public b() {
        }

        @Override // androidx.lifecycle.Observer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void onChanged(@NotNull WristTemperatureStat it) {
            Intrinsics.checkNotNullParameter(it, "it");
            if (it.getDayBaseLineWristTemperature() == 0) {
                if (!WristTemperatureCard.this.p0() || WristTemperatureCard.this.J()) {
                    WristTemperatureCard.this.S();
                    return;
                }
                return;
            }
            WristTemperatureCard wristTemperatureCard = WristTemperatureCard.this;
            boolean zL0 = wristTemperatureCard.l0(wristTemperatureCard.wristStatData, it);
            StringBuilder sb = new StringBuilder();
            sb.append("lastWristDataObserver dataConsistent is ");
            sb.append(zL0);
            if (zL0) {
                return;
            }
            WristTemperatureCard.this.wristStatData = it;
            WristTemperatureCard.this.W();
            WristTemperatureCard.this.S();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WristTemperatureCard(@NotNull FragmentActivity activity, @Nullable MultiLayoutAdapter multiLayoutAdapter) {
        super(activity, multiLayoutAdapter);
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.devicesAbilityUtils = LazyKt__LazyJVMKt.lazy(new Function0<DevicesAbilityUtils>() { // from class: com.heytap.health.main.card.WristTemperatureCard$devicesAbilityUtils$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p010kotlin.jvm.functions.Function0
            @NotNull
            public final DevicesAbilityUtils invoke() {
                return new DevicesAbilityUtils();
            }
        });
        this.countDown = -1;
        this.lastWristDataObserver = new b();
    }

    public static final void q0(WristTemperatureCard this$0, Context context, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.X(context);
    }

    public static final void r0(WristTemperatureCard this$0, Context context, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.X(context);
    }

    @Override // com.heytap.health.main.card.common.HealthBaseCard
    public void L(@Nullable RecyclerView.ViewHolder holder, int position, @Nullable final Context context) {
        String string;
        super.L(holder, position, context);
        if (context == null) {
            return;
        }
        boolean zP0 = p0();
        boolean z = this.ifShowCountDown;
        StringBuilder sb = new StringBuilder();
        sb.append("onCommonBindViewHolder isEmpty = ");
        sb.append(zP0);
        sb.append(", ifShowCountDown = ");
        sb.append(z);
        this.t.setIcon(R$drawable.health_icon_wrist);
        if (!zP0 && !this.ifShowCountDown) {
            this.t.setDataModel(context.getString(R$string.health_wrist_temperature));
            s0(x(R$layout.health_common_wrist_card));
            return;
        }
        this.t.f5987j.setTextSize(14.0f);
        if (this.ifShowCountDown) {
            Resources resources = this.f5984j.getResources();
            int i = R$plurals.health_home_card_wrist_count_down;
            int i2 = this.countDown;
            string = resources.getQuantityString(i, i2, Integer.valueOf(i2));
        } else {
            string = this.f5984j.getString(com.heytap.health.health.impl.R$string.health_home_card_wrist_no_data_tip);
        }
        Intrinsics.checkNotNullExpressionValue(string, "if (ifShowCountDown) {\n …o_data_tip)\n            }");
        this.t.f(this.f5984j.getString(R$string.health_wrist_temperature), string, this.f5984j.getString(com.heytap.health.health.impl.R$string.health_home_card_to_understand));
        this.t.v.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.s6m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WristTemperatureCard.q0(this.i, context, view);
            }
        });
        this.t.f5988l.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.t6m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WristTemperatureCard.r0(this.i, context, view);
            }
        });
    }

    @Override // com.heytap.health.main.card.common.HealthBaseCard
    public void R() {
        m8b.f(TAG, "refresh WristTemperatureCard");
        o0();
    }

    @Override // com.heytap.health.main.card.common.HealthBaseCard
    public void T() {
        OLiveData<WristTemperatureStat> oLiveDataB;
        super.T();
        WristHistoryViewModel wristHistoryViewModel = this.mViewModel;
        if (wristHistoryViewModel == null || (oLiveDataB = wristHistoryViewModel.B()) == null) {
            return;
        }
        oLiveDataB.removeObserver(this.lastWristDataObserver);
    }

    @Override // com.heytap.health.main.card.common.HealthBaseCard
    public void V() {
        super.V();
        o0();
    }

    @Override // com.heytap.health.main.card.common.HealthBaseCard
    public void X(@Nullable Context context) {
        if (n0() && !m0().b(DevicesAbilityEnum.WRIST_TEMPERATURE)) {
            god.c().e(this.k, Uri.parse("healthap://app/path=113?extra_launch_type=7&jumpUrl=health-guide/index.html?steerCode=wristtemperature"), null, this.t);
            return;
        }
        if (context != null) {
            ActivityTransitionUtil.Companion companion = ActivityTransitionUtil.INSTANCE;
            FragmentActivity mActivity = this.k;
            Intrinsics.checkNotNullExpressionValue(mActivity, "mActivity");
            Intent intent = new Intent(this.k, (Class<?>) WristTemperatureHistoryActivity.class);
            HealthCommonCardView healthCommonCardView = this.t;
            Intrinsics.checkNotNullExpressionValue(healthCommonCardView, "healthCommonCardView");
            companion.n(mActivity, intent, healthCommonCardView);
        }
    }

    public final boolean l0(WristTemperatureStat last, WristTemperatureStat newly) {
        return last != null && !J() && last.getDate() == newly.getDate() && last.getWristTemperature() == newly.getWristTemperature() && last.getDayBaseLineWristTemperature() == newly.getDayBaseLineWristTemperature();
    }

    public final DevicesAbilityUtils m0() {
        return (DevicesAbilityUtils) this.devicesAbilityUtils.getValue();
    }

    public final boolean n0() {
        return this.wristStatData == null && this.countDown == -1;
    }

    public final void o0() {
        int iX = ((IDataSyncService) e1.d().h(IDataSyncService.class)).x(ot8.h());
        m8b.f(TAG, "countDown:" + iX + " ");
        boolean z = true;
        boolean z2 = (iX == 0 || iX == -1) ? false : true;
        if (this.countDown == iX && this.ifShowCountDown == z2) {
            z = false;
        }
        this.countDown = iX;
        this.ifShowCountDown = z2;
        if (this.mViewModel == null) {
            FragmentActivity mActivity = this.k;
            Intrinsics.checkNotNullExpressionValue(mActivity, "mActivity");
            WristHistoryViewModel wristHistoryViewModel = (WristHistoryViewModel) new ViewModelProvider(mActivity).get(WristHistoryViewModel.class);
            this.mViewModel = wristHistoryViewModel;
            Intrinsics.checkNotNull(wristHistoryViewModel);
            wristHistoryViewModel.B().removeObservers(this.k);
        }
        WristHistoryViewModel wristHistoryViewModel2 = this.mViewModel;
        Intrinsics.checkNotNull(wristHistoryViewModel2);
        String ssoid = cn.c().getSsoid();
        Intrinsics.checkNotNullExpressionValue(ssoid, "getAccountManager().getSsoid()");
        wristHistoryViewModel2.J(ssoid);
        WristHistoryViewModel wristHistoryViewModel3 = this.mViewModel;
        Intrinsics.checkNotNull(wristHistoryViewModel3);
        wristHistoryViewModel3.B().observe(this.k, this.lastWristDataObserver);
        if (!this.ifShowCountDown) {
            WristHistoryViewModel wristHistoryViewModel4 = this.mViewModel;
            Intrinsics.checkNotNull(wristHistoryViewModel4);
            wristHistoryViewModel4.A();
        } else if (z || J()) {
            S();
        }
    }

    public final boolean p0() {
        WristTemperatureStat wristTemperatureStat = this.wristStatData;
        if (wristTemperatureStat == null) {
            return true;
        }
        Intrinsics.checkNotNull(wristTemperatureStat);
        return wristTemperatureStat.getDayBaseLineWristTemperature() == 0;
    }

    public final void s0(View mCommonView) {
        float f;
        if (p0() || this.ifShowCountDown) {
            m8b.f(TAG, "refreshViewIfNeed() isEmpty return :" + this.ifShowCountDown);
            return;
        }
        m8b.f(TAG, "refreshViewIfNeed() mCommonView = " + (mCommonView == null));
        if (mCommonView == null) {
            S();
            return;
        }
        TextView textView = (TextView) mCommonView.findViewById(R$id.tvDataTip);
        this.r = System.currentTimeMillis();
        HealthProgressBarView3 healthProgressBarView3 = (HealthProgressBarView3) mCommonView.findViewById(R$id.progress_bar_view);
        WristTemperatureStat wristTemperatureStat = this.wristStatData;
        Intrinsics.checkNotNull(wristTemperatureStat);
        int wristTemperature = wristTemperatureStat.getWristTemperature();
        WristTemperatureStat wristTemperatureStat2 = this.wristStatData;
        Intrinsics.checkNotNull(wristTemperatureStat2);
        float dayBaseLineWristTemperature = (wristTemperature - wristTemperatureStat2.getDayBaseLineWristTemperature()) / 100.0f;
        m6m.Companion companion = m6m.INSTANCE;
        float fC = companion.c(dayBaseLineWristTemperature);
        String str = companion.g(dayBaseLineWristTemperature, swf.d()) + this.f5984j.getString(com.heytap.health.health_base.R$string.health_base_degree_centigrade);
        this.t.f5989n.setTextSize(22.0f);
        this.t.setDataContent(str);
        this.t.p.setVisibility(8);
        this.t.o.setVisibility(0);
        HealthCommonCardView healthCommonCardView = this.t;
        pr8 pr8Var = pr8.INSTANCE;
        WristTemperatureStat wristTemperatureStat3 = this.wristStatData;
        Intrinsics.checkNotNull(wristTemperatureStat3);
        healthCommonCardView.e(pr8Var.g(wristTemperatureStat3.getDate()), true);
        healthProgressBarView3.setDrawCursor(true);
        textView.setVisibility(0);
        if (fC > 1.0f) {
            textView.setText(this.f5984j.getString(com.heytap.health.health.impl.R$string.health_home_card_wrist_baseline2));
            f = 25.0f;
        } else if (fC < -1.0f) {
            textView.setText(this.f5984j.getString(com.heytap.health.health.impl.R$string.health_home_card_wrist_baseline1));
            f = 5.0f;
        } else {
            if (fC == 0.0f) {
                textView.setText(this.f5984j.getString(com.heytap.health.health.impl.R$string.health_home_card_wrist_baseline_state3));
            } else {
                textView.setText(this.f5984j.getString(com.heytap.health.health.impl.R$string.health_home_card_wrist_baseline3));
            }
            f = 15.0f;
        }
        healthProgressBarView3.setIntervalPx(0);
        healthProgressBarView3.setCursorColor(ContextCompat.getColor(this.f5984j, R$color.lib_base_colorBlack));
        healthProgressBarView3.setCurSorType(HealthProgressBarView3.CurSorType.CENTER);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new c1f(0.0f, 9.0f, ContextCompat.getColor(this.f5984j, com.heytap.health.health.impl.R$color.health_color_2A93E6), "", ""));
        arrayList.add(new c1f(10.0f, 19.0f, ContextCompat.getColor(this.f5984j, com.heytap.health.health.impl.R$color.health_color_7E35FD), "", ""));
        arrayList.add(new c1f(20.0f, 30.0f, ContextCompat.getColor(this.f5984j, com.heytap.health.health.impl.R$color.health_color_F45E27), "", ""));
        healthProgressBarView3.setData(arrayList, f);
        if (o()) {
            healthProgressBarView3.animateY();
        }
    }

    @Override // com.heytap.health.main.card.common.HealthBaseCard
    @NotNull
    public HomeCardDataEnum$DataType t() {
        return HomeCardDataEnum$DataType.WRIST_TEMPERATURE;
    }

    @Override // com.heytap.health.main.card.common.HealthBaseCard
    @NotNull
    public HomeCardDataEnum$CardUiMode y() {
        return HomeCardDataEnum$CardUiMode.CARD_HALF_LINE_NOT_FOLLOWED;
    }
}