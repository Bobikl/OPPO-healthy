package com.heytap.health.devicelog.feedback;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import com.customer.feedback.sdk.model.RequestData;
import com.heytap.health.devicemanager.processor.bean.UserDeviceInfo;
import com.oplus.aiunit.vision.gl4;
import com.oplus.aiunit.vision.qe0;
import com.oplus.aiunit.vision.ukj;
import com.oplus.aiunit.vision.x05;
import com.oplus.utrace.db.UTraceSQLiteHelperKt;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.StringsKt__IndentKt;
import p010kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Parcelize
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b)\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B«\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000b\u0012\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000e\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0003¢\u0006\u0002\u0010\u0014J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0011HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010/\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010$J\t\u00100\u001a\u00020\u0006HÆ\u0003J\u0010\u00101\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010'J\u000f\u00102\u001a\b\u0012\u0004\u0012\u00020\u00030\u000bHÆ\u0003J\u0011\u00103\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000bHÆ\u0003J\u0017\u00104\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000eHÆ\u0003J\u0011\u00105\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000bHÆ\u0003J´\u0001\u00106\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000b2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000e2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u0003HÆ\u0001¢\u0006\u0002\u00107J\t\u00108\u001a\u00020\tHÖ\u0001J\u0013\u00109\u001a\u00020\u00112\b\u0010:\u001a\u0004\u0018\u00010;H\u0096\u0002J\b\u0010<\u001a\u00020\tH\u0016J\t\u0010=\u001a\u00020\u0003HÖ\u0001J\u0006\u0010>\u001a\u00020\u0003J\u0019\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020\tHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0013\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016R\u001f\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0016R\u0019\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010 R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010%\u001a\u0004\b#\u0010$R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010(\u001a\u0004\b&\u0010'R\u0019\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b)\u0010 ¨\u0006D"}, d2 = {"Lcom/heytap/health/devicelog/feedback/FeedbackOption;", "Landroid/os/Parcelable;", "bugDetail", "", RequestData.TYPE_CONTACT, "recentTime", "", "feedbackTime", "reproduceRate", "", "logNames", "", "medias", "fileKeys", "", "uploadFailFiles", "collectLog", "", "logType", "fid", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;JLjava/lang/Integer;Ljava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/List;ZLjava/lang/String;Ljava/lang/String;)V", "getBugDetail", "()Ljava/lang/String;", "getCollectLog", "()Z", "getContact", "getFeedbackTime", "()J", "getFid", "getFileKeys", "()Ljava/util/Map;", "getLogNames", "()Ljava/util/List;", "getLogType", "getMedias", "getRecentTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getReproduceRate", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getUploadFailFiles", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;JLjava/lang/Integer;Ljava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/List;ZLjava/lang/String;Ljava/lang/String;)Lcom/heytap/health/devicelog/feedback/FeedbackOption;", "describeContents", "equals", "other", "", "hashCode", "toString", "toUserDetail", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", UTraceSQLiteHelperKt.COL_FLAGS, "device_settings_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class FeedbackOption implements Parcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<FeedbackOption> CREATOR = new a();

    @Nullable
    private final String bugDetail;
    private final transient boolean collectLog;

    @Nullable
    private final String contact;
    private final long feedbackTime;

    @NotNull
    private final String fid;

    @Nullable
    private final Map<String, String> fileKeys;

    @NotNull
    private final List<String> logNames;

    @Nullable
    private final String logType;

    @Nullable
    private final List<String> medias;

    @Nullable
    private final Long recentTime;

    @Nullable
    private final Integer reproduceRate;

    @Nullable
    private final List<String> uploadFailFiles;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<FeedbackOption> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final FeedbackOption createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            LinkedHashMap linkedHashMap = null;
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            long j2 = parcel.readLong();
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            ArrayList<String> arrayListCreateStringArrayList2 = parcel.createStringArrayList();
            if (parcel.readInt() != 0) {
                int i = parcel.readInt();
                linkedHashMap = new LinkedHashMap(i);
                for (int i2 = 0; i2 != i; i2++) {
                    linkedHashMap.put(parcel.readString(), parcel.readString());
                }
            }
            return new FeedbackOption(string, string2, lValueOf, j2, numValueOf, arrayListCreateStringArrayList, arrayListCreateStringArrayList2, linkedHashMap, parcel.createStringArrayList(), parcel.readInt() != 0, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final FeedbackOption[] newArray(int i) {
            return new FeedbackOption[i];
        }
    }

    public FeedbackOption() {
        this(null, null, null, 0L, null, null, null, null, null, false, null, null, 4095, null);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBugDetail() {
        return this.bugDetail;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final boolean getCollectLog() {
        return this.collectLog;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getLogType() {
        return this.logType;
    }

    @NotNull
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getFid() {
        return this.fid;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getContact() {
        return this.contact;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Long getRecentTime() {
        return this.recentTime;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getFeedbackTime() {
        return this.feedbackTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getReproduceRate() {
        return this.reproduceRate;
    }

    @NotNull
    public final List<String> component6() {
        return this.logNames;
    }

    @Nullable
    public final List<String> component7() {
        return this.medias;
    }

    @Nullable
    public final Map<String, String> component8() {
        return this.fileKeys;
    }

    @Nullable
    public final List<String> component9() {
        return this.uploadFailFiles;
    }

    @NotNull
    public final FeedbackOption copy(@Nullable String bugDetail, @Nullable String contact, @Nullable Long recentTime, long feedbackTime, @Nullable Integer reproduceRate, @NotNull List<String> logNames, @Nullable List<String> medias, @Nullable Map<String, String> fileKeys, @Nullable List<String> uploadFailFiles, boolean collectLog, @Nullable String logType, @NotNull String fid) {
        Intrinsics.checkNotNullParameter(logNames, "logNames");
        Intrinsics.checkNotNullParameter(fid, "fid");
        return new FeedbackOption(bugDetail, contact, recentTime, feedbackTime, reproduceRate, logNames, medias, fileKeys, uploadFailFiles, collectLog, logType, fid);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof FeedbackOption) && this.feedbackTime == ((FeedbackOption) other).feedbackTime;
    }

    @Nullable
    public final String getBugDetail() {
        return this.bugDetail;
    }

    public final boolean getCollectLog() {
        return this.collectLog;
    }

    @Nullable
    public final String getContact() {
        return this.contact;
    }

    public final long getFeedbackTime() {
        return this.feedbackTime;
    }

    @NotNull
    public final String getFid() {
        return this.fid;
    }

    @Nullable
    public final Map<String, String> getFileKeys() {
        return this.fileKeys;
    }

    @NotNull
    public final List<String> getLogNames() {
        return this.logNames;
    }

    @Nullable
    public final String getLogType() {
        return this.logType;
    }

    @Nullable
    public final List<String> getMedias() {
        return this.medias;
    }

    @Nullable
    public final Long getRecentTime() {
        return this.recentTime;
    }

    @Nullable
    public final Integer getReproduceRate() {
        return this.reproduceRate;
    }

    @Nullable
    public final List<String> getUploadFailFiles() {
        return this.uploadFailFiles;
    }

    public int hashCode() {
        return Long.hashCode(this.feedbackTime);
    }

    @NotNull
    public String toString() {
        return "FeedbackOption(bugDetail=" + this.bugDetail + ", contact=" + this.contact + ", recentTime=" + this.recentTime + ", feedbackTime=" + this.feedbackTime + ", reproduceRate=" + this.reproduceRate + ", logNames=" + this.logNames + ", medias=" + this.medias + ", fileKeys=" + this.fileKeys + ", uploadFailFiles=" + this.uploadFailFiles + ", collectLog=" + this.collectLog + ", logType=" + this.logType + ", fid=" + this.fid + ")";
    }

    @NotNull
    public final String toUserDetail() {
        String strB = ukj.b("ro.build.version.oplusrom.confidential", ukj.b("ro.build.version.oplusrom", Build.VERSION.RELEASE));
        Intrinsics.checkNotNullExpressionValue(strB, "get(\n            OPlusBu…E\n            )\n        )");
        UserDeviceInfo userDeviceInfoJ = gl4.managerApi.j();
        String str = this.logType;
        if (str == null) {
            str = "改进建议";
        }
        String str2 = this.bugDetail;
        String strTrimIndent = StringsKt__IndentKt.trimIndent("\n【" + str + "】\n " + (str2 != null ? StringsKt__StringsKt.trim((CharSequence) str2).toString() : null) + "\n【手机型号】" + Build.MANUFACTURER + "-" + Build.MODEL + "\n【手机系统版本号】" + strB + "\n【健康版本号】" + qe0.n() + "\n【设备版本号】" + (userDeviceInfoJ != null ? userDeviceInfoJ.getOtaVersion() : null) + "\n        ");
        Long l2 = this.recentTime;
        if (l2 == null) {
            return strTrimIndent;
        }
        return strTrimIndent + "\n【发生时间】" + x05.s(l2);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.bugDetail);
        parcel.writeString(this.contact);
        Long l2 = this.recentTime;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l2.longValue());
        }
        parcel.writeLong(this.feedbackTime);
        Integer num = this.reproduceRate;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeStringList(this.logNames);
        parcel.writeStringList(this.medias);
        Map<String, String> map = this.fileKeys;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(map.size());
            for (Map.Entry<String, String> entry : map.entrySet()) {
                parcel.writeString(entry.getKey());
                parcel.writeString(entry.getValue());
            }
        }
        parcel.writeStringList(this.uploadFailFiles);
        parcel.writeInt(this.collectLog ? 1 : 0);
        parcel.writeString(this.logType);
        parcel.writeString(this.fid);
    }

    public FeedbackOption(@Nullable String str, @Nullable String str2, @Nullable Long l2, long j2, @Nullable Integer num, @NotNull List<String> logNames, @Nullable List<String> list, @Nullable Map<String, String> map, @Nullable List<String> list2, boolean z, @Nullable String str3, @NotNull String fid) {
        Intrinsics.checkNotNullParameter(logNames, "logNames");
        Intrinsics.checkNotNullParameter(fid, "fid");
        this.bugDetail = str;
        this.contact = str2;
        this.recentTime = l2;
        this.feedbackTime = j2;
        this.reproduceRate = num;
        this.logNames = logNames;
        this.medias = list;
        this.fileKeys = map;
        this.uploadFailFiles = list2;
        this.collectLog = z;
        this.logType = str3;
        this.fid = fid;
    }

    public /* synthetic */ FeedbackOption(String str, String str2, Long l2, long j2, Integer num, List list, List list2, Map map, List list3, boolean z, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : l2, (i & 8) != 0 ? 0L : j2, (i & 16) != 0 ? null : num, (i & 32) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i & 64) != 0 ? null : list2, (i & 128) != 0 ? null : map, (i & 256) != 0 ? null : list3, (i & 512) != 0 ? true : z, (i & 1024) == 0 ? str3 : null, (i & 2048) != 0 ? "" : str4);
    }
}
