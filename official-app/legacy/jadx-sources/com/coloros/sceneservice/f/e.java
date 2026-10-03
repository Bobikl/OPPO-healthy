package com.coloros.sceneservice.f;

import android.database.ContentObserver;
import android.os.Handler;

/* JADX INFO: loaded from: classes13.dex */
public class e extends ContentObserver {
    public final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, Handler handler) {
        super(handler);
        this.this$0 = fVar;
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z) {
        synchronized (this.this$0) {
            if (this.this$0.mHandler != null) {
                this.this$0.mHandler.removeMessages(100);
                this.this$0.mHandler.sendEmptyMessageDelayed(100, 1000L);
            }
        }
    }
}
