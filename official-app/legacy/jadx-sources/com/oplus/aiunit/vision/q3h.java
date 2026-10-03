package com.oplus.aiunit.vision;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 \u00182\u00020\u0001:\u0001\tB)\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0016\u0010\u0017J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\u0014\u0010\f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/oplus/aiunit/vision/q3h;", "Lcom/oplus/aiunit/vision/kr9;", "", "code", "", "message", "Lorg/json/JSONObject;", "obj", "", "a", "", "J", "instanceId", "b", "Ljava/lang/String;", "callbackId", "Lcom/oplus/aiunit/vision/rol;", "c", "Lcom/oplus/aiunit/vision/rol;", "webViewManager", "d", "methodName", "<init>", "(JLjava/lang/String;Lcom/oplus/aiunit/vision/rol;Ljava/lang/String;)V", "Companion", "lib_webpro_release"}, k = 1, mv = {1, 4, 0})
public final class q3h implements kr9 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final long instanceId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final String callbackId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final rol webViewManager;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final String methodName;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 4, 0})
    public static final class b implements Runnable {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ Object f15618j;
        public final /* synthetic */ String k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ JSONObject f15619l;

        public b(Object obj, String str, JSONObject jSONObject) {
            this.f15618j = obj;
            this.k = str;
            this.f15619l = jSONObject;
        }

        @Override // java.lang.Runnable
        public final void run() throws JSONException {
            q7b.a("SimpleCallback", "invoke method: " + q3h.this.methodName + " \n code: " + this.f15618j + " \n message: " + this.k + " \n");
            try {
                rol rolVar = q3h.this.webViewManager;
                long j2 = q3h.this.instanceId;
                String str = q3h.this.callbackId;
                JSONObject jSONObjectPut = new JSONObject().put("code", this.f15618j).put("msg", this.k).put("data", this.f15619l);
                Intrinsics.checkNotNullExpressionValue(jSONObjectPut, "JSONObject()\n           …S_API_CALLBACK_DATA, obj)");
                rolVar.h(j2, str, jSONObjectPut);
            } catch (Exception e2) {
                q7b.g("SimpleCallback", e2);
                rol rolVar2 = q3h.this.webViewManager;
                long j3 = q3h.this.instanceId;
                String str2 = q3h.this.callbackId;
                JSONObject jSONObjectPut2 = new JSONObject().put("code", this.f15618j).put("msg", e2.getMessage());
                Intrinsics.checkNotNullExpressionValue(jSONObjectPut2, "JSONObject()\n           …_CALLBACK_MSG, e.message)");
                rolVar2.h(j3, str2, jSONObjectPut2);
            }
        }
    }

    public q3h(long j2, @NotNull String callbackId, @NotNull rol webViewManager, @Nullable String str) {
        Intrinsics.checkNotNullParameter(callbackId, "callbackId");
        Intrinsics.checkNotNullParameter(webViewManager, "webViewManager");
        this.instanceId = j2;
        this.callbackId = callbackId;
        this.webViewManager = webViewManager;
        this.methodName = str;
    }

    @Override // com.oplus.aiunit.vision.kr9
    public void a(@NotNull Object code, @NotNull String message, @NotNull JSONObject obj) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(obj, "obj");
        lwj.j(new b(code, message, obj));
    }

    @Override // com.oplus.aiunit.vision.kr9
    public void fail(@NotNull Object code, @NotNull String message) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(message, "message");
        kr9.b.a(this, code, message);
    }

    @Override // com.oplus.aiunit.vision.kr9
    public void success(@NotNull JSONObject obj) {
        Intrinsics.checkNotNullParameter(obj, "obj");
        kr9.b.c(this, obj);
    }
}
