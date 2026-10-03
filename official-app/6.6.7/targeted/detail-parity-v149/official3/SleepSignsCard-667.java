package com.heytap.health.sleep.day.card;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import com.alibaba.android.arouter.facade.Postcard;
import com.google.security.cryptauth.lib.securegcm.SecureGcmConstants;
import com.heytap.databaseengine.model.SleepIndex;
import com.heytap.databaseengine.model.UserInfo;
import com.heytap.databaseengine.model.physicalMental.PhysicalMentalStat;
import com.heytap.health.base.ui.dialog.HealthAlertDialogBuilder;
import com.heytap.health.health.HealthService;
import com.heytap.health.health.family.FamilyMoreDataDetailConfigBean;
import com.heytap.health.healthbase.ability.DevicesAbilityEnum;
import com.heytap.health.healthbase.ability.utils.DevicesAbilityUtils;
import com.heytap.health.healthbase.view.HealthBubbleView;
import com.heytap.health.hrv.hrv.HrvHistoryActivity;
import com.heytap.health.sleep.R$id;
import com.heytap.health.sleep.R$layout;
import com.heytap.health.sleep.R$string;
import com.heytap.health.sleep.bean.SleepDayBean;
import com.heytap.health.sleep.day.BreathRateActivity;
import com.heytap.health.sleep.day.SleepHistoryDayFragment;
import com.heytap.health.sleep.day.card.SleepSignsCard;
import com.heytap.health.sleep.day.viewmodel.SignsViewModel;
import com.heytap.health.sleep.day.viewmodel.SleepCardStyleViewModel;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.e1;
import com.oplus.aiunit.vision.e88;
import com.oplus.aiunit.vision.fdg;
import com.oplus.aiunit.vision.gke;
import com.oplus.aiunit.vision.gmk;
import com.oplus.aiunit.vision.m8b;
import com.oplus.aiunit.vision.pr8;
import com.oplus.aiunit.vision.xmk;
import com.oplus.aiunit.vision.zn9;
import com.support.dialog.R$style;
import com.xiaomi.mipush.sdk.Constants;
import io.protostuff.MapSchema;
import java.util.Arrays;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Function;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.FunctionAdapter;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;
import p010kotlin.jvm.internal.StringCompanionObject;
import p010kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes18.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 k2\u00020\u0001:\u0001lB\u001b\u0012\u0006\u0010h\u001a\u00020g\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\bi\u0010jJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002J\b\u0010\n\u001a\u00020\u0004H\u0003J\b\u0010\u000b\u001a\u00020\u0004H\u0003J\b\u0010\f\u001a\u00020\u0004H\u0003J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0003J\b\u0010\u0011\u001a\u00020\u0010H\u0016J\u0018\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0014J\u0010\u0010\u0017\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016R$\u0010\u001f\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0016\u0010#\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010'\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0018\u0010*\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0018\u0010.\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0018\u00100\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010-R\u0018\u00102\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010-R\u0018\u00104\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u0010-R\u0018\u00106\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u0010-R\u0018\u00108\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u0010-R\u0018\u0010<\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0018\u0010>\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010;R\u0018\u0010@\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010;R\u0018\u0010B\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010;R\u0018\u0010D\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010;R\u0018\u0010F\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010;R\u0018\u0010H\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010;R\u0018\u0010L\u001a\u0004\u0018\u00010I8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0016\u0010P\u001a\u00020M8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bN\u0010OR\u0016\u0010Q\u001a\u00020M8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0006\u0010OR\u0016\u0010S\u001a\u00020M8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bR\u0010OR\u0016\u0010U\u001a\u00020M8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bT\u0010OR\u0016\u0010W\u001a\u00020M8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bV\u0010OR\u0016\u0010X\u001a\u00020M8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b&\u0010OR\u0016\u0010Z\u001a\u00020I8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bY\u0010KR\u0016\u0010\\\u001a\u00020I8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b[\u0010KR\u0016\u0010_\u001a\u00020]8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010^R\u0016\u0010`\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010&R\u0016\u0010b\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010&R\u0016\u0010c\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010&R\u0016\u0010e\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010&R\u0016\u0010f\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010&¨\u0006m"}, d2 = {"Lcom/heytap/health/sleep/day/card/SleepSignsCard;", "Lcom/heytap/health/sleep/day/card/SleepStyleCard;", "", "wrist", "", "c0", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Lcom/heytap/health/sleep/bean/SleepDayBean;", "curSleepDayBean", "m0", "d0", "f0", "h0", "", "breathRangeValue", "j0", "", MapSchema.FIELD_NAME_ENTRY, "Landroid/content/Context;", "context", "Landroid/view/View;", "cardView", LogFieldKey.PROCESS_NAME_KEY, "z", "Lcom/heytap/health/health/family/FamilyMoreDataDetailConfigBean;", "C", "Lcom/heytap/health/health/family/FamilyMoreDataDetailConfigBean;", "getFamilyConfigBean", "()Lcom/heytap/health/health/family/FamilyMoreDataDetailConfigBean;", "setFamilyConfigBean", "(Lcom/heytap/health/health/family/FamilyMoreDataDetailConfigBean;)V", "familyConfigBean", "Landroidx/fragment/app/FragmentActivity;", "D", "Landroidx/fragment/app/FragmentActivity;", "fragmentActivity", "", ExifInterface.LONGITUDE_EAST, "Z", "isFromFamily", UserInfo.SEX_FEMALE, "Landroid/view/View;", "rootView", "Landroid/widget/RelativeLayout;", "G", "Landroid/widget/RelativeLayout;", "rvBreathRate", "H", "rvHeartRateRange", "I", "rvDatumHeartRate", "J", "rvHrv", "K", "rvWristTemperature", "L", "rvAverageSpo2", "Landroid/widget/TextView;", "M", "Landroid/widget/TextView;", "tvAverageSpo2Value", "N", "tvBreathRateValue", "O", "tvHeartRateRangeValue", SecureGcmConstants.MESSAGE_KEY, "tvDatumHeartRateValue", "Q", "tvHrvValue", "R", "tvWristValue", "S", "tvDatumHeartRateLabel", "Lcom/heytap/health/healthbase/view/HealthBubbleView;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/heytap/health/healthbase/view/HealthBubbleView;", "bubbleView", "Landroid/widget/ImageView;", "U", "Landroid/widget/ImageView;", "ivBreathRate", "ivHeartRateRange", ExifInterface.LONGITUDE_WEST, "ivDatumHeartRate", "X", "ivHrv", "Y", "ivSpo2", "ivWristTemperature", "a0", "bubbleViewHr", "b0", "bubbleViewHrNoData", "Lcom/heytap/health/sleep/day/viewmodel/SignsViewModel;", "Lcom/heytap/health/sleep/day/viewmodel/SignsViewModel;", "signsViewModel", "curHasWristData", "e0", "isSupportSleepBreathRate", "isSupportSleepHeartRateRange", "g0", "isSupportSleepDatumHeartRate", "isSupportPhoneMeasure", "Lcom/heytap/health/sleep/day/SleepHistoryDayFragment;", "fragment", "<init>", "(Lcom/heytap/health/sleep/day/SleepHistoryDayFragment;Lcom/heytap/health/health/family/FamilyMoreDataDetailConfigBean;)V", "Companion", "a", "sleep_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSleepSignsCard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SleepSignsCard.kt\ncom/heytap/health/sleep/day/card/SleepSignsCard\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,609:1\n254#2:610\n254#2:611\n254#2:612\n1855#3,2:613\n*S KotlinDebug\n*F\n+ 1 SleepSignsCard.kt\ncom/heytap/health/sleep/day/card/SleepSignsCard\n*L\n447#1:610\n448#1:611\n449#1:612\n487#1:613,2\n*E\n"})
public final class SleepSignsCard extends SleepStyleCard {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @Nullable
    public FamilyMoreDataDetailConfigBean familyConfigBean;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @NotNull
    public FragmentActivity fragmentActivity;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public final boolean isFromFamily;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    @Nullable
    public View rootView;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    @Nullable
    public RelativeLayout rvBreathRate;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    @Nullable
    public RelativeLayout rvHeartRateRange;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    @Nullable
    public RelativeLayout rvDatumHeartRate;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    @Nullable
    public RelativeLayout rvHrv;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    @Nullable
    public RelativeLayout rvWristTemperature;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    @Nullable
    public RelativeLayout rvAverageSpo2;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    @Nullable
    public TextView tvAverageSpo2Value;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    @Nullable
    public TextView tvBreathRateValue;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    @Nullable
    public TextView tvHeartRateRangeValue;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    @Nullable
    public TextView tvDatumHeartRateValue;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    @Nullable
    public TextView tvHrvValue;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    @Nullable
    public TextView tvWristValue;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    @Nullable
    public TextView tvDatumHeartRateLabel;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    @Nullable
    public HealthBubbleView bubbleView;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    public ImageView ivBreathRate;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    public ImageView ivHeartRateRange;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    public ImageView ivDatumHeartRate;

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    public ImageView ivHrv;

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    public ImageView ivSpo2;

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    public ImageView ivWristTemperature;

    /* JADX INFO: renamed from: a0, reason: from kotlin metadata */
    public HealthBubbleView bubbleViewHr;

    /* JADX INFO: renamed from: b0, reason: from kotlin metadata */
    public HealthBubbleView bubbleViewHrNoData;

    /* JADX INFO: renamed from: c0, reason: from kotlin metadata */
    @NotNull
    public SignsViewModel signsViewModel;

    /* JADX INFO: renamed from: d0, reason: from kotlin metadata */
    public boolean curHasWristData;

    /* JADX INFO: renamed from: e0, reason: from kotlin metadata */
    public boolean isSupportSleepBreathRate;

    /* JADX INFO: renamed from: f0, reason: from kotlin metadata */
    public boolean isSupportSleepHeartRateRange;

    /* JADX INFO: renamed from: g0, reason: from kotlin metadata */
    public boolean isSupportSleepDatumHeartRate;

    /* JADX INFO: renamed from: h0, reason: from kotlin metadata */
    public boolean isSupportPhoneMeasure;
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016¨\u0006\u0005"}, d2 = {"com/heytap/health/sleep/day/card/SleepSignsCard$b", "Lcom/oplus/aiunit/vision/zn9;", "", "a", "b", "sleep_release"}, k = 1, mv = {1, 8, 0})
    public static final class b implements zn9 {
        public b() {
        }

        @Override // com.oplus.aiunit.vision.zn9
        public void a() {
            if (!SleepSignsCard.this.isFromFamily) {
                com.heytap.health.base.track.a.k().a(xmk.TAG_MODULE_ID, 7).a(xmk.TAG_POSTION1, 4).b();
            }
            fdg.x("health_sleep_share_preference").W("sleep_signs_bubble_tips", true);
            SleepSignsCard.this.d0();
        }

        @Override // com.oplus.aiunit.vision.zn9
        public void b() {
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016¨\u0006\u0005"}, d2 = {"com/heytap/health/sleep/day/card/SleepSignsCard$c", "Lcom/oplus/aiunit/vision/zn9;", "", "a", "b", "sleep_release"}, k = 1, mv = {1, 8, 0})
    public static final class c implements zn9 {
        public c() {
        }

        @Override // com.oplus.aiunit.vision.zn9
        public void a() {
            fdg.x("health_sleep_share_preference").W("sleep_phone_measure_heart_rate_bubble_tips", true);
            SleepSignsCard.this.f0();
        }

        @Override // com.oplus.aiunit.vision.zn9
        public void b() {
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016¨\u0006\u0005"}, d2 = {"com/heytap/health/sleep/day/card/SleepSignsCard$d", "Lcom/oplus/aiunit/vision/zn9;", "", "a", "b", "sleep_release"}, k = 1, mv = {1, 8, 0})
    public static final class d implements zn9 {
        public d() {
        }

        @Override // com.oplus.aiunit.vision.zn9
        public void a() {
            SleepSignsCard.this.h0();
        }

        @Override // com.oplus.aiunit.vision.zn9
        public void b() {
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class e implements Observer, FunctionAdapter {
        public final /* synthetic */ Function1 i;

        public e(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.i = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p010kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.i;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.i.invoke(obj);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SleepSignsCard(@NotNull SleepHistoryDayFragment fragment, @Nullable FamilyMoreDataDetailConfigBean familyMoreDataDetailConfigBean) {
        super(fragment, SleepCardStyleViewModel.SleepCardStyle.SLEEP_ANALYSIS);
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        this.familyConfigBean = familyMoreDataDetailConfigBean;
        FragmentActivity fragmentActivityRequireActivity = fragment.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "fragment.requireActivity()");
        this.fragmentActivity = fragmentActivityRequireActivity;
        this.isFromFamily = this.familyConfigBean != null;
        SignsViewModel signsViewModel = (SignsViewModel) new ViewModelProvider(fragmentActivityRequireActivity).get(SignsViewModel.class);
        this.signsViewModel = signsViewModel;
        signsViewModel.w().observe(this.fragmentActivity, new e(new Function1<Float, Unit>() { // from class: com.heytap.health.sleep.day.card.SleepSignsCard.1
            {
                super(1);
            }

            @Override // p010kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Float f) {
                invoke2(f);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Float it) {
                SleepSignsCard sleepSignsCard = SleepSignsCard.this;
                Intrinsics.checkNotNullExpressionValue(it, "it");
                sleepSignsCard.c0(it.floatValue());
            }
        }));
        FamilyMoreDataDetailConfigBean familyMoreDataDetailConfigBean2 = this.familyConfigBean;
        if (familyMoreDataDetailConfigBean2 != null) {
            this.signsViewModel.y(familyMoreDataDetailConfigBean2.getSsoid());
        }
    }

    public static final void W(SleepSignsCard this$0, View view) {
        int iIntValue;
        String strValueOf;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        SleepDayBean curSleepDayBean = this$0.getCurSleepDayBean();
        SleepIndex sleepIndex = curSleepDayBean != null ? curSleepDayBean.getSleepIndex() : null;
        if (sleepIndex != null && sleepIndex.getDeviceUniqueId() != null) {
            String deviceUniqueId = sleepIndex.getDeviceUniqueId();
            Intrinsics.checkNotNullExpressionValue(deviceUniqueId, "sleepIndex.deviceUniqueId");
            if (!StringsKt__StringsKt.contains$default((CharSequence) deviceUniqueId, (CharSequence) ":", false, 2, (Object) null)) {
                Integer avgSleepBreathRangeHigh = sleepIndex.getAvgSleepBreathRangeHigh();
                if (avgSleepBreathRangeHigh == null) {
                    iIntValue = 0;
                } else {
                    Intrinsics.checkNotNullExpressionValue(avgSleepBreathRangeHigh, "sleepIndex.avgSleepBreathRangeHigh ?: 0");
                    iIntValue = avgSleepBreathRangeHigh.intValue();
                }
                if (iIntValue > 0) {
                    Integer avgSleepBreathRangeHigh2 = sleepIndex.getAvgSleepBreathRangeHigh();
                    strValueOf = String.valueOf((avgSleepBreathRangeHigh2 != null ? avgSleepBreathRangeHigh2.intValue() : 0) / 10.0f);
                } else {
                    strValueOf = "--";
                }
                this$0.j0(strValueOf);
                return;
            }
        }
        if (this$0.isFromFamily) {
            return;
        }
        com.heytap.health.base.track.a.k().a(xmk.TAG_MODULE_ID, 7).a(xmk.TAG_POSTION1, 1).b();
        Intent intent = new Intent(this$0.fragmentActivity, (Class<?>) BreathRateActivity.class);
        intent.putExtra("startTime", this$0.getCurDayStartTime());
        intent.putExtra("endTime", this$0.getCurDayEndTime());
        this$0.fragmentActivity.startActivity(intent);
    }

    public static final void X(SleepSignsCard this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.isFromFamily) {
            return;
        }
        com.heytap.health.base.track.a.k().a(xmk.TAG_MODULE_ID, 7).a(xmk.TAG_POSTION1, 2).b();
        ((HealthService) e1.d().h(HealthService.class)).K5(this$0.fragmentActivity, String.valueOf(pr8.INSTANCE.e(this$0.getCurDayEndTime())));
    }

    public static final void Y(SleepSignsCard this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.isFromFamily) {
            return;
        }
        com.heytap.health.base.track.a.k().a(xmk.TAG_MODULE_ID, 7).a(xmk.TAG_POSTION1, 3).b();
        ((HealthService) e1.d().h(HealthService.class)).K5(this$0.fragmentActivity, String.valueOf(pr8.INSTANCE.e(this$0.getCurDayEndTime())));
    }

    public static final void Z(SleepSignsCard this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.isFromFamily) {
            return;
        }
        e1.d().b("/wrist_temperature/WristTemperatureHistoryActivity").withSerializable("jump_date", Long.valueOf(this$0.getCurDayEndTime())).navigation();
        com.heytap.health.base.track.a.k().a(xmk.TAG_MODULE_ID, 7).a(xmk.TAG_POSTION1, 5).b();
    }

    public static final void a0(SleepSignsCard this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.isFromFamily || this$0.getCurSleepDayBean() == null) {
            return;
        }
        Postcard postcardB = e1.d().b("/bloodoxygen/BloodOxygenHistoryActivity");
        pr8 pr8Var = pr8.INSTANCE;
        SleepDayBean curSleepDayBean = this$0.getCurSleepDayBean();
        Intrinsics.checkNotNull(curSleepDayBean);
        postcardB.withString("date", String.valueOf(pr8Var.e(curSleepDayBean.getCurDayEndTime()))).navigation();
    }

    public static final void b0(SleepSignsCard this$0, View view) {
        SleepDayBean curSleepDayBean;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.isFromFamily || (curSleepDayBean = this$0.getCurSleepDayBean()) == null) {
            return;
        }
        e1.d().b("/hrv/HrvHistoryActivity").withLong("currentDayTime", pr8.INSTANCE.c(curSleepDayBean.getTimestamp())).withBoolean(HrvHistoryActivity.ALL_DAY, false).navigation();
    }

    public static final void e0(DialogInterface dialog, int i) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        dialog.dismiss();
    }

    public static final void g0(DialogInterface dialog, int i) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        dialog.dismiss();
    }

    public static final void i0(DialogInterface dialog, int i) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        dialog.dismiss();
    }

    public static final void k0(DialogInterface dialog, int i) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        dialog.dismiss();
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0067  */
    /* JADX WARN: Code duplicated, block: B:36:0x0070  */
    public final void V() {
        RelativeLayout relativeLayout = this.rvBreathRate;
        Intrinsics.checkNotNull(relativeLayout);
        if (relativeLayout.getVisibility() == 0) {
            F(true);
            if (getCurSleepDayBean() != null) {
                SleepDayBean curSleepDayBean = getCurSleepDayBean();
                Intrinsics.checkNotNull(curSleepDayBean);
                m0(curSleepDayBean);
            }
        } else {
            RelativeLayout relativeLayout2 = this.rvHeartRateRange;
            Intrinsics.checkNotNull(relativeLayout2);
            if (relativeLayout2.getVisibility() == 0) {
                F(true);
                if (getCurSleepDayBean() != null) {
                    SleepDayBean curSleepDayBean2 = getCurSleepDayBean();
                    Intrinsics.checkNotNull(curSleepDayBean2);
                    m0(curSleepDayBean2);
                }
            } else {
                RelativeLayout relativeLayout3 = this.rvDatumHeartRate;
                Intrinsics.checkNotNull(relativeLayout3);
                if (relativeLayout3.getVisibility() == 0) {
                    F(true);
                    if (getCurSleepDayBean() != null) {
                        SleepDayBean curSleepDayBean3 = getCurSleepDayBean();
                        Intrinsics.checkNotNull(curSleepDayBean3);
                        m0(curSleepDayBean3);
                    }
                } else {
                    RelativeLayout relativeLayout4 = this.rvWristTemperature;
                    Intrinsics.checkNotNull(relativeLayout4);
                    if (relativeLayout4.getVisibility() == 0) {
                        F(true);
                        if (getCurSleepDayBean() != null) {
                            SleepDayBean curSleepDayBean4 = getCurSleepDayBean();
                            Intrinsics.checkNotNull(curSleepDayBean4);
                            m0(curSleepDayBean4);
                        }
                    } else {
                        RelativeLayout relativeLayout5 = this.rvHrv;
                        Intrinsics.checkNotNull(relativeLayout5);
                        if (relativeLayout5.getVisibility() == 0) {
                            F(true);
                            if (getCurSleepDayBean() != null) {
                                SleepDayBean curSleepDayBean5 = getCurSleepDayBean();
                                Intrinsics.checkNotNull(curSleepDayBean5);
                                m0(curSleepDayBean5);
                            }
                        } else {
                            RelativeLayout relativeLayout6 = this.rvAverageSpo2;
                            Intrinsics.checkNotNull(relativeLayout6);
                            if (relativeLayout6.getVisibility() == 0) {
                                F(true);
                                if (getCurSleepDayBean() != null) {
                                    SleepDayBean curSleepDayBean6 = getCurSleepDayBean();
                                    Intrinsics.checkNotNull(curSleepDayBean6);
                                    m0(curSleepDayBean6);
                                }
                            } else {
                                F(false);
                            }
                        }
                    }
                }
            }
        }
        C();
    }

    public final void c0(float wrist) {
        if (getIsInit()) {
            boolean z = !(wrist == -10000.0f);
            this.curHasWristData = z;
            m8b.f("SleepSignsCard", "wrist:" + wrist + ", curHasWristData:" + z);
            if (this.curHasWristData) {
                Float tempValue = ((HealthService) e1.d().h(HealthService.class)).T5(wrist);
                Intrinsics.checkNotNullExpressionValue(tempValue, "tempValue");
                if (tempValue.floatValue() > 0.0f) {
                    TextView textView = this.tvWristValue;
                    if (textView != null) {
                        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                        String string = this.fragmentActivity.getString(R$string.health_sleep_wrist_temperature_value_height);
                        Intrinsics.checkNotNullExpressionValue(string, "fragmentActivity.getStri…temperature_value_height)");
                        String str = String.format("%.1f", Arrays.copyOf(new Object[]{tempValue}, 1));
                        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                        String str2 = String.format(string, Arrays.copyOf(new Object[]{str}, 1));
                        Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
                        textView.setText(str2);
                    }
                } else if (tempValue.floatValue() < 0.0f) {
                    TextView textView2 = this.tvWristValue;
                    if (textView2 != null) {
                        StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                        String string2 = this.fragmentActivity.getString(R$string.health_sleep_wrist_temperature_value_low);
                        Intrinsics.checkNotNullExpressionValue(string2, "fragmentActivity.getStri…st_temperature_value_low)");
                        String str3 = String.format("%.1f", Arrays.copyOf(new Object[]{tempValue}, 1));
                        Intrinsics.checkNotNullExpressionValue(str3, "format(...)");
                        String str4 = String.format(string2, Arrays.copyOf(new Object[]{str3}, 1));
                        Intrinsics.checkNotNullExpressionValue(str4, "format(...)");
                        textView2.setText(str4);
                    }
                } else {
                    TextView textView3 = this.tvWristValue;
                    if (textView3 != null) {
                        StringCompanionObject stringCompanionObject3 = StringCompanionObject.INSTANCE;
                        String string3 = this.fragmentActivity.getString(R$string.health_sleep_wrist_temperature_value_normal);
                        Intrinsics.checkNotNullExpressionValue(string3, "fragmentActivity.getStri…temperature_value_normal)");
                        String str5 = String.format("%.1f", Arrays.copyOf(new Object[]{tempValue}, 1));
                        Intrinsics.checkNotNullExpressionValue(str5, "format(...)");
                        String str6 = String.format(string3, Arrays.copyOf(new Object[]{str5}, 1));
                        Intrinsics.checkNotNullExpressionValue(str6, "format(...)");
                        textView3.setText(str6);
                    }
                }
            } else {
                TextView textView4 = this.tvWristValue;
                if (textView4 != null) {
                    textView4.setText("--");
                }
            }
            if (this.curHasWristData) {
                RelativeLayout relativeLayout = this.rvWristTemperature;
                if (relativeLayout != null) {
                    relativeLayout.setVisibility(0);
                }
            } else {
                RelativeLayout relativeLayout2 = this.rvWristTemperature;
                if (relativeLayout2 != null) {
                    relativeLayout2.setVisibility(8);
                }
            }
            V();
        }
    }

    @SuppressLint({"InflateParams"})
    public final void d0() {
        View viewInflate = this.fragmentActivity.getLayoutInflater().inflate(R$layout.health_sleep_snore_risk_bubble_tips_dialog, (ViewGroup) null);
        TextView textView = (TextView) viewInflate.findViewById(R$id.tv_tip1);
        TextView textView2 = (TextView) viewInflate.findViewById(R$id.tv_tip2);
        TextView textView3 = (TextView) viewInflate.findViewById(R$id.tv_tip3);
        textView.setText(this.fragmentActivity.getString(R$string.health_sleep_signs_tips1));
        textView2.setText(this.fragmentActivity.getString(R$string.health_sleep_signs_tips2));
        textView3.setText(this.fragmentActivity.getString(R$string.health_sleep_signs_tips3));
        HealthAlertDialogBuilder healthAlertDialogBuilder = new HealthAlertDialogBuilder(getContext(), R$style.COUIAlertDialog_Bottom);
        healthAlertDialogBuilder.setTitle(this.fragmentActivity.getString(R$string.health_sleep_signs_tips));
        healthAlertDialogBuilder.setView(viewInflate);
        healthAlertDialogBuilder.setNegativeButton(e88.a().getString(com.heytap.health.base.R$string.lib_base_dialog_ok), new DialogInterface.OnClickListener() { // from class: com.oplus.aiunit.vision.osh
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                SleepSignsCard.e0(dialogInterface, i);
            }
        });
        healthAlertDialogBuilder.show();
    }

    @Override // com.heytap.health.base.view.recyclercard.a
    public int e() {
        return R$layout.health_sleep_signs_view;
    }

    @SuppressLint({"InflateParams"})
    public final void f0() {
        View viewInflate = this.fragmentActivity.getLayoutInflater().inflate(R$layout.health_sleep_snore_risk_bubble_tips_dialog, (ViewGroup) null);
        TextView textView = (TextView) viewInflate.findViewById(R$id.tv_tip1);
        TextView textView2 = (TextView) viewInflate.findViewById(R$id.tv_tip2);
        TextView textView3 = (TextView) viewInflate.findViewById(R$id.tv_tip3);
        textView.setText(this.fragmentActivity.getString(R$string.health_sleep_phone_measure_heart_rate_tip2));
        textView2.setVisibility(8);
        textView3.setVisibility(8);
        HealthAlertDialogBuilder healthAlertDialogBuilder = new HealthAlertDialogBuilder(getContext(), R$style.COUIAlertDialog_Bottom);
        healthAlertDialogBuilder.setTitle(this.fragmentActivity.getString(R$string.health_sleep_phone_measure_heart_rate_tip1));
        healthAlertDialogBuilder.setView(viewInflate);
        healthAlertDialogBuilder.setNegativeButton(e88.a().getString(com.heytap.health.base.R$string.lib_base_dialog_ok), new DialogInterface.OnClickListener() { // from class: com.oplus.aiunit.vision.rsh
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                SleepSignsCard.g0(dialogInterface, i);
            }
        });
        healthAlertDialogBuilder.show();
    }

    @SuppressLint({"InflateParams"})
    public final void h0() {
        View viewInflate = this.fragmentActivity.getLayoutInflater().inflate(R$layout.health_sleep_snore_risk_bubble_tips_dialog, (ViewGroup) null);
        TextView textView = (TextView) viewInflate.findViewById(R$id.tv_tip1);
        TextView textView2 = (TextView) viewInflate.findViewById(R$id.tv_tip2);
        TextView textView3 = (TextView) viewInflate.findViewById(R$id.tv_tip3);
        textView.setText(this.fragmentActivity.getString(R$string.health_sleep_phone_measure_heart_rate_no_data_tip2));
        textView2.setText(this.fragmentActivity.getString(R$string.health_sleep_phone_measure_heart_rate_no_data_tip3));
        textView3.setText(this.fragmentActivity.getString(R$string.health_sleep_phone_measure_heart_rate_no_data_tip4));
        HealthAlertDialogBuilder healthAlertDialogBuilder = new HealthAlertDialogBuilder(getContext(), R$style.COUIAlertDialog_Bottom);
        healthAlertDialogBuilder.setTitle(this.fragmentActivity.getString(R$string.health_sleep_phone_measure_heart_rate_no_data_tip1));
        healthAlertDialogBuilder.setView(viewInflate);
        healthAlertDialogBuilder.setNegativeButton(e88.a().getString(com.heytap.health.base.R$string.lib_base_dialog_ok), new DialogInterface.OnClickListener() { // from class: com.oplus.aiunit.vision.psh
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                SleepSignsCard.i0(dialogInterface, i);
            }
        });
        healthAlertDialogBuilder.show();
    }

    @SuppressLint({"InflateParams"})
    public final void j0(String breathRangeValue) {
        View viewInflate = this.fragmentActivity.getLayoutInflater().inflate(R$layout.health_sleep_day_phone_breathe_rate_dialog, (ViewGroup) null);
        TextView textView = (TextView) viewInflate.findViewById(R$id.tv_value);
        if (textView != null) {
            textView.setText(breathRangeValue);
        }
        HealthAlertDialogBuilder healthAlertDialogBuilder = new HealthAlertDialogBuilder(getContext(), R$style.COUIAlertDialog_Bottom);
        healthAlertDialogBuilder.setTitle(this.fragmentActivity.getString(R$string.health_sleep_breath_rate));
        healthAlertDialogBuilder.setView(viewInflate);
        healthAlertDialogBuilder.setNegativeButton(e88.a().getString(com.heytap.health.base.R$string.lib_base_dialog_ok), new DialogInterface.OnClickListener() { // from class: com.oplus.aiunit.vision.qsh
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                SleepSignsCard.k0(dialogInterface, i);
            }
        });
        healthAlertDialogBuilder.show();
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0056  */
    public final void m0(SleepDayBean curSleepDayBean) {
        boolean z;
        boolean z2;
        int iIntValue;
        int iIntValue2;
        HealthBubbleView healthBubbleView;
        SleepIndex sleepIndex = curSleepDayBean.getSleepIndex();
        HealthBubbleView healthBubbleView2 = null;
        if (sleepIndex == null) {
            HealthBubbleView healthBubbleView3 = this.bubbleView;
            if (healthBubbleView3 != null) {
                healthBubbleView3.setVisibility(8);
            }
            HealthBubbleView healthBubbleView4 = this.bubbleViewHr;
            if (healthBubbleView4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bubbleViewHr");
                healthBubbleView4 = null;
            }
            healthBubbleView4.setVisibility(8);
            HealthBubbleView healthBubbleView5 = this.bubbleViewHrNoData;
            if (healthBubbleView5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bubbleViewHrNoData");
            } else {
                healthBubbleView2 = healthBubbleView5;
            }
            healthBubbleView2.setVisibility(8);
            return;
        }
        HealthBubbleView healthBubbleView6 = this.bubbleView;
        if (healthBubbleView6 != null) {
            healthBubbleView6.setVisibility(8);
        }
        Integer avgSleepBreathRangeLow = sleepIndex.getAvgSleepBreathRangeLow();
        if ((avgSleepBreathRangeLow == null ? 0 : avgSleepBreathRangeLow.intValue()) > 0) {
            z = true;
        } else {
            Integer avgSleepBreathRangeHigh = sleepIndex.getAvgSleepBreathRangeHigh();
            if ((avgSleepBreathRangeHigh == null ? 0 : avgSleepBreathRangeHigh.intValue()) > 0) {
                z = true;
            } else {
                z = false;
            }
        }
        if (!fdg.x("health_sleep_share_preference").q("sleep_signs_bubble_tips") && z && (healthBubbleView = this.bubbleView) != null) {
            healthBubbleView.setVisibility(0);
        }
        List<SleepIndex> sleepIndexList = curSleepDayBean.getSleepIndexList();
        HealthBubbleView healthBubbleView7 = this.bubbleViewHr;
        if (healthBubbleView7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bubbleViewHr");
            healthBubbleView7 = null;
        }
        healthBubbleView7.setVisibility(8);
        List<SleepIndex> list = sleepIndexList;
        if (list == null || list.isEmpty()) {
            z2 = false;
        } else {
            z2 = false;
            for (SleepIndex sleepIndex2 : sleepIndexList) {
                StringBuilder sb = new StringBuilder();
                sb.append("sleepIndex:");
                sb.append(sleepIndex2);
                Integer sleepHeartRateRangeLow = sleepIndex2.getSleepHeartRateRangeLow();
                if (sleepHeartRateRangeLow == null) {
                    iIntValue = 0;
                } else {
                    Intrinsics.checkNotNullExpressionValue(sleepHeartRateRangeLow, "it.sleepHeartRateRangeLow ?: 0");
                    iIntValue = sleepHeartRateRangeLow.intValue();
                }
                if (iIntValue > 0) {
                    Integer sleepHeartRateRangeHigh = sleepIndex2.getSleepHeartRateRangeHigh();
                    if (sleepHeartRateRangeHigh == null) {
                        iIntValue2 = 0;
                    } else {
                        Intrinsics.checkNotNullExpressionValue(sleepHeartRateRangeHigh, "it.sleepHeartRateRangeHigh ?: 0");
                        iIntValue2 = sleepHeartRateRangeHigh.intValue();
                    }
                    if (iIntValue2 > 0) {
                        m8b.f("SleepSignsCard", "phoneMeasureHeartRate: true");
                        z2 = true;
                    }
                }
            }
        }
        if (z2 && !fdg.x("health_sleep_share_preference").q("sleep_phone_measure_heart_rate_bubble_tips") && (curSleepDayBean.getDataSource() == 1 || curSleepDayBean.getDataSource() == 2)) {
            HealthBubbleView healthBubbleView8 = this.bubbleViewHr;
            if (healthBubbleView8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bubbleViewHr");
                healthBubbleView8 = null;
            }
            healthBubbleView8.setVisibility(0);
        }
        if (z2) {
            return;
        }
        if (curSleepDayBean.getDataSource() == 1 || curSleepDayBean.getDataSource() == 2) {
            HealthBubbleView healthBubbleView9 = this.bubbleViewHrNoData;
            if (healthBubbleView9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bubbleViewHrNoData");
            } else {
                healthBubbleView2 = healthBubbleView9;
            }
            healthBubbleView2.setVisibility(0);
        }
    }

    @Override // com.oplus.aiunit.vision.dq8
    public void p(@NotNull Context context, @NotNull View cardView) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(cardView, "cardView");
        View viewA = a(cardView, R$id.rootView);
        Intrinsics.checkNotNull(viewA, "null cannot be cast to non-null type android.view.View");
        this.rootView = viewA;
        View viewA2 = a(cardView, R$id.rvBreathRate);
        Intrinsics.checkNotNull(viewA2, "null cannot be cast to non-null type android.widget.RelativeLayout");
        this.rvBreathRate = (RelativeLayout) viewA2;
        View viewA3 = a(cardView, R$id.rvHeartRateRange);
        Intrinsics.checkNotNull(viewA3, "null cannot be cast to non-null type android.widget.RelativeLayout");
        this.rvHeartRateRange = (RelativeLayout) viewA3;
        View viewA4 = a(cardView, R$id.rvDatumHeartRate);
        Intrinsics.checkNotNull(viewA4, "null cannot be cast to non-null type android.widget.RelativeLayout");
        this.rvDatumHeartRate = (RelativeLayout) viewA4;
        View viewA5 = a(cardView, R$id.rvHrv);
        Intrinsics.checkNotNull(viewA5, "null cannot be cast to non-null type android.widget.RelativeLayout");
        this.rvHrv = (RelativeLayout) viewA5;
        View viewA6 = a(cardView, R$id.rvWristTemperature);
        Intrinsics.checkNotNull(viewA6, "null cannot be cast to non-null type android.widget.RelativeLayout");
        this.rvWristTemperature = (RelativeLayout) viewA6;
        View viewA7 = a(cardView, R$id.rvAverageSpo2);
        Intrinsics.checkNotNull(viewA7, "null cannot be cast to non-null type android.widget.RelativeLayout");
        this.rvAverageSpo2 = (RelativeLayout) viewA7;
        View viewA8 = a(cardView, R$id.tvAverageSpo2Value);
        Intrinsics.checkNotNull(viewA8, "null cannot be cast to non-null type android.widget.TextView");
        this.tvAverageSpo2Value = (TextView) viewA8;
        View viewA9 = a(cardView, R$id.tvBreathRateValue);
        Intrinsics.checkNotNull(viewA9, "null cannot be cast to non-null type android.widget.TextView");
        this.tvBreathRateValue = (TextView) viewA9;
        View viewA10 = a(cardView, R$id.tvDatumHeartRateLabel);
        Intrinsics.checkNotNull(viewA10, "null cannot be cast to non-null type android.widget.TextView");
        this.tvDatumHeartRateLabel = (TextView) viewA10;
        View viewA11 = a(cardView, R$id.tvHeartRateRangeValue);
        Intrinsics.checkNotNull(viewA11, "null cannot be cast to non-null type android.widget.TextView");
        this.tvHeartRateRangeValue = (TextView) viewA11;
        View viewA12 = a(cardView, R$id.tvDatumHeartRateValue);
        Intrinsics.checkNotNull(viewA12, "null cannot be cast to non-null type android.widget.TextView");
        this.tvDatumHeartRateValue = (TextView) viewA12;
        View viewA13 = a(cardView, R$id.tvWristValue);
        Intrinsics.checkNotNull(viewA13, "null cannot be cast to non-null type android.widget.TextView");
        this.tvWristValue = (TextView) viewA13;
        View viewA14 = a(cardView, R$id.tvHrvValue);
        Intrinsics.checkNotNull(viewA14, "null cannot be cast to non-null type android.widget.TextView");
        this.tvHrvValue = (TextView) viewA14;
        View viewA15 = a(cardView, R$id.bubble_view);
        Intrinsics.checkNotNull(viewA15, "null cannot be cast to non-null type com.heytap.health.healthbase.view.HealthBubbleView");
        this.bubbleView = (HealthBubbleView) viewA15;
        View viewA16 = a(cardView, R$id.bubble_view_heart_rate);
        Intrinsics.checkNotNull(viewA16, "null cannot be cast to non-null type com.heytap.health.healthbase.view.HealthBubbleView");
        this.bubbleViewHr = (HealthBubbleView) viewA16;
        View viewA17 = a(cardView, R$id.bubble_view_heart_rate_no_data);
        Intrinsics.checkNotNull(viewA17, "null cannot be cast to non-null type com.heytap.health.healthbase.view.HealthBubbleView");
        this.bubbleViewHrNoData = (HealthBubbleView) viewA17;
        View viewA18 = a(cardView, R$id.ivBreathRate);
        Intrinsics.checkNotNull(viewA18, "null cannot be cast to non-null type android.widget.ImageView");
        this.ivBreathRate = (ImageView) viewA18;
        View viewA19 = a(cardView, R$id.ivHeartRateRange);
        Intrinsics.checkNotNull(viewA19, "null cannot be cast to non-null type android.widget.ImageView");
        this.ivHeartRateRange = (ImageView) viewA19;
        View viewA20 = a(cardView, R$id.ivDatumHeartRate);
        Intrinsics.checkNotNull(viewA20, "null cannot be cast to non-null type android.widget.ImageView");
        this.ivDatumHeartRate = (ImageView) viewA20;
        View viewA21 = a(cardView, R$id.ivHrv);
        Intrinsics.checkNotNull(viewA21, "null cannot be cast to non-null type android.widget.ImageView");
        this.ivHrv = (ImageView) viewA21;
        View viewA22 = a(cardView, R$id.ivSpo2);
        Intrinsics.checkNotNull(viewA22, "null cannot be cast to non-null type android.widget.ImageView");
        this.ivSpo2 = (ImageView) viewA22;
        View viewA23 = a(cardView, R$id.ivWristTemperature);
        Intrinsics.checkNotNull(viewA23, "null cannot be cast to non-null type android.widget.ImageView");
        this.ivWristTemperature = (ImageView) viewA23;
        HealthBubbleView healthBubbleView = null;
        if (this.isFromFamily) {
            ImageView imageView = this.ivBreathRate;
            if (imageView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("ivBreathRate");
                imageView = null;
            }
            imageView.setVisibility(8);
            ImageView imageView2 = this.ivHeartRateRange;
            if (imageView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("ivHeartRateRange");
                imageView2 = null;
            }
            imageView2.setVisibility(8);
            ImageView imageView3 = this.ivDatumHeartRate;
            if (imageView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("ivDatumHeartRate");
                imageView3 = null;
            }
            imageView3.setVisibility(8);
            ImageView imageView4 = this.ivHrv;
            if (imageView4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("ivHrv");
                imageView4 = null;
            }
            imageView4.setVisibility(8);
            ImageView imageView5 = this.ivSpo2;
            if (imageView5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("ivSpo2");
                imageView5 = null;
            }
            imageView5.setVisibility(8);
            ImageView imageView6 = this.ivWristTemperature;
            if (imageView6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("ivWristTemperature");
                imageView6 = null;
            }
            imageView6.setVisibility(8);
        } else {
            ImageView imageView7 = this.ivBreathRate;
            if (imageView7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("ivBreathRate");
                imageView7 = null;
            }
            imageView7.setVisibility(0);
            ImageView imageView8 = this.ivHeartRateRange;
            if (imageView8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("ivHeartRateRange");
                imageView8 = null;
            }
            imageView8.setVisibility(0);
            ImageView imageView9 = this.ivDatumHeartRate;
            if (imageView9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("ivDatumHeartRate");
                imageView9 = null;
            }
            imageView9.setVisibility(0);
            ImageView imageView10 = this.ivHrv;
            if (imageView10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("ivHrv");
                imageView10 = null;
            }
            imageView10.setVisibility(0);
            ImageView imageView11 = this.ivSpo2;
            if (imageView11 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("ivSpo2");
                imageView11 = null;
            }
            imageView11.setVisibility(0);
            ImageView imageView12 = this.ivWristTemperature;
            if (imageView12 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("ivWristTemperature");
                imageView12 = null;
            }
            imageView12.setVisibility(0);
        }
        RelativeLayout relativeLayout = this.rvBreathRate;
        Intrinsics.checkNotNull(relativeLayout);
        relativeLayout.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.ish
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SleepSignsCard.W(this.i, view);
            }
        });
        RelativeLayout relativeLayout2 = this.rvHeartRateRange;
        Intrinsics.checkNotNull(relativeLayout2);
        relativeLayout2.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.jsh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SleepSignsCard.X(this.i, view);
            }
        });
        RelativeLayout relativeLayout3 = this.rvDatumHeartRate;
        Intrinsics.checkNotNull(relativeLayout3);
        relativeLayout3.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.ksh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SleepSignsCard.Y(this.i, view);
            }
        });
        RelativeLayout relativeLayout4 = this.rvWristTemperature;
        Intrinsics.checkNotNull(relativeLayout4);
        relativeLayout4.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.lsh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SleepSignsCard.Z(this.i, view);
            }
        });
        RelativeLayout relativeLayout5 = this.rvAverageSpo2;
        Intrinsics.checkNotNull(relativeLayout5);
        relativeLayout5.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.msh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SleepSignsCard.a0(this.i, view);
            }
        });
        RelativeLayout relativeLayout6 = this.rvHrv;
        if (relativeLayout6 != null) {
            relativeLayout6.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.nsh
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SleepSignsCard.b0(this.i, view);
                }
            });
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String string = this.fragmentActivity.getString(R$string.health_sleep_heart_rate_range_value);
        Intrinsics.checkNotNullExpressionValue(string, "fragmentActivity.getStri…p_heart_rate_range_value)");
        String str = String.format(string, Arrays.copyOf(new Object[]{"-- "}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        TextView textView = this.tvBreathRateValue;
        if (textView != null) {
            String string2 = this.fragmentActivity.getString(R$string.health_sleep_breath_rate_range_value);
            Intrinsics.checkNotNullExpressionValue(string2, "fragmentActivity.getStri…_breath_rate_range_value)");
            String str2 = String.format(string2, Arrays.copyOf(new Object[]{"-- "}, 1));
            Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
            textView.setText(str2);
        }
        TextView textView2 = this.tvHeartRateRangeValue;
        if (textView2 != null) {
            textView2.setText(str);
        }
        TextView textView3 = this.tvDatumHeartRateValue;
        if (textView3 != null) {
            textView3.setText(str);
        }
        TextView textView4 = this.tvWristValue;
        if (textView4 != null) {
            textView4.setText("--");
        }
        TextView textView5 = this.tvHrvValue;
        if (textView5 != null) {
            textView5.setText("--");
        }
        HealthBubbleView healthBubbleView2 = this.bubbleView;
        if (healthBubbleView2 != null) {
            healthBubbleView2.setOnBubbleClickListener(new b());
        }
        HealthBubbleView healthBubbleView3 = this.bubbleViewHr;
        if (healthBubbleView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bubbleViewHr");
            healthBubbleView3 = null;
        }
        healthBubbleView3.setOnBubbleClickListener(new c());
        HealthBubbleView healthBubbleView4 = this.bubbleViewHrNoData;
        if (healthBubbleView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bubbleViewHrNoData");
        } else {
            healthBubbleView = healthBubbleView4;
        }
        healthBubbleView.setOnBubbleClickListener(new d());
        DevicesAbilityUtils devicesAbilityUtils = new DevicesAbilityUtils();
        this.isSupportSleepBreathRate = devicesAbilityUtils.c(DevicesAbilityEnum.SLEEP_BREATH_RATE);
        this.isSupportSleepHeartRateRange = devicesAbilityUtils.c(DevicesAbilityEnum.SLEEP_HEART_RATE_RANGE);
        this.isSupportSleepDatumHeartRate = devicesAbilityUtils.c(DevicesAbilityEnum.SLEEP_DATUM_HEART_RATE);
        this.isSupportPhoneMeasure = gke.INSTANCE.c();
    }

    /* JADX WARN: Code duplicated, block: B:49:0x014d  */
    /* JADX WARN: Code duplicated, block: B:52:0x0168  */
    /* JADX WARN: Code duplicated, block: B:84:0x0276  */
    /* JADX WARN: Code duplicated, block: B:87:0x027d  */
    /* JADX WARN: Instruction removed from duplicated block: B:49:0x014d, please report this as an issue */
    @Override // com.oplus.aiunit.vision.beh
    public void z(@NotNull SleepDayBean curSleepDayBean) {
        RelativeLayout relativeLayout;
        int i;
        String str;
        String str2;
        TextView textView;
        TextView textView2;
        Intrinsics.checkNotNullParameter(curSleepDayBean, "curSleepDayBean");
        super.z(curSleepDayBean);
        if (!getIsInit()) {
            m8b.f("SleepSignsCard", "No initialization completed");
            return;
        }
        SleepIndex sleepIndex = curSleepDayBean.getSleepIndex();
        TextView textView3 = this.tvDatumHeartRateLabel;
        if (textView3 != null) {
            textView3.setVisibility(8);
        }
        if (this.isSupportSleepBreathRate || this.isSupportPhoneMeasure) {
            RelativeLayout relativeLayout2 = this.rvBreathRate;
            Intrinsics.checkNotNull(relativeLayout2);
            relativeLayout2.setVisibility(0);
            TextView textView4 = this.tvBreathRateValue;
            if (textView4 != null) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String string = this.fragmentActivity.getString(R$string.health_sleep_breath_rate_range_value);
                Intrinsics.checkNotNullExpressionValue(string, "fragmentActivity.getStri…_breath_rate_range_value)");
                String str3 = String.format(string, Arrays.copyOf(new Object[]{"-- "}, 1));
                Intrinsics.checkNotNullExpressionValue(str3, "format(...)");
                textView4.setText(str3);
            }
        } else {
            RelativeLayout relativeLayout3 = this.rvBreathRate;
            Intrinsics.checkNotNull(relativeLayout3);
            relativeLayout3.setVisibility(8);
        }
        if (this.isSupportSleepHeartRateRange || this.isSupportPhoneMeasure) {
            RelativeLayout relativeLayout4 = this.rvHeartRateRange;
            Intrinsics.checkNotNull(relativeLayout4);
            relativeLayout4.setVisibility(0);
            TextView textView5 = this.tvHeartRateRangeValue;
            if (textView5 != null) {
                StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                String string2 = this.fragmentActivity.getString(R$string.health_sleep_heart_rate_range_value);
                Intrinsics.checkNotNullExpressionValue(string2, "fragmentActivity.getStri…p_heart_rate_range_value)");
                String str4 = String.format(string2, Arrays.copyOf(new Object[]{"-- "}, 1));
                Intrinsics.checkNotNullExpressionValue(str4, "format(...)");
                textView5.setText(str4);
            }
        } else {
            RelativeLayout relativeLayout5 = this.rvHeartRateRange;
            Intrinsics.checkNotNull(relativeLayout5);
            relativeLayout5.setVisibility(8);
        }
        if (this.isSupportSleepDatumHeartRate) {
            RelativeLayout relativeLayout6 = this.rvDatumHeartRate;
            Intrinsics.checkNotNull(relativeLayout6);
            relativeLayout6.setVisibility(0);
            TextView textView6 = this.tvDatumHeartRateValue;
            if (textView6 != null) {
                StringCompanionObject stringCompanionObject3 = StringCompanionObject.INSTANCE;
                String string3 = this.fragmentActivity.getString(R$string.health_sleep_heart_rate_range_value);
                Intrinsics.checkNotNullExpressionValue(string3, "fragmentActivity.getStri…p_heart_rate_range_value)");
                String str5 = String.format(string3, Arrays.copyOf(new Object[]{"-- "}, 1));
                Intrinsics.checkNotNullExpressionValue(str5, "format(...)");
                textView6.setText(str5);
            }
        } else {
            RelativeLayout relativeLayout7 = this.rvDatumHeartRate;
            Intrinsics.checkNotNull(relativeLayout7);
            relativeLayout7.setVisibility(8);
        }
        if (sleepIndex != null) {
            int iB = gmk.b(sleepIndex.getAvgSleepBreathRangeLow());
            int iB2 = gmk.b(sleepIndex.getAvgSleepBreathRangeHigh());
            if (iB > 0 || iB2 > 0) {
                RelativeLayout relativeLayout8 = this.rvBreathRate;
                Intrinsics.checkNotNull(relativeLayout8);
                relativeLayout8.setVisibility(0);
                if (sleepIndex.getDeviceUniqueId() != null) {
                    String deviceUniqueId = sleepIndex.getDeviceUniqueId();
                    Intrinsics.checkNotNullExpressionValue(deviceUniqueId, "sleepIndex.deviceUniqueId");
                    if (StringsKt__StringsKt.contains$default((CharSequence) deviceUniqueId, (CharSequence) ":", false, 2, (Object) null)) {
                        str2 = (iB / 10.0f) + Constants.ACCEPT_TIME_SEPARATOR_SERVER + (iB2 / 10.0f);
                        textView = this.tvBreathRateValue;
                        if (textView != null) {
                            StringCompanionObject stringCompanionObject4 = StringCompanionObject.INSTANCE;
                            String string4 = this.fragmentActivity.getString(R$string.health_sleep_breath_rate_range_value);
                            Intrinsics.checkNotNullExpressionValue(string4, "fragmentActivity.getStri…_breath_rate_range_value)");
                            String str6 = String.format(string4, Arrays.copyOf(new Object[]{str2}, 1));
                            Intrinsics.checkNotNullExpressionValue(str6, "format(...)");
                            textView.setText(str6);
                        }
                    } else {
                        TextView textView7 = this.tvBreathRateValue;
                        if (textView7 != null) {
                            StringCompanionObject stringCompanionObject5 = StringCompanionObject.INSTANCE;
                            String string5 = this.fragmentActivity.getString(R$string.health_sleep_breath_rate_range_value);
                            Intrinsics.checkNotNullExpressionValue(string5, "fragmentActivity.getStri…_breath_rate_range_value)");
                            String str7 = String.format(string5, Arrays.copyOf(new Object[]{String.valueOf(iB2 / 10.0f)}, 1));
                            Intrinsics.checkNotNullExpressionValue(str7, "format(...)");
                            textView7.setText(str7);
                        }
                    }
                } else {
                    str2 = (iB / 10.0f) + Constants.ACCEPT_TIME_SEPARATOR_SERVER + (iB2 / 10.0f);
                    textView = this.tvBreathRateValue;
                    if (textView != null) {
                        StringCompanionObject stringCompanionObject6 = StringCompanionObject.INSTANCE;
                        String string6 = this.fragmentActivity.getString(R$string.health_sleep_breath_rate_range_value);
                        Intrinsics.checkNotNullExpressionValue(string6, "fragmentActivity.getStri…_breath_rate_range_value)");
                        String str8 = String.format(string6, Arrays.copyOf(new Object[]{str2}, 1));
                        Intrinsics.checkNotNullExpressionValue(str8, "format(...)");
                        textView.setText(str8);
                    }
                }
            }
            int iB3 = gmk.b(sleepIndex.getSleepHeartRateRangeLow());
            int iB4 = gmk.b(sleepIndex.getSleepHeartRateRangeHigh());
            if (iB3 > 0 || iB4 > 0) {
                RelativeLayout relativeLayout9 = this.rvHeartRateRange;
                Intrinsics.checkNotNull(relativeLayout9);
                relativeLayout9.setVisibility(0);
                String str9 = iB3 + Constants.ACCEPT_TIME_SEPARATOR_SERVER + iB4;
                TextView textView8 = this.tvHeartRateRangeValue;
                if (textView8 != null) {
                    StringCompanionObject stringCompanionObject7 = StringCompanionObject.INSTANCE;
                    String string7 = this.fragmentActivity.getString(R$string.health_sleep_heart_rate_range_value);
                    Intrinsics.checkNotNullExpressionValue(string7, "fragmentActivity.getStri…p_heart_rate_range_value)");
                    String str10 = String.format(string7, Arrays.copyOf(new Object[]{str9}, 1));
                    Intrinsics.checkNotNullExpressionValue(str10, "format(...)");
                    textView8.setText(str10);
                }
            }
            if (gmk.b(sleepIndex.getAvgSleepHeartRate()) > 0) {
                RelativeLayout relativeLayout10 = this.rvDatumHeartRate;
                Intrinsics.checkNotNull(relativeLayout10);
                relativeLayout10.setVisibility(0);
                TextView textView9 = this.tvDatumHeartRateValue;
                if (textView9 != null) {
                    StringCompanionObject stringCompanionObject8 = StringCompanionObject.INSTANCE;
                    String string8 = this.fragmentActivity.getString(R$string.health_sleep_heart_rate_range_value);
                    Intrinsics.checkNotNullExpressionValue(string8, "fragmentActivity.getStri…p_heart_rate_range_value)");
                    String str11 = String.format(string8, Arrays.copyOf(new Object[]{String.valueOf(sleepIndex.getAvgSleepHeartRate())}, 1));
                    Intrinsics.checkNotNullExpressionValue(str11, "format(...)");
                    textView9.setText(str11);
                }
            }
            if (sleepIndex.getHasHeartRateWarning() > 0 && (textView2 = this.tvDatumHeartRateLabel) != null) {
                textView2.setVisibility(0);
            }
        }
        if (curSleepDayBean.getHrvStat() != null) {
            PhysicalMentalStat hrvStat = curSleepDayBean.getHrvStat();
            Intrinsics.checkNotNull(hrvStat);
            if (hrvStat.getAvgSleepHrv() > 0) {
                RelativeLayout relativeLayout11 = this.rvHrv;
                if (relativeLayout11 != null) {
                    relativeLayout11.setVisibility(0);
                }
                TextView textView10 = this.tvHrvValue;
                if (textView10 != null) {
                    StringCompanionObject stringCompanionObject9 = StringCompanionObject.INSTANCE;
                    String string9 = this.fragmentActivity.getString(R$string.health_sleep_hrv_average_value);
                    Intrinsics.checkNotNullExpressionValue(string9, "fragmentActivity.getStri…_sleep_hrv_average_value)");
                    PhysicalMentalStat hrvStat2 = curSleepDayBean.getHrvStat();
                    Intrinsics.checkNotNull(hrvStat2);
                    String str12 = String.format(string9, Arrays.copyOf(new Object[]{String.valueOf(hrvStat2.getAvgSleepHrv())}, 1));
                    Intrinsics.checkNotNullExpressionValue(str12, "format(...)");
                    textView10.setText(str12);
                }
            } else {
                relativeLayout = this.rvHrv;
                if (relativeLayout != null) {
                    i = 8;
                    relativeLayout.setVisibility(8);
                }
            }
            i = 8;
        } else {
            relativeLayout = this.rvHrv;
            if (relativeLayout != null) {
                i = 8;
            } else {
                i = 8;
                relativeLayout.setVisibility(8);
            }
        }
        if (curSleepDayBean.getShowAverageBlood() > 0) {
            str = curSleepDayBean.getShowAverageBlood() + "%";
        } else {
            str = "-- %";
        }
        TextView textView11 = this.tvAverageSpo2Value;
        if (textView11 != null) {
            textView11.setText(str);
        }
        RelativeLayout relativeLayout12 = this.rvAverageSpo2;
        if (relativeLayout12 != null) {
            relativeLayout12.setVisibility(curSleepDayBean.isApnea() ? 0 : i);
        }
        V();
        this.signsViewModel.x(curSleepDayBean.getCurDayEndTime(), curSleepDayBean.getCurDayEndTime());
    }
}