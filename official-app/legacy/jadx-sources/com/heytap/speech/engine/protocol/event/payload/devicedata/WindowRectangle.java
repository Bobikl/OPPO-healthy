package com.heytap.speech.engine.protocol.event.payload.devicedata;

import androidx.annotation.Keep;
import com.heytap.speech.engine.protocol.event.Payload;
import com.oplus.aiunit.vision.y04;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/heytap/speech/engine/protocol/event/payload/devicedata/WindowRectangle;", "Lcom/heytap/speech/engine/protocol/event/Payload;", "()V", y04.TIME_STYLE_DOWN_DIR_NAME, "", "getDown", "()I", "setDown", "(I)V", y04.TIME_STYLE_LEFT_DIR_NAME, "getLeft", "setLeft", y04.TIME_STYLE_RIGHT_DIR_NAME, "getRight", "setRight", y04.TIME_STYLE_UP_DIR_NAME, "getUp", "setUp", "protocol_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class WindowRectangle extends Payload {
    private int down;
    private int left;
    private int right;
    private int up;

    public final int getDown() {
        return this.down;
    }

    public final int getLeft() {
        return this.left;
    }

    public final int getRight() {
        return this.right;
    }

    public final int getUp() {
        return this.up;
    }

    public final void setDown(int i) {
        this.down = i;
    }

    public final void setLeft(int i) {
        this.left = i;
    }

    public final void setRight(int i) {
        this.right = i;
    }

    public final void setUp(int i) {
        this.up = i;
    }
}
