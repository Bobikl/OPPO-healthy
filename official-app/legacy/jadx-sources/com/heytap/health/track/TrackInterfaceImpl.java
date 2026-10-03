package com.heytap.health.track;

import com.heytap.health.base.text.GsonUtil;
import com.oplus.aiunit.vision.j5k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0012\u0010\u0006\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J&\u0010\n\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0016R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/heytap/health/track/TrackInterfaceImpl;", "Lcom/heytap/health/track/ITrackInterface$Stub;", "", "upload", "", "customClientId", "setCustomClientId", "eventGroup", "eventId", "data", "track", "TAG", "Ljava/lang/String;", "NEAR_TRACK_AIDL_API", "Lcom/oplus/aiunit/vision/j5k;", "trackApi", "Lcom/oplus/aiunit/vision/j5k;", "<init>", "()V", "lib_track_release"}, k = 1, mv = {1, 8, 0})
public final class TrackInterfaceImpl extends ITrackInterface.Stub {

    @NotNull
    public static final String NEAR_TRACK_AIDL_API = "near_track_aidl_api";

    @NotNull
    private static final String TAG = "TrackApiInterfaceImpl";

    @NotNull
    public static final TrackInterfaceImpl INSTANCE = new TrackInterfaceImpl();

    @NotNull
    private static final j5k trackApi = new j5k();

    private TrackInterfaceImpl() {
    }

    @Override // com.heytap.health.track.ITrackInterface
    public void setCustomClientId(@Nullable String customClientId) {
        StringBuilder sb = new StringBuilder();
        sb.append("Set custom client id=");
        sb.append(customClientId);
        trackApi.setCustomClientId(customClientId);
    }

    @Override // com.heytap.health.track.ITrackInterface
    public void track(@Nullable String eventGroup, @Nullable String eventId, @Nullable String data) {
        trackApi.track(eventGroup, eventId, GsonUtil.f(data));
    }

    @Override // com.heytap.health.track.ITrackInterface
    public void upload() {
        trackApi.j();
    }
}
