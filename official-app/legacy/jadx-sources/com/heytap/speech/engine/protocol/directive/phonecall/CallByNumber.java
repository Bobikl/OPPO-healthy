package com.heytap.speech.engine.protocol.directive.phonecall;

import androidx.annotation.Keep;
import androidx.autofill.HintConstants;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 )2\u00020\u0001:\u0001*B\u0007¢\u0006\u0004\b'\u0010(R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR$\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0004\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR$\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0004\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR$\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0004\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR$\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0004\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR$\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR*\u0010!\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&¨\u0006+"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/phonecall/CallByNumber;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "", HintConstants.AUTOFILL_HINT_PHONE_NUMBER, "Ljava/lang/String;", "getPhoneNumber", "()Ljava/lang/String;", "setPhoneNumber", "(Ljava/lang/String;)V", "phoneName", "getPhoneName", "setPhoneName", "numberType", "getNumberType", "setNumberType", "simIndex", "getSimIndex", "setSimIndex", "soundType", "getSoundType", "setSoundType", "content", "getContent", "setContent", "", "userConfirm", "Ljava/lang/Boolean;", "getUserConfirm", "()Ljava/lang/Boolean;", "setUserConfirm", "(Ljava/lang/Boolean;)V", "Ljava/util/ArrayList;", "Lcom/heytap/speech/engine/protocol/directive/phonecall/PhoneNumber;", "phoneNumberList", "Ljava/util/ArrayList;", "getPhoneNumberList", "()Ljava/util/ArrayList;", "setPhoneNumberList", "(Ljava/util/ArrayList;)V", "<init>", "()V", "Companion", "a", "protocol_release"}, k = 1, mv = {1, 5, 1})
public final class CallByNumber extends DirectivePayload {

    @NotNull
    private static final String VERSION = "2.1";

    @Nullable
    private String content;

    @Nullable
    private String numberType;

    @Nullable
    private String phoneName;

    @Nullable
    private String phoneNumber;

    @Nullable
    private ArrayList<PhoneNumber> phoneNumberList;

    @Nullable
    private String simIndex;

    @Nullable
    private String soundType;

    @Nullable
    private Boolean userConfirm;

    @Nullable
    public final String getContent() {
        return this.content;
    }

    @Nullable
    public final String getNumberType() {
        return this.numberType;
    }

    @Nullable
    public final String getPhoneName() {
        return this.phoneName;
    }

    @Nullable
    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    @Nullable
    public final ArrayList<PhoneNumber> getPhoneNumberList() {
        return this.phoneNumberList;
    }

    @Nullable
    public final String getSimIndex() {
        return this.simIndex;
    }

    @Nullable
    public final String getSoundType() {
        return this.soundType;
    }

    @Nullable
    public final Boolean getUserConfirm() {
        return this.userConfirm;
    }

    public final void setContent(@Nullable String str) {
        this.content = str;
    }

    public final void setNumberType(@Nullable String str) {
        this.numberType = str;
    }

    public final void setPhoneName(@Nullable String str) {
        this.phoneName = str;
    }

    public final void setPhoneNumber(@Nullable String str) {
        this.phoneNumber = str;
    }

    public final void setPhoneNumberList(@Nullable ArrayList<PhoneNumber> arrayList) {
        this.phoneNumberList = arrayList;
    }

    public final void setSimIndex(@Nullable String str) {
        this.simIndex = str;
    }

    public final void setSoundType(@Nullable String str) {
        this.soundType = str;
    }

    public final void setUserConfirm(@Nullable Boolean bool) {
        this.userConfirm = bool;
    }
}
