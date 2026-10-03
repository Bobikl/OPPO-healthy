package com.heytap.speech.engine.protocol.event.payload.devicedata;

import androidx.annotation.Keep;
import com.heytap.speech.engine.protocol.event.Payload;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/heytap/speech/engine/protocol/event/payload/devicedata/TourismData;", "Lcom/heytap/speech/engine/protocol/event/Payload;", "()V", "h5TripPlanData", "", "getH5TripPlanData", "()Ljava/lang/String;", "setH5TripPlanData", "(Ljava/lang/String;)V", "protocol_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class TourismData extends Payload {

    @Nullable
    private String h5TripPlanData;

    @Nullable
    public final String getH5TripPlanData() {
        return this.h5TripPlanData;
    }

    public final void setH5TripPlanData(@Nullable String str) {
        this.h5TripPlanData = str;
    }
}
