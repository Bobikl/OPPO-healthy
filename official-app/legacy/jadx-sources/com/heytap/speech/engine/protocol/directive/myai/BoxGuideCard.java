package com.heytap.speech.engine.protocol.directive.myai;

import androidx.annotation.Keep;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0001\u0017B\u0007¢\u0006\u0004\b\u0014\u0010\u0015R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR6\u0010\u000e\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0018\u00010\fj\n\u0012\u0004\u0012\u00020\u0002\u0018\u0001`\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0018"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/myai/BoxGuideCard;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "", "guide", "Ljava/lang/String;", "getGuide", "()Ljava/lang/String;", "setGuide", "(Ljava/lang/String;)V", "experimentId", "getExperimentId", "setExperimentId", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "recommendList", "Ljava/util/ArrayList;", "getRecommendList", "()Ljava/util/ArrayList;", "setRecommendList", "(Ljava/util/ArrayList;)V", "<init>", "()V", "Companion", "a", "protocol_release"}, k = 1, mv = {1, 5, 1})
public final class BoxGuideCard extends DirectivePayload {

    @NotNull
    private static final String VERSION = "2.0";

    @Nullable
    private String experimentId;

    @Nullable
    private String guide;

    @Nullable
    private ArrayList<String> recommendList;

    @Nullable
    public final String getExperimentId() {
        return this.experimentId;
    }

    @Nullable
    public final String getGuide() {
        return this.guide;
    }

    @Nullable
    public final ArrayList<String> getRecommendList() {
        return this.recommendList;
    }

    public final void setExperimentId(@Nullable String str) {
        this.experimentId = str;
    }

    public final void setGuide(@Nullable String str) {
        this.guide = str;
    }

    public final void setRecommendList(@Nullable ArrayList<String> arrayList) {
        this.recommendList = arrayList;
    }
}
