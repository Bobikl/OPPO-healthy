package com.heytap.speech.engine.protocol.directive.navigation;

import androidx.annotation.Keep;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0007\u0018\u0000 %2\u00020\u0001:\u0001&B\u0007¢\u0006\u0004\b#\u0010$R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR$\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0004\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR$\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0004\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR$\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0004\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR$\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0004\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR$\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0004\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR0\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"¨\u0006'"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/navigation/LaunchCarNavigation;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "address", "getAddress", "setAddress", "longitude", "getLongitude", "setLongitude", "latitude", "getLatitude", "setLatitude", "coordinateType", "getCoordinateType", "setCoordinateType", "successTts", "getSuccessTts", "setSuccessTts", "failTts", "getFailTts", "setFailTts", "Ljava/util/HashMap;", "", "extend", "Ljava/util/HashMap;", "getExtend", "()Ljava/util/HashMap;", "setExtend", "(Ljava/util/HashMap;)V", "<init>", "()V", "Companion", "a", "protocol_release"}, k = 1, mv = {1, 5, 1})
public final class LaunchCarNavigation extends DirectivePayload {

    @NotNull
    private static final String VERSION = "2.0";

    @Nullable
    private String address;

    @Nullable
    private String coordinateType;

    @Nullable
    private HashMap<String, Object> extend;

    @Nullable
    private String failTts;

    @Nullable
    private String latitude;

    @Nullable
    private String longitude;

    @Nullable
    private String name;

    @Nullable
    private String successTts;

    @Nullable
    public final String getAddress() {
        return this.address;
    }

    @Nullable
    public final String getCoordinateType() {
        return this.coordinateType;
    }

    @Nullable
    public final HashMap<String, Object> getExtend() {
        return this.extend;
    }

    @Nullable
    public final String getFailTts() {
        return this.failTts;
    }

    @Nullable
    public final String getLatitude() {
        return this.latitude;
    }

    @Nullable
    public final String getLongitude() {
        return this.longitude;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final String getSuccessTts() {
        return this.successTts;
    }

    public final void setAddress(@Nullable String str) {
        this.address = str;
    }

    public final void setCoordinateType(@Nullable String str) {
        this.coordinateType = str;
    }

    public final void setExtend(@Nullable HashMap<String, Object> map) {
        this.extend = map;
    }

    public final void setFailTts(@Nullable String str) {
        this.failTts = str;
    }

    public final void setLatitude(@Nullable String str) {
        this.latitude = str;
    }

    public final void setLongitude(@Nullable String str) {
        this.longitude = str;
    }

    public final void setName(@Nullable String str) {
        this.name = str;
    }

    public final void setSuccessTts(@Nullable String str) {
        this.successTts = str;
    }
}
