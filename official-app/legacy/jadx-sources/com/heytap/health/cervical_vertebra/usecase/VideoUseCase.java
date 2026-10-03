package com.heytap.health.cervical_vertebra.usecase;

import android.net.Uri;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import com.heytap.sporthealth.fit.weiget.PlayerView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u0006\u0010\t\u001a\u00020\u0004J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/heytap/health/cervical_vertebra/usecase/VideoUseCase;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Lcom/heytap/sporthealth/fit/weiget/PlayerView;", "player", "", "c", "", "path", "b", "a", "Landroidx/lifecycle/LifecycleOwner;", "owner", "onPause", "onDestroy", "i", "Lcom/heytap/sporthealth/fit/weiget/PlayerView;", "playerView", "<init>", "()V", "cervical_vertebra_release"}, k = 1, mv = {1, 8, 0})
public final class VideoUseCase implements DefaultLifecycleObserver {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    public PlayerView playerView;

    public final void a() {
        PlayerView playerView = this.playerView;
        if (playerView != null) {
            playerView.pause();
        }
    }

    public final void b(@NotNull String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        PlayerView playerView = this.playerView;
        if (playerView != null) {
            Uri uri = Uri.parse(path);
            Intrinsics.checkNotNullExpressionValue(uri, "parse(path)");
            playerView.setUri(uri);
            playerView.start();
        }
    }

    public final void c(@NotNull PlayerView player) {
        Intrinsics.checkNotNullParameter(player, "player");
        this.playerView = player;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(@NotNull LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        PlayerView playerView = this.playerView;
        if (playerView != null) {
            playerView.release();
        }
        this.playerView = null;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onPause(@NotNull LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        PlayerView playerView = this.playerView;
        if (playerView != null) {
            playerView.pause();
        }
    }
}
