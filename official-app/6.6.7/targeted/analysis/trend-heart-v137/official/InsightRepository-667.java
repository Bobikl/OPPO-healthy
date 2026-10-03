package com.heytap.health.insight.signs;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.exifinterface.media.ExifInterface;
import com.heytap.databaseengine.api.RxExtendKt;
import com.heytap.databaseengine.api.SportHealthDataAPI;
import com.heytap.databaseengine.model.CommonBackBean;
import com.heytap.databaseengine.model.HeartRateDataStat;
import com.heytap.databaseengine.model.SleepDataStat;
import com.heytap.databaseengine.model.SleepIndex;
import com.heytap.databaseengine.model.UserInfo;
import com.heytap.databaseengine.model.snore.OsaResultBean;
import com.heytap.databaseengine.option.DataInsertOption;
import com.heytap.databaseengine.option.DataReadOption;
import com.heytap.health.core.widget.charts.data.SnoreLevelData;
import com.heytap.health.health.insight.DevSignsData;
import com.heytap.health.insight.data.datasource.net.IntegrateDataBean;
import com.heytap.health.insight.data.datasource.net.IntegrateDataItem;
import com.heytap.health.insight.data.datasource.net.IntegrateDataListItem;
import com.heytap.health.insight.data.datasource.net.RecentDataBean;
import com.heytap.health.insight.data.datasource.net.dataChecker.InsightDataChecker;
import com.heytap.health.insight.signs.InsightRepository;
import com.heytap.health.network.core.BaseResponse;
import com.heytap.health.network.core.a;
import com.heytap.health.sleep.snore.bean.SnoreWeekBean;
import com.heytap.health.sleep.snore.week.model.SnoreWeekTransform;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.RelativeDateRange;
import com.oplus.aiunit.vision.acl;
import com.oplus.aiunit.vision.b24;
import com.oplus.aiunit.vision.c7n;
import com.oplus.aiunit.vision.cwg;
import com.oplus.aiunit.vision.ddd;
import com.oplus.aiunit.vision.fdg;
import com.oplus.aiunit.vision.g14;
import com.oplus.aiunit.vision.g18;
import com.oplus.aiunit.vision.h15;
import com.oplus.aiunit.vision.kba;
import com.oplus.aiunit.vision.loh;
import com.oplus.aiunit.vision.m8b;
import com.oplus.aiunit.vision.mfh;
import com.oplus.aiunit.vision.pr8;
import com.oplus.aiunit.vision.qba;
import com.oplus.aiunit.vision.s04;
import com.oplus.aiunit.vision.tqh;
import com.oplus.aiunit.vision.w4i;
import com.oplus.aiunit.vision.zeh;
import com.oplus.aiunit.vision.zr8;
import com.oplus.aiunit.vision.zuh;
import com.oplus.onet.IONetService;
import com.xiaomi.mipush.sdk.Constants;
import io.protostuff.MapSchema;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.ExceptionsKt__ExceptionsKt;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.ResultKt;
import p010kotlin.Unit;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.collections.CollectionsKt__IterablesKt;
import p010kotlin.collections.CollectionsKt___CollectionsKt;
import p010kotlin.coroutines.AbstractCoroutineContextElement;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.CoroutineContext;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.coroutines.jvm.internal.Boxing;
import p010kotlin.coroutines.jvm.internal.DebugProbesKt;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;
import p010kotlin.math.MathKt__MathJVMKt;

/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \\2\u00020\u0001:\u00075;@EJOSB\u0007¢\u0006\u0004\bZ\u0010[J+\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\bH\u0086@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0086@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\nJ\u0015\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0087@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\nJ\u0016\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011J\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0087@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\nJ!\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\b2\u0006\u0010\u0018\u001a\u00020\u0017H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u000fH\u0007J\u001a\u0010\"\u001a\u0004\u0018\u00010!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0002H\u0002J\u0010\u0010%\u001a\u00020\u00112\u0006\u0010$\u001a\u00020#H\u0002J\u0010\u0010&\u001a\u00020\r2\u0006\u0010$\u001a\u00020#H\u0002J\u0012\u0010(\u001a\u00020\u00022\b\u0010'\u001a\u0004\u0018\u00010\u000fH\u0002J#\u0010*\u001a\u00020\u00022\u0006\u0010)\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u0017H\u0082@ø\u0001\u0000¢\u0006\u0004\b*\u0010+J!\u0010-\u001a\b\u0012\u0004\u0012\u00020,0\b2\u0006\u0010\u001c\u001a\u00020\u000fH\u0082@ø\u0001\u0000¢\u0006\u0004\b-\u0010.J!\u00100\u001a\u00020\u00132\f\u0010/\u001a\b\u0012\u0004\u0012\u00020,0\bH\u0082@ø\u0001\u0000¢\u0006\u0004\b0\u00101J\u0010\u00103\u001a\u00020\u00112\u0006\u00102\u001a\u00020\u0002H\u0002R\u001b\u00109\u001a\u0002048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u001b\u0010>\u001a\u00020:8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b;\u00106\u001a\u0004\b<\u0010=R\u001b\u0010C\u001a\u00020?8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b@\u00106\u001a\u0004\bA\u0010BR\u001b\u0010H\u001a\u00020D8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bE\u00106\u001a\u0004\bF\u0010GR\u001b\u0010M\u001a\u00020I8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bJ\u00106\u001a\u0004\bK\u0010LR\u001b\u0010R\u001a\u00020N8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bO\u00106\u001a\u0004\bP\u0010QR\u001b\u0010U\u001a\u00020N8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bS\u00106\u001a\u0004\bT\u0010QR\u0014\u0010Y\u001a\u00020V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010X\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006]"}, d2 = {"Lcom/heytap/health/insight/signs/InsightRepository;", "", "", "startTime", "endTime", "Lcom/heytap/health/insight/signs/InsightRepository$f;", "D", "(Ljava/lang/Integer;Ljava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "y", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/heytap/health/insight/data/datasource/net/RecentDataBean;", "z", "Lcom/heytap/health/insight/signs/InsightRepository$b;", "C", "", "code", "", "result", "", LogFieldKey.MESSAGE_KEY, "Lcom/heytap/health/insight/signs/InsightRepository$e;", UserInfo.SEX_FEMALE, "", "time", "", "A", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", g14.DEVICE_UNIQUE_ID, "I", "Lcom/heytap/health/insight/data/datasource/net/IntegrateDataListItem;", "item", "date", "Lcom/heytap/health/insight/signs/SignsBeanItem;", "n", "Lcom/oplus/aiunit/vision/tqh;", "scoreComparedBean", "w", "G", "data", "o", "ssoid", acl.KEY_B, "(Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/heytap/databaseengine/model/SleepIndex;", ExifInterface.LONGITUDE_EAST, "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "dataList", "J", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "evaResult", "x", "Lcom/oplus/aiunit/vision/qba;", "a", "Lkotlin/Lazy;", "q", "()Lcom/oplus/aiunit/vision/qba;", "insightNetHelper", "Lcom/heytap/health/insight/data/datasource/net/dataChecker/InsightDataChecker;", "b", LogFieldKey.PROCESS_NAME_KEY, "()Lcom/heytap/health/insight/data/datasource/net/dataChecker/InsightDataChecker;", "dataChecker", "Lcom/oplus/aiunit/vision/w4i;", "c", "u", "()Lcom/oplus/aiunit/vision/w4i;", "snoreWeekRepository", "Lcom/heytap/health/sleep/snore/week/model/SnoreWeekTransform;", "d", "v", "()Lcom/heytap/health/sleep/snore/week/model/SnoreWeekTransform;", "snoreWeekTransform", "Lcom/oplus/aiunit/vision/loh;", MapSchema.FIELD_NAME_ENTRY, "t", "()Lcom/oplus/aiunit/vision/loh;", "sleepScoreRepository", "Lcom/oplus/aiunit/vision/zuh;", "f", "r", "()Lcom/oplus/aiunit/vision/zuh;", "scoreTransform", c7n.f, "s", "scoreWeekTransform", "Lkotlinx/coroutines/CoroutineExceptionHandler;", c7n.g, "Lkotlinx/coroutines/CoroutineExceptionHandler;", "exceptionHandler", "<init>", "()V", "Companion", "health_impl_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nInsightRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InsightRepository.kt\ncom/heytap/health/insight/signs/InsightRepository\n+ 2 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,581:1\n48#2,4:582\n1855#3:586\n1855#3:587\n1856#3:589\n1856#3:590\n766#3:602\n857#3,2:603\n766#3:605\n857#3,2:606\n1559#3:608\n1590#3,4:609\n1559#3:613\n1590#3,4:614\n1549#3:629\n1620#3,3:630\n766#3:633\n857#3,2:634\n2624#3,3:636\n1855#3,2:639\n1#4:588\n314#5,11:591\n314#5,11:618\n*S KotlinDebug\n*F\n+ 1 InsightRepository.kt\ncom/heytap/health/insight/signs/InsightRepository\n*L\n87#1:582,4\n129#1:586\n130#1:587\n130#1:589\n129#1:590\n291#1:602\n291#1:603,2\n292#1:605\n292#1:606,2\n311#1:608\n311#1:609,4\n321#1:613\n321#1:614,4\n426#1:629\n426#1:630,3\n514#1:633\n514#1:634,2\n515#1:636,3\n521#1:639,2\n230#1:591,11\n350#1:618,11\n*E\n"})
public final class InsightRepository {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Lazy insightNetHelper = LazyKt__LazyJVMKt.lazy(new Function0<qba>() { // from class: com.heytap.health.insight.signs.InsightRepository$insightNetHelper$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final qba invoke() {
            return new qba();
        }
    });

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Lazy dataChecker = LazyKt__LazyJVMKt.lazy(new Function0<InsightDataChecker>() { // from class: com.heytap.health.insight.signs.InsightRepository$dataChecker$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final InsightDataChecker invoke() {
            return new InsightDataChecker();
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Lazy snoreWeekRepository = LazyKt__LazyJVMKt.lazy(new Function0<w4i>() { // from class: com.heytap.health.insight.signs.InsightRepository$snoreWeekRepository$2
        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final w4i invoke() {
            return new w4i(null, 1, 0 == true ? 1 : 0);
        }
    });

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final Lazy snoreWeekTransform = LazyKt__LazyJVMKt.lazy(new Function0<SnoreWeekTransform>() { // from class: com.heytap.health.insight.signs.InsightRepository$snoreWeekTransform$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final SnoreWeekTransform invoke() {
            return new SnoreWeekTransform();
        }
    });

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Lazy sleepScoreRepository = LazyKt__LazyJVMKt.lazy(new Function0<loh>() { // from class: com.heytap.health.insight.signs.InsightRepository$sleepScoreRepository$2
        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final loh invoke() {
            return new loh(null, 1, 0 == true ? 1 : 0);
        }
    });

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final Lazy scoreTransform = LazyKt__LazyJVMKt.lazy(new Function0<zuh>() { // from class: com.heytap.health.insight.signs.InsightRepository$scoreTransform$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final zuh invoke() {
            return new zuh();
        }
    });

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final Lazy scoreWeekTransform = LazyKt__LazyJVMKt.lazy(new Function0<zuh>() { // from class: com.heytap.health.insight.signs.InsightRepository$scoreWeekTransform$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final zuh invoke() {
            return new zuh();
        }
    });

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final CoroutineExceptionHandler exceptionHandler = new l(CoroutineExceptionHandler.INSTANCE);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: com.heytap.health.insight.signs.InsightRepository$b, reason: from toString */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\u0013\u001a\u00020\u0004\u0012\u0006\u0010\u0014\u001a\u00020\u0004¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0013\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0011\u001a\u0004\b\u000b\u0010\u0012¨\u0006\u0017"}, d2 = {"Lcom/heytap/health/insight/signs/InsightRepository$b;", "", "", "toString", "", "hashCode", "other", "", "equals", "", "Lcom/heytap/health/insight/signs/InsightRepository$c;", "a", "Ljava/util/List;", "c", "()Ljava/util/List;", "scoreData", "b", "I", "()I", "beforeAvgScore", "afterAvgScore", "<init>", "(Ljava/util/List;II)V", "health_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class DevScoreData {
        public static final int $stable = 8;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @NotNull
        public final List<DevSingleScore> scoreData;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        public final int beforeAvgScore;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        public final int afterAvgScore;

        public DevScoreData(@NotNull List<DevSingleScore> scoreData, int i, int i2) {
            Intrinsics.checkNotNullParameter(scoreData, "scoreData");
            this.scoreData = scoreData;
            this.beforeAvgScore = i;
            this.afterAvgScore = i2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getAfterAvgScore() {
            return this.afterAvgScore;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getBeforeAvgScore() {
            return this.beforeAvgScore;
        }

        @NotNull
        public final List<DevSingleScore> c() {
            return this.scoreData;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DevScoreData)) {
                return false;
            }
            DevScoreData devScoreData = (DevScoreData) other;
            return Intrinsics.areEqual(this.scoreData, devScoreData.scoreData) && this.beforeAvgScore == devScoreData.beforeAvgScore && this.afterAvgScore == devScoreData.afterAvgScore;
        }

        public int hashCode() {
            return (((this.scoreData.hashCode() * 31) + Integer.hashCode(this.beforeAvgScore)) * 31) + Integer.hashCode(this.afterAvgScore);
        }

        @NotNull
        public String toString() {
            return "DevScoreData(scoreData=" + this.scoreData + ", beforeAvgScore=" + this.beforeAvgScore + ", afterAvgScore=" + this.afterAvgScore + ")";
        }
    }

    /* JADX INFO: renamed from: com.heytap.health.insight.signs.InsightRepository$c, reason: from toString */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u0011\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0011\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\u000f\u001a\u0004\b\n\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/heytap/health/insight/signs/InsightRepository$c;", "", "", "toString", "", "hashCode", "other", "", "equals", "", "a", "J", "b", "()J", "time", "I", "()I", "score", "<init>", "(JI)V", "health_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class DevSingleScore {
        public static final int $stable = 0;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        public final long time;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        public final int score;

        public DevSingleScore(long j2, int i) {
            this.time = j2;
            this.score = i;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getScore() {
            return this.score;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final long getTime() {
            return this.time;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DevSingleScore)) {
                return false;
            }
            DevSingleScore devSingleScore = (DevSingleScore) other;
            return this.time == devSingleScore.time && this.score == devSingleScore.score;
        }

        public int hashCode() {
            return (Long.hashCode(this.time) * 31) + Integer.hashCode(this.score);
        }

        @NotNull
        public String toString() {
            return "DevSingleScore(time=" + this.time + ", score=" + this.score + ")";
        }
    }

    /* JADX INFO: renamed from: com.heytap.health.insight.signs.InsightRepository$d, reason: from toString */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u0011\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0011\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\u000f\u001a\u0004\b\n\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/heytap/health/insight/signs/InsightRepository$d;", "", "", "toString", "", "hashCode", "other", "", "equals", "", "a", "J", "b", "()J", "time", "I", "()I", "snoreLevel", "<init>", "(JI)V", "health_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class DevSingleSnore {
        public static final int $stable = 0;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        public final long time;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        public final int snoreLevel;

        public DevSingleSnore(long j2, int i) {
            this.time = j2;
            this.snoreLevel = i;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getSnoreLevel() {
            return this.snoreLevel;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final long getTime() {
            return this.time;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DevSingleSnore)) {
                return false;
            }
            DevSingleSnore devSingleSnore = (DevSingleSnore) other;
            return this.time == devSingleSnore.time && this.snoreLevel == devSingleSnore.snoreLevel;
        }

        public int hashCode() {
            return (Long.hashCode(this.time) * 31) + Integer.hashCode(this.snoreLevel);
        }

        @NotNull
        public String toString() {
            return "DevSingleSnore(time=" + this.time + ", snoreLevel=" + this.snoreLevel + ")";
        }
    }

    /* JADX INFO: renamed from: com.heytap.health.insight.signs.InsightRepository$e, reason: from toString */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\u0012\u001a\u00020\u0004\u0012\u0006\u0010\u0016\u001a\u00020\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\u0017\u0010\u0012\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011R\u0017\u0010\u0016\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u0019"}, d2 = {"Lcom/heytap/health/insight/signs/InsightRepository$e;", "", "", "toString", "", "hashCode", "other", "", "equals", "", "Lcom/heytap/health/insight/signs/InsightRepository$d;", "a", "Ljava/util/List;", "()Ljava/util/List;", "snoreData", "b", "I", "()I", "snoreEvaResult", "c", "Z", "()Z", "isSleepApnea", "<init>", "(Ljava/util/List;IZ)V", "health_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class DevSnoreData {
        public static final int $stable = 8;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @NotNull
        public final List<DevSingleSnore> snoreData;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        public final int snoreEvaResult;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        public final boolean isSleepApnea;

        public DevSnoreData(@NotNull List<DevSingleSnore> snoreData, int i, boolean z) {
            Intrinsics.checkNotNullParameter(snoreData, "snoreData");
            this.snoreData = snoreData;
            this.snoreEvaResult = i;
            this.isSleepApnea = z;
        }

        @NotNull
        public final List<DevSingleSnore> a() {
            return this.snoreData;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getSnoreEvaResult() {
            return this.snoreEvaResult;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getIsSleepApnea() {
            return this.isSleepApnea;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DevSnoreData)) {
                return false;
            }
            DevSnoreData devSnoreData = (DevSnoreData) other;
            return Intrinsics.areEqual(this.snoreData, devSnoreData.snoreData) && this.snoreEvaResult == devSnoreData.snoreEvaResult && this.isSleepApnea == devSnoreData.isSleepApnea;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v5, types: [int] */
        /* JADX WARN: Type inference failed for: r2v2, types: [int] */
        /* JADX WARN: Type inference failed for: r2v3 */
        /* JADX WARN: Type inference failed for: r2v4 */
        public int hashCode() {
            int iHashCode = ((this.snoreData.hashCode() * 31) + Integer.hashCode(this.snoreEvaResult)) * 31;
            boolean z = this.isSleepApnea;
            ?? r2 = z;
            if (z) {
                r2 = 1;
            }
            return iHashCode + r2;
        }

        @NotNull
        public String toString() {
            return "DevSnoreData(snoreData=" + this.snoreData + ", snoreEvaResult=" + this.snoreEvaResult + ", isSleepApnea=" + this.isSleepApnea + ")";
        }
    }

    /* JADX INFO: renamed from: com.heytap.health.insight.signs.InsightRepository$f, reason: from toString */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00110\t¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\r\u0010\f\u001a\u0004\b\u000b\u0010\u000eR\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00110\t8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\f\u001a\u0004\b\u0012\u0010\u000e¨\u0006\u0016"}, d2 = {"Lcom/heytap/health/insight/signs/InsightRepository$f;", "", "", "toString", "", "hashCode", "other", "", "equals", "", "Lcom/heytap/health/health/insight/DevSignsData;", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "signsData", "crossData", "Lcom/heytap/health/insight/signs/InsightRepository$g;", "c", "singleDimenData", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "health_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class InsightNetData {
        public static final int $stable = 8;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @NotNull
        public final List<DevSignsData> signsData;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @NotNull
        public final List<DevSignsData> crossData;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final List<SingleDimenNetData> singleDimenData;

        public InsightNetData(@NotNull List<DevSignsData> signsData, @NotNull List<DevSignsData> crossData, @NotNull List<SingleDimenNetData> singleDimenData) {
            Intrinsics.checkNotNullParameter(signsData, "signsData");
            Intrinsics.checkNotNullParameter(crossData, "crossData");
            Intrinsics.checkNotNullParameter(singleDimenData, "singleDimenData");
            this.signsData = signsData;
            this.crossData = crossData;
            this.singleDimenData = singleDimenData;
        }

        @NotNull
        public final List<DevSignsData> a() {
            return this.crossData;
        }

        @NotNull
        public final List<DevSignsData> b() {
            return this.signsData;
        }

        @NotNull
        public final List<SingleDimenNetData> c() {
            return this.singleDimenData;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InsightNetData)) {
                return false;
            }
            InsightNetData insightNetData = (InsightNetData) other;
            return Intrinsics.areEqual(this.signsData, insightNetData.signsData) && Intrinsics.areEqual(this.crossData, insightNetData.crossData) && Intrinsics.areEqual(this.singleDimenData, insightNetData.singleDimenData);
        }

        public int hashCode() {
            return (((this.signsData.hashCode() * 31) + this.crossData.hashCode()) * 31) + this.singleDimenData.hashCode();
        }

        @NotNull
        public String toString() {
            return "InsightNetData(signsData=" + this.signsData + ", crossData=" + this.crossData + ", singleDimenData=" + this.singleDimenData + ")";
        }
    }

    /* JADX INFO: renamed from: com.heytap.health.insight.signs.InsightRepository$g, reason: from toString */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u0010\u001a\u00020\u0004\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\u0006\u0010\u001a\u001a\u00020\u0015¢\u0006\u0004\b\u001b\u0010\u001cJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0010\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000f\u0010\fR\u0017\u0010\u0014\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\t\u0010\u0013R\u0017\u0010\u001a\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, d2 = {"Lcom/heytap/health/insight/signs/InsightRepository$g;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "I", "getDate", "()I", "date", "b", "getType", "type", "c", "Ljava/lang/String;", "()Ljava/lang/String;", "code", "Lcom/heytap/health/insight/data/datasource/net/IntegrateDataListItem;", "d", "Lcom/heytap/health/insight/data/datasource/net/IntegrateDataListItem;", "getDataItem", "()Lcom/heytap/health/insight/data/datasource/net/IntegrateDataListItem;", "dataItem", "<init>", "(IILjava/lang/String;Lcom/heytap/health/insight/data/datasource/net/IntegrateDataListItem;)V", "health_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class SingleDimenNetData {
        public static final int $stable = 8;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        public final int date;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        public final int type;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final String code;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
        @NotNull
        public final IntegrateDataListItem dataItem;

        public SingleDimenNetData(int i, int i2, @NotNull String code, @NotNull IntegrateDataListItem dataItem) {
            Intrinsics.checkNotNullParameter(code, "code");
            Intrinsics.checkNotNullParameter(dataItem, "dataItem");
            this.date = i;
            this.type = i2;
            this.code = code;
            this.dataItem = dataItem;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getCode() {
            return this.code;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SingleDimenNetData)) {
                return false;
            }
            SingleDimenNetData singleDimenNetData = (SingleDimenNetData) other;
            return this.date == singleDimenNetData.date && this.type == singleDimenNetData.type && Intrinsics.areEqual(this.code, singleDimenNetData.code) && Intrinsics.areEqual(this.dataItem, singleDimenNetData.dataItem);
        }

        public int hashCode() {
            return (((((Integer.hashCode(this.date) * 31) + Integer.hashCode(this.type)) * 31) + this.code.hashCode()) * 31) + this.dataItem.hashCode();
        }

        @NotNull
        public String toString() {
            return "SingleDimenNetData(date=" + this.date + ", type=" + this.type + ", code=" + this.code + ", dataItem=" + this.dataItem + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/heytap/databaseengine/model/SleepDataStat;", "it", "Lcom/oplus/aiunit/vision/zeh;", "a", "(Ljava/util/List;)Lcom/oplus/aiunit/vision/zeh;"}, k = 3, mv = {1, 8, 0})
    public static final class h<T, R> implements g18 {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ long f5883j;
        public final /* synthetic */ long k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ long f5884l;

        public h(long j2, long j3, long j4) {
            this.f5883j = j2;
            this.k = j3;
            this.f5884l = j4;
        }

        @Override // com.oplus.aiunit.vision.g18
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final zeh apply(@NotNull List<SleepDataStat> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return InsightRepository.this.r().b(this.f5883j, this.k, this.f5884l, it);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lcom/oplus/aiunit/vision/zeh;", "a", "(Ljava/lang/Throwable;)Lcom/oplus/aiunit/vision/zeh;"}, k = 3, mv = {1, 8, 0})
    public static final class i<T, R> implements g18 {
        public static final i<T, R> INSTANCE = new i<>();

        @Override // com.oplus.aiunit.vision.g18
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final zeh apply(@NotNull Throwable it) {
            Intrinsics.checkNotNullParameter(it, "it");
            m8b.b("InsightRepository", "queryScoreData error:" + it.getMessage());
            return new zeh(new ArrayList(), true, 0L, 0L);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/heytap/databaseengine/model/snore/OsaResultBean;", "it", "Lcom/heytap/health/sleep/snore/bean/SnoreWeekBean;", "a", "(Ljava/util/List;)Lcom/heytap/health/sleep/snore/bean/SnoreWeekBean;"}, k = 3, mv = {1, 8, 0})
    public static final class j<T, R> implements g18 {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ long f5885j;
        public final /* synthetic */ long k;

        public j(long j2, long j3) {
            this.f5885j = j2;
            this.k = j3;
        }

        @Override // com.oplus.aiunit.vision.g18
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SnoreWeekBean apply(@NotNull List<OsaResultBean> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return InsightRepository.this.v().b(this.f5885j, this.k, it);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lcom/heytap/health/sleep/snore/bean/SnoreWeekBean;", "a", "(Ljava/lang/Throwable;)Lcom/heytap/health/sleep/snore/bean/SnoreWeekBean;"}, k = 3, mv = {1, 8, 0})
    public static final class k<T, R> implements g18 {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ long f5886j;
        public final /* synthetic */ long k;

        public k(long j2, long j3) {
            this.f5886j = j2;
            this.k = j3;
        }

        @Override // com.oplus.aiunit.vision.g18
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SnoreWeekBean apply(@NotNull Throwable it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return InsightRepository.this.v().b(this.f5886j, this.k, new ArrayList());
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\t¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "Lkotlin/coroutines/CoroutineContext;", "context", "", "exception", "", "handleException", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 InsightRepository.kt\ncom/heytap/health/insight/signs/InsightRepository\n*L\n1#1,110:1\n88#2,3:111\n*E\n"})
    public static final class l extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
        public l(CoroutineExceptionHandler.Companion companion) {
            super(companion);
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(@NotNull CoroutineContext context, @NotNull Throwable exception) {
            m8b.b("InsightRepository", "exceptionHandler:" + exception.getMessage());
            String strStackTraceToString = ExceptionsKt__ExceptionsKt.stackTraceToString(exception);
            StringBuilder sb = new StringBuilder();
            sb.append("exceptionHandler:");
            sb.append(strStackTraceToString);
        }
    }

    public static final boolean H(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:34:0x018c A[LOOP:0: B:32:0x0186->B:34:0x018c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Nullable
    public final Object A(long j2, @NotNull Continuation<? super List<Float>> continuation) {
        InsightRepository$queryReserveHr$1 insightRepository$queryReserveHr$1;
        String ssoid;
        long j3;
        int iO;
        Object objB;
        double d;
        int iIntValue;
        ArrayList arrayList;
        Iterator it;
        InsightRepository insightRepository = this;
        if (continuation instanceof InsightRepository$queryReserveHr$1) {
            insightRepository$queryReserveHr$1 = (InsightRepository$queryReserveHr$1) continuation;
            int i2 = insightRepository$queryReserveHr$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                insightRepository$queryReserveHr$1.label = i2 - Integer.MIN_VALUE;
            } else {
                insightRepository$queryReserveHr$1 = new InsightRepository$queryReserveHr$1(insightRepository, continuation);
            }
        } else {
            insightRepository$queryReserveHr$1 = new InsightRepository$queryReserveHr$1(insightRepository, continuation);
        }
        Object objC = insightRepository$queryReserveHr$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = insightRepository$queryReserveHr$1.label;
        if (i3 != 0) {
            if (i3 == 1) {
                int i4 = insightRepository$queryReserveHr$1.I$0;
                j3 = insightRepository$queryReserveHr$1.J$0;
                ssoid = (String) insightRepository$queryReserveHr$1.L$1;
                InsightRepository insightRepository2 = (InsightRepository) insightRepository$queryReserveHr$1.L$0;
                ResultKt.throwOnFailure(objC);
                iO = i4;
                insightRepository = insightRepository2;
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                d = insightRepository$queryReserveHr$1.D$0;
                ResultKt.throwOnFailure(objC);
                objB = objC;
            }
            iIntValue = ((Number) objB).intValue();
            m8b.f("InsightRepository", "queryReserveHr ^^" + iIntValue);
            float fRoundToInt = (float) MathKt__MathJVMKt.roundToInt(d - ((double) iIntValue));
            List listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Float[]{Boxing.boxFloat(0.3f * fRoundToInt), Boxing.boxFloat(0.5f * fRoundToInt), Boxing.boxFloat(0.65f * fRoundToInt), Boxing.boxFloat(0.8f * fRoundToInt), Boxing.boxFloat(0.9f * fRoundToInt), Boxing.boxFloat(fRoundToInt)});
            arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listListOf, 10));
            it = listListOf.iterator();
            while (it.hasNext()) {
                arrayList.add(Boxing.boxFloat(((Number) it.next()).floatValue() + iIntValue));
            }
            return arrayList;
        }
        ResultKt.throwOnFailure(objC);
        m8b.f("InsightRepository", "queryReserveHr time:" + h15.E(j2));
        ssoid = fdg.w().D("user_ssoid");
        ddd<CommonBackBean> userInfo = SportHealthDataAPI.getInstance().getUserInfo(ssoid);
        Intrinsics.checkNotNullExpressionValue(userInfo, "getInstance().getUserInfo(ssoid)");
        insightRepository$queryReserveHr$1.L$0 = insightRepository;
        insightRepository$queryReserveHr$1.L$1 = ssoid;
        j3 = j2;
        insightRepository$queryReserveHr$1.J$0 = j3;
        iO = 23;
        insightRepository$queryReserveHr$1.I$0 = 23;
        insightRepository$queryReserveHr$1.label = 1;
        objC = RxExtendKt.c(userInfo, insightRepository$queryReserveHr$1);
        if (objC == coroutine_suspended) {
            return coroutine_suspended;
        }
        CommonBackBean commonBackBean = (CommonBackBean) objC;
        if (commonBackBean.getErrorCode() == 0 && commonBackBean.getObj() != null) {
            Object obj = commonBackBean.getObj();
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<com.heytap.databaseengine.model.UserInfo>");
            String birthday = ((UserInfo) ((List) obj).get(0)).getBirthday();
            Intrinsics.checkNotNullExpressionValue(birthday, "userInfo.birthday");
            if (TextUtils.isEmpty(birthday)) {
                m8b.b("InsightRepository", "queryReserveHr error, db return null");
            } else {
                iO = insightRepository.o(birthday);
            }
        }
        m8b.f("InsightRepository", "queryReserveHr --" + iO);
        double d2 = ((double) 208) - (((double) iO) * 0.7d);
        Intrinsics.checkNotNullExpressionValue(ssoid, "ssoid");
        insightRepository$queryReserveHr$1.L$0 = null;
        insightRepository$queryReserveHr$1.L$1 = null;
        insightRepository$queryReserveHr$1.D$0 = d2;
        insightRepository$queryReserveHr$1.label = 2;
        objB = insightRepository.B(ssoid, j3, insightRepository$queryReserveHr$1);
        if (objB == coroutine_suspended) {
            return coroutine_suspended;
        }
        d = d2;
        iIntValue = ((Number) objB).intValue();
        m8b.f("InsightRepository", "queryReserveHr ^^" + iIntValue);
        float fRoundToInt2 = (float) MathKt__MathJVMKt.roundToInt(d - ((double) iIntValue));
        List listListOf2 = CollectionsKt__CollectionsKt.listOf((Object[]) new Float[]{Boxing.boxFloat(0.3f * fRoundToInt2), Boxing.boxFloat(0.5f * fRoundToInt2), Boxing.boxFloat(0.65f * fRoundToInt2), Boxing.boxFloat(0.8f * fRoundToInt2), Boxing.boxFloat(0.9f * fRoundToInt2), Boxing.boxFloat(fRoundToInt2)});
        arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listListOf2, 10));
        it = listListOf2.iterator();
        while (it.hasNext()) {
            arrayList.add(Boxing.boxFloat(((Number) it.next()).floatValue() + iIntValue));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object B(String str, long j2, Continuation<? super Integer> continuation) {
        InsightRepository$queryRestHr$1 insightRepository$queryRestHr$1;
        int i2;
        if (continuation instanceof InsightRepository$queryRestHr$1) {
            insightRepository$queryRestHr$1 = (InsightRepository$queryRestHr$1) continuation;
            int i3 = insightRepository$queryRestHr$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                insightRepository$queryRestHr$1.label = i3 - Integer.MIN_VALUE;
            } else {
                insightRepository$queryRestHr$1 = new InsightRepository$queryRestHr$1(this, continuation);
            }
        } else {
            insightRepository$queryRestHr$1 = new InsightRepository$queryRestHr$1(this, continuation);
        }
        Object objC = insightRepository$queryRestHr$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = insightRepository$queryRestHr$1.label;
        if (i4 == 0) {
            ResultKt.throwOnFailure(objC);
            DataReadOption dataReadOption = new DataReadOption();
            dataReadOption.setSsoid(str);
            dataReadOption.setStartTime(h15.w(j2));
            dataReadOption.setEndTime(h15.f(j2));
            dataReadOption.setDataTable(1009);
            dataReadOption.setGroupUnitType(4);
            dataReadOption.setSortOrder(0);
            ddd<CommonBackBean> sportHealthData = SportHealthDataAPI.getInstance().readSportHealthData(dataReadOption);
            Intrinsics.checkNotNullExpressionValue(sportHealthData, "getInstance().readSportHealthData(dataReadOption)");
            i2 = 60;
            insightRepository$queryRestHr$1.I$0 = 60;
            insightRepository$queryRestHr$1.label = 1;
            objC = RxExtendKt.c(sportHealthData, insightRepository$queryRestHr$1);
            if (objC == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i2 = insightRepository$queryRestHr$1.I$0;
            ResultKt.throwOnFailure(objC);
        }
        CommonBackBean commonBackBean = (CommonBackBean) objC;
        if (commonBackBean.getErrorCode() != 0 || commonBackBean.getObj() == null) {
            m8b.f("InsightRepository", "queryRestHr something error:" + i2);
        } else {
            Object obj = commonBackBean.getObj();
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<com.heytap.databaseengine.model.HeartRateDataStat>");
            int restHeartRate = ((HeartRateDataStat) ((List) obj).get(0)).getRestHeartRate();
            if (restHeartRate != 0) {
                i2 = restHeartRate;
            }
            m8b.f("InsightRepository", "queryRestHr return result:" + i2);
        }
        return Boxing.boxInt(i2);
    }

    @SuppressLint({"CheckResult"})
    @Nullable
    public final Object C(@NotNull Continuation<? super DevScoreData> continuation) {
        m8b.f("InsightRepository", "queryScoreData");
        LocalDate localDateNow = LocalDate.now();
        Intrinsics.checkNotNullExpressionValue(localDateNow, "now()");
        RelativeDateRange relativeDateRangeJ = h15.J(localDateNow);
        final long jH = h15.H(relativeDateRangeJ.h());
        final long jH2 = h15.H(relativeDateRangeJ.g());
        long jH3 = h15.H(relativeDateRangeJ.f());
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        t().a(4, jH3, jH2, 0).j0(new h(jH3, jH, jH2)).t0(i.INSTANCE).a(new b24() { // from class: com.heytap.health.insight.signs.InsightRepository$queryScoreData$2$3
            @Override // com.oplus.aiunit.vision.b24
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final void accept(@NotNull zeh chartBean) {
                List<Integer> listB;
                List<Integer> listF;
                Intrinsics.checkNotNullParameter(chartBean, "chartBean");
                mfh mfhVarE = this.i.s().e(jH, jH2, chartBean.f());
                tqh tqhVarA = mfhVarE.a();
                int size = 0;
                int size2 = (tqhVarA == null || (listF = tqhVarA.f()) == null) ? 0 : listF.size();
                tqh tqhVarA2 = mfhVarE.a();
                if (tqhVarA2 != null && (listB = tqhVarA2.b()) != null) {
                    size = listB.size();
                }
                m8b.f("InsightRepository", "sleepTimeComparedBean, beforeSize:" + size2 + ", afterSize:" + size);
                tqh tqhVarA3 = mfhVarE.a();
                InsightRepository.DevScoreData devScoreDataG = null;
                if (tqhVarA3 != null) {
                    if (!this.i.w(tqhVarA3)) {
                        tqhVarA3 = null;
                    }
                    if (tqhVarA3 != null) {
                        InsightRepository insightRepository = this.i;
                        StringBuilder sb = new StringBuilder();
                        sb.append("queryScoreData dbScoreData:");
                        sb.append(tqhVarA3);
                        devScoreDataG = insightRepository.G(tqhVarA3);
                    }
                }
                m8b.f("InsightRepository", "final score result:" + devScoreDataG);
                cancellableContinuationImpl.resume(devScoreDataG, new Function1<Throwable, Unit>() { // from class: com.heytap.health.insight.signs.InsightRepository$queryScoreData$2$3.1
                    @Override // p010kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                        invoke2(th);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull Throwable it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        m8b.b("InsightRepository", "queryScoreData cancel error:" + it.getMessage());
                    }
                });
            }
        });
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    @Nullable
    public final Object D(@Nullable Integer num, @Nullable Integer num2, @NotNull Continuation<? super InsightNetData> continuation) {
        InsightRepository$querySignsData$1 insightRepository$querySignsData$1;
        int iIntValue;
        int iIntValue2;
        InsightRepository insightRepository = this;
        if (continuation instanceof InsightRepository$querySignsData$1) {
            insightRepository$querySignsData$1 = (InsightRepository$querySignsData$1) continuation;
            int i2 = insightRepository$querySignsData$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                insightRepository$querySignsData$1.label = i2 - Integer.MIN_VALUE;
            } else {
                insightRepository$querySignsData$1 = new InsightRepository$querySignsData$1(insightRepository, continuation);
            }
        } else {
            insightRepository$querySignsData$1 = new InsightRepository$querySignsData$1(insightRepository, continuation);
        }
        Object objB = insightRepository$querySignsData$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = insightRepository$querySignsData$1.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objB);
            m8b.f("InsightRepository", "querySignsData startTime:" + num + ", endTime:" + num2);
            HashMap map = new HashMap();
            if (cwg.a().c()) {
                iIntValue = 20230728;
                iIntValue2 = 20230728;
            } else {
                LocalDate localDateNow = LocalDate.now();
                Intrinsics.checkNotNullExpressionValue(localDateNow, "now()");
                int iB = h15.B(localDateNow);
                iIntValue = num != null ? num.intValue() : iB;
                iIntValue2 = num2 != null ? num2.intValue() : iB;
            }
            map.put(s04.JSON_KEY_DIGITAL_KEY_START_TIME, Boxing.boxInt(iIntValue));
            map.put("endDate", Boxing.boxInt(iIntValue2));
            kba kbaVar = (kba) a.j(kba.class);
            insightRepository$querySignsData$1.L$0 = insightRepository;
            insightRepository$querySignsData$1.label = 1;
            objB = kbaVar.b(map, insightRepository$querySignsData$1);
            if (objB == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            insightRepository = (InsightRepository) insightRepository$querySignsData$1.L$0;
            ResultKt.throwOnFailure(objB);
        }
        BaseResponse baseResponse = (BaseResponse) objB;
        m8b.f("InsightRepository", "querySignsData net response:" + baseResponse);
        if (!baseResponse.isSuccess() || baseResponse.getBody() == null) {
            m8b.f("InsightRepository", "querySignsData " + baseResponse.getErrorCode() + ", body:" + baseResponse.getBody());
            return new InsightNetData(CollectionsKt__CollectionsKt.emptyList(), CollectionsKt__CollectionsKt.emptyList(), CollectionsKt__CollectionsKt.emptyList());
        }
        IntegrateDataBean integrateDataBean = (IntegrateDataBean) baseResponse.getBody();
        if (integrateDataBean == null || integrateDataBean.isEmpty()) {
            return new InsightNetData(CollectionsKt__CollectionsKt.emptyList(), CollectionsKt__CollectionsKt.emptyList(), CollectionsKt__CollectionsKt.emptyList());
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (IntegrateDataItem integrateDataItem : integrateDataBean) {
            for (IntegrateDataListItem integrateDataListItem : integrateDataItem.getDataList()) {
                if (integrateDataListItem.getDataType() == 1) {
                    if (integrateDataListItem.getType() != null) {
                        String code = integrateDataListItem.getCode();
                        if (!(code == null || code.length() == 0)) {
                            arrayList3.add(new SingleDimenNetData(integrateDataItem.getDate(), integrateDataListItem.getType().intValue(), integrateDataListItem.getCode(), integrateDataListItem));
                            int date = integrateDataItem.getDate();
                            Integer type = integrateDataListItem.getType();
                            String code2 = integrateDataListItem.getCode();
                            StringBuilder sb = new StringBuilder();
                            sb.append("querySignsData singleDimen: date=");
                            sb.append(date);
                            sb.append(", type=");
                            sb.append(type);
                            sb.append(", code=");
                            sb.append(code2);
                        }
                    }
                    m8b.m("InsightRepository", "querySignsData singleDimen data incomplete: date=" + integrateDataItem.getDate() + ", type=" + integrateDataListItem.getType() + ", code=" + integrateDataListItem.getCode());
                } else if (integrateDataListItem.getDataType() == 2) {
                    SignsBeanItem signsBeanItemN = insightRepository.n(integrateDataListItem, integrateDataItem.getDate());
                    if (signsBeanItemN != null) {
                        if (insightRepository.p().h(signsBeanItemN.getType())) {
                            DevSignsData devSignsDataD = insightRepository.q().d(signsBeanItemN);
                            if (devSignsDataD != null) {
                                Boxing.boxBoolean(arrayList.add(devSignsDataD));
                            }
                        } else if (insightRepository.p().d(signsBeanItemN.getType())) {
                            DevSignsData devSignsDataD2 = insightRepository.q().d(signsBeanItemN);
                            if (devSignsDataD2 != null) {
                                Boxing.boxBoolean(arrayList2.add(devSignsDataD2));
                            }
                        } else {
                            m8b.b("InsightRepository", "querySignsData errorType:" + signsBeanItemN.getType() + ", dataType:" + integrateDataListItem.getDataType());
                        }
                    }
                } else {
                    m8b.b("InsightRepository", "querySignsData unknown dataType:" + integrateDataListItem.getDataType());
                }
            }
        }
        return new InsightNetData(arrayList, arrayList2, arrayList3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object E(String str, Continuation<? super List<? extends SleepIndex>> continuation) {
        InsightRepository$querySleepIndexes$1 insightRepository$querySleepIndexes$1;
        if (continuation instanceof InsightRepository$querySleepIndexes$1) {
            insightRepository$querySleepIndexes$1 = (InsightRepository$querySleepIndexes$1) continuation;
            int i2 = insightRepository$querySleepIndexes$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                insightRepository$querySleepIndexes$1.label = i2 - Integer.MIN_VALUE;
            } else {
                insightRepository$querySleepIndexes$1 = new InsightRepository$querySleepIndexes$1(this, continuation);
            }
        } else {
            insightRepository$querySleepIndexes$1 = new InsightRepository$querySleepIndexes$1(this, continuation);
        }
        Object objC = insightRepository$querySleepIndexes$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = insightRepository$querySleepIndexes$1.label;
        boolean z = false;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objC);
            m8b.f("InsightRepository", "querySleepIndexes");
            DataReadOption dataReadOption = new DataReadOption();
            dataReadOption.setSsoid(fdg.w().D("user_ssoid"));
            LocalDate localDateNow = LocalDate.now();
            Intrinsics.checkNotNullExpressionValue(localDateNow, "now()");
            dataReadOption.setStartTime(h15.H(localDateNow));
            LocalDate localDateNow2 = LocalDate.now();
            Intrinsics.checkNotNullExpressionValue(localDateNow2, "now()");
            dataReadOption.setEndTime(h15.A(localDateNow2));
            dataReadOption.setDataTable(IONetService.Stub.TRANSACTION_setSenselessConnectionCallback);
            dataReadOption.setGroupUnitType(4);
            dataReadOption.setSortOrder(0);
            pr8 pr8Var = pr8.INSTANCE;
            if (pr8Var.e(dataReadOption.getEndTime()) >= pr8Var.e(System.currentTimeMillis())) {
                dataReadOption.setIsParse(2);
            }
            ddd<CommonBackBean> sportHealthData = SportHealthDataAPI.getInstance().readSportHealthData(dataReadOption);
            Intrinsics.checkNotNullExpressionValue(sportHealthData, "getInstance().readSportHealthData(dataReadOption)");
            insightRepository$querySleepIndexes$1.L$0 = str;
            insightRepository$querySleepIndexes$1.label = 1;
            objC = RxExtendKt.c(sportHealthData, insightRepository$querySleepIndexes$1);
            if (objC == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) insightRepository$querySleepIndexes$1.L$0;
            ResultKt.throwOnFailure(objC);
        }
        Intrinsics.checkNotNullExpressionValue(objC, "getInstance().readSportH…taReadOption).awaitOnce()");
        CommonBackBean commonBackBean = (CommonBackBean) objC;
        ArrayList arrayList = new ArrayList();
        if (commonBackBean.getErrorCode() == 0 && commonBackBean.getObj() != null) {
            Object obj = commonBackBean.getObj();
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<com.heytap.databaseengine.model.SleepIndex>");
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : (List) obj) {
                if (Intrinsics.areEqual(((SleepIndex) obj2).getDeviceUniqueId(), str)) {
                    arrayList2.add(obj2);
                }
            }
            if (!arrayList2.isEmpty()) {
                if (arrayList2.isEmpty()) {
                    z = true;
                    break;
                }
                Iterator it = arrayList2.iterator();
                do {
                    if (!it.hasNext()) {
                        z = true;
                        break;
                    }
                } while (!(((SleepIndex) it.next()).getHasHeartRateWarning() != 1));
                if (!z) {
                    m8b.f("InsightRepository", "updateDbSleepHrWarnField result size:" + arrayList2.size());
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        ((SleepIndex) it2.next()).setHasHeartRateWarning(1);
                    }
                    arrayList.addAll(arrayList2);
                }
            }
            m8b.b("InsightRepository", "querySleepIndexes no match device data:" + arrayList2.size());
            return CollectionsKt__CollectionsKt.emptyList();
        }
        m8b.b("InsightRepository", "querySleepIndexes error:" + commonBackBean.getErrorCode() + ", obj null:" + (commonBackBean.getObj() == null));
        return arrayList;
    }

    @SuppressLint({"CheckResult"})
    @Nullable
    public final Object F(@NotNull Continuation<? super DevSnoreData> continuation) {
        LocalDate localDateNow = LocalDate.now();
        Intrinsics.checkNotNullExpressionValue(localDateNow, "now()");
        RelativeDateRange relativeDateRangeJ = h15.J(localDateNow);
        long jH = h15.H(relativeDateRangeJ.h());
        long jH2 = h15.H(relativeDateRangeJ.g());
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        u().b(jH, jH2).j0(new j(jH, jH2)).t0(new k(jH, jH2)).a(new b24() { // from class: com.heytap.health.insight.signs.InsightRepository$querySnoreData$2$3
            @Override // com.oplus.aiunit.vision.b24
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final void accept(@NotNull SnoreWeekBean snoreWeekBean) {
                Intrinsics.checkNotNullParameter(snoreWeekBean, "snoreWeekBean");
                List<SnoreLevelData> sleepApneaDataList = snoreWeekBean.getIsShowSleepApnea() ? snoreWeekBean.getSleepApneaDataList() : snoreWeekBean.getSnoreLevelDataList();
                List<SnoreLevelData> list = sleepApneaDataList;
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                for (SnoreLevelData snoreLevelData : list) {
                    arrayList.add(new InsightRepository.DevSingleSnore(snoreLevelData.getTimestamp(), snoreLevelData.getLevel()));
                }
                int iC = this.i.v().c(0, arrayList.size() - 1, sleepApneaDataList);
                if (this.i.x(iC)) {
                    cancellableContinuationImpl.resume(new InsightRepository.DevSnoreData(arrayList, iC, snoreWeekBean.getIsShowSleepApnea()), new Function1<Throwable, Unit>() { // from class: com.heytap.health.insight.signs.InsightRepository$querySnoreData$2$3.1
                        @Override // p010kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                            invoke2(th);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull Throwable it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            m8b.b("InsightRepository", "querySnoreData error:" + it.getMessage());
                        }
                    });
                } else {
                    cancellableContinuationImpl.resume(null, new Function1<Throwable, Unit>() { // from class: com.heytap.health.insight.signs.InsightRepository$querySnoreData$2$3.2
                        @Override // p010kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                            invoke2(th);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull Throwable it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            m8b.b("InsightRepository", "querySnoreData snore not reach result:" + it.getMessage());
                        }
                    });
                }
            }
        });
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    public final DevScoreData G(tqh scoreComparedBean) {
        LocalDate localDate;
        List<Integer> list;
        LocalDate localDateD = h15.D(scoreComparedBean.getBeforeChartLowestVisibleTime());
        LocalDate localDateD2 = h15.D(scoreComparedBean.getBeforeChartHighestVisibleTime());
        List<Integer> listF = scoreComparedBean.f();
        LocalDate localDateD3 = h15.D(scoreComparedBean.getAfterChartLowestVisibleTime());
        LocalDate localDateD4 = h15.D(scoreComparedBean.getAfterChartHighestVisibleTime());
        List<Integer> listB = scoreComparedBean.b();
        ArrayList arrayList = new ArrayList();
        if (h15.e(localDateD, localDateD2) <= listF.size()) {
            List<Integer> list2 = listF;
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
            int i2 = 0;
            for (Object obj : list2) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                int iIntValue = ((Number) obj).intValue();
                LocalDate localDate2 = localDateD3;
                LocalDate localDatePlusDays = localDateD.plusDays(i2);
                Intrinsics.checkNotNullExpressionValue(localDatePlusDays, "beforeStartDate.plusDays(index.toLong())");
                arrayList2.add(new DevSingleScore(h15.H(localDatePlusDays), iIntValue));
                i2 = i3;
                localDateD3 = localDate2;
                localDateD4 = localDateD4;
            }
            arrayList.addAll(arrayList2);
        } else {
            m8b.b("InsightRepository", "transDbScoreToDev before error, " + localDateD + Constants.ACCEPT_TIME_SEPARATOR_SERVER + localDateD2 + ", size:" + listF.size());
            localDateD3 = localDateD3;
            localDateD4 = localDateD4;
        }
        if (h15.e(localDateD3, localDateD4) <= listB.size()) {
            List<Integer> list3 = listB;
            ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10));
            int i4 = 0;
            for (Object obj2 : list3) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                int iIntValue2 = ((Number) obj2).intValue();
                LocalDate localDate3 = localDateD4;
                LocalDate localDatePlusDays2 = localDateD3.plusDays(i4);
                Intrinsics.checkNotNullExpressionValue(localDatePlusDays2, "afterStartDate.plusDays(index.toLong())");
                arrayList3.add(new DevSingleScore(h15.H(localDatePlusDays2), iIntValue2));
                listB = listB;
                i4 = i5;
                localDateD4 = localDate3;
            }
            localDate = localDateD4;
            list = listB;
            arrayList.addAll(arrayList3);
        } else {
            localDate = localDateD4;
            list = listB;
            m8b.b("InsightRepository", "transDbScoreToDev before error, " + localDateD + Constants.ACCEPT_TIME_SEPARATOR_SERVER + localDateD2 + ", size:" + listF.size());
        }
        m8b.f("InsightRepository", "transDbScoreToDev " + localDateD + Constants.ACCEPT_TIME_SEPARATOR_SERVER + localDateD2 + "," + localDateD3 + Constants.ACCEPT_TIME_SEPARATOR_SERVER + localDate + ",beforeSize:" + listF.size() + ",afterSize:" + list.size());
        final InsightRepository$transDbScoreToDev$3 insightRepository$transDbScoreToDev$3 = new Function1<DevSingleScore, Boolean>() { // from class: com.heytap.health.insight.signs.InsightRepository$transDbScoreToDev$3
            @Override // p010kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull InsightRepository.DevSingleScore it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(it.getScore() <= 0);
            }
        };
        arrayList.removeIf(new Predicate() { // from class: com.oplus.aiunit.vision.cca
            @Override // java.util.function.Predicate
            public final boolean test(Object obj3) {
                return InsightRepository.H(insightRepository$transDbScoreToDev$3, obj3);
            }
        });
        return new DevScoreData(CollectionsKt___CollectionsKt.toList(arrayList), scoreComparedBean.getBeforeSleepAverageScore(), scoreComparedBean.getAfterSleepAverageScore());
    }

    @SuppressLint({"CheckResult"})
    public final void I(@NotNull String deviceUniqueId) {
        Intrinsics.checkNotNullParameter(deviceUniqueId, "deviceUniqueId");
        if (!(deviceUniqueId.length() == 0)) {
            m8b.f("InsightRepository", "updateDbSleepHrWarnField");
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(zr8.INSTANCE.e()), this.exceptionHandler, null, new InsightRepository$updateDbSleepHrWarnField$1(this, deviceUniqueId, null), 2, null);
            return;
        }
        m8b.b("InsightRepository", "updateDbSleepHrWarnField " + deviceUniqueId + " is empty");
    }

    public final Object J(List<? extends SleepIndex> list, Continuation<? super Unit> continuation) {
        if (list.isEmpty()) {
            return Unit.INSTANCE;
        }
        DataInsertOption dataInsertOption = new DataInsertOption();
        dataInsertOption.setDataTable(IONetService.Stub.TRANSACTION_setSenselessConnectionCallback);
        dataInsertOption.setDatas(list);
        ddd<CommonBackBean> dddVarInsertSportHealthData = SportHealthDataAPI.getInstance().insertSportHealthData(dataInsertOption);
        Intrinsics.checkNotNullExpressionValue(dddVarInsertSportHealthData, "getInstance().insertSportHealthData(this)");
        Object objC = RxExtendKt.c(dddVarInsertSportHealthData, continuation);
        if (objC == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return objC;
        }
        return Unit.INSTANCE;
    }

    public final void m(@NotNull String code, boolean result) {
        Intrinsics.checkNotNullParameter(code, "code");
        m8b.f("InsightRepository", "commitFeedback " + code + ", " + result);
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(zr8.INSTANCE.e()), this.exceptionHandler, null, new InsightRepository$commitFeedback$1(code, result, null), 2, null);
    }

    public final SignsBeanItem n(IntegrateDataListItem item, int date) {
        try {
            if (item.getType() != null && item.getSubType() != null) {
                List<BaseLineInfo> baseLineInfo = item.getBaseLineInfo();
                String code = item.getCode();
                Info info = item.getInfo();
                int iIntValue = item.getSubType().intValue();
                TranslateText translateText = item.getTranslateText();
                int iIntValue2 = item.getType().intValue();
                String icon = item.getIcon();
                String str = icon == null ? "" : icon;
                Long updateTime = item.getUpdateTime();
                long jLongValue = updateTime != null ? updateTime.longValue() : 0L;
                String link = item.getLink();
                String str2 = link == null ? "" : link;
                String chartType = item.getChartType();
                String str3 = chartType == null ? "" : chartType;
                String chart = item.getChart();
                return new SignsBeanItem(baseLineInfo, code, date, info, iIntValue, translateText, iIntValue2, str, jLongValue, str2, str3, chart == null ? "" : chart);
            }
            m8b.b("InsightRepository", "convertToSignsBeanItem type or subType is null, code:" + item.getCode());
            return null;
        } catch (Exception e2) {
            m8b.b("InsightRepository", "convertToSignsBeanItem error:" + e2.getMessage());
            return null;
        }
    }

    public final int o(String data) {
        LocalDate localDate = LocalDate.parse(data, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        int year = localDate.getYear();
        int monthValue = localDate.getMonthValue();
        int dayOfMonth = localDate.getDayOfMonth();
        LocalDate localDateNow = LocalDate.now();
        int year2 = localDateNow.getYear();
        int monthValue2 = localDateNow.getMonthValue();
        int dayOfMonth2 = localDateNow.getDayOfMonth();
        int i2 = year2 - year;
        if (monthValue2 <= monthValue) {
            return (monthValue2 != monthValue || dayOfMonth2 < dayOfMonth) ? i2 - 1 : i2;
        }
        return i2;
    }

    public final InsightDataChecker p() {
        return (InsightDataChecker) this.dataChecker.getValue();
    }

    public final qba q() {
        return (qba) this.insightNetHelper.getValue();
    }

    public final zuh r() {
        return (zuh) this.scoreTransform.getValue();
    }

    public final zuh s() {
        return (zuh) this.scoreWeekTransform.getValue();
    }

    public final loh t() {
        return (loh) this.sleepScoreRepository.getValue();
    }

    public final w4i u() {
        return (w4i) this.snoreWeekRepository.getValue();
    }

    public final SnoreWeekTransform v() {
        return (SnoreWeekTransform) this.snoreWeekTransform.getValue();
    }

    public final boolean w(tqh scoreComparedBean) {
        List<Integer> listF = scoreComparedBean.f();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listF.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((Number) next).intValue() > 0) {
                arrayList.add(next);
            }
        }
        int size = arrayList.size();
        List<Integer> listB = scoreComparedBean.b();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : listB) {
            if (((Number) obj).intValue() > 0) {
                arrayList2.add(obj);
            }
        }
        int size2 = arrayList2.size();
        m8b.f("InsightRepository", "isScoreReachingSingleDimen before:(" + size + "," + scoreComparedBean.getBeforeSleepAverageScore() + "),(" + size2 + "," + scoreComparedBean.getAfterSleepAverageScore() + ")");
        if (size >= 3 && size2 >= 3) {
            if (Math.abs(scoreComparedBean.getAfterSleepAverageScore() - scoreComparedBean.getBeforeSleepAverageScore()) >= 5) {
                return true;
            }
        }
        return false;
    }

    public final boolean x(int evaResult) {
        return evaResult >= 2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object y(@NotNull Continuation<? super List<Integer>> continuation) {
        InsightRepository$queryDateByExistData$1 insightRepository$queryDateByExistData$1;
        if (continuation instanceof InsightRepository$queryDateByExistData$1) {
            insightRepository$queryDateByExistData$1 = (InsightRepository$queryDateByExistData$1) continuation;
            int i2 = insightRepository$queryDateByExistData$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                insightRepository$queryDateByExistData$1.label = i2 - Integer.MIN_VALUE;
            } else {
                insightRepository$queryDateByExistData$1 = new InsightRepository$queryDateByExistData$1(this, continuation);
            }
        } else {
            insightRepository$queryDateByExistData$1 = new InsightRepository$queryDateByExistData$1(this, continuation);
        }
        Object objD = insightRepository$queryDateByExistData$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = insightRepository$queryDateByExistData$1.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objD);
            m8b.f("InsightRepository", "queryDateByExistData");
            kba kbaVar = (kba) a.j(kba.class);
            HashMap map = new HashMap();
            insightRepository$queryDateByExistData$1.label = 1;
            objD = kbaVar.d(map, insightRepository$queryDateByExistData$1);
            if (objD == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objD);
        }
        BaseResponse baseResponse = (BaseResponse) objD;
        if (!baseResponse.isSuccess() || baseResponse.getBody() == null) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        Object body = baseResponse.getBody();
        Intrinsics.checkNotNull(body);
        return body;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object z(@NotNull Continuation<? super RecentDataBean> continuation) {
        InsightRepository$queryRecentData$1 insightRepository$queryRecentData$1;
        if (continuation instanceof InsightRepository$queryRecentData$1) {
            insightRepository$queryRecentData$1 = (InsightRepository$queryRecentData$1) continuation;
            int i2 = insightRepository$queryRecentData$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                insightRepository$queryRecentData$1.label = i2 - Integer.MIN_VALUE;
            } else {
                insightRepository$queryRecentData$1 = new InsightRepository$queryRecentData$1(this, continuation);
            }
        } else {
            insightRepository$queryRecentData$1 = new InsightRepository$queryRecentData$1(this, continuation);
        }
        Object objE = insightRepository$queryRecentData$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = insightRepository$queryRecentData$1.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objE);
            m8b.f("InsightRepository", "queryRecentData");
            kba kbaVar = (kba) a.j(kba.class);
            insightRepository$queryRecentData$1.label = 1;
            objE = kbaVar.e(insightRepository$queryRecentData$1);
            if (objE == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objE);
        }
        BaseResponse baseResponse = (BaseResponse) objE;
        if (!baseResponse.isSuccess() || baseResponse.getBody() == null) {
            m8b.m("InsightRepository", "queryRecentData failed, errorCode:" + baseResponse.getErrorCode());
            return null;
        }
        Object body = baseResponse.getBody();
        Intrinsics.checkNotNull(body);
        int date = ((RecentDataBean) body).getDate();
        Object body2 = baseResponse.getBody();
        Intrinsics.checkNotNull(body2);
        m8b.f("InsightRepository", "queryRecentData success, date:" + date + ", dataList size:" + ((RecentDataBean) body2).getDataList().size());
        Object body3 = baseResponse.getBody();
        Intrinsics.checkNotNull(body3);
        return body3;
    }
}