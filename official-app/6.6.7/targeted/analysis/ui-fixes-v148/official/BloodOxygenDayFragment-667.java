package com.heytap.health.bloodoxygen.ui;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleCompat;
import androidx.core.widget.NestedScrollView;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.coui.appcompat.panel.COUIBottomSheetDialogFragment;
import com.coui.appcompat.panel.COUIPanelFragment;
import com.heytap.databaseengine.model.SpaceInfo;
import com.heytap.databaseengine.model.UserInfo;
import com.heytap.health.base.base.BaseFragment;
import com.heytap.health.base.ui.dialog.HealthAlertDialogBuilder;
import com.heytap.health.base.view.CommonScrollTopLineView;
import com.heytap.health.bloodoxygen.R$id;
import com.heytap.health.bloodoxygen.R$layout;
import com.heytap.health.bloodoxygen.R$string;
import com.heytap.health.bloodoxygen.ui.BloodOxygenDayFragment;
import com.heytap.health.bloodoxygen.util.BOTrackUtil;
import com.heytap.health.bloodoxygen.util.BloodOxygenDayPagerHelper;
import com.heytap.health.bloodoxygen.view.BloodOxygenDayChart;
import com.heytap.health.bloodoxygen.view.Spo2DetailView;
import com.heytap.health.bloodoxygen.view.Spo2MeasureRecordView;
import com.heytap.health.bloodoxygen.view.Spo2WarningView;
import com.heytap.health.bloodoxygen.viewmodel.BloodOxygenSpaceViewModel;
import com.heytap.health.bloodoxygen.viewmodel.BloodOxygenStoreViewModel;
import com.heytap.health.bloodoxygen.viewmodel.BloodOxygenViewModel;
import com.heytap.health.core.operation.space.SpaceView;
import com.heytap.health.core.widget.charts.data.TimeStampedData;
import com.heytap.health.health.family.FamilyMoreDataDetailConfigBean;
import com.heytap.health.health.storemodel.DataModel;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.Spo2WarnBean;
import com.oplus.aiunit.vision.acl;
import com.oplus.aiunit.vision.ar0;
import com.oplus.aiunit.vision.e1;
import com.oplus.aiunit.vision.fl1;
import com.oplus.aiunit.vision.gn1;
import com.oplus.aiunit.vision.ir9;
import com.oplus.aiunit.vision.lo9;
import com.oplus.aiunit.vision.m8b;
import com.oplus.aiunit.vision.q15;
import com.oplus.aiunit.vision.w4l;
import com.oplus.aiunit.vision.zr8;
import com.oplus.aiunit.vision.zs9;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Function;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.ResultKt;
import p010kotlin.Unit;
import p010kotlin.collections.CollectionsKt___CollectionsKt;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.coroutines.jvm.internal.DebugMetadata;
import p010kotlin.coroutines.jvm.internal.SuspendLambda;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.functions.Function2;
import p010kotlin.jvm.functions.Function3;
import p010kotlin.jvm.internal.FunctionAdapter;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.Lambda;
import p010kotlin.jvm.internal.Reflection;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000ê\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u008a\u00012\u00020\u00012\u00020\u00022\u00020\u0003:\u0002\u008b\u0001B\t¢\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0004H\u0002J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0002J\b\u0010\u000b\u001a\u00020\u0004H\u0002J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0002J\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\u0010\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\bH\u0002J\u0010\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0002J\b\u0010\u0018\u001a\u00020\u0004H\u0002J\b\u0010\u0019\u001a\u00020\u0004H\u0002J\u0018\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u0016H\u0002J\b\u0010\u001d\u001a\u00020\u0004H\u0002J\b\u0010\u001e\u001a\u00020\bH\u0014J\u0010\u0010!\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u001fH\u0016J\b\u0010\"\u001a\u00020\u0004H\u0016J\u000e\u0010$\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\fJ\u0010\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010%J\b\u0010)\u001a\u00020\u0004H\u0016R\u0018\u0010-\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u00101\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0018\u00105\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0018\u00109\u001a\u0004\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0018\u0010=\u001a\u0004\u0018\u00010:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0018\u0010A\u001a\u0004\u0018\u00010>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0018\u0010C\u001a\u0004\u0018\u00010>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010@R\u0018\u0010G\u001a\u0004\u0018\u00010D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0018\u0010J\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u0018\u0010N\u001a\u0004\u0018\u00010K8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\u0018\u0010P\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010IR\u0018\u0010R\u001a\u0004\u0018\u00010K8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010MR\u0018\u0010T\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010IR\u0018\u0010X\u001a\u0004\u0018\u00010U8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010WR\u0018\u0010\\\u001a\u0004\u0018\u00010Y8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010[R\u0018\u0010_\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010^R\u0018\u0010a\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010^R\u0016\u0010d\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010cR\u0018\u0010h\u001a\u0004\u0018\u00010e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bf\u0010gR\u0016\u0010j\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u0010cR \u0010o\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040l0k8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bm\u0010nR$\u0010t\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0q\u0018\u00010p8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\br\u0010sR\u0016\u0010x\u001a\u00020u8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bv\u0010wR\u001b\u0010~\u001a\u00020y8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bz\u0010{\u001a\u0004\b|\u0010}R!\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u007f8VX\u0096\u0084\u0002¢\u0006\u000f\n\u0005\b\u0080\u0001\u0010{\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001R\u001f\u0010\u0087\u0001\u001a\u00020\u00148VX\u0096\u0084\u0002¢\u0006\u000f\n\u0005\b\u0084\u0001\u0010{\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001¨\u0006\u0090\u0001²\u0006\u000e\u0010\u008d\u0001\u001a\u00030\u008c\u00018\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u008f\u0001\u001a\u00030\u008e\u00018\nX\u008a\u0084\u0002"}, d2 = {"Lcom/heytap/health/bloodoxygen/ui/BloodOxygenDayFragment;", "Lcom/heytap/health/base/base/BaseFragment;", "Lcom/oplus/aiunit/vision/ir9;", "Lcom/oplus/aiunit/vision/zs9;", "", "initArguments", "Z0", "V0", "", "index", "v1", "W0", "", "isNext", "M0", "Lcom/oplus/aiunit/vision/fl1;", "curDayBean", acl.KEY_C1, "minSpo2", "G1", "", "timestamp", "", "L0", "x1", "z1", "value", "time", "y1", "p1", "getLayoutId", "Landroid/view/View;", "view", "initView", "initData", "isSelect", "u1", "Lcom/coui/appcompat/panel/COUIBottomSheetDialogFragment;", "dialogFragment", "Lcom/coui/appcompat/panel/COUIPanelFragment;", "N0", "onDestroy", "Lcom/heytap/health/bloodoxygen/view/BloodOxygenDayChart;", "o", "Lcom/heytap/health/bloodoxygen/view/BloodOxygenDayChart;", "bloodViewPage", "Lcom/heytap/health/core/operation/space/SpaceView;", LogFieldKey.PROCESS_NAME_KEY, "Lcom/heytap/health/core/operation/space/SpaceView;", "spaceView", "Lcom/heytap/health/bloodoxygen/view/Spo2WarningView;", "q", "Lcom/heytap/health/bloodoxygen/view/Spo2WarningView;", "spo2WarningView", "Lcom/heytap/health/bloodoxygen/view/Spo2MeasureRecordView;", "r", "Lcom/heytap/health/bloodoxygen/view/Spo2MeasureRecordView;", "spo2RecordView", "Lcom/heytap/health/bloodoxygen/view/Spo2DetailView;", "s", "Lcom/heytap/health/bloodoxygen/view/Spo2DetailView;", "spo2detailView", "Landroid/widget/ImageView;", "t", "Landroid/widget/ImageView;", "lastDayBtn", "u", "nextDayBtn", "Landroid/widget/TextView;", "v", "Landroid/widget/TextView;", "dateText", "w", "Landroid/view/View;", "dateDownText", "Landroidx/constraintlayout/widget/ConstraintLayout;", "x", "Landroidx/constraintlayout/widget/ConstraintLayout;", "spo2AboutPop", "y", "spo2AboutPopCloseBtn", "z", "spo2WarningPop", "A", "spo2WarningCloseBtn", "Landroidx/core/widget/NestedScrollView;", acl.KEY_B, "Landroidx/core/widget/NestedScrollView;", "scrollView", "Landroid/view/ViewGroup;", "C", "Landroid/view/ViewGroup;", "topDateView", "D", "Lcom/coui/appcompat/panel/COUIBottomSheetDialogFragment;", "calendarDialogFragment", ExifInterface.LONGITUDE_EAST, "warningPopFragment", UserInfo.SEX_FEMALE, "Z", "hasClickWarningPop", "Lcom/heytap/health/base/ui/dialog/HealthAlertDialogBuilder;", "G", "Lcom/heytap/health/base/ui/dialog/HealthAlertDialogBuilder;", "spo2DetailDialog", "H", "isViewPagerInScroll", "Ljava/util/LinkedList;", "Lkotlin/Function0;", "I", "Ljava/util/LinkedList;", "delayBlockList", "Landroidx/lifecycle/Observer;", "", "J", "Landroidx/lifecycle/Observer;", "dataObserver", "Lcom/heytap/health/bloodoxygen/util/BloodOxygenDayPagerHelper;", "K", "Lcom/heytap/health/bloodoxygen/util/BloodOxygenDayPagerHelper;", "dayPagerHelper", "Lcom/heytap/health/bloodoxygen/viewmodel/BloodOxygenViewModel;", "L", "Lkotlin/Lazy;", "R0", "()Lcom/heytap/health/bloodoxygen/viewmodel/BloodOxygenViewModel;", "viewModel", "Lcom/heytap/health/health/family/FamilyMoreDataDetailConfigBean;", "M", "R6", "()Lcom/heytap/health/health/family/FamilyMoreDataDetailConfigBean;", "lazyGetFamilyConfig", "N", "P0", "()J", "locationTime", "<init>", "()V", "Companion", "a", "Lcom/heytap/health/bloodoxygen/viewmodel/BloodOxygenStoreViewModel;", "storeViewModel", "Lcom/heytap/health/bloodoxygen/viewmodel/BloodOxygenSpaceViewModel;", "spaceViewModel", "blood_oxygen_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBloodOxygenDayFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BloodOxygenDayFragment.kt\ncom/heytap/health/bloodoxygen/ui/BloodOxygenDayFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,547:1\n172#2,9:548\n172#2,9:561\n1855#3,2:557\n1855#3,2:559\n*S KotlinDebug\n*F\n+ 1 BloodOxygenDayFragment.kt\ncom/heytap/health/bloodoxygen/ui/BloodOxygenDayFragment\n*L\n326#1:548,9\n527#1:561,9\n439#1:557,2\n486#1:559,2\n*E\n"})
public final class BloodOxygenDayFragment extends BaseFragment implements ir9, zs9 {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @Nullable
    public View spo2WarningCloseBtn;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @Nullable
    public NestedScrollView scrollView;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @Nullable
    public ViewGroup topDateView;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @Nullable
    public COUIBottomSheetDialogFragment calendarDialogFragment;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    @Nullable
    public COUIBottomSheetDialogFragment warningPopFragment;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public boolean hasClickWarningPop;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    @Nullable
    public HealthAlertDialogBuilder spo2DetailDialog;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public boolean isViewPagerInScroll;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    @Nullable
    public Observer<List<fl1>> dataObserver;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @Nullable
    public BloodOxygenDayChart bloodViewPage;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @Nullable
    public SpaceView spaceView;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @Nullable
    public Spo2WarningView spo2WarningView;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @Nullable
    public Spo2MeasureRecordView spo2RecordView;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @Nullable
    public Spo2DetailView spo2detailView;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    @Nullable
    public ImageView lastDayBtn;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @Nullable
    public ImageView nextDayBtn;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @Nullable
    public TextView dateText;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    @Nullable
    public View dateDownText;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    @Nullable
    public ConstraintLayout spo2AboutPop;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    @Nullable
    public View spo2AboutPopCloseBtn;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @Nullable
    public ConstraintLayout spo2WarningPop;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    @NotNull
    public final LinkedList<Function0<Unit>> delayBlockList = new LinkedList<>();

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    @NotNull
    public final Lazy viewModel = LazyKt__LazyJVMKt.lazy(new Function0<BloodOxygenViewModel>() { // from class: com.heytap.health.bloodoxygen.ui.BloodOxygenDayFragment$viewModel$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final BloodOxygenViewModel invoke() {
            return (BloodOxygenViewModel) new ViewModelProvider(this.this$0).get(BloodOxygenViewModel.class);
        }
    });

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    @NotNull
    public final Lazy lazyGetFamilyConfig = LazyKt__LazyJVMKt.lazy(new Function0<FamilyMoreDataDetailConfigBean>() { // from class: com.heytap.health.bloodoxygen.ui.BloodOxygenDayFragment$lazyGetFamilyConfig$2
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

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    @NotNull
    public final Lazy locationTime = LazyKt__LazyJVMKt.lazy(new Function0<Long>() { // from class: com.heytap.health.bloodoxygen.ui.BloodOxygenDayFragment$locationTime$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final Long invoke() {
            BloodOxygenDayFragment bloodOxygenDayFragment = this.this$0;
            return Long.valueOf(bloodOxygenDayFragment.Q0(bloodOxygenDayFragment.getArguments()));
        }
    });

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public BloodOxygenDayPagerHelper dayPagerHelper = new BloodOxygenDayPagerHelper(new AnonymousClass1(), new Function2<List<fl1>, Integer, Unit>() { // from class: com.heytap.health.bloodoxygen.ui.BloodOxygenDayFragment.2

        /* JADX INFO: renamed from: com.heytap.health.bloodoxygen.ui.BloodOxygenDayFragment$2$1, reason: invalid class name */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        @DebugMetadata(c = "com.heytap.health.bloodoxygen.ui.BloodOxygenDayFragment$2$1", f = "BloodOxygenDayFragment.kt", i = {}, l = {142}, m = "invokeSuspend", n = {}, s = {})
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Function0<Unit> $block;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(Function0<Unit> function0, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$block = function0;
            }

            @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new AnonymousClass1(this.$block, continuation);
            }

            @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.label = 1;
                    if (DelayKt.delay(200L, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                this.$block.invoke();
                return Unit.INSTANCE;
            }

            @Override // p010kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        {
            super(2);
        }

        @Override // p010kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(List<fl1> list, Integer num) {
            invoke(list, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull final List<fl1> dataList, final int i) {
            Intrinsics.checkNotNullParameter(dataList, "dataList");
            boolean z = BloodOxygenDayFragment.this.isViewPagerInScroll;
            BloodOxygenDayChart bloodOxygenDayChart = BloodOxygenDayFragment.this.bloodViewPage;
            Integer numValueOf = bloodOxygenDayChart != null ? Integer.valueOf(bloodOxygenDayChart.getCurrentItem()) : null;
            BloodOxygenDayChart bloodOxygenDayChart2 = BloodOxygenDayFragment.this.bloodViewPage;
            ar0.c("BloodOxygenDayFragment", "onDataChangeCallBack() index=" + i + "; isViewPagerInScroll=" + z + " curItem=" + numValueOf + "; adapter.position=" + (bloodOxygenDayChart2 != null ? bloodOxygenDayChart2.getCurrentPosition() : null));
            final BloodOxygenDayFragment bloodOxygenDayFragment = BloodOxygenDayFragment.this;
            Function0<Unit> function0 = new Function0<Unit>() { // from class: com.heytap.health.bloodoxygen.ui.BloodOxygenDayFragment$2$block$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // p010kotlin.jvm.functions.Function0
                @Nullable
                public final Unit invoke() {
                    BloodOxygenDayChart bloodOxygenDayChart3 = bloodOxygenDayFragment.bloodViewPage;
                    if (bloodOxygenDayChart3 != null) {
                        bloodOxygenDayChart3.setData(dataList);
                    }
                    BloodOxygenDayChart bloodOxygenDayChart4 = bloodOxygenDayFragment.bloodViewPage;
                    if (bloodOxygenDayChart4 != null) {
                        bloodOxygenDayChart4.setCurrentItem(i, false);
                    }
                    BloodOxygenDayChart bloodOxygenDayChart5 = bloodOxygenDayFragment.bloodViewPage;
                    if (bloodOxygenDayChart5 == null) {
                        return null;
                    }
                    bloodOxygenDayChart5.f(i);
                    return Unit.INSTANCE;
                }
            };
            if (BloodOxygenDayFragment.this.isViewPagerInScroll) {
                BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(BloodOxygenDayFragment.this), null, null, new AnonymousClass1(function0, null), 3, null);
            } else {
                function0.invoke();
            }
            fl1 fl1Var = (fl1) CollectionsKt___CollectionsKt.getOrNull(dataList, i);
            if (fl1Var != null) {
                BloodOxygenDayFragment.this.C1(fl1Var);
            }
        }
    });

    /* JADX INFO: renamed from: com.heytap.health.bloodoxygen.ui.BloodOxygenDayFragment$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "startTime", "", "endTime", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nBloodOxygenDayFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BloodOxygenDayFragment.kt\ncom/heytap/health/bloodoxygen/ui/BloodOxygenDayFragment$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,547:1\n1#2:548\n*E\n"})
    public static final class AnonymousClass1 extends Lambda implements Function2<Long, Long, Unit> {
        public AnonymousClass1() {
            super(2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$0(BloodOxygenDayFragment this$0, List dataList) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(dataList, "dataList");
            BloodOxygenDayPagerHelper bloodOxygenDayPagerHelper = this$0.dayPagerHelper;
            if (bloodOxygenDayPagerHelper == null) {
                Intrinsics.throwUninitializedPropertyAccessException("dayPagerHelper");
                bloodOxygenDayPagerHelper = null;
            }
            bloodOxygenDayPagerHelper.e(dataList);
        }

        @Override // p010kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Long l2, Long l3) {
            invoke(l2.longValue(), l3.longValue());
            return Unit.INSTANCE;
        }

        public final void invoke(long j2, long j3) {
            ar0.c("BloodOxygenDayFragment", "requestData start; isFamily = " + BloodOxygenDayFragment.this.u5() + "; timeRange : " + j2 + " - " + j3);
            LiveData<List<fl1>> liveDataK = BloodOxygenDayFragment.this.R0().K(j2, j3, 10);
            FragmentActivity fragmentActivityRequireActivity = BloodOxygenDayFragment.this.requireActivity();
            Observer<? super List<fl1>> observer = BloodOxygenDayFragment.this.dataObserver;
            if (observer == null) {
                final BloodOxygenDayFragment bloodOxygenDayFragment = BloodOxygenDayFragment.this;
                Observer<? super List<fl1>> observer2 = new Observer() { // from class: com.heytap.health.bloodoxygen.ui.a
                    @Override // androidx.lifecycle.Observer
                    public final void onChanged(Object obj) {
                        BloodOxygenDayFragment.AnonymousClass1.invoke$lambda$0(bloodOxygenDayFragment, (List) obj);
                    }
                };
                BloodOxygenDayFragment.this.dataObserver = observer2;
                Unit unit = Unit.INSTANCE;
                observer = observer2;
            }
            liveDataK.observe(fragmentActivityRequireActivity, observer);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class b implements Observer, FunctionAdapter {
        public final /* synthetic */ Function1 i;

        public b(Function1 function) {
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

    public static final void A1(BloodOxygenDayFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        View view = this$0.spo2WarningCloseBtn;
        if (view != null) {
            view.callOnClick();
        }
    }

    public static final void X0(BloodOxygenDayFragment this$0, Long aLong) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullExpressionValue(aLong, "aLong");
        ar0.c("BloodOxygenDayFragment", "prepareFetchData:" + lo9.g(aLong.longValue(), "yyyMMMdd HH:mm"));
        BloodOxygenDayPagerHelper bloodOxygenDayPagerHelper = null;
        if (aLong.longValue() == Long.MIN_VALUE) {
            BloodOxygenDayPagerHelper bloodOxygenDayPagerHelper2 = this$0.dayPagerHelper;
            if (bloodOxygenDayPagerHelper2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("dayPagerHelper");
            } else {
                bloodOxygenDayPagerHelper = bloodOxygenDayPagerHelper2;
            }
            bloodOxygenDayPagerHelper.d(com.heytap.health.bloodoxygen.util.a.INSTANCE.b());
            return;
        }
        BloodOxygenDayPagerHelper bloodOxygenDayPagerHelper3 = this$0.dayPagerHelper;
        if (bloodOxygenDayPagerHelper3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dayPagerHelper");
        } else {
            bloodOxygenDayPagerHelper = bloodOxygenDayPagerHelper3;
        }
        bloodOxygenDayPagerHelper.d(aLong.longValue());
    }

    public static final BloodOxygenStoreViewModel Y0(Lazy<BloodOxygenStoreViewModel> lazy) {
        return lazy.getValue();
    }

    public static final void d1(BloodOxygenDayFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.x1();
    }

    public static final void e1(BloodOxygenDayFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.x1();
    }

    public static final void f1(BloodOxygenDayFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.M0(false);
    }

    public static final void g1(BloodOxygenDayFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.M0(true);
    }

    public static final void i1(final BloodOxygenDayFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.B1(new Function0<Unit>() { // from class: com.heytap.health.bloodoxygen.ui.BloodOxygenDayFragment$initMonitor$8$1
            @Override // p010kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                BOTrackUtil.INSTANCE.a().f(3);
            }
        });
        e1.d().b("/bloodoxygen/BloodOxygenDescriptionActivity").navigation(this$0.requireActivity());
        ConstraintLayout constraintLayout = this$0.spo2AboutPop;
        if (constraintLayout != null) {
            constraintLayout.postDelayed(new Runnable() { // from class: com.oplus.aiunit.vision.ml1
                @Override // java.lang.Runnable
                public final void run() {
                    BloodOxygenDayFragment.j1(this.i);
                }
            }, 200L);
        }
    }

    public static final void j1(BloodOxygenDayFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ConstraintLayout constraintLayout = this$0.spo2AboutPop;
        if (constraintLayout == null) {
            return;
        }
        constraintLayout.setVisibility(8);
    }

    public static final void m1(BloodOxygenDayFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.B1(new Function0<Unit>() { // from class: com.heytap.health.bloodoxygen.ui.BloodOxygenDayFragment$initMonitor$9$1
            @Override // p010kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                BOTrackUtil.INSTANCE.a().f(1);
            }
        });
        ConstraintLayout constraintLayout = this$0.spo2AboutPop;
        if (constraintLayout != null) {
            constraintLayout.setVisibility(8);
        }
        gn1.INSTANCE.b(gn1.SP_KEY_CLOSE_BLOOD_OXYGEN_ABOUT_POP, true);
    }

    public static final void n1(BloodOxygenDayFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.z1();
    }

    public static final void o1(BloodOxygenDayFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ConstraintLayout constraintLayout = this$0.spo2WarningPop;
        if (constraintLayout != null) {
            constraintLayout.setVisibility(8);
        }
        gn1.INSTANCE.b(gn1.SP_KEY_CLOSE_BLOOD_OXYGEN_WARNING_POP, true);
        this$0.hasClickWarningPop = true;
    }

    public static final BloodOxygenSpaceViewModel t1(Lazy<? extends BloodOxygenSpaceViewModel> lazy) {
        return lazy.getValue();
    }

    public void B1(@NotNull Function0<Unit> function0) {
        ir9.a.d(this, function0);
    }

    public final void C1(fl1 curDayBean) {
        boolean zIsEmptyData = curDayBean.isEmptyData();
        com.heytap.health.bloodoxygen.util.a.Companion companion = com.heytap.health.bloodoxygen.util.a.INSTANCE;
        long j2 = 1000;
        LocalDate localDateE = companion.e(curDayBean.getChartEndTime() - j2);
        TextView textView = this.dateText;
        if (textView != null) {
            textView.setText(q15.t(localDateE));
        }
        ar0.a("BloodOxygenDayFragment", "updateDateAndBottomView(),noHistoryData=" + zIsEmptyData + "; dayStartTime=" + lo9.g(curDayBean.d(), "yyyMMMdd HH:mm") + "; dayEndTime" + lo9.g(curDayBean.c(), "yyyMMMdd HH:mm") + "}");
        ImageView imageView = this.nextDayBtn;
        if (imageView != null) {
            imageView.setVisibility(companion.e(curDayBean.d()).isBefore(companion.a()) ? 0 : 4);
        }
        Spo2WarningView spo2WarningView = this.spo2WarningView;
        Intrinsics.checkNotNull(spo2WarningView);
        Spo2WarnBean spo2WarnBeanI = curDayBean.i();
        Intrinsics.checkNotNullExpressionValue(spo2WarnBeanI, "curDayBean.spo2WarnBean");
        spo2WarningView.e(spo2WarnBeanI, 0, curDayBean.d(), curDayBean.c() - 1, L0(curDayBean.getChartEndTime() - j2));
        Spo2MeasureRecordView spo2MeasureRecordView = this.spo2RecordView;
        Intrinsics.checkNotNull(spo2MeasureRecordView);
        List<TimeStampedData> listH = curDayBean.h();
        Intrinsics.checkNotNullExpressionValue(listH, "curDayBean.spo2MeasureList");
        spo2MeasureRecordView.b(listH, curDayBean.d());
        Spo2DetailView spo2DetailView = this.spo2detailView;
        Intrinsics.checkNotNull(spo2DetailView);
        spo2DetailView.setDeatilData(curDayBean.e());
        G1(curDayBean.g());
    }

    public final void G1(int minSpo2) {
        boolean z = 1 <= minSpo2 && minSpo2 < 90;
        ConstraintLayout constraintLayout = this.spo2WarningPop;
        if (constraintLayout == null) {
            return;
        }
        constraintLayout.setVisibility((this.hasClickWarningPop || !z) ? 8 : 0);
    }

    public final String L0(long timestamp) {
        if (LocalDateTime.ofInstant(Instant.ofEpochMilli(timestamp), ZoneId.systemDefault()).toLocalDate().getYear() == LocalDate.now().getYear()) {
            String strG = lo9.g(timestamp, "MMMdd");
            Intrinsics.checkNotNullExpressionValue(strG, "{\n            ICUFormatU…stamp, \"MMMdd\")\n        }");
            return strG;
        }
        String strG2 = lo9.g(timestamp, "yyyyMMMdd");
        Intrinsics.checkNotNullExpressionValue(strG2, "{\n            ICUFormatU…p, \"yyyyMMMdd\")\n        }");
        return strG2;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x005f  */
    public final void M0(boolean isNext) {
        boolean z;
        BloodOxygenDayChart bloodOxygenDayChart = this.bloodViewPage;
        if (bloodOxygenDayChart != null) {
            int currentItem = bloodOxygenDayChart.getCurrentItem() + (isNext ? 1 : -1);
            PagerAdapter adapter = bloodOxygenDayChart.getAdapter();
            m8b.f("BloodOxygenDayFragment", "click lastDayBtn,setPagerItem:" + currentItem + ", now pageSize:" + (adapter != null ? adapter.getCount() : -1));
            if (this.isViewPagerInScroll) {
                return;
            }
            if (currentItem >= 0 && currentItem < bloodOxygenDayChart.getData().size()) {
                if (currentItem >= 0) {
                    PagerAdapter adapter2 = bloodOxygenDayChart.getAdapter();
                    z = currentItem < (adapter2 != null ? adapter2.getCount() : -1);
                }
                if (z) {
                    bloodOxygenDayChart.setCurrentItem(currentItem);
                    BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new BloodOxygenDayFragment$changePager$1$1(this, isNext, null), 3, null);
                }
            }
        }
    }

    @NotNull
    public final COUIPanelFragment N0(@Nullable final COUIBottomSheetDialogFragment dialogFragment) {
        fl1 currentItemData;
        String strO0 = O0();
        com.heytap.health.bloodoxygen.util.a.Companion companion = com.heytap.health.bloodoxygen.util.a.INSTANCE;
        BloodOxygenDayChart bloodOxygenDayChart = this.bloodViewPage;
        return new CalendarPanelFragment(strO0, companion.e((bloodOxygenDayChart == null || (currentItemData = bloodOxygenDayChart.getCurrentItemData()) == null) ? 0L : currentItemData.d()), new Function1<LocalDate, Unit>() { // from class: com.heytap.health.bloodoxygen.ui.BloodOxygenDayFragment$getCalendarFragment$1

            /* JADX INFO: renamed from: com.heytap.health.bloodoxygen.ui.BloodOxygenDayFragment$getCalendarFragment$1$1, reason: invalid class name */
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            @DebugMetadata(c = "com.heytap.health.bloodoxygen.ui.BloodOxygenDayFragment$getCalendarFragment$1$1", f = "BloodOxygenDayFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ Integer $curItem;
                final /* synthetic */ LocalDate $date;
                final /* synthetic */ COUIBottomSheetDialogFragment $dialogFragment;
                int label;
                final /* synthetic */ BloodOxygenDayFragment this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(Integer num, BloodOxygenDayFragment bloodOxygenDayFragment, LocalDate localDate, COUIBottomSheetDialogFragment cOUIBottomSheetDialogFragment, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$curItem = num;
                    this.this$0 = bloodOxygenDayFragment;
                    this.$date = localDate;
                    this.$dialogFragment = cOUIBottomSheetDialogFragment;
                }

                @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                    return new AnonymousClass1(this.$curItem, this.this$0, this.$date, this.$dialogFragment, continuation);
                }

                @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    if (this.$curItem == null) {
                        BloodOxygenDayPagerHelper bloodOxygenDayPagerHelper = this.this$0.dayPagerHelper;
                        if (bloodOxygenDayPagerHelper == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("dayPagerHelper");
                            bloodOxygenDayPagerHelper = null;
                        }
                        bloodOxygenDayPagerHelper.c(this.$date);
                    } else {
                        BloodOxygenDayChart bloodOxygenDayChart = this.this$0.bloodViewPage;
                        Intrinsics.checkNotNull(bloodOxygenDayChart);
                        bloodOxygenDayChart.setCurrentItem(this.$curItem.intValue(), false);
                    }
                    BloodOxygenDayChart bloodOxygenDayChart2 = this.this$0.bloodViewPage;
                    Intrinsics.checkNotNull(bloodOxygenDayChart2);
                    ar0.c("BloodOxygenDayFragment", "refreshItem curItem:" + bloodOxygenDayChart2.getCurrentItem() + ",now date:" + this.$date);
                    COUIBottomSheetDialogFragment cOUIBottomSheetDialogFragment = this.$dialogFragment;
                    if (cOUIBottomSheetDialogFragment != null) {
                        cOUIBottomSheetDialogFragment.dismiss();
                    }
                    return Unit.INSTANCE;
                }

                @Override // p010kotlin.jvm.functions.Function2
                @Nullable
                public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p010kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(LocalDate localDate) {
                invoke2(localDate);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull LocalDate date) {
                Intrinsics.checkNotNullParameter(date, "date");
                BloodOxygenDayChart bloodOxygenDayChart2 = this.this$0.bloodViewPage;
                BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this.this$0), zr8.INSTANCE.f(), null, new AnonymousClass1(bloodOxygenDayChart2 != null ? bloodOxygenDayChart2.c(date) : null, this.this$0, date, dialogFragment, null), 2, null);
            }
        });
    }

    @NotNull
    public String O0() {
        return ir9.a.a(this);
    }

    public long P0() {
        return ((Number) this.locationTime.getValue()).longValue();
    }

    public long Q0(@Nullable Bundle bundle) {
        return zs9.a.a(this, bundle);
    }

    public final BloodOxygenViewModel R0() {
        return (BloodOxygenViewModel) this.viewModel.getValue();
    }

    @Override // com.oplus.aiunit.vision.ir9
    @Nullable
    public FamilyMoreDataDetailConfigBean R6() {
        return (FamilyMoreDataDetailConfigBean) this.lazyGetFamilyConfig.getValue();
    }

    public final void V0() {
        u5();
    }

    public final void W0() {
        final Function0 function0 = null;
        Lazy lazyCreateViewModelLazy = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(BloodOxygenStoreViewModel.class), new Function0<ViewModelStore>() { // from class: com.heytap.health.bloodoxygen.ui.BloodOxygenDayFragment$initLastDataTime$$inlined$activityViewModels$default$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p010kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = this.requireActivity().getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "requireActivity().viewModelStore");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.heytap.health.bloodoxygen.ui.BloodOxygenDayFragment$initLastDataTime$$inlined$activityViewModels$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p010kotlin.jvm.functions.Function0
            @NotNull
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function1 = function0;
                if (function1 != null && (creationExtras = (CreationExtras) function1.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.heytap.health.bloodoxygen.ui.BloodOxygenDayFragment$initLastDataTime$$inlined$activityViewModels$default$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p010kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory = this.requireActivity().getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "requireActivity().defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory;
            }
        });
        Y0(lazyCreateViewModelLazy).x(DataModel.LAST);
        Y0(lazyCreateViewModelLazy).w().observe(this, new Observer() { // from class: com.oplus.aiunit.vision.vl1
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                BloodOxygenDayFragment.X0(this.i, (Long) obj);
            }
        });
    }

    public final void Z0() {
        BloodOxygenDayChart bloodOxygenDayChart = this.bloodViewPage;
        if (bloodOxygenDayChart != null) {
            bloodOxygenDayChart.addOnPageChangeListener(new ViewPager.OnPageChangeListener() { // from class: com.heytap.health.bloodoxygen.ui.BloodOxygenDayFragment$initMonitor$1
                @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
                public void onPageScrollStateChanged(int state) {
                    this.i.isViewPagerInScroll = state != 0;
                    if (this.i.isViewPagerInScroll || !(!this.i.delayBlockList.isEmpty())) {
                        return;
                    }
                    ar0.c("BloodOxygenDayFragment", "block delay prepare()");
                    Function0 function0 = (Function0) this.i.delayBlockList.poll();
                    if (function0 != null) {
                        function0.invoke();
                    }
                }

                @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
                public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                }

                @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
                public void onPageSelected(int position) {
                    this.i.v1(position);
                }
            });
        }
        final View.OnScrollChangeListener onScrollChangeListenerK = ((CommonScrollTopLineView) W(R$id.vp_line)).k();
        B1(new Function0<Unit>() { // from class: com.heytap.health.bloodoxygen.ui.BloodOxygenDayFragment$initMonitor$2
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
                BOTrackUtil bOTrackUtilA = BOTrackUtil.INSTANCE.a();
                NestedScrollView nestedScrollView = this.this$0.scrollView;
                Intrinsics.checkNotNull(nestedScrollView);
                bOTrackUtilA.c(nestedScrollView, onScrollChangeListenerK);
            }
        });
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new BloodOxygenDayFragment$initMonitor$3(this, null), 3, null);
        TextView textView = this.dateText;
        if (textView != null) {
            textView.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.ll1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BloodOxygenDayFragment.d1(this.i, view);
                }
            });
        }
        View view = this.dateDownText;
        if (view != null) {
            view.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.nl1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    BloodOxygenDayFragment.e1(this.i, view2);
                }
            });
        }
        ImageView imageView = this.lastDayBtn;
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.ol1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    BloodOxygenDayFragment.f1(this.i, view2);
                }
            });
        }
        ImageView imageView2 = this.nextDayBtn;
        if (imageView2 != null) {
            imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.pl1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    BloodOxygenDayFragment.g1(this.i, view2);
                }
            });
        }
        boolean z = !gn1.INSTANCE.a(gn1.SP_KEY_CLOSE_BLOOD_OXYGEN_ABOUT_POP);
        ConstraintLayout constraintLayout = this.spo2AboutPop;
        if (constraintLayout != null) {
            constraintLayout.setVisibility(z ? 0 : 8);
        }
        if (z) {
            ConstraintLayout constraintLayout2 = this.spo2AboutPop;
            if (constraintLayout2 != null) {
                constraintLayout2.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.ql1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        BloodOxygenDayFragment.i1(this.i, view2);
                    }
                });
            }
            View view2 = this.spo2AboutPopCloseBtn;
            if (view2 != null) {
                view2.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.rl1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view3) {
                        BloodOxygenDayFragment.m1(this.i, view3);
                    }
                });
            }
        }
        ConstraintLayout constraintLayout3 = this.spo2WarningPop;
        if (constraintLayout3 != null) {
            constraintLayout3.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.sl1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    BloodOxygenDayFragment.n1(this.i, view3);
                }
            });
        }
        View view3 = this.spo2WarningCloseBtn;
        if (view3 != null) {
            view3.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.tl1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view4) {
                    BloodOxygenDayFragment.o1(this.i, view4);
                }
            });
        }
        Spo2DetailView spo2DetailView = this.spo2detailView;
        if (spo2DetailView == null) {
            return;
        }
        spo2DetailView.setClickCallBack(new Function3<View, Integer, String, Unit>() { // from class: com.heytap.health.bloodoxygen.ui.BloodOxygenDayFragment$initMonitor$12
            {
                super(3);
            }

            @Override // p010kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(View view4, Integer num, String str) {
                invoke(view4, num.intValue(), str);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull View view4, int i, @NotNull String time) {
                Intrinsics.checkNotNullParameter(view4, "view");
                Intrinsics.checkNotNullParameter(time, "time");
                this.this$0.B1(new Function0<Unit>() { // from class: com.heytap.health.bloodoxygen.ui.BloodOxygenDayFragment$initMonitor$12.1
                    @Override // p010kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        BOTrackUtil.INSTANCE.a().j();
                    }
                });
                this.this$0.y1(i, time);
            }
        });
    }

    @Override // com.heytap.health.base.base.BaseFragment
    public int getLayoutId() {
        return R$layout.health_blood_oxygen_fragment_history_day;
    }

    public final void initArguments() {
        R0().N(O0());
    }

    @Override // com.heytap.health.base.base.BaseFragment
    public void initData() {
        this.hasClickWarningPop = gn1.INSTANCE.a(gn1.SP_KEY_CLOSE_BLOOD_OXYGEN_WARNING_POP);
        B1(new Function0<Unit>() { // from class: com.heytap.health.bloodoxygen.ui.BloodOxygenDayFragment.initData.1
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
                BloodOxygenDayFragment.this.p1();
            }
        });
        if (P0() <= 0) {
            m8b.f("BloodOxygenDayFragment", "initData initLastDataTime");
            W0();
            return;
        }
        m8b.f("BloodOxygenDayFragment", "initData locationTime:" + P0());
        BloodOxygenDayPagerHelper bloodOxygenDayPagerHelper = this.dayPagerHelper;
        if (bloodOxygenDayPagerHelper == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dayPagerHelper");
            bloodOxygenDayPagerHelper = null;
        }
        bloodOxygenDayPagerHelper.c(com.heytap.health.bloodoxygen.util.a.INSTANCE.e(P0()));
    }

    @Override // com.heytap.health.base.base.BaseFragment
    public void initView(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        initArguments();
        this.bloodViewPage = (BloodOxygenDayChart) view.findViewById(R$id.view_blood_vp);
        this.dateText = (TextView) view.findViewById(R$id.tv_title_date);
        this.dateDownText = view.findViewById(R$id.iv_down);
        this.lastDayBtn = (ImageView) view.findViewById(R$id.iv_last);
        this.nextDayBtn = (ImageView) view.findViewById(R$id.iv_next);
        this.spaceView = (SpaceView) W(R$id.space_blood);
        this.spo2WarningView = (Spo2WarningView) W(R$id.spo2_warning_view);
        this.spo2RecordView = (Spo2MeasureRecordView) W(R$id.spo2_record_view);
        this.spo2detailView = (Spo2DetailView) W(R$id.spo2_detail_view);
        this.spo2AboutPop = (ConstraintLayout) W(R$id.spo2_pop_about);
        this.spo2AboutPopCloseBtn = W(R$id.iv_close_about_pop);
        this.spo2WarningPop = (ConstraintLayout) W(R$id.spo2_warning_hint_pop);
        this.spo2WarningCloseBtn = W(R$id.iv_close_warning_pop);
        this.scrollView = (NestedScrollView) W(R$id.vp_view);
        ViewGroup viewGroup = (ViewGroup) W(R$id.top_view);
        this.topDateView = viewGroup;
        w4l.d(this, viewGroup);
        w4l.d(this, this.bloodViewPage);
        w4l.d(this, W(R$id.ll_blood_oxygen_day_content));
        Z0();
        V0();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        B1(new Function0<Unit>() { // from class: com.heytap.health.bloodoxygen.ui.BloodOxygenDayFragment.onDestroy.1
            @Override // p010kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                BOTrackUtil.INSTANCE.a().d();
            }
        });
    }

    public final void p1() {
        final Function0 function0 = null;
        Lazy lazyCreateViewModelLazy = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(BloodOxygenSpaceViewModel.class), new Function0<ViewModelStore>() { // from class: com.heytap.health.bloodoxygen.ui.BloodOxygenDayFragment$initSpace$$inlined$activityViewModels$default$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p010kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = this.requireActivity().getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "requireActivity().viewModelStore");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.heytap.health.bloodoxygen.ui.BloodOxygenDayFragment$initSpace$$inlined$activityViewModels$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p010kotlin.jvm.functions.Function0
            @NotNull
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function1 = function0;
                if (function1 != null && (creationExtras = (CreationExtras) function1.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.heytap.health.bloodoxygen.ui.BloodOxygenDayFragment$initSpace$$inlined$activityViewModels$default$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p010kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory = this.requireActivity().getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "requireActivity().defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory;
            }
        });
        t1(lazyCreateViewModelLazy).w().observe(requireActivity(), new b(new Function1<Map<String, ? extends List<? extends SpaceInfo>>, Unit>() { // from class: com.heytap.health.bloodoxygen.ui.BloodOxygenDayFragment$initSpace$1
            {
                super(1);
            }

            @Override // p010kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Map<String, ? extends List<? extends SpaceInfo>> map) {
                invoke2(map);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@Nullable Map<String, ? extends List<? extends SpaceInfo>> map) {
                if (map == null || !(!map.isEmpty())) {
                    return;
                }
                SpaceView spaceView = this.this$0.spaceView;
                Intrinsics.checkNotNull(spaceView);
                spaceView.setData(map);
            }
        }));
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new BloodOxygenDayFragment$initSpace$2(this, lazyCreateViewModelLazy, null), 3, null);
    }

    public final void u1(boolean isSelect) {
        if (isSelect) {
            B1(new Function0<Unit>() { // from class: com.heytap.health.bloodoxygen.ui.BloodOxygenDayFragment$onDayFragmentSelected$1
                @Override // p010kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    BOTrackUtil.b dayCardElementShow = BOTrackUtil.INSTANCE.a().getDayCardElementShow();
                    if (dayCardElementShow != null) {
                        dayCardElementShow.c();
                    }
                }
            });
            BloodOxygenDayChart bloodOxygenDayChart = this.bloodViewPage;
            if (bloodOxygenDayChart != null) {
                bloodOxygenDayChart.i();
                return;
            }
            return;
        }
        B1(new Function0<Unit>() { // from class: com.heytap.health.bloodoxygen.ui.BloodOxygenDayFragment$onDayFragmentSelected$2
            @Override // p010kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                BOTrackUtil.b dayCardElementShow = BOTrackUtil.INSTANCE.a().getDayCardElementShow();
                if (dayCardElementShow != null) {
                    dayCardElementShow.e();
                }
            }
        });
        BloodOxygenDayChart bloodOxygenDayChart2 = this.bloodViewPage;
        if (bloodOxygenDayChart2 != null) {
            bloodOxygenDayChart2.h();
        }
        BloodOxygenDayChart bloodOxygenDayChart3 = this.bloodViewPage;
        if (bloodOxygenDayChart3 != null) {
            bloodOxygenDayChart3.d();
        }
    }

    @Override // com.oplus.aiunit.vision.ir9
    public boolean u5() {
        return ir9.a.c(this);
    }

    public final void v1(int index) {
        BloodOxygenDayChart bloodOxygenDayChart;
        BloodOxygenDayChart bloodOxygenDayChart2 = this.bloodViewPage;
        Intrinsics.checkNotNull(bloodOxygenDayChart2);
        List<fl1> data = bloodOxygenDayChart2.getData();
        BloodOxygenDayChart bloodOxygenDayChart3 = this.bloodViewPage;
        Intrinsics.checkNotNull(bloodOxygenDayChart3);
        fl1 fl1Var = data.get(bloodOxygenDayChart3.getCurrentItem());
        ar0.c("BloodOxygenDayFragment", "onPageSelected(); isViewPagerInScroll=" + this.isViewPagerInScroll + " position=" + index + "; dayData=" + fl1Var);
        BloodOxygenDayPagerHelper bloodOxygenDayPagerHelper = this.dayPagerHelper;
        if (bloodOxygenDayPagerHelper == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dayPagerHelper");
            bloodOxygenDayPagerHelper = null;
        }
        bloodOxygenDayPagerHelper.b(index);
        C1(fl1Var);
        BloodOxygenDayChart bloodOxygenDayChart4 = this.bloodViewPage;
        Intrinsics.checkNotNull(bloodOxygenDayChart4);
        int size = bloodOxygenDayChart4.getData().size();
        boolean z = false;
        boolean z2 = fl1Var.d() <= com.heytap.health.bloodoxygen.util.a.INSTANCE.d() || fl1Var.c() >= System.currentTimeMillis();
        if (1 <= index && index < size - 1) {
            z = true;
        }
        if ((z || z2) && (bloodOxygenDayChart = this.bloodViewPage) != null) {
            bloodOxygenDayChart.f(index);
        }
    }

    public final void x1() {
        FragmentManager supportFragmentManager;
        List<Fragment> fragments;
        FragmentActivity activity = getActivity();
        if (activity == null || (supportFragmentManager = activity.getSupportFragmentManager()) == null || (fragments = supportFragmentManager.getFragments()) == null) {
            return;
        }
        for (Fragment fragment : fragments) {
            if (fragment instanceof BloodOxygenDayFragment) {
                COUIBottomSheetDialogFragment cOUIBottomSheetDialogFragment = this.calendarDialogFragment;
                if (cOUIBottomSheetDialogFragment != null) {
                    cOUIBottomSheetDialogFragment.dismiss();
                }
                COUIBottomSheetDialogFragment cOUIBottomSheetDialogFragment2 = new COUIBottomSheetDialogFragment();
                this.calendarDialogFragment = cOUIBottomSheetDialogFragment2;
                cOUIBottomSheetDialogFragment2.setMainPanelFragment(((BloodOxygenDayFragment) fragment).N0(cOUIBottomSheetDialogFragment2));
                FragmentActivity activity2 = getActivity();
                if (activity2 != null) {
                    B1(new Function0<Unit>() { // from class: com.heytap.health.bloodoxygen.ui.BloodOxygenDayFragment$showCalendarFrag$1$1$1
                        @Override // p010kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            BOTrackUtil.INSTANCE.a().k();
                        }
                    });
                    COUIBottomSheetDialogFragment cOUIBottomSheetDialogFragment3 = this.calendarDialogFragment;
                    if (cOUIBottomSheetDialogFragment3 != null) {
                        cOUIBottomSheetDialogFragment3.show(activity2.getSupportFragmentManager(), "calendarPanelfragment");
                    }
                }
            }
        }
    }

    public final void y1(int value, String time) {
        if (this.spo2DetailDialog == null) {
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity()");
            HealthAlertDialogBuilder healthAlertDialogBuilder = new HealthAlertDialogBuilder(fragmentActivityRequireActivity);
            healthAlertDialogBuilder.setTitle(R$string.health_blood_oxygen_detail_last);
            healthAlertDialogBuilder.setPositiveButton(com.heytap.health.base.R$string.lib_base_dialog_ok, null);
            this.spo2DetailDialog = healthAlertDialogBuilder;
        }
        View viewInflate = View.inflate(requireActivity(), R$layout.health_blood_oxygen_bottom_title_content, null);
        TextView textView = (TextView) viewInflate.findViewById(R$id.tv_spo2_value);
        TextView textView2 = (TextView) viewInflate.findViewById(R$id.tv_spo2_time);
        textView.setText(String.valueOf(value));
        textView2.setText(time);
        HealthAlertDialogBuilder healthAlertDialogBuilder2 = this.spo2DetailDialog;
        if (healthAlertDialogBuilder2 != null) {
            healthAlertDialogBuilder2.setView(viewInflate);
        }
        HealthAlertDialogBuilder healthAlertDialogBuilder3 = this.spo2DetailDialog;
        if (healthAlertDialogBuilder3 != null) {
            healthAlertDialogBuilder3.show();
        }
    }

    public final void z1() {
        FragmentManager supportFragmentManager;
        List<Fragment> fragments;
        COUIBottomSheetDialogFragment cOUIBottomSheetDialogFragment;
        FragmentActivity activity = getActivity();
        if (activity == null || (supportFragmentManager = activity.getSupportFragmentManager()) == null || (fragments = supportFragmentManager.getFragments()) == null) {
            return;
        }
        Iterator<T> it = fragments.iterator();
        while (it.hasNext()) {
            if (((Fragment) it.next()) instanceof BloodOxygenDayFragment) {
                COUIBottomSheetDialogFragment cOUIBottomSheetDialogFragment2 = this.warningPopFragment;
                if (cOUIBottomSheetDialogFragment2 != null) {
                    cOUIBottomSheetDialogFragment2.dismiss();
                }
                BloodOxygenWarningPopFragment bloodOxygenWarningPopFragment = new BloodOxygenWarningPopFragment();
                COUIBottomSheetDialogFragment cOUIBottomSheetDialogFragment3 = new COUIBottomSheetDialogFragment();
                this.warningPopFragment = cOUIBottomSheetDialogFragment3;
                cOUIBottomSheetDialogFragment3.setMainPanelFragment(bloodOxygenWarningPopFragment);
                COUIBottomSheetDialogFragment cOUIBottomSheetDialogFragment4 = this.warningPopFragment;
                if (cOUIBottomSheetDialogFragment4 != null) {
                    cOUIBottomSheetDialogFragment4.setOnDismissListener(new COUIBottomSheetDialogFragment.OnDismissListener() { // from class: com.oplus.aiunit.vision.ul1
                        @Override // com.coui.appcompat.panel.COUIBottomSheetDialogFragment.OnDismissListener
                        public final void onDismiss() {
                            BloodOxygenDayFragment.A1(this.a);
                        }
                    });
                }
                FragmentActivity activity2 = getActivity();
                if (activity2 == null || (cOUIBottomSheetDialogFragment = this.warningPopFragment) == null) {
                    return;
                }
                cOUIBottomSheetDialogFragment.show(activity2.getSupportFragmentManager(), "warningPopFragment");
                return;
            }
        }
    }
}