import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

/**
 * Created by prashkr on 24/10/18.
 */
public class Lambda implements RequestHandler<Object, Object> {

    public Object handleRequest(Object event, Context context) {
        // process event
        return event;
    }
}
