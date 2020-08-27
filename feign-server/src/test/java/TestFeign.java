import com.zp.study.feign.FeignApplication;
import com.zp.study.feign.service.ApiService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @program: springcloud-demo-eureka
 * @description: OpenFeign 的负载均衡
 * @author: Mr.ZP
 * @create: 2020-08-22 16:35
 **/
@SpringBootTest(classes = FeignApplication.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class TestFeign {

    @Autowired
    private ApiService apiService;

    @Test
    public void test(){
        try {
            System.out.println(apiService.index());
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
