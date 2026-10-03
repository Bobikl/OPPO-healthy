package com.heytap.health.track;

import android.content.Context;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.facade.template.IProvider;
import com.heytap.health.base.track.a;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.j5k;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes18.dex */
@Route(path = a.TRACK_PROXY_PATH)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\u0012\u0010\t\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J4\u0010\u000f\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\u00072\u0016\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0006\b\u0001\u0012\u00020\r\u0018\u00010\fH\u0016R\u0014\u0010\u0012\u001a\u00020\u00078\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0018\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, d2 = {"Lcom/heytap/health/track/TrackApiProxy;", "Lcom/heytap/health/base/track/a$a;", "Lcom/alibaba/android/arouter/facade/template/IProvider;", "Landroid/content/Context;", "context", "", "init", "", "customClientId", "setCustomClientId", "eventGroup", "eventId", "", "", "data", "track", "i", "Ljava/lang/String;", "TAG", "Lcom/oplus/aiunit/vision/j5k;", "j", "Lkotlin/Lazy;", "c", "()Lcom/oplus/aiunit/vision/j5k;", "trackApi", "<init>", "()V", "lib_track_release"}, k = 1, mv = {1, 8, 0})
public final class TrackApiProxy implements a.InterfaceC0296a, IProvider {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final String TAG = "TrackApiProxy";

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Lazy trackApi = LazyKt__LazyJVMKt.lazy(new Function0<j5k>() { // from class: com.heytap.health.track.TrackApiProxy$trackApi$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final j5k invoke() {
            return new j5k();
        }
    });

    public final j5k c() {
        return (j5k) this.trackApi.getValue();
    }

    @Override // com.alibaba.android.arouter.facade.template.IProvider
    public void init(@Nullable Context context) {
        a7b.f(this.TAG, "TrackApiProxy init");
    }

    @Override // com.heytap.health.base.track.a.InterfaceC0296a
    public void setCustomClientId(@Nullable String customClientId) {
        c().setCustomClientId(customClientId);
    }

    @Override // com.heytap.health.base.track.a.InterfaceC0296a
    public void track(@Nullable String eventGroup, @Nullable String eventId, @Nullable Map<String, ? extends Object> data) {
        c().track(eventGroup, eventId, data);
    }
}
