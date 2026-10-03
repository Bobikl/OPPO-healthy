package com.heytap.health.operation.notification.ui;

import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.heytap.health.base.base.BaseActivity;
import com.heytap.health.base.splitapk.connection.SplitBusiness;
import com.heytap.health.base.track.NxTrackHelper;
import com.heytap.health.operations.NotifyReportReceiver;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.and;
import com.oplus.aiunit.vision.mzj;
import com.oplus.smartenginehelper.entity.ClickApiEntity;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
@StabilityInferred(parameters = 0)
@Route(path = "/operation/NotifyDispatcherActivity")
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u0000 \f2\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002¨\u0006\u000e"}, d2 = {"Lcom/heytap/health/operation/notification/ui/NotifyDispatcherActivity;", "Lcom/heytap/health/base/base/BaseActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "l7", "", "classNames", "m7", "<init>", "()V", "Companion", "a", "operation_impl_release"}, k = 1, mv = {1, 8, 0})
public final class NotifyDispatcherActivity extends BaseActivity {
    public static final int $stable = 0;

    @NotNull
    public static final String EXTRA_SPLIT_ACTIVITY = "EXTRA_SPLIT_ACTIVITY";

    @NotNull
    public static final String EXTRA_SPLIT_BUSINESS = "EXTRA_SPLIT_BUSINESS";

    @Override // com.heytap.health.base.base.BaseActivity, com.heytap.health.base.base.BaseViewSizeControl
    public /* bridge */ /* synthetic */ void handleContentView(View view) {
        super.handleContentView(view);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x009c  */
    /* JADX WARN: Code duplicated, block: B:28:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:30:0x00a7  */
    public final void l7() {
        if (getIntent() == null) {
            finish();
            return;
        }
        String stringExtra = getIntent().getStringExtra(EXTRA_SPLIT_BUSINESS);
        String stringExtra2 = getIntent().getStringExtra(EXTRA_SPLIT_ACTIVITY);
        String stringExtra3 = getIntent().getStringExtra(NotifyReportReceiver.EXTRA_INTENT_CLASS);
        String stringExtra4 = getIntent().getStringExtra(NotifyReportReceiver.EXTRA_PUSH_TITLE);
        int intExtra = getIntent().getIntExtra("visitFrom", Integer.MIN_VALUE);
        a7b.f("NotifyReportReceiver", "report notify click");
        Map<String, Object> mapOf = NxTrackHelper.K(ClickApiEntity.TIME, mzj.d(System.currentTimeMillis()));
        Intrinsics.checkNotNullExpressionValue(mapOf, "mapOf");
        mapOf.put("elementid", stringExtra4);
        NxTrackHelper.T(mapOf);
        NxTrackHelper.Q(com.heytap.health.base.track.a.h("visitFrom", Integer.valueOf(intExtra)));
        if (stringExtra == null || stringExtra.length() == 0) {
            if (!(stringExtra3 != null || stringExtra3.length() == 0)) {
                m7(stringExtra3);
            }
        } else {
            if (stringExtra2 == null || stringExtra2.length() == 0) {
                if (!(stringExtra3 != null || stringExtra3.length() == 0)) {
                    m7(stringExtra3);
                }
            } else if (Intrinsics.areEqual(stringExtra, SplitBusiness.OPERATION.name())) {
                and.INSTANCE.A(this, stringExtra2);
            }
        }
        finish();
    }

    public final void m7(String classNames) {
        getIntent().setClassName(getPackageName(), classNames);
        getIntent().addFlags(268435456);
        startActivity(getIntent());
    }

    @Override // com.heytap.health.base.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        a7b.f("NotifyReportReceiver", "onCreate");
        try {
            l7();
        } catch (Exception e2) {
            a7b.b("NotifyReportReceiver", "error is " + e2);
            finish();
        }
    }
}
