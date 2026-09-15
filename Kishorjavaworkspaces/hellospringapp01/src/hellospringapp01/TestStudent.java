package hellospringapp01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStudent {

	public static void main(String[] args) {
		
		ApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");
		Student st =(Student)context.getBean("st");
		
		System.out.println(st.getSid());
		System.out.println(st.getSname());
		System.out.println(st.getAge());
		


	}

}
