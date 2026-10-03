package com.heytap.health.watchface.business.creation.engine.bean.cell.times;

import com.google.gson.annotations.SerializedName;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.x7c;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\u0018\u00002\u00020\u0001:\u0001\u0013B\u0007¢\u0006\u0004\b\u0011\u0010\u0012R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\r\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0004\u001a\u0004\b\u000b\u0010\u0006\"\u0004\b\f\u0010\bR\"\u0010\u0010\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0006\"\u0004\b\u0003\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/heytap/health/watchface/business/creation/engine/bean/cell/times/NumberTimeCell;", "Lcom/oplus/aiunit/vision/x7c;", "", MapSchema.FIELD_NAME_ENTRY, "Ljava/lang/String;", "getAttribute", "()Ljava/lang/String;", "setAttribute", "(Ljava/lang/String;)V", "attribute", "f", "getType", "setType", "type", b2n.f, "getColor", "color", "<init>", "()V", "Type", "watchface_impl_release"}, k = 1, mv = {1, 8, 0})
public final class NumberTimeCell extends x7c {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("attribute")
    @NotNull
    private String attribute;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @SerializedName("type")
    @NotNull
    private String type;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @SerializedName("color")
    @NotNull
    private String color;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/heytap/health/watchface/business/creation/engine/bean/cell/times/NumberTimeCell$Type;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "MINUTE_LOW", "MINUTE_HIGH", "HOUR_LOW", "HOUR_HIGH", "watchface_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum Type {
        MINUTE_LOW("MINUTE_LOW_INDEX"),
        MINUTE_HIGH("MINUTE_HIGH_INDEX"),
        HOUR_LOW("HOUR_LOW_INDEX"),
        HOUR_HIGH("HOUR_HIGH_INDEX");


        @NotNull
        private final String value;

        Type(String str) {
            this.value = str;
        }

        @NotNull
        public final String getValue() {
            return this.value;
        }
    }

    public NumberTimeCell() {
        super("NumberImage");
        this.attribute = "TIME";
        this.type = Type.HOUR_HIGH.getValue();
        this.color = "#FFFFFF";
    }

    public final void e(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.color = str;
    }
}
