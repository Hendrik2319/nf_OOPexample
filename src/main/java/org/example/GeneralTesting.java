package org.example;

import java.util.Objects;
import java.util.Optional;

@SuppressWarnings("unused")
public class GeneralTesting {

    public static void main(String[] args) {


        String var1 = Math.random() > 0.5 ? "str" : null;
        Optional<String> var1Opt = Optional.ofNullable(var1);
        System.out.println(var1Opt);

        //testEqualsAndHashCode();

    }

    private static void testEqualsAndHashCode() {
        TestObject a = new TestObject("a", "b");
        TestObject b = new TestObject("a", "b");

        //noinspection NewObjectEquality
        System.out.printf("a == b -> %s%n", a==b);
        System.out.printf("a.equals(b) -> %s%n", a.equals(b));
        //noinspection UnnecessaryToStringCall
        System.out.printf("a -> %s%n", a.toString());
        System.out.printf("a.hashCode() -> %08x%n", a.hashCode());
    }

    private static class TestObject {

        String a;
        String b;

        public TestObject(String a, String b) {
            this.a = a;
            this.b = b;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof TestObject that)) return false;

            if (!Objects.equals(a, that.a)) return false;
            return Objects.equals(b, that.b);
        }

        @Override
        public int hashCode() {
            int result = a != null ? a.hashCode() : 0;
            result = 31 * result + (b != null ? b.hashCode() : 0);
            return result;
        }

    }
}
