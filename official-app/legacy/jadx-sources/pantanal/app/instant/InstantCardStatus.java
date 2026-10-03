package pantanal.app.instant;

import androidx.annotation.Keep;
import com.oplus.smartenginehelper.ParserTag;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lpantanal/app/instant/InstantCardStatus;", "", ParserTag.TAG_URI, "", "status", "", "(Ljava/lang/String;I)V", "getStatus", "()I", "getUri", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "pantanal-interface_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class InstantCardStatus {
    private final int status;

    @NotNull
    private final String uri;

    public InstantCardStatus(@NotNull String uri, int i) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        this.uri = uri;
        this.status = i;
    }

    public static /* synthetic */ InstantCardStatus copy$default(InstantCardStatus instantCardStatus, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = instantCardStatus.uri;
        }
        if ((i2 & 2) != 0) {
            i = instantCardStatus.status;
        }
        return instantCardStatus.copy(str, i);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUri() {
        return this.uri;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    @NotNull
    public final InstantCardStatus copy(@NotNull String uri, int status) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return new InstantCardStatus(uri, status);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InstantCardStatus)) {
            return false;
        }
        InstantCardStatus instantCardStatus = (InstantCardStatus) other;
        return Intrinsics.areEqual(this.uri, instantCardStatus.uri) && this.status == instantCardStatus.status;
    }

    public final int getStatus() {
        return this.status;
    }

    @NotNull
    public final String getUri() {
        return this.uri;
    }

    public int hashCode() {
        return (this.uri.hashCode() * 31) + Integer.hashCode(this.status);
    }

    @NotNull
    public String toString() {
        return "InstantCardStatus(uri=" + this.uri + ", status=" + this.status + ")";
    }
}
