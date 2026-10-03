package com.heytap.speech.engine.protocol.directive.tone;

import androidx.annotation.Keep;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import com.oplus.smartenginehelper.entity.ClickApiEntity;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0007\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001eB\u0007¢\u0006\u0004\b\u001b\u0010\u001cR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR6\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\n\u0018\u00010\tj\n\u0012\u0004\u0012\u00020\n\u0018\u0001`\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R6\u0010\u0012\u001a\u0016\u0012\u0004\u0012\u00020\n\u0018\u00010\tj\n\u0012\u0004\u0012\u00020\n\u0018\u0001`\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0014\u0010\u0011R$\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0004\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR$\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0004\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\b¨\u0006\u001f"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/tone/ToneSwitchCard;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "", "tone", "Ljava/lang/String;", "getTone", "()Ljava/lang/String;", "setTone", "(Ljava/lang/String;)V", "Ljava/util/ArrayList;", "Lcom/heytap/speech/engine/protocol/directive/tone/SupportToneEntity;", "Lkotlin/collections/ArrayList;", "officialTone", "Ljava/util/ArrayList;", "getOfficialTone", "()Ljava/util/ArrayList;", "setOfficialTone", "(Ljava/util/ArrayList;)V", "customTone", "getCustomTone", "setCustomTone", "text", "getText", ClickApiEntity.SET_TEXT, "speakText", "getSpeakText", "setSpeakText", "<init>", "()V", "Companion", "a", "protocol_release"}, k = 1, mv = {1, 5, 1})
public final class ToneSwitchCard extends DirectivePayload {

    @NotNull
    private static final String VERSION = "2.1";

    @Nullable
    private ArrayList<SupportToneEntity> customTone;

    @Nullable
    private ArrayList<SupportToneEntity> officialTone;

    @Nullable
    private String speakText;

    @Nullable
    private String text;

    @Nullable
    private String tone;

    @Nullable
    public final ArrayList<SupportToneEntity> getCustomTone() {
        return this.customTone;
    }

    @Nullable
    public final ArrayList<SupportToneEntity> getOfficialTone() {
        return this.officialTone;
    }

    @Nullable
    public final String getSpeakText() {
        return this.speakText;
    }

    @Nullable
    public final String getText() {
        return this.text;
    }

    @Nullable
    public final String getTone() {
        return this.tone;
    }

    public final void setCustomTone(@Nullable ArrayList<SupportToneEntity> arrayList) {
        this.customTone = arrayList;
    }

    public final void setOfficialTone(@Nullable ArrayList<SupportToneEntity> arrayList) {
        this.officialTone = arrayList;
    }

    public final void setSpeakText(@Nullable String str) {
        this.speakText = str;
    }

    public final void setText(@Nullable String str) {
        this.text = str;
    }

    public final void setTone(@Nullable String str) {
        this.tone = str;
    }
}
