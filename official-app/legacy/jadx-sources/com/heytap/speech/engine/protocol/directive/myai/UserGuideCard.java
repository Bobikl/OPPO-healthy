package com.heytap.speech.engine.protocol.directive.myai;

import androidx.annotation.Keep;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import com.platform.sdk.center.cons.AcConstants;
import java.util.ArrayList;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0007\u0018\u0000 ,2\u00020\u0001:\u0001-B\u0007¢\u0006\u0004\b*\u0010+R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR6\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\n\u0018\u00010\tj\n\u0012\u0004\u0012\u00020\n\u0018\u0001`\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0004\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR$\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0004\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR0\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR$\u0010!\u001a\u0004\u0018\u00010 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R$\u0010'\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010\u0004\u001a\u0004\b(\u0010\u0006\"\u0004\b)\u0010\b¨\u0006."}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/myai/UserGuideCard;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "", "content", "Ljava/lang/String;", "getContent", "()Ljava/lang/String;", "setContent", "(Ljava/lang/String;)V", "Ljava/util/ArrayList;", "Lcom/heytap/speech/engine/protocol/directive/myai/GuideButton;", "Lkotlin/collections/ArrayList;", "guideButtons", "Ljava/util/ArrayList;", "getGuideButtons", "()Ljava/util/ArrayList;", "setGuideButtons", "(Ljava/util/ArrayList;)V", "agentName", "getAgentName", "setAgentName", "loginContent", "getLoginContent", "setLoginContent", "Ljava/util/HashMap;", "", "extend", "Ljava/util/HashMap;", "getExtend", "()Ljava/util/HashMap;", "setExtend", "(Ljava/util/HashMap;)V", "", AcConstants.K_HTML, "Ljava/lang/Boolean;", "getHtml", "()Ljava/lang/Boolean;", "setHtml", "(Ljava/lang/Boolean;)V", "speakContent", "getSpeakContent", "setSpeakContent", "<init>", "()V", "Companion", "a", "protocol_release"}, k = 1, mv = {1, 5, 1})
public final class UserGuideCard extends DirectivePayload {

    @NotNull
    private static final String VERSION = "2.7";

    @Nullable
    private String agentName;

    @Nullable
    private String content;

    @Nullable
    private HashMap<String, Object> extend;

    @Nullable
    private ArrayList<GuideButton> guideButtons;

    @Nullable
    private Boolean html;

    @Nullable
    private String loginContent;

    @Nullable
    private String speakContent;

    @Nullable
    public final String getAgentName() {
        return this.agentName;
    }

    @Nullable
    public final String getContent() {
        return this.content;
    }

    @Nullable
    public final HashMap<String, Object> getExtend() {
        return this.extend;
    }

    @Nullable
    public final ArrayList<GuideButton> getGuideButtons() {
        return this.guideButtons;
    }

    @Nullable
    public final Boolean getHtml() {
        return this.html;
    }

    @Nullable
    public final String getLoginContent() {
        return this.loginContent;
    }

    @Nullable
    public final String getSpeakContent() {
        return this.speakContent;
    }

    public final void setAgentName(@Nullable String str) {
        this.agentName = str;
    }

    public final void setContent(@Nullable String str) {
        this.content = str;
    }

    public final void setExtend(@Nullable HashMap<String, Object> map) {
        this.extend = map;
    }

    public final void setGuideButtons(@Nullable ArrayList<GuideButton> arrayList) {
        this.guideButtons = arrayList;
    }

    public final void setHtml(@Nullable Boolean bool) {
        this.html = bool;
    }

    public final void setLoginContent(@Nullable String str) {
        this.loginContent = str;
    }

    public final void setSpeakContent(@Nullable String str) {
        this.speakContent = str;
    }
}
