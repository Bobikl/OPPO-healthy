package com.heytap.health.voiceassistant.ovs;

import com.oplus.aiunit.vision.b78;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/heytap/health/voiceassistant/ovs/a;", "", "Companion", "a", "voiceassistant_impl_release"}, k = 1, mv = {1, 8, 0})
public final class a {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String GRAPH_ASSET_PATH = "breenospeech2/wakeup/xbxb_wakeup.graph";

    @NotNull
    public static final String IRDAT_ASSET_PATH = "breenospeech2/wakeup/ir.dat";

    @NotNull
    public static final String MODEL_ASSET_PATH = "breenospeech2/wakeup/xbxb_wakeup.umdl";

    @NotNull
    public static final String RESOURCE_ASSET_PATH = "breenospeech2/wakeup/xbxb_wakeup.res";

    @NotNull
    public static final String a;

    @NotNull
    public static final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final String f6107c;

    @NotNull
    public static final String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final String f6108e;

    @NotNull
    public static final String f;

    /* JADX INFO: renamed from: com.heytap.health.voiceassistant.ovs.a$a, reason: collision with other inner class name and from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0004\u001a\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0004R\u0014\u0010\u0010\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0004R\u0014\u0010\u0011\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0004R\u0014\u0010\u0012\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0004¨\u0006\u0015"}, d2 = {"Lcom/heytap/health/voiceassistant/ovs/a$a;", "", "", "resourcePath", "Ljava/lang/String;", MapSchema.FIELD_NAME_ENTRY, "()Ljava/lang/String;", "graphPath", "b", "modelPath", "d", "irDatPath", "c", "configJSON", "a", "GRAPH_ASSET_PATH", "IRDAT_ASSET_PATH", "MODEL_ASSET_PATH", "RESOURCE_ASSET_PATH", "<init>", "()V", "voiceassistant_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String a() {
            return a.f;
        }

        @NotNull
        public final String b() {
            return a.f6107c;
        }

        @NotNull
        public final String c() {
            return a.f6108e;
        }

        @NotNull
        public final String d() {
            return a.d;
        }

        @NotNull
        public final String e() {
            return a.b;
        }
    }

    static {
        String absolutePath = b78.a().getFilesDir().getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath, "getAppContext().filesDir.absolutePath");
        a = absolutePath;
        String str = absolutePath + "/breenospeech2/wakeup/xbxb_wakeup.res";
        b = str;
        String str2 = absolutePath + "/breenospeech2/wakeup/xbxb_wakeup.graph";
        f6107c = str2;
        String str3 = absolutePath + "/breenospeech2/wakeup/xbxb_wakeup.umdl";
        d = str3;
        String str4 = absolutePath + "/breenospeech2/wakeup/ir.dat";
        f6108e = str4;
        f = "{\"type\":\"BreenoWakeupVprintSDK\",\"version\":3,\"frontend\":{},\"wakeupEngine\":{\"resource\":\"" + str + "\",\"graph\":\"" + str2 + "\",\"model\":\"" + str3 + "\",\"keywords\":[\"xiao bu xiao bu\"],\"vprintType\":[[1]],\"detectTimeout\":10000,\"maxBufferLength\":5000,\"historyBufferLength\":2000,\"extraBufferLength\":300},\"irDat\":\"" + str4 + "\"}";
    }
}
