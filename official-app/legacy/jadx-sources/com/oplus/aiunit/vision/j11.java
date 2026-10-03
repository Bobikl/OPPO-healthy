package com.oplus.aiunit.vision;

import androidx.exifinterface.media.ExifInterface;
import com.heytap.health.watchface.business.manager.base.LoadCallback;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H&J\u001e\u0010\t\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H&¨\u0006\f"}, d2 = {"Lcom/oplus/aiunit/vision/j11;", ExifInterface.GPS_DIRECTION_TRUE, "", "Lcom/oplus/aiunit/vision/i3b;", "params", "Lcom/heytap/health/watchface/business/manager/base/LoadCallback;", "callback", "", "b", "a", "<init>", "()V", "watchface_impl_release"}, k = 1, mv = {1, 8, 0})
public abstract class j11<T> {
    public abstract void a(@NotNull i3b params, @NotNull LoadCallback<T> callback);

    public abstract void b(@NotNull i3b params, @NotNull LoadCallback<T> callback);
}
