package com.heytap.connect_dns.request;

import com.heytap.store.business.rn.service.RnConstant;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010%\n\u0002\b\u000e\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002BE\u0012\u0006\u0010\u0012\u001a\u00020\f\u0012\b\b\u0002\u0010#\u001a\u00020\b\u0012\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u001b\u0012\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u001b¢\u0006\u0004\b'\u0010(J+\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0016\u0010\u0005\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0003¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\n\u001a\u00020\t2\u0014\u0010\u0005\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00020\b0\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0011\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0010R\u0019\u0010\u0012\u001a\u00020\f8\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R4\u0010\u0016\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u000bR%\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u001b8\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR2\u0010\u001f\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00020\b\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u0017\u001a\u0004\b \u0010\u0019\"\u0004\b!\u0010\u000bR%\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u001b8\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001c\u001a\u0004\b\"\u0010\u001eR\u0019\u0010#\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&¨\u0006)"}, d2 = {"Lcom/heytap/connect_dns/request/DnsServerRequest;", "RESULT", "", "Lkotlin/Function1;", "Lcom/heytap/connect_dns/request/ServerHostResponse;", "action", "parse", "(Lkotlin/jvm/functions/Function1;)Lcom/heytap/connect_dns/request/DnsServerRequest;", "", "", "check", "(Lkotlin/jvm/functions/Function1;)V", "", "name", "value", SpeechConstant.KEY_TTS_REQUEST_HEADER, "(Ljava/lang/String;Ljava/lang/String;)V", RnConstant.KEY_INIT_OPTIONS, "path", "Ljava/lang/String;", "getPath", "()Ljava/lang/String;", "parseAction", "Lkotlin/jvm/functions/Function1;", "getParseAction", "()Lkotlin/jvm/functions/Function1;", "setParseAction", "", "Ljava/util/Map;", "getParam", "()Ljava/util/Map;", "checkAction", "getCheckAction", "setCheckAction", "getHeader", "checkSign", "Z", "getCheckSign", "()Z", "<init>", "(Ljava/lang/String;ZLjava/util/Map;Ljava/util/Map;)V", "connect_release"}, k = 1, mv = {1, 5, 1})
public final class DnsServerRequest<RESULT> {

    @Nullable
    private Function1<? super RESULT, Boolean> checkAction;
    private final boolean checkSign;

    @NotNull
    private final Map<String, String> header;

    @NotNull
    private final Map<String, String> param;

    @Nullable
    private Function1<? super ServerHostResponse, ? extends RESULT> parseAction;

    @NotNull
    private final String path;

    public DnsServerRequest(@NotNull String path, boolean z, @NotNull Map<String, String> header, @NotNull Map<String, String> param) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(param, "param");
        this.path = path;
        this.checkSign = z;
        this.header = header;
        this.param = param;
    }

    public final void check(@NotNull Function1<? super RESULT, Boolean> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.checkAction = action;
    }

    @Nullable
    public final Function1<RESULT, Boolean> getCheckAction() {
        return this.checkAction;
    }

    public final boolean getCheckSign() {
        return this.checkSign;
    }

    @NotNull
    public final Map<String, String> getHeader() {
        return this.header;
    }

    @NotNull
    public final Map<String, String> getParam() {
        return this.param;
    }

    @Nullable
    public final Function1<ServerHostResponse, RESULT> getParseAction() {
        return this.parseAction;
    }

    @NotNull
    public final String getPath() {
        return this.path;
    }

    public final void header(@NotNull String name, @NotNull String value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        this.header.put(name, value);
    }

    public final void param(@NotNull String name, @NotNull String value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        this.param.put(name, value);
    }

    @NotNull
    public final DnsServerRequest<RESULT> parse(@NotNull Function1<? super ServerHostResponse, ? extends RESULT> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.parseAction = action;
        return this;
    }

    public final void setCheckAction(@Nullable Function1<? super RESULT, Boolean> function1) {
        this.checkAction = function1;
    }

    public final void setParseAction(@Nullable Function1<? super ServerHostResponse, ? extends RESULT> function1) {
        this.parseAction = function1;
    }

    public /* synthetic */ DnsServerRequest(String str, boolean z, Map map, Map map2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? new LinkedHashMap() : map, (i & 8) != 0 ? new LinkedHashMap() : map2);
    }
}
