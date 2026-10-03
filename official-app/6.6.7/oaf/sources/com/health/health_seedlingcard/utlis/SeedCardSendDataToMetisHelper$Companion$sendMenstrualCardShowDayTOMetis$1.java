package com.health.health_seedlingcard.utlis;

import android.content.Context;
import com.heytap.health.menstrual.inter.MenstrualService;
import com.oplus.aiunit.vision.e1;
import com.oplus.aiunit.vision.fdg;
import com.oplus.aiunit.vision.jug;
import com.oplus.aiunit.vision.m8b;
import com.oplus.aiunit.vision.q15;
import com.oplus.pantanal.seedling.intelligent.IntelligentData;
import com.oplus.pantanal.seedling.update.SeedlingCardOptions;
import com.oplus.pantanal.seedling.util.SeedlingTool;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "com.health.health_seedlingcard.utlis.SeedCardSendDataToMetisHelper$Companion$sendMenstrualCardShowDayTOMetis$1", f = "SeedCardSendDataToMetisHelper.kt", i = {0}, l = {111}, m = "invokeSuspend", n = {"showTime"}, s = {"J$0"})
public final class SeedCardSendDataToMetisHelper$Companion$sendMenstrualCardShowDayTOMetis$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    long J$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SeedCardSendDataToMetisHelper$Companion$sendMenstrualCardShowDayTOMetis$1(Context context, Continuation<? super SeedCardSendDataToMetisHelper$Companion$sendMenstrualCardShowDayTOMetis$1> continuation) {
        super(2, continuation);
        this.$context = context;
    }

    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new SeedCardSendDataToMetisHelper$Companion$sendMenstrualCardShowDayTOMetis$1(this.$context, continuation);
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws JSONException {
        long jB;
        Object objX4;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            jB = fdg.x(jug.SP_KEY_MENSTRUAL).B(jug.SP_KEY_MENSTRUAL_KEY, 0L);
            Object objNavigation = e1.d().b("/menstrual/MenstrualService").navigation();
            Intrinsics.checkNotNull(objNavigation, "null cannot be cast to non-null type com.heytap.health.menstrual.inter.MenstrualService");
            this.J$0 = jB;
            this.label = 1;
            objX4 = ((MenstrualService) objNavigation).X4(this);
            if (objX4 == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            long j = this.J$0;
            ResultKt.throwOnFailure(obj);
            jB = j;
            objX4 = obj;
        }
        long jLongValue = ((Number) objX4).longValue();
        if (jLongValue <= 0) {
            m8b.f(SeedCardSendDataToMetisHelper.TAG, "menstrual data is null show time is 0 do not send");
            return Unit.INSTANCE;
        }
        if (jB != jLongValue) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("trigger_timestamp", jLongValue);
            jSONObject.put("policy_type", 0);
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(jSONObject);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("intent_id", jug.MENSTRUAL_INTENT_ID);
            jSONObject2.put("policy_name", "MENSTRUAL_CYCLE");
            jSONObject2.put("is_exited", false);
            jSONObject2.put("intent_policy", jSONArray);
            SeedlingTool.INSTANCE.updateIntelligentData(this.$context, new IntelligentData(jCurrentTimeMillis, jug.MENSTRUAL_EVENT_CODE, jug.MENSTRUAL_EVENT, jSONObject2, (JSONObject) null, (SeedlingCardOptions) null, (String) null, 112, (DefaultConstructorMarker) null));
            fdg.x(jug.SP_KEY_MENSTRUAL).T(jug.SP_KEY_MENSTRUAL_KEY, jLongValue);
            m8b.f(SeedCardSendDataToMetisHelper.TAG, "send show time = " + jLongValue + " = " + q15.a(jLongValue, "yyyy-MM-dd HH:mm") + " to Metis");
        } else {
            m8b.f(SeedCardSendDataToMetisHelper.TAG, "already send menstrual card show time to metis = " + jLongValue + " = " + q15.a(jLongValue, "yyyy-MM-dd HH:mm"));
        }
        return Unit.INSTANCE;
    }

    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }
}
