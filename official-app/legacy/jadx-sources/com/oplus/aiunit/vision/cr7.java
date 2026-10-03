package com.oplus.aiunit.vision;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.core.os.BundleCompat;
import com.oplus.smartenginehelper.ParserTag;
import com.opos.process.bridge.base.BridgeConstant;
import io.protostuff.MapSchema;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'J\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016R\u0016\u0010\n\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\tR\"\u0010\u0011\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R$\u0010\u0017\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0013\u001a\u0004\b\u000b\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u001a\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u0016R$\u0010\u001d\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0013\u001a\u0004\b\b\u0010\u0014\"\u0004\b\u001c\u0010\u0016R\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u0013R\u0016\u0010#\u001a\u0004\u0018\u00010 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006("}, d2 = {"Lcom/oplus/aiunit/vision/cr7;", "", "other", "", "equals", "", "hashCode", "", "a", "J", "lastSnap", "b", "I", "c", "()I", "setStatus", "(I)V", "status", "", "Ljava/lang/String;", "()Ljava/lang/String;", "setPackageName", "(Ljava/lang/String;)V", "packageName", "d", "setTitle", "title", MapSchema.FIELD_NAME_ENTRY, "setContent", "content", "f", ParserTag.TYPE_BUTTON, "Landroid/graphics/Bitmap;", b2n.f, "Landroid/graphics/Bitmap;", "bitmap", "Landroid/os/Bundle;", BridgeConstant.KEY_EXTRAS, "<init>", "(Landroid/os/Bundle;)V", "device_notification_impl2_release"}, k = 1, mv = {1, 8, 0})
public final class cr7 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public long lastSnap;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public int status;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public String packageName;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public String title;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public String content;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public String button;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    public final Bitmap bitmap;

    public cr7(@NotNull Bundle extras) {
        Intrinsics.checkNotNullParameter(extras, "extras");
        this.lastSnap = SystemClock.elapsedRealtime();
        this.status = extras.getInt(com.heytap.health.watch.notification.impl.flashback.a.EXTRA_BUBBLE_STATUS, 0);
        this.packageName = extras.getString(com.heytap.health.watch.notification.impl.flashback.a.EXTRA_APP_PACKAGE_NAME);
        this.title = extras.getString("extra_title");
        this.content = extras.getString(com.heytap.health.watch.notification.impl.flashback.a.EXTRA_CONTENT);
        this.button = extras.getString(com.heytap.health.watch.notification.impl.flashback.a.EXTRA_BUTTON);
        this.bitmap = (Bitmap) BundleCompat.getParcelable(extras, com.heytap.health.watch.notification.impl.flashback.a.EXTRA_APP_ICON, Bitmap.class);
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getPackageName() {
        return this.packageName;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    @Nullable
    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !Intrinsics.areEqual(cr7.class, other.getClass())) {
            return false;
        }
        cr7 cr7Var = (cr7) other;
        if (this.lastSnap - cr7Var.lastSnap < 30000 && this.status == cr7Var.status && TextUtils.equals(this.packageName, cr7Var.packageName) && TextUtils.equals(this.title, cr7Var.title) && TextUtils.equals(this.content, cr7Var.content) && TextUtils.equals(this.button, cr7Var.button)) {
            Bitmap bitmap = this.bitmap;
            Integer numValueOf = bitmap != null ? Integer.valueOf(bitmap.getWidth()) : null;
            Bitmap bitmap2 = cr7Var.bitmap;
            if (Intrinsics.areEqual(numValueOf, bitmap2 != null ? Integer.valueOf(bitmap2.getWidth()) : null)) {
                Bitmap bitmap3 = this.bitmap;
                Integer numValueOf2 = bitmap3 != null ? Integer.valueOf(bitmap3.getHeight()) : null;
                Bitmap bitmap4 = cr7Var.bitmap;
                if (Intrinsics.areEqual(numValueOf2, bitmap4 != null ? Integer.valueOf(bitmap4.getHeight()) : null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(Long.valueOf(this.lastSnap), Integer.valueOf(this.status), this.packageName, this.title, this.content, this.button);
    }
}
