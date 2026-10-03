package com.heytap.speech.engine.protocol.directive.image;

import androidx.annotation.Keep;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001bB\u0007¢\u0006\u0004\b\u0018\u0010\u0019R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR0\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u001c"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/image/DisplayReviewImage;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "Lcom/heytap/speech/engine/protocol/directive/image/ImageStyle2;", "imageStyle", "Lcom/heytap/speech/engine/protocol/directive/image/ImageStyle2;", "getImageStyle", "()Lcom/heytap/speech/engine/protocol/directive/image/ImageStyle2;", "setImageStyle", "(Lcom/heytap/speech/engine/protocol/directive/image/ImageStyle2;)V", "", "previewImageUrl", "Ljava/lang/String;", "getPreviewImageUrl", "()Ljava/lang/String;", "setPreviewImageUrl", "(Ljava/lang/String;)V", "Ljava/util/HashMap;", "", "extend", "Ljava/util/HashMap;", "getExtend", "()Ljava/util/HashMap;", "setExtend", "(Ljava/util/HashMap;)V", "<init>", "()V", "Companion", "a", "protocol_release"}, k = 1, mv = {1, 5, 1})
public final class DisplayReviewImage extends DirectivePayload {

    @NotNull
    private static final String VERSION = "2.0";

    @Nullable
    private HashMap<String, Object> extend;

    @Nullable
    private ImageStyle2 imageStyle;

    @Nullable
    private String previewImageUrl;

    @Nullable
    public final HashMap<String, Object> getExtend() {
        return this.extend;
    }

    @Nullable
    public final ImageStyle2 getImageStyle() {
        return this.imageStyle;
    }

    @Nullable
    public final String getPreviewImageUrl() {
        return this.previewImageUrl;
    }

    public final void setExtend(@Nullable HashMap<String, Object> map) {
        this.extend = map;
    }

    public final void setImageStyle(@Nullable ImageStyle2 imageStyle2) {
        this.imageStyle = imageStyle2;
    }

    public final void setPreviewImageUrl(@Nullable String str) {
        this.previewImageUrl = str;
    }
}
