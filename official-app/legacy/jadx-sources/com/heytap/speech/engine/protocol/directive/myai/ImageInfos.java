package com.heytap.speech.engine.protocol.directive.myai;

import androidx.annotation.Keep;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import com.oplus.aiunit.vision.wrf;
import java.util.ArrayList;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R.\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004j\n\u0012\u0004\u0012\u00020\u0005\u0018\u0001`\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/myai/ImageInfos;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "()V", wrf.DEFAULT_IMAGES_DIR_NAME, "Ljava/util/ArrayList;", "Lcom/heytap/speech/engine/protocol/directive/myai/ImageInfo;", "Lkotlin/collections/ArrayList;", "getImages", "()Ljava/util/ArrayList;", "setImages", "(Ljava/util/ArrayList;)V", "protocol_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class ImageInfos extends DirectivePayload {

    @Nullable
    private ArrayList<ImageInfo> images;

    @Nullable
    public final ArrayList<ImageInfo> getImages() {
        return this.images;
    }

    public final void setImages(@Nullable ArrayList<ImageInfo> arrayList) {
        this.images = arrayList;
    }
}
