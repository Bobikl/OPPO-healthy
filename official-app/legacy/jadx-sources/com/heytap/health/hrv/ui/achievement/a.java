package com.heytap.health.hrv.ui.achievement;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0001\u0006J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0007"}, d2 = {"Lcom/heytap/health/hrv/ui/achievement/a;", "", "Lcom/heytap/health/hrv/ui/achievement/a$b;", "listener", "", "getScreenShot", "b", "hrv_release"}, k = 1, mv = {1, 8, 0})
public interface a {

    /* JADX INFO: renamed from: com.heytap.health.hrv.ui.achievement.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nIScreenShot.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IScreenShot.kt\ncom/heytap/health/hrv/ui/achievement/IScreenShot$DefaultImpls\n+ 2 Bitmap.kt\nandroidx/core/graphics/BitmapKt\n*L\n1#1,24:1\n90#2,6:25\n*S KotlinDebug\n*F\n+ 1 IScreenShot.kt\ncom/heytap/health/hrv/ui/achievement/IScreenShot$DefaultImpls\n*L\n19#1:25,6\n*E\n"})
    public static final class C0462a {
        @NotNull
        public static Bitmap a(@NotNull a aVar, @NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
            view.draw(new Canvas(bitmapCreateBitmap));
            return bitmapCreateBitmap;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, d2 = {"Lcom/heytap/health/hrv/ui/achievement/a$b;", "", "Landroid/graphics/Bitmap;", "bitmap", "", "a", "hrv_release"}, k = 1, mv = {1, 8, 0})
    public interface b {
        void a(@NotNull Bitmap bitmap);
    }

    void getScreenShot(@NotNull b listener);
}
