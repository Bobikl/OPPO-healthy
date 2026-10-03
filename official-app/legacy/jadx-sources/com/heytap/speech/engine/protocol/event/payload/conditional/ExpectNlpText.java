package com.heytap.speech.engine.protocol.event.payload.conditional;

import androidx.annotation.Keep;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 \u00182\u00020\u0001:\u0001\u0019B\u001f\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0003J!\u0010\u0007\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\b\u001a\u00020\u0002HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003R$\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R$\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0014\u0010\u0011\"\u0004\b\u0015\u0010\u0013¨\u0006\u001a"}, d2 = {"Lcom/heytap/speech/engine/protocol/event/payload/conditional/ExpectNlpText;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "", "component1", "component2", "userText", "triggerCondition", "copy", "toString", "", "hashCode", "", "other", "", "equals", "Ljava/lang/String;", "getUserText", "()Ljava/lang/String;", "setUserText", "(Ljava/lang/String;)V", "getTriggerCondition", "setTriggerCondition", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Companion", "a", "protocol_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class ExpectNlpText extends DirectivePayload {

    @NotNull
    public static final String VERSION = "2.0";

    @Nullable
    private String triggerCondition;

    @Nullable
    private String userText;

    /* JADX WARN: Multi-variable type inference failed */
    public ExpectNlpText() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ ExpectNlpText copy$default(ExpectNlpText expectNlpText, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = expectNlpText.userText;
        }
        if ((i & 2) != 0) {
            str2 = expectNlpText.triggerCondition;
        }
        return expectNlpText.copy(str, str2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUserText() {
        return this.userText;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTriggerCondition() {
        return this.triggerCondition;
    }

    @NotNull
    public final ExpectNlpText copy(@Nullable String userText, @Nullable String triggerCondition) {
        return new ExpectNlpText(userText, triggerCondition);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExpectNlpText)) {
            return false;
        }
        ExpectNlpText expectNlpText = (ExpectNlpText) other;
        return Intrinsics.areEqual(this.userText, expectNlpText.userText) && Intrinsics.areEqual(this.triggerCondition, expectNlpText.triggerCondition);
    }

    @Nullable
    public final String getTriggerCondition() {
        return this.triggerCondition;
    }

    @Nullable
    public final String getUserText() {
        return this.userText;
    }

    public int hashCode() {
        String str = this.userText;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.triggerCondition;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setTriggerCondition(@Nullable String str) {
        this.triggerCondition = str;
    }

    public final void setUserText(@Nullable String str) {
        this.userText = str;
    }

    @NotNull
    public String toString() {
        return "ExpectNlpText(userText=" + ((Object) this.userText) + ", triggerCondition=" + ((Object) this.triggerCondition) + ')';
    }

    public /* synthetic */ ExpectNlpText(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }

    public ExpectNlpText(@Nullable String str, @Nullable String str2) {
        this.userText = str;
        this.triggerCondition = str2;
    }
}
