package com.heytap.nearx.tangramconfig.proxy;

import androidx.exifinterface.media.ExifInterface;
import com.google.security.cryptauth.lib.securegcm.SecureGcmConstants;
import com.heytap.log.formatter.LogFieldKey;
import com.heytap.nearx.tangramconfig.BuildConfig;
import com.heytap.nearx.tangramconfig.bean.EntityQueryParams;
import com.heytap.nearx.tangramconfig.observable.Observable;
import com.heytap.nearx.tangramconfig.util.UtilsKt;
import java.io.IOException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0004\n\u000b\f\rB\u0005¢\u0006\u0002\u0010\u0003J\u001f\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00018\u0000H&¢\u0006\u0002\u0010\t¨\u0006\u000e"}, d2 = {"Lcom/heytap/nearx/tangramconfig/proxy/ParameterHandler;", SecureGcmConstants.MESSAGE_KEY, "", "()V", "apply", "", "params", "Lcom/heytap/nearx/tangramconfig/bean/EntityQueryParams;", "value", "(Lcom/heytap/nearx/tangramconfig/bean/EntityQueryParams;Ljava/lang/Object;)V", "DefaultValue", "QueryLike", "QueryMap", "QueryName", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 7, 1}, xi = 48)
public abstract class ParameterHandler<P> {

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u001a\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/heytap/nearx/tangramconfig/proxy/ParameterHandler$DefaultValue;", "Lcom/heytap/nearx/tangramconfig/proxy/ParameterHandler;", "", "method", "Ljava/lang/reflect/Method;", LogFieldKey.PROCESS_NAME_KEY, "", "(Ljava/lang/reflect/Method;I)V", "apply", "", "params", "Lcom/heytap/nearx/tangramconfig/bean/EntityQueryParams;", "value", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class DefaultValue extends ParameterHandler<Object> {

        @NotNull
        private final Method method;
        private final int p;

        public DefaultValue(@NotNull Method method, int i) {
            Intrinsics.checkNotNullParameter(method, "method");
            this.method = method;
            this.p = i;
        }

        @Override // com.heytap.nearx.tangramconfig.proxy.ParameterHandler
        public void apply(@NotNull EntityQueryParams params, @Nullable Object value) {
            Intrinsics.checkNotNullParameter(params, "params");
            if (value == null) {
                throw UtilsKt.parameterError(this.method, this.p, "@Default parameter is null.", new Object[0]);
            }
            if (!Observable.class.isAssignableFrom(value.getClass())) {
                Type typeResultType = params.resultType();
                Intrinsics.checkNotNull(typeResultType, "null cannot be cast to non-null type java.lang.Class<*>");
                if (((Class) typeResultType).isAssignableFrom(value.getClass())) {
                    params.setDefaultValue(value);
                    return;
                }
            }
            throw UtilsKt.parameterError(this.method, this.p, "@Default parameter must be " + this.method.getReturnType() + " or Observable.", new Object[0]);
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0001\u0010\u00012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u0002H\u00010\u00030\u0002B\u0015\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ&\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0003H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/heytap/nearx/tangramconfig/proxy/ParameterHandler$QueryLike;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/heytap/nearx/tangramconfig/proxy/ParameterHandler;", "", "", "method", "Ljava/lang/reflect/Method;", LogFieldKey.PROCESS_NAME_KEY, "", "(Ljava/lang/reflect/Method;I)V", "apply", "", "params", "Lcom/heytap/nearx/tangramconfig/bean/EntityQueryParams;", "value", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class QueryLike<T> extends ParameterHandler<Map<String, ? extends T>> {

        @NotNull
        private final Method method;
        private final int p;

        public QueryLike(@NotNull Method method, int i) {
            Intrinsics.checkNotNullParameter(method, "method");
            this.method = method;
            this.p = i;
        }

        @Override // com.heytap.nearx.tangramconfig.proxy.ParameterHandler
        public void apply(@NotNull EntityQueryParams params, @Nullable Map<String, ? extends T> value) {
            Intrinsics.checkNotNullParameter(params, "params");
            if (value == null) {
                throw UtilsKt.parameterError(this.method, this.p, "QueryLike map was null", new Object[0]);
            }
            for (Map.Entry<String, ? extends T> entry : value.entrySet()) {
                String key = entry.getKey();
                T value2 = entry.getValue();
                if (key == null) {
                    throw UtilsKt.parameterError(this.method, this.p, "Query map contained null key.", new Object[0]);
                }
                if (value2 == null) {
                    throw UtilsKt.parameterError(this.method, this.p, "QueryLike map contained null value for key '" + key + "'.", new Object[0]);
                }
                Map<String, String> queryMap = params.getQueryMap();
                if (!(queryMap == null || queryMap.isEmpty())) {
                    throw UtilsKt.parameterError(this.method, this.p, "Method @QueryMap and @QueryLike Annotations cannot be used simultaneously.", new Object[0]);
                }
                params.appendLikeParam(key, value2.toString());
            }
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0001\u0010\u00012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u0002H\u00010\u00030\u0002B\u0015\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ&\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0003H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/heytap/nearx/tangramconfig/proxy/ParameterHandler$QueryMap;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/heytap/nearx/tangramconfig/proxy/ParameterHandler;", "", "", "method", "Ljava/lang/reflect/Method;", LogFieldKey.PROCESS_NAME_KEY, "", "(Ljava/lang/reflect/Method;I)V", "apply", "", "params", "Lcom/heytap/nearx/tangramconfig/bean/EntityQueryParams;", "value", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class QueryMap<T> extends ParameterHandler<Map<String, ? extends T>> {

        @NotNull
        private final Method method;
        private final int p;

        public QueryMap(@NotNull Method method, int i) {
            Intrinsics.checkNotNullParameter(method, "method");
            this.method = method;
            this.p = i;
        }

        @Override // com.heytap.nearx.tangramconfig.proxy.ParameterHandler
        public void apply(@NotNull EntityQueryParams params, @Nullable Map<String, ? extends T> value) {
            Intrinsics.checkNotNullParameter(params, "params");
            if (value == null) {
                throw UtilsKt.parameterError(this.method, this.p, "Query map was null", new Object[0]);
            }
            for (Map.Entry<String, ? extends T> entry : value.entrySet()) {
                String key = entry.getKey();
                T value2 = entry.getValue();
                if (key == null) {
                    throw UtilsKt.parameterError(this.method, this.p, "Query map contained null key.", new Object[0]);
                }
                if (value2 == null) {
                    throw UtilsKt.parameterError(this.method, this.p, "Query map contained null value for key '" + key + "'.", new Object[0]);
                }
                Map<String, String> queryLike = params.getQueryLike();
                if (!(queryLike == null || queryLike.isEmpty())) {
                    throw UtilsKt.parameterError(this.method, this.p, "Method @QueryMap and @QueryLike Annotations cannot be used simultaneously.", new Object[0]);
                }
                params.appendParam(key, value2.toString());
            }
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u001f\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00018\u0001H\u0016¢\u0006\u0002\u0010\u000fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/heytap/nearx/tangramconfig/proxy/ParameterHandler$QueryName;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/heytap/nearx/tangramconfig/proxy/ParameterHandler;", "method", "Ljava/lang/reflect/Method;", LogFieldKey.PROCESS_NAME_KEY, "", "methodName", "", "(Ljava/lang/reflect/Method;ILjava/lang/String;)V", "apply", "", "params", "Lcom/heytap/nearx/tangramconfig/bean/EntityQueryParams;", "value", "(Lcom/heytap/nearx/tangramconfig/bean/EntityQueryParams;Ljava/lang/Object;)V", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class QueryName<T> extends ParameterHandler<T> {

        @NotNull
        private final Method method;

        @NotNull
        private final String methodName;
        private final int p;

        public QueryName(@NotNull Method method, int i, @NotNull String methodName) {
            Intrinsics.checkNotNullParameter(method, "method");
            Intrinsics.checkNotNullParameter(methodName, "methodName");
            this.method = method;
            this.p = i;
            this.methodName = methodName;
        }

        @Override // com.heytap.nearx.tangramconfig.proxy.ParameterHandler
        public void apply(@NotNull EntityQueryParams params, @Nullable T value) {
            Intrinsics.checkNotNullParameter(params, "params");
            if (value == null) {
                throw UtilsKt.parameterError(this.method, this.p, "Query was null", new Object[0]);
            }
            params.appendParam(this.methodName, value.toString());
        }
    }

    public abstract void apply(@NotNull EntityQueryParams params, @Nullable P value) throws IOException;
}
