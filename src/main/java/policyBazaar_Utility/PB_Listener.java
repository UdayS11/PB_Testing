package policyBazaar_Utility;

import org.testng.ITestListener;

import org.testng.annotations.Listeners;

import policyBazaar_Base.PB_Base;
@Listeners(policyBazaar_Utility.PB_Listener.class)
public class PB_Listener extends PB_Base implements ITestListener
{

}
