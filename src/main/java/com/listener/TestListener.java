package com.listener;

import java.util.Arrays;

import com.annotations.FrameworkAnnotation;
import com.reports.ExtentLogger;
import com.reports.ExtentReport;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.reports.ExtentReport;

import java.util.Arrays;

public class TestListener implements ITestListener{

	
    @Override
    public void onTestStart(ITestResult result) {
        ExtentReport.createTest(result.getMethod().getDescription());
        ExtentReport.assignAuthor(result.getMethod().getConstructorOrMethod().getMethod()
                .getAnnotation(FrameworkAnnotation.class).author());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        ExtentLogger.pass(result.getName() + " is passed");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        ExtentLogger.info(result.getName() + " is failed");
        ExtentLogger.fail(result.getThrowable().getMessage() );
        ExtentLogger.info(Arrays.toString(result.getThrowable().getStackTrace()));
    }

    @Override
    public void onStart(ITestContext context) {
        ExtentReport.initReports();
    }

    @Override
    public void onFinish(ITestContext context) {
        ExtentReport.flushReports();
    }


}

