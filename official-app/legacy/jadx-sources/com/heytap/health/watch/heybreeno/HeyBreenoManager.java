package com.heytap.health.watch.heybreeno;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.amap.api.services.district.DistrictSearchQuery;
import com.google.protobuf.InvalidProtocolBufferException;
import com.heytap.health.base.permission.wxbpermission.PermissionRequestDialog;
import com.heytap.health.interconnection.InterMainApi;
import com.heytap.health.interconnection.InterTransportApi;
import com.heytap.health.location.HMapLocation;
import com.heytap.health.location.ILocationCB;
import com.heytap.health.location.a;
import com.heytap.health.protocol.device_breeno.DeviceBreenoProto$BreenoCarBind;
import com.heytap.health.protocol.device_breeno.DeviceBreenoProto$BreenoLocationInfo;
import com.heytap.health.watch.heybreeno.HeyBreenoManager;
import com.heytap.health.watch.heybreeno.aidl.IHeyBreenoOnce;
import com.oplus.aiunit.vision.HLatLng;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.b5b;
import com.oplus.aiunit.vision.cm9;
import com.oplus.aiunit.vision.gl4;
import com.oplus.aiunit.vision.x05;
import com.oplus.aiunit.vision.zne;
import com.oplus.health.apiprovider.ClientManager;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u00192\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\t\u001a\u00020\u0006H\u0002J(\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002R\u001b\u0010\u0016\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001b"}, d2 = {"Lcom/heytap/health/watch/heybreeno/HeyBreenoManager;", "Lcom/oplus/aiunit/vision/cm9;", "Lcom/heytap/health/watch/heybreeno/aidl/IHeyBreenoOnce;", b2n.g, "Landroid/content/Context;", "context", "", "c", "b", "j", "", DistrictSearchQuery.KEYWORDS_CITY, "", "longitude", "latitude", "", "canLocation", "i", "Lcom/heytap/health/watch/heybreeno/aidl/IHeyBreenoOnce$Stub;", "Lkotlin/Lazy;", b2n.f, "()Lcom/heytap/health/watch/heybreeno/aidl/IHeyBreenoOnce$Stub;", "binder", "<init>", "()V", "Companion", "a", "heybreeno_impl_release"}, k = 1, mv = {1, 8, 0})
public final class HeyBreenoManager implements cm9<IHeyBreenoOnce> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final Lazy binder = LazyKt__LazyJVMKt.lazy(new Function0<HeyBreenoManager$binder$2.AnonymousClass1>() { // from class: com.heytap.health.watch.heybreeno.HeyBreenoManager$binder$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Type inference failed for: r0v0, types: [com.heytap.health.watch.heybreeno.HeyBreenoManager$binder$2$1] */
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final AnonymousClass1 invoke() {
            final HeyBreenoManager heyBreenoManager = this.this$0;
            return new IHeyBreenoOnce.Stub() { // from class: com.heytap.health.watch.heybreeno.HeyBreenoManager$binder$2.1
                @Override // com.heytap.health.watch.heybreeno.aidl.IHeyBreenoOnce
                public void onMessageReceived(@NotNull MessageEvent event) throws InvalidProtocolBufferException {
                    Intrinsics.checkNotNullParameter(event, "event");
                    int commandId = event.getCommandId();
                    StringBuilder sb = new StringBuilder();
                    sb.append("HeyBreenoManager onMessageReceived commandId: ");
                    sb.append(commandId);
                    if (event.getCommandId() == 1) {
                        if (PermissionRequestDialog.D(13, "android.permission.ACCESS_FINE_LOCATION")) {
                            heyBreenoManager.j();
                            return;
                        } else {
                            heyBreenoManager.i("", 0.0d, 0.0d, false);
                            a7b.b("HeyBreeno", "HeyBreenoManager onMessageReceived  do not has android.permission.ACCESS_FINE_LOCATION");
                            return;
                        }
                    }
                    if (event.getCommandId() != 4) {
                        if (event.getCommandId() == 3) {
                            InterTransportApi.INSTANCE.a();
                            return;
                        }
                        return;
                    }
                    DeviceBreenoProto$BreenoCarBind from = DeviceBreenoProto$BreenoCarBind.parseFrom(event.getData());
                    if (from != null) {
                        InterMainApi.Companion companion = InterMainApi.INSTANCE;
                        String pagePath = from.getPagePath();
                        Intrinsics.checkNotNullExpressionValue(pagePath, "it.pagePath");
                        companion.a(pagePath);
                    }
                }
            };
        }
    });

    /* JADX INFO: renamed from: com.heytap.health.watch.heybreeno.HeyBreenoManager$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/heytap/health/watch/heybreeno/HeyBreenoManager$a;", "", "Lcom/oplus/wearable/linkservice/sdk/common/MessageEvent;", "event", "", "b", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "heybreeno_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final IHeyBreenoOnce c(IBinder iBinder) {
            return IHeyBreenoOnce.Stub.asInterface(iBinder);
        }

        public final void b(@NotNull MessageEvent event) {
            Intrinsics.checkNotNullParameter(event, "event");
            try {
                IHeyBreenoOnce iHeyBreenoOnce = (IHeyBreenoOnce) ClientManager.getInstance().getBuildService("api_provider_hey_breeno_once", new ClientManager.a() { // from class: com.oplus.aiunit.vision.x79
                    @Override // com.oplus.health.apiprovider.ClientManager.a
                    public final Object a(IBinder iBinder) {
                        return HeyBreenoManager.Companion.c(iBinder);
                    }
                });
                if (iHeyBreenoOnce != null) {
                    iHeyBreenoOnce.onMessageReceived(event);
                }
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // com.oplus.aiunit.vision.cm9
    public void b(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.oplus.aiunit.vision.cm9
    public void c(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final IHeyBreenoOnce.Stub g() {
        return (IHeyBreenoOnce.Stub) this.binder.getValue();
    }

    @Override // com.oplus.aiunit.vision.cm9
    @NotNull
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public IHeyBreenoOnce d() {
        return g();
    }

    public final void i(String city, double longitude, double latitude, boolean canLocation) {
        DeviceBreenoProto$BreenoLocationInfo.Builder canLocation2 = DeviceBreenoProto$BreenoLocationInfo.newBuilder().setCity(city).setLatitude(latitude).setLongitude(longitude).setCanLocation(canLocation);
        StringBuilder sb = new StringBuilder();
        sb.append("HeyBreenoManager onGetLocation city: ");
        sb.append(city);
        gl4.devicePrimary.messageApi.b(new MessageEvent(19, 1, canLocation2.build().toByteArray()));
    }

    public final void j() {
        a.INSTANCE.c(new ILocationCB.Stub() { // from class: com.heytap.health.watch.heybreeno.HeyBreenoManager$startLocation$1
            /* JADX WARN: Code duplicated, block: B:14:0x0040  */
            /* JADX WARN: Code duplicated, block: B:16:0x0046  */
            /* JADX WARN: Code duplicated, block: B:17:0x0048  */
            /* JADX WARN: Code duplicated, block: B:19:0x004b  */
            /* JADX WARN: Code duplicated, block: B:22:0x0050  */
            /* JADX WARN: Code duplicated, block: B:25:0x0055  */
            /* JADX WARN: Code duplicated, block: B:27:0x0061  */
            /* JADX WARN: Code duplicated, block: B:28:0x0082  */
            @Override // com.heytap.health.location.ILocationCB
            public void onChanged(@NotNull HMapLocation hLocation) {
                boolean z;
                HLatLng hLatLng;
                Intrinsics.checkNotNullParameter(hLocation, "hLocation");
                b5b b5bVar = new b5b(hLocation);
                String strH = b5bVar.h();
                Intrinsics.checkNotNullExpressionValue(strH, "location.latitude");
                double d = Double.parseDouble(strH);
                String strI = b5bVar.i();
                Intrinsics.checkNotNullExpressionValue(strI, "location.longitude");
                double d2 = Double.parseDouble(strI);
                if (b5bVar.g() == 0) {
                    if (d == 0.0d) {
                        if (!(d2 == 0.0d)) {
                            if (d == Double.MIN_VALUE) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (!z) {
                                if (!(d2 == Double.MIN_VALUE)) {
                                    if (Intrinsics.areEqual("WGS84", b5bVar.e())) {
                                        String strH2 = b5bVar.h();
                                        Intrinsics.checkNotNullExpressionValue(strH2, "location.latitude");
                                        double d3 = Double.parseDouble(strH2);
                                        String strI2 = b5bVar.i();
                                        Intrinsics.checkNotNullExpressionValue(strI2, "location.longitude");
                                        hLatLng = zne.d(d3, Double.parseDouble(strI2));
                                        Intrinsics.checkNotNullExpressionValue(hLatLng, "{\n                    Po…      )\n                }");
                                    } else {
                                        String strH3 = b5bVar.h();
                                        Intrinsics.checkNotNullExpressionValue(strH3, "location.latitude");
                                        double d4 = Double.parseDouble(strH3);
                                        String strI3 = b5bVar.i();
                                        Intrinsics.checkNotNullExpressionValue(strI3, "location.longitude");
                                        hLatLng = new HLatLng(d4, Double.parseDouble(strI3));
                                    }
                                    StringBuilder sb = new StringBuilder();
                                    sb.append("onLocationChanged:");
                                    sb.append(b5bVar);
                                    sb.append("    LatLng:");
                                    sb.append(hLatLng);
                                    DecimalFormatSymbols decimalFormatSymbols = x05.TIME_FORMAT_LOCALE_CN_SYMBOL;
                                    b5bVar.r(new DecimalFormat("0.00000", decimalFormatSymbols).format(hLatLng.getLat()));
                                    b5bVar.t(new DecimalFormat("0.00000", decimalFormatSymbols).format(hLatLng.getLng()));
                                    HeyBreenoManager heyBreenoManager = this.this$0;
                                    String strD = b5bVar.d();
                                    Intrinsics.checkNotNullExpressionValue(strD, "location.city");
                                    String strI4 = b5bVar.i();
                                    Intrinsics.checkNotNullExpressionValue(strI4, "location.longitude");
                                    double d5 = Double.parseDouble(strI4);
                                    String strH4 = b5bVar.h();
                                    Intrinsics.checkNotNullExpressionValue(strH4, "location.latitude");
                                    heyBreenoManager.i(strD, d5, Double.parseDouble(strH4), true);
                                    return;
                                }
                            }
                        }
                    } else {
                        if (d == Double.MIN_VALUE) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!z) {
                            if (!(d2 == Double.MIN_VALUE)) {
                                if (Intrinsics.areEqual("WGS84", b5bVar.e())) {
                                    String strH5 = b5bVar.h();
                                    Intrinsics.checkNotNullExpressionValue(strH5, "location.latitude");
                                    double d6 = Double.parseDouble(strH5);
                                    String strI5 = b5bVar.i();
                                    Intrinsics.checkNotNullExpressionValue(strI5, "location.longitude");
                                    hLatLng = zne.d(d6, Double.parseDouble(strI5));
                                    Intrinsics.checkNotNullExpressionValue(hLatLng, "{\n                    Po…      )\n                }");
                                } else {
                                    String strH6 = b5bVar.h();
                                    Intrinsics.checkNotNullExpressionValue(strH6, "location.latitude");
                                    double d7 = Double.parseDouble(strH6);
                                    String strI6 = b5bVar.i();
                                    Intrinsics.checkNotNullExpressionValue(strI6, "location.longitude");
                                    hLatLng = new HLatLng(d7, Double.parseDouble(strI6));
                                }
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("onLocationChanged:");
                                sb2.append(b5bVar);
                                sb2.append("    LatLng:");
                                sb2.append(hLatLng);
                                DecimalFormatSymbols decimalFormatSymbols2 = x05.TIME_FORMAT_LOCALE_CN_SYMBOL;
                                b5bVar.r(new DecimalFormat("0.00000", decimalFormatSymbols2).format(hLatLng.getLat()));
                                b5bVar.t(new DecimalFormat("0.00000", decimalFormatSymbols2).format(hLatLng.getLng()));
                                HeyBreenoManager heyBreenoManager2 = this.this$0;
                                String strD2 = b5bVar.d();
                                Intrinsics.checkNotNullExpressionValue(strD2, "location.city");
                                String strI7 = b5bVar.i();
                                Intrinsics.checkNotNullExpressionValue(strI7, "location.longitude");
                                double d8 = Double.parseDouble(strI7);
                                String strH7 = b5bVar.h();
                                Intrinsics.checkNotNullExpressionValue(strH7, "location.latitude");
                                heyBreenoManager2.i(strD2, d8, Double.parseDouble(strH7), true);
                                return;
                            }
                        }
                    }
                }
                this.this$0.i("", 0.0d, 0.0d, false);
            }
        });
    }
}
