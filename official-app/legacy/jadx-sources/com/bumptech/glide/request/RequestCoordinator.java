package com.bumptech.glide.request;

import com.oplus.aiunit.vision.dqf;

/* JADX INFO: loaded from: classes13.dex */
public interface RequestCoordinator {

    public enum RequestState {
        RUNNING(false),
        PAUSED(false),
        CLEARED(false),
        SUCCESS(true),
        FAILED(true);

        private final boolean isComplete;

        RequestState(boolean z) {
            this.isComplete = z;
        }

        public boolean isComplete() {
            return this.isComplete;
        }
    }

    boolean a();

    boolean b(dqf dqfVar);

    void c(dqf dqfVar);

    boolean d(dqf dqfVar);

    boolean g(dqf dqfVar);

    RequestCoordinator getRoot();

    void h(dqf dqfVar);
}
