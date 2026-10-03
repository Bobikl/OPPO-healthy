package com.oplus.aiunit.p007vision;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import androidx.core.graphics.drawable.DrawableKt;
import com.google.protobuf.ByteString;
import com.heytap.health.watch.notification.HealthNotificationBean;
import com.heytap.health.watch.notification.impl.module.NotificationHolder;
import com.heytap.log.config.StdDtoConst;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.e88;
import com.oplus.aiunit.vision.m8b;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListSet;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes19.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b*\u0010+J\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004J\u001a\u0010\b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004J&\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rJ&\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rJ\u000e\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012J\u000e\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u0012J\u000e\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012J\u0006\u0010\u0018\u001a\u00020\u000fJ\u000e\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u0002J\u0018\u0010\u001b\u001a\u0004\u0018\u00010\t2\u0006\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\t2\u0006\u0010\u001c\u001a\u00020\u0012J6\u0010!\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00060\u001e2\u0006\u0010 \u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u0004H\u0002R \u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00060\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\"R \u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00060\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\"R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00120%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010&R\u0014\u0010(\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006,"}, d2 = {"Lcom/oplus/aiunit/vision/c0d;", "", "Lcom/heytap/health/watch/notification/HealthNotificationBean;", "sbn", "", "period", "Lcom/oplus/aiunit/vision/g3a;", "i", "d", "Landroid/graphics/Bitmap;", "bitmap", "", "byteArray", "Lcom/google/protobuf/ByteString;", "data", "", "n", LogFieldKey.LEVEL_KEY, "", "key", LogFieldKey.MESSAGE_KEY, "", "b", "c", "a", "h", StdDtoConst.FORCE_KEY, "k", "packageName", "f", "Ljava/util/concurrent/ConcurrentHashMap;", "map", "method", "g", "Ljava/util/concurrent/ConcurrentHashMap;", "mIconCaches", "m144IconCaches", "Ljava/util/concurrent/ConcurrentSkipListSet;", "Ljava/util/concurrent/ConcurrentSkipListSet;", "mFluidIconCaches", "CACHE_ONE_DAY", "I", "<init>", "()V", "device_notification_impl2_release"}, k = 1, mv = {1, 8, 0})
public final class c0d {
    public static final int CACHE_ONE_DAY = 86400000;

    @NotNull
    public static final c0d INSTANCE = new c0d();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final ConcurrentHashMap<String, IconCache> mIconCaches = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final ConcurrentHashMap<String, IconCache> m144IconCaches = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final ConcurrentSkipListSet<String> mFluidIconCaches = new ConcurrentSkipListSet<>();

    public static /* synthetic */ IconCache e(c0d c0dVar, HealthNotificationBean healthNotificationBean, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 1800000;
        }
        return c0dVar.d(healthNotificationBean, i);
    }

    public static /* synthetic */ IconCache j(c0d c0dVar, HealthNotificationBean healthNotificationBean, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 1800000;
        }
        return c0dVar.i(healthNotificationBean, i);
    }

    public final void a() {
        m8b.f("NTF_TransportIconHolder", "clearIconCache");
        mIconCaches.clear();
        m144IconCaches.clear();
        mFluidIconCaches.clear();
    }

    public final boolean b(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return mFluidIconCaches.contains(key);
    }

    public final void c(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        m8b.f("NTF_TransportIconHolder", "deleteIconCache: delete icon cache, " + key);
        mIconCaches.remove(key);
        m144IconCaches.remove(key);
        mFluidIconCaches.remove(key);
    }

    @Nullable
    public final IconCache d(@NotNull HealthNotificationBean sbn, int period) {
        Intrinsics.checkNotNullParameter(sbn, "sbn");
        return g(sbn, m144IconCaches, "get144IconCache", period);
    }

    @Nullable
    public final Bitmap f(@NotNull String packageName) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        try {
            Drawable applicationIcon = e88.a().getApplicationContext().getPackageManager().getApplicationIcon(packageName);
            Intrinsics.checkNotNullExpressionValue(applicationIcon, "context.packageManager.g…licationIcon(packageName)");
            m8b.f("NTF_TransportIconHolder", "getBitmap: packageName=" + packageName);
            return DrawableKt.toBitmap(applicationIcon, applicationIcon.getIntrinsicWidth(), applicationIcon.getIntrinsicHeight(), (Bitmap.Config) null);
        } catch (Exception e) {
            m8b.b("NTF_TransportIconHolder", "getBitmap: " + e.getMessage());
            m8b.b("NTF_TransportIconHolder", "getBitmap is null : packageName=" + packageName);
            return null;
        }
    }

    public final IconCache g(HealthNotificationBean sbn, ConcurrentHashMap<String, IconCache> map, String method, int period) {
        String strH = h(sbn);
        if (map.containsKey(strH)) {
            IconCache iconCache = map.get(strH);
            long time = iconCache != null ? iconCache.getTime() : 0L;
            if (time == 0) {
                m8b.f("NTF_TransportIconHolder", method + ": key=" + strH + ", cache invalid");
                return null;
            }
            if (System.currentTimeMillis() - time > period) {
                m8b.f("NTF_TransportIconHolder", method + ": key=" + strH + ", cache invalid");
                return null;
            }
            IconCache iconCache2 = map.get(strH);
            if (iconCache2 != null) {
                m8b.f("NTF_TransportIconHolder", method + ": key=" + strH + ", cache effective");
                return iconCache2;
            }
        }
        m8b.f("NTF_TransportIconHolder", method + ": key=" + strH + ", no cache");
        return null;
    }

    @NotNull
    public final String h(@NotNull HealthNotificationBean sbn) {
        Intrinsics.checkNotNullParameter(sbn, "sbn");
        if (cb4.Companion.h()) {
            return sbn.getKey();
        }
        String packageName = sbn.getPackageName();
        return NotificationHolder.INSTANCE.j(packageName) ? sbn.getKey() : packageName;
    }

    @Nullable
    public final IconCache i(@NotNull HealthNotificationBean sbn, int period) {
        Intrinsics.checkNotNullParameter(sbn, "sbn");
        return g(sbn, mIconCaches, "getIconCache", period);
    }

    @Nullable
    public final Bitmap k(boolean force, @NotNull HealthNotificationBean sbn) {
        Icon largeIcon;
        Drawable drawableLoadDrawable;
        Intrinsics.checkNotNullParameter(sbn, "sbn");
        Context applicationContext = e88.a().getApplicationContext();
        if ((!force && !NotificationHolder.INSTANCE.j(sbn.getPackageName())) || (largeIcon = sbn.getLargeIcon()) == null || (drawableLoadDrawable = largeIcon.loadDrawable(applicationContext)) == null) {
            return f(sbn.getPackageName());
        }
        m8b.f("NTF_TransportIconHolder", "getIconOriginBitmap: packageName=" + sbn.getPackageName());
        return DrawableKt.toBitmap(drawableLoadDrawable, drawableLoadDrawable.getIntrinsicWidth(), drawableLoadDrawable.getIntrinsicHeight(), (Bitmap.Config) null);
    }

    public final void l(@NotNull HealthNotificationBean sbn, @NotNull Bitmap bitmap, @NotNull byte[] byteArray, @NotNull ByteString data) {
        Intrinsics.checkNotNullParameter(sbn, "sbn");
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(byteArray, "byteArray");
        Intrinsics.checkNotNullParameter(data, "data");
        String strH = h(sbn);
        m8b.f("NTF_TransportIconHolder", "put144IconCache: update icon cache, " + strH);
        ConcurrentHashMap<String, IconCache> concurrentHashMap = m144IconCaches;
        concurrentHashMap.remove(strH);
        concurrentHashMap.put(strH, new IconCache(System.currentTimeMillis(), bitmap, byteArray, data));
    }

    public final void m(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        mFluidIconCaches.add(key);
    }

    public final void n(@NotNull HealthNotificationBean sbn, @NotNull Bitmap bitmap, @NotNull byte[] byteArray, @NotNull ByteString data) {
        Intrinsics.checkNotNullParameter(sbn, "sbn");
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(byteArray, "byteArray");
        Intrinsics.checkNotNullParameter(data, "data");
        String strH = h(sbn);
        m8b.f("NTF_TransportIconHolder", "putIconCache: update icon cache, " + strH);
        ConcurrentHashMap<String, IconCache> concurrentHashMap = mIconCaches;
        concurrentHashMap.remove(strH);
        concurrentHashMap.put(strH, new IconCache(System.currentTimeMillis(), bitmap, byteArray, data));
    }
}
