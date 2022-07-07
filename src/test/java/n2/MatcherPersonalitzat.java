package n2;

import org.hamcrest.FeatureMatcher;
import org.hamcrest.Matcher;

public class MatcherPersonalitzat extends FeatureMatcher<String, Integer> {
    public MatcherPersonalitzat(Matcher<Integer> subMatcher, String featureDescription, String featureName) {
        super(subMatcher, featureDescription, featureName);
    }

    @Override
    protected Integer featureValueOf(String s) {
        return s.length();
    }
}
