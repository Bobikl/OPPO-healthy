package com.google.android.play.core.listener;

import androidx.annotation.NonNull;
import com.oplus.oms.split.full.core.listener.OplusStateUpdatedListener;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public interface StateUpdatedListener<State> extends OplusStateUpdatedListener<State> {
    void onStateUpdate(@NonNull State state);
}
