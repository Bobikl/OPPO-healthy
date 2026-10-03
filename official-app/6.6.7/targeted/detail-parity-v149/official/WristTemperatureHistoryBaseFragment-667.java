package com.heytap.health.wrist_temperature.ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.DashPathEffect;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import com.coui.appcompat.panel.COUIBottomSheetDialogFragment;
import com.coui.appcompat.panel.COUIPanelFragment;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.listener.OnChartValueSelectedListener;
import com.google.security.cryptauth.lib.securegcm.SecureGcmConstants;
import com.heytap.databaseengine.model.UserInfo;
import com.heytap.databaseengine.model.wristtemperature.WristTemperatureStat;
import com.heytap.health.base.base.BaseFragment;
import com.heytap.health.base.livedata.OLiveData;
import com.heytap.health.blood.glucose.BloodGlucoseWarningActivity;
import com.heytap.health.core.widget.charts.data.ChartScrollState;
import com.heytap.health.core.widget.charts.data.TimeStampedData;
import com.heytap.health.device_data_sync.data_sync.IDataSyncService;
import com.heytap.health.devicemanager.processor.bean.UserDeviceInfo;
import com.heytap.health.health.family.FamilyMoreDataDetailConfigBean;
import com.heytap.health.wrist_temperature.R$id;
import com.heytap.health.wrist_temperature.R$layout;
import com.heytap.health.wrist_temperature.R$string;
import com.heytap.health.wrist_temperature.ui.WristTemperatureHistoryBaseFragment;
import com.heytap.health.wrist_temperature.util.ChartType;
import com.heytap.health.wrist_temperature.view.WristHistoryChartTouchListener;
import com.heytap.health.wrist_temperature.view.WristTemperatureChart;
import com.heytap.health.wrist_temperature.viewmodel.WristHistoryViewModel;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.acl;
import com.oplus.aiunit.vision.c7n;
import com.oplus.aiunit.vision.e1;
import com.oplus.aiunit.vision.fdg;
import com.oplus.aiunit.vision.h15;
import com.oplus.aiunit.vision.jjk;
import com.oplus.aiunit.vision.k7h;
import com.oplus.aiunit.vision.m6m;
import com.oplus.aiunit.vision.m8b;
import com.oplus.aiunit.vision.ot8;
import com.oplus.aiunit.vision.pr8;
import com.oplus.aiunit.vision.qmg;
import com.oplus.aiunit.vision.w4l;
import com.oplus.aiunit.vision.wl4;
import com.oplus.aiunit.vision.xmk;
import com.oplus.aiunit.vision.xp0;
import com.oplus.aiunit.vision.zh2;
import com.oplus.aiunit.vision.zs9;
import com.oplus.wearable.linkservice.sdk.Node;
import com.support.appcompat.R$attr;
import io.netty.handler.ssl.ApplicationProtocolNames;
import io.protostuff.MapSchema;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Function;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.Pair;
import p010kotlin.ResultKt;
import p010kotlin.Unit;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.coroutines.jvm.internal.DebugMetadata;
import p010kotlin.coroutines.jvm.internal.SuspendLambda;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.functions.Function2;
import p010kotlin.jvm.internal.FunctionAdapter;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0015\b&\u0018\u0000 à\u00012\u00020\u00012\u00020\u0002:\u0002á\u0001B\t¢\u0006\u0006\bÞ\u0001\u0010ß\u0001J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\b\u0010\u0006\u001a\u00020\u0003H\u0002J\u0012\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002J\b\u0010\u000b\u001a\u00020\u0003H\u0002J\u0016\u0010\u0010\u001a\u00020\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002J\u001e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011H\u0002J\b\u0010\u0015\u001a\u00020\u0003H\u0002J\b\u0010\u0016\u001a\u00020\u0003H\u0002J\b\u0010\u0018\u001a\u00020\u0017H\u0014J\u0012\u0010\u001b\u001a\u00020\u00032\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016J\b\u0010\u001c\u001a\u00020\u0003H\u0016J\u0016\u0010\u001d\u001a\u00020\u00032\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH$J\b\u0010\u001f\u001a\u00020\u001eH$J\b\u0010 \u001a\u00020\u0003H$J\b\u0010\"\u001a\u00020!H$J\b\u0010#\u001a\u00020\u0003H$J\u0018\u0010$\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011H$J\u0010\u0010&\u001a\u00020\u00032\u0006\u0010%\u001a\u00020\u001eH&J\u0010\u0010(\u001a\u00020\u00112\u0006\u0010'\u001a\u00020\u0011H\u0014J\u0010\u0010)\u001a\u00020\u00112\u0006\u0010'\u001a\u00020\u0011H\u0014J\u0010\u0010*\u001a\u00020\u00112\u0006\u0010'\u001a\u00020\u0011H\u0014J\u0010\u0010+\u001a\u00020\u00112\u0006\u0010'\u001a\u00020\u0011H\u0014J\u0010\u0010,\u001a\u00020\u00112\u0006\u0010'\u001a\u00020\u0011H\u0014J\u0010\u0010-\u001a\u00020\u00112\u0006\u0010'\u001a\u00020\u0011H\u0014J\u0010\u00100\u001a\u00020\u00112\u0006\u0010/\u001a\u00020.H\u0014J\u0010\u00101\u001a\u00020.2\u0006\u0010'\u001a\u00020\u0011H\u0014J\u001c\u00103\u001a\b\u0012\u0004\u0012\u0002020\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0014J\u0010\u00105\u001a\u00020\u000f2\u0006\u00104\u001a\u00020\u0011H\u0014J\u0010\u00107\u001a\u00020\u00112\u0006\u00106\u001a\u00020\u000fH\u0014J,\u00109\u001a\b\u0012\u0004\u0012\u00020\u000f0\f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\f\u00108\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0014J\u0018\u0010:\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011H\u0007J\u0006\u0010;\u001a\u00020\u0003J\u0006\u0010<\u001a\u00020\u0003R\"\u0010D\u001a\u00020=8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\"\u0010H\u001a\u00020=8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bE\u0010?\u001a\u0004\bF\u0010A\"\u0004\bG\u0010CR\"\u0010P\u001a\u00020I8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\u0016\u0010R\u001a\u00020=8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bQ\u0010?R\"\u0010Z\u001a\u00020S8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bT\u0010U\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR\"\u0010^\u001a\u00020I8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b[\u0010K\u001a\u0004\b\\\u0010M\"\u0004\b]\u0010OR\"\u0010b\u001a\u00020I8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b_\u0010K\u001a\u0004\b`\u0010M\"\u0004\ba\u0010OR\"\u0010f\u001a\u00020I8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bc\u0010K\u001a\u0004\bd\u0010M\"\u0004\be\u0010OR\"\u0010j\u001a\u00020I8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bg\u0010K\u001a\u0004\bh\u0010M\"\u0004\bi\u0010OR\u0016\u0010m\u001a\u00020k8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b6\u0010lR\"\u0010t\u001a\u00020\u00198\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bn\u0010o\u001a\u0004\bp\u0010q\"\u0004\br\u0010sR\"\u0010x\u001a\u00020S8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bu\u0010U\u001a\u0004\bv\u0010W\"\u0004\bw\u0010YR#\u0010\u0080\u0001\u001a\u00020y8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bz\u0010{\u001a\u0004\b|\u0010}\"\u0004\b~\u0010\u007fR)\u0010\u0087\u0001\u001a\u00020\u00118\u0004@\u0004X\u0084\u000e¢\u0006\u0018\n\u0006\b\u0081\u0001\u0010\u0082\u0001\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001\"\u0006\b\u0085\u0001\u0010\u0086\u0001R)\u0010\u008b\u0001\u001a\u00020\u00118\u0004@\u0004X\u0084\u000e¢\u0006\u0018\n\u0006\b\u0088\u0001\u0010\u0082\u0001\u001a\u0006\b\u0089\u0001\u0010\u0084\u0001\"\u0006\b\u008a\u0001\u0010\u0086\u0001R\u0019\u0010\u008d\u0001\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008c\u0001\u0010\u0082\u0001R)\u0010\u0091\u0001\u001a\u00020\u00118\u0004@\u0004X\u0084\u000e¢\u0006\u0018\n\u0006\b\u008e\u0001\u0010\u0082\u0001\u001a\u0006\b\u008f\u0001\u0010\u0084\u0001\"\u0006\b\u0090\u0001\u0010\u0086\u0001R)\u0010\u0095\u0001\u001a\u00020\u00118\u0004@\u0004X\u0084\u000e¢\u0006\u0018\n\u0006\b\u0092\u0001\u0010\u0082\u0001\u001a\u0006\b\u0093\u0001\u0010\u0084\u0001\"\u0006\b\u0094\u0001\u0010\u0086\u0001R*\u0010\u009d\u0001\u001a\u00030\u0096\u00018\u0004@\u0004X\u0084.¢\u0006\u0018\n\u0006\b\u0097\u0001\u0010\u0098\u0001\u001a\u0006\b\u0099\u0001\u0010\u009a\u0001\"\u0006\b\u009b\u0001\u0010\u009c\u0001R6\u0010¥\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u009e\u00018\u0004@\u0004X\u0084\u000e¢\u0006\u0018\n\u0006\b\u009f\u0001\u0010 \u0001\u001a\u0006\b¡\u0001\u0010¢\u0001\"\u0006\b£\u0001\u0010¤\u0001R*\u0010\u00ad\u0001\u001a\u00030¦\u00018\u0004@\u0004X\u0084.¢\u0006\u0018\n\u0006\b§\u0001\u0010¨\u0001\u001a\u0006\b©\u0001\u0010ª\u0001\"\u0006\b«\u0001\u0010¬\u0001R.\u00108\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0004@\u0004X\u0084.¢\u0006\u0018\n\u0006\b\u0082\u0001\u0010®\u0001\u001a\u0006\b¯\u0001\u0010°\u0001\"\u0006\b±\u0001\u0010²\u0001R)\u0010¸\u0001\u001a\u00020\u00178\u0004@\u0004X\u0084\u000e¢\u0006\u0018\n\u0006\b³\u0001\u0010§\u0001\u001a\u0006\b´\u0001\u0010µ\u0001\"\u0006\b¶\u0001\u0010·\u0001R)\u0010¼\u0001\u001a\u00020\u00178\u0004@\u0004X\u0084\u000e¢\u0006\u0018\n\u0006\b¹\u0001\u0010§\u0001\u001a\u0006\bº\u0001\u0010µ\u0001\"\u0006\b»\u0001\u0010·\u0001R*\u0010Ä\u0001\u001a\u00030½\u00018\u0004@\u0004X\u0084\u000e¢\u0006\u0018\n\u0006\b¾\u0001\u0010¿\u0001\u001a\u0006\bÀ\u0001\u0010Á\u0001\"\u0006\bÂ\u0001\u0010Ã\u0001R*\u0010È\u0001\u001a\u00030½\u00018\u0004@\u0004X\u0084\u000e¢\u0006\u0018\n\u0006\bÅ\u0001\u0010¿\u0001\u001a\u0006\bÆ\u0001\u0010Á\u0001\"\u0006\bÇ\u0001\u0010Ã\u0001R*\u0010Ì\u0001\u001a\u00030½\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bÉ\u0001\u0010¿\u0001\u001a\u0006\bÊ\u0001\u0010Á\u0001\"\u0006\bË\u0001\u0010Ã\u0001R,\u0010Ô\u0001\u001a\u0005\u0018\u00010Í\u00018\u0004@\u0004X\u0084\u000e¢\u0006\u0018\n\u0006\bÎ\u0001\u0010Ï\u0001\u001a\u0006\bÐ\u0001\u0010Ñ\u0001\"\u0006\bÒ\u0001\u0010Ó\u0001R \u0010Ø\u0001\u001a\u00020\u00118VX\u0096\u0084\u0002¢\u0006\u0010\n\u0006\bÕ\u0001\u0010Ö\u0001\u001a\u0006\b×\u0001\u0010\u0084\u0001R\u001b\u0010Û\u0001\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÙ\u0001\u0010Ú\u0001R\u0015\u0010Ý\u0001\u001a\u00030½\u00018F¢\u0006\b\u001a\u0006\bÜ\u0001\u0010Á\u0001¨\u0006â\u0001"}, d2 = {"Lcom/heytap/health/wrist_temperature/ui/WristTemperatureHistoryBaseFragment;", "Lcom/heytap/health/base/base/BaseFragment;", "Lcom/oplus/aiunit/vision/zs9;", "", "G1", "x1", "t1", "Lcom/coui/appcompat/panel/COUIBottomSheetDialogFragment;", "dialogFragment", "Lcom/coui/appcompat/panel/COUIPanelFragment;", "q0", "z2", "", "Lcom/heytap/databaseengine/model/wristtemperature/WristTemperatureStat;", "dataList", "", "p1", "", "startTime", "endTime", "i1", "N1", "M1", "", "getLayoutId", "Landroid/view/View;", "view", "initView", "initData", acl.KEY_C2, "Ljava/time/LocalDate;", "r0", "v1", "Lcom/heytap/health/wrist_temperature/util/ChartType;", "u0", "A2", "V1", "date", "P1", "timestamp", "y0", "z0", "x0", "w0", acl.KEY_A0, acl.KEY_B0, "Ljava/time/LocalDateTime;", "localDateTime", "J1", "K1", "Lcom/heytap/health/core/widget/charts/data/TimeStampedData;", "p0", "time", "B2", "x", "D2", "mDataList", "j1", Node.I_TAG, "n0", "W1", "Landroid/widget/ImageView;", "o", "Landroid/widget/ImageView;", "Z0", "()Landroid/widget/ImageView;", "o2", "(Landroid/widget/ImageView;)V", "mPreIv", LogFieldKey.PROCESS_NAME_KEY, "Y0", "l2", "mNextIv", "Landroid/widget/TextView;", "q", "Landroid/widget/TextView;", "P0", "()Landroid/widget/TextView;", "f2", "(Landroid/widget/TextView;)V", "mDateTv", "r", "mDownIv", "Landroid/widget/LinearLayout;", "s", "Landroid/widget/LinearLayout;", "W0", "()Landroid/widget/LinearLayout;", "j2", "(Landroid/widget/LinearLayout;)V", "mLoading", "t", "n1", "t2", "wristT", "u", "o1", com.alipay.sdk.m.x.c.d, "wristUnit", "v", "e1", "q2", "mValueTitle", "w", "V0", "i2", "mLearnMore", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "mDataLayout", "y", "Landroid/view/View;", "X0", "()Landroid/view/View;", "k2", "(Landroid/view/View;)V", "mMaskLayer", "z", "Q0", "g2", "mDetailLayout", "Lcom/heytap/health/wrist_temperature/view/WristTemperatureChart;", "A", "Lcom/heytap/health/wrist_temperature/view/WristTemperatureChart;", "M0", "()Lcom/heytap/health/wrist_temperature/view/WristTemperatureChart;", "d2", "(Lcom/heytap/health/wrist_temperature/view/WristTemperatureChart;)V", "mChart", acl.KEY_B, "J", "d1", "()J", "p2", "(J)V", "mStartTime", "C", "R0", ApplicationProtocolNames.HTTP_2, "mEndTime", "D", "mLastDataTime", ExifInterface.LONGITUDE_EAST, "t0", "Z1", BloodGlucoseWarningActivity.CHART_LOWEST_VISIBLE_TIME, UserInfo.SEX_FEMALE, "s0", "X1", BloodGlucoseWarningActivity.CHART_HIGHEST_VISIBLE_TIME, "Lcom/heytap/health/wrist_temperature/viewmodel/WristHistoryViewModel;", "G", "Lcom/heytap/health/wrist_temperature/viewmodel/WristHistoryViewModel;", "f1", "()Lcom/heytap/health/wrist_temperature/viewmodel/WristHistoryViewModel;", "r2", "(Lcom/heytap/health/wrist_temperature/viewmodel/WristHistoryViewModel;)V", "mViewModel", "Lcom/heytap/health/base/livedata/OLiveData;", "H", "Lcom/heytap/health/base/livedata/OLiveData;", "O0", "()Lcom/heytap/health/base/livedata/OLiveData;", "setMDataStatLiveData", "(Lcom/heytap/health/base/livedata/OLiveData;)V", "mDataStatLiveData", "Lcom/heytap/health/wrist_temperature/view/WristHistoryChartTouchListener;", "I", "Lcom/heytap/health/wrist_temperature/view/WristHistoryChartTouchListener;", "g1", "()Lcom/heytap/health/wrist_temperature/view/WristHistoryChartTouchListener;", "s2", "(Lcom/heytap/health/wrist_temperature/view/WristHistoryChartTouchListener;)V", "touchListener", "Ljava/util/List;", "N0", "()Ljava/util/List;", "e2", "(Ljava/util/List;)V", "K", "v0", "()I", "b2", "(I)V", "countDown", "L", "m1", "setWristStat", "wristStat", "", "M", "Z", "H0", "()Z", "setIfShowCountDown", "(Z)V", "ifShowCountDown", "N", "G0", "setIfShowBubble", "ifShowBubble", "O", "J0", "setIfShowUnit", "ifShowUnit", "Lcom/heytap/health/health/family/FamilyMoreDataDetailConfigBean;", SecureGcmConstants.MESSAGE_KEY, "Lcom/heytap/health/health/family/FamilyMoreDataDetailConfigBean;", "F0", "()Lcom/heytap/health/health/family/FamilyMoreDataDetailConfigBean;", "setFamilyDetailConfig", "(Lcom/heytap/health/health/family/FamilyMoreDataDetailConfigBean;)V", "familyDetailConfig", "Q", "Lkotlin/Lazy;", "K0", "locationTime", "R", "Lcom/coui/appcompat/panel/COUIBottomSheetDialogFragment;", "calendarDialogFragment", "u5", "isFromFamily", "<init>", "()V", "Companion", "a", "wrist_temperature_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nWristTemperatureHistoryBaseFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WristTemperatureHistoryBaseFragment.kt\ncom/heytap/health/wrist_temperature/ui/WristTemperatureHistoryBaseFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,623:1\n1855#2,2:624\n*S KotlinDebug\n*F\n+ 1 WristTemperatureHistoryBaseFragment.kt\ncom/heytap/health/wrist_temperature/ui/WristTemperatureHistoryBaseFragment\n*L\n409#1:624,2\n*E\n"})
public abstract class WristTemperatureHistoryBaseFragment extends BaseFragment implements zs9 {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    public WristTemperatureChart mChart;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    public long mStartTime;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public long mEndTime;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public long mLastDataTime;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public long chartLowestVisibleTime;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public long chartHighestVisibleTime;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public WristHistoryViewModel mViewModel;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public WristHistoryChartTouchListener touchListener;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public List<WristTemperatureStat> mDataList;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public boolean ifShowCountDown;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public boolean ifShowBubble;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public boolean ifShowUnit;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    @Nullable
    public FamilyMoreDataDetailConfigBean familyDetailConfig;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    @Nullable
    public COUIBottomSheetDialogFragment calendarDialogFragment;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public ImageView mPreIv;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public ImageView mNextIv;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public TextView mDateTv;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    public ImageView mDownIv;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    public LinearLayout mLoading;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    public TextView wristT;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    public TextView wristUnit;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    public TextView mValueTitle;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    public TextView mLearnMore;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    public ConstraintLayout mDataLayout;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    public View mMaskLayer;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    public LinearLayout mDetailLayout;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    @NotNull
    public OLiveData<List<WristTemperatureStat>> mDataStatLiveData = new OLiveData<>();

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public int countDown = -1;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public int wristStat = -1;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    @NotNull
    public final Lazy locationTime = LazyKt__LazyJVMKt.lazy(new Function0<Long>() { // from class: com.heytap.health.wrist_temperature.ui.WristTemperatureHistoryBaseFragment$locationTime$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final Long invoke() {
            WristTemperatureHistoryBaseFragment wristTemperatureHistoryBaseFragment = this.this$0;
            return Long.valueOf(wristTemperatureHistoryBaseFragment.L0(wristTemperatureHistoryBaseFragment.getArguments()));
        }
    });

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016¨\u0006\t"}, d2 = {"com/heytap/health/wrist_temperature/ui/WristTemperatureHistoryBaseFragment$b", "Lcom/github/mikephil/charting/listener/OnChartValueSelectedListener;", "Lcom/github/mikephil/charting/data/Entry;", MapSchema.FIELD_NAME_ENTRY, "Lcom/github/mikephil/charting/highlight/Highlight;", c7n.g, "", "onValueSelected", "onNothingSelected", "wrist_temperature_release"}, k = 1, mv = {1, 8, 0})
    public static final class b implements OnChartValueSelectedListener {
        public b() {
        }

        @Override // com.github.mikephil.charting.listener.OnChartValueSelectedListener
        public void onNothingSelected() {
            WristTemperatureHistoryBaseFragment.this.n1().setVisibility(0);
            WristTemperatureHistoryBaseFragment.this.e1().setVisibility(0);
            if (WristTemperatureHistoryBaseFragment.this.getIfShowUnit()) {
                WristTemperatureHistoryBaseFragment.this.o1().setVisibility(0);
            }
        }

        @Override // com.github.mikephil.charting.listener.OnChartValueSelectedListener
        public void onValueSelected(@NotNull Entry e2, @NotNull Highlight h) {
            Intrinsics.checkNotNullParameter(e2, "e");
            Intrinsics.checkNotNullParameter(h, "h");
            WristTemperatureHistoryBaseFragment.this.n1().setVisibility(4);
            WristTemperatureHistoryBaseFragment.this.e1().setVisibility(4);
            WristTemperatureHistoryBaseFragment.this.o1().setVisibility(4);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"com/heytap/health/wrist_temperature/ui/WristTemperatureHistoryBaseFragment$c", "Lcom/oplus/aiunit/vision/k7h;", "Lcom/heytap/health/core/widget/charts/data/ChartScrollState;", "state", "", "a", "wrist_temperature_release"}, k = 1, mv = {1, 8, 0})
    public static final class c extends k7h {
        public c() {
        }

        @Override // com.oplus.aiunit.vision.k7h
        public void a(@NotNull ChartScrollState state) {
            Number numberValueOf;
            long jD2;
            long jD3;
            Intrinsics.checkNotNullParameter(state, "state");
            if (state != ChartScrollState.IDLE) {
                return;
            }
            float fS = WristTemperatureHistoryBaseFragment.this.g1().getLowX() < 0.0f ? 0.0f : WristTemperatureHistoryBaseFragment.this.g1().getLowX();
            if (WristTemperatureHistoryBaseFragment.this.g1().getIndex() < 0) {
                numberValueOf = Float.valueOf(0.0f);
            } else {
                numberValueOf = WristTemperatureHistoryBaseFragment.this.g1().getIndex() >= WristTemperatureHistoryBaseFragment.this.N0().size() ? Integer.valueOf(WristTemperatureHistoryBaseFragment.this.N0().size() - 12) : Integer.valueOf(WristTemperatureHistoryBaseFragment.this.g1().getIndex());
            }
            if (WristTemperatureHistoryBaseFragment.this.u0() == ChartType.YEAR) {
                WristTemperatureHistoryBaseFragment wristTemperatureHistoryBaseFragment = WristTemperatureHistoryBaseFragment.this;
                jD2 = wristTemperatureHistoryBaseFragment.x0(pr8.INSTANCE.g(wristTemperatureHistoryBaseFragment.N0().get(numberValueOf.intValue()).getDate()));
                WristTemperatureHistoryBaseFragment wristTemperatureHistoryBaseFragment2 = WristTemperatureHistoryBaseFragment.this;
                LocalDateTime localDateTimePlusMonths = wristTemperatureHistoryBaseFragment2.K1(jD2).plusMonths(11L);
                Intrinsics.checkNotNullExpressionValue(localDateTimePlusMonths, "milliToLocalDateTime(startTime).plusMonths(11)");
                jD3 = wristTemperatureHistoryBaseFragment2.w0(wristTemperatureHistoryBaseFragment2.J1(localDateTimePlusMonths));
            } else if (WristTemperatureHistoryBaseFragment.this.u0() == ChartType.MONTH) {
                WristTemperatureHistoryBaseFragment wristTemperatureHistoryBaseFragment3 = WristTemperatureHistoryBaseFragment.this;
                jD2 = wristTemperatureHistoryBaseFragment3.D2(wristTemperatureHistoryBaseFragment3.M0().getExtraXAxisSpace() + fS);
                WristTemperatureHistoryBaseFragment wristTemperatureHistoryBaseFragment4 = WristTemperatureHistoryBaseFragment.this;
                jD3 = wristTemperatureHistoryBaseFragment4.D2(fS + wristTemperatureHistoryBaseFragment4.M0().getExtraXAxisSpace() + 30);
            } else {
                WristTemperatureHistoryBaseFragment wristTemperatureHistoryBaseFragment5 = WristTemperatureHistoryBaseFragment.this;
                jD2 = wristTemperatureHistoryBaseFragment5.D2(wristTemperatureHistoryBaseFragment5.M0().getExtraXAxisSpace() + fS);
                WristTemperatureHistoryBaseFragment wristTemperatureHistoryBaseFragment6 = WristTemperatureHistoryBaseFragment.this;
                jD3 = wristTemperatureHistoryBaseFragment6.D2(fS + wristTemperatureHistoryBaseFragment6.M0().getExtraXAxisSpace() + 6);
            }
            pr8 pr8Var = pr8.INSTANCE;
            if (jD3 > pr8Var.b(WristTemperatureHistoryBaseFragment.this.getMEndTime()) || jD2 < pr8Var.c(WristTemperatureHistoryBaseFragment.this.getMStartTime())) {
                return;
            }
            long jC = pr8Var.c(jD2);
            long jB = pr8Var.b(jD3);
            WristTemperatureHistoryBaseFragment.this.V1(jC, jB);
            WristTemperatureHistoryBaseFragment.this.R1(jC, jB);
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

    public static final void A1(WristTemperatureHistoryBaseFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.z2();
    }

    public static final void B1(WristTemperatureHistoryBaseFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.z2();
    }

    public static final void C1(WristTemperatureHistoryBaseFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        FragmentActivity activity = this$0.getActivity();
        if (activity != null) {
            activity.startActivity(new Intent(this$0.getActivity(), (Class<?>) WristTemperatureDescriptionActivity.class));
        }
    }

    public static final String u1(WristTemperatureHistoryBaseFragment this$0, int i, double d2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        double dFloor = d2 > 0.0d ? Math.floor(d2) : Math.ceil(d2);
        if (d2 == 0.0d) {
            return "";
        }
        return m6m.INSTANCE.g((float) dFloor, this$0.getContext()) + this$0.getString(R$string.health_wrist_temperature_unit);
    }

    public static final void y1(WristTemperatureHistoryBaseFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.N1();
    }

    public static final void z1(WristTemperatureHistoryBaseFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.M1();
    }

    public long A0(long timestamp) {
        LocalDateTime localDateTimeWith = K1(timestamp).with(TemporalAdjusters.firstDayOfNextYear());
        Intrinsics.checkNotNullExpressionValue(localDateTimeWith, "milliToLocalDateTime(tim…ers.firstDayOfNextYear())");
        return J1(localDateTimeWith) - ((long) 1000);
    }

    public abstract void A2();

    public long B0(long timestamp) {
        LocalDateTime localDateTimeWith = K1(timestamp).with(TemporalAdjusters.firstDayOfYear());
        Intrinsics.checkNotNullExpressionValue(localDateTimeWith, "milliToLocalDateTime(tim…justers.firstDayOfYear())");
        return J1(localDateTimeWith);
    }

    public float B2(long time) {
        return (float) (((time / M0().getXAxisTimeUnit().getUnit()) - M0().getXStart()) - ((double) M0().getExtraXAxisSpace()));
    }

    public abstract void C2(@NotNull List<WristTemperatureStat> dataList);

    public long D2(float x) {
        return (long) ((((double) x) + M0().getXStart()) * M0().getXAxisTimeUnit().getUnit());
    }

    @Nullable
    /* JADX INFO: renamed from: F0, reason: from getter */
    public final FamilyMoreDataDetailConfigBean getFamilyDetailConfig() {
        return this.familyDetailConfig;
    }

    /* JADX INFO: renamed from: G0, reason: from getter */
    public final boolean getIfShowBubble() {
        return this.ifShowBubble;
    }

    public final void G1() {
        r2((WristHistoryViewModel) new ViewModelProvider(this).get(WristHistoryViewModel.class));
        if (u5()) {
            WristHistoryViewModel wristHistoryViewModelF1 = f1();
            FamilyMoreDataDetailConfigBean familyMoreDataDetailConfigBean = this.familyDetailConfig;
            Intrinsics.checkNotNull(familyMoreDataDetailConfigBean);
            wristHistoryViewModelF1.J(familyMoreDataDetailConfigBean.getSsoid());
        }
        this.mDataStatLiveData.observe(this, new d(new Function1<List<? extends WristTemperatureStat>, Unit>() { // from class: com.heytap.health.wrist_temperature.ui.WristTemperatureHistoryBaseFragment$initViewModel$1

            /* JADX INFO: renamed from: com.heytap.health.wrist_temperature.ui.WristTemperatureHistoryBaseFragment$initViewModel$1$1, reason: invalid class name */
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            @DebugMetadata(c = "com.heytap.health.wrist_temperature.ui.WristTemperatureHistoryBaseFragment$initViewModel$1$1", f = "WristTemperatureHistoryBaseFragment.kt", i = {}, l = {164}, m = "invokeSuspend", n = {}, s = {})
            public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                int label;
                final /* synthetic */ WristTemperatureHistoryBaseFragment this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(WristTemperatureHistoryBaseFragment wristTemperatureHistoryBaseFragment, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = wristTemperatureHistoryBaseFragment;
                }

                @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                    return new AnonymousClass1(this.this$0, continuation);
                }

                @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.label = 1;
                        if (DelayKt.delay(100L, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    this.this$0.W0().setVisibility(8);
                    this.this$0.X0().setVisibility(8);
                    return Unit.INSTANCE;
                }

                @Override // p010kotlin.jvm.functions.Function2
                @Nullable
                public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }
            }

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
                WristTemperatureHistoryBaseFragment wristTemperatureHistoryBaseFragment = this.this$0;
                Intrinsics.checkNotNullExpressionValue(it, "it");
                wristTemperatureHistoryBaseFragment.C2(it);
                BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this.this$0), null, null, new AnonymousClass1(this.this$0, null), 3, null);
                WristTemperatureHistoryBaseFragment wristTemperatureHistoryBaseFragment2 = this.this$0;
                wristTemperatureHistoryBaseFragment2.R1(wristTemperatureHistoryBaseFragment2.getChartLowestVisibleTime(), this.this$0.getChartHighestVisibleTime());
            }
        }));
    }

    /* JADX INFO: renamed from: H0, reason: from getter */
    public final boolean getIfShowCountDown() {
        return this.ifShowCountDown;
    }

    /* JADX INFO: renamed from: J0, reason: from getter */
    public final boolean getIfShowUnit() {
        return this.ifShowUnit;
    }

    public long J1(@NotNull LocalDateTime localDateTime) {
        Intrinsics.checkNotNullParameter(localDateTime, "localDateTime");
        return localDateTime.toLocalDate().atStartOfDay(ZoneId.systemDefault()).toInstant().toEpochMilli();
    }

    public long K0() {
        return ((Number) this.locationTime.getValue()).longValue();
    }

    @NotNull
    public LocalDateTime K1(long timestamp) {
        LocalDateTime localDateTimeOfInstant = LocalDateTime.ofInstant(Instant.ofEpochMilli(timestamp), ZoneId.systemDefault());
        Intrinsics.checkNotNullExpressionValue(localDateTimeOfInstant, "ofInstant(Instant.ofEpoc…, ZoneId.systemDefault())");
        return localDateTimeOfInstant;
    }

    public long L0(@Nullable Bundle bundle) {
        return zs9.a.a(this, bundle);
    }

    @NotNull
    public final WristTemperatureChart M0() {
        WristTemperatureChart wristTemperatureChart = this.mChart;
        if (wristTemperatureChart != null) {
            return wristTemperatureChart;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mChart");
        return null;
    }

    public final void M1() {
        g1().v(true);
        n0();
    }

    @NotNull
    public final List<WristTemperatureStat> N0() {
        List<WristTemperatureStat> list = this.mDataList;
        if (list != null) {
            return list;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mDataList");
        return null;
    }

    public final void N1() {
        g1().v(false);
        n0();
    }

    @NotNull
    public final OLiveData<List<WristTemperatureStat>> O0() {
        return this.mDataStatLiveData;
    }

    @NotNull
    public final TextView P0() {
        TextView textView = this.mDateTv;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mDateTv");
        return null;
    }

    public abstract void P1(@NotNull LocalDate date);

    @NotNull
    public final LinearLayout Q0() {
        LinearLayout linearLayout = this.mDetailLayout;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mDetailLayout");
        return null;
    }

    /* JADX INFO: renamed from: R0, reason: from getter */
    public final long getMEndTime() {
        return this.mEndTime;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0101  */
    @SuppressLint({"StringFormatInvalid", "StringFormatMatches"})
    public final void R1(long startTime, long endTime) {
        String string;
        List<Float> listJ1 = j1(startTime, endTime, N0());
        n1().setVisibility(0);
        e1().setVisibility(0);
        M0().highlightValue(null);
        if (listJ1.isEmpty()) {
            string = getString(com.heytap.health.health_base.R$string.health_base_no_data);
            Intrinsics.checkNotNullExpressionValue(string, "getString(com.heytap.hea…ring.health_base_no_data)");
            n1().setTextSize(20.0f);
            e1().setText(getString(R$string.health_wrist_temperature));
            o1().setVisibility(8);
            M0().setIfDrawMask(false);
            this.ifShowUnit = false;
        } else {
            if (listJ1.get(0).floatValue() == 10000.0f) {
                string = getString(com.heytap.health.health_base.R$string.health_base_no_data);
                Intrinsics.checkNotNullExpressionValue(string, "getString(com.heytap.hea…ring.health_base_no_data)");
                n1().setTextSize(20.0f);
                e1().setText(getString(R$string.health_wrist_temperature));
                o1().setVisibility(8);
                M0().setIfDrawMask(false);
                this.ifShowUnit = false;
            } else {
                if (listJ1.get(1).floatValue() == -10000.0f) {
                    string = getString(com.heytap.health.health_base.R$string.health_base_no_data);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(com.heytap.hea…ring.health_base_no_data)");
                    n1().setTextSize(20.0f);
                    e1().setText(getString(R$string.health_wrist_temperature));
                    o1().setVisibility(8);
                    M0().setIfDrawMask(false);
                    this.ifShowUnit = false;
                } else {
                    this.ifShowUnit = true;
                    M0().setIfDrawMask(true);
                    o1().setVisibility(0);
                    float fP1 = p1(i1(startTime, endTime));
                    M0().setYAxisRightValues(new float[]{-fP1, 0.0f, fP1});
                    if (listJ1.get(0).floatValue() == listJ1.get(1).floatValue()) {
                        string = m6m.INSTANCE.g(listJ1.get(0).floatValue(), getContext());
                    } else {
                        m6m.Companion aVar = m6m.INSTANCE;
                        string = getString(R$string.health_wrist_temperature_format_data, aVar.g(listJ1.get(0).floatValue(), getContext()), aVar.g(listJ1.get(1).floatValue(), getContext()));
                        Intrinsics.checkNotNullExpressionValue(string, "{\n                val va…          )\n            }");
                    }
                    n1().setTextSize(34.0f);
                    e1().setText(getString(R$string.health_wrist_temperature_range));
                }
            }
        }
        n1().setText(string);
    }

    @NotNull
    public final TextView V0() {
        TextView textView = this.mLearnMore;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mLearnMore");
        return null;
    }

    public abstract void V1(long startTime, long endTime);

    @NotNull
    public final LinearLayout W0() {
        LinearLayout linearLayout = this.mLoading;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mLoading");
        return null;
    }

    public final void W1() {
        M0().x();
    }

    @NotNull
    public final View X0() {
        View view = this.mMaskLayer;
        if (view != null) {
            return view;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mMaskLayer");
        return null;
    }

    public final void X1(long j2) {
        this.chartHighestVisibleTime = j2;
    }

    @NotNull
    public final ImageView Y0() {
        ImageView imageView = this.mNextIv;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mNextIv");
        return null;
    }

    @NotNull
    public final ImageView Z0() {
        ImageView imageView = this.mPreIv;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mPreIv");
        return null;
    }

    public final void Z1(long j2) {
        this.chartLowestVisibleTime = j2;
    }

    public final void b2(int i) {
        this.countDown = i;
    }

    /* JADX INFO: renamed from: d1, reason: from getter */
    public final long getMStartTime() {
        return this.mStartTime;
    }

    public final void d2(@NotNull WristTemperatureChart wristTemperatureChart) {
        Intrinsics.checkNotNullParameter(wristTemperatureChart, "<set-?>");
        this.mChart = wristTemperatureChart;
    }

    @NotNull
    public final TextView e1() {
        TextView textView = this.mValueTitle;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mValueTitle");
        return null;
    }

    public final void e2(@NotNull List<WristTemperatureStat> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.mDataList = list;
    }

    @NotNull
    public final WristHistoryViewModel f1() {
        WristHistoryViewModel wristHistoryViewModel = this.mViewModel;
        if (wristHistoryViewModel != null) {
            return wristHistoryViewModel;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
        return null;
    }

    public final void f2(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.mDateTv = textView;
    }

    @NotNull
    public final WristHistoryChartTouchListener g1() {
        WristHistoryChartTouchListener wristHistoryChartTouchListener = this.touchListener;
        if (wristHistoryChartTouchListener != null) {
            return wristHistoryChartTouchListener;
        }
        Intrinsics.throwUninitializedPropertyAccessException("touchListener");
        return null;
    }

    public final void g2(@NotNull LinearLayout linearLayout) {
        Intrinsics.checkNotNullParameter(linearLayout, "<set-?>");
        this.mDetailLayout = linearLayout;
    }

    @Override // com.heytap.health.base.base.BaseFragment
    public int getLayoutId() {
        return R$layout.health_wrist_temperature_fragment_base;
    }

    public final void h2(long j2) {
        this.mEndTime = j2;
    }

    public final List<WristTemperatureStat> i1(long startTime, long endTime) {
        ArrayList arrayList = new ArrayList();
        int size = N0().size();
        for (int i = 0; i < size; i++) {
            long jG = pr8.INSTANCE.g(N0().get(i).getDate());
            if (startTime <= jG && jG <= endTime) {
                arrayList.add(N0().get(i));
            }
        }
        return arrayList;
    }

    public final void i2(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.mLearnMore = textView;
    }

    @Override // com.heytap.health.base.base.BaseFragment
    public void initData() {
        x1();
    }

    @Override // com.heytap.health.base.base.BaseFragment
    public void initView(@Nullable View view) {
        Bundle arguments = getArguments();
        ImageView imageView = null;
        this.familyDetailConfig = arguments != null ? (FamilyMoreDataDetailConfigBean) BundleCompat.getSerializable(arguments, "ARGUMENT_MORE_DATA_DETAIL", FamilyMoreDataDetailConfigBean.class) : null;
        G1();
        View viewW = W(R$id.iv_previous);
        Intrinsics.checkNotNullExpressionValue(viewW, "findViewById(R.id.iv_previous)");
        o2((ImageView) viewW);
        View viewW2 = W(R$id.iv_next);
        Intrinsics.checkNotNullExpressionValue(viewW2, "findViewById(R.id.iv_next)");
        l2((ImageView) viewW2);
        View viewW3 = W(R$id.tv_date);
        Intrinsics.checkNotNullExpressionValue(viewW3, "findViewById(R.id.tv_date)");
        f2((TextView) viewW3);
        View viewW4 = W(R$id.date_icon);
        Intrinsics.checkNotNullExpressionValue(viewW4, "findViewById(R.id.date_icon)");
        this.mDownIv = (ImageView) viewW4;
        View viewW5 = W(R$id.loading_health_wrist_t_history);
        Intrinsics.checkNotNullExpressionValue(viewW5, "findViewById(R.id.loading_health_wrist_t_history)");
        j2((LinearLayout) viewW5);
        View viewW6 = W(R$id.tv_health_wrist_t_range);
        Intrinsics.checkNotNullExpressionValue(viewW6, "findViewById(R.id.tv_health_wrist_t_range)");
        t2((TextView) viewW6);
        View viewW7 = W(R$id.tv_health_wrist_unit);
        Intrinsics.checkNotNullExpressionValue(viewW7, "findViewById(R.id.tv_health_wrist_unit)");
        v2((TextView) viewW7);
        View viewW8 = W(R$id.health_wrist_base_chart);
        Intrinsics.checkNotNullExpressionValue(viewW8, "findViewById(R.id.health_wrist_base_chart)");
        d2((WristTemperatureChart) viewW8);
        View viewW9 = W(R$id.health_wrist_t_range_text);
        Intrinsics.checkNotNullExpressionValue(viewW9, "findViewById(R.id.health_wrist_t_range_text)");
        q2((TextView) viewW9);
        View viewW10 = W(R$id.wrist_t_learn_more);
        Intrinsics.checkNotNullExpressionValue(viewW10, "findViewById(R.id.wrist_t_learn_more)");
        i2((TextView) viewW10);
        int i = R$id.ll_range_container;
        View viewW11 = W(i);
        Intrinsics.checkNotNullExpressionValue(viewW11, "findViewById(R.id.ll_range_container)");
        this.mDataLayout = (ConstraintLayout) viewW11;
        View viewW12 = W(R$id.maskLayer_view);
        Intrinsics.checkNotNullExpressionValue(viewW12, "findViewById(R.id.maskLayer_view)");
        k2(viewW12);
        View viewW13 = W(R$id.wrist_detail_data_layout);
        Intrinsics.checkNotNullExpressionValue(viewW13, "findViewById(R.id.wrist_detail_data_layout)");
        g2((LinearLayout) viewW13);
        w4l.d(this, W(R$id.fl_stress_date_container));
        w4l.d(this, W(i));
        w4l.d(this, W(R$id.health_wrist_t_view_explanation));
        w4l.d(this, W(R$id.base_wrist_container));
        Z0().setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.d7m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                WristTemperatureHistoryBaseFragment.y1(this.i, view2);
            }
        });
        Y0().setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.e7m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                WristTemperatureHistoryBaseFragment.z1(this.i, view2);
            }
        });
        ImageView imageView2 = this.mDownIv;
        if (imageView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDownIv");
        } else {
            imageView = imageView2;
        }
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.f7m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                WristTemperatureHistoryBaseFragment.A1(this.i, view2);
            }
        });
        P0().setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.g7m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                WristTemperatureHistoryBaseFragment.B1(this.i, view2);
            }
        });
        V0().setTextColor(zh2.a(getContext(), R$attr.couiColorPrimary));
        V0().setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.h7m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                WristTemperatureHistoryBaseFragment.C1(this.i, view2);
            }
        });
        t1();
        v1();
    }

    @NotNull
    public List<Float> j1(long startTime, long endTime, @NotNull List<WristTemperatureStat> mDataList) {
        Intrinsics.checkNotNullParameter(mDataList, "mDataList");
        ArrayList arrayList = new ArrayList();
        if (mDataList.isEmpty()) {
            return arrayList;
        }
        int size = mDataList.size();
        float f = 10000.0f;
        float f2 = -10000.0f;
        for (int i = 0; i < size; i++) {
            long jG = pr8.INSTANCE.g(mDataList.get(i).getDate());
            float f3 = m6m.INSTANCE.f(mDataList.get(i));
            if (!(f3 == -10000.0f)) {
                if (startTime <= jG && jG <= endTime) {
                    if (f3 > f2) {
                        f2 = f3;
                    }
                    if (f3 < f) {
                        f = f3;
                    }
                }
            }
        }
        arrayList.add(Float.valueOf(f));
        arrayList.add(Float.valueOf(f2));
        return arrayList;
    }

    public final void j2(@NotNull LinearLayout linearLayout) {
        Intrinsics.checkNotNullParameter(linearLayout, "<set-?>");
        this.mLoading = linearLayout;
    }

    public final void k2(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<set-?>");
        this.mMaskLayer = view;
    }

    public final void l2(@NotNull ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "<set-?>");
        this.mNextIv = imageView;
    }

    /* JADX INFO: renamed from: m1, reason: from getter */
    public final int getWristStat() {
        return this.wristStat;
    }

    public final void n0() {
        M0().r();
    }

    @NotNull
    public final TextView n1() {
        TextView textView = this.wristT;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("wristT");
        return null;
    }

    @NotNull
    public final TextView o1() {
        TextView textView = this.wristUnit;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("wristUnit");
        return null;
    }

    public final void o2(@NotNull ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "<set-?>");
        this.mPreIv = imageView;
    }

    @NotNull
    public List<TimeStampedData> p0(@NotNull List<WristTemperatureStat> dataList) {
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        ArrayList arrayList = new ArrayList();
        int size = dataList.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(new TimeStampedData(pr8.INSTANCE.g(dataList.get(i).getDate()), Float.valueOf(m6m.INSTANCE.f(dataList.get(i))).floatValue()));
        }
        return arrayList;
    }

    public final float p1(List<WristTemperatureStat> dataList) {
        int size = dataList.size();
        int i = -2;
        int i2 = 2;
        for (int i3 = 0; i3 < size; i3++) {
            float f = m6m.INSTANCE.f(dataList.get(i3));
            if (!(f == -10000.0f)) {
                if (!(f == 10000.0f)) {
                    if (f > i2) {
                        i2 = ((f % ((float) 2)) > 0.0f ? 1 : ((f % ((float) 2)) == 0.0f ? 0 : -1)) == 0 ? (int) f : ((((int) f) / 2) + 1) * 2;
                    }
                    if (f < i) {
                        i = ((f % ((float) 2)) > 0.0f ? 1 : ((f % ((float) 2)) == 0.0f ? 0 : -1)) == 0 ? (int) f : ((((int) f) / 2) - 1) * 2;
                    }
                }
            }
        }
        int i4 = -i;
        if (i4 > i2) {
            i2 = i4;
        }
        return i2 + 0.05f;
    }

    public final void p2(long j2) {
        this.mStartTime = j2;
    }

    public final COUIPanelFragment q0(final COUIBottomSheetDialogFragment dialogFragment) {
        LocalDate localDateR0 = r0();
        FamilyMoreDataDetailConfigBean familyMoreDataDetailConfigBean = this.familyDetailConfig;
        return new WristTCalendarPanelFrag(familyMoreDataDetailConfigBean != null ? familyMoreDataDetailConfigBean.getSsoid() : null, localDateR0, new Function1<LocalDate, Unit>() { // from class: com.heytap.health.wrist_temperature.ui.WristTemperatureHistoryBaseFragment$getCalendarFragment$1
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
                this.this$0.P1(date);
                COUIBottomSheetDialogFragment cOUIBottomSheetDialogFragment = dialogFragment;
                if (cOUIBottomSheetDialogFragment != null) {
                    cOUIBottomSheetDialogFragment.dismiss();
                }
            }
        });
    }

    public final void q2(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.mValueTitle = textView;
    }

    @NotNull
    public abstract LocalDate r0();

    public final void r2(@NotNull WristHistoryViewModel wristHistoryViewModel) {
        Intrinsics.checkNotNullParameter(wristHistoryViewModel, "<set-?>");
        this.mViewModel = wristHistoryViewModel;
    }

    /* JADX INFO: renamed from: s0, reason: from getter */
    public final long getChartHighestVisibleTime() {
        return this.chartHighestVisibleTime;
    }

    public final void s2(@NotNull WristHistoryChartTouchListener wristHistoryChartTouchListener) {
        Intrinsics.checkNotNullParameter(wristHistoryChartTouchListener, "<set-?>");
        this.touchListener = wristHistoryChartTouchListener;
    }

    /* JADX INFO: renamed from: t0, reason: from getter */
    public final long getChartLowestVisibleTime() {
        return this.chartLowestVisibleTime;
    }

    public final void t1() {
        M0().setYAxisValueFormatter(new xp0() { // from class: com.oplus.aiunit.vision.i7m
            @Override // com.oplus.aiunit.vision.xp0
            public final String a(int i, double d2) {
                return WristTemperatureHistoryBaseFragment.u1(this.a, i, d2);
            }
        });
        M0().setDrawZeroGridLine(true);
        M0().getAxisRight().setGridDashedLine(new DashPathEffect(new float[]{qmg.a(getContext(), 3.0f), qmg.a(getContext(), 3.0f)}, 0.0f));
        M0().getXAxis().setLabelCount(7);
        M0().setChartType(1);
        M0().setIfIntercept(true);
        WristTemperatureChart wristTemperatureChartM0 = M0();
        float f = qmg.f(getContext());
        Context context = getContext();
        Intrinsics.checkNotNull(context);
        float f2 = qmg.f(getContext()) / 2;
        Context context2 = getContext();
        Intrinsics.checkNotNull(context2);
        wristTemperatureChartM0.setGridLinePos(new float[]{0.0f, f - jjk.a(context, 67.0f), f2 - jjk.a(context2, 33.0f)});
        M0().setOnChartValueSelectedListener(new b());
        M0().setOnChartGestureListener(new c());
    }

    public final void t2(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.wristT = textView;
    }

    @NotNull
    public abstract ChartType u0();

    public final boolean u5() {
        return this.familyDetailConfig != null;
    }

    /* JADX INFO: renamed from: v0, reason: from getter */
    public final int getCountDown() {
        return this.countDown;
    }

    public abstract void v1();

    public final void v2(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.wristUnit = textView;
    }

    public long w0(long timestamp) {
        LocalDateTime localDateTimeWith = K1(timestamp).with(TemporalAdjusters.firstDayOfNextMonth());
        Intrinsics.checkNotNullExpressionValue(localDateTimeWith, "milliToLocalDateTime(tim…rs.firstDayOfNextMonth())");
        return J1(localDateTimeWith) - ((long) 1000);
    }

    public long x0(long timestamp) {
        LocalDateTime localDateTimeWith = K1(timestamp).with(TemporalAdjusters.firstDayOfMonth());
        Intrinsics.checkNotNullExpressionValue(localDateTimeWith, "milliToLocalDateTime(tim…usters.firstDayOfMonth())");
        return J1(localDateTimeWith);
    }

    public final void x1() {
        String strH = ot8.h();
        UserDeviceInfo boundDeviceInfoByMac = wl4.managerApi.getBoundDeviceInfoByMac(strH);
        if (boundDeviceInfoByMac != null && boundDeviceInfoByMac.isCurrTerminal()) {
            this.countDown = ((IDataSyncService) e1.d().h(IDataSyncService.class)).x(strH);
            this.wristStat = ((IDataSyncService) e1.d().h(IDataSyncService.class)).l(strH);
        }
        if (this.wristStat == 3) {
            this.ifShowBubble = fdg.x("wrist_day_bubble").r("wrist_day_bubble", true);
        }
        int i = this.countDown;
        this.ifShowCountDown = (i == 0 || i == -1) ? false : true;
        f1().z(new Function1<Pair<? extends Long, ? extends Long>, Unit>() { // from class: com.heytap.health.wrist_temperature.ui.WristTemperatureHistoryBaseFragment$initLastDataTime$2
            {
                super(1);
            }

            @Override // p010kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Long, ? extends Long> pair) {
                invoke2((Pair<Long, Long>) pair);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Pair<Long, Long> it) {
                long jW0;
                Intrinsics.checkNotNullParameter(it, "it");
                long jLongValue = it.component1().longValue();
                long jLongValue2 = it.component2().longValue();
                if (jLongValue <= 0 || jLongValue == 1546272000000L) {
                    jLongValue = System.currentTimeMillis();
                }
                WristTemperatureHistoryBaseFragment wristTemperatureHistoryBaseFragment = this.this$0;
                if (wristTemperatureHistoryBaseFragment.getIfShowCountDown() || jLongValue2 <= 0) {
                    jLongValue2 = System.currentTimeMillis();
                }
                wristTemperatureHistoryBaseFragment.mLastDataTime = jLongValue2;
                if (this.this$0.K0() > 0) {
                    WristTemperatureHistoryBaseFragment wristTemperatureHistoryBaseFragment2 = this.this$0;
                    wristTemperatureHistoryBaseFragment2.mLastDataTime = wristTemperatureHistoryBaseFragment2.K0();
                    if (jLongValue > this.this$0.K0()) {
                        jLongValue = this.this$0.K0();
                    }
                }
                m8b.f("WTBaseFragment", "firstDataDateTime: " + jLongValue + " mLastDataTime: " + this.this$0.mLastDataTime + ", getChartType:" + this.this$0.u0());
                if (this.this$0.u0() == ChartType.WEEK) {
                    WristTemperatureHistoryBaseFragment wristTemperatureHistoryBaseFragment3 = this.this$0;
                    wristTemperatureHistoryBaseFragment3.p2(wristTemperatureHistoryBaseFragment3.z0(jLongValue));
                    WristTemperatureHistoryBaseFragment wristTemperatureHistoryBaseFragment4 = this.this$0;
                    wristTemperatureHistoryBaseFragment4.h2(wristTemperatureHistoryBaseFragment4.y0(System.currentTimeMillis()));
                    if (this.this$0.K0() > 0) {
                        WristTemperatureHistoryBaseFragment wristTemperatureHistoryBaseFragment5 = this.this$0;
                        wristTemperatureHistoryBaseFragment5.Z1(wristTemperatureHistoryBaseFragment5.K0());
                        WristTemperatureHistoryBaseFragment wristTemperatureHistoryBaseFragment6 = this.this$0;
                        wristTemperatureHistoryBaseFragment6.X1((wristTemperatureHistoryBaseFragment6.K0() + 604800000) - 1000);
                    } else {
                        WristTemperatureHistoryBaseFragment wristTemperatureHistoryBaseFragment7 = this.this$0;
                        wristTemperatureHistoryBaseFragment7.Z1(wristTemperatureHistoryBaseFragment7.z0(wristTemperatureHistoryBaseFragment7.mLastDataTime));
                        WristTemperatureHistoryBaseFragment wristTemperatureHistoryBaseFragment8 = this.this$0;
                        wristTemperatureHistoryBaseFragment8.X1(wristTemperatureHistoryBaseFragment8.y0(wristTemperatureHistoryBaseFragment8.mLastDataTime));
                    }
                } else if (this.this$0.u0() == ChartType.MONTH) {
                    int iLengthOfMonth = LocalDate.now().lengthOfMonth();
                    WristTemperatureHistoryBaseFragment wristTemperatureHistoryBaseFragment9 = this.this$0;
                    wristTemperatureHistoryBaseFragment9.p2(wristTemperatureHistoryBaseFragment9.x0(jLongValue));
                    WristTemperatureHistoryBaseFragment wristTemperatureHistoryBaseFragment10 = this.this$0;
                    if (iLengthOfMonth < 31) {
                        LocalDate localDatePlusDays = LocalDate.now().with(TemporalAdjusters.lastDayOfMonth()).plusDays(31 - iLengthOfMonth);
                        WristTemperatureHistoryBaseFragment wristTemperatureHistoryBaseFragment11 = this.this$0;
                        LocalDateTime localDateTimeAtStartOfDay = localDatePlusDays.atStartOfDay();
                        Intrinsics.checkNotNullExpressionValue(localDateTimeAtStartOfDay, "localDate.atStartOfDay()");
                        jW0 = wristTemperatureHistoryBaseFragment11.J1(localDateTimeAtStartOfDay);
                    } else {
                        jW0 = wristTemperatureHistoryBaseFragment10.w0(System.currentTimeMillis());
                    }
                    wristTemperatureHistoryBaseFragment10.h2(jW0);
                    if (this.this$0.K0() > 0) {
                        WristTemperatureHistoryBaseFragment wristTemperatureHistoryBaseFragment12 = this.this$0;
                        wristTemperatureHistoryBaseFragment12.Z1(wristTemperatureHistoryBaseFragment12.K0());
                        WristTemperatureHistoryBaseFragment wristTemperatureHistoryBaseFragment13 = this.this$0;
                        pr8 pr8Var = pr8.INSTANCE;
                        wristTemperatureHistoryBaseFragment13.X1(pr8Var.b(pr8Var.B(wristTemperatureHistoryBaseFragment13.K0(), 30L)));
                    } else {
                        WristTemperatureHistoryBaseFragment wristTemperatureHistoryBaseFragment14 = this.this$0;
                        pr8 pr8Var2 = pr8.INSTANCE;
                        wristTemperatureHistoryBaseFragment14.Z1(pr8Var2.l(wristTemperatureHistoryBaseFragment14.mLastDataTime));
                        WristTemperatureHistoryBaseFragment wristTemperatureHistoryBaseFragment15 = this.this$0;
                        wristTemperatureHistoryBaseFragment15.X1(pr8Var2.k(wristTemperatureHistoryBaseFragment15.mLastDataTime));
                    }
                } else {
                    WristTemperatureHistoryBaseFragment wristTemperatureHistoryBaseFragment16 = this.this$0;
                    wristTemperatureHistoryBaseFragment16.p2(wristTemperatureHistoryBaseFragment16.B0(jLongValue));
                    WristTemperatureHistoryBaseFragment wristTemperatureHistoryBaseFragment17 = this.this$0;
                    LocalDateTime localDateTimeAtStartOfDay2 = LocalDate.now().with(TemporalAdjusters.lastDayOfYear()).atStartOfDay();
                    Intrinsics.checkNotNullExpressionValue(localDateTimeAtStartOfDay2, "now().with(TemporalAdjus…yOfYear()).atStartOfDay()");
                    wristTemperatureHistoryBaseFragment17.h2(wristTemperatureHistoryBaseFragment17.J1(localDateTimeAtStartOfDay2));
                    if (this.this$0.K0() > 0) {
                        WristTemperatureHistoryBaseFragment wristTemperatureHistoryBaseFragment18 = this.this$0;
                        wristTemperatureHistoryBaseFragment18.Z1(wristTemperatureHistoryBaseFragment18.K0());
                        WristTemperatureHistoryBaseFragment wristTemperatureHistoryBaseFragment19 = this.this$0;
                        LocalDateTime localDateTimeAtStartOfDay3 = h15.D(wristTemperatureHistoryBaseFragment19.K0()).plusYears(1L).atStartOfDay();
                        Intrinsics.checkNotNullExpressionValue(localDateTimeAtStartOfDay3, "locationTime.toLocalDate…usYears(1).atStartOfDay()");
                        wristTemperatureHistoryBaseFragment19.X1(h15.I(localDateTimeAtStartOfDay3) - ((long) 1000));
                    } else {
                        WristTemperatureHistoryBaseFragment wristTemperatureHistoryBaseFragment20 = this.this$0;
                        pr8 pr8Var3 = pr8.INSTANCE;
                        wristTemperatureHistoryBaseFragment20.Z1(pr8Var3.u(wristTemperatureHistoryBaseFragment20.mLastDataTime));
                        WristTemperatureHistoryBaseFragment wristTemperatureHistoryBaseFragment21 = this.this$0;
                        wristTemperatureHistoryBaseFragment21.X1(pr8Var3.t(wristTemperatureHistoryBaseFragment21.mLastDataTime));
                    }
                }
                this.this$0.A2();
            }
        });
    }

    public long y0(long timestamp) {
        LocalDateTime localDateTimeK1 = K1(timestamp);
        return localDateTimeK1.plusDays(7 - localDateTimeK1.getDayOfWeek().getValue()).plusDays(1L).toLocalDate().atStartOfDay(ZoneId.systemDefault()).toInstant().toEpochMilli() - 1;
    }

    public long z0(long timestamp) {
        LocalDateTime localDateTimeK1 = K1(timestamp);
        return localDateTimeK1.plusDays(-(localDateTimeK1.getDayOfWeek().getValue() - 1)).toLocalDate().atStartOfDay(ZoneId.systemDefault()).toInstant().toEpochMilli();
    }

    public final void z2() {
        FragmentManager supportFragmentManager;
        List<Fragment> fragments;
        FragmentActivity activity = getActivity();
        if (activity == null || (supportFragmentManager = activity.getSupportFragmentManager()) == null || (fragments = supportFragmentManager.getFragments()) == null) {
            return;
        }
        Iterator<T> it = fragments.iterator();
        while (it.hasNext()) {
            if (((Fragment) it.next()) instanceof WristTemperatureHistoryBaseFragment) {
                COUIBottomSheetDialogFragment cOUIBottomSheetDialogFragment = this.calendarDialogFragment;
                if (cOUIBottomSheetDialogFragment != null) {
                    cOUIBottomSheetDialogFragment.dismiss();
                }
                COUIBottomSheetDialogFragment cOUIBottomSheetDialogFragment2 = new COUIBottomSheetDialogFragment();
                this.calendarDialogFragment = cOUIBottomSheetDialogFragment2;
                cOUIBottomSheetDialogFragment2.setMainPanelFragment(q0(cOUIBottomSheetDialogFragment2));
                FragmentActivity activity2 = getActivity();
                if (activity2 != null) {
                    com.heytap.health.base.track.a.x().a(xmk.TAG_MODULE_ID, 3).a(xmk.TAG_POSTION1, 3).a(xmk.TAG_POSTION2, -1).b();
                    COUIBottomSheetDialogFragment cOUIBottomSheetDialogFragment3 = this.calendarDialogFragment;
                    if (cOUIBottomSheetDialogFragment3 != null) {
                        cOUIBottomSheetDialogFragment3.show(activity2.getSupportFragmentManager(), "calendar Panel fragment");
                    }
                }
            }
        }
    }
}