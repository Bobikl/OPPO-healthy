package com.heytap.health.watchface.business.mine;

import android.view.View;
import com.heytap.health.watchface.R$drawable;
import com.heytap.health.watchface.R$string;
import com.heytap.health.watchface.business.mine.base.BaseInstallStatusActivity;
import com.oplus.aiunit.vision.m41;
import com.oplus.aiunit.vision.usc;
import com.oplus.aiunit.vision.zl6;

/* JADX INFO: loaded from: classes19.dex */
public class NoCompatibleListActivity extends BaseInstallStatusActivity {
    public static final String TAG = "NoCompatibleListActivity";

    @Override // com.heytap.health.watchface.business.mine.base.BaseInstallItemActivity
    public zl6 D7() {
        return new zl6(R$drawable.watch_face_empty_no_face, R$string.watch_face_store_empty_buy);
    }

    @Override // com.heytap.health.watchface.business.mine.base.BaseInstallItemActivity
    public int F7() {
        return R$string.watch_face_my_buy;
    }

    @Override // com.heytap.health.watchface.business.mine.base.BaseInstallItemActivity
    public boolean K7() {
        return false;
    }

    @Override // com.heytap.health.watchface.business.mine.base.BaseInstallStatusActivity
    public boolean O7() {
        return true;
    }

    @Override // com.heytap.health.watchface.business.base.BaseWatchFaceActivity
    /* JADX INFO: renamed from: P7, reason: merged with bridge method [inline-methods] */
    public m41 s7() {
        return new usc();
    }

    @Override // com.heytap.health.watchface.business.mine.base.BaseInstallStatusActivity, com.heytap.health.watchface.business.mine.base.BaseInstallItemActivity, com.heytap.health.watchface.business.base.BaseWatchFaceStatusActivity, com.heytap.health.watchface.business.base.BaseDeviceInfoActivity, com.heytap.health.watchface.business.base.BaseWatchFaceActivity, com.heytap.health.base.base.BaseActivity, com.heytap.health.base.base.BaseViewSizeControl
    public /* bridge */ /* synthetic */ void handleContentView(View view) {
        super.handleContentView(view);
    }

    @Override // com.heytap.health.watchface.business.base.BaseWatchFaceActivity
    public boolean n7() {
        return true;
    }

    @Override // com.heytap.health.watchface.business.base.BaseWatchFaceActivity
    public boolean v7() {
        return false;
    }
}
