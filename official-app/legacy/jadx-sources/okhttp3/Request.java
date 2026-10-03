package okhttp3;

import androidx.exifinterface.media.ExifInterface;
import com.heytap.common.bean.NetworkType;
import com.heytap.log.formatter.LogFieldKey;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import com.heytap.webview.extension.cache.CacheConstants;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.gj8;
import com.oplus.aiunit.vision.gqf;
import com.oplus.aiunit.vision.jla;
import com.oplus.aiunit.vision.k7f;
import com.oplus.aiunit.vision.nqf;
import com.oplus.aiunit.vision.sqk;
import com.oplus.aiunit.vision.uk9;
import com.oplus.aiunit.vision.wj9;
import com.oplus.aiunit.vision.xo2;
import com.oplus.smartenginehelper.ParserTag;
import com.oplus.utrace.db.UTraceSQLiteHelperKt;
import io.protostuff.MapSchema;
import java.net.URL;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Pair;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.collections.MapsKt__MapsKt;
import p010kotlin.jvm.JvmName;
import p010kotlin.jvm.JvmOverloads;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001LB\u0081\u0001\b\u0000\u0012\u0006\u0010\u001a\u001a\u00020\u0015\u0012\u0006\u0010\u001f\u001a\u00020\u0002\u0012\u0006\u0010%\u001a\u00020 \u0012\b\u0010)\u001a\u0004\u0018\u00010&\u0012\u0016\u0010.\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n\u0012\u0004\u0012\u00020\u00010*\u0012\u0006\u00102\u001a\u00020/\u0012\b\u00103\u001a\u0004\u0018\u00010\u0002\u0012\b\u00105\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010:\u001a\n\u0012\u0004\u0012\u000206\u0018\u00010\u0006\u0012\u0006\u0010@\u001a\u00020;\u0012\b\u0010D\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\bJ\u0010KJ\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0002J\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u0002J\b\u0010\b\u001a\u0004\u0018\u00010\u0001J%\u0010\f\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\t2\u000e\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\n¢\u0006\u0004\b\f\u0010\rJ\u0006\u0010\u000f\u001a\u00020\u000eJ\b\u0010\u0010\u001a\u00020\u0002H\u0016R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0017\u0010\u001a\u001a\u00020\u00158\u0007¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u001f\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010%\u001a\u00020 8\u0007¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010)\u001a\u0004\u0018\u00010&8\u0007¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b\u0012\u0010(R*\u0010.\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n\u0012\u0004\u0012\u00020\u00010*8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b+\u0010-R\u0017\u00102\u001a\u00020/8\u0007¢\u0006\f\n\u0004\b\u0005\u00100\u001a\u0004\b\u001b\u00101R\u0019\u00103\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b#\u0010\u001c\u001a\u0004\b!\u0010\u001eR\u0019\u00105\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b4\u0010\u001eR\u001f\u0010:\u001a\n\u0012\u0004\u0012\u000206\u0018\u00010\u00068\u0007¢\u0006\f\n\u0004\b4\u00107\u001a\u0004\b8\u00109R\u0017\u0010@\u001a\u00020;8\u0007¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R$\u0010D\u001a\u0004\u0018\u00010\u00028\u0007@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001c\u001a\u0004\bA\u0010\u001e\"\u0004\bB\u0010CR\u0011\u0010G\u001a\u00020E8F¢\u0006\u0006\u001a\u0004\b<\u0010FR\u0011\u0010I\u001a\u00020\u00118G¢\u0006\u0006\u001a\u0004\b\u0016\u0010H¨\u0006M"}, d2 = {"Lokhttp3/Request;", "", "", MapSchema.FIELD_NAME_ENTRY, "name", b2n.f, "", "i", "r", ExifInterface.GPS_DIRECTION_TRUE, "Ljava/lang/Class;", "type", "s", "(Ljava/lang/Class;)Ljava/lang/Object;", "Lokhttp3/Request$Builder;", "n", "toString", "Lcom/oplus/aiunit/vision/xo2;", "a", "Lcom/oplus/aiunit/vision/xo2;", "lazyCacheControl", "Lcom/oplus/aiunit/vision/uk9;", "b", "Lcom/oplus/aiunit/vision/uk9;", "t", "()Lcom/oplus/aiunit/vision/uk9;", "url", "c", "Ljava/lang/String;", LogFieldKey.LEVEL_KEY, "()Ljava/lang/String;", "method", "Lcom/oplus/aiunit/vision/gj8;", "d", "Lcom/oplus/aiunit/vision/gj8;", b2n.g, "()Lcom/oplus/aiunit/vision/gj8;", "headers", "Lcom/oplus/aiunit/vision/gqf;", "Lcom/oplus/aiunit/vision/gqf;", "()Lcom/oplus/aiunit/vision/gqf;", "body", "", "f", "Ljava/util/Map;", "()Ljava/util/Map;", UTraceSQLiteHelperKt.COL_TAGS, "", "I", "()I", "connectTimeout", "domain", "j", "ip", "Lokhttp3/Protocol;", "Ljava/util/List;", "o", "()Ljava/util/List;", "protocols", "Lcom/heytap/common/bean/NetworkType;", MapSchema.FIELD_NAME_KEY, "Lcom/heytap/common/bean/NetworkType;", LogFieldKey.MESSAGE_KEY, "()Lcom/heytap/common/bean/NetworkType;", "networkType", LogFieldKey.PROCESS_NAME_KEY, "q", "(Ljava/lang/String;)V", "requestId", "", "()Z", "isHttps", "()Lcom/oplus/aiunit/vision/xo2;", "cacheControl", "<init>", "(Lcom/oplus/aiunit/vision/uk9;Ljava/lang/String;Lcom/oplus/aiunit/vision/gj8;Lcom/oplus/aiunit/vision/gqf;Ljava/util/Map;ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/heytap/common/bean/NetworkType;Ljava/lang/String;)V", "Builder", "okhttp4_extension_release"}, k = 1, mv = {1, 4, 0})
public final class Request {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public xo2 lazyCacheControl;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final uk9 url;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String method;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final gj8 headers;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final gqf body;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final Map<Class<?>, Object> tags;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public final int connectTimeout;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    public final String domain;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    public final String ip;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final List<Protocol> protocols;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final NetworkType networkType;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public String requestId;

    @Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010%\n\u0002\b\u000b\b\u0016\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\ba\u0010bB\u0011\b\u0010\u0012\u0006\u0010c\u001a\u00020.¢\u0006\u0004\ba\u0010dJ\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002J\u0006\u0010\u0006\u001a\u00020\u0005J\b\u0010\b\u001a\u0004\u0018\u00010\u0007J\u0010\u0010\u0006\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0005H\u0016J\u0012\u0010\b\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u0007H\u0016J\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000bJ\b\u0010\r\u001a\u0004\u0018\u00010\u0007J\u0012\u0010\u000e\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007H\u0016J\u0010\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u0012\u0010\r\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u0007H\u0016J\u000e\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0011J\u0010\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0007H\u0016J\u0010\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0014H\u0016J\u0018\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0007H\u0016J\u0018\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0007H\u0016J\u0010\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0007H\u0016J\u0010\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001aH\u0016J\u0010\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001cH\u0016J\b\u0010\u001e\u001a\u00020\u0000H\u0016J\b\u0010\u001f\u001a\u00020\u0000H\u0016J\u0010\u0010\"\u001a\u00020\u00002\u0006\u0010!\u001a\u00020 H\u0016J\u0014\u0010#\u001a\u00020\u00002\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 H\u0017J\u0010\u0010$\u001a\u00020\u00002\u0006\u0010!\u001a\u00020 H\u0016J\u0010\u0010%\u001a\u00020\u00002\u0006\u0010!\u001a\u00020 H\u0016J\u001a\u0010&\u001a\u00020\u00002\u0006\u0010&\u001a\u00020\u00072\b\u0010!\u001a\u0004\u0018\u00010 H\u0016J\u0012\u0010'\u001a\u00020\u00002\b\u0010'\u001a\u0004\u0018\u00010\u0001H\u0016J'\u0010+\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010(2\u000e\u0010*\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000)H\u0016¢\u0006\u0004\b+\u0010,J/\u0010'\u001a\u00020\u0000\"\u0004\b\u0000\u0010(2\u000e\u0010*\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000)2\b\u0010'\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b'\u0010-J\b\u0010/\u001a\u00020.H\u0016R$\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0010\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\"\u0010&\u001a\u00020\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b&\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\"\u0010\u001b\u001a\u00020:8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R$\u0010!\u001a\u0004\u0018\u00010 8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b!\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\"\u0010\u0006\u001a\u00020\u00058\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\b\u00105\u001a\u0004\bJ\u00107\"\u0004\bK\u00109R$\u0010\r\u001a\u0004\u0018\u00010\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\r\u00105\u001a\u0004\bL\u00107\"\u0004\bM\u00109R*\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010N\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR\"\u0010\f\u001a\u00020\u000b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\f\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR$\u0010\u000e\u001a\u0004\u0018\u00010\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000e\u00105\u001a\u0004\bX\u00107\"\u0004\bY\u00109R2\u0010[\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030)\u0012\u0004\u0012\u00020\u00010Z8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`¨\u0006e"}, d2 = {"Lokhttp3/Request$Builder;", "", "", "Lokhttp3/Protocol;", "protocols", "", "connectTimeout", "", "domain", "timeout", "host", "Lcom/heytap/common/bean/NetworkType;", "networkType", "ip", "requestId", "Lcom/oplus/aiunit/vision/uk9;", "url", "Lcom/oplus/aiunit/vision/k7f;", "config", "quicConfig", "Ljava/net/URL;", "name", "value", SpeechConstant.KEY_TTS_REQUEST_HEADER, "addHeader", "removeHeader", "Lcom/oplus/aiunit/vision/gj8;", "headers", "Lcom/oplus/aiunit/vision/xo2;", "cacheControl", ParserTag.TAG_GET, "head", "Lcom/oplus/aiunit/vision/gqf;", "body", "post", "delete", "put", "patch", "method", "tag", ExifInterface.GPS_DIRECTION_TRUE, "Ljava/lang/Class;", "type", "gtag", "(Ljava/lang/Class;)Ljava/lang/Object;", "(Ljava/lang/Class;Ljava/lang/Object;)Lokhttp3/Request$Builder;", "Lokhttp3/Request;", jla.DEFAULT_BUILD_METHOD, "Lcom/oplus/aiunit/vision/uk9;", "getUrl$okhttp4_extension_release", "()Lcom/oplus/aiunit/vision/uk9;", "setUrl$okhttp4_extension_release", "(Lcom/oplus/aiunit/vision/uk9;)V", "Ljava/lang/String;", "getMethod$okhttp4_extension_release", "()Ljava/lang/String;", "setMethod$okhttp4_extension_release", "(Ljava/lang/String;)V", "Lcom/oplus/aiunit/vision/gj8$a;", "Lcom/oplus/aiunit/vision/gj8$a;", "getHeaders$okhttp4_extension_release", "()Lcom/oplus/aiunit/vision/gj8$a;", "setHeaders$okhttp4_extension_release", "(Lcom/oplus/aiunit/vision/gj8$a;)V", "Lcom/oplus/aiunit/vision/gqf;", "getBody$okhttp4_extension_release", "()Lcom/oplus/aiunit/vision/gqf;", "setBody$okhttp4_extension_release", "(Lcom/oplus/aiunit/vision/gqf;)V", "I", "getConnectTimeout$okhttp4_extension_release", "()I", "setConnectTimeout$okhttp4_extension_release", "(I)V", "getDomain$okhttp4_extension_release", "setDomain$okhttp4_extension_release", "getIp$okhttp4_extension_release", "setIp$okhttp4_extension_release", "Ljava/util/List;", "getProtocols$okhttp4_extension_release", "()Ljava/util/List;", "setProtocols$okhttp4_extension_release", "(Ljava/util/List;)V", "Lcom/heytap/common/bean/NetworkType;", "getNetworkType$okhttp4_extension_release", "()Lcom/heytap/common/bean/NetworkType;", "setNetworkType$okhttp4_extension_release", "(Lcom/heytap/common/bean/NetworkType;)V", "getRequestId$okhttp4_extension_release", "setRequestId$okhttp4_extension_release", "", UTraceSQLiteHelperKt.COL_TAGS, "Ljava/util/Map;", "getTags$okhttp4_extension_release", "()Ljava/util/Map;", "setTags$okhttp4_extension_release", "(Ljava/util/Map;)V", "<init>", "()V", "request", "(Lokhttp3/Request;)V", "okhttp4_extension_release"}, k = 1, mv = {1, 4, 0})
    public static class Builder {

        @Nullable
        private gqf body;
        private int connectTimeout;

        @Nullable
        private String domain;

        @NotNull
        private gj8.a headers;

        @Nullable
        private String ip;

        @NotNull
        private String method;

        @NotNull
        private NetworkType networkType;

        @Nullable
        private List<? extends Protocol> protocols;

        @Nullable
        private String requestId;

        @NotNull
        private Map<Class<?>, Object> tags;

        @Nullable
        private uk9 url;

        public Builder() {
            this.networkType = NetworkType.DEFAULT;
            this.tags = new LinkedHashMap();
            this.method = "GET";
            this.headers = new gj8.a();
        }

        public static /* synthetic */ Builder delete$default(Builder builder, gqf gqfVar, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: delete");
            }
            if ((i & 1) != 0) {
                gqfVar = sqk.EMPTY_REQUEST;
            }
            return builder.delete(gqfVar);
        }

        @NotNull
        public Builder addHeader(@NotNull String name, @NotNull String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            this.headers.b(name, value);
            return this;
        }

        @NotNull
        public Request build() {
            nqf.INSTANCE.a(this);
            uk9 uk9Var = this.url;
            if (uk9Var != null) {
                return new Request(uk9Var, this.method, this.headers.g(), this.body, sqk.U(this.tags), this.connectTimeout, this.domain, this.ip, this.protocols, this.networkType, this.requestId);
            }
            throw new IllegalStateException("url == null".toString());
        }

        @NotNull
        public Builder cacheControl(@NotNull xo2 cacheControl) {
            Intrinsics.checkNotNullParameter(cacheControl, "cacheControl");
            String string = cacheControl.toString();
            return string.length() == 0 ? removeHeader(CacheConstants.Word.CACHE_CONTROL) : header(CacheConstants.Word.CACHE_CONTROL, string);
        }

        /* JADX INFO: renamed from: connectTimeout, reason: from getter */
        public final int getConnectTimeout() {
            return this.connectTimeout;
        }

        @JvmOverloads
        @NotNull
        public final Builder delete() {
            return delete$default(this, null, 1, null);
        }

        @Nullable
        /* JADX INFO: renamed from: domain, reason: from getter */
        public final String getDomain() {
            return this.domain;
        }

        @NotNull
        public Builder get() {
            return method("GET", null);
        }

        @Nullable
        /* JADX INFO: renamed from: getBody$okhttp4_extension_release, reason: from getter */
        public final gqf getBody() {
            return this.body;
        }

        public final int getConnectTimeout$okhttp4_extension_release() {
            return this.connectTimeout;
        }

        @Nullable
        public final String getDomain$okhttp4_extension_release() {
            return this.domain;
        }

        @NotNull
        /* JADX INFO: renamed from: getHeaders$okhttp4_extension_release, reason: from getter */
        public final gj8.a getHeaders() {
            return this.headers;
        }

        @Nullable
        /* JADX INFO: renamed from: getIp$okhttp4_extension_release, reason: from getter */
        public final String getIp() {
            return this.ip;
        }

        @NotNull
        /* JADX INFO: renamed from: getMethod$okhttp4_extension_release, reason: from getter */
        public final String getMethod() {
            return this.method;
        }

        @NotNull
        /* JADX INFO: renamed from: getNetworkType$okhttp4_extension_release, reason: from getter */
        public final NetworkType getNetworkType() {
            return this.networkType;
        }

        @Nullable
        public final List<Protocol> getProtocols$okhttp4_extension_release() {
            return this.protocols;
        }

        @Nullable
        /* JADX INFO: renamed from: getRequestId$okhttp4_extension_release, reason: from getter */
        public final String getRequestId() {
            return this.requestId;
        }

        @NotNull
        public final Map<Class<?>, Object> getTags$okhttp4_extension_release() {
            return this.tags;
        }

        @Nullable
        /* JADX INFO: renamed from: getUrl$okhttp4_extension_release, reason: from getter */
        public final uk9 getUrl() {
            return this.url;
        }

        @Nullable
        public <T> T gtag(@NotNull Class<? extends T> type) {
            Intrinsics.checkNotNullParameter(type, "type");
            return type.cast(this.tags.get(type));
        }

        @NotNull
        public Builder head() {
            return method("HEAD", null);
        }

        @NotNull
        public Builder header(@NotNull String name, @NotNull String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            this.headers.k(name, value);
            return this;
        }

        @NotNull
        public Builder headers(@NotNull gj8 headers) {
            Intrinsics.checkNotNullParameter(headers, "headers");
            this.headers = headers.d();
            return this;
        }

        @Nullable
        public final String ip() {
            return this.ip;
        }

        @NotNull
        public Builder method(@NotNull String method, @Nullable gqf body) {
            Intrinsics.checkNotNullParameter(method, "method");
            if (!(method.length() > 0)) {
                throw new IllegalArgumentException("method.isEmpty() == true".toString());
            }
            if (body == null) {
                if (!(true ^ wj9.e(method))) {
                    throw new IllegalArgumentException(("method " + method + " must have a request body.").toString());
                }
            } else if (!wj9.b(method)) {
                throw new IllegalArgumentException(("method " + method + " must not have a request body.").toString());
            }
            this.method = method;
            this.body = body;
            return this;
        }

        @NotNull
        public final Builder networkType(@NotNull NetworkType networkType) {
            Intrinsics.checkNotNullParameter(networkType, "networkType");
            this.networkType = networkType;
            return this;
        }

        @NotNull
        public Builder patch(@NotNull gqf body) {
            Intrinsics.checkNotNullParameter(body, "body");
            return method("PATCH", body);
        }

        @NotNull
        public Builder post(@NotNull gqf body) {
            Intrinsics.checkNotNullParameter(body, "body");
            return method("POST", body);
        }

        @Nullable
        public final List<Protocol> protocols() {
            return this.protocols;
        }

        @NotNull
        public Builder put(@NotNull gqf body) {
            Intrinsics.checkNotNullParameter(body, "body");
            return method("PUT", body);
        }

        @NotNull
        public final Builder quicConfig(@NotNull k7f config) {
            Intrinsics.checkNotNullParameter(config, "config");
            return this;
        }

        @NotNull
        public Builder removeHeader(@NotNull String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.headers.j(name);
            return this;
        }

        @NotNull
        public Builder requestId(@Nullable String requestId) {
            this.requestId = requestId;
            return this;
        }

        public final void setBody$okhttp4_extension_release(@Nullable gqf gqfVar) {
            this.body = gqfVar;
        }

        public final void setConnectTimeout$okhttp4_extension_release(int i) {
            this.connectTimeout = i;
        }

        public final void setDomain$okhttp4_extension_release(@Nullable String str) {
            this.domain = str;
        }

        public final void setHeaders$okhttp4_extension_release(@NotNull gj8.a aVar) {
            Intrinsics.checkNotNullParameter(aVar, "<set-?>");
            this.headers = aVar;
        }

        public final void setIp$okhttp4_extension_release(@Nullable String str) {
            this.ip = str;
        }

        public final void setMethod$okhttp4_extension_release(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.method = str;
        }

        public final void setNetworkType$okhttp4_extension_release(@NotNull NetworkType networkType) {
            Intrinsics.checkNotNullParameter(networkType, "<set-?>");
            this.networkType = networkType;
        }

        public final void setProtocols$okhttp4_extension_release(@Nullable List<? extends Protocol> list) {
            this.protocols = list;
        }

        public final void setRequestId$okhttp4_extension_release(@Nullable String str) {
            this.requestId = str;
        }

        public final void setTags$okhttp4_extension_release(@NotNull Map<Class<?>, Object> map) {
            Intrinsics.checkNotNullParameter(map, "<set-?>");
            this.tags = map;
        }

        public final void setUrl$okhttp4_extension_release(@Nullable uk9 uk9Var) {
            this.url = uk9Var;
        }

        @NotNull
        public Builder tag(@Nullable Object tag) {
            return tag(Object.class, tag);
        }

        @NotNull
        public Builder url(@NotNull uk9 url) {
            Intrinsics.checkNotNullParameter(url, "url");
            this.url = url;
            return this;
        }

        @NotNull
        public Builder connectTimeout(int timeout) {
            this.connectTimeout = timeout;
            return this;
        }

        @JvmOverloads
        @NotNull
        public Builder delete(@Nullable gqf body) {
            return method("DELETE", body);
        }

        @NotNull
        public Builder domain(@Nullable String host) {
            this.domain = host;
            return this;
        }

        @NotNull
        public Builder ip(@Nullable String ip) {
            this.ip = ip;
            return this;
        }

        @NotNull
        public <T> Builder tag(@NotNull Class<? super T> type, @Nullable T tag) {
            Intrinsics.checkNotNullParameter(type, "type");
            if (tag == null) {
                this.tags.remove(type);
            } else {
                if (this.tags.isEmpty()) {
                    this.tags = new LinkedHashMap();
                }
                Map<Class<?>, Object> map = this.tags;
                T tCast = type.cast(tag);
                Intrinsics.checkNotNull(tCast);
                map.put(type, tCast);
            }
            return this;
        }

        @NotNull
        public Builder url(@NotNull String url) {
            Intrinsics.checkNotNullParameter(url, "url");
            if (StringsKt__StringsJVMKt.startsWith(url, "ws:", true)) {
                StringBuilder sb = new StringBuilder();
                sb.append("http:");
                String strSubstring = url.substring(3);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "(this as java.lang.String).substring(startIndex)");
                sb.append(strSubstring);
                url = sb.toString();
            } else if (StringsKt__StringsJVMKt.startsWith(url, "wss:", true)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("https:");
                String strSubstring2 = url.substring(4);
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "(this as java.lang.String).substring(startIndex)");
                sb2.append(strSubstring2);
                url = sb2.toString();
            }
            return url(uk9.INSTANCE.d(url));
        }

        public Builder(@NotNull Request request) {
            Map<Class<?>, Object> mutableMap;
            Intrinsics.checkNotNullParameter(request, "request");
            this.networkType = NetworkType.DEFAULT;
            this.tags = new LinkedHashMap();
            this.url = request.getUrl();
            this.method = request.getMethod();
            this.body = request.getBody();
            if (request.f().isEmpty()) {
                mutableMap = new LinkedHashMap<>();
            } else {
                mutableMap = MapsKt__MapsKt.toMutableMap(request.f());
            }
            this.tags = mutableMap;
            this.headers = request.getHeaders().d();
            this.connectTimeout = request.getConnectTimeout();
            this.domain = request.getDomain();
            this.ip = request.getIp();
            this.protocols = request.o();
            this.networkType = request.getNetworkType();
            this.requestId = request.p();
        }

        @NotNull
        public Builder url(@NotNull URL url) {
            Intrinsics.checkNotNullParameter(url, "url");
            uk9.Companion bVar = uk9.INSTANCE;
            String string = url.toString();
            Intrinsics.checkNotNullExpressionValue(string, "url.toString()");
            return url(bVar.d(string));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Request(@NotNull uk9 url, @NotNull String method, @NotNull gj8 headers, @Nullable gqf gqfVar, @NotNull Map<Class<?>, ? extends Object> tags, int i, @Nullable String str, @Nullable String str2, @Nullable List<? extends Protocol> list, @NotNull NetworkType networkType, @Nullable String str3) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(tags, "tags");
        Intrinsics.checkNotNullParameter(networkType, "networkType");
        this.url = url;
        this.method = method;
        this.headers = headers;
        this.body = gqfVar;
        this.tags = tags;
        this.connectTimeout = i;
        this.domain = str;
        this.ip = str2;
        this.protocols = list;
        this.networkType = networkType;
        this.requestId = str3;
    }

    @JvmName(name = "body")
    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final gqf getBody() {
        return this.body;
    }

    @JvmName(name = "cacheControl")
    @NotNull
    public final xo2 b() {
        xo2 xo2Var = this.lazyCacheControl;
        if (xo2Var != null) {
            return xo2Var;
        }
        xo2 xo2VarB = xo2.INSTANCE.b(this.headers);
        this.lazyCacheControl = xo2VarB;
        return xo2VarB;
    }

    @JvmName(name = "connectTimeout")
    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getConnectTimeout() {
        return this.connectTimeout;
    }

    @JvmName(name = "domain")
    @Nullable
    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getDomain() {
        return this.domain;
    }

    @Nullable
    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getRequestId() {
        return this.requestId;
    }

    @NotNull
    public final Map<Class<?>, Object> f() {
        return this.tags;
    }

    @Nullable
    public final String g(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.headers.a(name);
    }

    @JvmName(name = "headers")
    @NotNull
    /* JADX INFO: renamed from: h, reason: from getter */
    public final gj8 getHeaders() {
        return this.headers;
    }

    @NotNull
    public final List<String> i(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.headers.i(name);
    }

    @JvmName(name = "ip")
    @Nullable
    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getIp() {
        return this.ip;
    }

    public final boolean k() {
        return this.url.getIsHttps();
    }

    @JvmName(name = "method")
    @NotNull
    /* JADX INFO: renamed from: l, reason: from getter */
    public final String getMethod() {
        return this.method;
    }

    @JvmName(name = "networkType")
    @NotNull
    /* JADX INFO: renamed from: m, reason: from getter */
    public final NetworkType getNetworkType() {
        return this.networkType;
    }

    @NotNull
    public final Builder n() {
        return new Builder(this);
    }

    @JvmName(name = "protocols")
    @Nullable
    public final List<Protocol> o() {
        return this.protocols;
    }

    @JvmName(name = "requestId")
    @Nullable
    public final String p() {
        return this.requestId;
    }

    public final void q(@Nullable String str) {
        this.requestId = str;
    }

    @Nullable
    public final Object r() {
        return s(Object.class);
    }

    @Nullable
    public final <T> T s(@NotNull Class<? extends T> type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return type.cast(this.tags.get(type));
    }

    @JvmName(name = "url")
    @NotNull
    /* JADX INFO: renamed from: t, reason: from getter */
    public final uk9 getUrl() {
        return this.url;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Request{method=");
        sb.append(this.method);
        sb.append(", url=");
        sb.append(this.url);
        if (this.headers.size() != 0) {
            sb.append(", headers=[");
            int i = 0;
            for (Pair<? extends String, ? extends String> pair : this.headers) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                Pair<? extends String, ? extends String> pair2 = pair;
                String strComponent1 = pair2.component1();
                String strComponent2 = pair2.component2();
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(strComponent1);
                sb.append(':');
                sb.append(strComponent2);
                i = i2;
            }
            sb.append(']');
        }
        if (!this.tags.isEmpty()) {
            sb.append(", tags=");
            sb.append(this.tags);
        }
        sb.append('}');
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
