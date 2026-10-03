package io.netty.incubator.codec.quic.track;

import android.content.Context;
import com.heytap.statistics.NearMeStatistics;
import com.heytap.statistics.event.CustomEvent;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J \u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lio/netty/incubator/codec/quic/track/V1TrackAdapter;", "Lio/netty/incubator/codec/quic/track/TrackAdapter;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "track", "", "appId", "", "categoryId", "", "eventId", "netty-quic_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
final class V1TrackAdapter extends TrackAdapter {

    @NotNull
    private final Context context;

    public V1TrackAdapter(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    @Override // io.netty.incubator.codec.quic.track.TrackAdapter
    public void track(int appId, @NotNull String categoryId, @NotNull String eventId) {
        Intrinsics.checkNotNullParameter(categoryId, "categoryId");
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        String string = new JSONObject(getData()).toString();
        Intrinsics.checkNotNullExpressionValue(string, "JSONObject(data as Map<*, *>).toString()");
        TrackAdapter.logger.info(Intrinsics.stringPlus("V1TrackAdapter.track ", TrackAdapterKt.jsonReplace1(string)));
        NearMeStatistics.onBaseEvent(this.context, appId, new CustomEvent(categoryId, eventId, getData()));
    }
}
