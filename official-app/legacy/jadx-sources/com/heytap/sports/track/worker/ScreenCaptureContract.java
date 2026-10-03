package com.heytap.sports.track.worker;

import android.content.Context;
import android.content.Intent;
import android.media.projection.MediaProjectionConfig;
import android.media.projection.MediaProjectionManager;
import android.os.Build;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001c\u0010\f\u001a\u0004\u0018\u00010\u00032\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003H\u0016R\u0017\u0010\u0011\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\f\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/heytap/sports/track/worker/ScreenCaptureContract;", "Landroidx/activity/result/contract/ActivityResultContract;", "", "Landroid/content/Intent;", "Landroid/content/Context;", "context", "input", "createIntent", "(Landroid/content/Context;Lkotlin/Unit;)Landroid/content/Intent;", "", "resultCode", "intent", "a", "Landroid/media/projection/MediaProjectionManager;", "Landroid/media/projection/MediaProjectionManager;", "getMediaProjectionManager", "()Landroid/media/projection/MediaProjectionManager;", "mediaProjectionManager", "<init>", "(Landroid/media/projection/MediaProjectionManager;)V", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
public final class ScreenCaptureContract extends ActivityResultContract<Unit, Intent> {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final MediaProjectionManager mediaProjectionManager;

    public ScreenCaptureContract(@NotNull MediaProjectionManager mediaProjectionManager) {
        Intrinsics.checkNotNullParameter(mediaProjectionManager, "mediaProjectionManager");
        this.mediaProjectionManager = mediaProjectionManager;
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    @Nullable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Intent parseResult(int resultCode, @Nullable Intent intent) {
        if (resultCode != -1) {
            return null;
        }
        return intent;
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    @NotNull
    public Intent createIntent(@NotNull Context context, @NotNull Unit input) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        if (Build.VERSION.SDK_INT >= 34) {
            Intent intentCreateScreenCaptureIntent = this.mediaProjectionManager.createScreenCaptureIntent(MediaProjectionConfig.createConfigForDefaultDisplay());
            Intrinsics.checkNotNullExpressionValue(intentCreateScreenCaptureIntent, "{\n            mediaProje…faultDisplay())\n        }");
            return intentCreateScreenCaptureIntent;
        }
        Intent intentCreateScreenCaptureIntent2 = this.mediaProjectionManager.createScreenCaptureIntent();
        Intrinsics.checkNotNullExpressionValue(intentCreateScreenCaptureIntent2, "{\n            mediaProje…CaptureIntent()\n        }");
        return intentCreateScreenCaptureIntent2;
    }
}
