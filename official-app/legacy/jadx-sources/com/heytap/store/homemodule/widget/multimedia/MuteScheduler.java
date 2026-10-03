package com.heytap.store.homemodule.widget.multimedia;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u0000 \n2\u00020\u0001:\u0002\n\u000bB\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004J\u000e\u0010\t\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/heytap/store/homemodule/widget/multimedia/MuteScheduler;", "", "()V", "soundFocus", "Lcom/heytap/store/homemodule/widget/multimedia/MultimediaView;", "clear", "", "equalAndClearSoundFocus", "multimediaView", "setCurrentSoundFocus", "Companion", "Holder", "com.heytap.store.business.home-impl"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class MuteScheduler {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final MuteScheduler instances = Holder.INSTANCE.getMuteScheduler();

    @Nullable
    private MultimediaView soundFocus;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/heytap/store/homemodule/widget/multimedia/MuteScheduler$Companion;", "", "()V", "instances", "Lcom/heytap/store/homemodule/widget/multimedia/MuteScheduler;", "getInstances", "()Lcom/heytap/store/homemodule/widget/multimedia/MuteScheduler;", "com.heytap.store.business.home-impl"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final MuteScheduler getInstances() {
            return MuteScheduler.instances;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/heytap/store/homemodule/widget/multimedia/MuteScheduler$Holder;", "", "()V", "MuteScheduler", "Lcom/heytap/store/homemodule/widget/multimedia/MuteScheduler;", "getMuteScheduler", "()Lcom/heytap/store/homemodule/widget/multimedia/MuteScheduler;", "com.heytap.store.business.home-impl"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Holder {

        @NotNull
        public static final Holder INSTANCE = new Holder();

        @NotNull
        private static final MuteScheduler MuteScheduler = new MuteScheduler();

        private Holder() {
        }

        @NotNull
        public final MuteScheduler getMuteScheduler() {
            return MuteScheduler;
        }
    }

    public final void clear() {
        this.soundFocus = null;
    }

    public final void equalAndClearSoundFocus(@NotNull MultimediaView multimediaView) {
        Intrinsics.checkNotNullParameter(multimediaView, "multimediaView");
        MultimediaView multimediaView2 = this.soundFocus;
        if (multimediaView2 != null && Intrinsics.areEqual(multimediaView2, multimediaView)) {
            this.soundFocus = null;
        }
    }

    public final void setCurrentSoundFocus(@NotNull MultimediaView multimediaView) {
        Intrinsics.checkNotNullParameter(multimediaView, "multimediaView");
        MultimediaView multimediaView2 = this.soundFocus;
        if (multimediaView2 != null && !Intrinsics.areEqual(multimediaView2, multimediaView)) {
            multimediaView2.setVideoMute(true);
        }
        this.soundFocus = multimediaView;
    }
}
