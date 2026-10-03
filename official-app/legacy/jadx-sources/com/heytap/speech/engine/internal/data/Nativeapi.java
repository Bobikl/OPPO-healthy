package com.heytap.speech.engine.internal.data;

import androidx.annotation.Keep;
import com.heytap.store.business.rn.service.RnConstant;
import com.oplus.aiunit.vision.oea;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/heytap/speech/engine/internal/data/Nativeapi;", "", oea.FEATURE_API_REQUEST, "", RnConstant.KEY_INIT_OPTIONS, "Lcom/heytap/speech/engine/internal/data/Param;", "(Ljava/lang/String;Lcom/heytap/speech/engine/internal/data/Param;)V", "getApi", "()Ljava/lang/String;", "setApi", "(Ljava/lang/String;)V", "getParam", "()Lcom/heytap/speech/engine/internal/data/Param;", "setParam", "(Lcom/heytap/speech/engine/internal/data/Param;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "speechEngine_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class Nativeapi {

    @Nullable
    private String api;

    @Nullable
    private Param param;

    /* JADX WARN: Multi-variable type inference failed */
    public Nativeapi() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ Nativeapi copy$default(Nativeapi nativeapi, String str, Param param, int i, Object obj) {
        if ((i & 1) != 0) {
            str = nativeapi.api;
        }
        if ((i & 2) != 0) {
            param = nativeapi.param;
        }
        return nativeapi.copy(str, param);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getApi() {
        return this.api;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Param getParam() {
        return this.param;
    }

    @NotNull
    public final Nativeapi copy(@Nullable String api, @Nullable Param param) {
        return new Nativeapi(api, param);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Nativeapi)) {
            return false;
        }
        Nativeapi nativeapi = (Nativeapi) other;
        return Intrinsics.areEqual(this.api, nativeapi.api) && Intrinsics.areEqual(this.param, nativeapi.param);
    }

    @Nullable
    public final String getApi() {
        return this.api;
    }

    @Nullable
    public final Param getParam() {
        return this.param;
    }

    public int hashCode() {
        String str = this.api;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Param param = this.param;
        return iHashCode + (param != null ? param.hashCode() : 0);
    }

    public final void setApi(@Nullable String str) {
        this.api = str;
    }

    public final void setParam(@Nullable Param param) {
        this.param = param;
    }

    @NotNull
    public String toString() {
        return "Nativeapi(api=" + ((Object) this.api) + ", param=" + this.param + ')';
    }

    public Nativeapi(@Nullable String str, @Nullable Param param) {
        this.api = str;
        this.param = param;
    }

    public /* synthetic */ Nativeapi(String str, Param param, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : param);
    }
}
