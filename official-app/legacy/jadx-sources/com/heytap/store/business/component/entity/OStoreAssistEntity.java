package com.heytap.store.business.component.entity;

import androidx.annotation.Keep;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0007HÆ\u0003J\t\u0010%\u001a\u00020\tHÆ\u0003JA\u0010&\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010'\u001a\u00020\u00072\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020\tHÖ\u0001J\t\u0010*\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u000eR\"\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\f\"\u0004\b\u001c\u0010\u000eR\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006+"}, d2 = {"Lcom/heytap/store/business/component/entity/OStoreAssistEntity;", "", "advertId", "", "cardBg", "title", "isPad", "", "windowWidth", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZI)V", "getAdvertId", "()Ljava/lang/String;", "setAdvertId", "(Ljava/lang/String;)V", "getCardBg", "setCardBg", "cardLists", "", "Lcom/heytap/store/business/component/entity/OStoreAssistCardEntity;", "getCardLists", "()Ljava/util/List;", "setCardLists", "(Ljava/util/List;)V", "()Z", "setPad", "(Z)V", "getTitle", "setTitle", "getWindowWidth", "()I", "setWindowWidth", "(I)V", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "widget_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final /* data */ class OStoreAssistEntity {

    @Nullable
    private String advertId;

    @Nullable
    private String cardBg;

    @Nullable
    private List<OStoreAssistCardEntity> cardLists;
    private boolean isPad;

    @Nullable
    private String title;
    private int windowWidth;

    public OStoreAssistEntity() {
        this(null, null, null, false, 0, 31, null);
    }

    public static /* synthetic */ OStoreAssistEntity copy$default(OStoreAssistEntity oStoreAssistEntity, String str, String str2, String str3, boolean z, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = oStoreAssistEntity.advertId;
        }
        if ((i2 & 2) != 0) {
            str2 = oStoreAssistEntity.cardBg;
        }
        String str4 = str2;
        if ((i2 & 4) != 0) {
            str3 = oStoreAssistEntity.title;
        }
        String str5 = str3;
        if ((i2 & 8) != 0) {
            z = oStoreAssistEntity.isPad;
        }
        boolean z2 = z;
        if ((i2 & 16) != 0) {
            i = oStoreAssistEntity.windowWidth;
        }
        return oStoreAssistEntity.copy(str, str4, str5, z2, i);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAdvertId() {
        return this.advertId;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCardBg() {
        return this.cardBg;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getIsPad() {
        return this.isPad;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getWindowWidth() {
        return this.windowWidth;
    }

    @NotNull
    public final OStoreAssistEntity copy(@Nullable String advertId, @Nullable String cardBg, @Nullable String title, boolean isPad, int windowWidth) {
        return new OStoreAssistEntity(advertId, cardBg, title, isPad, windowWidth);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OStoreAssistEntity)) {
            return false;
        }
        OStoreAssistEntity oStoreAssistEntity = (OStoreAssistEntity) other;
        return Intrinsics.areEqual(this.advertId, oStoreAssistEntity.advertId) && Intrinsics.areEqual(this.cardBg, oStoreAssistEntity.cardBg) && Intrinsics.areEqual(this.title, oStoreAssistEntity.title) && this.isPad == oStoreAssistEntity.isPad && this.windowWidth == oStoreAssistEntity.windowWidth;
    }

    @Nullable
    public final String getAdvertId() {
        return this.advertId;
    }

    @Nullable
    public final String getCardBg() {
        return this.cardBg;
    }

    @Nullable
    public final List<OStoreAssistCardEntity> getCardLists() {
        return this.cardLists;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public final int getWindowWidth() {
        return this.windowWidth;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v6 */
    public int hashCode() {
        String str = this.advertId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.cardBg;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.title;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        boolean z = this.isPad;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return ((iHashCode3 + r1) * 31) + Integer.hashCode(this.windowWidth);
    }

    public final boolean isPad() {
        return this.isPad;
    }

    public final void setAdvertId(@Nullable String str) {
        this.advertId = str;
    }

    public final void setCardBg(@Nullable String str) {
        this.cardBg = str;
    }

    public final void setCardLists(@Nullable List<OStoreAssistCardEntity> list) {
        this.cardLists = list;
    }

    public final void setPad(boolean z) {
        this.isPad = z;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }

    public final void setWindowWidth(int i) {
        this.windowWidth = i;
    }

    @NotNull
    public String toString() {
        return "OStoreAssistEntity(advertId=" + ((Object) this.advertId) + ", cardBg=" + ((Object) this.cardBg) + ", title=" + ((Object) this.title) + ", isPad=" + this.isPad + ", windowWidth=" + this.windowWidth + ')';
    }

    public OStoreAssistEntity(@Nullable String str, @Nullable String str2, @Nullable String str3, boolean z, int i) {
        this.advertId = str;
        this.cardBg = str2;
        this.title = str3;
        this.isPad = z;
        this.windowWidth = i;
    }

    public /* synthetic */ OStoreAssistEntity(String str, String str2, String str3, boolean z, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) == 0 ? str3 : "", (i2 & 8) != 0 ? false : z, (i2 & 16) != 0 ? 0 : i);
    }
}
