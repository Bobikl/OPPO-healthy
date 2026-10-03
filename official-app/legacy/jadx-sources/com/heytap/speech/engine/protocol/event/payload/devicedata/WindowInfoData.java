package com.heytap.speech.engine.protocol.event.payload.devicedata;

import androidx.annotation.Keep;
import com.heytap.speech.engine.protocol.event.Payload;
import java.util.ArrayList;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/heytap/speech/engine/protocol/event/payload/devicedata/WindowInfoData;", "Lcom/heytap/speech/engine/protocol/event/Payload;", "()V", "screenPos", "Lcom/heytap/speech/engine/protocol/event/payload/devicedata/WindowRectangle;", "getScreenPos", "()Lcom/heytap/speech/engine/protocol/event/payload/devicedata/WindowRectangle;", "setScreenPos", "(Lcom/heytap/speech/engine/protocol/event/payload/devicedata/WindowRectangle;)V", "windowInfoList", "Ljava/util/ArrayList;", "Lcom/heytap/speech/engine/protocol/event/payload/devicedata/WindowInfo;", "getWindowInfoList", "()Ljava/util/ArrayList;", "setWindowInfoList", "(Ljava/util/ArrayList;)V", "protocol_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class WindowInfoData extends Payload {

    @Nullable
    private WindowRectangle screenPos;

    @Nullable
    private ArrayList<WindowInfo> windowInfoList;

    @Nullable
    public final WindowRectangle getScreenPos() {
        return this.screenPos;
    }

    @Nullable
    public final ArrayList<WindowInfo> getWindowInfoList() {
        return this.windowInfoList;
    }

    public final void setScreenPos(@Nullable WindowRectangle windowRectangle) {
        this.screenPos = windowRectangle;
    }

    public final void setWindowInfoList(@Nullable ArrayList<WindowInfo> arrayList) {
        this.windowInfoList = arrayList;
    }
}
