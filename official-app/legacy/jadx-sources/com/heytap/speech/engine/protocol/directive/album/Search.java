package com.heytap.speech.engine.protocol.directive.album;

import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import com.heytap.speech.engine.protocol.event.payload.analogclick.Feedback;
import com.oplus.aiunit.vision.n28;
import com.oplus.smartenginehelper.entity.ClickApiEntity;
import java.util.ArrayList;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R.\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004j\n\u0012\u0004\u0012\u00020\u0005\u0018\u0001`\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR.\u0010\u000b\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004j\n\u0012\u0004\u0012\u00020\u0005\u0018\u0001`\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR.\u0010\u000e\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004j\n\u0012\u0004\u0012\u00020\u0005\u0018\u0001`\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\b\"\u0004\b\u0010\u0010\nR.\u0010\u0011\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004j\n\u0012\u0004\u0012\u00020\u0005\u0018\u0001`\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\b\"\u0004\b\u0013\u0010\nR.\u0010\u0014\u001a\u0016\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0004j\n\u0012\u0004\u0012\u00020\u0015\u0018\u0001`\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\b\"\u0004\b\u0017\u0010\n¨\u0006\u0018"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/album/Search;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "()V", n28.KEYWORD, "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "getKeyword", "()Ljava/util/ArrayList;", "setKeyword", "(Ljava/util/ArrayList;)V", Feedback.WIDGET_LABEL, "getLabel", "setLabel", "location", "getLocation", "setLocation", "person", "getPerson", "setPerson", ClickApiEntity.TIME, "Lcom/heytap/speech/engine/protocol/directive/album/Time;", "getTime", "setTime", "protocol_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class Search extends DirectivePayload {

    @Nullable
    private ArrayList<String> keyword;

    @Nullable
    private ArrayList<String> label;

    @Nullable
    private ArrayList<String> location;

    @Nullable
    private ArrayList<String> person;

    @Nullable
    private ArrayList<Time> time;

    @Nullable
    public final ArrayList<String> getKeyword() {
        return this.keyword;
    }

    @Nullable
    public final ArrayList<String> getLabel() {
        return this.label;
    }

    @Nullable
    public final ArrayList<String> getLocation() {
        return this.location;
    }

    @Nullable
    public final ArrayList<String> getPerson() {
        return this.person;
    }

    @Nullable
    public final ArrayList<Time> getTime() {
        return this.time;
    }

    public final void setKeyword(@Nullable ArrayList<String> arrayList) {
        this.keyword = arrayList;
    }

    public final void setLabel(@Nullable ArrayList<String> arrayList) {
        this.label = arrayList;
    }

    public final void setLocation(@Nullable ArrayList<String> arrayList) {
        this.location = arrayList;
    }

    public final void setPerson(@Nullable ArrayList<String> arrayList) {
        this.person = arrayList;
    }

    public final void setTime(@Nullable ArrayList<Time> arrayList) {
        this.time = arrayList;
    }
}
