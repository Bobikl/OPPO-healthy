package com.heytap.health.operation.store;

import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.health.base.base.BaseActivity;
import com.heytap.health.operation.R$layout;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.g3k;
import com.oplus.aiunit.vision.s3k;
import com.oplus.aiunit.vision.t3h;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes17.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0014¨\u0006\t"}, d2 = {"Lcom/heytap/health/operation/store/StoreTouristPolicyActivity;", "Lcom/heytap/health/base/base/BaseActivity;", "Lcom/oplus/aiunit/vision/s3k;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "<init>", "()V", "operation_impl_release"}, k = 1, mv = {1, 8, 0})
public final class StoreTouristPolicyActivity extends BaseActivity implements s3k {
    public static final int $stable = 0;

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016¨\u0006\u0005"}, d2 = {"com/heytap/health/operation/store/StoreTouristPolicyActivity$a", "Lcom/oplus/aiunit/vision/t3h;", "", b2n.f, "f", "operation_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class a extends t3h {
        public a() {
        }

        @Override // com.oplus.aiunit.vision.t3h
        public void f() {
            g3k.removeClickProtoListener(this);
            StoreTouristPolicyActivity.this.finish();
        }

        @Override // com.oplus.aiunit.vision.t3h
        public void g() {
            g3k.removeClickProtoListener(this);
            StoreTouristPolicyActivity.this.finish();
        }
    }

    @Override // com.heytap.health.base.base.BaseActivity, com.heytap.health.base.base.BaseViewSizeControl
    public /* bridge */ /* synthetic */ void handleContentView(View view) {
        super.handleContentView(view);
    }

    @Override // com.heytap.health.base.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R$layout.operation_activity_store_tourist_policy);
        if (g3k.j()) {
            g3k.addClickProtoListener(new a());
        } else {
            finish();
        }
    }
}
