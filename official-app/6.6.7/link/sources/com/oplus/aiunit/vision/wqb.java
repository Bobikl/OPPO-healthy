package com.oplus.aiunit.vision;

import android.os.Handler;
import android.os.HandlerThread;
import androidx.core.os.HandlerCompat;
import com.google.protobuf.ByteString;
import com.heytap.health.base.task.ThreadUtils;
import com.heytap.wearable.btnet.proto.HttpPackageData;
import com.heytap.wearable.btnet.proto.HttpRequest;
import com.heytap.wearable.btnet.proto.HttpResponse;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b%\u0010&J\u0006\u0010\u0003\u001a\u00020\u0002J\u0018\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0016\u0010\r\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bJ\u0010\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\u000f\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002J\u0010\u0010\u0011\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002J\u0018\u0010\u0014\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002J\u0018\u0010\u0017\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002R\u0014\u0010\u0019\u001a\u00020\u00048\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0010\u0010\u0018R&\u0010\u001e\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u001b0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001dR \u0010 \u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u001f0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001dR\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006'"}, d2 = {"Lcom/oplus/aiunit/vision/wqb;", "Lcom/oplus/aiunit/vision/hm4$b;", "", "d", "", "mac", "Lcom/oplus/wearable/linkservice/sdk/common/MessageEvent;", "event", "onMessageReceived", "", "requestId", "", "errorCode", "j", "h", "k", "i", "f", "", "data", "c", "Lcom/heytap/wearable/btnet/proto/HttpRequest;", "request", "g", "Ljava/lang/String;", "TAG", "Ljava/util/concurrent/ConcurrentHashMap;", "", "Lcom/heytap/wearable/btnet/proto/HttpPackageData;", "Ljava/util/concurrent/ConcurrentHashMap;", "packetCacheMap", "", "timeoutTokenMap", "Landroid/os/Handler;", "l", "Landroid/os/Handler;", "timeOutHandler", "<init>", "()V", "device_btnet_impl_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nMcuHttpProxy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 McuHttpProxy.kt\ncom/oppo/bluetooth/btnet/bluetoothproxyserver/McuHttpProxy\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Handler.kt\nandroidx/core/os/HandlerKt\n*L\n1#1,190:1\n1855#2,2:191\n1855#2,2:193\n38#3,7:195\n*S KotlinDebug\n*F\n+ 1 McuHttpProxy.kt\ncom/oppo/bluetooth/btnet/bluetoothproxyserver/McuHttpProxy\n*L\n100#1:191,2\n105#1:193,2\n130#1:195,7\n*E\n"})
public final class wqb implements hm4.b {

    @NotNull
    public static final wqb INSTANCE;

    @NotNull
    public static final String i;

    @NotNull
    public static final ConcurrentHashMap<Long, List<HttpPackageData>> j;

    @NotNull
    public static final ConcurrentHashMap<Long, Object> k;

    @NotNull
    public static final Handler l;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "run", "androidx/core/os/HandlerKt$postDelayed$runnable$1"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Handler.kt\nandroidx/core/os/HandlerKt$postDelayed$runnable$1\n+ 2 McuHttpProxy.kt\ncom/oppo/bluetooth/btnet/bluetoothproxyserver/McuHttpProxy\n*L\n1#1,69:1\n131#2,2:70\n*E\n"})
    public static final class a implements Runnable {
        public final /* synthetic */ long i;

        public a(long j) {
            this.i = j;
        }

        @Override // java.lang.Runnable
        public final void run() {
            wqb.INSTANCE.f(this.i);
        }
    }

    static {
        wqb wqbVar = new wqb();
        INSTANCE = wqbVar;
        i = "McuHttpProxy";
        j = new ConcurrentHashMap<>();
        k = new ConcurrentHashMap<>();
        hm4 hm4Var = wl4.devicePrimary.b;
        xqb.Companion companion = xqb.INSTANCE;
        hm4Var.f(companion.c(), companion.b(), wqbVar);
        HandlerThread handlerThread = new HandlerThread("McuHttpProxy");
        handlerThread.start();
        l = new Handler(handlerThread.getLooper());
    }

    public static final void e(MessageEvent messageEvent) {
        Intrinsics.checkNotNullParameter(messageEvent, "$event");
        INSTANCE.h(messageEvent);
    }

    public final void c(long requestId, byte[] data) {
        HttpRequest from;
        if (!jrc.c()) {
            m8b.f(i, "Forward http request, but phone no network");
            j(requestId, 1);
            return;
        }
        m8b.f(i, "Forward http request, requestId=" + requestId);
        try {
            from = HttpRequest.parseFrom(data);
        } catch (Throwable th) {
            m8b.b(i, "Parse http request fail=" + th);
            from = null;
        }
        if (from != null) {
            g(requestId, from);
            new yqb(requestId, from, l).e();
        } else {
            m8b.b(i, "Parse http request is null");
            j(requestId, 3);
        }
    }

    public final void d() {
        m8b.f(i, "McuHttpProxy init");
    }

    public final void f(long requestId) {
        m8b.f(i, "On request packet timeout, requestId=" + requestId);
        j.remove(Long.valueOf(requestId));
        j(requestId, 3);
    }

    public final void g(long requestId, HttpRequest request) {
        String reqUrl = request.getReqUrl();
        int reqMethod = request.getReqMethod();
        int size = request.getReqBody().size();
        int timeout = request.getTimeout();
        StringBuilder sb = new StringBuilder();
        sb.append("Forward http requestId=");
        sb.append(requestId);
        sb.append(", url=");
        sb.append(reqUrl);
        sb.append(", method=");
        sb.append(reqMethod);
        sb.append(", bodySize=");
        sb.append(size);
        sb.append(", timeout=");
        sb.append(timeout);
        String strB = v2e.b(request.getReqHeadersMap());
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Forward http requestId=");
        sb2.append(requestId);
        sb2.append(", Headers=");
        sb2.append(strB);
    }

    public final void h(MessageEvent event) {
        try {
            HttpPackageData from = HttpPackageData.parseFrom(event.getData());
            String str = i;
            m8b.f(str, "Receive http packet, requestId=" + from.getReqId() + " totalSize=" + from.getPackageTotalCount() + ", currentNum=" + from.getCurrentPackageNum());
            long reqId = from.getReqId();
            if (from.getCurrentPackageNum() > from.getPackageTotalCount()) {
                m8b.b(str, "Http packet currentPackageNum > packageTotalCount");
                j(reqId, 3);
                j.remove(Long.valueOf(reqId));
                return;
            }
            if (from.getPackageTotalCount() == 1) {
                byte[] byteArray = from.getPackageData().toByteArray();
                Intrinsics.checkNotNullExpressionValue(byteArray, "packetData.packageData.toByteArray()");
                c(reqId, byteArray);
                return;
            }
            ConcurrentHashMap<Long, List<HttpPackageData>> concurrentHashMap = j;
            List<HttpPackageData> arrayList = concurrentHashMap.get(Long.valueOf(reqId));
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                concurrentHashMap.put(Long.valueOf(reqId), arrayList);
            }
            arrayList.add(from);
            if (from.getCurrentPackageNum() < from.getPackageTotalCount()) {
                k(reqId);
                return;
            }
            if (from.getCurrentPackageNum() != from.getPackageTotalCount() || arrayList.size() != from.getPackageTotalCount()) {
                m8b.b(str, "Http packet error ???");
                return;
            }
            m8b.f(str, "Request packet is OK, remove packet timeout check, requestId=" + reqId);
            i(reqId);
            List<HttpPackageData> listRemove = concurrentHashMap.remove(Long.valueOf(reqId));
            Intrinsics.checkNotNull(listRemove);
            List<HttpPackageData> list = listRemove;
            Iterator<T> it = list.iterator();
            int size = 0;
            while (it.hasNext()) {
                size += ((HttpPackageData) it.next()).getPackageData().size();
            }
            byte[] bArr = new byte[size];
            int i2 = 0;
            for (HttpPackageData httpPackageData : list) {
                int size2 = httpPackageData.getPackageData().size();
                System.arraycopy(httpPackageData.getPackageData(), 0, bArr, i2, size2);
                i2 += size2;
            }
            c(reqId, bArr);
        } catch (Throwable th) {
            m8b.b(i, "Parse http packet error=" + th);
        }
    }

    public final void i(long requestId) {
        Object objRemove = k.remove(Long.valueOf(requestId));
        if (objRemove != null) {
            l.removeCallbacksAndMessages(objRemove);
        }
    }

    public final void j(long requestId, int errorCode) {
        byte[] byteArray = HttpPackageData.newBuilder().setReqId(requestId).setPackageTotalCount(1).setCurrentPackageNum(1).setPackageData(ByteString.copyFrom(HttpResponse.newBuilder().setRspCode(errorCode).build().toByteArray())).build().toByteArray();
        xqb.Companion companion = xqb.INSTANCE;
        wl4.devicePrimary.b.b(new MessageEvent(companion.c(), companion.b(), byteArray));
    }

    public final void k(long requestId) {
        m8b.f(i, "Update request packet timeout, requestId=" + requestId);
        ConcurrentHashMap<Long, Object> concurrentHashMap = k;
        Object obj = concurrentHashMap.get(Long.valueOf(requestId));
        if (obj == null) {
            obj = new Object();
            concurrentHashMap.put(Long.valueOf(requestId), obj);
        }
        Handler handler = l;
        handler.removeCallbacksAndMessages(obj);
        HandlerCompat.postDelayed(handler, new a(requestId), obj, 10000L);
    }

    public void onMessageReceived(@NotNull String mac, @NotNull final MessageEvent event) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        Intrinsics.checkNotNullParameter(event, "event");
        ThreadUtils.doInBackground(new Runnable() { // from class: com.oplus.aiunit.vision.vqb
            @Override // java.lang.Runnable
            public final void run() {
                wqb.e(event);
            }
        });
    }
}
