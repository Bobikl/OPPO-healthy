package com.oplus.aiunit.vision;

import com.heytap.store.business.rn.service.RnConstant;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import io.protostuff.MapSchema;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010%\n\u0002\b\n\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002BO\u0012\u0006\u0010\u001b\u001a\u00020\n\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0007\u0012\u0014\b\u0002\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0 \u0012\u0014\b\u0002\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0 \u0012\b\b\u0002\u0010'\u001a\u00020\u0007¢\u0006\u0004\b(\u0010)J$\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0016\u0010\u0005\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0003J\u001c\u0010\t\u001a\u00020\b2\u0014\u0010\u0005\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00020\u00070\u0003J\u0016\u0010\r\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nR4\u0010\u0013\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R2\u0010\u0017\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u000e\u001a\u0004\b\u0015\u0010\u0010\"\u0004\b\u0016\u0010\u0012R\u0017\u0010\u001b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u001f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001eR#\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0 8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b!\u0010#R#\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0 8\u0006¢\u0006\f\n\u0004\b%\u0010\"\u001a\u0004\b%\u0010#R\u0017\u0010'\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001d\u001a\u0004\b\u0014\u0010\u001e¨\u0006*"}, d2 = {"Lcom/oplus/aiunit/vision/zx5;", "RESULT", "", "Lkotlin/Function1;", "Lcom/oplus/aiunit/vision/jug;", "action", "j", "", "", "a", "", "name", "value", "i", "Lkotlin/jvm/functions/Function1;", b2n.f, "()Lkotlin/jvm/functions/Function1;", "setParseAction", "(Lkotlin/jvm/functions/Function1;)V", "parseAction", "b", "c", "setCheckAction", "checkAction", "Ljava/lang/String;", b2n.g, "()Ljava/lang/String;", "path", "d", "Z", "()Z", "checkSign", "", MapSchema.FIELD_NAME_ENTRY, "Ljava/util/Map;", "()Ljava/util/Map;", SpeechConstant.KEY_TTS_REQUEST_HEADER, "f", RnConstant.KEY_INIT_OPTIONS, "addTapGlsbHeader", "<init>", "(Ljava/lang/String;ZLjava/util/Map;Ljava/util/Map;Z)V", "com.heytap.nearx.httpdns"}, k = 1, mv = {1, 4, 0})
public final class zx5<RESULT> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public Function1<? super jug, ? extends RESULT> parseAction;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public Function1<? super RESULT, Boolean> checkAction;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String path;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final boolean checkSign;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Map<String, String> header;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final Map<String, String> param;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public final boolean addTapGlsbHeader;

    public zx5(@NotNull String path, boolean z, @NotNull Map<String, String> header, @NotNull Map<String, String> param, boolean z2) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(param, "param");
        this.path = path;
        this.checkSign = z;
        this.header = header;
        this.param = param;
        this.addTapGlsbHeader = z2;
    }

    public final void a(@NotNull Function1<? super RESULT, Boolean> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.checkAction = action;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getAddTapGlsbHeader() {
        return this.addTapGlsbHeader;
    }

    @Nullable
    public final Function1<RESULT, Boolean> c() {
        return this.checkAction;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getCheckSign() {
        return this.checkSign;
    }

    @NotNull
    public final Map<String, String> e() {
        return this.header;
    }

    @NotNull
    public final Map<String, String> f() {
        return this.param;
    }

    @Nullable
    public final Function1<jug, RESULT> g() {
        return this.parseAction;
    }

    @NotNull
    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getPath() {
        return this.path;
    }

    public final void i(@NotNull String name, @NotNull String value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        this.param.put(name, value);
    }

    @NotNull
    public final zx5<RESULT> j(@NotNull Function1<? super jug, ? extends RESULT> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.parseAction = action;
        return this;
    }

    public /* synthetic */ zx5(String str, boolean z, Map map, Map map2, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? new LinkedHashMap() : map, (i & 8) != 0 ? new LinkedHashMap() : map2, (i & 16) != 0 ? false : z2);
    }
}
