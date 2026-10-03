package com.heytap.speech.engine.protocol.directive.cuiedu;

import androidx.annotation.Keep;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import java.util.ArrayList;
import java.util.HashMap;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R(\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0014\"\u0004\b \u0010\u0016R\u001c\u0010!\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0014\"\u0004\b#\u0010\u0016¨\u0006$"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/cuiedu/Answer;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "()V", "ansResult", "", "getAnsResult", "()Ljava/lang/Integer;", "setAnsResult", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "bbox", "Ljava/util/ArrayList;", "Lcom/heytap/speech/engine/protocol/directive/cuiedu/Location;", "getBbox", "()Ljava/util/ArrayList;", "setBbox", "(Ljava/util/ArrayList;)V", "correctData", "", "getCorrectData", "()Ljava/lang/String;", "setCorrectData", "(Ljava/lang/String;)V", "extend", "Ljava/util/HashMap;", "", "getExtend", "()Ljava/util/HashMap;", "setExtend", "(Ljava/util/HashMap;)V", "oriData", "getOriData", "setOriData", "title", "getTitle", "setTitle", "protocol_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class Answer extends DirectivePayload {

    @Nullable
    private Integer ansResult;

    @Nullable
    private ArrayList<Location> bbox;

    @Nullable
    private String correctData;

    @Nullable
    private HashMap<String, Object> extend;

    @Nullable
    private String oriData;

    @Nullable
    private String title;

    @Nullable
    public final Integer getAnsResult() {
        return this.ansResult;
    }

    @Nullable
    public final ArrayList<Location> getBbox() {
        return this.bbox;
    }

    @Nullable
    public final String getCorrectData() {
        return this.correctData;
    }

    @Nullable
    public final HashMap<String, Object> getExtend() {
        return this.extend;
    }

    @Nullable
    public final String getOriData() {
        return this.oriData;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public final void setAnsResult(@Nullable Integer num) {
        this.ansResult = num;
    }

    public final void setBbox(@Nullable ArrayList<Location> arrayList) {
        this.bbox = arrayList;
    }

    public final void setCorrectData(@Nullable String str) {
        this.correctData = str;
    }

    public final void setExtend(@Nullable HashMap<String, Object> map) {
        this.extend = map;
    }

    public final void setOriData(@Nullable String str) {
        this.oriData = str;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }
}
