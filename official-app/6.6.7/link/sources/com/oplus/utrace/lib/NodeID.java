package com.oplus.utrace.lib;

import android.os.Parcel;
import android.os.Parcelable;
import com.oplus.utrace.db.UTraceSQLiteHelperKt;
import com.oplus.utrace.utils.Logs;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 !2\u00020\u0001:\u0001!B%\b\u0016\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007B\u0011\b\u0016\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nB\u000f\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\u0003¢\u0006\u0002\u0010\fB\u0005¢\u0006\u0002\u0010\rJ\b\u0010\u0014\u001a\u00020\u0005H\u0016J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0096\u0002J\u0010\u0010\u0019\u001a\u00020\u00032\b\b\u0002\u0010\u001a\u001a\u00020\u0016J\b\u0010\u001b\u001a\u00020\u0005H\u0016J\u0006\u0010\u001c\u001a\u00020\u0003J\b\u0010\u001d\u001a\u00020\u0003H\u0016J\u0018\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010 \u001a\u00020\u0005H\u0016R\u001b\u0010\u000e\u001a\u00020\u00038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/oplus/utrace/lib/NodeID;", "Landroid/os/Parcelable;", UTraceSQLiteHelperKt.COL_SPAN_ID, "", "sequence", "", UTraceSQLiteHelperKt.COL_SPAN_NAME, "(Ljava/lang/String;ILjava/lang/String;)V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "jsonString", "(Ljava/lang/String;)V", "()V", "composedSpanId", "getComposedSpanId", "()Ljava/lang/String;", "composedSpanId$delegate", "Lkotlin/Lazy;", "spanID", "describeContents", "equals", "", "other", "", "getSpanID", "compose", "hashCode", "toJsonString", "toString", "writeToParcel", "", UTraceSQLiteHelperKt.COL_FLAGS, "CREATOR", "utrace-lib_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class NodeID implements Parcelable {

    /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final Lazy composedSpanId$delegate;
    private int sequence;

    @NotNull
    private String spanID;

    @NotNull
    private String spanName;

    /* JADX INFO: renamed from: com.oplus.utrace.lib.NodeID$CREATOR, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000bJ\u000e\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000e¨\u0006\u000f"}, d2 = {"Lcom/oplus/utrace/lib/NodeID$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/oplus/utrace/lib/NodeID;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/oplus/utrace/lib/NodeID;", "parseComposedSpanId", UTraceSQLiteHelperKt.COL_SPAN_ID, "", "utrace-lib_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nNodeID.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NodeID.kt\ncom/oplus/utrace/lib/NodeID$CREATOR\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,176:1\n1#2:177\n*E\n"})
    public static final class Companion implements Parcelable.Creator<NodeID> {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final NodeID parseComposedSpanId(@NotNull String spanId) {
            Intrinsics.checkNotNullParameter(spanId, UTraceSQLiteHelperKt.COL_SPAN_ID);
            List listSplit$default = StringsKt.split$default(spanId, new String[]{"@"}, false, 0, 6, (Object) null);
            if (listSplit$default.size() < 2) {
                return new NodeID((String) listSplit$default.get(0), 0, null, 4, null);
            }
            if (listSplit$default.size() >= 3) {
                String str = (String) listSplit$default.get(0);
                String str2 = (String) listSplit$default.get(1);
                Integer intOrNull = StringsKt.toIntOrNull(str2);
                return new NodeID(str, (intOrNull != null ? intOrNull.intValue() : str2.hashCode()) & Integer.MAX_VALUE, (String) listSplit$default.get(2));
            }
            String str3 = (String) listSplit$default.get(0);
            String str4 = (String) listSplit$default.get(1);
            Integer intOrNull2 = StringsKt.toIntOrNull(str4);
            return new NodeID(str3, (intOrNull2 != null ? intOrNull2.intValue() : str4.hashCode()) & Integer.MAX_VALUE, null, 4, null);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public NodeID createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new NodeID(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public NodeID[] newArray(int size) {
            return new NodeID[size];
        }
    }

    public NodeID() {
        this.spanID = "";
        this.sequence = -1;
        this.spanName = NodeIDKt.DEFAULT_SPAN_NAME;
        this.composedSpanId$delegate = LazyKt.lazy(new Function0<String>() { // from class: com.oplus.utrace.lib.NodeID$composedSpanId$2
            {
                super(0);
            }

            @NotNull
            public final String invoke() {
                return this.this$0.spanID + '@' + this.this$0.sequence + '@' + this.this$0.spanName;
            }
        });
    }

    private final String getComposedSpanId() {
        return (String) this.composedSpanId$delegate.getValue();
    }

    public static /* synthetic */ String getSpanID$default(NodeID nodeID, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return nodeID.getSpanID(z);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (other == null) {
            return false;
        }
        if (this == other) {
            return true;
        }
        if (!(other instanceof NodeID)) {
            return false;
        }
        NodeID nodeID = (NodeID) other;
        return Intrinsics.areEqual(nodeID.spanID, this.spanID) && nodeID.sequence == this.sequence;
    }

    @NotNull
    public final String getSpanID(boolean compose) {
        return compose ? getComposedSpanId() : this.spanID;
    }

    public int hashCode() {
        return (this.spanID.hashCode() * 31) + this.sequence;
    }

    @NotNull
    public final String toJsonString() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("spanID", this.spanID);
        jSONObject.put("sequence", this.sequence);
        jSONObject.put(UTraceSQLiteHelperKt.COL_SPAN_NAME, this.spanName);
        String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "JSONObject().apply {\n   …ame)\n        }.toString()");
        return string;
    }

    @NotNull
    public String toString() {
        return getComposedSpanId();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(this.spanID);
        parcel.writeInt(this.sequence);
        parcel.writeString(this.spanName);
    }

    public /* synthetic */ NodeID(String str, int i, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? -1 : i, (i2 & 4) != 0 ? NodeIDKt.DEFAULT_SPAN_NAME : str2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NodeID(@NotNull String str, int i, @NotNull String str2) {
        this();
        Intrinsics.checkNotNullParameter(str, UTraceSQLiteHelperKt.COL_SPAN_ID);
        Intrinsics.checkNotNullParameter(str2, UTraceSQLiteHelperKt.COL_SPAN_NAME);
        this.spanID = str;
        this.sequence = i;
        this.spanName = str2;
    }

    public NodeID(@Nullable Parcel parcel) {
        Object obj;
        this();
        try {
            Result.Companion companion = Result.Companion;
            String string = parcel != null ? parcel.readString() : null;
            if (string == null) {
                string = "";
            } else {
                Intrinsics.checkNotNullExpressionValue(string, "parcel?.readString() ?: DEFAULT_SPAN_ID");
            }
            this.spanID = string;
            this.sequence = parcel != null ? parcel.readInt() : -1;
            String string2 = parcel != null ? parcel.readString() : null;
            if (string2 == null) {
                string2 = NodeIDKt.DEFAULT_SPAN_NAME;
            } else {
                Intrinsics.checkNotNullExpressionValue(string2, "parcel?.readString() ?: DEFAULT_SPAN_NAME");
            }
            this.spanName = string2;
            obj = Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Throwable th2 = Result.exceptionOrNull-impl(obj);
        if (th2 != null) {
            Logs.INSTANCE.w("UTrace.Sdk.NodeID", "parcel parse exception: " + th2.getMessage() + ' ');
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NodeID(@NotNull String str) {
        Object obj;
        this();
        Intrinsics.checkNotNullParameter(str, "jsonString");
        if (StringsKt.isBlank(str)) {
            this.spanID = "";
            this.sequence = -1;
            this.spanName = NodeIDKt.DEFAULT_SPAN_NAME;
            Logs.INSTANCE.e("UTrace.Sdk.NodeID", "create NodeId from json error: jsonString is empty.");
            return;
        }
        try {
            Result.Companion companion = Result.Companion;
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString("spanID", "");
            Intrinsics.checkNotNullExpressionValue(strOptString, "it.optString(KEY_SPAN_ID, \"\")");
            this.spanID = strOptString;
            this.sequence = jSONObject.optInt("sequence", -1);
            String strOptString2 = jSONObject.optString(UTraceSQLiteHelperKt.COL_SPAN_NAME, NodeIDKt.DEFAULT_SPAN_NAME);
            Intrinsics.checkNotNullExpressionValue(strOptString2, "it.optString(KEY_SPAN_NAME, DEFAULT_SPAN_NAME)");
            this.spanName = strOptString2;
            obj = Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Throwable th2 = Result.exceptionOrNull-impl(obj);
        if (th2 != null) {
            this.spanID = "";
            this.sequence = -1;
            this.spanName = NodeIDKt.DEFAULT_SPAN_NAME;
            Logs.INSTANCE.e("UTrace.Sdk.NodeID", "create NodeId from json error: " + th2.getMessage(), th2);
        }
    }
}
