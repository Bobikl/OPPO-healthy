package com.heytap.speech.engine.protocol.event.payload.client;

import androidx.annotation.Keep;
import com.heytap.speech.engine.protocol.event.Payload;
import java.util.ArrayList;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0014\b\u0007\u0018\u0000  2\u00020\u0001:\u0001!B\u0007¢\u0006\u0004\b\u001e\u0010\u001fR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR6\u0010\u000f\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000e0\r\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R6\u0010\u0015\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000e0\r\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014R0\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006\""}, d2 = {"Lcom/heytap/speech/engine/protocol/event/payload/client/SaveClientAction;", "Lcom/heytap/speech/engine/protocol/event/Payload;", "", "operate", "Ljava/lang/String;", "getOperate", "()Ljava/lang/String;", "setOperate", "(Ljava/lang/String;)V", "reply", "getReply", "setReply", "Ljava/util/ArrayList;", "Ljava/util/HashMap;", "", "optionList", "Ljava/util/ArrayList;", "getOptionList", "()Ljava/util/ArrayList;", "setOptionList", "(Ljava/util/ArrayList;)V", "selectOptionList", "getSelectOptionList", "setSelectOptionList", "extend", "Ljava/util/HashMap;", "getExtend", "()Ljava/util/HashMap;", "setExtend", "(Ljava/util/HashMap;)V", "<init>", "()V", "Companion", "a", "protocol_release"}, k = 1, mv = {1, 5, 1})
public final class SaveClientAction extends Payload {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String VERSION = "2.0";

    @Nullable
    private HashMap<String, Object> extend;

    @Nullable
    private String operate;

    @Nullable
    private ArrayList<HashMap<String, Object>> optionList;

    @Nullable
    private String reply;

    @Nullable
    private ArrayList<HashMap<String, Object>> selectOptionList;

    /* JADX INFO: renamed from: com.heytap.speech.engine.protocol.event.payload.client.SaveClientAction$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0086D¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/heytap/speech/engine/protocol/event/payload/client/SaveClientAction$a;", "", "", "VERSION", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "<init>", "()V", "protocol_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String a() {
            return SaveClientAction.VERSION;
        }
    }

    @Nullable
    public final HashMap<String, Object> getExtend() {
        return this.extend;
    }

    @Nullable
    public final String getOperate() {
        return this.operate;
    }

    @Nullable
    public final ArrayList<HashMap<String, Object>> getOptionList() {
        return this.optionList;
    }

    @Nullable
    public final String getReply() {
        return this.reply;
    }

    @Nullable
    public final ArrayList<HashMap<String, Object>> getSelectOptionList() {
        return this.selectOptionList;
    }

    public final void setExtend(@Nullable HashMap<String, Object> map) {
        this.extend = map;
    }

    public final void setOperate(@Nullable String str) {
        this.operate = str;
    }

    public final void setOptionList(@Nullable ArrayList<HashMap<String, Object>> arrayList) {
        this.optionList = arrayList;
    }

    public final void setReply(@Nullable String str) {
        this.reply = str;
    }

    public final void setSelectOptionList(@Nullable ArrayList<HashMap<String, Object>> arrayList) {
        this.selectOptionList = arrayList;
    }
}
