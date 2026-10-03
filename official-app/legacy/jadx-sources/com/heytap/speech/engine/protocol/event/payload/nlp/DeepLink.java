package com.heytap.speech.engine.protocol.event.payload.nlp;

import androidx.annotation.Keep;
import com.heytap.connect.config.connectid.ConnectIdLogic;
import java.util.HashMap;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR>\u0010\f\u001a&\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\rj\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u0001`\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0006\"\u0004\b\u0015\u0010\bR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0006\"\u0004\b\u0018\u0010\bR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0006\"\u0004\b\u001b\u0010\bR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0006\"\u0004\b\u001e\u0010\bR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0006\"\u0004\b!\u0010\b¨\u0006\""}, d2 = {"Lcom/heytap/speech/engine/protocol/event/payload/nlp/DeepLink;", "", "()V", ConnectIdLogic.PARAM_ALGORITHM, "", "getAlgorithm", "()Ljava/lang/String;", "setAlgorithm", "(Ljava/lang/String;)V", "appId", "getAppId", "setAppId", "extra", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "getExtra", "()Ljava/util/HashMap;", "setExtra", "(Ljava/util/HashMap;)V", "packageName", "getPackageName", "setPackageName", ConnectIdLogic.PARAM_SECRET_ID, "getSecretId", "setSecretId", "sign", "getSign", "setSign", "source", "getSource", "setSource", "timestamp", "getTimestamp", "setTimestamp", "protocol_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class DeepLink {

    @Nullable
    private String algorithm;

    @Nullable
    private String appId;

    @Nullable
    private HashMap<String, Object> extra;

    @Nullable
    private String packageName;

    @Nullable
    private String secretId;

    @Nullable
    private String sign;

    @Nullable
    private String source;

    @Nullable
    private String timestamp;

    @Nullable
    public final String getAlgorithm() {
        return this.algorithm;
    }

    @Nullable
    public final String getAppId() {
        return this.appId;
    }

    @Nullable
    public final HashMap<String, Object> getExtra() {
        return this.extra;
    }

    @Nullable
    public final String getPackageName() {
        return this.packageName;
    }

    @Nullable
    public final String getSecretId() {
        return this.secretId;
    }

    @Nullable
    public final String getSign() {
        return this.sign;
    }

    @Nullable
    public final String getSource() {
        return this.source;
    }

    @Nullable
    public final String getTimestamp() {
        return this.timestamp;
    }

    public final void setAlgorithm(@Nullable String str) {
        this.algorithm = str;
    }

    public final void setAppId(@Nullable String str) {
        this.appId = str;
    }

    public final void setExtra(@Nullable HashMap<String, Object> map) {
        this.extra = map;
    }

    public final void setPackageName(@Nullable String str) {
        this.packageName = str;
    }

    public final void setSecretId(@Nullable String str) {
        this.secretId = str;
    }

    public final void setSign(@Nullable String str) {
        this.sign = str;
    }

    public final void setSource(@Nullable String str) {
        this.source = str;
    }

    public final void setTimestamp(@Nullable String str) {
        this.timestamp = str;
    }
}
