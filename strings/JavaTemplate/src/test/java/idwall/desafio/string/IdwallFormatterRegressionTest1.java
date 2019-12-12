package idwall.desafio.string;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class IdwallFormatterRegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IdwallFormatterRegressionTest1.test21");
        idwall.desafio.string.IdwallFormatter idwallFormatter2 = new idwall.desafio.string.IdwallFormatter((java.lang.Integer) (-1), true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = idwallFormatter2.format("");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: O texto veio vazio. Informe um texto.");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IdwallFormatterRegressionTest1.test22");
        idwall.desafio.string.IdwallFormatter idwallFormatter2 = new idwall.desafio.string.IdwallFormatter((java.lang.Integer) 0, false);
        java.lang.Integer int3 = idwallFormatter2.getLimit();
        boolean boolean4 = idwallFormatter2.isJustify();
        java.lang.Integer int5 = idwallFormatter2.getLimit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3.equals(0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5.equals(0));
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IdwallFormatterRegressionTest1.test23");
        idwall.desafio.string.IdwallFormatter idwallFormatter2 = new idwall.desafio.string.IdwallFormatter((java.lang.Integer) 1, false);
        java.lang.Integer int3 = idwallFormatter2.getLimit();
        java.lang.String str5 = idwallFormatter2.format("h\ni\n!\n");
        boolean boolean6 = idwallFormatter2.isJustify();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3.equals(1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "h\ni\n!\n" + "'", str5.equals("h\ni\n!\n"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IdwallFormatterRegressionTest1.test24");
        idwall.desafio.string.IdwallFormatter idwallFormatter2 = new idwall.desafio.string.IdwallFormatter((java.lang.Integer) 100, false);
        java.lang.String str4 = idwallFormatter2.format("                                                                                                 hi!\n");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!\n" + "'", str4.equals("hi!\n"));
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IdwallFormatterRegressionTest1.test25");
        idwall.desafio.string.IdwallFormatter idwallFormatter2 = new idwall.desafio.string.IdwallFormatter((java.lang.Integer) 0, true);
        java.lang.Integer int3 = idwallFormatter2.getLimit();
        java.lang.Integer int4 = idwallFormatter2.getLimit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3.equals(0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4.equals(0));
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IdwallFormatterRegressionTest1.test26");
        idwall.desafio.string.IdwallFormatter idwallFormatter2 = new idwall.desafio.string.IdwallFormatter((java.lang.Integer) 1, true);
        boolean boolean3 = idwallFormatter2.isJustify();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IdwallFormatterRegressionTest1.test27");
        idwall.desafio.string.IdwallFormatter idwallFormatter2 = new idwall.desafio.string.IdwallFormatter((java.lang.Integer) 1, false);
        java.lang.Integer int3 = idwallFormatter2.getLimit();
        boolean boolean4 = idwallFormatter2.isJustify();
        java.lang.Integer int5 = idwallFormatter2.getLimit();
        boolean boolean6 = idwallFormatter2.isJustify();
        boolean boolean7 = idwallFormatter2.isJustify();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3.equals(1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5.equals(1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IdwallFormatterRegressionTest1.test28");
        idwall.desafio.string.IdwallFormatter idwallFormatter2 = new idwall.desafio.string.IdwallFormatter((java.lang.Integer) 1, false);
        java.lang.Integer int3 = idwallFormatter2.getLimit();
        java.lang.Integer int4 = idwallFormatter2.getLimit();
        java.lang.Integer int5 = idwallFormatter2.getLimit();
        java.lang.Integer int6 = idwallFormatter2.getLimit();
        boolean boolean7 = idwallFormatter2.isJustify();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3.equals(1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4.equals(1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5.equals(1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6.equals(1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IdwallFormatterRegressionTest1.test29");
        idwall.desafio.string.IdwallFormatter idwallFormatter2 = new idwall.desafio.string.IdwallFormatter((java.lang.Integer) 1, true);
        java.lang.String str4 = idwallFormatter2.format("                                                                                                 hi!\n");
        java.lang.Integer int5 = idwallFormatter2.getLimit();
        java.lang.String str7 = idwallFormatter2.format("hi!\n");
        java.lang.String str9 = idwallFormatter2.format("hi!\n");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "h\ni\n!\n" + "'", str4.equals("h\ni\n!\n"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5.equals(1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "h\ni\n!\n" + "'", str7.equals("h\ni\n!\n"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "h\ni\n!\n" + "'", str9.equals("h\ni\n!\n"));
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IdwallFormatterRegressionTest1.test30");
        idwall.desafio.string.IdwallFormatter idwallFormatter2 = new idwall.desafio.string.IdwallFormatter((java.lang.Integer) 10, true);
        java.lang.Class<?> wildcardClass3 = idwallFormatter2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IdwallFormatterRegressionTest1.test31");
        idwall.desafio.string.IdwallFormatter idwallFormatter2 = new idwall.desafio.string.IdwallFormatter((java.lang.Integer) 1, false);
        java.lang.Integer int3 = idwallFormatter2.getLimit();
        java.lang.Integer int4 = idwallFormatter2.getLimit();
        java.lang.Integer int5 = idwallFormatter2.getLimit();
        boolean boolean6 = idwallFormatter2.isJustify();
        java.lang.Integer int7 = idwallFormatter2.getLimit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3.equals(1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4.equals(1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5.equals(1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7.equals(1));
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IdwallFormatterRegressionTest1.test32");
        idwall.desafio.string.IdwallFormatter idwallFormatter2 = new idwall.desafio.string.IdwallFormatter((java.lang.Integer) 100, false);
        java.lang.String str4 = idwallFormatter2.format("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!\n" + "'", str4.equals("hi!\n"));
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IdwallFormatterRegressionTest1.test33");
        idwall.desafio.string.IdwallFormatter idwallFormatter2 = new idwall.desafio.string.IdwallFormatter((java.lang.Integer) 100, false);
        java.lang.Class<?> wildcardClass3 = idwallFormatter2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IdwallFormatterRegressionTest1.test34");
        idwall.desafio.string.IdwallFormatter idwallFormatter2 = new idwall.desafio.string.IdwallFormatter((java.lang.Integer) 1, false);
        java.lang.Integer int3 = idwallFormatter2.getLimit();
        boolean boolean4 = idwallFormatter2.isJustify();
        java.lang.Integer int5 = idwallFormatter2.getLimit();
        boolean boolean6 = idwallFormatter2.isJustify();
        java.lang.String str8 = idwallFormatter2.format("hi!");
        java.lang.Integer int9 = idwallFormatter2.getLimit();
        boolean boolean10 = idwallFormatter2.isJustify();
        java.lang.Class<?> wildcardClass11 = idwallFormatter2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3.equals(1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5.equals(1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "h\ni\n!\n" + "'", str8.equals("h\ni\n!\n"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9.equals(1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IdwallFormatterRegressionTest1.test35");
        idwall.desafio.string.IdwallFormatter idwallFormatter2 = new idwall.desafio.string.IdwallFormatter((java.lang.Integer) 100, false);
        java.lang.Integer int3 = idwallFormatter2.getLimit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3.equals(100));
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IdwallFormatterRegressionTest1.test36");
        idwall.desafio.string.IdwallFormatter idwallFormatter2 = new idwall.desafio.string.IdwallFormatter((java.lang.Integer) 1, false);
        java.lang.Integer int3 = idwallFormatter2.getLimit();
        boolean boolean4 = idwallFormatter2.isJustify();
        boolean boolean5 = idwallFormatter2.isJustify();
        java.lang.Integer int6 = idwallFormatter2.getLimit();
        java.lang.Integer int7 = idwallFormatter2.getLimit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3.equals(1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6.equals(1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7.equals(1));
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IdwallFormatterRegressionTest1.test37");
        idwall.desafio.string.IdwallFormatter idwallFormatter2 = new idwall.desafio.string.IdwallFormatter((java.lang.Integer) 1, false);
        java.lang.Integer int3 = idwallFormatter2.getLimit();
        java.lang.Integer int4 = idwallFormatter2.getLimit();
        java.lang.String str6 = idwallFormatter2.format("hi!\n");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3.equals(1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4.equals(1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "h\ni\n!\n" + "'", str6.equals("h\ni\n!\n"));
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IdwallFormatterRegressionTest1.test38");
        idwall.desafio.string.IdwallFormatter idwallFormatter2 = new idwall.desafio.string.IdwallFormatter((java.lang.Integer) 1, true);
        java.lang.String str4 = idwallFormatter2.format("                                                                                                 hi!\n");
        boolean boolean5 = idwallFormatter2.isJustify();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "h\ni\n!\n" + "'", str4.equals("h\ni\n!\n"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IdwallFormatterRegressionTest1.test39");
        idwall.desafio.string.IdwallFormatter idwallFormatter2 = new idwall.desafio.string.IdwallFormatter((java.lang.Integer) 10, true);
        boolean boolean3 = idwallFormatter2.isJustify();
        java.lang.Integer int4 = idwallFormatter2.getLimit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4.equals(10));
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IdwallFormatterRegressionTest1.test40");
        idwall.desafio.string.IdwallFormatter idwallFormatter2 = new idwall.desafio.string.IdwallFormatter((java.lang.Integer) 1, false);
        java.lang.Integer int3 = idwallFormatter2.getLimit();
        boolean boolean4 = idwallFormatter2.isJustify();
        java.lang.Class<?> wildcardClass5 = idwallFormatter2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3.equals(1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }
}

