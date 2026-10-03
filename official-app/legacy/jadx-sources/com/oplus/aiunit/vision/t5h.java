package com.oplus.aiunit.vision;

import android.view.View;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u0013\u001a\u00020\u000e\u0012\u0006\u0010\u0017\u001a\u00020\u0002\u0012\u0006\u0010\u0019\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0017\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0017\u0010\u0019\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u000f\u0010\u0016R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001a\u001a\u0004\b\u0018\u0010\u001b¨\u0006\u001f"}, d2 = {"Lcom/oplus/aiunit/vision/t5h;", "", "", "toString", "", "hashCode", "other", "", "equals", "Lcom/oplus/aiunit/vision/f8b;", "a", "Lcom/oplus/aiunit/vision/f8b;", "()Lcom/oplus/aiunit/vision/f8b;", y15.PARAMS_DATA_TYPE, "Landroid/view/View;", "b", "Landroid/view/View;", MapSchema.FIELD_NAME_ENTRY, "()Landroid/view/View;", "view", "c", "Ljava/lang/String;", "()Ljava/lang/String;", "deviceTitle", "d", "deviceContent", "Ljava/lang/Object;", "()Ljava/lang/Object;", "payload", "<init>", "(Lcom/oplus/aiunit/vision/f8b;Landroid/view/View;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "health_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class t5h {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final f8b dataType;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final View view;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String deviceTitle;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final String deviceContent;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Object payload;

    public t5h(@NotNull f8b dataType, @NotNull View view, @NotNull String deviceTitle, @NotNull String deviceContent, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(dataType, "dataType");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(deviceTitle, "deviceTitle");
        Intrinsics.checkNotNullParameter(deviceContent, "deviceContent");
        this.dataType = dataType;
        this.view = view;
        this.deviceTitle = deviceTitle;
        this.deviceContent = deviceContent;
        this.payload = obj;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final f8b getDataType() {
        return this.dataType;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getDeviceContent() {
        return this.deviceContent;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getDeviceTitle() {
        return this.deviceTitle;
    }

    @Nullable
    /* JADX INFO: renamed from: d, reason: from getter */
    public final Object getPayload() {
        return this.payload;
    }

    @NotNull
    /* JADX INFO: renamed from: e, reason: from getter */
    public final View getView() {
        return this.view;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof t5h)) {
            return false;
        }
        t5h t5hVar = (t5h) other;
        return Intrinsics.areEqual(this.dataType, t5hVar.dataType) && Intrinsics.areEqual(this.view, t5hVar.view) && Intrinsics.areEqual(this.deviceTitle, t5hVar.deviceTitle) && Intrinsics.areEqual(this.deviceContent, t5hVar.deviceContent) && Intrinsics.areEqual(this.payload, t5hVar.payload);
    }

    public int hashCode() {
        int iHashCode = ((((((this.dataType.hashCode() * 31) + this.view.hashCode()) * 31) + this.deviceTitle.hashCode()) * 31) + this.deviceContent.hashCode()) * 31;
        Object obj = this.payload;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }

    @NotNull
    public String toString() {
        return this.dataType + "," + this.deviceTitle;
    }
}
