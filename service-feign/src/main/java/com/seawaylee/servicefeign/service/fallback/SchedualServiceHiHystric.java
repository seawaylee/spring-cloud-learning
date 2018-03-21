package com.seawaylee.servicefeign.service.fallback;

import com.seawaylee.servicefeign.service.SchedualServiceHi;
import org.springframework.stereotype.Component;

/**
 * @author SeawayLee
 * @create 2018/3/21 20:38
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "Feign Hystric!" + name + " , FUCK OFF!!";
    }
}
