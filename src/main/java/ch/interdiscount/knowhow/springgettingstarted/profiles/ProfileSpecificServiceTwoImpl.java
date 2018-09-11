package ch.interdiscount.knowhow.springgettingstarted.profiles;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service("profileSpecificService")
@Profile("secondImplementation")
public class ProfileSpecificServiceTwoImpl implements ProfileSpecificService {
    @Override
    public String message() {
        return "Profile Specific Service One";
    }
}
