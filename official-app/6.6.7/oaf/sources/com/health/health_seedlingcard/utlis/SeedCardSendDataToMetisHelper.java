package com.health.health_seedlingcard.utlis;

import android.content.Context;
import android.os.Bundle;
import com.health.health_seedlingcard.utlis.SeedCardSendDataToMetisHelper;
import com.heytap.health.core.provider.adapter.open.SportDataAdapter;
import com.heytap.health.health.HealthService;
import com.oplus.aiunit.vision.cs8;
import com.oplus.aiunit.vision.e1;
import com.oplus.aiunit.vision.e88;
import com.oplus.aiunit.vision.fdg;
import com.oplus.aiunit.vision.jug;
import com.oplus.aiunit.vision.ln3;
import com.oplus.aiunit.vision.m8b;
import com.oplus.pantanal.seedling.intelligent.IntelligentData;
import com.oplus.pantanal.seedling.update.SeedlingCardOptions;
import com.oplus.pantanal.seedling.util.SeedlingTool;
import java.util.List;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.ExecutorsKt;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/health/health_seedlingcard/utlis/SeedCardSendDataToMetisHelper;", "", "Companion", "health_seedlingcard_release"}, k = 1, mv = {1, 8, 0})
public final class SeedCardSendDataToMetisHelper {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String TAG = "SeedlingCardReceiver";

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007R\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/health/health_seedlingcard/utlis/SeedCardSendDataToMetisHelper$Companion;", "", "Landroid/content/Context;", "context", "", "b", "d", "f", "c", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "health_seedlingcard_release"}, k = 1, mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nSeedCardSendDataToMetisHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SeedCardSendDataToMetisHelper.kt\ncom/health/health_seedlingcard/utlis/SeedCardSendDataToMetisHelper$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,147:1\n1#2:148\n*E\n"})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final void e(Context context, List list) throws JSONException {
            Intrinsics.checkNotNullParameter(context, "$context");
            boolean z = list.size() > 0;
            long jCurrentTimeMillis = System.currentTimeMillis();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("state", 1);
            jSONObject.put("hasSleepRecord", z);
            SeedlingTool.INSTANCE.updateIntelligentData(context, new IntelligentData(jCurrentTimeMillis, 10103, jug.SLEEP_STATE_EVENT, jSONObject, (JSONObject) null, (SeedlingCardOptions) null, (String) null, 112, (DefaultConstructorMarker) null));
            m8b.f(SeedCardSendDataToMetisHelper.TAG, "send sleep data to smart brain hasSleepRecord = " + z);
        }

        @JvmStatic
        public final void b(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            SeedlingTool.INSTANCE.updateIntelligentData(context, new IntelligentData(System.currentTimeMillis(), 10102, jug.STEPS_ACHIEVEMENT_EVENT, new JSONObject(), (JSONObject) null, (SeedlingCardOptions) null, (String) null, 112, (DefaultConstructorMarker) null));
            m8b.f(SeedCardSendDataToMetisHelper.TAG, "send step achievement data to smart brain");
        }

        @JvmStatic
        public final void c(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            ExecutorService executorServiceE = cs8.e("SeedlingCard");
            Intrinsics.checkNotNullExpressionValue(executorServiceE, "newSingleThreadExecutor(\"SeedlingCard\")");
            BuildersKt.launch$default(CoroutineScopeKt.CoroutineScope(ExecutorsKt.from(executorServiceE)), (CoroutineContext) null, (CoroutineStart) null, new SeedCardSendDataToMetisHelper$Companion$sendMenstrualCardShowDayTOMetis$1(context, null), 3, (Object) null);
        }

        @JvmStatic
        public final void d(@NotNull final Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            ((HealthService) e1.d().h(HealthService.class)).n5(new ln3() { // from class: com.oplus.aiunit.vision.dug
                public final void onResult(Object obj) throws JSONException {
                    SeedCardSendDataToMetisHelper.Companion.e(context, (List) obj);
                }
            });
        }

        @JvmStatic
        public final void f(@NotNull Context context) throws JSONException {
            Intrinsics.checkNotNullParameter(context, "context");
            Bundle bundleG = SportDataAdapter.G(e88.a());
            Intrinsics.checkNotNullExpressionValue(bundleG, "querySportData(GlobalApp…onHolder.getAppContext())");
            long j = bundleG.getLong("stepGoal", 8000L);
            long jB = fdg.x(jug.SP_KEY_STEP_GOAL).B(jug.SP_KEY_STEP_GOAL_KEY, 0L);
            if (j == jB) {
                m8b.f(SeedCardSendDataToMetisHelper.TAG, "already send step goal to smart brain = " + jB);
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("stepGoal", j);
            SeedlingTool.INSTANCE.updateIntelligentData(context, new IntelligentData(jCurrentTimeMillis, 10101, jug.STEP_GOAL_EVENT, jSONObject, (JSONObject) null, (SeedlingCardOptions) null, (String) null, 112, (DefaultConstructorMarker) null));
            fdg.x(jug.SP_KEY_STEP_GOAL).T(jug.SP_KEY_STEP_GOAL_KEY, j);
            m8b.f(SeedCardSendDataToMetisHelper.TAG, "send sport data to smart brain = " + j);
        }
    }
}
