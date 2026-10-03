package com.heytap.databaseengineservice.db.table.healtharchives;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;
import com.heytap.databaseengine.model.SportHealthData;
import com.heytap.health.health_archives.web.HealthArchiveWebViewActivity;
import com.heytap.health.operation.ecg.business.PdfViewActivity;
import com.oplus.aiunit.vision.iim;
import com.oplus.utrace.db.UTraceSQLiteHelperKt;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.heytap.databaseengineservice.db.table.healtharchives.DBHealthIndicatorDetail, reason: from toString */
/* JADX INFO: loaded from: classes15.dex */
@Parcelize
@Keep
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b+\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\bQ\b\u0087\b\u0018\u0000 £\u00012\u00020\u00012\u00020\u0002:\u0002¤\u0001Bû\u0002\u0012\b\b\u0003\u0010*\u001a\u00020\u0007\u0012\b\b\u0003\u0010+\u001a\u00020\u0003\u0012\b\b\u0003\u0010,\u001a\u00020\u0003\u0012\b\b\u0002\u0010-\u001a\u00020\n\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00109\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010=\u001a\u00020\n\u0012\n\b\u0002\u0010>\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010?\u001a\u00020\u0007\u0012\n\b\u0002\u0010@\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010A\u001a\u00020\n\u0012\n\b\u0002\u0010B\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010C\u001a\u00020!\u0012\b\b\u0002\u0010D\u001a\u00020\n\u0012\n\b\u0002\u0010E\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010F\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010G\u001a\u00020\n\u0012\b\b\u0002\u0010H\u001a\u00020\n\u0012\b\b\u0002\u0010I\u001a\u00020\n\u0012\b\b\u0002\u0010J\u001a\u00020\u0007¢\u0006\u0006\b¡\u0001\u0010¢\u0001J\t\u0010\u0004\u001a\u00020\u0003HÂ\u0003J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\nHÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\nHÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\nHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\"\u001a\u00020!HÆ\u0003J\t\u0010#\u001a\u00020\nHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010&\u001a\u00020\nHÆ\u0003J\t\u0010'\u001a\u00020\nHÆ\u0003J\t\u0010(\u001a\u00020\nHÆ\u0003J\t\u0010)\u001a\u00020\u0007HÆ\u0003Jû\u0002\u0010K\u001a\u00020\u00002\b\b\u0003\u0010*\u001a\u00020\u00072\b\b\u0003\u0010+\u001a\u00020\u00032\b\b\u0003\u0010,\u001a\u00020\u00032\b\b\u0002\u0010-\u001a\u00020\n2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00109\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010=\u001a\u00020\n2\n\b\u0002\u0010>\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010?\u001a\u00020\u00072\n\b\u0002\u0010@\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010A\u001a\u00020\n2\n\b\u0002\u0010B\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010C\u001a\u00020!2\b\b\u0002\u0010D\u001a\u00020\n2\n\b\u0002\u0010E\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010F\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010G\u001a\u00020\n2\b\b\u0002\u0010H\u001a\u00020\n2\b\b\u0002\u0010I\u001a\u00020\n2\b\b\u0002\u0010J\u001a\u00020\u0007HÆ\u0001J\t\u0010L\u001a\u00020\nHÖ\u0001J\u0013\u0010O\u001a\u00020!2\b\u0010N\u001a\u0004\u0018\u00010MHÖ\u0003J\t\u0010P\u001a\u00020\nHÖ\u0001J\u0019\u0010U\u001a\u00020T2\u0006\u0010R\u001a\u00020Q2\u0006\u0010S\u001a\u00020\nHÖ\u0001R\"\u0010*\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b*\u0010V\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR\u0016\u0010+\u001a\u00020\u00038\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b+\u0010[R\"\u0010,\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b,\u0010[\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R\"\u0010-\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b-\u0010`\u001a\u0004\ba\u0010b\"\u0004\bc\u0010dR$\u0010.\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b.\u0010[\u001a\u0004\be\u0010]\"\u0004\bf\u0010_R$\u0010/\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b/\u0010[\u001a\u0004\bg\u0010]\"\u0004\bh\u0010_R$\u00100\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b0\u0010[\u001a\u0004\bi\u0010]\"\u0004\bj\u0010_R$\u00101\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b1\u0010[\u001a\u0004\bk\u0010]\"\u0004\bl\u0010_R$\u00102\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b2\u0010[\u001a\u0004\bm\u0010]\"\u0004\bn\u0010_R$\u00103\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b3\u0010[\u001a\u0004\bo\u0010]\"\u0004\bp\u0010_R$\u00104\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b4\u0010[\u001a\u0004\bq\u0010]\"\u0004\br\u0010_R$\u00105\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b5\u0010[\u001a\u0004\bs\u0010]\"\u0004\bt\u0010_R$\u00106\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b6\u0010[\u001a\u0004\bu\u0010]\"\u0004\bv\u0010_R$\u00107\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b7\u0010[\u001a\u0004\bw\u0010]\"\u0004\bx\u0010_R$\u00108\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b8\u0010[\u001a\u0004\by\u0010]\"\u0004\bz\u0010_R$\u00109\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b9\u0010[\u001a\u0004\b{\u0010]\"\u0004\b|\u0010_R$\u0010:\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b:\u0010[\u001a\u0004\b}\u0010]\"\u0004\b~\u0010_R%\u0010;\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0013\n\u0004\b;\u0010[\u001a\u0004\b\u007f\u0010]\"\u0005\b\u0080\u0001\u0010_R&\u0010<\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0004\b<\u0010[\u001a\u0005\b\u0081\u0001\u0010]\"\u0005\b\u0082\u0001\u0010_R$\u0010=\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0004\b=\u0010`\u001a\u0005\b\u0083\u0001\u0010b\"\u0005\b\u0084\u0001\u0010dR&\u0010>\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0004\b>\u0010[\u001a\u0005\b\u0085\u0001\u0010]\"\u0005\b\u0086\u0001\u0010_R$\u0010?\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0004\b?\u0010V\u001a\u0005\b\u0087\u0001\u0010X\"\u0005\b\u0088\u0001\u0010ZR&\u0010@\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0004\b@\u0010[\u001a\u0005\b\u0089\u0001\u0010]\"\u0005\b\u008a\u0001\u0010_R$\u0010A\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0004\bA\u0010`\u001a\u0005\b\u008b\u0001\u0010b\"\u0005\b\u008c\u0001\u0010dR&\u0010B\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0004\bB\u0010[\u001a\u0005\b\u008d\u0001\u0010]\"\u0005\b\u008e\u0001\u0010_R&\u0010C\u001a\u00020!8\u0006@\u0006X\u0087\u000e¢\u0006\u0016\n\u0005\bC\u0010\u008f\u0001\u001a\u0005\bC\u0010\u0090\u0001\"\u0006\b\u0091\u0001\u0010\u0092\u0001R$\u0010D\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0004\bD\u0010`\u001a\u0005\b\u0093\u0001\u0010b\"\u0005\b\u0094\u0001\u0010dR&\u0010E\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0004\bE\u0010[\u001a\u0005\b\u0095\u0001\u0010]\"\u0005\b\u0096\u0001\u0010_R&\u0010F\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0004\bF\u0010[\u001a\u0005\b\u0097\u0001\u0010]\"\u0005\b\u0098\u0001\u0010_R$\u0010G\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0004\bG\u0010`\u001a\u0005\b\u0099\u0001\u0010b\"\u0005\b\u009a\u0001\u0010dR$\u0010H\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0004\bH\u0010`\u001a\u0005\b\u009b\u0001\u0010b\"\u0005\b\u009c\u0001\u0010dR$\u0010I\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0004\bI\u0010`\u001a\u0005\b\u009d\u0001\u0010b\"\u0005\b\u009e\u0001\u0010dR$\u0010J\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0004\bJ\u0010V\u001a\u0005\b\u009f\u0001\u0010X\"\u0005\b \u0001\u0010Z¨\u0006¥\u0001"}, d2 = {"Lcom/heytap/databaseengineservice/db/table/healtharchives/DBHealthIndicatorDetail;", "Lcom/heytap/databaseengine/model/SportHealthData;", "Landroid/os/Parcelable;", "", "component2", "getSsoid", "toString", "", "component1", "component3", "", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "component33", HealthArchiveWebViewActivity.H5_DATA_ID_KEY, "ssoid", "docId", "fileIndex", "bodySystem", "category", "owner", "institute", "name", "uniformName", "value", "uniformValue", "unit", "uniformUnit", DBIndicatorStat.REFER, "uniformReferMan", "uniformReferWoman", DBIndicatorStat.REMIND, "uniformRemind", "valueState", "type", "dataCreatedTimestamp", iim.a.f, DBIndicatorStat.SORT, "uniformValueType", "isUniform", "riskRank", "explain", "dataExtends", "syncStatus", "updated", "deleted", "modifiedTimestamp", "copy", "hashCode", "", "other", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", UTraceSQLiteHelperKt.COL_FLAGS, "", "writeToParcel", "J", "getDataId", "()J", "setDataId", "(J)V", "Ljava/lang/String;", "getDocId", "()Ljava/lang/String;", "setDocId", "(Ljava/lang/String;)V", "I", "getFileIndex", "()I", "setFileIndex", "(I)V", "getBodySystem", "setBodySystem", "getCategory", "setCategory", "getOwner", "setOwner", "getInstitute", "setInstitute", "getName", "setName", "getUniformName", "setUniformName", "getValue", "setValue", "getUniformValue", "setUniformValue", "getUnit", "setUnit", "getUniformUnit", "setUniformUnit", "getRefer", "setRefer", "getUniformReferMan", "setUniformReferMan", "getUniformReferWoman", "setUniformReferWoman", "getRemind", "setRemind", "getUniformRemind", "setUniformRemind", "getValueState", "setValueState", "getType", "setType", "getDataCreatedTimestamp", "setDataCreatedTimestamp", "getDescription", "setDescription", "getSort", "setSort", "getUniformValueType", "setUniformValueType", "Z", "()Z", "setUniform", "(Z)V", "getRiskRank", "setRiskRank", "getExplain", "setExplain", "getDataExtends", "setDataExtends", "getSyncStatus", "setSyncStatus", "getUpdated", "setUpdated", "getDeleted", "setDeleted", "getModifiedTimestamp", "setModifiedTimestamp", "<init>", "(JLjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;JLjava/lang/String;ILjava/lang/String;ZILjava/lang/String;Ljava/lang/String;IIIJ)V", "Companion", "a", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0})
@Entity(indices = {@Index(name = "idx_indicator_detail_ssoid_docid", value = {"ssoid", "doc_id"}), @Index(name = "idx_indicator_detail_doc_id", value = {"doc_id"})}, tableName = DBIndicatorStat.TABLE_NAME)
public final /* data */ class DBIndicatorStat extends SportHealthData implements Parcelable {

    @NotNull
    public static final String BODY_SYSTEM = "body_system";

    @NotNull
    public static final String CATEGORY = "category";

    @NotNull
    public static final String DATA_CREATED_TIMESTAMP = "data_created_timestamp";

    @NotNull
    public static final String DATA_EXTENDS = "data_extends";

    @NotNull
    public static final String DATA_ID = "data_id";

    @NotNull
    public static final String DELETED = "deleted";

    @NotNull
    public static final String DESCRIPTION_URL = "description_url";

    @NotNull
    public static final String DOC_ID = "doc_id";

    @NotNull
    public static final String FILE_INDEX = "file_index";

    @NotNull
    public static final String INDICATOR_EXPLAIN = "explain";

    @NotNull
    public static final String INSTITUTE = "institute";

    @NotNull
    public static final String IS_UNIFORM = "is_uniform";

    @NotNull
    public static final String MODIFIED_TIMESTAMP = "modified_timestamp";

    @NotNull
    public static final String NAME = "name";

    @NotNull
    public static final String OWNER = "owner";

    @NotNull
    public static final String REFER = "refer";

    @NotNull
    public static final String REMIND = "remind";

    @NotNull
    public static final String RISK_RANK = "risk_rank";

    @NotNull
    public static final String SORT = "sort";

    @NotNull
    public static final String SSOID = "ssoid";

    @NotNull
    public static final String SYNC_STATUS = "sync_status";

    @NotNull
    public static final String TABLE_NAME = "DBHealthIndicatorDetail";

    @NotNull
    public static final String TYPE = "type";

    @NotNull
    public static final String UNIFORM_NAME = "uniform_name";

    @NotNull
    public static final String UNIFORM_REFER_MAN = "uniform_refer_man";

    @NotNull
    public static final String UNIFORM_REFER_WOMAN = "uniform_refer_woman";

    @NotNull
    public static final String UNIFORM_REMIND = "uniform_remind";

    @NotNull
    public static final String UNIFORM_UNIT = "uniform_unit";

    @NotNull
    public static final String UNIFORM_VALUE = "uniform_value";

    @NotNull
    public static final String UNIFORM_VALUE_TYPE = "uniform_value_type";

    @NotNull
    public static final String UNIT = "unit";

    @NotNull
    public static final String UPDATED = "updated";

    @NotNull
    public static final String VALUE = "value";

    @NotNull
    public static final String VALUE_STATE = "value_state";

    @ColumnInfo(name = "body_system")
    @Nullable
    private String bodySystem;

    @ColumnInfo(name = "category")
    @Nullable
    private String category;

    @ColumnInfo(name = "data_created_timestamp")
    private long dataCreatedTimestamp;

    @ColumnInfo(name = "data_extends")
    @Nullable
    private String dataExtends;

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "data_id")
    private long dataId;

    @ColumnInfo(name = "deleted")
    private int deleted;

    @ColumnInfo(name = DESCRIPTION_URL)
    @Nullable
    private String description;

    @ColumnInfo(name = "doc_id")
    @NotNull
    private String docId;

    @ColumnInfo(name = "explain")
    @Nullable
    private String explain;

    @ColumnInfo(name = "file_index")
    private int fileIndex;

    @ColumnInfo(name = "institute")
    @Nullable
    private String institute;

    @ColumnInfo(name = IS_UNIFORM)
    private boolean isUniform;

    @ColumnInfo(name = "modified_timestamp")
    private long modifiedTimestamp;

    @ColumnInfo(name = "name")
    @Nullable
    private String name;

    @ColumnInfo(name = "owner")
    @Nullable
    private String owner;

    @ColumnInfo(name = REFER)
    @Nullable
    private String refer;

    @ColumnInfo(name = REMIND)
    @Nullable
    private String remind;

    @ColumnInfo(name = "risk_rank")
    private int riskRank;

    @ColumnInfo(name = SORT)
    private int sort;

    @ColumnInfo(name = "ssoid")
    @NotNull
    private String ssoid;

    @ColumnInfo(name = "sync_status")
    private int syncStatus;

    @ColumnInfo(name = "type")
    @Nullable
    private String type;

    @ColumnInfo(name = UNIFORM_NAME)
    @Nullable
    private String uniformName;

    @ColumnInfo(name = UNIFORM_REFER_MAN)
    @Nullable
    private String uniformReferMan;

    @ColumnInfo(name = UNIFORM_REFER_WOMAN)
    @Nullable
    private String uniformReferWoman;

    @ColumnInfo(name = UNIFORM_REMIND)
    @Nullable
    private String uniformRemind;

    @ColumnInfo(name = UNIFORM_UNIT)
    @Nullable
    private String uniformUnit;

    @ColumnInfo(name = UNIFORM_VALUE)
    @Nullable
    private String uniformValue;

    @ColumnInfo(name = "uniform_value_type")
    @Nullable
    private String uniformValueType;

    @ColumnInfo(name = "unit")
    @Nullable
    private String unit;

    @ColumnInfo(name = "updated")
    private int updated;

    @ColumnInfo(name = "value")
    @Nullable
    private String value;

    @ColumnInfo(name = VALUE_STATE)
    private int valueState;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<DBIndicatorStat> CREATOR = new b();

    /* JADX INFO: renamed from: com.heytap.databaseengineservice.db.table.healtharchives.DBHealthIndicatorDetail$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b)\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b)\u0010*J\b\u0010\u0003\u001a\u00020\u0002H\u0007J\b\u0010\u0004\u001a\u00020\u0002H\u0007J\b\u0010\u0005\u001a\u00020\u0002H\u0007R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0007R\u0014\u0010\f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0007R\u0014\u0010\r\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0007R\u0014\u0010\u000e\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0007R\u0014\u0010\u000f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0007R\u0014\u0010\u0010\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0007R\u0014\u0010\u0011\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0007R\u0014\u0010\u0012\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0007R\u0014\u0010\u0013\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0007R\u0014\u0010\u0014\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0007R\u0014\u0010\u0015\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0007R\u0014\u0010\u0016\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0007R\u0014\u0010\u0017\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0007R\u0014\u0010\u0018\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0007R\u0014\u0010\u0019\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0007R\u0014\u0010\u001a\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0007R\u0014\u0010\u001b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0007R\u0014\u0010\u001c\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0007R\u0014\u0010\u001d\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0007R\u0014\u0010\u001e\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0007R\u0014\u0010\u001f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001f\u0010\u0007R\u0014\u0010 \u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b \u0010\u0007R\u0014\u0010!\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b!\u0010\u0007R\u0014\u0010\"\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\"\u0010\u0007R\u0014\u0010#\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b#\u0010\u0007R\u0014\u0010$\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b$\u0010\u0007R\u0014\u0010%\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b%\u0010\u0007R\u0014\u0010&\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b&\u0010\u0007R\u0014\u0010'\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b'\u0010\u0007R\u0014\u0010(\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b(\u0010\u0007¨\u0006+"}, d2 = {"Lcom/heytap/databaseengineservice/db/table/healtharchives/DBHealthIndicatorDetail$a;", "", "", "c", "b", "a", "BODY_SYSTEM", "Ljava/lang/String;", "CATEGORY", "DATA_CREATED_TIMESTAMP", "DATA_EXTENDS", "DATA_ID", "DELETED", "DESCRIPTION_URL", "DOC_ID", "FILE_INDEX", "INDICATOR_EXPLAIN", "INSTITUTE", "IS_UNIFORM", "MODIFIED_TIMESTAMP", "NAME", "OWNER", "REFER", "REMIND", "RISK_RANK", "SORT", PdfViewActivity.SSOID, "SYNC_STATUS", "TABLE_NAME", "TYPE", "UNIFORM_NAME", "UNIFORM_REFER_MAN", "UNIFORM_REFER_WOMAN", "UNIFORM_REMIND", "UNIFORM_UNIT", "UNIFORM_VALUE", "UNIFORM_VALUE_TYPE", "UNIT", "UPDATED", "VALUE", "VALUE_STATE", "<init>", "()V", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final String a() {
            return "CREATE INDEX IF NOT EXISTS idx_indicator_detail_doc_id ON DBHealthIndicatorDetail(doc_id)";
        }

        @JvmStatic
        @NotNull
        public final String b() {
            return "CREATE INDEX IF NOT EXISTS idx_indicator_detail_ssoid_docid ON DBHealthIndicatorDetail(ssoid, doc_id)";
        }

        @JvmStatic
        @NotNull
        public final String c() {
            String str = "create table if not exists DBHealthIndicatorDetail(data_id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,ssoid TEXT not null,doc_id TEXT not null,file_index INTEGER not null,body_system TEXT,category TEXT,owner TEXT,institute TEXT,name TEXT,uniform_name TEXT,value TEXT,uniform_value TEXT,unit TEXT,uniform_unit TEXT,refer TEXT,uniform_refer_man TEXT,uniform_refer_woman TEXT,remind TEXT,uniform_remind TEXT,value_state INTEGER NOT NULL,type TEXT,data_created_timestamp INTEGER NOT NULL,description_url TEXT,uniform_value_type TEXT,sort INTEGER NOT NULL,is_uniform INTEGER NOT NULL,risk_rank INTEGER NOT NULL,data_extends TEXT,sync_status INTEGER NOT NULL,updated INTEGER NOT NULL,deleted INTEGER NOT NULL,modified_timestamp INTEGER not null)";
            Intrinsics.checkNotNullExpressionValue(str, "strSql.toString()");
            return str;
        }
    }

    /* JADX INFO: renamed from: com.heytap.databaseengineservice.db.table.healtharchives.DBHealthIndicatorDetail$b */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<DBIndicatorStat> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final DBIndicatorStat createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DBIndicatorStat(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readLong(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readInt() != 0, parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final DBIndicatorStat[] newArray(int i) {
            return new DBIndicatorStat[i];
        }
    }

    public DBIndicatorStat() {
        this(0L, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, null, 0L, null, 0, null, false, 0, null, null, 0, 0, 0, 0L, -1, 1, null);
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    private final String getSsoid() {
        return this.ssoid;
    }

    public static /* synthetic */ DBIndicatorStat copy$default(DBIndicatorStat dBIndicatorStat, long j2, String str, String str2, int i, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, int i2, String str18, long j3, String str19, int i3, String str20, boolean z, int i4, String str21, String str22, int i5, int i6, int i7, long j4, int i8, int i9, Object obj) {
        long j5 = (i8 & 1) != 0 ? dBIndicatorStat.dataId : j2;
        String str23 = (i8 & 2) != 0 ? dBIndicatorStat.ssoid : str;
        String str24 = (i8 & 4) != 0 ? dBIndicatorStat.docId : str2;
        int i10 = (i8 & 8) != 0 ? dBIndicatorStat.fileIndex : i;
        String str25 = (i8 & 16) != 0 ? dBIndicatorStat.bodySystem : str3;
        String str26 = (i8 & 32) != 0 ? dBIndicatorStat.category : str4;
        String str27 = (i8 & 64) != 0 ? dBIndicatorStat.owner : str5;
        String str28 = (i8 & 128) != 0 ? dBIndicatorStat.institute : str6;
        String str29 = (i8 & 256) != 0 ? dBIndicatorStat.name : str7;
        String str30 = (i8 & 512) != 0 ? dBIndicatorStat.uniformName : str8;
        String str31 = (i8 & 1024) != 0 ? dBIndicatorStat.value : str9;
        String str32 = (i8 & 2048) != 0 ? dBIndicatorStat.uniformValue : str10;
        return dBIndicatorStat.copy(j5, str23, str24, i10, str25, str26, str27, str28, str29, str30, str31, str32, (i8 & 4096) != 0 ? dBIndicatorStat.unit : str11, (i8 & 8192) != 0 ? dBIndicatorStat.uniformUnit : str12, (i8 & 16384) != 0 ? dBIndicatorStat.refer : str13, (i8 & 32768) != 0 ? dBIndicatorStat.uniformReferMan : str14, (i8 & 65536) != 0 ? dBIndicatorStat.uniformReferWoman : str15, (i8 & 131072) != 0 ? dBIndicatorStat.remind : str16, (i8 & 262144) != 0 ? dBIndicatorStat.uniformRemind : str17, (i8 & 524288) != 0 ? dBIndicatorStat.valueState : i2, (i8 & 1048576) != 0 ? dBIndicatorStat.type : str18, (i8 & 2097152) != 0 ? dBIndicatorStat.dataCreatedTimestamp : j3, (i8 & 4194304) != 0 ? dBIndicatorStat.description : str19, (8388608 & i8) != 0 ? dBIndicatorStat.sort : i3, (i8 & 16777216) != 0 ? dBIndicatorStat.uniformValueType : str20, (i8 & 33554432) != 0 ? dBIndicatorStat.isUniform : z, (i8 & 67108864) != 0 ? dBIndicatorStat.riskRank : i4, (i8 & 134217728) != 0 ? dBIndicatorStat.explain : str21, (i8 & 268435456) != 0 ? dBIndicatorStat.dataExtends : str22, (i8 & 536870912) != 0 ? dBIndicatorStat.syncStatus : i5, (i8 & 1073741824) != 0 ? dBIndicatorStat.updated : i6, (i8 & Integer.MIN_VALUE) != 0 ? dBIndicatorStat.deleted : i7, (i9 & 1) != 0 ? dBIndicatorStat.modifiedTimestamp : j4);
    }

    @JvmStatic
    @NotNull
    public static final String createIndexDocId() {
        return INSTANCE.a();
    }

    @JvmStatic
    @NotNull
    public static final String createIndexSsoidDocId() {
        return INSTANCE.b();
    }

    @JvmStatic
    @NotNull
    public static final String createTable() {
        return INSTANCE.c();
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getDataId() {
        return this.dataId;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getUniformName() {
        return this.uniformName;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getUniformValue() {
        return this.uniformValue;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getUnit() {
        return this.unit;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getUniformUnit() {
        return this.uniformUnit;
    }

    @Nullable
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getRefer() {
        return this.refer;
    }

    @Nullable
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getUniformReferMan() {
        return this.uniformReferMan;
    }

    @Nullable
    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getUniformReferWoman() {
        return this.uniformReferWoman;
    }

    @Nullable
    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getRemind() {
        return this.remind;
    }

    @Nullable
    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getUniformRemind() {
        return this.uniformRemind;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final int getValueState() {
        return this.valueState;
    }

    @Nullable
    /* JADX INFO: renamed from: component21, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final long getDataCreatedTimestamp() {
        return this.dataCreatedTimestamp;
    }

    @Nullable
    /* JADX INFO: renamed from: component23, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    public final int getSort() {
        return this.sort;
    }

    @Nullable
    /* JADX INFO: renamed from: component25, reason: from getter */
    public final String getUniformValueType() {
        return this.uniformValueType;
    }

    /* JADX INFO: renamed from: component26, reason: from getter */
    public final boolean getIsUniform() {
        return this.isUniform;
    }

    /* JADX INFO: renamed from: component27, reason: from getter */
    public final int getRiskRank() {
        return this.riskRank;
    }

    @Nullable
    /* JADX INFO: renamed from: component28, reason: from getter */
    public final String getExplain() {
        return this.explain;
    }

    @Nullable
    /* JADX INFO: renamed from: component29, reason: from getter */
    public final String getDataExtends() {
        return this.dataExtends;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDocId() {
        return this.docId;
    }

    /* JADX INFO: renamed from: component30, reason: from getter */
    public final int getSyncStatus() {
        return this.syncStatus;
    }

    /* JADX INFO: renamed from: component31, reason: from getter */
    public final int getUpdated() {
        return this.updated;
    }

    /* JADX INFO: renamed from: component32, reason: from getter */
    public final int getDeleted() {
        return this.deleted;
    }

    /* JADX INFO: renamed from: component33, reason: from getter */
    public final long getModifiedTimestamp() {
        return this.modifiedTimestamp;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getFileIndex() {
        return this.fileIndex;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getBodySystem() {
        return this.bodySystem;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getCategory() {
        return this.category;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getOwner() {
        return this.owner;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getInstitute() {
        return this.institute;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final DBIndicatorStat copy(@NonNull long dataId, @NonNull @NotNull String ssoid, @NonNull @NotNull String docId, int fileIndex, @Nullable String bodySystem, @Nullable String category, @Nullable String owner, @Nullable String institute, @Nullable String name, @Nullable String uniformName, @Nullable String value, @Nullable String uniformValue, @Nullable String unit, @Nullable String uniformUnit, @Nullable String refer, @Nullable String uniformReferMan, @Nullable String uniformReferWoman, @Nullable String remind, @Nullable String uniformRemind, int valueState, @Nullable String type, long dataCreatedTimestamp, @Nullable String description, int sort, @Nullable String uniformValueType, boolean isUniform, int riskRank, @Nullable String explain, @Nullable String dataExtends, int syncStatus, int updated, int deleted, long modifiedTimestamp) {
        Intrinsics.checkNotNullParameter(ssoid, "ssoid");
        Intrinsics.checkNotNullParameter(docId, "docId");
        return new DBIndicatorStat(dataId, ssoid, docId, fileIndex, bodySystem, category, owner, institute, name, uniformName, value, uniformValue, unit, uniformUnit, refer, uniformReferMan, uniformReferWoman, remind, uniformRemind, valueState, type, dataCreatedTimestamp, description, sort, uniformValueType, isUniform, riskRank, explain, dataExtends, syncStatus, updated, deleted, modifiedTimestamp);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DBIndicatorStat)) {
            return false;
        }
        DBIndicatorStat dBIndicatorStat = (DBIndicatorStat) other;
        return this.dataId == dBIndicatorStat.dataId && Intrinsics.areEqual(this.ssoid, dBIndicatorStat.ssoid) && Intrinsics.areEqual(this.docId, dBIndicatorStat.docId) && this.fileIndex == dBIndicatorStat.fileIndex && Intrinsics.areEqual(this.bodySystem, dBIndicatorStat.bodySystem) && Intrinsics.areEqual(this.category, dBIndicatorStat.category) && Intrinsics.areEqual(this.owner, dBIndicatorStat.owner) && Intrinsics.areEqual(this.institute, dBIndicatorStat.institute) && Intrinsics.areEqual(this.name, dBIndicatorStat.name) && Intrinsics.areEqual(this.uniformName, dBIndicatorStat.uniformName) && Intrinsics.areEqual(this.value, dBIndicatorStat.value) && Intrinsics.areEqual(this.uniformValue, dBIndicatorStat.uniformValue) && Intrinsics.areEqual(this.unit, dBIndicatorStat.unit) && Intrinsics.areEqual(this.uniformUnit, dBIndicatorStat.uniformUnit) && Intrinsics.areEqual(this.refer, dBIndicatorStat.refer) && Intrinsics.areEqual(this.uniformReferMan, dBIndicatorStat.uniformReferMan) && Intrinsics.areEqual(this.uniformReferWoman, dBIndicatorStat.uniformReferWoman) && Intrinsics.areEqual(this.remind, dBIndicatorStat.remind) && Intrinsics.areEqual(this.uniformRemind, dBIndicatorStat.uniformRemind) && this.valueState == dBIndicatorStat.valueState && Intrinsics.areEqual(this.type, dBIndicatorStat.type) && this.dataCreatedTimestamp == dBIndicatorStat.dataCreatedTimestamp && Intrinsics.areEqual(this.description, dBIndicatorStat.description) && this.sort == dBIndicatorStat.sort && Intrinsics.areEqual(this.uniformValueType, dBIndicatorStat.uniformValueType) && this.isUniform == dBIndicatorStat.isUniform && this.riskRank == dBIndicatorStat.riskRank && Intrinsics.areEqual(this.explain, dBIndicatorStat.explain) && Intrinsics.areEqual(this.dataExtends, dBIndicatorStat.dataExtends) && this.syncStatus == dBIndicatorStat.syncStatus && this.updated == dBIndicatorStat.updated && this.deleted == dBIndicatorStat.deleted && this.modifiedTimestamp == dBIndicatorStat.modifiedTimestamp;
    }

    @Nullable
    public final String getBodySystem() {
        return this.bodySystem;
    }

    @Nullable
    public final String getCategory() {
        return this.category;
    }

    public final long getDataCreatedTimestamp() {
        return this.dataCreatedTimestamp;
    }

    @Nullable
    public final String getDataExtends() {
        return this.dataExtends;
    }

    public final long getDataId() {
        return this.dataId;
    }

    public final int getDeleted() {
        return this.deleted;
    }

    @Nullable
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    public final String getDocId() {
        return this.docId;
    }

    @Nullable
    public final String getExplain() {
        return this.explain;
    }

    public final int getFileIndex() {
        return this.fileIndex;
    }

    @Nullable
    public final String getInstitute() {
        return this.institute;
    }

    public final long getModifiedTimestamp() {
        return this.modifiedTimestamp;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final String getOwner() {
        return this.owner;
    }

    @Nullable
    public final String getRefer() {
        return this.refer;
    }

    @Nullable
    public final String getRemind() {
        return this.remind;
    }

    public final int getRiskRank() {
        return this.riskRank;
    }

    public final int getSort() {
        return this.sort;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    @NotNull
    public String getSsoid() {
        return this.ssoid;
    }

    public final int getSyncStatus() {
        return this.syncStatus;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    @Nullable
    public final String getUniformName() {
        return this.uniformName;
    }

    @Nullable
    public final String getUniformReferMan() {
        return this.uniformReferMan;
    }

    @Nullable
    public final String getUniformReferWoman() {
        return this.uniformReferWoman;
    }

    @Nullable
    public final String getUniformRemind() {
        return this.uniformRemind;
    }

    @Nullable
    public final String getUniformUnit() {
        return this.uniformUnit;
    }

    @Nullable
    public final String getUniformValue() {
        return this.uniformValue;
    }

    @Nullable
    public final String getUniformValueType() {
        return this.uniformValueType;
    }

    @Nullable
    public final String getUnit() {
        return this.unit;
    }

    public final int getUpdated() {
        return this.updated;
    }

    @Nullable
    public final String getValue() {
        return this.value;
    }

    public final int getValueState() {
        return this.valueState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v51, types: [int] */
    /* JADX WARN: Type inference failed for: r1v100 */
    /* JADX WARN: Type inference failed for: r1v66, types: [int] */
    /* JADX WARN: Type inference failed for: r1v81 */
    public int hashCode() {
        int iHashCode = ((((((Long.hashCode(this.dataId) * 31) + this.ssoid.hashCode()) * 31) + this.docId.hashCode()) * 31) + Integer.hashCode(this.fileIndex)) * 31;
        String str = this.bodySystem;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.category;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.owner;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.institute;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.name;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.uniformName;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.value;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.uniformValue;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.unit;
        int iHashCode10 = (iHashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.uniformUnit;
        int iHashCode11 = (iHashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.refer;
        int iHashCode12 = (iHashCode11 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.uniformReferMan;
        int iHashCode13 = (iHashCode12 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.uniformReferWoman;
        int iHashCode14 = (iHashCode13 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.remind;
        int iHashCode15 = (iHashCode14 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.uniformRemind;
        int iHashCode16 = (((iHashCode15 + (str15 == null ? 0 : str15.hashCode())) * 31) + Integer.hashCode(this.valueState)) * 31;
        String str16 = this.type;
        int iHashCode17 = (((iHashCode16 + (str16 == null ? 0 : str16.hashCode())) * 31) + Long.hashCode(this.dataCreatedTimestamp)) * 31;
        String str17 = this.description;
        int iHashCode18 = (((iHashCode17 + (str17 == null ? 0 : str17.hashCode())) * 31) + Integer.hashCode(this.sort)) * 31;
        String str18 = this.uniformValueType;
        int iHashCode19 = (iHashCode18 + (str18 == null ? 0 : str18.hashCode())) * 31;
        boolean z = this.isUniform;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int iHashCode20 = (((iHashCode19 + r1) * 31) + Integer.hashCode(this.riskRank)) * 31;
        String str19 = this.explain;
        int iHashCode21 = (iHashCode20 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.dataExtends;
        return ((((((((iHashCode21 + (str20 != null ? str20.hashCode() : 0)) * 31) + Integer.hashCode(this.syncStatus)) * 31) + Integer.hashCode(this.updated)) * 31) + Integer.hashCode(this.deleted)) * 31) + Long.hashCode(this.modifiedTimestamp);
    }

    public final boolean isUniform() {
        return this.isUniform;
    }

    public final void setBodySystem(@Nullable String str) {
        this.bodySystem = str;
    }

    public final void setCategory(@Nullable String str) {
        this.category = str;
    }

    public final void setDataCreatedTimestamp(long j2) {
        this.dataCreatedTimestamp = j2;
    }

    public final void setDataExtends(@Nullable String str) {
        this.dataExtends = str;
    }

    public final void setDataId(long j2) {
        this.dataId = j2;
    }

    public final void setDeleted(int i) {
        this.deleted = i;
    }

    public final void setDescription(@Nullable String str) {
        this.description = str;
    }

    public final void setDocId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.docId = str;
    }

    public final void setExplain(@Nullable String str) {
        this.explain = str;
    }

    public final void setFileIndex(int i) {
        this.fileIndex = i;
    }

    public final void setInstitute(@Nullable String str) {
        this.institute = str;
    }

    public final void setModifiedTimestamp(long j2) {
        this.modifiedTimestamp = j2;
    }

    public final void setName(@Nullable String str) {
        this.name = str;
    }

    public final void setOwner(@Nullable String str) {
        this.owner = str;
    }

    public final void setRefer(@Nullable String str) {
        this.refer = str;
    }

    public final void setRemind(@Nullable String str) {
        this.remind = str;
    }

    public final void setRiskRank(int i) {
        this.riskRank = i;
    }

    public final void setSort(int i) {
        this.sort = i;
    }

    public final void setSyncStatus(int i) {
        this.syncStatus = i;
    }

    public final void setType(@Nullable String str) {
        this.type = str;
    }

    public final void setUniform(boolean z) {
        this.isUniform = z;
    }

    public final void setUniformName(@Nullable String str) {
        this.uniformName = str;
    }

    public final void setUniformReferMan(@Nullable String str) {
        this.uniformReferMan = str;
    }

    public final void setUniformReferWoman(@Nullable String str) {
        this.uniformReferWoman = str;
    }

    public final void setUniformRemind(@Nullable String str) {
        this.uniformRemind = str;
    }

    public final void setUniformUnit(@Nullable String str) {
        this.uniformUnit = str;
    }

    public final void setUniformValue(@Nullable String str) {
        this.uniformValue = str;
    }

    public final void setUniformValueType(@Nullable String str) {
        this.uniformValueType = str;
    }

    public final void setUnit(@Nullable String str) {
        this.unit = str;
    }

    public final void setUpdated(int i) {
        this.updated = i;
    }

    public final void setValue(@Nullable String str) {
        this.value = str;
    }

    public final void setValueState(int i) {
        this.valueState = i;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    @NotNull
    public String toString() {
        return "DBIndicatorStat(ssoid='" + this.ssoid + "', fileIndex='" + this.fileIndex + "', dataId='" + this.dataId + "', docId='" + this.docId + "', bodySystem='" + this.bodySystem + "', category='" + this.category + "', institute='" + this.institute + "', owner='" + this.owner + "', name='" + this.name + "', value='" + this.value + "', unit='" + this.unit + "', refer='" + this.refer + "', uniformName='" + this.uniformName + "', uniformValue='" + this.uniformValue + "', uniformUnit='" + this.uniformUnit + "', uniformReferMan='" + this.uniformReferMan + "', uniformReferWoman='" + this.uniformReferWoman + "', uniformRemind='" + this.uniformRemind + "', remind='" + this.remind + "', description='" + this.description + "',uniformValueType='" + this.uniformValueType + "' valueState='" + this.valueState + "', type='" + this.type + "', dataCreatedTimestamp='" + this.dataCreatedTimestamp + "', sort='" + this.sort + "', isUniform='" + this.isUniform + "' , riskRank='" + this.riskRank + "' explain='" + this.explain + "'  dataExtends=‘" + this.dataExtends + "’, syncStatus='" + this.syncStatus + "', updated='" + this.updated + "' , deleted='" + this.deleted + "' modifiedTimestamp='" + this.modifiedTimestamp + "')";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeLong(this.dataId);
        parcel.writeString(this.ssoid);
        parcel.writeString(this.docId);
        parcel.writeInt(this.fileIndex);
        parcel.writeString(this.bodySystem);
        parcel.writeString(this.category);
        parcel.writeString(this.owner);
        parcel.writeString(this.institute);
        parcel.writeString(this.name);
        parcel.writeString(this.uniformName);
        parcel.writeString(this.value);
        parcel.writeString(this.uniformValue);
        parcel.writeString(this.unit);
        parcel.writeString(this.uniformUnit);
        parcel.writeString(this.refer);
        parcel.writeString(this.uniformReferMan);
        parcel.writeString(this.uniformReferWoman);
        parcel.writeString(this.remind);
        parcel.writeString(this.uniformRemind);
        parcel.writeInt(this.valueState);
        parcel.writeString(this.type);
        parcel.writeLong(this.dataCreatedTimestamp);
        parcel.writeString(this.description);
        parcel.writeInt(this.sort);
        parcel.writeString(this.uniformValueType);
        parcel.writeInt(this.isUniform ? 1 : 0);
        parcel.writeInt(this.riskRank);
        parcel.writeString(this.explain);
        parcel.writeString(this.dataExtends);
        parcel.writeInt(this.syncStatus);
        parcel.writeInt(this.updated);
        parcel.writeInt(this.deleted);
        parcel.writeLong(this.modifiedTimestamp);
    }

    public /* synthetic */ DBIndicatorStat(long j2, String str, String str2, int i, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, int i2, String str18, long j3, String str19, int i3, String str20, boolean z, int i4, String str21, String str22, int i5, int i6, int i7, long j4, int i8, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        this((i8 & 1) != 0 ? 0L : j2, (i8 & 2) != 0 ? "" : str, (i8 & 4) == 0 ? str2 : "", (i8 & 8) != 0 ? 0 : i, (i8 & 16) != 0 ? null : str3, (i8 & 32) != 0 ? null : str4, (i8 & 64) != 0 ? null : str5, (i8 & 128) != 0 ? null : str6, (i8 & 256) != 0 ? null : str7, (i8 & 512) != 0 ? null : str8, (i8 & 1024) != 0 ? null : str9, (i8 & 2048) != 0 ? null : str10, (i8 & 4096) != 0 ? null : str11, (i8 & 8192) != 0 ? null : str12, (i8 & 16384) != 0 ? null : str13, (i8 & 32768) != 0 ? null : str14, (i8 & 65536) != 0 ? null : str15, (i8 & 131072) != 0 ? null : str16, (i8 & 262144) != 0 ? null : str17, (i8 & 524288) != 0 ? 0 : i2, (i8 & 1048576) != 0 ? null : str18, (i8 & 2097152) != 0 ? 0L : j3, (i8 & 4194304) != 0 ? null : str19, (i8 & 8388608) != 0 ? 0 : i3, (i8 & 16777216) != 0 ? null : str20, (i8 & 33554432) != 0 ? false : z, (i8 & 67108864) != 0 ? 0 : i4, (i8 & 134217728) != 0 ? null : str21, (i8 & 268435456) != 0 ? null : str22, (i8 & 536870912) != 0 ? 0 : i5, (i8 & 1073741824) != 0 ? 0 : i6, (i8 & Integer.MIN_VALUE) != 0 ? 0 : i7, (i9 & 1) != 0 ? 0L : j4);
    }

    public DBIndicatorStat(@NonNull long j2, @NonNull @NotNull String ssoid, @NonNull @NotNull String docId, int i, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable String str14, @Nullable String str15, int i2, @Nullable String str16, long j3, @Nullable String str17, int i3, @Nullable String str18, boolean z, int i4, @Nullable String str19, @Nullable String str20, int i5, int i6, int i7, long j4) {
        Intrinsics.checkNotNullParameter(ssoid, "ssoid");
        Intrinsics.checkNotNullParameter(docId, "docId");
        this.dataId = j2;
        this.ssoid = ssoid;
        this.docId = docId;
        this.fileIndex = i;
        this.bodySystem = str;
        this.category = str2;
        this.owner = str3;
        this.institute = str4;
        this.name = str5;
        this.uniformName = str6;
        this.value = str7;
        this.uniformValue = str8;
        this.unit = str9;
        this.uniformUnit = str10;
        this.refer = str11;
        this.uniformReferMan = str12;
        this.uniformReferWoman = str13;
        this.remind = str14;
        this.uniformRemind = str15;
        this.valueState = i2;
        this.type = str16;
        this.dataCreatedTimestamp = j3;
        this.description = str17;
        this.sort = i3;
        this.uniformValueType = str18;
        this.isUniform = z;
        this.riskRank = i4;
        this.explain = str19;
        this.dataExtends = str20;
        this.syncStatus = i5;
        this.updated = i6;
        this.deleted = i7;
        this.modifiedTimestamp = j4;
    }
}
