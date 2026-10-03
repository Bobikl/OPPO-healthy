package io.protostuff.runtime;

import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import java.io.ObjectInputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Properties;

/* JADX INFO: loaded from: classes10.dex */
public final class RuntimeEnv {
    public static final boolean ALLOW_NULL_ARRAY_ELEMENT;
    public static final boolean ALWAYS_USE_SUN_REFLECTION_FACTORY;
    public static final boolean AUTO_LOAD_POLYMORPHIC_CLASSES;
    public static final boolean COLLECTION_SCHEMA_ON_REPEATED_FIELDS;
    public static final boolean ENUMS_BY_NAME;
    public static final IdStrategy ID_STRATEGY;
    public static final boolean MORPH_COLLECTION_INTERFACES;
    public static final boolean MORPH_MAP_INTERFACES;
    public static final boolean MORPH_NON_FINAL_POJOS;
    public static final boolean NEVER_USE_SUN_REFLECTION_FACTORY;
    static final Constructor<Object> OBJECT_CONSTRUCTOR;
    public static final boolean POJO_SCHEMA_ON_COLLECTION_FIELDS;
    public static final boolean POJO_SCHEMA_ON_MAP_FIELDS;
    public static final boolean USE_SUN_MISC_UNSAFE;
    static final Method newInstanceFromObjectInputStream;

    public static final class Android2Instantiator<T> extends Instantiator<T> {
        final Class<T> clazz;

        public Android2Instantiator(Class<T> cls) {
            this.clazz = cls;
        }

        @Override // io.protostuff.runtime.RuntimeEnv.Instantiator
        public T newInstance() {
            try {
                return (T) RuntimeEnv.newInstanceFromObjectInputStream.invoke(null, this.clazz, Object.class);
            } catch (Exception e2) {
                throw new RuntimeException(e2);
            }
        }
    }

    public static final class DefaultInstantiator<T> extends Instantiator<T> {
        final Constructor<T> constructor;

        public DefaultInstantiator(Constructor<T> constructor) {
            this.constructor = constructor;
            constructor.setAccessible(true);
        }

        @Override // io.protostuff.runtime.RuntimeEnv.Instantiator
        public T newInstance() {
            try {
                return this.constructor.newInstance(null);
            } catch (Exception e2) {
                throw new RuntimeException(e2);
            }
        }
    }

    public static abstract class Instantiator<T> {
        public abstract T newInstance();
    }

    static {
        Constructor<Object> constructor;
        Class<?> clsLoadClass;
        try {
            constructor = Object.class.getConstructor(null);
            try {
                clsLoadClass = Thread.currentThread().getContextClassLoader().loadClass("sun.reflect.ReflectionFactory");
            } catch (Exception unused) {
                clsLoadClass = null;
            }
        } catch (Exception unused2) {
            constructor = null;
        }
        if (constructor == null || clsLoadClass == null) {
            constructor = null;
        }
        OBJECT_CONSTRUCTOR = constructor;
        Method methodNewInstanceFromObjectInputStream = constructor == null ? getMethodNewInstanceFromObjectInputStream() : null;
        newInstanceFromObjectInputStream = methodNewInstanceFromObjectInputStream;
        if (methodNewInstanceFromObjectInputStream != null) {
            methodNewInstanceFromObjectInputStream.setAccessible(true);
        }
        Properties properties = constructor == null ? new Properties() : System.getProperties();
        ENUMS_BY_NAME = Boolean.parseBoolean(properties.getProperty("protostuff.runtime.enums_by_name", SpeechConstant.FALSE_STR));
        AUTO_LOAD_POLYMORPHIC_CLASSES = Boolean.parseBoolean(properties.getProperty("protostuff.runtime.auto_load_polymorphic_classes", SpeechConstant.TRUE_STR));
        ALLOW_NULL_ARRAY_ELEMENT = Boolean.parseBoolean(properties.getProperty("protostuff.runtime.allow_null_array_element", SpeechConstant.FALSE_STR));
        MORPH_NON_FINAL_POJOS = Boolean.parseBoolean(properties.getProperty("protostuff.runtime.morph_non_final_pojos", SpeechConstant.FALSE_STR));
        MORPH_COLLECTION_INTERFACES = Boolean.parseBoolean(properties.getProperty("protostuff.runtime.morph_collection_interfaces", SpeechConstant.FALSE_STR));
        MORPH_MAP_INTERFACES = Boolean.parseBoolean(properties.getProperty("protostuff.runtime.morph_map_interfaces", SpeechConstant.FALSE_STR));
        COLLECTION_SCHEMA_ON_REPEATED_FIELDS = Boolean.parseBoolean(properties.getProperty("protostuff.runtime.collection_schema_on_repeated_fields", SpeechConstant.FALSE_STR));
        POJO_SCHEMA_ON_COLLECTION_FIELDS = Boolean.parseBoolean(properties.getProperty("protostuff.runtime.pojo_schema_on_collection_fields", SpeechConstant.FALSE_STR));
        POJO_SCHEMA_ON_MAP_FIELDS = Boolean.parseBoolean(properties.getProperty("protostuff.runtime.pojo_schema_on_map_fields", SpeechConstant.FALSE_STR));
        USE_SUN_MISC_UNSAFE = constructor != null && Boolean.parseBoolean(properties.getProperty("protostuff.runtime.use_sun_misc_unsafe", SpeechConstant.TRUE_STR));
        ALWAYS_USE_SUN_REFLECTION_FACTORY = constructor != null && Boolean.parseBoolean(properties.getProperty("protostuff.runtime.always_use_sun_reflection_factory", SpeechConstant.FALSE_STR));
        NEVER_USE_SUN_REFLECTION_FACTORY = Boolean.parseBoolean(properties.getProperty("protostuff.runtime.never_use_sun_reflection_factory", SpeechConstant.FALSE_STR));
        String property = properties.getProperty("protostuff.runtime.id_strategy_factory");
        if (property == null) {
            ID_STRATEGY = new DefaultIdStrategy();
            return;
        }
        try {
            IdStrategy.Factory factory = (IdStrategy.Factory) loadClass(property).newInstance();
            ID_STRATEGY = factory.create();
            factory.postCreate();
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }

    private RuntimeEnv() {
    }

    private static <T> Constructor<T> getConstructor(Class<T> cls) {
        Constructor<Object> constructor;
        Constructor<Object> constructor2;
        if (ALWAYS_USE_SUN_REFLECTION_FACTORY) {
            return OnDemandSunReflectionFactory.getConstructor(cls, OBJECT_CONSTRUCTOR);
        }
        try {
            return cls.getDeclaredConstructor(null);
        } catch (NoSuchMethodException unused) {
            if (NEVER_USE_SUN_REFLECTION_FACTORY || (constructor2 = OBJECT_CONSTRUCTOR) == null) {
                return null;
            }
            return OnDemandSunReflectionFactory.getConstructor(cls, constructor2);
        } catch (SecurityException unused2) {
            if (NEVER_USE_SUN_REFLECTION_FACTORY || (constructor = OBJECT_CONSTRUCTOR) == null) {
                return null;
            }
            return OnDemandSunReflectionFactory.getConstructor(cls, constructor);
        }
    }

    private static Method getMethodNewInstanceFromObjectInputStream() {
        try {
            return ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
        } catch (Exception unused) {
            return null;
        }
    }

    public static <T> Class<T> loadClass(String str) {
        try {
            return (Class<T>) Thread.currentThread().getContextClassLoader().loadClass(str);
        } catch (ClassNotFoundException e2) {
            try {
                return (Class<T>) Class.forName(str);
            } catch (ClassNotFoundException unused) {
                throw new RuntimeException(e2);
            }
        }
    }

    public static <T> Instantiator<T> newInstantiator(Class<T> cls) {
        Constructor constructor = getConstructor(cls);
        if (constructor != null) {
            return new DefaultInstantiator(constructor);
        }
        if (newInstanceFromObjectInputStream != null) {
            return new Android2Instantiator(cls);
        }
        throw new RuntimeException("Could not resolve constructor for " + cls);
    }
}
