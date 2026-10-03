package com.heytap.health.bloodoxygen.ui;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.os.BundleCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.coui.appcompat.panel.COUIBottomSheetDialogFragment;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.CandleData;
import com.github.mikephil.charting.data.CandleEntry;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.interfaces.datasets.ICandleDataSet;
import com.github.mikephil.charting.listener.ChartTouchListener;
import com.github.mikephil.charting.listener.OnChartValueSelectedListener;
import com.google.security.cryptauth.lib.securegcm.SecureGcmConstants;
import com.heytap.databaseengine.model.SpaceInfo;
import com.heytap.databaseengine.model.UserInfo;
import com.heytap.databaseengine.model.bloodoxygensaturation.BloodOxygenSaturationDataStat;
import com.heytap.health.base.base.BaseFragment;
import com.heytap.health.base.view.CommonScrollTopLineView;
import com.heytap.health.base.view.ScrollListenerView;
import com.heytap.health.bloodoxygen.R$id;
import com.heytap.health.bloodoxygen.R$layout;
import com.heytap.health.bloodoxygen.ui.BloodOxygenHistoryBaseFragment;
import com.heytap.health.bloodoxygen.util.BOTrackUtil;
import com.heytap.health.bloodoxygen.util.BloodOxygenChartTouchListener;
import com.heytap.health.bloodoxygen.view.Spo2WarningView;
import com.heytap.health.bloodoxygen.viewmodel.BloodOxygenSpaceViewModel;
import com.heytap.health.bloodoxygen.viewmodel.BloodOxygenStoreViewModel;
import com.heytap.health.bloodoxygen.viewmodel.BloodOxygenViewModel;
import com.heytap.health.core.operation.space.SpaceView;
import com.heytap.health.core.widget.charts.BloodOxCandleChart;
import com.heytap.health.core.widget.charts.animator.CustomChartAnimator;
import com.heytap.health.core.widget.charts.components.markerview.CommonMarkerView;
import com.heytap.health.core.widget.charts.data.ChartScrollState;
import com.heytap.health.health.family.FamilyMoreDataDetailConfigBean;
import com.heytap.health.health.storemodel.DataModel;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.Spo2WarnBean;
import com.oplus.aiunit.vision.acl;
import com.oplus.aiunit.vision.ar0;
import com.oplus.aiunit.vision.c7n;
import com.oplus.aiunit.vision.f59;
import com.oplus.aiunit.vision.fz6;
import com.oplus.aiunit.vision.ir9;
import com.oplus.aiunit.vision.k7h;
import com.oplus.aiunit.vision.lo9;
import com.oplus.aiunit.vision.o15;
import com.oplus.aiunit.vision.w4l;
import com.oplus.aiunit.vision.xp0;
import com.oplus.aiunit.vision.zs9;
import com.oplus.wearable.linkservice.sdk.Node;
import com.xiaomi.mipush.sdk.Constants;
import io.netty.handler.ssl.ApplicationProtocolNames;
import io.protostuff.MapSchema;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.TemporalAdjusters;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.DelayKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Function;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.Pair;
import p010kotlin.ResultKt;
import p010kotlin.TuplesKt;
import p010kotlin.Unit;
import p010kotlin.collections.CollectionsKt___CollectionsKt;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.FunctionAdapter;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.Reflection;
import p010kotlin.jvm.internal.SourceDebugExtension;
import p010kotlin.jvm.internal.StringCompanionObject;
import p010kotlin.math.MathKt__MathJVMKt;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000ä\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b1\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000 á\u00012\u00020\u00012\u00020\u00022\u00020\u0003:\u0002â\u0001B\t¢\u0006\u0006\bß\u0001\u0010à\u0001J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0004H\u0002J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0002J\b\u0010\u000b\u001a\u00020\u0004H\u0002J\u0018\u0010\u000e\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\bH\u0002J\b\u0010\u000f\u001a\u00020\u0004H\u0002J\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J\b\u0010\u0013\u001a\u00020\u0004H\u0002J\u001b\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0014H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0018H\u0002J\u001c\u0010\u001d\u001a\u00020\u00042\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u001bH\u0002J\u0018\u0010!\u001a\u00020\u00042\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001eH\u0002J\b\u0010\"\u001a\u00020\u0004H\u0002J\b\u0010#\u001a\u00020\u0004H\u0002J\u0010\u0010&\u001a\u00020\u00042\u0006\u0010%\u001a\u00020$H\u0002J\b\u0010(\u001a\u00020'H\u0014J\u0010\u0010+\u001a\u00020\u00042\u0006\u0010*\u001a\u00020)H\u0016J\b\u0010,\u001a\u00020\u0004H\u0016J\u0016\u0010/\u001a\u00020\u00042\u0006\u0010-\u001a\u00020\b2\u0006\u0010.\u001a\u00020\bJ\u000e\u00101\u001a\u00020\u00042\u0006\u00100\u001a\u00020\u0014J\u0018\u00103\u001a\u00020\u00042\u000e\u00102\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001eH$J\b\u00104\u001a\u00020\u0004H\u0016J\u0014\u00105\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020'0\u001bH&J\u0012\u00108\u001a\u00020\u00042\b\u00107\u001a\u0004\u0018\u000106H&J\u0018\u00109\u001a\u00020\u00042\u0006\u0010-\u001a\u00020\b2\u0006\u0010.\u001a\u00020\bH\u0004J\u0010\u0010;\u001a\u00020\b2\u0006\u0010:\u001a\u00020\bH$J\u0010\u0010<\u001a\u00020\b2\u0006\u0010:\u001a\u00020\bH$J\b\u0010=\u001a\u00020'H&J\b\u0010>\u001a\u00020$H&J\u0018\u0010?\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\bH\u0004J\b\u0010@\u001a\u00020\u0004H\u0016R\"\u0010G\u001a\u00020\u00188\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\u0018\u0010J\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\"\u0010Q\u001a\u00020\b8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\"\u0010U\u001a\u00020\b8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bR\u0010L\u001a\u0004\bS\u0010N\"\u0004\bT\u0010PR\"\u0010Y\u001a\u00020\b8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bV\u0010L\u001a\u0004\bW\u0010N\"\u0004\bX\u0010PR\"\u0010]\u001a\u00020\b8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bZ\u0010L\u001a\u0004\b[\u0010N\"\u0004\b\\\u0010PR\"\u0010d\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b^\u0010_\u001a\u0004\b`\u0010a\"\u0004\bb\u0010cR\"\u0010f\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\be\u0010_\u001a\u0004\bf\u0010a\"\u0004\bg\u0010cR\u001b\u0010m\u001a\u00020h8DX\u0084\u0084\u0002¢\u0006\f\n\u0004\bi\u0010j\u001a\u0004\bk\u0010lR\"\u0010o\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bn\u0010_\u001a\u0004\bo\u0010a\"\u0004\bp\u0010cR\"\u0010t\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bq\u0010_\u001a\u0004\br\u0010a\"\u0004\bs\u0010cR\"\u0010x\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bu\u0010_\u001a\u0004\bv\u0010a\"\u0004\bw\u0010cR#\u0010\u0080\u0001\u001a\u00020y8\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\bz\u0010{\u001a\u0004\b|\u0010}\"\u0004\b~\u0010\u007fR,\u0010\u0088\u0001\u001a\u0005\u0018\u00010\u0081\u00018\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0006\b\u0082\u0001\u0010\u0083\u0001\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001\"\u0006\b\u0086\u0001\u0010\u0087\u0001R,\u0010\u0090\u0001\u001a\u0005\u0018\u00010\u0089\u00018\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0006\b\u008a\u0001\u0010\u008b\u0001\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001\"\u0006\b\u008e\u0001\u0010\u008f\u0001R\u001c\u0010\u0094\u0001\u001a\u0005\u0018\u00010\u0091\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0092\u0001\u0010\u0093\u0001R\u001c\u0010\u0098\u0001\u001a\u0005\u0018\u00010\u0095\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0096\u0001\u0010\u0097\u0001R\u001c\u0010\u009c\u0001\u001a\u0005\u0018\u00010\u0099\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009a\u0001\u0010\u009b\u0001R\u001c\u0010 \u0001\u001a\u0005\u0018\u00010\u009d\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009e\u0001\u0010\u009f\u0001R\u001c\u0010¢\u0001\u001a\u0005\u0018\u00010\u009d\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¡\u0001\u0010\u009f\u0001R\u001c\u0010¤\u0001\u001a\u0005\u0018\u00010\u009d\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b£\u0001\u0010\u009f\u0001R\u001b\u0010¥\u0001\u001a\u0005\u0018\u00010\u009d\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bL\u0010\u009f\u0001R\u001c\u0010©\u0001\u001a\u0005\u0018\u00010¦\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b§\u0001\u0010¨\u0001R\u001c\u0010«\u0001\u001a\u0005\u0018\u00010¦\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bª\u0001\u0010¨\u0001R\u001c\u0010\u00ad\u0001\u001a\u0005\u0018\u00010\u009d\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¬\u0001\u0010\u009f\u0001R\u001b\u0010°\u0001\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b®\u0001\u0010¯\u0001R,\u0010¸\u0001\u001a\u0005\u0018\u00010±\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b²\u0001\u0010³\u0001\u001a\u0006\b´\u0001\u0010µ\u0001\"\u0006\b¶\u0001\u0010·\u0001R\u0018\u0010º\u0001\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b¹\u0001\u0010LR!\u0010½\u0001\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b»\u0001\u0010¼\u0001R5\u0010Ä\u0001\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u001b8\u0004@\u0004X\u0084\u000e¢\u0006\u0018\n\u0006\b¾\u0001\u0010¿\u0001\u001a\u0006\bÀ\u0001\u0010Á\u0001\"\u0006\bÂ\u0001\u0010Ã\u0001R&\u0010È\u0001\u001a\u00020\u00188\u0004@\u0004X\u0084\u000e¢\u0006\u0015\n\u0005\bÅ\u0001\u0010B\u001a\u0005\bÆ\u0001\u0010D\"\u0005\bÇ\u0001\u0010FR\"\u0010Í\u0001\u001a\u0005\u0018\u00010É\u00018VX\u0096\u0084\u0002¢\u0006\u000f\n\u0005\bÊ\u0001\u0010j\u001a\u0006\bË\u0001\u0010Ì\u0001R\u001e\u0010Ð\u0001\u001a\u00020\b8VX\u0096\u0084\u0002¢\u0006\u000e\n\u0005\bÎ\u0001\u0010j\u001a\u0005\bÏ\u0001\u0010NR'\u0010Ö\u0001\u001a\n\u0012\u0005\u0012\u00030Ò\u00010Ñ\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\bÓ\u0001\u0010j\u001a\u0006\bÔ\u0001\u0010Õ\u0001R\u0018\u0010Ú\u0001\u001a\u00030×\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\bØ\u0001\u0010Ù\u0001R\u0016\u0010Ü\u0001\u001a\u00020\b8DX\u0084\u0004¢\u0006\u0007\u001a\u0005\bÛ\u0001\u0010NR\u0016\u0010Þ\u0001\u001a\u00020\b8DX\u0084\u0004¢\u0006\u0007\u001a\u0005\bÝ\u0001\u0010N\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006ç\u0001²\u0006\u000e\u0010ä\u0001\u001a\u00030ã\u00018\nX\u008a\u0084\u0002²\u0006\u000e\u0010æ\u0001\u001a\u00030å\u00018\nX\u008a\u0084\u0002"}, d2 = {"Lcom/heytap/health/bloodoxygen/ui/BloodOxygenHistoryBaseFragment;", "Lcom/heytap/health/base/base/BaseFragment;", "Lcom/oplus/aiunit/vision/ir9;", "Lcom/oplus/aiunit/vision/zs9;", "", "initArguments", "v1", "p1", "", "defaultTime", "d2", "o2", "startTime", "endTime", "K1", "z0", "", "startX", "F0", "X1", "", "isNextDate", acl.KEY_A0, "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "spo2RangeStr", "q2", "Lkotlin/Pair;", "timeRange", "G0", "", "Lcom/heytap/databaseengine/model/bloodoxygensaturation/BloodOxygenSaturationDataStat;", "statData", "W1", acl.KEY_B1, "l2", "Ljava/time/LocalDate;", "date", Node.I_TAG, "", "getLayoutId", "Landroid/view/View;", "view", "initView", "initData", "visibleStartTime", "visibleEndTime", "M1", "isSelect", "V1", "dataList", "N1", "r2", "K0", "Lcom/heytap/health/core/widget/charts/data/ChartScrollState;", "state", "P1", "s2", "time", "j1", "i1", acl.KEY_B0, "M0", "o1", "onResume", "o", "Ljava/lang/String;", "m1", "()Ljava/lang/String;", "k2", "(Ljava/lang/String;)V", "TAG", LogFieldKey.PROCESS_NAME_KEY, "Ljava/lang/Long;", "earliestDataTime", "q", "J", "N0", "()J", "b2", "(J)V", "chartStartTime", "r", "L0", "setChartEndTime", "chartEndTime", "s", "Y0", ApplicationProtocolNames.HTTP_2, "lastStartTime", "t", "X0", "g2", "lastEndTime", "u", "Z", "getEmptyData", "()Z", "e2", "(Z)V", "emptyData", "v", "isInAnimation", "f2", "Lcom/heytap/health/bloodoxygen/viewmodel/BloodOxygenViewModel;", "w", "Lkotlin/Lazy;", "n1", "()Lcom/heytap/health/bloodoxygen/viewmodel/BloodOxygenViewModel;", "viewModel", "x", "isViewInit", "setViewInit", "y", "J1", "setSelected", "isSelected", "z", "G1", "setResume", "isResume", "Lcom/heytap/health/core/widget/charts/BloodOxCandleChart;", "A", "Lcom/heytap/health/core/widget/charts/BloodOxCandleChart;", "J0", "()Lcom/heytap/health/core/widget/charts/BloodOxCandleChart;", "Z1", "(Lcom/heytap/health/core/widget/charts/BloodOxCandleChart;)V", "candleChart", "Lcom/heytap/health/core/widget/charts/components/markerview/CommonMarkerView;", acl.KEY_B, "Lcom/heytap/health/core/widget/charts/components/markerview/CommonMarkerView;", "f1", "()Lcom/heytap/health/core/widget/charts/components/markerview/CommonMarkerView;", "j2", "(Lcom/heytap/health/core/widget/charts/components/markerview/CommonMarkerView;)V", "markerView", "Landroid/widget/LinearLayout;", "C", "Landroid/widget/LinearLayout;", "e1", "()Landroid/widget/LinearLayout;", "i2", "(Landroid/widget/LinearLayout;)V", "mLoadingLayout", "Lcom/heytap/health/core/operation/space/SpaceView;", "D", "Lcom/heytap/health/core/operation/space/SpaceView;", "spaceView", "Lcom/heytap/health/base/view/ScrollListenerView;", ExifInterface.LONGITUDE_EAST, "Lcom/heytap/health/base/view/ScrollListenerView;", "scrollView", "Lcom/heytap/health/bloodoxygen/view/Spo2WarningView;", UserInfo.SEX_FEMALE, "Lcom/heytap/health/bloodoxygen/view/Spo2WarningView;", "spo2WarningView", "Landroid/widget/TextView;", "G", "Landroid/widget/TextView;", "rangeValueLabelText", "H", "rangeValueText", "I", "rangeValueUnitText", "emptyValueText", "Landroid/widget/ImageView;", "K", "Landroid/widget/ImageView;", "lastDateBtn", "L", "nextDateBtn", "M", "dateText", "N", "Landroid/view/View;", "dateDownText", "Lcom/coui/appcompat/panel/COUIBottomSheetDialogFragment;", "O", "Lcom/coui/appcompat/panel/COUIBottomSheetDialogFragment;", "W0", "()Lcom/coui/appcompat/panel/COUIBottomSheetDialogFragment;", "setDialogFragment", "(Lcom/coui/appcompat/panel/COUIBottomSheetDialogFragment;)V", "dialogFragment", SecureGcmConstants.MESSAGE_KEY, "dataEndTime", "Q", "Ljava/util/List;", "dataCache", "R", "Lkotlin/Pair;", "O0", "()Lkotlin/Pair;", "setCurTimeRange", "(Lkotlin/Pair;)V", "curTimeRange", "S", "Q0", "setDateStr", "dateStr", "Lcom/heytap/health/health/family/FamilyMoreDataDetailConfigBean;", ExifInterface.GPS_DIRECTION_TRUE, "R6", "()Lcom/heytap/health/health/family/FamilyMoreDataDetailConfigBean;", "lazyGetFamilyConfig", "U", "Z0", "locationTime", "Landroidx/lifecycle/Observer;", "Lcom/oplus/aiunit/vision/oci;", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "g1", "()Landroidx/lifecycle/Observer;", "spo2WarningObserver", "Lcom/heytap/health/bloodoxygen/ui/CalendarPanelFragment;", "H0", "()Lcom/heytap/health/bloodoxygen/ui/CalendarPanelFragment;", "calendarFragment", "V0", "defaultStartTime", "R0", "defaultEndTime", "<init>", "()V", "Companion", "a", "Lcom/heytap/health/bloodoxygen/viewmodel/BloodOxygenStoreViewModel;", "storeViewModel", "Lcom/heytap/health/bloodoxygen/viewmodel/BloodOxygenSpaceViewModel;", "spaceViewModel", "blood_oxygen_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBloodOxygenHistoryBaseFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BloodOxygenHistoryBaseFragment.kt\ncom/heytap/health/bloodoxygen/ui/BloodOxygenHistoryBaseFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,738:1\n172#2,9:739\n172#2,9:750\n1855#3,2:748\n1855#3,2:759\n*S KotlinDebug\n*F\n+ 1 BloodOxygenHistoryBaseFragment.kt\ncom/heytap/health/bloodoxygen/ui/BloodOxygenHistoryBaseFragment\n*L\n258#1:739,9\n652#1:750,9\n334#1:748,2\n661#1:759,2\n*E\n"})
public abstract class BloodOxygenHistoryBaseFragment extends BaseFragment implements ir9, zs9 {
    public static final int CHART_TIME_UNIT_MONTH = 1;
    public static final int CHART_TIME_UNIT_WEEK = 0;
    public static final int CHART_TIME_UNIT_YEAR = 2;

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    public BloodOxCandleChart candleChart;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @Nullable
    public CommonMarkerView markerView;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @Nullable
    public LinearLayout mLoadingLayout;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @Nullable
    public SpaceView spaceView;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    @Nullable
    public ScrollListenerView scrollView;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    @Nullable
    public Spo2WarningView spo2WarningView;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    @Nullable
    public TextView rangeValueLabelText;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    @Nullable
    public TextView rangeValueText;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    @Nullable
    public TextView rangeValueUnitText;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    @Nullable
    public TextView emptyValueText;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    @Nullable
    public ImageView lastDateBtn;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    @Nullable
    public ImageView nextDateBtn;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    @Nullable
    public TextView dateText;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    @Nullable
    public View dateDownText;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    @Nullable
    public COUIBottomSheetDialogFragment dialogFragment;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    @Nullable
    public List<? extends BloodOxygenSaturationDataStat> dataCache;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @Nullable
    public Long earliestDataTime;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    public long chartEndTime;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    public long lastStartTime;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    public long lastEndTime;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    public boolean emptyData;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    public boolean isInAnimation;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    public boolean isViewInit;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    public boolean isSelected;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    public boolean isResume;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    public String TAG = "BloodOxygenHistoryBaseFragment";

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public long chartStartTime = com.heytap.health.bloodoxygen.util.a.INSTANCE.d();

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    @NotNull
    public final Lazy viewModel = LazyKt__LazyJVMKt.lazy(new Function0<BloodOxygenViewModel>() { // from class: com.heytap.health.bloodoxygen.ui.BloodOxygenHistoryBaseFragment$viewModel$2
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

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public long dataEndTime = System.currentTimeMillis();

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    @NotNull
    public Pair<Long, Long> curTimeRange = new Pair<>(0L, 0L);

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    @NotNull
    public String dateStr = "";

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    @NotNull
    public final Lazy lazyGetFamilyConfig = LazyKt__LazyJVMKt.lazy(new Function0<FamilyMoreDataDetailConfigBean>() { // from class: com.heytap.health.bloodoxygen.ui.BloodOxygenHistoryBaseFragment$lazyGetFamilyConfig$2
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

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    @NotNull
    public final Lazy locationTime = LazyKt__LazyJVMKt.lazy(new Function0<Long>() { // from class: com.heytap.health.bloodoxygen.ui.BloodOxygenHistoryBaseFragment$locationTime$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final Long invoke() {
            BloodOxygenHistoryBaseFragment bloodOxygenHistoryBaseFragment = this.this$0;
            return Long.valueOf(bloodOxygenHistoryBaseFragment.d1(bloodOxygenHistoryBaseFragment.getArguments()));
        }
    });

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    @NotNull
    public final Lazy spo2WarningObserver = LazyKt__LazyJVMKt.lazy(new BloodOxygenHistoryBaseFragment$spo2WarningObserver$2(this));

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"com/heytap/health/bloodoxygen/ui/BloodOxygenHistoryBaseFragment$b", "Lcom/oplus/aiunit/vision/k7h;", "Lcom/heytap/health/core/widget/charts/data/ChartScrollState;", "state", "", "a", "blood_oxygen_release"}, k = 1, mv = {1, 8, 0})
    public static final class b extends k7h {
        public b() {
        }

        @Override // com.oplus.aiunit.vision.k7h
        public void a(@NotNull ChartScrollState state) {
            Intrinsics.checkNotNullParameter(state, "state");
            BloodOxygenHistoryBaseFragment.this.P1(state);
            BloodOxygenHistoryBaseFragment.this.r2();
        }
    }

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016¨\u0006\t"}, d2 = {"com/heytap/health/bloodoxygen/ui/BloodOxygenHistoryBaseFragment$c", "Lcom/github/mikephil/charting/listener/OnChartValueSelectedListener;", "Lcom/github/mikephil/charting/data/Entry;", MapSchema.FIELD_NAME_ENTRY, "Lcom/github/mikephil/charting/highlight/Highlight;", c7n.g, "", "onValueSelected", "onNothingSelected", "blood_oxygen_release"}, k = 1, mv = {1, 8, 0})
    public static final class c implements OnChartValueSelectedListener {
        public c() {
        }

        @Override // com.github.mikephil.charting.listener.OnChartValueSelectedListener
        public void onNothingSelected() {
            BloodOxygenHistoryBaseFragment.this.J0().setSelectedIndex(-1);
            BloodOxygenHistoryBaseFragment.this.r2();
        }

        @Override // com.github.mikephil.charting.listener.OnChartValueSelectedListener
        public void onValueSelected(@Nullable Entry e2, @Nullable Highlight h) {
            ar0.a(BloodOxygenHistoryBaseFragment.this.getTAG(), "entry=" + e2 + " ; dataIndex=" + (h != null ? Integer.valueOf(h.getDataIndex()) : null) + " Highlight=" + h + " ");
            BloodOxygenHistoryBaseFragment.this.J0().setSelectedIndex(MathKt__MathJVMKt.roundToInt(e2 != null ? e2.getX() : -1.0f));
            BloodOxygenHistoryBaseFragment.this.r2();
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class d implements Observer, FunctionAdapter {
        public final /* synthetic */ Function1 i;

        public d(Function1 function) {
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

    public static final void A1(BloodOxygenHistoryBaseFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.isInAnimation) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this$0), null, null, new BloodOxygenHistoryBaseFragment$initMonitor$4$1(this$0, null), 3, null);
    }

    public static final BloodOxygenSpaceViewModel C1(Lazy<? extends BloodOxygenSpaceViewModel> lazy) {
        return lazy.getValue();
    }

    public static final String t1(int i, double d2) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format(Locale.getDefault(), "%.0f", Arrays.copyOf(new Object[]{Double.valueOf(d2)}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    public static final BloodOxygenStoreViewModel u1(Lazy<BloodOxygenStoreViewModel> lazy) {
        return lazy.getValue();
    }

    public static final void x1(BloodOxygenHistoryBaseFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.l2();
    }

    public static final void y1(BloodOxygenHistoryBaseFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.l2();
    }

    public static final void z1(BloodOxygenHistoryBaseFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.isInAnimation) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this$0), null, null, new BloodOxygenHistoryBaseFragment$initMonitor$3$1(this$0, null), 3, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object A0(final boolean z, Continuation<? super Unit> continuation) {
        BloodOxygenHistoryBaseFragment$changePager$1 bloodOxygenHistoryBaseFragment$changePager$1;
        if (continuation instanceof BloodOxygenHistoryBaseFragment$changePager$1) {
            bloodOxygenHistoryBaseFragment$changePager$1 = (BloodOxygenHistoryBaseFragment$changePager$1) continuation;
            int i = bloodOxygenHistoryBaseFragment$changePager$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                bloodOxygenHistoryBaseFragment$changePager$1.label = i - Integer.MIN_VALUE;
            } else {
                bloodOxygenHistoryBaseFragment$changePager$1 = new BloodOxygenHistoryBaseFragment$changePager$1(this, continuation);
            }
        } else {
            bloodOxygenHistoryBaseFragment$changePager$1 = new BloodOxygenHistoryBaseFragment$changePager$1(this, continuation);
        }
        Object obj = bloodOxygenHistoryBaseFragment$changePager$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = bloodOxygenHistoryBaseFragment$changePager$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            double lowestVisibleValueX = J0().getLowestVisibleValueX();
            Pair<Integer, Integer> pairK0 = K0();
            int iIntValue = pairK0.component1().intValue();
            int iIntValue2 = pairK0.component2().intValue();
            if (z) {
                iIntValue = iIntValue2;
            }
            ar0.a(this.TAG, "changePager visibleStartValue=" + lowestVisibleValueX + "; offset=" + iIntValue + "; ");
            double d2 = lowestVisibleValueX + ((double) iIntValue);
            J0().I(d2, 0.0f, YAxis.AxisDependency.LEFT);
            F0((float) (d2 - J0().getXAxisOffset()));
            bloodOxygenHistoryBaseFragment$changePager$1.L$0 = this;
            bloodOxygenHistoryBaseFragment$changePager$1.Z$0 = z;
            bloodOxygenHistoryBaseFragment$changePager$1.label = 1;
            if (DelayKt.delay(50L, bloodOxygenHistoryBaseFragment$changePager$1) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z = bloodOxygenHistoryBaseFragment$changePager$1.Z$0;
            this = (BloodOxygenHistoryBaseFragment) bloodOxygenHistoryBaseFragment$changePager$1.L$0;
            ResultKt.throwOnFailure(obj);
        }
        this.P1(null);
        this.J0().highlightValue((Highlight) null, true);
        this.p2(new Function0<Unit>() { // from class: com.heytap.health.bloodoxygen.ui.BloodOxygenHistoryBaseFragment$changePager$2
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
                BOTrackUtil bOTrackUtilA = BOTrackUtil.Companion.a();
                boolean z2 = !z;
                TextView textView = this.dateText;
                bOTrackUtilA.h(z2, String.valueOf(textView != null ? textView.getText() : null));
            }
        });
        return Unit.INSTANCE;
    }

    public abstract int B0();

    public final void B1() {
        final Function0 function0 = null;
        C1(FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(BloodOxygenSpaceViewModel.class), new Function0<ViewModelStore>() { // from class: com.heytap.health.bloodoxygen.ui.BloodOxygenHistoryBaseFragment$initSpace$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.heytap.health.bloodoxygen.ui.BloodOxygenHistoryBaseFragment$initSpace$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.heytap.health.bloodoxygen.ui.BloodOxygenHistoryBaseFragment$initSpace$$inlined$activityViewModels$default$3
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
        })).w().observe(requireActivity(), new d(new Function1<Map<String, ? extends List<? extends SpaceInfo>>, Unit>() { // from class: com.heytap.health.bloodoxygen.ui.BloodOxygenHistoryBaseFragment$initSpace$1
            {
                super(1);
            }

            @Override // p010kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Map<String, ? extends List<? extends SpaceInfo>> map) {
                invoke2(map);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Map<String, ? extends List<? extends SpaceInfo>> spaceData) {
                Intrinsics.checkNotNullParameter(spaceData, "spaceData");
                SpaceView spaceView = this.this$0.spaceView;
                Intrinsics.checkNotNull(spaceView);
                spaceView.setData(spaceData);
            }
        }));
    }

    public final void F0(float startX) {
        int labelCount = J0().getXAxis().getLabelCount();
        ar0.a(this.TAG, "doChartAnimation() startX=" + startX + " xcount=" + labelCount);
        J0().d(Float.valueOf(startX), Float.valueOf(startX + ((float) labelCount)));
    }

    public final void G0(Pair<Long, Long> timeRange) {
        n1().B(timeRange.getFirst().longValue(), timeRange.getSecond().longValue(), B0(), 10).observe(this, g1());
    }

    /* JADX INFO: renamed from: G1, reason: from getter */
    public final boolean getIsResume() {
        return this.isResume;
    }

    public final CalendarPanelFragment H0() {
        return new CalendarPanelFragment(P0(), null, new Function1<LocalDate, Unit>() { // from class: com.heytap.health.bloodoxygen.ui.BloodOxygenHistoryBaseFragment$calendarFragment$1
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
                ar0.a(this.this$0.getTAG(), "onClickDate date=" + date);
                this.this$0.R1(date);
                COUIBottomSheetDialogFragment dialogFragment = this.this$0.getDialogFragment();
                if (dialogFragment != null) {
                    dialogFragment.dismiss();
                }
            }
        }, 2, null);
    }

    @NotNull
    public final BloodOxCandleChart J0() {
        BloodOxCandleChart bloodOxCandleChart = this.candleChart;
        if (bloodOxCandleChart != null) {
            return bloodOxCandleChart;
        }
        Intrinsics.throwUninitializedPropertyAccessException("candleChart");
        return null;
    }

    /* JADX INFO: renamed from: J1, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    @NotNull
    public abstract Pair<Integer, Integer> K0();

    public final void K1(long startTime, long endTime) {
        n1().M(startTime, endTime, B0() == 2 ? 6 : 4).observe(this, new d(new Function1<List<? extends BloodOxygenSaturationDataStat>, Unit>() { // from class: com.heytap.health.bloodoxygen.ui.BloodOxygenHistoryBaseFragment$loadChartData$1
            {
                super(1);
            }

            @Override // p010kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(List<? extends BloodOxygenSaturationDataStat> list) {
                invoke2(list);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@Nullable List<? extends BloodOxygenSaturationDataStat> list) {
                BloodOxygenSaturationDataStat bloodOxygenSaturationDataStat;
                this.this$0.dataCache = list;
                if (list != null && (bloodOxygenSaturationDataStat = (BloodOxygenSaturationDataStat) CollectionsKt___CollectionsKt.getOrNull(list, 0)) != null) {
                    BloodOxygenHistoryBaseFragment bloodOxygenHistoryBaseFragment = this.this$0;
                    bloodOxygenHistoryBaseFragment.earliestDataTime = Long.valueOf(o15.a(bloodOxygenSaturationDataStat.getDate()));
                    Long l2 = bloodOxygenHistoryBaseFragment.earliestDataTime;
                    Intrinsics.checkNotNull(l2);
                    bloodOxygenHistoryBaseFragment.b2(bloodOxygenHistoryBaseFragment.j1(l2.longValue()));
                }
                BloodOxygenHistoryBaseFragment bloodOxygenHistoryBaseFragment2 = this.this$0;
                bloodOxygenHistoryBaseFragment2.s2(bloodOxygenHistoryBaseFragment2.V0(), this.this$0.R0());
                ar0.c(this.this$0.getTAG(), "loadChartData: isShowed=" + this.this$0.getIsSelected());
                if (this.this$0.getIsSelected() || this.this$0.getIsResume()) {
                    this.this$0.N1(list);
                    this.this$0.z0();
                }
            }
        }));
    }

    /* JADX INFO: renamed from: L0, reason: from getter */
    public final long getChartEndTime() {
        return this.chartEndTime;
    }

    @NotNull
    public abstract LocalDate M0();

    public final void M1(long visibleStartTime, long visibleEndTime) {
        ar0.a(this.TAG, "loadStatData() visibleStartTime=" + visibleStartTime + " ");
        List<? extends BloodOxygenSaturationDataStat> list = this.dataCache;
        if (list == null || list.isEmpty()) {
            n1().M(visibleStartTime, visibleEndTime, 8).observe(this, new d(new Function1<List<? extends BloodOxygenSaturationDataStat>, Unit>() { // from class: com.heytap.health.bloodoxygen.ui.BloodOxygenHistoryBaseFragment$loadStatData$2
                {
                    super(1);
                }

                @Override // p010kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(List<? extends BloodOxygenSaturationDataStat> list2) {
                    invoke2(list2);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@Nullable List<? extends BloodOxygenSaturationDataStat> list2) {
                    this.this$0.W1(list2);
                }
            }));
            return;
        }
        List<? extends BloodOxygenSaturationDataStat> list2 = this.dataCache;
        Intrinsics.checkNotNull(list2);
        int iMin = 101;
        int iMax = -1;
        for (BloodOxygenSaturationDataStat bloodOxygenSaturationDataStat : list2) {
            long jA = o15.a(bloodOxygenSaturationDataStat.getDate());
            if (visibleStartTime <= jA && jA <= visibleEndTime) {
                iMin = Math.min(bloodOxygenSaturationDataStat.getMinBloodOxygenSaturation(), iMin);
                iMax = Math.max(bloodOxygenSaturationDataStat.getMaxBloodOxygenSaturation(), iMax);
            }
        }
        if (iMin > 100 || iMax <= 0) {
            q2("");
        } else {
            q2(iMin + Constants.ACCEPT_TIME_SEPARATOR_SERVER + iMax);
        }
        ar0.a(this.TAG, "loadStatData() dateCache = min=" + iMin + " max=" + iMax + " ");
    }

    /* JADX INFO: renamed from: N0, reason: from getter */
    public final long getChartStartTime() {
        return this.chartStartTime;
    }

    public abstract void N1(@Nullable List<? extends BloodOxygenSaturationDataStat> dataList);

    @NotNull
    public final Pair<Long, Long> O0() {
        return this.curTimeRange;
    }

    @NotNull
    public String P0() {
        return ir9.a.a(this);
    }

    public abstract void P1(@Nullable ChartScrollState state);

    @NotNull
    /* JADX INFO: renamed from: Q0, reason: from getter */
    public final String getDateStr() {
        return this.dateStr;
    }

    public final long R0() {
        return i1(V0());
    }

    public final void R1(LocalDate date) {
        this.lastStartTime = 0L;
        this.lastEndTime = 0L;
        com.heytap.health.bloodoxygen.util.a.Companion companion = com.heytap.health.bloodoxygen.util.a.INSTANCE;
        long jMax = Math.max(companion.g(date), this.chartStartTime);
        long jJ1 = j1(jMax);
        long jI1 = i1(jMax);
        double year = B0() == 2 ? (date.with(TemporalAdjusters.firstDayOfYear()).getYear() - companion.e(this.chartStartTime).getYear()) * 12 : J0().getXAxisTimeUnit().timeStampToUnitDouble(jJ1);
        double dTimeStampToUnitDouble = J0().getXAxisTimeUnit().timeStampToUnitDouble(jMax) - J0().getXAxisOffset();
        J0().highlightValue((Highlight) null, true);
        float f = 2;
        J0().I(year - ((double) (J0().getBarWidth() / f)), 0.0f, YAxis.AxisDependency.LEFT);
        J0().setYAxisLabel(o1(jJ1, jI1));
        F0((float) ((year - ((double) (J0().getBarWidth() / f))) - J0().getXAxisOffset()));
        ar0.a(this.TAG, "onDateSelect date=" + date + "; visibleStartTime=" + companion.e(jJ1) + " startOffset=" + year + "; selectOffset=" + dTimeStampToUnitDouble + "; xStart=" + J0().getXAxisOffset());
        M1(jJ1, jI1);
        s2(jJ1, jI1);
    }

    @Override // com.oplus.aiunit.vision.ir9
    @Nullable
    public FamilyMoreDataDetailConfigBean R6() {
        return (FamilyMoreDataDetailConfigBean) this.lazyGetFamilyConfig.getValue();
    }

    public final long V0() {
        return Z0() > 0 ? Z0() : j1(this.dataEndTime);
    }

    public final void V1(boolean isSelect) {
        List<? extends BloodOxygenSaturationDataStat> list;
        if (this.isViewInit) {
            if (!isSelect) {
                X1();
                J0().highlightValue((Highlight) null, true);
                return;
            }
            p2(new Function0<Unit>() { // from class: com.heytap.health.bloodoxygen.ui.BloodOxygenHistoryBaseFragment$onFragmentSelected$1
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
                    BOTrackUtil bOTrackUtilA = BOTrackUtil.Companion.a();
                    int iB0 = this.this$0.B0();
                    Spo2WarningView spo2WarningView = this.this$0.spo2WarningView;
                    boolean z = false;
                    if (spo2WarningView != null && spo2WarningView.getIsSupportSpo2Warning()) {
                        z = true;
                    }
                    bOTrackUtilA.n(iB0, z);
                }
            });
            if (!this.isSelected && (list = this.dataCache) != null) {
                N1(list);
            }
            this.isSelected = true;
            z0();
        }
    }

    @Nullable
    /* JADX INFO: renamed from: W0, reason: from getter */
    public final COUIBottomSheetDialogFragment getDialogFragment() {
        return this.dialogFragment;
    }

    public final void W1(List<? extends BloodOxygenSaturationDataStat> statData) {
        if (statData == null || !(!statData.isEmpty())) {
            q2("");
            return;
        }
        BloodOxygenSaturationDataStat bloodOxygenSaturationDataStat = statData.get(0);
        bloodOxygenSaturationDataStat.getAverageBloodOxygenSaturation();
        q2(bloodOxygenSaturationDataStat.getMinBloodOxygenSaturation() + Constants.ACCEPT_TIME_SEPARATOR_SERVER + bloodOxygenSaturationDataStat.getMaxBloodOxygenSaturation());
    }

    /* JADX INFO: renamed from: X0, reason: from getter */
    public final long getLastEndTime() {
        return this.lastEndTime;
    }

    public final void X1() {
        if (!(J0().getAnimator() instanceof CustomChartAnimator)) {
            J0().getAnimator().setPhaseY(0.0f);
            return;
        }
        ChartAnimator animator = J0().getAnimator();
        Intrinsics.checkNotNull(animator, "null cannot be cast to non-null type com.heytap.health.core.widget.charts.animator.CustomChartAnimator");
        ((CustomChartAnimator) animator).resetChartYAxisToZeroState();
    }

    /* JADX INFO: renamed from: Y0, reason: from getter */
    public final long getLastStartTime() {
        return this.lastStartTime;
    }

    public long Z0() {
        return ((Number) this.locationTime.getValue()).longValue();
    }

    public final void Z1(@NotNull BloodOxCandleChart bloodOxCandleChart) {
        Intrinsics.checkNotNullParameter(bloodOxCandleChart, "<set-?>");
        this.candleChart = bloodOxCandleChart;
    }

    public final void b2(long j2) {
        this.chartStartTime = j2;
    }

    public long d1(@Nullable Bundle bundle) {
        return zs9.a.a(this, bundle);
    }

    public final void d2(long defaultTime) {
        long jH;
        ar0.c(this.TAG, "prepareFetchData: " + defaultTime);
        if (defaultTime == Long.MIN_VALUE) {
            com.heytap.health.bloodoxygen.util.a.Companion companion = com.heytap.health.bloodoxygen.util.a.INSTANCE;
            LocalDateTime localDateTimeOf = LocalDateTime.of(LocalDate.now(), LocalTime.MAX);
            Intrinsics.checkNotNullExpressionValue(localDateTimeOf, "of(LocalDate.now(), LocalTime.MAX)");
            jH = companion.h(localDateTimeOf);
        } else {
            LocalDateTime localDateTimeOfInstant = LocalDateTime.ofInstant(Instant.ofEpochMilli(defaultTime), ZoneId.systemDefault());
            com.heytap.health.bloodoxygen.util.a.Companion companion2 = com.heytap.health.bloodoxygen.util.a.INSTANCE;
            LocalDateTime localDateTimeOf2 = LocalDateTime.of(localDateTimeOfInstant.toLocalDate(), LocalTime.MAX);
            Intrinsics.checkNotNullExpressionValue(localDateTimeOf2, "of(lastTimeLocal.toLocalDate(), LocalTime.MAX)");
            jH = companion2.h(localDateTimeOf2);
        }
        this.dataEndTime = jH;
        this.chartEndTime = i1(System.currentTimeMillis());
        ar0.c(this.TAG, "initLastDataTime: defaultStartTime" + V0() + "; endTime=" + this.chartEndTime + "; ");
    }

    @Nullable
    /* JADX INFO: renamed from: e1, reason: from getter */
    public LinearLayout getMLoadingLayout() {
        return this.mLoadingLayout;
    }

    public final void e2(boolean z) {
        this.emptyData = z;
    }

    @Nullable
    /* JADX INFO: renamed from: f1, reason: from getter */
    public CommonMarkerView getMarkerView() {
        return this.markerView;
    }

    public final void f2(boolean z) {
        this.isInAnimation = z;
    }

    public final Observer<Spo2WarnBean> g1() {
        return (Observer) this.spo2WarningObserver.getValue();
    }

    public final void g2(long j2) {
        this.lastEndTime = j2;
    }

    @Override // com.heytap.health.base.base.BaseFragment
    public int getLayoutId() {
        return R$layout.health_blood_oxygen_fragment_history_base;
    }

    public final void h2(long j2) {
        this.lastStartTime = j2;
    }

    public abstract long i1(long time);

    public void i2(@Nullable LinearLayout linearLayout) {
        this.mLoadingLayout = linearLayout;
    }

    public final void initArguments() {
        n1().N(P0());
    }

    @Override // com.heytap.health.base.base.BaseFragment
    public void initData() {
        if (Z0() > 0) {
            d2(Z0());
            o2();
        } else {
            final Function0 function0 = null;
            Lazy lazyCreateViewModelLazy = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(BloodOxygenStoreViewModel.class), new Function0<ViewModelStore>() { // from class: com.heytap.health.bloodoxygen.ui.BloodOxygenHistoryBaseFragment$initData$$inlined$activityViewModels$default$1
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
            }, new Function0<CreationExtras>() { // from class: com.heytap.health.bloodoxygen.ui.BloodOxygenHistoryBaseFragment$initData$$inlined$activityViewModels$default$2
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
            }, new Function0<ViewModelProvider.Factory>() { // from class: com.heytap.health.bloodoxygen.ui.BloodOxygenHistoryBaseFragment$initData$$inlined$activityViewModels$default$3
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
            u1(lazyCreateViewModelLazy).x(DataModel.LAST);
            u1(lazyCreateViewModelLazy).w().observe(this, new d(new Function1<Long, Unit>() { // from class: com.heytap.health.bloodoxygen.ui.BloodOxygenHistoryBaseFragment.initData.1
                {
                    super(1);
                }

                @Override // p010kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Long l2) {
                    invoke2(l2);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Long lastDataTime) {
                    BloodOxygenHistoryBaseFragment bloodOxygenHistoryBaseFragment = BloodOxygenHistoryBaseFragment.this;
                    Intrinsics.checkNotNullExpressionValue(lastDataTime, "lastDataTime");
                    bloodOxygenHistoryBaseFragment.d2(lastDataTime.longValue());
                    BloodOxygenHistoryBaseFragment.this.o2();
                }
            }));
        }
        p2(new Function0<Unit>() { // from class: com.heytap.health.bloodoxygen.ui.BloodOxygenHistoryBaseFragment.initData.2
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
                BloodOxygenHistoryBaseFragment.this.B1();
                fz6 fz6Var = new fz6();
                fz6Var.j(308);
                fz6Var.c(BloodOxygenHistoryBaseFragment.this.scrollView, BloodOxygenHistoryBaseFragment.this.spaceView);
            }
        });
    }

    @Override // com.heytap.health.base.base.BaseFragment
    public void initView(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        initArguments();
        i2((LinearLayout) view.findViewById(R$id.rank_loading_layout));
        View viewFindViewById = view.findViewById(R$id.view_blood_oxygen_candle_chart);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "view.findViewById(R.id.v…lood_oxygen_candle_chart)");
        Z1((BloodOxCandleChart) viewFindViewById);
        int i = R$id.spo2_warning_view;
        this.spo2WarningView = (Spo2WarningView) view.findViewById(i);
        this.scrollView = (ScrollListenerView) view.findViewById(R$id.scrollview);
        this.rangeValueLabelText = (TextView) view.findViewById(R$id.tv_range_label);
        this.rangeValueText = (TextView) view.findViewById(R$id.tv_range_value);
        this.rangeValueUnitText = (TextView) view.findViewById(R$id.tv_range_value_unit);
        this.emptyValueText = (TextView) view.findViewById(R$id.tv_empty_value);
        int i2 = R$id.space_blood;
        this.spaceView = (SpaceView) W(i2);
        this.dateText = (TextView) view.findViewById(R$id.tv_title_date);
        this.dateDownText = view.findViewById(R$id.iv_down);
        this.lastDateBtn = (ImageView) view.findViewById(R$id.iv_last);
        this.nextDateBtn = (ImageView) view.findViewById(R$id.iv_next);
        this.isViewInit = true;
        w4l.d(this, view.findViewById(R$id.top_view));
        w4l.d(this, view.findViewById(R$id.cl_chart));
        w4l.d(this, view.findViewById(i));
        w4l.d(this, view.findViewById(i2));
        v1();
        p1();
    }

    public abstract long j1(long time);

    public void j2(@Nullable CommonMarkerView commonMarkerView) {
        this.markerView = commonMarkerView;
    }

    public final void k2(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.TAG = str;
    }

    public final void l2() {
        FragmentManager supportFragmentManager;
        List<Fragment> fragments;
        boolean z;
        FragmentActivity activity = getActivity();
        if (activity == null || (supportFragmentManager = activity.getSupportFragmentManager()) == null || (fragments = supportFragmentManager.getFragments()) == null) {
            return;
        }
        for (Fragment fragment : fragments) {
            int iB0 = B0();
            if (iB0 == 0) {
                z = fragment instanceof BloodOxygenWeekFragment;
            } else if (iB0 != 1) {
                z = iB0 != 2 ? false : fragment instanceof BloodOxygenYearFragment;
            } else {
                z = fragment instanceof BloodOxygenMonthFragment;
            }
            if (z) {
                COUIBottomSheetDialogFragment cOUIBottomSheetDialogFragment = this.dialogFragment;
                if (cOUIBottomSheetDialogFragment != null) {
                    cOUIBottomSheetDialogFragment.dismiss();
                }
                COUIBottomSheetDialogFragment cOUIBottomSheetDialogFragment2 = new COUIBottomSheetDialogFragment();
                this.dialogFragment = cOUIBottomSheetDialogFragment2;
                Intrinsics.checkNotNull(fragment, "null cannot be cast to non-null type com.heytap.health.bloodoxygen.ui.BloodOxygenHistoryBaseFragment");
                CalendarPanelFragment calendarPanelFragmentH0 = ((BloodOxygenHistoryBaseFragment) fragment).H0();
                com.heytap.health.bloodoxygen.util.a.Companion companion = com.heytap.health.bloodoxygen.util.a.INSTANCE;
                long jG = companion.g(M0());
                Long l2 = this.earliestDataTime;
                calendarPanelFragmentH0.setSelectDate(companion.e(Math.max(jG, l2 != null ? l2.longValue() : jG)));
                cOUIBottomSheetDialogFragment2.setMainPanelFragment(calendarPanelFragmentH0);
                FragmentActivity activity2 = getActivity();
                if (activity2 != null) {
                    p2(new Function0<Unit>() { // from class: com.heytap.health.bloodoxygen.ui.BloodOxygenHistoryBaseFragment$showCalendarFrag$1$2$1
                        @Override // p010kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            BOTrackUtil.Companion.a().k();
                        }
                    });
                    COUIBottomSheetDialogFragment cOUIBottomSheetDialogFragment3 = this.dialogFragment;
                    if (cOUIBottomSheetDialogFragment3 != null) {
                        cOUIBottomSheetDialogFragment3.show(activity2.getSupportFragmentManager(), "calendarPanelfragment");
                        return;
                    }
                    return;
                }
                return;
            }
        }
    }

    @NotNull
    /* JADX INFO: renamed from: m1, reason: from getter */
    public final String getTAG() {
        return this.TAG;
    }

    @NotNull
    public final BloodOxygenViewModel n1() {
        return (BloodOxygenViewModel) this.viewModel.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0093  */
    /* JADX WARN: Multi-variable type inference failed */
    public final float o1(long startTime, long endTime) {
        List<T> dataSets;
        ICandleDataSet iCandleDataSet;
        if (J0().getData() == 0 || (dataSets = ((CandleData) J0().getData()).getDataSets()) == 0 || dataSets.size() == 0 || (iCandleDataSet = (ICandleDataSet) dataSets.get(0)) == null || iCandleDataSet.getEntryCount() == 0) {
            return 0.0f;
        }
        Object data = ((CandleEntry) iCandleDataSet.getEntryForIndex(0)).getData();
        if ((data instanceof f59 ? (f59) data : null) == null) {
            return 0.0f;
        }
        int entryCount = iCandleDataSet.getEntryCount();
        float f = 0.0f;
        for (int i = 0; i < entryCount; i++) {
            Object data2 = ((CandleEntry) iCandleDataSet.getEntryForIndex(i)).getData();
            Intrinsics.checkNotNull(data2, "null cannot be cast to non-null type com.heytap.health.core.widget.charts.data.HeartRateData");
            f59 f59Var = (f59) data2;
            long jC = f59Var.c();
            if ((startTime <= jC && jC <= endTime) && (f59Var.b() != 0 || f59Var.a() != 0)) {
                float fB = f59Var.b();
                if (fB < f) {
                    f = fB;
                } else if (f == 0.0f) {
                    f = fB;
                }
            }
        }
        return f;
    }

    public final void o2() {
        K1(this.chartStartTime, this.chartEndTime);
        M1(V0(), R0());
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        ar0.a(this.TAG, "onResume()");
        this.isResume = true;
    }

    public final void p1() {
        J0().i(this);
        J0().setShowYAxisStartLine(true);
        J0().setYAxisValueFormatter(new xp0() { // from class: com.oplus.aiunit.vision.dm1
            @Override // com.oplus.aiunit.vision.xp0
            public final String a(int i, double d2) {
                return BloodOxygenHistoryBaseFragment.t1(i, d2);
            }
        });
        J0().setTopOffset(78.0f);
        J0().setOnChartGestureListener(new b());
        J0().setOnTouchListener((ChartTouchListener) new BloodOxygenChartTouchListener(this, J0(), J0().getViewPortHandler().getMatrixTouch(), 3.0f, B0()));
        J0().setOnChartValueSelectedListener(new c());
        X1();
    }

    public void p2(@NotNull Function0<Unit> function0) {
        ir9.a.d(this, function0);
    }

    public final void q2(String spo2RangeStr) {
        if (TextUtils.isEmpty(spo2RangeStr)) {
            TextView textView = this.emptyValueText;
            if (textView != null) {
                textView.setVisibility(0);
            }
            TextView textView2 = this.rangeValueText;
            if (textView2 != null) {
                textView2.setVisibility(8);
            }
            TextView textView3 = this.rangeValueUnitText;
            if (textView3 == null) {
                return;
            }
            textView3.setVisibility(8);
            return;
        }
        TextView textView4 = this.emptyValueText;
        if (textView4 != null) {
            textView4.setVisibility(8);
        }
        TextView textView5 = this.rangeValueText;
        if (textView5 != null) {
            textView5.setVisibility(0);
        }
        TextView textView6 = this.rangeValueText;
        if (textView6 != null) {
            textView6.setText(spo2RangeStr);
        }
        TextView textView7 = this.rangeValueUnitText;
        if (textView7 == null) {
            return;
        }
        textView7.setVisibility(0);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0075  */
    public void r2() {
        boolean z;
        float fCeil = (float) Math.ceil(J0().getLowestVisibleX());
        float fFloor = (float) Math.floor(J0().getHighestVisibleX());
        double xAxisOffset = J0().getXAxisOffset();
        int selectedIndex = J0().getSelectedIndex();
        ar0.a(this.TAG, "updateRangeValueVisible() xStart=" + xAxisOffset + " low=" + fCeil + "; high=" + fFloor + "; selectedIndex=" + J0().getSelectedIndex() + " ");
        if (selectedIndex >= 0) {
            float f = selectedIndex;
            if (f < fCeil || f > fFloor) {
                z = false;
            } else {
                z = true;
            }
        } else {
            z = false;
        }
        TextView textView = this.rangeValueUnitText;
        Float fValueOf = textView != null ? Float.valueOf(textView.getAlpha()) : null;
        float f2 = z ? 0.0f : 1.0f;
        if (Intrinsics.areEqual(fValueOf, f2)) {
            return;
        }
        TextView textView2 = this.rangeValueUnitText;
        if (textView2 != null) {
            textView2.setAlpha(f2);
        }
        TextView textView3 = this.rangeValueText;
        if (textView3 != null) {
            textView3.setAlpha(f2);
        }
        TextView textView4 = this.rangeValueLabelText;
        if (textView4 != null) {
            textView4.setAlpha(f2);
        }
        TextView textView5 = this.emptyValueText;
        if (textView5 == null) {
            return;
        }
        textView5.setAlpha(f2);
    }

    public final void s2(long visibleStartTime, long visibleEndTime) {
        String strG;
        com.heytap.health.bloodoxygen.util.a.Companion companion = com.heytap.health.bloodoxygen.util.a.INSTANCE;
        LocalDate localDateE = companion.e(visibleStartTime);
        LocalDate localDateE2 = companion.e(visibleEndTime);
        ar0.a(this.TAG, "updateTimeRangeText() startDate=" + localDateE + "; endDate=" + localDateE2 + " ");
        LocalDate localDateE3 = companion.e(this.chartStartTime);
        LocalDate localDateE4 = companion.e(this.chartEndTime);
        ar0.c(this.TAG, "timeRange currentStart=" + localDateE + "; boDataStart=" + localDateE3 + " ");
        ar0.c(this.TAG, "timeRange currentEnd=" + localDateE2 + "; boDataEnd=" + localDateE4);
        if (B0() == 2) {
            ImageView imageView = this.lastDateBtn;
            if (imageView != null) {
                imageView.setVisibility((localDateE.getYear() == localDateE3.getYear() && localDateE.getMonthValue() == 1) ? 4 : 0);
            }
            ImageView imageView2 = this.nextDateBtn;
            if (imageView2 != null) {
                imageView2.setVisibility((localDateE2.getYear() == localDateE4.getYear() && localDateE2.getMonthValue() == 12) ? 4 : 0);
            }
        } else {
            ImageView imageView3 = this.lastDateBtn;
            if (imageView3 != null) {
                imageView3.setVisibility((localDateE.getYear() == localDateE3.getYear() && localDateE.getDayOfYear() == localDateE3.getDayOfYear()) ? 4 : 0);
            }
            ImageView imageView4 = this.nextDateBtn;
            if (imageView4 != null) {
                imageView4.setVisibility((localDateE2.getYear() == localDateE4.getYear() && localDateE2.getDayOfYear() == localDateE4.getDayOfYear()) ? 4 : 0);
            }
        }
        boolean z = companion.a().getYear() == localDateE.getYear();
        int iB0 = B0();
        if (iB0 == 1) {
            if (M0().getDayOfMonth() == 1 || localDateE.getDayOfMonth() == 1) {
                strG = lo9.g(visibleStartTime, "yyyMMM");
            } else if (z) {
                strG = lo9.g(visibleStartTime, "MMMd") + Constants.ACCEPT_TIME_SEPARATOR_SERVER + lo9.g(visibleEndTime, "MMMd");
            } else {
                strG = lo9.g(visibleStartTime, "yyyMMMd") + Constants.ACCEPT_TIME_SEPARATOR_SERVER + lo9.g(visibleEndTime, "yyyMMMd");
            }
            Intrinsics.checkNotNullExpressionValue(strG, "{\n                /*整月显示…          }\n            }");
        } else if (iB0 == 2) {
            if (M0().getMonthValue() == 1 || localDateE.getMonthValue() == 1) {
                strG = lo9.g(visibleStartTime, "yyy");
            } else {
                strG = lo9.g(visibleStartTime, "yyyMMM") + Constants.ACCEPT_TIME_SEPARATOR_SERVER + lo9.g(visibleEndTime, "yyyMMM");
            }
            Intrinsics.checkNotNullExpressionValue(strG, "{\n                /*整年显示…          }\n            }");
        } else if (z) {
            strG = lo9.g(visibleStartTime, "MMMd") + Constants.ACCEPT_TIME_SEPARATOR_SERVER + lo9.g(visibleEndTime, "MMMd");
        } else {
            strG = lo9.g(visibleStartTime, "yyyMMMd") + Constants.ACCEPT_TIME_SEPARATOR_SERVER + lo9.g(visibleEndTime, "yyyMMMd");
        }
        this.dateStr = strG;
        TextView textView = this.dateText;
        if (textView != null) {
            textView.setText(strG);
        }
        Pair<Long, Long> pair = TuplesKt.to(Long.valueOf(visibleStartTime), Long.valueOf(visibleEndTime));
        this.curTimeRange = pair;
        G0(pair);
    }

    @Override // com.oplus.aiunit.vision.ir9
    public boolean u5() {
        return ir9.a.c(this);
    }

    public final void v1() {
        ((CommonScrollTopLineView) W(R$id.vp_line)).o(getContext(), this.scrollView);
        TextView textView = this.dateText;
        if (textView != null) {
            textView.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.zl1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BloodOxygenHistoryBaseFragment.x1(this.i, view);
                }
            });
        }
        View view = this.dateDownText;
        if (view != null) {
            view.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.am1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    BloodOxygenHistoryBaseFragment.y1(this.i, view2);
                }
            });
        }
        ImageView imageView = this.nextDateBtn;
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.bm1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    BloodOxygenHistoryBaseFragment.z1(this.i, view2);
                }
            });
        }
        ImageView imageView2 = this.lastDateBtn;
        if (imageView2 != null) {
            imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.cm1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    BloodOxygenHistoryBaseFragment.A1(this.i, view2);
                }
            });
        }
    }

    public final void z0() {
        float fTimeStampToUnitDouble;
        float barWidth;
        float lowestVisibleX = J0().getLowestVisibleX();
        double lowestVisibleValueX = J0().getLowestVisibleValueX();
        double xAxisOffset = J0().getXAxisOffset();
        if (B0() == 2) {
            com.heytap.health.bloodoxygen.util.a.Companion companion = com.heytap.health.bloodoxygen.util.a.INSTANCE;
            fTimeStampToUnitDouble = (companion.e(V0()).getYear() - companion.e(this.chartStartTime).getYear()) * 12;
            barWidth = J0().getBarWidth();
        } else {
            fTimeStampToUnitDouble = (float) J0().getXAxisTimeUnit().timeStampToUnitDouble(V0());
            barWidth = J0().getBarWidth();
        }
        float f = fTimeStampToUnitDouble - barWidth;
        ar0.a(this.TAG, "animationChartOnFragmentShow() startX=" + lowestVisibleX + " startValueX=" + lowestVisibleValueX + " defaultStartX=" + f + " startOffset=" + xAxisOffset);
        if (lowestVisibleX <= 0.0f) {
            lowestVisibleX = (float) (((double) f) - lowestVisibleValueX);
        }
        F0(lowestVisibleX);
    }
}