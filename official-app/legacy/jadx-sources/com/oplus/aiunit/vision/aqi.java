package com.oplus.aiunit.vision;

import android.net.Uri;
import android.text.TextUtils;
import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.health.device_data_sync.data_sync.IDataSyncService;
import com.oplus.smartenginehelper.ParserTag;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\f\u0010\rJ\u0006\u0010\u0003\u001a\u00020\u0002R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000f"}, d2 = {"Lcom/oplus/aiunit/vision/aqi;", "", "", "d", "Lcom/heytap/health/device_data_sync/data_sync/IDataSyncService;", "a", "Lcom/heytap/health/device_data_sync/data_sync/IDataSyncService;", "dataSyncService", "", "b", "J", "lastWatchDataUpdateTime", "<init>", "()V", "Companion", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
public final class aqi {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public IDataSyncService dataSyncService;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public long lastWatchDataUpdateTime;
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, d2 = {"com/oplus/aiunit/vision/aqi$b", "Lcom/oplus/aiunit/vision/s2f$a;", "Landroid/net/Uri;", ParserTag.TAG_URI, "", "b", "a", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class b implements s2f.a {
        public b() {
        }

        @Override // com.oplus.aiunit.vision.s2f.a
        public void a(@NotNull Uri uri) {
            Intrinsics.checkNotNullParameter(uri, "uri");
        }

        @Override // com.oplus.aiunit.vision.s2f.a
        public void b(@NotNull Uri uri) {
            Intrinsics.checkNotNullParameter(uri, "uri");
            a7b.f("StepCloudSyncTrigger", "step provider onRead");
            if (TimeUnit.MILLISECONDS.toMinutes(System.currentTimeMillis() - aqi.this.lastWatchDataUpdateTime) <= 5 || TextUtils.isEmpty(uri.getPath())) {
                return;
            }
            String path = uri.getPath();
            Intrinsics.checkNotNull(path);
            if (StringsKt__StringsKt.contains$default((CharSequence) path, (CharSequence) "assistantScreen/sport", false, 2, (Object) null)) {
                aqi.this.lastWatchDataUpdateTime = System.currentTimeMillis();
                a7b.f("StepCloudSyncTrigger", "Sync data by types by step manager");
                IDataSyncService iDataSyncService = aqi.this.dataSyncService;
                if (iDataSyncService != null) {
                    iDataSyncService.x3(8);
                }
            }
        }
    }

    public final void d() {
        this.dataSyncService = (IDataSyncService) x0.d().h(IDataSyncService.class);
        s2f.a().addOnCallingListener(new b());
    }
}
