package com.heytap.health.videosdk;

import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/heytap/health/videosdk/Step;", "", "()V", "PauseStep", "PlayStep", "UnknownStep", "Lcom/heytap/health/videosdk/Step$PauseStep;", "Lcom/heytap/health/videosdk/Step$PlayStep;", "Lcom/heytap/health/videosdk/Step$UnknownStep;", "sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public abstract class Step {

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lcom/heytap/health/videosdk/Step$PauseStep;", "Lcom/heytap/health/videosdk/Step;", "()V", "toString", "", "sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class PauseStep extends Step {

        @NotNull
        public static final PauseStep INSTANCE = new PauseStep();

        private PauseStep() {
            super(null);
        }

        @NotNull
        public String toString() {
            return "PauseStep";
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lcom/heytap/health/videosdk/Step$PlayStep;", "Lcom/heytap/health/videosdk/Step;", "()V", "toString", "", "sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class PlayStep extends Step {

        @NotNull
        public static final PlayStep INSTANCE = new PlayStep();

        private PlayStep() {
            super(null);
        }

        @NotNull
        public String toString() {
            return "PlayStep";
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lcom/heytap/health/videosdk/Step$UnknownStep;", "Lcom/heytap/health/videosdk/Step;", "()V", "toString", "", "sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class UnknownStep extends Step {

        @NotNull
        public static final UnknownStep INSTANCE = new UnknownStep();

        private UnknownStep() {
            super(null);
        }

        @NotNull
        public String toString() {
            return "UnknownStep";
        }
    }

    private Step() {
    }

    public /* synthetic */ Step(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
