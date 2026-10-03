package com.oplus.nearx.track.internal.upload.net.control;

import com.oplus.aiunit.vision.TrackRequest;
import com.oplus.aiunit.vision.h78;
import com.oplus.aiunit.vision.k6k;
import com.oplus.aiunit.vision.kam;
import com.oplus.aiunit.vision.pz9;
import com.oplus.nearx.track.internal.utils.Logger;
import java.net.URL;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b \u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0003\u001a\u00020\u0002H\u0004R\u001a\u0010\t\u001a\u00020\u00048\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u000e\u001a\u00020\n8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/oplus/nearx/track/internal/upload/net/control/BaseNetworkControl;", "Lcom/oplus/aiunit/vision/pz9;", "Ljava/net/URL;", "b", "", "a", "J", "getAppId", "()J", "appId", "Lcom/oplus/aiunit/vision/g7k;", "Lcom/oplus/aiunit/vision/g7k;", "c", "()Lcom/oplus/aiunit/vision/g7k;", "trackRequest", "<init>", "(JLcom/oplus/aiunit/vision/g7k;)V", "core-statistics_release"}, k = 1, mv = {1, 7, 1})
public abstract class BaseNetworkControl implements pz9 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final long appId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final TrackRequest trackRequest;

    public BaseNetworkControl(long j2, @NotNull TrackRequest trackRequest) {
        Intrinsics.checkNotNullParameter(trackRequest, "trackRequest");
        this.appId = j2;
        this.trackRequest = trackRequest;
    }

    @NotNull
    public final URL b() {
        String url = this.trackRequest.getUrl();
        String str = StringsKt__StringsKt.contains$default((CharSequence) url, (CharSequence) "?", false, 2, (Object) null) ? "&" : "?";
        for (Map.Entry<String, String> entry : this.trackRequest.d().entrySet()) {
            url = url + str + entry.getKey() + kam.h + entry.getValue();
            str = "&";
        }
        final URL url2 = new URL(url);
        h78.a(new Function0<Unit>() { // from class: com.oplus.nearx.track.internal.upload.net.control.BaseNetworkControl$buildUrl$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p010kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                Logger.b(k6k.e(), "TrackUpload", "sendRequest url=[" + url2 + ']', null, null, 12, null);
            }
        });
        return url2;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final TrackRequest getTrackRequest() {
        return this.trackRequest;
    }
}
