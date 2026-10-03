package io.protostuff.runtime;

import io.protostuff.ByteString;
import io.protostuff.Input;
import io.protostuff.Message;
import io.protostuff.Morph;
import io.protostuff.Output;
import io.protostuff.Pipe;
import io.protostuff.WireFormat;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public abstract class RuntimeFieldFactory<V> implements Delegate<V> {
    static final Accessor.Factory ACCESSOR_FACTORY;
    static final RuntimeFieldFactory<BigDecimal> BIGDECIMAL;
    static final RuntimeFieldFactory<BigInteger> BIGINTEGER;
    static final RuntimeFieldFactory<Boolean> BOOL;
    static final RuntimeFieldFactory<Byte> BYTE;
    static final RuntimeFieldFactory<ByteString> BYTES;
    static final RuntimeFieldFactory<byte[]> BYTE_ARRAY;
    static final RuntimeFieldFactory<Character> CHAR;
    static final RuntimeFieldFactory<Collection<?>> COLLECTION;
    static final RuntimeFieldFactory<Date> DATE;
    static final RuntimeFieldFactory<Object> DELEGATE;
    static final RuntimeFieldFactory<Double> DOUBLE;
    static final RuntimeFieldFactory<Integer> ENUM;
    static final RuntimeFieldFactory<Float> FLOAT;
    static final int ID_ARRAY = 15;
    static final int ID_ARRAY_DELEGATE = 32;
    static final int ID_ARRAY_ENUM = 34;
    static final int ID_ARRAY_MAPPED = 17;
    static final int ID_ARRAY_POJO = 35;
    static final int ID_ARRAY_SCALAR = 33;
    static final int ID_BIGDECIMAL = 12;
    static final int ID_BIGINTEGER = 13;
    static final int ID_BOOL = 1;
    static final int ID_BYTE = 2;
    static final int ID_BYTES = 10;
    static final int ID_BYTE_ARRAY = 11;
    static final int ID_CHAR = 3;
    static final int ID_CLASS = 18;
    static final int ID_CLASS_ARRAY = 20;
    static final int ID_CLASS_ARRAY_MAPPED = 21;
    static final int ID_CLASS_MAPPED = 19;
    static final int ID_COLLECTION = 25;
    static final int ID_DATE = 14;
    static final int ID_DELEGATE = 30;
    static final int ID_DOUBLE = 8;
    static final int ID_ENUM = 24;
    static final int ID_ENUM_MAP = 23;
    static final int ID_ENUM_SET = 22;
    static final int ID_FLOAT = 7;
    static final int ID_INT32 = 5;
    static final int ID_INT64 = 6;
    static final int ID_MAP = 26;
    static final int ID_OBJECT = 16;
    static final int ID_POJO = 127;
    static final int ID_POLYMORPHIC_COLLECTION = 28;
    static final int ID_POLYMORPHIC_MAP = 29;
    static final int ID_SHORT = 4;
    static final int ID_STRING = 9;
    static final int ID_THROWABLE = 52;
    static final RuntimeFieldFactory<Integer> INT32;
    static final RuntimeFieldFactory<Long> INT64;
    static final RuntimeFieldFactory<Object> OBJECT;
    static final RuntimeFieldFactory<Object> POJO;
    static final RuntimeFieldFactory<Object> POLYMORPHIC_POJO;
    static final RuntimeFieldFactory<Short> SHORT;
    static final RuntimeFieldFactory<String> STRING;
    static final String STR_ARRAY = "o";
    static final String STR_ARRAY_DELEGATE = "F";
    static final String STR_ARRAY_ENUM = "H";
    static final String STR_ARRAY_MAPPED = "q";
    static final String STR_ARRAY_POJO = "I";
    static final String STR_ARRAY_SCALAR = "G";
    static final String STR_BIGDECIMAL = "l";
    static final String STR_BIGINTEGER = "m";
    static final String STR_BOOL = "a";
    static final String STR_BYTE = "b";
    static final String STR_BYTES = "j";
    static final String STR_BYTE_ARRAY = "k";
    static final String STR_CHAR = "c";
    static final String STR_CLASS = "r";
    static final String STR_CLASS_ARRAY = "t";
    static final String STR_CLASS_ARRAY_MAPPED = "u";
    static final String STR_CLASS_MAPPED = "s";
    static final String STR_COLLECTION = "y";
    static final String STR_DATE = "n";
    static final String STR_DELEGATE = "D";
    static final String STR_DOUBLE = "h";
    static final String STR_ENUM = "x";
    static final String STR_ENUM_MAP = "w";
    static final String STR_ENUM_SET = "v";
    static final String STR_FLOAT = "g";
    static final String STR_INT32 = "e";
    static final String STR_INT64 = "f";
    static final String STR_MAP = "z";
    static final String STR_OBJECT = "p";
    static final String STR_POJO = "_";
    static final String STR_POLYMOPRHIC_MAP = "C";
    static final String STR_POLYMORPHIC_COLLECTION = "B";
    static final String STR_SHORT = "d";
    static final String STR_STRING = "i";
    static final String STR_THROWABLE = "Z";
    private static final HashMap<String, RuntimeFieldFactory<?>> __inlineValues;
    final int id;

    static {
        HashMap<String, RuntimeFieldFactory<?>> map = new HashMap<>();
        __inlineValues = map;
        COLLECTION = new RuntimeFieldFactory<Collection<?>>(25) { // from class: io.protostuff.runtime.RuntimeFieldFactory.1
            @Override // io.protostuff.runtime.RuntimeFieldFactory
            public <T> Field<T> create(int i, String str, java.lang.reflect.Field field, IdStrategy idStrategy) {
                return ((idStrategy.flags & 64) != 0 ? RuntimeCollectionFieldFactory.getFactory() : RuntimeRepeatedFieldFactory.getFactory()).create(i, str, field, idStrategy);
            }

            @Override // io.protostuff.runtime.Delegate
            public WireFormat.FieldType getFieldType() {
                throw new UnsupportedOperationException();
            }

            @Override // io.protostuff.runtime.Delegate
            public void transfer(Pipe pipe, Input input, Output output, int i, boolean z) throws IOException {
                throw new UnsupportedOperationException();
            }

            @Override // io.protostuff.runtime.Delegate
            public Class<?> typeClass() {
                throw new UnsupportedOperationException();
            }

            @Override // io.protostuff.runtime.Delegate
            public Collection<?> readFrom(Input input) throws IOException {
                throw new UnsupportedOperationException();
            }

            @Override // io.protostuff.runtime.Delegate
            public void writeTo(Output output, int i, Collection<?> collection, boolean z) throws IOException {
                throw new UnsupportedOperationException();
            }
        };
        if (RuntimeEnv.USE_SUN_MISC_UNSAFE) {
            BIGDECIMAL = RuntimeUnsafeFieldFactory.BIGDECIMAL;
            BIGINTEGER = RuntimeUnsafeFieldFactory.BIGINTEGER;
            BOOL = RuntimeUnsafeFieldFactory.BOOL;
            BYTE = RuntimeUnsafeFieldFactory.BYTE;
            BYTES = RuntimeUnsafeFieldFactory.BYTES;
            BYTE_ARRAY = RuntimeUnsafeFieldFactory.BYTE_ARRAY;
            CHAR = RuntimeUnsafeFieldFactory.CHAR;
            DATE = RuntimeUnsafeFieldFactory.DATE;
            DOUBLE = RuntimeUnsafeFieldFactory.DOUBLE;
            FLOAT = RuntimeUnsafeFieldFactory.FLOAT;
            INT32 = RuntimeUnsafeFieldFactory.INT32;
            INT64 = RuntimeUnsafeFieldFactory.INT64;
            SHORT = RuntimeUnsafeFieldFactory.SHORT;
            STRING = RuntimeUnsafeFieldFactory.STRING;
            ENUM = RuntimeUnsafeFieldFactory.ENUM;
            OBJECT = RuntimeUnsafeFieldFactory.OBJECT;
            POJO = RuntimeUnsafeFieldFactory.POJO;
            POLYMORPHIC_POJO = RuntimeUnsafeFieldFactory.POLYMORPHIC_POJO;
            DELEGATE = RuntimeUnsafeFieldFactory.DELEGATE;
            ACCESSOR_FACTORY = UnsafeAccessor.FACTORY;
        } else {
            BIGDECIMAL = RuntimeReflectionFieldFactory.BIGDECIMAL;
            BIGINTEGER = RuntimeReflectionFieldFactory.BIGINTEGER;
            BOOL = RuntimeReflectionFieldFactory.BOOL;
            BYTE = RuntimeReflectionFieldFactory.BYTE;
            BYTES = RuntimeReflectionFieldFactory.BYTES;
            BYTE_ARRAY = RuntimeReflectionFieldFactory.BYTE_ARRAY;
            CHAR = RuntimeReflectionFieldFactory.CHAR;
            DATE = RuntimeReflectionFieldFactory.DATE;
            DOUBLE = RuntimeReflectionFieldFactory.DOUBLE;
            FLOAT = RuntimeReflectionFieldFactory.FLOAT;
            INT32 = RuntimeReflectionFieldFactory.INT32;
            INT64 = RuntimeReflectionFieldFactory.INT64;
            SHORT = RuntimeReflectionFieldFactory.SHORT;
            STRING = RuntimeReflectionFieldFactory.STRING;
            ENUM = RuntimeReflectionFieldFactory.ENUM;
            OBJECT = RuntimeReflectionFieldFactory.OBJECT;
            POJO = RuntimeReflectionFieldFactory.POJO;
            POLYMORPHIC_POJO = RuntimeReflectionFieldFactory.POLYMORPHIC_POJO;
            DELEGATE = RuntimeReflectionFieldFactory.DELEGATE;
            ACCESSOR_FACTORY = ReflectAccessor.FACTORY;
        }
        String name = Integer.TYPE.getName();
        RuntimeFieldFactory<Integer> runtimeFieldFactory = INT32;
        map.put(name, runtimeFieldFactory);
        map.put(Integer.class.getName(), runtimeFieldFactory);
        String name2 = Long.TYPE.getName();
        RuntimeFieldFactory<Long> runtimeFieldFactory2 = INT64;
        map.put(name2, runtimeFieldFactory2);
        map.put(Long.class.getName(), runtimeFieldFactory2);
        String name3 = Float.TYPE.getName();
        RuntimeFieldFactory<Float> runtimeFieldFactory3 = FLOAT;
        map.put(name3, runtimeFieldFactory3);
        map.put(Float.class.getName(), runtimeFieldFactory3);
        String name4 = Double.TYPE.getName();
        RuntimeFieldFactory<Double> runtimeFieldFactory4 = DOUBLE;
        map.put(name4, runtimeFieldFactory4);
        map.put(Double.class.getName(), runtimeFieldFactory4);
        String name5 = Boolean.TYPE.getName();
        RuntimeFieldFactory<Boolean> runtimeFieldFactory5 = BOOL;
        map.put(name5, runtimeFieldFactory5);
        map.put(Boolean.class.getName(), runtimeFieldFactory5);
        String name6 = Character.TYPE.getName();
        RuntimeFieldFactory<Character> runtimeFieldFactory6 = CHAR;
        map.put(name6, runtimeFieldFactory6);
        map.put(Character.class.getName(), runtimeFieldFactory6);
        String name7 = Short.TYPE.getName();
        RuntimeFieldFactory<Short> runtimeFieldFactory7 = SHORT;
        map.put(name7, runtimeFieldFactory7);
        map.put(Short.class.getName(), runtimeFieldFactory7);
        String name8 = Byte.TYPE.getName();
        RuntimeFieldFactory<Byte> runtimeFieldFactory8 = BYTE;
        map.put(name8, runtimeFieldFactory8);
        map.put(Byte.class.getName(), runtimeFieldFactory8);
        map.put(String.class.getName(), STRING);
        map.put(ByteString.class.getName(), BYTES);
        map.put(byte[].class.getName(), BYTE_ARRAY);
        map.put(BigInteger.class.getName(), BIGINTEGER);
        map.put(BigDecimal.class.getName(), BIGDECIMAL);
        map.put(Date.class.getName(), DATE);
    }

    public RuntimeFieldFactory(int i) {
        this.id = i;
    }

    public static <T> Delegate<T> getDelegateOrInline(Class<T> cls, IdStrategy idStrategy) {
        Delegate<T> delegate = idStrategy.getDelegate(cls);
        return delegate == null ? __inlineValues.get(cls.getName()) : delegate;
    }

    public static RuntimeFieldFactory<?> getFieldFactory(Class<?> cls) {
        return getFieldFactory(cls, RuntimeEnv.ID_STRATEGY);
    }

    public static Class<?> getGenericType(java.lang.reflect.Field field, int i) {
        try {
            Type type = ((ParameterizedType) field.getGenericType()).getActualTypeArguments()[i];
            if (!(type instanceof GenericArrayType)) {
                if (!(type instanceof ParameterizedType)) {
                    return (Class) type;
                }
                Type rawType = ((ParameterizedType) type).getRawType();
                if (Class.class == rawType) {
                    return Class.class;
                }
                if (Enum.class == rawType) {
                    return Enum.class;
                }
                return null;
            }
            Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
            int i2 = 1;
            while (genericComponentType instanceof GenericArrayType) {
                i2++;
                genericComponentType = ((GenericArrayType) genericComponentType).getGenericComponentType();
            }
            if (i2 == 1) {
                return Array.newInstance((Class<?>) genericComponentType, 0).getClass();
            }
            int[] iArr = new int[i2];
            iArr[0] = 0;
            return Array.newInstance((Class<?>) genericComponentType, iArr).getClass();
        } catch (Exception unused) {
            return null;
        }
    }

    public static <T> RuntimeFieldFactory<T> getInline(Class<T> cls) {
        return (RuntimeFieldFactory) __inlineValues.get(cls.getName());
    }

    public static boolean pojo(Class<?> cls, Morph morph, IdStrategy idStrategy) {
        if (Modifier.isFinal(cls.getModifiers())) {
            return true;
        }
        if (Modifier.isAbstract(cls.getModifiers())) {
            return idStrategy.isRegistered(cls);
        }
        if (morph != null) {
            return !morph.value();
        }
        return (idStrategy.flags & 8) == 0;
    }

    public abstract <T> Field<T> create(int i, String str, java.lang.reflect.Field field, IdStrategy idStrategy);

    public static RuntimeFieldFactory<?> getFieldFactory(Class<?> cls, IdStrategy idStrategy) {
        if (idStrategy.isDelegateRegistered(cls)) {
            return DELEGATE;
        }
        RuntimeFieldFactory<?> runtimeFieldFactory = __inlineValues.get(cls.getName());
        if (runtimeFieldFactory != null) {
            return runtimeFieldFactory;
        }
        if (Message.class.isAssignableFrom(cls)) {
            return POJO;
        }
        if (cls.isEnum()) {
            return ENUM;
        }
        if (cls.isArray() || Object.class == cls || Number.class == cls || Class.class == cls || Enum.class == cls) {
            return OBJECT;
        }
        if (idStrategy.isRegistered(cls)) {
            return cls.isInterface() ? POJO : POLYMORPHIC_POJO;
        }
        if (Throwable.class.isAssignableFrom(cls)) {
            return OBJECT;
        }
        if (Map.class.isAssignableFrom(cls)) {
            return RuntimeMapFieldFactory.MAP;
        }
        if (Collection.class.isAssignableFrom(cls)) {
            return COLLECTION;
        }
        return cls.isInterface() ? OBJECT : POLYMORPHIC_POJO;
    }

    public static <T> RuntimeFieldFactory<T> getInline(String str) {
        return (RuntimeFieldFactory) __inlineValues.get(str);
    }
}
