package com.oplus.aiunit.vision;

import com.oplus.nearx.track.internal.storage.db.app.balance.entity.BalanceCompleteness;
import com.oplus.nearx.track.internal.storage.db.app.balance.entity.BalanceHashCompleteness;
import com.oplus.nearx.track.internal.storage.db.app.balance.entity.BalanceRealtimeCompleteness;
import io.protostuff.MapSchema;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p010kotlin.Metadata;
import p010kotlin.Result;
import p010kotlin.ResultKt;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015J6\u0010\n\u001a\u00020\t2\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00022\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0002J\u000e\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u000f\u001a\u00020\u000eJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000f\u001a\u00020\u000eJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u000f\u001a\u00020\u000eJ\u0018\u0010\u0013\u001a\u00020\u000e2\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0002H\u0002¨\u0006\u0016"}, d2 = {"Lcom/oplus/aiunit/vision/qs0;", "", "", "Lcom/oplus/nearx/track/internal/storage/db/app/balance/entity/BalanceCompleteness;", "list", "Lcom/oplus/nearx/track/internal/storage/db/app/balance/entity/BalanceRealtimeCompleteness;", "realtimeList", "Lcom/oplus/nearx/track/internal/storage/db/app/balance/entity/BalanceHashCompleteness;", "hashList", "Lorg/json/JSONObject;", "d", "Lcom/oplus/aiunit/vision/hm9;", "data", "f", "", "jsonString", "b", "c", "a", MapSchema.FIELD_NAME_ENTRY, "<init>", "()V", "core-statistics_release"}, k = 1, mv = {1, 7, 1})
public final class qs0 {

    @NotNull
    public static final qs0 INSTANCE = new qs0();

    @Nullable
    public final BalanceHashCompleteness a(@NotNull String jsonString) {
        Object objM5287constructorimpl;
        Intrinsics.checkNotNullParameter(jsonString, "jsonString");
        try {
            Result.Companion companion = Result.INSTANCE;
            JSONObject jSONObject = new JSONObject(jsonString);
            long jOptLong = jSONObject.optLong("_id");
            long jOptLong2 = jSONObject.optLong(sbe.PAY_SDK_EVENT_TIME);
            long jOptLong3 = jSONObject.optLong("createNum");
            long jOptLong4 = jSONObject.optLong("uploadNum");
            String strOptString = jSONObject.optString("sequenceId");
            Intrinsics.checkNotNullExpressionValue(strOptString, "jsonObj.optString(Balanc…eteness::sequenceId.name)");
            objM5287constructorimpl = Result.m5287constructorimpl(new BalanceHashCompleteness(jOptLong, jOptLong2, jOptLong3, jOptLong4, strOptString));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5287constructorimpl = Result.m5287constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m5293isFailureimpl(objM5287constructorimpl)) {
            objM5287constructorimpl = null;
        }
        return (BalanceHashCompleteness) objM5287constructorimpl;
    }

    @Nullable
    public final BalanceCompleteness b(@NotNull String jsonString) {
        Object objM5287constructorimpl;
        Intrinsics.checkNotNullParameter(jsonString, "jsonString");
        try {
            Result.Companion companion = Result.INSTANCE;
            JSONObject jSONObject = new JSONObject(jsonString);
            long jOptLong = jSONObject.optLong("_id");
            long jOptLong2 = jSONObject.optLong(sbe.PAY_SDK_EVENT_TIME);
            long jOptLong3 = jSONObject.optLong("createNum");
            long jOptLong4 = jSONObject.optLong("uploadNum");
            String strOptString = jSONObject.optString("sequenceId");
            Intrinsics.checkNotNullExpressionValue(strOptString, "jsonObj.optString(Balanc…eteness::sequenceId.name)");
            objM5287constructorimpl = Result.m5287constructorimpl(new BalanceCompleteness(jOptLong, jOptLong2, jOptLong3, jOptLong4, strOptString));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5287constructorimpl = Result.m5287constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m5293isFailureimpl(objM5287constructorimpl)) {
            objM5287constructorimpl = null;
        }
        return (BalanceCompleteness) objM5287constructorimpl;
    }

    @Nullable
    public final BalanceRealtimeCompleteness c(@NotNull String jsonString) {
        Object objM5287constructorimpl;
        Intrinsics.checkNotNullParameter(jsonString, "jsonString");
        try {
            Result.Companion companion = Result.INSTANCE;
            JSONObject jSONObject = new JSONObject(jsonString);
            long jOptLong = jSONObject.optLong("_id");
            long jOptLong2 = jSONObject.optLong(sbe.PAY_SDK_EVENT_TIME);
            long jOptLong3 = jSONObject.optLong("createNum");
            long jOptLong4 = jSONObject.optLong("uploadNum");
            String strOptString = jSONObject.optString("sequenceId");
            Intrinsics.checkNotNullExpressionValue(strOptString, "jsonObj.optString(Balanc…eteness::sequenceId.name)");
            objM5287constructorimpl = Result.m5287constructorimpl(new BalanceRealtimeCompleteness(jOptLong, jOptLong2, jOptLong3, jOptLong4, strOptString));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5287constructorimpl = Result.m5287constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m5293isFailureimpl(objM5287constructorimpl)) {
            objM5287constructorimpl = null;
        }
        return (BalanceRealtimeCompleteness) objM5287constructorimpl;
    }

    @NotNull
    public final JSONObject d(@Nullable List<BalanceCompleteness> list, @Nullable List<BalanceRealtimeCompleteness> realtimeList, @Nullable List<BalanceHashCompleteness> hashList) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        qs0 qs0Var = INSTANCE;
        jSONObject.put("event_completeness", qs0Var.e(list));
        jSONObject.put("r_event_completeness", qs0Var.e(realtimeList));
        jSONObject.put("hash_event_completeness", qs0Var.e(hashList));
        return jSONObject;
    }

    public final String e(List<? extends hm9> list) {
        List<? extends hm9> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(n04.OPEN_BRACE_REGEX);
        Iterator<? extends hm9> it = list.iterator();
        while (it.hasNext()) {
            stringBuffer.append(it.next().toString());
            stringBuffer.append(",");
        }
        stringBuffer.deleteCharAt(stringBuffer.length() - 1);
        stringBuffer.append("}");
        String string = stringBuffer.toString();
        Intrinsics.checkNotNullExpressionValue(string, "buffer.toString()");
        return string;
    }

    @NotNull
    public final JSONObject f(@NotNull hm9 data) throws JSONException {
        Intrinsics.checkNotNullParameter(data, "data");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("_id", data.get_id());
        jSONObject.put(sbe.PAY_SDK_EVENT_TIME, data.getEventTime());
        jSONObject.put("createNum", data.getCreateNum());
        jSONObject.put("uploadNum", data.getUploadNum());
        jSONObject.put("sequenceId", data.getSequenceId());
        return jSONObject;
    }
}
