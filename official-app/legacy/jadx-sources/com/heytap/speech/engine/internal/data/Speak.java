package com.heytap.speech.engine.internal.data;

import androidx.annotation.Keep;
import com.heytap.speech.engine.constant.EngineConstant;
import com.oplus.smartenginehelper.entity.ClickApiEntity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003JE\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\n\"\u0004\b\u0010\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\n\"\u0004\b\u0012\u0010\fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\n\"\u0004\b\u0014\u0010\f¨\u0006!"}, d2 = {"Lcom/heytap/speech/engine/internal/data/Speak;", "", "audioUrl", "", "speakUrl", EngineConstant.TTS_TYPE_SSML, "text", "type", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAudioUrl", "()Ljava/lang/String;", "setAudioUrl", "(Ljava/lang/String;)V", "getSpeakUrl", "setSpeakUrl", "getSsml", "setSsml", "getText", ClickApiEntity.SET_TEXT, "getType", "setType", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "speechEngine_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class Speak {

    @Nullable
    private String audioUrl;

    @Nullable
    private String speakUrl;

    @Nullable
    private String ssml;

    @Nullable
    private String text;

    @Nullable
    private String type;

    public Speak() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ Speak copy$default(Speak speak, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = speak.audioUrl;
        }
        if ((i & 2) != 0) {
            str2 = speak.speakUrl;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = speak.ssml;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = speak.text;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = speak.type;
        }
        return speak.copy(str, str6, str7, str8, str5);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAudioUrl() {
        return this.audioUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSpeakUrl() {
        return this.speakUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSsml() {
        return this.ssml;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @NotNull
    public final Speak copy(@Nullable String audioUrl, @Nullable String speakUrl, @Nullable String ssml, @Nullable String text, @Nullable String type) {
        return new Speak(audioUrl, speakUrl, ssml, text, type);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Speak)) {
            return false;
        }
        Speak speak = (Speak) other;
        return Intrinsics.areEqual(this.audioUrl, speak.audioUrl) && Intrinsics.areEqual(this.speakUrl, speak.speakUrl) && Intrinsics.areEqual(this.ssml, speak.ssml) && Intrinsics.areEqual(this.text, speak.text) && Intrinsics.areEqual(this.type, speak.type);
    }

    @Nullable
    public final String getAudioUrl() {
        return this.audioUrl;
    }

    @Nullable
    public final String getSpeakUrl() {
        return this.speakUrl;
    }

    @Nullable
    public final String getSsml() {
        return this.ssml;
    }

    @Nullable
    public final String getText() {
        return this.text;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.audioUrl;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.speakUrl;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.ssml;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.text;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.type;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public final void setAudioUrl(@Nullable String str) {
        this.audioUrl = str;
    }

    public final void setSpeakUrl(@Nullable String str) {
        this.speakUrl = str;
    }

    public final void setSsml(@Nullable String str) {
        this.ssml = str;
    }

    public final void setText(@Nullable String str) {
        this.text = str;
    }

    public final void setType(@Nullable String str) {
        this.type = str;
    }

    @NotNull
    public String toString() {
        return "Speak(audioUrl=" + ((Object) this.audioUrl) + ", speakUrl=" + ((Object) this.speakUrl) + ", ssml=" + ((Object) this.ssml) + ", text=" + ((Object) this.text) + ", type=" + ((Object) this.type) + ')';
    }

    public Speak(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        this.audioUrl = str;
        this.speakUrl = str2;
        this.ssml = str3;
        this.text = str4;
        this.type = str5;
    }

    public /* synthetic */ Speak(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5);
    }
}
