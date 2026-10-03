package com.heytap.speech.engine.protocol.directive.multimedia;

import androidx.annotation.Keep;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import java.util.ArrayList;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\"\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/multimedia/AudioList;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "()V", "data", "Ljava/util/ArrayList;", "Lcom/heytap/speech/engine/protocol/directive/multimedia/AudioData;", "getData", "()Ljava/util/ArrayList;", "setData", "(Ljava/util/ArrayList;)V", "index", "", "getIndex", "()Ljava/lang/Integer;", "setIndex", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "needRepeat", "", "getNeedRepeat", "()Ljava/lang/Boolean;", "setNeedRepeat", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "protocol_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class AudioList extends DirectivePayload {

    @Nullable
    private ArrayList<AudioData> data;

    @Nullable
    private Integer index;

    @Nullable
    private Boolean needRepeat;

    @Nullable
    public final ArrayList<AudioData> getData() {
        return this.data;
    }

    @Nullable
    public final Integer getIndex() {
        return this.index;
    }

    @Nullable
    public final Boolean getNeedRepeat() {
        return this.needRepeat;
    }

    public final void setData(@Nullable ArrayList<AudioData> arrayList) {
        this.data = arrayList;
    }

    public final void setIndex(@Nullable Integer num) {
        this.index = num;
    }

    public final void setNeedRepeat(@Nullable Boolean bool) {
        this.needRepeat = bool;
    }
}
