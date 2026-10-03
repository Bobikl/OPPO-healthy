package com.heytap.health.health_archives.bean;

import androidx.annotation.Keep;
import androidx.core.app.FrameMetricsAggregator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes16.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b'\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bg\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0002\u0010\u000eJ\t\u0010'\u001a\u00020\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010.\u001a\u00020\fHÆ\u0003J\t\u0010/\u001a\u00020\fHÆ\u0003Jk\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\t\u001a\u00020\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\fHÆ\u0001J\u0013\u00101\u001a\u00020\f2\b\u00102\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u00103\u001a\u000204H\u0016J\b\u00105\u001a\u00020\u0005H\u0016R\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0010\"\u0004\b\u0018\u0010\u0012R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0014\"\u0004\b\u001a\u0010\u0016R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0014\"\u0004\b\u001c\u0010\u0016R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0014\"\u0004\b\u001e\u0010\u0016R\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0010\"\u0004\b$\u0010\u0012R\u001a\u0010\r\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010 \"\u0004\b&\u0010\"¨\u00066"}, d2 = {"Lcom/heytap/health/health_archives/bean/PhotoItem;", "", "id", "", "name", "", "path", "size", "mimeType", "addTime", "bucketName", "selected", "", "uploaded", "(JLjava/lang/String;Ljava/lang/String;JLjava/lang/String;JLjava/lang/String;ZZ)V", "getAddTime", "()J", "setAddTime", "(J)V", "getBucketName", "()Ljava/lang/String;", "setBucketName", "(Ljava/lang/String;)V", "getId", "setId", "getMimeType", "setMimeType", "getName", "setName", "getPath", "setPath", "getSelected", "()Z", "setSelected", "(Z)V", "getSize", "setSize", "getUploaded", "setUploaded", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "health_archives_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class PhotoItem {
    private long addTime;

    @Nullable
    private String bucketName;
    private long id;

    @Nullable
    private String mimeType;

    @Nullable
    private String name;

    @Nullable
    private String path;
    private boolean selected;
    private long size;
    private boolean uploaded;

    public PhotoItem() {
        this(0L, null, null, 0L, null, 0L, null, false, false, FrameMetricsAggregator.EVERY_DURATION, null);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPath() {
        return this.path;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getSize() {
        return this.size;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getMimeType() {
        return this.mimeType;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final long getAddTime() {
        return this.addTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getBucketName() {
        return this.bucketName;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getSelected() {
        return this.selected;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final boolean getUploaded() {
        return this.uploaded;
    }

    @NotNull
    public final PhotoItem copy(long id, @Nullable String name, @Nullable String path, long size, @Nullable String mimeType, long addTime, @Nullable String bucketName, boolean selected, boolean uploaded) {
        return new PhotoItem(id, name, path, size, mimeType, addTime, bucketName, selected, uploaded);
    }

    public boolean equals(@Nullable Object other) {
        String str = this.path;
        if (str == null || !(other instanceof PhotoItem)) {
            return super.equals(other);
        }
        String str2 = ((PhotoItem) other).path;
        if (str2 == null) {
            return false;
        }
        return StringsKt__StringsJVMKt.equals(str, str2, true);
    }

    public final long getAddTime() {
        return this.addTime;
    }

    @Nullable
    public final String getBucketName() {
        return this.bucketName;
    }

    public final long getId() {
        return this.id;
    }

    @Nullable
    public final String getMimeType() {
        return this.mimeType;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final String getPath() {
        return this.path;
    }

    public final boolean getSelected() {
        return this.selected;
    }

    public final long getSize() {
        return this.size;
    }

    public final boolean getUploaded() {
        return this.uploaded;
    }

    public int hashCode() {
        return super.hashCode();
    }

    public final void setAddTime(long j2) {
        this.addTime = j2;
    }

    public final void setBucketName(@Nullable String str) {
        this.bucketName = str;
    }

    public final void setId(long j2) {
        this.id = j2;
    }

    public final void setMimeType(@Nullable String str) {
        this.mimeType = str;
    }

    public final void setName(@Nullable String str) {
        this.name = str;
    }

    public final void setPath(@Nullable String str) {
        this.path = str;
    }

    public final void setSelected(boolean z) {
        this.selected = z;
    }

    public final void setSize(long j2) {
        this.size = j2;
    }

    public final void setUploaded(boolean z) {
        this.uploaded = z;
    }

    @NotNull
    public String toString() {
        return "ImageItem{name = " + this.name + ", path = " + this.path + ", size = " + this.size + "}";
    }

    public PhotoItem(long j2, @Nullable String str, @Nullable String str2, long j3, @Nullable String str3, long j4, @Nullable String str4, boolean z, boolean z2) {
        this.id = j2;
        this.name = str;
        this.path = str2;
        this.size = j3;
        this.mimeType = str3;
        this.addTime = j4;
        this.bucketName = str4;
        this.selected = z;
        this.uploaded = z2;
    }

    public /* synthetic */ PhotoItem(long j2, String str, String str2, long j3, String str3, long j4, String str4, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j2, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? 0L : j3, (i & 16) != 0 ? null : str3, (i & 32) == 0 ? j4 : 0L, (i & 64) == 0 ? str4 : null, (i & 128) != 0 ? false : z, (i & 256) == 0 ? z2 : false);
    }
}
