package com.heytap.health.watchface.business.legacy.creation.album;

import android.view.View;
import com.heytap.health.watchface.business.legacy.creation.album.bean.ImageItem;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class AlbumPhotoPreviewSelectedActivity extends BaseAlbumPhotoPreviewActivity {
    @Override // com.heytap.health.watchface.business.legacy.creation.album.BaseAlbumPhotoPreviewActivity, com.heytap.health.watchface.business.base.BaseWatchFaceActivity, com.heytap.health.base.base.BaseActivity, com.heytap.health.base.base.BaseViewSizeControl
    public /* bridge */ /* synthetic */ void handleContentView(View view) {
        super.handleContentView(view);
    }

    @Override // com.heytap.health.watchface.business.legacy.creation.album.BaseAlbumPhotoPreviewActivity
    public List<ImageItem> w7() {
        return this.z.l();
    }

    @Override // com.heytap.health.watchface.business.legacy.creation.album.BaseAlbumPhotoPreviewActivity
    public void y7(boolean z, ImageItem imageItem) {
        imageItem.mIsGray = !z;
    }
}
