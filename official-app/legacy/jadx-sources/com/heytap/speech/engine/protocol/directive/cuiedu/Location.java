package com.heytap.speech.engine.protocol.directive.cuiedu;

import androidx.annotation.Keep;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import java.util.HashMap;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R(\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0012\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010¨\u0006\u0015"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/cuiedu/Location;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "()V", "extend", "Ljava/util/HashMap;", "", "", "getExtend", "()Ljava/util/HashMap;", "setExtend", "(Ljava/util/HashMap;)V", "x", "", "getX", "()Ljava/lang/Double;", "setX", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "y", "getY", "setY", "protocol_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class Location extends DirectivePayload {

    @Nullable
    private HashMap<String, Object> extend;

    @Nullable
    private Double x;

    @Nullable
    private Double y;

    @Nullable
    public final HashMap<String, Object> getExtend() {
        return this.extend;
    }

    @Nullable
    public final Double getX() {
        return this.x;
    }

    @Nullable
    public final Double getY() {
        return this.y;
    }

    public final void setExtend(@Nullable HashMap<String, Object> map) {
        this.extend = map;
    }

    public final void setX(@Nullable Double d) {
        this.x = d;
    }

    public final void setY(@Nullable Double d) {
        this.y = d;
    }
}
