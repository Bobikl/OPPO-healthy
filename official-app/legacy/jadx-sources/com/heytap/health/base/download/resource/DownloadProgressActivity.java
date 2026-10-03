package com.heytap.health.base.download.resource;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.coui.appcompat.toolbar.COUIToolbar;
import com.heytap.health.base.R$id;
import com.heytap.health.base.R$layout;
import com.heytap.health.base.base.BaseActivity;
import com.heytap.health.base.view.exceptionview.DevicePageLayout;
import com.heytap.health.base.view.exceptionview.DevicePageType;
import com.oplus.aiunit.vision.e36;
import com.oplus.aiunit.vision.j36;
import com.oplus.aiunit.vision.rpc;
import com.oplus.aiunit.vision.vda;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public class DownloadProgressActivity extends BaseActivity implements j36 {
    public DevicePageLayout m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ProgressBar f3166n;
    public TextView o;
    public TextView p;
    public String q;
    public String r;

    @Override // com.oplus.aiunit.vision.j36
    public void P2(float f) {
        StringBuilder sb = new StringBuilder();
        sb.append("onProgressChange ");
        sb.append(f);
        int i = (int) f;
        this.f3166n.setProgress(i);
        this.o.setText(String.format("%s%%", Integer.valueOf(i)));
    }

    @Override // com.heytap.health.base.base.BaseActivity, com.heytap.health.base.base.BaseViewSizeControl
    public /* bridge */ /* synthetic */ void handleContentView(View view) {
        super.handleContentView(view);
    }

    @Override // com.heytap.health.base.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        Serializable serializableI = vda.i(getIntent(), "extra_download_config");
        if (serializableI instanceof DownloadConfig) {
            DownloadConfig downloadConfig = (DownloadConfig) serializableI;
            this.q = downloadConfig.getDownloadTip();
            this.r = downloadConfig.getUniqueKey();
        }
        super.onCreate(bundle);
        setContentView(R$layout.lib_base_activity_download_resource);
        R1(this, (COUIToolbar) findViewById(R$id.toolbar), true);
        this.m = (DevicePageLayout) findViewById(R$id.device_page_layout);
        this.f3166n = (ProgressBar) findViewById(R$id.progress_bar);
        this.o = (TextView) findViewById(R$id.tv_progress);
        this.p = (TextView) findViewById(R$id.tv_loading_tip);
        if (rpc.c()) {
            this.m.setCurrentPageType(DevicePageType.NORMAL);
        } else {
            this.m.setCurrentPageType(DevicePageType.NETWORK_ERROR);
        }
        if (!TextUtils.isEmpty(this.q)) {
            this.p.setText(this.q);
        }
        this.m.findViewById(R$id.cb_retry).setVisibility(8);
        e36.g().j(new Pair<>(this.r, this));
        setTitle("");
    }

    @Override // com.heytap.health.base.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        e36.g().i(this.r);
        e36.g().j(null);
    }

    @Override // com.oplus.aiunit.vision.j36
    public void onFail(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("onFail ");
        sb.append(str);
        this.m.setCurrentPageType(DevicePageType.NETWORK_ERROR);
        this.m.findViewById(R$id.cb_retry).setVisibility(8);
    }

    @Override // com.oplus.aiunit.vision.j36
    public void y3(List<ResourceBean> list, boolean z) {
        finish();
    }
}
