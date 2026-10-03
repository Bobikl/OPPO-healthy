package com.heytap.health.operation.courses.constant;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'DURATION_SHORT_TO_LONG' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:399)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:364)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:349)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:315)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:288)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes17.dex */
public final class CourseEnum$CourseSortType {
    private static final /* synthetic */ CourseEnum$CourseSortType[] $VALUES;
    public static final CourseEnum$CourseSortType CALORIE_LONG_TO_SHORT;
    public static final CourseEnum$CourseSortType CALORIE_SHORT_TO_LONG;
    public static final CourseEnum$CourseSortType DEFAULT = new CourseEnum$CourseSortType("DEFAULT", 0, SortType.DEFAULT, SortValue.DEFAULT);
    public static final CourseEnum$CourseSortType DURATION_LONG_TO_SHORT;
    public static final CourseEnum$CourseSortType DURATION_SHORT_TO_LONG;
    public SortType sortType;
    public SortValue sortValue;

    public enum SortType {
        DEFAULT(0),
        DURATION(1),
        CALORIE(2);

        public int type;

        SortType(int i) {
            this.type = i;
        }
    }

    public enum SortValue {
        DEFAULT(0),
        SHORT_TO_LONG(1),
        LONG_TO_SHORT(2);

        public int value;

        SortValue(int i) {
            this.value = i;
        }
    }

    private static /* synthetic */ CourseEnum$CourseSortType[] $values() {
        return new CourseEnum$CourseSortType[]{DEFAULT, DURATION_SHORT_TO_LONG, DURATION_LONG_TO_SHORT, CALORIE_SHORT_TO_LONG, CALORIE_LONG_TO_SHORT};
    }

    static {
        SortType sortType = SortType.DURATION;
        SortValue sortValue = SortValue.SHORT_TO_LONG;
        DURATION_SHORT_TO_LONG = new CourseEnum$CourseSortType("DURATION_SHORT_TO_LONG", 1, sortType, sortValue);
        SortValue sortValue2 = SortValue.LONG_TO_SHORT;
        DURATION_LONG_TO_SHORT = new CourseEnum$CourseSortType("DURATION_LONG_TO_SHORT", 2, sortType, sortValue2);
        SortType sortType2 = SortType.CALORIE;
        CALORIE_SHORT_TO_LONG = new CourseEnum$CourseSortType("CALORIE_SHORT_TO_LONG", 3, sortType2, sortValue);
        CALORIE_LONG_TO_SHORT = new CourseEnum$CourseSortType("CALORIE_LONG_TO_SHORT", 4, sortType2, sortValue2);
        $VALUES = $values();
    }

    private CourseEnum$CourseSortType(String str, int i, SortType sortType, SortValue sortValue) {
        super(str, i);
        this.sortType = sortType;
        this.sortValue = sortValue;
    }

    public static CourseEnum$CourseSortType valueOf(String str) {
        return (CourseEnum$CourseSortType) Enum.valueOf(CourseEnum$CourseSortType.class, str);
    }

    public static CourseEnum$CourseSortType[] values() {
        return (CourseEnum$CourseSortType[]) $VALUES.clone();
    }
}
