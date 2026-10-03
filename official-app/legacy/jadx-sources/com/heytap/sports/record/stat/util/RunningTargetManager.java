package com.heytap.sports.record.stat.util;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.databaseengine.api.RxExtendKt;
import com.heytap.health.base.switchManager.UserSetting;
import com.heytap.health.network.core.BaseResponse;
import com.heytap.health.network.core.a;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.lbd;
import com.oplus.aiunit.vision.o05;
import com.oplus.aiunit.vision.p6j;
import com.oplus.aiunit.vision.v9g;
import com.oplus.smartenginehelper.entity.ClickApiEntity;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p010kotlin.Metadata;
import p010kotlin.ResultKt;
import p010kotlin.Unit;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.coroutines.jvm.internal.Boxing;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;
import p010kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u000f\b\u0007\u0018\u0000 (2\u00020\u0001:\u0001#B\u0007¢\u0006\u0004\b&\u0010'J\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004H\u0086@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ#\u0010\r\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0082@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0011\u001a\u00020\b2\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0013\u001a\u00020\u0004H\u0002J\u0018\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0002J\u001c\u0010\u0018\u001a\u00020\u00142\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00040\u0016H\u0002J\u001c\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00040\u001a2\u0006\u0010\u0019\u001a\u00020\u0014H\u0002J\u0010\u0010\u001c\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u0014H\u0002J\b\u0010\u001d\u001a\u00020\u0014H\u0002J\u0013\u0010\u001e\u001a\u00020\u0014H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u001b\u0010!\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u0014H\u0082@ø\u0001\u0000¢\u0006\u0004\b!\u0010\"R$\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006)"}, d2 = {"Lcom/heytap/sports/record/stat/util/RunningTargetManager;", "", "", ClickApiEntity.TIME, "", LogFieldKey.PROCESS_NAME_KEY, "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "targetValue", "", "v", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "year", "month", "o", "(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "forceRefresh", "j", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "n", "", LogFieldKey.LEVEL_KEY, "", "map", "s", "jsonStr", "", "q", "t", "r", LogFieldKey.MESSAGE_KEY, "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "jsonData", "u", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "Ljava/util/Map;", "cachedConfig", "<init>", "()V", "Companion", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRunningTargetManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RunningTargetManager.kt\ncom/heytap/sports/record/stat/util/RunningTargetManager\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,269:1\n215#2,2:270\n*S KotlinDebug\n*F\n+ 1 RunningTargetManager.kt\ncom/heytap/sports/record/stat/util/RunningTargetManager\n*L\n199#1:270,2\n*E\n"})
public final class RunningTargetManager {

    @NotNull
    public static final String TAG = "RunningTargetManager";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public Map<String, Integer> cachedConfig;
    public static final int $stable = 8;

    public static /* synthetic */ Object k(RunningTargetManager runningTargetManager, boolean z, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return runningTargetManager.j(z, continuation);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object j(boolean z, Continuation<? super Unit> continuation) {
        RunningTargetManager$ensureCacheLoaded$1 runningTargetManager$ensureCacheLoaded$1;
        if (continuation instanceof RunningTargetManager$ensureCacheLoaded$1) {
            runningTargetManager$ensureCacheLoaded$1 = (RunningTargetManager$ensureCacheLoaded$1) continuation;
            int i = runningTargetManager$ensureCacheLoaded$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                runningTargetManager$ensureCacheLoaded$1.label = i - Integer.MIN_VALUE;
            } else {
                runningTargetManager$ensureCacheLoaded$1 = new RunningTargetManager$ensureCacheLoaded$1(this, continuation);
            }
        } else {
            runningTargetManager$ensureCacheLoaded$1 = new RunningTargetManager$ensureCacheLoaded$1(this, continuation);
        }
        Object objM = runningTargetManager$ensureCacheLoaded$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = runningTargetManager$ensureCacheLoaded$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objM);
            if (this.cachedConfig == null || z) {
                runningTargetManager$ensureCacheLoaded$1.L$0 = this;
                runningTargetManager$ensureCacheLoaded$1.label = 1;
                objM = m(runningTargetManager$ensureCacheLoaded$1);
                if (objM == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this = (RunningTargetManager) runningTargetManager$ensureCacheLoaded$1.L$0;
        ResultKt.throwOnFailure(objM);
        String str = (String) objM;
        if (str.length() > 0) {
            this.t(str);
        }
        this.cachedConfig = str.length() == 0 ? new LinkedHashMap<>() : this.q(str);
        return Unit.INSTANCE;
    }

    public final String l(int year, int month) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format("%04d-%02d", Arrays.copyOf(new Object[]{Integer.valueOf(year), Integer.valueOf(month)}, 2));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object m(Continuation<? super String> continuation) {
        RunningTargetManager$getRunningTargetDataFromCloud$1 runningTargetManager$getRunningTargetDataFromCloud$1;
        if (continuation instanceof RunningTargetManager$getRunningTargetDataFromCloud$1) {
            runningTargetManager$getRunningTargetDataFromCloud$1 = (RunningTargetManager$getRunningTargetDataFromCloud$1) continuation;
            int i = runningTargetManager$getRunningTargetDataFromCloud$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                runningTargetManager$getRunningTargetDataFromCloud$1.label = i - Integer.MIN_VALUE;
            } else {
                runningTargetManager$getRunningTargetDataFromCloud$1 = new RunningTargetManager$getRunningTargetDataFromCloud$1(this, continuation);
            }
        } else {
            runningTargetManager$getRunningTargetDataFromCloud$1 = new RunningTargetManager$getRunningTargetDataFromCloud$1(this, continuation);
        }
        Object objC = runningTargetManager$getRunningTargetDataFromCloud$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = runningTargetManager$getRunningTargetDataFromCloud$1.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objC);
                HashMap map = new HashMap();
                map.put("settingKey", "user_running_monthly_targets");
                lbd<BaseResponse<UserSetting>> lbdVarB = ((p6j) a.j(p6j.class)).b(map);
                Intrinsics.checkNotNullExpressionValue(lbdVarB, "getCommApi(SwitchService…va).queryUserSetting(map)");
                runningTargetManager$getRunningTargetDataFromCloud$1.label = 1;
                objC = RxExtendKt.c(lbdVarB, runningTargetManager$getRunningTargetDataFromCloud$1);
                if (objC == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objC);
            }
            Intrinsics.checkNotNullExpressionValue(objC, "getCommApi(SwitchService…             .awaitOnce()");
            BaseResponse baseResponse = (BaseResponse) objC;
            a7b.f(TAG, "getCloudEcgActiveState() errorCode=" + baseResponse.getErrorCode() + "; response:" + baseResponse.getBody());
            if (baseResponse.isSuccess() && baseResponse.getBody() != null) {
                Object body = baseResponse.getBody();
                Intrinsics.checkNotNull(body, "null cannot be cast to non-null type com.heytap.health.base.switchManager.UserSetting");
                String jsonStr = ((UserSetting) body).getSettingValue();
                Intrinsics.checkNotNullExpressionValue(jsonStr, "jsonStr");
                return jsonStr;
            }
        } catch (Exception unused) {
        }
        return "";
    }

    public final int n() {
        String strR = r();
        if (!(strR.length() > 0)) {
            return 30;
        }
        try {
            JSONObject jSONObject = new JSONObject(strR);
            if (jSONObject.has("last_set_value")) {
                return jSONObject.getInt("last_set_value");
            }
            return 30;
        } catch (Exception unused) {
            return 30;
        }
    }

    public final Object o(int i, int i2, Continuation<? super Integer> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new RunningTargetManager$getTargetForMonth$3(this, i, i2, null), continuation);
    }

    @Nullable
    public final Object p(long j2, @NotNull Continuation<? super Integer> continuation) {
        LocalDate localDateD = o05.D(j2);
        return o(localDateD.getYear(), localDateD.getMonth().getValue(), continuation);
    }

    public final Map<String, Integer> q(String jsonStr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            JSONObject jSONObject = new JSONObject(jsonStr);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String key = itKeys.next();
                Intrinsics.checkNotNullExpressionValue(key, "key");
                linkedHashMap.put(key, Integer.valueOf(jSONObject.getInt(key)));
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return linkedHashMap;
    }

    public final String r() {
        String strE = v9g.x("running_target_sp").E("target_json_cache", "");
        Intrinsics.checkNotNullExpressionValue(strE, "getInstance(SP_NAME).get…g(SP_KEY_TARGET_JSON, \"\")");
        return strE;
    }

    public final String s(Map<String, Integer> map) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            jSONObject.put(entry.getKey(), entry.getValue().intValue());
        }
        String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "json.toString()");
        return string;
    }

    public final void t(String jsonStr) {
        v9g.x("running_target_sp").U("target_json_cache", jsonStr);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object u(String str, Continuation<? super Boolean> continuation) {
        RunningTargetManager$setRunningTargetValue$1 runningTargetManager$setRunningTargetValue$1;
        if (continuation instanceof RunningTargetManager$setRunningTargetValue$1) {
            runningTargetManager$setRunningTargetValue$1 = (RunningTargetManager$setRunningTargetValue$1) continuation;
            int i = runningTargetManager$setRunningTargetValue$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                runningTargetManager$setRunningTargetValue$1.label = i - Integer.MIN_VALUE;
            } else {
                runningTargetManager$setRunningTargetValue$1 = new RunningTargetManager$setRunningTargetValue$1(this, continuation);
            }
        } else {
            runningTargetManager$setRunningTargetValue$1 = new RunningTargetManager$setRunningTargetValue$1(this, continuation);
        }
        Object objC = runningTargetManager$setRunningTargetValue$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = runningTargetManager$setRunningTargetValue$1.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objC);
                HashMap map = new HashMap();
                map.put("settingKey", "user_running_monthly_targets");
                map.put("settingValue", str);
                lbd<BaseResponse<String>> lbdVarC = ((p6j) a.j(p6j.class)).c(map);
                Intrinsics.checkNotNullExpressionValue(lbdVarC, "getCommApi(SwitchService…ava).syncUserSetting(map)");
                runningTargetManager$setRunningTargetValue$1.label = 1;
                objC = RxExtendKt.c(lbdVarC, runningTargetManager$setRunningTargetValue$1);
                if (objC == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objC);
            }
            Intrinsics.checkNotNullExpressionValue(objC, "getCommApi(SwitchService…rSetting(map).awaitOnce()");
            BaseResponse baseResponse = (BaseResponse) objC;
            a7b.f(TAG, "saveAccountEcgActiveState result code:" + baseResponse.getErrorCode() + ", msg:" + baseResponse.getMessage());
            return Boxing.boxBoolean(baseResponse.isSuccess());
        } catch (Exception e2) {
            a7b.b(TAG, "saveAccountEcgActiveState() error = " + e2.getMessage());
            return Boxing.boxBoolean(false);
        }
    }

    @Nullable
    public final Object v(int i, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        Object objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new RunningTargetManager$setTargetForCurrentMonth$2(i, this, null), continuation);
        return objWithContext == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
    }
}
