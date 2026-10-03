package com.heytap.health.watchface.business.creation.predownload.base;

import android.os.Bundle;
import android.view.View;
import com.heytap.health.base.download.resource.DownloadProgressActivity;
import com.heytap.health.watchface.R$color;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0014¨\u0006\u0007"}, d2 = {"Lcom/heytap/health/watchface/business/creation/predownload/base/WfDownloadProcessActivity;", "Lcom/heytap/health/base/download/resource/DownloadProgressActivity;", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "watchface_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class WfDownloadProcessActivity extends DownloadProgressActivity {
    @Override // com.heytap.health.base.download.resource.DownloadProgressActivity, com.heytap.health.base.base.BaseActivity, com.heytap.health.base.base.BaseViewSizeControl
    public /* bridge */ /* synthetic */ void handleContentView(View view) {
        super.handleContentView(view);
    }

    @Override // com.heytap.health.base.download.resource.DownloadProgressActivity, com.heytap.health.base.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.o.setTextColor(getColor(R$color.watch_face_base_white));
        this.p.setTextColor(getColor(R$color.watch_face_black_D8));
    }
}
