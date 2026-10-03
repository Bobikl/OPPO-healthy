package com.heytap.health.health_archives.bean;

import androidx.annotation.Keep;
import com.oplus.aiunit.vision.wrf;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes16.dex */
@Keep
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B]\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\u001c\b\u0002\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000bj\n\u0012\u0004\u0012\u00020\u0007\u0018\u0001`\f¢\u0006\u0002\u0010\rJ\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010&\u001a\u00020\tHÆ\u0003J\u001d\u0010'\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000bj\n\u0012\u0004\u0012\u00020\u0007\u0018\u0001`\fHÆ\u0003Ja\u0010(\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u001c\b\u0002\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000bj\n\u0012\u0004\u0012\u00020\u0007\u0018\u0001`\fHÆ\u0001J\u0013\u0010)\u001a\u00020\t2\b\u0010*\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010+\u001a\u00020,H\u0016J\b\u0010-\u001a\u00020\u0003H\u0016R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R.\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000bj\n\u0012\u0004\u0012\u00020\u0007\u0018\u0001`\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u000f\"\u0004\b\u001b\u0010\u0011R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u000f\"\u0004\b\u001d\u0010\u0011R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u0006."}, d2 = {"Lcom/heytap/health/health_archives/bean/PhotoFolder;", "", "albumId", "", "name", "path", "cover", "Lcom/heytap/health/health_archives/bean/PhotoItem;", "selected", "", wrf.DEFAULT_IMAGES_DIR_NAME, "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/heytap/health/health_archives/bean/PhotoItem;ZLjava/util/ArrayList;)V", "getAlbumId", "()Ljava/lang/String;", "setAlbumId", "(Ljava/lang/String;)V", "getCover", "()Lcom/heytap/health/health_archives/bean/PhotoItem;", "setCover", "(Lcom/heytap/health/health_archives/bean/PhotoItem;)V", "getImages", "()Ljava/util/ArrayList;", "setImages", "(Ljava/util/ArrayList;)V", "getName", "setName", "getPath", "setPath", "getSelected", "()Z", "setSelected", "(Z)V", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "health_archives_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class PhotoFolder {

    @Nullable
    private String albumId;

    @Nullable
    private PhotoItem cover;

    @Nullable
    private ArrayList<PhotoItem> images;

    @Nullable
    private String name;

    @Nullable
    private String path;
    private boolean selected;

    public PhotoFolder() {
        this(null, null, null, null, false, null, 63, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PhotoFolder copy$default(PhotoFolder photoFolder, String str, String str2, String str3, PhotoItem photoItem, boolean z, ArrayList arrayList, int i, Object obj) {
        if ((i & 1) != 0) {
            str = photoFolder.albumId;
        }
        if ((i & 2) != 0) {
            str2 = photoFolder.name;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            str3 = photoFolder.path;
        }
        String str5 = str3;
        if ((i & 8) != 0) {
            photoItem = photoFolder.cover;
        }
        PhotoItem photoItem2 = photoItem;
        if ((i & 16) != 0) {
            z = photoFolder.selected;
        }
        boolean z2 = z;
        if ((i & 32) != 0) {
            arrayList = photoFolder.images;
        }
        return photoFolder.copy(str, str4, str5, photoItem2, z2, arrayList);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAlbumId() {
        return this.albumId;
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

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final PhotoItem getCover() {
        return this.cover;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getSelected() {
        return this.selected;
    }

    @Nullable
    public final ArrayList<PhotoItem> component6() {
        return this.images;
    }

    @NotNull
    public final PhotoFolder copy(@Nullable String albumId, @Nullable String name, @Nullable String path, @Nullable PhotoItem cover, boolean selected, @Nullable ArrayList<PhotoItem> images) {
        return new PhotoFolder(albumId, name, path, cover, selected, images);
    }

    public boolean equals(@Nullable Object other) {
        String str = this.albumId;
        if (str == null || this.name == null || !(other instanceof PhotoFolder)) {
            return super.equals(other);
        }
        PhotoFolder photoFolder = (PhotoFolder) other;
        return StringsKt__StringsJVMKt.equals(str, photoFolder.albumId, true) && StringsKt__StringsJVMKt.equals(this.name, photoFolder.name, true);
    }

    @Nullable
    public final String getAlbumId() {
        return this.albumId;
    }

    @Nullable
    public final PhotoItem getCover() {
        return this.cover;
    }

    @Nullable
    public final ArrayList<PhotoItem> getImages() {
        return this.images;
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

    public int hashCode() {
        return super.hashCode();
    }

    public final void setAlbumId(@Nullable String str) {
        this.albumId = str;
    }

    public final void setCover(@Nullable PhotoItem photoItem) {
        this.cover = photoItem;
    }

    public final void setImages(@Nullable ArrayList<PhotoItem> arrayList) {
        this.images = arrayList;
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

    @NotNull
    public String toString() {
        String str = this.albumId;
        String str2 = this.name;
        ArrayList<PhotoItem> arrayList = this.images;
        return "ImageFolder{id = " + str + ", name = " + str2 + ", images = " + (arrayList != null ? Integer.valueOf(arrayList.size()) : null) + "}";
    }

    public PhotoFolder(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable PhotoItem photoItem, boolean z, @Nullable ArrayList<PhotoItem> arrayList) {
        this.albumId = str;
        this.name = str2;
        this.path = str3;
        this.cover = photoItem;
        this.selected = z;
        this.images = arrayList;
    }

    public /* synthetic */ PhotoFolder(String str, String str2, String str3, PhotoItem photoItem, boolean z, ArrayList arrayList, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : photoItem, (i & 16) != 0 ? false : z, (i & 32) != 0 ? null : arrayList);
    }
}
