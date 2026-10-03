package com.oplus.aiunit.vision;

import com.google.protobuf.ByteString;
import com.heytap.wearable.btnet.proto.HttpResponse;
import com.oplus.smartenginehelper.ParserTag;
import java.io.Closeable;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.Request;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0018\u0010\u0019J\u0006\u0010\u0003\u001a\u00020\u0002J\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002R\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\tR\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\fR\"\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0016\u0010\t¨\u0006\u001a"}, d2 = {"Lcom/oplus/aiunit/vision/jl9;", "", "Lcom/heytap/wearable/btnet/proto/HttpResponse;", "a", "Ljava/io/Closeable;", "closeable", "", "b", "", "Ljava/lang/String;", qmm.a.l, "", "I", ParserTag.TAG_METHOD, "", "c", "Ljava/util/Map;", "headers", "Lcom/oplus/aiunit/vision/itf;", "d", "Lcom/oplus/aiunit/vision/itf;", "requestBody", "e", "TAG", "<init>", "(Ljava/lang/String;ILjava/util/Map;Lcom/oplus/aiunit/vision/itf;)V", "device_btnet_impl_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nHttpRequestJob.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HttpRequestJob.kt\ncom/oppo/bluetooth/btnet/bluetoothproxyserver/HttpRequestJob\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,98:1\n215#2,2:99\n1855#3,2:101\n*S KotlinDebug\n*F\n+ 1 HttpRequestJob.kt\ncom/oppo/bluetooth/btnet/bluetoothproxyserver/HttpRequestJob\n*L\n46#1:99,2\n71#1:101,2\n*E\n"})
public final class jl9 {

    @NotNull
    public final String a;
    public final int b;

    @Nullable
    public final Map<String, String> c;

    @Nullable
    public final itf d;

    @NotNull
    public final String e;

    public jl9(@NotNull String str, int i, @Nullable Map<String, String> map, @Nullable itf itfVar) {
        Intrinsics.checkNotNullParameter(str, qmm.a.l);
        this.a = str;
        this.b = i;
        this.c = map;
        this.d = itfVar;
        this.e = "HttpRequestJob";
    }

    @NotNull
    public final HttpResponse a() {
        Request.Builder builderPost;
        HttpResponse.Builder builderNewBuilder = HttpResponse.newBuilder();
        int i = this.b;
        if ((i == 2 || i == 4 || i == 9) && this.d == null) {
            m8b.b(this.e, "Http post or put must contains request body");
            builderNewBuilder.setRspCode(3);
            HttpResponse httpResponseBuild = builderNewBuilder.build();
            Intrinsics.checkNotNullExpressionValue(httpResponseBuild, "resultBuilder.build()");
            return httpResponseBuild;
        }
        axf axfVarExecute = null;
        try {
            Request.Builder builder = new Request.Builder();
            builder.url(this.a);
            Map<String, String> map = this.c;
            if (map != null) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    builder.addHeader(entry.getKey(), entry.getValue());
                }
            }
            int i2 = this.b;
            if (i2 == 1) {
                builderPost = builder.get();
            } else if (i2 == 2) {
                itf itfVar = this.d;
                Intrinsics.checkNotNull(itfVar);
                builderPost = builder.post(itfVar);
            } else if (i2 == 3) {
                builderPost = builder.head();
            } else if (i2 == 4) {
                itf itfVar2 = this.d;
                Intrinsics.checkNotNull(itfVar2);
                builderPost = builder.put(itfVar2);
            } else if (i2 == 5) {
                builderPost = builder.delete(this.d);
            } else {
                if (i2 != 9) {
                    m8b.b(this.e, "Http request method not support, method=" + i2);
                    builderNewBuilder.setRspCode(3);
                    HttpResponse httpResponseBuild2 = builderNewBuilder.build();
                    Intrinsics.checkNotNullExpressionValue(httpResponseBuild2, "resultBuilder.build()");
                    HttpResponse httpResponse = httpResponseBuild2;
                    b(null);
                    return httpResponse;
                }
                itf itfVar3 = this.d;
                Intrinsics.checkNotNull(itfVar3);
                builderPost = builder.patch(itfVar3);
            }
            vgd.a aVarY = new vgd.a().Y(true);
            TimeUnit timeUnit = TimeUnit.SECONDS;
            axfVarExecute = aVarY.g(20L, timeUnit).b0(20L, timeUnit).X(20L, timeUnit).c().a(builderPost.build()).execute();
            builderNewBuilder.setRspCode(axfVarExecute.m());
            for (Pair pair : axfVarExecute.u()) {
                m8b.f(this.e, "Resp header, " + pair.getFirst() + "=" + pair.getSecond());
                builderNewBuilder.putRspHeaders((String) pair.getFirst(), (String) pair.getSecond());
            }
            exf exfVarG = axfVarExecute.g();
            if (exfVarG != null) {
                byte[] bArrG = exfVarG.g();
                m8b.f(this.e, "Read response body, size=" + bArrG.length);
                builderNewBuilder.setRspBody(ByteString.copyFrom(bArrG));
            }
        } catch (Throwable th) {
            try {
                m8b.b(this.e, "Http request error=" + th);
                builderNewBuilder.setRspCode(5);
            } catch (Throwable th2) {
                b(null);
                throw th2;
            }
        }
        b(axfVarExecute);
        HttpResponse httpResponseBuild3 = builderNewBuilder.build();
        Intrinsics.checkNotNullExpressionValue(httpResponseBuild3, "resultBuilder.build()");
        return httpResponseBuild3;
    }

    public final void b(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable th) {
                m8b.b(this.e, "Close error=" + th);
            }
        }
    }
}
