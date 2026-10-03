package com.heytap.speech.engine;

import androidx.annotation.Keep;
import com.heytap.speech.engine.protocol.directive.aicall.CallTextCard;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b(\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\rJ\u0010\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010(\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0014J\u000b\u0010)\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0010\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u000b\u0010,\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0010\u0010-\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010#Jb\u0010.\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0002\u0010/J\u0013\u00100\u001a\u00020\u00032\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00102\u001a\u00020\fHÖ\u0001J\t\u00103\u001a\u00020\u0007HÖ\u0001R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001c\u0010\b\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0019\"\u0004\b\u001d\u0010\u001bR\u001e\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u001e\u0010\u000f\"\u0004\b\u001f\u0010\u0011R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0019\"\u0004\b!\u0010\u001bR\u001e\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u0010\n\u0002\u0010&\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%¨\u00064"}, d2 = {"Lcom/heytap/speech/engine/Tts;", "", "enable", "", "speed", "", "test", "", "type", "visible", CallTextCard.REQ_TYPE_VOICE, SpeechConstant.KEY_VOLUME, "", "(Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;)V", "getEnable", "()Ljava/lang/Boolean;", "setEnable", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getSpeed", "()Ljava/lang/Double;", "setSpeed", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "getTest", "()Ljava/lang/String;", "setTest", "(Ljava/lang/String;)V", "getType", "setType", "getVisible", "setVisible", "getVoice", "setVoice", "getVolume", "()Ljava/lang/Integer;", "setVolume", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;)Lcom/heytap/speech/engine/Tts;", "equals", "other", "hashCode", "toString", "speechEngine_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class Tts {

    @Nullable
    private Boolean enable;

    @Nullable
    private Double speed;

    @Nullable
    private String test;

    @Nullable
    private String type;

    @Nullable
    private Boolean visible;

    @Nullable
    private String voice;

    @Nullable
    private Integer volume;

    public Tts() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public static /* synthetic */ Tts copy$default(Tts tts, Boolean bool, Double d, String str, String str2, Boolean bool2, String str3, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = tts.enable;
        }
        if ((i & 2) != 0) {
            d = tts.speed;
        }
        Double d2 = d;
        if ((i & 4) != 0) {
            str = tts.test;
        }
        String str4 = str;
        if ((i & 8) != 0) {
            str2 = tts.type;
        }
        String str5 = str2;
        if ((i & 16) != 0) {
            bool2 = tts.visible;
        }
        Boolean bool3 = bool2;
        if ((i & 32) != 0) {
            str3 = tts.voice;
        }
        String str6 = str3;
        if ((i & 64) != 0) {
            num = tts.volume;
        }
        return tts.copy(bool, d2, str4, str5, bool3, str6, num);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Boolean getEnable() {
        return this.enable;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Double getSpeed() {
        return this.speed;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTest() {
        return this.test;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Boolean getVisible() {
        return this.visible;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getVoice() {
        return this.voice;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Integer getVolume() {
        return this.volume;
    }

    @NotNull
    public final Tts copy(@Nullable Boolean enable, @Nullable Double speed, @Nullable String test, @Nullable String type, @Nullable Boolean visible, @Nullable String voice, @Nullable Integer volume) {
        return new Tts(enable, speed, test, type, visible, voice, volume);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Tts)) {
            return false;
        }
        Tts tts = (Tts) other;
        return Intrinsics.areEqual(this.enable, tts.enable) && Intrinsics.areEqual((Object) this.speed, (Object) tts.speed) && Intrinsics.areEqual(this.test, tts.test) && Intrinsics.areEqual(this.type, tts.type) && Intrinsics.areEqual(this.visible, tts.visible) && Intrinsics.areEqual(this.voice, tts.voice) && Intrinsics.areEqual(this.volume, tts.volume);
    }

    @Nullable
    public final Boolean getEnable() {
        return this.enable;
    }

    @Nullable
    public final Double getSpeed() {
        return this.speed;
    }

    @Nullable
    public final String getTest() {
        return this.test;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    @Nullable
    public final Boolean getVisible() {
        return this.visible;
    }

    @Nullable
    public final String getVoice() {
        return this.voice;
    }

    @Nullable
    public final Integer getVolume() {
        return this.volume;
    }

    public int hashCode() {
        Boolean bool = this.enable;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Double d = this.speed;
        int iHashCode2 = (iHashCode + (d == null ? 0 : d.hashCode())) * 31;
        String str = this.test;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.type;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool2 = this.visible;
        int iHashCode5 = (iHashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str3 = this.voice;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.volume;
        return iHashCode6 + (num != null ? num.hashCode() : 0);
    }

    public final void setEnable(@Nullable Boolean bool) {
        this.enable = bool;
    }

    public final void setSpeed(@Nullable Double d) {
        this.speed = d;
    }

    public final void setTest(@Nullable String str) {
        this.test = str;
    }

    public final void setType(@Nullable String str) {
        this.type = str;
    }

    public final void setVisible(@Nullable Boolean bool) {
        this.visible = bool;
    }

    public final void setVoice(@Nullable String str) {
        this.voice = str;
    }

    public final void setVolume(@Nullable Integer num) {
        this.volume = num;
    }

    @NotNull
    public String toString() {
        return "Tts(enable=" + this.enable + ", speed=" + this.speed + ", test=" + ((Object) this.test) + ", type=" + ((Object) this.type) + ", visible=" + this.visible + ", voice=" + ((Object) this.voice) + ", volume=" + this.volume + ')';
    }

    public Tts(@Nullable Boolean bool, @Nullable Double d, @Nullable String str, @Nullable String str2, @Nullable Boolean bool2, @Nullable String str3, @Nullable Integer num) {
        this.enable = bool;
        this.speed = d;
        this.test = str;
        this.type = str2;
        this.visible = bool2;
        this.voice = str3;
        this.volume = num;
    }

    public /* synthetic */ Tts(Boolean bool, Double d, String str, String str2, Boolean bool2, String str3, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : d, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : bool2, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : num);
    }
}
