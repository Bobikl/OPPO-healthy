package com.oplus.web.container.webview.core;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.lifecycle.ViewModelProvider;
import com.oplus.aiunit.vision.dri;
import com.oplus.aiunit.vision.yg1;
import com.oplus.web.container.webview.viewmodel.WebContainerModel;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class WebContainerActivity extends AbstractWebExtActivity {
    public void g7() {
        super.onBackPressed();
    }

    @Override // com.oplus.web.container.webview.core.AbstractWebExtActivity
    public void onBackPressed() {
        dri.h(yg1.h());
        ((WebContainerModel) new ViewModelProvider(this).get(WebContainerModel.class)).i.setValue(Boolean.TRUE);
    }

    @Override // com.oplus.web.container.webview.core.AbstractWebExtActivity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        dri.h(yg1.i());
    }

    public void onDestroy() {
        super.onDestroy();
        dri.h(yg1.j());
    }
}
