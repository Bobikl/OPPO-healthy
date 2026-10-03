package com.heytap.health.voiceassistant.tts;

import androidx.annotation.Keep;
import com.platform.sdk.center.webview.js.AcCommonApiMethod;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b,\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B}\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\rJ\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0081\u0001\u0010.\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00102\u001a\u000203HÖ\u0001J\t\u00104\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0011R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0011R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000f\"\u0004\b\u0017\u0010\u0011R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u000f\"\u0004\b\u0019\u0010\u0011R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u000f\"\u0004\b\u001b\u0010\u0011R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u000f\"\u0004\b\u001d\u0010\u0011R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u000f\"\u0004\b\u001f\u0010\u0011R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u000f\"\u0004\b!\u0010\u0011R\u001c\u0010\f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u000f\"\u0004\b#\u0010\u0011¨\u00065"}, d2 = {"Lcom/heytap/health/voiceassistant/tts/RestfulReq;", "", "apId", "", "auId", "guId", "ouId", "duId", "imei", "channel", "content", "token", "type", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getApId", "()Ljava/lang/String;", "setApId", "(Ljava/lang/String;)V", "getAuId", "setAuId", "getChannel", "setChannel", "getContent", "setContent", "getDuId", "setDuId", "getGuId", "setGuId", "getImei", "setImei", "getOuId", "setOuId", AcCommonApiMethod.GET_TOKEN, "setToken", "getType", "setType", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "voiceassistant_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class RestfulReq {

    @Nullable
    private String apId;

    @Nullable
    private String auId;

    @Nullable
    private String channel;

    @Nullable
    private String content;

    @Nullable
    private String duId;

    @Nullable
    private String guId;

    @Nullable
    private String imei;

    @Nullable
    private String ouId;

    @Nullable
    private String token;

    @Nullable
    private String type;

    public RestfulReq() {
        this(null, null, null, null, null, null, null, null, null, null, 1023, null);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getApId() {
        return this.apId;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAuId() {
        return this.auId;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getGuId() {
        return this.guId;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getOuId() {
        return this.ouId;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getDuId() {
        return this.duId;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getImei() {
        return this.imei;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getChannel() {
        return this.channel;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getToken() {
        return this.token;
    }

    @NotNull
    public final RestfulReq copy(@Nullable String apId, @Nullable String auId, @Nullable String guId, @Nullable String ouId, @Nullable String duId, @Nullable String imei, @Nullable String channel, @Nullable String content, @Nullable String token, @Nullable String type) {
        return new RestfulReq(apId, auId, guId, ouId, duId, imei, channel, content, token, type);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RestfulReq)) {
            return false;
        }
        RestfulReq restfulReq = (RestfulReq) other;
        return Intrinsics.areEqual(this.apId, restfulReq.apId) && Intrinsics.areEqual(this.auId, restfulReq.auId) && Intrinsics.areEqual(this.guId, restfulReq.guId) && Intrinsics.areEqual(this.ouId, restfulReq.ouId) && Intrinsics.areEqual(this.duId, restfulReq.duId) && Intrinsics.areEqual(this.imei, restfulReq.imei) && Intrinsics.areEqual(this.channel, restfulReq.channel) && Intrinsics.areEqual(this.content, restfulReq.content) && Intrinsics.areEqual(this.token, restfulReq.token) && Intrinsics.areEqual(this.type, restfulReq.type);
    }

    @Nullable
    public final String getApId() {
        return this.apId;
    }

    @Nullable
    public final String getAuId() {
        return this.auId;
    }

    @Nullable
    public final String getChannel() {
        return this.channel;
    }

    @Nullable
    public final String getContent() {
        return this.content;
    }

    @Nullable
    public final String getDuId() {
        return this.duId;
    }

    @Nullable
    public final String getGuId() {
        return this.guId;
    }

    @Nullable
    public final String getImei() {
        return this.imei;
    }

    @Nullable
    public final String getOuId() {
        return this.ouId;
    }

    @Nullable
    public final String getToken() {
        return this.token;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.apId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.auId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.guId;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.ouId;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.duId;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.imei;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.channel;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.content;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.token;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.type;
        return iHashCode9 + (str10 != null ? str10.hashCode() : 0);
    }

    public final void setApId(@Nullable String str) {
        this.apId = str;
    }

    public final void setAuId(@Nullable String str) {
        this.auId = str;
    }

    public final void setChannel(@Nullable String str) {
        this.channel = str;
    }

    public final void setContent(@Nullable String str) {
        this.content = str;
    }

    public final void setDuId(@Nullable String str) {
        this.duId = str;
    }

    public final void setGuId(@Nullable String str) {
        this.guId = str;
    }

    public final void setImei(@Nullable String str) {
        this.imei = str;
    }

    public final void setOuId(@Nullable String str) {
        this.ouId = str;
    }

    public final void setToken(@Nullable String str) {
        this.token = str;
    }

    public final void setType(@Nullable String str) {
        this.type = str;
    }

    @NotNull
    public String toString() {
        return "RestfulReq(apId=" + this.apId + ", auId=" + this.auId + ", guId=" + this.guId + ", ouId=" + this.ouId + ", duId=" + this.duId + ", imei=" + this.imei + ", channel=" + this.channel + ", content=" + this.content + ", token=" + this.token + ", type=" + this.type + ")";
    }

    public RestfulReq(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10) {
        this.apId = str;
        this.auId = str2;
        this.guId = str3;
        this.ouId = str4;
        this.duId = str5;
        this.imei = str6;
        this.channel = str7;
        this.content = str8;
        this.token = str9;
        this.type = str10;
    }

    public /* synthetic */ RestfulReq(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9, (i & 512) != 0 ? null : str10);
    }
}
