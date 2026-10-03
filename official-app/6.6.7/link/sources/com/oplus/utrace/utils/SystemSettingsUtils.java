package com.oplus.utrace.utils;

import android.content.ContentResolver;
import android.net.Uri;
import com.oplus.aiunit.vision.vr3;
import com.oplus.smartenginehelper.ParserTag;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B#\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u001a\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u0016H\u0007J\u001a\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u001bH\u0007J\u001a\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u001dH\u0007J\u001a\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u0005H\u0007R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u000bj\u0002\b\u001f¨\u0006 "}, d2 = {"Lcom/oplus/utrace/utils/SystemSettingsUtils;", "", "mTable", "Lcom/oplus/utrace/utils/SystemSettingsAccessor$SettingsTable;", "mKeyName", "", "mAppointUri", "Landroid/net/Uri;", "(Ljava/lang/String;ILcom/oplus/utrace/utils/SystemSettingsAccessor$SettingsTable;Ljava/lang/String;Landroid/net/Uri;)V", "appointUri", "getAppointUri", "()Landroid/net/Uri;", "keyName", "getKeyName", "()Ljava/lang/String;", "table", "Lcom/oplus/utrace/utils/SystemSettingsAccessor$ITableAccessor;", "getTable", "()Lcom/oplus/utrace/utils/SystemSettingsAccessor$ITableAccessor;", ParserTag.TAG_URI, "getUri", "getFloat", "", "cr", "Landroid/content/ContentResolver;", "def", "getInt", "", "getLong", "", "getString", "LOG_DEBUG_LEVEL", "utrace-lib_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public enum SystemSettingsUtils {
    LOG_DEBUG_LEVEL(SystemSettingsAccessor.SettingsTable.SYSTEM, SystemSettingsUtilsKt.LOG_SWITCH_TYPE, null, 4, null);


    @Nullable
    private final Uri mAppointUri;

    @NotNull
    private final String mKeyName;

    @NotNull
    private final SystemSettingsAccessor.SettingsTable mTable;

    SystemSettingsUtils(SystemSettingsAccessor.SettingsTable settingsTable, String str, Uri uri) {
        this.mTable = settingsTable;
        this.mKeyName = str;
        this.mAppointUri = uri;
    }

    /* JADX INFO: renamed from: getAppointUri, reason: from getter */
    private final Uri getMAppointUri() {
        return this.mAppointUri;
    }

    public static /* synthetic */ float getFloat$default(SystemSettingsUtils systemSettingsUtils, ContentResolver contentResolver, float f, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getFloat");
        }
        if ((i & 2) != 0) {
            f = vr3.UNSET;
        }
        return systemSettingsUtils.getFloat(contentResolver, f);
    }

    public static /* synthetic */ int getInt$default(SystemSettingsUtils systemSettingsUtils, ContentResolver contentResolver, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getInt");
        }
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return systemSettingsUtils.getInt(contentResolver, i);
    }

    public static /* synthetic */ long getLong$default(SystemSettingsUtils systemSettingsUtils, ContentResolver contentResolver, long j, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLong");
        }
        if ((i & 2) != 0) {
            j = 0;
        }
        return systemSettingsUtils.getLong(contentResolver, j);
    }

    public static /* synthetic */ String getString$default(SystemSettingsUtils systemSettingsUtils, ContentResolver contentResolver, String str, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getString");
        }
        if ((i & 2) != 0) {
            str = "";
        }
        return systemSettingsUtils.getString(contentResolver, str);
    }

    private final SystemSettingsAccessor.ITableAccessor getTable() {
        return this.mTable;
    }

    @JvmOverloads
    public final float getFloat(@NotNull ContentResolver contentResolver) {
        Intrinsics.checkNotNullParameter(contentResolver, "cr");
        return getFloat$default(this, contentResolver, vr3.UNSET, 2, null);
    }

    @JvmOverloads
    public final int getInt(@NotNull ContentResolver contentResolver) {
        Intrinsics.checkNotNullParameter(contentResolver, "cr");
        return getInt$default(this, contentResolver, 0, 2, null);
    }

    @NotNull
    /* JADX INFO: renamed from: getKeyName, reason: from getter */
    public final String getMKeyName() {
        return this.mKeyName;
    }

    @JvmOverloads
    public final long getLong(@NotNull ContentResolver contentResolver) {
        Intrinsics.checkNotNullParameter(contentResolver, "cr");
        return getLong$default(this, contentResolver, 0L, 2, null);
    }

    @JvmOverloads
    @NotNull
    public final String getString(@NotNull ContentResolver contentResolver) {
        Intrinsics.checkNotNullParameter(contentResolver, "cr");
        return getString$default(this, contentResolver, null, 2, null);
    }

    @NotNull
    public final Uri getUri() {
        Uri mAppointUri = getMAppointUri();
        return mAppointUri == null ? getTable().getUriFor(getMKeyName()) : mAppointUri;
    }

    @JvmOverloads
    public final float getFloat(@NotNull ContentResolver cr, float def) {
        Intrinsics.checkNotNullParameter(cr, "cr");
        return getTable().getFloat(cr, getMKeyName(), def);
    }

    @JvmOverloads
    public final int getInt(@NotNull ContentResolver cr, int def) {
        Intrinsics.checkNotNullParameter(cr, "cr");
        return getTable().getInt(cr, getMKeyName(), def);
    }

    @JvmOverloads
    public final long getLong(@NotNull ContentResolver cr, long def) {
        Intrinsics.checkNotNullParameter(cr, "cr");
        return getTable().getLong(cr, getMKeyName(), def);
    }

    @JvmOverloads
    @NotNull
    public final String getString(@NotNull ContentResolver cr, @NotNull String def) {
        Intrinsics.checkNotNullParameter(cr, "cr");
        Intrinsics.checkNotNullParameter(def, "def");
        return getTable().getString(cr, getMKeyName(), def);
    }

    /* synthetic */ SystemSettingsUtils(SystemSettingsAccessor.SettingsTable settingsTable, String str, Uri uri, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(settingsTable, str, (i & 4) != 0 ? null : uri);
    }
}
