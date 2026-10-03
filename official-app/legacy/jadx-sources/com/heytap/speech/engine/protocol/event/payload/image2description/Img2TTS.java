package com.heytap.speech.engine.protocol.event.payload.image2description;

import androidx.annotation.Keep;
import com.heytap.speech.engine.protocol.event.Payload;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0012\u0010\u0013R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR$\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0004\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR$\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0004\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\b¨\u0006\u0016"}, d2 = {"Lcom/heytap/speech/engine/protocol/event/payload/image2description/Img2TTS;", "Lcom/heytap/speech/engine/protocol/event/Payload;", "", "dmName", "Ljava/lang/String;", "getDmName", "()Ljava/lang/String;", "setDmName", "(Ljava/lang/String;)V", "imgBase64", "getImgBase64", "setImgBase64", "skill", "getSkill", "setSkill", "intent", "getIntent", "setIntent", "<init>", "()V", "Companion", "a", "protocol_release"}, k = 1, mv = {1, 5, 1})
public final class Img2TTS extends Payload {

    @NotNull
    private static final String VERSION = "2.0";

    @Nullable
    private String dmName;

    @Nullable
    private String imgBase64;

    @Nullable
    private String intent;

    @Nullable
    private String skill;

    @Nullable
    public final String getDmName() {
        return this.dmName;
    }

    @Nullable
    public final String getImgBase64() {
        return this.imgBase64;
    }

    @Nullable
    public final String getIntent() {
        return this.intent;
    }

    @Nullable
    public final String getSkill() {
        return this.skill;
    }

    public final void setDmName(@Nullable String str) {
        this.dmName = str;
    }

    public final void setImgBase64(@Nullable String str) {
        this.imgBase64 = str;
    }

    public final void setIntent(@Nullable String str) {
        this.intent = str;
    }

    public final void setSkill(@Nullable String str) {
        this.skill = str;
    }
}
