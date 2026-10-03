package com.oplus.aiunit.vision;

import com.google.gson.annotations.SerializedName;
import io.protostuff.MapSchema;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/oplus/aiunit/vision/wwk;", "Lcom/oplus/aiunit/vision/x7c;", "", MapSchema.FIELD_NAME_ENTRY, "I", "getMatchID", "()I", "matchID", "<init>", "(I)V", "watchface_impl_release"}, k = 1, mv = {1, 8, 0})
public final class wwk extends x7c {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("matchID")
    private final int matchID;

    public wwk() {
        this(0, 1, null);
    }

    public /* synthetic */ wwk(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 1 : i);
    }

    public wwk(int i) {
        super("VideoCover");
        this.matchID = i;
    }
}
