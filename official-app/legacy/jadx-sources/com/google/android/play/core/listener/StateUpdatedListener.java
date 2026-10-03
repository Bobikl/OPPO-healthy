package com.google.android.play.core.listener;

import androidx.annotation.NonNull;
import com.oplus.oms.split.full.core.listener.OplusStateUpdatedListener;

/* JADX INFO: loaded from: classes14.dex */
public interface StateUpdatedListener<State> extends OplusStateUpdatedListener<State> {
    @Override // com.oplus.oms.split.full.core.listener.OplusStateUpdatedListener
    void onStateUpdate(@NonNull State state);
}
