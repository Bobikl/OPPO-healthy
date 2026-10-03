package com.oplus.aiunit.vision;

import android.content.Context;
import com.health.health_seedlingcard.R$string;
import com.health.health_seedlingcard.model.SportRecordModel;
import com.heytap.databaseengine.model.TrackMetadataStat;
import com.heytap.health.router.RouterActivity;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import p010kotlin.Metadata;
import p010kotlin.collections.ArraysKt___ArraysKt;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.ranges.RangesKt___RangesKt;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\u0014\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\u0006\u0010\u0007\u001a\u00020\u0005¨\u0006\n"}, d2 = {"Lcom/oplus/aiunit/vision/cgi;", "", "", "Lcom/heytap/databaseengine/model/TrackMetadataStat;", "dataList", "Lorg/json/JSONObject;", "a", "b", "<init>", "()V", "health_seedlingcard_release"}, k = 1, mv = {1, 8, 0})
public final class cgi {
    @NotNull
    public final JSONObject a(@NotNull List<? extends TrackMetadataStat> dataList) throws JSONException {
        String strValueOf;
        String string;
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        if (!(!dataList.isEmpty())) {
            return b();
        }
        TrackMetadataStat trackMetadataStat = dataList.get(0);
        jgf jgfVar = jgf.INSTANCE;
        Context contextA = b78.a();
        Intrinsics.checkNotNullExpressionValue(contextA, "getAppContext()");
        String strF = jgfVar.f(contextA, trackMetadataStat);
        String deviceCategory = trackMetadataStat.getDeviceCategory();
        long totalDistance = trackMetadataStat.getTotalDistance();
        long totalTime = trackMetadataStat.getTotalTime();
        StringBuilder sb = new StringBuilder();
        sb.append("trackMetadataStat:");
        sb.append(deviceCategory);
        sb.append(" ,totalDistance:");
        sb.append(totalDistance);
        sb.append(" ,time:");
        sb.append(totalTime);
        sb.append(" ,sportingTypeName:");
        sb.append(strF);
        String[] PHONE_DEVICE = op5.PHONE_DEVICE;
        Intrinsics.checkNotNullExpressionValue(PHONE_DEVICE, "PHONE_DEVICE");
        boolean z = !ArraysKt___ArraysKt.contains(PHONE_DEVICE, trackMetadataStat.getDeviceCategory());
        String strA = lzc.a(2, trackMetadataStat.getTotalDistance() / 1000.0d);
        int iCoerceAtLeast = RangesKt___RangesKt.coerceAtLeast((int) trackMetadataStat.getTotalTime(), 60000) / 60000;
        String strValueOf2 = String.valueOf(iCoerceAtLeast % 60);
        if (iCoerceAtLeast >= 60) {
            strValueOf = String.valueOf(iCoerceAtLeast / 60);
            string = b78.a().getString(R$string.health_seedlingcard_unit_hour);
            Intrinsics.checkNotNullExpressionValue(string, "getAppContext().getStrin…h_seedlingcard_unit_hour)");
        } else {
            strValueOf = "";
            string = "";
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("sportingStatusTitle", b78.a().getString(R$string.health_seedlingcard_sports));
        jSONObject.put("sportingResultShowType", z);
        jSONObject.put("sportingUnit", b78.a().getString(R$string.seedling_card_step_distance_unit));
        jSONObject.put("sportingDistance", strA);
        jSONObject.put("sportingHour", strValueOf);
        jSONObject.put("sportingHourName", string);
        jSONObject.put("sportingMinute", strValueOf2);
        jSONObject.put("sportingTypeName", strF);
        jSONObject.put("sportingMinuteName", b78.a().getString(R$string.health_seedlingcard_unit_minute));
        jSONObject.put(RouterActivity.EXTRA_SCHEME_URI, "healthap://app/path=165?EXTRA_KEY_RECORD_SPORT=" + trackMetadataStat.getClientDataId() + "&EXTRA_KEY_MOVEMENT_TYPE=" + trackMetadataStat.getSportMode() + "&moveToBack=0");
        return jSONObject;
    }

    @NotNull
    public final JSONObject b() {
        a7b.f(SportRecordModel.TAG, "buildEmptyCardData");
        return new JSONObject();
    }
}
