package com.heytap.speech.engine.protocol.event.payload;

import androidx.annotation.Keep;
import com.heytap.speech.engine.protocol.event.Payload;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/heytap/speech/engine/protocol/event/payload/AsrInfo;", "Lcom/heytap/speech/engine/protocol/event/Payload;", "lang", "", "dialect", "(Ljava/lang/String;Ljava/lang/String;)V", "getDialect", "()Ljava/lang/String;", "getLang", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "protocol_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class AsrInfo extends Payload {

    @Nullable
    private final String dialect;

    @NotNull
    private final String lang;

    public AsrInfo(@NotNull String lang, @Nullable String str) {
        Intrinsics.checkNotNullParameter(lang, "lang");
        this.lang = lang;
        this.dialect = str;
    }

    public static /* synthetic */ AsrInfo copy$default(AsrInfo asrInfo, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = asrInfo.lang;
        }
        if ((i & 2) != 0) {
            str2 = asrInfo.dialect;
        }
        return asrInfo.copy(str, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getLang() {
        return this.lang;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDialect() {
        return this.dialect;
    }

    @NotNull
    public final AsrInfo copy(@NotNull String lang, @Nullable String dialect) {
        Intrinsics.checkNotNullParameter(lang, "lang");
        return new AsrInfo(lang, dialect);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AsrInfo)) {
            return false;
        }
        AsrInfo asrInfo = (AsrInfo) other;
        return Intrinsics.areEqual(this.lang, asrInfo.lang) && Intrinsics.areEqual(this.dialect, asrInfo.dialect);
    }

    @Nullable
    public final String getDialect() {
        return this.dialect;
    }

    @NotNull
    public final String getLang() {
        return this.lang;
    }

    public int hashCode() {
        int iHashCode = this.lang.hashCode() * 31;
        String str = this.dialect;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        return "AsrInfo(lang=" + this.lang + ", dialect=" + ((Object) this.dialect) + ')';
    }
}
