package service;

import Beans.AutowiredBean;
import Beans.TestAutowired;

/*
 *@Author: XieLiang
 *@Date : 2018/6/29
 *@Comment :
 */
public class AutowiredService {
    private AutowiredBean autowiredBean;

    private TestAutowired testAutowired;

    public AutowiredBean getAutowiredBean() {
        return autowiredBean;
    }

    public void setAutowiredBean(AutowiredBean autowiredBean) {
        System.out.println("setAutowiredBean:" +autowiredBean.hashCode());
        this.autowiredBean = autowiredBean;
    }

    public TestAutowired getTestAutowired() {
        return testAutowired;
    }

    public void setTestAutowired(TestAutowired testAutowired) {
        System.out.println("setTestAutowired:" +testAutowired.hashCode());
        this.testAutowired = testAutowired;
    }


    public void say(String word){
        word = word + this.getClass();
        System.out.println("AutowiredService:" +word);
    }
}
