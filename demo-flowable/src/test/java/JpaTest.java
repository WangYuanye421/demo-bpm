import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.wyy.flowable.FlowableApp;
import org.wyy.flowable.repository.UserRepo;

/**
 * @author yuanyewang515@gmail.com
 * @since v1.0
 **/
@SpringBootTest
@ContextConfiguration(classes = FlowableApp.class)
public class JpaTest {
    @Autowired
    UserRepo userRepo;

    @Test
    public void testUser() {
        System.out.println(userRepo.findById(1l));
        System.out.println(userRepo.findByName("1"));
    }
}
