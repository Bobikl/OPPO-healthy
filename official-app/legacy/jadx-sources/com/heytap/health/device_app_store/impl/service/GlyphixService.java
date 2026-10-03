package com.heytap.health.device_app_store.impl.service;

import android.content.Context;
import android.icu.util.TimeZone;
import android.os.IInterface;
import com.glyphix.mas.Glyphix;
import com.glyphix.mas.GxMas;
import com.glyphix.mas.api.GxTime;
import com.glyphix.mas.callback.GlyphixResolver;
import com.heytap.health.devicemanager.deviceability.DeviceInfo;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.bm5;
import com.oplus.aiunit.vision.cm9;
import com.oplus.aiunit.vision.gdb;
import com.oplus.aiunit.vision.gl4;
import com.oplus.aiunit.vision.l9d;
import com.oplus.aiunit.vision.la5;
import com.oplus.aiunit.vision.lc5;
import com.oplus.aiunit.vision.qe0;
import com.oplus.aiunit.vision.rl4;
import com.oplus.aiunit.vision.ul4;
import com.oplus.aiunit.vision.uo5;
import com.oplus.wearable.linkservice.sdk.Node;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;
import io.protostuff.MapSchema;
import java.io.File;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p010kotlin.KotlinNothingValueException;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u00042\u00020\u0005:\u0001&B\u0007¢\u0006\u0004\b$\u0010%J\b\u0010\u0006\u001a\u00020\u0002H\u0016J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\u000b\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0018\u0010\u0010\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u0012\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016J\u0010\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016J\u0010\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016J\b\u0010\u0019\u001a\u00020\tH\u0002R\u0014\u0010\u001c\u001a\u00020\f8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u00138\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010!\u001a\u00020\u00138\u0002X\u0082D¢\u0006\u0006\n\u0004\b \u0010\u001eR\u0014\u0010#\u001a\u00020\u00138\u0002X\u0082D¢\u0006\u0006\n\u0004\b\"\u0010\u001e¨\u0006'"}, d2 = {"Lcom/heytap/health/device_app_store/impl/service/GlyphixService;", "Lcom/oplus/aiunit/vision/cm9;", "Landroid/os/IInterface;", "Lcom/oplus/aiunit/vision/rl4$b;", "Lcom/glyphix/mas/GxMas$WriteCallback;", "Lcom/oplus/aiunit/vision/ul4$a;", "d", "Landroid/content/Context;", "context", "", "c", "b", "", "mac", "Lcom/oplus/wearable/linkservice/sdk/common/MessageEvent;", "event", "onMessageReceived", "", "data", "", "write", "Lcom/oplus/wearable/linkservice/sdk/Node;", l9d.BUNDLE_KEY_NODE, "onPeerConnected", "onPeerDisconnected", b2n.g, "i", "Ljava/lang/String;", "TAG", "j", "I", "SID", MapSchema.FIELD_NAME_KEY, "CID", LogFieldKey.LEVEL_KEY, "SUCCESS", "<init>", "()V", "a", "device_app_store_impl_release"}, k = 1, mv = {1, 8, 0})
public final class GlyphixService implements cm9<IInterface>, rl4.b, GxMas.WriteCallback, ul4.a {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final String TAG = "GlyphixService";

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public final int SID = 102;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public final int CID = 1;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public final int SUCCESS;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Lcom/heytap/health/device_app_store/impl/service/GlyphixService$a;", "Lcom/oplus/aiunit/vision/uo5;", "Lcom/heytap/health/device_manager_base/b;", "bean", "", "d", "<init>", "()V", "device_app_store_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class a implements uo5 {
        @Override // com.oplus.aiunit.vision.c01
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean c(@NotNull com.heytap.health.device_manager_base.b bean) {
            Intrinsics.checkNotNullParameter(bean, "bean");
            return bean.C0() && bean.a2();
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"com/heytap/health/device_app_store/impl/service/GlyphixService$b", "Lcom/glyphix/mas/callback/GlyphixResolver;", "Lorg/json/JSONObject;", "result", "", "onSuccess", "(Lorg/json/JSONObject;)Ljava/lang/Integer;", "onFailed", "device_app_store_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class b implements GlyphixResolver {
        public b() {
        }

        @Override // com.glyphix.mas.callback.GlyphixResolver
        @NotNull
        public Integer onFailed(@Nullable JSONObject result) {
            String unused = GlyphixService.this.TAG;
            String string = result != null ? result.toString() : null;
            StringBuilder sb = new StringBuilder();
            sb.append("onPeerConnected callback onFailed ");
            sb.append(string);
            return Integer.valueOf(GlyphixService.this.SUCCESS);
        }

        @Override // com.glyphix.mas.callback.GlyphixResolver
        @NotNull
        public Integer onSuccess(@Nullable JSONObject result) {
            String unused = GlyphixService.this.TAG;
            String string = result != null ? result.toString() : null;
            StringBuilder sb = new StringBuilder();
            sb.append("onPeerConnected callback onSuccess ");
            sb.append(string);
            GlyphixService.this.h();
            return Integer.valueOf(GlyphixService.this.SUCCESS);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"com/heytap/health/device_app_store/impl/service/GlyphixService$c", "Lcom/glyphix/mas/callback/GlyphixResolver;", "Lorg/json/JSONObject;", "result", "", "onSuccess", "(Lorg/json/JSONObject;)Ljava/lang/Integer;", "onFailed", "device_app_store_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class c implements GlyphixResolver {
        public c() {
        }

        @Override // com.glyphix.mas.callback.GlyphixResolver
        @NotNull
        public Integer onFailed(@Nullable JSONObject result) {
            String unused = GlyphixService.this.TAG;
            String string = result != null ? result.toString() : null;
            StringBuilder sb = new StringBuilder();
            sb.append("onPeerDisconnected callback onFailed ");
            sb.append(string);
            return Integer.valueOf(GlyphixService.this.SUCCESS);
        }

        @Override // com.glyphix.mas.callback.GlyphixResolver
        @NotNull
        public Integer onSuccess(@Nullable JSONObject result) {
            String unused = GlyphixService.this.TAG;
            String string = result != null ? result.toString() : null;
            StringBuilder sb = new StringBuilder();
            sb.append("onPeerDisconnected callback onSuccess ");
            sb.append(string);
            return Integer.valueOf(GlyphixService.this.SUCCESS);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"com/heytap/health/device_app_store/impl/service/GlyphixService$d", "Lcom/glyphix/mas/callback/GlyphixResolver;", "Lorg/json/JSONObject;", "result", "", "onSuccess", "(Lorg/json/JSONObject;)Ljava/lang/Integer;", "onFailed", "device_app_store_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class d implements GlyphixResolver {
        public d() {
        }

        @Override // com.glyphix.mas.callback.GlyphixResolver
        @NotNull
        public Integer onFailed(@Nullable JSONObject result) {
            String unused = GlyphixService.this.TAG;
            String string = result != null ? result.toString() : null;
            StringBuilder sb = new StringBuilder();
            sb.append("syncTime onFailed ");
            sb.append(string);
            return Integer.valueOf(GlyphixService.this.SUCCESS);
        }

        @Override // com.glyphix.mas.callback.GlyphixResolver
        @NotNull
        public Integer onSuccess(@Nullable JSONObject result) {
            String unused = GlyphixService.this.TAG;
            String string = result != null ? result.toString() : null;
            StringBuilder sb = new StringBuilder();
            sb.append("syncTime onSuccess ");
            sb.append(string);
            return Integer.valueOf(GlyphixService.this.SUCCESS);
        }
    }

    @Override // com.oplus.aiunit.vision.cm9
    public void b(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        a7b.f(this.TAG, "onDestroy");
        Glyphix.setWriteCallback(null);
        Glyphix.uninit();
        bm5 bm5Var = gl4.devicePrimary;
        bm5Var.messageApi.t(this.SID, this.CID, this);
        bm5Var.nodeApi.d(this);
    }

    @Override // com.oplus.aiunit.vision.cm9
    public void c(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        File fileA = la5.a();
        if (!fileA.exists()) {
            fileA.mkdirs();
        }
        int iInit = Glyphix.init(context, fileA.getAbsolutePath());
        a7b.f(this.TAG, "onCreate init " + iInit);
        Glyphix.setWriteCallback(this);
        Glyphix.enableLogLevel(qe0.z() ? Glyphix.MasLogLevel.WARN : Glyphix.MasLogLevel.INFO, Boolean.FALSE);
        bm5 bm5Var = gl4.devicePrimary;
        bm5Var.messageApi.f(this.SID, this.CID, this);
        bm5Var.nodeApi.g(this);
    }

    @Override // com.oplus.aiunit.vision.cm9
    @NotNull
    public IInterface d() {
        Intrinsics.checkNotNull(null);
        throw new KotlinNothingValueException();
    }

    public final void h() {
        GxTime.sync(Long.valueOf(System.currentTimeMillis() / ((long) 1000)), Integer.valueOf(TimeZone.getDefault().getRawOffset() / 60000), new d());
    }

    @Override // com.oplus.aiunit.vision.rl4.b
    public void onMessageReceived(@NotNull String mac, @NotNull MessageEvent event) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        Intrinsics.checkNotNullParameter(event, "event");
        String strA = gdb.a(mac);
        StringBuilder sb = new StringBuilder();
        sb.append("onMessageReceived ");
        sb.append(strA);
        sb.append(" ");
        sb.append(event);
        Glyphix.readData(event.getData());
    }

    @Override // com.oplus.aiunit.vision.ul4.a
    public void onPeerConnected(@NotNull Node node) {
        Intrinsics.checkNotNullParameter(node, "node");
        if (((Boolean) lc5.c(node.getNodeId()).a(new Function1<DeviceInfo, Boolean>() { // from class: com.heytap.health.device_app_store.impl.service.GlyphixService.onPeerConnected.1
            @Override // p010kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull DeviceInfo applyInfo) {
                Intrinsics.checkNotNullParameter(applyInfo, "$this$applyInfo");
                return Boolean.valueOf(applyInfo.C0() && applyInfo.a2());
            }
        })).booleanValue()) {
            Glyphix.linkStatusChange(true, new b());
        }
    }

    @Override // com.oplus.aiunit.vision.ul4.a
    public void onPeerDisconnected(@NotNull Node node) {
        Intrinsics.checkNotNullParameter(node, "node");
        if (((Boolean) lc5.c(node.getNodeId()).a(new Function1<DeviceInfo, Boolean>() { // from class: com.heytap.health.device_app_store.impl.service.GlyphixService.onPeerDisconnected.1
            @Override // p010kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull DeviceInfo applyInfo) {
                Intrinsics.checkNotNullParameter(applyInfo, "$this$applyInfo");
                return Boolean.valueOf(applyInfo.C0() && applyInfo.a2());
            }
        })).booleanValue()) {
            Glyphix.linkStatusChange(true, new c());
        }
    }

    @Override // com.glyphix.mas.GxMas.WriteCallback
    public int write(@Nullable byte[] data) {
        gl4.devicePrimary.messageApi.a(gl4.managerApi.getCurrActiveMac(), new MessageEvent(this.SID, this.CID, data));
        return this.SUCCESS;
    }
}
