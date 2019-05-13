package br.com.dbserver.testsuite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import br.com.dbserver.testcase.CreateAccountTestCase;

@RunWith(Suite.class)
@SuiteClasses(CreateAccountTestCase.class)
public class CreateAccountTestSuite {
     
}
