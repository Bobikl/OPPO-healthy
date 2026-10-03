package com.heytap.health.watchface.business.creation.category.video.base;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.heytap.health.base.base.BaseActivity;
import com.heytap.health.watch.watchface.proto.Proto$DeviceInfo;
import com.heytap.health.watchface.business.base.BaseDeviceInfoActivity;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.ltl;
import com.oplus.aiunit.vision.vc;
import com.oplus.aiunit.vision.vda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\"\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R$\u0010\u0013\u001a\u0004\u0018\u00010\f8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lcom/heytap/health/watchface/business/creation/category/video/base/BaseVideoActivity;", "Lcom/heytap/health/base/base/BaseActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "Landroid/content/Intent;", "intent", "", vc.KEY_REQUEST_CODE, "options", "startActivityForResult", "Lcom/heytap/health/watch/watchface/proto/Proto$DeviceInfo;", LogFieldKey.MESSAGE_KEY, "Lcom/heytap/health/watch/watchface/proto/Proto$DeviceInfo;", "l7", "()Lcom/heytap/health/watch/watchface/proto/Proto$DeviceInfo;", "setMDeviceInfo", "(Lcom/heytap/health/watch/watchface/proto/Proto$DeviceInfo;)V", "mDeviceInfo", "<init>", "()V", "watchface_impl_release"}, k = 1, mv = {1, 8, 0})
public class BaseVideoActivity extends BaseActivity {

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    public Proto$DeviceInfo mDeviceInfo;

    @Override // com.heytap.health.base.base.BaseActivity, com.heytap.health.base.base.BaseViewSizeControl
    public /* bridge */ /* synthetic */ void handleContentView(View view) {
        super.handleContentView(view);
    }

    @Nullable
    /* JADX INFO: renamed from: l7, reason: from getter */
    public final Proto$DeviceInfo getMDeviceInfo() {
        return this.mDeviceInfo;
    }

    @Override // com.heytap.health.base.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try {
            this.mDeviceInfo = Proto$DeviceInfo.parseFrom(vda.c(getIntent(), BaseDeviceInfoActivity.BUNDLE_DEVICE_INFO));
        } catch (Exception e2) {
            ltl.i(getClass().getSimpleName(), "[onCreate]  InvalidProtocolBufferException " + e2.getMessage());
        }
        if (this.mDeviceInfo == null) {
            finish();
        }
    }

    @Override // com.heytap.health.base.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void startActivityForResult(@NotNull Intent intent, int requestCode, @Nullable Bundle options) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        ltl.a(getClass().getSimpleName(), "startActivityForResult intent " + intent);
        Proto$DeviceInfo proto$DeviceInfo = this.mDeviceInfo;
        if (proto$DeviceInfo != null) {
            Intrinsics.checkNotNull(proto$DeviceInfo);
            intent.putExtra(BaseDeviceInfoActivity.BUNDLE_DEVICE_INFO, proto$DeviceInfo.toByteArray());
        }
        super.startActivityForResult(intent, requestCode, options);
    }
}
