package com.heytap.health.watchface.business.creation.category.album;

import android.view.View;
import com.heytap.health.watchface.business.creation.category.album.base.BaseAlbumPreviewActivity;
import com.heytap.health.watchface.business.legacy.creation.album.bean.ImageItem;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class AlbumPreviewAllActivity extends BaseAlbumPreviewActivity {
    @Override // com.heytap.health.watchface.business.creation.category.album.base.BaseAlbumPreviewActivity, com.heytap.health.watchface.business.base.BaseDeviceInfoActivity, com.heytap.health.watchface.business.base.BaseWatchFaceActivity, com.heytap.health.base.base.BaseActivity, com.heytap.health.base.base.BaseViewSizeControl
    public /* bridge */ /* synthetic */ void handleContentView(View view) {
        super.handleContentView(view);
    }

    @Override // com.heytap.health.watchface.business.base.BaseWatchFaceActivity
    public boolean v7() {
        return false;
    }

    @Override // com.heytap.health.watchface.business.creation.category.album.base.BaseAlbumPreviewActivity
    public List<ImageItem> w7() {
        return this.A.g();
    }

    @Override // com.heytap.health.watchface.business.creation.category.album.base.BaseAlbumPreviewActivity
    public void y7(boolean z, ImageItem imageItem) {
        if (!z) {
            this.C.remove(imageItem);
            return;
        }
        imageItem.mIsGray = false;
        this.C.add(imageItem);
        int iIndexOf = this.A.l().indexOf(imageItem);
        if (iIndexOf == -1) {
            this.x.g(null);
        } else {
            this.v.scrollToPosition(iIndexOf);
            this.x.g(imageItem);
        }
    }
}
