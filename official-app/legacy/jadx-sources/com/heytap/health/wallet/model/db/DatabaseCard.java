package com.heytap.health.wallet.model.db;

import androidx.annotation.Keep;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import com.oplus.aiunit.vision.j7l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Entity(primaryKeys = {"id", "aid"}, tableName = "Card")
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b/\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0087\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0011J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00101\u001a\u00020\u0003HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00105\u001a\u00020\tHÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00108\u001a\u00020\rHÆ\u0003J\u008f\u0001\u00109\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010:\u001a\u00020\t2\b\u0010;\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010<\u001a\u00020=HÖ\u0001J\t\u0010>\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0013\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0016R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0013\"\u0004\b\u001a\u0010\u0016R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0013\"\u0004\b\u001c\u0010\u0016R\u001a\u0010\u000e\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0013\"\u0004\b\u001e\u0010\u0016R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0013R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0013\"\u0004\b!\u0010\u0016R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\"\"\u0004\b#\u0010$R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0013\"\u0004\b&\u0010\u0016R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u0013\"\u0004\b(\u0010\u0016R\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,¨\u0006?"}, d2 = {"Lcom/heytap/health/wallet/model/db/DatabaseCard;", "", j7l.KEY_CPLC, "", "aid", "status", "cardNo", "balance", "isDefault", "", "appCode", "orderNo", "timestamp", "", "cardType", "displayName", "cardImgUrl", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAid", "()Ljava/lang/String;", "getAppCode", "setAppCode", "(Ljava/lang/String;)V", "getBalance", "setBalance", "getCardImgUrl", "setCardImgUrl", "getCardNo", "setCardNo", "getCardType", "setCardType", "getCplc", "getDisplayName", "setDisplayName", "()Z", "setDefault", "(Z)V", "getOrderNo", "setOrderNo", "getStatus", "setStatus", "getTimestamp", "()J", "setTimestamp", "(J)V", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "commonlib_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class DatabaseCard {

    @ColumnInfo(name = "aid")
    @NotNull
    private final String aid;

    @Nullable
    private String appCode;

    @Nullable
    private String balance;

    @Nullable
    private String cardImgUrl;

    @Nullable
    private String cardNo;

    @NotNull
    private String cardType;

    @ColumnInfo(name = "id")
    @NotNull
    private final String cplc;

    @Nullable
    private String displayName;
    private boolean isDefault;

    @Nullable
    private String orderNo;

    @Nullable
    private String status;
    private long timestamp;

    public DatabaseCard(@NotNull String cplc, @NotNull String aid, @Nullable String str, @Nullable String str2, @Nullable String str3, boolean z, @Nullable String str4, @Nullable String str5, long j2, @NotNull String cardType, @Nullable String str6, @Nullable String str7) {
        Intrinsics.checkNotNullParameter(cplc, "cplc");
        Intrinsics.checkNotNullParameter(aid, "aid");
        Intrinsics.checkNotNullParameter(cardType, "cardType");
        this.cplc = cplc;
        this.aid = aid;
        this.status = str;
        this.cardNo = str2;
        this.balance = str3;
        this.isDefault = z;
        this.appCode = str4;
        this.orderNo = str5;
        this.timestamp = j2;
        this.cardType = cardType;
        this.displayName = str6;
        this.cardImgUrl = str7;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCplc() {
        return this.cplc;
    }

    @NotNull
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getCardType() {
        return this.cardType;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getCardImgUrl() {
        return this.cardImgUrl;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAid() {
        return this.aid;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCardNo() {
        return this.cardNo;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getBalance() {
        return this.balance;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getIsDefault() {
        return this.isDefault;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getAppCode() {
        return this.appCode;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getOrderNo() {
        return this.orderNo;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    @NotNull
    public final DatabaseCard copy(@NotNull String cplc, @NotNull String aid, @Nullable String status, @Nullable String cardNo, @Nullable String balance, boolean isDefault, @Nullable String appCode, @Nullable String orderNo, long timestamp, @NotNull String cardType, @Nullable String displayName, @Nullable String cardImgUrl) {
        Intrinsics.checkNotNullParameter(cplc, "cplc");
        Intrinsics.checkNotNullParameter(aid, "aid");
        Intrinsics.checkNotNullParameter(cardType, "cardType");
        return new DatabaseCard(cplc, aid, status, cardNo, balance, isDefault, appCode, orderNo, timestamp, cardType, displayName, cardImgUrl);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DatabaseCard)) {
            return false;
        }
        DatabaseCard databaseCard = (DatabaseCard) other;
        return Intrinsics.areEqual(this.cplc, databaseCard.cplc) && Intrinsics.areEqual(this.aid, databaseCard.aid) && Intrinsics.areEqual(this.status, databaseCard.status) && Intrinsics.areEqual(this.cardNo, databaseCard.cardNo) && Intrinsics.areEqual(this.balance, databaseCard.balance) && this.isDefault == databaseCard.isDefault && Intrinsics.areEqual(this.appCode, databaseCard.appCode) && Intrinsics.areEqual(this.orderNo, databaseCard.orderNo) && this.timestamp == databaseCard.timestamp && Intrinsics.areEqual(this.cardType, databaseCard.cardType) && Intrinsics.areEqual(this.displayName, databaseCard.displayName) && Intrinsics.areEqual(this.cardImgUrl, databaseCard.cardImgUrl);
    }

    @NotNull
    public final String getAid() {
        return this.aid;
    }

    @Nullable
    public final String getAppCode() {
        return this.appCode;
    }

    @Nullable
    public final String getBalance() {
        return this.balance;
    }

    @Nullable
    public final String getCardImgUrl() {
        return this.cardImgUrl;
    }

    @Nullable
    public final String getCardNo() {
        return this.cardNo;
    }

    @NotNull
    public final String getCardType() {
        return this.cardType;
    }

    @NotNull
    public final String getCplc() {
        return this.cplc;
    }

    @Nullable
    public final String getDisplayName() {
        return this.displayName;
    }

    @Nullable
    public final String getOrderNo() {
        return this.orderNo;
    }

    @Nullable
    public final String getStatus() {
        return this.status;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [int] */
    /* JADX WARN: Type inference failed for: r1v12, types: [int] */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v32 */
    public int hashCode() {
        int iHashCode = ((this.cplc.hashCode() * 31) + this.aid.hashCode()) * 31;
        String str = this.status;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.cardNo;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.balance;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        boolean z = this.isDefault;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int i = (iHashCode4 + r1) * 31;
        String str4 = this.appCode;
        int iHashCode5 = (i + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.orderNo;
        int iHashCode6 = (((((iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31) + Long.hashCode(this.timestamp)) * 31) + this.cardType.hashCode()) * 31;
        String str6 = this.displayName;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.cardImgUrl;
        return iHashCode7 + (str7 != null ? str7.hashCode() : 0);
    }

    public final boolean isDefault() {
        return this.isDefault;
    }

    public final void setAppCode(@Nullable String str) {
        this.appCode = str;
    }

    public final void setBalance(@Nullable String str) {
        this.balance = str;
    }

    public final void setCardImgUrl(@Nullable String str) {
        this.cardImgUrl = str;
    }

    public final void setCardNo(@Nullable String str) {
        this.cardNo = str;
    }

    public final void setCardType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.cardType = str;
    }

    public final void setDefault(boolean z) {
        this.isDefault = z;
    }

    public final void setDisplayName(@Nullable String str) {
        this.displayName = str;
    }

    public final void setOrderNo(@Nullable String str) {
        this.orderNo = str;
    }

    public final void setStatus(@Nullable String str) {
        this.status = str;
    }

    public final void setTimestamp(long j2) {
        this.timestamp = j2;
    }

    @NotNull
    public String toString() {
        return "DatabaseCard(cplc=" + this.cplc + ", aid=" + this.aid + ", status=" + this.status + ", cardNo=" + this.cardNo + ", balance=" + this.balance + ", isDefault=" + this.isDefault + ", appCode=" + this.appCode + ", orderNo=" + this.orderNo + ", timestamp=" + this.timestamp + ", cardType=" + this.cardType + ", displayName=" + this.displayName + ", cardImgUrl=" + this.cardImgUrl + ")";
    }

    public /* synthetic */ DatabaseCard(String str, String str2, String str3, String str4, String str5, boolean z, String str6, String str7, long j2, String str8, String str9, String str10, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? false : z, (i & 64) != 0 ? "" : str6, (i & 128) != 0 ? "" : str7, (i & 256) != 0 ? 0L : j2, (i & 512) != 0 ? "" : str8, (i & 1024) != 0 ? "" : str9, (i & 2048) != 0 ? "" : str10);
    }
}
