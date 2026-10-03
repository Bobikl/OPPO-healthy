package com.heytap.speech.engine.protocol.directive.devicedata;

import androidx.annotation.Keep;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import java.util.ArrayList;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\"\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/devicedata/UserPortraitCondition;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "()V", "typeList", "Ljava/util/ArrayList;", "", "getTypeList", "()Ljava/util/ArrayList;", "setTypeList", "(Ljava/util/ArrayList;)V", "protocol_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class UserPortraitCondition extends DirectivePayload {

    @Nullable
    private ArrayList<String> typeList;

    @Nullable
    public final ArrayList<String> getTypeList() {
        return this.typeList;
    }

    public final void setTypeList(@Nullable ArrayList<String> arrayList) {
        this.typeList = arrayList;
    }
}
