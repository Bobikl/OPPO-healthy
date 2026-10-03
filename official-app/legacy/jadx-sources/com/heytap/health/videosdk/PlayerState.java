package com.heytap.health.videosdk;

import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00072\u00020\u0001:\u0006\u0007\b\t\n\u000b\fB\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0005\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/heytap/health/videosdk/PlayerState;", "", "state", "", "(I)V", "getState", "()I", "Companion", "Pause", "Playing", "Prepare", "Stop", "Unknown", "Lcom/heytap/health/videosdk/PlayerState$Pause;", "Lcom/heytap/health/videosdk/PlayerState$Playing;", "Lcom/heytap/health/videosdk/PlayerState$Prepare;", "Lcom/heytap/health/videosdk/PlayerState$Stop;", "Lcom/heytap/health/videosdk/PlayerState$Unknown;", "sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public abstract class PlayerState {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final int state;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/heytap/health/videosdk/PlayerState$Companion;", "", "()V", "fromState", "Lcom/heytap/health/videosdk/PlayerState;", "state", "", "sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final PlayerState fromState(int state) {
            Prepare prepare = Prepare.INSTANCE;
            if (state == prepare.getState()) {
                return prepare;
            }
            Playing playing = Playing.INSTANCE;
            if (state == playing.getState()) {
                return playing;
            }
            Pause pause = Pause.INSTANCE;
            if (state == pause.getState()) {
                return pause;
            }
            Stop stop = Stop.INSTANCE;
            return state == stop.getState() ? stop : Unknown.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lcom/heytap/health/videosdk/PlayerState$Pause;", "Lcom/heytap/health/videosdk/PlayerState;", "()V", "toString", "", "sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Pause extends PlayerState {

        @NotNull
        public static final Pause INSTANCE = new Pause();

        private Pause() {
            super(4, null);
        }

        @NotNull
        public String toString() {
            return "Pause";
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lcom/heytap/health/videosdk/PlayerState$Playing;", "Lcom/heytap/health/videosdk/PlayerState;", "()V", "toString", "", "sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Playing extends PlayerState {

        @NotNull
        public static final Playing INSTANCE = new Playing();

        private Playing() {
            super(3, null);
        }

        @NotNull
        public String toString() {
            return "Playing";
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lcom/heytap/health/videosdk/PlayerState$Prepare;", "Lcom/heytap/health/videosdk/PlayerState;", "()V", "toString", "", "sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Prepare extends PlayerState {

        @NotNull
        public static final Prepare INSTANCE = new Prepare();

        private Prepare() {
            super(1, null);
        }

        @NotNull
        public String toString() {
            return "Prepare";
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lcom/heytap/health/videosdk/PlayerState$Stop;", "Lcom/heytap/health/videosdk/PlayerState;", "()V", "toString", "", "sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Stop extends PlayerState {

        @NotNull
        public static final Stop INSTANCE = new Stop();

        private Stop() {
            super(6, null);
        }

        @NotNull
        public String toString() {
            return "Stop";
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lcom/heytap/health/videosdk/PlayerState$Unknown;", "Lcom/heytap/health/videosdk/PlayerState;", "()V", "toString", "", "sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Unknown extends PlayerState {

        @NotNull
        public static final Unknown INSTANCE = new Unknown();

        private Unknown() {
            super(0, null);
        }

        @NotNull
        public String toString() {
            return "Unknown";
        }
    }

    public /* synthetic */ PlayerState(int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(i);
    }

    public final int getState() {
        return this.state;
    }

    private PlayerState(int i) {
        this.state = i;
    }
}
