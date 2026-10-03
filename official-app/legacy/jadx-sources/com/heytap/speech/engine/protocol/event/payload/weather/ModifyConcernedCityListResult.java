package com.heytap.speech.engine.protocol.event.payload.weather;

import androidx.annotation.Keep;
import com.heytap.speech.engine.protocol.event.Payload;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0007\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001fB\u0007¢\u0006\u0004\b\u001c\u0010\u001dR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR$\u0010\r\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R$\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0004\u001a\u0004\b\u0014\u0010\u0006\"\u0004\b\u0015\u0010\bR$\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0004\u001a\u0004\b\u0017\u0010\u0006\"\u0004\b\u0018\u0010\bR$\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u0004\u001a\u0004\b\u001a\u0010\u0006\"\u0004\b\u001b\u0010\b¨\u0006 "}, d2 = {"Lcom/heytap/speech/engine/protocol/event/payload/weather/ModifyConcernedCityListResult;", "Lcom/heytap/speech/engine/protocol/event/Payload;", "", "locationKey", "Ljava/lang/String;", "getLocationKey", "()Ljava/lang/String;", "setLocationKey", "(Ljava/lang/String;)V", "locationName", "getLocationName", "setLocationName", "", "success", "Ljava/lang/Boolean;", "getSuccess", "()Ljava/lang/Boolean;", "setSuccess", "(Ljava/lang/Boolean;)V", "errorCode", "getErrorCode", "setErrorCode", "errorMsg", "getErrorMsg", "setErrorMsg", "operation", "getOperation", "setOperation", "<init>", "()V", "Companion", "a", "protocol_release"}, k = 1, mv = {1, 5, 1})
public final class ModifyConcernedCityListResult extends Payload {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String VERSION = "2.0";

    @Nullable
    private String errorCode;

    @Nullable
    private String errorMsg;

    @Nullable
    private String locationKey;

    @Nullable
    private String locationName;

    @Nullable
    private String operation;

    @Nullable
    private Boolean success;

    /* JADX INFO: renamed from: com.heytap.speech.engine.protocol.event.payload.weather.ModifyConcernedCityListResult$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0086D¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/heytap/speech/engine/protocol/event/payload/weather/ModifyConcernedCityListResult$a;", "", "", "VERSION", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "<init>", "()V", "protocol_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String a() {
            return ModifyConcernedCityListResult.VERSION;
        }
    }

    @Nullable
    public final String getErrorCode() {
        return this.errorCode;
    }

    @Nullable
    public final String getErrorMsg() {
        return this.errorMsg;
    }

    @Nullable
    public final String getLocationKey() {
        return this.locationKey;
    }

    @Nullable
    public final String getLocationName() {
        return this.locationName;
    }

    @Nullable
    public final String getOperation() {
        return this.operation;
    }

    @Nullable
    public final Boolean getSuccess() {
        return this.success;
    }

    public final void setErrorCode(@Nullable String str) {
        this.errorCode = str;
    }

    public final void setErrorMsg(@Nullable String str) {
        this.errorMsg = str;
    }

    public final void setLocationKey(@Nullable String str) {
        this.locationKey = str;
    }

    public final void setLocationName(@Nullable String str) {
        this.locationName = str;
    }

    public final void setOperation(@Nullable String str) {
        this.operation = str;
    }

    public final void setSuccess(@Nullable Boolean bool) {
        this.success = bool;
    }
}
