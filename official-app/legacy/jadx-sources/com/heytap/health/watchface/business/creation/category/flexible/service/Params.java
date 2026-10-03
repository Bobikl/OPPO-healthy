package com.heytap.health.watchface.business.creation.category.flexible.service;

import com.heytap.health.watchface.business.creation.db.LivePhotoRecord;
import java.io.Serializable;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.heytap.health.watchface.business.creation.category.flexible.service.FlexibleRecordParams, reason: from toString */
/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001Bi\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u001c\b\u0002\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nj\n\u0012\u0004\u0012\u00020\u000b\u0018\u0001`\f\u0012\u001c\b\u0002\u0010\r\u001a\u0016\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nj\n\u0012\u0004\u0012\u00020\u000b\u0018\u0001`\f¢\u0006\u0002\u0010\u000eJ\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\bHÆ\u0003J\u001d\u0010(\u001a\u0016\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nj\n\u0012\u0004\u0012\u00020\u000b\u0018\u0001`\fHÆ\u0003J\u001d\u0010)\u001a\u0016\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nj\n\u0012\u0004\u0012\u00020\u000b\u0018\u0001`\fHÆ\u0003Jw\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\u001c\b\u0002\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nj\n\u0012\u0004\u0012\u00020\u000b\u0018\u0001`\f2\u001c\b\u0002\u0010\r\u001a\u0016\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nj\n\u0012\u0004\u0012\u00020\u000b\u0018\u0001`\fHÆ\u0001J\u0013\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010.HÖ\u0003J\t\u0010/\u001a\u00020\bHÖ\u0001J\b\u00100\u001a\u00020\u0003H\u0016R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R.\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nj\n\u0012\u0004\u0012\u00020\u000b\u0018\u0001`\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0010\"\u0004\b\u0018\u0010\u0012R.\u0010\r\u001a\u0016\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nj\n\u0012\u0004\u0012\u00020\u000b\u0018\u0001`\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0014\"\u0004\b\u001a\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0010\"\u0004\b\u001c\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0010\"\u0004\b\u001e\u0010\u0012R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"¨\u00061"}, d2 = {"Lcom/heytap/health/watchface/business/creation/category/flexible/service/FlexibleRecordParams;", "Ljava/io/Serializable;", "packageName", "", "resPath", "previewPath", "configData", "type", "", "lpRecords", "Ljava/util/ArrayList;", "Lcom/heytap/health/watchface/business/creation/db/LivePhotoRecord;", "Lkotlin/collections/ArrayList;", "preDeleteRecords", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/ArrayList;Ljava/util/ArrayList;)V", "getConfigData", "()Ljava/lang/String;", "setConfigData", "(Ljava/lang/String;)V", "getLpRecords", "()Ljava/util/ArrayList;", "setLpRecords", "(Ljava/util/ArrayList;)V", "getPackageName", "setPackageName", "getPreDeleteRecords", "setPreDeleteRecords", "getPreviewPath", "setPreviewPath", "getResPath", "setResPath", "getType", "()I", "setType", "(I)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "", "hashCode", "toString", "watchface_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class Params implements Serializable {

    @NotNull
    private String configData;

    @Nullable
    private ArrayList<LivePhotoRecord> lpRecords;

    @NotNull
    private String packageName;

    @Nullable
    private ArrayList<LivePhotoRecord> preDeleteRecords;

    @NotNull
    private String previewPath;

    @NotNull
    private String resPath;
    private int type;

    public Params(@NotNull String packageName, @NotNull String resPath, @NotNull String previewPath, @NotNull String configData, int i, @Nullable ArrayList<LivePhotoRecord> arrayList, @Nullable ArrayList<LivePhotoRecord> arrayList2) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(resPath, "resPath");
        Intrinsics.checkNotNullParameter(previewPath, "previewPath");
        Intrinsics.checkNotNullParameter(configData, "configData");
        this.packageName = packageName;
        this.resPath = resPath;
        this.previewPath = previewPath;
        this.configData = configData;
        this.type = i;
        this.lpRecords = arrayList;
        this.preDeleteRecords = arrayList2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Params copy$default(Params params, String str, String str2, String str3, String str4, int i, ArrayList arrayList, ArrayList arrayList2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = params.packageName;
        }
        if ((i2 & 2) != 0) {
            str2 = params.resPath;
        }
        String str5 = str2;
        if ((i2 & 4) != 0) {
            str3 = params.previewPath;
        }
        String str6 = str3;
        if ((i2 & 8) != 0) {
            str4 = params.configData;
        }
        String str7 = str4;
        if ((i2 & 16) != 0) {
            i = params.type;
        }
        int i3 = i;
        if ((i2 & 32) != 0) {
            arrayList = params.lpRecords;
        }
        ArrayList arrayList3 = arrayList;
        if ((i2 & 64) != 0) {
            arrayList2 = params.preDeleteRecords;
        }
        return params.copy(str, str5, str6, str7, i3, arrayList3, arrayList2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPackageName() {
        return this.packageName;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getResPath() {
        return this.resPath;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPreviewPath() {
        return this.previewPath;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getConfigData() {
        return this.configData;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getType() {
        return this.type;
    }

    @Nullable
    public final ArrayList<LivePhotoRecord> component6() {
        return this.lpRecords;
    }

    @Nullable
    public final ArrayList<LivePhotoRecord> component7() {
        return this.preDeleteRecords;
    }

    @NotNull
    public final Params copy(@NotNull String packageName, @NotNull String resPath, @NotNull String previewPath, @NotNull String configData, int type, @Nullable ArrayList<LivePhotoRecord> lpRecords, @Nullable ArrayList<LivePhotoRecord> preDeleteRecords) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(resPath, "resPath");
        Intrinsics.checkNotNullParameter(previewPath, "previewPath");
        Intrinsics.checkNotNullParameter(configData, "configData");
        return new Params(packageName, resPath, previewPath, configData, type, lpRecords, preDeleteRecords);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Params)) {
            return false;
        }
        Params params = (Params) other;
        return Intrinsics.areEqual(this.packageName, params.packageName) && Intrinsics.areEqual(this.resPath, params.resPath) && Intrinsics.areEqual(this.previewPath, params.previewPath) && Intrinsics.areEqual(this.configData, params.configData) && this.type == params.type && Intrinsics.areEqual(this.lpRecords, params.lpRecords) && Intrinsics.areEqual(this.preDeleteRecords, params.preDeleteRecords);
    }

    @NotNull
    public final String getConfigData() {
        return this.configData;
    }

    @Nullable
    public final ArrayList<LivePhotoRecord> getLpRecords() {
        return this.lpRecords;
    }

    @NotNull
    public final String getPackageName() {
        return this.packageName;
    }

    @Nullable
    public final ArrayList<LivePhotoRecord> getPreDeleteRecords() {
        return this.preDeleteRecords;
    }

    @NotNull
    public final String getPreviewPath() {
        return this.previewPath;
    }

    @NotNull
    public final String getResPath() {
        return this.resPath;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = ((((((((this.packageName.hashCode() * 31) + this.resPath.hashCode()) * 31) + this.previewPath.hashCode()) * 31) + this.configData.hashCode()) * 31) + Integer.hashCode(this.type)) * 31;
        ArrayList<LivePhotoRecord> arrayList = this.lpRecords;
        int iHashCode2 = (iHashCode + (arrayList == null ? 0 : arrayList.hashCode())) * 31;
        ArrayList<LivePhotoRecord> arrayList2 = this.preDeleteRecords;
        return iHashCode2 + (arrayList2 != null ? arrayList2.hashCode() : 0);
    }

    public final void setConfigData(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.configData = str;
    }

    public final void setLpRecords(@Nullable ArrayList<LivePhotoRecord> arrayList) {
        this.lpRecords = arrayList;
    }

    public final void setPackageName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.packageName = str;
    }

    public final void setPreDeleteRecords(@Nullable ArrayList<LivePhotoRecord> arrayList) {
        this.preDeleteRecords = arrayList;
    }

    public final void setPreviewPath(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.previewPath = str;
    }

    public final void setResPath(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.resPath = str;
    }

    public final void setType(int i) {
        this.type = i;
    }

    @NotNull
    public String toString() {
        return "Params(packageName='" + this.packageName + "', resPath='" + this.resPath + "', previewPath='" + this.previewPath + "', configData='" + this.configData + "', type='" + this.type + "')";
    }

    public /* synthetic */ Params(String str, String str2, String str3, String str4, int i, ArrayList arrayList, ArrayList arrayList2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, i, (i2 & 32) != 0 ? null : arrayList, (i2 & 64) != 0 ? null : arrayList2);
    }
}
