package androidx.work.impl.utils;

import android.net.NetworkRequest;
import androidx.annotation.RequiresApi;
import androidx.core.app.NotificationCompat;
import androidx.work.Logger;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.collections.ArraysKt___ArraysKt;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes12.dex */
@RequiresApi(28)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J\u001d\u0010\b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0002\b\nJ\u001d\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000fH\u0000¢\u0006\u0002\b\u0010J\u001d\u0010\u0011\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u000fH\u0000¢\u0006\u0002\b\u0013¨\u0006\u0014"}, d2 = {"Landroidx/work/impl/utils/NetworkRequest28;", "", "()V", "createNetworkRequest", "Landroid/net/NetworkRequest;", "capabilities", "", "transports", "createNetworkRequestCompat", "Landroidx/work/impl/utils/NetworkRequestCompat;", "createNetworkRequestCompat$work_runtime_release", "hasCapability", "", "request", "capability", "", "hasCapability$work_runtime_release", "hasTransport", NotificationCompat.CATEGORY_TRANSPORT, "hasTransport$work_runtime_release", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nNetworkRequestCompat.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetworkRequestCompat.kt\nandroidx/work/impl/utils/NetworkRequest28\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,177:1\n13600#2,2:178\n13600#2,2:180\n13600#2,2:182\n*S KotlinDebug\n*F\n+ 1 NetworkRequestCompat.kt\nandroidx/work/impl/utils/NetworkRequest28\n*L\n120#1:178,2\n137#1:180,2\n154#1:182,2\n*E\n"})
public final class NetworkRequest28 {

    @NotNull
    public static final NetworkRequest28 INSTANCE = new NetworkRequest28();

    private NetworkRequest28() {
    }

    @JvmStatic
    @NotNull
    public static final NetworkRequest createNetworkRequest(@NotNull int[] capabilities, @NotNull int[] transports) {
        Intrinsics.checkNotNullParameter(capabilities, "capabilities");
        Intrinsics.checkNotNullParameter(transports, "transports");
        NetworkRequest.Builder builder = new NetworkRequest.Builder();
        for (int i : capabilities) {
            try {
                builder.addCapability(i);
            } catch (IllegalArgumentException e2) {
                Logger.get().warning(NetworkRequestCompat.INSTANCE.getTAG(), "Ignoring adding capability '" + i + '\'', e2);
            }
        }
        for (int i2 : NetworkRequestCompatKt.defaultCapabilities) {
            if (!ArraysKt___ArraysKt.contains(capabilities, i2)) {
                try {
                    builder.removeCapability(i2);
                } catch (IllegalArgumentException e3) {
                    Logger.get().warning(NetworkRequestCompat.INSTANCE.getTAG(), "Ignoring removing default capability '" + i2 + '\'', e3);
                }
            }
        }
        for (int i3 : transports) {
            builder.addTransportType(i3);
        }
        NetworkRequest networkRequestBuild = builder.build();
        Intrinsics.checkNotNullExpressionValue(networkRequestBuild, "networkRequest.build()");
        return networkRequestBuild;
    }

    @NotNull
    public final NetworkRequestCompat createNetworkRequestCompat$work_runtime_release(@NotNull int[] capabilities, @NotNull int[] transports) {
        Intrinsics.checkNotNullParameter(capabilities, "capabilities");
        Intrinsics.checkNotNullParameter(transports, "transports");
        return new NetworkRequestCompat(createNetworkRequest(capabilities, transports));
    }

    public final boolean hasCapability$work_runtime_release(@NotNull NetworkRequest request, int capability) {
        Intrinsics.checkNotNullParameter(request, "request");
        return request.hasCapability(capability);
    }

    public final boolean hasTransport$work_runtime_release(@NotNull NetworkRequest request, int transport) {
        Intrinsics.checkNotNullParameter(request, "request");
        return request.hasTransport(transport);
    }
}
