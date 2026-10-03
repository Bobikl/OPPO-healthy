package com.oplus.statistics.record;

import android.content.Context;
import androidx.annotation.NonNull;
import com.oplus.statistics.data.TrackEvent;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public interface IRecorder {
    void addTrackEvent(@NonNull Context context, @NonNull TrackEvent trackEvent);
}
