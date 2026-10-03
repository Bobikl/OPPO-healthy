package com.heytap.health.health_archives.model;

import com.heytap.health.health_archives.bean.PhotoFolder;
import com.heytap.health.health_archives.bean.PhotoItem;
import com.oplus.aiunit.vision.b2n;
import io.protostuff.MapSchema;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.LazyThreadSafetyMode;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\b\u0006\u0018\u0000 \u001e2\u00020\u0001:\u0001\u0016B\t\b\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001e\u0010\u0007\u001a\u00020\u00062\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u0004J\u0016\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\bJ\u0014\u0010\u000f\u001a\u00020\u00062\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\nJ\u0016\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0011J\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\r0\nJ\u0006\u0010\u0015\u001a\u00020\u0006R*\u0010\u0018\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002j\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001`\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\r0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001a¨\u0006\u001f"}, d2 = {"Lcom/heytap/health/health_archives/model/AlbumDataRepository;", "", "Ljava/util/ArrayList;", "Lcom/heytap/health/health_archives/bean/PhotoFolder;", "Lkotlin/collections/ArrayList;", "photoFolders", "", "f", "", "albumPosition", "", "Lcom/heytap/health/health_archives/bean/PhotoItem;", "d", "", "selectedPhotos", b2n.f, "photoItem", "", "isAdd", "b", MapSchema.FIELD_NAME_ENTRY, "c", "a", "Ljava/util/ArrayList;", "mPhotoFolders", "", "Ljava/util/List;", "mSelectedPhotos", "<init>", "()V", "Companion", "health_archives_release"}, k = 1, mv = {1, 8, 0})
public final class AlbumDataRepository {

    @NotNull
    public static final String PREVIEW_ALBUM_POSITION = "preview_album_position";

    @NotNull
    public static final String PREVIEW_POSITION = "preview_position";
    public static final int PREVIEW_REQUEST_CODE = 1;
    public static final int PREVIEW_RESULT_BACK = 0;
    public static final int PREVIEW_RESULT_COMPLETE = 1;

    @NotNull
    public static final String PREVIEW_RESULT_TAG = "preview_result_tag";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public ArrayList<PhotoFolder> mPhotoFolders;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final List<String> mSelectedPhotos;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final Lazy<AlbumDataRepository> f4475c = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) new Function0<AlbumDataRepository>() { // from class: com.heytap.health.health_archives.model.AlbumDataRepository$Companion$instance$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final AlbumDataRepository invoke() {
            return new AlbumDataRepository(null);
        }
    });

    /* JADX INFO: renamed from: com.heytap.health.health_archives.model.AlbumDataRepository$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0007\u001a\u00020\u00028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\r\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/heytap/health/health_archives/model/AlbumDataRepository$a;", "", "Lcom/heytap/health/health_archives/model/AlbumDataRepository;", "instance$delegate", "Lkotlin/Lazy;", "a", "()Lcom/heytap/health/health_archives/model/AlbumDataRepository;", "instance", "", "PREVIEW_ALBUM_POSITION", "Ljava/lang/String;", "PREVIEW_POSITION", "", "PREVIEW_REQUEST_CODE", "I", "PREVIEW_RESULT_BACK", "PREVIEW_RESULT_COMPLETE", "PREVIEW_RESULT_TAG", "<init>", "()V", "health_archives_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final AlbumDataRepository a() {
            return (AlbumDataRepository) AlbumDataRepository.f4475c.getValue();
        }
    }

    public /* synthetic */ AlbumDataRepository(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final void b(@NotNull PhotoItem photoItem, boolean isAdd) {
        Intrinsics.checkNotNullParameter(photoItem, "photoItem");
        String path = photoItem.getPath();
        if (path == null) {
            return;
        }
        if (isAdd) {
            this.mSelectedPhotos.add(path);
        } else {
            this.mSelectedPhotos.remove(path);
        }
    }

    public final void c() {
        ArrayList<PhotoFolder> arrayList = this.mPhotoFolders;
        if (arrayList != null) {
            arrayList.clear();
        }
        this.mPhotoFolders = null;
        this.mSelectedPhotos.clear();
    }

    @Nullable
    public final List<PhotoItem> d(int albumPosition) {
        ArrayList<PhotoFolder> arrayList = this.mPhotoFolders;
        if (arrayList == null || arrayList.isEmpty()) {
            return null;
        }
        ArrayList<PhotoFolder> arrayList2 = this.mPhotoFolders;
        Intrinsics.checkNotNull(arrayList2);
        if (albumPosition >= arrayList2.size()) {
            return null;
        }
        ArrayList<PhotoFolder> arrayList3 = this.mPhotoFolders;
        Intrinsics.checkNotNull(arrayList3);
        return arrayList3.get(albumPosition).getImages();
    }

    @NotNull
    public final List<String> e() {
        return this.mSelectedPhotos;
    }

    public final void f(@NotNull ArrayList<PhotoFolder> photoFolders) {
        Intrinsics.checkNotNullParameter(photoFolders, "photoFolders");
        this.mPhotoFolders = photoFolders;
    }

    public final void g(@NotNull List<String> selectedPhotos) {
        Intrinsics.checkNotNullParameter(selectedPhotos, "selectedPhotos");
        this.mSelectedPhotos.clear();
        this.mSelectedPhotos.addAll(selectedPhotos);
    }

    public AlbumDataRepository() {
        this.mSelectedPhotos = new ArrayList();
    }
}
