package examples.zippopotam;

import com.intuit.karate.junit5.Karate;

class ZippopotamRunner {
    
    @Karate.Test
    Karate testzip() {
        return Karate.run("zipcode").relativeTo(getClass());
    }    

}
