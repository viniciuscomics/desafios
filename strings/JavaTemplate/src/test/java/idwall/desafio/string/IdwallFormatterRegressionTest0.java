package idwall.desafio.string;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class IdwallFormatterRegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IdwallFormatterRegressionTest0.test01");
        idwall.desafio.string.IdwallFormatter idwallFormatter2 = new idwall.desafio.string.IdwallFormatter((java.lang.Integer) 1, false);
        java.lang.Integer int3 = idwallFormatter2.getLimit();
        java.lang.Class<?> wildcardClass4 = idwallFormatter2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3.equals(1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IdwallFormatterRegressionTest0.test02");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IdwallFormatterRegressionTest0.test03");
        idwall.desafio.string.IdwallFormatter idwallFormatter2 = new idwall.desafio.string.IdwallFormatter((java.lang.Integer) 1, false);
        boolean boolean3 = idwallFormatter2.isJustify();
        boolean boolean4 = idwallFormatter2.isJustify();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = idwallFormatter2.format("");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: O texto veio vazio. Informe um texto.");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IdwallFormatterRegressionTest0.test04");
        idwall.desafio.string.IdwallFormatter idwallFormatter2 = new idwall.desafio.string.IdwallFormatter((java.lang.Integer) 0, true);
        java.lang.Class<?> wildcardClass3 = idwallFormatter2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IdwallFormatterRegressionTest0.test05");
        idwall.desafio.string.IdwallFormatter idwallFormatter2 = new idwall.desafio.string.IdwallFormatter((java.lang.Integer) 1, false);
        java.lang.Integer int3 = idwallFormatter2.getLimit();
        boolean boolean4 = idwallFormatter2.isJustify();
        java.lang.Integer int5 = idwallFormatter2.getLimit();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = idwallFormatter2.format("");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: O texto veio vazio. Informe um texto.");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3.equals(1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5.equals(1));
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IdwallFormatterRegressionTest0.test06");
        idwall.desafio.string.IdwallFormatter idwallFormatter2 = new idwall.desafio.string.IdwallFormatter((java.lang.Integer) 1, true);
        java.lang.Integer int3 = idwallFormatter2.getLimit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3.equals(1));
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IdwallFormatterRegressionTest0.test07");
        idwall.desafio.string.IdwallFormatter idwallFormatter2 = new idwall.desafio.string.IdwallFormatter((java.lang.Integer) 0, false);
        boolean boolean3 = idwallFormatter2.isJustify();
        boolean boolean4 = idwallFormatter2.isJustify();
        java.lang.Integer int5 = idwallFormatter2.getLimit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5.equals(0));
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IdwallFormatterRegressionTest0.test08");
        idwall.desafio.string.IdwallFormatter idwallFormatter2 = new idwall.desafio.string.IdwallFormatter((java.lang.Integer) 1, false);
        java.lang.Integer int3 = idwallFormatter2.getLimit();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = idwallFormatter2.format("");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: O texto veio vazio. Informe um texto.");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3.equals(1));
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IdwallFormatterRegressionTest0.test09");
        idwall.desafio.string.IdwallFormatter idwallFormatter2 = new idwall.desafio.string.IdwallFormatter((java.lang.Integer) 0, false);
        boolean boolean3 = idwallFormatter2.isJustify();
        boolean boolean4 = idwallFormatter2.isJustify();
        java.lang.Class<?> wildcardClass5 = idwallFormatter2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IdwallFormatterRegressionTest0.test10");
        idwall.desafio.string.IdwallFormatter idwallFormatter2 = new idwall.desafio.string.IdwallFormatter((java.lang.Integer) 100, true);
        java.lang.String str4 = idwallFormatter2.format("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "                                                                                                 hi!\n" + "'", str4.equals("                                                                                                 hi!\n"));
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IdwallFormatterRegressionTest0.test11");
        idwall.desafio.string.IdwallFormatter idwallFormatter2 = new idwall.desafio.string.IdwallFormatter((java.lang.Integer) 1, false);
        java.lang.Integer int3 = idwallFormatter2.getLimit();
        boolean boolean4 = idwallFormatter2.isJustify();
        java.lang.Integer int5 = idwallFormatter2.getLimit();
        boolean boolean6 = idwallFormatter2.isJustify();
        java.lang.String str8 = idwallFormatter2.format("hi!");
        java.lang.String str10 = idwallFormatter2.format("hi!");
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
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "h\ni\n!\n" + "'", str10.equals("h\ni\n!\n"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IdwallFormatterRegressionTest0.test12");
        idwall.desafio.string.IdwallFormatter idwallFormatter2 = new idwall.desafio.string.IdwallFormatter((java.lang.Integer) 1, true);
        java.lang.Class<?> wildcardClass3 = idwallFormatter2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IdwallFormatterRegressionTest0.test13");
        idwall.desafio.string.IdwallFormatter idwallFormatter2 = new idwall.desafio.string.IdwallFormatter((java.lang.Integer) 1, false);
        java.lang.Integer int3 = idwallFormatter2.getLimit();
        java.lang.Integer int4 = idwallFormatter2.getLimit();
        java.lang.Class<?> wildcardClass5 = idwallFormatter2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3.equals(1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4.equals(1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IdwallFormatterRegressionTest0.test14");
        idwall.desafio.string.IdwallFormatter idwallFormatter2 = new idwall.desafio.string.IdwallFormatter((java.lang.Integer) 1, false);
        java.lang.Integer int3 = idwallFormatter2.getLimit();
        boolean boolean4 = idwallFormatter2.isJustify();
        java.lang.Integer int5 = idwallFormatter2.getLimit();
        java.lang.Class<?> wildcardClass6 = idwallFormatter2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3.equals(1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5.equals(1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IdwallFormatterRegressionTest0.test15");
        idwall.desafio.string.IdwallFormatter idwallFormatter2 = new idwall.desafio.string.IdwallFormatter((java.lang.Integer) 10, false);
        java.lang.Class<?> wildcardClass3 = idwallFormatter2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IdwallFormatterRegressionTest0.test16");
        idwall.desafio.string.IdwallFormatter idwallFormatter2 = new idwall.desafio.string.IdwallFormatter((java.lang.Integer) 1, false);
        java.lang.Integer int3 = idwallFormatter2.getLimit();
        boolean boolean4 = idwallFormatter2.isJustify();
        java.lang.Integer int5 = idwallFormatter2.getLimit();
        boolean boolean6 = idwallFormatter2.isJustify();
        java.lang.String str8 = idwallFormatter2.format("hi!");
        java.lang.Class<?> wildcardClass9 = idwallFormatter2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IdwallFormatterRegressionTest0.test17");
        idwall.desafio.string.IdwallFormatter idwallFormatter2 = new idwall.desafio.string.IdwallFormatter((java.lang.Integer) (-1), true);
        boolean boolean3 = idwallFormatter2.isJustify();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IdwallFormatterRegressionTest0.test18");
        idwall.desafio.string.IdwallFormatter idwallFormatter2 = new idwall.desafio.string.IdwallFormatter((java.lang.Integer) 1, false);
        java.lang.Integer int3 = idwallFormatter2.getLimit();
        java.lang.String str5 = idwallFormatter2.format("h\ni\n!\n");
        java.lang.Integer int6 = idwallFormatter2.getLimit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3.equals(1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "h\ni\n!\n" + "'", str5.equals("h\ni\n!\n"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6.equals(1));
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IdwallFormatterRegressionTest0.test19");
        idwall.desafio.string.IdwallFormatter idwallFormatter2 = new idwall.desafio.string.IdwallFormatter((java.lang.Integer) 1, false);
        java.lang.Integer int3 = idwallFormatter2.getLimit();
        java.lang.String str5 = idwallFormatter2.format("                                                                                                 hi!\n");
        java.lang.Class<?> wildcardClass6 = idwallFormatter2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3.equals(1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "h\ni\n!\n" + "'", str5.equals("h\ni\n!\n"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IdwallFormatterRegressionTest0.test20");
        idwall.desafio.string.IdwallFormatter idwallFormatter2 = new idwall.desafio.string.IdwallFormatter((java.lang.Integer) 0, true);
        boolean boolean3 = idwallFormatter2.isJustify();
        java.lang.Class<?> wildcardClass4 = idwallFormatter2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }
}

