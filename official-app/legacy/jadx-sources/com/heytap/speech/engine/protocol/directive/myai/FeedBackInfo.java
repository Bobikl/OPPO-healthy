package com.heytap.speech.engine.protocol.directive.myai;

import androidx.annotation.Keep;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0011\u0010\u0006\"\u0004\b\u0012\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/myai/FeedBackInfo;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "()V", "copyFlag", "", "getCopyFlag", "()Ljava/lang/Boolean;", "setCopyFlag", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "regenerate", "", "getRegenerate", "()Ljava/lang/String;", "setRegenerate", "(Ljava/lang/String;)V", "upvoteFlag", "getUpvoteFlag", "setUpvoteFlag", "protocol_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class FeedBackInfo extends DirectivePayload {

    @Nullable
    private Boolean copyFlag;

    @Nullable
    private String regenerate;

    @Nullable
    private Boolean upvoteFlag;

    @Nullable
    public final Boolean getCopyFlag() {
        return this.copyFlag;
    }

    @Nullable
    public final String getRegenerate() {
        return this.regenerate;
    }

    @Nullable
    public final Boolean getUpvoteFlag() {
        return this.upvoteFlag;
    }

    public final void setCopyFlag(@Nullable Boolean bool) {
        this.copyFlag = bool;
    }

    public final void setRegenerate(@Nullable String str) {
        this.regenerate = str;
    }

    public final void setUpvoteFlag(@Nullable Boolean bool) {
        this.upvoteFlag = bool;
    }
}
