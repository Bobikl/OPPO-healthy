package com.oplus.aiunit.vision;

import com.google.gson.annotations.SerializedName;
import io.protostuff.MapSchema;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.v97, reason: from toString */
/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\n¢\u0006\u0004\b\u0012\u0010\u0010J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R(\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/oplus/aiunit/vision/v97;", "Lcom/oplus/aiunit/vision/x7c;", "", "toString", "", "hashCode", "", "other", "", "equals", "", MapSchema.FIELD_NAME_ENTRY, "Ljava/util/List;", "getFirstFrame", "()Ljava/util/List;", "setFirstFrame", "(Ljava/util/List;)V", "firstFrame", "<init>", "watchface_impl_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class FgImageCell extends x7c {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("firstFrame")
    @NotNull
    private List<String> firstFrame;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FgImageCell(@NotNull List<String> firstFrame) {
        super("FrontImages");
        Intrinsics.checkNotNullParameter(firstFrame, "firstFrame");
        this.firstFrame = firstFrame;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof FgImageCell) && Intrinsics.areEqual(this.firstFrame, ((FgImageCell) other).firstFrame);
    }

    public int hashCode() {
        return this.firstFrame.hashCode();
    }

    @NotNull
    public String toString() {
        return "FgImageCell(firstFrame=" + this.firstFrame + ")";
    }
}
