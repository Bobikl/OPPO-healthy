package com.oplus.aiunit.vision;

import com.heytap.log.formatter.LogFieldKey;
import io.protostuff.MapSchema;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.charset.Charset;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.Charsets;
import p010kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b'\u0010(J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\u0007\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0005H\u0016J\b\u0010\t\u001a\u00020\u0005H\u0016J\b\u0010\u000b\u001a\u00020\nH&J+\u0010\u0010\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\n2\u0012\u0010\u000f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\r\"\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\u0018\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\nH\u0002R$\u0010\u001e\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010%\u001a\u00020\n8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u0018\u0010&\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010 ¨\u0006)"}, d2 = {"Lcom/oplus/aiunit/vision/s61;", "Lcom/oplus/aiunit/vision/fa2;", "", LogFieldKey.MESSAGE_KEY, "n", "", b2n.g, MapSchema.FIELD_NAME_KEY, "j", "i", "", "f", "topic", "", "", "parts", "a", "(Ljava/lang/String;[[B)V", "Ljava/io/PrintWriter;", "pw", "c", "event", "content", b2n.f, "Lcom/oplus/aiunit/vision/u92;", "Lcom/oplus/aiunit/vision/u92;", "d", "()Lcom/oplus/aiunit/vision/u92;", "setBusClient", "(Lcom/oplus/aiunit/vision/u92;)V", "busClient", "b", "Ljava/lang/String;", MapSchema.FIELD_NAME_ENTRY, "()Ljava/lang/String;", LogFieldKey.LEVEL_KEY, "(Ljava/lang/String;)V", "mState", "mName", "<init>", "()V", "speechEngine_release"}, k = 1, mv = {1, 5, 1})
public abstract class s61 implements fa2 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public u92 busClient;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public volatile String mState = "idle";

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public String mName;

    @Override // com.oplus.aiunit.vision.fa2
    public void a(@NotNull String topic, @NotNull byte[]... parts) throws Exception {
        Intrinsics.checkNotNullParameter(topic, "topic");
        Intrinsics.checkNotNullParameter(parts, "parts");
        if (!Intrinsics.areEqual("bus.event", topic) || parts.length <= 1) {
            return;
        }
        byte[] bArr = parts[0];
        Charset charset = Charsets.UTF_8;
        g(new String(bArr, charset), new String(parts[1], charset));
    }

    public void c(@NotNull PrintWriter pw) {
        Intrinsics.checkNotNullParameter(pw, "pw");
        u92 u92Var = this.busClient;
        if (u92Var != null) {
            u92Var.j(pw);
        }
        pw.println("DUMP OF NODE " + ((Object) this.mName) + ':');
        pw.println("thread state: " + this.mState + '.');
        pw.println();
    }

    @Nullable
    /* JADX INFO: renamed from: d, reason: from getter */
    public final u92 getBusClient() {
        return this.busClient;
    }

    @NotNull
    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getMState() {
        return this.mState;
    }

    @NotNull
    public abstract String f();

    public final void g(String event, String content) {
        if (Intrinsics.areEqual("dump", event)) {
            if (!Intrinsics.areEqual("all", content)) {
                String str = this.mName;
                Intrinsics.checkNotNull(str);
                if (!StringsKt__StringsKt.contains$default((CharSequence) str, (CharSequence) content, false, 2, (Object) null)) {
                    return;
                }
            }
            StringWriter stringWriter = new StringWriter();
            PrintWriter printWriter = new PrintWriter(stringWriter);
            printWriter.println("---------------------------------------------");
            c(printWriter);
            printWriter.println("---------------------------------------------");
            t7b t7bVar = t7b.INSTANCE;
            String strF = f();
            String string = stringWriter.toString();
            Intrinsics.checkNotNullExpressionValue(string, "sw.toString()");
            t7bVar.i(strF, string);
        }
    }

    public void h() {
        t7b.INSTANCE.i(f(), "onCreate");
    }

    public void i() {
        t7b.INSTANCE.i(f(), "onDestroy");
    }

    public void j() {
        t7b.INSTANCE.i(f(), com.alipay.sdk.m.x.d.r);
    }

    public void k() {
        t7b.INSTANCE.i(f(), "onJoin");
    }

    public final void l(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.mState = str;
    }

    public final boolean m() {
        String strF = f();
        this.mName = strF;
        String str = (strF == null || Intrinsics.areEqual(strF, "")) ? "????" : this.mName;
        this.mName = str;
        t7b t7bVar = t7b.INSTANCE;
        t7bVar.b(str, "try to start " + f() + " node, mState: " + this.mState);
        if (Intrinsics.areEqual(this.mState, "wait")) {
            this.mState = "idle";
        }
        if (!Intrinsics.areEqual(this.mState, "idle")) {
            return false;
        }
        this.mState = "busy";
        h();
        t7bVar.b(f(), "node : " + f() + " begin new BusClient");
        this.busClient = new u92(f(), this);
        k();
        return true;
    }

    public final boolean n() {
        t7b.INSTANCE.b(f(), Intrinsics.stringPlus("stop, mState = ", this.mState));
        j();
        u92 u92Var = this.busClient;
        if (u92Var != null) {
            if (u92Var != null) {
                u92Var.i();
            }
            this.busClient = null;
        }
        i();
        this.mState = "wait";
        return true;
    }
}
