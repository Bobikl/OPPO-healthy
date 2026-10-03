package com.heytap.health.core.provider.adapter.open;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.heytap.databaseengineservice.db.table.healtharchives.DBHealthReviewPlan;
import com.heytap.health.core.provider.model.PhysicalMentalModel;
import com.heytap.health.operations.bean.PhysicalMentalData;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.aj4;
import com.oplus.aiunit.vision.b2n;
import io.protostuff.MapSchema;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 '2\u00020\u0001:\u0001(B\u0011\u0012\b\u0010$\u001a\u0004\u0018\u00010#¢\u0006\u0004\b%\u0010&JG\u0010\t\u001a\u00020\b2\u0010\u0010\u0004\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0003\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0010\u0010\u0006\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0003\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016J5\u0010\u0010\u001a\u00020\u000f2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0010\u0010\u0006\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J+\u0010\u0012\u001a\u00020\u000f2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0010\u0010\u0006\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0014\u001a\u00020\u0003H\u0016J\u0018\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0002J\u001e\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00152\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00170\u001bH\u0002R\u001b\u0010\"\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u001f\u001a\u0004\b \u0010!¨\u0006)"}, d2 = {"Lcom/heytap/health/core/provider/adapter/open/PhysicalMentalAdapter;", "Lcom/oplus/aiunit/vision/aj4;", "", "", "projection", "selection", "selectionArgs", "sortOrder", "Landroid/database/Cursor;", "f", "([Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;", "Landroid/content/ContentValues;", "values", "", MapSchema.FIELD_NAME_ENTRY, "", b2n.g, "(Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I", "b", "(Ljava/lang/String;[Ljava/lang/String;)I", b2n.f, "Landroid/database/MatrixCursor;", "cursor", "Lcom/heytap/health/operations/bean/PhysicalMentalData;", "data", "", MapSchema.FIELD_NAME_KEY, "", "dataList", "j", "Lcom/heytap/health/core/provider/model/PhysicalMentalModel;", "Lkotlin/Lazy;", LogFieldKey.LEVEL_KEY, "()Lcom/heytap/health/core/provider/model/PhysicalMentalModel;", "physicalMentalModel", "Landroid/content/ContentProvider;", "contentProvider", "<init>", "(Landroid/content/ContentProvider;)V", "Companion", "a", "operations_release"}, k = 1, mv = {1, 8, 0})
public final class PhysicalMentalAdapter extends aj4 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String READ_SCOPE = "READ_PHYSICAL_MENTAL_DATA";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Lazy physicalMentalModel;

    /* JADX INFO: renamed from: com.heytap.health.core.provider.adapter.open.PhysicalMentalAdapter$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002R\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\bR\u0014\u0010\n\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\b¨\u0006\r"}, d2 = {"Lcom/heytap/health/core/provider/adapter/open/PhysicalMentalAdapter$a;", "", "Landroid/content/Context;", "context", "", "a", "", "READ_SCOPE", "Ljava/lang/String;", "TAG", "URL", "<init>", "()V", "operations_release"}, k = 1, mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nPhysicalMentalAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PhysicalMentalAdapter.kt\ncom/heytap/health/core/provider/adapter/open/PhysicalMentalAdapter$Companion\n+ 2 Uri.kt\nandroidx/core/net/UriKt\n*L\n1#1,163:1\n29#2:164\n*S KotlinDebug\n*F\n+ 1 PhysicalMentalAdapter.kt\ncom/heytap/health/core/provider/adapter/open/PhysicalMentalAdapter$Companion\n*L\n50#1:164\n*E\n"})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(@Nullable Context context) {
            if (context != null) {
                a7b.f("PhysicalMentalAdapter", "update PhysicalMentalData provider");
                try {
                    context.getApplicationContext().getContentResolver().update(Uri.parse("content://com.heytap.health.sporthealthprovider/open/physicalMental"), null, null, null);
                } catch (Exception e2) {
                    a7b.b("PhysicalMentalAdapter", "update PhysicalMentalData provider e = :" + e2.getMessage());
                    Unit unit = Unit.INSTANCE;
                }
            }
        }
    }

    public PhysicalMentalAdapter(@Nullable ContentProvider contentProvider) {
        super(contentProvider);
        this.physicalMentalModel = LazyKt__LazyJVMKt.lazy(new Function0<PhysicalMentalModel>() { // from class: com.heytap.health.core.provider.adapter.open.PhysicalMentalAdapter$physicalMentalModel$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p010kotlin.jvm.functions.Function0
            @NotNull
            public final PhysicalMentalModel invoke() {
                return new PhysicalMentalModel();
            }
        });
    }

    @Override // com.oplus.aiunit.vision.f74
    public int b(@Nullable String selection, @Nullable String[] selectionArgs) {
        return 0;
    }

    @Override // com.oplus.aiunit.vision.f74
    public boolean e(@Nullable ContentValues values) {
        return false;
    }

    @Override // com.oplus.aiunit.vision.f74
    @NotNull
    public Cursor f(@Nullable String[] projection, @Nullable String selection, @Nullable String[] selectionArgs, @Nullable String sortOrder) {
        a7b.f("PhysicalMentalAdapter", "query: selection=" + selection);
        Bundle bundle = new Bundle();
        MatrixCursor matrixCursor = new MatrixCursor(new String[]{"value", "type", "timestamp"}, 1);
        try {
            if (TextUtils.isEmpty(selection)) {
                bundle.putInt("code", 0);
                bundle.putInt("subCode", 1003);
                bundle.putString(DBHealthReviewPlan.DESC, "selection parameter is required");
                matrixCursor.setExtras(bundle);
                return matrixCursor;
            }
            JsonObject asJsonObject = new JsonParser().parse(selection).getAsJsonObject();
            if (asJsonObject.has("startTime") && asJsonObject.has("endTime")) {
                long asLong = asJsonObject.get("startTime").getAsLong();
                long asLong2 = asJsonObject.get("endTime").getAsLong();
                StringBuilder sb = new StringBuilder();
                sb.append("query physical mental by time range: ");
                sb.append(asLong);
                sb.append(" - ");
                sb.append(asLong2);
                List<PhysicalMentalData> listB = l().b(asLong, asLong2);
                j(matrixCursor, listB);
                bundle.putInt("code", 1);
                bundle.putString(DBHealthReviewPlan.DESC, "query physical mental by time range success, count=" + listB.size());
            } else {
                bundle.putInt("code", 0);
                bundle.putInt("subCode", 1003);
                bundle.putString(DBHealthReviewPlan.DESC, "invalid query parameters, need startTime+endTime");
            }
            matrixCursor.setExtras(bundle);
            return matrixCursor;
        } catch (Exception e2) {
            a7b.c("PhysicalMentalAdapter", "query exception: " + e2.getMessage(), e2);
            bundle.putInt("code", 0);
            bundle.putInt("subCode", 1002);
            bundle.putString(DBHealthReviewPlan.DESC, "Exception: " + e2.getMessage());
        }
    }

    @Override // com.oplus.aiunit.vision.f74
    @NotNull
    public String g() {
        return READ_SCOPE;
    }

    @Override // com.oplus.aiunit.vision.f74
    public int h(@Nullable ContentValues values, @Nullable String selection, @Nullable String[] selectionArgs) {
        return 1;
    }

    public final void j(MatrixCursor cursor, List<PhysicalMentalData> dataList) {
        Iterator<PhysicalMentalData> it = dataList.iterator();
        while (it.hasNext()) {
            k(cursor, it.next());
        }
    }

    public final void k(MatrixCursor cursor, PhysicalMentalData data) {
        cursor.addRow(new Object[]{Integer.valueOf(data.getValue()), Integer.valueOf(data.getType()), Long.valueOf(data.getTimeStamp())});
    }

    public final PhysicalMentalModel l() {
        return (PhysicalMentalModel) this.physicalMentalModel.getValue();
    }
}
