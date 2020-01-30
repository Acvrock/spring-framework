package org.springframework.beans.factory.xml;

import org.junit.Test;
import org.springframework.core.io.ClassPathResource;

/**
 * Created by g6763 on 19/08/2017. 
 * @Description:
 */
public class XmlBeanFactoryTest {

	@Test
	public void init() throws Exception {
		XmlBeanFactory xmlBeanFactory = new XmlBeanFactory(new ClassPathResource("beanFactoryTest.xml"));
	}
}