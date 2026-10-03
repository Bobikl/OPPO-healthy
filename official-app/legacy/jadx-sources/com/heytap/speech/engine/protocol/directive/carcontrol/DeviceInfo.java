package com.heytap.speech.engine.protocol.directive.carcontrol;

import androidx.annotation.Keep;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import com.oplus.pantaconnect.sdk.discovery.fusion.ServiceNodeBundleKeys;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\b¨\u0006\u0018"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/carcontrol/DeviceInfo;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "()V", ServiceNodeBundleKeys.DEVICE_NAME, "", "getDeviceName", "()Ljava/lang/String;", "setDeviceName", "(Ljava/lang/String;)V", "iconDarkUrlOff", "getIconDarkUrlOff", "setIconDarkUrlOff", "iconDarkUrlOn", "getIconDarkUrlOn", "setIconDarkUrlOn", "iconUrlOff", "getIconUrlOff", "setIconUrlOff", "iconUrlOn", "getIconUrlOn", "setIconUrlOn", "status", "getStatus", "setStatus", "protocol_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class DeviceInfo extends DirectivePayload {

    @Nullable
    private String deviceName;

    @Nullable
    private String iconDarkUrlOff;

    @Nullable
    private String iconDarkUrlOn;

    @Nullable
    private String iconUrlOff;

    @Nullable
    private String iconUrlOn;

    @Nullable
    private String status;

    @Nullable
    public final String getDeviceName() {
        return this.deviceName;
    }

    @Nullable
    public final String getIconDarkUrlOff() {
        return this.iconDarkUrlOff;
    }

    @Nullable
    public final String getIconDarkUrlOn() {
        return this.iconDarkUrlOn;
    }

    @Nullable
    public final String getIconUrlOff() {
        return this.iconUrlOff;
    }

    @Nullable
    public final String getIconUrlOn() {
        return this.iconUrlOn;
    }

    @Nullable
    public final String getStatus() {
        return this.status;
    }

    public final void setDeviceName(@Nullable String str) {
        this.deviceName = str;
    }

    public final void setIconDarkUrlOff(@Nullable String str) {
        this.iconDarkUrlOff = str;
    }

    public final void setIconDarkUrlOn(@Nullable String str) {
        this.iconDarkUrlOn = str;
    }

    public final void setIconUrlOff(@Nullable String str) {
        this.iconUrlOff = str;
    }

    public final void setIconUrlOn(@Nullable String str) {
        this.iconUrlOn = str;
    }

    public final void setStatus(@Nullable String str) {
        this.status = str;
    }
}
