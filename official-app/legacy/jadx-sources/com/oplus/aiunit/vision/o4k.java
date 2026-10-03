package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.exifinterface.media.ExifInterface;
import com.amap.api.maps.model.LatLng;
import com.heytap.databaseengine.model.UserInfo;
import com.heytap.health.core.widget.charts.data.TimeStampedData;
import com.heytap.health.health_archives.web.HealthArchiveWebViewActivity;
import com.heytap.log.formatter.LogFieldKey;
import com.heytap.sports.record.details.RecordDetailsInstructionActivity;
import com.oplus.smartenginehelper.entity.ClickApiEntity;
import com.oplus.smartenginehelper.entity.TextEntity;
import io.protostuff.MapSchema;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Pair;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0017\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0013\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001BÏ\u0002\u0012\b\b\u0002\u0010\u0010\u001a\u00020\t\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0002\u0012\b\b\u0002\u0010 \u001a\u00020\u0002\u0012\b\b\u0002\u0010'\u001a\u00020!\u0012\b\b\u0002\u0010+\u001a\u00020!\u0012\u0016\b\u0002\u00104\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020-\u0018\u00010,\u0012\u0016\b\u0002\u00108\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020-\u0018\u00010,\u0012\u0016\b\u0002\u0010;\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020-\u0018\u00010,\u0012\b\b\u0002\u0010@\u001a\u00020\u0004\u0012\u0010\b\u0002\u0010G\u001a\n\u0012\u0004\u0012\u00020B\u0018\u00010A\u0012\u0010\b\u0002\u0010J\u001a\n\u0012\u0004\u0012\u00020H\u0018\u00010A\u0012\u0010\b\u0002\u0010M\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010A\u0012\u0010\b\u0002\u0010O\u001a\n\u0012\u0004\u0012\u00020B\u0018\u00010A\u0012\u0010\b\u0002\u0010Q\u001a\n\u0012\u0004\u0012\u00020B\u0018\u00010A\u0012\u0010\b\u0002\u0010T\u001a\n\u0012\u0004\u0012\u00020B\u0018\u00010A\u0012\u0010\b\u0002\u0010W\u001a\n\u0012\u0004\u0012\u00020B\u0018\u00010A\u0012\u0010\b\u0002\u0010Y\u001a\n\u0012\u0004\u0012\u00020B\u0018\u00010A\u0012\u000e\b\u0002\u0010[\u001a\b\u0012\u0004\u0012\u00020\u00070A\u0012\u000e\b\u0002\u0010^\u001a\b\u0012\u0004\u0012\u00020\\0A¢\u0006\u0004\b_\u0010`J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0010\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0017\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u001a\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u0016R\"\u0010\u001d\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0012\u001a\u0004\b\u0011\u0010\u0014\"\u0004\b\u001c\u0010\u0016R\"\u0010 \u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0012\u001a\u0004\b\u001e\u0010\u0014\"\u0004\b\u001f\u0010\u0016R\"\u0010'\u001a\u00020!8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b\u001b\u0010$\"\u0004\b%\u0010&R\"\u0010+\u001a\u00020!8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010#\u001a\u0004\b)\u0010$\"\u0004\b*\u0010&R0\u00104\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020-\u0018\u00010,8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R0\u00108\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020-\u0018\u00010,8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u0010/\u001a\u0004\b6\u00101\"\u0004\b7\u00103R0\u0010;\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020-\u0018\u00010,8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u0010/\u001a\u0004\b9\u00101\"\u0004\b:\u00103R\"\u0010@\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b6\u0010<\u001a\u0004\b=\u0010>\"\u0004\b\u000b\u0010?R*\u0010G\u001a\n\u0012\u0004\u0012\u00020B\u0018\u00010A8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bC\u0010E\"\u0004\b#\u0010FR*\u0010J\u001a\n\u0012\u0004\u0012\u00020H\u0018\u00010A8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010D\u001a\u0004\b5\u0010E\"\u0004\bI\u0010FR*\u0010M\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010A8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bK\u0010D\u001a\u0004\b.\u0010E\"\u0004\bL\u0010FR*\u0010O\u001a\n\u0012\u0004\u0012\u00020B\u0018\u00010A8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b=\u0010D\u001a\u0004\b\n\u0010E\"\u0004\bN\u0010FR*\u0010Q\u001a\n\u0012\u0004\u0012\u00020B\u0018\u00010A8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bP\u0010D\u001a\u0004\bK\u0010E\"\u0004\b<\u0010FR*\u0010T\u001a\n\u0012\u0004\u0012\u00020B\u0018\u00010A8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bR\u0010D\u001a\u0004\b\"\u0010E\"\u0004\bS\u0010FR*\u0010W\u001a\n\u0012\u0004\u0012\u00020B\u0018\u00010A8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bU\u0010D\u001a\u0004\bR\u0010E\"\u0004\bV\u0010FR*\u0010Y\u001a\n\u0012\u0004\u0012\u00020B\u0018\u00010A8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010D\u001a\u0004\bU\u0010E\"\u0004\bX\u0010FR(\u0010[\u001a\b\u0012\u0004\u0012\u00020\u00070A8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010D\u001a\u0004\bP\u0010E\"\u0004\bZ\u0010FR(\u0010^\u001a\b\u0012\u0004\u0012\u00020\\0A8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bN\u0010D\u001a\u0004\b(\u0010E\"\u0004\b]\u0010F¨\u0006a"}, d2 = {"Lcom/oplus/aiunit/vision/o4k;", "", "", "toString", "", "hashCode", "other", "", "equals", "", "a", "J", MapSchema.FIELD_NAME_ENTRY, "()J", "y", "(J)V", "duration", "b", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "w", "(Ljava/lang/String;)V", HealthArchiveWebViewActivity.H5_DATA_ID_KEY, "t", "O", "userName", "d", "v", h27.FAMILY_KEY_PUSH_FRIEND_AVATAR, "s", "N", ClickApiEntity.TIME, "", "f", UserInfo.SEX_FEMALE, "()F", "x", "(F)V", "distance", b2n.f, "getSpeed", "H", "speed", "Lkotlin/Pair;", "", b2n.g, "Lkotlin/Pair;", "j", "()Lkotlin/Pair;", "D", "(Lkotlin/Pair;)V", y04.TIME_STYLE_LEFT_DIR_NAME, "i", MapSchema.FIELD_NAME_KEY, ExifInterface.LONGITUDE_EAST, TextEntity.ELLIPSIZE_MIDDLE, LogFieldKey.MESSAGE_KEY, "G", y04.TIME_STYLE_RIGHT_DIR_NAME, "I", "o", "()I", "(I)V", RecordDetailsInstructionActivity.KEY_SPORT_MODE, "", "Lcom/heytap/health/core/widget/charts/data/TimeStampedData;", LogFieldKey.LEVEL_KEY, "Ljava/util/List;", "()Ljava/util/List;", "(Ljava/util/List;)V", "paceLine", "Lcom/amap/api/maps/model/LatLng;", "C", "latlngs", "n", c8l.KEY_B, "latlngTimeArr", "u", "altitudeLine", LogFieldKey.PROCESS_NAME_KEY, "speedLine", "q", "z", "heartLine", "r", "L", "stepLine", "M", "strideLine", "K", "startFlags", "Lcom/oplus/aiunit/vision/lpa;", "A", "kmMilestones", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FFLkotlin/Pair;Lkotlin/Pair;Lkotlin/Pair;ILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class o4k {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public long duration;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public String dataId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public String userName;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public String avatar;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public String time;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public float distance;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public float speed;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    public Pair<String, ? extends CharSequence> left;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    public Pair<String, ? extends CharSequence> middle;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Pair<String, ? extends CharSequence> right;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public int sportMode;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public List<? extends TimeStampedData> paceLine;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    public List<LatLng> latlngs;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public List<Long> latlngTimeArr;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @Nullable
    public List<? extends TimeStampedData> altitudeLine;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @Nullable
    public List<? extends TimeStampedData> speedLine;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @Nullable
    public List<? extends TimeStampedData> heartLine;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @Nullable
    public List<? extends TimeStampedData> stepLine;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @Nullable
    public List<? extends TimeStampedData> strideLine;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    @NotNull
    public List<Boolean> startFlags;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @NotNull
    public List<KmMilestone> kmMilestones;

    public o4k() {
        this(0L, null, null, null, null, 0.0f, 0.0f, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, 2097151, null);
    }

    public final void A(@NotNull List<KmMilestone> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.kmMilestones = list;
    }

    public final void B(@Nullable List<Long> list) {
        this.latlngTimeArr = list;
    }

    public final void C(@Nullable List<LatLng> list) {
        this.latlngs = list;
    }

    public final void D(@Nullable Pair<String, ? extends CharSequence> pair) {
        this.left = pair;
    }

    public final void E(@Nullable Pair<String, ? extends CharSequence> pair) {
        this.middle = pair;
    }

    public final void F(@Nullable List<? extends TimeStampedData> list) {
        this.paceLine = list;
    }

    public final void G(@Nullable Pair<String, ? extends CharSequence> pair) {
        this.right = pair;
    }

    public final void H(float f) {
        this.speed = f;
    }

    public final void I(@Nullable List<? extends TimeStampedData> list) {
        this.speedLine = list;
    }

    public final void J(int i) {
        this.sportMode = i;
    }

    public final void K(@NotNull List<Boolean> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.startFlags = list;
    }

    public final void L(@Nullable List<? extends TimeStampedData> list) {
        this.stepLine = list;
    }

    public final void M(@Nullable List<? extends TimeStampedData> list) {
        this.strideLine = list;
    }

    public final void N(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.time = str;
    }

    public final void O(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.userName = str;
    }

    @Nullable
    public final List<TimeStampedData> a() {
        return this.altitudeLine;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getAvatar() {
        return this.avatar;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getDataId() {
        return this.dataId;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final float getDistance() {
        return this.distance;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final long getDuration() {
        return this.duration;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof o4k)) {
            return false;
        }
        o4k o4kVar = (o4k) other;
        return this.duration == o4kVar.duration && Intrinsics.areEqual(this.dataId, o4kVar.dataId) && Intrinsics.areEqual(this.userName, o4kVar.userName) && Intrinsics.areEqual(this.avatar, o4kVar.avatar) && Intrinsics.areEqual(this.time, o4kVar.time) && Float.compare(this.distance, o4kVar.distance) == 0 && Float.compare(this.speed, o4kVar.speed) == 0 && Intrinsics.areEqual(this.left, o4kVar.left) && Intrinsics.areEqual(this.middle, o4kVar.middle) && Intrinsics.areEqual(this.right, o4kVar.right) && this.sportMode == o4kVar.sportMode && Intrinsics.areEqual(this.paceLine, o4kVar.paceLine) && Intrinsics.areEqual(this.latlngs, o4kVar.latlngs) && Intrinsics.areEqual(this.latlngTimeArr, o4kVar.latlngTimeArr) && Intrinsics.areEqual(this.altitudeLine, o4kVar.altitudeLine) && Intrinsics.areEqual(this.speedLine, o4kVar.speedLine) && Intrinsics.areEqual(this.heartLine, o4kVar.heartLine) && Intrinsics.areEqual(this.stepLine, o4kVar.stepLine) && Intrinsics.areEqual(this.strideLine, o4kVar.strideLine) && Intrinsics.areEqual(this.startFlags, o4kVar.startFlags) && Intrinsics.areEqual(this.kmMilestones, o4kVar.kmMilestones);
    }

    @Nullable
    public final List<TimeStampedData> f() {
        return this.heartLine;
    }

    @NotNull
    public final List<KmMilestone> g() {
        return this.kmMilestones;
    }

    @Nullable
    public final List<Long> h() {
        return this.latlngTimeArr;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((Long.hashCode(this.duration) * 31) + this.dataId.hashCode()) * 31) + this.userName.hashCode()) * 31) + this.avatar.hashCode()) * 31) + this.time.hashCode()) * 31) + Float.hashCode(this.distance)) * 31) + Float.hashCode(this.speed)) * 31;
        Pair<String, ? extends CharSequence> pair = this.left;
        int iHashCode2 = (iHashCode + (pair == null ? 0 : pair.hashCode())) * 31;
        Pair<String, ? extends CharSequence> pair2 = this.middle;
        int iHashCode3 = (iHashCode2 + (pair2 == null ? 0 : pair2.hashCode())) * 31;
        Pair<String, ? extends CharSequence> pair3 = this.right;
        int iHashCode4 = (((iHashCode3 + (pair3 == null ? 0 : pair3.hashCode())) * 31) + Integer.hashCode(this.sportMode)) * 31;
        List<? extends TimeStampedData> list = this.paceLine;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        List<LatLng> list2 = this.latlngs;
        int iHashCode6 = (iHashCode5 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<Long> list3 = this.latlngTimeArr;
        int iHashCode7 = (iHashCode6 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<? extends TimeStampedData> list4 = this.altitudeLine;
        int iHashCode8 = (iHashCode7 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List<? extends TimeStampedData> list5 = this.speedLine;
        int iHashCode9 = (iHashCode8 + (list5 == null ? 0 : list5.hashCode())) * 31;
        List<? extends TimeStampedData> list6 = this.heartLine;
        int iHashCode10 = (iHashCode9 + (list6 == null ? 0 : list6.hashCode())) * 31;
        List<? extends TimeStampedData> list7 = this.stepLine;
        int iHashCode11 = (iHashCode10 + (list7 == null ? 0 : list7.hashCode())) * 31;
        List<? extends TimeStampedData> list8 = this.strideLine;
        return ((((iHashCode11 + (list8 != null ? list8.hashCode() : 0)) * 31) + this.startFlags.hashCode()) * 31) + this.kmMilestones.hashCode();
    }

    @Nullable
    public final List<LatLng> i() {
        return this.latlngs;
    }

    @Nullable
    public final Pair<String, CharSequence> j() {
        return this.left;
    }

    @Nullable
    public final Pair<String, CharSequence> k() {
        return this.middle;
    }

    @Nullable
    public final List<TimeStampedData> l() {
        return this.paceLine;
    }

    @Nullable
    public final Pair<String, CharSequence> m() {
        return this.right;
    }

    @Nullable
    public final List<TimeStampedData> n() {
        return this.speedLine;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final int getSportMode() {
        return this.sportMode;
    }

    @NotNull
    public final List<Boolean> p() {
        return this.startFlags;
    }

    @Nullable
    public final List<TimeStampedData> q() {
        return this.stepLine;
    }

    @Nullable
    public final List<TimeStampedData> r() {
        return this.strideLine;
    }

    @NotNull
    /* JADX INFO: renamed from: s, reason: from getter */
    public final String getTime() {
        return this.time;
    }

    @NotNull
    /* JADX INFO: renamed from: t, reason: from getter */
    public final String getUserName() {
        return this.userName;
    }

    @NotNull
    public String toString() {
        String str = this.dataId;
        float f = this.distance;
        List<LatLng> list = this.latlngs;
        return "TrackAniData(dataId='" + str + "', distance=" + f + ", latlngs.size='" + (list != null ? Integer.valueOf(list.size()) : null) + "' durationStr='" + this.left + "', avePaceStr='" + this.middle + "', caloriesStr='" + this.right + "', sportMode=" + this.sportMode + ")";
    }

    public final void u(@Nullable List<? extends TimeStampedData> list) {
        this.altitudeLine = list;
    }

    public final void v(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.avatar = str;
    }

    public final void w(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.dataId = str;
    }

    public final void x(float f) {
        this.distance = f;
    }

    public final void y(long j2) {
        this.duration = j2;
    }

    public final void z(@Nullable List<? extends TimeStampedData> list) {
        this.heartLine = list;
    }

    public o4k(long j2, @NotNull String dataId, @NotNull String userName, @NotNull String avatar, @NotNull String time, float f, float f2, @Nullable Pair<String, ? extends CharSequence> pair, @Nullable Pair<String, ? extends CharSequence> pair2, @Nullable Pair<String, ? extends CharSequence> pair3, int i, @Nullable List<? extends TimeStampedData> list, @Nullable List<LatLng> list2, @Nullable List<Long> list3, @Nullable List<? extends TimeStampedData> list4, @Nullable List<? extends TimeStampedData> list5, @Nullable List<? extends TimeStampedData> list6, @Nullable List<? extends TimeStampedData> list7, @Nullable List<? extends TimeStampedData> list8, @NotNull List<Boolean> startFlags, @NotNull List<KmMilestone> kmMilestones) {
        Intrinsics.checkNotNullParameter(dataId, "dataId");
        Intrinsics.checkNotNullParameter(userName, "userName");
        Intrinsics.checkNotNullParameter(avatar, "avatar");
        Intrinsics.checkNotNullParameter(time, "time");
        Intrinsics.checkNotNullParameter(startFlags, "startFlags");
        Intrinsics.checkNotNullParameter(kmMilestones, "kmMilestones");
        this.duration = j2;
        this.dataId = dataId;
        this.userName = userName;
        this.avatar = avatar;
        this.time = time;
        this.distance = f;
        this.speed = f2;
        this.left = pair;
        this.middle = pair2;
        this.right = pair3;
        this.sportMode = i;
        this.paceLine = list;
        this.latlngs = list2;
        this.latlngTimeArr = list3;
        this.altitudeLine = list4;
        this.speedLine = list5;
        this.heartLine = list6;
        this.stepLine = list7;
        this.strideLine = list8;
        this.startFlags = startFlags;
        this.kmMilestones = kmMilestones;
    }

    public /* synthetic */ o4k(long j2, String str, String str2, String str3, String str4, float f, float f2, Pair pair, Pair pair2, Pair pair3, int i, List list, List list2, List list3, List list4, List list5, List list6, List list7, List list8, List list9, List list10, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0L : j2, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? "" : str3, (i2 & 16) == 0 ? str4 : "", (i2 & 32) != 0 ? 0.0f : f, (i2 & 64) == 0 ? f2 : 0.0f, (i2 & 128) != 0 ? null : pair, (i2 & 256) != 0 ? null : pair2, (i2 & 512) != 0 ? null : pair3, (i2 & 1024) != 0 ? 0 : i, (i2 & 2048) != 0 ? null : list, (i2 & 4096) != 0 ? null : list2, (i2 & 8192) != 0 ? null : list3, (i2 & 16384) != 0 ? null : list4, (i2 & 32768) != 0 ? null : list5, (i2 & 65536) != 0 ? null : list6, (i2 & 131072) != 0 ? null : list7, (i2 & 262144) != 0 ? null : list8, (i2 & 524288) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list9, (i2 & 1048576) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list10);
    }
}
