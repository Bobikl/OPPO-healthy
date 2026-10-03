package com.heytap.speech.engine.breenovad.params;

import androidx.annotation.Keep;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\nJ&\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, d2 = {"Lcom/heytap/speech/engine/breenovad/params/DataFrame;", "", TypedValues.AttributesType.S_FRAME, "", "shouldConsiderCache", "", "([BLjava/lang/Boolean;)V", "getFrame", "()[B", "getShouldConsiderCache", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "copy", "([BLjava/lang/Boolean;)Lcom/heytap/speech/engine/breenovad/params/DataFrame;", "equals", "other", "hashCode", "", "toString", "", "vad_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class DataFrame {

    @Nullable
    private final byte[] frame;

    @Nullable
    private final Boolean shouldConsiderCache;

    public DataFrame(@Nullable byte[] bArr, @Nullable Boolean bool) {
        this.frame = bArr;
        this.shouldConsiderCache = bool;
    }

    public static /* synthetic */ DataFrame copy$default(DataFrame dataFrame, byte[] bArr, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            bArr = dataFrame.frame;
        }
        if ((i & 2) != 0) {
            bool = dataFrame.shouldConsiderCache;
        }
        return dataFrame.copy(bArr, bool);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final byte[] getFrame() {
        return this.frame;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Boolean getShouldConsiderCache() {
        return this.shouldConsiderCache;
    }

    @NotNull
    public final DataFrame copy(@Nullable byte[] frame, @Nullable Boolean shouldConsiderCache) {
        return new DataFrame(frame, shouldConsiderCache);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(DataFrame.class, other == null ? null : other.getClass())) {
            return false;
        }
        DataFrame dataFrame = (DataFrame) other;
        return Arrays.equals(this.frame, dataFrame.frame) && Intrinsics.areEqual(this.shouldConsiderCache, dataFrame.shouldConsiderCache);
    }

    @Nullable
    public final byte[] getFrame() {
        return this.frame;
    }

    @Nullable
    public final Boolean getShouldConsiderCache() {
        return this.shouldConsiderCache;
    }

    public int hashCode() {
        int iHashCode = Arrays.hashCode(this.frame) * 31;
        Boolean bool = this.shouldConsiderCache;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "DataFrame(frame=" + Arrays.toString(this.frame) + ", shouldConsiderCache=" + this.shouldConsiderCache + ')';
    }

    public /* synthetic */ DataFrame(byte[] bArr, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(bArr, (i & 2) != 0 ? Boolean.FALSE : bool);
    }
}
