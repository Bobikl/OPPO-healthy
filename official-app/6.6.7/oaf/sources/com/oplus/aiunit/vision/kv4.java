package com.oplus.aiunit.vision;

import android.content.Context;
import android.util.Base64;
import androidx.sqlite.db.SupportSQLiteDatabase;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.google.security.cryptauth.lib.securegcm.SecureGcmConstants;
import com.health.database.depend.R$string;
import com.heytap.accessory.file.model.Constant;
import com.heytap.databaseengine.model.OneTimeSport;
import com.heytap.databaseengine.model.RunExtra;
import com.heytap.device.data.utils.SportRecordHelper;
import com.heytap.health.base.R;
import com.heytap.health.base.encrypt.AesGcmAndroidKeyStore;
import com.heytap.health.base.oplus.osense.LongCase;
import com.heytap.health.base.oplus.osense.ShortCase;
import com.heytap.health.base.sp.MultiProgressDataStoreRepository;
import com.heytap.health.health.HealthService;
import com.heytap.health.network.core.a;
import com.heytap.health.sport.sportrecord.SportService;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import net.zetetic.database.sqlcipher.SQLiteConnection;
import okhttp3.MediaType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
@Metadata(d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\b\u001c\n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u009c\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0001-B\t¢\u0006\u0006\b\u009a\u0001\u0010\u009b\u0001J2\u0010\r\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000bH\u0016J\u0018\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0011H\u0016J\u0018\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006H\u0016J \u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000bH\u0016J \u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0011H\u0016J \u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006H\u0016J \u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0018H\u0016J&\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u001aH\u0016J\u0018\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u000bH\u0016J \u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u000bH\u0016J\u0018\u0010\u001f\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u0011H\u0016J \u0010 \u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u0011H\u0016J \u0010!\u001a\u00020\u00182\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u0018H\u0016J,\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00060\u001a2\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00060\u001aH\u0016J\u0010\u0010#\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0006H\u0016J \u0010$\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u0006H\u0016J\u0010\u0010&\u001a\u00020\u00062\u0006\u0010%\u001a\u00020\u0006H\u0016J\b\u0010'\u001a\u00020\u0006H\u0016J\b\u0010(\u001a\u00020\u0006H\u0016J\b\u0010)\u001a\u00020\u0006H\u0016J\b\u0010*\u001a\u00020\u0006H\u0016J\b\u0010+\u001a\u00020\u0006H\u0016J\b\u0010,\u001a\u00020\u0006H\u0016J\b\u0010-\u001a\u00020\u0006H\u0016J\b\u0010.\u001a\u00020\u0006H\u0016J\b\u0010/\u001a\u00020\u0006H\u0016J\b\u00100\u001a\u00020\u000bH\u0016J\b\u00101\u001a\u00020\u000bH\u0016J\b\u00102\u001a\u00020\u0006H\u0016J\b\u00103\u001a\u00020\u0006H\u0016J\b\u00104\u001a\u00020\u0006H\u0016J\b\u00105\u001a\u00020\u0006H\u0016J\b\u00106\u001a\u00020\u0006H\u0016J \u0010;\u001a\u0002072\u0006\u00108\u001a\u0002072\u0006\u00109\u001a\u00020\u000b2\u0006\u0010:\u001a\u000207H\u0016J\b\u0010<\u001a\u00020\u0006H\u0016J\b\u0010=\u001a\u00020\u000bH\u0016J.\u0010A\u001a\u00020\u00062\u0006\u00109\u001a\u00020\u000b2\b\u0010>\u001a\u0004\u0018\u00010\u00062\b\u0010?\u001a\u0004\u0018\u00010\u00062\b\u0010@\u001a\u0004\u0018\u00010\u0006H\u0016J\u0010\u0010D\u001a\u00020\u000f2\u0006\u0010C\u001a\u00020BH\u0016J\u0010\u0010E\u001a\u00020\u00062\u0006\u0010%\u001a\u00020\u0006H\u0016J\u0010\u0010G\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020FH\u0016J#\u0010J\u001a\u00028\u0000\"\u0004\b\u0000\u0010$2\f\u0010I\u001a\b\u0012\u0004\u0012\u00028\u00000HH\u0016¢\u0006\u0004\bJ\u0010KJ#\u0010L\u001a\u00028\u0000\"\u0004\b\u0000\u0010$2\f\u0010I\u001a\b\u0012\u0004\u0012\u00028\u00000HH\u0016¢\u0006\u0004\bL\u0010KJ*\u0010P\u001a\u0014\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060O2\u0006\u0010M\u001a\u00020\u00062\u0006\u0010N\u001a\u00020\u0006H\u0016J0\u0010W\u001a\u00020V2\u0006\u0010R\u001a\u00020Q2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010S\u001a\u00020\u00062\u0006\u0010T\u001a\u00020\u00062\u0006\u0010U\u001a\u00020\u0006H\u0016J\u001d\u0010Z\u001a\u00020\u000f2\f\u0010Y\u001a\b\u0012\u0004\u0012\u00020\u000b0XH\u0016¢\u0006\u0004\bZ\u0010[J\u001d\u0010\\\u001a\u00020\u000f2\f\u0010Y\u001a\b\u0012\u0004\u0012\u00020\u000b0XH\u0016¢\u0006\u0004\b\\\u0010[J\u001d\u0010]\u001a\u00020\u000f2\f\u0010Y\u001a\b\u0012\u0004\u0012\u00020\u000b0XH\u0016¢\u0006\u0004\b]\u0010[J\u001d\u0010^\u001a\u00020\u000f2\f\u0010Y\u001a\b\u0012\u0004\u0012\u00020\u000b0XH\u0016¢\u0006\u0004\b^\u0010[J\b\u0010_\u001a\u00020\u0006H\u0016J\u0018\u0010b\u001a\u00020\u00062\u0006\u0010`\u001a\u00020\u00062\u0006\u0010a\u001a\u00020\u0006H\u0016J\u0018\u0010c\u001a\u00020\u00062\u0006\u0010`\u001a\u00020\u00062\u0006\u0010a\u001a\u00020\u0006H\u0016J0\u0010i\u001a\b\u0012\u0004\u0012\u00020h0g2\u0006\u0010d\u001a\u00020\u00062\u0006\u0010e\u001a\u00020\u00062\u0006\u0010N\u001a\u00020\u00062\b\u0010f\u001a\u0004\u0018\u00010\u0006H\u0016J\u0010\u0010k\u001a\u00020\u00062\u0006\u0010j\u001a\u00020\u0006H\u0016J\u0018\u0010m\u001a\u00020\u00062\u0006\u0010`\u001a\u00020\u00062\u0006\u0010l\u001a\u00020\u0006H\u0016J \u0010q\u001a\u00020\u00182\u0006\u0010`\u001a\u00020n2\u0006\u0010o\u001a\u00020\u00062\u0006\u0010p\u001a\u00020\u0006H\u0016J \u0010r\u001a\u00020\u00182\u0006\u0010`\u001a\u00020\u00062\u0006\u0010o\u001a\u00020\u00062\u0006\u0010p\u001a\u00020\u0006H\u0016J \u0010t\u001a\u00020\u00182\u0006\u0010`\u001a\u00020\u00062\u0006\u0010p\u001a\u00020\u00062\u0006\u0010s\u001a\u00020\u0006H\u0016J \u0010u\u001a\u00020\u00182\u0006\u0010`\u001a\u00020n2\u0006\u0010p\u001a\u00020\u00062\u0006\u0010s\u001a\u00020\u0006H\u0016J\u0010\u0010w\u001a\u00020\u00062\u0006\u0010v\u001a\u00020\u0006H\u0016J\u0010\u0010y\u001a\u00020\u00062\u0006\u0010x\u001a\u00020\u0006H\u0016J\b\u0010z\u001a\u00020\u0006H\u0016J\b\u0010{\u001a\u00020\u0006H\u0016J\b\u0010|\u001a\u00020\u0006H\u0016J#\u0010}\u001a\u00028\u0000\"\u0004\b\u0000\u0010$2\f\u0010I\u001a\b\u0012\u0004\u0012\u00028\u00000HH\u0016¢\u0006\u0004\b}\u0010KJ\u0013\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u007f\u001a\u00020~H\u0016J\u0013\u0010\u0081\u0001\u001a\u0004\u0018\u00010~2\u0006\u0010M\u001a\u00020\u0006H\u0016J%\u0010\u0082\u0001\u001a\u00028\u0000\"\u0004\b\u0000\u0010$2\f\u0010I\u001a\b\u0012\u0004\u0012\u00028\u00000HH\u0016¢\u0006\u0005\b\u0082\u0001\u0010KJ%\u0010\u0083\u0001\u001a\u00028\u0000\"\u0004\b\u0000\u0010$2\f\u0010I\u001a\b\u0012\u0004\u0012\u00028\u00000HH\u0016¢\u0006\u0005\b\u0083\u0001\u0010KJ#\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u000b\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u0006H\u0016J#\u0010\u0086\u0001\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0016J,\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u00062\u0006\u0010l\u001a\u00020\u00062\u0006\u0010`\u001a\u00020\u00062\u0007\u0010\u0087\u0001\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0016J\t\u0010\u0089\u0001\u001a\u00020\u0006H\u0016J\t\u0010\u008a\u0001\u001a\u00020\u000fH\u0016J\t\u0010\u008b\u0001\u001a\u00020\u0018H\u0016J\u0012\u0010\u008d\u0001\u001a\u00020\u000f2\u0007\u0010\u008c\u0001\u001a\u00020\u0018H\u0016J\u0012\u0010\u008e\u0001\u001a\u00020\u000f2\u0007\u0010\u008c\u0001\u001a\u00020\u0018H\u0016J\u0013\u0010\u0091\u0001\u001a\u00020\u000f2\b\u0010\u0090\u0001\u001a\u00030\u008f\u0001H\u0016J\t\u0010\u0092\u0001\u001a\u00020\u000fH\u0016J\u0011\u0010\u0093\u0001\u001a\u00020\u00062\u0006\u0010C\u001a\u00020BH\u0016J3\u0010\u0096\u0001\u001a\u00020\u000f2\b\u0010\u0090\u0001\u001a\u00030\u0094\u00012\u0006\u0010C\u001a\u00020B2\r\u0010\u0095\u0001\u001a\b\u0012\u0004\u0012\u00020\u00060XH\u0016¢\u0006\u0006\b\u0096\u0001\u0010\u0097\u0001J!\u0010\u0098\u0001\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000bH\u0016J!\u0010\u0099\u0001\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u000bH\u0016¨\u0006\u009d\u0001"}, d2 = {"Lcom/oplus/aiunit/vision/kv4;", "Lcom/oplus/aiunit/vision/yp9$c;", "Lcom/oplus/aiunit/vision/yp9$b;", "Lcom/oplus/aiunit/vision/yp9;", "Lcom/oplus/aiunit/vision/yp9$d;", "Lcom/oplus/aiunit/vision/yp9$a;", "", "TAG", "userId", "key", "originKey", "", "encryptMode", "D0", "value", "", "x", "", "y", "k", "spName", "W", "V", "v", "", "X", "", "C0", "defaultValue", "getInt", "o0", "getLong", "g0", "x0", "e", "s", "T", "string", "g", "S", "m", "L", "B0", "c", "l", "a", "C", "i0", "i", "I", "z", "B", "z0", "j", "r", "", "dis", "sportMode", "floors", "A", "w0", "H", "sportName", "runExtra", "deviceCategory", "N", "Landroid/content/Context;", "context", "o", "t", "", "r0", "Ljava/lang/Class;", "tClass", "l0", "(Ljava/lang/Class;)Ljava/lang/Object;", "u", "filePath", "fileName", "Lkotlin/Triple;", "f", "Ljava/io/File;", "file", "clientFileId", "fileMark", "version", "Lcom/oplus/aiunit/vision/itf;", "J", "", "requestDelayId", "f0", "([Ljava/lang/Integer;)V", "q", SecureGcmConstants.MESSAGE_KEY, "b", "t0", "pw", "data", "j0", "p", "downLoadUrl", "parentFilePath", "fileMd5", "Lcom/oplus/aiunit/vision/ddd;", "", "R", "localK", "E", "content", "U", "", Constant.SOURCE_PATH, "encryptPath", "d0", "d", "decryptPath", "p0", "q0", "path", "k0", "str", "y0", "n", "F", "b0", "c0", "Lcom/heytap/databaseengine/model/OneTimeSport;", "oneTimeSport", "O", "Y", "Q", "s0", "G", "D", "a0", "iv", "m0", "M", "u0", "A0", "flag", "w", "h", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "db", "Z", "n0", "v0", "Lnet/zetetic/database/sqlcipher/SQLiteConnection;", "dbKey", "K", "(Lnet/zetetic/database/sqlcipher/SQLiteConnection;Landroid/content/Context;[Ljava/lang/String;)V", "e0", "h0", "<init>", "()V", "Companion", "depend_release"}, k = 1, mv = {1, 8, 0})
public final class kv4 implements yp9.c, yp9.b, yp9, yp9.d, yp9.a {

    @NotNull
    public static final String TAG = "DataProcess";

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"com/oplus/aiunit/vision/kv4$b", "Lcom/oplus/aiunit/vision/p5d$a;", "", "requestId", "resultCode", "", "f", "b", "depend_release"}, k = 1, mv = {1, 8, 0})
    public static final class b extends p5d.a {
        public final /* synthetic */ Integer[] c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Integer[] numArr, LongCase longCase) {
            super(longCase);
            this.c = numArr;
        }

        public void b(int requestId) {
            m8b.f("DataProcessDI", "cancelLongDurationTask() called with: requestId = [" + requestId + "]");
            p5d.INSTANCE.l(e88.b(), this);
        }

        public void f(int requestId, int resultCode) {
            this.c[0] = Integer.valueOf(requestId);
        }
    }

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/oplus/aiunit/vision/kv4$c", "Lcom/oplus/aiunit/vision/p5d$c;", "", "requestId", "", "delayTime", "resultCode", "", "c", "depend_release"}, k = 1, mv = {1, 8, 0})
    public static final class c extends p5d.c {
        public final /* synthetic */ Integer[] c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Integer[] numArr, ShortCase shortCase) {
            super(shortCase);
            this.c = numArr;
        }

        public void c(int requestId, long delayTime, int resultCode) {
            this.c[0] = Integer.valueOf(requestId);
        }
    }

    public double A(double dis, int sportMode, double floors) {
        return kxi.e(dis, sportMode, floors);
    }

    public boolean A0() {
        return wj4.Companion.a();
    }

    @NotNull
    public String B() {
        return "CalGoal_";
    }

    @NotNull
    public String B0() {
        return "steps_calories_threshold";
    }

    @NotNull
    public String C() {
        return "max_calories_in_one_minute";
    }

    public void C0(@NotNull String spName, @NotNull String key, @NotNull Set<String> value) {
        Intrinsics.checkNotNullParameter(spName, "spName");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        fdg.x(spName).V(key, value);
    }

    @Nullable
    public String D() {
        return vp6.b(e88.a(), i90.HW_KEY);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x00af  */
    public final synchronized String D0(String TAG2, String userId, String key, String originKey, int encryptMode) {
        String strB;
        AesGcmAndroidKeyStore aesGcmAndroidKeyStoreA = AesGcmAndroidKeyStore.Companion.a();
        if (1 == encryptMode) {
            boolean zI = aesGcmAndroidKeyStoreA.i(key, userId);
            sj4.c(TAG2, "en has:" + zI + ", type:" + key);
            if (zI) {
                strB = aesGcmAndroidKeyStoreA.b(key, userId);
            } else {
                String string = UUID.randomUUID().toString();
                Intrinsics.checkNotNullExpressionValue(string, "randomUUID().toString()");
                String str = StringsKt.replace$default(string, "-", "", false, 4, (Object) null) + key;
                aesGcmAndroidKeyStoreA.c(key, str, userId);
                strB = str;
            }
        } else if (2 == encryptMode) {
            boolean zI2 = aesGcmAndroidKeyStoreA.i(key, userId);
            sj4.c(TAG2, "de has:" + zI2 + ", type:" + key);
            if (zI2) {
                strB = aesGcmAndroidKeyStoreA.b(key, userId);
            } else if (Intrinsics.areEqual("origin_hw_key", originKey)) {
                strB = vp6.b(e88.a(), i90.HW_KEY);
            } else if (Intrinsics.areEqual("origin_goal_key", originKey)) {
                strB = vp6.b(e88.a(), i90.GOAL_KEY);
            } else {
                strB = null;
            }
        } else {
            strB = null;
        }
        if (strB != null) {
            return strB;
        }
        sj4.b(TAG2, "key is null");
        return null;
    }

    @NotNull
    public String E(@NotNull String localK) {
        Intrinsics.checkNotNullParameter(localK, "localK");
        String strC = w3g.c(localK, vp6.b(e88.a(), i90.SNORE_FILE_RES_PORTAL));
        return strC == null ? "" : strC;
    }

    @NotNull
    public String F() {
        String str = SportRecordHelper.unencryptedDirectory;
        Intrinsics.checkNotNullExpressionValue(str, "unencryptedDirectory");
        return str;
    }

    @Nullable
    public String G(@NotNull String TAG2, @NotNull String userId, int encryptMode) {
        Intrinsics.checkNotNullParameter(TAG2, "TAG");
        Intrinsics.checkNotNullParameter(userId, "userId");
        return D0(TAG2, userId, "hw_key", "origin_hw_key", encryptMode);
    }

    public int H() {
        return ((SportService) e1.d().h(SportService.class)).Oa();
    }

    public int I() {
        return 65536;
    }

    @NotNull
    public itf J(@NotNull File file, @NotNull String key, @NotNull String clientFileId, @NotNull String fileMark, @NotNull String version) {
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(clientFileId, "clientFileId");
        Intrinsics.checkNotNullParameter(fileMark, "fileMark");
        Intrinsics.checkNotNullParameter(version, "version");
        bac.a aVarD = new bac.a().d(eac.FORM);
        itf itfVarC = itf.Companion.c(MediaType.Companion.a("application/octet-stream"), file);
        aVarD.a("fileName", file.getName());
        aVarD.b("file", file.getName(), itfVarC);
        aVarD.a("key", key);
        aVarD.a("clientFileId", clientFileId);
        aVarD.a("fileType", "1");
        aVarD.a("fileSource", "1");
        aVarD.a("fileRemark", fileMark);
        aVarD.a("version", version);
        bac bacVarC = aVarD.c();
        Intrinsics.checkNotNullExpressionValue(bacVarC, "builder.build()");
        return bacVarC;
    }

    public void K(@NotNull SQLiteConnection db, @NotNull Context context, @NotNull String[] dbKey) {
        Intrinsics.checkNotNullParameter(db, "db");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dbKey, "dbKey");
        rj4.INSTANCE.b(db, context, dbKey);
    }

    @NotNull
    public String L() {
        return "user_birthday";
    }

    @NotNull
    public String M() {
        return "bak_database.db";
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001d  */
    @NotNull
    public String N(int sportMode, @Nullable String sportName, @Nullable String runExtra, @Nullable String deviceCategory) {
        boolean z;
        Integer numIsThirdpartySports;
        Context contextA = e88.a();
        RunExtra runExtra2 = (RunExtra) vd8.a(runExtra, RunExtra.class);
        boolean z2 = true;
        if (sportName == null) {
            z = false;
        } else {
            if (sportName.length() > 0) {
                z = true;
            } else {
                z = false;
            }
        }
        if (z) {
            if (((runExtra2 == null || (numIsThirdpartySports = runExtra2.isThirdpartySports()) == null || numIsThirdpartySports.intValue() != 1) ? false : true) || Intrinsics.areEqual(deviceCategory, kq5.WATCH_iWATCH)) {
                return sportName;
            }
        }
        Integer numE = njf.e(sportMode);
        if (numE != null) {
            sportName = contextA.getString(numE.intValue());
        }
        if (hii.f(sportMode)) {
            sportName = contextA.getString(njf.c(runExtra2 != null ? runExtra2.getGameId() : 0));
        } else if (sportMode == 9 || sportMode == 12) {
            if (sportName != null && sportName.length() != 0) {
                z2 = false;
            }
            if (z2 && hii.o(sportMode)) {
                sportName = contextA.getString(R.string.lib_base_yoga);
            }
        } else if (hii.b(sportMode)) {
            if (sportName != null && sportName.length() != 0) {
                z2 = false;
            }
            if (z2) {
                sportName = contextA.getString(com.heytap.health.sport.R.string.sport_his_record_title_exclusive_custom_sports);
            }
        }
        return sportName == null ? "" : sportName;
    }

    @Nullable
    public String O(@NotNull OneTimeSport oneTimeSport) {
        Intrinsics.checkNotNullParameter(oneTimeSport, "oneTimeSport");
        return SportRecordHelper.b(oneTimeSport);
    }

    public void P(@NotNull Integer[] requestDelayId) {
        Intrinsics.checkNotNullParameter(requestDelayId, "requestDelayId");
        p5d.INSTANCE.l(e88.a(), new b(requestDelayId, LongCase.ALL_HEALTH_DATA_CLOUD_SYNC));
    }

    public <T> T Q(@NotNull Class<T> tClass) {
        Intrinsics.checkNotNullParameter(tClass, "tClass");
        return (T) a.n(tClass);
    }

    @NotNull
    public ddd<Float> R(@NotNull String downLoadUrl, @NotNull String parentFilePath, @NotNull String fileName, @Nullable String fileMd5) {
        Intrinsics.checkNotNullParameter(downLoadUrl, "downLoadUrl");
        Intrinsics.checkNotNullParameter(parentFilePath, "parentFilePath");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        if (fileMd5 == null || fileMd5.length() == 0) {
            ddd<Float> dddVarI = kc7.k().i(downLoadUrl, parentFilePath, fileName);
            Intrinsics.checkNotNullExpressionValue(dddVarI, "get().download(\n        …   fileName\n            )");
            return dddVarI;
        }
        ddd<Float> dddVarJ = kc7.k().j(downLoadUrl, parentFilePath, fileName, fileMd5);
        Intrinsics.checkNotNullExpressionValue(dddVarJ, "get().download(\n        …        fileMd5\n        )");
        return dddVarJ;
    }

    @NotNull
    public String S() {
        return "user_guide_status";
    }

    @NotNull
    public String T(@NotNull String spName, @NotNull String key, @NotNull String defaultValue) {
        Intrinsics.checkNotNullParameter(spName, "spName");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        String strE = fdg.x(spName).E(key, defaultValue);
        Intrinsics.checkNotNullExpressionValue(strE, "getInstance(spName).getString(key, defaultValue)");
        return strE;
    }

    @NotNull
    public String U(@NotNull String pw, @NotNull String content) {
        Intrinsics.checkNotNullParameter(pw, "pw");
        Intrinsics.checkNotNullParameter(content, "content");
        try {
            String strA = zq.a(pw, content);
            Intrinsics.checkNotNullExpressionValue(strA, "{\n            AesUtils.a…CM(pw, content)\n        }");
            return strA;
        } catch (Exception e) {
            pf8.b("cloudAesDecrypt", "e:" + e);
            return "";
        }
    }

    public void V(@NotNull String spName, @NotNull String key, long value) {
        Intrinsics.checkNotNullParameter(spName, "spName");
        Intrinsics.checkNotNullParameter(key, "key");
        fdg.x(spName).T(key, value);
    }

    public void W(@NotNull String spName, @NotNull String key, int value) {
        Intrinsics.checkNotNullParameter(spName, "spName");
        Intrinsics.checkNotNullParameter(key, "key");
        fdg.x(spName).S(key, value);
    }

    public void X(@NotNull String spName, @NotNull String key, boolean value) {
        Intrinsics.checkNotNullParameter(spName, "spName");
        Intrinsics.checkNotNullParameter(key, "key");
        fdg.x(spName).W(key, value);
    }

    @Nullable
    public OneTimeSport Y(@NotNull String filePath) {
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        return SportRecordHelper.D(filePath);
    }

    public void Z(@NotNull SupportSQLiteDatabase db) {
        Intrinsics.checkNotNullParameter(db, "db");
        new wj4().a(db);
    }

    @NotNull
    public String a() {
        return "max_steps_in_one_minute";
    }

    @Nullable
    public String a0(@NotNull String TAG2, @NotNull String userId, int encryptMode) {
        Intrinsics.checkNotNullParameter(TAG2, "TAG");
        Intrinsics.checkNotNullParameter(userId, "userId");
        return D0(TAG2, userId, "goal_key", "origin_goal_key", encryptMode);
    }

    public void b(@NotNull Integer[] requestDelayId) {
        Intrinsics.checkNotNullParameter(requestDelayId, "requestDelayId");
        p5d.INSTANCE.m(e88.a(), requestDelayId[0].intValue());
    }

    @NotNull
    public String b0() {
        String str = SportRecordHelper.sportRecordFileKey;
        Intrinsics.checkNotNullExpressionValue(str, "sportRecordFileKey");
        return str;
    }

    @NotNull
    public String c() {
        return "delete_user_data_by_scene";
    }

    public <T> T c0(@NotNull Class<T> tClass) {
        Intrinsics.checkNotNullParameter(tClass, "tClass");
        return (T) a.k(tClass);
    }

    public boolean d(@NotNull String pw, @NotNull String sourcePath, @NotNull String encryptPath) {
        Intrinsics.checkNotNullParameter(pw, "pw");
        Intrinsics.checkNotNullParameter(sourcePath, Constant.SOURCE_PATH);
        Intrinsics.checkNotNullParameter(encryptPath, "encryptPath");
        return zq.e(pw, sourcePath, encryptPath);
    }

    public boolean d0(@NotNull byte[] pw, @NotNull String sourcePath, @NotNull String encryptPath) {
        Intrinsics.checkNotNullParameter(pw, "pw");
        Intrinsics.checkNotNullParameter(sourcePath, Constant.SOURCE_PATH);
        Intrinsics.checkNotNullParameter(encryptPath, "encryptPath");
        return zq.f(pw, sourcePath, encryptPath);
    }

    @NotNull
    public Set<String> e(@NotNull String spName, @NotNull String key, @NotNull Set<String> defaultValue) {
        Intrinsics.checkNotNullParameter(spName, "spName");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        Set<String> setG = fdg.x(spName).G(key, defaultValue);
        Intrinsics.checkNotNullExpressionValue(setG, "getInstance(spName).getS…ingSet(key, defaultValue)");
        return setG;
    }

    public void e0(@NotNull String spName, @NotNull String key, int value) {
        Intrinsics.checkNotNullParameter(spName, "spName");
        Intrinsics.checkNotNullParameter(key, "key");
        MultiProgressDataStoreRepository.a aVar = MultiProgressDataStoreRepository.Companion;
        Context contextA = e88.a();
        Intrinsics.checkNotNullExpressionValue(contextA, "getAppContext()");
        aVar.a(contextA, spName).o(key, value);
    }

    @NotNull
    public Triple<Boolean, String, String> f(@NotNull String filePath, @NotNull String fileName) {
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Triple<Boolean, String, String> tripleF = ((HealthService) e1.d().h(HealthService.class)).f(filePath, fileName);
        Intrinsics.checkNotNullExpressionValue(tripleF, "getInstance().navigation…nFile(filePath, fileName)");
        return tripleF;
    }

    public void f0(@NotNull Integer[] requestDelayId) {
        Intrinsics.checkNotNullParameter(requestDelayId, "requestDelayId");
        p5d.INSTANCE.k(e88.a(), new c(requestDelayId, ShortCase.HEALTH_DATA_CLOUD_SYNC));
    }

    @NotNull
    public String g(@NotNull String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        String strD = kdb.d(string);
        Intrinsics.checkNotNullExpressionValue(strD, "strToMD5(string)");
        return strD;
    }

    public long g0(@NotNull String spName, @NotNull String key, long defaultValue) {
        Intrinsics.checkNotNullParameter(spName, "spName");
        Intrinsics.checkNotNullParameter(key, "key");
        return fdg.x(spName).B(key, defaultValue);
    }

    public int getInt(@NotNull String key, int defaultValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        return fdg.w().z(key, defaultValue);
    }

    public long getLong(@NotNull String key, long defaultValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        return fdg.w().B(key, defaultValue);
    }

    public void h(boolean flag) {
        wj4.Companion.b(flag);
    }

    public int h0(@NotNull String spName, @NotNull String key, int defaultValue) {
        Intrinsics.checkNotNullParameter(spName, "spName");
        Intrinsics.checkNotNullParameter(key, "key");
        MultiProgressDataStoreRepository.a aVar = MultiProgressDataStoreRepository.Companion;
        Context contextA = e88.a();
        Intrinsics.checkNotNullExpressionValue(contextA, "getAppContext()");
        return aVar.a(contextA, spName).j(key, defaultValue);
    }

    public int i() {
        return 350;
    }

    @NotNull
    public String i0() {
        return "daily_event_stat_data_invalid_key";
    }

    @NotNull
    public String j() {
        return "last_record_end_timestamp";
    }

    @NotNull
    public String j0(@NotNull String pw, @NotNull String data) {
        Intrinsics.checkNotNullParameter(pw, "pw");
        Intrinsics.checkNotNullParameter(data, "data");
        try {
            String strL = zq.l(pw, data);
            Intrinsics.checkNotNullExpressionValue(strL, "{\n            AesUtils.e…domIv(pw, data)\n        }");
            return strL;
        } catch (Exception e) {
            sj4.b(TAG, "aesCtrEncrypt e: " + e.getMessage());
            return data;
        }
    }

    public void k(@NotNull String key, @NotNull String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        fdg.w().U(key, value);
    }

    @NotNull
    public String k0(@NotNull String path) throws NoSuchAlgorithmException, IOException {
        int i;
        Intrinsics.checkNotNullParameter(path, "path");
        FileInputStream fileInputStream = new FileInputStream(path);
        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        byte[] bArr = new byte[Barcode.FORMAT_UPC_E];
        do {
            i = fileInputStream.read(bArr);
            if (i > 0) {
                messageDigest.update(bArr, 0, i);
            }
        } while (i != -1);
        fileInputStream.close();
        String strEncodeToString = Base64.encodeToString(messageDigest.digest(), 2);
        Intrinsics.checkNotNullExpressionValue(strEncodeToString, "encodeToString(md5Bytes, Base64.NO_WRAP)");
        return strEncodeToString;
    }

    @NotNull
    public String l() {
        return "MENSTRUAL_CYCLE_DELETE_TIME:";
    }

    public <T> T l0(@NotNull Class<T> tClass) {
        Intrinsics.checkNotNullParameter(tClass, "tClass");
        return (T) a.j(tClass);
    }

    @NotNull
    public String m() {
        return "user_gender";
    }

    @Nullable
    public String m0(@NotNull String content, @NotNull String pw, @NotNull String iv, int encryptMode) {
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(pw, "pw");
        Intrinsics.checkNotNullParameter(iv, "iv");
        return r.b(content, pw, iv, encryptMode);
    }

    @NotNull
    public String n() {
        String str = SportRecordHelper.encryptionDirectory;
        Intrinsics.checkNotNullExpressionValue(str, "encryptionDirectory");
        return str;
    }

    public void n0() {
        new wj4().e();
    }

    public void o(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        a5k.h(context.getString(R$string.storage_low_tip));
    }

    public int o0(@NotNull String spName, @NotNull String key, int defaultValue) {
        Intrinsics.checkNotNullParameter(spName, "spName");
        Intrinsics.checkNotNullParameter(key, "key");
        return fdg.x(spName).z(key, defaultValue);
    }

    @NotNull
    public String p(@NotNull String pw, @NotNull String data) {
        Intrinsics.checkNotNullParameter(pw, "pw");
        Intrinsics.checkNotNullParameter(data, "data");
        try {
            String strI = zq.i(pw, data);
            Intrinsics.checkNotNullExpressionValue(strI, "{\n            AesUtils.d…domIv(pw, data)\n        }");
            return strI;
        } catch (Exception e) {
            sj4.b(TAG, "aesCtrDecrypt e: " + e.getMessage());
            return data;
        }
    }

    public boolean p0(@NotNull String pw, @NotNull String encryptPath, @NotNull String decryptPath) {
        Intrinsics.checkNotNullParameter(pw, "pw");
        Intrinsics.checkNotNullParameter(encryptPath, "encryptPath");
        Intrinsics.checkNotNullParameter(decryptPath, "decryptPath");
        return zq.j(pw, encryptPath, decryptPath);
    }

    public void q(@NotNull Integer[] requestDelayId) {
        Intrinsics.checkNotNullParameter(requestDelayId, "requestDelayId");
        p5d.INSTANCE.e(e88.a(), requestDelayId[0].intValue());
    }

    public boolean q0(@NotNull byte[] pw, @NotNull String encryptPath, @NotNull String decryptPath) {
        Intrinsics.checkNotNullParameter(pw, "pw");
        Intrinsics.checkNotNullParameter(encryptPath, "encryptPath");
        Intrinsics.checkNotNullParameter(decryptPath, "decryptPath");
        return zq.k(pw, encryptPath, decryptPath);
    }

    @NotNull
    public String r() {
        return "gomore_init_timestamp";
    }

    @NotNull
    public String r0(@NotNull Throwable e) {
        Intrinsics.checkNotNullParameter(e, "e");
        String strB = gv6.b(e);
        Intrinsics.checkNotNullExpressionValue(strB, "exceptionHandler(e)");
        return strB;
    }

    public void s(@NotNull String spName) {
        Intrinsics.checkNotNullParameter(spName, "spName");
        fdg.x(spName).m(true);
    }

    public <T> T s0(@NotNull Class<T> tClass) {
        Intrinsics.checkNotNullParameter(tClass, "tClass");
        return (T) a.o(tClass);
    }

    @NotNull
    public String t(@NotNull String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        String strB = he8.b(string);
        Intrinsics.checkNotNullExpressionValue(strB, "encrypt(string)");
        return strB;
    }

    @NotNull
    public String t0() {
        return new ov6((ov6.b) null).l();
    }

    public <T> T u(@NotNull Class<T> tClass) {
        Intrinsics.checkNotNullParameter(tClass, "tClass");
        return (T) a.l(tClass);
    }

    public void u0() {
        new wj4().c();
    }

    public void v(@NotNull String spName, @NotNull String key, @NotNull String value) {
        Intrinsics.checkNotNullParameter(spName, "spName");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        fdg.x(spName).U(key, value);
    }

    @NotNull
    public String v0(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return rj4.INSTANCE.a(context);
    }

    public void w(boolean flag) {
        wj4.Companion.c(flag);
    }

    @NotNull
    public String w0() {
        String strG = gpj.g();
        Intrinsics.checkNotNullExpressionValue(strG, "getDataClient()");
        return strG;
    }

    public void x(@NotNull String key, int value) {
        Intrinsics.checkNotNullParameter(key, "key");
        fdg.w().S(key, value);
    }

    public boolean x0(@NotNull String spName, @NotNull String key, boolean defaultValue) {
        Intrinsics.checkNotNullParameter(spName, "spName");
        Intrinsics.checkNotNullParameter(key, "key");
        return fdg.x(spName).r(key, defaultValue);
    }

    public void y(@NotNull String key, long value) {
        Intrinsics.checkNotNullParameter(key, "key");
        fdg.w().T(key, value);
    }

    @NotNull
    public String y0(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "str");
        String strD = kdb.d(e9g.Companion.a(str));
        Intrinsics.checkNotNullExpressionValue(strD, "strToMD5(SHA256Utils.getSHA256HexStr(str))");
        return strD;
    }

    @NotNull
    public String z() {
        return "last_use_health_timestamp";
    }

    @NotNull
    public String z0() {
        return "day_sleep_size_";
    }
}
