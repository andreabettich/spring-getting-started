package ch.interdiscount.knowhow.springgettingstarted.profiles;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service("profileSpecificService")
@Profile("firstImplementation")
public class ProfileSpecificServiceImpl implements ProfileSpecificService {
    @Override
    public String message() {
        return "Profile Specific Service One";
    }
}
