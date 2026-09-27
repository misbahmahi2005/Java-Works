import java.util.Arrays;
import java.lang.reflect.*;
import java.util.function.Predicate;

public class Q1 {

    public static void main(String[] args) {

        // 1. Run all validations. If any fail, exit early.
        if (!validateCode()) {
            return;
        }

        try {
            int[] n = Arrays.stream(IO.readln().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            String s = IO.readln();

            A a = new A(n[0]);

            int x = a.m1(n[1]);
            String y = a.m3(n[1]);

            IO.println(x + " " + y);

            B b = a;
            x = b.m1(n[1]);
            int z = b.m4();

            IO.println(x + " " + z);

            B.C c = a.m2(n[2]);

            IO.println(c.m2(s));

        } catch (Exception e) {
            IO.println("Runtime Error: " + e.getMessage());
        }
    }


    // --- GENERIC VALIDATION LOGIC ---

    private static boolean validateCode() {

        return checkClass(
                    A.class,
                    Modifier::isPublic,
                    "Class A must be public"
                )

                && checkConstructor(
                    A.class,
                    Modifier::isPublic,
                    "Constructor must be public",
                    int.class
                )

                && checkMethod(
                    A.class,
                    "m1",
                    Modifier::isPublic,
                    "m1 must be public",
                    int.class
                )

                && checkMethod(
                    A.class,
                    "m2",
                    Modifier::isPublic,
                    "m2 must be public",
                    int.class
                )

                && checkMethod(
                    A.class,
                    "m3",
                    Modifier::isPublic,
                    "m3 must be public",
                    int.class
                );
    }


    // --- STATIC HELPER METHODS ---

    private static boolean checkClass(
            Class<?> clazz,
            Predicate<Integer> condition,
            String errorMsg) {

        if (!condition.test(clazz.getModifiers())) {
            IO.println("Error: " + errorMsg);
            return false;
        }

        return true;
    }


    private static boolean checkField(
            Class<?> clazz,
            String fieldName,
            Predicate<Integer> condition,
            String errorMsg) {

        try {

            if (!condition.test(
                    clazz.getDeclaredField(fieldName).getModifiers())) {

                IO.println("Error: " + errorMsg);
                return false;
            }

            return true;

        } catch (NoSuchFieldException e) {

            IO.println(
                "Error: Field '" + fieldName +
                "' is missing in class " + clazz.getSimpleName()
            );

            return false;
        }
    }


    private static boolean checkMethod(
            Class<?> clazz,
            String methodName,
            Predicate<Integer> condition,
            String errorMsg,
            Class<?>... paramTypes) {

        try {

            if (!condition.test(
                    clazz.getDeclaredMethod(
                            methodName, paramTypes
                    ).getModifiers())) {

                IO.println("Error: " + errorMsg);
                return false;
            }

            return true;

        } catch (NoSuchMethodException e) {

            IO.println(
                "Error: Method '" + methodName +
                "' is missing in class " + clazz.getSimpleName()
            );

            return false;
        }
    }


    private static boolean checkConstructor(
            Class<?> clazz,
            Predicate<Integer> condition,
            String errorMsg,
            Class<?>... paramTypes) {

        try {

            if (!condition.test(
                    clazz.getDeclaredConstructor(
                            paramTypes
                    ).getModifiers())) {

                IO.println("Error: " + errorMsg);
                return false;
            }

            return true;

        } catch (NoSuchMethodException e) {

            IO.println(
                "Error: Required constructor is missing in class "
                + clazz.getSimpleName()
            );

            return false;
        }
    }
}