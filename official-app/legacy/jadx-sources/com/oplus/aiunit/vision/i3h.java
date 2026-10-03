package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.databaseengine.model.wristtemperature.WristTemperatureStat;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0007\u0018\u0000 \t2\u00020\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0014\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¨\u0006\n"}, d2 = {"Lcom/oplus/aiunit/vision/i3h;", "", "", "Lcom/heytap/databaseengine/model/wristtemperature/WristTemperatureStat;", "dataList", "", "a", "<init>", "()V", "Companion", "sleep_release"}, k = 1, mv = {1, 8, 0})
public final class i3h {
    public static final int $stable = 0;
    public static final float INVALID_TEMPERATURE = -10000.0f;

    public final float a(@NotNull List<WristTemperatureStat> dataList) {
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        if (dataList.isEmpty()) {
            return -10000.0f;
        }
        WristTemperatureStat wristTemperatureStat = dataList.get(0);
        if (wristTemperatureStat.getWristTemperature() != 0 && wristTemperatureStat.getDayBaseLineWristTemperature() != 0) {
            return (wristTemperatureStat.getWristTemperature() - wristTemperatureStat.getDayBaseLineWristTemperature()) / 100.0f;
        }
        a7b.f("SignsTransform", "getTemperatureOffset data to no avail:" + wristTemperatureStat.getWristTemperature() + " ," + wristTemperatureStat.getDayBaseLineWristTemperature());
        return -10000.0f;
    }
}
