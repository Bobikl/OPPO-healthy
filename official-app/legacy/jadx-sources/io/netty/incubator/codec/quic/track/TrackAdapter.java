package io.netty.incubator.codec.quic.track;

import android.content.Context;
import com.heytap.nearx.track.NearxTrackHelper;
import com.heytap.statistics.NearMeStatistics;
import com.oplus.nearx.track.TrackApi;
import io.netty.incubator.codec.quic.track.statistics.StatisticCallback;
import io.netty.util.internal.logging.InternalLogger;
import io.netty.util.internal.logging.InternalLoggerFactory;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmField;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b&\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u0005J \u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0005H&R \u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lio/netty/incubator/codec/quic/track/TrackAdapter;", "", "()V", "data", "", "", "getData", "()Ljava/util/Map;", "add", "key", "value", "track", "", "appId", "", "categoryId", "eventId", "Companion", "netty-quic_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public abstract class TrackAdapter {

    @JvmField
    public static final boolean isDebug = false;

    @JvmField
    public static boolean isV3TrackInit;

    @NotNull
    private final Map<String, String> data = new LinkedHashMap();

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    public static final InternalLogger logger = InternalLoggerFactory.getInstance("TrackHelper");

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eJ\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\fH\u0002J\b\u0010\u0010\u001a\u00020\u0004H\u0002J\b\u0010\u0011\u001a\u00020\u0004H\u0002R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087D¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u0006\u001a\n \b*\u0004\u0018\u00010\u00070\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lio/netty/incubator/codec/quic/track/TrackAdapter$Companion;", "", "()V", "isDebug", "", "isV3TrackInit", "logger", "Lio/netty/util/internal/logging/InternalLogger;", "kotlin.jvm.PlatformType", "create", "Lio/netty/incubator/codec/quic/track/TrackAdapter;", "context", "Landroid/content/Context;", "caller", "Lio/netty/incubator/codec/quic/track/statistics/StatisticCallback;", "hasV1", "hasV2", "hasV3", "netty-quic_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final boolean hasV1(Context context) {
            try {
                return NearMeStatistics.isSwitchOn(context);
            } catch (Throwable unused) {
                return false;
            }
        }

        private final boolean hasV2() {
            try {
                return NearxTrackHelper.hasInit;
            } catch (Throwable unused) {
                return false;
            }
        }

        private final boolean hasV3() {
            try {
                TrackApi.INSTANCE.k();
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }

        @NotNull
        public final TrackAdapter create(@NotNull Context context, @Nullable StatisticCallback caller) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (caller != null) {
                return new CustomTrackAdapter(context, caller);
            }
            if (hasV3()) {
                return new V3TrackAdapter(context);
            }
            if (hasV2()) {
                return new V2TrackAdapter(context);
            }
            return hasV1(context) ? new V1TrackAdapter(context) : new NoneTrackAdapter();
        }
    }

    @NotNull
    public final TrackAdapter add(@NotNull String key, @Nullable String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (value != null) {
            getData().put(key, value);
        }
        return this;
    }

    @NotNull
    public final Map<String, String> getData() {
        return this.data;
    }

    public abstract void track(int appId, @NotNull String categoryId, @NotNull String eventId);
}
