package com.heytap.speech.engine.protocol.event.payload.navigation;

import androidx.annotation.Keep;
import com.heytap.speech.engine.protocol.event.Payload;
import com.oplus.utrace.db.UTraceSQLiteHelperKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0016B\u0007¢\u0006\u0004\b\u0013\u0010\u0014R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR$\u0010\r\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0017"}, d2 = {"Lcom/heytap/speech/engine/protocol/event/payload/navigation/UploadNavigationInfo;", "Lcom/heytap/speech/engine/protocol/event/Payload;", "", "type", "Ljava/lang/Integer;", "getType", "()Ljava/lang/Integer;", "setType", "(Ljava/lang/Integer;)V", "code", "getCode", "setCode", "", UTraceSQLiteHelperKt.COL_INFO, "Ljava/lang/String;", "getInfo", "()Ljava/lang/String;", "setInfo", "(Ljava/lang/String;)V", "<init>", "()V", "Companion", "a", "protocol_release"}, k = 1, mv = {1, 5, 1})
public final class UploadNavigationInfo extends Payload {

    @NotNull
    private static final String VERSION = "2.0";

    @Nullable
    private Integer code;

    @Nullable
    private String info;

    @Nullable
    private Integer type;

    @Nullable
    public final Integer getCode() {
        return this.code;
    }

    @Nullable
    public final String getInfo() {
        return this.info;
    }

    @Nullable
    public final Integer getType() {
        return this.type;
    }

    public final void setCode(@Nullable Integer num) {
        this.code = num;
    }

    public final void setInfo(@Nullable String str) {
        this.info = str;
    }

    public final void setType(@Nullable Integer num) {
        this.type = num;
    }
}
