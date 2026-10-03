package com.heytap.health.main.wristtemperature;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.support.v4.app.ActivityOptionsCompat;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.arouter.facade.Postcard;
import com.heytap.health.base.ui.ActivityTransitionUtil;
import com.heytap.health.base.view.adapter.MultiLayoutAdapter;
import com.heytap.health.health.impl.R;
import com.heytap.health.health.insight.InsightService;
import com.heytap.health.health.insight.Snore;
import com.heytap.health.homecard.constant.HomeCardDataEnum;
import com.heytap.health.insight.data.datasource.net.RecentDataBean;
import com.heytap.health.insight.data.datasource.net.RecentDataItem;
import com.heytap.health.insight.signs.InsightRepository;
import com.heytap.health.insight.singledimen.consumption.CalorieModuleLogic;
import com.heytap.health.insight.singledimen.heartrate.HeartRateModuleLogic;
import com.heytap.health.insight.singledimen.hrv.HrvModuleLogic;
import com.heytap.health.insight.singledimen.sleep.SleepModuleLogic;
import com.heytap.health.insight.singledimen.snore.SnoreModuleLogic;
import com.heytap.health.insight.singledimen.step.StepModuleLogic;
import com.heytap.health.main.wristtemperature.HealthTrendCard;
import com.heytap.health.main.wristtemperature.common.HealthBaseCard;
import com.heytap.health.main.wristtemperature.common.HealthCommonCardView;
import com.heytap.health.protocol.fitness.FitnessProto$FitnessCmdId;
import com.oplus.aiunit.model.ssb;
import com.oplus.aiunit.vision.d88;
import com.oplus.aiunit.vision.e1;
import com.oplus.aiunit.vision.h15;
import com.oplus.aiunit.vision.lo9;
import com.oplus.aiunit.vision.m8b;
import com.oplus.aiunit.vision.pr8;
import com.oplus.aiunit.vision.r9b;
import com.oplus.aiunit.vision.s9b;
import com.oplus.aiunit.vision.u11;
import com.oplus.aiunit.vision.zr8;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Triple;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes17.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000Ð\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 m2\u00020\u0001:\u0002noB\u0019\u0012\u0006\u0010h\u001a\u00020g\u0012\b\u0010j\u001a\u0004\u0018\u00010i¢\u0006\u0004\bk\u0010lJ\u0012\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J5\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0014\u0010\u0012\u001a\u0004\u0018\u00010\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002J\u000e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0002J \u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u0019H\u0002J&\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00162\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u001a\u001a\u00020\u0019H\u0002J\u0018\u0010\u001e\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u0019H\u0002J\u0019\u0010 \u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u0018\u001a\u00020\u0014H\u0002¢\u0006\u0004\b \u0010!J\u0018\u0010$\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\"2\u0006\u0010\u0018\u001a\u00020\u0014H\u0002J\u0019\u0010%\u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u0018\u001a\u00020\u0014H\u0002¢\u0006\u0004\b%\u0010!J\u0018\u0010'\u001a\u00020&2\u0006\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u0019H\u0002J\u0019\u0010)\u001a\u00020\u001f2\b\u0010(\u001a\u0004\u0018\u00010\u001fH\u0002¢\u0006\u0004\b)\u0010*J(\u0010/\u001a\u00020.2\u0006\u0010+\u001a\u00020\u001f2\u0006\u0010,\u001a\u00020\u001f2\u0006\u0010-\u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002J\u0018\u00100\u001a\u00020\u001f2\u0006\u0010(\u001a\u00020\u001f2\u0006\u0010-\u001a\u00020\u001fH\u0002J-\u00105\u001a\u0004\u0018\u00010\u00102\u0006\u00101\u001a\u00020\u001f2\u0006\u00103\u001a\u0002022\u0006\u00104\u001a\u00020\u001fH\u0082@ø\u0001\u0000¢\u0006\u0004\b5\u00106J\u0018\u00109\u001a\u00020\n2\u0006\u00108\u001a\u0002072\u0006\u0010\u001a\u001a\u00020\u0019H\u0002J\b\u0010:\u001a\u00020\u0004H\u0016J\b\u0010;\u001a\u00020\u0004H\u0016J\b\u0010<\u001a\u00020\u0004H\u0014J\b\u0010=\u001a\u00020\u0004H\u0016J \u0010A\u001a\u00020\u00042\u0006\u0010?\u001a\u00020>2\u0006\u0010@\u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J\u0012\u0010B\u001a\u00020\u00042\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016J\b\u0010D\u001a\u00020CH\u0014J\b\u0010F\u001a\u00020EH\u0016R\u0018\u0010I\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010M\u001a\u00020J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR.\u0010Q\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\n0N0\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010PR\u001c\u0010S\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010PR \u0010W\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\r0T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0016\u0010Z\u001a\u0002078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010YR\u001a\u0010^\u001a\b\u0012\u0004\u0012\u00020\u001f0[8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R\u001c\u0010c\u001a\n `*\u0004\u0018\u00010_0_8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010bR\u0016\u0010f\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006p"}, d2 = {"Lcom/heytap/health/main/card/HealthTrendCard;", "Lcom/heytap/health/main/card/common/HealthBaseCard;", "", "force", "", "F0", "t0", "Lcom/heytap/health/insight/data/datasource/net/RecentDataBean;", "data", "", "", "allowedCodes", "", "Lcom/heytap/health/main/card/HealthTrendCard$b;", "r0", "(Lcom/heytap/health/insight/data/datasource/net/RecentDataBean;Ljava/util/Set;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/oplus/aiunit/vision/u11;", "contentLogic", "p0", "", "Lcom/heytap/health/insight/data/datasource/net/RecentDataItem;", "x0", "Landroid/view/View;", "view", "item", "Landroid/content/Context;", "context", "E0", "dataList", "D0", "y0", "", "w0", "(Lcom/heytap/health/insight/data/datasource/net/RecentDataItem;)Ljava/lang/Integer;", "Landroid/widget/ImageView;", "imageView", "o0", "z0", "Landroid/graphics/drawable/Drawable;", "v0", "color", "A0", "(Ljava/lang/Integer;)I", "themeColor", "radiusDp", "alphaPercent", "Landroid/graphics/drawable/GradientDrawable;", "s0", "n0", ssb.KEY_TYPE, "Lcom/oplus/aiunit/vision/r9b;", "targetLogicType", "dateInt", "q0", "(ILcom/oplus/aiunit/vision/r9b;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "dateTime", "u0", "T", "R", "V", "c", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "holder", "position", "L", "X", "Lcom/heytap/health/homecard/constant/HomeCardDataEnum$CardUiMode;", "y", "Lcom/heytap/health/homecard/constant/HomeCardDataEnum$DataType;", "t", "z", "Lcom/heytap/health/insight/data/datasource/net/RecentDataBean;", "recentData", "Lcom/heytap/health/insight/signs/InsightRepository;", "A", "Lcom/heytap/health/insight/signs/InsightRepository;", "insightRepository", "Lkotlin/Triple;", "B", "Ljava/util/Set;", "allowedCloudKeys", "C", "allowedSingleDimenCodes", "Ljava/util/concurrent/ConcurrentHashMap;", "D", "Ljava/util/concurrent/ConcurrentHashMap;", "computedUiModelCache", "E", "J", "lastSyncInsightTimeMs", "Landroidx/lifecycle/Observer;", "F", "Landroidx/lifecycle/Observer;", "syncObserver", "Lcom/heytap/health/health/insight/InsightService;", "kotlin.jvm.PlatformType", "G", "Lcom/heytap/health/health/insight/InsightService;", "insightService", "H", "Z", "isEmpty", "Landroidx/fragment/app/FragmentActivity;", "activity", "Lcom/heytap/health/base/view/adapter/MultiLayoutAdapter;", "adapter", "<init>", "(Landroidx/fragment/app/FragmentActivity;Lcom/heytap/health/base/view/adapter/MultiLayoutAdapter;)V", "Companion", "a", "b", "health_impl_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nHealthTrendCard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HealthTrendCard.kt\ncom/heytap/health/main/card/HealthTrendCard\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,639:1\n766#2:640\n857#2,2:641\n1477#2:643\n1502#2,3:644\n1505#2,3:654\n1045#2:657\n766#2:658\n857#2,2:659\n766#2:661\n857#2,2:662\n372#3,7:647\n1#4:664\n*S KotlinDebug\n*F\n+ 1 HealthTrendCard.kt\ncom/heytap/health/main/card/HealthTrendCard\n*L\n178#1:640\n178#1:641,2\n182#1:643\n182#1:644,3\n182#1:654,3\n185#1:657\n238#1:658\n238#1:659,2\n245#1:661\n245#1:662,2\n182#1:647,7\n*E\n"})
public final class HealthTrendCard extends HealthBaseCard {
    public static final int COLOR_GRAY = 0;
    public static final int COLOR_ORANGE = 1;

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @NotNull
    public final InsightRepository insightRepository;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @NotNull
    public Set<Triple<Integer, Integer, String>> allowedCloudKeys;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @NotNull
    public Set<String> allowedSingleDimenCodes;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @NotNull
    public final ConcurrentHashMap<String, LocalCardUiModel> computedUiModelCache;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public volatile long lastSyncInsightTimeMs;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    @NotNull
    public final Observer<Integer> syncObserver;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public final InsightService insightService;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public boolean isEmpty;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @Nullable
    public RecentDataBean recentData;
    public static final int $stable = 8;

    /* JADX INFO: renamed from: com.heytap.health.main.card.HealthTrendCard$b, reason: from toString */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u000e\u001a\u0004\b\t\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/heytap/health/main/card/HealthTrendCard$b;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "content", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "color", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;)V", "health_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class LocalCardUiModel {
        public static final int $stable = 0;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @NotNull
        public final String content;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @Nullable
        public final Integer color;

        public LocalCardUiModel(@NotNull String str, @Nullable Integer num) {
            Intrinsics.checkNotNullParameter(str, "content");
            this.content = str;
            this.color = num;
        }

        @Nullable
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Integer getColor() {
            return this.color;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getContent() {
            return this.content;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LocalCardUiModel)) {
                return false;
            }
            LocalCardUiModel localCardUiModel = (LocalCardUiModel) other;
            return Intrinsics.areEqual(this.content, localCardUiModel.content) && Intrinsics.areEqual(this.color, localCardUiModel.color);
        }

        public int hashCode() {
            int iHashCode = this.content.hashCode() * 31;
            Integer num = this.color;
            return iHashCode + (num == null ? 0 : num.hashCode());
        }

        @NotNull
        public String toString() {
            return "LocalCardUiModel(content=" + this.content + ", color=" + this.color + ")";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 HealthTrendCard.kt\ncom/heytap/health/main/card/HealthTrendCard\n*L\n1#1,328:1\n186#2:329\n*E\n"})
    public static final class c<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            RecentDataItem recentDataItem = (RecentDataItem) t;
            s9b s9bVar = s9b.INSTANCE;
            String code = recentDataItem.getCode();
            Intrinsics.checkNotNull(code);
            Integer type = recentDataItem.getType();
            Intrinsics.checkNotNull(type);
            r9b r9bVarB = s9bVar.b(code, type);
            Integer numValueOf = Integer.valueOf(r9bVarB != null ? r9bVarB.getPriority() : Integer.MAX_VALUE);
            RecentDataItem recentDataItem2 = (RecentDataItem) t2;
            String code2 = recentDataItem2.getCode();
            Intrinsics.checkNotNull(code2);
            Integer type2 = recentDataItem2.getType();
            Intrinsics.checkNotNull(type2);
            r9b r9bVarB2 = s9bVar.b(code2, type2);
            return ComparisonsKt.compareValues(numValueOf, Integer.valueOf(r9bVarB2 != null ? r9bVarB2.getPriority() : Integer.MAX_VALUE));
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class d implements Observer<Integer> {
        public d() {
        }

        public final void a(int i) {
            m8b.f("HealthTrendCard", "syncLiveData changed, fetch card data");
            HealthTrendCard.this.t0();
        }

        public /* bridge */ /* synthetic */ void onChanged(Object obj) {
            a(((Number) obj).intValue());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HealthTrendCard(@NotNull FragmentActivity fragmentActivity, @Nullable MultiLayoutAdapter multiLayoutAdapter) {
        super(fragmentActivity, multiLayoutAdapter);
        Intrinsics.checkNotNullParameter(fragmentActivity, "activity");
        this.insightRepository = new InsightRepository();
        this.allowedCloudKeys = SetsKt.emptySet();
        this.allowedSingleDimenCodes = SetsKt.emptySet();
        this.computedUiModelCache = new ConcurrentHashMap<>();
        d dVar = new d();
        this.syncObserver = dVar;
        InsightService insightService = (InsightService) e1.d().h(InsightService.class);
        this.insightService = insightService;
        insightService.W0().observe(fragmentActivity, dVar);
        this.isEmpty = true;
    }

    public static final void B0(HealthTrendCard healthTrendCard, Context context, View view) {
        Intrinsics.checkNotNullParameter(healthTrendCard, "this$0");
        Intrinsics.checkNotNullParameter(context, "$context");
        healthTrendCard.X(context);
    }

    public static final void C0(HealthTrendCard healthTrendCard, Context context, View view) {
        Intrinsics.checkNotNullParameter(healthTrendCard, "this$0");
        Intrinsics.checkNotNullParameter(context, "$context");
        healthTrendCard.X(context);
    }

    public static /* synthetic */ void G0(HealthTrendCard healthTrendCard, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        healthTrendCard.F0(z);
    }

    public final int A0(Integer color) {
        return ((color != null && color.intValue() == 0) || color == null || color.intValue() != 1) ? 167772160 : 352282424;
    }

    public final void D0(View view, List<RecentDataItem> dataList, Context context) {
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.ll_data_one);
        LinearLayout linearLayout2 = (LinearLayout) view.findViewById(R.id.ll_data_two);
        LinearLayout linearLayout3 = (LinearLayout) view.findViewById(R.id.ll_data_item_1);
        LinearLayout linearLayout4 = (LinearLayout) view.findViewById(R.id.ll_data_item_2);
        TextView textView = (TextView) view.findViewById(R.id.tv_data_item_1);
        TextView textView2 = (TextView) view.findViewById(R.id.tv_data_item_2);
        ImageView imageView = (ImageView) view.findViewById(R.id.iv_data_item_1);
        ImageView imageView2 = (ImageView) view.findViewById(R.id.iv_data_item_2);
        linearLayout.setVisibility(8);
        linearLayout2.setVisibility(0);
        if (!dataList.isEmpty()) {
            linearLayout3.setVisibility(0);
            RecentDataItem recentDataItem = dataList.get(0);
            textView.setText(y0(recentDataItem, context));
            Intrinsics.checkNotNullExpressionValue(imageView, "ivDataItem1");
            o0(imageView, recentDataItem);
            linearLayout3.setBackground(v0(recentDataItem, context));
        } else {
            linearLayout3.setVisibility(8);
        }
        if (dataList.size() <= 1) {
            linearLayout4.setVisibility(8);
            return;
        }
        linearLayout4.setVisibility(0);
        RecentDataItem recentDataItem2 = dataList.get(1);
        textView2.setText(y0(recentDataItem2, context));
        Intrinsics.checkNotNullExpressionValue(imageView2, "ivDataItem2");
        o0(imageView2, recentDataItem2);
        linearLayout4.setBackground(v0(recentDataItem2, context));
    }

    public final void E0(View view, RecentDataItem item, Context context) {
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.ll_data_one);
        LinearLayout linearLayout2 = (LinearLayout) view.findViewById(R.id.ll_data_two);
        TextView textView = (TextView) view.findViewById(R.id.tv_data_one);
        ImageView imageView = (ImageView) view.findViewById(R.id.iv_data_one);
        linearLayout.setVisibility(0);
        linearLayout2.setVisibility(8);
        textView.setText(y0(item, context));
        Intrinsics.checkNotNullExpressionValue(imageView, "ivDataOne");
        o0(imageView, item);
    }

    public final void F0(boolean force) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = jCurrentTimeMillis - this.lastSyncInsightTimeMs;
        if (!force && this.lastSyncInsightTimeMs > 0 && j < 3600000) {
            m8b.f("HealthTrendCard", "skip syncInsightData on resume: elapsed=" + j + "ms < 3600000ms");
            return;
        }
        this.lastSyncInsightTimeMs = jCurrentTimeMillis;
        LocalDate localDateNow = LocalDate.now();
        Intrinsics.checkNotNullExpressionValue(localDateNow, "today");
        int iB = h15.B(localDateNow);
        m8b.f("HealthTrendCard", "syncInsightData trigger: force=" + force + ", today=" + iB + ", lastSyncTime=" + this.lastSyncInsightTimeMs);
        this.insightService.K0(iB, (Runnable) null);
    }

    @Override // com.heytap.health.main.wristtemperature.common.HealthBaseCard
    public void L(@NotNull RecyclerView.ViewHolder holder, int position, @NotNull final Context context) {
        int iB;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(context, "context");
        super.L(holder, position, context);
        List<RecentDataItem> listX0 = x0();
        boolean zIsEmpty = listX0.isEmpty();
        this.isEmpty = zIsEmpty;
        StringBuilder sb = new StringBuilder();
        sb.append("onCommonBindViewHolder isEmpty: ");
        sb.append(zIsEmpty);
        HealthCommonCardView healthCommonCardView = this.t;
        int i = R.drawable.health_icon_health_trend;
        healthCommonCardView.setIcon(i);
        if (this.isEmpty) {
            this.t.setIcon(i);
            String string = context.getString(R.string.health_home_card_to_understand);
            Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…_home_card_to_understand)");
            this.t.f(context.getString(R.string.health_insight_health_trend), context.getString(R.string.health_insight_card_guide_tip), string);
            this.t.v.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.xw8
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    HealthTrendCard.B0(this.i, context, view);
                }
            });
            this.t.l.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.yw8
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    HealthTrendCard.C0(this.i, context, view);
                }
            });
            return;
        }
        this.t.setDataModel(context.getString(R.string.health_insight_health_trend));
        this.t.z.setVisibility(8);
        this.t.o.setVisibility(8);
        View viewX = x(R.layout.health_health_trend_card);
        TextView textView = (TextView) viewX.findViewById(R.id.tv_date);
        TextView textView2 = (TextView) viewX.findViewById(R.id.tv_more_items);
        RecentDataBean recentDataBean = this.recentData;
        if (recentDataBean != null) {
            iB = recentDataBean.getDate();
        } else {
            LocalDate localDateNow = LocalDate.now();
            Intrinsics.checkNotNullExpressionValue(localDateNow, "now()");
            iB = h15.B(localDateNow);
        }
        textView.setText(u0(pr8.INSTANCE.g(iB), context));
        int size = listX0.size();
        int i2 = size - 2;
        if (i2 > 0) {
            textView2.setVisibility(0);
            textView2.setText(context.getString(R.string.health_insight_card_more_items, Integer.valueOf(i2)));
        } else {
            textView2.setVisibility(8);
        }
        if (size == 1) {
            Intrinsics.checkNotNullExpressionValue(viewX, "mCommonView");
            E0(viewX, listX0.get(0), context);
        } else if (size > 1) {
            Intrinsics.checkNotNullExpressionValue(viewX, "mCommonView");
            D0(viewX, listX0, context);
        }
    }

    @Override // com.heytap.health.main.wristtemperature.common.HealthBaseCard
    public void R() {
        m8b.f("HealthTrendCard", "refresh");
        F0(true);
    }

    @Override // com.heytap.health.main.wristtemperature.common.HealthBaseCard
    public void T() {
        super.T();
        this.insightService.W0().removeObserver(this.syncObserver);
    }

    @Override // com.heytap.health.main.wristtemperature.common.HealthBaseCard
    public void V() {
        super.V();
        m8b.f("HealthTrendCard", "requestDataFirstTime");
        F0(true);
    }

    @Override // com.heytap.health.main.wristtemperature.common.HealthBaseCard
    public void X(@Nullable Context context) {
        int iB;
        ActivityTransitionUtil.a aVar = ActivityTransitionUtil.Companion;
        FragmentActivity fragmentActivity = this.k;
        Intrinsics.checkNotNullExpressionValue(fragmentActivity, "mActivity");
        HealthCommonCardView healthCommonCardView = this.t;
        Intrinsics.checkNotNullExpressionValue(healthCommonCardView, "healthCommonCardView");
        ActivityOptionsCompat activityOptionsCompatA = aVar.a(fragmentActivity, healthCommonCardView);
        if (this.isEmpty) {
            Postcard postcardWithString = e1.d().b("/health/InsightIntroductionActivity").withString("CUS_TRANSITION_NAME", this.t.getTransitionName());
            postcardWithString.withOptionsCompat(ActivityOptionsCompat.fromBundle(activityOptionsCompatA != null ? activityOptionsCompatA.toBundle() : null));
            postcardWithString.navigation(this.k);
            return;
        }
        Postcard postcardWithString2 = e1.d().b("/health/InsightTrendActivity").withString("CUS_TRANSITION_NAME", this.t.getTransitionName());
        RecentDataBean recentDataBean = this.recentData;
        if (recentDataBean != null) {
            iB = recentDataBean.getDate();
        } else {
            LocalDate localDateNow = LocalDate.now();
            Intrinsics.checkNotNullExpressionValue(localDateNow, "now()");
            iB = h15.B(localDateNow);
        }
        Postcard postcardWithInt = postcardWithString2.withInt("key_date", iB);
        postcardWithInt.withOptionsCompat(ActivityOptionsCompat.fromBundle(activityOptionsCompatA != null ? activityOptionsCompatA.toBundle() : null));
        postcardWithInt.navigation(this.k);
    }

    @Override // com.heytap.health.main.wristtemperature.common.HealthBaseCard
    public void c() {
        super.c();
        G0(this, false, 1, null);
    }

    public final int n0(int color, int alphaPercent) {
        return (RangesKt.coerceIn((alphaPercent * FitnessProto$FitnessCmdId.CMD_SEND_GEO_FENCE_TO_DEVICE_VALUE) / 100, 0, FitnessProto$FitnessCmdId.CMD_SEND_GEO_FENCE_TO_DEVICE_VALUE) << 24) | (color & 16777215);
    }

    public final void o0(ImageView imageView, RecentDataItem item) {
        if (item.getDataType() == 1) {
            Integer numZ0 = z0(item);
            if (numZ0 == null) {
                m8b.f("HealthTrendCard", "bindDataIcon iconRes == null");
                imageView.setVisibility(8);
                return;
            }
            imageView.setImageResource(numZ0.intValue());
        } else {
            d88.h(imageView.getContext(), item.getIcon(), imageView);
        }
        imageView.setVisibility(0);
    }

    public final LocalCardUiModel p0(u11 contentLogic) {
        if (contentLogic == null) {
            return null;
        }
        HealthTrendTextHelper healthTrendTextHelper = HealthTrendTextHelper.INSTANCE;
        FragmentActivity fragmentActivity = this.k;
        Intrinsics.checkNotNullExpressionValue(fragmentActivity, "mActivity");
        return healthTrendTextHelper.a(fragmentActivity, contentLogic);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object q0(int i, r9b r9bVar, int i2, Continuation<? super u11> continuation) {
        HealthTrendCard$computeContentLogicByType$1 healthTrendCard$computeContentLogicByType$1;
        HrvModuleLogic stepModuleLogic;
        Object next;
        if (continuation instanceof HealthTrendCard$computeContentLogicByType$1) {
            healthTrendCard$computeContentLogicByType$1 = (HealthTrendCard$computeContentLogicByType$1) continuation;
            int i3 = healthTrendCard$computeContentLogicByType$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                healthTrendCard$computeContentLogicByType$1.label = i3 - Integer.MIN_VALUE;
            } else {
                healthTrendCard$computeContentLogicByType$1 = new HealthTrendCard$computeContentLogicByType$1(this, continuation);
            }
        } else {
            healthTrendCard$computeContentLogicByType$1 = new HealthTrendCard$computeContentLogicByType$1(this, continuation);
        }
        Object objB = healthTrendCard$computeContentLogicByType$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = healthTrendCard$computeContentLogicByType$1.label;
        try {
            if (i4 == 0) {
                ResultKt.throwOnFailure(objB);
                switch (i) {
                    case 1:
                        stepModuleLogic = new StepModuleLogic();
                        break;
                    case 2:
                        stepModuleLogic = new CalorieModuleLogic();
                        break;
                    case 3:
                        stepModuleLogic = new SleepModuleLogic();
                        break;
                    case 4:
                        stepModuleLogic = new SnoreModuleLogic();
                        break;
                    case 5:
                        stepModuleLogic = new HeartRateModuleLogic();
                        break;
                    case 6:
                        stepModuleLogic = new HrvModuleLogic();
                        break;
                    default:
                        m8b.m("HealthTrendCard", "computeContentLogicByType: unknown type=" + i);
                        return null;
                }
                LocalDate localDateOf = LocalDate.of(i2 / 10000, (i2 % 10000) / 100, i2 % 100);
                Intrinsics.checkNotNullExpressionValue(localDateOf, "queryDate");
                healthTrendCard$computeContentLogicByType$1.L$0 = r9bVar;
                healthTrendCard$computeContentLogicByType$1.label = 1;
                objB = stepModuleLogic.b(localDateOf, healthTrendCard$computeContentLogicByType$1);
                if (objB == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r9bVar = (r9b) healthTrendCard$computeContentLogicByType$1.L$0;
                ResultKt.throwOnFailure(objB);
            }
            Iterator it = ((List) objB).iterator();
            while (it.hasNext()) {
                next = it.next();
                if (Intrinsics.areEqual(((u11) next).h(), r9bVar)) {
                    return (u11) next;
                }
            }
            next = null;
            return (u11) next;
        } catch (Exception e) {
            m8b.c("HealthTrendCard", "computeContentLogicByType error: " + e.getMessage(), e);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:50:0x0119  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:93:0x025d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x0119 -> B:51:0x0144). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x0174 -> B:92:0x025a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:67:0x019b -> B:103:0x01a4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:90:0x0231 -> B:91:0x0255). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object r0(com.heytap.health.insight.data.datasource.net.RecentDataBean r20, java.util.Set<java.lang.String> r21, kotlin.coroutines.Continuation<? super java.util.Map<java.lang.String, com.heytap.health.main.wristtemperature.HealthTrendCard.LocalCardUiModel>> r22) {
        /*
            Method dump skipped, instruction units count: 614
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.heytap.health.main.wristtemperature.HealthTrendCard.r0(com.heytap.health.insight.data.datasource.net.RecentDataBean, java.util.Set, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final GradientDrawable s0(int themeColor, int radiusDp, int alphaPercent, Context context) {
        float f = context.getResources().getDisplayMetrics().density * radiusDp;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(f);
        gradientDrawable.setColor(n0(themeColor, alphaPercent));
        return gradientDrawable;
    }

    @Override // com.heytap.health.main.wristtemperature.common.HealthBaseCard
    @NotNull
    public HomeCardDataEnum.DataType t() {
        return HomeCardDataEnum.DataType.HEALTH_TREND;
    }

    public final void t0() {
        m8b.f("HealthTrendCard", "fetchRecentData");
        FragmentActivity fragmentActivity = this.k;
        Intrinsics.checkNotNullExpressionValue(fragmentActivity, "mActivity");
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(fragmentActivity), zr8.INSTANCE.e(), (CoroutineStart) null, new HealthTrendCard$fetchRecentData$1(this, null), 2, (Object) null);
    }

    public final String u0(long dateTime, Context context) {
        LocalDate localDateNow = LocalDate.now();
        LocalDate localDateD = h15.D(dateTime);
        if (Intrinsics.areEqual(localDateD, localDateNow)) {
            String string = context.getString(com.heytap.health.base.R.string.lib_base_chart_today);
            Intrinsics.checkNotNullExpressionValue(string, "{\n                contex…hart_today)\n            }");
            return string;
        }
        if (localDateD.getYear() == localDateNow.getYear()) {
            String strG = lo9.g(dateTime, "MMMd");
            Intrinsics.checkNotNullExpressionValue(strG, "{\n                // 今年：…me, \"MMMd\")\n            }");
            return strG;
        }
        String strG2 = lo9.g(dateTime, "yyyMMMd");
        Intrinsics.checkNotNullExpressionValue(strG2, "{\n                // 非今年… \"yyyMMMd\")\n            }");
        return strG2;
    }

    public final Drawable v0(RecentDataItem item, Context context) {
        return s0(A0(w0(item)), 8, 4, context);
    }

    public final Integer w0(RecentDataItem item) {
        Integer color;
        boolean z = true;
        if (item.getDataType() == 1) {
            String code = item.getCode();
            int iIntValue = 0;
            if (code != null && code.length() != 0) {
                z = false;
            }
            if (!z) {
                LocalCardUiModel localCardUiModel = this.computedUiModelCache.get(item.getCode());
                if (localCardUiModel != null && (color = localCardUiModel.getColor()) != null) {
                    iIntValue = color.intValue();
                }
                return Integer.valueOf(iIntValue);
            }
        }
        return Integer.valueOf(Intrinsics.areEqual(item.getAlert(), Boolean.TRUE) ? 1 : 0);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0065  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a6  */
    public final List<RecentDataItem> x0() {
        List dataList;
        boolean z;
        boolean z2;
        RecentDataBean recentDataBean = this.recentData;
        if (recentDataBean == null || (dataList = recentDataBean.getDataList()) == null) {
            return CollectionsKt.emptyList();
        }
        List list = dataList;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            RecentDataItem recentDataItem = (RecentDataItem) next;
            if (recentDataItem.getDataType() == 2 && recentDataItem.getType() != null && recentDataItem.getCode() != null) {
                Set<Triple<Integer, Integer, String>> set = this.allowedCloudKeys;
                Integer type = recentDataItem.getType();
                Intrinsics.checkNotNull(type);
                Integer subType = recentDataItem.getSubType();
                Integer numValueOf = Integer.valueOf(subType != null ? subType.intValue() : 0);
                String code = recentDataItem.getCode();
                Intrinsics.checkNotNull(code);
                z2 = set.contains(new Triple(type, numValueOf, code));
            }
            if (z2) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            RecentDataItem recentDataItem2 = (RecentDataItem) obj;
            if (recentDataItem2.getDataType() == 1 && CollectionsKt.contains(this.allowedSingleDimenCodes, recentDataItem2.getCode())) {
                ConcurrentHashMap<String, LocalCardUiModel> concurrentHashMap = this.computedUiModelCache;
                String code2 = recentDataItem2.getCode();
                if (code2 == null) {
                    code2 = "";
                }
                if (concurrentHashMap.containsKey(code2)) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            if (z) {
                arrayList2.add(obj);
            }
        }
        return CollectionsKt.take(CollectionsKt.plus(arrayList, arrayList2), 5);
    }

    @Override // com.heytap.health.main.wristtemperature.common.HealthBaseCard
    @NotNull
    public HomeCardDataEnum.CardUiMode y() {
        return HomeCardDataEnum.CardUiMode.CARD_HALF_LINE_FOLLOWED;
    }

    public final String y0(RecentDataItem item, Context context) {
        LocalCardUiModel localCardUiModel;
        String content;
        int dataType = item.getDataType();
        boolean z = true;
        if (dataType == 1) {
            String code = item.getCode();
            if (code != null && code.length() != 0) {
                z = false;
            }
            if (z || (localCardUiModel = this.computedUiModelCache.get(item.getCode())) == null || (content = localCardUiModel.getContent()) == null) {
                return "";
            }
        } else if (dataType != 2 || (content = item.getContent()) == null) {
            return "";
        }
        return content;
    }

    public final Integer z0(RecentDataItem item) {
        if (s9b.INSTANCE.b(item.getCode(), item.getType()) == Snore.SNORE_RISK_WEEK) {
            return Integer.valueOf(R.drawable.health_trend_warning);
        }
        Integer type = item.getType();
        if (type != null && type.intValue() == 1) {
            return Integer.valueOf(R.drawable.health_trend_step);
        }
        if (type != null && type.intValue() == 2) {
            return Integer.valueOf(R.drawable.health_trend_consumption);
        }
        if (type != null && type.intValue() == 3) {
            return Integer.valueOf(R.drawable.health_trend_sleep);
        }
        if (type != null && type.intValue() == 4) {
            return Integer.valueOf(R.drawable.health_trend_snore);
        }
        if (type != null && type.intValue() == 5) {
            return Integer.valueOf(R.drawable.health_trend_heartrate);
        }
        if (type != null && type.intValue() == 6) {
            return Integer.valueOf(R.drawable.health_trend_hrv);
        }
        return null;
    }
}