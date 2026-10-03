package com.heytap.speech.engine.protocol.directive.shopping;

import androidx.annotation.Keep;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import java.util.ArrayList;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001e\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0013\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0011R.\u0010\u0016\u001a\u0016\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017j\n\u0012\u0004\u0012\u00020\u0018\u0018\u0001`\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0006\"\u0004\b \u0010\bR\u001c\u0010!\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0006\"\u0004\b#\u0010\bR\u001c\u0010$\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0006\"\u0004\b&\u0010\bR\u001c\u0010'\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0006\"\u0004\b)\u0010\b¨\u0006*"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/shopping/ShoppingInfo;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "()V", "apiProvider", "", "getApiProvider", "()Ljava/lang/String;", "setApiProvider", "(Ljava/lang/String;)V", "keyWord", "getKeyWord", "setKeyWord", "limitSize", "", "getLimitSize", "()Ljava/lang/Integer;", "setLimitSize", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "pageSize", "getPageSize", "setPageSize", "products", "Ljava/util/ArrayList;", "Lcom/heytap/speech/engine/protocol/directive/shopping/ProductInfo;", "Lkotlin/collections/ArrayList;", "getProducts", "()Ljava/util/ArrayList;", "setProducts", "(Ljava/util/ArrayList;)V", SpeechConstant.KEY_RECORD_ID, "getRecordId", "setRecordId", "type", "getType", "setType", "url", "getUrl", "setUrl", "version", "getVersion", "setVersion", "protocol_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class ShoppingInfo extends DirectivePayload {

    @Nullable
    private String apiProvider;

    @Nullable
    private String keyWord;

    @Nullable
    private Integer limitSize;

    @Nullable
    private Integer pageSize;

    @Nullable
    private ArrayList<ProductInfo> products;

    @Nullable
    private String recordId;

    @Nullable
    private String type;

    @Nullable
    private String url;

    @Nullable
    private String version;

    @Nullable
    public final String getApiProvider() {
        return this.apiProvider;
    }

    @Nullable
    public final String getKeyWord() {
        return this.keyWord;
    }

    @Nullable
    public final Integer getLimitSize() {
        return this.limitSize;
    }

    @Nullable
    public final Integer getPageSize() {
        return this.pageSize;
    }

    @Nullable
    public final ArrayList<ProductInfo> getProducts() {
        return this.products;
    }

    @Nullable
    public final String getRecordId() {
        return this.recordId;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    @Nullable
    public final String getUrl() {
        return this.url;
    }

    @Nullable
    public final String getVersion() {
        return this.version;
    }

    public final void setApiProvider(@Nullable String str) {
        this.apiProvider = str;
    }

    public final void setKeyWord(@Nullable String str) {
        this.keyWord = str;
    }

    public final void setLimitSize(@Nullable Integer num) {
        this.limitSize = num;
    }

    public final void setPageSize(@Nullable Integer num) {
        this.pageSize = num;
    }

    public final void setProducts(@Nullable ArrayList<ProductInfo> arrayList) {
        this.products = arrayList;
    }

    public final void setRecordId(@Nullable String str) {
        this.recordId = str;
    }

    public final void setType(@Nullable String str) {
        this.type = str;
    }

    public final void setUrl(@Nullable String str) {
        this.url = str;
    }

    public final void setVersion(@Nullable String str) {
        this.version = str;
    }
}
