package com.oplus.aiunit.vision;

import android.content.Context;
import com.heytap.health.track.ITrackInterface;
import com.heytap.health.track.TrackInterfaceImpl;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\u000b"}, d2 = {"Lcom/oplus/aiunit/vision/k5k;", "Lcom/oplus/aiunit/vision/cm9;", "Lcom/heytap/health/track/ITrackInterface;", MapSchema.FIELD_NAME_ENTRY, "Landroid/content/Context;", "context", "", "c", "b", "<init>", "()V", "lib_track_release"}, k = 1, mv = {1, 8, 0})
public final class k5k implements cm9<ITrackInterface> {
    @Override // com.oplus.aiunit.vision.cm9
    public void b(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        a7b.f("TrackApiProvider", "TrackApiProvider onDestroy");
    }

    @Override // com.oplus.aiunit.vision.cm9
    public void c(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        a7b.f("TrackApiProvider", "TrackApiProvider onCreate");
    }

    @Override // com.oplus.aiunit.vision.cm9
    @NotNull
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public ITrackInterface d() {
        a7b.f("TrackApiProvider", "TrackApiProvider get service ");
        return TrackInterfaceImpl.INSTANCE;
    }
}
