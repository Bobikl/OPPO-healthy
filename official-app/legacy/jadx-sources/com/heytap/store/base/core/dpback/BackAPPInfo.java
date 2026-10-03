package com.heytap.store.base.core.dpback;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.heytap.store.base.core.R;
import com.heytap.store.base.core.state.Constants;
import com.heytap.store.platform.tools.ContextGetterUtils;
import java.util.Arrays;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.StringCompanionObject;
import p010kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\u0018\u0000 92\u00020\u0001:\u00019B\u0005¢\u0006\u0002\u0010\u0002J\u001c\u00105\u001a\u0002062\u0014\u00107\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0018\u000108R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR\u001a\u0010\u0015\u001a\u00020\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0018\"\u0004\b\u001d\u0010\u001aR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\f\"\u0004\b \u0010\u000eR\u001c\u0010!\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\f\"\u0004\b#\u0010\u000eR\u001c\u0010$\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\f\"\u0004\b&\u0010\u000eR\u001a\u0010'\u001a\u00020(X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010)\"\u0004\b*\u0010+R\u001a\u0010,\u001a\u00020\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u0018\"\u0004\b.\u0010\u001aR\u001a\u0010/\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\f\"\u0004\b1\u0010\u000eR\u001a\u00102\u001a\u00020\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\u0018\"\u0004\b4\u0010\u001a¨\u0006:"}, d2 = {"Lcom/heytap/store/base/core/dpback/BackAPPInfo;", "", "()V", "applicationIcon", "Landroid/graphics/drawable/Drawable;", "getApplicationIcon", "()Landroid/graphics/drawable/Drawable;", "setApplicationIcon", "(Landroid/graphics/drawable/Drawable;)V", "backName", "", "getBackName", "()Ljava/lang/String;", "setBackName", "(Ljava/lang/String;)V", "backPackage", "getBackPackage", "setBackPackage", "backPic", "getBackPic", "setBackPic", "backStyle", "", "getBackStyle", "()I", "setBackStyle", "(I)V", "backType", "getBackType", "setBackType", "backUrl", "getBackUrl", "setBackUrl", "backViewContent", "getBackViewContent", "setBackViewContent", "backViewStyle", "getBackViewStyle", "setBackViewStyle", "isAllowToShow", "", "()Z", "setAllowToShow", "(Z)V", "returnPathType", "getReturnPathType", "setReturnPathType", "showContent", "getShowContent", "setShowContent", "showStyle", "getShowStyle", "setShowStyle", "parseDpUri", "", "urlParams", "", "Companion", "Core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class BackAPPInfo {
    public static final int BACK_TO_STACK = 1;
    public static final int BACK_WITH_DP = 0;
    public static final int BACK_WITH_PACKAGE_NAME = 2;
    public static final int SHOW_ICON = 2;
    public static final int SHOW_ICON_WITH_PACKAGE_NAME = 2;
    public static final int SHOW_PIC = 0;
    public static final int SHOW_TEXT = 1;
    public static final int SHOW_TEXT_WITH_PACKAGE_NAME = 1;

    @Nullable
    private Drawable applicationIcon;

    @Nullable
    private String backName;

    @Nullable
    private String backPackage;

    @Nullable
    private String backPic;
    private int backStyle;
    private int backType;

    @Nullable
    private String backUrl;

    @Nullable
    private String backViewContent;

    @Nullable
    private String backViewStyle;
    private boolean isAllowToShow;
    private int showStyle = 1;

    @NotNull
    private String showContent = "";
    private int returnPathType = -1;

    @Nullable
    public final Drawable getApplicationIcon() {
        return this.applicationIcon;
    }

    @Nullable
    public final String getBackName() {
        return this.backName;
    }

    @Nullable
    public final String getBackPackage() {
        return this.backPackage;
    }

    @Nullable
    public final String getBackPic() {
        return this.backPic;
    }

    public final int getBackStyle() {
        return this.backStyle;
    }

    public final int getBackType() {
        return this.backType;
    }

    @Nullable
    public final String getBackUrl() {
        return this.backUrl;
    }

    @Nullable
    public final String getBackViewContent() {
        return this.backViewContent;
    }

    @Nullable
    public final String getBackViewStyle() {
        return this.backViewStyle;
    }

    public final int getReturnPathType() {
        return this.returnPathType;
    }

    @NotNull
    public final String getShowContent() {
        return this.showContent;
    }

    public final int getShowStyle() {
        return this.showStyle;
    }

    /* JADX INFO: renamed from: isAllowToShow, reason: from getter */
    public final boolean getIsAllowToShow() {
        return this.isAllowToShow;
    }

    public final void parseDpUri(@Nullable Map<String, String> urlParams) {
        int i = 0;
        if (urlParams == null || urlParams.isEmpty()) {
            return;
        }
        this.backUrl = urlParams.get(Constants.BACK_URL);
        String str = urlParams.get(Constants.BACK_TYPE);
        this.backType = str == null ? 1 : Integer.parseInt(str);
        this.backPackage = urlParams.get(Constants.BACK_PACKAGE);
        this.backPic = urlParams.get(Constants.BACK_PIC);
        this.backName = urlParams.get(Constants.BTN_NAME);
        String str2 = urlParams.get(Constants.BACK_STYLE);
        this.backStyle = str2 == null ? 1 : Integer.parseInt(str2);
        String str3 = this.backPic;
        if (str3 == null || str3.length() == 0) {
            String str4 = this.backName;
            if (str4 != null) {
                String strReplace$default = str4 == null ? null : StringsKt__StringsJVMKt.replace$default(str4, "返回", "", false, 4, (Object) null);
                this.backName = strReplace$default;
                this.showStyle = 1;
                this.backViewStyle = "文字";
                this.showContent = Intrinsics.stringPlus("返回", strReplace$default);
            } else if (this.backType != 2 || this.backPackage == null) {
                this.showStyle = 1;
                this.backViewStyle = "文字";
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String string = ContextGetterUtils.INSTANCE.getApp().getString(R.string.return_view_content_format);
                Intrinsics.checkNotNullExpressionValue(string, "ContextGetterUtils.getAp…turn_view_content_format)");
                String str5 = String.format(string, Arrays.copyOf(new Object[]{""}, 1));
                Intrinsics.checkNotNullExpressionValue(str5, "format(format, *args)");
                this.showContent = str5;
            } else {
                ContextGetterUtils contextGetterUtils = ContextGetterUtils.INSTANCE;
                PackageManager packageManager = contextGetterUtils.getApp().getPackageManager();
                try {
                    String str6 = this.backPackage;
                    if (str6 == null) {
                        str6 = "";
                    }
                    ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str6, 0);
                    Intrinsics.checkNotNullExpressionValue(applicationInfo, "packageManager.getApplic…nfo(backPackage ?: \"\", 0)");
                    if (this.backStyle == 2) {
                        this.showStyle = 2;
                        this.backViewStyle = "图标";
                        this.applicationIcon = packageManager.getApplicationIcon(applicationInfo);
                    }
                    int i2 = this.backStyle;
                    if (i2 == 1 || (i2 == 2 && this.applicationIcon == null)) {
                        this.showStyle = 1;
                        this.backViewStyle = "文字";
                        String string2 = applicationInfo.loadLabel(packageManager).toString();
                        StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                        String string3 = contextGetterUtils.getApp().getString(R.string.return_view_content_format);
                        Intrinsics.checkNotNullExpressionValue(string3, "ContextGetterUtils.getAp…turn_view_content_format)");
                        String str7 = String.format(string3, Arrays.copyOf(new Object[]{string2}, 1));
                        Intrinsics.checkNotNullExpressionValue(str7, "format(format, *args)");
                        this.showContent = str7;
                    }
                } catch (Exception unused) {
                    this.showStyle = 1;
                    this.backViewStyle = "文字";
                    StringCompanionObject stringCompanionObject3 = StringCompanionObject.INSTANCE;
                    String string4 = ContextGetterUtils.INSTANCE.getApp().getString(R.string.return_view_content_format);
                    Intrinsics.checkNotNullExpressionValue(string4, "ContextGetterUtils.getAp…turn_view_content_format)");
                    String str8 = String.format(string4, Arrays.copyOf(new Object[]{""}, 1));
                    Intrinsics.checkNotNullExpressionValue(str8, "format(format, *args)");
                    this.showContent = str8;
                }
            }
        } else {
            this.showStyle = 0;
            this.backViewStyle = "图标";
            String str9 = this.backPic;
            Intrinsics.checkNotNull(str9);
            this.showContent = str9;
        }
        if (TextUtils.isEmpty(this.backUrl)) {
            int i3 = this.backType;
            if (i3 == 1) {
                i = 1;
            } else {
                i = (i3 != 2 || this.backPackage == null) ? -1 : 2;
            }
        }
        this.returnPathType = i;
        this.backViewContent = Intrinsics.stringPlus("投放返回-", this.showContent);
        if (this.returnPathType != -1) {
            this.isAllowToShow = true;
        }
    }

    public final void setAllowToShow(boolean z) {
        this.isAllowToShow = z;
    }

    public final void setApplicationIcon(@Nullable Drawable drawable) {
        this.applicationIcon = drawable;
    }

    public final void setBackName(@Nullable String str) {
        this.backName = str;
    }

    public final void setBackPackage(@Nullable String str) {
        this.backPackage = str;
    }

    public final void setBackPic(@Nullable String str) {
        this.backPic = str;
    }

    public final void setBackStyle(int i) {
        this.backStyle = i;
    }

    public final void setBackType(int i) {
        this.backType = i;
    }

    public final void setBackUrl(@Nullable String str) {
        this.backUrl = str;
    }

    public final void setBackViewContent(@Nullable String str) {
        this.backViewContent = str;
    }

    public final void setBackViewStyle(@Nullable String str) {
        this.backViewStyle = str;
    }

    public final void setReturnPathType(int i) {
        this.returnPathType = i;
    }

    public final void setShowContent(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.showContent = str;
    }

    public final void setShowStyle(int i) {
        this.showStyle = i;
    }
}
