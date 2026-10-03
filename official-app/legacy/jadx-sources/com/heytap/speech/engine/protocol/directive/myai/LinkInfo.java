package com.heytap.speech.engine.protocol.directive.myai;

import androidx.annotation.Keep;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import java.util.List;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\"\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/myai/LinkInfo;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "()V", "data", "", "Lcom/heytap/speech/engine/protocol/directive/myai/LinkItem;", "getData", "()Ljava/util/List;", "setData", "(Ljava/util/List;)V", "protocol_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class LinkInfo extends DirectivePayload {

    @Nullable
    private List<LinkItem> data;

    @Nullable
    public final List<LinkItem> getData() {
        return this.data;
    }

    public final void setData(@Nullable List<LinkItem> list) {
        this.data = list;
    }
}
