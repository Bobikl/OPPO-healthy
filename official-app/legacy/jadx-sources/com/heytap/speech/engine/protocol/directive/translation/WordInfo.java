package com.heytap.speech.engine.protocol.directive.translation;

import androidx.annotation.Keep;
import com.heytap.speech.engine.constant.EngineConstant;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import java.util.ArrayList;
import java.util.HashMap;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR.\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\nj\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR:\u0010\u0010\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011j\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0012\u0018\u0001`\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\bR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0006\"\u0004\b \u0010\bR\u001c\u0010!\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0006\"\u0004\b#\u0010\bR\u001c\u0010$\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0006\"\u0004\b&\u0010\b¨\u0006'"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/translation/WordInfo;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "()V", "evaluationDeeplink", "", "getEvaluationDeeplink", "()Ljava/lang/String;", "setEvaluationDeeplink", "(Ljava/lang/String;)V", "explain", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getExplain", "()Ljava/util/ArrayList;", "setExplain", "(Ljava/util/ArrayList;)V", "extend", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "getExtend", "()Ljava/util/HashMap;", "setExtend", "(Ljava/util/HashMap;)V", "pronounceForAmerican", "getPronounceForAmerican", "setPronounceForAmerican", "pronounceForBritish", "getPronounceForBritish", "setPronounceForBritish", "videoForAmerican", "getVideoForAmerican", "setVideoForAmerican", "videoForBritish", "getVideoForBritish", "setVideoForBritish", EngineConstant.WORD, "getWord", "setWord", "protocol_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class WordInfo extends DirectivePayload {

    @Nullable
    private String evaluationDeeplink;

    @Nullable
    private ArrayList<String> explain;

    @Nullable
    private HashMap<String, Object> extend;

    @Nullable
    private String pronounceForAmerican;

    @Nullable
    private String pronounceForBritish;

    @Nullable
    private String videoForAmerican;

    @Nullable
    private String videoForBritish;

    @Nullable
    private String word;

    @Nullable
    public final String getEvaluationDeeplink() {
        return this.evaluationDeeplink;
    }

    @Nullable
    public final ArrayList<String> getExplain() {
        return this.explain;
    }

    @Nullable
    public final HashMap<String, Object> getExtend() {
        return this.extend;
    }

    @Nullable
    public final String getPronounceForAmerican() {
        return this.pronounceForAmerican;
    }

    @Nullable
    public final String getPronounceForBritish() {
        return this.pronounceForBritish;
    }

    @Nullable
    public final String getVideoForAmerican() {
        return this.videoForAmerican;
    }

    @Nullable
    public final String getVideoForBritish() {
        return this.videoForBritish;
    }

    @Nullable
    public final String getWord() {
        return this.word;
    }

    public final void setEvaluationDeeplink(@Nullable String str) {
        this.evaluationDeeplink = str;
    }

    public final void setExplain(@Nullable ArrayList<String> arrayList) {
        this.explain = arrayList;
    }

    public final void setExtend(@Nullable HashMap<String, Object> map) {
        this.extend = map;
    }

    public final void setPronounceForAmerican(@Nullable String str) {
        this.pronounceForAmerican = str;
    }

    public final void setPronounceForBritish(@Nullable String str) {
        this.pronounceForBritish = str;
    }

    public final void setVideoForAmerican(@Nullable String str) {
        this.videoForAmerican = str;
    }

    public final void setVideoForBritish(@Nullable String str) {
        this.videoForBritish = str;
    }

    public final void setWord(@Nullable String str) {
        this.word = str;
    }
}
