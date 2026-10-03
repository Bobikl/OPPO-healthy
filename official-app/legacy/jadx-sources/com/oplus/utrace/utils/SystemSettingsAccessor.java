package com.oplus.utrace.utils;

import android.content.ContentResolver;
import android.net.Uri;
import android.provider.Settings;
import android.text.TextUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\b"}, d2 = {"Lcom/oplus/utrace/utils/SystemSettingsAccessor;", "", "()V", "GlobalTable", "ITableAccessor", "SecureTable", "SettingsTable", "SystemTable", "utrace-lib_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SystemSettingsAccessor {

    @NotNull
    public static final SystemSettingsAccessor INSTANCE = new SystemSettingsAccessor();

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u0016J \u0010\n\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u000bH\u0016J \u0010\f\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\rH\u0016J \u0010\u000e\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\u0011"}, d2 = {"Lcom/oplus/utrace/utils/SystemSettingsAccessor$GlobalTable;", "Lcom/oplus/utrace/utils/SystemSettingsAccessor$ITableAccessor;", "()V", "getFloat", "", "cr", "Landroid/content/ContentResolver;", "name", "", "def", "getInt", "", "getLong", "", "getString", "getUriFor", "Landroid/net/Uri;", "utrace-lib_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class GlobalTable implements ITableAccessor {

        @NotNull
        public static final GlobalTable INSTANCE = new GlobalTable();

        private GlobalTable() {
        }

        @Override // com.oplus.utrace.utils.SystemSettingsAccessor.ITableAccessor
        public float getFloat(@NotNull ContentResolver cr, @NotNull String name, float def) {
            Intrinsics.checkNotNullParameter(cr, "cr");
            Intrinsics.checkNotNullParameter(name, "name");
            return Settings.Global.getFloat(cr, name, def);
        }

        @Override // com.oplus.utrace.utils.SystemSettingsAccessor.ITableAccessor
        public int getInt(@NotNull ContentResolver cr, @NotNull String name, int def) {
            Intrinsics.checkNotNullParameter(cr, "cr");
            Intrinsics.checkNotNullParameter(name, "name");
            return Settings.Global.getInt(cr, name, def);
        }

        @Override // com.oplus.utrace.utils.SystemSettingsAccessor.ITableAccessor
        public long getLong(@NotNull ContentResolver cr, @NotNull String name, long def) {
            Intrinsics.checkNotNullParameter(cr, "cr");
            Intrinsics.checkNotNullParameter(name, "name");
            return Settings.Global.getLong(cr, name, def);
        }

        @Override // com.oplus.utrace.utils.SystemSettingsAccessor.ITableAccessor
        @NotNull
        public String getString(@NotNull final ContentResolver cr, @NotNull final String name, @NotNull String def) {
            Intrinsics.checkNotNullParameter(cr, "cr");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(def, "def");
            return withDefaultString(def, new Function0<String>() { // from class: com.oplus.utrace.utils.SystemSettingsAccessor$GlobalTable$getString$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // p010kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return Settings.Global.getString(cr, name);
                }
            });
        }

        @Override // com.oplus.utrace.utils.SystemSettingsAccessor.ITableAccessor
        @NotNull
        public Uri getUriFor(@NotNull String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            Uri uriFor = Settings.Global.getUriFor(name);
            Intrinsics.checkNotNullExpressionValue(uriFor, "getUriFor(name)");
            return uriFor;
        }

        @Override // com.oplus.utrace.utils.SystemSettingsAccessor.ITableAccessor
        @NotNull
        public String withDefaultString(@NotNull String str, @NotNull Function0<String> function0) {
            return ITableAccessor.DefaultImpls.withDefaultString(this, str, function0);
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0003H&J \u0010\t\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\nH&J \u0010\u000b\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\fH&J \u0010\r\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H&J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u0007H&J \u0010\u0010\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u000e\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0012H\u0016¨\u0006\u0013"}, d2 = {"Lcom/oplus/utrace/utils/SystemSettingsAccessor$ITableAccessor;", "", "getFloat", "", "cr", "Landroid/content/ContentResolver;", "name", "", "def", "getInt", "", "getLong", "", "getString", "getUriFor", "Landroid/net/Uri;", "withDefaultString", "block", "Lkotlin/Function0;", "utrace-lib_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface ITableAccessor {

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        @SourceDebugExtension({"SMAP\nSystemSettingsAccessor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SystemSettingsAccessor.kt\ncom/oplus/utrace/utils/SystemSettingsAccessor$ITableAccessor$DefaultImpls\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,101:1\n1#2:102\n*E\n"})
        public static final class DefaultImpls {
            @NotNull
            public static String withDefaultString(@NotNull ITableAccessor iTableAccessor, @NotNull String def, @NotNull Function0<String> block) {
                Intrinsics.checkNotNullParameter(def, "def");
                Intrinsics.checkNotNullParameter(block, "block");
                String strInvoke = block.invoke();
                if (strInvoke == null) {
                    return def;
                }
                if (!(!TextUtils.isEmpty(strInvoke))) {
                    strInvoke = null;
                }
                return strInvoke == null ? def : strInvoke;
            }
        }

        float getFloat(@NotNull ContentResolver cr, @NotNull String name, float def);

        int getInt(@NotNull ContentResolver cr, @NotNull String name, int def);

        long getLong(@NotNull ContentResolver cr, @NotNull String name, long def);

        @NotNull
        String getString(@NotNull ContentResolver cr, @NotNull String name, @NotNull String def);

        @NotNull
        Uri getUriFor(@NotNull String name);

        @NotNull
        String withDefaultString(@NotNull String def, @NotNull Function0<String> block);
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u0016J \u0010\n\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u000bH\u0016J \u0010\f\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\rH\u0016J \u0010\u000e\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\u0011"}, d2 = {"Lcom/oplus/utrace/utils/SystemSettingsAccessor$SecureTable;", "Lcom/oplus/utrace/utils/SystemSettingsAccessor$ITableAccessor;", "()V", "getFloat", "", "cr", "Landroid/content/ContentResolver;", "name", "", "def", "getInt", "", "getLong", "", "getString", "getUriFor", "Landroid/net/Uri;", "utrace-lib_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class SecureTable implements ITableAccessor {

        @NotNull
        public static final SecureTable INSTANCE = new SecureTable();

        private SecureTable() {
        }

        @Override // com.oplus.utrace.utils.SystemSettingsAccessor.ITableAccessor
        public float getFloat(@NotNull ContentResolver cr, @NotNull String name, float def) {
            Intrinsics.checkNotNullParameter(cr, "cr");
            Intrinsics.checkNotNullParameter(name, "name");
            return Settings.Secure.getFloat(cr, name, def);
        }

        @Override // com.oplus.utrace.utils.SystemSettingsAccessor.ITableAccessor
        public int getInt(@NotNull ContentResolver cr, @NotNull String name, int def) {
            Intrinsics.checkNotNullParameter(cr, "cr");
            Intrinsics.checkNotNullParameter(name, "name");
            return Settings.Secure.getInt(cr, name, def);
        }

        @Override // com.oplus.utrace.utils.SystemSettingsAccessor.ITableAccessor
        public long getLong(@NotNull ContentResolver cr, @NotNull String name, long def) {
            Intrinsics.checkNotNullParameter(cr, "cr");
            Intrinsics.checkNotNullParameter(name, "name");
            return Settings.Secure.getLong(cr, name, def);
        }

        @Override // com.oplus.utrace.utils.SystemSettingsAccessor.ITableAccessor
        @NotNull
        public String getString(@NotNull final ContentResolver cr, @NotNull final String name, @NotNull String def) {
            Intrinsics.checkNotNullParameter(cr, "cr");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(def, "def");
            return withDefaultString(def, new Function0<String>() { // from class: com.oplus.utrace.utils.SystemSettingsAccessor$SecureTable$getString$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // p010kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return Settings.Secure.getString(cr, name);
                }
            });
        }

        @Override // com.oplus.utrace.utils.SystemSettingsAccessor.ITableAccessor
        @NotNull
        public Uri getUriFor(@NotNull String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            Uri uriFor = Settings.Secure.getUriFor(name);
            Intrinsics.checkNotNullExpressionValue(uriFor, "getUriFor(name)");
            return uriFor;
        }

        @Override // com.oplus.utrace.utils.SystemSettingsAccessor.ITableAccessor
        @NotNull
        public String withDefaultString(@NotNull String str, @NotNull Function0<String> function0) {
            return ITableAccessor.DefaultImpls.withDefaultString(this, str, function0);
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u000f\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0002\u0010\u0004J \u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0006H\u0016J \u0010\f\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\rH\u0016J \u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u000fH\u0016J \u0010\u0010\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0003\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0016"}, d2 = {"Lcom/oplus/utrace/utils/SystemSettingsAccessor$SettingsTable;", "", "Lcom/oplus/utrace/utils/SystemSettingsAccessor$ITableAccessor;", "tableImpl", "(Ljava/lang/String;ILcom/oplus/utrace/utils/SystemSettingsAccessor$ITableAccessor;)V", "getFloat", "", "cr", "Landroid/content/ContentResolver;", "name", "", "def", "getInt", "", "getLong", "", "getString", "getUriFor", "Landroid/net/Uri;", "GLOBAL", "SECURE", "SYSTEM", "utrace-lib_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum SettingsTable implements ITableAccessor {
        GLOBAL(GlobalTable.INSTANCE),
        SECURE(SecureTable.INSTANCE),
        SYSTEM(SystemTable.INSTANCE);


        @NotNull
        private final ITableAccessor tableImpl;

        SettingsTable(ITableAccessor iTableAccessor) {
            this.tableImpl = iTableAccessor;
        }

        @Override // com.oplus.utrace.utils.SystemSettingsAccessor.ITableAccessor
        public float getFloat(@NotNull ContentResolver cr, @NotNull String name, float def) {
            Intrinsics.checkNotNullParameter(cr, "cr");
            Intrinsics.checkNotNullParameter(name, "name");
            return this.tableImpl.getFloat(cr, name, def);
        }

        @Override // com.oplus.utrace.utils.SystemSettingsAccessor.ITableAccessor
        public int getInt(@NotNull ContentResolver cr, @NotNull String name, int def) {
            Intrinsics.checkNotNullParameter(cr, "cr");
            Intrinsics.checkNotNullParameter(name, "name");
            return this.tableImpl.getInt(cr, name, def);
        }

        @Override // com.oplus.utrace.utils.SystemSettingsAccessor.ITableAccessor
        public long getLong(@NotNull ContentResolver cr, @NotNull String name, long def) {
            Intrinsics.checkNotNullParameter(cr, "cr");
            Intrinsics.checkNotNullParameter(name, "name");
            return this.tableImpl.getLong(cr, name, def);
        }

        @Override // com.oplus.utrace.utils.SystemSettingsAccessor.ITableAccessor
        @NotNull
        public String getString(@NotNull ContentResolver cr, @NotNull String name, @NotNull String def) {
            Intrinsics.checkNotNullParameter(cr, "cr");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(def, "def");
            return this.tableImpl.getString(cr, name, def);
        }

        @Override // com.oplus.utrace.utils.SystemSettingsAccessor.ITableAccessor
        @NotNull
        public Uri getUriFor(@NotNull String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            return this.tableImpl.getUriFor(name);
        }

        @Override // com.oplus.utrace.utils.SystemSettingsAccessor.ITableAccessor
        @NotNull
        public String withDefaultString(@NotNull String str, @NotNull Function0<String> function0) {
            return ITableAccessor.DefaultImpls.withDefaultString(this, str, function0);
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u0016J \u0010\n\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u000bH\u0016J \u0010\f\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\rH\u0016J \u0010\u000e\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\u0011"}, d2 = {"Lcom/oplus/utrace/utils/SystemSettingsAccessor$SystemTable;", "Lcom/oplus/utrace/utils/SystemSettingsAccessor$ITableAccessor;", "()V", "getFloat", "", "cr", "Landroid/content/ContentResolver;", "name", "", "def", "getInt", "", "getLong", "", "getString", "getUriFor", "Landroid/net/Uri;", "utrace-lib_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class SystemTable implements ITableAccessor {

        @NotNull
        public static final SystemTable INSTANCE = new SystemTable();

        private SystemTable() {
        }

        @Override // com.oplus.utrace.utils.SystemSettingsAccessor.ITableAccessor
        public float getFloat(@NotNull ContentResolver cr, @NotNull String name, float def) {
            Intrinsics.checkNotNullParameter(cr, "cr");
            Intrinsics.checkNotNullParameter(name, "name");
            return Settings.System.getFloat(cr, name, def);
        }

        @Override // com.oplus.utrace.utils.SystemSettingsAccessor.ITableAccessor
        public int getInt(@NotNull ContentResolver cr, @NotNull String name, int def) {
            Intrinsics.checkNotNullParameter(cr, "cr");
            Intrinsics.checkNotNullParameter(name, "name");
            return Settings.System.getInt(cr, name, def);
        }

        @Override // com.oplus.utrace.utils.SystemSettingsAccessor.ITableAccessor
        public long getLong(@NotNull ContentResolver cr, @NotNull String name, long def) {
            Intrinsics.checkNotNullParameter(cr, "cr");
            Intrinsics.checkNotNullParameter(name, "name");
            return Settings.System.getLong(cr, name, def);
        }

        @Override // com.oplus.utrace.utils.SystemSettingsAccessor.ITableAccessor
        @NotNull
        public String getString(@NotNull final ContentResolver cr, @NotNull final String name, @NotNull String def) {
            Intrinsics.checkNotNullParameter(cr, "cr");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(def, "def");
            return withDefaultString(def, new Function0<String>() { // from class: com.oplus.utrace.utils.SystemSettingsAccessor$SystemTable$getString$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // p010kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return Settings.System.getString(cr, name);
                }
            });
        }

        @Override // com.oplus.utrace.utils.SystemSettingsAccessor.ITableAccessor
        @NotNull
        public Uri getUriFor(@NotNull String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            Uri uriFor = Settings.System.getUriFor(name);
            Intrinsics.checkNotNullExpressionValue(uriFor, "getUriFor(name)");
            return uriFor;
        }

        @Override // com.oplus.utrace.utils.SystemSettingsAccessor.ITableAccessor
        @NotNull
        public String withDefaultString(@NotNull String str, @NotNull Function0<String> function0) {
            return ITableAccessor.DefaultImpls.withDefaultString(this, str, function0);
        }
    }

    private SystemSettingsAccessor() {
    }
}
