package com.heytap.speech.engine.constant;

import com.oplus.smartenginehelper.entity.ClickApiEntity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\bJ&\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/heytap/speech/engine/constant/VoiceUploadBean;", "", "type", "", ClickApiEntity.TIME, "", "(Ljava/lang/String;Ljava/lang/Long;)V", "getTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getType", "()Ljava/lang/String;", "component1", "component2", "copy", "(Ljava/lang/String;Ljava/lang/Long;)Lcom/heytap/speech/engine/constant/VoiceUploadBean;", "equals", "", "other", "hashCode", "", "toString", "speechEngine_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class VoiceUploadBean {

    @Nullable
    private final Long time;

    @Nullable
    private final String type;

    public VoiceUploadBean(@Nullable String str, @Nullable Long l2) {
        this.type = str;
        this.time = l2;
    }

    public static /* synthetic */ VoiceUploadBean copy$default(VoiceUploadBean voiceUploadBean, String str, Long l2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = voiceUploadBean.type;
        }
        if ((i & 2) != 0) {
            l2 = voiceUploadBean.time;
        }
        return voiceUploadBean.copy(str, l2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Long getTime() {
        return this.time;
    }

    @NotNull
    public final VoiceUploadBean copy(@Nullable String type, @Nullable Long time) {
        return new VoiceUploadBean(type, time);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VoiceUploadBean)) {
            return false;
        }
        VoiceUploadBean voiceUploadBean = (VoiceUploadBean) other;
        return Intrinsics.areEqual(this.type, voiceUploadBean.type) && Intrinsics.areEqual(this.time, voiceUploadBean.time);
    }

    @Nullable
    public final Long getTime() {
        return this.time;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.type;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l2 = this.time;
        return iHashCode + (l2 != null ? l2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "VoiceUploadBean(type=" + ((Object) this.type) + ", time=" + this.time + ')';
    }
}
