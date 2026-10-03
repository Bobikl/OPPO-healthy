package com.heytap.health.devicemanager.storage;

import androidx.exifinterface.media.ExifInterface;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.v9g;
import io.protostuff.MapSchema;
import java.util.HashMap;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.functions.Function2;
import p010kotlin.jvm.internal.FunctionReferenceImpl;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002Bu\u0012\u0006\u0010\u0015\u001a\u00020\u0003\u0012:\u0010\u001c\u001a6\u0012\u0015\u0012\u0013\u0018\u00018\u0000¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0015\u0012\u0013\u0018\u00018\u0000¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\u00060\u0016\u0012\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\f0\u001d\u0012\u0014\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u001d¢\u0006\u0004\b%\u0010&B;\b\u0016\u0012\u0006\u0010\u0015\u001a\u00020\u0003\u0012\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\f0\u001d\u0012\u0014\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u001d¢\u0006\u0004\b%\u0010'J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0018\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\fH\u0002J\u0019\u0010\u000f\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u000f\u0010\nJ\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0003H\u0002J\u0010\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0002R\u0014\u0010\u0015\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0014RH\u0010\u001c\u001a6\u0012\u0015\u0012\u0013\u0018\u00018\u0000¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0015\u0012\u0013\u0018\u00018\u0000¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\u00060\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001bR \u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\f0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001eR\"\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001eR4\u0010$\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00018\u00000!j\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00018\u0000`\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010#¨\u0006("}, d2 = {"Lcom/heytap/health/devicemanager/storage/Storage;", ExifInterface.GPS_DIRECTION_TRUE, "", "", "objKey", "obj", "", "f", "(Ljava/lang/String;Ljava/lang/Object;)Z", "a", "(Ljava/lang/String;)Ljava/lang/Object;", "d", "", "bytes", b2n.f, "b", "key", "", MapSchema.FIELD_NAME_ENTRY, "c", "Ljava/lang/String;", "spPrefixKey", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "last", "current", "Lkotlin/jvm/functions/Function2;", "equals", "Lkotlin/Function1;", "Lkotlin/jvm/functions/Function1;", "toArray", "toObj", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "Ljava/util/HashMap;", "mCacheMap", "<init>", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "device_manager_release"}, k = 1, mv = {1, 8, 0})
public final class Storage<T> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String spPrefixKey;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Function2<T, T, Boolean> equals;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Function1<T, byte[]> toArray;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final Function1<byte[], T> toObj;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final HashMap<String, T> mCacheMap;

    /* JADX INFO: renamed from: com.heytap.health.devicemanager.storage.Storage$1, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function2<Object, Object, Boolean> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(2, Objects.class, "equals", "equals(Ljava/lang/Object;Ljava/lang/Object;)Z", 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p010kotlin.jvm.functions.Function2
        @NotNull
        public final Boolean invoke(Object obj, Object obj2) {
            return Boolean.valueOf(Objects.equals(obj, obj2));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Storage(@NotNull String spPrefixKey, @NotNull Function2<? super T, ? super T, Boolean> equals, @NotNull Function1<? super T, byte[]> toArray, @NotNull Function1<? super byte[], ? extends T> toObj) {
        Intrinsics.checkNotNullParameter(spPrefixKey, "spPrefixKey");
        Intrinsics.checkNotNullParameter(equals, "equals");
        Intrinsics.checkNotNullParameter(toArray, "toArray");
        Intrinsics.checkNotNullParameter(toObj, "toObj");
        this.spPrefixKey = spPrefixKey;
        this.equals = equals;
        this.toArray = toArray;
        this.toObj = toObj;
        this.mCacheMap = new HashMap<>();
    }

    @Nullable
    public final T a(@NotNull String objKey) {
        T tB;
        Intrinsics.checkNotNullParameter(objKey, "objKey");
        synchronized (this) {
            tB = this.mCacheMap.get(objKey);
            if (tB == null) {
                tB = b(objKey);
                this.mCacheMap.put(objKey, tB);
            }
        }
        return tB;
    }

    public final T b(String objKey) {
        byte[] bArrS = v9g.w().s(c(objKey), null);
        if (bArrS == null) {
            return null;
        }
        try {
            return this.toObj.invoke(bArrS);
        } catch (Exception unused) {
            return null;
        }
    }

    public final String c(String objKey) {
        return this.spPrefixKey + "_" + objKey;
    }

    @Nullable
    public final T d(@NotNull String objKey) {
        T tRemove;
        Intrinsics.checkNotNullParameter(objKey, "objKey");
        synchronized (this) {
            tRemove = this.mCacheMap.remove(objKey);
            e(c(objKey));
        }
        return tRemove;
    }

    public final void e(String key) {
        v9g.w().a0(key);
    }

    public final boolean f(@NotNull String objKey, @Nullable T obj) {
        boolean zG;
        Intrinsics.checkNotNullParameter(objKey, "objKey");
        synchronized (this) {
            boolean zBooleanValue = this.equals.invoke(this.mCacheMap.get(objKey), obj).booleanValue();
            this.mCacheMap.put(objKey, obj);
            zG = (zBooleanValue || obj == null) ? false : g(objKey, this.toArray.invoke(obj));
        }
        return zG;
    }

    public final boolean g(String objKey, byte[] bytes) {
        v9g.w().X(c(objKey), bytes);
        return true;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Storage(@NotNull String spPrefixKey, @NotNull Function1<? super T, byte[]> toArray, @NotNull Function1<? super byte[], ? extends T> toObj) {
        this(spPrefixKey, AnonymousClass1.INSTANCE, toArray, toObj);
        Intrinsics.checkNotNullParameter(spPrefixKey, "spPrefixKey");
        Intrinsics.checkNotNullParameter(toArray, "toArray");
        Intrinsics.checkNotNullParameter(toObj, "toObj");
    }
}
