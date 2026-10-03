package com.oplus.aiunit.vision;

import android.content.Context;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import androidx.sqlite.db.SupportSQLiteDatabase;
import com.google.security.cryptauth.lib.securegcm.SecureGcmConstants;
import com.heytap.accessory.file.model.Constant;
import com.heytap.databaseengine.model.OneTimeSport;
import com.heytap.databaseengine.model.UserInfo;
import com.heytap.log.consts.LogSenderConst;
import com.heytap.log.formatter.LogFieldKey;
import com.heytap.sports.record.details.RecordDetailsInstructionActivity;
import com.heytap.webview.extension.protocol.Const;
import io.protostuff.MapSchema;
import java.io.File;
import java.util.Set;
import net.zetetic.database.sqlcipher.SQLiteConnection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Triple;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001:\u0004\u0013\u0014\u0015\u0016J \u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H&J\b\u0010\t\u001a\u00020\bH&J\b\u0010\n\u001a\u00020\u0004H&J.\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\b2\b\u0010\f\u001a\u0004\u0018\u00010\b2\b\u0010\r\u001a\u0004\u0018\u00010\bH&J\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH&¨\u0006\u0017"}, d2 = {"Lcom/oplus/aiunit/vision/so9;", "", "", "dis", "", RecordDetailsInstructionActivity.KEY_SPORT_MODE, "floors", "y", "", "u0", UserInfo.SEX_FEMALE, "sportName", "runExtra", "deviceCategory", "L", "Landroid/content/Context;", "context", "", LogFieldKey.MESSAGE_KEY, "a", "b", "c", "d", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0})
public interface so9 {

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\"\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&J\n\u0010\b\u001a\u0004\u0018\u00010\u0002H&J\"\u0010\t\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&J*\u0010\r\u001a\u0004\u0018\u00010\u00022\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&J\b\u0010\u000e\u001a\u00020\u0002H&J\b\u0010\u0010\u001a\u00020\u000fH&J\b\u0010\u0012\u001a\u00020\u0011H&J\u0010\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0011H&J\u0010\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0011H&J\u0010\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0016H&J\b\u0010\u0019\u001a\u00020\u000fH&J\u0010\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001aH&J-\u0010 \u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00020\u001eH&¢\u0006\u0004\b \u0010!¨\u0006\""}, d2 = {"Lcom/oplus/aiunit/vision/so9$a;", "", "", "TAG", "userId", "", "encryptMode", ExifInterface.LONGITUDE_EAST, c8l.KEY_B, "Y", "content", "pw", "iv", "k0", "K", "", "s0", "", "y0", "flag", "u", b2n.f, "Landroidx/sqlite/db/SupportSQLiteDatabase;", "db", "X", "l0", "Landroid/content/Context;", "context", "t0", "Lnet/zetetic/database/sqlcipher/SQLiteConnection;", "", "dbKey", "I", "(Lnet/zetetic/database/sqlcipher/SQLiteConnection;Landroid/content/Context;[Ljava/lang/String;)V", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0})
    public interface a {
        @Nullable
        String B();

        @Nullable
        String E(@NotNull String TAG, @NotNull String userId, int encryptMode);

        void I(@NotNull SQLiteConnection db, @NotNull Context context, @NotNull String[] dbKey);

        @NotNull
        String K();

        void X(@NotNull SupportSQLiteDatabase db);

        @Nullable
        String Y(@NotNull String TAG, @NotNull String userId, int encryptMode);

        void g(boolean flag);

        @Nullable
        String k0(@NotNull String content, @NotNull String pw, @NotNull String iv, int encryptMode);

        void l0();

        void s0();

        @NotNull
        String t0(@NotNull Context context);

        void u(boolean flag);

        boolean y0();
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J \u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&J \u0010\n\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0005H&¨\u0006\u000b"}, d2 = {"Lcom/oplus/aiunit/vision/so9$b;", "", "", "spName", "key", "", "value", "", "c0", "defaultValue", "f0", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0})
    public interface b {
        void c0(@NotNull String spName, @NotNull String key, int value);

        int f0(@NotNull String spName, @NotNull String key, int defaultValue);
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\b\u001b\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\bH&J\u0018\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H&J \u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J \u0010\r\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\bH&J \u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H&J \u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u000fH&J&\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0011H&J\u0018\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0004H&J\u0018\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\bH&J \u0010\u0016\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0004H&J \u0010\u0017\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\bH&J \u0010\u0018\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0002H&J \u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u000fH&J,\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u00112\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u0011H&J\u0010\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0002H&J\u0010\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0002H&J\b\u0010\u001e\u001a\u00020\u0002H&J\b\u0010\u001f\u001a\u00020\u0002H&J\b\u0010 \u001a\u00020\u0002H&J\b\u0010!\u001a\u00020\u0002H&J\b\u0010\"\u001a\u00020\u0002H&J\b\u0010#\u001a\u00020\u0002H&J\b\u0010$\u001a\u00020\u0002H&J\b\u0010%\u001a\u00020\u0004H&J\b\u0010&\u001a\u00020\u0004H&J\b\u0010'\u001a\u00020\u0002H&J\b\u0010(\u001a\u00020\u0002H&J\b\u0010)\u001a\u00020\u0002H&J\b\u0010*\u001a\u00020\u0002H&J\b\u0010+\u001a\u00020\u0002H&¨\u0006,"}, d2 = {"Lcom/oplus/aiunit/vision/so9$c;", "", "", "key", "", "value", "", "v", "", "w", "j", "spName", "U", ExifInterface.GPS_DIRECTION_TRUE, "t", "", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "", c8l.KEY_A0, "defaultValue", "getInt", "getLong", "m0", "e0", "R", "v0", "d", "q", TypedValues.Custom.S_STRING, MapSchema.FIELD_NAME_ENTRY, "Q", MapSchema.FIELD_NAME_KEY, "J", "z0", "a", "A", "g0", b2n.g, "G", "x", "z", "x0", "i", LogFieldKey.PROCESS_NAME_KEY, "databaseengineservice_release"}, k = 1, mv = {1, 8, 0})
    public interface c {
        @NotNull
        String A();

        void A0(@NotNull String spName, @NotNull String key, @NotNull Set<String> value);

        int G();

        @NotNull
        String J();

        @NotNull
        String Q();

        @NotNull
        String R(@NotNull String spName, @NotNull String key, @NotNull String defaultValue);

        void T(@NotNull String spName, @NotNull String key, long value);

        void U(@NotNull String spName, @NotNull String key, int value);

        void V(@NotNull String spName, @NotNull String key, boolean value);

        @NotNull
        String a();

        @NotNull
        Set<String> d(@NotNull String spName, @NotNull String key, @NotNull Set<String> defaultValue);

        @NotNull
        String e(@NotNull String string);

        long e0(@NotNull String spName, @NotNull String key, long defaultValue);

        @NotNull
        String g0();

        int getInt(@NotNull String key, int defaultValue);

        long getLong(@NotNull String key, long defaultValue);

        int h();

        @NotNull
        String i();

        void j(@NotNull String key, @NotNull String value);

        @NotNull
        String k();

        int m0(@NotNull String spName, @NotNull String key, int defaultValue);

        @NotNull
        String p();

        void q(@NotNull String spName);

        void t(@NotNull String spName, @NotNull String key, @NotNull String value);

        void v(@NotNull String key, int value);

        boolean v0(@NotNull String spName, @NotNull String key, boolean defaultValue);

        void w(@NotNull String key, long value);

        @NotNull
        String x();

        @NotNull
        String x0();

        @NotNull
        String z();

        @NotNull
        String z0();
    }

    @Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\u0012\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&J#\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH&¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\r\u001a\u00028\u0000\"\u0004\b\u0000\u0010\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH&¢\u0006\u0004\b\r\u0010\fJ*\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0002H&J0\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0002H&J\u001d\u0010\u001f\u001a\u00020\u001e2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bH&¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010!\u001a\u00020\u001e2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bH&¢\u0006\u0004\b!\u0010 J\u001d\u0010\"\u001a\u00020\u001e2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bH&¢\u0006\u0004\b\"\u0010 J\u001d\u0010#\u001a\u00020\u001e2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bH&¢\u0006\u0004\b#\u0010 J\b\u0010$\u001a\u00020\u0002H&J\u0018\u0010'\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\u00022\u0006\u0010&\u001a\u00020\u0002H&J\u0018\u0010(\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\u00022\u0006\u0010&\u001a\u00020\u0002H&J0\u0010.\u001a\b\u0012\u0004\u0012\u00020-0,2\u0006\u0010)\u001a\u00020\u00022\u0006\u0010*\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00022\b\u0010+\u001a\u0004\u0018\u00010\u0002H&J\u0010\u00100\u001a\u00020\u00022\u0006\u0010/\u001a\u00020\u0002H&J\u0018\u00102\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\u00022\u0006\u00101\u001a\u00020\u0002H&J \u00105\u001a\u00020\u00112\u0006\u0010%\u001a\u00020\u00022\u0006\u00103\u001a\u00020\u00022\u0006\u00104\u001a\u00020\u0002H&J \u00107\u001a\u00020\u00112\u0006\u0010%\u001a\u0002062\u0006\u00103\u001a\u00020\u00022\u0006\u00104\u001a\u00020\u0002H&J \u00109\u001a\u00020\u00112\u0006\u0010%\u001a\u00020\u00022\u0006\u00104\u001a\u00020\u00022\u0006\u00108\u001a\u00020\u0002H&J \u0010:\u001a\u00020\u00112\u0006\u0010%\u001a\u0002062\u0006\u00104\u001a\u00020\u00022\u0006\u00108\u001a\u00020\u0002H&J\u0010\u0010<\u001a\u00020\u00022\u0006\u0010;\u001a\u00020\u0002H&J\u0010\u0010>\u001a\u00020\u00022\u0006\u0010=\u001a\u00020\u0002H&J\b\u0010?\u001a\u00020\u0002H&J\b\u0010@\u001a\u00020\u0002H&J\b\u0010A\u001a\u00020\u0002H&J#\u0010B\u001a\u00028\u0000\"\u0004\b\u0000\u0010\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH&¢\u0006\u0004\bB\u0010\fJ\u0012\u0010E\u001a\u0004\u0018\u00010\u00022\u0006\u0010D\u001a\u00020CH&J\u0012\u0010F\u001a\u0004\u0018\u00010C2\u0006\u0010\u000e\u001a\u00020\u0002H&J#\u0010G\u001a\u00028\u0000\"\u0004\b\u0000\u0010\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH&¢\u0006\u0004\bG\u0010\fJ#\u0010H\u001a\u00028\u0000\"\u0004\b\u0000\u0010\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH&¢\u0006\u0004\bH\u0010\f¨\u0006I"}, d2 = {"Lcom/oplus/aiunit/vision/so9$d;", "", "", TypedValues.Custom.S_STRING, "r", "", MapSchema.FIELD_NAME_ENTRY, "p0", ExifInterface.GPS_DIRECTION_TRUE, "Ljava/lang/Class;", "tClass", "j0", "(Ljava/lang/Class;)Ljava/lang/Object;", "s", "filePath", LogSenderConst.FILENAME, "Lkotlin/Triple;", "", "f", "Ljava/io/File;", Const.Scheme.SCHEME_FILE, "key", "clientFileId", "fileMark", "version", "Lcom/oplus/aiunit/vision/gqf;", "H", "", "", "requestDelayId", "", "d0", "([Ljava/lang/Integer;)V", "o", "N", "b", "r0", "pw", "data", "h0", "n", "downLoadUrl", "parentFilePath", "fileMd5", "Lcom/oplus/aiunit/vision/lbd;", "", SecureGcmConstants.MESSAGE_KEY, "localK", "C", "content", "S", Constant.SOURCE_PATH, "encryptPath", "c", "", "b0", "decryptPath", "n0", "o0", "path", "i0", "str", "w0", LogFieldKey.LEVEL_KEY, "D", "Z", "a0", "Lcom/heytap/databaseengine/model/OneTimeSport;", "oneTimeSport", "M", ExifInterface.LONGITUDE_WEST, "O", "q0", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0})
    public interface d {
        @NotNull
        String C(@NotNull String localK);

        @NotNull
        String D();

        @NotNull
        gqf H(@NotNull File file, @NotNull String key, @NotNull String clientFileId, @NotNull String fileMark, @NotNull String version);

        @Nullable
        String M(@NotNull OneTimeSport oneTimeSport);

        void N(@NotNull Integer[] requestDelayId);

        <T> T O(@NotNull Class<T> tClass);

        @NotNull
        lbd<Float> P(@NotNull String downLoadUrl, @NotNull String parentFilePath, @NotNull String fileName, @Nullable String fileMd5);

        @NotNull
        String S(@NotNull String pw, @NotNull String content);

        @Nullable
        OneTimeSport W(@NotNull String filePath);

        @NotNull
        String Z();

        <T> T a0(@NotNull Class<T> tClass);

        void b(@NotNull Integer[] requestDelayId);

        boolean b0(@NotNull byte[] pw, @NotNull String sourcePath, @NotNull String encryptPath);

        boolean c(@NotNull String pw, @NotNull String sourcePath, @NotNull String encryptPath);

        void d0(@NotNull Integer[] requestDelayId);

        @NotNull
        Triple<Boolean, String, String> f(@NotNull String filePath, @NotNull String fileName);

        @NotNull
        String h0(@NotNull String pw, @NotNull String data);

        @NotNull
        String i0(@NotNull String path);

        <T> T j0(@NotNull Class<T> tClass);

        @NotNull
        String l();

        @NotNull
        String n(@NotNull String pw, @NotNull String data);

        boolean n0(@NotNull String pw, @NotNull String encryptPath, @NotNull String decryptPath);

        void o(@NotNull Integer[] requestDelayId);

        boolean o0(@NotNull byte[] pw, @NotNull String encryptPath, @NotNull String decryptPath);

        @NotNull
        String p0(@NotNull Throwable e2);

        <T> T q0(@NotNull Class<T> tClass);

        @NotNull
        String r(@NotNull String string);

        @NotNull
        String r0();

        <T> T s(@NotNull Class<T> tClass);

        @NotNull
        String w0(@NotNull String str);
    }

    int F();

    @NotNull
    String L(int sportMode, @Nullable String sportName, @Nullable String runExtra, @Nullable String deviceCategory);

    void m(@NotNull Context context);

    @NotNull
    String u0();

    double y(double dis, int sportMode, double floors);
}
