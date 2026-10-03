package kotlinx.parcelize;

import androidx.exifinterface.media.ExifInterface;
import com.google.security.cryptauth.lib.securegcm.SecureGcmConstants;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlinx.parcelize.Parceler;
import p010kotlin.Metadata;
import p010kotlin.annotation.AnnotationRetention;
import p010kotlin.annotation.AnnotationTarget;
import p010kotlin.annotation.Repeatable;
import p010kotlin.jvm.internal.RepeatableContainer;

/* JADX INFO: loaded from: classes11.dex */
@Target({ElementType.TYPE})
@p010kotlin.annotation.Target(allowedTargets = {AnnotationTarget.CLASS, AnnotationTarget.PROPERTY})
@Retention(RetentionPolicy.SOURCE)
@p010kotlin.annotation.Retention(AnnotationRetention.SOURCE)
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0010\b\u0001\u0010\u0002*\n\u0012\u0006\b\u0000\u0012\u0002H\u00010\u00032\u00020\u0004B\u0000¨\u0006\u0005"}, d2 = {"Lkotlinx/parcelize/TypeParceler;", ExifInterface.GPS_DIRECTION_TRUE, SecureGcmConstants.MESSAGE_KEY, "Lkotlinx/parcelize/Parceler;", "", "parcelize-runtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Repeatable
@java.lang.annotation.Repeatable(Container.class)
public @interface TypeParceler<T, P extends Parceler<? super T>> {

    @Target({ElementType.TYPE})
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @p010kotlin.annotation.Target(allowedTargets = {AnnotationTarget.CLASS, AnnotationTarget.PROPERTY})
    @Retention(RetentionPolicy.SOURCE)
    @p010kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    @RepeatableContainer
    public @interface Container {
        TypeParceler[] value();
    }
}
