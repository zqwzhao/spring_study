
import com.zqwzhao.bean.Address;
import com.zqwzhao.bean.Person;
import com.zqwzhao.bean.PersonTwo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.InvocationTargetException;

/**
 * @Auther: zhaoqw
 * @Date: 2021/5/25 - 05 - 25 - 22:17
 * @Description: PACKAGE_NAME
 * @version: 1.0
 */
public class MyTest {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        ApplicationContext context = new ClassPathXmlApplicationContext("ioc.xml");
        Person person = context.getBean("person", Person.class);
        Person person1 = context.getBean("person", Person.class);
        System.out.println(person);
        System.out.println(person == person1);

        /**
         * 注意: 当通过类型进行获取的时候，如果存在两个相同类型的对象，将无法完成获取工作
         * NoUniqueBeanDefinitionException
         */
        //Person bean = context.getBean(Person.class);
        //System.out.println(bean);

        /**
         * 当要从容器中获取对象的时候，应该写上实体类的默认构造方法，
         * 因为底层实现用的是反射
         */
        Class clazz = Class.forName("com.zqwzhao.bean.Person");
        //Object o = clazz.newInstance();
        Object obj = clazz.getDeclaredConstructor().newInstance();

        Person person2 = context.getBean("person2", Person.class);
        Person person3 = context.getBean("person3", Person.class);
        Person person4 = context.getBean("person4", Person.class);
        System.out.println(person2);
        System.out.println(person3);
        System.out.println(person4);

        Object person5 = context.getBean("person5",Person.class);
        System.out.println(person5);

        Person person6 = context.getBean("person6", Person.class);
        System.out.println(person6);

        PersonTwo person7 = context.getBean("personTwo1", PersonTwo.class);
        System.out.println(person7);

        //context.getBean("address2", Address.class);
    }
}
