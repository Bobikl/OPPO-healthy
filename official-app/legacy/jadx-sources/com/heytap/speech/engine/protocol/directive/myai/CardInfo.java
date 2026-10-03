package com.heytap.speech.engine.protocol.directive.myai;

import androidx.annotation.Keep;
import com.heytap.nearx.tangramconfig.strategy.Fields;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import com.oplus.utrace.db.UTraceSQLiteHelperKt;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\n\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u000b\u0010\u0006\"\u0004\b\f\u0010\bR\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/myai/CardInfo;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "()V", Fields.HEIGHT_FIELD, "", "getHeight", "()Ljava/lang/Integer;", "setHeight", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "index", "getIndex", "setIndex", UTraceSQLiteHelperKt.COL_INFO, "", "getInfo", "()Ljava/lang/Object;", "setInfo", "(Ljava/lang/Object;)V", "type", "", "getType", "()Ljava/lang/String;", "setType", "(Ljava/lang/String;)V", "protocol_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class CardInfo extends DirectivePayload {

    @Nullable
    private Integer height;

    @Nullable
    private Integer index;

    @Nullable
    private Object info;

    @Nullable
    private String type;

    @Nullable
    public final Integer getHeight() {
        return this.height;
    }

    @Nullable
    public final Integer getIndex() {
        return this.index;
    }

    @Nullable
    public final Object getInfo() {
        return this.info;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    public final void setHeight(@Nullable Integer num) {
        this.height = num;
    }

    public final void setIndex(@Nullable Integer num) {
        this.index = num;
    }

    public final void setInfo(@Nullable Object obj) {
        this.info = obj;
    }

    public final void setType(@Nullable String str) {
        this.type = str;
    }
}
