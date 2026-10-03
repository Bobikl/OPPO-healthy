package com.heytap.store.business.component.entity;

import androidx.annotation.Keep;
import com.oplus.aiunit.vision.hp6;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Keep
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u001c\b\u0002\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\n\u0018\u00010\tj\n\u0012\u0004\u0012\u00020\n\u0018\u0001`\u000b¢\u0006\u0002\u0010\fJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u001d\u0010\u001f\u001a\u0016\u0012\u0004\u0012\u00020\n\u0018\u00010\tj\n\u0012\u0004\u0012\u00020\n\u0018\u0001`\u000bHÆ\u0003JI\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u001c\b\u0002\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\n\u0018\u00010\tj\n\u0012\u0004\u0012\u00020\n\u0018\u0001`\u000bHÆ\u0001J\u0013\u0010!\u001a\u00020\u00032\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0005HÖ\u0001R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R.\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\n\u0018\u00010\tj\n\u0012\u0004\u0012\u00020\n\u0018\u0001`\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0002\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006&"}, d2 = {"Lcom/heytap/store/business/component/entity/PicCubeEntity;", "", "isNeedTopMargin", "", "backgroundPic", "", "headerInfo", "Lcom/heytap/store/business/component/entity/OStoreHeaderInfo;", hp6.DETAIL_ENTRY, "Ljava/util/ArrayList;", "Lcom/heytap/store/business/component/entity/PicCubeDetail;", "Lkotlin/collections/ArrayList;", "(ZLjava/lang/String;Lcom/heytap/store/business/component/entity/OStoreHeaderInfo;Ljava/util/ArrayList;)V", "getBackgroundPic", "()Ljava/lang/String;", "setBackgroundPic", "(Ljava/lang/String;)V", "getDetails", "()Ljava/util/ArrayList;", "setDetails", "(Ljava/util/ArrayList;)V", "getHeaderInfo", "()Lcom/heytap/store/business/component/entity/OStoreHeaderInfo;", "setHeaderInfo", "(Lcom/heytap/store/business/component/entity/OStoreHeaderInfo;)V", "()Z", "setNeedTopMargin", "(Z)V", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "widget_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final /* data */ class PicCubeEntity {

    @Nullable
    private String backgroundPic;

    @Nullable
    private ArrayList<PicCubeDetail> details;

    @Nullable
    private OStoreHeaderInfo headerInfo;
    private boolean isNeedTopMargin;

    public PicCubeEntity() {
        this(false, null, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PicCubeEntity copy$default(PicCubeEntity picCubeEntity, boolean z, String str, OStoreHeaderInfo oStoreHeaderInfo, ArrayList arrayList, int i, Object obj) {
        if ((i & 1) != 0) {
            z = picCubeEntity.isNeedTopMargin;
        }
        if ((i & 2) != 0) {
            str = picCubeEntity.backgroundPic;
        }
        if ((i & 4) != 0) {
            oStoreHeaderInfo = picCubeEntity.headerInfo;
        }
        if ((i & 8) != 0) {
            arrayList = picCubeEntity.details;
        }
        return picCubeEntity.copy(z, str, oStoreHeaderInfo, arrayList);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsNeedTopMargin() {
        return this.isNeedTopMargin;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getBackgroundPic() {
        return this.backgroundPic;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final OStoreHeaderInfo getHeaderInfo() {
        return this.headerInfo;
    }

    @Nullable
    public final ArrayList<PicCubeDetail> component4() {
        return this.details;
    }

    @NotNull
    public final PicCubeEntity copy(boolean isNeedTopMargin, @Nullable String backgroundPic, @Nullable OStoreHeaderInfo headerInfo, @Nullable ArrayList<PicCubeDetail> details) {
        return new PicCubeEntity(isNeedTopMargin, backgroundPic, headerInfo, details);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PicCubeEntity)) {
            return false;
        }
        PicCubeEntity picCubeEntity = (PicCubeEntity) other;
        return this.isNeedTopMargin == picCubeEntity.isNeedTopMargin && Intrinsics.areEqual(this.backgroundPic, picCubeEntity.backgroundPic) && Intrinsics.areEqual(this.headerInfo, picCubeEntity.headerInfo) && Intrinsics.areEqual(this.details, picCubeEntity.details);
    }

    @Nullable
    public final String getBackgroundPic() {
        return this.backgroundPic;
    }

    @Nullable
    public final ArrayList<PicCubeDetail> getDetails() {
        return this.details;
    }

    @Nullable
    public final OStoreHeaderInfo getHeaderInfo() {
        return this.headerInfo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    public int hashCode() {
        boolean z = this.isNeedTopMargin;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        String str = this.backgroundPic;
        int iHashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        OStoreHeaderInfo oStoreHeaderInfo = this.headerInfo;
        int iHashCode2 = (iHashCode + (oStoreHeaderInfo == null ? 0 : oStoreHeaderInfo.hashCode())) * 31;
        ArrayList<PicCubeDetail> arrayList = this.details;
        return iHashCode2 + (arrayList != null ? arrayList.hashCode() : 0);
    }

    public final boolean isNeedTopMargin() {
        return this.isNeedTopMargin;
    }

    public final void setBackgroundPic(@Nullable String str) {
        this.backgroundPic = str;
    }

    public final void setDetails(@Nullable ArrayList<PicCubeDetail> arrayList) {
        this.details = arrayList;
    }

    public final void setHeaderInfo(@Nullable OStoreHeaderInfo oStoreHeaderInfo) {
        this.headerInfo = oStoreHeaderInfo;
    }

    public final void setNeedTopMargin(boolean z) {
        this.isNeedTopMargin = z;
    }

    @NotNull
    public String toString() {
        return "PicCubeEntity(isNeedTopMargin=" + this.isNeedTopMargin + ", backgroundPic=" + ((Object) this.backgroundPic) + ", headerInfo=" + this.headerInfo + ", details=" + this.details + ')';
    }

    public PicCubeEntity(boolean z, @Nullable String str, @Nullable OStoreHeaderInfo oStoreHeaderInfo, @Nullable ArrayList<PicCubeDetail> arrayList) {
        this.isNeedTopMargin = z;
        this.backgroundPic = str;
        this.headerInfo = oStoreHeaderInfo;
        this.details = arrayList;
    }

    public /* synthetic */ PicCubeEntity(boolean z, String str, OStoreHeaderInfo oStoreHeaderInfo, ArrayList arrayList, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : oStoreHeaderInfo, (i & 8) != 0 ? null : arrayList);
    }
}
