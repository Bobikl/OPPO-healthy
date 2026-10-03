package com.heytap.speech.engine.constant;

import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/heytap/speech/engine/constant/DialogState;", "", "des", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getDes", "()Ljava/lang/String;", "setDes", "(Ljava/lang/String;)V", "IDLE", "LISTEN", "PROCESS", "SPEAK", "speechEngine_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public enum DialogState {
    IDLE("avatar.silence"),
    LISTEN("avatar.listening"),
    PROCESS("avatar.understanding"),
    SPEAK("avatar.speaking");


    @NotNull
    private String des;

    DialogState(String str) {
        this.des = str;
    }

    @NotNull
    public final String getDes() {
        return this.des;
    }

    public final void setDes(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.des = str;
    }
}
