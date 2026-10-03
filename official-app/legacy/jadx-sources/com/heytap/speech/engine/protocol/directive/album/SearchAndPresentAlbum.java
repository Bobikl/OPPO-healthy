package com.heytap.speech.engine.protocol.directive.album;

import androidx.annotation.Keep;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import com.heytap.speech.engine.protocol.directive.common.Header;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import com.oplus.aiunit.vision.n28;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001bB\u0007¢\u0006\u0004\b\u0018\u0010\u0019R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR*\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R$\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u001c"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/album/SearchAndPresentAlbum;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "Lcom/heytap/speech/engine/protocol/directive/common/Header;", SpeechConstant.KEY_TTS_REQUEST_HEADER, "Lcom/heytap/speech/engine/protocol/directive/common/Header;", "getHeader", "()Lcom/heytap/speech/engine/protocol/directive/common/Header;", "setHeader", "(Lcom/heytap/speech/engine/protocol/directive/common/Header;)V", "Ljava/util/ArrayList;", "Lcom/heytap/speech/engine/protocol/directive/album/Photo;", "photoList", "Ljava/util/ArrayList;", "getPhotoList", "()Ljava/util/ArrayList;", "setPhotoList", "(Ljava/util/ArrayList;)V", "", n28.KEYWORD, "Ljava/lang/String;", "getKeyword", "()Ljava/lang/String;", "setKeyword", "(Ljava/lang/String;)V", "<init>", "()V", "Companion", "a", "protocol_release"}, k = 1, mv = {1, 5, 1})
public final class SearchAndPresentAlbum extends DirectivePayload {

    @NotNull
    private static final String VERSION = "2.0";

    @Nullable
    private Header header;

    @Nullable
    private String keyword;

    @Nullable
    private ArrayList<Photo> photoList;

    @Nullable
    public final Header getHeader() {
        return this.header;
    }

    @Nullable
    public final String getKeyword() {
        return this.keyword;
    }

    @Nullable
    public final ArrayList<Photo> getPhotoList() {
        return this.photoList;
    }

    public final void setHeader(@Nullable Header header) {
        this.header = header;
    }

    public final void setKeyword(@Nullable String str) {
        this.keyword = str;
    }

    public final void setPhotoList(@Nullable ArrayList<Photo> arrayList) {
        this.photoList = arrayList;
    }
}
