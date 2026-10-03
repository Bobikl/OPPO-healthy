package com.oplus.aiunit.vision;

import com.google.gson.annotations.SerializedName;
import io.protostuff.MapSchema;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.n7c, reason: from toString */
/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R(\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000b\u0010\u000fR\u001a\u0010\u0015\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lcom/oplus/aiunit/vision/n7c;", "Lcom/oplus/aiunit/vision/x7c;", "", "toString", "", "hashCode", "", "other", "", "equals", "", MapSchema.FIELD_NAME_ENTRY, "Ljava/util/List;", "getFirstFrame", "()Ljava/util/List;", "(Ljava/util/List;)V", "firstFrame", "f", "I", "getMatchID", "()I", "matchID", "watchface_impl_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class MultiMediaCell extends x7c {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("firstFrame")
    @NotNull
    private List<String> firstFrame;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @SerializedName("matchID")
    private final int matchID;

    public final void e(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.firstFrame = list;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MultiMediaCell)) {
            return false;
        }
        MultiMediaCell multiMediaCell = (MultiMediaCell) other;
        return Intrinsics.areEqual(this.firstFrame, multiMediaCell.firstFrame) && this.matchID == multiMediaCell.matchID;
    }

    public int hashCode() {
        return (this.firstFrame.hashCode() * 31) + Integer.hashCode(this.matchID);
    }

    @NotNull
    public String toString() {
        return "MultiMediaCell(firstFrame=" + this.firstFrame + ", matchID=" + this.matchID + ")";
    }
}
