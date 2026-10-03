package com.heytap.speech.engine.protocol.directive.memory;

import androidx.annotation.Keep;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0011\b\u0007\u0018\u0000 ,2\u00020\u0001:\u0001-B\u0007¢\u0006\u0004\b*\u0010+R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR$\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0004\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR$\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0004\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR$\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0004\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR$\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR0\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R$\u0010$\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010\u0004\u001a\u0004\b%\u0010\u0006\"\u0004\b&\u0010\bR$\u0010'\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010\u0004\u001a\u0004\b(\u0010\u0006\"\u0004\b)\u0010\b¨\u0006."}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/memory/MemoryCreateCard;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "", "memoryId", "Ljava/lang/String;", "getMemoryId", "()Ljava/lang/String;", "setMemoryId", "(Ljava/lang/String;)V", "memoryCreateTime", "getMemoryCreateTime", "setMemoryCreateTime", "cardTitle", "getCardTitle", "setCardTitle", "cardIconUrl", "getCardIconUrl", "setCardIconUrl", "cardDarkIconUrl", "getCardDarkIconUrl", "setCardDarkIconUrl", "", "timeout", "Ljava/lang/Integer;", "getTimeout", "()Ljava/lang/Integer;", "setTimeout", "(Ljava/lang/Integer;)V", "Ljava/util/HashMap;", "", "errorDoudi", "Ljava/util/HashMap;", "getErrorDoudi", "()Ljava/util/HashMap;", "setErrorDoudi", "(Ljava/util/HashMap;)V", "defaultDoudi", "getDefaultDoudi", "setDefaultDoudi", "timeoutDoudi", "getTimeoutDoudi", "setTimeoutDoudi", "<init>", "()V", "Companion", "a", "protocol_release"}, k = 1, mv = {1, 5, 1})
public final class MemoryCreateCard extends DirectivePayload {

    @NotNull
    private static final String VERSION = "2.1";

    @Nullable
    private String cardDarkIconUrl;

    @Nullable
    private String cardIconUrl;

    @Nullable
    private String cardTitle;

    @Nullable
    private String defaultDoudi;

    @Nullable
    private HashMap<String, Object> errorDoudi;

    @Nullable
    private String memoryCreateTime;

    @Nullable
    private String memoryId;

    @Nullable
    private Integer timeout;

    @Nullable
    private String timeoutDoudi;

    @Nullable
    public final String getCardDarkIconUrl() {
        return this.cardDarkIconUrl;
    }

    @Nullable
    public final String getCardIconUrl() {
        return this.cardIconUrl;
    }

    @Nullable
    public final String getCardTitle() {
        return this.cardTitle;
    }

    @Nullable
    public final String getDefaultDoudi() {
        return this.defaultDoudi;
    }

    @Nullable
    public final HashMap<String, Object> getErrorDoudi() {
        return this.errorDoudi;
    }

    @Nullable
    public final String getMemoryCreateTime() {
        return this.memoryCreateTime;
    }

    @Nullable
    public final String getMemoryId() {
        return this.memoryId;
    }

    @Nullable
    public final Integer getTimeout() {
        return this.timeout;
    }

    @Nullable
    public final String getTimeoutDoudi() {
        return this.timeoutDoudi;
    }

    public final void setCardDarkIconUrl(@Nullable String str) {
        this.cardDarkIconUrl = str;
    }

    public final void setCardIconUrl(@Nullable String str) {
        this.cardIconUrl = str;
    }

    public final void setCardTitle(@Nullable String str) {
        this.cardTitle = str;
    }

    public final void setDefaultDoudi(@Nullable String str) {
        this.defaultDoudi = str;
    }

    public final void setErrorDoudi(@Nullable HashMap<String, Object> map) {
        this.errorDoudi = map;
    }

    public final void setMemoryCreateTime(@Nullable String str) {
        this.memoryCreateTime = str;
    }

    public final void setMemoryId(@Nullable String str) {
        this.memoryId = str;
    }

    public final void setTimeout(@Nullable Integer num) {
        this.timeout = num;
    }

    public final void setTimeoutDoudi(@Nullable String str) {
        this.timeoutDoudi = str;
    }
}
