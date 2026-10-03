package com.heytap.health.wallet.network.script.rsp;

import androidx.annotation.Keep;
import com.heytap.speech.engine.constant.EngineConstant;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000e¨\u0006\u001a"}, d2 = {"Lcom/heytap/health/wallet/network/script/rsp/CommandObject;", "", "index", "", EngineConstant.WAKEUP_TYPE_COMMAND, "checker", "result", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getChecker", "()Ljava/lang/String;", "getCommand", "getIndex", "getResult", "setResult", "(Ljava/lang/String;)V", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "commonlib_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class CommandObject {

    @Nullable
    private final String checker;

    @Nullable
    private final String command;

    @Nullable
    private final String index;

    @Nullable
    private String result;

    public CommandObject(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        this.index = str;
        this.command = str2;
        this.checker = str3;
        this.result = str4;
    }

    public static /* synthetic */ CommandObject copy$default(CommandObject commandObject, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = commandObject.index;
        }
        if ((i & 2) != 0) {
            str2 = commandObject.command;
        }
        if ((i & 4) != 0) {
            str3 = commandObject.checker;
        }
        if ((i & 8) != 0) {
            str4 = commandObject.result;
        }
        return commandObject.copy(str, str2, str3, str4);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getIndex() {
        return this.index;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCommand() {
        return this.command;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getChecker() {
        return this.checker;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getResult() {
        return this.result;
    }

    @NotNull
    public final CommandObject copy(@Nullable String index, @Nullable String command, @Nullable String checker, @Nullable String result) {
        return new CommandObject(index, command, checker, result);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommandObject)) {
            return false;
        }
        CommandObject commandObject = (CommandObject) other;
        return Intrinsics.areEqual(this.index, commandObject.index) && Intrinsics.areEqual(this.command, commandObject.command) && Intrinsics.areEqual(this.checker, commandObject.checker) && Intrinsics.areEqual(this.result, commandObject.result);
    }

    @Nullable
    public final String getChecker() {
        return this.checker;
    }

    @Nullable
    public final String getCommand() {
        return this.command;
    }

    @Nullable
    public final String getIndex() {
        return this.index;
    }

    @Nullable
    public final String getResult() {
        return this.result;
    }

    public int hashCode() {
        String str = this.index;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.command;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.checker;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.result;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final void setResult(@Nullable String str) {
        this.result = str;
    }

    @NotNull
    public String toString() {
        return "CommandObject(index=" + this.index + ", command=" + this.command + ", checker=" + this.checker + ", result=" + this.result + ")";
    }
}
