package com.heytap.store.product_support.data;

import androidx.annotation.Keep;
import com.oplus.accountsdk.open.core.web.executor.AcOpenGetTokenExecutor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b)\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0019\"\u0004\b\u001d\u0010\u001bR\u001e\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0086\u000e¢\u0006\u0010\n\u0002\u0010$\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001a\u0010%\u001a\u00020\u001fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u001a\u0010*\u001a\u00020\u001fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010'\"\u0004\b,\u0010)R\u001a\u0010-\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0006\"\u0004\b/\u0010\bR\u001a\u00100\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u0014\"\u0004\b2\u0010\u0016R\u001a\u00103\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u0006\"\u0004\b5\u0010\bR\u001a\u00106\u001a\u00020\u001fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010'\"\u0004\b8\u0010)R\u001a\u00109\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010\u0014\"\u0004\b;\u0010\u0016R\u001a\u0010<\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010\u0006\"\u0004\b>\u0010\bR\u001a\u0010?\u001a\u00020\u001fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010'\"\u0004\bA\u0010)R\u001a\u0010B\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010\u0006\"\u0004\bD\u0010\bR\u001a\u0010E\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bF\u0010\u0006\"\u0004\bG\u0010\b¨\u0006H"}, d2 = {"Lcom/heytap/store/product_support/data/LiveInfoVoBean;", "", "()V", "accountLogo", "", "getAccountLogo", "()Ljava/lang/String;", "setAccountLogo", "(Ljava/lang/String;)V", AcOpenGetTokenExecutor.ACCOUNT_NAME_KEY, "getAccountName", "setAccountName", "backgroundUrl", "getBackgroundUrl", "setBackgroundUrl", "introduction", "getIntroduction", "setIntroduction", "isAdvance", "", "()I", "setAdvance", "(I)V", "isCanSubscribe", "", "()Z", "setCanSubscribe", "(Z)V", "isSubscribe", "setSubscribe", "lookNum", "", "getLookNum", "()Ljava/lang/Long;", "setLookNum", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "nowTime", "getNowTime", "()J", "setNowTime", "(J)V", "planStartTime", "getPlanStartTime", "setPlanStartTime", "posterUrl", "getPosterUrl", "setPosterUrl", "pullType", "getPullType", "setPullType", "pullUrl", "getPullUrl", "setPullUrl", "roomId", "getRoomId", "setRoomId", "status", "getStatus", "setStatus", "streamCode", "getStreamCode", "setStreamCode", "streamId", "getStreamId", "setStreamId", "streamJumpUrl", "getStreamJumpUrl", "setStreamJumpUrl", "title", "getTitle", "setTitle", "product-support_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class LiveInfoVoBean {
    private boolean isSubscribe;
    private long nowTime;
    private long planStartTime;
    private long roomId;
    private long streamId;

    @Nullable
    private Long lookNum = 0L;

    @NotNull
    private String accountLogo = "";

    @NotNull
    private String accountName = "";

    @NotNull
    private String streamCode = "";

    @NotNull
    private String streamJumpUrl = "";
    private int status = -1;

    @NotNull
    private String pullUrl = "";
    private int pullType = -1;

    @NotNull
    private String introduction = "";

    @NotNull
    private String title = "";

    @NotNull
    private String backgroundUrl = "";

    @NotNull
    private String posterUrl = "";
    private boolean isCanSubscribe = true;
    private int isAdvance = -1;

    @NotNull
    public final String getAccountLogo() {
        return this.accountLogo;
    }

    @NotNull
    public final String getAccountName() {
        return this.accountName;
    }

    @NotNull
    public final String getBackgroundUrl() {
        return this.backgroundUrl;
    }

    @NotNull
    public final String getIntroduction() {
        return this.introduction;
    }

    @Nullable
    public final Long getLookNum() {
        return this.lookNum;
    }

    public final long getNowTime() {
        return this.nowTime;
    }

    public final long getPlanStartTime() {
        return this.planStartTime;
    }

    @NotNull
    public final String getPosterUrl() {
        return this.posterUrl;
    }

    public final int getPullType() {
        return this.pullType;
    }

    @NotNull
    public final String getPullUrl() {
        return this.pullUrl;
    }

    public final long getRoomId() {
        return this.roomId;
    }

    public final int getStatus() {
        return this.status;
    }

    @NotNull
    public final String getStreamCode() {
        return this.streamCode;
    }

    public final long getStreamId() {
        return this.streamId;
    }

    @NotNull
    public final String getStreamJumpUrl() {
        return this.streamJumpUrl;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: isAdvance, reason: from getter */
    public final int getIsAdvance() {
        return this.isAdvance;
    }

    /* JADX INFO: renamed from: isCanSubscribe, reason: from getter */
    public final boolean getIsCanSubscribe() {
        return this.isCanSubscribe;
    }

    /* JADX INFO: renamed from: isSubscribe, reason: from getter */
    public final boolean getIsSubscribe() {
        return this.isSubscribe;
    }

    public final void setAccountLogo(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.accountLogo = str;
    }

    public final void setAccountName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.accountName = str;
    }

    public final void setAdvance(int i) {
        this.isAdvance = i;
    }

    public final void setBackgroundUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.backgroundUrl = str;
    }

    public final void setCanSubscribe(boolean z) {
        this.isCanSubscribe = z;
    }

    public final void setIntroduction(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.introduction = str;
    }

    public final void setLookNum(@Nullable Long l2) {
        this.lookNum = l2;
    }

    public final void setNowTime(long j2) {
        this.nowTime = j2;
    }

    public final void setPlanStartTime(long j2) {
        this.planStartTime = j2;
    }

    public final void setPosterUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.posterUrl = str;
    }

    public final void setPullType(int i) {
        this.pullType = i;
    }

    public final void setPullUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.pullUrl = str;
    }

    public final void setRoomId(long j2) {
        this.roomId = j2;
    }

    public final void setStatus(int i) {
        this.status = i;
    }

    public final void setStreamCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.streamCode = str;
    }

    public final void setStreamId(long j2) {
        this.streamId = j2;
    }

    public final void setStreamJumpUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.streamJumpUrl = str;
    }

    public final void setSubscribe(boolean z) {
        this.isSubscribe = z;
    }

    public final void setTitle(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.title = str;
    }
}
