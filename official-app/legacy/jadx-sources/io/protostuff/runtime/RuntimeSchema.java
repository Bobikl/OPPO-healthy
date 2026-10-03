package io.protostuff.runtime;

import io.protostuff.Exclude;
import io.protostuff.Input;
import io.protostuff.Message;
import io.protostuff.Output;
import io.protostuff.Pipe;
import io.protostuff.Schema;
import io.protostuff.Tag;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public final class RuntimeSchema<T> implements Schema<T>, FieldMap<T> {
    public static final String ERROR_TAG_VALUE = "Invalid tag number (value must be in range [1, 2^29-1])";
    public static final int MAX_TAG_VALUE = 536870911;
    public static final int MIN_TAG_FOR_HASH_FIELD_MAP = 100;
    public static final int MIN_TAG_VALUE = 1;
    private static final Set<String> NO_EXCLUSIONS = Collections.emptySet();
    private final FieldMap<T> fieldMap;
    public final RuntimeEnv.Instantiator<T> instantiator;
    private final Pipe.Schema<T> pipeSchema;
    private final Class<T> typeClass;

    public RuntimeSchema(Class<T> cls, Collection<Field<T>> collection, Constructor<T> constructor) {
        this(cls, collection, new RuntimeEnv.DefaultInstantiator(constructor));
    }

    private FieldMap<T> createFieldMap(Collection<Field<T>> collection) {
        Iterator<Field<T>> it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            int i2 = it.next().number;
            if (i2 > i) {
                i = i2;
            }
        }
        return preferHashFieldMap(collection, i) ? new HashFieldMap(collection) : new ArrayFieldMap(collection, i);
    }

    public static <T> RuntimeSchema<T> createFrom(Class<T> cls) {
        return createFrom(cls, NO_EXCLUSIONS, RuntimeEnv.ID_STRATEGY);
    }

    public static void fill(Map<String, java.lang.reflect.Field> map, Class<?> cls) {
        if (Object.class != cls.getSuperclass()) {
            fill(map, cls.getSuperclass());
        }
        for (java.lang.reflect.Field field : cls.getDeclaredFields()) {
            int modifiers = field.getModifiers();
            if (!Modifier.isStatic(modifiers) && !Modifier.isTransient(modifiers) && field.getAnnotation(Exclude.class) == null) {
                map.put(field.getName(), field);
            }
        }
    }

    public static Map<String, java.lang.reflect.Field> findInstanceFields(Class<?> cls) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        fill(linkedHashMap, cls);
        return linkedHashMap;
    }

    public static <T> Schema<T> getSchema(Class<T> cls) {
        return getSchema(cls, RuntimeEnv.ID_STRATEGY);
    }

    public static <T> HasSchema<T> getSchemaWrapper(Class<T> cls) {
        return getSchemaWrapper(cls, RuntimeEnv.ID_STRATEGY);
    }

    public static boolean isRegistered(Class<?> cls) {
        return isRegistered(cls, RuntimeEnv.ID_STRATEGY);
    }

    public static <T> boolean map(Class<? super T> cls, Class<T> cls2) {
        IdStrategy idStrategy = RuntimeEnv.ID_STRATEGY;
        if (idStrategy instanceof DefaultIdStrategy) {
            return ((DefaultIdStrategy) idStrategy).map(cls, cls2);
        }
        throw new RuntimeException("RuntimeSchema.map is only supported on DefaultIdStrategy");
    }

    private boolean preferHashFieldMap(Collection<Field<T>> collection, int i) {
        return i > 100 && i >= collection.size() * 2;
    }

    public static <T> boolean register(Class<T> cls, Schema<T> schema) {
        IdStrategy idStrategy = RuntimeEnv.ID_STRATEGY;
        if (idStrategy instanceof DefaultIdStrategy) {
            return ((DefaultIdStrategy) idStrategy).registerPojo(cls, schema);
        }
        throw new RuntimeException("RuntimeSchema.register is only supported on DefaultIdStrategy");
    }

    public static <T> Pipe.Schema<T> resolvePipeSchema(Schema<T> schema, Class<? super T> cls, boolean z) {
        if (Message.class.isAssignableFrom(cls)) {
            try {
                return (Pipe.Schema) cls.getDeclaredMethod("getPipeSchema", new Class[0]).invoke(null, new Object[0]);
            } catch (Exception unused) {
            }
        }
        if (RuntimeSchema.class.isAssignableFrom(schema.getClass())) {
            return ((RuntimeSchema) schema).getPipeSchema();
        }
        if (!z) {
            return null;
        }
        throw new RuntimeException("No pipe schema for: " + cls);
    }

    @Override // io.protostuff.runtime.FieldMap
    public Field<T> getFieldByName(String str) {
        return this.fieldMap.getFieldByName(str);
    }

    @Override // io.protostuff.runtime.FieldMap
    public Field<T> getFieldByNumber(int i) {
        return this.fieldMap.getFieldByNumber(i);
    }

    @Override // io.protostuff.runtime.FieldMap
    public int getFieldCount() {
        return this.fieldMap.getFieldCount();
    }

    @Override // io.protostuff.Schema
    public String getFieldName(int i) {
        Field<T> fieldByNumber = getFieldByNumber(i);
        if (fieldByNumber == null) {
            return null;
        }
        return fieldByNumber.name;
    }

    @Override // io.protostuff.Schema
    public int getFieldNumber(String str) {
        Field<T> fieldByName = getFieldByName(str);
        if (fieldByName == null) {
            return 0;
        }
        return fieldByName.number;
    }

    @Override // io.protostuff.runtime.FieldMap
    public List<Field<T>> getFields() {
        return this.fieldMap.getFields();
    }

    public Pipe.Schema<T> getPipeSchema() {
        return this.pipeSchema;
    }

    @Override // io.protostuff.Schema
    public boolean isInitialized(T t) {
        return true;
    }

    @Override // io.protostuff.Schema
    public final void mergeFrom(Input input, T t) throws IOException {
        while (true) {
            int fieldNumber = input.readFieldNumber(this);
            if (fieldNumber == 0) {
                return;
            }
            Field<T> fieldByNumber = getFieldByNumber(fieldNumber);
            if (fieldByNumber == null) {
                input.handleUnknownField(fieldNumber, this);
            } else {
                fieldByNumber.mergeFrom(input, t);
            }
        }
    }

    @Override // io.protostuff.Schema
    public String messageFullName() {
        return this.typeClass.getName();
    }

    @Override // io.protostuff.Schema
    public String messageName() {
        return this.typeClass.getSimpleName();
    }

    @Override // io.protostuff.Schema
    public T newMessage() {
        return this.instantiator.newInstance();
    }

    @Override // io.protostuff.Schema
    public Class<T> typeClass() {
        return this.typeClass;
    }

    @Override // io.protostuff.Schema
    public final void writeTo(Output output, T t) throws IOException {
        Iterator<Field<T>> it = getFields().iterator();
        while (it.hasNext()) {
            it.next().writeTo(output, t);
        }
    }

    public RuntimeSchema(Class<T> cls, Collection<Field<T>> collection, RuntimeEnv.Instantiator<T> instantiator) {
        FieldMap<T> fieldMapCreateFieldMap = createFieldMap(collection);
        this.fieldMap = fieldMapCreateFieldMap;
        this.pipeSchema = new RuntimePipeSchema(this, fieldMapCreateFieldMap);
        this.instantiator = instantiator;
        this.typeClass = cls;
    }

    public static <T> RuntimeSchema<T> createFrom(Class<T> cls, IdStrategy idStrategy) {
        return createFrom(cls, NO_EXCLUSIONS, idStrategy);
    }

    public static <T> Schema<T> getSchema(Class<T> cls, IdStrategy idStrategy) {
        return idStrategy.getSchemaWrapper(cls, true).getSchema();
    }

    public static <T> HasSchema<T> getSchemaWrapper(Class<T> cls, IdStrategy idStrategy) {
        return idStrategy.getSchemaWrapper(cls, true);
    }

    public static boolean isRegistered(Class<?> cls, IdStrategy idStrategy) {
        return idStrategy.isRegistered(cls);
    }

    public static <T> RuntimeSchema<T> createFrom(Class<T> cls, String[] strArr, IdStrategy idStrategy) {
        HashSet hashSet = new HashSet();
        for (String str : strArr) {
            hashSet.add(str);
        }
        return createFrom(cls, hashSet, idStrategy);
    }

    public static <T> boolean register(Class<T> cls) {
        IdStrategy idStrategy = RuntimeEnv.ID_STRATEGY;
        if (idStrategy instanceof DefaultIdStrategy) {
            return ((DefaultIdStrategy) idStrategy).registerPojo(cls);
        }
        throw new RuntimeException("RuntimeSchema.register is only supported on DefaultIdStrategy");
    }

    public static <T> RuntimeSchema<T> createFrom(Class<T> cls, Set<String> set, IdStrategy idStrategy) {
        boolean z;
        String name;
        int i;
        int i2;
        if (!cls.isInterface() && !Modifier.isAbstract(cls.getModifiers())) {
            Map<String, java.lang.reflect.Field> mapFindInstanceFields = findInstanceFields(cls);
            ArrayList arrayList = new ArrayList(mapFindInstanceFields.size());
            int i3 = 0;
            boolean z2 = false;
            for (java.lang.reflect.Field field : mapFindInstanceFields.values()) {
                if (!set.contains(field.getName())) {
                    if (field.getAnnotation(Deprecated.class) != null) {
                        i3++;
                    } else {
                        Tag tag = (Tag) field.getAnnotation(Tag.class);
                        if (tag != null) {
                            if (!z2 && !arrayList.isEmpty()) {
                                throw new RuntimeException("When using annotation-based mapping, all fields must be annotated with @" + Tag.class.getSimpleName());
                            }
                            int iValue = tag.value();
                            z = true;
                            if (iValue >= 1 && iValue <= 536870911) {
                                name = tag.alias().isEmpty() ? field.getName() : tag.alias();
                                i = i3;
                                i2 = iValue;
                            } else {
                                throw new IllegalArgumentException("Invalid tag number (value must be in range [1, 2^29-1]): " + iValue + " on " + cls);
                            }
                        } else if (!z2) {
                            i2 = i3 + 1;
                            name = field.getName();
                            z = z2;
                            i = i2;
                        } else {
                            throw new RuntimeException(String.format("%s#%s is not annotated with @Tag", cls.getCanonicalName(), field.getName()));
                        }
                        arrayList.add(RuntimeFieldFactory.getFieldFactory(field.getType(), idStrategy).create(i2, name, field, idStrategy));
                        i3 = i;
                        z2 = z;
                    }
                }
            }
            return new RuntimeSchema<>(cls, arrayList, RuntimeEnv.newInstantiator(cls));
        }
        throw new RuntimeException("The root object can neither be an abstract class nor interface: \"" + cls.getName());
    }

    public static <T> RuntimeSchema<T> createFrom(Class<T> cls, Map<String, String> map, IdStrategy idStrategy) {
        if (!cls.isInterface() && !Modifier.isAbstract(cls.getModifiers())) {
            ArrayList arrayList = new ArrayList(map.size());
            int i = 0;
            for (Map.Entry<String, String> entry : map.entrySet()) {
                try {
                    java.lang.reflect.Field declaredField = cls.getDeclaredField(entry.getKey());
                    int modifiers = declaredField.getModifiers();
                    if (!Modifier.isStatic(modifiers) && !Modifier.isTransient(modifiers) && declaredField.getAnnotation(Exclude.class) == null) {
                        i++;
                        arrayList.add(RuntimeFieldFactory.getFieldFactory(declaredField.getType(), idStrategy).create(i, entry.getValue(), declaredField, idStrategy));
                    }
                } catch (Exception e2) {
                    throw new IllegalArgumentException("Exception on field: " + entry.getKey(), e2);
                }
            }
            return new RuntimeSchema<>(cls, arrayList, RuntimeEnv.newInstantiator(cls));
        }
        throw new RuntimeException("The root object can neither be an abstract class nor interface: \"" + cls.getName());
    }
}
