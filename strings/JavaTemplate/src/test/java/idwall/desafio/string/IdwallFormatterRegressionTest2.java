package idwall.desafio.string;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class IdwallFormatterRegressionTest2 {

    public static boolean debug = false;

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IdwallFormatterRegressionTest2.test41");
        idwall.desafio.string.IdwallFormatter idwallFormatter2 = new idwall.desafio.string.IdwallFormatter((java.lang.Integer) 1, false);
        java.lang.Integer int3 = idwallFormatter2.getLimit();
        boolean boolean4 = idwallFormatter2.isJustify();
        java.lang.Integer int5 = idwallFormatter2.getLimit();
        boolean boolean6 = idwallFormatter2.isJustify();
        java.lang.String str8 = idwallFormatter2.format("hi!");
        java.lang.String str10 = idwallFormatter2.format("hi!");
        java.lang.Integer int11 = idwallFormatter2.getLimit();
        java.lang.Integer int12 = idwallFormatter2.getLimit();
        java.lang.Class<?> wildcardClass13 = idwallFormatter2.getClass();
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11.equals(1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12.equals(1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IdwallFormatterRegressionTest2.test42");
        idwall.desafio.string.IdwallFormatter idwallFormatter2 = new idwall.desafio.string.IdwallFormatter((java.lang.Integer) 1, false);
        boolean boolean3 = idwallFormatter2.isJustify();
        boolean boolean4 = idwallFormatter2.isJustify();
        java.lang.String str6 = idwallFormatter2.format("hi!\n");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "h\ni\n!\n" + "'", str6.equals("h\ni\n!\n"));
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IdwallFormatterRegressionTest2.test43");
        idwall.desafio.string.IdwallFormatter idwallFormatter2 = new idwall.desafio.string.IdwallFormatter((java.lang.Integer) 100, true);
        java.lang.String str4 = idwallFormatter2.format("                                                                                                 hi!\n");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "                                                                                                 hi!\n" + "'", str4.equals("                                                                                                 hi!\n"));
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IdwallFormatterRegressionTest2.test44");
        idwall.desafio.string.IdwallFormatter idwallFormatter2 = new idwall.desafio.string.IdwallFormatter((java.lang.Integer) 0, false);
        java.lang.Class<?> wildcardClass3 = idwallFormatter2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IdwallFormatterRegressionTest2.test45");
        idwall.desafio.string.IdwallFormatter idwallFormatter2 = new idwall.desafio.string.IdwallFormatter((java.lang.Integer) 10, false);
        java.lang.Integer int3 = idwallFormatter2.getLimit();
        boolean boolean4 = idwallFormatter2.isJustify();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3.equals(10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IdwallFormatterRegressionTest2.test46");
        idwall.desafio.string.IdwallFormatter idwallFormatter2 = new idwall.desafio.string.IdwallFormatter((java.lang.Integer) 1, false);
        java.lang.Integer int3 = idwallFormatter2.getLimit();
        boolean boolean4 = idwallFormatter2.isJustify();
        java.lang.Integer int5 = idwallFormatter2.getLimit();
        boolean boolean6 = idwallFormatter2.isJustify();
        java.lang.String str8 = idwallFormatter2.format("hi!");
        java.lang.Integer int9 = idwallFormatter2.getLimit();
        java.lang.Integer int10 = idwallFormatter2.getLimit();
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
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10.equals(1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IdwallFormatterRegressionTest2.test47");
        idwall.desafio.string.IdwallFormatter idwallFormatter2 = new idwall.desafio.string.IdwallFormatter((java.lang.Integer) 1, false);
        java.lang.Integer int3 = idwallFormatter2.getLimit();
        boolean boolean4 = idwallFormatter2.isJustify();
        java.lang.Integer int5 = idwallFormatter2.getLimit();
        boolean boolean6 = idwallFormatter2.isJustify();
        java.lang.String str8 = idwallFormatter2.format("hi!");
        java.lang.String str10 = idwallFormatter2.format("h\ni\n!\n");
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
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IdwallFormatterRegressionTest2.test48");
        idwall.desafio.string.IdwallFormatter idwallFormatter2 = new idwall.desafio.string.IdwallFormatter((java.lang.Integer) 1, false);
        java.lang.Integer int3 = idwallFormatter2.getLimit();
        boolean boolean4 = idwallFormatter2.isJustify();
        java.lang.Integer int5 = idwallFormatter2.getLimit();
        boolean boolean6 = idwallFormatter2.isJustify();
        java.lang.String str8 = idwallFormatter2.format("hi!");
        java.lang.String str10 = idwallFormatter2.format("hi!");
        java.lang.Integer int11 = idwallFormatter2.getLimit();
        boolean boolean12 = idwallFormatter2.isJustify();
        java.lang.Class<?> wildcardClass13 = idwallFormatter2.getClass();
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11.equals(1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IdwallFormatterRegressionTest2.test49");
        idwall.desafio.string.IdwallFormatter idwallFormatter2 = new idwall.desafio.string.IdwallFormatter((java.lang.Integer) 1, false);
        java.lang.Integer int3 = idwallFormatter2.getLimit();
        java.lang.Integer int4 = idwallFormatter2.getLimit();
        java.lang.Integer int5 = idwallFormatter2.getLimit();
        java.lang.Class<?> wildcardClass6 = idwallFormatter2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3.equals(1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4.equals(1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5.equals(1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IdwallFormatterRegressionTest2.test50");
        idwall.desafio.string.IdwallFormatter idwallFormatter2 = new idwall.desafio.string.IdwallFormatter((java.lang.Integer) 1, false);
        java.lang.String str4 = idwallFormatter2.format("hi!\n");
        java.lang.Class<?> wildcardClass5 = idwallFormatter2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "h\ni\n!\n" + "'", str4.equals("h\ni\n!\n"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IdwallFormatterRegressionTest2.test51");
        idwall.desafio.string.IdwallFormatter idwallFormatter2 = new idwall.desafio.string.IdwallFormatter((java.lang.Integer) 1, true);
        java.lang.String str4 = idwallFormatter2.format("                                                                                                 hi!\n");
        java.lang.Integer int5 = idwallFormatter2.getLimit();
        java.lang.String str7 = idwallFormatter2.format("hi!\n");
        boolean boolean8 = idwallFormatter2.isJustify();
        java.lang.String str10 = idwallFormatter2.format("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "h\ni\n!\n" + "'", str4.equals("h\ni\n!\n"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5.equals(1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "h\ni\n!\n" + "'", str7.equals("h\ni\n!\n"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "h\ni\n!\n" + "'", str10.equals("h\ni\n!\n"));
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IdwallFormatterRegressionTest2.test52");
        idwall.desafio.string.IdwallFormatter idwallFormatter2 = new idwall.desafio.string.IdwallFormatter((java.lang.Integer) 1, false);
        java.lang.Integer int3 = idwallFormatter2.getLimit();
        boolean boolean4 = idwallFormatter2.isJustify();
        java.lang.Integer int5 = idwallFormatter2.getLimit();
        boolean boolean6 = idwallFormatter2.isJustify();
        java.lang.String str8 = idwallFormatter2.format("hi!");
        java.lang.Integer int9 = idwallFormatter2.getLimit();
        java.lang.Class<?> wildcardClass10 = idwallFormatter2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IdwallFormatterRegressionTest2.test53");
        idwall.desafio.string.IdwallFormatter idwallFormatter2 = new idwall.desafio.string.IdwallFormatter((java.lang.Integer) (-1), false);
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IdwallFormatterRegressionTest2.test54");
        idwall.desafio.string.IdwallFormatter idwallFormatter2 = new idwall.desafio.string.IdwallFormatter((java.lang.Integer) 1, false);
        java.lang.Integer int3 = idwallFormatter2.getLimit();
        java.lang.Integer int4 = idwallFormatter2.getLimit();
        boolean boolean5 = idwallFormatter2.isJustify();
        java.lang.String str7 = idwallFormatter2.format("h\ni\n!\n");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3.equals(1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4.equals(1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "h\ni\n!\n" + "'", str7.equals("h\ni\n!\n"));
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IdwallFormatterRegressionTest2.test55");
        idwall.desafio.string.IdwallFormatter idwallFormatter2 = new idwall.desafio.string.IdwallFormatter((java.lang.Integer) 0, false);
        boolean boolean3 = idwallFormatter2.isJustify();
        java.lang.Class<?> wildcardClass4 = idwallFormatter2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }
}

