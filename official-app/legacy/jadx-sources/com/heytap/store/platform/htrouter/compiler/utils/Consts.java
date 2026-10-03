package com.heytap.store.platform.htrouter.compiler.utils;

import com.heytap.webview.extension.protocol.Const;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b/\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u00063"}, d2 = {"Lcom/heytap/store/platform/htrouter/compiler/utils/Consts;", "", "()V", "ACTIVITY", "", "BOOLEAN", "BYTE", "CHAR", "DOUBLE", "FACADE_PACKAGE", "FLOAT", "FRAGMENT", "HT_ROUTER", "INTEGER", "I_INTERCEPTOR", "I_INTERCEPTOR_GROUP", "I_PROVIDER", "I_PROVIDER_GROUP", "I_ROUTE_GROUP", "I_ROUTE_ROOT", "I_SYRINGE", "JSON_SERVICE", "KEY_GENERATE_DOC_NAME", "KEY_MODULE_NAME", "LANG", "LAUNCHER_PACKAGE", Const.Arguments.Toast.Duration.LONG, "METHOD_INJECT", "METHOD_LOAD_INTO", "NAME_OF_AUTOWIRED", "NAME_OF_GROUP", "NAME_OF_INTERCEPTOR", "NAME_OF_PROVIDER", "NAME_OF_ROOT", "NO_MODULE_NAME_TIPS", "PACKAGE_OF_GENERATE_DOCS", "PACKAGE_OF_GENERATE_FILE", "PARCELABLE", "PREFIX_OF_LOGGER", "PROJECT", "SEPARATOR", "SERIALIZABLE", "SERVICE", "SERVICE_PACKAGE", Const.Arguments.Toast.Duration.SHORT, "STRING", "TAG", "TEMPLATE_PACKAGE", "TYPE_WRAPPER", "VALUE_ENABLE", "WARNING_TIPS", "htrouter-compiler"}, k = 1, mv = {1, 1, 15})
public final class Consts {

    @NotNull
    public static final String ACTIVITY = "android.app.Activity";

    @NotNull
    public static final String BOOLEAN = "java.lang.Boolean";

    @NotNull
    public static final String BYTE = "java.lang.Byte";

    @NotNull
    public static final String CHAR = "java.lang.Character";

    @NotNull
    public static final String DOUBLE = "java.lang.Double";
    private static final String FACADE_PACKAGE = "com.heytap.store.platform.htrouter.facade";

    @NotNull
    public static final String FLOAT = "java.lang.Float";

    @NotNull
    public static final String FRAGMENT = "android.app.Fragment";

    @NotNull
    public static final String HT_ROUTER = "com.heytap.store.platform.htrouter.launcher.HTRouter";
    public static final Consts INSTANCE = new Consts();

    @NotNull
    public static final String INTEGER = "java.lang.Integer";

    @NotNull
    public static final String I_INTERCEPTOR = "com.heytap.store.platform.htrouter.facade.template.IInterceptor";

    @NotNull
    public static final String I_INTERCEPTOR_GROUP = "com.heytap.store.platform.htrouter.facade.template.IInterceptorGroup";

    @NotNull
    public static final String I_PROVIDER = "com.heytap.store.platform.htrouter.facade.template.IProvider";

    @NotNull
    public static final String I_PROVIDER_GROUP = "com.heytap.store.platform.htrouter.facade.template.IProviderGroup";

    @NotNull
    public static final String I_ROUTE_GROUP = "com.heytap.store.platform.htrouter.facade.template.IRouteGroup";

    @NotNull
    public static final String I_ROUTE_ROOT = "com.heytap.store.platform.htrouter.facade.template.IRouteRoot";

    @NotNull
    public static final String I_SYRINGE = "com.heytap.store.platform.htrouter.facade.template.ISyringe";

    @NotNull
    public static final String JSON_SERVICE = "com.heytap.store.platform.htrouter.facade.service.SerializationService";

    @NotNull
    public static final String KEY_GENERATE_DOC_NAME = "HT_ROUTER_GENERATE_DOC";

    @NotNull
    public static final String KEY_MODULE_NAME = "HT_ROUTER_MODULE_NAME";
    private static final String LANG = "java.lang";

    @NotNull
    public static final String LAUNCHER_PACKAGE = "com.heytap.store.platform.htrouter.launcher";

    @NotNull
    public static final String LONG = "java.lang.Long";

    @NotNull
    public static final String METHOD_INJECT = "inject";

    @NotNull
    public static final String METHOD_LOAD_INTO = "loadInto";

    @NotNull
    public static final String NAME_OF_AUTOWIRED = "$$HTRouter$$AutoWired";

    @NotNull
    public static final String NAME_OF_GROUP = "HTRouter$$Group$$";

    @NotNull
    public static final String NAME_OF_INTERCEPTOR = "HTRouter$$Interceptors";

    @NotNull
    public static final String NAME_OF_PROVIDER = "HTRouter$$Providers$$";

    @NotNull
    public static final String NAME_OF_ROOT = "HTRouter$$Root$$";

    @NotNull
    public static final String NO_MODULE_NAME_TIPS = "There is no module name at 'build.gradle'. like: \nandroid{\n   defaultConfig {\n       ...\n       javaCompileOptions {\n           annotationProcessorOptions {\n               arguments = [HT_ROUTER_MODULE_NAME: project.getName()]\n           }\n       }\n   }\n}\n";

    @NotNull
    public static final String PACKAGE_OF_GENERATE_DOCS = "com.heytap.store.platform.htrouter.docs";

    @NotNull
    public static final String PACKAGE_OF_GENERATE_FILE = "com.heytap.store.platform.htrouter.routes";

    @NotNull
    public static final String PARCELABLE = "android.os.Parcelable";

    @NotNull
    public static final String PREFIX_OF_LOGGER = "HTRouter::Compiler ";
    private static final String PROJECT = "HTRouter";

    @NotNull
    public static final String SEPARATOR = "$$";

    @NotNull
    public static final String SERIALIZABLE = "java.io.Serializable";

    @NotNull
    public static final String SERVICE = "android.app.Service";
    private static final String SERVICE_PACKAGE = ".service";

    @NotNull
    public static final String SHORT = "java.lang.Short";

    @NotNull
    public static final String STRING = "java.lang.String";

    @NotNull
    public static final String TAG = "HTRouter::";
    private static final String TEMPLATE_PACKAGE = ".template";

    @NotNull
    public static final String TYPE_WRAPPER = "com.heytap.store.platform.htrouter.facade.model.TypeWrapper";

    @NotNull
    public static final String VALUE_ENABLE = "enable";

    @NotNull
    public static final String WARNING_TIPS = "DO NOT EDIT THIS FILE!!! IT WAS GENERATED BY HTROUTER";

    private Consts() {
    }
}
