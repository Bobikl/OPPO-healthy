package com.heytap.speech.engine.protocol.directive.addresslist;

import androidx.annotation.Keep;
import androidx.autofill.HintConstants;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0007\u0018\u0000 %2\u00020\u0001:\u0001&B\u0007¢\u0006\u0004\b#\u0010$R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR$\u0010\r\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R*\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R$\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0004\u001a\u0004\b\u001b\u0010\u0006\"\u0004\b\u001c\u0010\bR$\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0004\u001a\u0004\b\u001e\u0010\u0006\"\u0004\b\u001f\u0010\bR$\u0010 \u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010\u0004\u001a\u0004\b!\u0010\u0006\"\u0004\b\"\u0010\b¨\u0006'"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/addresslist/CreateContact;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "", "contactName", "Ljava/lang/String;", "getContactName", "()Ljava/lang/String;", "setContactName", "(Ljava/lang/String;)V", HintConstants.AUTOFILL_HINT_PHONE_NUMBER, "getPhoneNumber", "setPhoneNumber", "", "userConfirm", "Ljava/lang/Boolean;", "getUserConfirm", "()Ljava/lang/Boolean;", "setUserConfirm", "(Ljava/lang/Boolean;)V", "Ljava/util/ArrayList;", "phoneNumberList", "Ljava/util/ArrayList;", "getPhoneNumberList", "()Ljava/util/ArrayList;", "setPhoneNumberList", "(Ljava/util/ArrayList;)V", "email", "getEmail", "setEmail", "company", "getCompany", "setCompany", "location", "getLocation", "setLocation", "<init>", "()V", "Companion", "a", "protocol_release"}, k = 1, mv = {1, 5, 1})
public final class CreateContact extends DirectivePayload {

    @NotNull
    private static final String VERSION = "2.1";

    @Nullable
    private String company;

    @Nullable
    private String contactName;

    @Nullable
    private String email;

    @Nullable
    private String location;

    @Nullable
    private String phoneNumber;

    @Nullable
    private ArrayList<String> phoneNumberList;

    @Nullable
    private Boolean userConfirm;

    @Nullable
    public final String getCompany() {
        return this.company;
    }

    @Nullable
    public final String getContactName() {
        return this.contactName;
    }

    @Nullable
    public final String getEmail() {
        return this.email;
    }

    @Nullable
    public final String getLocation() {
        return this.location;
    }

    @Nullable
    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    @Nullable
    public final ArrayList<String> getPhoneNumberList() {
        return this.phoneNumberList;
    }

    @Nullable
    public final Boolean getUserConfirm() {
        return this.userConfirm;
    }

    public final void setCompany(@Nullable String str) {
        this.company = str;
    }

    public final void setContactName(@Nullable String str) {
        this.contactName = str;
    }

    public final void setEmail(@Nullable String str) {
        this.email = str;
    }

    public final void setLocation(@Nullable String str) {
        this.location = str;
    }

    public final void setPhoneNumber(@Nullable String str) {
        this.phoneNumber = str;
    }

    public final void setPhoneNumberList(@Nullable ArrayList<String> arrayList) {
        this.phoneNumberList = arrayList;
    }

    public final void setUserConfirm(@Nullable Boolean bool) {
        this.userConfirm = bool;
    }
}
