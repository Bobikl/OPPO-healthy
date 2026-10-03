package com.heytap.health.wrist_temperature.ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.viewpager.widget.ViewPager;
import com.coui.appcompat.panel.COUIBottomSheetDialogFragment;
import com.coui.appcompat.panel.COUIPanelFragment;
import com.github.mikephil.charting.highlight.Highlight;
import com.google.security.cryptauth.lib.securegcm.SecureGcmConstants;
import com.heytap.databaseengine.model.UserInfo;
import com.heytap.databaseengine.model.wristtemperature.WristTemperatureStat;
import com.heytap.health.base.base.BaseFragment;
import com.heytap.health.base.view.BounceScrollView;
import com.heytap.health.device_data_sync.data_sync.IDataSyncService;
import com.heytap.health.health.family.FamilyMoreDataDetailConfigBean;
import com.heytap.health.wrist_temperature.R$id;
import com.heytap.health.wrist_temperature.R$layout;
import com.heytap.health.wrist_temperature.R$plurals;
import com.heytap.health.wrist_temperature.R$string;
import com.heytap.health.wrist_temperature.ui.WristTemperatureHistoryDayFragment;
import com.heytap.health.wrist_temperature.view.WristTemperatureChart;
import com.heytap.health.wrist_temperature.viewmodel.WristHistoryViewModel;
import com.heytap.log.formatter.LogFieldKey;
import com.heytap.sporthealth.blib.weiget.ZFlowLayout;
import com.oplus.aiunit.vision.acl;
import com.oplus.aiunit.vision.e1;
import com.oplus.aiunit.vision.e8m;
import com.oplus.aiunit.vision.fdg;
import com.oplus.aiunit.vision.lo9;
import com.oplus.aiunit.vision.m6m;
import com.oplus.aiunit.vision.m8b;
import com.oplus.aiunit.vision.n6m;
import com.oplus.aiunit.vision.ot8;
import com.oplus.aiunit.vision.pr8;
import com.oplus.aiunit.vision.q15;
import com.oplus.aiunit.vision.qmg;
import com.oplus.aiunit.vision.w0b;
import com.oplus.aiunit.vision.w4l;
import com.oplus.aiunit.vision.wt8;
import com.oplus.aiunit.vision.xmk;
import com.oplus.aiunit.vision.zs9;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Function;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.collections.CollectionsKt__CollectionsJVMKt;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.FunctionAdapter;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;
import p010kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000Ò\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u0000 ±\u00012\u00020\u00012\u00020\u00022\u00020\u0003:\u0002²\u0001B\t¢\u0006\u0006\b¯\u0001\u0010°\u0001J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\u001e\u0010\f\u001a\u00020\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0003J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0002J\b\u0010\u0011\u001a\u00020\u0004H\u0002J\u0010\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0002J\u0010\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\nH\u0003J\u0016\u0010\u0019\u001a\u00020\u00042\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0007H\u0003J\u0010\u0010\u001a\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0010\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002J\b\u0010\u001e\u001a\u00020\nH\u0014J\u0012\u0010!\u001a\u00020\u00042\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016J\b\u0010\"\u001a\u00020\u0004H\u0016J\b\u0010#\u001a\u00020\u0004H\u0016J\b\u0010$\u001a\u00020\u0004H\u0016J\u0006\u0010%\u001a\u00020\u0004J\u0006\u0010&\u001a\u00020\u0004R\u0016\u0010*\u001a\u00020'8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010,\u001a\u00020'8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b+\u0010)R\u0016\u0010.\u001a\u00020'8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b-\u0010)R\u0016\u00100\u001a\u00020'8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b/\u0010)R\u0016\u00102\u001a\u00020'8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b1\u0010)R\u0016\u00104\u001a\u00020'8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b3\u0010)R\u0016\u00106\u001a\u00020'8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b5\u0010)R\u0016\u00108\u001a\u00020'8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b7\u0010)R\u0016\u0010:\u001a\u00020'8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b9\u0010)R\u0016\u0010<\u001a\u00020'8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b;\u0010)R\u0016\u0010>\u001a\u00020'8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b=\u0010)R\u0016\u0010B\u001a\u00020?8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b@\u0010AR\u0016\u0010D\u001a\u00020?8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bC\u0010AR\u0016\u0010F\u001a\u00020?8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bE\u0010AR\u0016\u0010J\u001a\u00020G8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bH\u0010IR\u0016\u0010L\u001a\u00020G8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bK\u0010IR\u0016\u0010N\u001a\u00020G8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bM\u0010IR\u0016\u0010P\u001a\u00020G8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bO\u0010IR\u0016\u0010R\u001a\u00020G8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bQ\u0010IR\u0016\u0010V\u001a\u00020S8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bT\u0010UR\u0016\u0010Z\u001a\u00020W8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bX\u0010YR\u0016\u0010\\\u001a\u00020W8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b[\u0010YR\u0016\u0010`\u001a\u00020]8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b^\u0010_R\u0016\u0010d\u001a\u00020a8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bb\u0010cR\u0016\u0010h\u001a\u00020e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bf\u0010gR\u0016\u0010l\u001a\u00020i8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bj\u0010kR\u001c\u0010o\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bm\u0010nR\u0016\u0010q\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bp\u0010[R\u0016\u0010s\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\br\u0010XR\u0016\u0010u\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bt\u0010XR\u0016\u0010x\u001a\u00020v8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010wR\u0016\u0010z\u001a\u00020v8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\by\u0010wR\u0018\u0010~\u001a\u0004\u0018\u00010{8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b|\u0010}R\u001b\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u007f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0080\u0001\u0010\u0081\u0001R\u0018\u0010\u0084\u0001\u001a\u00020v8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0083\u0001\u0010wR\u0018\u0010\u0086\u0001\u001a\u00020v8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0085\u0001\u0010wR$\u0010\u008b\u0001\u001a\r \u0088\u0001*\u0005\u0018\u00010\u0087\u00010\u0087\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u008a\u0001R(\u0010\u0091\u0001\u001a\u00030\u008c\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0004\bw\u0010O\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001\"\u0006\b\u008f\u0001\u0010\u0090\u0001R)\u0010\u0095\u0001\u001a\u00030\u008c\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b\u0092\u0001\u0010O\u001a\u0006\b\u0093\u0001\u0010\u008e\u0001\"\u0006\b\u0094\u0001\u0010\u0090\u0001R(\u0010\u009b\u0001\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b\u0096\u0001\u0010[\u001a\u0006\b\u0097\u0001\u0010\u0098\u0001\"\u0006\b\u0099\u0001\u0010\u009a\u0001R(\u0010\u009f\u0001\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b\u009c\u0001\u0010[\u001a\u0006\b\u009d\u0001\u0010\u0098\u0001\"\u0006\b\u009e\u0001\u0010\u009a\u0001R\u0018\u0010£\u0001\u001a\u00030 \u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¡\u0001\u0010¢\u0001R\u001c\u0010§\u0001\u001a\u0005\u0018\u00010¤\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¥\u0001\u0010¦\u0001R \u0010«\u0001\u001a\u00020\r8VX\u0096\u0084\u0002¢\u0006\u0010\n\u0006\b¨\u0001\u0010©\u0001\u001a\u0006\bª\u0001\u0010\u0098\u0001R\u0017\u0010®\u0001\u001a\u00020v8BX\u0082\u0004¢\u0006\b\u001a\u0006\b¬\u0001\u0010\u00ad\u0001¨\u0006³\u0001"}, d2 = {"Lcom/heytap/health/wrist_temperature/ui/WristTemperatureHistoryDayFragment;", "Lcom/heytap/health/base/base/BaseFragment;", "Lcom/heytap/health/wrist_temperature/ui/WristDayChart$a;", "Lcom/oplus/aiunit/vision/zs9;", "", "Z0", "M0", "", "Lcom/oplus/aiunit/vision/n6m;", "dataList", "", "currentItem", "o1", "", "timestamp", "p1", "n1", "j1", "Lcom/coui/appcompat/panel/COUIPanelFragment;", "fragment", "i1", "num", "m1", "", "messageList", "d1", "H0", "Lcom/heytap/databaseengine/model/wristtemperature/WristTemperatureStat;", "wristTemperatureStat", "L0", "getLayoutId", "Landroid/view/View;", "view", "initView", "S", "onNothingSelected", "initData", "G0", "e1", "Landroid/widget/TextView;", "o", "Landroid/widget/TextView;", "mDateTv", LogFieldKey.PROCESS_NAME_KEY, "mInstructionsText", "q", "mDialogTitle1", "r", "mDialogTitle2", "s", "mDialogContent1", "t", "mLearnMoreTv", "u", "mStateNoData", "v", "mChartTitle", "w", "mChartUnit", "x", "mWristValue", "y", "mWristDetailValue", "Landroidx/cardview/widget/CardView;", "z", "Landroidx/cardview/widget/CardView;", "mExplanationLayout", "A", "mAboutWristTLayout", acl.KEY_B, "mStateCardView", "Landroid/widget/ImageView;", "C", "Landroid/widget/ImageView;", "mPreIv", "D", "mNextIv", ExifInterface.LONGITUDE_EAST, "mDownIv", UserInfo.SEX_FEMALE, "mDialogDismiss", "G", "mCardViewDismiss", "Landroidx/constraintlayout/widget/ConstraintLayout;", "H", "Landroidx/constraintlayout/widget/ConstraintLayout;", "mDataDetailLayout", "Landroid/widget/LinearLayout;", "I", "Landroid/widget/LinearLayout;", "mNoDataLayout", "J", "mLoading", "Lcom/heytap/sporthealth/blib/weiget/ZFlowLayout;", "K", "Lcom/heytap/sporthealth/blib/weiget/ZFlowLayout;", "mStateLayout", "Lcom/heytap/health/base/view/BounceScrollView;", "L", "Lcom/heytap/health/base/view/BounceScrollView;", "mScrollView", "Lcom/heytap/health/wrist_temperature/ui/WristDayChart;", "M", "Lcom/heytap/health/wrist_temperature/ui/WristDayChart;", "mDayChart", "Lcom/heytap/health/wrist_temperature/viewmodel/WristHistoryViewModel;", "N", "Lcom/heytap/health/wrist_temperature/viewmodel/WristHistoryViewModel;", "wristHistoryViewModel", "O", "Ljava/util/List;", "mDataStatList", SecureGcmConstants.MESSAGE_KEY, "mLastDataTime", "Q", "countDown", "R", "wristStat", "", "Z", "ifShowCountDown", ExifInterface.GPS_DIRECTION_TRUE, "ifShowBubble", "Lcom/coui/appcompat/panel/COUIBottomSheetDialogFragment;", "U", "Lcom/coui/appcompat/panel/COUIBottomSheetDialogFragment;", "mDialogFragment", "Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;", "mPageListener", ExifInterface.LONGITUDE_WEST, "ifRequest", "X", "ifShowUnit", "Ljava/time/LocalDate;", "kotlin.jvm.PlatformType", "Y", "Ljava/time/LocalDate;", "currentDate", "", "getCurMinWrist", "()F", "setCurMinWrist", "(F)V", "curMinWrist", "a0", "getCurMaxWrist", "setCurMaxWrist", "curMaxWrist", "b0", "getCurChartStartTime", "()J", "g1", "(J)V", "curChartStartTime", "c0", "getCurChartEndTime", "f1", "curChartEndTime", "Lcom/oplus/aiunit/vision/wt8;", "d0", "Lcom/oplus/aiunit/vision/wt8;", "pageUtils", "Lcom/heytap/health/health/family/FamilyMoreDataDetailConfigBean;", "e0", "Lcom/heytap/health/health/family/FamilyMoreDataDetailConfigBean;", "familyDetailConfig", "f0", "Lkotlin/Lazy;", "J0", "locationTime", "u5", "()Z", "isFromFamily", "<init>", "()V", "Companion", "a", "wrist_temperature_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nWristTemperatureHistoryDayFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WristTemperatureHistoryDayFragment.kt\ncom/heytap/health/wrist_temperature/ui/WristTemperatureHistoryDayFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,631:1\n1#2:632\n*E\n"})
public final class WristTemperatureHistoryDayFragment extends BaseFragment implements WristDayChart.a, zs9 {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    public CardView mAboutWristTLayout;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    public CardView mStateCardView;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public ImageView mPreIv;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public ImageView mNextIv;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public ImageView mDownIv;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public ImageView mDialogDismiss;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public ImageView mCardViewDismiss;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public ConstraintLayout mDataDetailLayout;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public LinearLayout mNoDataLayout;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public LinearLayout mLoading;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public ZFlowLayout mStateLayout;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public BounceScrollView mScrollView;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public WristDayChart mDayChart;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public WristHistoryViewModel wristHistoryViewModel;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public boolean ifShowCountDown;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    public boolean ifShowBubble;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    @Nullable
    public COUIBottomSheetDialogFragment mDialogFragment;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    @Nullable
    public ViewPager.OnPageChangeListener mPageListener;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    public boolean ifRequest;

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    public boolean ifShowUnit;

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    public float curMinWrist;

    /* JADX INFO: renamed from: a0, reason: from kotlin metadata */
    public float curMaxWrist;

    /* JADX INFO: renamed from: b0, reason: from kotlin metadata */
    public long curChartStartTime;

    /* JADX INFO: renamed from: c0, reason: from kotlin metadata */
    public long curChartEndTime;

    /* JADX INFO: renamed from: e0, reason: from kotlin metadata */
    @Nullable
    public FamilyMoreDataDetailConfigBean familyDetailConfig;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public TextView mDateTv;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public TextView mInstructionsText;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public TextView mDialogTitle1;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    public TextView mDialogTitle2;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    public TextView mDialogContent1;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    public TextView mLearnMoreTv;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    public TextView mStateNoData;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    public TextView mChartTitle;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    public TextView mChartUnit;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    public TextView mWristValue;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    public TextView mWristDetailValue;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    public CardView mExplanationLayout;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    @NotNull
    public List<WristTemperatureStat> mDataStatList = new ArrayList();

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public long mLastDataTime = System.currentTimeMillis();

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public int countDown = -1;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public int wristStat = -1;

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    public LocalDate currentDate = LocalDate.now();

    /* JADX INFO: renamed from: d0, reason: from kotlin metadata */
    @NotNull
    public final wt8 pageUtils = new wt8(1546257600000L, pr8.INSTANCE.n(System.currentTimeMillis()));

    /* JADX INFO: renamed from: f0, reason: from kotlin metadata */
    @NotNull
    public final Lazy locationTime = LazyKt__LazyJVMKt.lazy(new Function0<Long>() { // from class: com.heytap.health.wrist_temperature.ui.WristTemperatureHistoryDayFragment$locationTime$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final Long invoke() {
            WristTemperatureHistoryDayFragment wristTemperatureHistoryDayFragment = this.this$0;
            return Long.valueOf(wristTemperatureHistoryDayFragment.K0(wristTemperatureHistoryDayFragment.getArguments()));
        }
    });

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

    public static final void N0(WristTemperatureHistoryDayFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        FragmentActivity activity = this$0.getActivity();
        if (activity != null) {
            activity.startActivity(new Intent(this$0.getActivity(), (Class<?>) WristTemperatureDescriptionActivity.class));
        }
        if (this$0.u5()) {
            return;
        }
        com.heytap.health.base.track.a.k().a(xmk.TAG_MODULE_ID, 4).a(xmk.TAG_POSTION1, 1).a(xmk.TAG_POSTION2, 2).b();
    }

    public static final void O0(WristTemperatureHistoryDayFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        CardView cardView = this$0.mAboutWristTLayout;
        if (cardView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAboutWristTLayout");
            cardView = null;
        }
        cardView.setVisibility(8);
        fdg.x("wrist_day_explain").W("wrist_day_explain", false);
        if (this$0.u5()) {
            return;
        }
        com.heytap.health.base.track.a.k().a(xmk.TAG_MODULE_ID, 4).a(xmk.TAG_POSTION1, 1).a(xmk.TAG_POSTION2, 1).b();
    }

    public static final void P0(WristTemperatureHistoryDayFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        CardView cardView = this$0.mExplanationLayout;
        if (cardView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mExplanationLayout");
            cardView = null;
        }
        cardView.setVisibility(8);
        fdg.x("wrist_day_bubble").W("wrist_day_bubble", false);
    }

    public static final void Q0(WristTemperatureHistoryDayFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.i1(new WristTemperatureUndulationFrag());
    }

    public static final void R0(WristTemperatureHistoryDayFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.i1(new WristTemperatureScopeFrag(this$0.curMinWrist, this$0.curMaxWrist, this$0.curChartStartTime, this$0.curChartEndTime));
        if (this$0.u5()) {
            return;
        }
        com.heytap.health.base.track.a.k().a(xmk.TAG_MODULE_ID, 5).a(xmk.TAG_POSTION1, 1).b();
    }

    public static final void V0(WristTemperatureHistoryDayFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.j1();
    }

    public static final void W0(WristTemperatureHistoryDayFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.j1();
    }

    public static final void X0(WristTemperatureHistoryDayFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        WristDayChart wristDayChart = this$0.mDayChart;
        WristDayChart wristDayChart2 = null;
        if (wristDayChart == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDayChart");
            wristDayChart = null;
        }
        WristDayChart wristDayChart3 = this$0.mDayChart;
        if (wristDayChart3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDayChart");
        } else {
            wristDayChart2 = wristDayChart3;
        }
        wristDayChart.setCurrentItem(wristDayChart2.getCurrentItem() - 1, true);
        if (this$0.u5()) {
            return;
        }
        com.heytap.health.base.track.a.k().a(xmk.TAG_MODULE_ID, 3).a(xmk.TAG_POSTION1, 1).a("element", this$0.currentDate.plusDays(-1L).toString()).b();
    }

    public static final void Y0(WristTemperatureHistoryDayFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        WristDayChart wristDayChart = this$0.mDayChart;
        WristDayChart wristDayChart2 = null;
        if (wristDayChart == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDayChart");
            wristDayChart = null;
        }
        WristDayChart wristDayChart3 = this$0.mDayChart;
        if (wristDayChart3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDayChart");
        } else {
            wristDayChart2 = wristDayChart3;
        }
        wristDayChart.setCurrentItem(wristDayChart2.getCurrentItem() + 1, true);
        if (this$0.u5()) {
            return;
        }
        com.heytap.health.base.track.a.k().a(xmk.TAG_MODULE_ID, 3).a(xmk.TAG_POSTION1, 2).a("element", this$0.currentDate.plusDays(1L).toString()).b();
    }

    public final void G0() {
        WristDayChart wristDayChart = this.mDayChart;
        if (wristDayChart == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDayChart");
            wristDayChart = null;
        }
        wristDayChart.c();
    }

    public final int H0(long timestamp) {
        List<WristTemperatureStat> list = this.mDataStatList;
        if (list == null || list.isEmpty()) {
            return -1;
        }
        int size = this.mDataStatList.size();
        for (int i = 0; i < size; i++) {
            pr8 pr8Var = pr8.INSTANCE;
            if (pr8Var.c(timestamp) == pr8Var.c(pr8Var.g(this.mDataStatList.get(i).getDate()))) {
                return i;
            }
        }
        return -1;
    }

    public long J0() {
        return ((Number) this.locationTime.getValue()).longValue();
    }

    public long K0(@Nullable Bundle bundle) {
        return zs9.a.a(this, bundle);
    }

    public final int L0(WristTemperatureStat wristTemperatureStat) {
        if (wristTemperatureStat.getWristTemperature() == 0 && wristTemperatureStat.getConfidence() == 0) {
            m8b.f("WTDayFragment", "wristTemperature is 0 and confidence is 0");
            return 1;
        }
        if (this.curChartEndTime - this.curChartStartTime < 1200000) {
            m8b.f("WTDayFragment", "time less than 20");
            return 0;
        }
        if (wristTemperatureStat.getMax() != 0 && wristTemperatureStat.getMin() != 0) {
            return -1;
        }
        m8b.f("WTDayFragment", "max or min is 0");
        return 0;
    }

    public final void M0() {
        WristHistoryViewModel wristHistoryViewModel = this.wristHistoryViewModel;
        if (wristHistoryViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("wristHistoryViewModel");
            wristHistoryViewModel = null;
        }
        wristHistoryViewModel.F(1546272000000L, System.currentTimeMillis());
    }

    @Override // com.heytap.health.wrist_temperature.ui.WristDayChart.a
    public void S() {
        TextView textView = this.mWristValue;
        TextView textView2 = null;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mWristValue");
            textView = null;
        }
        textView.setVisibility(4);
        TextView textView3 = this.mChartTitle;
        if (textView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mChartTitle");
            textView3 = null;
        }
        textView3.setVisibility(4);
        TextView textView4 = this.mChartUnit;
        if (textView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mChartUnit");
        } else {
            textView2 = textView4;
        }
        textView2.setVisibility(4);
    }

    public final void Z0() {
        this.wristHistoryViewModel = (WristHistoryViewModel) new ViewModelProvider(this).get(WristHistoryViewModel.class);
        WristHistoryViewModel wristHistoryViewModel = null;
        if (u5()) {
            WristHistoryViewModel wristHistoryViewModel2 = this.wristHistoryViewModel;
            if (wristHistoryViewModel2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("wristHistoryViewModel");
                wristHistoryViewModel2 = null;
            }
            FamilyMoreDataDetailConfigBean familyMoreDataDetailConfigBean = this.familyDetailConfig;
            Intrinsics.checkNotNull(familyMoreDataDetailConfigBean);
            wristHistoryViewModel2.J(familyMoreDataDetailConfigBean.getSsoid());
        }
        WristHistoryViewModel wristHistoryViewModel3 = this.wristHistoryViewModel;
        if (wristHistoryViewModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("wristHistoryViewModel");
            wristHistoryViewModel3 = null;
        }
        wristHistoryViewModel3.C().observe(this, new b(new Function1<List<? extends n6m>, Unit>() { // from class: com.heytap.health.wrist_temperature.ui.WristTemperatureHistoryDayFragment$initViewModel$1
            {
                super(1);
            }

            @Override // p010kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(List<? extends n6m> list) {
                invoke2((List<n6m>) list);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(List<n6m> list) {
                if (w0b.a(list)) {
                    return;
                }
                m8b.f("WTDayFragment", "wrist data size" + list.size());
                m8b.f("WTDayFragment", "wrist data " + list);
                ArrayList arrayList = new ArrayList();
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    arrayList.add(i, m6m.INSTANCE.h(list.get(i)));
                }
                m6m.INSTANCE.j(this.this$0.mDataStatList, arrayList);
                WristTemperatureHistoryDayFragment wristTemperatureHistoryDayFragment = this.this$0;
                wristTemperatureHistoryDayFragment.o1(arrayList, wristTemperatureHistoryDayFragment.pageUtils.getCurrentItemIndex());
            }
        }));
        WristHistoryViewModel wristHistoryViewModel4 = this.wristHistoryViewModel;
        if (wristHistoryViewModel4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("wristHistoryViewModel");
        } else {
            wristHistoryViewModel = wristHistoryViewModel4;
        }
        wristHistoryViewModel.D().observe(this, new b(new Function1<List<? extends WristTemperatureStat>, Unit>() { // from class: com.heytap.health.wrist_temperature.ui.WristTemperatureHistoryDayFragment$initViewModel$2
            {
                super(1);
            }

            @Override // p010kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(List<? extends WristTemperatureStat> list) {
                invoke2((List<WristTemperatureStat>) list);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(List<WristTemperatureStat> it) {
                long jO;
                long jN;
                long jO2;
                m8b.f("WTDayFragment", "wrist stat data size" + it.size());
                m8b.f("WTDayFragment", "wrist stat data " + it);
                if (w0b.a(it)) {
                    m8b.f("WTDayFragment", "wrist DataStat is NullOrEmpty");
                    if (this.this$0.J0() != 0) {
                        pr8 pr8Var = pr8.INSTANCE;
                        jO = pr8Var.o(this.this$0.J0());
                        jN = pr8Var.n(this.this$0.J0());
                    } else if (this.this$0.u5()) {
                        pr8 pr8Var2 = pr8.INSTANCE;
                        FamilyMoreDataDetailConfigBean familyMoreDataDetailConfigBean2 = this.this$0.familyDetailConfig;
                        Intrinsics.checkNotNull(familyMoreDataDetailConfigBean2);
                        jO = pr8Var2.o(familyMoreDataDetailConfigBean2.getDayTime());
                        FamilyMoreDataDetailConfigBean familyMoreDataDetailConfigBean3 = this.this$0.familyDetailConfig;
                        Intrinsics.checkNotNull(familyMoreDataDetailConfigBean3);
                        jN = pr8Var2.n(familyMoreDataDetailConfigBean3.getDayTime());
                    } else {
                        pr8 pr8Var3 = pr8.INSTANCE;
                        jO = pr8Var3.o(System.currentTimeMillis());
                        jN = pr8Var3.n(System.currentTimeMillis());
                    }
                    n6m n6mVar = new n6m(jO, jN, new ArrayList());
                    this.this$0.pageUtils.g(jO);
                    this.this$0.o1(CollectionsKt__CollectionsJVMKt.listOf(n6mVar), 0);
                    this.this$0.p1(0L);
                    this.this$0.n1(pr8.INSTANCE.c(jN));
                    return;
                }
                pr8 pr8Var4 = pr8.INSTANCE;
                long jG = pr8Var4.g(it.get(0).getDate());
                this.this$0.mLastDataTime = pr8Var4.g(it.get(it.size() - 1).getDate());
                this.this$0.pageUtils.g(pr8Var4.o(jG));
                if (this.this$0.u5()) {
                    wt8 wt8Var = this.this$0.pageUtils;
                    FamilyMoreDataDetailConfigBean familyMoreDataDetailConfigBean4 = this.this$0.familyDetailConfig;
                    Intrinsics.checkNotNull(familyMoreDataDetailConfigBean4);
                    wt8Var.f(pr8Var4.o(familyMoreDataDetailConfigBean4.getDayTime()), 5, 20, false);
                    FamilyMoreDataDetailConfigBean familyMoreDataDetailConfigBean5 = this.this$0.familyDetailConfig;
                    Intrinsics.checkNotNull(familyMoreDataDetailConfigBean5);
                    jO2 = familyMoreDataDetailConfigBean5.getDayTime();
                } else if (this.this$0.J0() != 0) {
                    m8b.f("WTDayFragment", "locationTime" + this.this$0.J0());
                    if (this.this$0.J0() < pr8Var4.o(jG)) {
                        this.this$0.pageUtils.g(this.this$0.J0());
                    }
                    this.this$0.pageUtils.f(this.this$0.J0(), 5, 20, false);
                    jO2 = this.this$0.J0();
                } else {
                    this.this$0.pageUtils.f(pr8Var4.o(this.this$0.mLastDataTime), 5, 20, false);
                    jO2 = pr8Var4.o(this.this$0.mLastDataTime);
                }
                WristTemperatureHistoryDayFragment wristTemperatureHistoryDayFragment = this.this$0;
                Intrinsics.checkNotNullExpressionValue(it, "it");
                wristTemperatureHistoryDayFragment.mDataStatList = it;
                this.this$0.p1(jO2);
                this.this$0.n1(jO2);
            }
        }));
    }

    @SuppressLint({"InflateParams"})
    public final void d1(List<String> messageList) {
        List<String> list = messageList;
        if (list == null || list.isEmpty()) {
            return;
        }
        ZFlowLayout zFlowLayout = this.mStateLayout;
        if (zFlowLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mStateLayout");
            zFlowLayout = null;
        }
        zFlowLayout.setVisibility(0);
        TextView textView = this.mStateNoData;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mStateNoData");
            textView = null;
        }
        textView.setVisibility(8);
        ZFlowLayout zFlowLayout2 = this.mStateLayout;
        if (zFlowLayout2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mStateLayout");
            zFlowLayout2 = null;
        }
        zFlowLayout2.removeAllViews();
        if (messageList.size() > 3) {
            ZFlowLayout zFlowLayout3 = this.mStateLayout;
            if (zFlowLayout3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mStateLayout");
                zFlowLayout3 = null;
            }
            zFlowLayout3.s(true);
        } else {
            ZFlowLayout zFlowLayout4 = this.mStateLayout;
            if (zFlowLayout4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mStateLayout");
                zFlowLayout4 = null;
            }
            zFlowLayout4.s(false);
        }
        int size = messageList.size();
        for (int i = 0; i < size; i++) {
            View viewInflate = LayoutInflater.from(getActivity()).inflate(R$layout.health_wrist_state_card_item, (ViewGroup) null);
            ((TextView) viewInflate.findViewById(R$id.wrist_state_item_tv)).setText(messageList.get(i));
            ZFlowLayout zFlowLayout5 = this.mStateLayout;
            if (zFlowLayout5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mStateLayout");
                zFlowLayout5 = null;
            }
            zFlowLayout5.addView(viewInflate);
        }
    }

    public final void e1() {
        WristDayChart wristDayChart = this.mDayChart;
        if (wristDayChart == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDayChart");
            wristDayChart = null;
        }
        wristDayChart.d();
    }

    public final void f1(long j2) {
        this.curChartEndTime = j2;
    }

    public final void g1(long j2) {
        this.curChartStartTime = j2;
    }

    @Override // com.heytap.health.base.base.BaseFragment
    public int getLayoutId() {
        return R$layout.health_wrist_temperature_fragment_day;
    }

    public final void i1(COUIPanelFragment fragment) {
        FragmentManager supportFragmentManager;
        COUIBottomSheetDialogFragment cOUIBottomSheetDialogFragment;
        COUIBottomSheetDialogFragment cOUIBottomSheetDialogFragment2 = this.mDialogFragment;
        if (cOUIBottomSheetDialogFragment2 != null) {
            cOUIBottomSheetDialogFragment2.dismiss();
        }
        COUIBottomSheetDialogFragment cOUIBottomSheetDialogFragment3 = new COUIBottomSheetDialogFragment();
        this.mDialogFragment = cOUIBottomSheetDialogFragment3;
        cOUIBottomSheetDialogFragment3.setMainPanelFragment(fragment);
        FragmentActivity activity = getActivity();
        if (activity == null || (supportFragmentManager = activity.getSupportFragmentManager()) == null || (cOUIBottomSheetDialogFragment = this.mDialogFragment) == null) {
            return;
        }
        cOUIBottomSheetDialogFragment.show(supportFragmentManager, "bottomfragment");
    }

    @Override // com.heytap.health.base.base.BaseFragment
    public void initData() {
        String ssoid;
        Integer numA;
        M0();
        if (u5()) {
            FamilyMoreDataDetailConfigBean familyMoreDataDetailConfigBean = this.familyDetailConfig;
            if (familyMoreDataDetailConfigBean == null || (ssoid = familyMoreDataDetailConfigBean.getSsoid()) == null || (numA = e8m.INSTANCE.a(ssoid)) == null) {
                return;
            }
            this.countDown = numA.intValue();
            return;
        }
        String strH = ot8.h();
        this.countDown = ((IDataSyncService) e1.d().h(IDataSyncService.class)).x(strH);
        int iL = ((IDataSyncService) e1.d().h(IDataSyncService.class)).l(strH);
        this.wristStat = iL;
        if (iL == 3) {
            this.ifShowBubble = fdg.x("wrist_day_bubble").r("wrist_day_bubble", true);
        }
        int i = this.countDown;
        this.ifShowCountDown = (i == 0 || i == -1) ? false : true;
    }

    @Override // com.heytap.health.base.base.BaseFragment
    public void initView(@Nullable View view) {
        if (getActivity() instanceof WristTemperatureHistoryActivity) {
            FragmentActivity activity = getActivity();
            Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type com.heytap.health.wrist_temperature.ui.WristTemperatureHistoryActivity");
            if (((WristTemperatureHistoryActivity) activity).p7() != null) {
                FragmentActivity activity2 = getActivity();
                Intrinsics.checkNotNull(activity2, "null cannot be cast to non-null type com.heytap.health.wrist_temperature.ui.WristTemperatureHistoryActivity");
                this.familyDetailConfig = ((WristTemperatureHistoryActivity) activity2).p7();
            }
        }
        Z0();
        View viewW = W(R$id.tv_date);
        Intrinsics.checkNotNullExpressionValue(viewW, "findViewById(R.id.tv_date)");
        this.mDateTv = (TextView) viewW;
        View viewW2 = W(R$id.date_icon);
        Intrinsics.checkNotNullExpressionValue(viewW2, "findViewById(R.id.date_icon)");
        this.mDownIv = (ImageView) viewW2;
        View viewW3 = W(R$id.iv_previous);
        Intrinsics.checkNotNullExpressionValue(viewW3, "findViewById(R.id.iv_previous)");
        this.mPreIv = (ImageView) viewW3;
        View viewW4 = W(R$id.iv_next);
        Intrinsics.checkNotNullExpressionValue(viewW4, "findViewById(R.id.iv_next)");
        this.mNextIv = (ImageView) viewW4;
        View viewW5 = W(R$id.health_wrist_day_chart);
        Intrinsics.checkNotNullExpressionValue(viewW5, "findViewById(R.id.health_wrist_day_chart)");
        this.mDayChart = (WristDayChart) viewW5;
        View viewW6 = W(R$id.loading_health_wrist_t_history);
        Intrinsics.checkNotNullExpressionValue(viewW6, "findViewById(R.id.loading_health_wrist_t_history)");
        this.mLoading = (LinearLayout) viewW6;
        View viewW7 = W(R$id.scrollview_wrist_t);
        Intrinsics.checkNotNullExpressionValue(viewW7, "findViewById(R.id.scrollview_wrist_t)");
        this.mScrollView = (BounceScrollView) viewW7;
        View viewW8 = W(R$id.health_wrist_t_view_instructions);
        Intrinsics.checkNotNullExpressionValue(viewW8, "findViewById(R.id.health…rist_t_view_instructions)");
        this.mInstructionsText = (TextView) viewW8;
        View viewW9 = W(R$id.health_wrist_t_explanation_Layout);
        Intrinsics.checkNotNullExpressionValue(viewW9, "findViewById(R.id.health…ist_t_explanation_Layout)");
        this.mExplanationLayout = (CardView) viewW9;
        View viewW10 = W(R$id.dialog_dismiss);
        Intrinsics.checkNotNullExpressionValue(viewW10, "findViewById(R.id.dialog_dismiss)");
        this.mDialogDismiss = (ImageView) viewW10;
        View viewW11 = W(R$id.no_data_detail_title1);
        Intrinsics.checkNotNullExpressionValue(viewW11, "findViewById(R.id.no_data_detail_title1)");
        this.mDialogTitle1 = (TextView) viewW11;
        View viewW12 = W(R$id.no_data_detail_title2);
        Intrinsics.checkNotNullExpressionValue(viewW12, "findViewById(R.id.no_data_detail_title2)");
        this.mDialogTitle2 = (TextView) viewW12;
        View viewW13 = W(R$id.no_data_detail_content1);
        Intrinsics.checkNotNullExpressionValue(viewW13, "findViewById(R.id.no_data_detail_content1)");
        this.mDialogContent1 = (TextView) viewW13;
        View viewW14 = W(R$id.data_detail_layout);
        Intrinsics.checkNotNullExpressionValue(viewW14, "findViewById(R.id.data_detail_layout)");
        this.mDataDetailLayout = (ConstraintLayout) viewW14;
        View viewW15 = W(R$id.no_data_detail_layout);
        Intrinsics.checkNotNullExpressionValue(viewW15, "findViewById(R.id.no_data_detail_layout)");
        this.mNoDataLayout = (LinearLayout) viewW15;
        View viewW16 = W(R$id.about_wrist_temperature_layout);
        Intrinsics.checkNotNullExpressionValue(viewW16, "findViewById(R.id.about_wrist_temperature_layout)");
        this.mAboutWristTLayout = (CardView) viewW16;
        View viewW17 = W(R$id.about_wrist_temperature_dismiss);
        Intrinsics.checkNotNullExpressionValue(viewW17, "findViewById(R.id.about_wrist_temperature_dismiss)");
        this.mCardViewDismiss = (ImageView) viewW17;
        View viewW18 = W(R$id.wrist_t_learn_more);
        Intrinsics.checkNotNullExpressionValue(viewW18, "findViewById(R.id.wrist_t_learn_more)");
        this.mLearnMoreTv = (TextView) viewW18;
        View viewW19 = W(R$id.wrist_t_state_layout);
        Intrinsics.checkNotNullExpressionValue(viewW19, "findViewById(R.id.wrist_t_state_layout)");
        this.mStateLayout = (ZFlowLayout) viewW19;
        View viewW20 = W(R$id.tv_wrist_t_state_nodata);
        Intrinsics.checkNotNullExpressionValue(viewW20, "findViewById(R.id.tv_wrist_t_state_nodata)");
        this.mStateNoData = (TextView) viewW20;
        View viewW21 = W(R$id.health_wrist_t_range_text);
        Intrinsics.checkNotNullExpressionValue(viewW21, "findViewById(R.id.health_wrist_t_range_text)");
        this.mChartTitle = (TextView) viewW21;
        View viewW22 = W(R$id.tv_health_wrist_t_range);
        Intrinsics.checkNotNullExpressionValue(viewW22, "findViewById(R.id.tv_health_wrist_t_range)");
        this.mWristValue = (TextView) viewW22;
        View viewW23 = W(R$id.tv_health_wrist_unit);
        Intrinsics.checkNotNullExpressionValue(viewW23, "findViewById(R.id.tv_health_wrist_unit)");
        this.mChartUnit = (TextView) viewW23;
        View viewW24 = W(R$id.tv_wrist_t_range);
        Intrinsics.checkNotNullExpressionValue(viewW24, "findViewById(R.id.tv_wrist_t_range)");
        this.mWristDetailValue = (TextView) viewW24;
        View viewW25 = W(R$id.wrist_state_cardview);
        Intrinsics.checkNotNullExpressionValue(viewW25, "findViewById(R.id.wrist_state_cardview)");
        this.mStateCardView = (CardView) viewW25;
        w4l.d(this, W(R$id.fl_stress_date_container));
        w4l.d(this, W(R$id.ll_range_container));
        w4l.d(this, W(R$id.health_stress_view_explanation));
        w4l.d(this, W(R$id.ll_wrist_day_content));
        WristDayChart wristDayChart = this.mDayChart;
        WristDayChart wristDayChart2 = null;
        if (wristDayChart == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDayChart");
            wristDayChart = null;
        }
        wristDayChart.f(this);
        ZFlowLayout zFlowLayout = this.mStateLayout;
        if (zFlowLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mStateLayout");
            zFlowLayout = null;
        }
        zFlowLayout.o(qmg.a(getContext(), 8.0f));
        ZFlowLayout zFlowLayout2 = this.mStateLayout;
        if (zFlowLayout2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mStateLayout");
            zFlowLayout2 = null;
        }
        zFlowLayout2.v(qmg.a(getContext(), 14.0f));
        ZFlowLayout zFlowLayout3 = this.mStateLayout;
        if (zFlowLayout3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mStateLayout");
            zFlowLayout3 = null;
        }
        zFlowLayout3.o(qmg.a(zFlowLayout3.getContext(), 8.0f));
        zFlowLayout3.v(qmg.a(zFlowLayout3.getContext(), 14.0f));
        zFlowLayout3.r(4);
        if (fdg.x("wrist_day_explain").r("wrist_day_explain", true)) {
            CardView cardView = this.mAboutWristTLayout;
            if (cardView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mAboutWristTLayout");
                cardView = null;
            }
            cardView.setVisibility(0);
        }
        TextView textView = this.mLearnMoreTv;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLearnMoreTv");
            textView = null;
        }
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.j7m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                WristTemperatureHistoryDayFragment.N0(this.i, view2);
            }
        });
        ImageView imageView = this.mCardViewDismiss;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCardViewDismiss");
            imageView = null;
        }
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.k7m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                WristTemperatureHistoryDayFragment.O0(this.i, view2);
            }
        });
        ImageView imageView2 = this.mDialogDismiss;
        if (imageView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDialogDismiss");
            imageView2 = null;
        }
        imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.l7m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                WristTemperatureHistoryDayFragment.P0(this.i, view2);
            }
        });
        TextView textView2 = this.mInstructionsText;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mInstructionsText");
            textView2 = null;
        }
        textView2.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.m7m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                WristTemperatureHistoryDayFragment.Q0(this.i, view2);
            }
        });
        ConstraintLayout constraintLayout = this.mDataDetailLayout;
        if (constraintLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDataDetailLayout");
            constraintLayout = null;
        }
        constraintLayout.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.n7m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                WristTemperatureHistoryDayFragment.R0(this.i, view2);
            }
        });
        TextView textView3 = this.mDateTv;
        if (textView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDateTv");
            textView3 = null;
        }
        textView3.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.o7m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                WristTemperatureHistoryDayFragment.V0(this.i, view2);
            }
        });
        ImageView imageView3 = this.mDownIv;
        if (imageView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDownIv");
            imageView3 = null;
        }
        imageView3.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.p7m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                WristTemperatureHistoryDayFragment.W0(this.i, view2);
            }
        });
        ImageView imageView4 = this.mPreIv;
        if (imageView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPreIv");
            imageView4 = null;
        }
        imageView4.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.q7m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                WristTemperatureHistoryDayFragment.X0(this.i, view2);
            }
        });
        ImageView imageView5 = this.mNextIv;
        if (imageView5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mNextIv");
            imageView5 = null;
        }
        imageView5.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.r7m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                WristTemperatureHistoryDayFragment.Y0(this.i, view2);
            }
        });
        this.mPageListener = new ViewPager.OnPageChangeListener() { // from class: com.heytap.health.wrist_temperature.ui.WristTemperatureHistoryDayFragment.initView.11
            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageScrollStateChanged(int state) {
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
            }

            /* JADX WARN: Code duplicated, block: B:12:0x0047  */
            /* JADX WARN: Code duplicated, block: B:22:0x00ab  */
            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageSelected(int position) {
                pr8 pr8Var;
                WristDayChart wristDayChart3 = WristTemperatureHistoryDayFragment.this.mDayChart;
                if (wristDayChart3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mDayChart");
                    wristDayChart3 = null;
                }
                n6m n6mVar = wristDayChart3.getData().get(position);
                WristTemperatureHistoryDayFragment.this.g1(n6mVar.getStartTimestamp());
                WristTemperatureHistoryDayFragment.this.f1(n6mVar.getEndTimestamp());
                if (position == 0) {
                    pr8Var = pr8.INSTANCE;
                    if (pr8Var.n(n6mVar.getEndTimestamp() - ((long) 1000)) != WristTemperatureHistoryDayFragment.this.pageUtils.getBorderEndTime() || pr8Var.o(n6mVar.getStartTimestamp()) == WristTemperatureHistoryDayFragment.this.pageUtils.getBorderStartTime()) {
                        m8b.f("WTDayFragment", "the end");
                    } else {
                        long jC = pr8Var.c(n6mVar.getEndTimestamp());
                        if (jC != WristTemperatureHistoryDayFragment.this.pageUtils.getLastRequestTime() && !WristTemperatureHistoryDayFragment.this.ifRequest) {
                            WristTemperatureHistoryDayFragment.this.pageUtils.f(jC, 5, 20, true);
                            WristTemperatureHistoryDayFragment.this.ifRequest = true;
                        }
                    }
                } else {
                    WristDayChart wristDayChart4 = WristTemperatureHistoryDayFragment.this.mDayChart;
                    if (wristDayChart4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mDayChart");
                        wristDayChart4 = null;
                    }
                    if (position == wristDayChart4.getData().size() - 1) {
                        pr8Var = pr8.INSTANCE;
                        if (pr8Var.n(n6mVar.getEndTimestamp() - ((long) 1000)) != WristTemperatureHistoryDayFragment.this.pageUtils.getBorderEndTime()) {
                            m8b.f("WTDayFragment", "the end");
                        } else {
                            m8b.f("WTDayFragment", "the end");
                        }
                    }
                }
                m8b.f("WTDayFragment", "selected date is" + n6mVar.getStartTimestamp());
                WristTemperatureHistoryDayFragment.this.n1(n6mVar.getStartTimestamp());
                WristTemperatureHistoryDayFragment.this.p1(n6mVar.getStartTimestamp());
                WristDayChart wristDayChart5 = WristTemperatureHistoryDayFragment.this.mDayChart;
                if (wristDayChart5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mDayChart");
                    wristDayChart5 = null;
                }
                wristDayChart5.g(position);
                WristDayChart wristDayChart6 = WristTemperatureHistoryDayFragment.this.mDayChart;
                if (wristDayChart6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mDayChart");
                    wristDayChart6 = null;
                }
                WristTemperatureChart mChart = wristDayChart6.getMChart();
                if (mChart != null) {
                    mChart.highlightValue((Highlight) null, true);
                }
            }
        };
        WristDayChart wristDayChart3 = this.mDayChart;
        if (wristDayChart3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDayChart");
        } else {
            wristDayChart2 = wristDayChart3;
        }
        wristDayChart2.setOnPageChangeListener(this.mPageListener);
        this.pageUtils.e().observe(getViewLifecycleOwner(), new b(new Function1<wt8.b, Unit>() { // from class: com.heytap.health.wrist_temperature.ui.WristTemperatureHistoryDayFragment.initView.12
            {
                super(1);
            }

            @Override // p010kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(wt8.b bVar) {
                invoke2(bVar);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(wt8.b bVar) {
                WristHistoryViewModel wristHistoryViewModel = WristTemperatureHistoryDayFragment.this.wristHistoryViewModel;
                if (wristHistoryViewModel == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("wristHistoryViewModel");
                    wristHistoryViewModel = null;
                }
                wristHistoryViewModel.I(bVar.sendStartTimestamp, bVar.sendEndTimestamp, 4);
            }
        }));
    }

    public final void j1() {
    }

    @SuppressLint({"StringFormatMatches"})
    public final void m1(int num) {
        String quantityString;
        Resources resources;
        ConstraintLayout constraintLayout = this.mDataDetailLayout;
        LinearLayout linearLayout = null;
        TextView textView = null;
        TextView textView2 = null;
        TextView textView3 = null;
        if (constraintLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDataDetailLayout");
            constraintLayout = null;
        }
        constraintLayout.setVisibility(8);
        LinearLayout linearLayout2 = this.mNoDataLayout;
        if (linearLayout2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mNoDataLayout");
            linearLayout2 = null;
        }
        linearLayout2.setVisibility(0);
        if (num == -1) {
            ConstraintLayout constraintLayout2 = this.mDataDetailLayout;
            if (constraintLayout2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mDataDetailLayout");
                constraintLayout2 = null;
            }
            constraintLayout2.setVisibility(0);
            LinearLayout linearLayout3 = this.mNoDataLayout;
            if (linearLayout3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mNoDataLayout");
            } else {
                linearLayout = linearLayout3;
            }
            linearLayout.setVisibility(8);
            return;
        }
        if (num == 0) {
            TextView textView4 = this.mDialogTitle1;
            if (textView4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mDialogTitle1");
                textView4 = null;
            }
            textView4.setVisibility(0);
            TextView textView5 = this.mDialogTitle2;
            if (textView5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mDialogTitle2");
                textView5 = null;
            }
            textView5.setVisibility(8);
            TextView textView6 = this.mDialogContent1;
            if (textView6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mDialogContent1");
            } else {
                textView3 = textView6;
            }
            textView3.setText(getString(R$string.health_wrist_no_data_1));
            return;
        }
        if (num == 1) {
            TextView textView7 = this.mDialogTitle1;
            if (textView7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mDialogTitle1");
                textView7 = null;
            }
            textView7.setVisibility(0);
            TextView textView8 = this.mDialogTitle2;
            if (textView8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mDialogTitle2");
                textView8 = null;
            }
            textView8.setVisibility(8);
            TextView textView9 = this.mDialogContent1;
            if (textView9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mDialogContent1");
            } else {
                textView2 = textView9;
            }
            textView2.setText(getString(R$string.health_wrist_no_data_2));
            return;
        }
        if (num != 2) {
            return;
        }
        TextView textView10 = this.mDialogTitle1;
        if (textView10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDialogTitle1");
            textView10 = null;
        }
        textView10.setVisibility(8);
        TextView textView11 = this.mDialogTitle2;
        if (textView11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDialogTitle2");
            textView11 = null;
        }
        textView11.setVisibility(0);
        TextView textView12 = this.mDialogTitle2;
        if (textView12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDialogTitle2");
            textView12 = null;
        }
        Context context = getContext();
        if (context == null || (resources = context.getResources()) == null) {
            quantityString = null;
        } else {
            int i = R$plurals.health_wrist_base_line_count_down;
            int i2 = this.countDown;
            quantityString = resources.getQuantityString(i, i2, Integer.valueOf(i2));
        }
        textView12.setText(quantityString);
        TextView textView13 = this.mDialogContent1;
        if (textView13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDialogContent1");
        } else {
            textView = textView13;
        }
        textView.setText(getString(R$string.health_wrist_no_data_3));
    }

    public final void n1(long timestamp) {
        pr8 pr8Var = pr8.INSTANCE;
        TextView textView = null;
        if (pr8Var.o(timestamp) <= this.pageUtils.getBorderStartTime() || timestamp == 0) {
            ImageView imageView = this.mPreIv;
            if (imageView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPreIv");
                imageView = null;
            }
            imageView.setVisibility(4);
        } else {
            ImageView imageView2 = this.mPreIv;
            if (imageView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPreIv");
                imageView2 = null;
            }
            imageView2.setVisibility(0);
        }
        if (pr8Var.n(timestamp) >= this.pageUtils.getBorderEndTime() || timestamp == 0) {
            ImageView imageView3 = this.mNextIv;
            if (imageView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mNextIv");
                imageView3 = null;
            }
            imageView3.setVisibility(4);
        } else {
            ImageView imageView4 = this.mNextIv;
            if (imageView4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mNextIv");
                imageView4 = null;
            }
            imageView4.setVisibility(0);
        }
        long jN = pr8Var.n(timestamp);
        this.currentDate = LocalDateTime.ofInstant(Instant.ofEpochMilli(jN), ZoneId.systemDefault()).toLocalDate();
        if (LocalDate.now().getYear() == q15.r(jN)) {
            TextView textView2 = this.mDateTv;
            if (textView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mDateTv");
            } else {
                textView = textView2;
            }
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str = String.format("%s, %s", Arrays.copyOf(new Object[]{lo9.g(jN, "MMMdd"), lo9.c(requireActivity(), jN)}, 2));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            textView.setText(str);
            return;
        }
        TextView textView3 = this.mDateTv;
        if (textView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDateTv");
        } else {
            textView = textView3;
        }
        StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
        String str2 = String.format("%s, %s", Arrays.copyOf(new Object[]{lo9.g(jN, "yyyyMMMdd"), lo9.c(requireActivity(), jN)}, 2));
        Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
        textView.setText(str2);
    }

    public final void o1(List<n6m> dataList, int currentItem) {
        WristDayChart wristDayChart = this.mDayChart;
        WristDayChart wristDayChart2 = null;
        if (wristDayChart == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDayChart");
            wristDayChart = null;
        }
        wristDayChart.setData(dataList);
        this.ifRequest = false;
        if (dataList.size() == 1) {
            ViewPager.OnPageChangeListener onPageChangeListener = this.mPageListener;
            if (onPageChangeListener != null) {
                onPageChangeListener.onPageSelected(0);
                return;
            }
            return;
        }
        WristDayChart wristDayChart3 = this.mDayChart;
        if (wristDayChart3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDayChart");
        } else {
            wristDayChart2 = wristDayChart3;
        }
        wristDayChart2.setCurrentItem(currentItem, false);
    }

    @Override // com.heytap.health.wrist_temperature.ui.WristDayChart.a
    public void onNothingSelected() {
        TextView textView = this.mWristValue;
        TextView textView2 = null;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mWristValue");
            textView = null;
        }
        textView.setVisibility(0);
        TextView textView3 = this.mChartTitle;
        if (textView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mChartTitle");
            textView3 = null;
        }
        textView3.setVisibility(0);
        if (this.ifShowUnit) {
            TextView textView4 = this.mChartUnit;
            if (textView4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mChartUnit");
            } else {
                textView2 = textView4;
            }
            textView2.setVisibility(0);
        }
    }

    @SuppressLint({"StringFormatMatches"})
    public final void p1(long timestamp) {
        int iH0 = timestamp == 0 ? -1 : H0(pr8.INSTANCE.n(timestamp));
        WristTemperatureStat wristTemperatureStat = iH0 == -1 ? new WristTemperatureStat(null, null, null, 0, null, 0, 1, 0, 0, 0, 0, 0, 0L, 0, 16319, null) : this.mDataStatList.get(iH0);
        m8b.f("WTDayFragment", "updateData :" + wristTemperatureStat);
        m6m.Companion aVar = m6m.INSTANCE;
        float f = aVar.f(wristTemperatureStat);
        int iL0 = L0(wristTemperatureStat);
        CardView cardView = null;
        if (f == -10000.0f) {
            TextView textView = this.mWristValue;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mWristValue");
                textView = null;
            }
            textView.setText(getString(com.heytap.health.health_base.R$string.health_base_no_data));
            TextView textView2 = this.mWristValue;
            if (textView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mWristValue");
                textView2 = null;
            }
            textView2.setTextSize(20.0f);
            TextView textView3 = this.mChartTitle;
            if (textView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mChartTitle");
                textView3 = null;
            }
            textView3.setText(getString(R$string.health_wrist_temperature));
            TextView textView4 = this.mChartUnit;
            if (textView4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mChartUnit");
                textView4 = null;
            }
            textView4.setVisibility(4);
            this.ifShowUnit = false;
            ZFlowLayout zFlowLayout = this.mStateLayout;
            if (zFlowLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mStateLayout");
                zFlowLayout = null;
            }
            zFlowLayout.setVisibility(8);
            TextView textView5 = this.mStateNoData;
            if (textView5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mStateNoData");
                textView5 = null;
            }
            textView5.setVisibility(0);
        } else {
            float wristTemperature = (wristTemperatureStat.getWristTemperature() - wristTemperatureStat.getDayBaseLineWristTemperature()) / 100.0f;
            TextView textView6 = this.mWristValue;
            if (textView6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mWristValue");
                textView6 = null;
            }
            textView6.setTextSize(34.0f);
            TextView textView7 = this.mWristValue;
            if (textView7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mWristValue");
                textView7 = null;
            }
            textView7.setText(aVar.g(wristTemperature, getContext()));
            TextView textView8 = this.mChartUnit;
            if (textView8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mChartUnit");
                textView8 = null;
            }
            textView8.setVisibility(0);
            this.ifShowUnit = true;
            if (iL0 == -1) {
                this.curMaxWrist = aVar.d(wristTemperatureStat);
                this.curMinWrist = aVar.e(wristTemperatureStat);
                String strG = aVar.g(this.curMaxWrist, getContext());
                String strG2 = aVar.g(this.curMinWrist, getContext());
                TextView textView9 = this.mWristDetailValue;
                if (textView9 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mWristDetailValue");
                    textView9 = null;
                }
                textView9.setText(getString(R$string.health_wrist_temperature_format_data, strG2, strG) + getString(R$string.health_wrist_temperature_unit));
            }
            d1(aVar.b(wristTemperatureStat.getSymptoms(), wristTemperatureStat.getActions(), getContext()));
        }
        if (this.ifShowBubble && Intrinsics.areEqual(this.currentDate, LocalDate.now())) {
            CardView cardView2 = this.mExplanationLayout;
            if (cardView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mExplanationLayout");
                cardView2 = null;
            }
            cardView2.setVisibility(0);
        } else {
            CardView cardView3 = this.mExplanationLayout;
            if (cardView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mExplanationLayout");
                cardView3 = null;
            }
            cardView3.setVisibility(8);
        }
        if (this.ifShowCountDown && Intrinsics.areEqual(this.currentDate, LocalDate.now())) {
            CardView cardView4 = this.mStateCardView;
            if (cardView4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mStateCardView");
            } else {
                cardView = cardView4;
            }
            cardView.setVisibility(8);
            iL0 = 2;
        } else {
            CardView cardView5 = this.mStateCardView;
            if (cardView5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mStateCardView");
            } else {
                cardView = cardView5;
            }
            cardView.setVisibility(0);
        }
        m1(iL0);
    }

    public final boolean u5() {
        return this.familyDetailConfig != null;
    }
}