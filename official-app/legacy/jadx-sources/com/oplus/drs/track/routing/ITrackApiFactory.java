package com.oplus.drs.track.routing;

import android.content.Context;
import androidx.annotation.CallSuper;
import com.oplus.aiunit.vision.af3;
import com.oplus.drs.track.ITrackApi;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H'J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH&J\n\u0010\f\u001a\u0004\u0018\u00010\nH&¨\u0006\r"}, d2 = {"Lcom/oplus/drs/track/routing/ITrackApiFactory;", "", "Landroid/content/Context;", "context", "Lcom/oplus/aiunit/vision/af3;", "staticConfig", "", "staticInit", "", "appId", "Lcom/oplus/drs/track/ITrackApi;", "getInstance", "getInstanceForApp", "obus-sdk_release"}, k = 1, mv = {1, 7, 1})
public interface ITrackApiFactory {
    @NotNull
    ITrackApi getInstance(long appId);

    @Nullable
    ITrackApi getInstanceForApp();

    @CallSuper
    void staticInit(@NotNull Context context, @NotNull af3 staticConfig);
}
