package com.oplus.aiunit.vision;

import com.heytap.speech.engine.constant.Constant;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.Pair;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004J\u0006\u0010\u0006\u001a\u00020\u0002¨\u0006\t"}, d2 = {"Lcom/oplus/aiunit/vision/gf9;", "", "", "b", "Lkotlin/Pair;", "a", "c", "<init>", "()V", "voiceassistant_impl_release"}, k = 1, mv = {1, 8, 0})
public final class gf9 {

    @NotNull
    public static final gf9 INSTANCE = new gf9();

    @NotNull
    public final Pair<String, String> a() {
        if (qe0.E()) {
            return new Pair<>(Constant.RELEASE_CONNECT_URL, "inOplus");
        }
        return qe0.F() ? new Pair<>(Constant.TEST_CONNECT_URL, Constant.RELEASE_SERVER_NAME) : new Pair<>(Constant.DEV_CONNECT_URL, "v5");
    }

    @NotNull
    public final String b() {
        if (qe0.E()) {
            return "wss://tts.bot.heytapmobi.com/ocs";
        }
        return qe0.F() ? "ws://v-bot-test.wanyol.com/tts_test" : "ws://v-bot-dev.wanyol.com/tts_release";
    }

    @NotNull
    public final String c() {
        if (qe0.E()) {
            return "https://u.bot.heytapmobi.com";
        }
        return qe0.F() ? "https://i-bot-test.wanyol.com" : "https://i-bot-dev.wanyol.com/v5";
    }
}
