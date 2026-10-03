package kotlinx.parcelize;

import com.google.security.cryptauth.lib.securegcm.SecureGcmConstants;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlinx.parcelize.Parceler;
import p010kotlin.Metadata;
import p010kotlin.annotation.AnnotationRetention;
import p010kotlin.annotation.AnnotationTarget;

/* JADX INFO: loaded from: classes11.dex */
@Target({ElementType.TYPE_USE})
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u0000*\f\b\u0000\u0010\u0001*\u0006\u0012\u0002\b\u00030\u00022\u00020\u0003B\u0000¨\u0006\u0004"}, d2 = {"Lkotlinx/parcelize/WriteWith;", SecureGcmConstants.MESSAGE_KEY, "Lkotlinx/parcelize/Parceler;", "", "parcelize-runtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
@p010kotlin.annotation.Target(allowedTargets = {AnnotationTarget.TYPE})
@Retention(RetentionPolicy.SOURCE)
@p010kotlin.annotation.Retention(AnnotationRetention.SOURCE)
public @interface WriteWith<P extends Parceler<?>> {
}
