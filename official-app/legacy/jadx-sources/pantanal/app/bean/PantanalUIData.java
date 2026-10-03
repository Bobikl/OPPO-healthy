package pantanal.app.bean;

import androidx.annotation.Keep;
import com.oplus.aiunit.vision.bs9;
import com.oplus.aiunit.vision.t6e;
import com.oplus.cardwidget.domain.pack.BaseDataPack;
import com.oplus.seedling.sdk.seedling.SeedlingUIData;
import com.pantanal.fundation.internal.json.JsonUtils;
import com.squareup.moshi.FromJson;
import com.squareup.moshi.Json;
import com.squareup.moshi.ToJson;
import java.util.Arrays;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Result;
import p010kotlin.ResultKt;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
@Keep
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b/\b\u0087\b\u0018\u0000 B2\u00020\u0001:\u0001BB§\u0001\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012(\b\u0003\u0010\u0006\u001a\"\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007j\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0005\u0018\u0001`\t\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0003\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0003\u0010\u0011\u001a\u00020\b\u0012\b\b\u0003\u0010\u0012\u001a\u00020\b\u0012\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\b\b\u0003\u0010\u0015\u001a\u00020\b¢\u0006\u0002\u0010\u0016J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\bHÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\t\u00102\u001a\u00020\bHÆ\u0003J\t\u00103\u001a\u00020\u0005HÆ\u0003J)\u00104\u001a\"\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007j\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0005\u0018\u0001`\tHÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0010\u00106\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010-J\u0010\u00107\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010)J\u000b\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00109\u001a\u00020\u0010HÆ\u0003J\t\u0010:\u001a\u00020\bHÆ\u0003J°\u0001\u0010;\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052(\b\u0003\u0010\u0006\u001a\"\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007j\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0005\u0018\u0001`\t2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u000f\u001a\u00020\u00102\b\b\u0003\u0010\u0011\u001a\u00020\b2\b\b\u0003\u0010\u0012\u001a\u00020\b2\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\b\u0003\u0010\u0015\u001a\u00020\bHÆ\u0001¢\u0006\u0002\u0010<J\u0013\u0010=\u001a\u00020\u00102\b\u0010>\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010?\u001a\u00020\u0005H\u0016J\b\u0010@\u001a\u00020\bH\u0007J\b\u0010A\u001a\u00020\bH\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0015\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0012\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001aR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR1\u0010\u0006\u001a\"\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007j\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0005\u0018\u0001`\t¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u0011\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001aR\u0013\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001aR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u0015\u0010\r\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010*\u001a\u0004\b(\u0010)R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001cR\u0015\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010.\u001a\u0004\b,\u0010-¨\u0006C"}, d2 = {"Lpantanal/app/bean/PantanalUIData;", "", "data", "", "cardId", "", "idMaps", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "name", "version", "", "themeId", "value", "forceChangeCardUI", "", BaseDataPack.KEY_LAYOUT_NAME, BaseDataPack.KEY_EXTRA_MSG, "seedlingUIData", "Lcom/oplus/seedling/sdk/seedling/SeedlingUIData;", "cardUniqueKey", "([BILjava/util/HashMap;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;[BZLjava/lang/String;Ljava/lang/String;Lcom/oplus/seedling/sdk/seedling/SeedlingUIData;Ljava/lang/String;)V", "getCardId", "()I", "getCardUniqueKey", "()Ljava/lang/String;", "getData", "()[B", "getExtraMsg", "getForceChangeCardUI", "()Z", "getIdMaps", "()Ljava/util/HashMap;", "getLayoutName", "getName", "getSeedlingUIData", "()Lcom/oplus/seedling/sdk/seedling/SeedlingUIData;", "setSeedlingUIData", "(Lcom/oplus/seedling/sdk/seedling/SeedlingUIData;)V", "getThemeId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getValue", "getVersion", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "([BILjava/util/HashMap;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;[BZLjava/lang/String;Ljava/lang/String;Lcom/oplus/seedling/sdk/seedling/SeedlingUIData;Ljava/lang/String;)Lpantanal/app/bean/PantanalUIData;", "equals", "other", "hashCode", "toJsonString", "toString", "Companion", "pantanal-interface_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class PantanalUIData {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String TAG = "UIData";
    private final int cardId;

    @NotNull
    private final String cardUniqueKey;

    @NotNull
    private final byte[] data;

    @NotNull
    private final String extraMsg;
    private final boolean forceChangeCardUI;

    @Nullable
    private final HashMap<String, Integer> idMaps;

    @NotNull
    private final String layoutName;

    @Nullable
    private final String name;

    @Nullable
    private SeedlingUIData seedlingUIData;

    @Nullable
    private final Integer themeId;

    @Nullable
    private final byte[] value;

    @Nullable
    private final Long version;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lpantanal/app/bean/PantanalUIData$Companion;", "", "()V", "TAG", "", "fromJsonString", "Lpantanal/app/bean/PantanalUIData;", "json", "pantanal-interface_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @FromJson
        @Nullable
        public final PantanalUIData fromJsonString(@NotNull String json) {
            Intrinsics.checkNotNullParameter(json, "json");
            try {
                Result.Companion companion = Result.INSTANCE;
                return (PantanalUIData) JsonUtils.b(json, PantanalUIData.class);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                Object objM5287constructorimpl = Result.m5287constructorimpl(ResultKt.createFailure(th));
                Throwable thM5290exceptionOrNullimpl = Result.m5290exceptionOrNullimpl(objM5287constructorimpl);
                if (thM5290exceptionOrNullimpl != null) {
                    bs9.a.c(t6e.INSTANCE, PantanalUIData.TAG, "fromJsonString failed,msg = " + thM5290exceptionOrNullimpl.getMessage(), false, null, false, 0, false, null, 252, null);
                }
                if (Result.m5293isFailureimpl(objM5287constructorimpl)) {
                    objM5287constructorimpl = null;
                }
                return (PantanalUIData) objM5287constructorimpl;
            }
        }
    }

    public PantanalUIData(@Json(name = "data") @NotNull byte[] data, @Json(name = "cardId") int i, @Json(name = "idMaps") @Nullable HashMap<String, Integer> map, @Json(name = "name") @Nullable String str, @Json(name = "version") @Nullable Long l2, @Json(name = "themeId") @Nullable Integer num, @Json(name = "value") @Nullable byte[] bArr, @Json(name = "forceChangeCardUI") boolean z, @Json(name = BaseDataPack.KEY_LAYOUT_NAME) @NotNull String layoutName, @Json(name = BaseDataPack.KEY_EXTRA_MSG) @NotNull String extraMsg, @Json(name = "seedlingUIData") @Nullable SeedlingUIData seedlingUIData, @Json(name = "cardUniqueKey") @NotNull String cardUniqueKey) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(layoutName, "layoutName");
        Intrinsics.checkNotNullParameter(extraMsg, "extraMsg");
        Intrinsics.checkNotNullParameter(cardUniqueKey, "cardUniqueKey");
        this.data = data;
        this.cardId = i;
        this.idMaps = map;
        this.name = str;
        this.version = l2;
        this.themeId = num;
        this.value = bArr;
        this.forceChangeCardUI = z;
        this.layoutName = layoutName;
        this.extraMsg = extraMsg;
        this.seedlingUIData = seedlingUIData;
        this.cardUniqueKey = cardUniqueKey;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final byte[] getData() {
        return this.data;
    }

    @NotNull
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getExtraMsg() {
        return this.extraMsg;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final SeedlingUIData getSeedlingUIData() {
        return this.seedlingUIData;
    }

    @NotNull
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getCardUniqueKey() {
        return this.cardUniqueKey;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getCardId() {
        return this.cardId;
    }

    @Nullable
    public final HashMap<String, Integer> component3() {
        return this.idMaps;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Long getVersion() {
        return this.version;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Integer getThemeId() {
        return this.themeId;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final byte[] getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getForceChangeCardUI() {
        return this.forceChangeCardUI;
    }

    @NotNull
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getLayoutName() {
        return this.layoutName;
    }

    @NotNull
    public final PantanalUIData copy(@Json(name = "data") @NotNull byte[] data, @Json(name = "cardId") int cardId, @Json(name = "idMaps") @Nullable HashMap<String, Integer> idMaps, @Json(name = "name") @Nullable String name, @Json(name = "version") @Nullable Long version, @Json(name = "themeId") @Nullable Integer themeId, @Json(name = "value") @Nullable byte[] value, @Json(name = "forceChangeCardUI") boolean forceChangeCardUI, @Json(name = BaseDataPack.KEY_LAYOUT_NAME) @NotNull String layoutName, @Json(name = BaseDataPack.KEY_EXTRA_MSG) @NotNull String extraMsg, @Json(name = "seedlingUIData") @Nullable SeedlingUIData seedlingUIData, @Json(name = "cardUniqueKey") @NotNull String cardUniqueKey) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(layoutName, "layoutName");
        Intrinsics.checkNotNullParameter(extraMsg, "extraMsg");
        Intrinsics.checkNotNullParameter(cardUniqueKey, "cardUniqueKey");
        return new PantanalUIData(data, cardId, idMaps, name, version, themeId, value, forceChangeCardUI, layoutName, extraMsg, seedlingUIData, cardUniqueKey);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(PantanalUIData.class, other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(other, "null cannot be cast to non-null type pantanal.app.bean.PantanalUIData");
        PantanalUIData pantanalUIData = (PantanalUIData) other;
        if (!Arrays.equals(this.data, pantanalUIData.data) || this.cardId != pantanalUIData.cardId || !Intrinsics.areEqual(this.idMaps, pantanalUIData.idMaps) || !Intrinsics.areEqual(this.name, pantanalUIData.name) || !Intrinsics.areEqual(this.version, pantanalUIData.version) || !Intrinsics.areEqual(this.themeId, pantanalUIData.themeId)) {
            return false;
        }
        byte[] bArr = this.value;
        if (bArr != null) {
            byte[] bArr2 = pantanalUIData.value;
            if (bArr2 == null || !Arrays.equals(bArr, bArr2)) {
                return false;
            }
        } else if (pantanalUIData.value != null) {
            return false;
        }
        return this.forceChangeCardUI == pantanalUIData.forceChangeCardUI && Intrinsics.areEqual(this.layoutName, pantanalUIData.layoutName) && Intrinsics.areEqual(this.seedlingUIData, pantanalUIData.seedlingUIData) && Intrinsics.areEqual(this.cardUniqueKey, pantanalUIData.cardUniqueKey);
    }

    public final int getCardId() {
        return this.cardId;
    }

    @NotNull
    public final String getCardUniqueKey() {
        return this.cardUniqueKey;
    }

    @NotNull
    public final byte[] getData() {
        return this.data;
    }

    @NotNull
    public final String getExtraMsg() {
        return this.extraMsg;
    }

    public final boolean getForceChangeCardUI() {
        return this.forceChangeCardUI;
    }

    @Nullable
    public final HashMap<String, Integer> getIdMaps() {
        return this.idMaps;
    }

    @NotNull
    public final String getLayoutName() {
        return this.layoutName;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final SeedlingUIData getSeedlingUIData() {
        return this.seedlingUIData;
    }

    @Nullable
    public final Integer getThemeId() {
        return this.themeId;
    }

    @Nullable
    public final byte[] getValue() {
        return this.value;
    }

    @Nullable
    public final Long getVersion() {
        return this.version;
    }

    public int hashCode() {
        int iHashCode = ((Arrays.hashCode(this.data) * 31) + this.cardId) * 31;
        HashMap<String, Integer> map = this.idMaps;
        int iHashCode2 = (iHashCode + (map != null ? map.hashCode() : 0)) * 31;
        String str = this.name;
        int iHashCode3 = (iHashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        Long l2 = this.version;
        int iHashCode4 = (iHashCode3 + (l2 != null ? l2.hashCode() : 0)) * 31;
        Integer num = this.themeId;
        int iIntValue = (iHashCode4 + (num != null ? num.intValue() : 0)) * 31;
        byte[] bArr = this.value;
        int iHashCode5 = (((iIntValue + (bArr != null ? Arrays.hashCode(bArr) : 0)) * 31) + Boolean.hashCode(this.forceChangeCardUI)) * 31;
        String str2 = this.layoutName;
        int iHashCode6 = (iHashCode5 + (str2 != null ? str2.hashCode() : 0)) * 31;
        SeedlingUIData seedlingUIData = this.seedlingUIData;
        int iHashCode7 = (iHashCode6 + (seedlingUIData != null ? seedlingUIData.hashCode() : 0)) * 31;
        String str3 = this.cardUniqueKey;
        return iHashCode7 + (str3 != null ? str3.hashCode() : 0);
    }

    public final void setSeedlingUIData(@Nullable SeedlingUIData seedlingUIData) {
        this.seedlingUIData = seedlingUIData;
    }

    @ToJson
    @NotNull
    public final String toJsonString() {
        return JsonUtils.d(this, PantanalUIData.class);
    }

    @NotNull
    public String toString() {
        int i = this.cardId;
        HashMap<String, Integer> map = this.idMaps;
        String str = this.name;
        Long l2 = this.version;
        Integer num = this.themeId;
        String str2 = this.extraMsg;
        boolean z = this.forceChangeCardUI;
        String str3 = this.layoutName;
        int length = this.data.length;
        byte[] bArr = this.value;
        return "PantanalUIData(cardId=" + i + ", idMaps=" + map + ", name=" + str + ", version=" + l2 + ", themeId=" + num + ",  extraMsg='" + str2 + "' forceChangeCardUI=" + z + ", layoutName='" + str3 + "',dataSize =" + length + ", valueSize=" + (bArr != null ? Integer.valueOf(bArr.length) : null) + ",seedlingUIData=" + this.seedlingUIData + ",cardUniqueKey=" + this.cardUniqueKey + ",)";
    }

    public /* synthetic */ PantanalUIData(byte[] bArr, int i, HashMap map, String str, Long l2, Integer num, byte[] bArr2, boolean z, String str2, String str3, SeedlingUIData seedlingUIData, String str4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(bArr, i, (i2 & 4) != 0 ? null : map, (i2 & 8) != 0 ? "" : str, (i2 & 16) != 0 ? 1L : l2, (i2 & 32) != 0 ? 0 : num, (i2 & 64) != 0 ? null : bArr2, (i2 & 128) != 0 ? false : z, (i2 & 256) != 0 ? "" : str2, (i2 & 512) != 0 ? "" : str3, (i2 & 1024) != 0 ? null : seedlingUIData, (i2 & 2048) != 0 ? "" : str4);
    }
}
