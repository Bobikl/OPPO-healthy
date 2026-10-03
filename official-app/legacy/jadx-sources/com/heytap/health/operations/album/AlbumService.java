package com.heytap.health.operations.album;

import com.alibaba.android.arouter.facade.template.IProvider;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&J\b\u0010\u0006\u001a\u00020\u0005H&J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H&¨\u0006\n"}, d2 = {"Lcom/heytap/health/operations/album/AlbumService;", "Lcom/alibaba/android/arouter/facade/template/IProvider;", "", "", "i7", "", "ba", "", "totalMaxSelectedPhotoLimit", "b5", "operations_release"}, k = 1, mv = {1, 8, 0})
public interface AlbumService extends IProvider {
    void b5(int totalMaxSelectedPhotoLimit);

    void ba();

    @NotNull
    List<String> i7();
}
