package com.heytap.speech.engine.protocol.directive.navigation;

import androidx.annotation.Keep;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0001 B\u0007¢\u0006\u0004\b\u001d\u0010\u001eR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR$\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0004\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR$\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0004\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR*\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R$\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0004\u001a\u0004\b\u001b\u0010\u0006\"\u0004\b\u001c\u0010\b¨\u0006!"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/navigation/PoiCard;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "", "logo", "Ljava/lang/String;", "getLogo", "()Ljava/lang/String;", "setLogo", "(Ljava/lang/String;)V", "headerText", "getHeaderText", "setHeaderText", "btnText", "getBtnText", "setBtnText", "btnDp", "getBtnDp", "setBtnDp", "Ljava/util/ArrayList;", "Lcom/heytap/speech/engine/protocol/directive/navigation/Poi;", "poiList", "Ljava/util/ArrayList;", "getPoiList", "()Ljava/util/ArrayList;", "setPoiList", "(Ljava/util/ArrayList;)V", "copyContent", "getCopyContent", "setCopyContent", "<init>", "()V", "Companion", "a", "protocol_release"}, k = 1, mv = {1, 5, 1})
public final class PoiCard extends DirectivePayload {

    @NotNull
    private static final String VERSION = "2.0";

    @Nullable
    private String btnDp;

    @Nullable
    private String btnText;

    @Nullable
    private String copyContent;

    @Nullable
    private String headerText;

    @Nullable
    private String logo;

    @Nullable
    private ArrayList<Poi> poiList;

    @Nullable
    public final String getBtnDp() {
        return this.btnDp;
    }

    @Nullable
    public final String getBtnText() {
        return this.btnText;
    }

    @Nullable
    public final String getCopyContent() {
        return this.copyContent;
    }

    @Nullable
    public final String getHeaderText() {
        return this.headerText;
    }

    @Nullable
    public final String getLogo() {
        return this.logo;
    }

    @Nullable
    public final ArrayList<Poi> getPoiList() {
        return this.poiList;
    }

    public final void setBtnDp(@Nullable String str) {
        this.btnDp = str;
    }

    public final void setBtnText(@Nullable String str) {
        this.btnText = str;
    }

    public final void setCopyContent(@Nullable String str) {
        this.copyContent = str;
    }

    public final void setHeaderText(@Nullable String str) {
        this.headerText = str;
    }

    public final void setLogo(@Nullable String str) {
        this.logo = str;
    }

    public final void setPoiList(@Nullable ArrayList<Poi> arrayList) {
        this.poiList = arrayList;
    }
}
