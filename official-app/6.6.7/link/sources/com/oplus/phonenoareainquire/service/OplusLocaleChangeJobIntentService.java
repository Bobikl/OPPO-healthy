package com.oplus.phonenoareainquire.service;

import android.content.ContentProvider;
import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import androidx.core.app.JobIntentService;
import com.oplus.aiunit.vision.g3e;
import com.oplus.aiunit.vision.x5b;
import com.oplus.aiunit.vision.xje;
import com.oplus.pantanal.seedling.constants.TraceConstants;
import com.oplus.phonenoareainquire.PhoneNoInquireProvider;
import com.oplus.phonenoareainquire.b;
import com.oplus.phonenoareainquire.c;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u0000 \t2\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0014J\b\u0010\u0006\u001a\u00020\u0004H\u0002¨\u0006\u000b"}, d2 = {"Lcom/oplus/phonenoareainquire/service/OplusLocaleChangeJobIntentService;", "Landroidx/core/app/JobIntentService;", "Landroid/content/Intent;", TraceConstants.KEY_ACTION, "", "onHandleWork", "b", "<init>", "()V", "Companion", "a", "contactnetnumber_impl_thirdRelease"}, k = 1, mv = {1, 8, 0})
public final class OplusLocaleChangeJobIntentService extends JobIntentService {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    public static Context i;

    /* JADX INFO: renamed from: com.oplus.phonenoareainquire.service.OplusLocaleChangeJobIntentService$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ&\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007J\u0016\u0010\f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nJ-\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Lcom/oplus/phonenoareainquire/service/OplusLocaleChangeJobIntentService$a;", "", "Ljava/io/InputStream;", "inputStream", "Landroid/content/Context;", "context", "Landroid/database/sqlite/SQLiteDatabase;", "db", "", "c", "Landroid/content/Intent;", "work", "a", "", "", "valuesList", "", "languageIndex", "b", "(Landroid/database/sqlite/SQLiteDatabase;[Ljava/lang/String;I)V", "TAG", "Ljava/lang/String;", "TASK_UPDATE_LANGUAGE_TABLE", "I", "mContext", "Landroid/content/Context;", "<init>", "()V", "contactnetnumber_impl_thirdRelease"}, k = 1, mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nOplusLocaleChangeJobIntentService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OplusLocaleChangeJobIntentService.kt\ncom/oplus/phonenoareainquire/service/OplusLocaleChangeJobIntentService$Companion\n+ 2 Strings.kt\nkotlin/text/StringsKt__StringsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,196:1\n107#2:197\n79#2,22:198\n37#3,2:220\n37#3,2:222\n*S KotlinDebug\n*F\n+ 1 OplusLocaleChangeJobIntentService.kt\ncom/oplus/phonenoareainquire/service/OplusLocaleChangeJobIntentService$Companion\n*L\n133#1:197\n133#1:198,22\n136#1:220,2\n145#1:222,2\n*E\n"})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(@NotNull Context context, @NotNull Intent work) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(work, "work");
            OplusLocaleChangeJobIntentService.i = context;
            JobIntentService.enqueueWork(context, OplusLocaleChangeJobIntentService.class, 0, work);
        }

        @JvmStatic
        public final void b(SQLiteDatabase db, String[] valuesList, int languageIndex) {
            try {
                db.execSQL("update areano_and_citynames set cityname = '" + valuesList[languageIndex] + "' where _id = '" + valuesList[0] + "';");
                int i = languageIndex + 2;
                if (Intrinsics.areEqual(valuesList[i], "null")) {
                    db.execSQL("update province_and_city_relation set province = '" + valuesList[languageIndex + 1] + "', city = null where _id = '" + valuesList[0] + "';");
                } else {
                    db.execSQL("update province_and_city_relation set province = '" + valuesList[languageIndex + 1] + "', city = '" + valuesList[i] + "' where _id = '" + valuesList[0] + "';");
                }
            } catch (SQLiteException e) {
                g3e.b("OplusLocaleChangeJobIntentService", "e = " + e.getMessage());
            }
        }

        @JvmStatic
        public final void c(@Nullable InputStream inputStream, @Nullable Context context, @Nullable SQLiteDatabase db) throws IOException {
            InputStream inputStream2;
            g3e.a("OplusLocaleChangeJobIntentService", "enter updateMultiLanguageTag , start to update table");
            b.a();
            String strA = x5b.a();
            if (x5b.c(strA)) {
                strA = "US";
            }
            if (inputStream != null) {
                inputStream2 = inputStream;
            } else {
                if (c.b("Multi_Language_Table.txt", PhoneNoInquireProvider.sMultiLanguageTableFile) != null) {
                    g3e.a("OplusLocaleChangeJobIntentService", "inputStream is null");
                    return;
                }
                inputStream2 = null;
            }
            if (db == null && context == null) {
                return;
            }
            SQLiteDatabase writableDatabase = db == null ? xje.l(context).getWritableDatabase() : db;
            Intrinsics.checkNotNull(writableDatabase);
            writableDatabase.beginTransaction();
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream2);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            boolean z = false;
            int i = 1;
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null || line.length() == 0) {
                    bufferedReader.close();
                    inputStreamReader.close();
                    writableDatabase.setTransactionSuccessful();
                    writableDatabase.endTransaction();
                    g3e.c("OplusLocaleChangeJobIntentService", "updateMultiLanguageTab success " + strA);
                    return;
                }
                Intrinsics.checkNotNullExpressionValue(line, "line");
                int length = line.length() - 1;
                int i2 = 0;
                boolean z2 = false;
                while (i2 <= length) {
                    boolean z3 = Intrinsics.compare(line.charAt(!z2 ? i2 : length), 32) <= 0;
                    if (z2) {
                        if (!z3) {
                            break;
                        } else {
                            length--;
                        }
                    } else if (z3) {
                        i2++;
                    } else {
                        z2 = true;
                    }
                }
                String string = line.subSequence(i2, length + 1).toString();
                if (z) {
                    Intrinsics.checkNotNullExpressionValue(string, "line");
                    String[] strArr = (String[]) StringsKt.split$default(string, new String[]{"\t"}, false, 0, 6, (Object) null).toArray(new String[0]);
                    int length2 = strArr.length;
                    for (int i3 = 0; i3 < length2; i3++) {
                        strArr[i3] = StringsKt.replace$default(strArr[i3], "'", "''", false, 4, (Object) null);
                    }
                    b(writableDatabase, strArr, i);
                } else {
                    Intrinsics.checkNotNullExpressionValue(string, "line");
                    String[] strArr2 = (String[]) StringsKt.split$default(string, new String[]{"\t"}, false, 0, 6, (Object) null).toArray(new String[0]);
                    int length3 = strArr2.length;
                    for (int i4 = 1; i4 < length3; i4++) {
                        if (Intrinsics.areEqual(strArr2[i4], strA)) {
                            i = i4;
                        }
                    }
                    z = true;
                }
            }
        }
    }

    @JvmStatic
    public static final void c(@Nullable InputStream inputStream, @Nullable Context context, @Nullable SQLiteDatabase sQLiteDatabase) {
        INSTANCE.c(inputStream, context, sQLiteDatabase);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b() throws IOException {
        SQLiteDatabase writableDatabase = xje.l(getApplicationContext()).getWritableDatabase();
        try {
            FileInputStream fileInputStream = new FileInputStream(PhoneNoInquireProvider.sMultiLanguageTableFile);
            try {
                INSTANCE.c(fileInputStream, i, writableDatabase);
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(fileInputStream, (Throwable) null);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    CloseableKt.closeFinally(fileInputStream, th);
                    throw th2;
                }
            }
        } catch (SQLiteException e) {
            g3e.b("OplusLocaleChangeJobIntentService", "e = " + e.getMessage());
        } catch (IOException e2) {
            try {
                INSTANCE.c(null, i, writableDatabase);
            } catch (SQLiteException e3) {
                g3e.b("OplusLocaleChangeJobIntentService", "e = " + e3.getMessage());
            }
            g3e.b("OplusLocaleChangeJobIntentService", "e = " + e2.getMessage());
        }
    }

    public void onHandleWork(@NotNull Intent intent) throws IOException {
        ContentProvider localContentProvider;
        ContentResolver contentResolver;
        Intrinsics.checkNotNullParameter(intent, TraceConstants.KEY_ACTION);
        if (i == null) {
            return;
        }
        b();
        Context context = i;
        ContentProviderClient contentProviderClientAcquireContentProviderClient = (context == null || (contentResolver = context.getContentResolver()) == null) ? null : contentResolver.acquireContentProviderClient(PhoneNoInquireProvider.AUTHORITY);
        if (contentProviderClientAcquireContentProviderClient != null && (localContentProvider = contentProviderClientAcquireContentProviderClient.getLocalContentProvider()) != null && (localContentProvider instanceof PhoneNoInquireProvider)) {
            g3e.a("OplusLocaleChangeJobIntentService", "start ot run onLocaleChanged");
            ((PhoneNoInquireProvider) localContentProvider).onLocaleChanged();
        }
        if (contentProviderClientAcquireContentProviderClient != null) {
            contentProviderClientAcquireContentProviderClient.close();
        }
    }
}
