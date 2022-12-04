package testPkg;

import org.testng.annotations.Test;

import basePkg.BaseCls;
import pagPkg.PageCls;

public class TestCls extends BaseCls {
@Test
public void test()
{
	PageCls obj=new PageCls(driver);
	obj.clk();
	obj.searccTech("Ecommerce");
	obj.clk2();
	obj.leadClick();
}
}
