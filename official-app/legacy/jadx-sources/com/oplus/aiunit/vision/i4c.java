package com.oplus.aiunit.vision;

import android.os.Bundle;
import com.heytap.health.watch.notification.impl.breeno.data.MovieData;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\b"}, d2 = {"Lcom/oplus/aiunit/vision/i4c;", "Lcom/oplus/aiunit/vision/j01;", "Landroid/os/Bundle;", "bundle", "", "d", "<init>", "()V", "device_notification_impl2_release"}, k = 1, mv = {1, 8, 0})
public final class i4c extends j01 {
    @Override // com.oplus.aiunit.vision.j01
    public void d(@Nullable Bundle bundle) {
        p62.b(o62.SERVICE_ID_MOVIE_MUTE, new MovieData(bundle));
    }
}
