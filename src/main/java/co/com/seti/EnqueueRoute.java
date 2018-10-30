package co.com.seti;



import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class EnqueueRoute extends RouteBuilder {

    @Override
    public void configure() throws Exception {
    	
        from("file:/home/wondercode?fileName=numbers.txt&noop=true")
        .split(body().tokenize("\n"))
        .log("${body}");        
    }
}