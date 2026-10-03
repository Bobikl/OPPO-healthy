package com.heytap.health.sleep.service.homecard;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.heytap.databaseengine.api.RxExtendKt;
import com.heytap.databaseengine.model.SleepDataStat;
import com.heytap.databaseengine.model.snore.OsaResultBean;
import com.heytap.health.base.task.ThreadUtils;
import com.heytap.health.core.widget.charts.data.SnoreLevelData;
import com.heytap.health.health.insight.InsightService;
import com.heytap.health.health.insight.Sleep;
import com.heytap.health.health.insight.Snore;
import com.heytap.health.sleep.R$string;
import com.heytap.health.sleep.bean.SleepDayBean;
import com.heytap.health.sleep.service.homecard.SleepCardServiceImpl;
import com.heytap.health.sleep.snore.SnoreHistoryActivity;
import com.heytap.health.sleep.snore.bean.SnoreWeekBean;
import com.heytap.health.sleep.snore.week.model.SnoreWeekTransform;
import com.heytap.health.sleep.week.model.SleepWeekLawTransform;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.be1;
import com.oplus.aiunit.vision.cn;
import com.oplus.aiunit.vision.ddd;
import com.oplus.aiunit.vision.e1;
import com.oplus.aiunit.vision.gih;
import com.oplus.aiunit.vision.gxf;
import com.oplus.aiunit.vision.inh;
import com.oplus.aiunit.vision.iuh;
import com.oplus.aiunit.vision.kuh;
import com.oplus.aiunit.vision.l9b;
import com.oplus.aiunit.vision.l9h;
import com.oplus.aiunit.vision.m8b;
import com.oplus.aiunit.vision.mfh;
import com.oplus.aiunit.vision.pr8;
import com.oplus.aiunit.vision.q2i;
import com.oplus.aiunit.vision.r9b;
import com.oplus.aiunit.vision.s15;
import com.oplus.aiunit.vision.tqh;
import com.oplus.aiunit.vision.unh;
import com.oplus.aiunit.vision.w4i;
import com.oplus.aiunit.vision.yuh;
import com.oplus.aiunit.vision.zeh;
import com.oplus.aiunit.vision.zuh;
import io.protostuff.MapSchema;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.ResultKt;
import p010kotlin.Unit;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.collections.CollectionsKt__IterablesKt;
import p010kotlin.collections.CollectionsKt___CollectionsKt;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.coroutines.jvm.internal.Boxing;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes18.dex */
@StabilityInferred(parameters = 0)
@Route(path = "/sleep/SleepCardServiceImpl")
@Metadata(d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0007\u0018\u0000 _2\u00020\u0001:\u0003`abB\u0007¢\u0006\u0004\b]\u0010^J#\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0083@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0083@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\u0007J \u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0005H\u0002J\u0010\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\bH\u0002J\u0010\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0002J,\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u0019H\u0002J6\u0010 \u001a\u00020\u001c2\u0006\u0010\u0016\u001a\u00020\u001e2\u0006\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001f\u001a\u00020\u001c2\b\b\u0002\u0010\u001b\u001a\u00020\u0019H\u0002J\u0019\u0010#\u001a\u0004\u0018\u00010\u00192\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b#\u0010$J1\u0010'\u001a\b\u0012\u0004\u0012\u00020&0%2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b'\u0010(J1\u0010)\u001a\b\u0012\u0004\u0012\u00020&0%2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b)\u0010(J\u0012\u0010*\u001a\u00020\u000f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016R\u001b\u00100\u001a\u00020+8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0014\u00104\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u001b\u00109\u001a\u0002058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b6\u0010-\u001a\u0004\b7\u00108R\u0016\u0010=\u001a\u00020:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0016\u0010A\u001a\u00020>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010E\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010I\u001a\u00020F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010M\u001a\u00020J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0016\u0010P\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010OR\u0016\u0010R\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010OR\u0016\u0010T\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010OR\u0016\u0010V\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010OR\u0016\u0010X\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010OR\u0016\u0010Z\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010OR\u0016\u0010\\\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010O\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006c"}, d2 = {"Lcom/heytap/health/sleep/service/homecard/SleepCardServiceImpl;", "Lcom/heytap/health/sleep/service/homecard/SleepCardService;", "", "startTime", "endTime", "Lcom/heytap/health/sleep/service/homecard/SleepCardServiceImpl$b;", "wb", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/heytap/health/sleep/service/homecard/SleepCardServiceImpl$c;", "Bb", "Lcom/heytap/health/sleep/snore/bean/SnoreWeekBean;", "snoreWeekBean", "Lcom/oplus/aiunit/vision/q2i;", "nb", "sleepHomeCardData", "", gxf.PROTO, "snoreHomeCardData", "qb", "", "score", "ob", "type", "Landroid/content/Context;", "context", "", "whetherUp", "isShowSleepApnea", "", "ub", "Lcom/oplus/aiunit/vision/r9b;", "fillValue", "sb", "Lcom/oplus/aiunit/vision/unh;", "sleepLawBean", "Gb", "(Lcom/oplus/aiunit/vision/unh;)Ljava/lang/Boolean;", "", "Lcom/oplus/aiunit/vision/l9h;", "K4", "(Landroid/content/Context;JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "y8", "init", "Lcom/heytap/health/health/insight/InsightService;", "i", "Lkotlin/Lazy;", "rb", "()Lcom/heytap/health/health/insight/InsightService;", "insightService", "Lcom/oplus/aiunit/vision/yuh;", "j", "Lcom/oplus/aiunit/vision/yuh;", "sleepWeekDataRepository", "Lcom/oplus/aiunit/vision/gih;", MapSchema.FIELD_NAME_KEY, "Ab", "()Lcom/oplus/aiunit/vision/gih;", "sleepDayDataRepository", "Lcom/oplus/aiunit/vision/zuh;", LogFieldKey.LEVEL_KEY, "Lcom/oplus/aiunit/vision/zuh;", "transform", "Lcom/heytap/health/sleep/week/model/SleepWeekLawTransform;", LogFieldKey.MESSAGE_KEY, "Lcom/heytap/health/sleep/week/model/SleepWeekLawTransform;", "sleepWeekLawTransform", "Lcom/oplus/aiunit/vision/w4i;", "n", "Lcom/oplus/aiunit/vision/w4i;", "snoreWeekRepository", "Lcom/heytap/health/sleep/snore/week/model/SnoreWeekTransform;", "o", "Lcom/heytap/health/sleep/snore/week/model/SnoreWeekTransform;", "snoreWeekTransform", "Lcom/oplus/aiunit/vision/inh;", LogFieldKey.PROCESS_NAME_KEY, "Lcom/oplus/aiunit/vision/inh;", "sleepHomeCardWorkUtil", "q", "Z", "showSleepScoreCard", "r", "showSleepTimeCard", "s", "showSleepLawCard", "t", "showSnoreRiskCard", "u", "showSnoreDbCard", "v", "showSnoreNumCard", "w", "showSnoreTimeCard", "<init>", "()V", "Companion", "a", "b", "c", "sleep_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSleepCardServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SleepCardServiceImpl.kt\ncom/heytap/health/sleep/service/homecard/SleepCardServiceImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,979:1\n1549#2:980\n1620#2,3:981\n766#2:984\n857#2,2:985\n766#2:987\n857#2,2:988\n766#2:990\n857#2,2:991\n766#2:993\n857#2,2:994\n766#2:996\n857#2,2:997\n766#2:999\n857#2,2:1000\n*S KotlinDebug\n*F\n+ 1 SleepCardServiceImpl.kt\ncom/heytap/health/sleep/service/homecard/SleepCardServiceImpl\n*L\n196#1:980\n196#1:981,3\n439#1:984\n439#1:985,2\n442#1:987\n442#1:988,2\n475#1:990\n475#1:991,2\n478#1:993\n478#1:994,2\n481#1:996\n481#1:997,2\n483#1:999\n483#1:1000,2\n*E\n"})
public final class SleepCardServiceImpl implements SleepCardService {

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final yuh sleepWeekDataRepository;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final w4i snoreWeekRepository;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public boolean showSleepScoreCard;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    public boolean showSleepTimeCard;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    public boolean showSleepLawCard;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    public boolean showSnoreRiskCard;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    public boolean showSnoreDbCard;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    public boolean showSnoreNumCard;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    public boolean showSnoreTimeCard;
    public static final int $stable = 8;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final Lazy insightService = LazyKt__LazyJVMKt.lazy(new Function0<InsightService>() { // from class: com.heytap.health.sleep.service.homecard.SleepCardServiceImpl$insightService$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p010kotlin.jvm.functions.Function0
        public final InsightService invoke() {
            return (InsightService) e1.d().h(InsightService.class);
        }
    });

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final Lazy sleepDayDataRepository = LazyKt__LazyJVMKt.lazy(new Function0<gih>() { // from class: com.heytap.health.sleep.service.homecard.SleepCardServiceImpl$sleepDayDataRepository$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final gih invoke() {
            return new gih();
        }
    });

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public zuh transform = new zuh();

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public SleepWeekLawTransform sleepWeekLawTransform = new SleepWeekLawTransform();

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    public final SnoreWeekTransform snoreWeekTransform = new SnoreWeekTransform();

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    public final inh sleepHomeCardWorkUtil = new inh();

    /* JADX INFO: renamed from: com.heytap.health.sleep.service.homecard.SleepCardServiceImpl$b, reason: from toString */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000f\u001a\u00020\t\u0012\u0006\u0010\u0016\u001a\u00020\u0010¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u000f\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u0016\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Lcom/heytap/health/sleep/service/homecard/SleepCardServiceImpl$b;", "", "", "toString", "", "hashCode", "other", "", "equals", "Lcom/oplus/aiunit/vision/mfh;", "a", "Lcom/oplus/aiunit/vision/mfh;", "()Lcom/oplus/aiunit/vision/mfh;", "setSleepDataComparedBean", "(Lcom/oplus/aiunit/vision/mfh;)V", "sleepDataComparedBean", "Lcom/oplus/aiunit/vision/unh;", "b", "Lcom/oplus/aiunit/vision/unh;", "()Lcom/oplus/aiunit/vision/unh;", "setSleepLawBean", "(Lcom/oplus/aiunit/vision/unh;)V", "sleepLawBean", "<init>", "(Lcom/oplus/aiunit/vision/mfh;Lcom/oplus/aiunit/vision/unh;)V", "sleep_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class SleepHomeCardData {
        public static final int $stable = 8;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @NotNull
        public mfh sleepDataComparedBean;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @NotNull
        public unh sleepLawBean;

        public SleepHomeCardData(@NotNull mfh sleepDataComparedBean, @NotNull unh sleepLawBean) {
            Intrinsics.checkNotNullParameter(sleepDataComparedBean, "sleepDataComparedBean");
            Intrinsics.checkNotNullParameter(sleepLawBean, "sleepLawBean");
            this.sleepDataComparedBean = sleepDataComparedBean;
            this.sleepLawBean = sleepLawBean;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final mfh getSleepDataComparedBean() {
            return this.sleepDataComparedBean;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final unh getSleepLawBean() {
            return this.sleepLawBean;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SleepHomeCardData)) {
                return false;
            }
            SleepHomeCardData sleepHomeCardData = (SleepHomeCardData) other;
            return Intrinsics.areEqual(this.sleepDataComparedBean, sleepHomeCardData.sleepDataComparedBean) && Intrinsics.areEqual(this.sleepLawBean, sleepHomeCardData.sleepLawBean);
        }

        public int hashCode() {
            return (this.sleepDataComparedBean.hashCode() * 31) + this.sleepLawBean.hashCode();
        }

        @NotNull
        public String toString() {
            return "SleepHomeCardData(sleepDataComparedBean=" + this.sleepDataComparedBean + ", sleepLawBean=" + this.sleepLawBean + ")";
        }
    }

    /* JADX INFO: renamed from: com.heytap.health.sleep.service.homecard.SleepCardServiceImpl$c, reason: from toString */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0010\u001a\u00020\t\u0012\u0006\u0010\u0013\u001a\u00020\t\u0012\u0006\u0010\u0018\u001a\u00020\u0004\u0012\u0006\u0010 \u001a\u00020\u0019\u0012\u0006\u0010&\u001a\u00020!¢\u0006\u0004\b'\u0010(J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0010\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0013\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u000b\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\"\u0010\u0018\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0014\u001a\u0004\b\n\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010 \u001a\u00020\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010&\u001a\u00020!8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\"\u001a\u0004\b\u001a\u0010#\"\u0004\b$\u0010%¨\u0006)"}, d2 = {"Lcom/heytap/health/sleep/service/homecard/SleepCardServiceImpl$c;", "", "", "toString", "", "hashCode", "other", "", "equals", "", "a", "J", "c", "()J", "setBorderStartTime", "(J)V", SnoreHistoryActivity.BORDER_START_TIME, "b", "setBorderEndTime", SnoreHistoryActivity.BORDER_END_TIME, "I", "()I", "setAverageLevel", "(I)V", "averageLevel", "Lcom/heytap/health/sleep/snore/bean/SnoreWeekBean;", "d", "Lcom/heytap/health/sleep/snore/bean/SnoreWeekBean;", MapSchema.FIELD_NAME_ENTRY, "()Lcom/heytap/health/sleep/snore/bean/SnoreWeekBean;", "setSnoreWeekBean", "(Lcom/heytap/health/sleep/snore/bean/SnoreWeekBean;)V", "snoreWeekBean", "Lcom/oplus/aiunit/vision/q2i;", "Lcom/oplus/aiunit/vision/q2i;", "()Lcom/oplus/aiunit/vision/q2i;", "setSnoreRangeControlBean", "(Lcom/oplus/aiunit/vision/q2i;)V", "snoreRangeControlBean", "<init>", "(JJILcom/heytap/health/sleep/snore/bean/SnoreWeekBean;Lcom/oplus/aiunit/vision/q2i;)V", "sleep_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class SnoreHomeCardData {
        public static final int $stable = 8;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        public long borderStartTime;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        public long borderEndTime;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        public int averageLevel;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
        @NotNull
        public SnoreWeekBean snoreWeekBean;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public q2i snoreRangeControlBean;

        public SnoreHomeCardData(long j2, long j3, int i, @NotNull SnoreWeekBean snoreWeekBean, @NotNull q2i snoreRangeControlBean) {
            Intrinsics.checkNotNullParameter(snoreWeekBean, "snoreWeekBean");
            Intrinsics.checkNotNullParameter(snoreRangeControlBean, "snoreRangeControlBean");
            this.borderStartTime = j2;
            this.borderEndTime = j3;
            this.averageLevel = i;
            this.snoreWeekBean = snoreWeekBean;
            this.snoreRangeControlBean = snoreRangeControlBean;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getAverageLevel() {
            return this.averageLevel;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final long getBorderEndTime() {
            return this.borderEndTime;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final long getBorderStartTime() {
            return this.borderStartTime;
        }

        @NotNull
        /* JADX INFO: renamed from: d, reason: from getter */
        public final q2i getSnoreRangeControlBean() {
            return this.snoreRangeControlBean;
        }

        @NotNull
        /* JADX INFO: renamed from: e, reason: from getter */
        public final SnoreWeekBean getSnoreWeekBean() {
            return this.snoreWeekBean;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SnoreHomeCardData)) {
                return false;
            }
            SnoreHomeCardData snoreHomeCardData = (SnoreHomeCardData) other;
            return this.borderStartTime == snoreHomeCardData.borderStartTime && this.borderEndTime == snoreHomeCardData.borderEndTime && this.averageLevel == snoreHomeCardData.averageLevel && Intrinsics.areEqual(this.snoreWeekBean, snoreHomeCardData.snoreWeekBean) && Intrinsics.areEqual(this.snoreRangeControlBean, snoreHomeCardData.snoreRangeControlBean);
        }

        public int hashCode() {
            return (((((((Long.hashCode(this.borderStartTime) * 31) + Long.hashCode(this.borderEndTime)) * 31) + Integer.hashCode(this.averageLevel)) * 31) + this.snoreWeekBean.hashCode()) * 31) + this.snoreRangeControlBean.hashCode();
        }

        @NotNull
        public String toString() {
            return "SnoreHomeCardData(borderStartTime=" + this.borderStartTime + ", borderEndTime=" + this.borderEndTime + ", snoreWeekBean=" + this.snoreWeekBean + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u00072\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002(\u0010\u0006\u001a$\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0010\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u00030\u00050\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "Lcom/heytap/databaseengine/model/SleepDataStat;", "o1", "Lcom/heytap/health/sleep/bean/SleepDayBean;", "kotlin.jvm.PlatformType", "", "o2", "Lcom/heytap/health/sleep/service/homecard/SleepCardServiceImpl$b;", "a", "(Ljava/util/List;Ljava/util/List;)Lcom/heytap/health/sleep/service/homecard/SleepCardServiceImpl$b;"}, k = 3, mv = {1, 8, 0})
    public static final class d<T1, T2, R> implements be1 {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ long f6846j;
        public final /* synthetic */ long k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ long f6847l;
        public final /* synthetic */ long m;

        public d(long j2, long j3, long j4, long j5) {
            this.f6846j = j2;
            this.k = j3;
            this.f6847l = j4;
            this.m = j5;
        }

        @Override // com.oplus.aiunit.vision.be1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SleepHomeCardData apply(@NotNull List<SleepDataStat> o1, @NotNull List<SleepDayBean> o2) {
            Intrinsics.checkNotNullParameter(o1, "o1");
            Intrinsics.checkNotNullParameter(o2, "o2");
            return new SleepHomeCardData(SleepCardServiceImpl.this.transform.e(this.k, this.f6847l, SleepCardServiceImpl.this.transform.b(this.f6846j, this.k, this.f6847l, o1).f()), SleepCardServiceImpl.this.sleepWeekLawTransform.a(this.f6846j, this.m, this.k, this.f6847l, o2));
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Lcom/heytap/databaseengine/model/SleepDataStat;", "o1", "Lcom/heytap/databaseengine/model/snore/OsaResultBean;", "o2", "Lcom/heytap/health/sleep/service/homecard/SleepCardServiceImpl$c;", "a", "(Ljava/util/List;Ljava/util/List;)Lcom/heytap/health/sleep/service/homecard/SleepCardServiceImpl$c;"}, k = 3, mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nSleepCardServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SleepCardServiceImpl.kt\ncom/heytap/health/sleep/service/homecard/SleepCardServiceImpl$getSnoreCardData$snoreHomeCardData$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,979:1\n766#2:980\n857#2,2:981\n766#2:983\n857#2,2:984\n*S KotlinDebug\n*F\n+ 1 SleepCardServiceImpl.kt\ncom/heytap/health/sleep/service/homecard/SleepCardServiceImpl$getSnoreCardData$snoreHomeCardData$1\n*L\n375#1:980\n375#1:981,2\n377#1:983\n377#1:984,2\n*E\n"})
    public static final class e<T1, T2, R> implements be1 {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ long f6848j;
        public final /* synthetic */ long k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ long f6849l;

        public e(long j2, long j3, long j4) {
            this.f6848j = j2;
            this.k = j3;
            this.f6849l = j4;
        }

        @Override // com.oplus.aiunit.vision.be1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SnoreHomeCardData apply(@NotNull List<SleepDataStat> o1, @NotNull List<OsaResultBean> o2) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(o1, "o1");
            Intrinsics.checkNotNullParameter(o2, "o2");
            zeh zehVarA = SleepCardServiceImpl.this.transform.a(o1);
            SnoreWeekBean snoreWeekBeanB = SleepCardServiceImpl.this.snoreWeekTransform.b(this.f6848j, this.k, o2);
            if (snoreWeekBeanB.getIsShowSleepApnea()) {
                List<SnoreLevelData> sleepApneaDataList = snoreWeekBeanB.getSleepApneaDataList();
                long j2 = this.f6849l;
                arrayList = new ArrayList();
                for (Object obj : sleepApneaDataList) {
                    if (((SnoreLevelData) obj).getTimestamp() >= j2) {
                        arrayList.add(obj);
                    }
                }
            } else {
                List<SnoreLevelData> snoreLevelDataList = snoreWeekBeanB.getSnoreLevelDataList();
                long j3 = this.f6849l;
                arrayList = new ArrayList();
                for (Object obj2 : snoreLevelDataList) {
                    if (((SnoreLevelData) obj2).getTimestamp() >= j3) {
                        arrayList.add(obj2);
                    }
                }
            }
            SnoreWeekBean snoreWeekBean = new SnoreWeekBean();
            if (snoreWeekBeanB.getIsShowSleepApnea()) {
                snoreWeekBean.getSleepApneaDataList().addAll(arrayList);
            } else {
                snoreWeekBean.getSnoreLevelDataList().addAll(arrayList);
            }
            snoreWeekBean.setEmpty(snoreWeekBeanB.getIsEmpty());
            snoreWeekBean.setShowSleepApnea(snoreWeekBeanB.getIsShowSleepApnea());
            return new SnoreHomeCardData(zehVarA.getChartStartTime(), zehVarA.getChartEndTime(), SleepCardServiceImpl.this.snoreWeekTransform.c(0, arrayList.size() - 1, CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList)), snoreWeekBean, SleepCardServiceImpl.this.nb(snoreWeekBeanB, this.f6849l, this.k));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SleepCardServiceImpl() {
        int i = 1;
        this.sleepWeekDataRepository = new yuh(null, i, 0 == true ? 1 : 0);
        this.snoreWeekRepository = new w4i(0 == true ? 1 : 0, i, 0 == true ? 1 : 0);
    }

    public static final void Cb(SnoreDbHomeCard snoreDbHomeCard, Context context, SnoreHomeCardData snoreHomeCardData, long j2) {
        Intrinsics.checkNotNullParameter(snoreDbHomeCard, "$snoreDbHomeCard");
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(snoreHomeCardData, "$snoreHomeCardData");
        snoreDbHomeCard.f(context);
        q2i snoreRangeControlBean = snoreHomeCardData.getSnoreRangeControlBean();
        long borderStartTime = snoreHomeCardData.getBorderStartTime();
        long borderEndTime = snoreHomeCardData.getBorderEndTime();
        pr8 pr8Var = pr8.INSTANCE;
        snoreDbHomeCard.h(snoreRangeControlBean, borderStartTime, borderEndTime, pr8Var.o(j2), pr8Var.n(j2));
    }

    public static final void Db(SnoreTimeHomeCard snoreTimeHomeCard, Context context, SnoreHomeCardData snoreHomeCardData, long j2) {
        Intrinsics.checkNotNullParameter(snoreTimeHomeCard, "$snoreTimeHomeCard");
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(snoreHomeCardData, "$snoreHomeCardData");
        snoreTimeHomeCard.f(context);
        q2i snoreRangeControlBean = snoreHomeCardData.getSnoreRangeControlBean();
        long borderStartTime = snoreHomeCardData.getBorderStartTime();
        long borderEndTime = snoreHomeCardData.getBorderEndTime();
        pr8 pr8Var = pr8.INSTANCE;
        snoreTimeHomeCard.h(snoreRangeControlBean, borderStartTime, borderEndTime, pr8Var.o(j2), pr8Var.n(j2));
    }

    public static final void Eb(SnoreNumHomeCard snoreNumHomeCard, Context context, SnoreHomeCardData snoreHomeCardData, long j2) {
        Intrinsics.checkNotNullParameter(snoreNumHomeCard, "$snoreNumHomeCard");
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(snoreHomeCardData, "$snoreHomeCardData");
        snoreNumHomeCard.f(context);
        q2i snoreRangeControlBean = snoreHomeCardData.getSnoreRangeControlBean();
        long borderStartTime = snoreHomeCardData.getBorderStartTime();
        long borderEndTime = snoreHomeCardData.getBorderEndTime();
        pr8 pr8Var = pr8.INSTANCE;
        snoreNumHomeCard.h(snoreRangeControlBean, borderStartTime, borderEndTime, pr8Var.o(j2), pr8Var.n(j2));
    }

    public static final void Fb(SnoreRiskHomeCard snoreRiskHomeCard, Context context, SnoreHomeCardData snoreHomeCardData, long j2) {
        Intrinsics.checkNotNullParameter(snoreRiskHomeCard, "$snoreRiskHomeCard");
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(snoreHomeCardData, "$snoreHomeCardData");
        snoreRiskHomeCard.j(context);
        SnoreWeekBean snoreWeekBean = snoreHomeCardData.getSnoreWeekBean();
        int averageLevel = snoreHomeCardData.getAverageLevel();
        long borderStartTime = snoreHomeCardData.getBorderStartTime();
        long borderEndTime = snoreHomeCardData.getBorderEndTime();
        pr8 pr8Var = pr8.INSTANCE;
        snoreRiskHomeCard.o(snoreWeekBean, averageLevel, borderStartTime, borderEndTime, pr8Var.o(j2), pr8Var.n(j2));
    }

    public static /* synthetic */ String tb(SleepCardServiceImpl sleepCardServiceImpl, r9b r9bVar, Context context, boolean z, String str, boolean z2, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        boolean z3 = z;
        if ((i & 8) != 0) {
            str = "";
        }
        String str2 = str;
        if ((i & 16) != 0) {
            z2 = false;
        }
        return sleepCardServiceImpl.sb(r9bVar, context, z3, str2, z2);
    }

    public static /* synthetic */ String vb(SleepCardServiceImpl sleepCardServiceImpl, int i, Context context, boolean z, boolean z2, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = true;
        }
        if ((i2 & 8) != 0) {
            z2 = false;
        }
        return sleepCardServiceImpl.ub(i, context, z, z2);
    }

    public static final void xb(SleepScoreHomeCard sleepScoreHomeCard, Context context, tqh sleepScoreComparedBean) {
        Intrinsics.checkNotNullParameter(sleepScoreHomeCard, "$sleepScoreHomeCard");
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(sleepScoreComparedBean, "$sleepScoreComparedBean");
        sleepScoreHomeCard.g(context);
        sleepScoreHomeCard.i(sleepScoreComparedBean);
    }

    public static final void yb(SleepTimeHomeCard sleepTimeHomeCard, Context context, kuh sleepTimeComparedBean) {
        Intrinsics.checkNotNullParameter(sleepTimeHomeCard, "$sleepTimeHomeCard");
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(sleepTimeComparedBean, "$sleepTimeComparedBean");
        sleepTimeHomeCard.h(context);
        sleepTimeHomeCard.j(sleepTimeComparedBean);
    }

    public static final void zb(SleepLawHomeCard sleepLawHomeCard, Context context, unh sleepLawBean) {
        Intrinsics.checkNotNullParameter(sleepLawHomeCard, "$sleepLawHomeCard");
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(sleepLawBean, "$sleepLawBean");
        sleepLawHomeCard.h(context);
        sleepLawHomeCard.j(sleepLawBean);
    }

    public final gih Ab() {
        return (gih) this.sleepDayDataRepository.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @SuppressLint({"CheckResult"})
    public final Object Bb(long j2, long j3, Continuation<? super SnoreHomeCardData> continuation) {
        SleepCardServiceImpl$getSnoreCardData$1 sleepCardServiceImpl$getSnoreCardData$1;
        if (continuation instanceof SleepCardServiceImpl$getSnoreCardData$1) {
            sleepCardServiceImpl$getSnoreCardData$1 = (SleepCardServiceImpl$getSnoreCardData$1) continuation;
            int i = sleepCardServiceImpl$getSnoreCardData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                sleepCardServiceImpl$getSnoreCardData$1.label = i - Integer.MIN_VALUE;
            } else {
                sleepCardServiceImpl$getSnoreCardData$1 = new SleepCardServiceImpl$getSnoreCardData$1(this, continuation);
            }
        } else {
            sleepCardServiceImpl$getSnoreCardData$1 = new SleepCardServiceImpl$getSnoreCardData$1(this, continuation);
        }
        SleepCardServiceImpl$getSnoreCardData$1 sleepCardServiceImpl$getSnoreCardData$2 = sleepCardServiceImpl$getSnoreCardData$1;
        Object objC = sleepCardServiceImpl$getSnoreCardData$2.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = sleepCardServiceImpl$getSnoreCardData$2.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objC);
            m8b.f("SleepCardServiceImpl", "getSnoreCardData: startTime:" + j2 + ",endTime:" + j3 + ",");
            ZoneId zoneIdSystemDefault = ZoneId.systemDefault();
            long epochMilli = LocalDateTime.ofInstant(Instant.ofEpochMilli(j3), zoneIdSystemDefault).minusDays(13L).atZone(zoneIdSystemDefault).toInstant().toEpochMilli();
            ddd dddVarJ1 = ddd.j1(this.sleepWeekDataRepository.a(4, 1546257600000L, pr8.INSTANCE.n(System.currentTimeMillis()), 0), this.snoreWeekRepository.b(epochMilli, j3), new e(epochMilli, j3, j2));
            Intrinsics.checkNotNullExpressionValue(dddVarJ1, "@SuppressLint(\"CheckResu…n snoreHomeCardData\n    }");
            sleepCardServiceImpl$getSnoreCardData$2.label = 1;
            objC = RxExtendKt.c(dddVarJ1, sleepCardServiceImpl$getSnoreCardData$2);
            if (objC == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objC);
        }
        Intrinsics.checkNotNullExpressionValue(objC, "@SuppressLint(\"CheckResu…n snoreHomeCardData\n    }");
        return (SnoreHomeCardData) objC;
    }

    public final Boolean Gb(unh sleepLawBean) {
        int iOb = ob(sleepLawBean.getBeforeScore());
        int iOb2 = ob(sleepLawBean.getScore());
        if (iOb == 0 && iOb2 >= 3) {
            return Boolean.TRUE;
        }
        if (iOb == 0 && iOb2 >= 1) {
            return Boolean.FALSE;
        }
        if (Math.abs(iOb - iOb2) >= 2) {
            return Boolean.valueOf(iOb2 > iOb);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // com.heytap.health.sleep.service.homecard.SleepCardService
    @Nullable
    public Object K4(@NotNull Context context, long j2, long j3, @NotNull Continuation<? super List<l9h>> continuation) {
        SleepCardServiceImpl$getSleepCardList$1 sleepCardServiceImpl$getSleepCardList$1;
        final SleepCardServiceImpl sleepCardServiceImpl;
        List list;
        final Context context2;
        String str;
        if (continuation instanceof SleepCardServiceImpl$getSleepCardList$1) {
            sleepCardServiceImpl$getSleepCardList$1 = (SleepCardServiceImpl$getSleepCardList$1) continuation;
            int i = sleepCardServiceImpl$getSleepCardList$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                sleepCardServiceImpl$getSleepCardList$1.label = i - Integer.MIN_VALUE;
            } else {
                sleepCardServiceImpl$getSleepCardList$1 = new SleepCardServiceImpl$getSleepCardList$1(this, continuation);
            }
        } else {
            sleepCardServiceImpl$getSleepCardList$1 = new SleepCardServiceImpl$getSleepCardList$1(this, continuation);
        }
        SleepCardServiceImpl$getSleepCardList$1 sleepCardServiceImpl$getSleepCardList$2 = sleepCardServiceImpl$getSleepCardList$1;
        Object objWb = sleepCardServiceImpl$getSleepCardList$2.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = sleepCardServiceImpl$getSleepCardList$2.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objWb);
            m8b.f("SleepCardServiceImpl", "getSleepCardList startTime:" + j2 + ", endTime:" + j3);
            this.showSleepScoreCard = false;
            this.showSleepTimeCard = false;
            this.showSleepLawCard = false;
            yuh yuhVar = this.sleepWeekDataRepository;
            String ssoid = cn.c().getSsoid();
            Intrinsics.checkNotNullExpressionValue(ssoid, "getAccountManager().ssoid");
            yuhVar.c(ssoid);
            Ab().b = cn.c().getSsoid();
            ArrayList arrayList = new ArrayList();
            sleepCardServiceImpl$getSleepCardList$2.L$0 = this;
            sleepCardServiceImpl$getSleepCardList$2.L$1 = context;
            sleepCardServiceImpl$getSleepCardList$2.L$2 = arrayList;
            sleepCardServiceImpl$getSleepCardList$2.label = 1;
            objWb = wb(j2, j3, sleepCardServiceImpl$getSleepCardList$2);
            if (objWb == coroutine_suspended) {
                return coroutine_suspended;
            }
            sleepCardServiceImpl = this;
            list = arrayList;
            context2 = context;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list = (List) sleepCardServiceImpl$getSleepCardList$2.L$2;
            context2 = (Context) sleepCardServiceImpl$getSleepCardList$2.L$1;
            sleepCardServiceImpl = (SleepCardServiceImpl) sleepCardServiceImpl$getSleepCardList$2.L$0;
            ResultKt.throwOnFailure(objWb);
        }
        SleepHomeCardData sleepHomeCardData = (SleepHomeCardData) objWb;
        sleepCardServiceImpl.pb(sleepHomeCardData);
        if (sleepCardServiceImpl.showSleepScoreCard) {
            final SleepScoreHomeCard sleepScoreHomeCard = new SleepScoreHomeCard(context2);
            sleepScoreHomeCard.setOnCardClick(new Function0<Unit>() { // from class: com.heytap.health.sleep.service.homecard.SleepCardServiceImpl$getSleepCardList$sleepScoreHomeCard$1$1
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
                    this.this$0.rb().t8(Sleep.SLEEP_SCORE_WEEK);
                }
            });
            final tqh sleepScoreComparedBean = sleepHomeCardData.getSleepDataComparedBean().getSleepScoreComparedBean();
            Intrinsics.checkNotNull(sleepScoreComparedBean);
            ThreadUtils.doInUiThread(new Runnable() { // from class: com.oplus.aiunit.vision.veh
                @Override // java.lang.Runnable
                public final void run() {
                    SleepCardServiceImpl.xb(sleepScoreHomeCard, context2, sleepScoreComparedBean);
                }
            });
            int beforeSleepAverageScore = sleepScoreComparedBean.getBeforeSleepAverageScore();
            int afterSleepAverageScore = sleepScoreComparedBean.getAfterSleepAverageScore();
            boolean z = beforeSleepAverageScore < afterSleepAverageScore;
            String strValueOf = String.valueOf(Math.abs(afterSleepAverageScore - beforeSleepAverageScore));
            Sleep sleep = Sleep.SLEEP_SCORE_WEEK;
            list.add(new l9h(sleep, sleepScoreHomeCard, vb(sleepCardServiceImpl, sleep.getId(), context2, z, false, 8, null), tb(sleepCardServiceImpl, sleep, context2, z, strValueOf, false, 16, null), sleepScoreComparedBean));
        }
        if (sleepCardServiceImpl.showSleepTimeCard) {
            final SleepTimeHomeCard sleepTimeHomeCard = new SleepTimeHomeCard(context2);
            sleepTimeHomeCard.setOnCardClick(new Function0<Unit>() { // from class: com.heytap.health.sleep.service.homecard.SleepCardServiceImpl$getSleepCardList$sleepTimeHomeCard$1$1
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
                    this.this$0.rb().t8(Sleep.SLEEP_DURATION_WEEK);
                }
            });
            final kuh sleepTimeComparedBean = sleepHomeCardData.getSleepDataComparedBean().getSleepTimeComparedBean();
            Intrinsics.checkNotNull(sleepTimeComparedBean);
            ThreadUtils.doInUiThread(new Runnable() { // from class: com.oplus.aiunit.vision.weh
                @Override // java.lang.Runnable
                public final void run() {
                    SleepCardServiceImpl.yb(sleepTimeHomeCard, context2, sleepTimeComparedBean);
                }
            });
            iuh afterSleepTimeData = sleepTimeComparedBean.getAfterSleepTimeData();
            int totalSleepAverageTime = afterSleepTimeData != null ? afterSleepTimeData.getTotalSleepAverageTime() : 0;
            iuh beforeSleepTimeData = sleepTimeComparedBean.getBeforeSleepTimeData();
            int totalSleepAverageTime2 = beforeSleepTimeData != null ? beforeSleepTimeData.getTotalSleepAverageTime() : 0;
            boolean z2 = totalSleepAverageTime2 < totalSleepAverageTime;
            String offsetTimeStr = s15.c(Math.abs(totalSleepAverageTime - totalSleepAverageTime2), false);
            Sleep sleep2 = Sleep.SLEEP_DURATION_WEEK;
            String strVb = vb(sleepCardServiceImpl, sleep2.getId(), context2, z2, false, 8, null);
            Intrinsics.checkNotNullExpressionValue(offsetTimeStr, "offsetTimeStr");
            list.add(new l9h(sleep2, sleepTimeHomeCard, strVb, tb(sleepCardServiceImpl, sleep2, context2, z2, offsetTimeStr, false, 16, null), sleepTimeComparedBean));
        }
        if (sleepCardServiceImpl.showSleepLawCard) {
            final SleepLawHomeCard sleepLawHomeCard = new SleepLawHomeCard(context2);
            sleepLawHomeCard.setOnCardClick(new Function0<Unit>() { // from class: com.heytap.health.sleep.service.homecard.SleepCardServiceImpl$getSleepCardList$sleepLawHomeCard$1$1
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
                    this.this$0.rb().t8(Sleep.SLEEP_LAW_WEEK);
                }
            });
            final unh sleepLawBean = sleepHomeCardData.getSleepLawBean();
            ThreadUtils.doInUiThread(new Runnable() { // from class: com.oplus.aiunit.vision.xeh
                @Override // java.lang.Runnable
                public final void run() {
                    SleepCardServiceImpl.zb(sleepLawHomeCard, context2, sleepLawBean);
                }
            });
            Boolean boolGb = sleepCardServiceImpl.Gb(sleepLawBean);
            if (boolGb == null) {
                int beforeSleepInTime = sleepLawBean.getBeforeSleepInTime();
                int curSleepInTime = sleepLawBean.getCurSleepInTime();
                Boolean boolBoxBoolean = Boxing.boxBoolean(beforeSleepInTime > curSleepInTime);
                String strC = s15.c(Math.abs(beforeSleepInTime - curSleepInTime), false);
                Intrinsics.checkNotNullExpressionValue(strC, "formatDateTimeHourMinute…  false\n                )");
                str = strC;
                boolGb = boolBoxBoolean;
            } else {
                str = "";
            }
            String strVb2 = str.length() == 0 ? vb(sleepCardServiceImpl, Sleep.SLEEP_LAW_WEEK.getId(), context2, boolGb.booleanValue(), false, 8, null) : vb(sleepCardServiceImpl, 91, context2, boolGb.booleanValue(), false, 8, null);
            Sleep sleep3 = Sleep.SLEEP_LAW_WEEK;
            list.add(new l9h(sleep3, sleepLawHomeCard, strVb2, tb(sleepCardServiceImpl, sleep3, context2, boolGb.booleanValue(), str, false, 16, null), sleepLawBean));
        }
        List list2 = list;
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList2.add(((l9h) it.next()).getDataType());
        }
        m8b.f("SleepCardServiceImpl", "getSleepCardList final back result:" + arrayList2);
        return list;
    }

    @Override // com.alibaba.android.arouter.facade.template.IProvider
    public void init(@Nullable Context context) {
    }

    public final q2i nb(SnoreWeekBean snoreWeekBean, long startTime, long endTime) {
        q2i q2iVar = new q2i();
        q2iVar.p(startTime);
        q2iVar.j(endTime);
        q2iVar.m(LocalDateTime.ofInstant(Instant.ofEpochMilli(startTime), ZoneId.systemDefault()).toLocalDate().minusDays(7L).atStartOfDay().atZone(ZoneId.systemDefault()).toInstant().toEpochMilli());
        q2iVar.l(LocalDateTime.ofInstant(Instant.ofEpochMilli(endTime), ZoneId.systemDefault()).toLocalDate().minusDays(7L).atStartOfDay().atZone(ZoneId.systemDefault()).toInstant().toEpochMilli());
        q2iVar.n(7);
        q2iVar.o(13);
        q2iVar.k(0);
        q2iVar.i(snoreWeekBean.getIsShowSleepApnea() ? snoreWeekBean.getSleepApneaDataList() : snoreWeekBean.getSnoreLevelDataList());
        return q2iVar;
    }

    public final int ob(int score) {
        if (score >= 90) {
            return 4;
        }
        if (score >= 80) {
            return 3;
        }
        if (score >= 60) {
            return 2;
        }
        return (score == 0 || score == -10000) ? 0 : 1;
    }

    public final void pb(SleepHomeCardData sleepHomeCardData) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        int size;
        int size2;
        iuh afterSleepTimeData;
        iuh beforeSleepTimeData;
        List<SleepDataStat> listC;
        List<SleepDataStat> listI;
        List<SleepDataStat> listC2;
        List<SleepDataStat> listI2;
        List<Integer> listB;
        List<Integer> listF;
        tqh sleepScoreComparedBean = sleepHomeCardData.getSleepDataComparedBean().getSleepScoreComparedBean();
        if (sleepScoreComparedBean == null || (listF = sleepScoreComparedBean.f()) == null) {
            arrayList = new ArrayList();
        } else {
            arrayList = new ArrayList();
            for (Object obj : listF) {
                if (((Number) obj).intValue() > 0) {
                    arrayList.add(obj);
                }
            }
        }
        if (sleepScoreComparedBean == null || (listB = sleepScoreComparedBean.b()) == null) {
            arrayList2 = new ArrayList();
        } else {
            arrayList2 = new ArrayList();
            for (Object obj2 : listB) {
                if (((Number) obj2).intValue() > 0) {
                    arrayList2.add(obj2);
                }
            }
        }
        int beforeSleepAverageScore = sleepScoreComparedBean != null ? sleepScoreComparedBean.getBeforeSleepAverageScore() : 0;
        int afterSleepAverageScore = sleepScoreComparedBean != null ? sleepScoreComparedBean.getAfterSleepAverageScore() : 0;
        l9b.f("SleepCardServiceImpl", "beforeScoreList size:" + arrayList.size() + ",afterScoreList size:" + arrayList2.size() + ",beforeAvgScore:" + beforeSleepAverageScore + ",afterAvgScore：" + afterSleepAverageScore);
        int size3 = arrayList.size();
        int size4 = arrayList2.size();
        StringBuilder sb = new StringBuilder();
        sb.append("beforeScoreList size:");
        sb.append(size3);
        sb.append(",afterScoreList size:");
        sb.append(size4);
        sb.append(",beforeAvgScore:");
        sb.append(beforeSleepAverageScore);
        sb.append(",afterAvgScore：");
        sb.append(afterSleepAverageScore);
        if (arrayList.size() >= 3 && arrayList2.size() >= 3 && Math.abs(beforeSleepAverageScore - afterSleepAverageScore) >= 5) {
            this.showSleepScoreCard = true;
        }
        kuh sleepTimeComparedBean = sleepHomeCardData.getSleepDataComparedBean().getSleepTimeComparedBean();
        if (sleepTimeComparedBean == null || (listI2 = sleepTimeComparedBean.i()) == null) {
            arrayList3 = new ArrayList();
        } else {
            arrayList3 = new ArrayList();
            for (Object obj3 : listI2) {
                if (((SleepDataStat) obj3).getTotalSleepTime() >= 180) {
                    arrayList3.add(obj3);
                }
            }
        }
        if (sleepTimeComparedBean == null || (listC2 = sleepTimeComparedBean.c()) == null) {
            arrayList4 = new ArrayList();
        } else {
            arrayList4 = new ArrayList();
            for (Object obj4 : listC2) {
                if (((SleepDataStat) obj4).getTotalSleepTime() >= 180) {
                    arrayList4.add(obj4);
                }
            }
        }
        if (sleepTimeComparedBean == null || (listI = sleepTimeComparedBean.i()) == null) {
            size = 0;
        } else {
            ArrayList arrayList5 = new ArrayList();
            for (Object obj5 : listI) {
                if (((SleepDataStat) obj5).getTotalSleepTime() > 0) {
                    arrayList5.add(obj5);
                }
            }
            size = arrayList5.size();
        }
        if (sleepTimeComparedBean == null || (listC = sleepTimeComparedBean.c()) == null) {
            size2 = 0;
        } else {
            ArrayList arrayList6 = new ArrayList();
            for (Object obj6 : listC) {
                if (((SleepDataStat) obj6).getTotalSleepTime() > 0) {
                    arrayList6.add(obj6);
                }
            }
            size2 = arrayList6.size();
        }
        int totalSleepAverageTime = (sleepTimeComparedBean == null || (beforeSleepTimeData = sleepTimeComparedBean.getBeforeSleepTimeData()) == null) ? 0 : beforeSleepTimeData.getTotalSleepAverageTime();
        int totalSleepAverageTime2 = (sleepTimeComparedBean == null || (afterSleepTimeData = sleepTimeComparedBean.getAfterSleepTimeData()) == null) ? 0 : afterSleepTimeData.getTotalSleepAverageTime();
        l9b.f("SleepCardServiceImpl", "beforeTimeList size:" + arrayList3.size() + ",afterTimeList size:" + arrayList4.size() + ",oBeforeTimeListSize:" + size + ",oAfterTimeListSize:" + size2 + ",beforeAvgTime:" + totalSleepAverageTime + "afterAvgTime:" + totalSleepAverageTime2);
        int size5 = arrayList3.size();
        int size6 = arrayList4.size();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("beforeTimeList size:");
        sb2.append(size5);
        sb2.append(",afterTimeList size:");
        sb2.append(size6);
        sb2.append(",oBeforeTimeListSize:");
        sb2.append(size);
        sb2.append(",oAfterTimeListSize:");
        sb2.append(size2);
        sb2.append(",beforeAvgTime:");
        sb2.append(totalSleepAverageTime);
        sb2.append("afterAvgTime:");
        sb2.append(totalSleepAverageTime2);
        if (arrayList3.size() >= 3 && arrayList3.size() == size && arrayList4.size() >= 3 && arrayList4.size() == size2) {
            if (Math.abs(totalSleepAverageTime - totalSleepAverageTime2) >= 30) {
                this.showSleepTimeCard = true;
            }
        }
        unh sleepLawBean = sleepHomeCardData.getSleepLawBean();
        int beforeSleepInTime = sleepLawBean.getBeforeSleepInTime();
        int curSleepInTime = sleepLawBean.getCurSleepInTime();
        inh.Companion companion = inh.INSTANCE;
        int iOb = companion.a() > 0 ? ob(companion.a()) : ob(sleepLawBean.getBeforeScore());
        int iOb2 = companion.b() > 0 ? ob(companion.b()) : ob(sleepLawBean.getScore());
        l9b.f("SleepCardServiceImpl", "beforeSleepInTime:" + beforeSleepInTime + ",afterSleepInTime:" + curSleepInTime + ",beforeScoreLevel:" + iOb + ",afterScoreLevel：" + iOb2);
        StringBuilder sb3 = new StringBuilder();
        sb3.append("beforeSleepInTime:");
        sb3.append(beforeSleepInTime);
        sb3.append(",afterSleepInTime:");
        sb3.append(curSleepInTime);
        sb3.append(",beforeScoreLevel:");
        sb3.append(iOb);
        sb3.append(",afterScoreLevel：");
        sb3.append(iOb2);
        if (iOb2 <= 0) {
            m8b.f("SleepCardServiceImpl", "afterScoreLevel is 0");
            return;
        }
        if (iOb == 0) {
            this.showSleepLawCard = true;
        }
        if (Math.abs(iOb - iOb2) >= 2) {
            this.showSleepLawCard = true;
        }
        if (arrayList3.size() < 3 || arrayList4.size() < 3 || Math.abs(beforeSleepInTime - curSleepInTime) < 15) {
            return;
        }
        this.showSleepLawCard = true;
    }

    public final void qb(SnoreHomeCardData snoreHomeCardData) {
        boolean z = snoreHomeCardData.getSnoreWeekBean().getIsEmpty() && snoreHomeCardData.getSnoreWeekBean().getSleepApneaDataList().isEmpty();
        l9b.f("SleepCardServiceImpl", "averageLevel:" + snoreHomeCardData.getAverageLevel() + ",isEmpty:" + z);
        int averageLevel = snoreHomeCardData.getAverageLevel();
        StringBuilder sb = new StringBuilder();
        sb.append("averageLevel:");
        sb.append(averageLevel);
        sb.append(",isEmpty:");
        sb.append(z);
        int i = 3;
        if (!z && (snoreHomeCardData.getAverageLevel() == 2 || snoreHomeCardData.getAverageLevel() == 3)) {
            this.showSnoreRiskCard = true;
        }
        List<SnoreLevelData> listA = snoreHomeCardData.getSnoreRangeControlBean().a();
        if (listA == null) {
            listA = new ArrayList<>();
        }
        if (listA.size() < 14) {
            m8b.f("SleepCardServiceImpl", "snoreDataList size error");
            return;
        }
        int size = listA.size();
        float snoreSumTime = 0.0f;
        float snoreSumTime2 = 0.0f;
        float snoreSumNum = 0.0f;
        float snoreSumNum2 = 0.0f;
        float snoreMaxDb = 0.0f;
        float snoreMaxDb2 = 0.0f;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (i4 < size) {
            SnoreLevelData snoreLevelData = listA.get(i4);
            if (snoreLevelData.getSnoreSumTime() > 0.0f) {
                if (i4 >= 0 && i4 < 7) {
                    i5++;
                    snoreSumTime += snoreLevelData.getSnoreSumTime();
                } else {
                    i6++;
                    snoreSumTime2 += snoreLevelData.getSnoreSumTime();
                }
            }
            if (snoreLevelData.getSnoreSumNum() > 0.0f) {
                if (i4 >= 0 && i4 < 7) {
                    i7++;
                    snoreSumNum += snoreLevelData.getSnoreSumNum();
                } else {
                    i8++;
                    snoreSumNum2 += snoreLevelData.getSnoreSumNum();
                }
            }
            if (snoreLevelData.getSnoreMaxDb() > 0.0f) {
                if (i4 >= 0 && i4 < 7) {
                    i3++;
                    snoreMaxDb2 += snoreLevelData.getSnoreMaxDb();
                } else {
                    i2++;
                    snoreMaxDb += snoreLevelData.getSnoreMaxDb();
                }
            }
            i4++;
            i = 3;
        }
        if (i5 < i || i6 < i) {
            m8b.f("SleepCardServiceImpl", "beforeSnoreDays or afterSnoreDays less than 3");
            m8b.f("SleepCardServiceImpl", "beforeSnoreDays:" + i5 + ",afterSnoreDays:" + i6);
            return;
        }
        float f = snoreSumTime / i5;
        float f2 = snoreSumTime2 / i6;
        l9b.f("SleepCardServiceImpl", "beforeSnoreAvgTime:" + f + ",afterSnoreAvgTime:" + f2);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("beforeSnoreAvgTime:");
        sb2.append(f);
        sb2.append(",afterSnoreAvgTime:");
        sb2.append(f2);
        if (Math.abs(f - f2) >= 30.0f) {
            this.showSnoreTimeCard = true;
        }
        float f3 = i7 == 0 ? 0.0f : snoreSumNum / i7;
        float f4 = i8 != 0 ? snoreSumNum2 / i8 : 0.0f;
        l9b.f("SleepCardServiceImpl", "beforeSnoreAvgNum:" + f3 + ",afterSnoreAvgNum:" + f4);
        StringBuilder sb3 = new StringBuilder();
        sb3.append("beforeSnoreAvgNum:");
        sb3.append(f3);
        sb3.append(",afterSnoreAvgNum:");
        sb3.append(f4);
        if (Math.abs(f3 - f4) >= 100.0f) {
            this.showSnoreNumCard = true;
        }
        if (i3 == 0 || i2 == 0) {
            m8b.f("SleepCardServiceImpl", "AvgDbD divisor is 0");
            return;
        }
        float f5 = snoreMaxDb2 / i3;
        float f6 = snoreMaxDb / i2;
        l9b.f("SleepCardServiceImpl", "beforeSnoreAvgDb:" + f5 + ",afterSnoreAvgDb:" + f6);
        StringBuilder sb4 = new StringBuilder();
        sb4.append("beforeSnoreAvgDb:");
        sb4.append(f5);
        sb4.append(",afterSnoreAvgDb:");
        sb4.append(f6);
        if (Math.abs(f5 - f6) >= 10.0f) {
            this.showSnoreDbCard = true;
        }
    }

    public final InsightService rb() {
        Object value = this.insightService.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-insightService>(...)");
        return (InsightService) value;
    }

    public final String sb(r9b type, Context context, boolean whetherUp, String fillValue, boolean isShowSleepApnea) {
        String string;
        m8b.f("SleepCardServiceImpl", "type:" + type.getId() + ",whetherUp:" + whetherUp + ",fillValue:" + fillValue + ",isShowSleepApnea:" + isShowSleepApnea);
        List listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(R$string.health_sleep_score_up_device_notify1), Integer.valueOf(R$string.health_sleep_score_up_device_notify2)});
        List listListOf2 = CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(R$string.health_sleep_score_down_device_notify1), Integer.valueOf(R$string.health_sleep_score_down_device_notify2)});
        List listListOf3 = CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(R$string.health_sleep_time_up_device_notify1), Integer.valueOf(R$string.health_sleep_time_up_device_notify2), Integer.valueOf(R$string.health_sleep_time_up_device_notify3)});
        List listListOf4 = CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(R$string.health_sleep_time_down_device_notify1), Integer.valueOf(R$string.health_sleep_time_down_device_notify2), Integer.valueOf(R$string.health_sleep_time_down_device_notify3)});
        List listListOf5 = CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(R$string.health_sleep_lab_up_device_notify1), Integer.valueOf(R$string.health_sleep_lab_up_device_notify2), Integer.valueOf(R$string.health_sleep_lab_up_device_notify3)});
        List listListOf6 = CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(R$string.health_sleep_lab_down_device_notify1), Integer.valueOf(R$string.health_sleep_lab_down_device_notify2), Integer.valueOf(R$string.health_sleep_lab_down_device_notify3)});
        List listListOf7 = CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(R$string.health_sleep_gosleep_up_device_notify1), Integer.valueOf(R$string.health_sleep_gosleep_up_device_notify2), Integer.valueOf(R$string.health_sleep_gosleep_up_device_notify3)});
        List listListOf8 = CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(R$string.health_sleep_gosleep_down_device_notify1), Integer.valueOf(R$string.health_sleep_gosleep_down_device_notify2), Integer.valueOf(R$string.health_sleep_gosleep_down_device_notify3)});
        int iNextInt = new Random().nextInt(3);
        if (type == Sleep.SLEEP_SCORE_WEEK) {
            String string2 = whetherUp ? context.getString(((Number) CollectionsKt___CollectionsKt.random(listListOf, p010kotlin.random.Random.INSTANCE)).intValue(), fillValue) : context.getString(((Number) CollectionsKt___CollectionsKt.random(listListOf2, p010kotlin.random.Random.INSTANCE)).intValue(), fillValue);
            Intrinsics.checkNotNullExpressionValue(string2, "{\n                if (wh…          }\n            }");
            return string2;
        }
        if (type == Sleep.SLEEP_DURATION_WEEK) {
            String string3 = whetherUp ? context.getString(((Number) listListOf3.get(iNextInt)).intValue(), fillValue) : context.getString(((Number) listListOf4.get(iNextInt)).intValue(), fillValue);
            Intrinsics.checkNotNullExpressionValue(string3, "{\n                if (wh…          }\n            }");
            return string3;
        }
        if (type == Sleep.SLEEP_LAW_WEEK) {
            if (whetherUp) {
                string = fillValue.length() > 0 ? context.getString(((Number) listListOf7.get(iNextInt)).intValue(), fillValue) : context.getString(((Number) listListOf5.get(iNextInt)).intValue());
            } else {
                string = fillValue.length() > 0 ? context.getString(((Number) listListOf8.get(iNextInt)).intValue(), fillValue) : context.getString(((Number) listListOf6.get(iNextInt)).intValue());
            }
            Intrinsics.checkNotNullExpressionValue(string, "{\n                if (wh…          }\n            }");
            return string;
        }
        if (type != Snore.SNORE_RISK_WEEK) {
            return "";
        }
        String string4 = isShowSleepApnea ? context.getString(R$string.health_sleep_apnea_device_notify) : context.getString(R$string.health_sleep_snore_device_notify);
        Intrinsics.checkNotNullExpressionValue(string4, "{\n                if (is…          }\n            }");
        return string4;
    }

    public final String ub(int type, Context context, boolean whetherUp, boolean isShowSleepApnea) {
        m8b.f("SleepCardServiceImpl", "type:" + type + ",whetherUp:" + whetherUp + ",isShowSleepApnea:" + isShowSleepApnea);
        if (type == Sleep.SLEEP_SCORE_WEEK.getId()) {
            String string = whetherUp ? context.getString(R$string.health_sleep_score_up_device_title) : context.getString(R$string.health_sleep_score_down_device_title);
            Intrinsics.checkNotNullExpressionValue(string, "{\n\n                if (w…         }\n\n            }");
            return string;
        }
        if (type == Sleep.SLEEP_DURATION_WEEK.getId()) {
            String string2 = whetherUp ? context.getString(R$string.health_sleep_time_up_device_title) : context.getString(R$string.health_sleep_time_down_device_title);
            Intrinsics.checkNotNullExpressionValue(string2, "{\n                if (wh…          }\n            }");
            return string2;
        }
        if (type == Sleep.SLEEP_LAW_WEEK.getId()) {
            String string3 = whetherUp ? context.getString(R$string.health_sleep_lab_up_device_title) : context.getString(R$string.health_sleep_lab_down_device_title);
            Intrinsics.checkNotNullExpressionValue(string3, "{\n                if (wh…          }\n            }");
            return string3;
        }
        if (type == 91) {
            String string4 = whetherUp ? context.getString(R$string.health_sleep_gosleep_up_device_title) : context.getString(R$string.health_sleep_gosleep_down_device_title);
            Intrinsics.checkNotNullExpressionValue(string4, "{\n                if (wh…          }\n            }");
            return string4;
        }
        if (type != Snore.SNORE_RISK_WEEK.getId()) {
            return "";
        }
        String string5 = isShowSleepApnea ? context.getString(R$string.health_sleep_apnea_device_title) : context.getString(R$string.health_sleep_snore_device_title);
        Intrinsics.checkNotNullExpressionValue(string5, "{\n                if (is…          }\n            }");
        return string5;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @SuppressLint({"CheckResult"})
    public final Object wb(long j2, long j3, Continuation<? super SleepHomeCardData> continuation) {
        SleepCardServiceImpl$getSleepCardData$1 sleepCardServiceImpl$getSleepCardData$1;
        if (continuation instanceof SleepCardServiceImpl$getSleepCardData$1) {
            sleepCardServiceImpl$getSleepCardData$1 = (SleepCardServiceImpl$getSleepCardData$1) continuation;
            int i = sleepCardServiceImpl$getSleepCardData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                sleepCardServiceImpl$getSleepCardData$1.label = i - Integer.MIN_VALUE;
            } else {
                sleepCardServiceImpl$getSleepCardData$1 = new SleepCardServiceImpl$getSleepCardData$1(this, continuation);
            }
        } else {
            sleepCardServiceImpl$getSleepCardData$1 = new SleepCardServiceImpl$getSleepCardData$1(this, continuation);
        }
        SleepCardServiceImpl$getSleepCardData$1 sleepCardServiceImpl$getSleepCardData$2 = sleepCardServiceImpl$getSleepCardData$1;
        Object objC = sleepCardServiceImpl$getSleepCardData$2.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = sleepCardServiceImpl$getSleepCardData$2.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objC);
            m8b.f("SleepCardServiceImpl", "getSleepCardData: startTime:" + j2 + ",endTime:" + j3 + ",");
            ZoneId zoneIdSystemDefault = ZoneId.systemDefault();
            long epochMilli = LocalDateTime.ofInstant(Instant.ofEpochMilli(j2), zoneIdSystemDefault).toLocalDate().minusDays(7L).atStartOfDay().atZone(zoneIdSystemDefault).toInstant().toEpochMilli();
            long epochMilli2 = LocalDateTime.ofInstant(Instant.ofEpochMilli(j3), zoneIdSystemDefault).toLocalDate().minusDays(7L).atStartOfDay().atZone(zoneIdSystemDefault).toInstant().toEpochMilli();
            pr8 pr8Var = pr8.INSTANCE;
            long jN = pr8Var.n(epochMilli);
            long jN2 = pr8Var.n(j3);
            StringBuilder sb = new StringBuilder();
            sb.append("getSleepCardData: beforeSleepStartTime:");
            sb.append(jN);
            sb.append(",curSleepEndTime:");
            sb.append(jN2);
            sb.append(",");
            ddd dddVarJ1 = ddd.j1(this.sleepWeekDataRepository.a(4, epochMilli, j3, 0), Ab().z(jN, jN2, 0, false), new d(epochMilli, j2, j3, epochMilli2));
            Intrinsics.checkNotNullExpressionValue(dddVarJ1, "@SuppressLint(\"CheckResu…n sleepHomeCardData\n    }");
            sleepCardServiceImpl$getSleepCardData$2.label = 1;
            objC = RxExtendKt.c(dddVarJ1, sleepCardServiceImpl$getSleepCardData$2);
            if (objC == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objC);
        }
        Intrinsics.checkNotNullExpressionValue(objC, "@SuppressLint(\"CheckResu…n sleepHomeCardData\n    }");
        return (SleepHomeCardData) objC;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // com.heytap.health.sleep.service.homecard.SleepCardService
    @Nullable
    public Object y8(@NotNull Context context, long j2, long j3, @NotNull Continuation<? super List<l9h>> continuation) {
        SleepCardServiceImpl$getSnoreCardList$1 sleepCardServiceImpl$getSnoreCardList$1;
        final SleepCardServiceImpl sleepCardServiceImpl;
        List list;
        Context context2;
        long j4;
        if (continuation instanceof SleepCardServiceImpl$getSnoreCardList$1) {
            sleepCardServiceImpl$getSnoreCardList$1 = (SleepCardServiceImpl$getSnoreCardList$1) continuation;
            int i = sleepCardServiceImpl$getSnoreCardList$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                sleepCardServiceImpl$getSnoreCardList$1.label = i - Integer.MIN_VALUE;
            } else {
                sleepCardServiceImpl$getSnoreCardList$1 = new SleepCardServiceImpl$getSnoreCardList$1(this, continuation);
            }
        } else {
            sleepCardServiceImpl$getSnoreCardList$1 = new SleepCardServiceImpl$getSnoreCardList$1(this, continuation);
        }
        SleepCardServiceImpl$getSnoreCardList$1 sleepCardServiceImpl$getSnoreCardList$2 = sleepCardServiceImpl$getSnoreCardList$1;
        Object objBb = sleepCardServiceImpl$getSnoreCardList$2.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = sleepCardServiceImpl$getSnoreCardList$2.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objBb);
            this.showSnoreRiskCard = false;
            this.showSnoreDbCard = false;
            this.showSnoreNumCard = false;
            this.showSnoreTimeCard = false;
            yuh yuhVar = this.sleepWeekDataRepository;
            String ssoid = cn.c().getSsoid();
            Intrinsics.checkNotNullExpressionValue(ssoid, "getAccountManager().ssoid");
            yuhVar.c(ssoid);
            w4i w4iVar = this.snoreWeekRepository;
            String ssoid2 = cn.c().getSsoid();
            Intrinsics.checkNotNullExpressionValue(ssoid2, "getAccountManager().ssoid");
            w4iVar.d(ssoid2);
            ArrayList arrayList = new ArrayList();
            sleepCardServiceImpl$getSnoreCardList$2.L$0 = this;
            sleepCardServiceImpl$getSnoreCardList$2.L$1 = context;
            sleepCardServiceImpl$getSnoreCardList$2.L$2 = arrayList;
            sleepCardServiceImpl$getSnoreCardList$2.J$0 = j2;
            sleepCardServiceImpl$getSnoreCardList$2.label = 1;
            objBb = Bb(j2, j3, sleepCardServiceImpl$getSnoreCardList$2);
            if (objBb == coroutine_suspended) {
                return coroutine_suspended;
            }
            sleepCardServiceImpl = this;
            list = arrayList;
            context2 = context;
            j4 = j2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j4 = sleepCardServiceImpl$getSnoreCardList$2.J$0;
            list = (List) sleepCardServiceImpl$getSnoreCardList$2.L$2;
            context2 = (Context) sleepCardServiceImpl$getSnoreCardList$2.L$1;
            sleepCardServiceImpl = (SleepCardServiceImpl) sleepCardServiceImpl$getSnoreCardList$2.L$0;
            ResultKt.throwOnFailure(objBb);
        }
        final SnoreHomeCardData snoreHomeCardData = (SnoreHomeCardData) objBb;
        sleepCardServiceImpl.qb(snoreHomeCardData);
        if (sleepCardServiceImpl.showSnoreRiskCard) {
            final SnoreRiskHomeCard snoreRiskHomeCard = new SnoreRiskHomeCard(context2);
            snoreRiskHomeCard.setOnCardClick(new Function0<Unit>() { // from class: com.heytap.health.sleep.service.homecard.SleepCardServiceImpl$getSnoreCardList$snoreRiskHomeCard$1$1
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
                    this.this$0.rb().t8(Snore.SNORE_RISK_WEEK);
                }
            });
            final Context context3 = context2;
            final long j5 = j4;
            ThreadUtils.doInUiThread(new Runnable() { // from class: com.oplus.aiunit.vision.reh
                @Override // java.lang.Runnable
                public final void run() {
                    SleepCardServiceImpl.Fb(snoreRiskHomeCard, context3, snoreHomeCardData, j5);
                }
            });
            Snore snore = Snore.SNORE_RISK_WEEK;
            list.add(new l9h(snore, snoreRiskHomeCard, vb(sleepCardServiceImpl, snore.getId(), context3, false, snoreHomeCardData.getSnoreWeekBean().getIsShowSleepApnea(), 4, null), tb(sleepCardServiceImpl, snore, context2, false, null, snoreHomeCardData.getSnoreWeekBean().getIsShowSleepApnea(), 12, null), snoreHomeCardData));
        }
        if (sleepCardServiceImpl.showSnoreDbCard) {
            final SnoreDbHomeCard snoreDbHomeCard = new SnoreDbHomeCard(context2);
            snoreDbHomeCard.setOnCardClick(new Function0<Unit>() { // from class: com.heytap.health.sleep.service.homecard.SleepCardServiceImpl$getSnoreCardList$snoreDbHomeCard$1$1
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
                    this.this$0.rb().t8(Snore.SNORE_DECIBEL_WEEK);
                }
            });
            final Context context4 = context2;
            final long j6 = j4;
            ThreadUtils.doInUiThread(new Runnable() { // from class: com.oplus.aiunit.vision.seh
                @Override // java.lang.Runnable
                public final void run() {
                    SleepCardServiceImpl.Cb(snoreDbHomeCard, context4, snoreHomeCardData, j6);
                }
            });
            list.add(new l9h(Snore.SNORE_DECIBEL_WEEK, snoreDbHomeCard, "", "", snoreHomeCardData));
        }
        if (sleepCardServiceImpl.showSnoreTimeCard) {
            final SnoreTimeHomeCard snoreTimeHomeCard = new SnoreTimeHomeCard(context2);
            snoreTimeHomeCard.setOnCardClick(new Function0<Unit>() { // from class: com.heytap.health.sleep.service.homecard.SleepCardServiceImpl$getSnoreCardList$snoreTimeHomeCard$1$1
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
                    this.this$0.rb().t8(Snore.SNORE_DURATION_WEEK);
                }
            });
            final Context context5 = context2;
            final long j7 = j4;
            ThreadUtils.doInUiThread(new Runnable() { // from class: com.oplus.aiunit.vision.teh
                @Override // java.lang.Runnable
                public final void run() {
                    SleepCardServiceImpl.Db(snoreTimeHomeCard, context5, snoreHomeCardData, j7);
                }
            });
            list.add(new l9h(Snore.SNORE_DURATION_WEEK, snoreTimeHomeCard, "", "", snoreHomeCardData));
        }
        if (sleepCardServiceImpl.showSnoreNumCard) {
            final SnoreNumHomeCard snoreNumHomeCard = new SnoreNumHomeCard(context2);
            snoreNumHomeCard.setOnCardClick(new Function0<Unit>() { // from class: com.heytap.health.sleep.service.homecard.SleepCardServiceImpl$getSnoreCardList$snoreNumHomeCard$1$1
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
                    this.this$0.rb().t8(Snore.SNORE_TIMES_WEEK);
                }
            });
            final Context context6 = context2;
            final long j8 = j4;
            ThreadUtils.doInUiThread(new Runnable() { // from class: com.oplus.aiunit.vision.ueh
                @Override // java.lang.Runnable
                public final void run() {
                    SleepCardServiceImpl.Eb(snoreNumHomeCard, context6, snoreHomeCardData, j8);
                }
            });
            list.add(new l9h(Snore.SNORE_TIMES_WEEK, snoreNumHomeCard, "", "", snoreHomeCardData));
        }
        return list;
    }
}