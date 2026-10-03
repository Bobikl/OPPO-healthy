package com.heytap.weather.transceiver;

import com.oplus.aiunit.vision.a7b;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/heytap/weather/transceiver/c;", "Lcom/heytap/weather/transceiver/AbsTransceiver;", "", "d", "a", "", "c", "Ljava/lang/String;", "tag", "<init>", "()V", "interconnection_impl_release"}, k = 1, mv = {1, 8, 0})
public final class c extends AbsTransceiver {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String tag = "HtWeather_RxTransceiver";

    @Override // com.heytap.weather.transceiver.d
    public void a() {
        a7b.m(this.tag, "onBandGetDetails: not match device");
    }

    @Override // com.heytap.weather.transceiver.d
    public void d() {
        a7b.m(this.tag, "onWatch1StubGetData: not match device");
    }
}
