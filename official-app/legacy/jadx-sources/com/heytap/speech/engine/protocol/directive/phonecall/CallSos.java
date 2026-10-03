package com.heytap.speech.engine.protocol.directive.phonecall;

import androidx.annotation.Keep;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import java.io.Serializable;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\f\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0002\u0014\u0015B\u0007¢\u0006\u0004\b\u0011\u0010\u0012R*\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR$\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0016"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/phonecall/CallSos;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "", "Lcom/heytap/speech/engine/protocol/directive/phonecall/CallSos$Sos;", "sosList", "Ljava/util/List;", "getSosList", "()Ljava/util/List;", "setSosList", "(Ljava/util/List;)V", "", "content", "Ljava/lang/String;", "getContent", "()Ljava/lang/String;", "setContent", "(Ljava/lang/String;)V", "<init>", "()V", "Companion", "a", "Sos", "protocol_release"}, k = 1, mv = {1, 5, 1})
public final class CallSos extends DirectivePayload {

    @NotNull
    private static final String VERSION = "2.0";

    @Nullable
    private String content;

    @Nullable
    private List<Sos> sosList;

    @Keep
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\b¨\u0006\f"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/phonecall/CallSos$Sos;", "Ljava/io/Serializable;", "()V", "name", "", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "number", "getNumber", "setNumber", "protocol_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Sos implements Serializable {

        @Nullable
        private String name;

        @Nullable
        private String number;

        @Nullable
        public final String getName() {
            return this.name;
        }

        @Nullable
        public final String getNumber() {
            return this.number;
        }

        public final void setName(@Nullable String str) {
            this.name = str;
        }

        public final void setNumber(@Nullable String str) {
            this.number = str;
        }
    }

    @Nullable
    public final String getContent() {
        return this.content;
    }

    @Nullable
    public final List<Sos> getSosList() {
        return this.sosList;
    }

    public final void setContent(@Nullable String str) {
        this.content = str;
    }

    public final void setSosList(@Nullable List<Sos> list) {
        this.sosList = list;
    }
}
