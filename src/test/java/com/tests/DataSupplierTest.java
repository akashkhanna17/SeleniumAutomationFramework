/*
 * package com.tests;
 * 
 * import org.testng.annotations.Test;
 * 
 * import com.testdata.TestData;
 * 
 * import io.github.sskorol.core.DataSupplier; import
 * io.github.sskorol.data.TestDataReader; import
 * io.github.sskorol.data.XlsxReader; import one.util.streamex.StreamEx;
 * 
 * public class DataSupplierTest {
 * 
 * @Test(dataProvider = "getData") public void dataSupplierTest(TestData
 * testData) { System.out.println(testData.username); }
 * 
 * @DataSupplier //Object[][] or Object[] //json,csv,yaml, excel public
 * StreamEx<TestData> getData(){ return TestDataReader.use(XlsxReader.class)
 * .withTarget(TestData.class) .withSource("testdata.xlsx") .read(); } }
 */