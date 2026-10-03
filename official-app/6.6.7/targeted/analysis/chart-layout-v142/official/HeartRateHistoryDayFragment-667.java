package com.heytap.health.heartrate.ui;

import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.core.view.ViewGroupKt;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.viewpager.widget.ViewPager;
import com.google.security.cryptauth.lib.securegcm.SecureGcmConstants;
import com.heytap.databaseengine.model.HeartRate;
import com.heytap.health.base.task.ThreadUtils;
import com.heytap.health.base.track.a;
import com.heytap.health.health.family.FamilyMoreDataDetailConfigBean;
import com.heytap.health.healthbase.util.HealthFrgType;
import com.heytap.health.heartrate.R$id;
import com.heytap.health.heartrate.R$layout;
import com.heytap.health.heartrate.measure.ui.HeartMeasureCard;
import com.heytap.health.heartrate.measure.ui.HeartMeasureGuideActivity;
import com.heytap.health.heartrate.measure.ui.HeartMeasureRecordCard;
import com.heytap.health.heartrate.measure.ui.HeartMeasureViewModel;
import com.heytap.health.heartrate.ui.HeartRateHistoryDayFragment;
import com.heytap.health.heartrate.ui.card.AtrialFibrilWarnCard;
import com.heytap.health.heartrate.ui.card.HeartDetailCard;
import com.heytap.health.heartrate.ui.card.HeartWarnCard;
import com.heytap.health.heartrate.utils.ChartTimeUnit;
import com.heytap.health.heartrate.utils.ChartType;
import com.heytap.health.heartrate.view.HeartRateDayView;
import com.heytap.health.heartrate.viewmodel.HeartRateCardViewModel;
import com.heytap.health.heartrate.viewmodel.HeartRateChartStyleViewModel;
import com.oplus.aiunit.vision.acl;
import com.oplus.aiunit.vision.dr8;
import com.oplus.aiunit.vision.fdg;
import com.oplus.aiunit.vision.fz6;
import com.oplus.aiunit.vision.gg8;
import com.oplus.aiunit.vision.h59;
import com.oplus.aiunit.vision.hrb;
import com.oplus.aiunit.vision.lo9;
import com.oplus.aiunit.vision.o15;
import com.oplus.aiunit.vision.q15;
import com.oplus.aiunit.vision.w4l;
import com.oplus.aiunit.vision.wl4;
import com.oplus.aiunit.vision.xmk;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Function;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.FunctionAdapter;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u0000 s2\u00020\u0001:\u0002tuB\u0007¢\u0006\u0004\bq\u0010rJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0002H\u0002J\b\u0010\b\u001a\u00020\u0002H\u0002J\b\u0010\t\u001a\u00020\u0002H\u0002J\b\u0010\n\u001a\u00020\u0002H\u0002J\u0016\u0010\u000e\u001a\u00020\u00022\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\fH\u0002J\u0010\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0002J\u0010\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0002J\u0010\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0016H\u0002J\b\u0010\u001a\u001a\u00020\u0019H\u0014J\u0010\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001bH\u0016J\b\u0010\u001e\u001a\u00020\u0002H\u0016J\b\u0010\u001f\u001a\u00020\u0002H\u0016J\b\u0010 \u001a\u00020\u0002H\u0016J\b\u0010!\u001a\u00020\u0019H\u0016J \u0010%\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\u00112\u0006\u0010#\u001a\u00020\u00112\u0006\u0010$\u001a\u00020\u0016H\u0016J\u0010\u0010&\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0010\u0010'\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0010\u0010(\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\b\u0010)\u001a\u00020\u0002H\u0016J\b\u0010+\u001a\u00020*H\u0016J\b\u0010,\u001a\u00020\u0002H\u0016J\b\u0010-\u001a\u00020\u0002H\u0016J\b\u0010.\u001a\u00020\u0019H\u0016R\u0016\u00102\u001a\u00020/8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00106\u001a\u0002038\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u0010:\u001a\u0002078\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010>\u001a\u00020;8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b<\u0010=R\u0016\u0010B\u001a\u00020?8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b@\u0010AR\u0016\u0010F\u001a\u00020C8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bD\u0010ER\u0018\u0010J\u001a\u0004\u0018\u00010G8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u0016\u0010M\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u0018\u0010Q\u001a\u0004\u0018\u00010N8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010PR\u0018\u0010T\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010SR\u0018\u0010X\u001a\u0004\u0018\u00010U8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010WR\u0016\u0010Z\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010YR\u0016\u0010]\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010\\R \u0010a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0^8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010`R\"\u0010f\u001a\u0010\u0012\f\u0012\n c*\u0004\u0018\u00010\u00190\u00190b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010eR\u0016\u0010h\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010YR\u0016\u0010j\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u0010YR\u0016\u0010l\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bk\u0010YR\u0016\u0010n\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bm\u0010YR\u0016\u0010p\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bo\u0010Y¨\u0006v"}, d2 = {"Lcom/heytap/health/heartrate/ui/HeartRateHistoryDayFragment;", "Lcom/heytap/health/heartrate/ui/HeartRateHistoryBaseFragment;", "", "M2", "L2", "K2", "E2", "H2", "J2", "d1", acl.KEY_C2, "", "Lcom/oplus/aiunit/vision/h59;", "dataList", "S2", "dayBean", "V2", "", "timestamp", "", "z2", "A2", "", "isLine", "B2", "", "getLayoutId", "Landroid/view/View;", "view", "initView", "initData", "j1", "i1", "n0", "startTime", "endTime", "skip", "n1", "p0", "N0", "W0", "P1", "Lcom/heytap/health/heartrate/viewmodel/HeartRateCardViewModel;", "j0", "m1", "g1", "M0", "Lcom/heytap/health/heartrate/view/HeartRateDayView;", "O", "Lcom/heytap/health/heartrate/view/HeartRateDayView;", "mHeartRateDayView", "Lcom/heytap/health/heartrate/ui/card/HeartDetailCard;", SecureGcmConstants.MESSAGE_KEY, "Lcom/heytap/health/heartrate/ui/card/HeartDetailCard;", "mDetailCardView", "Lcom/heytap/health/heartrate/ui/card/HeartWarnCard;", "Q", "Lcom/heytap/health/heartrate/ui/card/HeartWarnCard;", "mWarnCardView", "Lcom/heytap/health/heartrate/ui/card/AtrialFibrilWarnCard;", "R", "Lcom/heytap/health/heartrate/ui/card/AtrialFibrilWarnCard;", "mAtrialFibrilWarnCard", "Lcom/heytap/health/heartrate/measure/ui/HeartMeasureCard;", "S", "Lcom/heytap/health/heartrate/measure/ui/HeartMeasureCard;", "mMeasureCardView", "Lcom/heytap/health/heartrate/measure/ui/HeartMeasureRecordCard;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/heytap/health/heartrate/measure/ui/HeartMeasureRecordCard;", "mMeasureRecordCardView", "Lcom/heytap/health/heartrate/ui/HeartRateDayViewpagePaging;", "U", "Lcom/heytap/health/heartrate/ui/HeartRateDayViewpagePaging;", "mHeartRateDayPaging", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "I", "mCurrentPosition", "", ExifInterface.LONGITUDE_WEST, "Ljava/lang/Object;", "mLoadingTaskToken", "X", "Lcom/oplus/aiunit/vision/h59;", "mCurrentData", "Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;", "Y", "Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;", "mOnPageChangeListener", "Z", "firstLoading", "a0", "J", "locationTime2", "Landroidx/lifecycle/Observer;", "b0", "Landroidx/lifecycle/Observer;", "mObserverDetailData", "Landroidx/activity/result/ActivityResultLauncher;", "kotlin.jvm.PlatformType", "c0", "Landroidx/activity/result/ActivityResultLauncher;", "mMeasureCardLauncher", "d0", "isChartShowReported", "e0", "isMeasureRecordReported", "f0", "isDetailCardReported", "g0", "isWarnCardReported", "h0", "isMeasureCardReported", "<init>", "()V", "Companion", "a", "b", "heartrate_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nHeartRateHistoryDayFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HeartRateHistoryDayFragment.kt\ncom/heytap/health/heartrate/ui/HeartRateHistoryDayFragment\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,545:1\n254#2:546\n254#2:547\n254#2:548\n*S KotlinDebug\n*F\n+ 1 HeartRateHistoryDayFragment.kt\ncom/heytap/health/heartrate/ui/HeartRateHistoryDayFragment\n*L\n279#1:546\n288#1:547\n307#1:548\n*E\n"})
public final class HeartRateHistoryDayFragment extends HeartRateHistoryBaseFragment {

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public HeartRateDayView mHeartRateDayView;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public HeartDetailCard mDetailCardView;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public HeartWarnCard mWarnCardView;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public AtrialFibrilWarnCard mAtrialFibrilWarnCard;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public HeartMeasureCard mMeasureCardView;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    public HeartMeasureRecordCard mMeasureRecordCardView;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    @Nullable
    public HeartRateDayViewpagePaging mHeartRateDayPaging;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    @Nullable
    public Object mLoadingTaskToken;

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    @Nullable
    public h59 mCurrentData;

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    @Nullable
    public ViewPager.OnPageChangeListener mOnPageChangeListener;

    /* JADX INFO: renamed from: a0, reason: from kotlin metadata */
    public long locationTime2;

    /* JADX INFO: renamed from: c0, reason: from kotlin metadata */
    @NotNull
    public final ActivityResultLauncher<Integer> mMeasureCardLauncher;

    /* JADX INFO: renamed from: d0, reason: from kotlin metadata */
    public boolean isChartShowReported;

    /* JADX INFO: renamed from: e0, reason: from kotlin metadata */
    public boolean isMeasureRecordReported;

    /* JADX INFO: renamed from: f0, reason: from kotlin metadata */
    public boolean isDetailCardReported;

    /* JADX INFO: renamed from: g0, reason: from kotlin metadata */
    public boolean isWarnCardReported;

    /* JADX INFO: renamed from: h0, reason: from kotlin metadata */
    public boolean isMeasureCardReported;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    public int mCurrentPosition = -1;

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    public boolean firstLoading = true;

    /* JADX INFO: renamed from: b0, reason: from kotlin metadata */
    @NotNull
    public final Observer<List<h59>> mObserverDetailData = new Observer() { // from class: com.oplus.aiunit.vision.f69
        @Override // androidx.lifecycle.Observer
        public final void onChanged(Object obj) {
            HeartRateHistoryDayFragment.R2(this.i, (List) obj);
        }
    };

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0082\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J!\u0010\u000b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/heytap/health/heartrate/ui/HeartRateHistoryDayFragment$b;", "Landroidx/activity/result/contract/ActivityResultContract;", "", "", "Landroid/content/Context;", "context", "input", "Landroid/content/Intent;", "a", "resultCode", "intent", "parseResult", "(ILandroid/content/Intent;)Ljava/lang/Boolean;", "<init>", "(Lcom/heytap/health/heartrate/ui/HeartRateHistoryDayFragment;)V", "heartrate_release"}, k = 1, mv = {1, 8, 0})
    public final class b extends ActivityResultContract<Integer, Boolean> {
        public b() {
        }

        @NotNull
        public Intent a(@NotNull Context context, int input) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new Intent(HeartRateHistoryDayFragment.this.requireActivity(), (Class<?>) HeartMeasureGuideActivity.class);
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ Intent createIntent(Context context, Integer num) {
            return a(context, num.intValue());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.activity.result.contract.ActivityResultContract
        @NotNull
        public Boolean parseResult(int resultCode, @Nullable Intent intent) {
            return Boolean.valueOf(intent != null ? intent.getBooleanExtra(HeartMeasureGuideActivity.REFRESH_KEY, false) : false);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class c implements Observer, FunctionAdapter {
        public final /* synthetic */ Function1 i;

        public c(Function1 function) {
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

    public HeartRateHistoryDayFragment() {
        ActivityResultLauncher<Integer> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new b(), new ActivityResultCallback() { // from class: com.oplus.aiunit.vision.g69
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                HeartRateHistoryDayFragment.Q2(this.a, ((Boolean) obj).booleanValue());
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "registerForActivityResul…tchData()\n        }\n    }");
        this.mMeasureCardLauncher = activityResultLauncherRegisterForActivityResult;
    }

    public static final void D2(HeartRateHistoryDayFragment this$0, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(list, "$list");
        this$0.S2(list);
        Object obj = this$0.mLoadingTaskToken;
        if (obj != null) {
            ThreadUtils.removeTask(obj);
        }
        View mLoadingView = this$0.getMLoadingView();
        if (mLoadingView != null) {
            mLoadingView.setVisibility(8);
        }
        HeartRateDayView heartRateDayView = this$0.mHeartRateDayView;
        if (heartRateDayView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mHeartRateDayView");
            heartRateDayView = null;
        }
        heartRateDayView.setVisibility(0);
        this$0.mLoadingTaskToken = null;
    }

    public static final void N2(final HeartRateHistoryDayFragment this$0, long j2, long j3) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        gg8.a("HRDayFragment", "HeartRateDayViewpagePaging start is " + o15.i(j2) + " end is " + o15.i(j3));
        this$0.L0().H(j2, j3, 10).observe(this$0.requireActivity(), this$0.mObserverDetailData);
        if (this$0.firstLoading) {
            Object obj = this$0.mLoadingTaskToken;
            if (obj != null) {
                ThreadUtils.removeTask(obj);
            }
            this$0.mLoadingTaskToken = ThreadUtils.doInUiThread(new Runnable() { // from class: com.oplus.aiunit.vision.k69
                @Override // java.lang.Runnable
                public final void run() {
                    HeartRateHistoryDayFragment.O2(this.i);
                }
            }, 500L);
        } else {
            View mLoadingView = this$0.getMLoadingView();
            if (mLoadingView != null) {
                mLoadingView.setVisibility(0);
            }
        }
        HeartRateDayView heartRateDayView = this$0.mHeartRateDayView;
        if (heartRateDayView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mHeartRateDayView");
            heartRateDayView = null;
        }
        heartRateDayView.setVisibility(4);
        this$0.firstLoading = false;
    }

    public static final void O2(HeartRateHistoryDayFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        View mLoadingView = this$0.getMLoadingView();
        if (mLoadingView == null) {
            return;
        }
        mLoadingView.setVisibility(0);
    }

    public static final void P2(View.OnScrollChangeListener onScrollChangeListener, LinearLayout contentView, HeartRateHistoryDayFragment this$0, View view, int i, int i2, int i3, int i4) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (onScrollChangeListener != null) {
            onScrollChangeListener.onScrollChange(view, i, i2, i3, i4);
        }
        Rect rect = new Rect();
        view.getHitRect(rect);
        Intrinsics.checkNotNullExpressionValue(contentView, "contentView");
        int i5 = 1;
        for (View view2 : ViewGroupKt.getChildren(contentView)) {
            if (view2 instanceof HeartMeasureCard) {
                if (view2.getVisibility() == 0) {
                    i5++;
                    if (!this$0.isMeasureCardReported && view2.getLocalVisibleRect(rect)) {
                        this$0.p1(i5, "手机测量心率");
                        this$0.isMeasureCardReported = true;
                    }
                }
            } else if (view2 instanceof HeartMeasureRecordCard) {
                if (view2.getVisibility() == 0) {
                    i5++;
                    if (!this$0.isMeasureRecordReported && view2.getLocalVisibleRect(rect)) {
                        this$0.p1(i5, "手机检测记录");
                        this$0.isMeasureRecordReported = true;
                    }
                }
            } else if (view2 instanceof HeartDetailCard) {
                i5++;
                if (!this$0.isDetailCardReported && view2.getLocalVisibleRect(rect)) {
                    this$0.p1(i5, "心率详情");
                    this$0.isDetailCardReported = true;
                }
            } else if (view2 instanceof HeartWarnCard) {
                if (view2.getVisibility() == 0) {
                    i5++;
                    if (!this$0.isWarnCardReported && view2.getLocalVisibleRect(rect)) {
                        this$0.p1(i5, "安静心率预警");
                        this$0.isWarnCardReported = true;
                    }
                }
            } else if ((view2 instanceof FrameLayout) && !this$0.isChartShowReported && view2.getLocalVisibleRect(rect)) {
                this$0.p1(i5, "心率范围");
                this$0.isChartShowReported = true;
            }
        }
    }

    public static final void Q2(HeartRateHistoryDayFragment this$0, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        gg8.c("HRDayFragment", "measure back refresh: " + z);
        if (z) {
            this$0.locationTime2 = System.currentTimeMillis();
            this$0.P1();
        }
    }

    public static final void R2(HeartRateHistoryDayFragment this$0, List dataList) {
        List<h59> listEmptyList;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        HeartRateDayViewpagePaging heartRateDayViewpagePaging = this$0.mHeartRateDayPaging;
        if (heartRateDayViewpagePaging == null || (listEmptyList = heartRateDayViewpagePaging.i(dataList)) == null) {
            listEmptyList = CollectionsKt__CollectionsKt.emptyList();
        }
        gg8.c("HRDayFragment", "observe heartrate chart data size is " + listEmptyList.size());
        Object obj = this$0.mLoadingTaskToken;
        if (obj != null) {
            ThreadUtils.removeTask(obj);
        }
        View mLoadingView = this$0.getMLoadingView();
        if (mLoadingView != null) {
            mLoadingView.setVisibility(8);
        }
        HeartRateDayView heartRateDayView = this$0.mHeartRateDayView;
        if (heartRateDayView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mHeartRateDayView");
            heartRateDayView = null;
        }
        heartRateDayView.setVisibility(0);
        this$0.mLoadingTaskToken = null;
        this$0.S2(listEmptyList);
    }

    public static final void U2(HeartRateHistoryDayFragment this$0, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ViewPager.OnPageChangeListener onPageChangeListener = this$0.mOnPageChangeListener;
        if (onPageChangeListener != null) {
            onPageChangeListener.onPageSelected(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d1() {
        final View.OnScrollChangeListener onScrollChangeListenerK = G0().k();
        final LinearLayout linearLayout = (LinearLayout) W(R$id.content_container);
        H0().setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: com.oplus.aiunit.vision.h69
            @Override // android.view.View.OnScrollChangeListener
            public final void onScrollChange(View view, int i, int i2, int i3, int i4) {
                HeartRateHistoryDayFragment.P2(onScrollChangeListenerK, linearLayout, this, view, i, i2, i3, i4);
            }
        });
    }

    public final String A2(long timestamp) {
        if (LocalDateTime.ofInstant(Instant.ofEpochMilli(timestamp), ZoneId.systemDefault()).toLocalDate().getYear() == LocalDate.now().getYear()) {
            String strG = lo9.g(timestamp, "MMMdd");
            Intrinsics.checkNotNullExpressionValue(strG, "{\n            ICUFormatU…stamp, \"MMMdd\")\n        }");
            return strG;
        }
        String strG2 = lo9.g(timestamp, "yyyyMMMdd");
        Intrinsics.checkNotNullExpressionValue(strG2, "{\n            ICUFormatU…p, \"yyyyMMMdd\")\n        }");
        return strG2;
    }

    public final void B2(final boolean isLine) {
        ChartType chartType = isLine ? ChartType.LINE : ChartType.BAR;
        R1(new Function0<Unit>() { // from class: com.heytap.health.heartrate.ui.HeartRateHistoryDayFragment$changeCharStyle$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p010kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                a.k().a(xmk.TAG_MODULE_ID, 2).a(xmk.TAG_POSTION1, 1).a(xmk.TAG_POSTION2, Integer.valueOf(isLine ? 2 : 1)).b();
            }
        });
        HeartRateDayView heartRateDayView = this.mHeartRateDayView;
        HeartRateDayView heartRateDayView2 = null;
        if (heartRateDayView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mHeartRateDayView");
            heartRateDayView = null;
        }
        heartRateDayView.i(chartType);
        HeartRateDayView heartRateDayView3 = this.mHeartRateDayView;
        if (heartRateDayView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mHeartRateDayView");
        } else {
            heartRateDayView2 = heartRateDayView3;
        }
        heartRateDayView2.h();
    }

    public final void C2() {
        gg8.a("HRDayFragment", "fetchHeartRateHistoryBorDer");
        if (System.currentTimeMillis() < 1546272000000L) {
            h59 h59Var = new h59();
            h59Var.insertCurTimeEmptyData();
            final ArrayList arrayList = new ArrayList();
            arrayList.add(h59Var);
            ThreadUtils.doInUiThread(new Runnable() { // from class: com.oplus.aiunit.vision.i69
                @Override // java.lang.Runnable
                public final void run() {
                    HeartRateHistoryDayFragment.D2(this.i, arrayList);
                }
            });
            return;
        }
        long mDefaultShowStartTime = this.locationTime2;
        if (mDefaultShowStartTime == 0) {
            mDefaultShowStartTime = getMDefaultShowStartTime();
        }
        HeartRateDayViewpagePaging heartRateDayViewpagePaging = this.mHeartRateDayPaging;
        if (heartRateDayViewpagePaging != null) {
            heartRateDayViewpagePaging.f(mDefaultShowStartTime);
        }
        gg8.a("HRDayFragment", "first time defaultTime is:" + o15.i(mDefaultShowStartTime) + " ,locationTime2:" + this.locationTime2 + " ,mDefaultShowStartTime:" + o15.i(getMDefaultShowStartTime()));
    }

    public final void E2() {
        View viewW = W(R$id.health_authentication_explanation_tv);
        if (fdg.x("device_bind_list").q("device_bind_support_ecg")) {
            viewW.setVisibility(0);
        } else {
            viewW.setVisibility(8);
        }
    }

    public final void H2() {
        fz6 fz6Var = new fz6();
        fz6Var.j(308);
        fz6Var.c(H0(), getMSpaceView());
    }

    public final void J2() {
        if (u5()) {
            LinearLayout linearLayout = (LinearLayout) W(R$id.content_container);
            HeartMeasureCard heartMeasureCard = this.mMeasureCardView;
            if (heartMeasureCard == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mMeasureCardView");
                heartMeasureCard = null;
            }
            linearLayout.removeView(heartMeasureCard);
            HeartMeasureRecordCard heartMeasureRecordCard = this.mMeasureRecordCardView;
            if (heartMeasureRecordCard == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mMeasureRecordCardView");
                heartMeasureRecordCard = null;
            }
            linearLayout.removeView(heartMeasureRecordCard);
            linearLayout.removeView(W(R$id.health_authentication_explanation_tv));
            HeartRateDayView heartRateDayView = this.mHeartRateDayView;
            if (heartRateDayView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mHeartRateDayView");
                heartRateDayView = null;
            }
            FamilyMoreDataDetailConfigBean familyMoreDataDetailConfigBeanQ0 = q0();
            heartRateDayView.setSsoid(familyMoreDataDetailConfigBeanQ0 != null ? familyMoreDataDetailConfigBeanQ0.getSsoid() : null);
        }
    }

    public final void K2() {
        HeartMeasureCard.a aVar = new HeartMeasureCard.a() { // from class: com.heytap.health.heartrate.ui.HeartRateHistoryDayFragment$initMeasureCard$listener$1
            @Override // com.heytap.health.heartrate.measure.ui.HeartMeasureCard.a
            public void onClick() {
                this.a.mMeasureCardLauncher.launch(0);
                this.a.R1(new Function0<Unit>() { // from class: com.heytap.health.heartrate.ui.HeartRateHistoryDayFragment$initMeasureCard$listener$1$onClick$1
                    @Override // p010kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        a.k().a(xmk.TAG_MODULE_ID, 6).a(xmk.TAG_POSTION1, 1).b();
                    }
                });
            }
        };
        HeartMeasureCard heartMeasureCard = this.mMeasureCardView;
        HeartMeasureRecordCard heartMeasureRecordCard = null;
        if (heartMeasureCard == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mMeasureCardView");
            heartMeasureCard = null;
        }
        heartMeasureCard.setClickListener(aVar);
        HeartMeasureRecordCard heartMeasureRecordCard2 = this.mMeasureRecordCardView;
        if (heartMeasureRecordCard2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mMeasureRecordCardView");
            heartMeasureRecordCard2 = null;
        }
        heartMeasureRecordCard2.setListener(aVar);
        LinearLayout linearLayout = (LinearLayout) W(R$id.content_container);
        if (wl4.managerApi.getBoundDeviceInfos().isEmpty()) {
            HeartMeasureCard heartMeasureCard2 = this.mMeasureCardView;
            if (heartMeasureCard2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mMeasureCardView");
                heartMeasureCard2 = null;
            }
            linearLayout.removeView(heartMeasureCard2);
            HeartMeasureRecordCard heartMeasureRecordCard3 = this.mMeasureRecordCardView;
            if (heartMeasureRecordCard3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mMeasureRecordCardView");
                heartMeasureRecordCard3 = null;
            }
            linearLayout.removeView(heartMeasureRecordCard3);
            HeartMeasureCard heartMeasureCard3 = this.mMeasureCardView;
            if (heartMeasureCard3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mMeasureCardView");
                heartMeasureCard3 = null;
            }
            linearLayout.addView(heartMeasureCard3, 1);
            HeartMeasureRecordCard heartMeasureRecordCard4 = this.mMeasureRecordCardView;
            if (heartMeasureRecordCard4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mMeasureRecordCardView");
            } else {
                heartMeasureRecordCard = heartMeasureRecordCard4;
            }
            linearLayout.addView(heartMeasureRecordCard, 1);
        }
    }

    public final void L2() {
        this.mOnPageChangeListener = new ViewPager.OnPageChangeListener() { // from class: com.heytap.health.heartrate.ui.HeartRateHistoryDayFragment$initMonitor$1
            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageScrollStateChanged(int state) {
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageSelected(int pageIndex) {
                gg8.a("HRDayFragment", "onPageSelected pageIndex is " + pageIndex + " ,mCurrentPosition is " + this.i.mCurrentPosition);
                HeartRateDayView heartRateDayView = this.i.mHeartRateDayView;
                HeartRateDayView heartRateDayView2 = null;
                if (heartRateDayView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mHeartRateDayView");
                    heartRateDayView = null;
                }
                int currentItem = heartRateDayView.getCurrentItem();
                HeartRateDayView heartRateDayView3 = this.i.mHeartRateDayView;
                if (heartRateDayView3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mHeartRateDayView");
                    heartRateDayView3 = null;
                }
                h59 h59Var = heartRateDayView3.getData().get(currentItem);
                Intrinsics.checkNotNullExpressionValue(h59Var, "mHeartRateDayView.data[current]");
                h59 h59Var2 = h59Var;
                long jN0 = this.i.N0(h59Var2.j());
                if (this.i.getMLastStartTime() != 0 && jN0 != this.i.getMLastStartTime()) {
                    HeartRateHistoryDayFragment heartRateHistoryDayFragment = this.i;
                    heartRateHistoryDayFragment.o1(jN0 < heartRateHistoryDayFragment.getMLastStartTime());
                }
                this.i.C1(jN0);
                HeartRateHistoryDayFragment heartRateHistoryDayFragment2 = this.i;
                heartRateHistoryDayFragment2.B1(heartRateHistoryDayFragment2.p0(h59Var2.e()));
                HeartRateDayViewpagePaging heartRateDayViewpagePaging = this.i.mHeartRateDayPaging;
                if (heartRateDayViewpagePaging != null) {
                    heartRateDayViewpagePaging.b(pageIndex);
                }
                this.i.V2(h59Var2);
                HeartRateDayView heartRateDayView4 = this.i.mHeartRateDayView;
                if (heartRateDayView4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mHeartRateDayView");
                } else {
                    heartRateDayView2 = heartRateDayView4;
                }
                heartRateDayView2.k(pageIndex);
                this.i.mCurrentPosition = pageIndex;
                this.i.mCurrentData = h59Var2;
            }
        };
        HeartRateDayView heartRateDayView = this.mHeartRateDayView;
        if (heartRateDayView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mHeartRateDayView");
            heartRateDayView = null;
        }
        ViewPager.OnPageChangeListener onPageChangeListener = this.mOnPageChangeListener;
        Intrinsics.checkNotNull(onPageChangeListener);
        heartRateDayView.addOnPageChangeListener(onPageChangeListener);
    }

    @Override // com.heytap.health.heartrate.ui.HeartRateHistoryBaseFragment
    public int M0() {
        return 1;
    }

    public final void M2() {
        this.mHeartRateDayPaging = new HeartRateDayViewpagePaging(getMStartTime(), getMEndTime(), new dr8() { // from class: com.oplus.aiunit.vision.j69
            @Override // com.oplus.aiunit.vision.dr8
            public final void a(long j2, long j3) {
                HeartRateHistoryDayFragment.N2(this.a, j2, j3);
            }
        });
    }

    @Override // com.heytap.health.heartrate.ui.HeartRateHistoryBaseFragment
    public long N0(long timestamp) {
        return LocalDateTime.ofInstant(Instant.ofEpochMilli(timestamp), ZoneId.systemDefault()).toLocalDate().atStartOfDay(ZoneId.systemDefault()).toInstant().toEpochMilli();
    }

    @Override // com.heytap.health.heartrate.ui.HeartRateHistoryBaseFragment
    public void P1() {
        M2();
        C2();
    }

    public final void S2(List<? extends h59> dataList) {
        HeartRateDayViewpagePaging heartRateDayViewpagePaging = this.mHeartRateDayPaging;
        final int curIndex = heartRateDayViewpagePaging != null ? heartRateDayViewpagePaging.getCurIndex() : 0;
        HeartRateDayView heartRateDayView = this.mHeartRateDayView;
        HeartRateDayView heartRateDayView2 = null;
        if (heartRateDayView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mHeartRateDayView");
            heartRateDayView = null;
        }
        heartRateDayView.setData(dataList);
        gg8.c("HRDayFragment", "refreshChartView, currentItem = " + curIndex + ", data size = " + dataList.size() + " mCurrentPosition is " + this.mCurrentPosition);
        if (this.mCurrentPosition == curIndex) {
            ThreadUtils.doInUiThread(new Runnable() { // from class: com.oplus.aiunit.vision.l69
                @Override // java.lang.Runnable
                public final void run() {
                    HeartRateHistoryDayFragment.U2(this.i, curIndex);
                }
            }, 50L);
            return;
        }
        HeartRateDayView heartRateDayView3 = this.mHeartRateDayView;
        if (heartRateDayView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mHeartRateDayView");
        } else {
            heartRateDayView2 = heartRateDayView3;
        }
        heartRateDayView2.setCurrentItem(curIndex, false);
    }

    public final void V2(final h59 dayBean) {
        HeartWarnCard heartWarnCard;
        gg8.a("HRDayFragment", "refreshContentView, data time = " + q15.a(dayBean.j(), "yyyy-MM-dd HH:mm:ss"));
        t1(z2(dayBean.j()), dayBean.j() > 1546272000000L, dayBean.e() < getMEndTime());
        HeartDetailCard heartDetailCard = this.mDetailCardView;
        AtrialFibrilWarnCard atrialFibrilWarnCard = null;
        if (heartDetailCard == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDetailCardView");
            heartDetailCard = null;
        }
        heartDetailCard.z(dayBean.g(), dayBean.f(), dayBean.i());
        HeartWarnCard heartWarnCard2 = this.mWarnCardView;
        if (heartWarnCard2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mWarnCardView");
            heartWarnCard = null;
        } else {
            heartWarnCard = heartWarnCard2;
        }
        heartWarnCard.e(dayBean.f(), dayBean.r(), getMLastStartTime(), getMLastEndTime(), A2(dayBean.j()));
        AtrialFibrilWarnCard atrialFibrilWarnCard2 = this.mAtrialFibrilWarnCard;
        if (atrialFibrilWarnCard2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAtrialFibrilWarnCard");
        } else {
            atrialFibrilWarnCard = atrialFibrilWarnCard2;
        }
        atrialFibrilWarnCard.d(dayBean.j());
        R1(new Function0<Unit>() { // from class: com.heytap.health.heartrate.ui.HeartRateHistoryDayFragment$refreshContentView$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p010kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                HeartMeasureRecordCard heartMeasureRecordCard = this.this$0.mMeasureRecordCardView;
                if (heartMeasureRecordCard == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mMeasureRecordCardView");
                    heartMeasureRecordCard = null;
                }
                heartMeasureRecordCard.e(dayBean.j());
            }
        });
    }

    @Override // com.heytap.health.heartrate.ui.HeartRateHistoryBaseFragment
    public long W0(long timestamp) {
        return LocalDateTime.ofInstant(Instant.ofEpochMilli(timestamp), ZoneId.systemDefault()).toLocalDate().atStartOfDay().atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
    }

    @Override // com.heytap.health.heartrate.ui.HeartRateHistoryBaseFragment
    public void g1() {
        HeartRateDayView heartRateDayView = this.mHeartRateDayView;
        if (heartRateDayView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mHeartRateDayView");
            heartRateDayView = null;
        }
        heartRateDayView.l();
    }

    @Override // com.heytap.health.base.base.BaseFragment
    public int getLayoutId() {
        return R$layout.health_heart_rate_fragment_history_day;
    }

    @Override // com.heytap.health.heartrate.ui.HeartRateHistoryBaseFragment
    public void i1() {
        gg8.a("HRDayFragment", "onNextClick");
        HeartRateDayViewpagePaging heartRateDayViewpagePaging = this.mHeartRateDayPaging;
        if (heartRateDayViewpagePaging != null) {
            HeartRateDayView heartRateDayView = this.mHeartRateDayView;
            if (heartRateDayView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mHeartRateDayView");
                heartRateDayView = null;
            }
            heartRateDayView.setCurrentItem(heartRateDayViewpagePaging.getCurIndex() + 1, true);
        }
    }

    @Override // com.heytap.health.heartrate.ui.HeartRateHistoryBaseFragment, com.heytap.health.base.base.BaseFragment
    public void initData() {
        super.initData();
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity()");
        ((HeartRateChartStyleViewModel) new ViewModelProvider(fragmentActivityRequireActivity).get(HeartRateChartStyleViewModel.class)).x().observe(this, new c(new Function1<Boolean, Unit>() { // from class: com.heytap.health.heartrate.ui.HeartRateHistoryDayFragment.initData.1
            {
                super(1);
            }

            @Override // p010kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                invoke2(bool);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Boolean isLine) {
                HeartRateHistoryDayFragment heartRateHistoryDayFragment = HeartRateHistoryDayFragment.this;
                Intrinsics.checkNotNullExpressionValue(isLine, "isLine");
                heartRateHistoryDayFragment.B2(isLine.booleanValue());
            }
        }));
        R1(new Function0<Unit>() { // from class: com.heytap.health.heartrate.ui.HeartRateHistoryDayFragment.initData.2
            {
                super(0);
            }

            @Override // p010kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                FragmentActivity fragmentActivityRequireActivity2 = HeartRateHistoryDayFragment.this.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity2, "requireActivity()");
                MutableLiveData<List<HeartRate>> mutableLiveDataX = ((HeartMeasureViewModel) new ViewModelProvider(fragmentActivityRequireActivity2).get(HeartMeasureViewModel.class)).x();
                final HeartRateHistoryDayFragment heartRateHistoryDayFragment = HeartRateHistoryDayFragment.this;
                mutableLiveDataX.observe(heartRateHistoryDayFragment, new c(new Function1<List<? extends HeartRate>, Unit>() { // from class: com.heytap.health.heartrate.ui.HeartRateHistoryDayFragment.initData.2.1
                    {
                        super(1);
                    }

                    @Override // p010kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(List<? extends HeartRate> list) {
                        invoke2(list);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(List<? extends HeartRate> measureList) {
                        Intrinsics.checkNotNullExpressionValue(measureList, "measureList");
                        HeartMeasureCard heartMeasureCard = null;
                        if (!measureList.isEmpty()) {
                            HeartMeasureCard heartMeasureCard2 = heartRateHistoryDayFragment.mMeasureCardView;
                            if (heartMeasureCard2 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("mMeasureCardView");
                            } else {
                                heartMeasureCard = heartMeasureCard2;
                            }
                            heartMeasureCard.setVisibility(8);
                            return;
                        }
                        hrb.Companion companion = hrb.INSTANCE;
                        FragmentActivity fragmentActivityRequireActivity3 = heartRateHistoryDayFragment.requireActivity();
                        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity3, "requireActivity()");
                        if (companion.a(fragmentActivityRequireActivity3)) {
                            HeartMeasureCard heartMeasureCard3 = heartRateHistoryDayFragment.mMeasureCardView;
                            if (heartMeasureCard3 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("mMeasureCardView");
                            } else {
                                heartMeasureCard = heartMeasureCard3;
                            }
                            heartMeasureCard.setVisibility(0);
                            return;
                        }
                        HeartMeasureCard heartMeasureCard4 = heartRateHistoryDayFragment.mMeasureCardView;
                        if (heartMeasureCard4 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mMeasureCardView");
                        } else {
                            heartMeasureCard = heartMeasureCard4;
                        }
                        heartMeasureCard.setVisibility(8);
                    }
                }));
            }
        });
    }

    @Override // com.heytap.health.heartrate.ui.HeartRateHistoryBaseFragment, com.heytap.health.base.base.BaseFragment
    public void initView(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.initView(view);
        this.locationTime2 = s0(getArguments());
        View viewFindViewById = view.findViewById(R$id.view_heart_rate_day);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "view.findViewById(R.id.view_heart_rate_day)");
        this.mHeartRateDayView = (HeartRateDayView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R$id.heart_detail_card);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "view.findViewById(R.id.heart_detail_card)");
        this.mDetailCardView = (HeartDetailCard) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R$id.heart_warn_card);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "view.findViewById(R.id.heart_warn_card)");
        this.mWarnCardView = (HeartWarnCard) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R$id.heart_atrial_fibril_warn_card);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "view.findViewById(R.id.h…_atrial_fibril_warn_card)");
        AtrialFibrilWarnCard atrialFibrilWarnCard = (AtrialFibrilWarnCard) viewFindViewById4;
        this.mAtrialFibrilWarnCard = atrialFibrilWarnCard;
        HeartWarnCard heartWarnCard = null;
        if (atrialFibrilWarnCard == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAtrialFibrilWarnCard");
            atrialFibrilWarnCard = null;
        }
        FamilyMoreDataDetailConfigBean familyMoreDataDetailConfigBeanQ0 = q0();
        atrialFibrilWarnCard.setViewModelSsoid(familyMoreDataDetailConfigBeanQ0 != null ? familyMoreDataDetailConfigBeanQ0.getSsoid() : null);
        AtrialFibrilWarnCard atrialFibrilWarnCard2 = this.mAtrialFibrilWarnCard;
        if (atrialFibrilWarnCard2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAtrialFibrilWarnCard");
            atrialFibrilWarnCard2 = null;
        }
        atrialFibrilWarnCard2.setHealthFrgType(HealthFrgType.DAY);
        HeartWarnCard heartWarnCard2 = this.mWarnCardView;
        if (heartWarnCard2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mWarnCardView");
        } else {
            heartWarnCard = heartWarnCard2;
        }
        heartWarnCard.setShowArrow(true);
        View viewFindViewById5 = view.findViewById(R$id.heart_measure_card);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "view.findViewById(R.id.heart_measure_card)");
        this.mMeasureCardView = (HeartMeasureCard) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R$id.cardHeartMeasureRecord);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "view.findViewById(R.id.cardHeartMeasureRecord)");
        this.mMeasureRecordCardView = (HeartMeasureRecordCard) viewFindViewById6;
        w4l.d(this, view.findViewById(R$id.layout_date_picker));
        w4l.d(this, view.findViewById(R$id.scroll_line));
        w4l.d(this, W(R$id.content_container));
        w4l.e(this, W(R$id.frame_heart_rate_chart));
        L2();
        R1(new Function0<Unit>() { // from class: com.heytap.health.heartrate.ui.HeartRateHistoryDayFragment.initView.1
            {
                super(0);
            }

            @Override // p010kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                HeartRateHistoryDayFragment.this.K2();
                HeartRateHistoryDayFragment.this.E2();
                HeartRateHistoryDayFragment.this.H2();
                HeartRateHistoryDayFragment.this.d1();
            }
        });
        J2();
    }

    @Override // com.heytap.health.heartrate.ui.HeartRateHistoryBaseFragment
    @NotNull
    public HeartRateCardViewModel j0() {
        return (HeartRateCardViewModel) new ViewModelProvider(this).get(HeartRateCardViewModel.class);
    }

    @Override // com.heytap.health.heartrate.ui.HeartRateHistoryBaseFragment
    public void j1() {
        gg8.a("HRDayFragment", "onPreClick");
        HeartRateDayViewpagePaging heartRateDayViewpagePaging = this.mHeartRateDayPaging;
        if (heartRateDayViewpagePaging != null) {
            HeartRateDayView heartRateDayView = this.mHeartRateDayView;
            if (heartRateDayView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mHeartRateDayView");
                heartRateDayView = null;
            }
            heartRateDayView.setCurrentItem(heartRateDayViewpagePaging.getCurIndex() - 1, true);
        }
    }

    @Override // com.heytap.health.heartrate.ui.HeartRateHistoryBaseFragment
    public void m1() {
        gg8.a("HRDayFragment", "doAnimation");
        HeartRateDayView heartRateDayView = this.mHeartRateDayView;
        if (heartRateDayView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mHeartRateDayView");
            heartRateDayView = null;
        }
        heartRateDayView.h();
    }

    @Override // com.heytap.health.heartrate.ui.HeartRateHistoryBaseFragment
    public int n0() {
        return ChartTimeUnit.DAY.getTimeUnit();
    }

    @Override // com.heytap.health.heartrate.ui.HeartRateHistoryBaseFragment
    public void n1(long startTime, long endTime, boolean skip) {
        HeartRateDayViewpagePaging heartRateDayViewpagePaging = this.mHeartRateDayPaging;
        if (heartRateDayViewpagePaging != null) {
            int iE = heartRateDayViewpagePaging.e(startTime);
            gg8.a("HRDayFragment", "onTimeRangeChanged index is " + iE);
            if (iE != -1) {
                HeartRateDayView heartRateDayView = this.mHeartRateDayView;
                if (heartRateDayView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mHeartRateDayView");
                    heartRateDayView = null;
                }
                heartRateDayView.setCurrentItem(iE, false);
            }
        }
    }

    @Override // com.heytap.health.heartrate.ui.HeartRateHistoryBaseFragment
    public long p0(long timestamp) {
        return LocalDateTime.ofInstant(Instant.ofEpochMilli(timestamp), ZoneId.systemDefault()).toLocalDate().atStartOfDay(ZoneId.systemDefault()).plusDays(1L).toInstant().toEpochMilli() - ((long) 1000);
    }

    public final String z2(long timestamp) {
        String strT = q15.t(LocalDateTime.ofInstant(Instant.ofEpochMilli(timestamp), ZoneId.systemDefault()).toLocalDate());
        Intrinsics.checkNotNullExpressionValue(strT, "toDateWithWeek(date)");
        return strT;
    }
}