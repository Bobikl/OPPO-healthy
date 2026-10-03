package com.heytap.health.watch.notification.impl.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.graphics.drawable.DrawableKt;
import com.heytap.health.base.task.ThreadUtils;
import com.heytap.health.watch.notification.impl.R$drawable;
import com.heytap.wearable.support.watchface.common.utils.ResourcesUtil;
import com.oplus.aiunit.vision.MainIconCache;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.b78;
import com.oplus.aiunit.vision.ejg;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0014B\t\b\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J(\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002R \u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00130\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Lcom/heytap/health/watch/notification/impl/ui/i;", "", "", "packageName", "Lcom/heytap/health/watch/notification/impl/ui/i$a;", "callback", "", "d", "Landroid/graphics/Bitmap;", "bitmap", "", "targetWidth", "targetHeight", "Landroid/content/res/Resources;", "resources", "Landroid/graphics/drawable/Drawable;", "b", "c", "Ljava/util/concurrent/ConcurrentHashMap;", "Lcom/oplus/aiunit/vision/feb;", "a", "Ljava/util/concurrent/ConcurrentHashMap;", "mIconCache", "<init>", "()V", "device_notification_impl2_release"}, k = 1, mv = {1, 8, 0})
public final class i {

    @NotNull
    public static final i INSTANCE = new i();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final ConcurrentHashMap<String, MainIconCache> mIconCache = new ConcurrentHashMap<>();

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, d2 = {"Lcom/heytap/health/watch/notification/impl/ui/i$a;", "", "Landroid/graphics/drawable/Drawable;", ResourcesUtil.ResourceType.DRAWABLE, "", "a", "device_notification_impl2_release"}, k = 1, mv = {1, 8, 0})
    public interface a {
        void a(@NotNull Drawable drawable);
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016¨\u0006\u0005"}, d2 = {"com/heytap/health/watch/notification/impl/ui/i$b", "Landroid/graphics/drawable/BitmapDrawable;", "", "getIntrinsicWidth", "getIntrinsicHeight", "device_notification_impl2_release"}, k = 1, mv = {1, 8, 0})
    public static final class b extends BitmapDrawable {
        public final /* synthetic */ int a;
        public final /* synthetic */ int b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Resources resources, Bitmap bitmap, int i, int i2) {
            super(resources, bitmap);
            this.a = i;
            this.b = i2;
        }

        @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
        public int getIntrinsicHeight() {
            return this.b;
        }

        @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
        public int getIntrinsicWidth() {
            return this.a;
        }
    }

    public static final void e(String packageName, a callback) {
        Intrinsics.checkNotNullParameter(packageName, "$packageName");
        Intrinsics.checkNotNullParameter(callback, "$callback");
        Drawable drawableC = INSTANCE.c(packageName);
        if (drawableC != null) {
            mIconCache.put(packageName, new MainIconCache(System.currentTimeMillis(), drawableC));
            callback.a(drawableC);
        }
    }

    public final Drawable b(Bitmap bitmap, int targetWidth, int targetHeight, Resources resources) {
        b bVar = new b(resources, bitmap, targetWidth, targetHeight);
        bVar.setBounds(0, 0, targetWidth, targetHeight);
        bVar.setTargetDensity(resources.getDisplayMetrics().densityDpi);
        return bVar;
    }

    public final Drawable c(String packageName) {
        Context applicationContext = b78.a().getApplicationContext();
        int iA = ejg.a(applicationContext, 36.0f);
        try {
            Drawable applicationIcon = applicationContext.getPackageManager().getApplicationIcon(packageName);
            Intrinsics.checkNotNullExpressionValue(applicationIcon, "pm.getApplicationIcon(packageName)");
            Bitmap bitmap = DrawableKt.toBitmap(applicationIcon, iA, iA, null);
            Resources resources = applicationContext.getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "context.resources");
            Drawable drawableB = b(bitmap, iA, iA, resources);
            mIconCache.put(packageName, new MainIconCache(System.currentTimeMillis(), drawableB));
            return drawableB;
        } catch (Exception e2) {
            a7b.b("NTF_MainIconHolder", "getIconBitmap: " + e2.getMessage());
            Drawable drawable = AppCompatResources.getDrawable(applicationContext, R$drawable.notification_app_default);
            Intrinsics.checkNotNull(drawable);
            Bitmap bitmap2 = DrawableKt.toBitmap(drawable, iA, iA, null);
            Resources resources2 = applicationContext.getResources();
            Intrinsics.checkNotNullExpressionValue(resources2, "context.resources");
            return b(bitmap2, iA, iA, resources2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0032  */
    public final void d(@NotNull final String packageName, @NotNull final a callback) {
        Drawable data;
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(callback, "callback");
        ConcurrentHashMap<String, MainIconCache> concurrentHashMap = mIconCache;
        if (concurrentHashMap.containsKey(packageName)) {
            MainIconCache mainIconCache = concurrentHashMap.get(packageName);
            Intrinsics.checkNotNull(mainIconCache, "null cannot be cast to non-null type com.heytap.health.watch.notification.impl.ui.MainIconCache");
            MainIconCache mainIconCache2 = mainIconCache;
            if (System.currentTimeMillis() - mainIconCache2.getTime() < 21600000) {
                data = mainIconCache2.getData();
            } else {
                data = null;
            }
        } else {
            data = null;
        }
        if (data != null) {
            callback.a(data);
        }
        if (data == null) {
            ThreadUtils.doInBackground(new Runnable() { // from class: com.oplus.aiunit.vision.vwc
                @Override // java.lang.Runnable
                public final void run() {
                    com.heytap.health.watch.notification.impl.ui.i.e(packageName, callback);
                }
            });
        }
    }
}
