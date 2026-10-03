package com.heytap.health.main.card;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.RecyclerView;
import com.heytap.databaseengine.model.snore.OsaResultBean;
import com.heytap.health.base.livedata.OLiveData;
import com.heytap.health.base.task.ThreadUtils;
import com.heytap.health.base.ui.dialog.HealthAlertDialogBuilder;
import com.heytap.health.base.view.adapter.MultiLayoutAdapter;
import com.heytap.health.health.impl.R$drawable;
import com.heytap.health.health.impl.R$id;
import com.heytap.health.health.impl.R$layout;
import com.heytap.health.health.impl.R$string;
import com.heytap.health.health_base.R$color;
import com.heytap.health.healthbase.ability.DevicesAbilityEnum;
import com.heytap.health.healthbase.ability.utils.DevicesAbilityUtils;
import com.heytap.health.healthbase.view.HealthProgressBarView3;
import com.heytap.health.homecard.constant.HomeCardDataEnum$CardUiMode;
import com.heytap.health.homecard.constant.HomeCardDataEnum$DataType;
import com.heytap.health.main.card.SnoreCard;
import com.heytap.health.main.card.common.HealthBaseCard;
import com.heytap.health.main.card.common.HealthCommonCardView;
import com.heytap.health.sleep.snore.viewmodel.SnoreCardViewModel;
import com.heytap.health.wallet.ui.adapter.BaseRecyclerViewHolder;
import com.oplus.aiunit.vision.acl;
import com.oplus.aiunit.vision.c1f;
import com.oplus.aiunit.vision.cn;
import com.oplus.aiunit.vision.fb5;
import com.oplus.aiunit.vision.hp;
import com.oplus.aiunit.vision.m8b;
import com.oplus.aiunit.vision.ot8;
import com.oplus.aiunit.vision.pr8;
import com.oplus.aiunit.vision.w0b;
import com.oplus.aiunit.vision.wl4;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 @2\u00020\u0001:\u0001AB\u001b\b\u0016\u0012\u0006\u0010;\u001a\u00020:\u0012\b\u0010=\u001a\u0004\u0018\u00010<¢\u0006\u0004\b>\u0010?J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0014J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0014J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016J\u0006\u0010\r\u001a\u00020\fJ$\u0010\u0012\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\b\u0010\u0013\u001a\u00020\u0002H\u0016J\b\u0010\u0014\u001a\u00020\u0002H\u0002J\b\u0010\u0015\u001a\u00020\u0002H\u0002J\u0018\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0002J\u0018\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\fH\u0002J\b\u0010\u001f\u001a\u00020\u0002H\u0002J\b\u0010 \u001a\u00020\u0002H\u0002J\u001c\u0010$\u001a\u00020\f2\b\u0010\"\u001a\u0004\u0018\u00010!2\b\u0010#\u001a\u0004\u0018\u00010!H\u0002R\u0018\u0010(\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0018\u0010+\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0018\u0010.\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u001b\u00104\u001a\u00020/8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R \u00109\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!06058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108¨\u0006B"}, d2 = {"Lcom/heytap/health/main/card/SnoreCard;", "Lcom/heytap/health/main/card/common/HealthBaseCard;", "", "R", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Lcom/heytap/health/homecard/constant/HomeCardDataEnum$DataType;", "t", "Lcom/heytap/health/homecard/constant/HomeCardDataEnum$CardUiMode;", "y", "Landroid/content/Context;", "context", "X", "", "p0", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", BaseRecyclerViewHolder.HOLDER_TAG_HEADER, "", "position", "L", ExifInterface.GPS_DIRECTION_TRUE, "t0", "w0", "Lcom/heytap/health/healthbase/view/HealthProgressBarView3;", "healthProgressBarView", "", "cursorValue", "v0", "Landroid/view/View;", "commonView", "needAnimate", "s0", "o0", "m0", "Lcom/heytap/databaseengine/model/snore/OsaResultBean;", "lastData", "newData", "l0", "Lcom/heytap/health/sleep/snore/viewmodel/SnoreCardViewModel;", "z", "Lcom/heytap/health/sleep/snore/viewmodel/SnoreCardViewModel;", "mViewModel", "A", "Lcom/heytap/databaseengine/model/snore/OsaResultBean;", "mData", acl.KEY_B, "Ljava/lang/Boolean;", "isInstall", "Lcom/heytap/health/healthbase/ability/utils/DevicesAbilityUtils;", "C", "Lkotlin/Lazy;", "n0", "()Lcom/heytap/health/healthbase/ability/utils/DevicesAbilityUtils;", "devicesAbilityUtils", "Landroidx/lifecycle/Observer;", "", "D", "Landroidx/lifecycle/Observer;", "mObserverDataStat", "Landroidx/fragment/app/FragmentActivity;", "activity", "Lcom/heytap/health/base/view/adapter/MultiLayoutAdapter;", "adapter", "<init>", "(Landroidx/fragment/app/FragmentActivity;Lcom/heytap/health/base/view/adapter/MultiLayoutAdapter;)V", "Companion", "a", "health_impl_release"}, k = 1, mv = {1, 8, 0})
public final class SnoreCard extends HealthBaseCard {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @Nullable
    public OsaResultBean mData;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @Nullable
    public Boolean isInstall;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @NotNull
    public final Lazy devicesAbilityUtils;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @NotNull
    public final Observer<List<OsaResultBean>> mObserverDataStat;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @Nullable
    public SnoreCardViewModel mViewModel;
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"", "Lcom/heytap/databaseengine/model/snore/OsaResultBean;", "it", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class b implements Observer<List<OsaResultBean>> {
        public b() {
        }

        @Override // androidx.lifecycle.Observer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void onChanged(@NotNull List<OsaResultBean> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            if (!w0b.b(it, 1)) {
                SnoreCard.this.S();
                return;
            }
            SnoreCard snoreCard = SnoreCard.this;
            boolean zL0 = snoreCard.l0(snoreCard.mData, it.get(0));
            m8b.f("SnoreCard", "dataConsistent:" + zL0);
            if (zL0) {
                return;
            }
            SnoreCard.this.mData = it.get(0);
            SnoreCard.this.W();
            SnoreCard.this.S();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnoreCard(@NotNull FragmentActivity activity, @Nullable MultiLayoutAdapter multiLayoutAdapter) {
        super(activity, multiLayoutAdapter);
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.isInstall = Boolean.TRUE;
        this.devicesAbilityUtils = LazyKt__LazyJVMKt.lazy(new Function0<DevicesAbilityUtils>() { // from class: com.heytap.health.main.card.SnoreCard$devicesAbilityUtils$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p010kotlin.jvm.functions.Function0
            @NotNull
            public final DevicesAbilityUtils invoke() {
                return new DevicesAbilityUtils();
            }
        });
        this.mObserverDataStat = new b();
        o0();
    }

    public static final void q0(SnoreCard this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Context mContext = this$0.f5984j;
        Intrinsics.checkNotNullExpressionValue(mContext, "mContext");
        this$0.X(mContext);
    }

    public static final void r0(SnoreCard this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Context mContext = this$0.f5984j;
        Intrinsics.checkNotNullExpressionValue(mContext, "mContext");
        this$0.X(mContext);
    }

    public static final void u0(SnoreCard this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        fb5 fb5VarFindDeviceAppStatusByMacAndAppIds = wl4.businessApi.findDeviceAppStatusByMacAndAppIds(ot8.h(), 28);
        this$0.isInstall = fb5VarFindDeviceAppStatusByMacAndAppIds != null ? Boolean.valueOf(fb5VarFindDeviceAppStatusByMacAndAppIds.b()) : null;
    }

    public static final void x0(DialogInterface dialog, int i) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        dialog.dismiss();
    }

    @Override // com.heytap.health.main.card.common.HealthBaseCard
    public void L(@Nullable RecyclerView.ViewHolder holder, int position, @Nullable Context context) {
        super.L(holder, position, context);
        boolean zP0 = p0();
        StringBuilder sb = new StringBuilder();
        sb.append("onCommonBindViewHolder isEmpty is:");
        sb.append(zP0);
        if (zP0) {
            this.t.setIcon(R$drawable.health_icon_snore);
            this.t.f(this.f5984j.getString(R$string.health_card_snore), this.f5984j.getString(R$string.health_home_card_snore_no_data_tip), this.f5984j.getString(R$string.health_home_card_to_understand));
            this.t.v.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.qxh
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SnoreCard.q0(this.i, view);
                }
            });
            this.t.f5988l.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.rxh
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SnoreCard.r0(this.i, view);
                }
            });
            return;
        }
        View mCommonView = x(R$layout.health_common_snore_card);
        HealthCommonCardView healthCommonCardView = this.t;
        healthCommonCardView.setDataModel(healthCommonCardView.getContext().getString(R$string.health_card_snore));
        Intrinsics.checkNotNullExpressionValue(mCommonView, "mCommonView");
        s0(mCommonView, o());
    }

    @Override // com.heytap.health.main.card.common.HealthBaseCard
    public void R() {
        if (n0().d(DevicesAbilityEnum.APNEA) == 1) {
            t0();
        }
        m8b.f("SnoreCard", "refresh");
        m0();
    }

    @Override // com.heytap.health.main.card.common.HealthBaseCard
    public void T() {
        OLiveData<List<OsaResultBean>> oLiveDataW;
        super.T();
        SnoreCardViewModel snoreCardViewModel = this.mViewModel;
        if (snoreCardViewModel == null || (oLiveDataW = snoreCardViewModel.w()) == null) {
            return;
        }
        oLiveDataW.removeObserver(this.mObserverDataStat);
    }

    @Override // com.heytap.health.main.card.common.HealthBaseCard
    public void V() {
        super.V();
        m0();
    }

    @Override // com.heytap.health.main.card.common.HealthBaseCard
    public void X(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        DevicesAbilityUtils devicesAbilityUtilsN0 = n0();
        DevicesAbilityEnum devicesAbilityEnum = DevicesAbilityEnum.APNEA;
        if (devicesAbilityUtilsN0.d(devicesAbilityEnum) == 1) {
            t0();
            if (Intrinsics.areEqual(this.isInstall, Boolean.FALSE)) {
                w0();
                return;
            }
        }
        if (n0().b(devicesAbilityEnum) || !p0()) {
            FragmentActivity mActivity = this.k;
            Intrinsics.checkNotNullExpressionValue(mActivity, "mActivity");
            HealthCommonCardView healthCommonCardView = this.t;
            Intrinsics.checkNotNullExpressionValue(healthCommonCardView, "healthCommonCardView");
            hp.c(mActivity, false, healthCommonCardView);
            return;
        }
        FragmentActivity mActivity2 = this.k;
        Intrinsics.checkNotNullExpressionValue(mActivity2, "mActivity");
        HealthCommonCardView healthCommonCardView2 = this.t;
        Intrinsics.checkNotNullExpressionValue(healthCommonCardView2, "healthCommonCardView");
        hp.c(mActivity2, true, healthCommonCardView2);
    }

    public final boolean l0(OsaResultBean lastData, OsaResultBean newData) {
        if (lastData == null || newData == null || J()) {
            return false;
        }
        byte osaLevel = newData.getOsaLevel();
        m8b.f("SnoreCard", "newData osaLevel:" + ((int) osaLevel) + ", date:" + newData.getDate() + ", version:" + newData.getVersion());
        return lastData.getDate() == newData.getDate() && lastData.getOsaLevel() == newData.getOsaLevel();
    }

    public final void m0() {
        SnoreCardViewModel snoreCardViewModel = this.mViewModel;
        if (snoreCardViewModel != null) {
            String ssoid = cn.c().getSsoid();
            Intrinsics.checkNotNullExpressionValue(ssoid, "getAccountManager().getSsoid()");
            snoreCardViewModel.x(ssoid);
            snoreCardViewModel.y();
        }
    }

    public final DevicesAbilityUtils n0() {
        return (DevicesAbilityUtils) this.devicesAbilityUtils.getValue();
    }

    public final void o0() {
        FragmentActivity mActivity = this.k;
        Intrinsics.checkNotNullExpressionValue(mActivity, "mActivity");
        SnoreCardViewModel snoreCardViewModel = (SnoreCardViewModel) new ViewModelProvider(mActivity).get(SnoreCardViewModel.class);
        this.mViewModel = snoreCardViewModel;
        Intrinsics.checkNotNull(snoreCardViewModel);
        snoreCardViewModel.w().observe(this.k, this.mObserverDataStat);
    }

    public final boolean p0() {
        return this.mData == null;
    }

    public final void s0(View commonView, boolean needAnimate) {
        String string;
        int color;
        String string2;
        if (p0()) {
            m8b.f("SnoreCard", "refreshChartView isEmpty");
            S();
            return;
        }
        m8b.f("SnoreCard", "refreshChartView");
        HealthProgressBarView3 healthProgressBarView = (HealthProgressBarView3) commonView.findViewById(R$id.progress_bar_view);
        healthProgressBarView.setIntervalPx(0);
        Context context = this.f5984j;
        int i = R$color.health_base_black_90alpha;
        int color2 = ContextCompat.getColor(context, i);
        OsaResultBean osaResultBean = this.mData;
        if (osaResultBean != null) {
            byte osaLevel = osaResultBean.getOsaLevel();
            if (osaLevel == 0) {
                string = this.t.getContext().getString(com.heytap.health.sleep.R$string.health_sleep_normal);
                Intrinsics.checkNotNullExpressionValue(string, "healthCommonCardView.con…ring.health_sleep_normal)");
                color = ContextCompat.getColor(this.f5984j, i);
                Intrinsics.checkNotNullExpressionValue(healthProgressBarView, "healthProgressBarView");
                v0(healthProgressBarView, 5.0f);
                if (needAnimate) {
                    healthProgressBarView.animateY();
                }
            } else if (osaLevel == 1) {
                string = this.t.getContext().getString(com.heytap.health.sleep.R$string.health_sleep_apnea_level_low);
                Intrinsics.checkNotNullExpressionValue(string, "healthCommonCardView.con…th_sleep_apnea_level_low)");
                color = ContextCompat.getColor(this.f5984j, com.heytap.health.sleep.R$color.health_sleep_snore_level_low);
                Intrinsics.checkNotNullExpressionValue(healthProgressBarView, "healthProgressBarView");
                v0(healthProgressBarView, 15.0f);
                if (needAnimate) {
                    healthProgressBarView.animateY();
                }
            } else {
                if (osaLevel != 2) {
                    if (osaLevel != 3) {
                        string2 = this.t.getContext().getString(com.heytap.health.sleep.R$string.health_sleep_no_assessment);
                        Intrinsics.checkNotNullExpressionValue(string2, "healthCommonCardView.con…alth_sleep_no_assessment)");
                        Intrinsics.checkNotNullExpressionValue(healthProgressBarView, "healthProgressBarView");
                        v0(healthProgressBarView, -1.0f);
                    } else {
                        string = this.t.getContext().getString(com.heytap.health.sleep.R$string.health_sleep_apnea_level_high);
                        Intrinsics.checkNotNullExpressionValue(string, "healthCommonCardView.con…h_sleep_apnea_level_high)");
                        color = ContextCompat.getColor(this.f5984j, com.heytap.health.sleep.R$color.health_sleep_snore_level_high);
                        Intrinsics.checkNotNullExpressionValue(healthProgressBarView, "healthProgressBarView");
                        v0(healthProgressBarView, 35.0f);
                        if (needAnimate) {
                            healthProgressBarView.animateY();
                        }
                    }
                    this.t.f5989n.setTextSize(18.0f);
                    this.t.f5989n.setTextColor(color2);
                    this.t.f5989n.setForceDarkAllowed(false);
                    this.t.p.setVisibility(8);
                    this.t.setDataContent(string2);
                    this.t.e(pr8.INSTANCE.g(osaResultBean.getDate()), true);
                }
                string = this.t.getContext().getString(com.heytap.health.sleep.R$string.health_sleep_apnea_level_medium);
                Intrinsics.checkNotNullExpressionValue(string, "healthCommonCardView.con…sleep_apnea_level_medium)");
                color = ContextCompat.getColor(this.f5984j, com.heytap.health.sleep.R$color.health_sleep_snore_level_medium);
                Intrinsics.checkNotNullExpressionValue(healthProgressBarView, "healthProgressBarView");
                v0(healthProgressBarView, 25.0f);
                if (needAnimate) {
                    healthProgressBarView.animateY();
                }
            }
            string2 = string;
            color2 = color;
            this.t.f5989n.setTextSize(18.0f);
            this.t.f5989n.setTextColor(color2);
            this.t.f5989n.setForceDarkAllowed(false);
            this.t.p.setVisibility(8);
            this.t.setDataContent(string2);
            this.t.e(pr8.INSTANCE.g(osaResultBean.getDate()), true);
        }
    }

    @Override // com.heytap.health.main.card.common.HealthBaseCard
    @NotNull
    public HomeCardDataEnum$DataType t() {
        return HomeCardDataEnum$DataType.SNORE;
    }

    public final void t0() {
        ThreadUtils.doInBackground(new Runnable() { // from class: com.oplus.aiunit.vision.pxh
            @Override // java.lang.Runnable
            public final void run() {
                SnoreCard.u0(this.i);
            }
        });
    }

    public final void v0(HealthProgressBarView3 healthProgressBarView, float cursorValue) {
        healthProgressBarView.setCursorColor(ContextCompat.getColor(this.f5984j, com.heytap.health.base.R$color.lib_base_colorBlack));
        healthProgressBarView.setCurSorType(HealthProgressBarView3.CurSorType.CENTER);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new c1f(1.0f, 10.0f, ContextCompat.getColor(this.f5984j, com.heytap.health.sleep.R$color.health_sleep_snore_level_normal), "", ""));
        arrayList.add(new c1f(11.0f, 20.0f, ContextCompat.getColor(this.f5984j, com.heytap.health.sleep.R$color.health_sleep_snore_level_low), "", ""));
        arrayList.add(new c1f(21.0f, 30.0f, ContextCompat.getColor(this.f5984j, com.heytap.health.sleep.R$color.health_sleep_snore_level_medium), "", ""));
        arrayList.add(new c1f(31.0f, 40.0f, ContextCompat.getColor(this.f5984j, com.heytap.health.sleep.R$color.health_sleep_snore_level_high), "", ""));
        if (cursorValue < 0.0f) {
            healthProgressBarView.setDrawCursor(false);
            healthProgressBarView.setData(arrayList, -1.0f);
        } else {
            healthProgressBarView.setDrawCursor(true);
            healthProgressBarView.setData(arrayList, cursorValue);
        }
    }

    public final void w0() {
        FragmentActivity mActivity = this.k;
        Intrinsics.checkNotNullExpressionValue(mActivity, "mActivity");
        HealthAlertDialogBuilder healthAlertDialogBuilder = new HealthAlertDialogBuilder(mActivity);
        healthAlertDialogBuilder.setTitle(this.k.getString(com.heytap.health.sleep.R$string.health_sleep_snore_watch_uninstall_title));
        healthAlertDialogBuilder.setMessage(this.k.getString(com.heytap.health.sleep.R$string.health_sleep_snore_watch_uninstall_mag));
        healthAlertDialogBuilder.setNegativeButton(this.k.getString(com.heytap.health.base.R$string.lib_base_dialog_ok), new DialogInterface.OnClickListener() { // from class: com.oplus.aiunit.vision.oxh
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                SnoreCard.x0(dialogInterface, i);
            }
        });
        healthAlertDialogBuilder.show();
    }

    @Override // com.heytap.health.main.card.common.HealthBaseCard
    @NotNull
    public HomeCardDataEnum$CardUiMode y() {
        return HomeCardDataEnum$CardUiMode.CARD_HALF_LINE_FOLLOWED;
    }
}