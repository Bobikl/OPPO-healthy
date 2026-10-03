package com.oplus.mydevices.sdk.device;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.DrawableRes;
import androidx.annotation.Keep;
import com.oplus.aiunit.vision.f04;
import com.oplus.aiunit.vision.k18;
import com.oplus.aiunit.vision.l18;
import com.oplus.utrace.db.UTraceSQLiteHelperKt;
import java.util.ArrayList;
import java.util.Iterator;
import kotlinx.android.parcel.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmOverloads;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Parcelize
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b1\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001NB\u009b\u0001\b\u0007\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\u0002\u0010\u0013J\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00105\u001a\u00020\u0006HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u00108\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010:\u001a\u00020\u0006HÆ\u0003J\t\u0010;\u001a\u00020\u0006HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010>\u001a\u00020\u0003HÆ\u0003J\t\u0010?\u001a\u00020\u0003HÆ\u0003J\t\u0010@\u001a\u00020\u0003HÆ\u0003J\u009d\u0001\u0010A\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00062\b\b\u0003\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00062\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011HÆ\u0001J\t\u0010B\u001a\u00020\u0006HÖ\u0001J\u0013\u0010C\u001a\u00020D2\b\u0010E\u001a\u0004\u0018\u00010FHÖ\u0003J\t\u0010G\u001a\u00020\u0006HÖ\u0001J\t\u0010H\u001a\u00020\u0003HÖ\u0001J\u0019\u0010I\u001a\u00020J2\u0006\u0010K\u001a\u00020L2\u0006\u0010M\u001a\u00020\u0006HÖ\u0001R \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0019\"\u0004\b\u001d\u0010\u001bR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0019\"\u0004\b\u001f\u0010\u001bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0019\"\u0004\b!\u0010\u001bR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001a\u0010\u0007\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010#\"\u0004\b'\u0010%R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0019\"\u0004\b)\u0010\u001bR\u001a\u0010\n\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0019\"\u0004\b+\u0010\u001bR\u001a\u0010\f\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u0019\"\u0004\b-\u0010\u001bR\u001a\u0010\r\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010#\"\u0004\b/\u0010%R\u001a\u0010\u000b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u0019\"\u0004\b1\u0010\u001bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u0019\"\u0004\b3\u0010\u001b¨\u0006O"}, d2 = {"Lcom/oplus/mydevices/sdk/device/ActionMenu;", "Landroid/os/Parcelable;", "mDeviceId", "", "mMenuName", "mMenuIconId", "", "mMenuIconIdDark", "mMenuIconUrl", "mMenuActionType", "mMenuIntentAction", "mMenuIntentPackage", "mMenuIntentClass", "mMenuIntentHaveExtra", "mAuthority", "mDeepLinksUrl", "intentExtraList", "Ljava/util/ArrayList;", "Lcom/oplus/mydevices/sdk/device/IntentExtra;", "(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;)V", "getIntentExtraList", "()Ljava/util/ArrayList;", "setIntentExtraList", "(Ljava/util/ArrayList;)V", "getMAuthority", "()Ljava/lang/String;", "setMAuthority", "(Ljava/lang/String;)V", "getMDeepLinksUrl", "setMDeepLinksUrl", "getMDeviceId", "setMDeviceId", "getMMenuActionType", "setMMenuActionType", "getMMenuIconId", "()I", "setMMenuIconId", "(I)V", "getMMenuIconIdDark", "setMMenuIconIdDark", "getMMenuIconUrl", "setMMenuIconUrl", "getMMenuIntentAction", "setMMenuIntentAction", "getMMenuIntentClass", "setMMenuIntentClass", "getMMenuIntentHaveExtra", "setMMenuIntentHaveExtra", "getMMenuIntentPackage", "setMMenuIntentPackage", "getMMenuName", "setMMenuName", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", UTraceSQLiteHelperKt.COL_FLAGS, "ActionType", "sdk_domesticRelease"}, k = 1, mv = {1, 4, 0})
public final /* data */ class ActionMenu implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Creator();

    @NotNull
    private ArrayList<IntentExtra> intentExtraList;

    @Nullable
    private String mAuthority;

    @Nullable
    private String mDeepLinksUrl;

    @Nullable
    private String mDeviceId;

    @Nullable
    private String mMenuActionType;
    private int mMenuIconId;
    private int mMenuIconIdDark;

    @Nullable
    private String mMenuIconUrl;

    @NotNull
    private String mMenuIntentAction;

    @NotNull
    private String mMenuIntentClass;
    private int mMenuIntentHaveExtra;

    @NotNull
    private String mMenuIntentPackage;

    @Nullable
    private String mMenuName;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/oplus/mydevices/sdk/device/ActionMenu$ActionType;", "", "()V", "ACTIVITY", "", "BROADCAST", "DEEP_LINKS", "SERVICE", "isValidActionType", "", f04.JSON_KEY_RKE_ACTION_TYPE, "sdk_domesticRelease"}, k = 1, mv = {1, 4, 0})
    public static final class ActionType {

        @NotNull
        public static final String ACTIVITY = "activity";

        @NotNull
        public static final String BROADCAST = "broadcast";

        @NotNull
        public static final String DEEP_LINKS = "deepLinks";
        public static final ActionType INSTANCE = new ActionType();

        @NotNull
        public static final String SERVICE = "service";

        private ActionType() {
        }

        @JvmStatic
        public static final boolean isValidActionType(@Nullable String actionType) {
            return Intrinsics.areEqual("activity", actionType) || Intrinsics.areEqual("broadcast", actionType) || Intrinsics.areEqual("service", actionType) || Intrinsics.areEqual(DEEP_LINKS, actionType);
        }
    }

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 0})
    public static class Creator implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final Object createFromParcel(@NotNull Parcel in) {
            Intrinsics.checkNotNullParameter(in, "in");
            String string = in.readString();
            String string2 = in.readString();
            int i = in.readInt();
            int i2 = in.readInt();
            String string3 = in.readString();
            String string4 = in.readString();
            String string5 = in.readString();
            String string6 = in.readString();
            String string7 = in.readString();
            int i3 = in.readInt();
            String string8 = in.readString();
            String string9 = in.readString();
            int i4 = in.readInt();
            ArrayList arrayList = new ArrayList(i4);
            while (true) {
                String str = string9;
                if (i4 == 0) {
                    return new ActionMenu(string, string2, i, i2, string3, string4, string5, string6, string7, i3, string8, string9, arrayList);
                }
                arrayList.add((IntentExtra) IntentExtra.CREATOR.createFromParcel(in));
                i4--;
                string9 = str;
            }
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public final Object[] newArray(int i) {
            return new ActionMenu[i];
        }
    }

    @JvmOverloads
    public ActionMenu() {
        this(null, null, 0, 0, null, null, null, null, null, 0, null, null, null, 8191, null);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMDeviceId() {
        return this.mDeviceId;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final int getMMenuIntentHaveExtra() {
        return this.mMenuIntentHaveExtra;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getMAuthority() {
        return this.mAuthority;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getMDeepLinksUrl() {
        return this.mDeepLinksUrl;
    }

    @NotNull
    public final ArrayList<IntentExtra> component13() {
        return this.intentExtraList;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMMenuName() {
        return this.mMenuName;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getMMenuIconId() {
        return this.mMenuIconId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getMMenuIconIdDark() {
        return this.mMenuIconIdDark;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getMMenuIconUrl() {
        return this.mMenuIconUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getMMenuActionType() {
        return this.mMenuActionType;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getMMenuIntentAction() {
        return this.mMenuIntentAction;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getMMenuIntentPackage() {
        return this.mMenuIntentPackage;
    }

    @NotNull
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getMMenuIntentClass() {
        return this.mMenuIntentClass;
    }

    @NotNull
    public final ActionMenu copy(@Nullable String mDeviceId, @Nullable String mMenuName, @DrawableRes int mMenuIconId, @DrawableRes int mMenuIconIdDark, @Nullable String mMenuIconUrl, @Nullable String mMenuActionType, @NotNull String mMenuIntentAction, @NotNull String mMenuIntentPackage, @NotNull String mMenuIntentClass, int mMenuIntentHaveExtra, @Nullable String mAuthority, @Nullable String mDeepLinksUrl, @NotNull ArrayList<IntentExtra> intentExtraList) {
        Intrinsics.checkNotNullParameter(mMenuIntentAction, "mMenuIntentAction");
        Intrinsics.checkNotNullParameter(mMenuIntentPackage, "mMenuIntentPackage");
        Intrinsics.checkNotNullParameter(mMenuIntentClass, "mMenuIntentClass");
        Intrinsics.checkNotNullParameter(intentExtraList, "intentExtraList");
        return new ActionMenu(mDeviceId, mMenuName, mMenuIconId, mMenuIconIdDark, mMenuIconUrl, mMenuActionType, mMenuIntentAction, mMenuIntentPackage, mMenuIntentClass, mMenuIntentHaveExtra, mAuthority, mDeepLinksUrl, intentExtraList);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ActionMenu)) {
            return false;
        }
        ActionMenu actionMenu = (ActionMenu) other;
        return Intrinsics.areEqual(this.mDeviceId, actionMenu.mDeviceId) && Intrinsics.areEqual(this.mMenuName, actionMenu.mMenuName) && this.mMenuIconId == actionMenu.mMenuIconId && this.mMenuIconIdDark == actionMenu.mMenuIconIdDark && Intrinsics.areEqual(this.mMenuIconUrl, actionMenu.mMenuIconUrl) && Intrinsics.areEqual(this.mMenuActionType, actionMenu.mMenuActionType) && Intrinsics.areEqual(this.mMenuIntentAction, actionMenu.mMenuIntentAction) && Intrinsics.areEqual(this.mMenuIntentPackage, actionMenu.mMenuIntentPackage) && Intrinsics.areEqual(this.mMenuIntentClass, actionMenu.mMenuIntentClass) && this.mMenuIntentHaveExtra == actionMenu.mMenuIntentHaveExtra && Intrinsics.areEqual(this.mAuthority, actionMenu.mAuthority) && Intrinsics.areEqual(this.mDeepLinksUrl, actionMenu.mDeepLinksUrl) && Intrinsics.areEqual(this.intentExtraList, actionMenu.intentExtraList);
    }

    @NotNull
    public final ArrayList<IntentExtra> getIntentExtraList() {
        return this.intentExtraList;
    }

    @Nullable
    public final String getMAuthority() {
        return this.mAuthority;
    }

    @Nullable
    public final String getMDeepLinksUrl() {
        return this.mDeepLinksUrl;
    }

    @Nullable
    public final String getMDeviceId() {
        return this.mDeviceId;
    }

    @Nullable
    public final String getMMenuActionType() {
        return this.mMenuActionType;
    }

    public final int getMMenuIconId() {
        return this.mMenuIconId;
    }

    public final int getMMenuIconIdDark() {
        return this.mMenuIconIdDark;
    }

    @Nullable
    public final String getMMenuIconUrl() {
        return this.mMenuIconUrl;
    }

    @NotNull
    public final String getMMenuIntentAction() {
        return this.mMenuIntentAction;
    }

    @NotNull
    public final String getMMenuIntentClass() {
        return this.mMenuIntentClass;
    }

    public final int getMMenuIntentHaveExtra() {
        return this.mMenuIntentHaveExtra;
    }

    @NotNull
    public final String getMMenuIntentPackage() {
        return this.mMenuIntentPackage;
    }

    @Nullable
    public final String getMMenuName() {
        return this.mMenuName;
    }

    public int hashCode() {
        String str = this.mDeviceId;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.mMenuName;
        int iHashCode2 = (((((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.mMenuIconId) * 31) + this.mMenuIconIdDark) * 31;
        String str3 = this.mMenuIconUrl;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.mMenuActionType;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.mMenuIntentAction;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.mMenuIntentPackage;
        int iHashCode6 = (iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.mMenuIntentClass;
        int iHashCode7 = (((iHashCode6 + (str7 != null ? str7.hashCode() : 0)) * 31) + this.mMenuIntentHaveExtra) * 31;
        String str8 = this.mAuthority;
        int iHashCode8 = (iHashCode7 + (str8 != null ? str8.hashCode() : 0)) * 31;
        String str9 = this.mDeepLinksUrl;
        int iHashCode9 = (iHashCode8 + (str9 != null ? str9.hashCode() : 0)) * 31;
        ArrayList<IntentExtra> arrayList = this.intentExtraList;
        return iHashCode9 + (arrayList != null ? arrayList.hashCode() : 0);
    }

    public final void setIntentExtraList(@NotNull ArrayList<IntentExtra> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.intentExtraList = arrayList;
    }

    public final void setMAuthority(@Nullable String str) {
        this.mAuthority = str;
    }

    public final void setMDeepLinksUrl(@Nullable String str) {
        this.mDeepLinksUrl = str;
    }

    public final void setMDeviceId(@Nullable String str) {
        this.mDeviceId = str;
    }

    public final void setMMenuActionType(@Nullable String str) {
        this.mMenuActionType = str;
    }

    public final void setMMenuIconId(int i) {
        this.mMenuIconId = i;
    }

    public final void setMMenuIconIdDark(int i) {
        this.mMenuIconIdDark = i;
    }

    public final void setMMenuIconUrl(@Nullable String str) {
        this.mMenuIconUrl = str;
    }

    public final void setMMenuIntentAction(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.mMenuIntentAction = str;
    }

    public final void setMMenuIntentClass(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.mMenuIntentClass = str;
    }

    public final void setMMenuIntentHaveExtra(int i) {
        this.mMenuIntentHaveExtra = i;
    }

    public final void setMMenuIntentPackage(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.mMenuIntentPackage = str;
    }

    public final void setMMenuName(@Nullable String str) {
        this.mMenuName = str;
    }

    @NotNull
    public String toString() {
        return "ActionMenu(mDeviceId=" + this.mDeviceId + ", mMenuName=" + this.mMenuName + ", mMenuIconId=" + this.mMenuIconId + ", mMenuIconIdDark=" + this.mMenuIconIdDark + ", mMenuIconUrl=" + this.mMenuIconUrl + ", mMenuActionType=" + this.mMenuActionType + ", mMenuIntentAction=" + this.mMenuIntentAction + ", mMenuIntentPackage=" + this.mMenuIntentPackage + ", mMenuIntentClass=" + this.mMenuIntentClass + ", mMenuIntentHaveExtra=" + this.mMenuIntentHaveExtra + ", mAuthority=" + this.mAuthority + ", mDeepLinksUrl=" + this.mDeepLinksUrl + ", intentExtraList=" + this.intentExtraList + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(this.mDeviceId);
        parcel.writeString(this.mMenuName);
        parcel.writeInt(this.mMenuIconId);
        parcel.writeInt(this.mMenuIconIdDark);
        parcel.writeString(this.mMenuIconUrl);
        parcel.writeString(this.mMenuActionType);
        parcel.writeString(this.mMenuIntentAction);
        parcel.writeString(this.mMenuIntentPackage);
        parcel.writeString(this.mMenuIntentClass);
        parcel.writeInt(this.mMenuIntentHaveExtra);
        parcel.writeString(this.mAuthority);
        parcel.writeString(this.mDeepLinksUrl);
        ArrayList<IntentExtra> arrayList = this.intentExtraList;
        parcel.writeInt(arrayList.size());
        Iterator<IntentExtra> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, 0);
        }
    }

    @JvmOverloads
    public ActionMenu(@Nullable String str) {
        this(str, null, 0, 0, null, null, null, null, null, 0, null, null, null, 8190, null);
    }

    @JvmOverloads
    public ActionMenu(@Nullable String str, @Nullable String str2) {
        this(str, str2, 0, 0, null, null, null, null, null, 0, null, null, null, 8188, null);
    }

    @JvmOverloads
    public ActionMenu(@Nullable String str, @Nullable String str2, @DrawableRes int i) {
        this(str, str2, i, 0, null, null, null, null, null, 0, null, null, null, 8184, null);
    }

    @JvmOverloads
    public ActionMenu(@Nullable String str, @Nullable String str2, @DrawableRes int i, @DrawableRes int i2) {
        this(str, str2, i, i2, null, null, null, null, null, 0, null, null, null, 8176, null);
    }

    @JvmOverloads
    public ActionMenu(@Nullable String str, @Nullable String str2, @DrawableRes int i, @DrawableRes int i2, @Nullable String str3) {
        this(str, str2, i, i2, str3, null, null, null, null, 0, null, null, null, 8160, null);
    }

    @JvmOverloads
    public ActionMenu(@Nullable String str, @Nullable String str2, @DrawableRes int i, @DrawableRes int i2, @Nullable String str3, @Nullable String str4) {
        this(str, str2, i, i2, str3, str4, null, null, null, 0, null, null, null, 8128, null);
    }

    @JvmOverloads
    public ActionMenu(@Nullable String str, @Nullable String str2, @DrawableRes int i, @DrawableRes int i2, @Nullable String str3, @Nullable String str4, @NotNull String str5) {
        this(str, str2, i, i2, str3, str4, str5, null, null, 0, null, null, null, 8064, null);
    }

    @JvmOverloads
    public ActionMenu(@Nullable String str, @Nullable String str2, @DrawableRes int i, @DrawableRes int i2, @Nullable String str3, @Nullable String str4, @NotNull String str5, @NotNull String str6) {
        this(str, str2, i, i2, str3, str4, str5, str6, null, 0, null, null, null, k18.GL_VENDOR, null);
    }

    @JvmOverloads
    public ActionMenu(@Nullable String str, @Nullable String str2, @DrawableRes int i, @DrawableRes int i2, @Nullable String str3, @Nullable String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7) {
        this(str, str2, i, i2, str3, str4, str5, str6, str7, 0, null, null, null, k18.GL_KEEP, null);
    }

    @JvmOverloads
    public ActionMenu(@Nullable String str, @Nullable String str2, @DrawableRes int i, @DrawableRes int i2, @Nullable String str3, @Nullable String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, int i3) {
        this(str, str2, i, i2, str3, str4, str5, str6, str7, i3, null, null, null, 7168, null);
    }

    @JvmOverloads
    public ActionMenu(@Nullable String str, @Nullable String str2, @DrawableRes int i, @DrawableRes int i2, @Nullable String str3, @Nullable String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, int i3, @Nullable String str8) {
        this(str, str2, i, i2, str3, str4, str5, str6, str7, i3, str8, null, null, l18.GL_COLOR, null);
    }

    @JvmOverloads
    public ActionMenu(@Nullable String str, @Nullable String str2, @DrawableRes int i, @DrawableRes int i2, @Nullable String str3, @Nullable String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, int i3, @Nullable String str8, @Nullable String str9) {
        this(str, str2, i, i2, str3, str4, str5, str6, str7, i3, str8, str9, null, 4096, null);
    }

    @JvmOverloads
    public ActionMenu(@Nullable String str, @Nullable String str2, @DrawableRes int i, @DrawableRes int i2, @Nullable String str3, @Nullable String str4, @NotNull String mMenuIntentAction, @NotNull String mMenuIntentPackage, @NotNull String mMenuIntentClass, int i3, @Nullable String str5, @Nullable String str6, @NotNull ArrayList<IntentExtra> intentExtraList) {
        Intrinsics.checkNotNullParameter(mMenuIntentAction, "mMenuIntentAction");
        Intrinsics.checkNotNullParameter(mMenuIntentPackage, "mMenuIntentPackage");
        Intrinsics.checkNotNullParameter(mMenuIntentClass, "mMenuIntentClass");
        Intrinsics.checkNotNullParameter(intentExtraList, "intentExtraList");
        this.mDeviceId = str;
        this.mMenuName = str2;
        this.mMenuIconId = i;
        this.mMenuIconIdDark = i2;
        this.mMenuIconUrl = str3;
        this.mMenuActionType = str4;
        this.mMenuIntentAction = mMenuIntentAction;
        this.mMenuIntentPackage = mMenuIntentPackage;
        this.mMenuIntentClass = mMenuIntentClass;
        this.mMenuIntentHaveExtra = i3;
        this.mAuthority = str5;
        this.mDeepLinksUrl = str6;
        this.intentExtraList = intentExtraList;
    }

    public /* synthetic */ ActionMenu(String str, String str2, int i, int i2, String str3, String str4, String str5, String str6, String str7, int i3, String str8, String str9, ArrayList arrayList, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? "" : str, (i4 & 2) != 0 ? "" : str2, (i4 & 4) != 0 ? -1 : i, (i4 & 8) == 0 ? i2 : -1, (i4 & 16) != 0 ? "" : str3, (i4 & 32) != 0 ? "" : str4, (i4 & 64) != 0 ? "" : str5, (i4 & 128) != 0 ? "" : str6, (i4 & 256) != 0 ? "" : str7, (i4 & 512) != 0 ? 0 : i3, (i4 & 1024) != 0 ? null : str8, (i4 & 2048) == 0 ? str9 : "", (i4 & 4096) != 0 ? new ArrayList() : arrayList);
    }
}
