package com.heytap.health.watchface.business.creation.category.flexible.bean;

import androidx.annotation.Keep;
import com.heytap.health.watchface.business.base.BaseFlexiblePresenter;
import com.heytap.health.watchface.business.legacy.creation.album.bean.ImageItem;
import com.heytap.health.watchface.utils.DeepCloneUtils;
import com.oplus.aiunit.vision.b78;
import com.oplus.aiunit.vision.mr7;
import com.oplus.aiunit.vision.xv;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.collections.CollectionsKt___CollectionsKt;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Keep
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010!\n\u0002\b\u000b\b\u0007\u0018\u0000 A2\u00020\u0001:\u0001BB\u0007¢\u0006\u0004\b?\u0010@J\u000e\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0000J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0096\u0002J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016R\"\u0010\r\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u0013\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001c\u001a\u00020\u00078FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u0016R2\u0010 \u001a\u0012\u0012\u0004\u0012\u00020\u001e0\u001dj\b\u0012\u0004\u0012\u00020\u001e`\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R2\u0010&\u001a\u0012\u0012\u0004\u0012\u00020\u001e0\u001dj\b\u0012\u0004\u0012\u00020\u001e`\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010!\u001a\u0004\b'\u0010#\"\u0004\b(\u0010%R\"\u0010)\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010\u000e\u001a\u0004\b*\u0010\u0010\"\u0004\b+\u0010\u0012R\"\u0010,\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\"\u00102\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u0010-\u001a\u0004\b3\u0010/\"\u0004\b4\u00101R\"\u00105\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u0010-\u001a\u0004\b6\u0010/\"\u0004\b7\u00101R(\u00109\u001a\b\u0012\u0004\u0012\u00020\t088\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>¨\u0006C"}, d2 = {"Lcom/heytap/health/watchface/business/creation/category/flexible/bean/AlbumPhotoBean;", "Lcom/oplus/aiunit/vision/mr7;", "bean", "", "copyFrom", "", "other", "", "equals", "", "toString", "", "hashCode", "source", "I", "getSource", "()I", "setSource", "(I)V", "deviceSupportMemory", "Z", "getDeviceSupportMemory", "()Z", "setDeviceSupportMemory", "(Z)V", "phoneSupportMemory$delegate", "Lkotlin/Lazy;", "getPhoneSupportMemory", "phoneSupportMemory", "Ljava/util/ArrayList;", "Lcom/heytap/health/watchface/business/legacy/creation/album/bean/ImageItem;", "Lkotlin/collections/ArrayList;", "photos", "Ljava/util/ArrayList;", "getPhotos", "()Ljava/util/ArrayList;", "setPhotos", "(Ljava/util/ArrayList;)V", "caches", "getCaches", "setCaches", "maxCount", "getMaxCount", "setMaxCount", "coverPath", "Ljava/lang/String;", "getCoverPath", "()Ljava/lang/String;", "setCoverPath", "(Ljava/lang/String;)V", "name", "getName", "setName", "date", "getDate", "setDate", "", "allResource", "Ljava/util/List;", "getAllResource", "()Ljava/util/List;", "setAllResource", "(Ljava/util/List;)V", "<init>", "()V", "Companion", "a", "watchface_impl_release"}, k = 1, mv = {1, 8, 0})
public final class AlbumPhotoBean extends mr7 {
    public static final int SOURCE_LIVEPHOTO = 2;
    public static final int SOURCE_MEMORY = 1;
    public static final int SOURCE_PHOTOS = 0;

    @NotNull
    private List<String> allResource;

    @NotNull
    private transient ArrayList<ImageItem> caches;

    @NotNull
    private String coverPath;

    @NotNull
    private String date;
    private boolean deviceSupportMemory;
    private int maxCount;

    @NotNull
    private String name;

    /* JADX INFO: renamed from: phoneSupportMemory$delegate, reason: from kotlin metadata */
    @NotNull
    private final transient Lazy phoneSupportMemory;

    @NotNull
    private ArrayList<ImageItem> photos;
    private int source;

    public AlbumPhotoBean() {
        super(BaseFlexiblePresenter.TAG_ALBUM_PHOTOS);
        this.deviceSupportMemory = true;
        this.phoneSupportMemory = LazyKt__LazyJVMKt.lazy(new Function0<Boolean>() { // from class: com.heytap.health.watchface.business.creation.category.flexible.bean.AlbumPhotoBean$phoneSupportMemory$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p010kotlin.jvm.functions.Function0
            @NotNull
            public final Boolean invoke() {
                return Boolean.valueOf(xv.f(b78.a()) != null);
            }
        });
        this.photos = new ArrayList<>();
        this.caches = new ArrayList<>();
        this.maxCount = -1;
        this.coverPath = "";
        this.name = "";
        this.date = "";
        this.allResource = new ArrayList();
    }

    public final void copyFrom(@NotNull AlbumPhotoBean bean) {
        Intrinsics.checkNotNullParameter(bean, "bean");
        this.source = bean.source;
        ArrayList<ImageItem> arrayListB = DeepCloneUtils.b(bean.photos, ImageItem.class);
        Intrinsics.checkNotNullExpressionValue(arrayListB, "deepCopyList(bean.photos, ImageItem::class.java)");
        this.photos = arrayListB;
        this.coverPath = bean.coverPath;
        this.name = bean.name;
        this.date = bean.date;
        this.allResource = CollectionsKt___CollectionsKt.toMutableList((Collection) bean.allResource);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(AlbumPhotoBean.class, other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(other, "null cannot be cast to non-null type com.heytap.health.watchface.business.creation.category.flexible.bean.AlbumPhotoBean");
        AlbumPhotoBean albumPhotoBean = (AlbumPhotoBean) other;
        return this.source == albumPhotoBean.source && Intrinsics.areEqual(this.photos, albumPhotoBean.photos) && Intrinsics.areEqual(this.coverPath, albumPhotoBean.coverPath) && Intrinsics.areEqual(this.name, albumPhotoBean.name) && Intrinsics.areEqual(this.date, albumPhotoBean.date) && Intrinsics.areEqual(this.allResource, albumPhotoBean.allResource);
    }

    @NotNull
    public final List<String> getAllResource() {
        return this.allResource;
    }

    @NotNull
    public final ArrayList<ImageItem> getCaches() {
        return this.caches;
    }

    @NotNull
    public final String getCoverPath() {
        return this.coverPath;
    }

    @NotNull
    public final String getDate() {
        return this.date;
    }

    public final boolean getDeviceSupportMemory() {
        return this.deviceSupportMemory;
    }

    public final int getMaxCount() {
        return this.maxCount;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final boolean getPhoneSupportMemory() {
        return ((Boolean) this.phoneSupportMemory.getValue()).booleanValue();
    }

    @NotNull
    public final ArrayList<ImageItem> getPhotos() {
        return this.photos;
    }

    public final int getSource() {
        return this.source;
    }

    public int hashCode() {
        return (((((((((this.source * 31) + this.photos.hashCode()) * 31) + this.coverPath.hashCode()) * 31) + this.name.hashCode()) * 31) + this.date.hashCode()) * 31) + this.allResource.hashCode();
    }

    public final void setAllResource(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.allResource = list;
    }

    public final void setCaches(@NotNull ArrayList<ImageItem> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.caches = arrayList;
    }

    public final void setCoverPath(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.coverPath = str;
    }

    public final void setDate(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.date = str;
    }

    public final void setDeviceSupportMemory(boolean z) {
        this.deviceSupportMemory = z;
    }

    public final void setMaxCount(int i) {
        this.maxCount = i;
    }

    public final void setName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.name = str;
    }

    public final void setPhotos(@NotNull ArrayList<ImageItem> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.photos = arrayList;
    }

    public final void setSource(int i) {
        this.source = i;
    }

    @NotNull
    public String toString() {
        return "AlbumPhotoBean(source=" + this.source + ", photos=" + this.photos + ", allResource=" + this.allResource + ")";
    }
}
