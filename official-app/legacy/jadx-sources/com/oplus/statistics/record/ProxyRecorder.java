package com.oplus.statistics.record;

import android.content.Context;
import androidx.annotation.NonNull;
import com.oplus.statistics.data.TrackEvent;
import com.oplus.statistics.util.VersionUtil;

/* JADX INFO: loaded from: classes8.dex */
public class ProxyRecorder implements IRecorder {
    public IRecorder a;

    public static class SingletonHolder {
        public static ProxyRecorder a = new ProxyRecorder();
    }

    public ProxyRecorder() {
    }

    public static ProxyRecorder getInstance() {
        return SingletonHolder.a;
    }

    public final void a(Context context) {
        if (this.a != null) {
            return;
        }
        if (VersionUtil.isContentProviderRecorder(context)) {
            this.a = new ContentProviderRecorder();
        } else {
            this.a = new ServiceRecorder();
        }
    }

    @Override // com.oplus.statistics.record.IRecorder
    public void addTrackEvent(@NonNull Context context, @NonNull TrackEvent trackEvent) {
        a(context);
        this.a.addTrackEvent(context, trackEvent);
    }
}
