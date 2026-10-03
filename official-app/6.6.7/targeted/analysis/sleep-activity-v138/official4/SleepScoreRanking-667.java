package com.heytap.health.sleep.algorithm;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.databaseengineservice.db.table.healtharchives.DBHealthArchiveRecord;
import com.heytap.health.sleep.bean.SleepScoreRankingBean;
import com.heytap.store.base.core.util.deeplink.DeepLinkUrlPath;
import com.oplus.aiunit.vision.e88;
import com.oplus.aiunit.vision.m8b;
import com.opos.process.bridge.base.BridgeConstant;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.coroutines.AbstractCoroutineContextElement;
import p010kotlin.coroutines.CoroutineContext;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes18.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J9\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022!\u0010\n\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u0005J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002R\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0014¨\u0006\u0019"}, d2 = {"Lcom/heytap/health/sleep/algorithm/SleepScoreRanking;", "", "", DBHealthArchiveRecord.AGE, "sleepScore", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", DeepLinkUrlPath.URL_RANKING, "", BridgeConstant.KEY_RESULT_DATA, "c", "", "Lcom/heytap/health/sleep/bean/SleepScoreRankingBean;", "b", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "a", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "handler", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlinx/coroutines/CoroutineScope;", "mScope", "<init>", "()V", "Companion", "sleep_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSleepScoreRanking.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SleepScoreRanking.kt\ncom/heytap/health/sleep/algorithm/SleepScoreRanking\n+ 2 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n*L\n1#1,116:1\n48#2,4:117\n*S KotlinDebug\n*F\n+ 1 SleepScoreRanking.kt\ncom/heytap/health/sleep/algorithm/SleepScoreRanking\n*L\n37#1:117,4\n*E\n"})
public final class SleepScoreRanking {
    public static final int MAX_SCORE = 98;
    public static final int MIN_SCORE = 50;

    @NotNull
    public static final String TAG = "SleepScoreRanking";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final CoroutineExceptionHandler handler;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final CoroutineScope mScope;
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\t¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "Lkotlin/coroutines/CoroutineContext;", "context", "", "exception", "", "handleException", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 SleepScoreRanking.kt\ncom/heytap/health/sleep/algorithm/SleepScoreRanking\n*L\n1#1,110:1\n38#2,3:111\n*E\n"})
    public static final class b extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
        public b(CoroutineExceptionHandler.Companion companion) {
            super(companion);
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(@NotNull CoroutineContext context, @NotNull Throwable exception) {
            m8b.b(SleepScoreRanking.TAG, "catch exception: " + exception.getMessage());
            String strE = m8b.e(exception);
            StringBuilder sb = new StringBuilder();
            sb.append("catch exception: ");
            sb.append(strE);
        }
    }

    public SleepScoreRanking() {
        b bVar = new b(CoroutineExceptionHandler.INSTANCE);
        this.handler = bVar;
        this.mScope = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(Dispatchers.getMain()).plus(bVar));
    }

    public final List<SleepScoreRankingBean> b() throws IOException {
        InputStream inputStreamOpen = e88.a().getAssets().open("sleep_score_update.json");
        Intrinsics.checkNotNullExpressionValue(inputStreamOpen, "getAppContext().assets.o…sleep_score_update.json\")");
        byte[] bArr = new byte[inputStreamOpen.available()];
        inputStreamOpen.read(bArr);
        Charset UTF_8 = StandardCharsets.UTF_8;
        Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
        String str = new String(bArr, UTF_8);
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = new JSONArray(str);
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject = new JSONObject(jSONArray.get(i).toString());
            SleepScoreRankingBean sleepScoreRankingBean = new SleepScoreRankingBean();
            sleepScoreRankingBean.setAgeGroup(jSONObject.optInt("ageGroup"));
            sleepScoreRankingBean.setAgeRangeMin(jSONObject.optInt("ageRangeMin"));
            sleepScoreRankingBean.setAgeRangeMax(jSONObject.optInt("ageRangeMax"));
            String strOptString = jSONObject.optString("scoreDistinct");
            if (strOptString == null) {
                strOptString = "";
            } else {
                Intrinsics.checkNotNullExpressionValue(strOptString, "jsonObject.optString(\"scoreDistinct\") ?: \"\"");
            }
            sleepScoreRankingBean.setScoreDistinct(strOptString);
            arrayList.add(sleepScoreRankingBean);
        }
        return arrayList;
    }

    public final void c(int age, int sleepScore, @NotNull Function1<? super Integer, Unit> resultData) {
        Intrinsics.checkNotNullParameter(resultData, "resultData");
        if (sleepScore <= 0) {
            resultData.invoke(0);
        } else {
            BuildersKt__Builders_commonKt.launch$default(this.mScope, Dispatchers.getMain(), null, new SleepScoreRanking$getRanking$1(age, sleepScore, resultData, this, null), 2, null);
        }
    }
}