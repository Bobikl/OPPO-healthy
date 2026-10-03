package com.oplus.aiunit.vision;

import android.os.Handler;
import android.os.Looper;
import androidx.core.os.HandlerCompat;
import com.google.protobuf.ByteString;
import com.heytap.wearable.btnet.proto.FileUploadPreRequest;
import com.heytap.wearable.btnet.proto.FileUploadResponse;
import com.heytap.wearable.btnet.proto.HttpResponse;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;
import java.io.File;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.MediaType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010 \u001a\u00020\u001c¢\u0006\u0004\b-\u0010.J\u0006\u0010\u0003\u001a\u00020\u0002J\u0018\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\n\u0010\u000b\u001a\u0004\u0018\u00010\u0004H\u0002J\b\u0010\f\u001a\u00020\u0002H\u0002J\b\u0010\r\u001a\u00020\u0002H\u0002J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\u0010\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0004H\u0002J\u0010\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0002J\b\u0010\u0018\u001a\u00020\u0017H\u0002J\u0010\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\u0010\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0015H\u0002R\u0017\u0010 \u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010\"\u001a\u00020\u00048\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0019\u0010!R\u0014\u0010%\u001a\u00020#8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001b\u0010$R\u0018\u0010&\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010!R\u0014\u0010)\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010(R\u0014\u0010*\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010!R\u0018\u0010,\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010!¨\u0006/"}, d2 = {"Lcom/oplus/aiunit/vision/uqb;", "Lcom/oplus/aiunit/vision/ul4$b;", "", "i", "", "macAddress", "Lcom/oplus/aiunit/vision/od7;", "fileTaskInfo", "c", "a", "b", "f", "h", "m", "", "errorCode", "g", "filePath", "n", "Lcom/heytap/wearable/btnet/proto/HttpResponse;", "httpResponse", "Lcom/heytap/wearable/btnet/proto/FileUploadResponse;", "l", "Lcom/heytap/wearable/btnet/proto/FileUploadResponse$Builder;", "e", "j", "response", "k", "Lcom/heytap/wearable/btnet/proto/FileUploadPreRequest;", "Lcom/heytap/wearable/btnet/proto/FileUploadPreRequest;", "getRequest", "()Lcom/heytap/wearable/btnet/proto/FileUploadPreRequest;", "request", "Ljava/lang/String;", "TAG", "", "J", "receiveFileTimeout", "fileTaskId", "Landroid/os/Handler;", "Landroid/os/Handler;", "timeoutHandler", "fileReceiveURI", "o", "fileSavePath", "<init>", "(Lcom/heytap/wearable/btnet/proto/FileUploadPreRequest;)V", "device_btnet_impl_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nMcuFileUploadTask.kt\nKotlin\n*S Kotlin\n*F\n+ 1 McuFileUploadTask.kt\ncom/oppo/bluetooth/btnet/bluetoothproxyserver/McuFileUploadTask\n+ 2 Handler.kt\nandroidx/core/os/HandlerKt\n*L\n1#1,135:1\n38#2,7:136\n*S KotlinDebug\n*F\n+ 1 McuFileUploadTask.kt\ncom/oppo/bluetooth/btnet/bluetoothproxyserver/McuFileUploadTask\n*L\n36#1:136,7\n*E\n"})
public final class uqb implements ul4.b {

    @NotNull
    public final FileUploadPreRequest i;

    @NotNull
    public final String j;
    public final long k;

    @Nullable
    public String l;

    @NotNull
    public final Handler m;

    @NotNull
    public final String n;

    @Nullable
    public volatile String o;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "run", "androidx/core/os/HandlerKt$postDelayed$runnable$1"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Handler.kt\nandroidx/core/os/HandlerKt$postDelayed$runnable$1\n+ 2 McuFileUploadTask.kt\ncom/oppo/bluetooth/btnet/bluetoothproxyserver/McuFileUploadTask\n*L\n1#1,69:1\n37#2,2:70\n*E\n"})
    public static final class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            uqb.this.g(4);
        }
    }

    public uqb(@NotNull FileUploadPreRequest fileUploadPreRequest) {
        Intrinsics.checkNotNullParameter(fileUploadPreRequest, "request");
        this.i = fileUploadPreRequest;
        this.j = tqb.TAG;
        this.k = 20000L;
        this.m = new Handler(Looper.getMainLooper());
        this.n = xqb.MCU_FILE_UPLOAD_URI_PREFIX + fileUploadPreRequest.getReqId();
    }

    public void a(@NotNull String macAddress, @NotNull od7 fileTaskInfo) {
        Intrinsics.checkNotNullParameter(macAddress, "macAddress");
        Intrinsics.checkNotNullParameter(fileTaskInfo, "fileTaskInfo");
    }

    public void b(@NotNull String macAddress, @NotNull od7 fileTaskInfo) {
        Intrinsics.checkNotNullParameter(macAddress, "macAddress");
        Intrinsics.checkNotNullParameter(fileTaskInfo, "fileTaskInfo");
        if (!Intrinsics.areEqual(fileTaskInfo.h(), this.l)) {
            m8b.b(this.j, "On transfer completed, taskId not equal");
            return;
        }
        m();
        if (fileTaskInfo.a() != 0 || this.o == null) {
            j(3);
            return;
        }
        String str = this.o;
        Intrinsics.checkNotNull(str);
        n(str);
    }

    public void c(@NotNull String macAddress, @NotNull od7 fileTaskInfo) {
        Intrinsics.checkNotNullParameter(macAddress, "macAddress");
        Intrinsics.checkNotNullParameter(fileTaskInfo, "fileTaskInfo");
        this.m.removeCallbacksAndMessages(this.i);
        if (!Intrinsics.areEqual(fileTaskInfo.b(), this.i.getFileName())) {
            m8b.b(this.j, "File name not equal, request name:" + this.i.getFileName() + "  actual name:" + fileTaskInfo.b());
            return;
        }
        String strF = f();
        if (strF == null) {
            g(5);
            return;
        }
        this.o = strF + fileTaskInfo.b();
        ul4 ul4Var = wl4.devicePrimary.c;
        String strH = fileTaskInfo.h();
        Intrinsics.checkNotNullExpressionValue(strH, "fileTaskInfo.taskId");
        String str = this.o;
        Intrinsics.checkNotNull(str);
        boolean zReceiveFile = ul4Var.receiveFile(strH, str);
        this.l = fileTaskInfo.h();
        if (zReceiveFile) {
            return;
        }
        g(5);
    }

    public final FileUploadResponse.Builder e() {
        FileUploadResponse.Builder rspType = FileUploadResponse.newBuilder().setReqId(this.i.getReqId()).setRspType(2);
        Intrinsics.checkNotNullExpressionValue(rspType, "newBuilder().setReqId(re…stant.TYPE_HTTP_RESPONSE)");
        return rspType;
    }

    public final String f() {
        File externalFilesDir = e88.a().getExternalFilesDir(null);
        if (externalFilesDir == null) {
            return null;
        }
        return externalFilesDir.getAbsolutePath() + "/mcu_file_upload/";
    }

    public final void g(int errorCode) {
        j(errorCode);
        m();
    }

    public final void h() {
        wl4.devicePrimary.c.m(this.n, this);
    }

    public final void i() {
        h();
        Handler handler = this.m;
        long j = this.k;
        FileUploadPreRequest fileUploadPreRequest = this.i;
        a aVar = new a();
        if (fileUploadPreRequest == null) {
            handler.postDelayed(aVar, j);
        } else {
            HandlerCompat.postDelayed(handler, aVar, fileUploadPreRequest, j);
        }
    }

    public final void j(int errorCode) {
        FileUploadResponse fileUploadResponse = (FileUploadResponse) e().setRspCode(errorCode).build();
        Intrinsics.checkNotNullExpressionValue(fileUploadResponse, "response");
        k(fileUploadResponse);
    }

    public final void k(FileUploadResponse response) {
        hm4 hm4Var = wl4.devicePrimary.b;
        xqb.Companion companion = xqb.INSTANCE;
        hm4Var.b(new MessageEvent(companion.c(), companion.a(), response.toByteArray()));
    }

    public final FileUploadResponse l(HttpResponse httpResponse) {
        FileUploadResponse.Builder rspCode = e().setRspCode(httpResponse.getRspCode());
        Map rspHeadersMap = httpResponse.getRspHeadersMap();
        if (rspHeadersMap != null) {
            rspCode.putAllRspHeaders(rspHeadersMap);
        }
        ByteString rspBody = httpResponse.getRspBody();
        if (rspBody != null) {
            rspCode.setRspBody(rspBody);
        }
        FileUploadResponse fileUploadResponseBuild = rspCode.build();
        Intrinsics.checkNotNullExpressionValue(fileUploadResponseBuild, "builder.build()");
        return fileUploadResponseBuild;
    }

    public final void m() {
        wl4.devicePrimary.c.j(this.n, this);
    }

    public final void n(String filePath) {
        String url = this.i.getUrl();
        Intrinsics.checkNotNullExpressionValue(url, "request.url");
        HttpResponse httpResponseA = new jl9(url, this.i.getReqMethod(), this.i.getReqHeadersMap(), itf.a.i(itf.Companion, new File(filePath), (MediaType) null, 1, (Object) null)).a();
        m8b.f(this.j, "On upload file finish, result_code=" + httpResponseA.getRspCode());
        k(l(httpResponseA));
    }
}
