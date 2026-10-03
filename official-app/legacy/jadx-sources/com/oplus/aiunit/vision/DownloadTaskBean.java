package com.oplus.aiunit.vision;

import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.u36, reason: from toString */
/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u0000 \u001a2\u00020\u0001:\u0001\u0005B\u001f\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0011¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\"\u0010\n\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007\"\u0004\b\b\u0010\tR\"\u0010\u0010\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0017\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u001b"}, d2 = {"Lcom/oplus/aiunit/vision/u36;", "", "", "toString", "Lcom/oplus/aiunit/vision/y26;", "a", "Lcom/oplus/aiunit/vision/y26;", "()Lcom/oplus/aiunit/vision/y26;", "setDownloadResource", "(Lcom/oplus/aiunit/vision/y26;)V", "downloadResource", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "setMaterialType", "(Ljava/lang/String;)V", "materialType", "", "c", "Z", "()Z", "setPublicRes", "(Z)V", "isPublicRes", "<init>", "(Lcom/oplus/aiunit/vision/y26;Ljava/lang/String;Z)V", "Companion", "watchface_impl_release"}, k = 1, mv = {1, 8, 0})
public final class DownloadTaskBean {

    @NotNull
    public static final String DEVICE_TYPE = "deviceType";

    @NotNull
    public static final String MATERIAL_TYPE = "materialType";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public y26 downloadResource;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public String materialType;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    public boolean isPublicRes;

    public DownloadTaskBean(@NotNull y26 downloadResource, @NotNull String materialType, boolean z) {
        Intrinsics.checkNotNullParameter(downloadResource, "downloadResource");
        Intrinsics.checkNotNullParameter(materialType, "materialType");
        this.downloadResource = downloadResource;
        this.materialType = materialType;
        this.isPublicRes = z;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final y26 getDownloadResource() {
        return this.downloadResource;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getMaterialType() {
        return this.materialType;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getIsPublicRes() {
        return this.isPublicRes;
    }

    @NotNull
    public String toString() {
        return "DownloadTaskBean(downloadResource=" + this.downloadResource + ", materialType='" + this.materialType + "', isPublicRes=" + this.isPublicRes + ")";
    }
}
