package com.oplus.aiunit.vision;

import com.oplus.accountsdk.base.account.trace.AcBaseTraceHelper;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bf\u0018\u0000 \u000b2\u00020\u0001:\u0001\bJ\"\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005H&J\u0012\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010\n\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\f"}, d2 = {"Lcom/oplus/aiunit/vision/kr9;", "", "code", "", "message", "Lorg/json/JSONObject;", "obj", "", "a", "success", AcBaseTraceHelper.VAL_FAIL, "Companion", "lib_webpro_jsbridge_release"}, k = 1, mv = {1, 4, 0})
public interface kr9 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.a;

    @NotNull
    public static final String JS_API_CALLBACK_CODE = "code";

    @NotNull
    public static final String JS_API_CALLBACK_DATA = "data";

    @NotNull
    public static final String JS_API_CALLBACK_MSG = "msg";
    public static final int SUCCESS_CODE = 0;

    @NotNull
    public static final String SUCCESS_MESSAGE = "success!";

    /* JADX INFO: renamed from: com.oplus.aiunit.vision.kr9$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0014\u0010\t\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0007¨\u0006\r"}, d2 = {"Lcom/oplus/aiunit/vision/kr9$a;", "", "", "SUCCESS_CODE", "I", "", "SUCCESS_MESSAGE", "Ljava/lang/String;", "JS_API_CALLBACK_CODE", "JS_API_CALLBACK_MSG", "JS_API_CALLBACK_DATA", "<init>", "()V", "lib_webpro_jsbridge_release"}, k = 1, mv = {1, 4, 0})
    public static final class Companion {

        @NotNull
        public static final String JS_API_CALLBACK_CODE = "code";

        @NotNull
        public static final String JS_API_CALLBACK_DATA = "data";

        @NotNull
        public static final String JS_API_CALLBACK_MSG = "msg";
        public static final int SUCCESS_CODE = 0;

        @NotNull
        public static final String SUCCESS_MESSAGE = "success!";
        public static final /* synthetic */ Companion a = new Companion();
    }

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 0})
    public static final class b {
        public static void a(@NotNull kr9 kr9Var, @NotNull Object code, @NotNull String message) {
            Intrinsics.checkNotNullParameter(code, "code");
            Intrinsics.checkNotNullParameter(message, "message");
            b(kr9Var, code, message, null, 4, null);
        }

        public static /* synthetic */ void b(kr9 kr9Var, Object obj, String str, JSONObject jSONObject, int i, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invoke");
            }
            if ((i & 4) != 0) {
                jSONObject = new JSONObject();
            }
            kr9Var.a(obj, str, jSONObject);
        }

        public static void c(@NotNull kr9 kr9Var, @NotNull JSONObject obj) {
            Intrinsics.checkNotNullParameter(obj, "obj");
            kr9Var.a(0, "success!", obj);
        }

        public static /* synthetic */ void d(kr9 kr9Var, JSONObject jSONObject, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: success");
            }
            if ((i & 1) != 0) {
                jSONObject = new JSONObject();
            }
            kr9Var.success(jSONObject);
        }
    }

    void a(@NotNull Object code, @NotNull String message, @NotNull JSONObject obj);

    void fail(@NotNull Object code, @NotNull String message);

    void success(@NotNull JSONObject obj);
}
