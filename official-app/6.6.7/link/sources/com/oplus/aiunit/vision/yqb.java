package com.oplus.aiunit.vision;

import android.os.Handler;
import androidx.core.os.HandlerCompat;
import com.google.protobuf.ByteString;
import com.heytap.wearable.btnet.proto.HttpPackageData;
import com.heytap.wearable.btnet.proto.HttpRequest;
import com.heytap.wearable.btnet.proto.HttpResponse;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;
import com.oppo.bluetooth.btnet.bluetoothproxyserver.utils.HttpDataFactory;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.MediaType;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0014¢\u0006\u0004\b \u0010!J\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0002H\u0002J\b\u0010\b\u001a\u00020\u0002H\u0002J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002R\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001c\u001a\u00020\u00188\u0006X\u0086D¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001f\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u001e¨\u0006\""}, d2 = {"Lcom/oplus/aiunit/vision/yqb;", "", "", "e", "", "timeout", "d", "g", "i", "Lcom/heytap/wearable/btnet/proto/HttpResponse;", "response", "h", "", "a", "J", "requestId", "Lcom/heytap/wearable/btnet/proto/HttpRequest;", "b", "Lcom/heytap/wearable/btnet/proto/HttpRequest;", "request", "Landroid/os/Handler;", "c", "Landroid/os/Handler;", "timeOutHandler", "", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "TAG", "", "Z", "isTimeout", "<init>", "(JLcom/heytap/wearable/btnet/proto/HttpRequest;Landroid/os/Handler;)V", "device_btnet_impl_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nMcuHttpProxyTask.kt\nKotlin\n*S Kotlin\n*F\n+ 1 McuHttpProxyTask.kt\ncom/oppo/bluetooth/btnet/bluetoothproxyserver/McuHttpProxyTask\n+ 2 Handler.kt\nandroidx/core/os/HandlerKt\n*L\n1#1,103:1\n38#2,7:104\n*S KotlinDebug\n*F\n+ 1 McuHttpProxyTask.kt\ncom/oppo/bluetooth/btnet/bluetoothproxyserver/McuHttpProxyTask\n*L\n57#1:104,7\n*E\n"})
public final class yqb {
    public final long a;

    @NotNull
    public final HttpRequest b;

    @NotNull
    public final Handler c;

    @NotNull
    public final String d;
    public volatile boolean e;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "run", "androidx/core/os/HandlerKt$postDelayed$runnable$1"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Handler.kt\nandroidx/core/os/HandlerKt$postDelayed$runnable$1\n+ 2 McuHttpProxyTask.kt\ncom/oppo/bluetooth/btnet/bluetoothproxyserver/McuHttpProxyTask\n*L\n1#1,69:1\n58#2,4:70\n*E\n"})
    public static final class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            m8b.f(yqb.this.getD(), "Http request timeout, requestId=" + yqb.this.a);
            yqb.this.e = true;
            yqb.this.i();
        }
    }

    public yqb(long j, @NotNull HttpRequest httpRequest, @NotNull Handler handler) {
        Intrinsics.checkNotNullParameter(httpRequest, "request");
        Intrinsics.checkNotNullParameter(handler, "timeOutHandler");
        this.a = j;
        this.b = httpRequest;
        this.c = handler;
        this.d = "McuHttpTask";
    }

    public final void d(int timeout) {
        this.c.removeCallbacksAndMessages(this.b);
        Handler handler = this.c;
        long j = ((long) timeout) * 1000;
        HttpRequest httpRequest = this.b;
        a aVar = new a();
        if (httpRequest == null) {
            handler.postDelayed(aVar, j);
        } else {
            HandlerCompat.postDelayed(handler, aVar, httpRequest, j);
        }
    }

    public final void e() {
        itf itfVarL;
        if (this.b.getTimeout() > 0) {
            d(this.b.getTimeout());
        }
        String str = (String) this.b.getReqHeadersMap().get("Content-Type");
        if (str != null) {
            itf.a aVar = itf.Companion;
            byte[] byteArray = this.b.getReqBody().toByteArray();
            Intrinsics.checkNotNullExpressionValue(byteArray, "request.reqBody.toByteArray()");
            itfVarL = itf.a.l(aVar, byteArray, MediaType.Companion.a(str), 0, 0, 6, (Object) null);
        } else {
            itf.a aVar2 = itf.Companion;
            byte[] byteArray2 = this.b.getReqBody().toByteArray();
            Intrinsics.checkNotNullExpressionValue(byteArray2, "request.reqBody.toByteArray()");
            itfVarL = itf.a.l(aVar2, byteArray2, (MediaType) null, 0, 0, 7, (Object) null);
        }
        String reqUrl = this.b.getReqUrl();
        Intrinsics.checkNotNullExpressionValue(reqUrl, "request.reqUrl");
        HttpResponse httpResponseA = new jl9(reqUrl, this.b.getReqMethod(), this.b.getReqHeadersMap(), itfVarL).a();
        g();
        if (!this.e) {
            h(httpResponseA);
            return;
        }
        m8b.f(this.d, "Request finish, but timeout, requestId=" + this.a);
    }

    @NotNull
    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getD() {
        return this.d;
    }

    public final void g() {
        m8b.f(this.d, "Http task remove request timeout, requestId=" + this.a);
        this.c.removeCallbacksAndMessages(this.b);
    }

    public final void h(HttpResponse response) {
        byte[] byteArray = response.toByteArray();
        int length = byteArray.length;
        int i = length / HttpDataFactory.DEF_LENGTH;
        if (length % HttpDataFactory.DEF_LENGTH > 0) {
            i++;
        }
        m8b.f(this.d, "Send http resp, total packet count=" + i);
        int i2 = 0;
        while (i2 < i) {
            HttpPackageData.Builder builderNewBuilder = HttpPackageData.newBuilder();
            builderNewBuilder.setReqId(this.a);
            builderNewBuilder.setPackageTotalCount(i);
            int i3 = i2 + 1;
            builderNewBuilder.setCurrentPackageNum(i3);
            int i4 = i2 * HttpDataFactory.DEF_LENGTH;
            int iMin = Math.min(i4 + HttpDataFactory.DEF_LENGTH, length);
            Intrinsics.checkNotNullExpressionValue(byteArray, "responseBytes");
            builderNewBuilder.setPackageData(ByteString.copyFrom(ArraysKt.copyOfRange(byteArray, i4, iMin)));
            m8b.f(this.d, "Http resp send packet " + i3 + " of " + i);
            xqb.Companion companion = xqb.INSTANCE;
            wl4.devicePrimary.b.b(new MessageEvent(companion.c(), companion.b(), builderNewBuilder.build().toByteArray()));
            i2 = i3;
        }
    }

    public final void i() {
        m8b.f(this.d, "Send http request timeout msg, timeout=" + this.b.getTimeout());
        wqb.INSTANCE.j(this.a, 4);
    }
}
