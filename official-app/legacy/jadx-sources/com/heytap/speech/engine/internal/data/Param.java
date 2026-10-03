package com.heytap.speech.engine.internal.data;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b$\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Be\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003Ji\u0010&\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020+HÖ\u0001J\t\u0010,\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\r\"\u0004\b\u0013\u0010\u000fR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\r\"\u0004\b\u0017\u0010\u000fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\r\"\u0004\b\u0019\u0010\u000fR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\r\"\u0004\b\u001b\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\r\"\u0004\b\u001d\u0010\u000f¨\u0006-"}, d2 = {"Lcom/heytap/speech/engine/internal/data/Param;", "", "intentName", "", "nlu", "skillId", "pinyin", "duiWidget", "channel", "data", "script", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getChannel", "()Ljava/lang/String;", "setChannel", "(Ljava/lang/String;)V", "getData", "setData", "getDuiWidget", "setDuiWidget", "getIntentName", "setIntentName", "getNlu", "setNlu", "getPinyin", "setPinyin", "getScript", "setScript", "getSkillId", "setSkillId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "speechEngine_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class Param {

    @Nullable
    private String channel;

    @Nullable
    private String data;

    @Nullable
    private String duiWidget;

    @Nullable
    private String intentName;

    @Nullable
    private String nlu;

    @Nullable
    private String pinyin;

    @Nullable
    private String script;

    @Nullable
    private String skillId;

    public Param() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getIntentName() {
        return this.intentName;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getNlu() {
        return this.nlu;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSkillId() {
        return this.skillId;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPinyin() {
        return this.pinyin;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getDuiWidget() {
        return this.duiWidget;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getChannel() {
        return this.channel;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getData() {
        return this.data;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getScript() {
        return this.script;
    }

    @NotNull
    public final Param copy(@Nullable String intentName, @Nullable String nlu, @Nullable String skillId, @Nullable String pinyin, @Nullable String duiWidget, @Nullable String channel, @Nullable String data, @Nullable String script) {
        return new Param(intentName, nlu, skillId, pinyin, duiWidget, channel, data, script);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Param)) {
            return false;
        }
        Param param = (Param) other;
        return Intrinsics.areEqual(this.intentName, param.intentName) && Intrinsics.areEqual(this.nlu, param.nlu) && Intrinsics.areEqual(this.skillId, param.skillId) && Intrinsics.areEqual(this.pinyin, param.pinyin) && Intrinsics.areEqual(this.duiWidget, param.duiWidget) && Intrinsics.areEqual(this.channel, param.channel) && Intrinsics.areEqual(this.data, param.data) && Intrinsics.areEqual(this.script, param.script);
    }

    @Nullable
    public final String getChannel() {
        return this.channel;
    }

    @Nullable
    public final String getData() {
        return this.data;
    }

    @Nullable
    public final String getDuiWidget() {
        return this.duiWidget;
    }

    @Nullable
    public final String getIntentName() {
        return this.intentName;
    }

    @Nullable
    public final String getNlu() {
        return this.nlu;
    }

    @Nullable
    public final String getPinyin() {
        return this.pinyin;
    }

    @Nullable
    public final String getScript() {
        return this.script;
    }

    @Nullable
    public final String getSkillId() {
        return this.skillId;
    }

    public int hashCode() {
        String str = this.intentName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.nlu;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.skillId;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.pinyin;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.duiWidget;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.channel;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.data;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.script;
        return iHashCode7 + (str8 != null ? str8.hashCode() : 0);
    }

    public final void setChannel(@Nullable String str) {
        this.channel = str;
    }

    public final void setData(@Nullable String str) {
        this.data = str;
    }

    public final void setDuiWidget(@Nullable String str) {
        this.duiWidget = str;
    }

    public final void setIntentName(@Nullable String str) {
        this.intentName = str;
    }

    public final void setNlu(@Nullable String str) {
        this.nlu = str;
    }

    public final void setPinyin(@Nullable String str) {
        this.pinyin = str;
    }

    public final void setScript(@Nullable String str) {
        this.script = str;
    }

    public final void setSkillId(@Nullable String str) {
        this.skillId = str;
    }

    @NotNull
    public String toString() {
        return "Param(intentName=" + ((Object) this.intentName) + ", nlu=" + ((Object) this.nlu) + ", skillId=" + ((Object) this.skillId) + ", pinyin=" + ((Object) this.pinyin) + ", duiWidget=" + ((Object) this.duiWidget) + ", channel=" + ((Object) this.channel) + ", data=" + ((Object) this.data) + ", script=" + ((Object) this.script) + ')';
    }

    public Param(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8) {
        this.intentName = str;
        this.nlu = str2;
        this.skillId = str3;
        this.pinyin = str4;
        this.duiWidget = str5;
        this.channel = str6;
        this.data = str7;
        this.script = str8;
    }

    public /* synthetic */ Param(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8);
    }
}
