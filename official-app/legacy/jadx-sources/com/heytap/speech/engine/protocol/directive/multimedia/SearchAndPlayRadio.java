package com.heytap.speech.engine.protocol.directive.multimedia;

import androidx.annotation.Keep;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0001\u0018B\u0007¢\u0006\u0004\b\u0015\u0010\u0016R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR6\u0010\u000f\u001a\u0016\u0012\u0004\u0012\u00020\r\u0018\u00010\fj\n\u0012\u0004\u0012\u00020\r\u0018\u0001`\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0019"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/multimedia/SearchAndPlayRadio;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "", "reply", "Ljava/lang/String;", "getReply", "()Ljava/lang/String;", "setReply", "(Ljava/lang/String;)V", "type", "getType", "setType", "Ljava/util/ArrayList;", "Lcom/heytap/speech/engine/protocol/directive/multimedia/RadioItem;", "Lkotlin/collections/ArrayList;", "radioList", "Ljava/util/ArrayList;", "getRadioList", "()Ljava/util/ArrayList;", "setRadioList", "(Ljava/util/ArrayList;)V", "<init>", "()V", "Companion", "a", "protocol_release"}, k = 1, mv = {1, 5, 1})
public final class SearchAndPlayRadio extends DirectivePayload {

    @NotNull
    private static final String VERSION = "2.0";

    @Nullable
    private ArrayList<RadioItem> radioList;

    @Nullable
    private String reply;

    @Nullable
    private String type;

    @Nullable
    public final ArrayList<RadioItem> getRadioList() {
        return this.radioList;
    }

    @Nullable
    public final String getReply() {
        return this.reply;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    public final void setRadioList(@Nullable ArrayList<RadioItem> arrayList) {
        this.radioList = arrayList;
    }

    public final void setReply(@Nullable String str) {
        this.reply = str;
    }

    public final void setType(@Nullable String str) {
        this.type = str;
    }
}
