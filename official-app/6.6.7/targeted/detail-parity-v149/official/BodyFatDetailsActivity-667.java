package com.heytap.health.bodyfat.ui;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AlertDialog;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.coui.appcompat.picker.COUINumberPicker;
import com.coui.appcompat.toolbar.COUIToolbar;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.heytap.databaseengine.apiv3.data.Element;
import com.heytap.databaseengine.model.UserInfo;
import com.heytap.databaseengine.model.weight.FamilyMemberInfo;
import com.heytap.databaseengine.model.weight.WeightBodyFat;
import com.heytap.health.base.R$color;
import com.heytap.health.base.base.BaseActivity;
import com.heytap.health.base.base.BaseRecyclerAdapter;
import com.heytap.health.base.ui.dialog.HealthAlertDialogBuilder;
import com.heytap.health.base.ui.widget.HealthSegmentButtonLayout;
import com.heytap.health.bodyfat.R$id;
import com.heytap.health.bodyfat.R$layout;
import com.heytap.health.bodyfat.R$menu;
import com.heytap.health.bodyfat.R$string;
import com.heytap.health.bodyfat.bean.BodyFatFamilySelectBean;
import com.heytap.health.bodyfat.ui.BodyFatDetailsActivity;
import com.heytap.health.bodyfat.ui.adapter.BodyFatFamilyItemAdapter;
import com.heytap.health.bodyfat.ui.dialog.BodyFatSetDialog;
import com.heytap.health.bodyfat.ui.frg.BodyfatDayFragment;
import com.heytap.health.bodyfat.ui.frg.BodyfatDetailsFragment;
import com.heytap.health.bodyfat.ui.frg.BodyfatMonthFragment;
import com.heytap.health.bodyfat.ui.frg.BodyfatWeekFragment;
import com.heytap.health.bodyfat.ui.frg.BodyfatYearFragment;
import com.heytap.health.bodyfat.viewmodel.BodyFatViewModel;
import com.heytap.health.bodyfat.viewmodel.BodyfatDetailsSharedViewModel;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.AllWeightData;
import com.oplus.aiunit.vision.a5k;
import com.oplus.aiunit.vision.acl;
import com.oplus.aiunit.vision.cn;
import com.oplus.aiunit.vision.dz1;
import com.oplus.aiunit.vision.h15;
import com.oplus.aiunit.vision.hw1;
import com.oplus.aiunit.vision.i7k;
import com.oplus.aiunit.vision.jrc;
import com.oplus.aiunit.vision.m8b;
import com.oplus.aiunit.vision.px1;
import com.oplus.aiunit.vision.rul;
import com.oplus.aiunit.vision.uaa;
import com.oplus.aiunit.vision.v8a;
import com.oplus.aiunit.vision.xw9;
import com.oplus.smartenginehelper.ParserTag;
import com.support.dialog.R$style;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Function;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.collections.ArraysKt___ArraysKt;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.collections.CollectionsKt___CollectionsKt;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.functions.Function3;
import p010kotlin.jvm.internal.FunctionAdapter;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;
import p010kotlin.jvm.internal.StringCompanionObject;
import p010kotlin.text.StringsKt__StringNumberConversionsKt;

/* JADX INFO: loaded from: classes15.dex */
@StabilityInferred(parameters = 0)
@Route(path = "/bodyfat/BodyFatDetailsActivity")
@Metadata(d1 = {"\u0000ä\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u0080\u00012\u00020\u00012\u00020\u00022\u00020\u0003:\u0004\u0081\u0001\u0082\u0001B\u0007¢\u0006\u0004\b~\u0010\u007fJ\b\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0004H\u0002J\b\u0010\b\u001a\u00020\u0004H\u0002J\b\u0010\t\u001a\u00020\u0004H\u0002J\b\u0010\n\u001a\u00020\u0004H\u0002J\b\u0010\u000b\u001a\u00020\u0004H\u0002J\b\u0010\f\u001a\u00020\u0004H\u0002J\b\u0010\r\u001a\u00020\u0004H\u0002J\b\u0010\u000e\u001a\u00020\u0004H\u0002J*\u0010\u0016\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002J\b\u0010\u0017\u001a\u00020\u0004H\u0002J\b\u0010\u0018\u001a\u00020\u0004H\u0002J\u0012\u0010\u001b\u001a\u00020\u00042\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0015J\u0010\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u0019H\u0014J\u0010\u0010 \u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u001eH\u0014J\b\u0010\"\u001a\u00020!H\u0016J\u0010\u0010%\u001a\u00020!2\u0006\u0010$\u001a\u00020#H\u0016J\u0010\u0010(\u001a\u00020!2\u0006\u0010'\u001a\u00020&H\u0016J\u0010\u0010+\u001a\u00020\u00042\u0006\u0010*\u001a\u00020)H\u0016J\b\u0010,\u001a\u00020\u0004H\u0016R\u0018\u00100\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u001a\u00105\u001a\b\u0012\u0004\u0012\u000202018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0018\u00109\u001a\u0004\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u001b\u0010?\u001a\u00020:8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\"\u0010D\u001a\u0010\u0012\f\u0012\n A*\u0004\u0018\u00010\u001e0\u001e0@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\"\u0010F\u001a\u0010\u0012\f\u0012\n A*\u0004\u0018\u00010\u001e0\u001e0@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010CR\u0018\u0010J\u001a\u0004\u0018\u00010G8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u0018\u0010N\u001a\u0004\u0018\u00010K8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\u0018\u0010R\u001a\u0004\u0018\u00010O8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010QR\u0018\u0010T\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010SR\u0018\u0010X\u001a\u0004\u0018\u00010U8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010WR\u0018\u0010[\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010ZR\u0016\u0010_\u001a\u00020\\8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010^R\u001b\u0010d\u001a\u00020`8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\ba\u0010<\u001a\u0004\bb\u0010cR\u001b\u0010i\u001a\u00020e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bf\u0010<\u001a\u0004\bg\u0010hR\u0018\u0010m\u001a\u0004\u0018\u00010j8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bk\u0010lR \u0010r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002020o0n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bp\u0010qR\u0016\u0010u\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bs\u0010tR\u001a\u0010x\u001a\b\u0012\u0004\u0012\u00020v0n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bw\u0010qR\u001a\u0010z\u001a\b\u0012\u0004\u0012\u00020v0n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\by\u0010qR\u001a\u0010}\u001a\b\u0012\u0004\u0012\u00020{0n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b|\u0010q¨\u0006\u0083\u0001"}, d2 = {"Lcom/heytap/health/bodyfat/ui/BodyFatDetailsActivity;", "Lcom/heytap/health/base/base/BaseActivity;", "Landroid/view/View$OnClickListener;", "Lcom/oplus/aiunit/vision/xw9;", "", "X7", "initView", "T7", "R7", "b8", "S7", "V7", "c8", "Q7", "Y7", "", "userTagId", "", "weight", Element.ELEMENT_NAME_BMI, "", "time", "U7", "M7", "W7", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "outState", "onSaveInstanceState", "Landroid/content/Intent;", "intent", "onNewIntent", "", "a4", "Landroid/view/MenuItem;", "item", "onOptionsItemSelected", "Landroid/view/Menu;", "menu", "onCreateOptionsMenu", "Landroid/view/View;", "v", ParserTag.TAG_ONCLICK, "doNext", "Lcom/coui/appcompat/toolbar/COUIToolbar;", LogFieldKey.MESSAGE_KEY, "Lcom/coui/appcompat/toolbar/COUIToolbar;", "toolbar", "", "Lcom/heytap/health/bodyfat/bean/BodyFatFamilySelectBean;", "n", "Ljava/util/List;", "bodyFatFamilySelectBeanList", "Lcom/heytap/health/bodyfat/viewmodel/BodyFatViewModel;", "o", "Lcom/heytap/health/bodyfat/viewmodel/BodyFatViewModel;", "viewModel", "Lcom/heytap/health/bodyfat/viewmodel/BodyfatDetailsSharedViewModel;", LogFieldKey.PROCESS_NAME_KEY, "Lkotlin/Lazy;", "P7", "()Lcom/heytap/health/bodyfat/viewmodel/BodyfatDetailsSharedViewModel;", "sharedVm", "Landroidx/activity/result/ActivityResultLauncher;", "kotlin.jvm.PlatformType", "q", "Landroidx/activity/result/ActivityResultLauncher;", "familyManagerLauncher", "r", "historyListLauncher", "Lcom/heytap/databaseengine/model/weight/FamilyMemberInfo;", "s", "Lcom/heytap/databaseengine/model/weight/FamilyMemberInfo;", "curFamilyMemberInfo", "Lcom/heytap/databaseengine/model/weight/WeightBodyFat;", "t", "Lcom/heytap/databaseengine/model/weight/WeightBodyFat;", "lastBodyFatBean", "Lcom/heytap/health/bodyfat/ui/adapter/BodyFatFamilyItemAdapter;", "u", "Lcom/heytap/health/bodyfat/ui/adapter/BodyFatFamilyItemAdapter;", "bodyFatFamilyItemAdapter", "Ljava/lang/String;", "showBodyFatSetDialog", "Lcom/heytap/health/bodyfat/ui/dialog/BodyFatSetDialog;", "w", "Lcom/heytap/health/bodyfat/ui/dialog/BodyFatSetDialog;", "bodyFatSetDialog", "x", "Ljava/lang/Long;", "pendingManualRecordTimeMillis", "", "y", "I", "mDefaultTabIndex", "Lcom/heytap/health/base/ui/widget/HealthSegmentButtonLayout;", "z", "O7", "()Lcom/heytap/health/base/ui/widget/HealthSegmentButtonLayout;", "segmentLayout", "Landroidx/viewpager2/widget/ViewPager2;", "A", "N7", "()Landroidx/viewpager2/widget/ViewPager2;", "mViewPager", "Landroidx/appcompat/app/AlertDialog;", acl.KEY_B, "Landroidx/appcompat/app/AlertDialog;", "alertDialog", "Landroidx/lifecycle/Observer;", "", "C", "Landroidx/lifecycle/Observer;", "mObserverFamilySelectList", "D", "Z", "firstLoad", "Lcom/oplus/aiunit/vision/hw1;", ExifInterface.LONGITUDE_EAST, "mObservableChartWeightBodyFatBeanV2", UserInfo.SEX_FEMALE, "mObservableChartWeightBodyFatBean", "Lcom/oplus/aiunit/vision/uaa;", "G", "mObserverInsertWeightBodyFat", "<init>", "()V", "Companion", "a", "b", "bodyfat_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBodyFatDetailsActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BodyFatDetailsActivity.kt\ncom/heytap/health/bodyfat/ui/BodyFatDetailsActivity\n+ 2 ColorDrawable.kt\nandroidx/core/graphics/drawable/ColorDrawableKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,630:1\n28#2:631\n11065#3:632\n11400#3,3:633\n37#4,2:636\n*S KotlinDebug\n*F\n+ 1 BodyFatDetailsActivity.kt\ncom/heytap/health/bodyfat/ui/BodyFatDetailsActivity\n*L\n129#1:631\n183#1:632\n183#1:633,3\n183#1:636,2\n*E\n"})
public final class BodyFatDetailsActivity extends BaseActivity implements View.OnClickListener, xw9 {

    @NotNull
    public static final String KEY_INTENT_DEFAULT_TAB = "key_intent_default_tab";
    public static final int REFRESH_ALL = 7;
    public static final int REFRESH_DATA = 5;
    public static final int REFRESH_FAMILY = 4;

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @NotNull
    public final Lazy mViewPager;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @Nullable
    public AlertDialog alertDialog;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @NotNull
    public final Observer<List<BodyFatFamilySelectBean>> mObserverFamilySelectList;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public boolean firstLoad;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    @NotNull
    public final Observer<hw1> mObservableChartWeightBodyFatBeanV2;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    @NotNull
    public final Observer<hw1> mObservableChartWeightBodyFatBean;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    @NotNull
    public final Observer<uaa> mObserverInsertWeightBodyFat;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    public COUIToolbar toolbar;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @Nullable
    public BodyFatViewModel viewModel;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @NotNull
    public final ActivityResultLauncher<Intent> familyManagerLauncher;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @NotNull
    public final ActivityResultLauncher<Intent> historyListLauncher;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @Nullable
    public FamilyMemberInfo curFamilyMemberInfo;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    @Nullable
    public WeightBodyFat lastBodyFatBean;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @Nullable
    public BodyFatFamilyItemAdapter bodyFatFamilyItemAdapter;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @Nullable
    public String showBodyFatSetDialog;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    @Nullable
    public BodyFatSetDialog bodyFatSetDialog;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    @Nullable
    public Long pendingManualRecordTimeMillis;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    public int mDefaultTabIndex;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @NotNull
    public final Lazy segmentLayout;
    public static final int $stable = 8;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<BodyFatFamilySelectBean> bodyFatFamilySelectBeanList = new ArrayList();

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    public final Lazy sharedVm = LazyKt__LazyJVMKt.lazy(new Function0<BodyfatDetailsSharedViewModel>() { // from class: com.heytap.health.bodyfat.ui.BodyFatDetailsActivity$sharedVm$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final BodyfatDetailsSharedViewModel invoke() {
            return (BodyfatDetailsSharedViewModel) new ViewModelProvider(this.this$0).get(BodyfatDetailsSharedViewModel.class);
        }
    });

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0002H\u0016R\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u0011"}, d2 = {"Lcom/heytap/health/bodyfat/ui/BodyFatDetailsActivity$b;", "Landroidx/viewpager2/adapter/FragmentStateAdapter;", "", "position", "Landroidx/fragment/app/Fragment;", "createFragment", "getItemCount", "", "i", "Ljava/util/List;", "fragments", "Landroidx/fragment/app/FragmentManager;", "fragmentManager", "Landroidx/lifecycle/Lifecycle;", "lifecycle", "<init>", "(Landroidx/fragment/app/FragmentManager;Landroidx/lifecycle/Lifecycle;Ljava/util/List;)V", "bodyfat_release"}, k = 1, mv = {1, 8, 0})
    public static final class b extends FragmentStateAdapter {

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        @NotNull
        public List<? extends Fragment> fragments;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@NotNull FragmentManager fragmentManager, @NotNull Lifecycle lifecycle, @NotNull List<? extends Fragment> fragments) {
            super(fragmentManager, lifecycle);
            Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
            Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
            Intrinsics.checkNotNullParameter(fragments, "fragments");
            this.fragments = fragments;
        }

        @Override // androidx.viewpager2.adapter.FragmentStateAdapter
        @NotNull
        public Fragment createFragment(int position) {
            return this.fragments.get(position);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.fragments.size();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Landroidx/activity/result/ActivityResult;", "kotlin.jvm.PlatformType", "it", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class c implements ActivityResultCallback<ActivityResult> {
        public c() {
        }

        @Override // androidx.activity.result.ActivityResultCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void onActivityResult(ActivityResult activityResult) {
            px1.c("BodyFatDetailsActivity", "familyManagerLauncher resultCode:" + activityResult.getResultCode());
            if (activityResult.getResultCode() == 7 || activityResult.getResultCode() == 4) {
                BodyFatDetailsActivity.this.W7();
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Landroidx/activity/result/ActivityResult;", "kotlin.jvm.PlatformType", "it", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class d implements ActivityResultCallback<ActivityResult> {
        public d() {
        }

        @Override // androidx.activity.result.ActivityResultCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void onActivityResult(ActivityResult activityResult) {
            px1.c("BodyFatDetailsActivity", "historyListLauncher resultCode:" + activityResult.getResultCode());
            int resultCode = activityResult.getResultCode();
            if (resultCode == 4) {
                BodyFatDetailsActivity.this.W7();
                return;
            }
            if (resultCode == 5) {
                BodyfatDetailsSharedViewModel bodyfatDetailsSharedViewModelP7 = BodyFatDetailsActivity.this.P7();
                FamilyMemberInfo familyMemberInfo = BodyFatDetailsActivity.this.curFamilyMemberInfo;
                BodyfatDetailsSharedViewModel.c0(bodyfatDetailsSharedViewModelP7, familyMemberInfo != null ? familyMemberInfo.getUserTagId() : null, null, 2, null);
            } else {
                if (resultCode != 7) {
                    return;
                }
                BodyFatDetailsActivity.this.W7();
                BodyfatDetailsSharedViewModel bodyfatDetailsSharedViewModelP8 = BodyFatDetailsActivity.this.P7();
                FamilyMemberInfo familyMemberInfo2 = BodyFatDetailsActivity.this.curFamilyMemberInfo;
                BodyfatDetailsSharedViewModel.c0(bodyfatDetailsSharedViewModelP8, familyMemberInfo2 != null ? familyMemberInfo2.getUserTagId() : null, null, 2, null);
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/oplus/aiunit/vision/hw1;", "bodyFatChartWeightBean", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class e implements Observer<hw1> {
        public e() {
        }

        @Override // androidx.lifecycle.Observer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void onChanged(@NotNull hw1 bodyFatChartWeightBean) {
            Intrinsics.checkNotNullParameter(bodyFatChartWeightBean, "bodyFatChartWeightBean");
            px1.c("BodyFatDetailsActivity", "body fat data list:" + (bodyFatChartWeightBean.b().size() - 1));
            BodyFatDetailsActivity.this.lastBodyFatBean = bodyFatChartWeightBean.a();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/oplus/aiunit/vision/hw1;", "bodyFatChartWeightBean", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class f implements Observer<hw1> {
        public f() {
        }

        @Override // androidx.lifecycle.Observer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void onChanged(@NotNull hw1 bodyFatChartWeightBean) {
            Intrinsics.checkNotNullParameter(bodyFatChartWeightBean, "bodyFatChartWeightBean");
            LineDataSet lineDataSet = new LineDataSet(bodyFatChartWeightBean.b(), "");
            LineDataSet lineDataSet2 = new LineDataSet(bodyFatChartWeightBean.c(), "");
            LineData lineData = new LineData();
            lineData.addDataSet(lineDataSet);
            lineData.addDataSet(lineDataSet2);
            if (BodyFatDetailsActivity.this.firstLoad) {
                BodyFatDetailsActivity.this.lastBodyFatBean = bodyFatChartWeightBean.a();
                BodyFatDetailsActivity.this.firstLoad = false;
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"", "Lcom/heytap/health/bodyfat/bean/BodyFatFamilySelectBean;", "familyMemberSelectInfoList", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class g implements Observer<List<? extends BodyFatFamilySelectBean>> {
        public g() {
        }

        @Override // androidx.lifecycle.Observer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void onChanged(@NotNull List<? extends BodyFatFamilySelectBean> familyMemberSelectInfoList) {
            boolean z;
            Intrinsics.checkNotNullParameter(familyMemberSelectInfoList, "familyMemberSelectInfoList");
            if (familyMemberSelectInfoList.isEmpty()) {
                return;
            }
            Iterator<? extends BodyFatFamilySelectBean> it = familyMemberSelectInfoList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = true;
                    break;
                }
                BodyFatFamilySelectBean next = it.next();
                FamilyMemberInfo familyMemberInfo = next.getFamilyMemberInfo();
                if (BodyFatDetailsActivity.this.curFamilyMemberInfo == null) {
                    if (familyMemberInfo.getSubAccount() == 0) {
                        next.setSelected(true);
                        BodyFatDetailsActivity.this.curFamilyMemberInfo = familyMemberInfo;
                        z = false;
                        break;
                    }
                } else {
                    FamilyMemberInfo familyMemberInfo2 = BodyFatDetailsActivity.this.curFamilyMemberInfo;
                    Intrinsics.checkNotNull(familyMemberInfo2);
                    if (Intrinsics.areEqual(familyMemberInfo2.getUserTagId(), familyMemberInfo.getUserTagId())) {
                        BodyFatDetailsActivity.this.curFamilyMemberInfo = familyMemberInfo;
                        next.setSelected(true);
                        z = false;
                        break;
                    }
                }
            }
            if (z) {
                for (BodyFatFamilySelectBean bodyFatFamilySelectBean : familyMemberSelectInfoList) {
                    FamilyMemberInfo familyMemberInfo3 = bodyFatFamilySelectBean.getFamilyMemberInfo();
                    if (familyMemberInfo3.getSubAccount() == 0) {
                        bodyFatFamilySelectBean.setSelected(true);
                        BodyFatDetailsActivity.this.curFamilyMemberInfo = familyMemberInfo3;
                        break;
                    }
                }
            }
            if (BodyFatDetailsActivity.this.curFamilyMemberInfo != null) {
                COUIToolbar cOUIToolbar = BodyFatDetailsActivity.this.toolbar;
                Intrinsics.checkNotNull(cOUIToolbar);
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String string = BodyFatDetailsActivity.this.getString(R$string.health_body_fat_details_title);
                Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.health_body_fat_details_title)");
                FamilyMemberInfo familyMemberInfo4 = BodyFatDetailsActivity.this.curFamilyMemberInfo;
                Intrinsics.checkNotNull(familyMemberInfo4);
                String str = String.format(string, Arrays.copyOf(new Object[]{familyMemberInfo4.getUserName()}, 1));
                Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                cOUIToolbar.setTitle(str);
                BodyFatDetailsActivity.this.P7().d0(BodyFatDetailsActivity.this.curFamilyMemberInfo);
                BodyfatDetailsSharedViewModel bodyfatDetailsSharedViewModelP7 = BodyFatDetailsActivity.this.P7();
                FamilyMemberInfo familyMemberInfo5 = BodyFatDetailsActivity.this.curFamilyMemberInfo;
                Intrinsics.checkNotNull(familyMemberInfo5);
                bodyfatDetailsSharedViewModelP7.e0(familyMemberInfo5.getUserTagId());
            } else {
                px1.c("BodyFatDetailsActivity", "curFamilyMemberInfo is null");
            }
            BodyFatDetailsActivity.this.bodyFatFamilySelectBeanList.clear();
            BodyFatDetailsActivity.this.bodyFatFamilySelectBeanList.addAll(familyMemberSelectInfoList);
            if (BodyFatDetailsActivity.this.bodyFatFamilyItemAdapter != null) {
                BodyFatFamilyItemAdapter bodyFatFamilyItemAdapter = BodyFatDetailsActivity.this.bodyFatFamilyItemAdapter;
                Intrinsics.checkNotNull(bodyFatFamilyItemAdapter);
                bodyFatFamilyItemAdapter.notifyItemRangeChanged(0, BodyFatDetailsActivity.this.bodyFatFamilySelectBeanList.size());
            }
            if (TextUtils.equals(BodyFatDetailsActivity.this.showBodyFatSetDialog, "0")) {
                if (!i7k.j()) {
                    BodyFatDetailsActivity.this.b8();
                }
                BodyFatDetailsActivity.this.showBodyFatSetDialog = null;
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/oplus/aiunit/vision/uaa;", "result", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class h implements Observer<uaa> {
        public h() {
        }

        @Override // androidx.lifecycle.Observer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void onChanged(@NotNull uaa result) {
            String ssoid;
            Intrinsics.checkNotNullParameter(result, "result");
            if (!result.c()) {
                BodyFatDetailsActivity.this.pendingManualRecordTimeMillis = null;
                a5k.h(result.b());
                return;
            }
            FamilyMemberInfo familyMemberInfo = BodyFatDetailsActivity.this.curFamilyMemberInfo;
            if (familyMemberInfo == null || (ssoid = familyMemberInfo.getUserTagId()) == null) {
                ssoid = cn.c().getSsoid();
            }
            BodyFatViewModel bodyFatViewModel = BodyFatDetailsActivity.this.viewModel;
            Intrinsics.checkNotNull(bodyFatViewModel);
            bodyFatViewModel.J(ssoid);
            BodyFatDetailsActivity.this.firstLoad = true;
            Long l2 = BodyFatDetailsActivity.this.pendingManualRecordTimeMillis;
            BodyFatDetailsActivity.this.pendingManualRecordTimeMillis = null;
            BodyFatDetailsActivity.this.P7().b0(ssoid, l2);
            String strE = result.e();
            StringBuilder sb = new StringBuilder();
            sb.append("insertWeightBodyFat weightKgStr:");
            sb.append(strE);
            v8a.Companion.d(v8a.INSTANCE, 4, 1, strE, 0L, 0L, null, 56, null);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class i implements Observer, FunctionAdapter {
        public final /* synthetic */ Function1 i;

        public i(Function1 function) {
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

    public BodyFatDetailsActivity() {
        ActivityResultLauncher<Intent> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new c());
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "registerForActivityResul…berList()\n        }\n    }");
        this.familyManagerLauncher = activityResultLauncherRegisterForActivityResult;
        ActivityResultLauncher<Intent> activityResultLauncherRegisterForActivityResult2 = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new d());
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult2, "registerForActivityResul…        }\n        }\n    }");
        this.historyListLauncher = activityResultLauncherRegisterForActivityResult2;
        this.segmentLayout = LazyKt__LazyJVMKt.lazy(new Function0<HealthSegmentButtonLayout>() { // from class: com.heytap.health.bodyfat.ui.BodyFatDetailsActivity$segmentLayout$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p010kotlin.jvm.functions.Function0
            public final HealthSegmentButtonLayout invoke() {
                return (HealthSegmentButtonLayout) this.this$0.findViewById(R$id.segment_bodyfat);
            }
        });
        this.mViewPager = LazyKt__LazyJVMKt.lazy(new Function0<ViewPager2>() { // from class: com.heytap.health.bodyfat.ui.BodyFatDetailsActivity$mViewPager$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p010kotlin.jvm.functions.Function0
            public final ViewPager2 invoke() {
                return (ViewPager2) this.this$0.findViewById(R$id.view_pager);
            }
        });
        this.mObserverFamilySelectList = new g();
        this.firstLoad = true;
        this.mObservableChartWeightBodyFatBeanV2 = new f();
        this.mObservableChartWeightBodyFatBean = new e();
        this.mObserverInsertWeightBodyFat = new h();
    }

    public static final void Z7(BodyFatDetailsActivity this$0, int i2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        BodyFatFamilyItemAdapter bodyFatFamilyItemAdapter = this$0.bodyFatFamilyItemAdapter;
        Intrinsics.checkNotNull(bodyFatFamilyItemAdapter);
        FamilyMemberInfo familyMemberInfo = bodyFatFamilyItemAdapter.getData().get(i2).getFamilyMemberInfo();
        if (this$0.curFamilyMemberInfo != null) {
            String userTagId = familyMemberInfo.getUserTagId();
            FamilyMemberInfo familyMemberInfo2 = this$0.curFamilyMemberInfo;
            Intrinsics.checkNotNull(familyMemberInfo2);
            if (Intrinsics.areEqual(userTagId, familyMemberInfo2.getUserTagId())) {
                AlertDialog alertDialog = this$0.alertDialog;
                Intrinsics.checkNotNull(alertDialog);
                alertDialog.dismiss();
                return;
            }
        }
        AlertDialog alertDialog2 = this$0.alertDialog;
        Intrinsics.checkNotNull(alertDialog2);
        alertDialog2.dismiss();
        FamilyMemberInfo familyMemberInfo3 = this$0.curFamilyMemberInfo;
        Intrinsics.checkNotNull(familyMemberInfo3);
        if (Intrinsics.areEqual(familyMemberInfo3.getUserTagId(), familyMemberInfo.getUserTagId())) {
            return;
        }
        COUIToolbar cOUIToolbar = this$0.toolbar;
        Intrinsics.checkNotNull(cOUIToolbar);
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String string = this$0.getString(R$string.health_body_fat_details_title);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.health_body_fat_details_title)");
        String str = String.format(string, Arrays.copyOf(new Object[]{familyMemberInfo.getUserName()}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        cOUIToolbar.setTitle(str);
        this$0.curFamilyMemberInfo = familyMemberInfo;
        this$0.P7().d0(familyMemberInfo);
        this$0.P7().e0(familyMemberInfo.getUserTagId());
    }

    public static final void a8(DialogInterface dialog, int i2) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        dialog.dismiss();
    }

    public static final String d8(BodyFatDetailsActivity this$0, int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (i2 != 1) {
            i3 = i2 != 2 ? R$string.health_body_fat_unit_kg : R$string.health_body_fat_unit_lb;
        } else {
            i3 = R$string.health_body_fat_unit_500g;
        }
        return this$0.getString(i3);
    }

    public static final String e8(int i2) {
        if (i2 != 1) {
            return i2 != 2 ? "--" : ".00";
        }
        return ".0";
    }

    public static final void f8(DialogInterface dialog, int i2) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        dialog.dismiss();
    }

    public static final void g8(BodyFatDetailsActivity this$0, COUINumberPicker cOUINumberPicker, COUINumberPicker cOUINumberPicker2, DialogInterface dialog, int i2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        BodyFatViewModel bodyFatViewModel = this$0.viewModel;
        if (bodyFatViewModel != null) {
            bodyFatViewModel.t0(cOUINumberPicker.getValue(), cOUINumberPicker2.getValue());
        }
        dialog.dismiss();
        this$0.P7().P().postValue(Integer.valueOf(cOUINumberPicker.getValue()));
        this$0.P7().O().postValue(Integer.valueOf(cOUINumberPicker2.getValue()));
    }

    public final void M7() {
        BodyFatViewModel bodyFatViewModel = this.viewModel;
        Intrinsics.checkNotNull(bodyFatViewModel);
        bodyFatViewModel.W().observe(this, this.mObserverFamilySelectList);
        W7();
    }

    public final ViewPager2 N7() {
        Object value = this.mViewPager.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-mViewPager>(...)");
        return (ViewPager2) value;
    }

    public final HealthSegmentButtonLayout O7() {
        Object value = this.segmentLayout.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-segmentLayout>(...)");
        return (HealthSegmentButtonLayout) value;
    }

    public final BodyfatDetailsSharedViewModel P7() {
        return (BodyfatDetailsSharedViewModel) this.sharedVm.getValue();
    }

    public final void Q7() {
        Intent intent = new Intent(this, (Class<?>) BodyFatHistoryListActivity.class);
        intent.putExtra("FamilyMemberInfo", this.curFamilyMemberInfo);
        this.historyListLauncher.launch(intent);
    }

    public final void R7() {
        this.showBodyFatSetDialog = getIntent().getStringExtra("showBodyFatSetDialog");
        M7();
        P7().a0();
    }

    public final void S7() {
        BodyFatViewModel bodyFatViewModel = this.viewModel;
        Intrinsics.checkNotNull(bodyFatViewModel);
        bodyFatViewModel.P().observe(this, this.mObservableChartWeightBodyFatBeanV2);
        BodyFatViewModel bodyFatViewModel2 = this.viewModel;
        Intrinsics.checkNotNull(bodyFatViewModel2);
        bodyFatViewModel2.T().observe(this, this.mObservableChartWeightBodyFatBean);
        BodyFatViewModel bodyFatViewModel3 = this.viewModel;
        Intrinsics.checkNotNull(bodyFatViewModel3);
        bodyFatViewModel3.X().observe(this, this.mObserverInsertWeightBodyFat);
        P7().Y().observe(this, new i(new Function1<rul, Unit>() { // from class: com.heytap.health.bodyfat.ui.BodyFatDetailsActivity$initObserverData$1
            {
                super(1);
            }

            @Override // p010kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(rul rulVar) {
                invoke2(rulVar);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@Nullable rul rulVar) {
                if (rulVar == null) {
                    COUIToolbar cOUIToolbar = this.this$0.toolbar;
                    Intrinsics.checkNotNull(cOUIToolbar);
                    cOUIToolbar.getMenu().clear();
                    COUIToolbar cOUIToolbar2 = this.this$0.toolbar;
                    Intrinsics.checkNotNull(cOUIToolbar2);
                    cOUIToolbar2.inflateMenu(R$menu.health_body_fat_menu_detail_no_device);
                }
            }
        }));
        P7().T().observe(this, new i(new Function1<Integer, Unit>() { // from class: com.heytap.health.bodyfat.ui.BodyFatDetailsActivity$initObserverData$2
            {
                super(1);
            }

            @Override // p010kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                invoke2(num);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Integer num) {
                if (num != null && num.intValue() == 1) {
                    this.this$0.V7();
                }
            }
        }));
    }

    public final void T7() {
        Integer intOrNull;
        Integer[] numArr = {Integer.valueOf(com.heytap.health.base.R$string.lib_base_day), Integer.valueOf(com.heytap.health.base.R$string.lib_base_week), Integer.valueOf(com.heytap.health.base.R$string.lib_base_month), Integer.valueOf(com.heytap.health.base.R$string.lib_base_year)};
        ArrayList arrayList = new ArrayList(4);
        for (int i2 = 0; i2 < 4; i2++) {
            arrayList.add(getString(numArr[i2].intValue()));
        }
        final String[] strArr = (String[]) arrayList.toArray(new String[0]);
        O7().setSegmentButtons(strArr);
        int intExtra = getIntent().getIntExtra(KEY_INTENT_DEFAULT_TAB, this.mDefaultTabIndex);
        this.mDefaultTabIndex = intExtra;
        if (intExtra == 0) {
            String stringExtra = getIntent().getStringExtra(KEY_INTENT_DEFAULT_TAB);
            this.mDefaultTabIndex = (stringExtra == null || (intOrNull = StringsKt__StringNumberConversionsKt.toIntOrNull(stringExtra)) == null) ? 0 : intOrNull.intValue();
        }
        List listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new BodyfatDetailsFragment[]{new BodyfatDayFragment(), new BodyfatWeekFragment(), new BodyfatMonthFragment(), new BodyfatYearFragment()});
        N7().setUserInputEnabled(true);
        ViewPager2 viewPager2N7 = N7();
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "supportFragmentManager");
        Lifecycle lifecycle = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "lifecycle");
        viewPager2N7.setAdapter(new b(supportFragmentManager, lifecycle, listListOf));
        N7().setOffscreenPageLimit(strArr.length);
        ViewPager2 viewPager2N8 = N7();
        int length = strArr.length;
        int i3 = this.mDefaultTabIndex;
        if (!(i3 >= 0 && i3 < length)) {
            i3 = 0;
        }
        viewPager2N8.setCurrentItem(i3, false);
        N7().registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() { // from class: com.heytap.health.bodyfat.ui.BodyFatDetailsActivity$initViewPager$1
            @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                m8b.f("BodyFatDetailsActivity", "page: " + ArraysKt___ArraysKt.getOrNull(strArr, position));
            }
        });
    }

    public final void U7(String userTagId, float weight, String bmi, long time) {
        FamilyMemberInfo familyMemberInfo = this.curFamilyMemberInfo;
        LocalDateTime localDateTimeE = h15.E(time);
        StringBuilder sb = new StringBuilder();
        sb.append("InsertWeightBodyFat ");
        sb.append(userTagId);
        sb.append(" ");
        sb.append(familyMemberInfo);
        sb.append(" measurementTime:");
        sb.append(localDateTimeE);
        FamilyMemberInfo familyMemberInfo2 = this.curFamilyMemberInfo;
        if (familyMemberInfo2 != null) {
            Intrinsics.checkNotNull(familyMemberInfo2);
            userTagId = familyMemberInfo2.getUserTagId();
        }
        if (TextUtils.isEmpty(userTagId)) {
            return;
        }
        WeightBodyFat weightBodyFat = new WeightBodyFat();
        weightBodyFat.setWeight(String.valueOf(weight));
        weightBodyFat.setSsoid(cn.c().getSsoid());
        weightBodyFat.setWeightId("");
        FamilyMemberInfo familyMemberInfo3 = this.curFamilyMemberInfo;
        weightBodyFat.setSubAccount(familyMemberInfo3 != null ? familyMemberInfo3.getSubAccount() : 0);
        weightBodyFat.setUserTagId(userTagId);
        weightBodyFat.setBmi(bmi);
        weightBodyFat.setMeasurementTime(time);
        this.pendingManualRecordTimeMillis = Long.valueOf(time);
        BodyFatViewModel bodyFatViewModel = this.viewModel;
        Intrinsics.checkNotNull(bodyFatViewModel);
        bodyFatViewModel.Z(weightBodyFat);
    }

    public final void V7() {
        int i2;
        List<WeightBodyFat> listB;
        if (this.bodyFatSetDialog == null) {
            this.bodyFatSetDialog = new BodyFatSetDialog(this, new Function3<Float, String, Long, Unit>() { // from class: com.heytap.health.bodyfat.ui.BodyFatDetailsActivity$recordWeightByUser$1
                {
                    super(3);
                }

                @Override // p010kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(Float f2, String str, Long l2) {
                    invoke(f2.floatValue(), str, l2.longValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(float f2, @NotNull String bmi, long j2) {
                    Intrinsics.checkNotNullParameter(bmi, "bmi");
                    this.this$0.U7(null, f2, bmi, j2);
                }
            });
        }
        FamilyMemberInfo familyMemberInfo = this.curFamilyMemberInfo;
        if (familyMemberInfo == null) {
            px1.b("BodyFatDetailsActivity", "curFamilyMemberInfo is null");
            return;
        }
        try {
            Intrinsics.checkNotNull(familyMemberInfo);
            String height = familyMemberInfo.getHeight();
            Intrinsics.checkNotNullExpressionValue(height, "curFamilyMemberInfo!!.height");
            i2 = Integer.parseInt(height);
        } catch (Exception e2) {
            px1.b("BodyFatDetailsActivity", "height e = " + e2.getMessage());
            i2 = 0;
        }
        AllWeightData value = P7().N().getValue();
        WeightBodyFat weightBodyFat = (value == null || (listB = value.b()) == null) ? null : (WeightBodyFat) CollectionsKt___CollectionsKt.lastOrNull((List) listB);
        this.lastBodyFatBean = weightBodyFat;
        double d2 = 0.0d;
        if (weightBodyFat != null) {
            if (!TextUtils.isEmpty(weightBodyFat.getWeight())) {
                String weight = weightBodyFat.getWeight();
                Intrinsics.checkNotNullExpressionValue(weight, "latestBean.weight");
                d2 = Double.parseDouble(weight) / 1000.0d;
            }
            BodyFatSetDialog bodyFatSetDialog = this.bodyFatSetDialog;
            Intrinsics.checkNotNull(bodyFatSetDialog);
            bodyFatSetDialog.m(d2, i2);
        } else {
            px1.c("BodyFatDetailsActivity", "recordWeightByUser latestBean is null");
            BodyFatSetDialog bodyFatSetDialog2 = this.bodyFatSetDialog;
            Intrinsics.checkNotNull(bodyFatSetDialog2);
            bodyFatSetDialog2.m(0.0d, i2);
        }
        BodyFatSetDialog bodyFatSetDialog3 = this.bodyFatSetDialog;
        Intrinsics.checkNotNull(bodyFatSetDialog3);
        bodyFatSetDialog3.n(null);
    }

    public final void W7() {
        BodyFatViewModel bodyFatViewModel = this.viewModel;
        if (bodyFatViewModel != null) {
            bodyFatViewModel.L();
        }
    }

    public final void X7() {
        String ssoid = cn.c().getSsoid();
        P7().P().postValue(Integer.valueOf(dz1.b(ssoid, 0)));
        P7().O().postValue(Integer.valueOf(dz1.a(ssoid, 1)));
    }

    public final void Y7() {
        AlertDialog alertDialog = this.alertDialog;
        if (alertDialog != null) {
            Intrinsics.checkNotNull(alertDialog);
            if (alertDialog.isShowing()) {
                return;
            }
        }
        View viewInflate = LayoutInflater.from(this).inflate(R$layout.health_body_fat_dialog_cut_member, (ViewGroup) null, false);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(R$id.layout_family_list);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        BodyFatFamilyItemAdapter bodyFatFamilyItemAdapter = new BodyFatFamilyItemAdapter(this.bodyFatFamilySelectBeanList);
        this.bodyFatFamilyItemAdapter = bodyFatFamilyItemAdapter;
        recyclerView.setAdapter(bodyFatFamilyItemAdapter);
        BodyFatFamilyItemAdapter bodyFatFamilyItemAdapter2 = this.bodyFatFamilyItemAdapter;
        Intrinsics.checkNotNull(bodyFatFamilyItemAdapter2);
        bodyFatFamilyItemAdapter2.setOnItemClickListener(new BaseRecyclerAdapter.a() { // from class: com.oplus.aiunit.vision.jw1
            @Override // com.heytap.health.base.base.BaseRecyclerAdapter.a
            public final void onItemClick(int i2) {
                BodyFatDetailsActivity.Z7(this.a, i2);
            }
        });
        HealthAlertDialogBuilder healthAlertDialogBuilder = new HealthAlertDialogBuilder(this, R$style.COUIAlertDialog_Bottom);
        healthAlertDialogBuilder.setTitle(R$string.health_body_fat_cut_member);
        healthAlertDialogBuilder.setView(viewInflate);
        healthAlertDialogBuilder.setCancelable(true);
        healthAlertDialogBuilder.setNegativeButton(com.heytap.health.base.R$string.lib_base_share_dialog_cancel, new DialogInterface.OnClickListener() { // from class: com.oplus.aiunit.vision.kw1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                BodyFatDetailsActivity.a8(dialogInterface, i2);
            }
        });
        this.alertDialog = healthAlertDialogBuilder.show();
    }

    @Override // com.oplus.aiunit.vision.rz0
    public boolean a4() {
        return true;
    }

    public final void b8() {
        int i2;
        BodyFatSetDialog bodyFatSetDialog = new BodyFatSetDialog(this, new Function3<Float, String, Long, Unit>() { // from class: com.heytap.health.bodyfat.ui.BodyFatDetailsActivity$showFatSetDialog$bodyFatSetDialog$1
            {
                super(3);
            }

            @Override // p010kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(Float f2, String str, Long l2) {
                invoke(f2.floatValue(), str, l2.longValue());
                return Unit.INSTANCE;
            }

            public final void invoke(float f2, @NotNull String bmi, long j2) {
                Intrinsics.checkNotNullParameter(bmi, "bmi");
                this.this$0.U7(cn.c().getSsoid(), f2, bmi, j2);
            }
        });
        try {
            FamilyMemberInfo familyMemberInfo = this.curFamilyMemberInfo;
            Intrinsics.checkNotNull(familyMemberInfo);
            String height = familyMemberInfo.getHeight();
            Intrinsics.checkNotNullExpressionValue(height, "curFamilyMemberInfo!!.height");
            i2 = Integer.parseInt(height);
        } catch (Exception e2) {
            px1.b("BodyFatDetailsActivity", "height e = " + e2.getMessage());
            i2 = 0;
        }
        bodyFatSetDialog.m(0.0d, i2);
        bodyFatSetDialog.n(null);
    }

    public final void c8() {
        View viewInflate = LayoutInflater.from(this).inflate(R$layout.health_body_fat_dialog_unit_precision, (ViewGroup) null, false);
        final COUINumberPicker cOUINumberPicker = (COUINumberPicker) viewInflate.findViewById(R$id.unit_picker);
        final COUINumberPicker cOUINumberPicker2 = (COUINumberPicker) viewInflate.findViewById(R$id.precision_picker);
        String ssoid = cn.c().getSsoid();
        int iB = dz1.b(ssoid, 0);
        int iA = dz1.a(ssoid, 1);
        cOUINumberPicker.setHasBackground(true);
        cOUINumberPicker.setMinValue(0);
        cOUINumberPicker.setMaxValue(2);
        cOUINumberPicker.setValue(iB);
        cOUINumberPicker.setFormatter(new COUINumberPicker.c() { // from class: com.oplus.aiunit.vision.lw1
            @Override // com.coui.appcompat.picker.COUINumberPicker.c
            public final String format(int i2) {
                return BodyFatDetailsActivity.d8(this.a, i2);
            }
        });
        cOUINumberPicker2.setHasBackground(true);
        cOUINumberPicker2.setMinValue(1);
        cOUINumberPicker2.setMaxValue(2);
        cOUINumberPicker2.setValue(iA);
        cOUINumberPicker2.setFormatter(new COUINumberPicker.c() { // from class: com.oplus.aiunit.vision.mw1
            @Override // com.coui.appcompat.picker.COUINumberPicker.c
            public final String format(int i2) {
                return BodyFatDetailsActivity.e8(i2);
            }
        });
        HealthAlertDialogBuilder healthAlertDialogBuilder = new HealthAlertDialogBuilder(this, R$style.COUIAlertDialog_Bottom);
        healthAlertDialogBuilder.setTitle(getString(R$string.health_body_fat_unit_precision));
        healthAlertDialogBuilder.setView(viewInflate);
        healthAlertDialogBuilder.setNegativeButton(getString(com.heytap.health.health_base.R$string.health_base_cancel), new DialogInterface.OnClickListener() { // from class: com.oplus.aiunit.vision.nw1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                BodyFatDetailsActivity.f8(dialogInterface, i2);
            }
        });
        healthAlertDialogBuilder.setPositiveButton(getString(com.heytap.health.health_base.R$string.health_base_save), new DialogInterface.OnClickListener() { // from class: com.oplus.aiunit.vision.ow1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                BodyFatDetailsActivity.g8(this.i, cOUINumberPicker, cOUINumberPicker2, dialogInterface, i2);
            }
        });
        healthAlertDialogBuilder.show();
    }

    @Override // com.oplus.aiunit.vision.xw9
    public void doNext() {
    }

    @Override // com.heytap.health.base.base.BaseActivity, com.heytap.health.base.base.BaseViewSizeControl
    public /* bridge */ /* synthetic */ void handleContentView(View view) {
        super.handleContentView(view);
    }

    public final void initView() {
        COUIToolbar cOUIToolbar = (COUIToolbar) findViewById(com.heytap.health.base.R$id.lib_base_toolbar);
        this.toolbar = cOUIToolbar;
        Intrinsics.checkNotNull(cOUIToolbar);
        cOUIToolbar.setBackgroundColor(getColor(R$color.lib_base_card_white_bg));
        COUIToolbar cOUIToolbar2 = this.toolbar;
        Intrinsics.checkNotNull(cOUIToolbar2);
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String string = getString(R$string.health_body_fat_details_title);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.health_body_fat_details_title)");
        String str = String.format(string, Arrays.copyOf(new Object[]{"--"}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        cOUIToolbar2.setTitle(str);
        S1(this, this.toolbar, true);
        this.viewModel = (BodyFatViewModel) new ViewModelProvider(this).get(BodyFatViewModel.class);
        T7();
        S7();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(@NotNull View v) {
        Intrinsics.checkNotNullParameter(v, "v");
        if (jrc.c()) {
            return;
        }
        a5k.i(getString(com.heytap.health.base.R$string.lib_base_webview_network_not_connected));
    }

    @Override // com.heytap.health.base.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    @SuppressLint({"AutoDispose", "CheckResult"})
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R$layout.health_body_fat_activity_details);
        getWindow().getDecorView().setBackground(new ColorDrawable(getColor(R$color.lib_base_card_white_bg)));
        initView();
        R7();
        X7();
        setResult(5);
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(@NotNull Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        getMenuInflater().inflate(R$menu.health_body_fat_menu_detail, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override // com.heytap.health.base.base.BaseActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onNewIntent(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.onNewIntent(intent);
        px1.c("BodyFatDetailsActivity", "onNewIntent");
        int intExtra = intent.getIntExtra("bundle_key_from", -1);
        if (intExtra != 1) {
            if (intExtra != 2) {
                return;
            }
            P7().a0();
        } else {
            if (P7().Y().getValue() == null) {
                P7().a0();
            }
            BodyfatDetailsSharedViewModel bodyfatDetailsSharedViewModelP7 = P7();
            FamilyMemberInfo familyMemberInfo = this.curFamilyMemberInfo;
            BodyfatDetailsSharedViewModel.c0(bodyfatDetailsSharedViewModelP7, familyMemberInfo != null ? familyMemberInfo.getUserTagId() : null, null, 2, null);
        }
    }

    @Override // com.heytap.health.base.base.BaseActivity, android.app.Activity
    public boolean onOptionsItemSelected(@NotNull MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (!jrc.c()) {
            a5k.i(getString(com.heytap.health.base.R$string.lib_base_webview_network_not_connected));
            return super.onOptionsItemSelected(item);
        }
        if (this.curFamilyMemberInfo == null) {
            return super.onOptionsItemSelected(item);
        }
        int itemId = item.getItemId();
        if (itemId == R$id.menu_history) {
            Q7();
        } else if (itemId == R$id.menu_manual_record) {
            V7();
        } else if (itemId == R$id.menu_family_manager) {
            this.familyManagerLauncher.launch(new Intent(this, (Class<?>) BodyFatFamilyManagerActivity.class));
        } else if (itemId == R$id.menu_unit_precision) {
            c8();
        } else if (itemId == R$id.menu_common_question) {
            startActivity(new Intent(this, (Class<?>) BodyFatFaqActivity.class));
        } else if (itemId == R$id.icon) {
            Y7();
        }
        return super.onOptionsItemSelected(item);
    }

    @Override // com.heytap.health.base.base.BaseActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(@NotNull Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        super.onSaveInstanceState(outState);
        outState.putParcelable("curFamily", this.curFamilyMemberInfo);
    }
}