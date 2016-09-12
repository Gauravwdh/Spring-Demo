package in.helpchat;

/**
 * Created by gauravwadhwa on 12/09/16.
 */
public class GreetingServiceImpl implements GreetingService {
    private String greeting;

    public GreetingServiceImpl(){
        this.greeting = "default greeting.";
    }

    public GreetingServiceImpl(String greeting){
        System.out.println("called..");
        this.greeting = greeting;
    }

    public void greeting() {
        System.out.println("Hello world!! : " + greeting);
    }


    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }
}
