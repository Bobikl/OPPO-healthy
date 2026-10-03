package com.oplus.aiunit.vision;

import com.google.gson.annotations.SerializedName;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\"\u0010#R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\r\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0004\u001a\u0004\b\u000b\u0010\u0006\"\u0004\b\f\u0010\bR\"\u0010\u0015\u001a\u00020\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u0019\u001a\u00020\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0010\u001a\u0004\b\u0017\u0010\u0012\"\u0004\b\u0018\u0010\u0014R\"\u0010\u001d\u001a\u00020\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0010\u001a\u0004\b\u001b\u0010\u0012\"\u0004\b\u001c\u0010\u0014R\"\u0010!\u001a\u00020\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u0010\u001a\u0004\b\u001f\u0010\u0012\"\u0004\b \u0010\u0014¨\u0006$"}, d2 = {"Lcom/oplus/aiunit/vision/zxf;", "Lcom/oplus/aiunit/vision/q6h;", "", MapSchema.FIELD_NAME_ENTRY, "Ljava/lang/String;", "getAttribute", "()Ljava/lang/String;", "setAttribute", "(Ljava/lang/String;)V", "attribute", "f", "getType", "setType", "type", "", b2n.f, "I", "getCenterX", "()I", "setCenterX", "(I)V", "centerX", b2n.g, "getCenterY", "setCenterY", "centerY", "i", "getStartAngle", "setStartAngle", "startAngle", "j", "getEndAngle", "setEndAngle", "endAngle", "<init>", "()V", "watchface_impl_release"}, k = 1, mv = {1, 8, 0})
public final class zxf extends q6h {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("attribute")
    @NotNull
    private String attribute;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @SerializedName("type")
    @NotNull
    private String type;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @SerializedName("center_x")
    private int centerX;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @SerializedName("center_y")
    private int centerY;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @SerializedName("startAngle")
    private int startAngle;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("endAngle")
    private int endAngle;

    public zxf() {
        super("RotationImage");
        this.attribute = "TIME";
        this.type = "MINUTE_ANGLE";
        this.endAngle = 360;
    }
}
