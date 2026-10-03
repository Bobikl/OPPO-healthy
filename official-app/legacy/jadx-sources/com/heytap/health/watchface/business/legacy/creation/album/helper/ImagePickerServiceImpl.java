package com.heytap.health.watchface.business.legacy.creation.album.helper;

import android.content.Context;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.heytap.health.operations.album.AlbumService;
import com.heytap.health.watchface.business.legacy.creation.album.bean.ImageItem;
import com.oplus.aiunit.vision.h4a;
import com.oplus.aiunit.vision.z62;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.collections.CollectionsKt__IterablesKt;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes19.dex */
@Route(path = "/album/AlbumService")
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0012\u0010\f\u001a\u00020\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¨\u0006\u000f"}, d2 = {"Lcom/heytap/health/watchface/business/legacy/creation/album/helper/ImagePickerServiceImpl;", "Lcom/heytap/health/operations/album/AlbumService;", "", "", "i7", "", "ba", "", "totalMaxSelectedPhotoLimit", "b5", "Landroid/content/Context;", "context", "init", "<init>", "()V", "watchface_impl_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nImagePickerServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImagePickerServiceImpl.kt\ncom/heytap/health/watchface/business/legacy/creation/album/helper/ImagePickerServiceImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,25:1\n1549#2:26\n1620#2,3:27\n*S KotlinDebug\n*F\n+ 1 ImagePickerServiceImpl.kt\ncom/heytap/health/watchface/business/legacy/creation/album/helper/ImagePickerServiceImpl\n*L\n12#1:26\n12#1:27,3\n*E\n"})
public final class ImagePickerServiceImpl implements AlbumService {
    @Override // com.heytap.health.operations.album.AlbumService
    public void b5(int totalMaxSelectedPhotoLimit) {
        h4a.i().t(totalMaxSelectedPhotoLimit);
    }

    @Override // com.heytap.health.operations.album.AlbumService
    public void ba() {
        h4a.i().e();
    }

    @Override // com.heytap.health.operations.album.AlbumService
    @NotNull
    public List<String> i7() {
        List<ImageItem> listL = h4a.i().l();
        Intrinsics.checkNotNullExpressionValue(listL, "getInstance().selectedImages");
        List<ImageItem> list = listL;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(z62.RES_PREFIX + ((ImageItem) it.next()).mUriPath);
        }
        return arrayList;
    }

    @Override // com.alibaba.android.arouter.facade.template.IProvider
    public void init(@Nullable Context context) {
    }
}
