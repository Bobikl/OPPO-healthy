package pantanal.app.bean;

import android.graphics.Bitmap;
import android.util.ArrayMap;
import androidx.annotation.Keep;
import com.oplus.pantanal.seedling.convertor.JsonToSeedlingCardOptionsConvertor;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Deprecated;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
@Keep
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b)\b\u0087\b\u0018\u00002\u00020\u0001B\u0081\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u0012\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0011¢\u0006\u0002\u0010\u0012J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010,\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0011HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010/\u001a\u00020\bHÆ\u0003J\t\u00100\u001a\u00020\nHÆ\u0003J\t\u00101\u001a\u00020\bHÆ\u0003J\t\u00102\u001a\u00020\bHÆ\u0003J\u0017\u00103\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000eHÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0091\u0001\u00105\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\b2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00052\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0011HÆ\u0001J\u0013\u00106\u001a\u00020\b2\b\u00107\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00108\u001a\u00020\nHÖ\u0001J\t\u00109\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R(\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR(\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010#R\u001a\u0010\f\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010#\"\u0004\b$\u0010%R\u0011\u0010\u000b\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b&\u0010#R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0014R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0014\"\u0004\b)\u0010*¨\u0006:"}, d2 = {"Lpantanal/app/bean/ResultData;", "", "icon", "Landroid/graphics/Bitmap;", "title", "", "des", JsonToSeedlingCardOptionsConvertor.KEY_IS_MILESTONE, "", JsonToSeedlingCardOptionsConvertor.KEY_GRADE, "", "shouldShow", "isRequestShowPanel", "interactionData", "", "voiceContent", "extraData", "Landroid/util/ArrayMap;", "(Landroid/graphics/Bitmap;Ljava/lang/String;Ljava/lang/String;ZIZZLjava/util/Map;Ljava/lang/String;Landroid/util/ArrayMap;)V", "getDes", "()Ljava/lang/String;", "getExtraData", "()Landroid/util/ArrayMap;", "setExtraData", "(Landroid/util/ArrayMap;)V", "getIcon", "()Landroid/graphics/Bitmap;", "getImportance$annotations", "()V", "getImportance", "()I", "getInteractionData", "()Ljava/util/Map;", "setInteractionData", "(Ljava/util/Map;)V", "()Z", "setRequestShowPanel", "(Z)V", "getShouldShow", "getTitle", "getVoiceContent", "setVoiceContent", "(Ljava/lang/String;)V", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "pantanal-interface_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class ResultData {

    @Nullable
    private final String des;

    @Nullable
    private ArrayMap<String, Object> extraData;

    @Nullable
    private final Bitmap icon;
    private final int importance;

    @Nullable
    private Map<String, ? extends Object> interactionData;
    private final boolean isMilestone;
    private boolean isRequestShowPanel;
    private final boolean shouldShow;

    @Nullable
    private final String title;

    @Nullable
    private String voiceContent;

    public ResultData(@Nullable Bitmap bitmap, @Nullable String str, @Nullable String str2, boolean z, int i, boolean z2, boolean z3, @Nullable Map<String, ? extends Object> map, @Nullable String str3, @Nullable ArrayMap<String, Object> arrayMap) {
        this.icon = bitmap;
        this.title = str;
        this.des = str2;
        this.isMilestone = z;
        this.importance = i;
        this.shouldShow = z2;
        this.isRequestShowPanel = z3;
        this.interactionData = map;
        this.voiceContent = str3;
        this.extraData = arrayMap;
    }

    @Deprecated(message = "please use param shouldShow, which is decided by SeedlingSdk.")
    public static /* synthetic */ void getImportance$annotations() {
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Bitmap getIcon() {
        return this.icon;
    }

    @Nullable
    public final ArrayMap<String, Object> component10() {
        return this.extraData;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDes() {
        return this.des;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getIsMilestone() {
        return this.isMilestone;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getImportance() {
        return this.importance;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getShouldShow() {
        return this.shouldShow;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getIsRequestShowPanel() {
        return this.isRequestShowPanel;
    }

    @Nullable
    public final Map<String, Object> component8() {
        return this.interactionData;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getVoiceContent() {
        return this.voiceContent;
    }

    @NotNull
    public final ResultData copy(@Nullable Bitmap icon, @Nullable String title, @Nullable String des, boolean isMilestone, int importance, boolean shouldShow, boolean isRequestShowPanel, @Nullable Map<String, ? extends Object> interactionData, @Nullable String voiceContent, @Nullable ArrayMap<String, Object> extraData) {
        return new ResultData(icon, title, des, isMilestone, importance, shouldShow, isRequestShowPanel, interactionData, voiceContent, extraData);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ResultData)) {
            return false;
        }
        ResultData resultData = (ResultData) other;
        return Intrinsics.areEqual(this.icon, resultData.icon) && Intrinsics.areEqual(this.title, resultData.title) && Intrinsics.areEqual(this.des, resultData.des) && this.isMilestone == resultData.isMilestone && this.importance == resultData.importance && this.shouldShow == resultData.shouldShow && this.isRequestShowPanel == resultData.isRequestShowPanel && Intrinsics.areEqual(this.interactionData, resultData.interactionData) && Intrinsics.areEqual(this.voiceContent, resultData.voiceContent) && Intrinsics.areEqual(this.extraData, resultData.extraData);
    }

    @Nullable
    public final String getDes() {
        return this.des;
    }

    @Nullable
    public final ArrayMap<String, Object> getExtraData() {
        return this.extraData;
    }

    @Nullable
    public final Bitmap getIcon() {
        return this.icon;
    }

    public final int getImportance() {
        return this.importance;
    }

    @Nullable
    public final Map<String, Object> getInteractionData() {
        return this.interactionData;
    }

    public final boolean getShouldShow() {
        return this.shouldShow;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    public final String getVoiceContent() {
        return this.voiceContent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [int] */
    /* JADX WARN: Type inference failed for: r2v11, types: [int] */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v7, types: [int] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v2 */
    public int hashCode() {
        Bitmap bitmap = this.icon;
        int iHashCode = (bitmap == null ? 0 : bitmap.hashCode()) * 31;
        String str = this.title;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.des;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        boolean z = this.isMilestone;
        ?? r2 = z;
        if (z) {
            r2 = 1;
        }
        int iHashCode4 = (((iHashCode3 + r2) * 31) + Integer.hashCode(this.importance)) * 31;
        boolean z2 = this.shouldShow;
        ?? r3 = z2;
        if (z2) {
            r3 = 1;
        }
        int i = (iHashCode4 + r3) * 31;
        boolean z3 = this.isRequestShowPanel;
        int i2 = (i + (z3 ? 1 : z3)) * 31;
        Map<String, ? extends Object> map = this.interactionData;
        int iHashCode5 = (i2 + (map == null ? 0 : map.hashCode())) * 31;
        String str3 = this.voiceContent;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        ArrayMap<String, Object> arrayMap = this.extraData;
        return iHashCode6 + (arrayMap != null ? arrayMap.hashCode() : 0);
    }

    public final boolean isMilestone() {
        return this.isMilestone;
    }

    public final boolean isRequestShowPanel() {
        return this.isRequestShowPanel;
    }

    public final void setExtraData(@Nullable ArrayMap<String, Object> arrayMap) {
        this.extraData = arrayMap;
    }

    public final void setInteractionData(@Nullable Map<String, ? extends Object> map) {
        this.interactionData = map;
    }

    public final void setRequestShowPanel(boolean z) {
        this.isRequestShowPanel = z;
    }

    public final void setVoiceContent(@Nullable String str) {
        this.voiceContent = str;
    }

    @NotNull
    public String toString() {
        return "ResultData(icon=" + this.icon + ", title=" + this.title + ", des=" + this.des + ", isMilestone=" + this.isMilestone + ", importance=" + this.importance + ", shouldShow=" + this.shouldShow + ", isRequestShowPanel=" + this.isRequestShowPanel + ", interactionData=" + this.interactionData + ", voiceContent=" + this.voiceContent + ", extraData=" + this.extraData + ")";
    }

    public /* synthetic */ ResultData(Bitmap bitmap, String str, String str2, boolean z, int i, boolean z2, boolean z3, Map map, String str3, ArrayMap arrayMap, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(bitmap, str, str2, z, i, z2, (i2 & 64) != 0 ? false : z3, (i2 & 128) != 0 ? null : map, (i2 & 256) != 0 ? null : str3, (i2 & 512) != 0 ? null : arrayMap);
    }
}
