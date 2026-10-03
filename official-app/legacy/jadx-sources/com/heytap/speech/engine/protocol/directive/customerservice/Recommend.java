package com.heytap.speech.engine.protocol.directive.customerservice;

import androidx.annotation.Keep;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0007\u0018\u0000  2\u00020\u0001:\u0001!B\u0007¢\u0006\u0004\b\u001e\u0010\u001fR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR6\u0010\u000e\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0018\u00010\fj\n\u0012\u0004\u0012\u00020\u0002\u0018\u0001`\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R$\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR6\u0010\u001b\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0018\u00010\fj\n\u0012\u0004\u0012\u00020\u0002\u0018\u0001`\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u000f\u001a\u0004\b\u001c\u0010\u0011\"\u0004\b\u001d\u0010\u0013¨\u0006\""}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/customerservice/Recommend;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "", "reply", "Ljava/lang/String;", "getReply", "()Ljava/lang/String;", "setReply", "(Ljava/lang/String;)V", "tts", "getTts", "setTts", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "recommendList", "Ljava/util/ArrayList;", "getRecommendList", "()Ljava/util/ArrayList;", "setRecommendList", "(Ljava/util/ArrayList;)V", "", "disabled", "Ljava/lang/Boolean;", "getDisabled", "()Ljava/lang/Boolean;", "setDisabled", "(Ljava/lang/Boolean;)V", "recommendQueryList", "getRecommendQueryList", "setRecommendQueryList", "<init>", "()V", "Companion", "a", "protocol_release"}, k = 1, mv = {1, 5, 1})
public final class Recommend extends DirectivePayload {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String VERSION = "2.3";

    @Nullable
    private Boolean disabled;

    @Nullable
    private ArrayList<String> recommendList;

    @Nullable
    private ArrayList<String> recommendQueryList;

    @Nullable
    private String reply;

    @Nullable
    private String tts;

    /* JADX INFO: renamed from: com.heytap.speech.engine.protocol.directive.customerservice.Recommend$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0086D¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/customerservice/Recommend$a;", "", "", "VERSION", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "<init>", "()V", "protocol_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String a() {
            return Recommend.VERSION;
        }
    }

    @Nullable
    public final Boolean getDisabled() {
        return this.disabled;
    }

    @Nullable
    public final ArrayList<String> getRecommendList() {
        return this.recommendList;
    }

    @Nullable
    public final ArrayList<String> getRecommendQueryList() {
        return this.recommendQueryList;
    }

    @Nullable
    public final String getReply() {
        return this.reply;
    }

    @Nullable
    public final String getTts() {
        return this.tts;
    }

    public final void setDisabled(@Nullable Boolean bool) {
        this.disabled = bool;
    }

    public final void setRecommendList(@Nullable ArrayList<String> arrayList) {
        this.recommendList = arrayList;
    }

    public final void setRecommendQueryList(@Nullable ArrayList<String> arrayList) {
        this.recommendQueryList = arrayList;
    }

    public final void setReply(@Nullable String str) {
        this.reply = str;
    }

    public final void setTts(@Nullable String str) {
        this.tts = str;
    }
}
