package com.heytap.speech.engine.protocol.directive.shopping;

import androidx.annotation.Keep;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 +2\u00020\u0001:\u0001,B\u0007¢\u0006\u0004\b)\u0010*R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR6\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\n\u0018\u00010\tj\n\u0012\u0004\u0012\u00020\n\u0018\u0001`\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R$\u0010\u0019\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u001a\u0010\u0016\"\u0004\b\u001b\u0010\u0018R$\u0010\u001c\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0014\u001a\u0004\b\u001d\u0010\u0016\"\u0004\b\u001e\u0010\u0018R$\u0010\u001f\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u0014\u001a\u0004\b \u0010\u0016\"\u0004\b!\u0010\u0018R$\u0010#\u001a\u0004\u0018\u00010\"8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(¨\u0006-"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/shopping/ShoppingBusinessSearch;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "Lcom/heytap/speech/engine/protocol/directive/shopping/AppInfo;", "appInfo", "Lcom/heytap/speech/engine/protocol/directive/shopping/AppInfo;", "getAppInfo", "()Lcom/heytap/speech/engine/protocol/directive/shopping/AppInfo;", "setAppInfo", "(Lcom/heytap/speech/engine/protocol/directive/shopping/AppInfo;)V", "Ljava/util/ArrayList;", "Lcom/heytap/speech/engine/protocol/directive/shopping/ShoppingInfo;", "Lkotlin/collections/ArrayList;", "productsInfos", "Ljava/util/ArrayList;", "getProductsInfos", "()Ljava/util/ArrayList;", "setProductsInfos", "(Ljava/util/ArrayList;)V", "", "code", "Ljava/lang/String;", "getCode", "()Ljava/lang/String;", "setCode", "(Ljava/lang/String;)V", "errorMessage", "getErrorMessage", "setErrorMessage", "respSpeech", "getRespSpeech", "setRespSpeech", "attributes", "getAttributes", "setAttributes", "Lcom/heytap/speech/engine/protocol/directive/shopping/CommonParam;", "commonParam", "Lcom/heytap/speech/engine/protocol/directive/shopping/CommonParam;", "getCommonParam", "()Lcom/heytap/speech/engine/protocol/directive/shopping/CommonParam;", "setCommonParam", "(Lcom/heytap/speech/engine/protocol/directive/shopping/CommonParam;)V", "<init>", "()V", "Companion", "a", "protocol_release"}, k = 1, mv = {1, 5, 1})
public final class ShoppingBusinessSearch extends DirectivePayload {

    @NotNull
    private static final String VERSION = "2.2";

    @Nullable
    private AppInfo appInfo;

    @Nullable
    private String attributes;

    @Nullable
    private String code;

    @Nullable
    private CommonParam commonParam;

    @Nullable
    private String errorMessage;

    @Nullable
    private ArrayList<ShoppingInfo> productsInfos;

    @Nullable
    private String respSpeech;

    @Nullable
    public final AppInfo getAppInfo() {
        return this.appInfo;
    }

    @Nullable
    public final String getAttributes() {
        return this.attributes;
    }

    @Nullable
    public final String getCode() {
        return this.code;
    }

    @Nullable
    public final CommonParam getCommonParam() {
        return this.commonParam;
    }

    @Nullable
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    @Nullable
    public final ArrayList<ShoppingInfo> getProductsInfos() {
        return this.productsInfos;
    }

    @Nullable
    public final String getRespSpeech() {
        return this.respSpeech;
    }

    public final void setAppInfo(@Nullable AppInfo appInfo) {
        this.appInfo = appInfo;
    }

    public final void setAttributes(@Nullable String str) {
        this.attributes = str;
    }

    public final void setCode(@Nullable String str) {
        this.code = str;
    }

    public final void setCommonParam(@Nullable CommonParam commonParam) {
        this.commonParam = commonParam;
    }

    public final void setErrorMessage(@Nullable String str) {
        this.errorMessage = str;
    }

    public final void setProductsInfos(@Nullable ArrayList<ShoppingInfo> arrayList) {
        this.productsInfos = arrayList;
    }

    public final void setRespSpeech(@Nullable String str) {
        this.respSpeech = str;
    }
}
