package com.heytap.store.base.core.data;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\nJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0007HÆ\u0003J2\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0007HÖ\u0001R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\r\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006 "}, d2 = {"Lcom/heytap/store/base/core/data/PleaseStayInfo;", "", "data", "Lcom/heytap/store/base/core/data/ReleaseStayVo;", "code", "", "message", "", "(Lcom/heytap/store/base/core/data/ReleaseStayVo;Ljava/lang/Integer;Ljava/lang/String;)V", "getCode", "()Ljava/lang/Integer;", "setCode", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getData", "()Lcom/heytap/store/base/core/data/ReleaseStayVo;", "setData", "(Lcom/heytap/store/base/core/data/ReleaseStayVo;)V", "getMessage", "()Ljava/lang/String;", "setMessage", "(Ljava/lang/String;)V", "component1", "component2", "component3", "copy", "(Lcom/heytap/store/base/core/data/ReleaseStayVo;Ljava/lang/Integer;Ljava/lang/String;)Lcom/heytap/store/base/core/data/PleaseStayInfo;", "equals", "", "other", "hashCode", "toString", "Core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final /* data */ class PleaseStayInfo {

    @Nullable
    private Integer code;

    @Nullable
    private ReleaseStayVo data;

    @Nullable
    private String message;

    public PleaseStayInfo(@Nullable ReleaseStayVo releaseStayVo, @Nullable Integer num, @Nullable String str) {
        this.data = releaseStayVo;
        this.code = num;
        this.message = str;
    }

    public static /* synthetic */ PleaseStayInfo copy$default(PleaseStayInfo pleaseStayInfo, ReleaseStayVo releaseStayVo, Integer num, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            releaseStayVo = pleaseStayInfo.data;
        }
        if ((i & 2) != 0) {
            num = pleaseStayInfo.code;
        }
        if ((i & 4) != 0) {
            str = pleaseStayInfo.message;
        }
        return pleaseStayInfo.copy(releaseStayVo, num, str);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ReleaseStayVo getData() {
        return this.data;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getCode() {
        return this.code;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    @NotNull
    public final PleaseStayInfo copy(@Nullable ReleaseStayVo data, @Nullable Integer code, @Nullable String message) {
        return new PleaseStayInfo(data, code, message);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PleaseStayInfo)) {
            return false;
        }
        PleaseStayInfo pleaseStayInfo = (PleaseStayInfo) other;
        return Intrinsics.areEqual(this.data, pleaseStayInfo.data) && Intrinsics.areEqual(this.code, pleaseStayInfo.code) && Intrinsics.areEqual(this.message, pleaseStayInfo.message);
    }

    @Nullable
    public final Integer getCode() {
        return this.code;
    }

    @Nullable
    public final ReleaseStayVo getData() {
        return this.data;
    }

    @Nullable
    public final String getMessage() {
        return this.message;
    }

    public int hashCode() {
        ReleaseStayVo releaseStayVo = this.data;
        int iHashCode = (releaseStayVo == null ? 0 : releaseStayVo.hashCode()) * 31;
        Integer num = this.code;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.message;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final void setCode(@Nullable Integer num) {
        this.code = num;
    }

    public final void setData(@Nullable ReleaseStayVo releaseStayVo) {
        this.data = releaseStayVo;
    }

    public final void setMessage(@Nullable String str) {
        this.message = str;
    }

    @NotNull
    public String toString() {
        return "PleaseStayInfo(data=" + this.data + ", code=" + this.code + ", message=" + ((Object) this.message) + ')';
    }
}
