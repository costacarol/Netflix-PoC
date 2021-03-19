import com.netflix.hystrix.HystrixCommand;
import com.netflix.hystrix.HystrixCommandGroupKey;

public class HystrixFallBackClass extends HystrixCommand<String> {


    protected HystrixFallBackClass() {
        super (HystrixCommandGroupKey.Factory.asKey( " ExampleGroup " ));
    }

    @Override
    protected String run() {
        throw new RuntimeException("fail");
    }

    @Override
    protected String getFallback() {
        return "fallback";
    }
}
