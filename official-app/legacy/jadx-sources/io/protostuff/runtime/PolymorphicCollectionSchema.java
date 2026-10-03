package io.protostuff.runtime;

import io.protostuff.GraphInput;
import io.protostuff.Input;
import io.protostuff.Output;
import io.protostuff.Pipe;
import io.protostuff.ProtostuffException;
import io.protostuff.Schema;
import io.protostuff.StatefulOutput;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public abstract class PolymorphicCollectionSchema extends PolymorphicSchema {
    static final int ID_CHECKED_COLLECTION = 17;
    static final int ID_CHECKED_LIST = 20;
    static final int ID_CHECKED_RANDOM_ACCESS_LIST = 21;
    static final int ID_CHECKED_SET = 18;
    static final int ID_CHECKED_SORTED_SET = 19;
    static final int ID_COPIES_LIST = 6;
    static final int ID_EMPTY_LIST = 2;
    static final int ID_EMPTY_SET = 1;
    static final int ID_SET_FROM_MAP = 5;
    static final int ID_SINGLETON_LIST = 4;
    static final int ID_SINGLETON_SET = 3;
    static final int ID_SYNCHRONIZED_COLLECTION = 12;
    static final int ID_SYNCHRONIZED_LIST = 15;
    static final int ID_SYNCHRONIZED_RANDOM_ACCESS_LIST = 16;
    static final int ID_SYNCHRONIZED_SET = 13;
    static final int ID_SYNCHRONIZED_SORTED_SET = 14;
    static final int ID_UNMODIFIABLE_COLLECTION = 7;
    static final int ID_UNMODIFIABLE_LIST = 10;
    static final int ID_UNMODIFIABLE_RANDOM_ACCESS_LIST = 11;
    static final int ID_UNMODIFIABLE_SET = 8;
    static final int ID_UNMODIFIABLE_SORTED_SET = 9;
    static final String STR_CHECKED_COLLECTION = "q";
    static final String STR_CHECKED_LIST = "t";
    static final String STR_CHECKED_RANDOM_ACCESS_LIST = "u";
    static final String STR_CHECKED_SET = "r";
    static final String STR_CHECKED_SORTED_SET = "s";
    static final String STR_COPIES_LIST = "f";
    static final String STR_EMPTY_LIST = "b";
    static final String STR_EMPTY_SET = "a";
    static final String STR_SET_FROM_MAP = "e";
    static final String STR_SINGLETON_LIST = "d";
    static final String STR_SINGLETON_SET = "c";
    static final String STR_SYNCHRONIZED_COLLECTION = "l";
    static final String STR_SYNCHRONIZED_LIST = "o";
    static final String STR_SYNCHRONIZED_RANDOM_ACCESS_LIST = "p";
    static final String STR_SYNCHRONIZED_SET = "m";
    static final String STR_SYNCHRONIZED_SORTED_SET = "n";
    static final String STR_UNMODIFIABLE_COLLECTION = "g";
    static final String STR_UNMODIFIABLE_LIST = "j";
    static final String STR_UNMODIFIABLE_RANDOM_ACCESS_LIST = "k";
    static final String STR_UNMODIFIABLE_SET = "h";
    static final String STR_UNMODIFIABLE_SORTED_SET = "i";
    static final IdentityHashMap<Class<?>, Integer> __nonPublicCollections = new IdentityHashMap<>();
    static final java.lang.reflect.Field fCheckedCollection_c;
    static final java.lang.reflect.Field fCheckedCollection_type;
    static final java.lang.reflect.Field fCheckedList_list;
    static final java.lang.reflect.Field fCheckedSortedSet_ss;
    static final java.lang.reflect.Field fCopiesList_element;
    static final java.lang.reflect.Field fCopiesList_n;
    static final java.lang.reflect.Field fSetFromMap_m;
    static final java.lang.reflect.Field fSetFromMap_s;
    static final java.lang.reflect.Field fSingletonList_element;
    static final java.lang.reflect.Field fSingletonSet_element;
    static final java.lang.reflect.Field fSynchronizedCollection_c;
    static final java.lang.reflect.Field fSynchronizedCollection_mutex;
    static final java.lang.reflect.Field fSynchronizedList_list;
    static final java.lang.reflect.Field fSynchronizedSortedSet_ss;
    static final java.lang.reflect.Field fUnmodifiableCollection_c;
    static final java.lang.reflect.Field fUnmodifiableList_list;
    static final java.lang.reflect.Field fUnmodifiableSortedSet_ss;
    static final RuntimeEnv.Instantiator<?> iCheckedCollection;
    static final RuntimeEnv.Instantiator<?> iCheckedList;
    static final RuntimeEnv.Instantiator<?> iCheckedRandomAccessList;
    static final RuntimeEnv.Instantiator<?> iCheckedSet;
    static final RuntimeEnv.Instantiator<?> iCheckedSortedSet;
    static final RuntimeEnv.Instantiator<?> iCopiesList;
    static final RuntimeEnv.Instantiator<?> iSetFromMap;
    static final RuntimeEnv.Instantiator<?> iSingletonList;
    static final RuntimeEnv.Instantiator<?> iSingletonSet;
    static final RuntimeEnv.Instantiator<?> iSynchronizedCollection;
    static final RuntimeEnv.Instantiator<?> iSynchronizedList;
    static final RuntimeEnv.Instantiator<?> iSynchronizedRandomAccessList;
    static final RuntimeEnv.Instantiator<?> iSynchronizedSet;
    static final RuntimeEnv.Instantiator<?> iSynchronizedSortedSet;
    static final RuntimeEnv.Instantiator<?> iUnmodifiableCollection;
    static final RuntimeEnv.Instantiator<?> iUnmodifiableList;
    static final RuntimeEnv.Instantiator<?> iUnmodifiableRandomAccessList;
    static final RuntimeEnv.Instantiator<?> iUnmodifiableSet;
    static final RuntimeEnv.Instantiator<?> iUnmodifiableSortedSet;
    protected final Pipe.Schema<Object> pipeSchema;

    static {
        map("java.util.Collections$EmptySet", 1);
        map("java.util.Collections$EmptyList", 2);
        Class<?> map = map("java.util.Collections$SingletonSet", 3);
        Class<?> map2 = map("java.util.Collections$SingletonList", 4);
        Class<?> map3 = map("java.util.Collections$SetFromMap", 5);
        Class<?> map4 = map("java.util.Collections$CopiesList", 6);
        Class<?> map5 = map("java.util.Collections$UnmodifiableCollection", 7);
        Class<?> map6 = map("java.util.Collections$UnmodifiableSet", 8);
        Class<?> map7 = map("java.util.Collections$UnmodifiableSortedSet", 9);
        Class<?> map8 = map("java.util.Collections$UnmodifiableList", 10);
        Class<?> map9 = map("java.util.Collections$UnmodifiableRandomAccessList", 11);
        Class<?> map10 = map("java.util.Collections$SynchronizedCollection", 12);
        Class<?> map11 = map("java.util.Collections$SynchronizedSet", 13);
        Class<?> map12 = map("java.util.Collections$SynchronizedSortedSet", 14);
        Class<?> map13 = map("java.util.Collections$SynchronizedList", 15);
        Class<?> map14 = map("java.util.Collections$SynchronizedRandomAccessList", 16);
        Class<?> map15 = map("java.util.Collections$CheckedCollection", 17);
        Class<?> map16 = map("java.util.Collections$CheckedSet", 18);
        Class<?> map17 = map("java.util.Collections$CheckedSortedSet", 19);
        Class<?> map18 = map("java.util.Collections$CheckedList", 20);
        Class<?> map19 = map("java.util.Collections$CheckedRandomAccessList", 21);
        try {
            java.lang.reflect.Field declaredField = map.getDeclaredField("element");
            fSingletonSet_element = declaredField;
            java.lang.reflect.Field declaredField2 = map2.getDeclaredField("element");
            fSingletonList_element = declaredField2;
            java.lang.reflect.Field declaredField3 = map3.getDeclaredField("m");
            fSetFromMap_m = declaredField3;
            java.lang.reflect.Field declaredField4 = map3.getDeclaredField(STR_CHECKED_SORTED_SET);
            fSetFromMap_s = declaredField4;
            java.lang.reflect.Field declaredField5 = map4.getDeclaredField(STR_SYNCHRONIZED_SORTED_SET);
            fCopiesList_n = declaredField5;
            java.lang.reflect.Field declaredField6 = map4.getDeclaredField("element");
            fCopiesList_element = declaredField6;
            java.lang.reflect.Field declaredField7 = map5.getDeclaredField(STR_SINGLETON_SET);
            fUnmodifiableCollection_c = declaredField7;
            java.lang.reflect.Field declaredField8 = map7.getDeclaredField("ss");
            fUnmodifiableSortedSet_ss = declaredField8;
            java.lang.reflect.Field declaredField9 = map8.getDeclaredField("list");
            fUnmodifiableList_list = declaredField9;
            java.lang.reflect.Field declaredField10 = map10.getDeclaredField(STR_SINGLETON_SET);
            fSynchronizedCollection_c = declaredField10;
            java.lang.reflect.Field declaredField11 = map10.getDeclaredField("mutex");
            fSynchronizedCollection_mutex = declaredField11;
            java.lang.reflect.Field declaredField12 = map12.getDeclaredField("ss");
            fSynchronizedSortedSet_ss = declaredField12;
            java.lang.reflect.Field declaredField13 = map13.getDeclaredField("list");
            fSynchronizedList_list = declaredField13;
            java.lang.reflect.Field declaredField14 = map15.getDeclaredField(STR_SINGLETON_SET);
            fCheckedCollection_c = declaredField14;
            java.lang.reflect.Field declaredField15 = map15.getDeclaredField("type");
            fCheckedCollection_type = declaredField15;
            java.lang.reflect.Field declaredField16 = map17.getDeclaredField("ss");
            fCheckedSortedSet_ss = declaredField16;
            java.lang.reflect.Field declaredField17 = map18.getDeclaredField("list");
            fCheckedList_list = declaredField17;
            declaredField.setAccessible(true);
            declaredField2.setAccessible(true);
            declaredField3.setAccessible(true);
            declaredField4.setAccessible(true);
            declaredField5.setAccessible(true);
            declaredField6.setAccessible(true);
            declaredField7.setAccessible(true);
            declaredField8.setAccessible(true);
            declaredField9.setAccessible(true);
            declaredField10.setAccessible(true);
            declaredField11.setAccessible(true);
            declaredField12.setAccessible(true);
            declaredField13.setAccessible(true);
            declaredField14.setAccessible(true);
            declaredField15.setAccessible(true);
            declaredField16.setAccessible(true);
            declaredField17.setAccessible(true);
            iSingletonSet = RuntimeEnv.newInstantiator(map);
            iSingletonList = RuntimeEnv.newInstantiator(map2);
            iSetFromMap = RuntimeEnv.newInstantiator(map3);
            iCopiesList = RuntimeEnv.newInstantiator(map4);
            iUnmodifiableCollection = RuntimeEnv.newInstantiator(map5);
            iUnmodifiableSet = RuntimeEnv.newInstantiator(map6);
            iUnmodifiableSortedSet = RuntimeEnv.newInstantiator(map7);
            iUnmodifiableList = RuntimeEnv.newInstantiator(map8);
            iUnmodifiableRandomAccessList = RuntimeEnv.newInstantiator(map9);
            iSynchronizedCollection = RuntimeEnv.newInstantiator(map10);
            iSynchronizedSet = RuntimeEnv.newInstantiator(map11);
            iSynchronizedSortedSet = RuntimeEnv.newInstantiator(map12);
            iSynchronizedList = RuntimeEnv.newInstantiator(map13);
            iSynchronizedRandomAccessList = RuntimeEnv.newInstantiator(map14);
            iCheckedCollection = RuntimeEnv.newInstantiator(map15);
            iCheckedSet = RuntimeEnv.newInstantiator(map16);
            iCheckedSortedSet = RuntimeEnv.newInstantiator(map17);
            iCheckedList = RuntimeEnv.newInstantiator(map18);
            iCheckedRandomAccessList = RuntimeEnv.newInstantiator(map19);
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }

    public PolymorphicCollectionSchema(IdStrategy idStrategy) {
        super(idStrategy);
        this.pipeSchema = new Pipe.Schema<Object>(this) { // from class: io.protostuff.runtime.PolymorphicCollectionSchema.1
            @Override // io.protostuff.Pipe.Schema
            public void transfer(Pipe pipe, Input input, Output output) throws IOException {
                PolymorphicCollectionSchema.transferObject(this, pipe, input, output, PolymorphicCollectionSchema.this.strategy);
            }
        };
    }

    public static int idFrom(Class<?> cls) {
        Integer num = __nonPublicCollections.get(cls);
        if (num != null) {
            return num.intValue();
        }
        throw new RuntimeException("Unknown collection: " + cls);
    }

    public static Object instanceFrom(int i) {
        switch (i) {
            case 1:
                return Collections.EMPTY_SET;
            case 2:
                return Collections.EMPTY_LIST;
            case 3:
                return iSingletonSet.newInstance();
            case 4:
                return iSingletonList.newInstance();
            case 5:
                return iSetFromMap.newInstance();
            case 6:
                return iCopiesList.newInstance();
            case 7:
                return iUnmodifiableCollection.newInstance();
            case 8:
                return iUnmodifiableSet.newInstance();
            case 9:
                return iUnmodifiableSortedSet.newInstance();
            case 10:
                return iUnmodifiableList.newInstance();
            case 11:
                return iUnmodifiableRandomAccessList.newInstance();
            case 12:
                return iSynchronizedCollection.newInstance();
            case 13:
                return iSynchronizedSet.newInstance();
            case 14:
                return iSynchronizedSortedSet.newInstance();
            case 15:
                return iSynchronizedList.newInstance();
            case 16:
                return iSynchronizedRandomAccessList.newInstance();
            case 17:
                return iCheckedCollection.newInstance();
            case 18:
                return iCheckedSet.newInstance();
            case 19:
                return iCheckedSortedSet.newInstance();
            case 20:
                return iCheckedList.newInstance();
            case 21:
                return iCheckedRandomAccessList.newInstance();
            default:
                throw new RuntimeException("Unknown id: " + i);
        }
    }

    private static Class<?> map(String str, int i) {
        Class<?> clsLoadClass = RuntimeEnv.loadClass(str);
        __nonPublicCollections.put(clsLoadClass, Integer.valueOf(i));
        return clsLoadClass;
    }

    public static String name(int i) {
        switch (i) {
            case 1:
                return STR_EMPTY_SET;
            case 2:
                return STR_EMPTY_LIST;
            case 3:
                return STR_SINGLETON_SET;
            case 4:
                return STR_SINGLETON_LIST;
            case 5:
                return "e";
            case 6:
                return STR_COPIES_LIST;
            case 7:
                return "g";
            case 8:
                return "h";
            case 9:
                return STR_UNMODIFIABLE_SORTED_SET;
            case 10:
                return STR_UNMODIFIABLE_LIST;
            case 11:
                return "k";
            case 12:
                return "l";
            case 13:
                return "m";
            case 14:
                return STR_SYNCHRONIZED_SORTED_SET;
            case 15:
                return STR_SYNCHRONIZED_LIST;
            case 16:
                return "p";
            case 17:
                return STR_CHECKED_COLLECTION;
            case 18:
                return STR_CHECKED_SET;
            case 19:
                return STR_CHECKED_SORTED_SET;
            case 20:
                return "t";
            case 21:
                return STR_CHECKED_RANDOM_ACCESS_LIST;
            case 22:
                return "v";
            case 23:
            default:
                return null;
            case 24:
                return "x";
            case 25:
                return "y";
        }
    }

    public static int number(char c2) {
        switch (c2) {
            case 'a':
                return 1;
            case 'b':
                return 2;
            case 'c':
                return 3;
            case 'd':
                return 4;
            case 'e':
                return 5;
            case 'f':
                return 6;
            case 'g':
                return 7;
            case 'h':
                return 8;
            case 'i':
                return 9;
            case 'j':
                return 10;
            case 'k':
                return 11;
            case 'l':
                return 12;
            case 'm':
                return 13;
            case 'n':
                return 14;
            case 'o':
                return 15;
            case 'p':
                return 16;
            case 'q':
                return 17;
            case 'r':
                return 18;
            case 's':
                return 19;
            case 't':
                return 20;
            case 'u':
                return 21;
            case 'v':
                return 22;
            case 'w':
            default:
                return 0;
            case 'x':
                return 24;
            case 'y':
                return 25;
        }
    }

    private static Object readCheckedCollectionFrom(Input input, Schema<?> schema, Object obj, IdStrategy idStrategy, boolean z, Object obj2, boolean z2, boolean z3) throws IOException {
        if (z) {
            ((GraphInput) input).updateLast(obj2, obj);
        }
        IdStrategy.Wrapper wrapper = new IdStrategy.Wrapper();
        Object objMergeObject = input.mergeObject(wrapper, idStrategy.POLYMORPHIC_COLLECTION_SCHEMA);
        if (!z || !((GraphInput) input).isCurrentMessageReference()) {
            objMergeObject = wrapper.value;
        }
        if (1 != input.readFieldNumber(schema)) {
            throw new ProtostuffException("Corrupt input.");
        }
        Object objMergeObject2 = input.mergeObject(wrapper, idStrategy.CLASS_SCHEMA);
        if (!z || !((GraphInput) input).isCurrentMessageReference()) {
            objMergeObject2 = wrapper.value;
        }
        try {
            fCheckedCollection_c.set(obj2, objMergeObject);
            fCheckedCollection_type.set(obj2, objMergeObject2);
            if (z2) {
                fCheckedSortedSet_ss.set(obj2, objMergeObject);
            }
            if (z3) {
                fCheckedList_list.set(obj2, objMergeObject);
            }
            return obj2;
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }

    public static Object readObjectFrom(Input input, Schema<?> schema, Object obj, IdStrategy idStrategy) throws IOException {
        return readObjectFrom(input, schema, obj, idStrategy, input.readFieldNumber(schema));
    }

    private static Object readSynchronizedCollectionFrom(Input input, Schema<?> schema, Object obj, IdStrategy idStrategy, boolean z, Object obj2, boolean z2, boolean z3) throws IOException {
        if (z) {
            ((GraphInput) input).updateLast(obj2, obj);
        }
        IdStrategy.Wrapper wrapper = new IdStrategy.Wrapper();
        Object objMergeObject = input.mergeObject(wrapper, idStrategy.POLYMORPHIC_COLLECTION_SCHEMA);
        if (!z || !((GraphInput) input).isCurrentMessageReference()) {
            objMergeObject = wrapper.value;
        }
        try {
            fSynchronizedCollection_c.set(obj2, objMergeObject);
            fSynchronizedCollection_mutex.set(obj2, obj2);
            if (z2) {
                fSynchronizedSortedSet_ss.set(obj2, objMergeObject);
            }
            if (z3) {
                fSynchronizedList_list.set(obj2, objMergeObject);
            }
            return obj2;
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }

    private static Object readUnmodifiableCollectionFrom(Input input, Schema<?> schema, Object obj, IdStrategy idStrategy, boolean z, Object obj2, boolean z2, boolean z3) throws IOException {
        if (z) {
            ((GraphInput) input).updateLast(obj2, obj);
        }
        IdStrategy.Wrapper wrapper = new IdStrategy.Wrapper();
        Object objMergeObject = input.mergeObject(wrapper, idStrategy.POLYMORPHIC_COLLECTION_SCHEMA);
        if (!z || !((GraphInput) input).isCurrentMessageReference()) {
            objMergeObject = wrapper.value;
        }
        try {
            fUnmodifiableCollection_c.set(obj2, objMergeObject);
            if (z2) {
                fUnmodifiableSortedSet_ss.set(obj2, objMergeObject);
            }
            if (z3) {
                fUnmodifiableList_list.set(obj2, objMergeObject);
            }
            return obj2;
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }

    public static void transferObject(Pipe.Schema<Object> schema, Pipe pipe, Input input, Output output, IdStrategy idStrategy) throws IOException {
        transferObject(schema, pipe, input, output, idStrategy, input.readFieldNumber(schema.wrappedSchema));
    }

    private static void writeCheckedCollectionTo(Output output, Object obj, Schema<?> schema, IdStrategy idStrategy, int i) throws IOException {
        try {
            Object obj2 = fCheckedCollection_c.get(obj);
            Object obj3 = fCheckedCollection_type.get(obj);
            output.writeObject(i, obj2, idStrategy.POLYMORPHIC_COLLECTION_SCHEMA, false);
            output.writeObject(1, obj3, idStrategy.CLASS_SCHEMA, false);
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }

    public static void writeNonPublicCollectionTo(Output output, Object obj, Schema<?> schema, IdStrategy idStrategy) throws IOException {
        Integer num = __nonPublicCollections.get(obj.getClass());
        if (num == null) {
            throw new RuntimeException("Unknown collection: " + obj.getClass());
        }
        int iIntValue = num.intValue();
        switch (iIntValue) {
            case 1:
                output.writeUInt32(iIntValue, 0, false);
                return;
            case 2:
                output.writeUInt32(iIntValue, 0, false);
                return;
            case 3:
                output.writeUInt32(iIntValue, 0, false);
                try {
                    Object obj2 = fSingletonSet_element.get(obj);
                    if (obj2 != null) {
                        output.writeObject(1, obj2, idStrategy.OBJECT_SCHEMA, false);
                        return;
                    }
                    return;
                } catch (Exception e2) {
                    throw new RuntimeException(e2);
                }
            case 4:
                output.writeUInt32(iIntValue, 0, false);
                Object obj3 = ((List) obj).get(0);
                if (obj3 != null) {
                    output.writeObject(1, obj3, idStrategy.OBJECT_SCHEMA, false);
                    return;
                }
                return;
            case 5:
                try {
                    output.writeObject(iIntValue, fSetFromMap_m.get(obj), idStrategy.POLYMORPHIC_MAP_SCHEMA, false);
                    return;
                } catch (Exception e3) {
                    throw new RuntimeException(e3);
                }
            case 6:
                output.writeUInt32(iIntValue, 0, false);
                int size = ((List) obj).size();
                try {
                    Object obj4 = fCopiesList_element.get(obj);
                    output.writeUInt32(1, size, false);
                    if (obj4 != null) {
                        output.writeObject(2, obj4, idStrategy.OBJECT_SCHEMA, false);
                        return;
                    }
                    return;
                } catch (Exception e4) {
                    throw new RuntimeException(e4);
                }
            case 7:
                writeUnmodifiableCollectionTo(output, obj, schema, idStrategy, iIntValue);
                return;
            case 8:
                writeUnmodifiableCollectionTo(output, obj, schema, idStrategy, iIntValue);
                return;
            case 9:
                writeUnmodifiableCollectionTo(output, obj, schema, idStrategy, iIntValue);
                return;
            case 10:
                writeUnmodifiableCollectionTo(output, obj, schema, idStrategy, iIntValue);
                return;
            case 11:
                writeUnmodifiableCollectionTo(output, obj, schema, idStrategy, iIntValue);
                return;
            case 12:
                writeSynchronizedCollectionTo(output, obj, schema, idStrategy, iIntValue);
                return;
            case 13:
                writeSynchronizedCollectionTo(output, obj, schema, idStrategy, iIntValue);
                return;
            case 14:
                writeSynchronizedCollectionTo(output, obj, schema, idStrategy, iIntValue);
                return;
            case 15:
                writeSynchronizedCollectionTo(output, obj, schema, idStrategy, iIntValue);
                return;
            case 16:
                writeSynchronizedCollectionTo(output, obj, schema, idStrategy, iIntValue);
                return;
            case 17:
                writeCheckedCollectionTo(output, obj, schema, idStrategy, iIntValue);
                return;
            case 18:
                writeCheckedCollectionTo(output, obj, schema, idStrategy, iIntValue);
                return;
            case 19:
                writeCheckedCollectionTo(output, obj, schema, idStrategy, iIntValue);
                return;
            case 20:
                writeCheckedCollectionTo(output, obj, schema, idStrategy, iIntValue);
                return;
            case 21:
                writeCheckedCollectionTo(output, obj, schema, idStrategy, iIntValue);
                return;
            default:
                throw new RuntimeException("Should not happen.");
        }
    }

    public static void writeObjectTo(Output output, Object obj, Schema<?> schema, IdStrategy idStrategy) throws IOException {
        if (Collections.class == obj.getClass().getDeclaringClass()) {
            writeNonPublicCollectionTo(output, obj, schema, idStrategy);
            return;
        }
        if (EnumSet.class.isAssignableFrom(obj.getClass())) {
            idStrategy.writeEnumIdTo(output, 22, EnumIO.getElementTypeFromEnumSet(obj));
        } else {
            idStrategy.writeCollectionIdTo(output, 25, obj.getClass());
        }
        if (output instanceof StatefulOutput) {
            ((StatefulOutput) output).updateLast(idStrategy.COLLECTION_SCHEMA, schema);
        }
        idStrategy.COLLECTION_SCHEMA.writeTo(output, (Collection) obj);
    }

    private static void writeSynchronizedCollectionTo(Output output, Object obj, Schema<?> schema, IdStrategy idStrategy, int i) throws IOException {
        try {
            Object obj2 = fSynchronizedCollection_c.get(obj);
            if (fSynchronizedCollection_mutex.get(obj) != obj) {
                throw new RuntimeException("This exception is thrown to fail fast. Synchronized collections with a different mutex would only work if graph format is used, since the reference is retained.");
            }
            output.writeObject(i, obj2, idStrategy.POLYMORPHIC_COLLECTION_SCHEMA, false);
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }

    private static void writeUnmodifiableCollectionTo(Output output, Object obj, Schema<?> schema, IdStrategy idStrategy, int i) throws IOException {
        try {
            output.writeObject(i, fUnmodifiableCollection_c.get(obj), idStrategy.POLYMORPHIC_COLLECTION_SCHEMA, false);
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // io.protostuff.Schema
    public String getFieldName(int i) {
        return name(i);
    }

    @Override // io.protostuff.Schema
    public int getFieldNumber(String str) {
        return number(str);
    }

    @Override // io.protostuff.runtime.PolymorphicSchema
    public Pipe.Schema<Object> getPipeSchema() {
        return this.pipeSchema;
    }

    @Override // io.protostuff.Schema
    public void mergeFrom(Input input, Object obj) throws IOException {
        setValue(readObjectFrom(input, this, obj, this.strategy), obj);
    }

    @Override // io.protostuff.Schema
    public String messageFullName() {
        return Collection.class.getName();
    }

    @Override // io.protostuff.Schema
    public String messageName() {
        return Collection.class.getSimpleName();
    }

    @Override // io.protostuff.Schema
    public void writeTo(Output output, Object obj) throws IOException {
        writeObjectTo(output, obj, this, this.strategy);
    }

    public static int number(String str) {
        if (str.length() != 1) {
            return 0;
        }
        return number(str.charAt(0));
    }

    /* JADX WARN: Code duplicated, block: B:133:0x02b6 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:134:0x02b7  */
    public static Object readObjectFrom(Input input, Schema<?> schema, Object obj, IdStrategy idStrategy, int i) throws IOException {
        Object unmodifiableCollectionFrom;
        Object objNewInstance;
        boolean z = input instanceof GraphInput;
        if (i == 25) {
            Collection<Object> collectionNewMessage = idStrategy.resolveCollectionFrom(input).newMessage();
            if (z) {
                ((GraphInput) input).updateLast(collectionNewMessage, obj);
            }
            idStrategy.COLLECTION_SCHEMA.mergeFrom(input, collectionNewMessage);
            return collectionNewMessage;
        }
        switch (i) {
            case 1:
                if (input.readUInt32() != 0) {
                    throw new ProtostuffException("Corrupt input.");
                }
                if (z) {
                    ((GraphInput) input).updateLast(Collections.EMPTY_SET, obj);
                }
                unmodifiableCollectionFrom = Collections.EMPTY_SET;
                if (input.readFieldNumber(schema) == 0) {
                    return unmodifiableCollectionFrom;
                }
                throw new ProtostuffException("Corrupt input.");
            case 2:
                if (input.readUInt32() != 0) {
                    throw new ProtostuffException("Corrupt input.");
                }
                if (z) {
                    ((GraphInput) input).updateLast(Collections.EMPTY_LIST, obj);
                }
                unmodifiableCollectionFrom = Collections.EMPTY_LIST;
                if (input.readFieldNumber(schema) == 0) {
                    return unmodifiableCollectionFrom;
                }
                throw new ProtostuffException("Corrupt input.");
            case 3:
                if (input.readUInt32() != 0) {
                    throw new ProtostuffException("Corrupt input.");
                }
                objNewInstance = iSingletonSet.newInstance();
                if (z) {
                    ((GraphInput) input).updateLast(objNewInstance, obj);
                }
                int fieldNumber = input.readFieldNumber(schema);
                if (fieldNumber == 0) {
                    return objNewInstance;
                }
                if (fieldNumber != 1) {
                    throw new ProtostuffException("Corrupt input");
                }
                IdStrategy.Wrapper wrapper = new IdStrategy.Wrapper();
                Object objMergeObject = input.mergeObject(wrapper, idStrategy.OBJECT_SCHEMA);
                if (!z || !((GraphInput) input).isCurrentMessageReference()) {
                    objMergeObject = wrapper.value;
                }
                try {
                    fSingletonSet_element.set(objNewInstance, objMergeObject);
                    unmodifiableCollectionFrom = objNewInstance;
                    if (input.readFieldNumber(schema) == 0) {
                        return unmodifiableCollectionFrom;
                    }
                    throw new ProtostuffException("Corrupt input.");
                } catch (Exception e2) {
                    throw new RuntimeException(e2);
                }
            case 4:
                if (input.readUInt32() != 0) {
                    throw new ProtostuffException("Corrupt input.");
                }
                objNewInstance = iSingletonList.newInstance();
                if (z) {
                    ((GraphInput) input).updateLast(objNewInstance, obj);
                }
                int fieldNumber2 = input.readFieldNumber(schema);
                if (fieldNumber2 == 0) {
                    return objNewInstance;
                }
                if (fieldNumber2 != 1) {
                    throw new ProtostuffException("Corrupt input.");
                }
                IdStrategy.Wrapper wrapper2 = new IdStrategy.Wrapper();
                Object objMergeObject2 = input.mergeObject(wrapper2, idStrategy.OBJECT_SCHEMA);
                if (!z || !((GraphInput) input).isCurrentMessageReference()) {
                    objMergeObject2 = wrapper2.value;
                }
                try {
                    fSingletonList_element.set(objNewInstance, objMergeObject2);
                    unmodifiableCollectionFrom = objNewInstance;
                    if (input.readFieldNumber(schema) == 0) {
                        return unmodifiableCollectionFrom;
                    }
                    throw new ProtostuffException("Corrupt input.");
                } catch (Exception e3) {
                    throw new RuntimeException(e3);
                }
            case 5:
                objNewInstance = iSetFromMap.newInstance();
                if (z) {
                    ((GraphInput) input).updateLast(objNewInstance, obj);
                }
                IdStrategy.Wrapper wrapper3 = new IdStrategy.Wrapper();
                Object objMergeObject3 = input.mergeObject(wrapper3, idStrategy.POLYMORPHIC_MAP_SCHEMA);
                if (!z || !((GraphInput) input).isCurrentMessageReference()) {
                    objMergeObject3 = wrapper3.value;
                }
                try {
                    fSetFromMap_m.set(objNewInstance, objMergeObject3);
                    fSetFromMap_s.set(objNewInstance, ((Map) objMergeObject3).keySet());
                    unmodifiableCollectionFrom = objNewInstance;
                    if (input.readFieldNumber(schema) == 0) {
                        return unmodifiableCollectionFrom;
                    }
                    throw new ProtostuffException("Corrupt input.");
                } catch (Exception e4) {
                    throw new RuntimeException(e4);
                }
            case 6:
                if (input.readUInt32() != 0) {
                    throw new ProtostuffException("Corrupt input.");
                }
                objNewInstance = iCopiesList.newInstance();
                if (z) {
                    ((GraphInput) input).updateLast(objNewInstance, obj);
                }
                if (1 != input.readFieldNumber(schema)) {
                    throw new ProtostuffException("Corrupt input.");
                }
                int uInt32 = input.readUInt32();
                int fieldNumber3 = input.readFieldNumber(schema);
                if (fieldNumber3 == 0) {
                    try {
                        fCopiesList_n.setInt(objNewInstance, uInt32);
                        return objNewInstance;
                    } catch (Exception e5) {
                        throw new RuntimeException(e5);
                    }
                }
                if (fieldNumber3 != 2) {
                    throw new ProtostuffException("Corrupt input.");
                }
                IdStrategy.Wrapper wrapper4 = new IdStrategy.Wrapper();
                Object objMergeObject4 = input.mergeObject(wrapper4, idStrategy.OBJECT_SCHEMA);
                if (!z || !((GraphInput) input).isCurrentMessageReference()) {
                    objMergeObject4 = wrapper4.value;
                }
                try {
                    fCopiesList_n.setInt(objNewInstance, uInt32);
                    fCopiesList_element.set(objNewInstance, objMergeObject4);
                    unmodifiableCollectionFrom = objNewInstance;
                    if (input.readFieldNumber(schema) == 0) {
                        return unmodifiableCollectionFrom;
                    }
                    throw new ProtostuffException("Corrupt input.");
                } catch (Exception e6) {
                    throw new RuntimeException(e6);
                }
            case 7:
                unmodifiableCollectionFrom = readUnmodifiableCollectionFrom(input, schema, obj, idStrategy, z, iUnmodifiableCollection.newInstance(), false, false);
                if (input.readFieldNumber(schema) == 0) {
                    return unmodifiableCollectionFrom;
                }
                throw new ProtostuffException("Corrupt input.");
            case 8:
                unmodifiableCollectionFrom = readUnmodifiableCollectionFrom(input, schema, obj, idStrategy, z, iUnmodifiableSet.newInstance(), false, false);
                if (input.readFieldNumber(schema) == 0) {
                    return unmodifiableCollectionFrom;
                }
                throw new ProtostuffException("Corrupt input.");
            case 9:
                unmodifiableCollectionFrom = readUnmodifiableCollectionFrom(input, schema, obj, idStrategy, z, iUnmodifiableSortedSet.newInstance(), true, false);
                if (input.readFieldNumber(schema) == 0) {
                    return unmodifiableCollectionFrom;
                }
                throw new ProtostuffException("Corrupt input.");
            case 10:
                unmodifiableCollectionFrom = readUnmodifiableCollectionFrom(input, schema, obj, idStrategy, z, iUnmodifiableList.newInstance(), false, true);
                if (input.readFieldNumber(schema) == 0) {
                    return unmodifiableCollectionFrom;
                }
                throw new ProtostuffException("Corrupt input.");
            case 11:
                unmodifiableCollectionFrom = readUnmodifiableCollectionFrom(input, schema, obj, idStrategy, z, iUnmodifiableRandomAccessList.newInstance(), false, true);
                if (input.readFieldNumber(schema) == 0) {
                    return unmodifiableCollectionFrom;
                }
                throw new ProtostuffException("Corrupt input.");
            case 12:
                unmodifiableCollectionFrom = readSynchronizedCollectionFrom(input, schema, obj, idStrategy, z, iSynchronizedCollection.newInstance(), false, false);
                if (input.readFieldNumber(schema) == 0) {
                    return unmodifiableCollectionFrom;
                }
                throw new ProtostuffException("Corrupt input.");
            case 13:
                unmodifiableCollectionFrom = readSynchronizedCollectionFrom(input, schema, obj, idStrategy, z, iSynchronizedSet.newInstance(), false, false);
                if (input.readFieldNumber(schema) == 0) {
                    return unmodifiableCollectionFrom;
                }
                throw new ProtostuffException("Corrupt input.");
            case 14:
                unmodifiableCollectionFrom = readSynchronizedCollectionFrom(input, schema, obj, idStrategy, z, iSynchronizedSortedSet.newInstance(), true, false);
                if (input.readFieldNumber(schema) == 0) {
                    return unmodifiableCollectionFrom;
                }
                throw new ProtostuffException("Corrupt input.");
            case 15:
                unmodifiableCollectionFrom = readSynchronizedCollectionFrom(input, schema, obj, idStrategy, z, iSynchronizedList.newInstance(), false, true);
                if (input.readFieldNumber(schema) == 0) {
                    return unmodifiableCollectionFrom;
                }
                throw new ProtostuffException("Corrupt input.");
            case 16:
                unmodifiableCollectionFrom = readSynchronizedCollectionFrom(input, schema, obj, idStrategy, z, iSynchronizedRandomAccessList.newInstance(), false, true);
                if (input.readFieldNumber(schema) == 0) {
                    return unmodifiableCollectionFrom;
                }
                throw new ProtostuffException("Corrupt input.");
            case 17:
                unmodifiableCollectionFrom = readCheckedCollectionFrom(input, schema, obj, idStrategy, z, iCheckedCollection.newInstance(), false, false);
                if (input.readFieldNumber(schema) == 0) {
                    return unmodifiableCollectionFrom;
                }
                throw new ProtostuffException("Corrupt input.");
            case 18:
                unmodifiableCollectionFrom = readCheckedCollectionFrom(input, schema, obj, idStrategy, z, iCheckedSet.newInstance(), false, false);
                if (input.readFieldNumber(schema) == 0) {
                    return unmodifiableCollectionFrom;
                }
                throw new ProtostuffException("Corrupt input.");
            case 19:
                unmodifiableCollectionFrom = readCheckedCollectionFrom(input, schema, obj, idStrategy, z, iCheckedSortedSet.newInstance(), true, false);
                if (input.readFieldNumber(schema) == 0) {
                    return unmodifiableCollectionFrom;
                }
                throw new ProtostuffException("Corrupt input.");
            case 20:
                unmodifiableCollectionFrom = readCheckedCollectionFrom(input, schema, obj, idStrategy, z, iCheckedList.newInstance(), false, true);
                if (input.readFieldNumber(schema) == 0) {
                    return unmodifiableCollectionFrom;
                }
                throw new ProtostuffException("Corrupt input.");
            case 21:
                unmodifiableCollectionFrom = readCheckedCollectionFrom(input, schema, obj, idStrategy, z, iCheckedRandomAccessList.newInstance(), false, true);
                if (input.readFieldNumber(schema) == 0) {
                    return unmodifiableCollectionFrom;
                }
                throw new ProtostuffException("Corrupt input.");
            case 22:
                Collection<Object> collectionNewEnumSet = idStrategy.resolveEnumFrom(input).newEnumSet();
                if (z) {
                    ((GraphInput) input).updateLast(collectionNewEnumSet, obj);
                }
                idStrategy.COLLECTION_SCHEMA.mergeFrom(input, collectionNewEnumSet);
                return collectionNewEnumSet;
            default:
                throw new ProtostuffException("Corrupt input.");
        }
    }

    public static void transferObject(Pipe.Schema<Object> schema, Pipe pipe, Input input, Output output, IdStrategy idStrategy, int i) throws IOException {
        if (i == 25) {
            idStrategy.transferCollectionId(input, output, i);
            if (output instanceof StatefulOutput) {
                ((StatefulOutput) output).updateLast(idStrategy.COLLECTION_PIPE_SCHEMA, schema);
            }
            Pipe.transferDirect(idStrategy.COLLECTION_PIPE_SCHEMA, pipe, input, output);
            return;
        }
        switch (i) {
            case 1:
                output.writeUInt32(i, input.readUInt32(), false);
                break;
            case 2:
                output.writeUInt32(i, input.readUInt32(), false);
                break;
            case 3:
            case 4:
                output.writeUInt32(i, input.readUInt32(), false);
                int fieldNumber = input.readFieldNumber(schema.wrappedSchema);
                if (fieldNumber == 0) {
                    return;
                }
                if (fieldNumber != 1) {
                    throw new ProtostuffException("Corrupt input.");
                }
                output.writeObject(1, pipe, idStrategy.OBJECT_PIPE_SCHEMA, false);
                break;
                break;
            case 5:
                output.writeObject(i, pipe, idStrategy.POLYMORPHIC_MAP_PIPE_SCHEMA, false);
                break;
            case 6:
                output.writeUInt32(i, input.readUInt32(), false);
                if (1 != input.readFieldNumber(schema.wrappedSchema)) {
                    throw new ProtostuffException("Corrupt input.");
                }
                output.writeUInt32(1, input.readUInt32(), false);
                int fieldNumber2 = input.readFieldNumber(schema.wrappedSchema);
                if (fieldNumber2 == 0) {
                    return;
                }
                if (fieldNumber2 != 2) {
                    throw new ProtostuffException("Corrupt input.");
                }
                output.writeObject(2, pipe, idStrategy.OBJECT_PIPE_SCHEMA, false);
                break;
                break;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                output.writeObject(i, pipe, idStrategy.POLYMORPHIC_COLLECTION_PIPE_SCHEMA, false);
                break;
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
                output.writeObject(i, pipe, idStrategy.POLYMORPHIC_COLLECTION_PIPE_SCHEMA, false);
                break;
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
                output.writeObject(i, pipe, idStrategy.POLYMORPHIC_COLLECTION_PIPE_SCHEMA, false);
                if (1 != input.readFieldNumber(schema.wrappedSchema)) {
                    throw new ProtostuffException("Corrupt input.");
                }
                output.writeObject(1, pipe, idStrategy.CLASS_PIPE_SCHEMA, false);
                break;
                break;
            case 22:
                idStrategy.transferEnumId(input, output, i);
                if (output instanceof StatefulOutput) {
                    ((StatefulOutput) output).updateLast(idStrategy.COLLECTION_PIPE_SCHEMA, schema);
                }
                Pipe.transferDirect(idStrategy.COLLECTION_PIPE_SCHEMA, pipe, input, output);
                return;
            default:
                throw new ProtostuffException("Corrupt input.");
        }
        if (input.readFieldNumber(schema.wrappedSchema) != 0) {
            throw new ProtostuffException("Corrupt input.");
        }
    }
}
