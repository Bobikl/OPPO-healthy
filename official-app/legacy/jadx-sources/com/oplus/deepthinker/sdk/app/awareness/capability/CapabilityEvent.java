package com.oplus.deepthinker.sdk.app.awareness.capability;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.exifinterface.media.ExifInterface;
import com.oplus.utrace.db.UTraceSQLiteHelperKt;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\b\u0016\u0018\u0000 \u0019*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u00032\u00020\u0001:\u0001\u001aB'\b\u0016\u0012\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u000f\u0012\u0006\u0010\u0012\u001a\u00028\u0000\u0012\b\b\u0002\u0010\u0014\u001a\u00020\n¢\u0006\u0004\b\u0016\u0010\u0017B\u0011\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\u0018J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u000f\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\f\u001a\u00020\nH\u0016J\u0018\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\nH\u0016R\u001a\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u000f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0012\u001a\u00028\u00008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0014\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u001b"}, d2 = {"Lcom/oplus/deepthinker/sdk/app/awareness/capability/CapabilityEvent;", "Landroid/os/Parcelable;", ExifInterface.GPS_DIRECTION_TRUE, "", "Landroid/os/Parcel;", "parcel", "", "readFromParcel", "getCapabilityEvent", "()Landroid/os/Parcelable;", "", "getCapabilityEventId", "describeContents", UTraceSQLiteHelperKt.COL_FLAGS, "writeToParcel", "Ljava/lang/Class;", "classType", "Ljava/lang/Class;", "event", "Landroid/os/Parcelable;", "eventId", "I", "<init>", "(Ljava/lang/Class;Landroid/os/Parcelable;I)V", "(Landroid/os/Parcel;)V", "CREATOR", "a", "com.oplus.deepthinker.sdk_release"}, k = 1, mv = {1, 6, 0})
public class CapabilityEvent<T extends Parcelable> implements Parcelable {

    @NotNull
    public static final String BUNDLE_KEY_CAPABILITY_EVENT = "capability_event";

    /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private Class<?> classType;
    private T event;
    private int eventId;

    /* JADX INFO: renamed from: com.oplus.deepthinker.sdk.app.awareness.capability.CapabilityEvent$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0014\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J#\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/oplus/deepthinker/sdk/app/awareness/capability/CapabilityEvent$a;", "Landroid/os/Parcelable$Creator;", "Lcom/oplus/deepthinker/sdk/app/awareness/capability/CapabilityEvent;", "Landroid/os/Parcel;", "parcel", "a", "", "size", "", "b", "(I)[Lcom/oplus/deepthinker/sdk/app/awareness/capability/CapabilityEvent;", "", "BUNDLE_KEY_CAPABILITY_EVENT", "Ljava/lang/String;", "<init>", "()V", "com.oplus.deepthinker.sdk_release"}, k = 1, mv = {1, 6, 0})
    public static final class Companion implements Parcelable.Creator<CapabilityEvent<?>> {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public CapabilityEvent<?> createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CapabilityEvent<>(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public CapabilityEvent<?>[] newArray(int size) {
            return new CapabilityEvent[size];
        }
    }

    public CapabilityEvent(@NotNull Class<?> classType, @NotNull T event, int i) {
        Intrinsics.checkNotNullParameter(classType, "classType");
        Intrinsics.checkNotNullParameter(event, "event");
        this.classType = classType;
        this.event = event;
        this.eventId = i;
    }

    private final void readFromParcel(Parcel parcel) {
        Object value = parcel.readValue(getClass().getClassLoader());
        if (value == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.Class<*>");
        }
        Class<?> cls = (Class) value;
        this.classType = cls;
        Object value2 = parcel.readValue(cls.getClassLoader());
        if (value2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type T of com.oplus.deepthinker.sdk.app.awareness.capability.CapabilityEvent");
        }
        this.event = (T) value2;
        this.eventId = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: getCapabilityEventId, reason: from getter */
    public int getEventId() {
        return this.eventId;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        Class<?> cls = this.classType;
        T t = null;
        if (cls == null) {
            Intrinsics.throwUninitializedPropertyAccessException("classType");
            cls = null;
        }
        parcel.writeValue(cls);
        T t2 = this.event;
        if (t2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("event");
        } else {
            t = t2;
        }
        parcel.writeValue(t);
        parcel.writeInt(this.eventId);
    }

    @NotNull
    /* JADX INFO: renamed from: getCapabilityEvent, reason: merged with bridge method [inline-methods] */
    public T m5179getCapabilityEvent() {
        T t = this.event;
        if (t != null) {
            return t;
        }
        Intrinsics.throwUninitializedPropertyAccessException("event");
        return null;
    }

    public /* synthetic */ CapabilityEvent(Class cls, Parcelable parcelable, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(cls, parcelable, (i2 & 4) != 0 ? -1 : i);
    }

    public CapabilityEvent(@NotNull Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        this.eventId = -1;
        readFromParcel(parcel);
    }
}
