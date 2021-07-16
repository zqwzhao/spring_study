import cn.zhaoqw.bean.Car;
import cn.zhaoqw.controller.BaseController;
import cn.zhaoqw.controller.PersonController;
import cn.zhaoqw.service.StudentService;
import cn.zhaoqw.service.TeacherService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Auther: zhaoqw
 * @Date: 2021/7/9 - 07 - 09 - 21:10
 * @Description: PACKAGE_NAME
 * @version: 1.0
 */
public class MyTest {

    @Test
    public void test01() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Car car = context.getBean("car", Car.class);
        System.out.println(car);

        PersonController personController = context.getBean("personController",PersonController.class);
        System.out.println(personController);
        personController.save();


    }

    @Test
    public void test02() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        StudentService studentService = context.getBean("studentService", StudentService.class);
        TeacherService teacherService = context.getBean("teacherService", TeacherService.class);
        studentService.save();
        teacherService.save();
    }
}
